/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * DeleteAllowListRequest
 */


public class DeleteAllowListRequest {
  @SerializedName("AllowListId")
  private String allowListId = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  public DeleteAllowListRequest allowListId(String allowListId) {
    this.allowListId = allowListId;
    return this;
  }

   /**
   * Get allowListId
   * @return allowListId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAllowListId() {
    return allowListId;
  }

  public void setAllowListId(String allowListId) {
    this.allowListId = allowListId;
  }

  public DeleteAllowListRequest clientToken(String clientToken) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAllowListRequest deleteAllowListRequest = (DeleteAllowListRequest) o;
    return Objects.equals(this.allowListId, deleteAllowListRequest.allowListId) &&
        Objects.equals(this.clientToken, deleteAllowListRequest.clientToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowListId, clientToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAllowListRequest {\n");
    
    sb.append("    allowListId: ").append(toIndentedString(allowListId)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
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