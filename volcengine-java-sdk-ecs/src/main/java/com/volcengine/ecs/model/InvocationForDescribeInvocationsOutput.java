/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.ParameterDefinitionForDescribeInvocationsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InvocationForDescribeInvocationsOutput
 */



public class InvocationForDescribeInvocationsOutput {
  @SerializedName("CommandContent")
  private String commandContent = null;

  @SerializedName("CommandDescription")
  private String commandDescription = null;

  @SerializedName("CommandId")
  private String commandId = null;

  @SerializedName("CommandName")
  private String commandName = null;

  @SerializedName("CommandProvider")
  private String commandProvider = null;

  @SerializedName("CommandType")
  private String commandType = null;

  @SerializedName("EnableParameter")
  private Boolean enableParameter = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("Frequency")
  private String frequency = null;

  @SerializedName("InstanceNumber")
  private Integer instanceNumber = null;

  @SerializedName("InvocationDescription")
  private String invocationDescription = null;

  @SerializedName("InvocationId")
  private String invocationId = null;

  @SerializedName("InvocationName")
  private String invocationName = null;

  @SerializedName("InvocationStatus")
  private String invocationStatus = null;

  @SerializedName("LaunchTime")
  private String launchTime = null;

  @SerializedName("ParameterDefinitions")
  private List<ParameterDefinitionForDescribeInvocationsOutput> parameterDefinitions = null;

  @SerializedName("Parameters")
  private String parameters = null;

  @SerializedName("RecurrenceEndTime")
  private String recurrenceEndTime = null;

  @SerializedName("RepeatMode")
  private String repeatMode = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("Username")
  private String username = null;

  @SerializedName("WorkingDir")
  private String workingDir = null;

  public InvocationForDescribeInvocationsOutput commandContent(String commandContent) {
    this.commandContent = commandContent;
    return this;
  }

   /**
   * Get commandContent
   * @return commandContent
  **/
  @Schema(description = "")
  public String getCommandContent() {
    return commandContent;
  }

  public void setCommandContent(String commandContent) {
    this.commandContent = commandContent;
  }

  public InvocationForDescribeInvocationsOutput commandDescription(String commandDescription) {
    this.commandDescription = commandDescription;
    return this;
  }

   /**
   * Get commandDescription
   * @return commandDescription
  **/
  @Schema(description = "")
  public String getCommandDescription() {
    return commandDescription;
  }

  public void setCommandDescription(String commandDescription) {
    this.commandDescription = commandDescription;
  }

