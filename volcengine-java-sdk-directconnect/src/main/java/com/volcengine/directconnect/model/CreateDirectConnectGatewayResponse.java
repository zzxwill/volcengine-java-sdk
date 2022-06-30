/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * CreateDirectConnectGatewayResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:01.352154+08:00[Asia/Shanghai]")
public class CreateDirectConnectGatewayResponse {
  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("PreOrderNumber")
  private String preOrderNumber = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreateDirectConnectGatewayResponse directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }

  public CreateDirectConnectGatewayResponse preOrderNumber(String preOrderNumber) {
    this.preOrderNumber = preOrderNumber;
    return this;
  }

   /**
   * Get preOrderNumber
   * @return preOrderNumber
  **/
  @Schema(description = "")
  public String getPreOrderNumber() {
    return preOrderNumber;
  }

  public void setPreOrderNumber(String preOrderNumber) {
    this.preOrderNumber = preOrderNumber;
  }

  public CreateDirectConnectGatewayResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDirectConnectGatewayResponse createDirectConnectGatewayResponse = (CreateDirectConnectGatewayResponse) o;
    return Objects.equals(this.directConnectGatewayId, createDirectConnectGatewayResponse.directConnectGatewayId) &&
        Objects.equals(this.preOrderNumber, createDirectConnectGatewayResponse.preOrderNumber) &&
        Objects.equals(this.requestId, createDirectConnectGatewayResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directConnectGatewayId, preOrderNumber, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectConnectGatewayResponse {\n");
    
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    preOrderNumber: ").append(toIndentedString(preOrderNumber)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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