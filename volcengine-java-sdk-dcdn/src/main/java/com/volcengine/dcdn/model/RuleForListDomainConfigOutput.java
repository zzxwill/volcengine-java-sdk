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
 * RuleForListDomainConfigOutput
 */


public class RuleForListDomainConfigOutput {
  @SerializedName("CacheTime")
  private Integer cacheTime = null;

  @SerializedName("CacheTimeUnit")
  private String cacheTimeUnit = null;

  @SerializedName("RespUrl")
  private String respUrl = null;

  @SerializedName("Status")
  private String status = null;

  public RuleForListDomainConfigOutput cacheTime(Integer cacheTime) {
    this.cacheTime = cacheTime;
    return this;
  }

   /**
   * Get cacheTime
   * @return cacheTime
  **/
  @Schema(description = "")
  public Integer getCacheTime() {
    return cacheTime;
  }

  public void setCacheTime(Integer cacheTime) {
    this.cacheTime = cacheTime;
  }

  public RuleForListDomainConfigOutput cacheTimeUnit(String cacheTimeUnit) {
    this.cacheTimeUnit = cacheTimeUnit;
    return this;
  }

   /**
   * Get cacheTimeUnit
   * @return cacheTimeUnit
  **/
  @Schema(description = "")
  public String getCacheTimeUnit() {
    return cacheTimeUnit;
  }

  public void setCacheTimeUnit(String cacheTimeUnit) {
    this.cacheTimeUnit = cacheTimeUnit;
  }

  public RuleForListDomainConfigOutput respUrl(String respUrl) {
    this.respUrl = respUrl;
    return this;
  }

   /**
   * Get respUrl
   * @return respUrl
  **/
  @Schema(description = "")
  public String getRespUrl() {
    return respUrl;
  }

  public void setRespUrl(String respUrl) {
    this.respUrl = respUrl;
  }

  public RuleForListDomainConfigOutput status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleForListDomainConfigOutput ruleForListDomainConfigOutput = (RuleForListDomainConfigOutput) o;
    return Objects.equals(this.cacheTime, ruleForListDomainConfigOutput.cacheTime) &&
        Objects.equals(this.cacheTimeUnit, ruleForListDomainConfigOutput.cacheTimeUnit) &&
        Objects.equals(this.respUrl, ruleForListDomainConfigOutput.respUrl) &&
        Objects.equals(this.status, ruleForListDomainConfigOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheTime, cacheTimeUnit, respUrl, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleForListDomainConfigOutput {\n");
    
    sb.append("    cacheTime: ").append(toIndentedString(cacheTime)).append("\n");
    sb.append("    cacheTimeUnit: ").append(toIndentedString(cacheTimeUnit)).append("\n");
    sb.append("    respUrl: ").append(toIndentedString(respUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