  public InvocationForDescribeInvocationsOutput commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Get commandId
   * @return commandId
  **/
  @Schema(description = "")
  public String getCommandId() {
    return commandId;
  }

  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }

  public InvocationForDescribeInvocationsOutput commandName(String commandName) {
    this.commandName = commandName;
    return this;
  }

   /**
   * Get commandName
   * @return commandName
  **/
  @Schema(description = "")
  public String getCommandName() {
    return commandName;
  }

  public void setCommandName(String commandName) {
    this.commandName = commandName;
  }

  public InvocationForDescribeInvocationsOutput commandProvider(String commandProvider) {
    this.commandProvider = commandProvider;
    return this;
  }

   /**
   * Get commandProvider
   * @return commandProvider
  **/
  @Schema(description = "")
  public String getCommandProvider() {
    return commandProvider;
  }

  public void setCommandProvider(String commandProvider) {
    this.commandProvider = commandProvider;
  }

  public InvocationForDescribeInvocationsOutput commandType(String commandType) {
    this.commandType = commandType;
    return this;
  }

   /**
   * Get commandType
   * @return commandType
  **/
  @Schema(description = "")
  public String getCommandType() {
    return commandType;
  }

  public void setCommandType(String commandType) {
    this.commandType = commandType;
  }

  public InvocationForDescribeInvocationsOutput enableParameter(Boolean enableParameter) {
    this.enableParameter = enableParameter;
    return this;
  }

   /**
   * Get enableParameter
   * @return enableParameter
  **/
  @Schema(description = "")
  public Boolean isEnableParameter() {
    return enableParameter;
  }

  public void setEnableParameter(Boolean enableParameter) {
    this.enableParameter = enableParameter;
  }

  public InvocationForDescribeInvocationsOutput endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public InvocationForDescribeInvocationsOutput frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public InvocationForDescribeInvocationsOutput instanceNumber(Integer instanceNumber) {
    this.instanceNumber = instanceNumber;
    return this;
  }

   /**
   * Get instanceNumber
   * @return instanceNumber
  **/
  @Schema(description = "")
  public Integer getInstanceNumber() {
    return instanceNumber;
  }

  public void setInstanceNumber(Integer instanceNumber) {
    this.instanceNumber = instanceNumber;
  }

  public InvocationForDescribeInvocationsOutput invocationDescription(String invocationDescription) {
    this.invocationDescription = invocationDescription;
    return this;
  }

   /**
   * Get invocationDescription
   * @return invocationDescription
  **/
  @Schema(description = "")
  public String getInvocationDescription() {
    return invocationDescription;
  }

  public void setInvocationDescription(String invocationDescription) {
    this.invocationDescription = invocationDescription;
  }

  public InvocationForDescribeInvocationsOutput invocationId(String invocationId) {
    this.invocationId = invocationId;
    return this;
  }

   /**
   * Get invocationId
   * @return invocationId
  **/
  @Schema(description = "")
  public String getInvocationId() {
    return invocationId;
  }

  public void setInvocationId(String invocationId) {
    this.invocationId = invocationId;
  }

  public InvocationForDescribeInvocationsOutput invocationName(String invocationName) {
    this.invocationName = invocationName;
    return this;
  }

   /**
   * Get invocationName
   * @return invocationName
  **/
  @Schema(description = "")
  public String getInvocationName() {
    return invocationName;
  }

  public void setInvocationName(String invocationName) {
    this.invocationName = invocationName;
  }

  public InvocationForDescribeInvocationsOutput invocationStatus(String invocationStatus) {
    this.invocationStatus = invocationStatus;
    return this;
  }

   /**
   * Get invocationStatus
   * @return invocationStatus
  **/
  @Schema(description = "")
  public String getInvocationStatus() {
    return invocationStatus;
  }

  public void setInvocationStatus(String invocationStatus) {
    this.invocationStatus = invocationStatus;
  }

  public InvocationForDescribeInvocationsOutput launchTime(String launchTime) {
    this.launchTime = launchTime;
    return this;
  }

   /**
   * Get launchTime
   * @return launchTime
  **/
  @Schema(description = "")
  public String getLaunchTime() {
    return launchTime;
  }

  public void setLaunchTime(String launchTime) {
    this.launchTime = launchTime;
  }

  public InvocationForDescribeInvocationsOutput parameterDefinitions(List<ParameterDefinitionForDescribeInvocationsOutput> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
    return this;
  }

  public InvocationForDescribeInvocationsOutput addParameterDefinitionsItem(ParameterDefinitionForDescribeInvocationsOutput parameterDefinitionsItem) {
    if (this.parameterDefinitions == null) {
      this.parameterDefinitions = new ArrayList<ParameterDefinitionForDescribeInvocationsOutput>();
    }
    this.parameterDefinitions.add(parameterDefinitionsItem);
    return this;
  }

   /**
   * Get parameterDefinitions
   * @return parameterDefinitions
  **/
  @Valid
  @Schema(description = "")
  public List<ParameterDefinitionForDescribeInvocationsOutput> getParameterDefinitions() {
    return parameterDefinitions;
  }

  public void setParameterDefinitions(List<ParameterDefinitionForDescribeInvocationsOutput> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
  }

  public InvocationForDescribeInvocationsOutput parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Schema(description = "")
  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public InvocationForDescribeInvocationsOutput recurrenceEndTime(String recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
    return this;
  }

   /**
   * Get recurrenceEndTime
   * @return recurrenceEndTime
  **/
  @Schema(description = "")
  public String getRecurrenceEndTime() {
    return recurrenceEndTime;
  }

  public void setRecurrenceEndTime(String recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
  }

  public InvocationForDescribeInvocationsOutput repeatMode(String repeatMode) {
    this.repeatMode = repeatMode;
    return this;
  }

   /**
   * Get repeatMode
   * @return repeatMode
  **/
  @Schema(description = "")
  public String getRepeatMode() {
    return repeatMode;
  }

  public void setRepeatMode(String repeatMode) {
    this.repeatMode = repeatMode;
  }

  public InvocationForDescribeInvocationsOutput startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public InvocationForDescribeInvocationsOutput timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public InvocationForDescribeInvocationsOutput username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public InvocationForDescribeInvocationsOutput workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

   /**
   * Get workingDir
   * @return workingDir
  **/
  @Schema(description = "")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvocationForDescribeInvocationsOutput invocationForDescribeInvocationsOutput = (InvocationForDescribeInvocationsOutput) o;
    return Objects.equals(this.commandContent, invocationForDescribeInvocationsOutput.commandContent) &&
        Objects.equals(this.commandDescription, invocationForDescribeInvocationsOutput.commandDescription) &&
        Objects.equals(this.commandId, invocationForDescribeInvocationsOutput.commandId) &&
        Objects.equals(this.commandName, invocationForDescribeInvocationsOutput.commandName) &&
        Objects.equals(this.commandProvider, invocationForDescribeInvocationsOutput.commandProvider) &&
        Objects.equals(this.commandType, invocationForDescribeInvocationsOutput.commandType) &&
        Objects.equals(this.enableParameter, invocationForDescribeInvocationsOutput.enableParameter) &&
        Objects.equals(this.endTime, invocationForDescribeInvocationsOutput.endTime) &&
        Objects.equals(this.frequency, invocationForDescribeInvocationsOutput.frequency) &&
        Objects.equals(this.instanceNumber, invocationForDescribeInvocationsOutput.instanceNumber) &&
        Objects.equals(this.invocationDescription, invocationForDescribeInvocationsOutput.invocationDescription) &&
        Objects.equals(this.invocationId, invocationForDescribeInvocationsOutput.invocationId) &&
        Objects.equals(this.invocationName, invocationForDescribeInvocationsOutput.invocationName) &&
        Objects.equals(this.invocationStatus, invocationForDescribeInvocationsOutput.invocationStatus) &&
        Objects.equals(this.launchTime, invocationForDescribeInvocationsOutput.launchTime) &&
        Objects.equals(this.parameterDefinitions, invocationForDescribeInvocationsOutput.parameterDefinitions) &&
        Objects.equals(this.parameters, invocationForDescribeInvocationsOutput.parameters) &&
        Objects.equals(this.recurrenceEndTime, invocationForDescribeInvocationsOutput.recurrenceEndTime) &&
        Objects.equals(this.repeatMode, invocationForDescribeInvocationsOutput.repeatMode) &&
        Objects.equals(this.startTime, invocationForDescribeInvocationsOutput.startTime) &&
        Objects.equals(this.timeout, invocationForDescribeInvocationsOutput.timeout) &&
        Objects.equals(this.username, invocationForDescribeInvocationsOutput.username) &&
        Objects.equals(this.workingDir, invocationForDescribeInvocationsOutput.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandContent, commandDescription, commandId, commandName, commandProvider, commandType, enableParameter, endTime, frequency, instanceNumber, invocationDescription, invocationId, invocationName, invocationStatus, launchTime, parameterDefinitions, parameters, recurrenceEndTime, repeatMode, startTime, timeout, username, workingDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvocationForDescribeInvocationsOutput {\n");
    
    sb.append("    commandContent: ").append(toIndentedString(commandContent)).append("\n");
    sb.append("    commandDescription: ").append(toIndentedString(commandDescription)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
    sb.append("    commandProvider: ").append(toIndentedString(commandProvider)).append("\n");
    sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
    sb.append("    enableParameter: ").append(toIndentedString(enableParameter)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    instanceNumber: ").append(toIndentedString(instanceNumber)).append("\n");
    sb.append("    invocationDescription: ").append(toIndentedString(invocationDescription)).append("\n");
    sb.append("    invocationId: ").append(toIndentedString(invocationId)).append("\n");
    sb.append("    invocationName: ").append(toIndentedString(invocationName)).append("\n");
    sb.append("    invocationStatus: ").append(toIndentedString(invocationStatus)).append("\n");
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    parameterDefinitions: ").append(toIndentedString(parameterDefinitions)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    recurrenceEndTime: ").append(toIndentedString(recurrenceEndTime)).append("\n");
    sb.append("    repeatMode: ").append(toIndentedString(repeatMode)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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
