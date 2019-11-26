package openshift.io;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.ApiResponse;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.Pair;
import io.kubernetes.client.ProgressRequestBody;
import io.kubernetes.client.ProgressResponseBody;
import kubevirt.io.V1VirtualMachineList;

public class OpenshiftApi {
    private ApiClient apiClient;

    public OpenshiftApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OpenshiftApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public V1RouteList listNamespacedRoute(String namespace, String _continue, String fieldSelector, Boolean includeUninitialized, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) throws ApiException {
        ApiResponse<V1RouteList> resp = listNamespacedRouteWithHttpInfo(namespace, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
        return resp.getData();
    }

    public ApiResponse<V1RouteList> listNamespacedRouteWithHttpInfo(String namespace, String _continue, String fieldSelector, Boolean includeUninitialized, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) throws ApiException {
        com.squareup.okhttp.Call call = listNamespacedRouteValidateBeforeCall(namespace, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch, null, null);
        Type localVarReturnType = new TypeToken<V1RouteList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listNamespacedRouteValidateBeforeCall(String namespace, String _continue, String fieldSelector, Boolean includeUninitialized, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listNamespacedVirtualMachine(Async)");
        }
        

        com.squareup.okhttp.Call call = listNamespacedRouteCall(namespace, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch, progressListener, progressRequestListener);
        return call;

    }

    public com.squareup.okhttp.Call listNamespacedRouteCall(String namespace, String _continue, String fieldSelector, Boolean includeUninitialized, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/route.openshift.io/v1/namespaces/{namespace}/routes"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (_continue != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("continue", _continue));
        if (fieldSelector != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fieldSelector", fieldSelector));
        if (includeUninitialized != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("includeUninitialized", includeUninitialized));
        if (labelSelector != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("labelSelector", labelSelector));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (resourceVersion != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resourceVersion", resourceVersion));
        if (timeoutSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        if (watch != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("watch", watch));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/json;stream=watch"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
}
