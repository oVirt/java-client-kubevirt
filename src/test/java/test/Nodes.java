package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.google.gson.reflect.TypeToken;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1NodeList;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.Watch;

class Nodes {

    public static void main(String[] args) throws IOException, ApiException {
	System.out.println("monitoring nodes");

    if (args.length < 2) {
        System.err.println("Not enough arguments provided!");
        System.exit(-1);
    }

    String url = args[0];
    String token = args[1];
	
	// create config using url and token
	ApiClient client = ClientBuilder.kubeconfig(Main.getConfigFromToken(url, token)).build();
	client.getHttpClient().setReadTimeout(0, TimeUnit.MILLISECONDS);
      
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
