/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * DescribeNetworkAclAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-12T11:38:08.781574+08:00[Asia/Shanghai]")
public class DescribeNetworkAclAttributesRequest {
  @SerializedName("NetworkAclId")
  private String networkAclId = null;

  public DescribeNetworkAclAttributesRequest networkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
    return this;
  }

   /**
   * Get networkAclId
   * @return networkAclId
  **/
  @Schema(description = "")
  public String getNetworkAclId() {
    return networkAclId;
  }

  public void setNetworkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNetworkAclAttributesRequest describeNetworkAclAttributesRequest = (DescribeNetworkAclAttributesRequest) o;
    return Objects.equals(this.networkAclId, describeNetworkAclAttributesRequest.networkAclId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkAclId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNetworkAclAttributesRequest {\n");
    
    sb.append("    networkAclId: ").append(toIndentedString(networkAclId)).append("\n");
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
