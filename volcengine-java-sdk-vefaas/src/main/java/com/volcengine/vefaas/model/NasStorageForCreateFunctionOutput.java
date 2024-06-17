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
import com.volcengine.vefaas.model.NasConfigForCreateFunctionOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NasStorageForCreateFunctionOutput
 */



public class NasStorageForCreateFunctionOutput {
  @SerializedName("EnableNas")
  private Boolean enableNas = null;

  @SerializedName("NasConfigs")
  private List<NasConfigForCreateFunctionOutput> nasConfigs = null;

  public NasStorageForCreateFunctionOutput enableNas(Boolean enableNas) {
    this.enableNas = enableNas;
    return this;
  }

   /**
   * Get enableNas
   * @return enableNas
  **/
  @Schema(description = "")
  public Boolean isEnableNas() {
    return enableNas;
  }

  public void setEnableNas(Boolean enableNas) {
    this.enableNas = enableNas;
  }

  public NasStorageForCreateFunctionOutput nasConfigs(List<NasConfigForCreateFunctionOutput> nasConfigs) {
    this.nasConfigs = nasConfigs;
    return this;
  }

  public NasStorageForCreateFunctionOutput addNasConfigsItem(NasConfigForCreateFunctionOutput nasConfigsItem) {
    if (this.nasConfigs == null) {
      this.nasConfigs = new ArrayList<NasConfigForCreateFunctionOutput>();
    }
    this.nasConfigs.add(nasConfigsItem);
    return this;
  }

   /**
   * Get nasConfigs
   * @return nasConfigs
  **/
  @Valid
  @Schema(description = "")
  public List<NasConfigForCreateFunctionOutput> getNasConfigs() {
    return nasConfigs;
  }

  public void setNasConfigs(List<NasConfigForCreateFunctionOutput> nasConfigs) {
    this.nasConfigs = nasConfigs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NasStorageForCreateFunctionOutput nasStorageForCreateFunctionOutput = (NasStorageForCreateFunctionOutput) o;
    return Objects.equals(this.enableNas, nasStorageForCreateFunctionOutput.enableNas) &&
        Objects.equals(this.nasConfigs, nasStorageForCreateFunctionOutput.nasConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableNas, nasConfigs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NasStorageForCreateFunctionOutput {\n");
    
    sb.append("    enableNas: ").append(toIndentedString(enableNas)).append("\n");
    sb.append("    nasConfigs: ").append(toIndentedString(nasConfigs)).append("\n");
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
