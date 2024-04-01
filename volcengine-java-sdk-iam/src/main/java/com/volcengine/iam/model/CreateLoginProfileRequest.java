/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * CreateLoginProfileRequest
 */


public class CreateLoginProfileRequest {
  @SerializedName("LoginAllowed")
  private Boolean loginAllowed = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("PasswordResetRequired")
  private Boolean passwordResetRequired = null;

  @SerializedName("UserName")
  private String userName = null;

  public CreateLoginProfileRequest loginAllowed(Boolean loginAllowed) {
    this.loginAllowed = loginAllowed;
    return this;
  }

   /**
   * Get loginAllowed
   * @return loginAllowed
  **/
  @Schema(description = "")
  public Boolean isLoginAllowed() {
    return loginAllowed;
  }

  public void setLoginAllowed(Boolean loginAllowed) {
    this.loginAllowed = loginAllowed;
  }

  public CreateLoginProfileRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateLoginProfileRequest passwordResetRequired(Boolean passwordResetRequired) {
    this.passwordResetRequired = passwordResetRequired;
    return this;
  }

   /**
   * Get passwordResetRequired
   * @return passwordResetRequired
  **/
  @Schema(description = "")
  public Boolean isPasswordResetRequired() {
    return passwordResetRequired;
  }

  public void setPasswordResetRequired(Boolean passwordResetRequired) {
    this.passwordResetRequired = passwordResetRequired;
  }

  public CreateLoginProfileRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    CreateLoginProfileRequest createLoginProfileRequest = (CreateLoginProfileRequest) o;
    return Objects.equals(this.loginAllowed, createLoginProfileRequest.loginAllowed) &&
        Objects.equals(this.password, createLoginProfileRequest.password) &&
        Objects.equals(this.passwordResetRequired, createLoginProfileRequest.passwordResetRequired) &&
        Objects.equals(this.userName, createLoginProfileRequest.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginAllowed, password, passwordResetRequired, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoginProfileRequest {\n");
    
    sb.append("    loginAllowed: ").append(toIndentedString(loginAllowed)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordResetRequired: ").append(toIndentedString(passwordResetRequired)).append("\n");
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
