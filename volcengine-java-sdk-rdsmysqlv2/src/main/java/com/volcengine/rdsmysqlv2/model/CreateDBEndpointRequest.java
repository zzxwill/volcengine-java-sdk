/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * CreateDBEndpointRequest
 */


public class CreateDBEndpointRequest {
  @SerializedName("AutoAddNewNodes")
  private Boolean autoAddNewNodes = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  @SerializedName("EndpointType")
  private String endpointType = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Nodes")
  private String nodes = null;

  @SerializedName("ReadWriteMode")
  private String readWriteMode = null;

  public CreateDBEndpointRequest autoAddNewNodes(Boolean autoAddNewNodes) {
    this.autoAddNewNodes = autoAddNewNodes;
    return this;
  }

   /**
   * Get autoAddNewNodes
   * @return autoAddNewNodes
  **/
  @Schema(description = "")
  public Boolean isAutoAddNewNodes() {
    return autoAddNewNodes;
  }

  public void setAutoAddNewNodes(Boolean autoAddNewNodes) {
    this.autoAddNewNodes = autoAddNewNodes;
  }

  public CreateDBEndpointRequest description(String description) {
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

  public CreateDBEndpointRequest endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public CreateDBEndpointRequest endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @Schema(description = "")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public CreateDBEndpointRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public CreateDBEndpointRequest nodes(String nodes) {
    this.nodes = nodes;
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @Schema(description = "")
  public String getNodes() {
    return nodes;
  }

  public void setNodes(String nodes) {
    this.nodes = nodes;
  }

  public CreateDBEndpointRequest readWriteMode(String readWriteMode) {
    this.readWriteMode = readWriteMode;
    return this;
  }

   /**
   * Get readWriteMode
   * @return readWriteMode
  **/
  @Schema(description = "")
  public String getReadWriteMode() {
    return readWriteMode;
  }

  public void setReadWriteMode(String readWriteMode) {
    this.readWriteMode = readWriteMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDBEndpointRequest createDBEndpointRequest = (CreateDBEndpointRequest) o;
    return Objects.equals(this.autoAddNewNodes, createDBEndpointRequest.autoAddNewNodes) &&
        Objects.equals(this.description, createDBEndpointRequest.description) &&
        Objects.equals(this.endpointName, createDBEndpointRequest.endpointName) &&
        Objects.equals(this.endpointType, createDBEndpointRequest.endpointType) &&
        Objects.equals(this.instanceId, createDBEndpointRequest.instanceId) &&
        Objects.equals(this.nodes, createDBEndpointRequest.nodes) &&
        Objects.equals(this.readWriteMode, createDBEndpointRequest.readWriteMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAddNewNodes, description, endpointName, endpointType, instanceId, nodes, readWriteMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBEndpointRequest {\n");
    
    sb.append("    autoAddNewNodes: ").append(toIndentedString(autoAddNewNodes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    readWriteMode: ").append(toIndentedString(readWriteMode)).append("\n");
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
