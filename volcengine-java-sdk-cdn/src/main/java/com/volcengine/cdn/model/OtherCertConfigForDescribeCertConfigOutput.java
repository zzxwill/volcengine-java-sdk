/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.DomainLockForDescribeCertConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OtherCertConfigForDescribeCertConfigOutput
 */



public class OtherCertConfigForDescribeCertConfigOutput {
  @SerializedName("CerStatus")
  private String cerStatus = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("DomainLock")
  private DomainLockForDescribeCertConfigOutput domainLock = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Type")
  private String type = null;

  public OtherCertConfigForDescribeCertConfigOutput cerStatus(String cerStatus) {
    this.cerStatus = cerStatus;
    return this;
  }

   /**
   * Get cerStatus
   * @return cerStatus
  **/
  @Schema(description = "")
  public String getCerStatus() {
    return cerStatus;
  }

  public void setCerStatus(String cerStatus) {
    this.cerStatus = cerStatus;
  }

  public OtherCertConfigForDescribeCertConfigOutput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public OtherCertConfigForDescribeCertConfigOutput domainLock(DomainLockForDescribeCertConfigOutput domainLock) {
    this.domainLock = domainLock;
    return this;
  }

   /**
   * Get domainLock
   * @return domainLock
  **/
  @Valid
  @Schema(description = "")
  public DomainLockForDescribeCertConfigOutput getDomainLock() {
    return domainLock;
  }

  public void setDomainLock(DomainLockForDescribeCertConfigOutput domainLock) {
    this.domainLock = domainLock;
  }

  public OtherCertConfigForDescribeCertConfigOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OtherCertConfigForDescribeCertConfigOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
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
    OtherCertConfigForDescribeCertConfigOutput otherCertConfigForDescribeCertConfigOutput = (OtherCertConfigForDescribeCertConfigOutput) o;
    return Objects.equals(this.cerStatus, otherCertConfigForDescribeCertConfigOutput.cerStatus) &&
        Objects.equals(this.domain, otherCertConfigForDescribeCertConfigOutput.domain) &&
        Objects.equals(this.domainLock, otherCertConfigForDescribeCertConfigOutput.domainLock) &&
        Objects.equals(this.status, otherCertConfigForDescribeCertConfigOutput.status) &&
        Objects.equals(this.type, otherCertConfigForDescribeCertConfigOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cerStatus, domain, domainLock, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherCertConfigForDescribeCertConfigOutput {\n");
    
    sb.append("    cerStatus: ").append(toIndentedString(cerStatus)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    domainLock: ").append(toIndentedString(domainLock)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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