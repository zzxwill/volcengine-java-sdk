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
 * IngressAclEntryForDescribeNetworkAclAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:24.287880+08:00[Asia/Shanghai]")
public class IngressAclEntryForDescribeNetworkAclAttributesOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("NetworkAclEntryId")
  private String networkAclEntryId = null;

  @SerializedName("NetworkAclEntryName")
  private String networkAclEntryName = null;

  @SerializedName("Policy")
  private String policy = null;

  @SerializedName("Port")
  private String port = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("SourceCidrIp")
  private String sourceCidrIp = null;

  public IngressAclEntryForDescribeNetworkAclAttributesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IngressAclEntryForDescribeNetworkAclAttributesOutput networkAclEntryId(String networkAclEntryId) {
    this.networkAclEntryId = networkAclEntryId;
    return this;
  }

   /**
   * Get networkAclEntryId
   * @return networkAclEntryId
  **/
  @Schema(description = "")
  public String getNetworkAclEntryId() {
    return networkAclEntryId;
  }

  public void setNetworkAclEntryId(String networkAclEntryId) {
    this.networkAclEntryId = networkAclEntryId;
  }

  public IngressAclEntryForDescribeNetworkAclAttributesOutput networkAclEntryName(String networkAclEntryName) {
    this.networkAclEntryName = networkAclEntryName;
    return this;
  }

   /**
   * Get networkAclEntryName
   * @return networkAclEntryName
  **/
  @Schema(description = "")
  public String getNetworkAclEntryName() {
    return networkAclEntryName;
  }

  public void setNetworkAclEntryName(String networkAclEntryName) {
    this.networkAclEntryName = networkAclEntryName;
  }

  public IngressAclEntryForDescribeNetworkAclAttributesOutput policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Schema(description = "")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public IngressAclEntryForDescribeNetworkAclAttributesOutput port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public IngressAclEntryForDescribeNetworkAclAttributesOutput protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public IngressAclEntryForDescribeNetworkAclAttributesOutput sourceCidrIp(String sourceCidrIp) {
    this.sourceCidrIp = sourceCidrIp;
    return this;
  }

   /**
   * Get sourceCidrIp
   * @return sourceCidrIp
  **/
  @Schema(description = "")
  public String getSourceCidrIp() {
    return sourceCidrIp;
  }

  public void setSourceCidrIp(String sourceCidrIp) {
    this.sourceCidrIp = sourceCidrIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngressAclEntryForDescribeNetworkAclAttributesOutput ingressAclEntryForDescribeNetworkAclAttributesOutput = (IngressAclEntryForDescribeNetworkAclAttributesOutput) o;
    return Objects.equals(this.description, ingressAclEntryForDescribeNetworkAclAttributesOutput.description) &&
        Objects.equals(this.networkAclEntryId, ingressAclEntryForDescribeNetworkAclAttributesOutput.networkAclEntryId) &&
        Objects.equals(this.networkAclEntryName, ingressAclEntryForDescribeNetworkAclAttributesOutput.networkAclEntryName) &&
        Objects.equals(this.policy, ingressAclEntryForDescribeNetworkAclAttributesOutput.policy) &&
        Objects.equals(this.port, ingressAclEntryForDescribeNetworkAclAttributesOutput.port) &&
        Objects.equals(this.protocol, ingressAclEntryForDescribeNetworkAclAttributesOutput.protocol) &&
        Objects.equals(this.sourceCidrIp, ingressAclEntryForDescribeNetworkAclAttributesOutput.sourceCidrIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, networkAclEntryId, networkAclEntryName, policy, port, protocol, sourceCidrIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngressAclEntryForDescribeNetworkAclAttributesOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkAclEntryId: ").append(toIndentedString(networkAclEntryId)).append("\n");
    sb.append("    networkAclEntryName: ").append(toIndentedString(networkAclEntryName)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sourceCidrIp: ").append(toIndentedString(sourceCidrIp)).append("\n");
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
