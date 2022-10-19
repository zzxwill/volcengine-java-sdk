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
import com.volcengine.rdsmysql.model.DataForListDBInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDBInstancesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class ListDBInstancesResponse {
  @SerializedName("Datas")
  private List<DataForListDBInstancesOutput> datas = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListDBInstancesResponse datas(List<DataForListDBInstancesOutput> datas) {
    this.datas = datas;
    return this;
  }

  public ListDBInstancesResponse addDatasItem(DataForListDBInstancesOutput datasItem) {
    if (this.datas == null) {
      this.datas = new ArrayList<DataForListDBInstancesOutput>();
    }
    this.datas.add(datasItem);
    return this;
  }

   /**
   * Get datas
   * @return datas
  **/
  @Valid
  @Schema(description = "")
  public List<DataForListDBInstancesOutput> getDatas() {
    return datas;
  }

  public void setDatas(List<DataForListDBInstancesOutput> datas) {
    this.datas = datas;
  }

  public ListDBInstancesResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDBInstancesResponse listDBInstancesResponse = (ListDBInstancesResponse) o;
    return Objects.equals(this.datas, listDBInstancesResponse.datas) &&
        Objects.equals(this.total, listDBInstancesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datas, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDBInstancesResponse {\n");
    
    sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
