/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForListWebhooksOutput
 */



public class DataForListWebhooksOutput {
  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("EventRuleIds")
  private List<String> eventRuleIds = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RuleIds")
  private List<String> ruleIds = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("Url")
  private String url = null;

  public DataForListWebhooksOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DataForListWebhooksOutput eventRuleIds(List<String> eventRuleIds) {
    this.eventRuleIds = eventRuleIds;
    return this;
  }

  public DataForListWebhooksOutput addEventRuleIdsItem(String eventRuleIdsItem) {
    if (this.eventRuleIds == null) {
      this.eventRuleIds = new ArrayList<String>();
    }
    this.eventRuleIds.add(eventRuleIdsItem);
    return this;
  }

   /**
   * Get eventRuleIds
   * @return eventRuleIds
  **/
  @Schema(description = "")
  public List<String> getEventRuleIds() {
    return eventRuleIds;
  }

  public void setEventRuleIds(List<String> eventRuleIds) {
    this.eventRuleIds = eventRuleIds;
  }

  public DataForListWebhooksOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DataForListWebhooksOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataForListWebhooksOutput ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public DataForListWebhooksOutput addRuleIdsItem(String ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<String>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

   /**
   * Get ruleIds
   * @return ruleIds
  **/
  @Schema(description = "")
  public List<String> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }

  public DataForListWebhooksOutput type(String type) {
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

  public DataForListWebhooksOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DataForListWebhooksOutput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListWebhooksOutput dataForListWebhooksOutput = (DataForListWebhooksOutput) o;
    return Objects.equals(this.createdAt, dataForListWebhooksOutput.createdAt) &&
        Objects.equals(this.eventRuleIds, dataForListWebhooksOutput.eventRuleIds) &&
        Objects.equals(this.id, dataForListWebhooksOutput.id) &&
        Objects.equals(this.name, dataForListWebhooksOutput.name) &&
        Objects.equals(this.ruleIds, dataForListWebhooksOutput.ruleIds) &&
        Objects.equals(this.type, dataForListWebhooksOutput.type) &&
        Objects.equals(this.updatedAt, dataForListWebhooksOutput.updatedAt) &&
        Objects.equals(this.url, dataForListWebhooksOutput.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, eventRuleIds, id, name, ruleIds, type, updatedAt, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListWebhooksOutput {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    eventRuleIds: ").append(toIndentedString(eventRuleIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
