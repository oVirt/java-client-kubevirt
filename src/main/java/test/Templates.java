package test;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.JSON;
import io.kubernetes.client.apis.CustomObjectsApi;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.ClientBuilder;
import kubevirt.io.KubevirtApi;
import kubevirt.io.V1Template;
import kubevirt.io.V1TemplateList;
import kubevirt.io.V1VirtualMachine;

public class Templates {

    public static void main(String[] args) throws IOException, ApiException {
        System.out.println("monitoring templates");

        if (args.length < 2) {
            System.err.println("Not enough arguments provided!");
            System.exit(-1);
        }

        String url = args[0];
        String token = args[1];

        // create config using url and token
        ApiClient client = ClientBuilder.kubeconfig(Main.getConfigFromToken(url, token)).build();

//        client.setDebugging(true);
        KubevirtApi kubevirt = new KubevirtApi(client);

        try {
            kubevirt.checkHealth();
            System.out.println("health ok");
        } catch (ApiException e) {
            System.out.println("health not ok");
            return;
        }

        CustomObjectsApi api = new CustomObjectsApi(client);
        SharedInformerFactory sharedInformerFactory = new SharedInformerFactory();
        SharedIndexInformer<V1Template> templateInfomer =
                sharedInformerFactory.sharedIndexInformerFor(
                        (CallGeneratorParams params) -> {
                            return api.listNamespacedCustomObjectCall(
                                    "template.openshift.io",
                                    "v1",
                                    "default",
                                    "templates",
                                    null,
                                    null,
                                    null,
                                    params.resourceVersion,
                                    params.timeoutSeconds,
                                    params.watch,
                                    null,
                                    null);
                        },
                        V1Template.class,
                        V1TemplateList.class);

        templateInfomer.addEventHandler(new ResourceEventHandler<V1Template>() {
            
            @Override
            public void onUpdate(V1Template oldObj, V1Template newObj) {
                System.out.println("template updated! " + newObj.getMetadata().getName());
            }
            
            @Override
            public void onDelete(V1Template template, boolean deletedFinalStateUnknown) {
                System.out.println("template deleted! " + template.getMetadata().getName());
            }
            
            @Override
            public void onAdd(V1Template template) {
                LinkedTreeMap a = template.getVms().get(0);
                LinkedTreeMap metadata = (LinkedTreeMap) a.get("metadata");
                metadata.put("name", "arik");
//                metadata.put("labels", new LinkedTreeMap<>());
//                LinkedTreeMap spec = (LinkedTreeMap) a.get("spec");
//                LinkedTreeMap templatea = (LinkedTreeMap) spec.get("template");
//                templatea.put("metadata", new LinkedTreeMap<>());
                Gson gson = new Gson();
                JsonObject o = gson.toJsonTree(a).getAsJsonObject();
                V1VirtualMachine vm = gson.fromJson(o, V1VirtualMachine.class);
                System.out.println("template added! " + template.getMetadata().getName());
                System.out.println(vm);
            }
        });

        sharedInformerFactory.startAllRegisteredInformers();
    }
}
