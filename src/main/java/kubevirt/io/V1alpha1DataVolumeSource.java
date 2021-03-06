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
import kubevirt.io.V1alpha1DataVolumeBlankImage;
import kubevirt.io.V1alpha1DataVolumeSourceHTTP;
import kubevirt.io.V1alpha1DataVolumeSourcePVC;
import kubevirt.io.V1alpha1DataVolumeSourceRegistry;
import kubevirt.io.V1alpha1DataVolumeSourceS3;
import kubevirt.io.V1alpha1DataVolumeSourceUpload;

/**
 * DataVolumeSource represents the source for our Data Volume, this can be HTTP, S3, Registry or an existing PVC
 */
@ApiModel(description = "DataVolumeSource represents the source for our Data Volume, this can be HTTP, S3, Registry or an existing PVC")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1alpha1DataVolumeSource {
  @SerializedName("blank")
  private V1alpha1DataVolumeBlankImage blank = null;

  @SerializedName("http")
  private V1alpha1DataVolumeSourceHTTP http = null;

  @SerializedName("pvc")
  private V1alpha1DataVolumeSourcePVC pvc = null;

  @SerializedName("registry")
  private V1alpha1DataVolumeSourceRegistry registry = null;

  @SerializedName("s3")
  private V1alpha1DataVolumeSourceS3 s3 = null;

  @SerializedName("upload")
  private V1alpha1DataVolumeSourceUpload upload = null;

  public V1alpha1DataVolumeSource blank(V1alpha1DataVolumeBlankImage blank) {
    this.blank = blank;
    return this;
  }

   /**
   * Get blank
   * @return blank
  **/
  @ApiModelProperty(value = "")
  public V1alpha1DataVolumeBlankImage getBlank() {
    return blank;
  }

  public void setBlank(V1alpha1DataVolumeBlankImage blank) {
    this.blank = blank;
  }

  public V1alpha1DataVolumeSource http(V1alpha1DataVolumeSourceHTTP http) {
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @ApiModelProperty(value = "")
  public V1alpha1DataVolumeSourceHTTP getHttp() {
    return http;
  }

  public void setHttp(V1alpha1DataVolumeSourceHTTP http) {
    this.http = http;
  }

  public V1alpha1DataVolumeSource pvc(V1alpha1DataVolumeSourcePVC pvc) {
    this.pvc = pvc;
    return this;
  }

   /**
   * Get pvc
   * @return pvc
  **/
  @ApiModelProperty(value = "")
  public V1alpha1DataVolumeSourcePVC getPvc() {
    return pvc;
  }

  public void setPvc(V1alpha1DataVolumeSourcePVC pvc) {
    this.pvc = pvc;
  }

  public V1alpha1DataVolumeSource registry(V1alpha1DataVolumeSourceRegistry registry) {
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @ApiModelProperty(value = "")
  public V1alpha1DataVolumeSourceRegistry getRegistry() {
    return registry;
  }

  public void setRegistry(V1alpha1DataVolumeSourceRegistry registry) {
    this.registry = registry;
  }

  public V1alpha1DataVolumeSource s3(V1alpha1DataVolumeSourceS3 s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public V1alpha1DataVolumeSourceS3 getS3() {
    return s3;
  }

  public void setS3(V1alpha1DataVolumeSourceS3 s3) {
    this.s3 = s3;
  }

  public V1alpha1DataVolumeSource upload(V1alpha1DataVolumeSourceUpload upload) {
    this.upload = upload;
    return this;
  }

   /**
   * Get upload
   * @return upload
  **/
  @ApiModelProperty(value = "")
  public V1alpha1DataVolumeSourceUpload getUpload() {
    return upload;
  }

  public void setUpload(V1alpha1DataVolumeSourceUpload upload) {
    this.upload = upload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1DataVolumeSource v1alpha1DataVolumeSource = (V1alpha1DataVolumeSource) o;
    return Objects.equals(this.blank, v1alpha1DataVolumeSource.blank) &&
        Objects.equals(this.http, v1alpha1DataVolumeSource.http) &&
        Objects.equals(this.pvc, v1alpha1DataVolumeSource.pvc) &&
        Objects.equals(this.registry, v1alpha1DataVolumeSource.registry) &&
        Objects.equals(this.s3, v1alpha1DataVolumeSource.s3) &&
        Objects.equals(this.upload, v1alpha1DataVolumeSource.upload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blank, http, pvc, registry, s3, upload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1DataVolumeSource {\n");
    
    sb.append("    blank: ").append(toIndentedString(blank)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    upload: ").append(toIndentedString(upload)).append("\n");
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

