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
import com.volcengine.iam.model.AccessKeyMetadatumForListAccessKeysOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAccessKeysResponse
 */


public class ListAccessKeysResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccessKeyMetadata")
  private List<AccessKeyMetadatumForListAccessKeysOutput> accessKeyMetadata = null;

  public ListAccessKeysResponse accessKeyMetadata(List<AccessKeyMetadatumForListAccessKeysOutput> accessKeyMetadata) {
    this.accessKeyMetadata = accessKeyMetadata;
    return this;
  }

  public ListAccessKeysResponse addAccessKeyMetadataItem(AccessKeyMetadatumForListAccessKeysOutput accessKeyMetadataItem) {
    if (this.accessKeyMetadata == null) {
      this.accessKeyMetadata = new ArrayList<AccessKeyMetadatumForListAccessKeysOutput>();
    }
    this.accessKeyMetadata.add(accessKeyMetadataItem);
    return this;
  }

   /**
   * Get accessKeyMetadata
   * @return accessKeyMetadata
  **/
  @Valid
  @Schema(description = "")
  public List<AccessKeyMetadatumForListAccessKeysOutput> getAccessKeyMetadata() {
    return accessKeyMetadata;
  }

  public void setAccessKeyMetadata(List<AccessKeyMetadatumForListAccessKeysOutput> accessKeyMetadata) {
    this.accessKeyMetadata = accessKeyMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAccessKeysResponse listAccessKeysResponse = (ListAccessKeysResponse) o;
    return Objects.equals(this.accessKeyMetadata, listAccessKeysResponse.accessKeyMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAccessKeysResponse {\n");
    
    sb.append("    accessKeyMetadata: ").append(toIndentedString(accessKeyMetadata)).append("\n");
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
