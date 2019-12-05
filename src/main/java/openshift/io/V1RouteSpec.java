package openshift.io;

import com.google.gson.annotations.SerializedName;

public class V1RouteSpec {
    @SerializedName("host")
    private String host = null;

    @SerializedName("port")
    private V1RoutePort port = null;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public V1RoutePort getPort() {
        return port;
    }

    public void setPort(V1RoutePort port) {
        this.port = port;
    }
}
