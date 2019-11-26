package openshift.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;

public class V1Route {
    @SerializedName("apiVersion")
    private String apiVersion = null;

    @SerializedName("kind")
    private String kind = null;

    @SerializedName("metadata")
    private V1ObjectMeta metadata = null;

    @SerializedName("spec")
    private V1RouteSpec spec = null;

    public V1Route apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
      }

       /**
       * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
       * @return apiVersion
      **/
      @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
      public String getApiVersion() {
        return apiVersion;
      }

      public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
      }

      public V1Route kind(String kind) {
        this.kind = kind;
        return this;
      }

       /**
       * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
       * @return kind
      **/
      @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
      public String getKind() {
        return kind;
      }

      public void setKind(String kind) {
        this.kind = kind;
      }

      public V1Route metadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
      }

       /**
       * Get metadata
       * @return metadata
      **/
      @ApiModelProperty(value = "")
      public V1ObjectMeta getMetadata() {
        return metadata;
      }

      public void setMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
      }

      @Override
      public boolean equals(java.lang.Object o) {
        if (this == o) {
          return true;
        }
        if (o == null || getClass() != o.getClass()) {
          return false;
        }
        V1Route template = (V1Route) o;
        return Objects.equals(this.apiVersion, template.apiVersion) &&
            Objects.equals(this.kind, template.kind) &&
            Objects.equals(this.metadata, template.metadata);
//            Objects.equals(this.vms, template.vms);
      }

      @Override
      public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec);
      }


      @Override
      public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VirtualMachine {\n");
        
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("}");
        return sb.toString();
      }

      /**
       * Convert the given object to string with each line indented by 4 spaces
       * (except the first line).
       */
      private String toIndentedString(java.lang.Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
      }

      @ApiModelProperty(value = "List of networks that can be attached to a vm's virtual interface.")
      public V1RouteSpec getSpec() {
        return spec;
      }

      public void setSpec(V1RouteSpec spec) {
        this.spec = spec;
      }

}
