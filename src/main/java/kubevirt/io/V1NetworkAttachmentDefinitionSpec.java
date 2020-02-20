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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1NetworkAttachmentDefinitionSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-20T11:28:11.418+02:00")
public class V1NetworkAttachmentDefinitionSpec {
  @SerializedName("config")
  private String config = null;

  public V1NetworkAttachmentDefinitionSpec config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(required = true, value = "")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NetworkAttachmentDefinitionSpec v1NetworkAttachmentDefinitionSpec = (V1NetworkAttachmentDefinitionSpec) o;
    return Objects.equals(this.config, v1NetworkAttachmentDefinitionSpec.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkAttachmentDefinitionSpec {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

