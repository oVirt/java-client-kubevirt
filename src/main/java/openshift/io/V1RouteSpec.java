package openshift.io;

import com.google.gson.annotations.SerializedName;

public class V1RouteSpec {
    @SerializedName("host")
    private String host = null;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
