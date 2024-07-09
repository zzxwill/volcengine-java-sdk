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
import com.volcengine.vefaas.model.EnvForCreateFunctionInput;
import com.volcengine.vefaas.model.NasStorageForCreateFunctionInput;
import com.volcengine.vefaas.model.SourceAccessConfigForCreateFunctionInput;
import com.volcengine.vefaas.model.TlsConfigForCreateFunctionInput;
import com.volcengine.vefaas.model.TopParamForCreateFunctionInput;
import com.volcengine.vefaas.model.TosMountConfigForCreateFunctionInput;
import com.volcengine.vefaas.model.VpcConfigForCreateFunctionInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateFunctionRequest
 */



public class CreateFunctionRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Envs")
  private List<EnvForCreateFunctionInput> envs = null;

  @SerializedName("ExclusiveMode")
  private Boolean exclusiveMode = null;

  @SerializedName("InitializerSec")
  private Integer initializerSec = null;

  @SerializedName("MaxConcurrency")
  private Integer maxConcurrency = null;

  @SerializedName("MemoryMB")
  private Integer memoryMB = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NasStorage")
  private NasStorageForCreateFunctionInput nasStorage = null;

  @SerializedName("RequestTimeout")
  private Integer requestTimeout = null;

  @SerializedName("Runtime")
  private String runtime = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("SourceAccessConfig")
  private SourceAccessConfigForCreateFunctionInput sourceAccessConfig = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  @SerializedName("TlsConfig")
  private TlsConfigForCreateFunctionInput tlsConfig = null;

  @SerializedName("TopParam")
  private TopParamForCreateFunctionInput topParam = null;

  @SerializedName("TosMountConfig")
  private TosMountConfigForCreateFunctionInput tosMountConfig = null;

  @SerializedName("VpcConfig")
  private VpcConfigForCreateFunctionInput vpcConfig = null;

  public CreateFunctionRequest description(String description) {
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

  public CreateFunctionRequest envs(List<EnvForCreateFunctionInput> envs) {
    this.envs = envs;
    return this;
  }

  public CreateFunctionRequest addEnvsItem(EnvForCreateFunctionInput envsItem) {
    if (this.envs == null) {
      this.envs = new ArrayList<EnvForCreateFunctionInput>();
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
  public List<EnvForCreateFunctionInput> getEnvs() {
    return envs;
  }

  public void setEnvs(List<EnvForCreateFunctionInput> envs) {
    this.envs = envs;
  }

  public CreateFunctionRequest exclusiveMode(Boolean exclusiveMode) {
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

  public CreateFunctionRequest initializerSec(Integer initializerSec) {
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

  public CreateFunctionRequest maxConcurrency(Integer maxConcurrency) {
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

  public CreateFunctionRequest memoryMB(Integer memoryMB) {
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

  public CreateFunctionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFunctionRequest nasStorage(NasStorageForCreateFunctionInput nasStorage) {
    this.nasStorage = nasStorage;
    return this;
  }

   /**
   * Get nasStorage
   * @return nasStorage
  **/
  @Valid
  @Schema(description = "")
  public NasStorageForCreateFunctionInput getNasStorage() {
    return nasStorage;
  }

  public void setNasStorage(NasStorageForCreateFunctionInput nasStorage) {
    this.nasStorage = nasStorage;
  }

  public CreateFunctionRequest requestTimeout(Integer requestTimeout) {
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

  public CreateFunctionRequest runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public CreateFunctionRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CreateFunctionRequest sourceAccessConfig(SourceAccessConfigForCreateFunctionInput sourceAccessConfig) {
    this.sourceAccessConfig = sourceAccessConfig;
    return this;
  }

   /**
   * Get sourceAccessConfig
   * @return sourceAccessConfig
  **/
  @Valid
  @Schema(description = "")
  public SourceAccessConfigForCreateFunctionInput getSourceAccessConfig() {
    return sourceAccessConfig;
  }

  public void setSourceAccessConfig(SourceAccessConfigForCreateFunctionInput sourceAccessConfig) {
    this.sourceAccessConfig = sourceAccessConfig;
  }

  public CreateFunctionRequest sourceType(String sourceType) {
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

  public CreateFunctionRequest tlsConfig(TlsConfigForCreateFunctionInput tlsConfig) {
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @Valid
  @Schema(description = "")
  public TlsConfigForCreateFunctionInput getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(TlsConfigForCreateFunctionInput tlsConfig) {
    this.tlsConfig = tlsConfig;
  }

  public CreateFunctionRequest topParam(TopParamForCreateFunctionInput topParam) {
    this.topParam = topParam;
    return this;
  }

   /**
   * Get topParam
   * @return topParam
  **/
  @Valid
  @Schema(description = "")
  public TopParamForCreateFunctionInput getTopParam() {
    return topParam;
  }

  public void setTopParam(TopParamForCreateFunctionInput topParam) {
    this.topParam = topParam;
  }

  public CreateFunctionRequest tosMountConfig(TosMountConfigForCreateFunctionInput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
    return this;
  }

   /**
   * Get tosMountConfig
   * @return tosMountConfig
  **/
  @Valid
  @Schema(description = "")
  public TosMountConfigForCreateFunctionInput getTosMountConfig() {
    return tosMountConfig;
  }

  public void setTosMountConfig(TosMountConfigForCreateFunctionInput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
  }

  public CreateFunctionRequest vpcConfig(VpcConfigForCreateFunctionInput vpcConfig) {
    this.vpcConfig = vpcConfig;
    return this;
  }

   /**
   * Get vpcConfig
   * @return vpcConfig
  **/
  @Valid
  @Schema(description = "")
  public VpcConfigForCreateFunctionInput getVpcConfig() {
    return vpcConfig;
  }

  public void setVpcConfig(VpcConfigForCreateFunctionInput vpcConfig) {
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
    CreateFunctionRequest createFunctionRequest = (CreateFunctionRequest) o;
    return Objects.equals(this.description, createFunctionRequest.description) &&
        Objects.equals(this.envs, createFunctionRequest.envs) &&
        Objects.equals(this.exclusiveMode, createFunctionRequest.exclusiveMode) &&
        Objects.equals(this.initializerSec, createFunctionRequest.initializerSec) &&
        Objects.equals(this.maxConcurrency, createFunctionRequest.maxConcurrency) &&
        Objects.equals(this.memoryMB, createFunctionRequest.memoryMB) &&
        Objects.equals(this.name, createFunctionRequest.name) &&
        Objects.equals(this.nasStorage, createFunctionRequest.nasStorage) &&
        Objects.equals(this.requestTimeout, createFunctionRequest.requestTimeout) &&
        Objects.equals(this.runtime, createFunctionRequest.runtime) &&
        Objects.equals(this.source, createFunctionRequest.source) &&
        Objects.equals(this.sourceAccessConfig, createFunctionRequest.sourceAccessConfig) &&
        Objects.equals(this.sourceType, createFunctionRequest.sourceType) &&
        Objects.equals(this.tlsConfig, createFunctionRequest.tlsConfig) &&
        Objects.equals(this.topParam, createFunctionRequest.topParam) &&
        Objects.equals(this.tosMountConfig, createFunctionRequest.tosMountConfig) &&
        Objects.equals(this.vpcConfig, createFunctionRequest.vpcConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, envs, exclusiveMode, initializerSec, maxConcurrency, memoryMB, name, nasStorage, requestTimeout, runtime, source, sourceAccessConfig, sourceType, tlsConfig, topParam, tosMountConfig, vpcConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFunctionRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    exclusiveMode: ").append(toIndentedString(exclusiveMode)).append("\n");
    sb.append("    initializerSec: ").append(toIndentedString(initializerSec)).append("\n");
    sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
    sb.append("    memoryMB: ").append(toIndentedString(memoryMB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nasStorage: ").append(toIndentedString(nasStorage)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceAccessConfig: ").append(toIndentedString(sourceAccessConfig)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("    topParam: ").append(toIndentedString(topParam)).append("\n");
    sb.append("    tosMountConfig: ").append(toIndentedString(tosMountConfig)).append("\n");
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