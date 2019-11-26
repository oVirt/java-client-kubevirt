package test;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.ClientBuilder;
import kubevirt.io.V1VirtualMachine;
import openshift.io.OpenshiftApi;
import openshift.io.V1Route;
import openshift.io.V1RouteList;
import openshift.io.V1Template;
import openshift.io.V1TemplateList;

public class Routes {

    public static void main(String[] args) throws IOException {
        System.out.println("querying the console route");

        if (args.length < 2) {
            System.err.println("Not enough arguments provided!");
            System.exit(-1);
        }

        String url = args[0];
        String token = args[1];

        // create config using url and token
        ApiClient client = ClientBuilder.kubeconfig(Main.getConfigFromToken(url, token)).build();

        OpenshiftApi api = new OpenshiftApi(client);
        SharedInformerFactory sharedInformerFactory = new SharedInformerFactory();
        SharedIndexInformer<V1Route> templateInfomer =
                sharedInformerFactory.sharedIndexInformerFor(
                        (CallGeneratorParams params) -> {
                            return api.listNamespacedRouteCall(
                                    "openshift-console",
                                    null,
                                    null,
                                    null,
                                    "app=openshift-console",
                                    null,
                                    params.resourceVersion,
                                    params.timeoutSeconds,
                                    params.watch,
                                    null,
                                    null);
                        },
                        V1Route.class,
                        V1RouteList.class);

        templateInfomer.addEventHandler(new ResourceEventHandler<V1Route>() {

            @Override
            public void onAdd(V1Route obj) {
                System.out.println("Found console route: " + obj.getSpec().getHost());
            }

            @Override
            public void onUpdate(V1Route oldObj, V1Route newObj) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void onDelete(V1Route obj, boolean deletedFinalStateUnknown) {
                // TODO Auto-generated method stub
                
            }
        });

        sharedInformerFactory.startAllRegisteredInformers();
    }
}
