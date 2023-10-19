/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.DatabasePrivilegesInfoForCreateDatabaseInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDatabaseRequest
 */


public class CreateDatabaseRequest {
  @SerializedName("CharacterSetName")
  private String characterSetName = null;

  @SerializedName("DBDesc")
  private String dbDesc = null;

  @SerializedName("DBName")
  private String dbName = null;

  @SerializedName("DatabasePrivilegesInfo")
  private List<DatabasePrivilegesInfoForCreateDatabaseInput> databasePrivilegesInfo = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public CreateDatabaseRequest characterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
    return this;
  }

   /**
   * Get characterSetName
   * @return characterSetName
  **/
  @Schema(description = "")
  public String getCharacterSetName() {
    return characterSetName;
  }

  public void setCharacterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
  }

  public CreateDatabaseRequest dbDesc(String dbDesc) {
    this.dbDesc = dbDesc;
    return this;
  }

   /**
   * Get dbDesc
   * @return dbDesc
  **/
  @Schema(description = "")
  public String getDbDesc() {
    return dbDesc;
  }

  public void setDbDesc(String dbDesc) {
    this.dbDesc = dbDesc;
  }

  public CreateDatabaseRequest dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
 @Size(min=2,max=64)  @Schema(description = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public CreateDatabaseRequest databasePrivilegesInfo(List<DatabasePrivilegesInfoForCreateDatabaseInput> databasePrivilegesInfo) {
    this.databasePrivilegesInfo = databasePrivilegesInfo;
    return this;
  }

  public CreateDatabaseRequest addDatabasePrivilegesInfoItem(DatabasePrivilegesInfoForCreateDatabaseInput databasePrivilegesInfoItem) {
    if (this.databasePrivilegesInfo == null) {
      this.databasePrivilegesInfo = new ArrayList<DatabasePrivilegesInfoForCreateDatabaseInput>();
    }
    this.databasePrivilegesInfo.add(databasePrivilegesInfoItem);
    return this;
  }

   /**
   * Get databasePrivilegesInfo
   * @return databasePrivilegesInfo
  **/
  @Valid
  @Schema(description = "")
  public List<DatabasePrivilegesInfoForCreateDatabaseInput> getDatabasePrivilegesInfo() {
    return databasePrivilegesInfo;
  }

  public void setDatabasePrivilegesInfo(List<DatabasePrivilegesInfoForCreateDatabaseInput> databasePrivilegesInfo) {
    this.databasePrivilegesInfo = databasePrivilegesInfo;
  }

  public CreateDatabaseRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDatabaseRequest createDatabaseRequest = (CreateDatabaseRequest) o;
    return Objects.equals(this.characterSetName, createDatabaseRequest.characterSetName) &&
        Objects.equals(this.dbDesc, createDatabaseRequest.dbDesc) &&
        Objects.equals(this.dbName, createDatabaseRequest.dbName) &&
        Objects.equals(this.databasePrivilegesInfo, createDatabaseRequest.databasePrivilegesInfo) &&
        Objects.equals(this.instanceId, createDatabaseRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterSetName, dbDesc, dbName, databasePrivilegesInfo, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDatabaseRequest {\n");
    
    sb.append("    characterSetName: ").append(toIndentedString(characterSetName)).append("\n");
    sb.append("    dbDesc: ").append(toIndentedString(dbDesc)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    databasePrivilegesInfo: ").append(toIndentedString(databasePrivilegesInfo)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
