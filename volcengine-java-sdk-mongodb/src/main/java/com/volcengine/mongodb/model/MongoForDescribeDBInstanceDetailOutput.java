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
 * MongoForDescribeDBInstanceDetailOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:21.110021+08:00[Asia/Shanghai]")
public class MongoForDescribeDBInstanceDetailOutput {
  @SerializedName("MongosNodeId")
  private String mongosNodeId = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  /**
   * Gets or Sets nodeStatus
   */
  @JsonAdapter(NodeStatusEnum.Adapter.class)
  public enum NodeStatusEnum {
    ERROR("Error"),
    RUNNING("Running");

    private String value;

    NodeStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NodeStatusEnum fromValue(String input) {
      for (NodeStatusEnum b : NodeStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NodeStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NodeStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NodeStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("NodeStatus")
  private NodeStatusEnum nodeStatus = null;

  @SerializedName("TotalMemoryGB")
  private Double totalMemoryGB = null;

  @SerializedName("TotalvCPU")
  private Double totalvCPU = null;

  @SerializedName("UsedMemoryGB")
  private Double usedMemoryGB = null;

  @SerializedName("UsedvCPU")
  private Double usedvCPU = null;

  public MongoForDescribeDBInstanceDetailOutput mongosNodeId(String mongosNodeId) {
    this.mongosNodeId = mongosNodeId;
    return this;
  }

   /**
   * Get mongosNodeId
   * @return mongosNodeId
  **/
  @Schema(description = "")
  public String getMongosNodeId() {
    return mongosNodeId;
  }

  public void setMongosNodeId(String mongosNodeId) {
    this.mongosNodeId = mongosNodeId;
  }

  public MongoForDescribeDBInstanceDetailOutput nodeSpec(String nodeSpec) {
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

  public MongoForDescribeDBInstanceDetailOutput nodeStatus(NodeStatusEnum nodeStatus) {
    this.nodeStatus = nodeStatus;
    return this;
  }

   /**
   * Get nodeStatus
   * @return nodeStatus
  **/
  @Schema(description = "")
  public NodeStatusEnum getNodeStatus() {
    return nodeStatus;
  }

  public void setNodeStatus(NodeStatusEnum nodeStatus) {
    this.nodeStatus = nodeStatus;
  }

  public MongoForDescribeDBInstanceDetailOutput totalMemoryGB(Double totalMemoryGB) {
    this.totalMemoryGB = totalMemoryGB;
    return this;
  }

   /**
   * Get totalMemoryGB
   * @return totalMemoryGB
  **/
  @Schema(description = "")
  public Double getTotalMemoryGB() {
    return totalMemoryGB;
  }

  public void setTotalMemoryGB(Double totalMemoryGB) {
    this.totalMemoryGB = totalMemoryGB;
  }

  public MongoForDescribeDBInstanceDetailOutput totalvCPU(Double totalvCPU) {
    this.totalvCPU = totalvCPU;
    return this;
  }

   /**
   * Get totalvCPU
   * @return totalvCPU
  **/
  @Schema(description = "")
  public Double getTotalvCPU() {
    return totalvCPU;
  }

  public void setTotalvCPU(Double totalvCPU) {
    this.totalvCPU = totalvCPU;
  }

  public MongoForDescribeDBInstanceDetailOutput usedMemoryGB(Double usedMemoryGB) {
    this.usedMemoryGB = usedMemoryGB;
    return this;
  }

   /**
   * Get usedMemoryGB
   * @return usedMemoryGB
  **/
  @Schema(description = "")
  public Double getUsedMemoryGB() {
    return usedMemoryGB;
  }

  public void setUsedMemoryGB(Double usedMemoryGB) {
    this.usedMemoryGB = usedMemoryGB;
  }

  public MongoForDescribeDBInstanceDetailOutput usedvCPU(Double usedvCPU) {
    this.usedvCPU = usedvCPU;
    return this;
  }

   /**
   * Get usedvCPU
   * @return usedvCPU
  **/
  @Schema(description = "")
  public Double getUsedvCPU() {
    return usedvCPU;
  }

  public void setUsedvCPU(Double usedvCPU) {
    this.usedvCPU = usedvCPU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MongoForDescribeDBInstanceDetailOutput mongoForDescribeDBInstanceDetailOutput = (MongoForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.mongosNodeId, mongoForDescribeDBInstanceDetailOutput.mongosNodeId) &&
        Objects.equals(this.nodeSpec, mongoForDescribeDBInstanceDetailOutput.nodeSpec) &&
        Objects.equals(this.nodeStatus, mongoForDescribeDBInstanceDetailOutput.nodeStatus) &&
        Objects.equals(this.totalMemoryGB, mongoForDescribeDBInstanceDetailOutput.totalMemoryGB) &&
        Objects.equals(this.totalvCPU, mongoForDescribeDBInstanceDetailOutput.totalvCPU) &&
        Objects.equals(this.usedMemoryGB, mongoForDescribeDBInstanceDetailOutput.usedMemoryGB) &&
        Objects.equals(this.usedvCPU, mongoForDescribeDBInstanceDetailOutput.usedvCPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mongosNodeId, nodeSpec, nodeStatus, totalMemoryGB, totalvCPU, usedMemoryGB, usedvCPU);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MongoForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    mongosNodeId: ").append(toIndentedString(mongosNodeId)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
    sb.append("    totalMemoryGB: ").append(toIndentedString(totalMemoryGB)).append("\n");
    sb.append("    totalvCPU: ").append(toIndentedString(totalvCPU)).append("\n");
    sb.append("    usedMemoryGB: ").append(toIndentedString(usedMemoryGB)).append("\n");
    sb.append("    usedvCPU: ").append(toIndentedString(usedvCPU)).append("\n");
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
