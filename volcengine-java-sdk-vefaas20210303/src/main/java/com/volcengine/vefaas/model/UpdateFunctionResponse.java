/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vefaas.model.EnvForUpdateFunctionOutput;
import com.volcengine.vefaas.model.NasStorageForUpdateFunctionOutput;
import com.volcengine.vefaas.model.TlsConfigForUpdateFunctionOutput;
import com.volcengine.vefaas.model.TosMountConfigForUpdateFunctionOutput;
import com.volcengine.vefaas.model.VpcConfigForUpdateFunctionOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateFunctionResponse
 */



public class UpdateFunctionResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CodeSize")
  private Integer codeSize = null;

  @SerializedName("CodeSizeLimit")
  private Integer codeSizeLimit = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DebugInstanceEnable")
  private Boolean debugInstanceEnable = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Envs")
  private List<EnvForUpdateFunctionOutput> envs = null;

  @SerializedName("ExclusiveMode")
  private Boolean exclusiveMode = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InitializerSec")
  private Integer initializerSec = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("LastUpdateTime")
  private String lastUpdateTime = null;

  @SerializedName("MaxConcurrency")
  private Integer maxConcurrency = null;

  @SerializedName("MemoryMB")
  private Integer memoryMB = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NasStorage")
  private NasStorageForUpdateFunctionOutput nasStorage = null;

  @SerializedName("Owner")
  private String owner = null;

  @SerializedName("RequestTimeout")
  private Integer requestTimeout = null;

  @SerializedName("ResourcePoolId")
  private String resourcePoolId = null;

  @SerializedName("Runtime")
  private String runtime = null;

  @SerializedName("SourceLocation")
  private String sourceLocation = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  @SerializedName("TlsConfig")
  private TlsConfigForUpdateFunctionOutput tlsConfig = null;

  @SerializedName("TosMountConfig")
  private TosMountConfigForUpdateFunctionOutput tosMountConfig = null;

  @SerializedName("TriggersCount")
  private Integer triggersCount = null;

  @SerializedName("UseStatus")
  private String useStatus = null;

  @SerializedName("VpcConfig")
  private VpcConfigForUpdateFunctionOutput vpcConfig = null;

  public UpdateFunctionResponse codeSize(Integer codeSize) {
    this.codeSize = codeSize;
    return this;
  }

   /**
   * Get codeSize
   * @return codeSize
  **/
  @Schema(description = "")
  public Integer getCodeSize() {
    return codeSize;
  }

  public void setCodeSize(Integer codeSize) {
    this.codeSize = codeSize;
  }

  public UpdateFunctionResponse codeSizeLimit(Integer codeSizeLimit) {
    this.codeSizeLimit = codeSizeLimit;
    return this;
  }

   /**
   * Get codeSizeLimit
   * @return codeSizeLimit
  **/
  @Schema(description = "")
  public Integer getCodeSizeLimit() {
    return codeSizeLimit;
  }

  public void setCodeSizeLimit(Integer codeSizeLimit) {
    this.codeSizeLimit = codeSizeLimit;
  }

  public UpdateFunctionResponse creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public UpdateFunctionResponse debugInstanceEnable(Boolean debugInstanceEnable) {
    this.debugInstanceEnable = debugInstanceEnable;
    return this;
  }

   /**
   * Get debugInstanceEnable
   * @return debugInstanceEnable
  **/
  @Schema(description = "")
  public Boolean isDebugInstanceEnable() {
    return debugInstanceEnable;
  }

  public void setDebugInstanceEnable(Boolean debugInstanceEnable) {
    this.debugInstanceEnable = debugInstanceEnable;
  }

  public UpdateFunctionResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateFunctionResponse envs(List<EnvForUpdateFunctionOutput> envs) {
    this.envs = envs;
    return this;
  }

  public UpdateFunctionResponse addEnvsItem(EnvForUpdateFunctionOutput envsItem) {
    if (this.envs == null) {
      this.envs = new ArrayList<EnvForUpdateFunctionOutput>();
    }
    this.envs.add(envsItem);
    return this;
  }

   /**
   * Get envs
   * @return envs
  **/
  @Valid
  @Schema(description = "")
  public List<EnvForUpdateFunctionOutput> getEnvs() {
    return envs;
  }

  public void setEnvs(List<EnvForUpdateFunctionOutput> envs) {
    this.envs = envs;
  }

  public UpdateFunctionResponse exclusiveMode(Boolean exclusiveMode) {
    this.exclusiveMode = exclusiveMode;
    return this;
  }

   /**
   * Get exclusiveMode
   * @return exclusiveMode
  **/
  @Schema(description = "")
  public Boolean isExclusiveMode() {
    return exclusiveMode;
  }

  public void setExclusiveMode(Boolean exclusiveMode) {
    this.exclusiveMode = exclusiveMode;
  }

  public UpdateFunctionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateFunctionResponse initializerSec(Integer initializerSec) {
    this.initializerSec = initializerSec;
    return this;
  }

   /**
   * Get initializerSec
   * @return initializerSec
  **/
  @Schema(description = "")
  public Integer getInitializerSec() {
    return initializerSec;
  }

  public void setInitializerSec(Integer initializerSec) {
    this.initializerSec = initializerSec;
  }

  public UpdateFunctionResponse instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public UpdateFunctionResponse lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Get lastUpdateTime
   * @return lastUpdateTime
  **/
  @Schema(description = "")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public UpdateFunctionResponse maxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
    return this;
  }

   /**
   * Get maxConcurrency
   * @return maxConcurrency
  **/
  @Schema(description = "")
  public Integer getMaxConcurrency() {
    return maxConcurrency;
  }

  public void setMaxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
  }

  public UpdateFunctionResponse memoryMB(Integer memoryMB) {
    this.memoryMB = memoryMB;
    return this;
  }

   /**
   * Get memoryMB
   * @return memoryMB
  **/
  @Schema(description = "")
  public Integer getMemoryMB() {
    return memoryMB;
  }

  public void setMemoryMB(Integer memoryMB) {
    this.memoryMB = memoryMB;
  }

  public UpdateFunctionResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateFunctionResponse nasStorage(NasStorageForUpdateFunctionOutput nasStorage) {
    this.nasStorage = nasStorage;
    return this;
  }

   /**
   * Get nasStorage
   * @return nasStorage
  **/
  @Valid
  @Schema(description = "")
  public NasStorageForUpdateFunctionOutput getNasStorage() {
    return nasStorage;
  }

  public void setNasStorage(NasStorageForUpdateFunctionOutput nasStorage) {
    this.nasStorage = nasStorage;
  }

  public UpdateFunctionResponse owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public UpdateFunctionResponse requestTimeout(Integer requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

   /**
   * Get requestTimeout
   * @return requestTimeout
  **/
  @Schema(description = "")
  public Integer getRequestTimeout() {
    return requestTimeout;
  }

  public void setRequestTimeout(Integer requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public UpdateFunctionResponse resourcePoolId(String resourcePoolId) {
    this.resourcePoolId = resourcePoolId;
    return this;
  }

   /**
   * Get resourcePoolId
   * @return resourcePoolId
  **/
  @Schema(description = "")
  public String getResourcePoolId() {
    return resourcePoolId;
  }

  public void setResourcePoolId(String resourcePoolId) {
    this.resourcePoolId = resourcePoolId;
  }

  public UpdateFunctionResponse runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @Schema(description = "")
  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public UpdateFunctionResponse sourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

   /**
   * Get sourceLocation
   * @return sourceLocation
  **/
  @Schema(description = "")
  public String getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  public UpdateFunctionResponse sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @Schema(description = "")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public UpdateFunctionResponse tlsConfig(TlsConfigForUpdateFunctionOutput tlsConfig) {
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @Valid
  @Schema(description = "")
  public TlsConfigForUpdateFunctionOutput getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(TlsConfigForUpdateFunctionOutput tlsConfig) {
    this.tlsConfig = tlsConfig;
  }

  public UpdateFunctionResponse tosMountConfig(TosMountConfigForUpdateFunctionOutput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
    return this;
  }

   /**
   * Get tosMountConfig
   * @return tosMountConfig
  **/
  @Valid
  @Schema(description = "")
  public TosMountConfigForUpdateFunctionOutput getTosMountConfig() {
    return tosMountConfig;
  }

  public void setTosMountConfig(TosMountConfigForUpdateFunctionOutput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
  }

  public UpdateFunctionResponse triggersCount(Integer triggersCount) {
    this.triggersCount = triggersCount;
    return this;
  }

   /**
   * Get triggersCount
   * @return triggersCount
  **/
  @Schema(description = "")
  public Integer getTriggersCount() {
    return triggersCount;
  }

  public void setTriggersCount(Integer triggersCount) {
    this.triggersCount = triggersCount;
  }

  public UpdateFunctionResponse useStatus(String useStatus) {
    this.useStatus = useStatus;
    return this;
  }

   /**
   * Get useStatus
   * @return useStatus
  **/
  @Schema(description = "")
  public String getUseStatus() {
    return useStatus;
  }

  public void setUseStatus(String useStatus) {
    this.useStatus = useStatus;
  }

  public UpdateFunctionResponse vpcConfig(VpcConfigForUpdateFunctionOutput vpcConfig) {
    this.vpcConfig = vpcConfig;
    return this;
  }

   /**
   * Get vpcConfig
   * @return vpcConfig
  **/
  @Valid
  @Schema(description = "")
  public VpcConfigForUpdateFunctionOutput getVpcConfig() {
    return vpcConfig;
  }

  public void setVpcConfig(VpcConfigForUpdateFunctionOutput vpcConfig) {
    this.vpcConfig = vpcConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFunctionResponse updateFunctionResponse = (UpdateFunctionResponse) o;
    return Objects.equals(this.codeSize, updateFunctionResponse.codeSize) &&
        Objects.equals(this.codeSizeLimit, updateFunctionResponse.codeSizeLimit) &&
        Objects.equals(this.creationTime, updateFunctionResponse.creationTime) &&
        Objects.equals(this.debugInstanceEnable, updateFunctionResponse.debugInstanceEnable) &&
        Objects.equals(this.description, updateFunctionResponse.description) &&
        Objects.equals(this.envs, updateFunctionResponse.envs) &&
        Objects.equals(this.exclusiveMode, updateFunctionResponse.exclusiveMode) &&
        Objects.equals(this.id, updateFunctionResponse.id) &&
        Objects.equals(this.initializerSec, updateFunctionResponse.initializerSec) &&
        Objects.equals(this.instanceType, updateFunctionResponse.instanceType) &&
        Objects.equals(this.lastUpdateTime, updateFunctionResponse.lastUpdateTime) &&
        Objects.equals(this.maxConcurrency, updateFunctionResponse.maxConcurrency) &&
        Objects.equals(this.memoryMB, updateFunctionResponse.memoryMB) &&
        Objects.equals(this.name, updateFunctionResponse.name) &&
        Objects.equals(this.nasStorage, updateFunctionResponse.nasStorage) &&
        Objects.equals(this.owner, updateFunctionResponse.owner) &&
        Objects.equals(this.requestTimeout, updateFunctionResponse.requestTimeout) &&
        Objects.equals(this.resourcePoolId, updateFunctionResponse.resourcePoolId) &&
        Objects.equals(this.runtime, updateFunctionResponse.runtime) &&
        Objects.equals(this.sourceLocation, updateFunctionResponse.sourceLocation) &&
        Objects.equals(this.sourceType, updateFunctionResponse.sourceType) &&
        Objects.equals(this.tlsConfig, updateFunctionResponse.tlsConfig) &&
        Objects.equals(this.tosMountConfig, updateFunctionResponse.tosMountConfig) &&
        Objects.equals(this.triggersCount, updateFunctionResponse.triggersCount) &&
        Objects.equals(this.useStatus, updateFunctionResponse.useStatus) &&
        Objects.equals(this.vpcConfig, updateFunctionResponse.vpcConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSize, codeSizeLimit, creationTime, debugInstanceEnable, description, envs, exclusiveMode, id, initializerSec, instanceType, lastUpdateTime, maxConcurrency, memoryMB, name, nasStorage, owner, requestTimeout, resourcePoolId, runtime, sourceLocation, sourceType, tlsConfig, tosMountConfig, triggersCount, useStatus, vpcConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFunctionResponse {\n");
    
    sb.append("    codeSize: ").append(toIndentedString(codeSize)).append("\n");
    sb.append("    codeSizeLimit: ").append(toIndentedString(codeSizeLimit)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    debugInstanceEnable: ").append(toIndentedString(debugInstanceEnable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    exclusiveMode: ").append(toIndentedString(exclusiveMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initializerSec: ").append(toIndentedString(initializerSec)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
    sb.append("    memoryMB: ").append(toIndentedString(memoryMB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nasStorage: ").append(toIndentedString(nasStorage)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("    tosMountConfig: ").append(toIndentedString(tosMountConfig)).append("\n");
    sb.append("    triggersCount: ").append(toIndentedString(triggersCount)).append("\n");
    sb.append("    useStatus: ").append(toIndentedString(useStatus)).append("\n");
    sb.append("    vpcConfig: ").append(toIndentedString(vpcConfig)).append("\n");
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