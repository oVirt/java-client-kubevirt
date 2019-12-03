package openshift.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.kubernetes.client.models.V1ListMeta;
import io.swagger.annotations.ApiModelProperty;

public class V1RouteList {
    @SerializedName("apiVersion")
    private String apiVersion = null;

    @SerializedName("items")
    private List<V1Route> items = new ArrayList<>();

    @SerializedName("kind")
    private String kind = null;

    @SerializedName("metadata")
    private V1ListMeta metadata = null;

    public V1RouteList apiVersion(String apiVersion) {
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

    public V1RouteList items(List<V1Route> items) {
      this.items = items;
      return this;
    }

    public V1RouteList addItemsItem(V1Route itemsItem) {
      this.items.add(itemsItem);
      return this;
    }

     /**
     * Get items
     * @return items
    **/
    @ApiModelProperty(required = true, value = "")
    public List<V1Route> getItems() {
      return items;
    }

    public void setItems(List<V1Route> items) {
      this.items = items;
    }

    public V1RouteList kind(String kind) {
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

    public V1RouteList metadata(V1ListMeta metadata) {
      this.metadata = metadata;
      return this;
    }

     /**
     * Get metadata
     * @return metadata
    **/
    @ApiModelProperty(value = "")
    public V1ListMeta getMetadata() {
      return metadata;
    }

    public void setMetadata(V1ListMeta metadata) {
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
      V1RouteList routeList = (V1RouteList) o;
      return Objects.equals(this.apiVersion, routeList.apiVersion) &&
//          Objects.equals(this.items, routeList.items) &&
          Objects.equals(this.kind, routeList.kind) &&
          Objects.equals(this.metadata, routeList.metadata);
    }

    @Override
    public int hashCode() {
      return Objects.hash(apiVersion, items, kind, metadata);
    }


    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RouteList {\n");
      
      sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
      sb.append("    items: ").append(toIndentedString(items)).append("\n");
      sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
      sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

}
