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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssociateInstancesIamRoleRequest
 */


public class AssociateInstancesIamRoleRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("IamRoleName")
  private String iamRoleName = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  public AssociateInstancesIamRoleRequest clientToken(String clientToken) {
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

  public AssociateInstancesIamRoleRequest iamRoleName(String iamRoleName) {
    this.iamRoleName = iamRoleName;
    return this;
  }

   /**
   * Get iamRoleName
   * @return iamRoleName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIamRoleName() {
    return iamRoleName;
  }

  public void setIamRoleName(String iamRoleName) {
    this.iamRoleName = iamRoleName;
  }

  public AssociateInstancesIamRoleRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public AssociateInstancesIamRoleRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateInstancesIamRoleRequest associateInstancesIamRoleRequest = (AssociateInstancesIamRoleRequest) o;
    return Objects.equals(this.clientToken, associateInstancesIamRoleRequest.clientToken) &&
        Objects.equals(this.iamRoleName, associateInstancesIamRoleRequest.iamRoleName) &&
        Objects.equals(this.instanceIds, associateInstancesIamRoleRequest.instanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, iamRoleName, instanceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateInstancesIamRoleRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    iamRoleName: ").append(toIndentedString(iamRoleName)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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
