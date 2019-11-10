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
 * V1Input
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1Input {
  @SerializedName("bus")
  private String bus = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public V1Input bus(String bus) {
    this.bus = bus;
    return this;
  }

   /**
   * Bus indicates the bus of input device to emulate. Supported values: virtio, usb.
   * @return bus
  **/
  @ApiModelProperty(value = "Bus indicates the bus of input device to emulate. Supported values: virtio, usb.")
  public String getBus() {
    return bus;
  }

  public void setBus(String bus) {
    this.bus = bus;
  }

  public V1Input name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the device name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the device name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Input type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type indicated the type of input device. Supported values: tablet.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type indicated the type of input device. Supported values: tablet.")
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
    V1Input v1Input = (V1Input) o;
    return Objects.equals(this.bus, v1Input.bus) &&
        Objects.equals(this.name, v1Input.name) &&
        Objects.equals(this.type, v1Input.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bus, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Input {\n");
    
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
