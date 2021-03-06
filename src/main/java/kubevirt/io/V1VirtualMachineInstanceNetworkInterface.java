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
import java.util.ArrayList;
import java.util.List;

/**
 * V1VirtualMachineInstanceNetworkInterface
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1VirtualMachineInstanceNetworkInterface {
  @SerializedName("interfaceName")
  private String interfaceName = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("ipAddresses")
  private List<String> ipAddresses = null;

  @SerializedName("mac")
  private String mac = null;

  @SerializedName("name")
  private String name = null;

  public V1VirtualMachineInstanceNetworkInterface interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }

   /**
   * The interface name inside the Virtual Machine
   * @return interfaceName
  **/
  @ApiModelProperty(value = "The interface name inside the Virtual Machine")
  public String getInterfaceName() {
    return interfaceName;
  }

  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  public V1VirtualMachineInstanceNetworkInterface ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of a Virtual Machine interface
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of a Virtual Machine interface")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public V1VirtualMachineInstanceNetworkInterface ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public V1VirtualMachineInstanceNetworkInterface addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * List of all IP addresses of a Virtual Machine interface
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "List of all IP addresses of a Virtual Machine interface")
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public V1VirtualMachineInstanceNetworkInterface mac(String mac) {
    this.mac = mac;
    return this;
  }

   /**
   * Hardware address of a Virtual Machine interface
   * @return mac
  **/
  @ApiModelProperty(value = "Hardware address of a Virtual Machine interface")
  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  public V1VirtualMachineInstanceNetworkInterface name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the interface, corresponds to name of the network assigned to the interface
   * @return name
  **/
  @ApiModelProperty(value = "Name of the interface, corresponds to name of the network assigned to the interface")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VirtualMachineInstanceNetworkInterface v1VirtualMachineInstanceNetworkInterface = (V1VirtualMachineInstanceNetworkInterface) o;
    return Objects.equals(this.interfaceName, v1VirtualMachineInstanceNetworkInterface.interfaceName) &&
        Objects.equals(this.ipAddress, v1VirtualMachineInstanceNetworkInterface.ipAddress) &&
        Objects.equals(this.ipAddresses, v1VirtualMachineInstanceNetworkInterface.ipAddresses) &&
        Objects.equals(this.mac, v1VirtualMachineInstanceNetworkInterface.mac) &&
        Objects.equals(this.name, v1VirtualMachineInstanceNetworkInterface.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceName, ipAddress, ipAddresses, mac, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VirtualMachineInstanceNetworkInterface {\n");
    
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

