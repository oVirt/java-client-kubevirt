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
import kubevirt.io.V1VirtualMachineInstanceCondition;
import kubevirt.io.V1VirtualMachineInstanceGuestOSInfo;
import kubevirt.io.V1VirtualMachineInstanceMigrationState;
import kubevirt.io.V1VirtualMachineInstanceNetworkInterface;

/**
 * VirtualMachineInstanceStatus represents information about the status of a VirtualMachineInstance. Status may trail the actual state of a system.
 */
@ApiModel(description = "VirtualMachineInstanceStatus represents information about the status of a VirtualMachineInstance. Status may trail the actual state of a system.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1VirtualMachineInstanceStatus {
  @SerializedName("conditions")
  private List<V1VirtualMachineInstanceCondition> conditions = null;

  @SerializedName("guestOSInfo")
  private V1VirtualMachineInstanceGuestOSInfo guestOSInfo = null;

  @SerializedName("interfaces")
  private List<V1VirtualMachineInstanceNetworkInterface> interfaces = null;

  @SerializedName("migrationMethod")
  private String migrationMethod = null;

  @SerializedName("migrationState")
  private V1VirtualMachineInstanceMigrationState migrationState = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("qosClass")
  private String qosClass = null;

  @SerializedName("reason")
  private String reason = null;

  public V1VirtualMachineInstanceStatus conditions(List<V1VirtualMachineInstanceCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1VirtualMachineInstanceStatus addConditionsItem(V1VirtualMachineInstanceCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions are specific points in VirtualMachineInstance&#39;s pod runtime.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions are specific points in VirtualMachineInstance's pod runtime.")
  public List<V1VirtualMachineInstanceCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1VirtualMachineInstanceCondition> conditions) {
    this.conditions = conditions;
  }

  public V1VirtualMachineInstanceStatus guestOSInfo(V1VirtualMachineInstanceGuestOSInfo guestOSInfo) {
    this.guestOSInfo = guestOSInfo;
    return this;
  }

   /**
   * Guest OS Information
   * @return guestOSInfo
  **/
  @ApiModelProperty(value = "Guest OS Information")
  public V1VirtualMachineInstanceGuestOSInfo getGuestOSInfo() {
    return guestOSInfo;
  }

  public void setGuestOSInfo(V1VirtualMachineInstanceGuestOSInfo guestOSInfo) {
    this.guestOSInfo = guestOSInfo;
  }

  public V1VirtualMachineInstanceStatus interfaces(List<V1VirtualMachineInstanceNetworkInterface> interfaces) {
    this.interfaces = interfaces;
    return this;
  }

  public V1VirtualMachineInstanceStatus addInterfacesItem(V1VirtualMachineInstanceNetworkInterface interfacesItem) {
    if (this.interfaces == null) {
      this.interfaces = new ArrayList<>();
    }
    this.interfaces.add(interfacesItem);
    return this;
  }

   /**
   * Interfaces represent the details of available network interfaces.
   * @return interfaces
  **/
  @ApiModelProperty(value = "Interfaces represent the details of available network interfaces.")
  public List<V1VirtualMachineInstanceNetworkInterface> getInterfaces() {
    return interfaces;
  }

  public void setInterfaces(List<V1VirtualMachineInstanceNetworkInterface> interfaces) {
    this.interfaces = interfaces;
  }

  public V1VirtualMachineInstanceStatus migrationMethod(String migrationMethod) {
    this.migrationMethod = migrationMethod;
    return this;
  }

   /**
   * Represents the method using which the vmi can be migrated: live migration or block migration
   * @return migrationMethod
  **/
  @ApiModelProperty(value = "Represents the method using which the vmi can be migrated: live migration or block migration")
  public String getMigrationMethod() {
    return migrationMethod;
  }

  public void setMigrationMethod(String migrationMethod) {
    this.migrationMethod = migrationMethod;
  }

  public V1VirtualMachineInstanceStatus migrationState(V1VirtualMachineInstanceMigrationState migrationState) {
    this.migrationState = migrationState;
    return this;
  }

   /**
   * Represents the status of a live migration
   * @return migrationState
  **/
  @ApiModelProperty(value = "Represents the status of a live migration")
  public V1VirtualMachineInstanceMigrationState getMigrationState() {
    return migrationState;
  }

  public void setMigrationState(V1VirtualMachineInstanceMigrationState migrationState) {
    this.migrationState = migrationState;
  }

  public V1VirtualMachineInstanceStatus nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName is the name where the VirtualMachineInstance is currently running.
   * @return nodeName
  **/
  @ApiModelProperty(value = "NodeName is the name where the VirtualMachineInstance is currently running.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1VirtualMachineInstanceStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Phase is the status of the VirtualMachineInstance in kubernetes world. It is not the VirtualMachineInstance status, but partially correlates to it.
   * @return phase
  **/
  @ApiModelProperty(value = "Phase is the status of the VirtualMachineInstance in kubernetes world. It is not the VirtualMachineInstance status, but partially correlates to it.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1VirtualMachineInstanceStatus qosClass(String qosClass) {
    this.qosClass = qosClass;
    return this;
  }

   /**
   * The Quality of Service (QOS) classification assigned to the virtual machine instance based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md +optional
   * @return qosClass
  **/
  @ApiModelProperty(value = "The Quality of Service (QOS) classification assigned to the virtual machine instance based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md +optional")
  public String getQosClass() {
    return qosClass;
  }

  public void setQosClass(String qosClass) {
    this.qosClass = qosClass;
  }

  public V1VirtualMachineInstanceStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A brief CamelCase message indicating details about why the VMI is in this state. e.g. &#39;NodeUnresponsive&#39; +optional
   * @return reason
  **/
  @ApiModelProperty(value = "A brief CamelCase message indicating details about why the VMI is in this state. e.g. 'NodeUnresponsive' +optional")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VirtualMachineInstanceStatus v1VirtualMachineInstanceStatus = (V1VirtualMachineInstanceStatus) o;
    return Objects.equals(this.conditions, v1VirtualMachineInstanceStatus.conditions) &&
        Objects.equals(this.guestOSInfo, v1VirtualMachineInstanceStatus.guestOSInfo) &&
        Objects.equals(this.interfaces, v1VirtualMachineInstanceStatus.interfaces) &&
        Objects.equals(this.migrationMethod, v1VirtualMachineInstanceStatus.migrationMethod) &&
        Objects.equals(this.migrationState, v1VirtualMachineInstanceStatus.migrationState) &&
        Objects.equals(this.nodeName, v1VirtualMachineInstanceStatus.nodeName) &&
        Objects.equals(this.phase, v1VirtualMachineInstanceStatus.phase) &&
        Objects.equals(this.qosClass, v1VirtualMachineInstanceStatus.qosClass) &&
        Objects.equals(this.reason, v1VirtualMachineInstanceStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, guestOSInfo, interfaces, migrationMethod, migrationState, nodeName, phase, qosClass, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VirtualMachineInstanceStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    guestOSInfo: ").append(toIndentedString(guestOSInfo)).append("\n");
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    migrationMethod: ").append(toIndentedString(migrationMethod)).append("\n");
    sb.append("    migrationState: ").append(toIndentedString(migrationState)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    qosClass: ").append(toIndentedString(qosClass)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

