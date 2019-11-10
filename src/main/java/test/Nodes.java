package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.kubernetes.client.util.Watch;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Node;
import io.kubernetes.client.models.V1NodeList;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.KubeConfig;

import com.google.gson.reflect.TypeToken;

class Nodes {

    public static void main(String[] args) throws IOException, ApiException {
	System.out.println("monitoring nodes");
	// file path to your KubeConfig
        String kubeConfigPath = "/home/ahadas/.kube/.kubeconfig";
	// loading the out-of-cluster config, a kubeconfig from file-system
        ApiClient client =
            ClientBuilder.kubeconfig(KubeConfig.loadKubeConfig(new FileReader(kubeConfigPath))).build();
	client.getHttpClient().setReadTimeout(0, TimeUnit.MILLISECONDS);
        Configuration.setDefaultApiClient(client);
      
	CoreV1Api api = new CoreV1Api();
	//V1NodeList nodes =
	Watch<V1NodeList> watch2 =
            Watch.createWatch(
                              client,
                              //apiInstance.listNamespacedCustomObjectCall(group, version, namespace, plural, pretty, null, null, null, null, Boolean.TRUE, null, null),
                              api.listNodeCall("false" /*pretty*/, "false" /*_continue*/, null /*fieldSelector*/, null /*labelSelector*/, 0 /*limit*/, null /*resourceVersion*/, 0 /*timeoutSeconds*/, Boolean.TRUE /*watch*/, null /*progressListener*/, null /*progressRequestListener*/),
                              new TypeToken<Watch.Response<V1NodeList>>() {}.getType());
        try {
            for (Watch.Response<V1NodeList> item : watch2) {
                System.out.printf("%s : %s%n", item.type, item.object);
            }
        } finally {
            watch2.close();
        }
    }

}
