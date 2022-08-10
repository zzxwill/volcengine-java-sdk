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
 * ModifyImageSharePermissionRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-10T10:51:36.170610+08:00[Asia/Shanghai]")
public class ModifyImageSharePermissionRequest {
  @SerializedName("AddAccounts")
  private List<String> addAccounts = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("RemoveAccounts")
  private List<String> removeAccounts = null;

  public ModifyImageSharePermissionRequest addAccounts(List<String> addAccounts) {
    this.addAccounts = addAccounts;
    return this;
  }

  public ModifyImageSharePermissionRequest addAddAccountsItem(String addAccountsItem) {
    if (this.addAccounts == null) {
      this.addAccounts = new ArrayList<String>();
    }
    this.addAccounts.add(addAccountsItem);
    return this;
  }

   /**
   * Get addAccounts
   * @return addAccounts
  **/
  @Schema(description = "")
  public List<String> getAddAccounts() {
    return addAccounts;
  }

  public void setAddAccounts(List<String> addAccounts) {
    this.addAccounts = addAccounts;
  }

  public ModifyImageSharePermissionRequest imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ModifyImageSharePermissionRequest removeAccounts(List<String> removeAccounts) {
    this.removeAccounts = removeAccounts;
    return this;
  }

  public ModifyImageSharePermissionRequest addRemoveAccountsItem(String removeAccountsItem) {
    if (this.removeAccounts == null) {
      this.removeAccounts = new ArrayList<String>();
    }
    this.removeAccounts.add(removeAccountsItem);
    return this;
  }

   /**
   * Get removeAccounts
   * @return removeAccounts
  **/
  @Schema(description = "")
  public List<String> getRemoveAccounts() {
    return removeAccounts;
  }

  public void setRemoveAccounts(List<String> removeAccounts) {
    this.removeAccounts = removeAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyImageSharePermissionRequest modifyImageSharePermissionRequest = (ModifyImageSharePermissionRequest) o;
    return Objects.equals(this.addAccounts, modifyImageSharePermissionRequest.addAccounts) &&
        Objects.equals(this.imageId, modifyImageSharePermissionRequest.imageId) &&
        Objects.equals(this.removeAccounts, modifyImageSharePermissionRequest.removeAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addAccounts, imageId, removeAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyImageSharePermissionRequest {\n");
    
    sb.append("    addAccounts: ").append(toIndentedString(addAccounts)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    removeAccounts: ").append(toIndentedString(removeAccounts)).append("\n");
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
