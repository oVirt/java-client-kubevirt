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
import kubevirt.io.V1CPUFeature;

/**
 * CPU allows specifying the CPU topology.
 */
@ApiModel(description = "CPU allows specifying the CPU topology.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1CPU {
  @SerializedName("cores")
  private Integer cores = null;

  @SerializedName("dedicatedCpuPlacement")
  private Boolean dedicatedCpuPlacement = null;

  @SerializedName("features")
  private List<V1CPUFeature> features = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("sockets")
  private Integer sockets = null;

  @SerializedName("threads")
  private Integer threads = null;

  public V1CPU cores(Integer cores) {
    this.cores = cores;
    return this;
  }

   /**
   * Cores specifies the number of cores inside the vmi. Must be a value greater or equal 1.
   * @return cores
  **/
  @ApiModelProperty(value = "Cores specifies the number of cores inside the vmi. Must be a value greater or equal 1.")
  public Integer getCores() {
    return cores;
  }

  public void setCores(Integer cores) {
    this.cores = cores;
  }

  public V1CPU dedicatedCpuPlacement(Boolean dedicatedCpuPlacement) {
    this.dedicatedCpuPlacement = dedicatedCpuPlacement;
    return this;
  }

   /**
   * DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs and pin the vCPUs to it. +optional
   * @return dedicatedCpuPlacement
  **/
  @ApiModelProperty(value = "DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs and pin the vCPUs to it. +optional")
  public Boolean isDedicatedCpuPlacement() {
    return dedicatedCpuPlacement;
  }

  public void setDedicatedCpuPlacement(Boolean dedicatedCpuPlacement) {
    this.dedicatedCpuPlacement = dedicatedCpuPlacement;
  }

  public V1CPU features(List<V1CPUFeature> features) {
    this.features = features;
    return this;
  }

  public V1CPU addFeaturesItem(V1CPUFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Features specifies the CPU features list inside the VMI. +optional
   * @return features
  **/
  @ApiModelProperty(value = "Features specifies the CPU features list inside the VMI. +optional")
  public List<V1CPUFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<V1CPUFeature> features) {
    this.features = features;
  }

  public V1CPU model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Model specifies the CPU model inside the VMI. List of available models https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like \&quot;host-passthrough\&quot; to get the same CPU as the node and \&quot;host-model\&quot; to get CPU closest to the node one. Defaults to host-model. +optional
   * @return model
  **/
  @ApiModelProperty(value = "Model specifies the CPU model inside the VMI. List of available models https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like \"host-passthrough\" to get the same CPU as the node and \"host-model\" to get CPU closest to the node one. Defaults to host-model. +optional")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public V1CPU sockets(Integer sockets) {
    this.sockets = sockets;
    return this;
  }

   /**
   * Sockets specifies the number of sockets inside the vmi. Must be a value greater or equal 1.
   * @return sockets
  **/
  @ApiModelProperty(value = "Sockets specifies the number of sockets inside the vmi. Must be a value greater or equal 1.")
  public Integer getSockets() {
    return sockets;
  }

  public void setSockets(Integer sockets) {
    this.sockets = sockets;
  }

  public V1CPU threads(Integer threads) {
    this.threads = threads;
    return this;
  }

   /**
   * Threads specifies the number of threads inside the vmi. Must be a value greater or equal 1.
   * @return threads
  **/
  @ApiModelProperty(value = "Threads specifies the number of threads inside the vmi. Must be a value greater or equal 1.")
  public Integer getThreads() {
    return threads;
  }

  public void setThreads(Integer threads) {
    this.threads = threads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CPU v1CPU = (V1CPU) o;
    return Objects.equals(this.cores, v1CPU.cores) &&
        Objects.equals(this.dedicatedCpuPlacement, v1CPU.dedicatedCpuPlacement) &&
        Objects.equals(this.features, v1CPU.features) &&
        Objects.equals(this.model, v1CPU.model) &&
        Objects.equals(this.sockets, v1CPU.sockets) &&
        Objects.equals(this.threads, v1CPU.threads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cores, dedicatedCpuPlacement, features, model, sockets, threads);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CPU {\n");
    
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    dedicatedCpuPlacement: ").append(toIndentedString(dedicatedCpuPlacement)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    threads: ").append(toIndentedString(threads)).append("\n");
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

