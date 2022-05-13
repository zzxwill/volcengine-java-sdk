/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.autoscaling.model;

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
 * ModifyScalingPolicyResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:15.237208+08:00[Asia/Shanghai]")
public class ModifyScalingPolicyResponse {
  @SerializedName("ScalingPolicyId")
  private String scalingPolicyId = null;

  public ModifyScalingPolicyResponse scalingPolicyId(String scalingPolicyId) {
    this.scalingPolicyId = scalingPolicyId;
    return this;
  }

   /**
   * Get scalingPolicyId
   * @return scalingPolicyId
  **/
  @Schema(description = "")
  public String getScalingPolicyId() {
    return scalingPolicyId;
  }

  public void setScalingPolicyId(String scalingPolicyId) {
    this.scalingPolicyId = scalingPolicyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyScalingPolicyResponse modifyScalingPolicyResponse = (ModifyScalingPolicyResponse) o;
    return Objects.equals(this.scalingPolicyId, modifyScalingPolicyResponse.scalingPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scalingPolicyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyScalingPolicyResponse {\n");
    
    sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
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
