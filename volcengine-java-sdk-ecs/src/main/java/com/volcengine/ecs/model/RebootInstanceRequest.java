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
 * RebootInstanceRequest
 */


public class RebootInstanceRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("DryRun")
  private Boolean dryRun = null;

  @SerializedName("ForceStop")
  private Boolean forceStop = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public RebootInstanceRequest clientToken(String clientToken) {
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

  public RebootInstanceRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @Schema(description = "")
  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public RebootInstanceRequest forceStop(Boolean forceStop) {
    this.forceStop = forceStop;
    return this;
  }

   /**
   * Get forceStop
   * @return forceStop
  **/
  @Schema(description = "")
  public Boolean isForceStop() {
    return forceStop;
  }

  public void setForceStop(Boolean forceStop) {
    this.forceStop = forceStop;
  }

  public RebootInstanceRequest instanceId(String instanceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebootInstanceRequest rebootInstanceRequest = (RebootInstanceRequest) o;
    return Objects.equals(this.clientToken, rebootInstanceRequest.clientToken) &&
        Objects.equals(this.dryRun, rebootInstanceRequest.dryRun) &&
        Objects.equals(this.forceStop, rebootInstanceRequest.forceStop) &&
        Objects.equals(this.instanceId, rebootInstanceRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, dryRun, forceStop, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebootInstanceRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    forceStop: ").append(toIndentedString(forceStop)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
