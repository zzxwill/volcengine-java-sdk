/*
 * mongodb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mongodb.model;

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
 * CreateDBInstanceRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:07:26.552898+08:00[Asia/Shanghai]")
public class CreateDBInstanceRequest {
  @SerializedName("AutoRenew")
  private Boolean autoRenew = null;

  /**
   * Gets or Sets chargeType
   */
  @JsonAdapter(ChargeTypeEnum.Adapter.class)
  public enum ChargeTypeEnum {
    NOTENABLED("NotEnabled"),
    POSTPAID("PostPaid"),
    PREPAID("Prepaid");

    private String value;

    ChargeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChargeTypeEnum fromValue(String input) {
      for (ChargeTypeEnum b : ChargeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChargeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ChargeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ChargeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ChargeType")
  private ChargeTypeEnum chargeType = null;

  @SerializedName("Count")
  private Integer count = null;

  /**
   * Gets or Sets dbEngine
   */
  @JsonAdapter(DbEngineEnum.Adapter.class)
  public enum DbEngineEnum {
    MONGODB("MongoDB");

    private String value;

    DbEngineEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DbEngineEnum fromValue(String input) {
      for (DbEngineEnum b : DbEngineEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DbEngineEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DbEngineEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DbEngineEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DbEngineEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DBEngine")
  private DbEngineEnum dbEngine = null;

  /**
   * Gets or Sets dbEngineVersion
   */
  @JsonAdapter(DbEngineVersionEnum.Adapter.class)
  public enum DbEngineVersionEnum {
    _4_0("MongoDB_4_0"),
    _5_0("MongoDB_5_0");

    private String value;

    DbEngineVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DbEngineVersionEnum fromValue(String input) {
      for (DbEngineVersionEnum b : DbEngineVersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DbEngineVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DbEngineVersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DbEngineVersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DbEngineVersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DBEngineVersion")
  private DbEngineVersionEnum dbEngineVersion = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  /**
   * Gets or Sets instanceType
   */
  @JsonAdapter(InstanceTypeEnum.Adapter.class)
  public enum InstanceTypeEnum {
    REPLICASET("ReplicaSet"),
    SHARDEDCLUSTER("ShardedCluster");

    private String value;

    InstanceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InstanceTypeEnum fromValue(String input) {
      for (InstanceTypeEnum b : InstanceTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InstanceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstanceTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InstanceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InstanceTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("InstanceType")
  private InstanceTypeEnum instanceType = null;

  @SerializedName("MongosNodeNumber")
  private Integer mongosNodeNumber = null;

  @SerializedName("MongosNodeSpec")
  private String mongosNodeSpec = null;

  @SerializedName("NodeNumber")
  private Integer nodeNumber = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("Period")
  private Integer period = null;

  /**
   * Gets or Sets periodUnit
   */
  @JsonAdapter(PeriodUnitEnum.Adapter.class)
  public enum PeriodUnitEnum {
    MONTH("Month"),
    YEAR("Year");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PeriodUnitEnum fromValue(String input) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PeriodUnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PeriodUnit")
  private PeriodUnitEnum periodUnit = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ShardNumber")
  private Integer shardNumber = null;

  @SerializedName("StorageSpaceGB")
  private Integer storageSpaceGB = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("SuperAccountName")
  private String superAccountName = null;

  @SerializedName("SuperAccountPassword")
  private String superAccountPassword = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public CreateDBInstanceRequest autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public CreateDBInstanceRequest chargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public ChargeTypeEnum getChargeType() {
    return chargeType;
  }

  public void setChargeType(ChargeTypeEnum chargeType) {
    this.chargeType = chargeType;
  }

  public CreateDBInstanceRequest count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CreateDBInstanceRequest dbEngine(DbEngineEnum dbEngine) {
    this.dbEngine = dbEngine;
    return this;
  }

   /**
   * Get dbEngine
   * @return dbEngine
  **/
  @Schema(description = "")
  public DbEngineEnum getDbEngine() {
    return dbEngine;
  }

  public void setDbEngine(DbEngineEnum dbEngine) {
    this.dbEngine = dbEngine;
  }

  public CreateDBInstanceRequest dbEngineVersion(DbEngineVersionEnum dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @Schema(description = "")
  public DbEngineVersionEnum getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(DbEngineVersionEnum dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public CreateDBInstanceRequest instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
 @Size(max=64)  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public CreateDBInstanceRequest instanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public InstanceTypeEnum getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
  }

  public CreateDBInstanceRequest mongosNodeNumber(Integer mongosNodeNumber) {
    this.mongosNodeNumber = mongosNodeNumber;
    return this;
  }

   /**
   * Get mongosNodeNumber
   * @return mongosNodeNumber
  **/
  @Schema(description = "")
  public Integer getMongosNodeNumber() {
    return mongosNodeNumber;
  }

  public void setMongosNodeNumber(Integer mongosNodeNumber) {
    this.mongosNodeNumber = mongosNodeNumber;
  }

  public CreateDBInstanceRequest mongosNodeSpec(String mongosNodeSpec) {
    this.mongosNodeSpec = mongosNodeSpec;
    return this;
  }

   /**
   * Get mongosNodeSpec
   * @return mongosNodeSpec
  **/
  @Schema(description = "")
  public String getMongosNodeSpec() {
    return mongosNodeSpec;
  }

  public void setMongosNodeSpec(String mongosNodeSpec) {
    this.mongosNodeSpec = mongosNodeSpec;
  }

  public CreateDBInstanceRequest nodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
    return this;
  }

   /**
   * Get nodeNumber
   * @return nodeNumber
  **/
  @Schema(description = "")
  public Integer getNodeNumber() {
    return nodeNumber;
  }

  public void setNodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
  }

  public CreateDBInstanceRequest nodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @Schema(description = "")
  public String getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public CreateDBInstanceRequest period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public CreateDBInstanceRequest periodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @Schema(description = "")
  public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }

  public CreateDBInstanceRequest projectName(String projectName) {
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

  public CreateDBInstanceRequest shardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
    return this;
  }

   /**
   * Get shardNumber
   * @return shardNumber
  **/
  @Schema(description = "")
  public Integer getShardNumber() {
    return shardNumber;
  }

  public void setShardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
  }

  public CreateDBInstanceRequest storageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
    return this;
  }

   /**
   * Get storageSpaceGB
   * @return storageSpaceGB
  **/
  @Schema(description = "")
  public Integer getStorageSpaceGB() {
    return storageSpaceGB;
  }

  public void setStorageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
  }

  public CreateDBInstanceRequest subnetId(String subnetId) {
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

  public CreateDBInstanceRequest superAccountName(String superAccountName) {
    this.superAccountName = superAccountName;
    return this;
  }

   /**
   * Get superAccountName
   * @return superAccountName
  **/
  @Schema(description = "")
  public String getSuperAccountName() {
    return superAccountName;
  }

  public void setSuperAccountName(String superAccountName) {
    this.superAccountName = superAccountName;
  }

  public CreateDBInstanceRequest superAccountPassword(String superAccountPassword) {
    this.superAccountPassword = superAccountPassword;
    return this;
  }

   /**
   * Get superAccountPassword
   * @return superAccountPassword
  **/
  @Schema(description = "")
  public String getSuperAccountPassword() {
    return superAccountPassword;
  }

  public void setSuperAccountPassword(String superAccountPassword) {
    this.superAccountPassword = superAccountPassword;
  }

  public CreateDBInstanceRequest vpcId(String vpcId) {
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

  public CreateDBInstanceRequest zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDBInstanceRequest createDBInstanceRequest = (CreateDBInstanceRequest) o;
    return Objects.equals(this.autoRenew, createDBInstanceRequest.autoRenew) &&
        Objects.equals(this.chargeType, createDBInstanceRequest.chargeType) &&
        Objects.equals(this.count, createDBInstanceRequest.count) &&
        Objects.equals(this.dbEngine, createDBInstanceRequest.dbEngine) &&
        Objects.equals(this.dbEngineVersion, createDBInstanceRequest.dbEngineVersion) &&
        Objects.equals(this.instanceName, createDBInstanceRequest.instanceName) &&
        Objects.equals(this.instanceType, createDBInstanceRequest.instanceType) &&
        Objects.equals(this.mongosNodeNumber, createDBInstanceRequest.mongosNodeNumber) &&
        Objects.equals(this.mongosNodeSpec, createDBInstanceRequest.mongosNodeSpec) &&
        Objects.equals(this.nodeNumber, createDBInstanceRequest.nodeNumber) &&
        Objects.equals(this.nodeSpec, createDBInstanceRequest.nodeSpec) &&
        Objects.equals(this.period, createDBInstanceRequest.period) &&
        Objects.equals(this.periodUnit, createDBInstanceRequest.periodUnit) &&
        Objects.equals(this.projectName, createDBInstanceRequest.projectName) &&
        Objects.equals(this.shardNumber, createDBInstanceRequest.shardNumber) &&
        Objects.equals(this.storageSpaceGB, createDBInstanceRequest.storageSpaceGB) &&
        Objects.equals(this.subnetId, createDBInstanceRequest.subnetId) &&
        Objects.equals(this.superAccountName, createDBInstanceRequest.superAccountName) &&
        Objects.equals(this.superAccountPassword, createDBInstanceRequest.superAccountPassword) &&
        Objects.equals(this.vpcId, createDBInstanceRequest.vpcId) &&
        Objects.equals(this.zoneId, createDBInstanceRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, chargeType, count, dbEngine, dbEngineVersion, instanceName, instanceType, mongosNodeNumber, mongosNodeSpec, nodeNumber, nodeSpec, period, periodUnit, projectName, shardNumber, storageSpaceGB, subnetId, superAccountName, superAccountPassword, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBInstanceRequest {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    dbEngine: ").append(toIndentedString(dbEngine)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    mongosNodeNumber: ").append(toIndentedString(mongosNodeNumber)).append("\n");
    sb.append("    mongosNodeSpec: ").append(toIndentedString(mongosNodeSpec)).append("\n");
    sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
    sb.append("    storageSpaceGB: ").append(toIndentedString(storageSpaceGB)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    superAccountName: ").append(toIndentedString(superAccountName)).append("\n");
    sb.append("    superAccountPassword: ").append(toIndentedString(superAccountPassword)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
