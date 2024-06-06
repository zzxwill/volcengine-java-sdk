/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

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
 * UpdateAuthRequest
 */



public class UpdateAuthRequest {
  @SerializedName("AuthListStr")
  private String authListStr = null;

  @SerializedName("RelationID")
  private String relationID = null;

  public UpdateAuthRequest authListStr(String authListStr) {
    this.authListStr = authListStr;
    return this;
  }

   /**
   * Get authListStr
   * @return authListStr
  **/
  @Schema(description = "")
  public String getAuthListStr() {
    return authListStr;
  }

  public void setAuthListStr(String authListStr) {
    this.authListStr = authListStr;
  }

  public UpdateAuthRequest relationID(String relationID) {
    this.relationID = relationID;
    return this;
  }

   /**
   * Get relationID
   * @return relationID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRelationID() {
    return relationID;
  }

  public void setRelationID(String relationID) {
    this.relationID = relationID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAuthRequest updateAuthRequest = (UpdateAuthRequest) o;
    return Objects.equals(this.authListStr, updateAuthRequest.authListStr) &&
        Objects.equals(this.relationID, updateAuthRequest.relationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authListStr, relationID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuthRequest {\n");
    
    sb.append("    authListStr: ").append(toIndentedString(authListStr)).append("\n");
    sb.append("    relationID: ").append(toIndentedString(relationID)).append("\n");
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