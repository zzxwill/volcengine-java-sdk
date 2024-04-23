/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

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
 * CertBindForDescribeDomainDetailOutput
 */


public class CertBindForDescribeDomainDetailOutput {
  @SerializedName("CertId")
  private String certId = null;

  @SerializedName("CertSource")
  private String certSource = null;

  public CertBindForDescribeDomainDetailOutput certId(String certId) {
    this.certId = certId;
    return this;
  }

   /**
   * Get certId
   * @return certId
  **/
  @Schema(description = "")
  public String getCertId() {
    return certId;
  }

  public void setCertId(String certId) {
    this.certId = certId;
  }

  public CertBindForDescribeDomainDetailOutput certSource(String certSource) {
    this.certSource = certSource;
    return this;
  }

   /**
   * Get certSource
   * @return certSource
  **/
  @Schema(description = "")
  public String getCertSource() {
    return certSource;
  }

  public void setCertSource(String certSource) {
    this.certSource = certSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertBindForDescribeDomainDetailOutput certBindForDescribeDomainDetailOutput = (CertBindForDescribeDomainDetailOutput) o;
    return Objects.equals(this.certId, certBindForDescribeDomainDetailOutput.certId) &&
        Objects.equals(this.certSource, certBindForDescribeDomainDetailOutput.certSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certId, certSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertBindForDescribeDomainDetailOutput {\n");
    
    sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
    sb.append("    certSource: ").append(toIndentedString(certSource)).append("\n");
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
