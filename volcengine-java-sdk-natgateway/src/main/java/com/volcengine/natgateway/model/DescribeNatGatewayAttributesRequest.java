/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.natgateway.model;

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
 * DescribeNatGatewayAttributesRequest
 */


public class DescribeNatGatewayAttributesRequest {
  @SerializedName("NatGatewayId")
  private String natGatewayId = null;

  public DescribeNatGatewayAttributesRequest natGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
    return this;
  }

   /**
   * Get natGatewayId
   * @return natGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNatGatewayId() {
    return natGatewayId;
  }

  public void setNatGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNatGatewayAttributesRequest describeNatGatewayAttributesRequest = (DescribeNatGatewayAttributesRequest) o;
    return Objects.equals(this.natGatewayId, describeNatGatewayAttributesRequest.natGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(natGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNatGatewayAttributesRequest {\n");
    
    sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
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
