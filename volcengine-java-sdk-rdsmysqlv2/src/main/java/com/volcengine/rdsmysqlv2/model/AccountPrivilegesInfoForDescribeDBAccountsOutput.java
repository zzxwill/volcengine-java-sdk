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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AccountPrivilegesInfoForDescribeDBAccountsOutput
 */


public class AccountPrivilegesInfoForDescribeDBAccountsOutput {
  @SerializedName("AccountPrivilege")
  private String accountPrivilege = null;

  @SerializedName("AccountPrivilegeCustom")
  private String accountPrivilegeCustom = null;

  @SerializedName("DBName")
  private String dbName = null;

  public AccountPrivilegesInfoForDescribeDBAccountsOutput accountPrivilege(String accountPrivilege) {
    this.accountPrivilege = accountPrivilege;
    return this;
  }

   /**
   * Get accountPrivilege
   * @return accountPrivilege
  **/
  @Schema(description = "")
  public String getAccountPrivilege() {
    return accountPrivilege;
  }

  public void setAccountPrivilege(String accountPrivilege) {
    this.accountPrivilege = accountPrivilege;
  }

  public AccountPrivilegesInfoForDescribeDBAccountsOutput accountPrivilegeCustom(String accountPrivilegeCustom) {
    this.accountPrivilegeCustom = accountPrivilegeCustom;
    return this;
  }

   /**
   * Get accountPrivilegeCustom
   * @return accountPrivilegeCustom
  **/
  @Schema(description = "")
  public String getAccountPrivilegeCustom() {
    return accountPrivilegeCustom;
  }

  public void setAccountPrivilegeCustom(String accountPrivilegeCustom) {
    this.accountPrivilegeCustom = accountPrivilegeCustom;
  }

  public AccountPrivilegesInfoForDescribeDBAccountsOutput dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @Schema(description = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPrivilegesInfoForDescribeDBAccountsOutput accountPrivilegesInfoForDescribeDBAccountsOutput = (AccountPrivilegesInfoForDescribeDBAccountsOutput) o;
    return Objects.equals(this.accountPrivilege, accountPrivilegesInfoForDescribeDBAccountsOutput.accountPrivilege) &&
        Objects.equals(this.accountPrivilegeCustom, accountPrivilegesInfoForDescribeDBAccountsOutput.accountPrivilegeCustom) &&
        Objects.equals(this.dbName, accountPrivilegesInfoForDescribeDBAccountsOutput.dbName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPrivilege, accountPrivilegeCustom, dbName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPrivilegesInfoForDescribeDBAccountsOutput {\n");
    
    sb.append("    accountPrivilege: ").append(toIndentedString(accountPrivilege)).append("\n");
    sb.append("    accountPrivilegeCustom: ").append(toIndentedString(accountPrivilegeCustom)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
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