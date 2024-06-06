/*
 * organization
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.organization.model;

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
 * InvationInfoForDescribeAccountInvitationOutput
 */


public class InvationInfoForDescribeAccountInvitationOutput {
  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("AllowExit")
  private Integer allowExit = null;

  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("DeleteUk")
  private String deleteUk = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("LinkID")
  private String linkID = null;

  @SerializedName("MainName")
  private String mainName = null;

  @SerializedName("OrgID")
  private String orgID = null;

  @SerializedName("OrgUnitID")
  private String orgUnitID = null;

  @SerializedName("Owner")
  private String owner = null;

  @SerializedName("OwnerName")
  private String ownerName = null;

  @SerializedName("RejectReason")
  private String rejectReason = null;

  @SerializedName("ShowName")
  private String showName = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("UpdatedTime")
  private String updatedTime = null;

  public InvationInfoForDescribeAccountInvitationOutput accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public InvationInfoForDescribeAccountInvitationOutput accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public InvationInfoForDescribeAccountInvitationOutput allowExit(Integer allowExit) {
    this.allowExit = allowExit;
    return this;
  }

   /**
   * Get allowExit
   * @return allowExit
  **/
  @Schema(description = "")
  public Integer getAllowExit() {
    return allowExit;
  }

  public void setAllowExit(Integer allowExit) {
    this.allowExit = allowExit;
  }

  public InvationInfoForDescribeAccountInvitationOutput createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public InvationInfoForDescribeAccountInvitationOutput deleteUk(String deleteUk) {
    this.deleteUk = deleteUk;
    return this;
  }

   /**
   * Get deleteUk
   * @return deleteUk
  **/
  @Schema(description = "")
  public String getDeleteUk() {
    return deleteUk;
  }

  public void setDeleteUk(String deleteUk) {
    this.deleteUk = deleteUk;
  }

  public InvationInfoForDescribeAccountInvitationOutput deletedTime(String deletedTime) {
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

  public InvationInfoForDescribeAccountInvitationOutput description(String description) {
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

  public InvationInfoForDescribeAccountInvitationOutput ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public InvationInfoForDescribeAccountInvitationOutput linkID(String linkID) {
    this.linkID = linkID;
    return this;
  }

   /**
   * Get linkID
   * @return linkID
  **/
  @Schema(description = "")
  public String getLinkID() {
    return linkID;
  }

  public void setLinkID(String linkID) {
    this.linkID = linkID;
  }

  public InvationInfoForDescribeAccountInvitationOutput mainName(String mainName) {
    this.mainName = mainName;
    return this;
  }

   /**
   * Get mainName
   * @return mainName
  **/
  @Schema(description = "")
  public String getMainName() {
    return mainName;
  }

  public void setMainName(String mainName) {
    this.mainName = mainName;
  }

  public InvationInfoForDescribeAccountInvitationOutput orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * Get orgID
   * @return orgID
  **/
  @Schema(description = "")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public InvationInfoForDescribeAccountInvitationOutput orgUnitID(String orgUnitID) {
    this.orgUnitID = orgUnitID;
    return this;
  }

   /**
   * Get orgUnitID
   * @return orgUnitID
  **/
  @Schema(description = "")
  public String getOrgUnitID() {
    return orgUnitID;
  }

  public void setOrgUnitID(String orgUnitID) {
    this.orgUnitID = orgUnitID;
  }

  public InvationInfoForDescribeAccountInvitationOutput owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public InvationInfoForDescribeAccountInvitationOutput ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @Schema(description = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public InvationInfoForDescribeAccountInvitationOutput rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * Get rejectReason
   * @return rejectReason
  **/
  @Schema(description = "")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public InvationInfoForDescribeAccountInvitationOutput showName(String showName) {
    this.showName = showName;
    return this;
  }

   /**
   * Get showName
   * @return showName
  **/
  @Schema(description = "")
  public String getShowName() {
    return showName;
  }

  public void setShowName(String showName) {
    this.showName = showName;
  }

  public InvationInfoForDescribeAccountInvitationOutput status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InvationInfoForDescribeAccountInvitationOutput updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @Schema(description = "")
  public String getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvationInfoForDescribeAccountInvitationOutput invationInfoForDescribeAccountInvitationOutput = (InvationInfoForDescribeAccountInvitationOutput) o;
    return Objects.equals(this.accountID, invationInfoForDescribeAccountInvitationOutput.accountID) &&
        Objects.equals(this.accountName, invationInfoForDescribeAccountInvitationOutput.accountName) &&
        Objects.equals(this.allowExit, invationInfoForDescribeAccountInvitationOutput.allowExit) &&
        Objects.equals(this.createdTime, invationInfoForDescribeAccountInvitationOutput.createdTime) &&
        Objects.equals(this.deleteUk, invationInfoForDescribeAccountInvitationOutput.deleteUk) &&
        Objects.equals(this.deletedTime, invationInfoForDescribeAccountInvitationOutput.deletedTime) &&
        Objects.equals(this.description, invationInfoForDescribeAccountInvitationOutput.description) &&
        Objects.equals(this.ID, invationInfoForDescribeAccountInvitationOutput.ID) &&
        Objects.equals(this.linkID, invationInfoForDescribeAccountInvitationOutput.linkID) &&
        Objects.equals(this.mainName, invationInfoForDescribeAccountInvitationOutput.mainName) &&
        Objects.equals(this.orgID, invationInfoForDescribeAccountInvitationOutput.orgID) &&
        Objects.equals(this.orgUnitID, invationInfoForDescribeAccountInvitationOutput.orgUnitID) &&
        Objects.equals(this.owner, invationInfoForDescribeAccountInvitationOutput.owner) &&
        Objects.equals(this.ownerName, invationInfoForDescribeAccountInvitationOutput.ownerName) &&
        Objects.equals(this.rejectReason, invationInfoForDescribeAccountInvitationOutput.rejectReason) &&
        Objects.equals(this.showName, invationInfoForDescribeAccountInvitationOutput.showName) &&
        Objects.equals(this.status, invationInfoForDescribeAccountInvitationOutput.status) &&
        Objects.equals(this.updatedTime, invationInfoForDescribeAccountInvitationOutput.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, accountName, allowExit, createdTime, deleteUk, deletedTime, description, ID, linkID, mainName, orgID, orgUnitID, owner, ownerName, rejectReason, showName, status, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvationInfoForDescribeAccountInvitationOutput {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    allowExit: ").append(toIndentedString(allowExit)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    deleteUk: ").append(toIndentedString(deleteUk)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    linkID: ").append(toIndentedString(linkID)).append("\n");
    sb.append("    mainName: ").append(toIndentedString(mainName)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    orgUnitID: ").append(toIndentedString(orgUnitID)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    showName: ").append(toIndentedString(showName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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