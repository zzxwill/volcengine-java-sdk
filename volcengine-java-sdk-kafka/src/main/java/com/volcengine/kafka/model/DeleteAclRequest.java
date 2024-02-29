/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

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
 * DeleteAclRequest
 */


public class DeleteAclRequest {
  @SerializedName("AccessPolicy")
  private String accessPolicy = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("PatternType")
  private String patternType = null;

  @SerializedName("Resource")
  private String resource = null;

  @SerializedName("ResourceType")
  private String resourceType = null;

  @SerializedName("UserName")
  private String userName = null;

  public DeleteAclRequest accessPolicy(String accessPolicy) {
    this.accessPolicy = accessPolicy;
    return this;
  }

   /**
   * Get accessPolicy
   * @return accessPolicy
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAccessPolicy() {
    return accessPolicy;
  }

  public void setAccessPolicy(String accessPolicy) {
    this.accessPolicy = accessPolicy;
  }

  public DeleteAclRequest instanceId(String instanceId) {
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

  public DeleteAclRequest ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public DeleteAclRequest patternType(String patternType) {
    this.patternType = patternType;
    return this;
  }

   /**
   * Get patternType
   * @return patternType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPatternType() {
    return patternType;
  }

  public void setPatternType(String patternType) {
    this.patternType = patternType;
  }

  public DeleteAclRequest resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public DeleteAclRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public DeleteAclRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAclRequest deleteAclRequest = (DeleteAclRequest) o;
    return Objects.equals(this.accessPolicy, deleteAclRequest.accessPolicy) &&
        Objects.equals(this.instanceId, deleteAclRequest.instanceId) &&
        Objects.equals(this.ip, deleteAclRequest.ip) &&
        Objects.equals(this.patternType, deleteAclRequest.patternType) &&
        Objects.equals(this.resource, deleteAclRequest.resource) &&
        Objects.equals(this.resourceType, deleteAclRequest.resourceType) &&
        Objects.equals(this.userName, deleteAclRequest.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicy, instanceId, ip, patternType, resource, resourceType, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAclRequest {\n");
    
    sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
