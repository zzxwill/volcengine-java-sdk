/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UploadCertificateRequest
 */


public class UploadCertificateRequest {
  @SerializedName("CertificateName")
  private String certificateName = null;

  @SerializedName("CertificateType")
  private String certificateType = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PrivateKey")
  private String privateKey = null;

  @SerializedName("PublicKey")
  private String publicKey = null;

  public UploadCertificateRequest certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

   /**
   * Get certificateName
   * @return certificateName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  public UploadCertificateRequest certificateType(String certificateType) {
    this.certificateType = certificateType;
    return this;
  }

   /**
   * Get certificateType
   * @return certificateType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }

  public UploadCertificateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UploadCertificateRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public UploadCertificateRequest publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadCertificateRequest uploadCertificateRequest = (UploadCertificateRequest) o;
    return Objects.equals(this.certificateName, uploadCertificateRequest.certificateName) &&
        Objects.equals(this.certificateType, uploadCertificateRequest.certificateType) &&
        Objects.equals(this.description, uploadCertificateRequest.description) &&
        Objects.equals(this.privateKey, uploadCertificateRequest.privateKey) &&
        Objects.equals(this.publicKey, uploadCertificateRequest.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateName, certificateType, description, privateKey, publicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadCertificateRequest {\n");
    
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
