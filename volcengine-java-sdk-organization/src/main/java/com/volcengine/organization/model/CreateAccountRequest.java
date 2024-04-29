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
 * CreateAccountRequest
 */


public class CreateAccountRequest {
  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("OrgUnitId")
  private String orgUnitId = null;

  @SerializedName("ShowName")
  private String showName = null;

  public CreateAccountRequest accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public CreateAccountRequest description(String description) {
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

  public CreateAccountRequest orgUnitId(String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

   /**
   * Get orgUnitId
   * @return orgUnitId
  **/
  @Schema(description = "")
  public String getOrgUnitId() {
    return orgUnitId;
  }

  public void setOrgUnitId(String orgUnitId) {
    this.orgUnitId = orgUnitId;
  }

  public CreateAccountRequest showName(String showName) {
    this.showName = showName;
    return this;
  }

   /**
   * Get showName
   * @return showName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getShowName() {
    return showName;
  }

  public void setShowName(String showName) {
    this.showName = showName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountRequest createAccountRequest = (CreateAccountRequest) o;
    return Objects.equals(this.accountName, createAccountRequest.accountName) &&
        Objects.equals(this.description, createAccountRequest.description) &&
        Objects.equals(this.orgUnitId, createAccountRequest.orgUnitId) &&
        Objects.equals(this.showName, createAccountRequest.showName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, description, orgUnitId, showName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orgUnitId: ").append(toIndentedString(orgUnitId)).append("\n");
    sb.append("    showName: ").append(toIndentedString(showName)).append("\n");
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
