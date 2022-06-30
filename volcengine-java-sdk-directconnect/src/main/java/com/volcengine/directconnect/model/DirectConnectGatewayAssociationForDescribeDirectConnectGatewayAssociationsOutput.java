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
 * DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:20:58.026076+08:00[Asia/Shanghai]")
public class DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("DirectConnectConnectionId")
  private String directConnectConnectionId = null;

  @SerializedName("DirectConnectConnectionName")
  private String directConnectConnectionName = null;

  @SerializedName("DirectConnectGatewayAssociationId")
  private String directConnectGatewayAssociationId = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("DirectConnectGatewayName")
  private String directConnectGatewayName = null;

  @SerializedName("LocalIp")
  private String localIp = null;

  @SerializedName("Mask")
  private String mask = null;

  @SerializedName("PeerIp")
  private String peerIp = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput directConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
    return this;
  }

   /**
   * Get directConnectConnectionId
   * @return directConnectConnectionId
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionId() {
    return directConnectConnectionId;
  }

  public void setDirectConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput directConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
    return this;
  }

   /**
   * Get directConnectConnectionName
   * @return directConnectConnectionName
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionName() {
    return directConnectConnectionName;
  }

  public void setDirectConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput directConnectGatewayAssociationId(String directConnectGatewayAssociationId) {
    this.directConnectGatewayAssociationId = directConnectGatewayAssociationId;
    return this;
  }

   /**
   * Get directConnectGatewayAssociationId
   * @return directConnectGatewayAssociationId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayAssociationId() {
    return directConnectGatewayAssociationId;
  }

  public void setDirectConnectGatewayAssociationId(String directConnectGatewayAssociationId) {
    this.directConnectGatewayAssociationId = directConnectGatewayAssociationId;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput directConnectGatewayId(String directConnectGatewayId) {
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

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput directConnectGatewayName(String directConnectGatewayName) {
    this.directConnectGatewayName = directConnectGatewayName;
    return this;
  }

   /**
   * Get directConnectGatewayName
   * @return directConnectGatewayName
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayName() {
    return directConnectGatewayName;
  }

  public void setDirectConnectGatewayName(String directConnectGatewayName) {
    this.directConnectGatewayName = directConnectGatewayName;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput localIp(String localIp) {
    this.localIp = localIp;
    return this;
  }

   /**
   * Get localIp
   * @return localIp
  **/
  @Schema(description = "")
  public String getLocalIp() {
    return localIp;
  }

  public void setLocalIp(String localIp) {
    this.localIp = localIp;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput mask(String mask) {
    this.mask = mask;
    return this;
  }

   /**
   * Get mask
   * @return mask
  **/
  @Schema(description = "")
  public String getMask() {
    return mask;
  }

  public void setMask(String mask) {
    this.mask = mask;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput peerIp(String peerIp) {
    this.peerIp = peerIp;
    return this;
  }

   /**
   * Get peerIp
   * @return peerIp
  **/
  @Schema(description = "")
  public String getPeerIp() {
    return peerIp;
  }

  public void setPeerIp(String peerIp) {
    this.peerIp = peerIp;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @Schema(description = "")
  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput = (DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput) o;
    return Objects.equals(this.accountId, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.accountId) &&
        Objects.equals(this.createdAt, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.createdAt) &&
        Objects.equals(this.directConnectConnectionId, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.directConnectConnectionId) &&
        Objects.equals(this.directConnectConnectionName, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.directConnectConnectionName) &&
        Objects.equals(this.directConnectGatewayAssociationId, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.directConnectGatewayAssociationId) &&
        Objects.equals(this.directConnectGatewayId, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.directConnectGatewayId) &&
        Objects.equals(this.directConnectGatewayName, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.directConnectGatewayName) &&
        Objects.equals(this.localIp, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.localIp) &&
        Objects.equals(this.mask, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.mask) &&
        Objects.equals(this.peerIp, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.peerIp) &&
        Objects.equals(this.projectName, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.projectName) &&
        Objects.equals(this.status, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.status) &&
        Objects.equals(this.updatedAt, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.updatedAt) &&
        Objects.equals(this.vlanId, directConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdAt, directConnectConnectionId, directConnectConnectionName, directConnectGatewayAssociationId, directConnectGatewayId, directConnectGatewayName, localIp, mask, peerIp, projectName, status, updatedAt, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectConnectGatewayAssociationForDescribeDirectConnectGatewayAssociationsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    directConnectConnectionId: ").append(toIndentedString(directConnectConnectionId)).append("\n");
    sb.append("    directConnectConnectionName: ").append(toIndentedString(directConnectConnectionName)).append("\n");
    sb.append("    directConnectGatewayAssociationId: ").append(toIndentedString(directConnectGatewayAssociationId)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    directConnectGatewayName: ").append(toIndentedString(directConnectGatewayName)).append("\n");
    sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    peerIp: ").append(toIndentedString(peerIp)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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