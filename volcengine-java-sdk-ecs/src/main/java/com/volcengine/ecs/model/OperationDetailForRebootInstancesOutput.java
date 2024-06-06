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
import com.volcengine.ecs.model.ErrorForRebootInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OperationDetailForRebootInstancesOutput
 */



public class OperationDetailForRebootInstancesOutput {
  @SerializedName("Error")
  private ErrorForRebootInstancesOutput error = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public OperationDetailForRebootInstancesOutput error(ErrorForRebootInstancesOutput error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Valid
  @Schema(description = "")
  public ErrorForRebootInstancesOutput getError() {
    return error;
  }

  public void setError(ErrorForRebootInstancesOutput error) {
    this.error = error;
  }

  public OperationDetailForRebootInstancesOutput instanceId(String instanceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationDetailForRebootInstancesOutput operationDetailForRebootInstancesOutput = (OperationDetailForRebootInstancesOutput) o;
    return Objects.equals(this.error, operationDetailForRebootInstancesOutput.error) &&
        Objects.equals(this.instanceId, operationDetailForRebootInstancesOutput.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationDetailForRebootInstancesOutput {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
