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

package com.volcengine.vpn.model;

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
 * DescribeVpnGatewayRouteAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:51.103428+08:00[Asia/Shanghai]")
public class DescribeVpnGatewayRouteAttributesRequest {
  @SerializedName("VpnGatewayRouteId")
  private String vpnGatewayRouteId = null;

  public DescribeVpnGatewayRouteAttributesRequest vpnGatewayRouteId(String vpnGatewayRouteId) {
    this.vpnGatewayRouteId = vpnGatewayRouteId;
    return this;
  }

   /**
   * Get vpnGatewayRouteId
   * @return vpnGatewayRouteId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpnGatewayRouteId() {
    return vpnGatewayRouteId;
  }

  public void setVpnGatewayRouteId(String vpnGatewayRouteId) {
    this.vpnGatewayRouteId = vpnGatewayRouteId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpnGatewayRouteAttributesRequest describeVpnGatewayRouteAttributesRequest = (DescribeVpnGatewayRouteAttributesRequest) o;
    return Objects.equals(this.vpnGatewayRouteId, describeVpnGatewayRouteAttributesRequest.vpnGatewayRouteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpnGatewayRouteId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnGatewayRouteAttributesRequest {\n");
    
    sb.append("    vpnGatewayRouteId: ").append(toIndentedString(vpnGatewayRouteId)).append("\n");
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
