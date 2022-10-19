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
 * DataForListBackupsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class DataForListBackupsOutput {
  @SerializedName("BackupEndTime")
  private String backupEndTime = null;

  @SerializedName("BackupFileName")
  private String backupFileName = null;

  @SerializedName("BackupFileSize")
  private Long backupFileSize = null;

  @SerializedName("BackupId")
  private String backupId = null;

  /**
   * Gets or Sets backupMode
   */
  @JsonAdapter(BackupModeEnum.Adapter.class)
  public enum BackupModeEnum {
    FULL("Full"),
    INCREMENT("Increment");

    private String value;

    BackupModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BackupModeEnum fromValue(String input) {
      for (BackupModeEnum b : BackupModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BackupModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackupModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BackupModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BackupModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("BackupMode")
  private BackupModeEnum backupMode = null;

  @SerializedName("BackupStartTime")
  private String backupStartTime = null;

  /**
   * Gets or Sets backupStatus
   */
  @JsonAdapter(BackupStatusEnum.Adapter.class)
  public enum BackupStatusEnum {
    FAILED("Failed"),
    RUNNING("Running"),
    SUCCESS("Success");

    private String value;

    BackupStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BackupStatusEnum fromValue(String input) {
      for (BackupStatusEnum b : BackupStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BackupStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackupStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BackupStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BackupStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("BackupStatus")
  private BackupStatusEnum backupStatus = null;

  /**
   * Gets or Sets backupStrategy
   */
  @JsonAdapter(BackupStrategyEnum.Adapter.class)
  public enum BackupStrategyEnum {
    DATABASE("Database"),
    INSTANCE("Instance");

    private String value;

    BackupStrategyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BackupStrategyEnum fromValue(String input) {
      for (BackupStrategyEnum b : BackupStrategyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BackupStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackupStrategyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BackupStrategyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BackupStrategyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("BackupStrategy")
  private BackupStrategyEnum backupStrategy = null;

  /**
   * Gets or Sets backupType
   */
  @JsonAdapter(BackupTypeEnum.Adapter.class)
  public enum BackupTypeEnum {
    LOGICAL("Logical"),
    PHYSICAL("Physical");

    private String value;

    BackupTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BackupTypeEnum fromValue(String input) {
      for (BackupTypeEnum b : BackupTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BackupTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackupTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BackupTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BackupTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("BackupType")
  private BackupTypeEnum backupType = null;

  /**
   * Gets or Sets createType
   */
  @JsonAdapter(CreateTypeEnum.Adapter.class)
  public enum CreateTypeEnum {
    SYSTEM("System"),
    USER("User");

    private String value;

    CreateTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CreateTypeEnum fromValue(String input) {
      for (CreateTypeEnum b : CreateTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CreateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreateTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CreateTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CreateTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("CreateType")
  private CreateTypeEnum createType = null;

  public DataForListBackupsOutput backupEndTime(String backupEndTime) {
    this.backupEndTime = backupEndTime;
    return this;
  }

   /**
   * Get backupEndTime
   * @return backupEndTime
  **/
  @Schema(description = "")
  public String getBackupEndTime() {
    return backupEndTime;
  }

  public void setBackupEndTime(String backupEndTime) {
    this.backupEndTime = backupEndTime;
  }

  public DataForListBackupsOutput backupFileName(String backupFileName) {
    this.backupFileName = backupFileName;
    return this;
  }

   /**
   * Get backupFileName
   * @return backupFileName
  **/
  @Schema(description = "")
  public String getBackupFileName() {
    return backupFileName;
  }

  public void setBackupFileName(String backupFileName) {
    this.backupFileName = backupFileName;
  }

  public DataForListBackupsOutput backupFileSize(Long backupFileSize) {
    this.backupFileSize = backupFileSize;
    return this;
  }

   /**
   * Get backupFileSize
   * @return backupFileSize
  **/
  @Schema(description = "")
  public Long getBackupFileSize() {
    return backupFileSize;
  }

  public void setBackupFileSize(Long backupFileSize) {
    this.backupFileSize = backupFileSize;
  }

  public DataForListBackupsOutput backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * Get backupId
   * @return backupId
  **/
  @Schema(description = "")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public DataForListBackupsOutput backupMode(BackupModeEnum backupMode) {
    this.backupMode = backupMode;
    return this;
  }

   /**
   * Get backupMode
   * @return backupMode
  **/
  @Schema(description = "")
  public BackupModeEnum getBackupMode() {
    return backupMode;
  }

  public void setBackupMode(BackupModeEnum backupMode) {
    this.backupMode = backupMode;
  }

  public DataForListBackupsOutput backupStartTime(String backupStartTime) {
    this.backupStartTime = backupStartTime;
    return this;
  }

   /**
   * Get backupStartTime
   * @return backupStartTime
  **/
  @Schema(description = "")
  public String getBackupStartTime() {
    return backupStartTime;
  }

  public void setBackupStartTime(String backupStartTime) {
    this.backupStartTime = backupStartTime;
  }

  public DataForListBackupsOutput backupStatus(BackupStatusEnum backupStatus) {
    this.backupStatus = backupStatus;
    return this;
  }

   /**
   * Get backupStatus
   * @return backupStatus
  **/
  @Schema(description = "")
  public BackupStatusEnum getBackupStatus() {
    return backupStatus;
  }

  public void setBackupStatus(BackupStatusEnum backupStatus) {
    this.backupStatus = backupStatus;
  }

  public DataForListBackupsOutput backupStrategy(BackupStrategyEnum backupStrategy) {
    this.backupStrategy = backupStrategy;
    return this;
  }

   /**
   * Get backupStrategy
   * @return backupStrategy
  **/
  @Schema(description = "")
  public BackupStrategyEnum getBackupStrategy() {
    return backupStrategy;
  }

  public void setBackupStrategy(BackupStrategyEnum backupStrategy) {
    this.backupStrategy = backupStrategy;
  }

  public DataForListBackupsOutput backupType(BackupTypeEnum backupType) {
    this.backupType = backupType;
    return this;
  }

   /**
   * Get backupType
   * @return backupType
  **/
  @Schema(description = "")
  public BackupTypeEnum getBackupType() {
    return backupType;
  }

  public void setBackupType(BackupTypeEnum backupType) {
    this.backupType = backupType;
  }

  public DataForListBackupsOutput createType(CreateTypeEnum createType) {
    this.createType = createType;
    return this;
  }

   /**
   * Get createType
   * @return createType
  **/
  @Schema(description = "")
  public CreateTypeEnum getCreateType() {
    return createType;
  }

  public void setCreateType(CreateTypeEnum createType) {
    this.createType = createType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListBackupsOutput dataForListBackupsOutput = (DataForListBackupsOutput) o;
    return Objects.equals(this.backupEndTime, dataForListBackupsOutput.backupEndTime) &&
        Objects.equals(this.backupFileName, dataForListBackupsOutput.backupFileName) &&
        Objects.equals(this.backupFileSize, dataForListBackupsOutput.backupFileSize) &&
        Objects.equals(this.backupId, dataForListBackupsOutput.backupId) &&
        Objects.equals(this.backupMode, dataForListBackupsOutput.backupMode) &&
        Objects.equals(this.backupStartTime, dataForListBackupsOutput.backupStartTime) &&
        Objects.equals(this.backupStatus, dataForListBackupsOutput.backupStatus) &&
        Objects.equals(this.backupStrategy, dataForListBackupsOutput.backupStrategy) &&
        Objects.equals(this.backupType, dataForListBackupsOutput.backupType) &&
        Objects.equals(this.createType, dataForListBackupsOutput.createType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupEndTime, backupFileName, backupFileSize, backupId, backupMode, backupStartTime, backupStatus, backupStrategy, backupType, createType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListBackupsOutput {\n");
    
    sb.append("    backupEndTime: ").append(toIndentedString(backupEndTime)).append("\n");
    sb.append("    backupFileName: ").append(toIndentedString(backupFileName)).append("\n");
    sb.append("    backupFileSize: ").append(toIndentedString(backupFileSize)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    backupMode: ").append(toIndentedString(backupMode)).append("\n");
    sb.append("    backupStartTime: ").append(toIndentedString(backupStartTime)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
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
