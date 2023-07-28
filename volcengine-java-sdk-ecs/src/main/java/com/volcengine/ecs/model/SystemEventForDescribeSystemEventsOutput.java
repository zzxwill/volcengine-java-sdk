/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SystemEventForDescribeSystemEventsOutput
 */


public class SystemEventForDescribeSystemEventsOutput {
  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("ExtraInfo")
  private Map<String, String> extraInfo = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("OperatedEndAt")
  private String operatedEndAt = null;

  @SerializedName("OperatedStartAt")
  private String operatedStartAt = null;

  @SerializedName("ResourceId")
  private String resourceId = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWNSTATUS("UnknownStatus"),
    EXECUTING("Executing"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed"),
    INQUIRING("Inquiring"),
    SCHEDULED("Scheduled"),
    REJECTED("Rejected"),
    CANCELED("Canceled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Status")
  private StatusEnum status = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWNTYPE("UnknownType"),
    SYSTEMFAILURE_STOP("SystemFailure_Stop"),
    SYSTEMFAILURE_REBOOT("SystemFailure_Reboot"),
    SYSTEMFAILURE_PLEASECHECK("SystemFailure_PleaseCheck"),
    DISKERROR_REDEPLOY("DiskError_Redeploy"),
    HDDBADSECTOR_REDEPLOY("HDDBadSector_Redeploy"),
    GPUERROR_REDEPLOY("GpuError_Redeploy"),
    SYSTEMMAINTENANCE_REDEPLOY("SystemMaintenance_Redeploy"),
    SYSTEMFAILURE_REDEPLOY("SystemFailure_Redeploy"),
    CREATEINSTANCE("CreateInstance"),
    RUNINSTANCE("RunInstance"),
    STOPINSTANCE("StopInstance"),
    DELETEINSTANCE("DeleteInstance"),
    SPOTINSTANCEINTERRUPTION_DELETE("SpotInstanceInterruption_Delete"),
    ACCOUNTUNBALANCED_STOP("AccountUnbalanced_Stop"),
    ACCOUNTUNBALANCED_DELETE("AccountUnbalanced_Delete"),
    INSTANCECHARGETYPE_CHANGE("InstanceChargeType_Change"),
    INSTANCECONFIGURATION_CHANGE("InstanceConfiguration_Change"),
    FILESYSTEMREADONLY_CHANGE("FileSystemReadOnly_Change"),
    REBOOTINSTANCE("RebootInstance"),
    INSTANCEFAILURE("InstanceFailure"),
    APPLICATIONFAILURE("ApplicationFailure"),
    GPURISKDETECTED("GpuRiskDetected");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Type")
  private TypeEnum type = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public SystemEventForDescribeSystemEventsOutput createdAt(String createdAt) {
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

  public SystemEventForDescribeSystemEventsOutput extraInfo(Map<String, String> extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

  public SystemEventForDescribeSystemEventsOutput putExtraInfoItem(String key, String extraInfoItem) {
    if (this.extraInfo == null) {
      this.extraInfo = new HashMap<String, String>();
    }
    this.extraInfo.put(key, extraInfoItem);
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  @Schema(description = "")
  public Map<String, String> getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(Map<String, String> extraInfo) {
    this.extraInfo = extraInfo;
  }

  public SystemEventForDescribeSystemEventsOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SystemEventForDescribeSystemEventsOutput operatedEndAt(String operatedEndAt) {
    this.operatedEndAt = operatedEndAt;
    return this;
  }

   /**
   * Get operatedEndAt
   * @return operatedEndAt
  **/
  @Schema(description = "")
  public String getOperatedEndAt() {
    return operatedEndAt;
  }

  public void setOperatedEndAt(String operatedEndAt) {
    this.operatedEndAt = operatedEndAt;
  }

  public SystemEventForDescribeSystemEventsOutput operatedStartAt(String operatedStartAt) {
    this.operatedStartAt = operatedStartAt;
    return this;
  }

   /**
   * Get operatedStartAt
   * @return operatedStartAt
  **/
  @Schema(description = "")
  public String getOperatedStartAt() {
    return operatedStartAt;
  }

  public void setOperatedStartAt(String operatedStartAt) {
    this.operatedStartAt = operatedStartAt;
  }

  public SystemEventForDescribeSystemEventsOutput resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @Schema(description = "")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public SystemEventForDescribeSystemEventsOutput status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SystemEventForDescribeSystemEventsOutput type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SystemEventForDescribeSystemEventsOutput updatedAt(String updatedAt) {
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
    SystemEventForDescribeSystemEventsOutput systemEventForDescribeSystemEventsOutput = (SystemEventForDescribeSystemEventsOutput) o;
    return Objects.equals(this.createdAt, systemEventForDescribeSystemEventsOutput.createdAt) &&
        Objects.equals(this.extraInfo, systemEventForDescribeSystemEventsOutput.extraInfo) &&
        Objects.equals(this.id, systemEventForDescribeSystemEventsOutput.id) &&
        Objects.equals(this.operatedEndAt, systemEventForDescribeSystemEventsOutput.operatedEndAt) &&
        Objects.equals(this.operatedStartAt, systemEventForDescribeSystemEventsOutput.operatedStartAt) &&
        Objects.equals(this.resourceId, systemEventForDescribeSystemEventsOutput.resourceId) &&
        Objects.equals(this.status, systemEventForDescribeSystemEventsOutput.status) &&
        Objects.equals(this.type, systemEventForDescribeSystemEventsOutput.type) &&
        Objects.equals(this.updatedAt, systemEventForDescribeSystemEventsOutput.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, extraInfo, id, operatedEndAt, operatedStartAt, resourceId, status, type, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemEventForDescribeSystemEventsOutput {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operatedEndAt: ").append(toIndentedString(operatedEndAt)).append("\n");
    sb.append("    operatedStartAt: ").append(toIndentedString(operatedStartAt)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
