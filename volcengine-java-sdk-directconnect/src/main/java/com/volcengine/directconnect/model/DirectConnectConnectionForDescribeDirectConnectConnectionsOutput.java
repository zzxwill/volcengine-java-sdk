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
import com.volcengine.directconnect.model.TagForDescribeDirectConnectConnectionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DirectConnectConnectionForDescribeDirectConnectConnectionsOutput
 */


public class DirectConnectConnectionForDescribeDirectConnectConnectionsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("ConnectionType")
  private String connectionType = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("CustomerContactEmail")
  private String customerContactEmail = null;

  @SerializedName("CustomerContactPhone")
  private String customerContactPhone = null;

  @SerializedName("CustomerName")
  private String customerName = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectAccessPointId")
  private String directConnectAccessPointId = null;

  @SerializedName("DirectConnectConnectionId")
  private String directConnectConnectionId = null;

  @SerializedName("DirectConnectConnectionName")
  private String directConnectConnectionName = null;

  @SerializedName("ExpectBandwidth")
  private Integer expectBandwidth = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("LineOperator")
  private String lineOperator = null;

  @SerializedName("ParentConnectionAccountId")
  private String parentConnectionAccountId = null;

  @SerializedName("ParentConnectionId")
  private String parentConnectionId = null;

  @SerializedName("PeerLocation")
  private String peerLocation = null;

  @SerializedName("PortSpec")
  private String portSpec = null;

  @SerializedName("PortType")
  private String portType = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeDirectConnectConnectionsOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput accountId(String accountId) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @Schema(description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @Schema(description = "")
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput customerContactEmail(String customerContactEmail) {
    this.customerContactEmail = customerContactEmail;
    return this;
  }

   /**
   * Get customerContactEmail
   * @return customerContactEmail
  **/
  @Schema(description = "")
  public String getCustomerContactEmail() {
    return customerContactEmail;
  }

  public void setCustomerContactEmail(String customerContactEmail) {
    this.customerContactEmail = customerContactEmail;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput customerContactPhone(String customerContactPhone) {
    this.customerContactPhone = customerContactPhone;
    return this;
  }

   /**
   * Get customerContactPhone
   * @return customerContactPhone
  **/
  @Schema(description = "")
  public String getCustomerContactPhone() {
    return customerContactPhone;
  }

  public void setCustomerContactPhone(String customerContactPhone) {
    this.customerContactPhone = customerContactPhone;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @Schema(description = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput description(String description) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput directConnectAccessPointId(String directConnectAccessPointId) {
    this.directConnectAccessPointId = directConnectAccessPointId;
    return this;
  }

   /**
   * Get directConnectAccessPointId
   * @return directConnectAccessPointId
  **/
  @Schema(description = "")
  public String getDirectConnectAccessPointId() {
    return directConnectAccessPointId;
  }

  public void setDirectConnectAccessPointId(String directConnectAccessPointId) {
    this.directConnectAccessPointId = directConnectAccessPointId;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput directConnectConnectionId(String directConnectConnectionId) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput directConnectConnectionName(String directConnectConnectionName) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput expectBandwidth(Integer expectBandwidth) {
    this.expectBandwidth = expectBandwidth;
    return this;
  }

   /**
   * Get expectBandwidth
   * @return expectBandwidth
  **/
  @Schema(description = "")
  public Integer getExpectBandwidth() {
    return expectBandwidth;
  }

  public void setExpectBandwidth(Integer expectBandwidth) {
    this.expectBandwidth = expectBandwidth;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput lineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
    return this;
  }

   /**
   * Get lineOperator
   * @return lineOperator
  **/
  @Schema(description = "")
  public String getLineOperator() {
    return lineOperator;
  }

  public void setLineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput parentConnectionAccountId(String parentConnectionAccountId) {
    this.parentConnectionAccountId = parentConnectionAccountId;
    return this;
  }

   /**
   * Get parentConnectionAccountId
   * @return parentConnectionAccountId
  **/
  @Schema(description = "")
  public String getParentConnectionAccountId() {
    return parentConnectionAccountId;
  }

  public void setParentConnectionAccountId(String parentConnectionAccountId) {
    this.parentConnectionAccountId = parentConnectionAccountId;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput parentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
    return this;
  }

   /**
   * Get parentConnectionId
   * @return parentConnectionId
  **/
  @Schema(description = "")
  public String getParentConnectionId() {
    return parentConnectionId;
  }

  public void setParentConnectionId(String parentConnectionId) {
    this.parentConnectionId = parentConnectionId;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput peerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
    return this;
  }

   /**
   * Get peerLocation
   * @return peerLocation
  **/
  @Schema(description = "")
  public String getPeerLocation() {
    return peerLocation;
  }

  public void setPeerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput portSpec(String portSpec) {
    this.portSpec = portSpec;
    return this;
  }

   /**
   * Get portSpec
   * @return portSpec
  **/
  @Schema(description = "")
  public String getPortSpec() {
    return portSpec;
  }

  public void setPortSpec(String portSpec) {
    this.portSpec = portSpec;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput portType(String portType) {
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @Schema(description = "")
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput projectName(String projectName) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput status(String status) {
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

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput tags(List<TagForDescribeDirectConnectConnectionsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput addTagsItem(TagForDescribeDirectConnectConnectionsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeDirectConnectConnectionsOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeDirectConnectConnectionsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeDirectConnectConnectionsOutput> tags) {
    this.tags = tags;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public DirectConnectConnectionForDescribeDirectConnectConnectionsOutput vlanId(Integer vlanId) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectConnectConnectionForDescribeDirectConnectConnectionsOutput directConnectConnectionForDescribeDirectConnectConnectionsOutput = (DirectConnectConnectionForDescribeDirectConnectConnectionsOutput) o;
    return Objects.equals(this.accountId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.accountId) &&
        Objects.equals(this.bandwidth, directConnectConnectionForDescribeDirectConnectConnectionsOutput.bandwidth) &&
        Objects.equals(this.billingType, directConnectConnectionForDescribeDirectConnectConnectionsOutput.billingType) &&
        Objects.equals(this.businessStatus, directConnectConnectionForDescribeDirectConnectConnectionsOutput.businessStatus) &&
        Objects.equals(this.connectionType, directConnectConnectionForDescribeDirectConnectConnectionsOutput.connectionType) &&
        Objects.equals(this.creationTime, directConnectConnectionForDescribeDirectConnectConnectionsOutput.creationTime) &&
        Objects.equals(this.customerContactEmail, directConnectConnectionForDescribeDirectConnectConnectionsOutput.customerContactEmail) &&
        Objects.equals(this.customerContactPhone, directConnectConnectionForDescribeDirectConnectConnectionsOutput.customerContactPhone) &&
        Objects.equals(this.customerName, directConnectConnectionForDescribeDirectConnectConnectionsOutput.customerName) &&
        Objects.equals(this.deletedTime, directConnectConnectionForDescribeDirectConnectConnectionsOutput.deletedTime) &&
        Objects.equals(this.description, directConnectConnectionForDescribeDirectConnectConnectionsOutput.description) &&
        Objects.equals(this.directConnectAccessPointId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.directConnectAccessPointId) &&
        Objects.equals(this.directConnectConnectionId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.directConnectConnectionId) &&
        Objects.equals(this.directConnectConnectionName, directConnectConnectionForDescribeDirectConnectConnectionsOutput.directConnectConnectionName) &&
        Objects.equals(this.expectBandwidth, directConnectConnectionForDescribeDirectConnectConnectionsOutput.expectBandwidth) &&
        Objects.equals(this.expiredTime, directConnectConnectionForDescribeDirectConnectConnectionsOutput.expiredTime) &&
        Objects.equals(this.lineOperator, directConnectConnectionForDescribeDirectConnectConnectionsOutput.lineOperator) &&
        Objects.equals(this.parentConnectionAccountId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.parentConnectionAccountId) &&
        Objects.equals(this.parentConnectionId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.parentConnectionId) &&
        Objects.equals(this.peerLocation, directConnectConnectionForDescribeDirectConnectConnectionsOutput.peerLocation) &&
        Objects.equals(this.portSpec, directConnectConnectionForDescribeDirectConnectConnectionsOutput.portSpec) &&
        Objects.equals(this.portType, directConnectConnectionForDescribeDirectConnectConnectionsOutput.portType) &&
        Objects.equals(this.projectName, directConnectConnectionForDescribeDirectConnectConnectionsOutput.projectName) &&
        Objects.equals(this.status, directConnectConnectionForDescribeDirectConnectConnectionsOutput.status) &&
        Objects.equals(this.tags, directConnectConnectionForDescribeDirectConnectConnectionsOutput.tags) &&
        Objects.equals(this.updateTime, directConnectConnectionForDescribeDirectConnectConnectionsOutput.updateTime) &&
        Objects.equals(this.vlanId, directConnectConnectionForDescribeDirectConnectConnectionsOutput.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bandwidth, billingType, businessStatus, connectionType, creationTime, customerContactEmail, customerContactPhone, customerName, deletedTime, description, directConnectAccessPointId, directConnectConnectionId, directConnectConnectionName, expectBandwidth, expiredTime, lineOperator, parentConnectionAccountId, parentConnectionId, peerLocation, portSpec, portType, projectName, status, tags, updateTime, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectConnectConnectionForDescribeDirectConnectConnectionsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    customerContactEmail: ").append(toIndentedString(customerContactEmail)).append("\n");
    sb.append("    customerContactPhone: ").append(toIndentedString(customerContactPhone)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectAccessPointId: ").append(toIndentedString(directConnectAccessPointId)).append("\n");
    sb.append("    directConnectConnectionId: ").append(toIndentedString(directConnectConnectionId)).append("\n");
    sb.append("    directConnectConnectionName: ").append(toIndentedString(directConnectConnectionName)).append("\n");
    sb.append("    expectBandwidth: ").append(toIndentedString(expectBandwidth)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    lineOperator: ").append(toIndentedString(lineOperator)).append("\n");
    sb.append("    parentConnectionAccountId: ").append(toIndentedString(parentConnectionAccountId)).append("\n");
    sb.append("    parentConnectionId: ").append(toIndentedString(parentConnectionId)).append("\n");
    sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
    sb.append("    portSpec: ").append(toIndentedString(portSpec)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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
