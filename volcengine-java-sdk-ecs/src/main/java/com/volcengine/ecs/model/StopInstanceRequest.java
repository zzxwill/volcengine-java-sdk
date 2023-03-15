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
 * StopInstanceRequest
 */


public class StopInstanceRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ForceStop")
  private Boolean forceStop = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("StoppedMode")
  private String stoppedMode = null;

  public StopInstanceRequest clientToken(String clientToken) {
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

  public StopInstanceRequest forceStop(Boolean forceStop) {
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

  public StopInstanceRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public StopInstanceRequest stoppedMode(String stoppedMode) {
    this.stoppedMode = stoppedMode;
    return this;
  }

   /**
   * Get stoppedMode
   * @return stoppedMode
  **/
  @Schema(description = "")
  public String getStoppedMode() {
    return stoppedMode;
  }

  public void setStoppedMode(String stoppedMode) {
    this.stoppedMode = stoppedMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopInstanceRequest stopInstanceRequest = (StopInstanceRequest) o;
    return Objects.equals(this.clientToken, stopInstanceRequest.clientToken) &&
        Objects.equals(this.forceStop, stopInstanceRequest.forceStop) &&
        Objects.equals(this.instanceId, stopInstanceRequest.instanceId) &&
        Objects.equals(this.stoppedMode, stopInstanceRequest.stoppedMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, forceStop, instanceId, stoppedMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopInstanceRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    forceStop: ").append(toIndentedString(forceStop)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    stoppedMode: ").append(toIndentedString(stoppedMode)).append("\n");
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
