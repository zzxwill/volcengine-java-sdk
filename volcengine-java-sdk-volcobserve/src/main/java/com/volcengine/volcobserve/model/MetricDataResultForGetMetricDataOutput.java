/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.DataPointForGetMetricDataOutput;
import com.volcengine.volcobserve.model.DimensionForGetMetricDataOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MetricDataResultForGetMetricDataOutput
 */


public class MetricDataResultForGetMetricDataOutput {
  @SerializedName("DataPoints")
  private List<DataPointForGetMetricDataOutput> dataPoints = null;

  @SerializedName("Dimensions")
  private List<DimensionForGetMetricDataOutput> dimensions = null;

  @SerializedName("Legend")
  private String legend = null;

  public MetricDataResultForGetMetricDataOutput dataPoints(List<DataPointForGetMetricDataOutput> dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  public MetricDataResultForGetMetricDataOutput addDataPointsItem(DataPointForGetMetricDataOutput dataPointsItem) {
    if (this.dataPoints == null) {
      this.dataPoints = new ArrayList<DataPointForGetMetricDataOutput>();
    }
    this.dataPoints.add(dataPointsItem);
    return this;
  }

   /**
   * Get dataPoints
   * @return dataPoints
  **/
  @Valid
  @Schema(description = "")
  public List<DataPointForGetMetricDataOutput> getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(List<DataPointForGetMetricDataOutput> dataPoints) {
    this.dataPoints = dataPoints;
  }

  public MetricDataResultForGetMetricDataOutput dimensions(List<DimensionForGetMetricDataOutput> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public MetricDataResultForGetMetricDataOutput addDimensionsItem(DimensionForGetMetricDataOutput dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<DimensionForGetMetricDataOutput>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @Valid
  @Schema(description = "")
  public List<DimensionForGetMetricDataOutput> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<DimensionForGetMetricDataOutput> dimensions) {
    this.dimensions = dimensions;
  }

  public MetricDataResultForGetMetricDataOutput legend(String legend) {
    this.legend = legend;
    return this;
  }

   /**
   * Get legend
   * @return legend
  **/
  @Schema(description = "")
  public String getLegend() {
    return legend;
  }

  public void setLegend(String legend) {
    this.legend = legend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricDataResultForGetMetricDataOutput metricDataResultForGetMetricDataOutput = (MetricDataResultForGetMetricDataOutput) o;
    return Objects.equals(this.dataPoints, metricDataResultForGetMetricDataOutput.dataPoints) &&
        Objects.equals(this.dimensions, metricDataResultForGetMetricDataOutput.dimensions) &&
        Objects.equals(this.legend, metricDataResultForGetMetricDataOutput.legend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPoints, dimensions, legend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricDataResultForGetMetricDataOutput {\n");
    
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
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
