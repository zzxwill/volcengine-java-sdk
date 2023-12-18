/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * ItemForListScalingEventsOutput
 */


public class ItemForListScalingEventsOutput {
  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("NodeIds")
  private List<String> nodeIds = null;

  @SerializedName("NodePoolId")
  private String nodePoolId = null;

  @SerializedName("Replicas")
  private Integer replicas = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Type")
  private String type = null;

  public ItemForListScalingEventsOutput endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ItemForListScalingEventsOutput id(String id) {
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

  public ItemForListScalingEventsOutput message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ItemForListScalingEventsOutput nodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
    return this;
  }

  public ItemForListScalingEventsOutput addNodeIdsItem(String nodeIdsItem) {
    if (this.nodeIds == null) {
      this.nodeIds = new ArrayList<String>();
    }
    this.nodeIds.add(nodeIdsItem);
    return this;
  }

   /**
   * Get nodeIds
   * @return nodeIds
  **/
  @Schema(description = "")
  public List<String> getNodeIds() {
    return nodeIds;
  }

  public void setNodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
  }

  public ItemForListScalingEventsOutput nodePoolId(String nodePoolId) {
    this.nodePoolId = nodePoolId;
    return this;
  }

   /**
   * Get nodePoolId
   * @return nodePoolId
  **/
  @Schema(description = "")
  public String getNodePoolId() {
    return nodePoolId;
  }

  public void setNodePoolId(String nodePoolId) {
    this.nodePoolId = nodePoolId;
  }

  public ItemForListScalingEventsOutput replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Get replicas
   * @return replicas
  **/
  @Schema(description = "")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public ItemForListScalingEventsOutput startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public ItemForListScalingEventsOutput status(String status) {
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

  public ItemForListScalingEventsOutput type(String type) {
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
    ItemForListScalingEventsOutput itemForListScalingEventsOutput = (ItemForListScalingEventsOutput) o;
    return Objects.equals(this.endTime, itemForListScalingEventsOutput.endTime) &&
        Objects.equals(this.id, itemForListScalingEventsOutput.id) &&
        Objects.equals(this.message, itemForListScalingEventsOutput.message) &&
        Objects.equals(this.nodeIds, itemForListScalingEventsOutput.nodeIds) &&
        Objects.equals(this.nodePoolId, itemForListScalingEventsOutput.nodePoolId) &&
        Objects.equals(this.replicas, itemForListScalingEventsOutput.replicas) &&
        Objects.equals(this.startTime, itemForListScalingEventsOutput.startTime) &&
        Objects.equals(this.status, itemForListScalingEventsOutput.status) &&
        Objects.equals(this.type, itemForListScalingEventsOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, id, message, nodeIds, nodePoolId, replicas, startTime, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListScalingEventsOutput {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
    sb.append("    nodePoolId: ").append(toIndentedString(nodePoolId)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
