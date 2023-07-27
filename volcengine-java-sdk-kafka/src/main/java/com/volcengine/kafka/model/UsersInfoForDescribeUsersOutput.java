/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

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
 * UsersInfoForDescribeUsersOutput
 */


public class UsersInfoForDescribeUsersOutput {
  @SerializedName("AllAuthority")
  private Boolean allAuthority = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PasswordType")
  private String passwordType = null;

  @SerializedName("UserName")
  private String userName = null;

  public UsersInfoForDescribeUsersOutput allAuthority(Boolean allAuthority) {
    this.allAuthority = allAuthority;
    return this;
  }

   /**
   * Get allAuthority
   * @return allAuthority
  **/
  @Schema(description = "")
  public Boolean isAllAuthority() {
    return allAuthority;
  }

  public void setAllAuthority(Boolean allAuthority) {
    this.allAuthority = allAuthority;
  }

  public UsersInfoForDescribeUsersOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public UsersInfoForDescribeUsersOutput description(String description) {
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

  public UsersInfoForDescribeUsersOutput passwordType(String passwordType) {
    this.passwordType = passwordType;
    return this;
  }

   /**
   * Get passwordType
   * @return passwordType
  **/
  @Schema(description = "")
  public String getPasswordType() {
    return passwordType;
  }

  public void setPasswordType(String passwordType) {
    this.passwordType = passwordType;
  }

  public UsersInfoForDescribeUsersOutput userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersInfoForDescribeUsersOutput usersInfoForDescribeUsersOutput = (UsersInfoForDescribeUsersOutput) o;
    return Objects.equals(this.allAuthority, usersInfoForDescribeUsersOutput.allAuthority) &&
        Objects.equals(this.createTime, usersInfoForDescribeUsersOutput.createTime) &&
        Objects.equals(this.description, usersInfoForDescribeUsersOutput.description) &&
        Objects.equals(this.passwordType, usersInfoForDescribeUsersOutput.passwordType) &&
        Objects.equals(this.userName, usersInfoForDescribeUsersOutput.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allAuthority, createTime, description, passwordType, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersInfoForDescribeUsersOutput {\n");
    
    sb.append("    allAuthority: ").append(toIndentedString(allAuthority)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    passwordType: ").append(toIndentedString(passwordType)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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