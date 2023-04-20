/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.AccessLogForDescribeLoadBalancerAttributesOutput;
import com.volcengine.clb.model.EipForDescribeLoadBalancerAttributesOutput;
import com.volcengine.clb.model.Ipv6AddressBandwidthForDescribeLoadBalancerAttributesOutput;
import com.volcengine.clb.model.ListenerForDescribeLoadBalancerAttributesOutput;
import com.volcengine.clb.model.ServerGroupForDescribeLoadBalancerAttributesOutput;
import com.volcengine.clb.model.TagForDescribeLoadBalancerAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeLoadBalancerAttributesResponse
 */


public class DescribeLoadBalancerAttributesResponse {
  @SerializedName("AccessLog")
  private AccessLogForDescribeLoadBalancerAttributesOutput accessLog = null;

  @SerializedName("AddressIpVersion")
  private String addressIpVersion = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Eip")
  private EipForDescribeLoadBalancerAttributesOutput eip = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("EipID")
  private String eipID = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("EniAddress")
  private String eniAddress = null;

  @SerializedName("EniID")
  private String eniID = null;

  @SerializedName("EniIpv6Address")
  private String eniIpv6Address = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("Ipv6AddressBandwidth")
  private Ipv6AddressBandwidthForDescribeLoadBalancerAttributesOutput ipv6AddressBandwidth = null;

  @SerializedName("Ipv6EipId")
  private String ipv6EipId = null;

  @SerializedName("Listeners")
  private List<ListenerForDescribeLoadBalancerAttributesOutput> listeners = null;

  @SerializedName("LoadBalancerBillingType")
  private Integer loadBalancerBillingType = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("LoadBalancerName")
  private String loadBalancerName = null;

  @SerializedName("LoadBalancerSpec")
  private String loadBalancerSpec = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("LogTopicId")
  private String logTopicId = null;

  @SerializedName("MasterZoneId")
  private String masterZoneId = null;

  @SerializedName("ModificationProtectionReason")
  private String modificationProtectionReason = null;

  @SerializedName("ModificationProtectionStatus")
  private String modificationProtectionStatus = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("ServerGroups")
  private List<ServerGroupForDescribeLoadBalancerAttributesOutput> serverGroups = null;

  @SerializedName("SlaveZoneId")
  private String slaveZoneId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForDescribeLoadBalancerAttributesOutput> tags = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeLoadBalancerAttributesResponse accessLog(AccessLogForDescribeLoadBalancerAttributesOutput accessLog) {
    this.accessLog = accessLog;
    return this;
  }

   /**
   * Get accessLog
   * @return accessLog
  **/
  @Valid
  @Schema(description = "")
  public AccessLogForDescribeLoadBalancerAttributesOutput getAccessLog() {
    return accessLog;
  }

  public void setAccessLog(AccessLogForDescribeLoadBalancerAttributesOutput accessLog) {
    this.accessLog = accessLog;
  }

  public DescribeLoadBalancerAttributesResponse addressIpVersion(String addressIpVersion) {
    this.addressIpVersion = addressIpVersion;
    return this;
  }

   /**
   * Get addressIpVersion
   * @return addressIpVersion
  **/
  @Schema(description = "")
  public String getAddressIpVersion() {
    return addressIpVersion;
  }

  public void setAddressIpVersion(String addressIpVersion) {
    this.addressIpVersion = addressIpVersion;
  }

