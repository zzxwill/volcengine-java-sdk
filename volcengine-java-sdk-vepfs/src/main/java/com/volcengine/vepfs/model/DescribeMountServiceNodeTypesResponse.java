/*
 * vepfs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vepfs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vepfs.model.NodeTypeInfoForDescribeMountServiceNodeTypesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeMountServiceNodeTypesResponse
 */


public class DescribeMountServiceNodeTypesResponse {
  @SerializedName("NodeTypeInfos")
  private List<NodeTypeInfoForDescribeMountServiceNodeTypesOutput> nodeTypeInfos = null;

  public DescribeMountServiceNodeTypesResponse nodeTypeInfos(List<NodeTypeInfoForDescribeMountServiceNodeTypesOutput> nodeTypeInfos) {
    this.nodeTypeInfos = nodeTypeInfos;
    return this;
  }

  public DescribeMountServiceNodeTypesResponse addNodeTypeInfosItem(NodeTypeInfoForDescribeMountServiceNodeTypesOutput nodeTypeInfosItem) {
    if (this.nodeTypeInfos == null) {
      this.nodeTypeInfos = new ArrayList<NodeTypeInfoForDescribeMountServiceNodeTypesOutput>();
    }
    this.nodeTypeInfos.add(nodeTypeInfosItem);
    return this;
  }

   /**
   * Get nodeTypeInfos
   * @return nodeTypeInfos
  **/
  @Valid
  @Schema(description = "")
  public List<NodeTypeInfoForDescribeMountServiceNodeTypesOutput> getNodeTypeInfos() {
    return nodeTypeInfos;
  }

  public void setNodeTypeInfos(List<NodeTypeInfoForDescribeMountServiceNodeTypesOutput> nodeTypeInfos) {
    this.nodeTypeInfos = nodeTypeInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeMountServiceNodeTypesResponse describeMountServiceNodeTypesResponse = (DescribeMountServiceNodeTypesResponse) o;
    return Objects.equals(this.nodeTypeInfos, describeMountServiceNodeTypesResponse.nodeTypeInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeTypeInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeMountServiceNodeTypesResponse {\n");
    
    sb.append("    nodeTypeInfos: ").append(toIndentedString(nodeTypeInfos)).append("\n");
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