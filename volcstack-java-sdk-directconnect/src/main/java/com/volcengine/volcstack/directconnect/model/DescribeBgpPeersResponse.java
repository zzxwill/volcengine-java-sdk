/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.directconnect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.directconnect.model.BgpPeerForDescribeBgpPeersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeBgpPeersResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:28.121303+08:00[Asia/Shanghai]")
public class DescribeBgpPeersResponse {
  @SerializedName("BgpPeers")
  private List<BgpPeerForDescribeBgpPeersOutput> bgpPeers = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeBgpPeersResponse bgpPeers(List<BgpPeerForDescribeBgpPeersOutput> bgpPeers) {
    this.bgpPeers = bgpPeers;
    return this;
  }

  public DescribeBgpPeersResponse addBgpPeersItem(BgpPeerForDescribeBgpPeersOutput bgpPeersItem) {
    if (this.bgpPeers == null) {
      this.bgpPeers = new ArrayList<BgpPeerForDescribeBgpPeersOutput>();
    }
    this.bgpPeers.add(bgpPeersItem);
    return this;
  }

   /**
   * Get bgpPeers
   * @return bgpPeers
  **/
  @Valid
  @Schema(description = "")
  public List<BgpPeerForDescribeBgpPeersOutput> getBgpPeers() {
    return bgpPeers;
  }

  public void setBgpPeers(List<BgpPeerForDescribeBgpPeersOutput> bgpPeers) {
    this.bgpPeers = bgpPeers;
  }

  public DescribeBgpPeersResponse pageNumber(Integer pageNumber) {
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

  public DescribeBgpPeersResponse pageSize(Integer pageSize) {
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

  public DescribeBgpPeersResponse requestId(String requestId) {
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

  public DescribeBgpPeersResponse totalCount(Integer totalCount) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBgpPeersResponse describeBgpPeersResponse = (DescribeBgpPeersResponse) o;
    return Objects.equals(this.bgpPeers, describeBgpPeersResponse.bgpPeers) &&
        Objects.equals(this.pageNumber, describeBgpPeersResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeBgpPeersResponse.pageSize) &&
        Objects.equals(this.requestId, describeBgpPeersResponse.requestId) &&
        Objects.equals(this.totalCount, describeBgpPeersResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpPeers, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBgpPeersResponse {\n");
    
    sb.append("    bgpPeers: ").append(toIndentedString(bgpPeers)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
