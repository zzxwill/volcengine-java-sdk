/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

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
 * TopRefererForDescribeTopRefererOutput
 */


public class TopRefererForDescribeTopRefererOutput {
  @SerializedName("Bandwidth")
  private Float bandwidth = null;

  @SerializedName("QPS")
  private Float QPS = null;

  @SerializedName("Rank")
  private Float rank = null;

  @SerializedName("Referer")
  private String referer = null;

  @SerializedName("Request")
  private Float request = null;

  @SerializedName("Traffic")
  private Float traffic = null;

  public TopRefererForDescribeTopRefererOutput bandwidth(Float bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Float getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Float bandwidth) {
    this.bandwidth = bandwidth;
  }

  public TopRefererForDescribeTopRefererOutput QPS(Float QPS) {
    this.QPS = QPS;
    return this;
  }

   /**
   * Get QPS
   * @return QPS
  **/
  @Schema(description = "")
  public Float getQPS() {
    return QPS;
  }

  public void setQPS(Float QPS) {
    this.QPS = QPS;
  }

  public TopRefererForDescribeTopRefererOutput rank(Float rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @Schema(description = "")
  public Float getRank() {
    return rank;
  }

  public void setRank(Float rank) {
    this.rank = rank;
  }

  public TopRefererForDescribeTopRefererOutput referer(String referer) {
    this.referer = referer;
    return this;
  }

   /**
   * Get referer
   * @return referer
  **/
  @Schema(description = "")
  public String getReferer() {
    return referer;
  }

  public void setReferer(String referer) {
    this.referer = referer;
  }

  public TopRefererForDescribeTopRefererOutput request(Float request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @Schema(description = "")
  public Float getRequest() {
    return request;
  }

  public void setRequest(Float request) {
    this.request = request;
  }

  public TopRefererForDescribeTopRefererOutput traffic(Float traffic) {
    this.traffic = traffic;
    return this;
  }

   /**
   * Get traffic
   * @return traffic
  **/
  @Schema(description = "")
  public Float getTraffic() {
    return traffic;
  }

  public void setTraffic(Float traffic) {
    this.traffic = traffic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopRefererForDescribeTopRefererOutput topRefererForDescribeTopRefererOutput = (TopRefererForDescribeTopRefererOutput) o;
    return Objects.equals(this.bandwidth, topRefererForDescribeTopRefererOutput.bandwidth) &&
        Objects.equals(this.QPS, topRefererForDescribeTopRefererOutput.QPS) &&
        Objects.equals(this.rank, topRefererForDescribeTopRefererOutput.rank) &&
        Objects.equals(this.referer, topRefererForDescribeTopRefererOutput.referer) &&
        Objects.equals(this.request, topRefererForDescribeTopRefererOutput.request) &&
        Objects.equals(this.traffic, topRefererForDescribeTopRefererOutput.traffic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, QPS, rank, referer, request, traffic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopRefererForDescribeTopRefererOutput {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    QPS: ").append(toIndentedString(QPS)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
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
