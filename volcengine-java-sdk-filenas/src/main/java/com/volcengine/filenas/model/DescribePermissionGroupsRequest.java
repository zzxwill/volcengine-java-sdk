/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.filenas.model.FilterForDescribePermissionGroupsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribePermissionGroupsRequest
 */



public class DescribePermissionGroupsRequest {
  /**
   * Gets or Sets fileSystemType
   */
  @JsonAdapter(FileSystemTypeEnum.Adapter.class)
  public enum FileSystemTypeEnum {
    @SerializedName("Extreme")
    EXTREME("Extreme"),
    @SerializedName("Capacity")
    CAPACITY("Capacity"),
    @SerializedName("Cache")
    CACHE("Cache");

    private String value;

    FileSystemTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FileSystemTypeEnum fromValue(String input) {
      for (FileSystemTypeEnum b : FileSystemTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FileSystemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileSystemTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FileSystemTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FileSystemTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("FileSystemType")
  private FileSystemTypeEnum fileSystemType = null;

  @SerializedName("Filters")
  private List<FilterForDescribePermissionGroupsInput> filters = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribePermissionGroupsRequest fileSystemType(FileSystemTypeEnum fileSystemType) {
    this.fileSystemType = fileSystemType;
    return this;
  }

   /**
   * Get fileSystemType
   * @return fileSystemType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public FileSystemTypeEnum getFileSystemType() {
    return fileSystemType;
  }

  public void setFileSystemType(FileSystemTypeEnum fileSystemType) {
    this.fileSystemType = fileSystemType;
  }

  public DescribePermissionGroupsRequest filters(List<FilterForDescribePermissionGroupsInput> filters) {
    this.filters = filters;
    return this;
  }

  public DescribePermissionGroupsRequest addFiltersItem(FilterForDescribePermissionGroupsInput filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<FilterForDescribePermissionGroupsInput>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Valid
  @Schema(description = "")
  public List<FilterForDescribePermissionGroupsInput> getFilters() {
    return filters;
  }

  public void setFilters(List<FilterForDescribePermissionGroupsInput> filters) {
    this.filters = filters;
  }

  public DescribePermissionGroupsRequest pageNumber(Integer pageNumber) {
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

  public DescribePermissionGroupsRequest pageSize(Integer pageSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribePermissionGroupsRequest describePermissionGroupsRequest = (DescribePermissionGroupsRequest) o;
    return Objects.equals(this.fileSystemType, describePermissionGroupsRequest.fileSystemType) &&
        Objects.equals(this.filters, describePermissionGroupsRequest.filters) &&
        Objects.equals(this.pageNumber, describePermissionGroupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describePermissionGroupsRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemType, filters, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribePermissionGroupsRequest {\n");
    
    sb.append("    fileSystemType: ").append(toIndentedString(fileSystemType)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
