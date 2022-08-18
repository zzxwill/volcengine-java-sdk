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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ReplaceSystemVolumeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-18T12:02:03.744330+08:00[Asia/Shanghai]")
public class ReplaceSystemVolumeRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("Size")
  private String size = null;

  @SerializedName("UserData")
  private String userData = null;

  public ReplaceSystemVolumeRequest clientToken(String clientToken) {
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

  public ReplaceSystemVolumeRequest imageId(String imageId) {
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

  public ReplaceSystemVolumeRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ReplaceSystemVolumeRequest keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }

  public ReplaceSystemVolumeRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ReplaceSystemVolumeRequest size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public ReplaceSystemVolumeRequest userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @Schema(description = "")
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceSystemVolumeRequest replaceSystemVolumeRequest = (ReplaceSystemVolumeRequest) o;
    return Objects.equals(this.clientToken, replaceSystemVolumeRequest.clientToken) &&
        Objects.equals(this.imageId, replaceSystemVolumeRequest.imageId) &&
        Objects.equals(this.instanceId, replaceSystemVolumeRequest.instanceId) &&
        Objects.equals(this.keyPairName, replaceSystemVolumeRequest.keyPairName) &&
        Objects.equals(this.password, replaceSystemVolumeRequest.password) &&
        Objects.equals(this.size, replaceSystemVolumeRequest.size) &&
        Objects.equals(this.userData, replaceSystemVolumeRequest.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, imageId, instanceId, keyPairName, password, size, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceSystemVolumeRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
