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
 * InnerReplaceSystemVolumeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class InnerReplaceSystemVolumeRequest {
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

  public InnerReplaceSystemVolumeRequest imageId(String imageId) {
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

  public InnerReplaceSystemVolumeRequest instanceId(String instanceId) {
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

  public InnerReplaceSystemVolumeRequest keyPairName(String keyPairName) {
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

  public InnerReplaceSystemVolumeRequest password(String password) {
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

  public InnerReplaceSystemVolumeRequest size(String size) {
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

  public InnerReplaceSystemVolumeRequest userData(String userData) {
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
    InnerReplaceSystemVolumeRequest innerReplaceSystemVolumeRequest = (InnerReplaceSystemVolumeRequest) o;
    return Objects.equals(this.imageId, innerReplaceSystemVolumeRequest.imageId) &&
        Objects.equals(this.instanceId, innerReplaceSystemVolumeRequest.instanceId) &&
        Objects.equals(this.keyPairName, innerReplaceSystemVolumeRequest.keyPairName) &&
        Objects.equals(this.password, innerReplaceSystemVolumeRequest.password) &&
        Objects.equals(this.size, innerReplaceSystemVolumeRequest.size) &&
        Objects.equals(this.userData, innerReplaceSystemVolumeRequest.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, instanceId, keyPairName, password, size, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerReplaceSystemVolumeRequest {\n");
    
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