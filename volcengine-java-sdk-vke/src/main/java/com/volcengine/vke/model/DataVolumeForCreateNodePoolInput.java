/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * DataVolumeForCreateNodePoolInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T10:54:23.552084+08:00[Asia/Shanghai]")
public class DataVolumeForCreateNodePoolInput {
  @SerializedName("MountPoint")
  private String mountPoint = null;

  @SerializedName("Size")
  private Integer size = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ESSD("ESSD"),
    ESSD_FLEXPL("ESSD_FlexPL"),
    ESSD_PL0("ESSD_PL0"),
    ESSD_PL1("ESSD_PL1"),
    PTSSD("PTSSD");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Type")
  private TypeEnum type = null;

  public DataVolumeForCreateNodePoolInput mountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
    return this;
  }

   /**
   * Get mountPoint
   * @return mountPoint
  **/
  @Schema(description = "")
  public String getMountPoint() {
    return mountPoint;
  }

  public void setMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
  }

  public DataVolumeForCreateNodePoolInput size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public DataVolumeForCreateNodePoolInput type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataVolumeForCreateNodePoolInput dataVolumeForCreateNodePoolInput = (DataVolumeForCreateNodePoolInput) o;
    return Objects.equals(this.mountPoint, dataVolumeForCreateNodePoolInput.mountPoint) &&
        Objects.equals(this.size, dataVolumeForCreateNodePoolInput.size) &&
        Objects.equals(this.type, dataVolumeForCreateNodePoolInput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPoint, size, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataVolumeForCreateNodePoolInput {\n");
    
    sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
