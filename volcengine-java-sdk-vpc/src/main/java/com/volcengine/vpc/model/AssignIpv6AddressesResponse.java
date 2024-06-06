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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssignIpv6AddressesResponse
 */



public class AssignIpv6AddressesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Ipv6Set")
  private List<String> ipv6Set = null;

  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public AssignIpv6AddressesResponse ipv6Set(List<String> ipv6Set) {
    this.ipv6Set = ipv6Set;
    return this;
  }

  public AssignIpv6AddressesResponse addIpv6SetItem(String ipv6SetItem) {
    if (this.ipv6Set == null) {
      this.ipv6Set = new ArrayList<String>();
    }
    this.ipv6Set.add(ipv6SetItem);
    return this;
  }

   /**
   * Get ipv6Set
   * @return ipv6Set
  **/
  @Schema(description = "")
  public List<String> getIpv6Set() {
    return ipv6Set;
  }

  public void setIpv6Set(List<String> ipv6Set) {
    this.ipv6Set = ipv6Set;
  }

  public AssignIpv6AddressesResponse networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

   /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  **/
  @Schema(description = "")
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public AssignIpv6AddressesResponse requestId(String requestId) {
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
    AssignIpv6AddressesResponse assignIpv6AddressesResponse = (AssignIpv6AddressesResponse) o;
    return Objects.equals(this.ipv6Set, assignIpv6AddressesResponse.ipv6Set) &&
        Objects.equals(this.networkInterfaceId, assignIpv6AddressesResponse.networkInterfaceId) &&
        Objects.equals(this.requestId, assignIpv6AddressesResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv6Set, networkInterfaceId, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignIpv6AddressesResponse {\n");
    
    sb.append("    ipv6Set: ").append(toIndentedString(ipv6Set)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
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
