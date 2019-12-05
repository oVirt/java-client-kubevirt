package openshift.io;

import com.google.gson.annotations.SerializedName;

public class V1RoutePort {
    @SerializedName("targetPort")
    private String targetPort = null;

    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(String targetPort) {
        this.targetPort = targetPort;
    }
}
