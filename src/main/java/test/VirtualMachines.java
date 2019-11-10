package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.KubeConfig;
import kubevirt.io.KubevirtApi;
import kubevirt.io.V1VirtualMachine;
import kubevirt.io.V1VirtualMachineList;

public class VirtualMachines {

	public static void main(String[] args) throws ApiException, FileNotFoundException, IOException, io.kubernetes.client.ApiException {
		System.out.println("monitoring nodes");

		String kubeConfigPath = "/home/ahadas/.kube/.kubeconfig";
		// loading the out-of-cluster config, a kubeconfig from file-system
	        ApiClient client =
	            ClientBuilder.kubeconfig(KubeConfig.loadKubeConfig(new FileReader(kubeConfigPath))).build();
//		System.out.print
//		OAuth o = (OAuth) c.getAuthentication("oauth2");
//		String b = "eyJhbGciOiJSUzI1NiIsImtpZCI6IiJ9.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJkZWZhdWx0Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZWNyZXQubmFtZSI6ImRlZmF1bHQtdG9rZW4tdGdzc2oiLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlcnZpY2UtYWNjb3VudC5uYW1lIjoiZGVmYXVsdCIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VydmljZS1hY2NvdW50LnVpZCI6IjM1ZTc5MWUxLTAyZWMtMTFlYS05YzUyLTUyNTUwMGQxNTUwMSIsInN1YiI6InN5c3RlbTpzZXJ2aWNlYWNjb3VudDpkZWZhdWx0OmRlZmF1bHQifQ.VQq39XUzZn5d5l24yfNLpO4HjOQqG24pdrlVx-EyWWon49iP4gMutg8yx-UjjFE5si9dMZKxzE4bGP9q3o99Rt5s85_txZuIAU9Z7loVkCmSJPZx_12B2QK9OmizfEAMvomcT295oraL90f6RrRRtYNZ4DfHuYCwR6TySACFK56yN7-pGn1QxCbVuGibF0LHLuMhwRMX6evDxVfPzZqAMC6hHeCHsWqj8YS1eGkZb0HYqRPtkdLfgwEK3ZtBglD5xzORagFUQaLYJIlAei8WLSAkJmvrU8j2awH0P4RvW7VR7ytTTmzHlTLTURft1BHLpm_vT19PyVRsZfvwjl0Wow";
//		o.setAccessToken(b);
//		c.setBasePath("https://127.0.0.1:32768");
////		c.setVerifyingSsl(false);
//		CoreV1Api aa = new CoreV1Api(c);
//		Object bcd = aa.listNamespace(null, null, null, null, null, null, null, null);
//		System.out.println(bcd);
 		
		// loading the out-of-cluster config, a kubeconfig from file-system
//		io.kubernetes.client.ApiClient kubernetes =
//				ClientBuilder.kubeconfig(KubeConfig.loadKubeConfig(new FileReader(kubeConfigPath))).build();
//		OAuth oo = new OAuth();
//		oo.setAccessToken(a);
        client.setDebugging(true);
		KubevirtApi api = new KubevirtApi(client);
//		api.checkHealth();
		V1VirtualMachineList l = api.listVirtualMachineForAllNamespaces(null, null, null, null, null, null, null, null);
		System.out.println("VMs: " + l);
		V1VirtualMachine v = l.getItems().get(0);
//		V1VirtualMachine v1 = new V1VirtualMachine();
		v.getMetadata().setResourceVersion(null);
		v.getMetadata().setName("arik");
		api.createNamespacedVirtualMachine(v, "default");
	}

}
