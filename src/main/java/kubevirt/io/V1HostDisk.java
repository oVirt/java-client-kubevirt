/*
 * KubeVirt API
 * This is KubeVirt API an add-on for Kubernetes.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: kubevirt-dev@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package kubevirt.io;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a disk created on the cluster level
 */
@ApiModel(description = "Represents a disk created on the cluster level")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1HostDisk {
  @SerializedName("capacity")
  private String capacity = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("shared")
  private Boolean shared = null;

  @SerializedName("type")
  private String type = null;

  public V1HostDisk capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Capacity of the sparse disk +optional
   * @return capacity
  **/
  @ApiModelProperty(value = "Capacity of the sparse disk +optional")
  public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public V1HostDisk path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path to HostDisk image located on the cluster
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The path to HostDisk image located on the cluster")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1HostDisk shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Shared indicate whether the path is shared between nodes
   * @return shared
  **/
  @ApiModelProperty(value = "Shared indicate whether the path is shared between nodes")
  public Boolean isShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public V1HostDisk type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Contains information if disk.img exists or should be created allowed options are &#39;Disk&#39; and &#39;DiskOrCreate&#39;
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Contains information if disk.img exists or should be created allowed options are 'Disk' and 'DiskOrCreate'")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostDisk v1HostDisk = (V1HostDisk) o;
    return Objects.equals(this.capacity, v1HostDisk.capacity) &&
        Objects.equals(this.path, v1HostDisk.path) &&
        Objects.equals(this.shared, v1HostDisk.shared) &&
        Objects.equals(this.type, v1HostDisk.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, path, shared, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostDisk {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
