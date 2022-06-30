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
 * DescribeEipAddressAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:16.579539+08:00[Asia/Shanghai]")
public class DescribeEipAddressAttributesResponse {
  @SerializedName("AllocationId")
  private String allocationId = null;

  @SerializedName("AllocationTime")
  private String allocationTime = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BandwidthPackageId")
  private String bandwidthPackageId = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("ISP")
  private String ISP = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("SecurityProtectionTypes")
  private List<String> securityProtectionTypes = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public DescribeEipAddressAttributesResponse allocationId(String allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Get allocationId
   * @return allocationId
  **/
  @Schema(description = "")
  public String getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(String allocationId) {
    this.allocationId = allocationId;
  }

  public DescribeEipAddressAttributesResponse allocationTime(String allocationTime) {
    this.allocationTime = allocationTime;
    return this;
  }

   /**
   * Get allocationTime
   * @return allocationTime
  **/
  @Schema(description = "")
  public String getAllocationTime() {
    return allocationTime;
  }

  public void setAllocationTime(String allocationTime) {
    this.allocationTime = allocationTime;
  }

  public DescribeEipAddressAttributesResponse bandwidth(Integer bandwidth) {
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

  public DescribeEipAddressAttributesResponse bandwidthPackageId(String bandwidthPackageId) {
    this.bandwidthPackageId = bandwidthPackageId;
    return this;
  }

   /**
   * Get bandwidthPackageId
   * @return bandwidthPackageId
  **/
  @Schema(description = "")
  public String getBandwidthPackageId() {
    return bandwidthPackageId;
  }

  public void setBandwidthPackageId(String bandwidthPackageId) {
    this.bandwidthPackageId = bandwidthPackageId;
  }

  public DescribeEipAddressAttributesResponse billingType(Integer billingType) {
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

  public DescribeEipAddressAttributesResponse businessStatus(String businessStatus) {
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

  public DescribeEipAddressAttributesResponse deletedTime(String deletedTime) {
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

  public DescribeEipAddressAttributesResponse description(String description) {
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

  public DescribeEipAddressAttributesResponse eipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
    return this;
  }

   /**
   * Get eipAddress
   * @return eipAddress
  **/
  @Schema(description = "")
  public String getEipAddress() {
    return eipAddress;
  }

  public void setEipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
  }

  public DescribeEipAddressAttributesResponse expiredTime(String expiredTime) {
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

  public DescribeEipAddressAttributesResponse ISP(String ISP) {
    this.ISP = ISP;
    return this;
  }

   /**
   * Get ISP
   * @return ISP
  **/
  @Schema(description = "")
  public String getISP() {
    return ISP;
  }

  public void setISP(String ISP) {
    this.ISP = ISP;
  }

  public DescribeEipAddressAttributesResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeEipAddressAttributesResponse instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public DescribeEipAddressAttributesResponse lockReason(String lockReason) {
    this.lockReason = lockReason;
    return this;
  }

   /**
   * Get lockReason
   * @return lockReason
  **/
  @Schema(description = "")
  public String getLockReason() {
    return lockReason;
  }

  public void setLockReason(String lockReason) {
    this.lockReason = lockReason;
  }

  public DescribeEipAddressAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DescribeEipAddressAttributesResponse overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public DescribeEipAddressAttributesResponse requestId(String requestId) {
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

  public DescribeEipAddressAttributesResponse securityProtectionTypes(List<String> securityProtectionTypes) {
    this.securityProtectionTypes = securityProtectionTypes;
    return this;
  }

  public DescribeEipAddressAttributesResponse addSecurityProtectionTypesItem(String securityProtectionTypesItem) {
    if (this.securityProtectionTypes == null) {
      this.securityProtectionTypes = new ArrayList<String>();
    }
    this.securityProtectionTypes.add(securityProtectionTypesItem);
    return this;
  }

   /**
   * Get securityProtectionTypes
   * @return securityProtectionTypes
  **/
  @Schema(description = "")
  public List<String> getSecurityProtectionTypes() {
    return securityProtectionTypes;
  }

  public void setSecurityProtectionTypes(List<String> securityProtectionTypes) {
    this.securityProtectionTypes = securityProtectionTypes;
  }

  public DescribeEipAddressAttributesResponse status(String status) {
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

  public DescribeEipAddressAttributesResponse updatedAt(String updatedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeEipAddressAttributesResponse describeEipAddressAttributesResponse = (DescribeEipAddressAttributesResponse) o;
    return Objects.equals(this.allocationId, describeEipAddressAttributesResponse.allocationId) &&
        Objects.equals(this.allocationTime, describeEipAddressAttributesResponse.allocationTime) &&
        Objects.equals(this.bandwidth, describeEipAddressAttributesResponse.bandwidth) &&
        Objects.equals(this.bandwidthPackageId, describeEipAddressAttributesResponse.bandwidthPackageId) &&
        Objects.equals(this.billingType, describeEipAddressAttributesResponse.billingType) &&
        Objects.equals(this.businessStatus, describeEipAddressAttributesResponse.businessStatus) &&
        Objects.equals(this.deletedTime, describeEipAddressAttributesResponse.deletedTime) &&
        Objects.equals(this.description, describeEipAddressAttributesResponse.description) &&
        Objects.equals(this.eipAddress, describeEipAddressAttributesResponse.eipAddress) &&
        Objects.equals(this.expiredTime, describeEipAddressAttributesResponse.expiredTime) &&
        Objects.equals(this.ISP, describeEipAddressAttributesResponse.ISP) &&
        Objects.equals(this.instanceId, describeEipAddressAttributesResponse.instanceId) &&
        Objects.equals(this.instanceType, describeEipAddressAttributesResponse.instanceType) &&
        Objects.equals(this.lockReason, describeEipAddressAttributesResponse.lockReason) &&
        Objects.equals(this.name, describeEipAddressAttributesResponse.name) &&
        Objects.equals(this.overdueTime, describeEipAddressAttributesResponse.overdueTime) &&
        Objects.equals(this.requestId, describeEipAddressAttributesResponse.requestId) &&
        Objects.equals(this.securityProtectionTypes, describeEipAddressAttributesResponse.securityProtectionTypes) &&
        Objects.equals(this.status, describeEipAddressAttributesResponse.status) &&
        Objects.equals(this.updatedAt, describeEipAddressAttributesResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, allocationTime, bandwidth, bandwidthPackageId, billingType, businessStatus, deletedTime, description, eipAddress, expiredTime, ISP, instanceId, instanceType, lockReason, name, overdueTime, requestId, securityProtectionTypes, status, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeEipAddressAttributesResponse {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    allocationTime: ").append(toIndentedString(allocationTime)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    ISP: ").append(toIndentedString(ISP)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    securityProtectionTypes: ").append(toIndentedString(securityProtectionTypes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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