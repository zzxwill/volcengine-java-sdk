/*
 * organization
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.organization.model;

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
 * DeleteServiceControlPolicyRequest
 */


public class DeleteServiceControlPolicyRequest {
  @SerializedName("PolicyID")
  private String policyID = null;

  public DeleteServiceControlPolicyRequest policyID(String policyID) {
    this.policyID = policyID;
    return this;
  }

   /**
   * Get policyID
   * @return policyID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPolicyID() {
    return policyID;
  }

  public void setPolicyID(String policyID) {
    this.policyID = policyID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteServiceControlPolicyRequest deleteServiceControlPolicyRequest = (DeleteServiceControlPolicyRequest) o;
    return Objects.equals(this.policyID, deleteServiceControlPolicyRequest.policyID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteServiceControlPolicyRequest {\n");
    
    sb.append("    policyID: ").append(toIndentedString(policyID)).append("\n");
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