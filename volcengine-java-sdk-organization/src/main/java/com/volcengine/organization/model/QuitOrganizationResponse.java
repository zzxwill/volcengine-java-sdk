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
 * QuitOrganizationResponse
 */


public class QuitOrganizationResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ApplicationID")
  private String applicationID = null;

  public QuitOrganizationResponse applicationID(String applicationID) {
    this.applicationID = applicationID;
    return this;
  }

   /**
   * Get applicationID
   * @return applicationID
  **/
  @Schema(description = "")
  public String getApplicationID() {
    return applicationID;
  }

  public void setApplicationID(String applicationID) {
    this.applicationID = applicationID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuitOrganizationResponse quitOrganizationResponse = (QuitOrganizationResponse) o;
    return Objects.equals(this.applicationID, quitOrganizationResponse.applicationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuitOrganizationResponse {\n");
    
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
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
