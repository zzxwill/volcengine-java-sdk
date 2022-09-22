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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ServicesConfigForListClustersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-19T12:20:19.967862+08:00[Asia/Shanghai]")
public class ServicesConfigForListClustersOutput {
  @SerializedName("ServiceCidrsv4")
  private List<String> serviceCidrsv4 = null;

  public ServicesConfigForListClustersOutput serviceCidrsv4(List<String> serviceCidrsv4) {
    this.serviceCidrsv4 = serviceCidrsv4;
    return this;
  }

  public ServicesConfigForListClustersOutput addServiceCidrsv4Item(String serviceCidrsv4Item) {
    if (this.serviceCidrsv4 == null) {
      this.serviceCidrsv4 = new ArrayList<String>();
    }
    this.serviceCidrsv4.add(serviceCidrsv4Item);
    return this;
  }

   /**
   * Get serviceCidrsv4
   * @return serviceCidrsv4
  **/
  @Schema(description = "")
  public List<String> getServiceCidrsv4() {
    return serviceCidrsv4;
  }

  public void setServiceCidrsv4(List<String> serviceCidrsv4) {
    this.serviceCidrsv4 = serviceCidrsv4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesConfigForListClustersOutput servicesConfigForListClustersOutput = (ServicesConfigForListClustersOutput) o;
    return Objects.equals(this.serviceCidrsv4, servicesConfigForListClustersOutput.serviceCidrsv4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCidrsv4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesConfigForListClustersOutput {\n");
    
    sb.append("    serviceCidrsv4: ").append(toIndentedString(serviceCidrsv4)).append("\n");
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
