/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpn.model;

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
 * ModifyCustomerVpnGatewayAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:21:18.622599+08:00[Asia/Shanghai]")
public class ModifyCustomerVpnGatewayAttributesRequest {
  @SerializedName("CustomerVpnGatewayId")
  private String customerVpnGatewayId = null;

  @SerializedName("CustomerVpnGatewayName")
  private String customerVpnGatewayName = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyCustomerVpnGatewayAttributesRequest customerVpnGatewayId(String customerVpnGatewayId) {
    this.customerVpnGatewayId = customerVpnGatewayId;
    return this;
  }

   /**
   * Get customerVpnGatewayId
   * @return customerVpnGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCustomerVpnGatewayId() {
    return customerVpnGatewayId;
  }

  public void setCustomerVpnGatewayId(String customerVpnGatewayId) {
    this.customerVpnGatewayId = customerVpnGatewayId;
  }

  public ModifyCustomerVpnGatewayAttributesRequest customerVpnGatewayName(String customerVpnGatewayName) {
    this.customerVpnGatewayName = customerVpnGatewayName;
    return this;
  }

   /**
   * Get customerVpnGatewayName
   * @return customerVpnGatewayName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getCustomerVpnGatewayName() {
    return customerVpnGatewayName;
  }

  public void setCustomerVpnGatewayName(String customerVpnGatewayName) {
    this.customerVpnGatewayName = customerVpnGatewayName;
  }

  public ModifyCustomerVpnGatewayAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyCustomerVpnGatewayAttributesRequest modifyCustomerVpnGatewayAttributesRequest = (ModifyCustomerVpnGatewayAttributesRequest) o;
    return Objects.equals(this.customerVpnGatewayId, modifyCustomerVpnGatewayAttributesRequest.customerVpnGatewayId) &&
        Objects.equals(this.customerVpnGatewayName, modifyCustomerVpnGatewayAttributesRequest.customerVpnGatewayName) &&
        Objects.equals(this.description, modifyCustomerVpnGatewayAttributesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerVpnGatewayId, customerVpnGatewayName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyCustomerVpnGatewayAttributesRequest {\n");
    
    sb.append("    customerVpnGatewayId: ").append(toIndentedString(customerVpnGatewayId)).append("\n");
    sb.append("    customerVpnGatewayName: ").append(toIndentedString(customerVpnGatewayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