  public DescribeLoadBalancerAttributesResponse businessStatus(String businessStatus) {
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

  public DescribeLoadBalancerAttributesResponse createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public DescribeLoadBalancerAttributesResponse deletedTime(String deletedTime) {
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

  public DescribeLoadBalancerAttributesResponse description(String description) {
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

  public DescribeLoadBalancerAttributesResponse eip(EipForDescribeLoadBalancerAttributesOutput eip) {
    this.eip = eip;
    return this;
  }

   /**
   * Get eip
   * @return eip
  **/
  @Valid
  @Schema(description = "")
  public EipForDescribeLoadBalancerAttributesOutput getEip() {
    return eip;
  }

  public void setEip(EipForDescribeLoadBalancerAttributesOutput eip) {
    this.eip = eip;
  }

  public DescribeLoadBalancerAttributesResponse eipAddress(String eipAddress) {
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

  public DescribeLoadBalancerAttributesResponse eipID(String eipID) {
    this.eipID = eipID;
    return this;
  }

   /**
   * Get eipID
   * @return eipID
  **/
  @Schema(description = "")
  public String getEipID() {
    return eipID;
  }

  public void setEipID(String eipID) {
    this.eipID = eipID;
  }

  public DescribeLoadBalancerAttributesResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public DescribeLoadBalancerAttributesResponse eniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
    return this;
  }

   /**
   * Get eniAddress
   * @return eniAddress
  **/
  @Schema(description = "")
  public String getEniAddress() {
    return eniAddress;
  }

  public void setEniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
  }

  public DescribeLoadBalancerAttributesResponse eniID(String eniID) {
    this.eniID = eniID;
    return this;
  }

   /**
   * Get eniID
   * @return eniID
  **/
  @Schema(description = "")
  public String getEniID() {
    return eniID;
  }

  public void setEniID(String eniID) {
    this.eniID = eniID;
  }

  public DescribeLoadBalancerAttributesResponse eniIpv6Address(String eniIpv6Address) {
    this.eniIpv6Address = eniIpv6Address;
    return this;
  }

   /**
   * Get eniIpv6Address
   * @return eniIpv6Address
  **/
  @Schema(description = "")
  public String getEniIpv6Address() {
    return eniIpv6Address;
  }

  public void setEniIpv6Address(String eniIpv6Address) {
    this.eniIpv6Address = eniIpv6Address;
  }

  public DescribeLoadBalancerAttributesResponse expiredTime(String expiredTime) {
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

  public DescribeLoadBalancerAttributesResponse ipv6AddressBandwidth(Ipv6AddressBandwidthForDescribeLoadBalancerAttributesOutput ipv6AddressBandwidth) {
    this.ipv6AddressBandwidth = ipv6AddressBandwidth;
    return this;
  }

   /**
   * Get ipv6AddressBandwidth
   * @return ipv6AddressBandwidth
  **/
  @Valid
  @Schema(description = "")
  public Ipv6AddressBandwidthForDescribeLoadBalancerAttributesOutput getIpv6AddressBandwidth() {
    return ipv6AddressBandwidth;
  }

  public void setIpv6AddressBandwidth(Ipv6AddressBandwidthForDescribeLoadBalancerAttributesOutput ipv6AddressBandwidth) {
    this.ipv6AddressBandwidth = ipv6AddressBandwidth;
  }

  public DescribeLoadBalancerAttributesResponse ipv6EipId(String ipv6EipId) {
    this.ipv6EipId = ipv6EipId;
    return this;
  }

   /**
   * Get ipv6EipId
   * @return ipv6EipId
  **/
  @Schema(description = "")
  public String getIpv6EipId() {
    return ipv6EipId;
  }

  public void setIpv6EipId(String ipv6EipId) {
    this.ipv6EipId = ipv6EipId;
  }

  public DescribeLoadBalancerAttributesResponse listeners(List<ListenerForDescribeLoadBalancerAttributesOutput> listeners) {
    this.listeners = listeners;
    return this;
  }

  public DescribeLoadBalancerAttributesResponse addListenersItem(ListenerForDescribeLoadBalancerAttributesOutput listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<ListenerForDescribeLoadBalancerAttributesOutput>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Get listeners
   * @return listeners
  **/
  @Valid
  @Schema(description = "")
  public List<ListenerForDescribeLoadBalancerAttributesOutput> getListeners() {
    return listeners;
  }

  public void setListeners(List<ListenerForDescribeLoadBalancerAttributesOutput> listeners) {
    this.listeners = listeners;
  }

  public DescribeLoadBalancerAttributesResponse loadBalancerBillingType(Integer loadBalancerBillingType) {
    this.loadBalancerBillingType = loadBalancerBillingType;
    return this;
  }

   /**
   * Get loadBalancerBillingType
   * @return loadBalancerBillingType
  **/
  @Schema(description = "")
  public Integer getLoadBalancerBillingType() {
    return loadBalancerBillingType;
  }

  public void setLoadBalancerBillingType(Integer loadBalancerBillingType) {
    this.loadBalancerBillingType = loadBalancerBillingType;
  }

  public DescribeLoadBalancerAttributesResponse loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public DescribeLoadBalancerAttributesResponse loadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * Get loadBalancerName
   * @return loadBalancerName
  **/
  @Schema(description = "")
  public String getLoadBalancerName() {
    return loadBalancerName;
  }

  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }

  public DescribeLoadBalancerAttributesResponse loadBalancerSpec(String loadBalancerSpec) {
    this.loadBalancerSpec = loadBalancerSpec;
    return this;
  }

   /**
   * Get loadBalancerSpec
   * @return loadBalancerSpec
  **/
  @Schema(description = "")
  public String getLoadBalancerSpec() {
    return loadBalancerSpec;
  }

  public void setLoadBalancerSpec(String loadBalancerSpec) {
    this.loadBalancerSpec = loadBalancerSpec;
  }

  public DescribeLoadBalancerAttributesResponse lockReason(String lockReason) {
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

  public DescribeLoadBalancerAttributesResponse logTopicId(String logTopicId) {
    this.logTopicId = logTopicId;
    return this;
  }

   /**
   * Get logTopicId
   * @return logTopicId
  **/
  @Schema(description = "")
  public String getLogTopicId() {
    return logTopicId;
  }

  public void setLogTopicId(String logTopicId) {
    this.logTopicId = logTopicId;
  }

  public DescribeLoadBalancerAttributesResponse masterZoneId(String masterZoneId) {
    this.masterZoneId = masterZoneId;
    return this;
  }

   /**
   * Get masterZoneId
   * @return masterZoneId
  **/
  @Schema(description = "")
  public String getMasterZoneId() {
    return masterZoneId;
  }

  public void setMasterZoneId(String masterZoneId) {
    this.masterZoneId = masterZoneId;
  }

  public DescribeLoadBalancerAttributesResponse modificationProtectionReason(String modificationProtectionReason) {
    this.modificationProtectionReason = modificationProtectionReason;
    return this;
  }

   /**
   * Get modificationProtectionReason
   * @return modificationProtectionReason
  **/
  @Schema(description = "")
  public String getModificationProtectionReason() {
    return modificationProtectionReason;
  }

  public void setModificationProtectionReason(String modificationProtectionReason) {
    this.modificationProtectionReason = modificationProtectionReason;
  }

  public DescribeLoadBalancerAttributesResponse modificationProtectionStatus(String modificationProtectionStatus) {
    this.modificationProtectionStatus = modificationProtectionStatus;
    return this;
  }

   /**
   * Get modificationProtectionStatus
   * @return modificationProtectionStatus
  **/
  @Schema(description = "")
  public String getModificationProtectionStatus() {
    return modificationProtectionStatus;
  }

  public void setModificationProtectionStatus(String modificationProtectionStatus) {
    this.modificationProtectionStatus = modificationProtectionStatus;
  }

  public DescribeLoadBalancerAttributesResponse overdueTime(String overdueTime) {
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

  public DescribeLoadBalancerAttributesResponse projectName(String projectName) {
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

  public DescribeLoadBalancerAttributesResponse requestId(String requestId) {
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

  public DescribeLoadBalancerAttributesResponse serverGroups(List<ServerGroupForDescribeLoadBalancerAttributesOutput> serverGroups) {
    this.serverGroups = serverGroups;
    return this;
  }

  public DescribeLoadBalancerAttributesResponse addServerGroupsItem(ServerGroupForDescribeLoadBalancerAttributesOutput serverGroupsItem) {
    if (this.serverGroups == null) {
      this.serverGroups = new ArrayList<ServerGroupForDescribeLoadBalancerAttributesOutput>();
    }
    this.serverGroups.add(serverGroupsItem);
    return this;
  }

   /**
   * Get serverGroups
   * @return serverGroups
  **/
  @Valid
  @Schema(description = "")
  public List<ServerGroupForDescribeLoadBalancerAttributesOutput> getServerGroups() {
    return serverGroups;
  }

  public void setServerGroups(List<ServerGroupForDescribeLoadBalancerAttributesOutput> serverGroups) {
    this.serverGroups = serverGroups;
  }

  public DescribeLoadBalancerAttributesResponse slaveZoneId(String slaveZoneId) {
    this.slaveZoneId = slaveZoneId;
    return this;
  }

   /**
   * Get slaveZoneId
   * @return slaveZoneId
  **/
  @Schema(description = "")
  public String getSlaveZoneId() {
    return slaveZoneId;
  }

  public void setSlaveZoneId(String slaveZoneId) {
    this.slaveZoneId = slaveZoneId;
  }

  public DescribeLoadBalancerAttributesResponse status(String status) {
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

  public DescribeLoadBalancerAttributesResponse subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public DescribeLoadBalancerAttributesResponse tags(List<TagForDescribeLoadBalancerAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeLoadBalancerAttributesResponse addTagsItem(TagForDescribeLoadBalancerAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeLoadBalancerAttributesOutput>();
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
  public List<TagForDescribeLoadBalancerAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeLoadBalancerAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeLoadBalancerAttributesResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DescribeLoadBalancerAttributesResponse updateTime(String updateTime) {
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

  public DescribeLoadBalancerAttributesResponse vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeLoadBalancerAttributesResponse describeLoadBalancerAttributesResponse = (DescribeLoadBalancerAttributesResponse) o;
    return Objects.equals(this.accessLog, describeLoadBalancerAttributesResponse.accessLog) &&
        Objects.equals(this.addressIpVersion, describeLoadBalancerAttributesResponse.addressIpVersion) &&
        Objects.equals(this.businessStatus, describeLoadBalancerAttributesResponse.businessStatus) &&
        Objects.equals(this.createTime, describeLoadBalancerAttributesResponse.createTime) &&
        Objects.equals(this.deletedTime, describeLoadBalancerAttributesResponse.deletedTime) &&
        Objects.equals(this.description, describeLoadBalancerAttributesResponse.description) &&
        Objects.equals(this.eip, describeLoadBalancerAttributesResponse.eip) &&
        Objects.equals(this.eipAddress, describeLoadBalancerAttributesResponse.eipAddress) &&
        Objects.equals(this.eipID, describeLoadBalancerAttributesResponse.eipID) &&
        Objects.equals(this.enabled, describeLoadBalancerAttributesResponse.enabled) &&
        Objects.equals(this.eniAddress, describeLoadBalancerAttributesResponse.eniAddress) &&
        Objects.equals(this.eniID, describeLoadBalancerAttributesResponse.eniID) &&
        Objects.equals(this.eniIpv6Address, describeLoadBalancerAttributesResponse.eniIpv6Address) &&
        Objects.equals(this.expiredTime, describeLoadBalancerAttributesResponse.expiredTime) &&
        Objects.equals(this.ipv6AddressBandwidth, describeLoadBalancerAttributesResponse.ipv6AddressBandwidth) &&
        Objects.equals(this.ipv6EipId, describeLoadBalancerAttributesResponse.ipv6EipId) &&
        Objects.equals(this.listeners, describeLoadBalancerAttributesResponse.listeners) &&
        Objects.equals(this.loadBalancerBillingType, describeLoadBalancerAttributesResponse.loadBalancerBillingType) &&
        Objects.equals(this.loadBalancerId, describeLoadBalancerAttributesResponse.loadBalancerId) &&
        Objects.equals(this.loadBalancerName, describeLoadBalancerAttributesResponse.loadBalancerName) &&
        Objects.equals(this.loadBalancerSpec, describeLoadBalancerAttributesResponse.loadBalancerSpec) &&
        Objects.equals(this.lockReason, describeLoadBalancerAttributesResponse.lockReason) &&
        Objects.equals(this.logTopicId, describeLoadBalancerAttributesResponse.logTopicId) &&
        Objects.equals(this.masterZoneId, describeLoadBalancerAttributesResponse.masterZoneId) &&
        Objects.equals(this.modificationProtectionReason, describeLoadBalancerAttributesResponse.modificationProtectionReason) &&
        Objects.equals(this.modificationProtectionStatus, describeLoadBalancerAttributesResponse.modificationProtectionStatus) &&
        Objects.equals(this.overdueTime, describeLoadBalancerAttributesResponse.overdueTime) &&
        Objects.equals(this.projectName, describeLoadBalancerAttributesResponse.projectName) &&
        Objects.equals(this.requestId, describeLoadBalancerAttributesResponse.requestId) &&
        Objects.equals(this.serverGroups, describeLoadBalancerAttributesResponse.serverGroups) &&
        Objects.equals(this.slaveZoneId, describeLoadBalancerAttributesResponse.slaveZoneId) &&
        Objects.equals(this.status, describeLoadBalancerAttributesResponse.status) &&
        Objects.equals(this.subnetId, describeLoadBalancerAttributesResponse.subnetId) &&
        Objects.equals(this.tags, describeLoadBalancerAttributesResponse.tags) &&
        Objects.equals(this.type, describeLoadBalancerAttributesResponse.type) &&
        Objects.equals(this.updateTime, describeLoadBalancerAttributesResponse.updateTime) &&
        Objects.equals(this.vpcId, describeLoadBalancerAttributesResponse.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLog, addressIpVersion, businessStatus, createTime, deletedTime, description, eip, eipAddress, eipID, enabled, eniAddress, eniID, eniIpv6Address, expiredTime, ipv6AddressBandwidth, ipv6EipId, listeners, loadBalancerBillingType, loadBalancerId, loadBalancerName, loadBalancerSpec, lockReason, logTopicId, masterZoneId, modificationProtectionReason, modificationProtectionStatus, overdueTime, projectName, requestId, serverGroups, slaveZoneId, status, subnetId, tags, type, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeLoadBalancerAttributesResponse {\n");
    
    sb.append("    accessLog: ").append(toIndentedString(accessLog)).append("\n");
    sb.append("    addressIpVersion: ").append(toIndentedString(addressIpVersion)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    eipID: ").append(toIndentedString(eipID)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    eniAddress: ").append(toIndentedString(eniAddress)).append("\n");
    sb.append("    eniID: ").append(toIndentedString(eniID)).append("\n");
    sb.append("    eniIpv6Address: ").append(toIndentedString(eniIpv6Address)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    ipv6AddressBandwidth: ").append(toIndentedString(ipv6AddressBandwidth)).append("\n");
    sb.append("    ipv6EipId: ").append(toIndentedString(ipv6EipId)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    loadBalancerBillingType: ").append(toIndentedString(loadBalancerBillingType)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    loadBalancerSpec: ").append(toIndentedString(loadBalancerSpec)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
    sb.append("    masterZoneId: ").append(toIndentedString(masterZoneId)).append("\n");
    sb.append("    modificationProtectionReason: ").append(toIndentedString(modificationProtectionReason)).append("\n");
    sb.append("    modificationProtectionStatus: ").append(toIndentedString(modificationProtectionStatus)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    serverGroups: ").append(toIndentedString(serverGroups)).append("\n");
    sb.append("    slaveZoneId: ").append(toIndentedString(slaveZoneId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
