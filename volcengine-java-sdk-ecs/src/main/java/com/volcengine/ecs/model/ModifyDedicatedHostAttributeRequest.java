/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * ModifyDedicatedHostAttributeRequest
 */



public class ModifyDedicatedHostAttributeRequest {
  @SerializedName("AutoPlacement")
  private String autoPlacement = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("CpuOvercommitRatio")
  private Double cpuOvercommitRatio = null;

  @SerializedName("DedicatedHostClusterId")
  private String dedicatedHostClusterId = null;

  @SerializedName("DedicatedHostId")
  private String dedicatedHostId = null;

  @SerializedName("DedicatedHostName")
  private String dedicatedHostName = null;

  @SerializedName("DedicatedHostRecovery")
  private String dedicatedHostRecovery = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyDedicatedHostAttributeRequest autoPlacement(String autoPlacement) {
    this.autoPlacement = autoPlacement;
    return this;
  }

   /**
   * Get autoPlacement
   * @return autoPlacement
  **/
  @Schema(description = "")
  public String getAutoPlacement() {
    return autoPlacement;
  }

  public void setAutoPlacement(String autoPlacement) {
    this.autoPlacement = autoPlacement;
  }

  public ModifyDedicatedHostAttributeRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public ModifyDedicatedHostAttributeRequest cpuOvercommitRatio(Double cpuOvercommitRatio) {
    this.cpuOvercommitRatio = cpuOvercommitRatio;
    return this;
  }

   /**
   * Get cpuOvercommitRatio
   * @return cpuOvercommitRatio
  **/
  @Schema(description = "")
  public Double getCpuOvercommitRatio() {
    return cpuOvercommitRatio;
  }

  public void setCpuOvercommitRatio(Double cpuOvercommitRatio) {
    this.cpuOvercommitRatio = cpuOvercommitRatio;
  }

  public ModifyDedicatedHostAttributeRequest dedicatedHostClusterId(String dedicatedHostClusterId) {
    this.dedicatedHostClusterId = dedicatedHostClusterId;
    return this;
  }

   /**
   * Get dedicatedHostClusterId
   * @return dedicatedHostClusterId
  **/
  @Schema(description = "")
  public String getDedicatedHostClusterId() {
    return dedicatedHostClusterId;
  }

  public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
    this.dedicatedHostClusterId = dedicatedHostClusterId;
  }

  public ModifyDedicatedHostAttributeRequest dedicatedHostId(String dedicatedHostId) {
    this.dedicatedHostId = dedicatedHostId;
    return this;
  }

   /**
   * Get dedicatedHostId
   * @return dedicatedHostId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDedicatedHostId() {
    return dedicatedHostId;
  }

  public void setDedicatedHostId(String dedicatedHostId) {
    this.dedicatedHostId = dedicatedHostId;
  }

  public ModifyDedicatedHostAttributeRequest dedicatedHostName(String dedicatedHostName) {
    this.dedicatedHostName = dedicatedHostName;
    return this;
  }

   /**
   * Get dedicatedHostName
   * @return dedicatedHostName
  **/
  @Schema(description = "")
  public String getDedicatedHostName() {
    return dedicatedHostName;
  }

  public void setDedicatedHostName(String dedicatedHostName) {
    this.dedicatedHostName = dedicatedHostName;
  }

  public ModifyDedicatedHostAttributeRequest dedicatedHostRecovery(String dedicatedHostRecovery) {
    this.dedicatedHostRecovery = dedicatedHostRecovery;
    return this;
  }

   /**
   * Get dedicatedHostRecovery
   * @return dedicatedHostRecovery
  **/
  @Schema(description = "")
  public String getDedicatedHostRecovery() {
    return dedicatedHostRecovery;
  }

  public void setDedicatedHostRecovery(String dedicatedHostRecovery) {
    this.dedicatedHostRecovery = dedicatedHostRecovery;
  }

  public ModifyDedicatedHostAttributeRequest description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDedicatedHostAttributeRequest modifyDedicatedHostAttributeRequest = (ModifyDedicatedHostAttributeRequest) o;
    return Objects.equals(this.autoPlacement, modifyDedicatedHostAttributeRequest.autoPlacement) &&
        Objects.equals(this.clientToken, modifyDedicatedHostAttributeRequest.clientToken) &&
        Objects.equals(this.cpuOvercommitRatio, modifyDedicatedHostAttributeRequest.cpuOvercommitRatio) &&
        Objects.equals(this.dedicatedHostClusterId, modifyDedicatedHostAttributeRequest.dedicatedHostClusterId) &&
        Objects.equals(this.dedicatedHostId, modifyDedicatedHostAttributeRequest.dedicatedHostId) &&
        Objects.equals(this.dedicatedHostName, modifyDedicatedHostAttributeRequest.dedicatedHostName) &&
        Objects.equals(this.dedicatedHostRecovery, modifyDedicatedHostAttributeRequest.dedicatedHostRecovery) &&
        Objects.equals(this.description, modifyDedicatedHostAttributeRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPlacement, clientToken, cpuOvercommitRatio, dedicatedHostClusterId, dedicatedHostId, dedicatedHostName, dedicatedHostRecovery, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDedicatedHostAttributeRequest {\n");
    
    sb.append("    autoPlacement: ").append(toIndentedString(autoPlacement)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    cpuOvercommitRatio: ").append(toIndentedString(cpuOvercommitRatio)).append("\n");
    sb.append("    dedicatedHostClusterId: ").append(toIndentedString(dedicatedHostClusterId)).append("\n");
    sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
    sb.append("    dedicatedHostName: ").append(toIndentedString(dedicatedHostName)).append("\n");
    sb.append("    dedicatedHostRecovery: ").append(toIndentedString(dedicatedHostRecovery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
