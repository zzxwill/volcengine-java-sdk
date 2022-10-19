/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

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
 * DescribeRecoverableTimeResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class DescribeRecoverableTimeResponse {
  @SerializedName("EarliestRecoverableTime")
  private String earliestRecoverableTime = null;

  public DescribeRecoverableTimeResponse earliestRecoverableTime(String earliestRecoverableTime) {
    this.earliestRecoverableTime = earliestRecoverableTime;
    return this;
  }

   /**
   * Get earliestRecoverableTime
   * @return earliestRecoverableTime
  **/
  @Schema(description = "")
  public String getEarliestRecoverableTime() {
    return earliestRecoverableTime;
  }

  public void setEarliestRecoverableTime(String earliestRecoverableTime) {
    this.earliestRecoverableTime = earliestRecoverableTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRecoverableTimeResponse describeRecoverableTimeResponse = (DescribeRecoverableTimeResponse) o;
    return Objects.equals(this.earliestRecoverableTime, describeRecoverableTimeResponse.earliestRecoverableTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestRecoverableTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRecoverableTimeResponse {\n");
    
    sb.append("    earliestRecoverableTime: ").append(toIndentedString(earliestRecoverableTime)).append("\n");
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
