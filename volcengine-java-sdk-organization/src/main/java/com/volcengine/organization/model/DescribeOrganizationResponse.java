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
import com.volcengine.organization.model.OrganizationForDescribeOrganizationOutput;
import com.volcengine.organization.model.OwnerForDescribeOrganizationOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeOrganizationResponse
 */


public class DescribeOrganizationResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Organization")
  private OrganizationForDescribeOrganizationOutput organization = null;

  @SerializedName("Owner")
  private OwnerForDescribeOrganizationOutput owner = null;

  public DescribeOrganizationResponse organization(OrganizationForDescribeOrganizationOutput organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @Valid
  @Schema(description = "")
  public OrganizationForDescribeOrganizationOutput getOrganization() {
    return organization;
  }

  public void setOrganization(OrganizationForDescribeOrganizationOutput organization) {
    this.organization = organization;
  }

  public DescribeOrganizationResponse owner(OwnerForDescribeOrganizationOutput owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Valid
  @Schema(description = "")
  public OwnerForDescribeOrganizationOutput getOwner() {
    return owner;
  }

  public void setOwner(OwnerForDescribeOrganizationOutput owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeOrganizationResponse describeOrganizationResponse = (DescribeOrganizationResponse) o;
    return Objects.equals(this.organization, describeOrganizationResponse.organization) &&
        Objects.equals(this.owner, describeOrganizationResponse.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeOrganizationResponse {\n");
    
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
