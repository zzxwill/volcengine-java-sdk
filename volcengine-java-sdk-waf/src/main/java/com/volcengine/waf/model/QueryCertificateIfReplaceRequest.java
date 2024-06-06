/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * QueryCertificateIfReplaceRequest
 */



public class QueryCertificateIfReplaceRequest {
  @SerializedName("CertificateID")
  private Integer certificateID = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("PublicRealServer")
  private Integer publicRealServer = null;

  public QueryCertificateIfReplaceRequest certificateID(Integer certificateID) {
    this.certificateID = certificateID;
    return this;
  }

   /**
   * Get certificateID
   * @return certificateID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getCertificateID() {
    return certificateID;
  }

  public void setCertificateID(Integer certificateID) {
    this.certificateID = certificateID;
  }

  public QueryCertificateIfReplaceRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public QueryCertificateIfReplaceRequest publicRealServer(Integer publicRealServer) {
    this.publicRealServer = publicRealServer;
    return this;
  }

   /**
   * Get publicRealServer
   * @return publicRealServer
  **/
  @Schema(description = "")
  public Integer getPublicRealServer() {
    return publicRealServer;
  }

  public void setPublicRealServer(Integer publicRealServer) {
    this.publicRealServer = publicRealServer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCertificateIfReplaceRequest queryCertificateIfReplaceRequest = (QueryCertificateIfReplaceRequest) o;
    return Objects.equals(this.certificateID, queryCertificateIfReplaceRequest.certificateID) &&
        Objects.equals(this.domain, queryCertificateIfReplaceRequest.domain) &&
        Objects.equals(this.publicRealServer, queryCertificateIfReplaceRequest.publicRealServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateID, domain, publicRealServer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCertificateIfReplaceRequest {\n");
    
    sb.append("    certificateID: ").append(toIndentedString(certificateID)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    publicRealServer: ").append(toIndentedString(publicRealServer)).append("\n");
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