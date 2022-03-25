/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.cen.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.cen.model.CenRouteEntryForDescribeCenRouteEntriesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCenRouteEntriesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:20:48.145669+08:00[Asia/Shanghai]")
public class DescribeCenRouteEntriesResponse {
  @SerializedName("CenRouteEntries")
  private List<CenRouteEntryForDescribeCenRouteEntriesOutput> cenRouteEntries = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeCenRouteEntriesResponse cenRouteEntries(List<CenRouteEntryForDescribeCenRouteEntriesOutput> cenRouteEntries) {
    this.cenRouteEntries = cenRouteEntries;
    return this;
  }

  public DescribeCenRouteEntriesResponse addCenRouteEntriesItem(CenRouteEntryForDescribeCenRouteEntriesOutput cenRouteEntriesItem) {
    if (this.cenRouteEntries == null) {
      this.cenRouteEntries = new ArrayList<CenRouteEntryForDescribeCenRouteEntriesOutput>();
    }
    this.cenRouteEntries.add(cenRouteEntriesItem);
    return this;
  }

   /**
   * Get cenRouteEntries
   * @return cenRouteEntries
  **/
  @Valid
  @Schema(description = "")
  public List<CenRouteEntryForDescribeCenRouteEntriesOutput> getCenRouteEntries() {
    return cenRouteEntries;
  }

  public void setCenRouteEntries(List<CenRouteEntryForDescribeCenRouteEntriesOutput> cenRouteEntries) {
    this.cenRouteEntries = cenRouteEntries;
  }

  public DescribeCenRouteEntriesResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeCenRouteEntriesResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeCenRouteEntriesResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCenRouteEntriesResponse describeCenRouteEntriesResponse = (DescribeCenRouteEntriesResponse) o;
    return Objects.equals(this.cenRouteEntries, describeCenRouteEntriesResponse.cenRouteEntries) &&
        Objects.equals(this.pageNumber, describeCenRouteEntriesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeCenRouteEntriesResponse.pageSize) &&
        Objects.equals(this.totalCount, describeCenRouteEntriesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenRouteEntries, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenRouteEntriesResponse {\n");
    
    sb.append("    cenRouteEntries: ").append(toIndentedString(cenRouteEntries)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
