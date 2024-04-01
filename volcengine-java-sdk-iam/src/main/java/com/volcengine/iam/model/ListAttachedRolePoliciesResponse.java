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
import com.volcengine.iam.model.AttachedPolicyMetadatumForListAttachedRolePoliciesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAttachedRolePoliciesResponse
 */


public class ListAttachedRolePoliciesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AttachedPolicyMetadata")
  private List<AttachedPolicyMetadatumForListAttachedRolePoliciesOutput> attachedPolicyMetadata = null;

  public ListAttachedRolePoliciesResponse attachedPolicyMetadata(List<AttachedPolicyMetadatumForListAttachedRolePoliciesOutput> attachedPolicyMetadata) {
    this.attachedPolicyMetadata = attachedPolicyMetadata;
    return this;
  }

  public ListAttachedRolePoliciesResponse addAttachedPolicyMetadataItem(AttachedPolicyMetadatumForListAttachedRolePoliciesOutput attachedPolicyMetadataItem) {
    if (this.attachedPolicyMetadata == null) {
      this.attachedPolicyMetadata = new ArrayList<AttachedPolicyMetadatumForListAttachedRolePoliciesOutput>();
    }
    this.attachedPolicyMetadata.add(attachedPolicyMetadataItem);
    return this;
  }

   /**
   * Get attachedPolicyMetadata
   * @return attachedPolicyMetadata
  **/
  @Valid
  @Schema(description = "")
  public List<AttachedPolicyMetadatumForListAttachedRolePoliciesOutput> getAttachedPolicyMetadata() {
    return attachedPolicyMetadata;
  }

  public void setAttachedPolicyMetadata(List<AttachedPolicyMetadatumForListAttachedRolePoliciesOutput> attachedPolicyMetadata) {
    this.attachedPolicyMetadata = attachedPolicyMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAttachedRolePoliciesResponse listAttachedRolePoliciesResponse = (ListAttachedRolePoliciesResponse) o;
    return Objects.equals(this.attachedPolicyMetadata, listAttachedRolePoliciesResponse.attachedPolicyMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachedPolicyMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAttachedRolePoliciesResponse {\n");
    
    sb.append("    attachedPolicyMetadata: ").append(toIndentedString(attachedPolicyMetadata)).append("\n");
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
