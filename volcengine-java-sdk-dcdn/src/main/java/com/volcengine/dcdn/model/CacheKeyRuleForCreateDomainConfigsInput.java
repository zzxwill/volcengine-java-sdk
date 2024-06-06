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
 * CacheKeyRuleForCreateDomainConfigsInput
 */


public class CacheKeyRuleForCreateDomainConfigsInput {
  @SerializedName("Contents")
  private String contents = null;

  @SerializedName("IgnoreCase")
  private Boolean ignoreCase = null;

  @SerializedName("ParamsFilterType")
  private String paramsFilterType = null;

  @SerializedName("ParamsReserveList")
  private String paramsReserveList = null;

  @SerializedName("Type")
  private String type = null;

  public CacheKeyRuleForCreateDomainConfigsInput contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @Schema(description = "")
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public CacheKeyRuleForCreateDomainConfigsInput ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @Schema(description = "")
  public Boolean isIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public CacheKeyRuleForCreateDomainConfigsInput paramsFilterType(String paramsFilterType) {
    this.paramsFilterType = paramsFilterType;
    return this;
  }

   /**
   * Get paramsFilterType
   * @return paramsFilterType
  **/
  @Schema(description = "")
  public String getParamsFilterType() {
    return paramsFilterType;
  }

  public void setParamsFilterType(String paramsFilterType) {
    this.paramsFilterType = paramsFilterType;
  }

  public CacheKeyRuleForCreateDomainConfigsInput paramsReserveList(String paramsReserveList) {
    this.paramsReserveList = paramsReserveList;
    return this;
  }

   /**
   * Get paramsReserveList
   * @return paramsReserveList
  **/
  @Schema(description = "")
  public String getParamsReserveList() {
    return paramsReserveList;
  }

  public void setParamsReserveList(String paramsReserveList) {
    this.paramsReserveList = paramsReserveList;
  }

  public CacheKeyRuleForCreateDomainConfigsInput type(String type) {
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
    CacheKeyRuleForCreateDomainConfigsInput cacheKeyRuleForCreateDomainConfigsInput = (CacheKeyRuleForCreateDomainConfigsInput) o;
    return Objects.equals(this.contents, cacheKeyRuleForCreateDomainConfigsInput.contents) &&
        Objects.equals(this.ignoreCase, cacheKeyRuleForCreateDomainConfigsInput.ignoreCase) &&
        Objects.equals(this.paramsFilterType, cacheKeyRuleForCreateDomainConfigsInput.paramsFilterType) &&
        Objects.equals(this.paramsReserveList, cacheKeyRuleForCreateDomainConfigsInput.paramsReserveList) &&
        Objects.equals(this.type, cacheKeyRuleForCreateDomainConfigsInput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, ignoreCase, paramsFilterType, paramsReserveList, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheKeyRuleForCreateDomainConfigsInput {\n");
    
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    paramsFilterType: ").append(toIndentedString(paramsFilterType)).append("\n");
    sb.append("    paramsReserveList: ").append(toIndentedString(paramsReserveList)).append("\n");
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