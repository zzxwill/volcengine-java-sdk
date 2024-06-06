/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

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
 * TaskListForCheckPurgePrefetchTaskOutput
 */


public class TaskListForCheckPurgePrefetchTaskOutput {
  @SerializedName("Account")
  private String account = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("OpTime")
  private String opTime = null;

  @SerializedName("Operator")
  private String operator = null;

  @SerializedName("Retries")
  private Integer retries = null;

  @SerializedName("TaskId")
  private String taskId = null;

  @SerializedName("TaskStatus")
  private String taskStatus = null;

  @SerializedName("TaskType")
  private String taskType = null;

  @SerializedName("Urls")
  private List<String> urls = null;

  public TaskListForCheckPurgePrefetchTaskOutput account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public TaskListForCheckPurgePrefetchTaskOutput fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public TaskListForCheckPurgePrefetchTaskOutput opTime(String opTime) {
    this.opTime = opTime;
    return this;
  }

   /**
   * Get opTime
   * @return opTime
  **/
  @Schema(description = "")
  public String getOpTime() {
    return opTime;
  }

  public void setOpTime(String opTime) {
    this.opTime = opTime;
  }

  public TaskListForCheckPurgePrefetchTaskOutput operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(description = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public TaskListForCheckPurgePrefetchTaskOutput retries(Integer retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @Schema(description = "")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public TaskListForCheckPurgePrefetchTaskOutput taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public TaskListForCheckPurgePrefetchTaskOutput taskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @Schema(description = "")
  public String getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }

  public TaskListForCheckPurgePrefetchTaskOutput taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @Schema(description = "")
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public TaskListForCheckPurgePrefetchTaskOutput urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public TaskListForCheckPurgePrefetchTaskOutput addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @Schema(description = "")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskListForCheckPurgePrefetchTaskOutput taskListForCheckPurgePrefetchTaskOutput = (TaskListForCheckPurgePrefetchTaskOutput) o;
    return Objects.equals(this.account, taskListForCheckPurgePrefetchTaskOutput.account) &&
        Objects.equals(this.fileName, taskListForCheckPurgePrefetchTaskOutput.fileName) &&
        Objects.equals(this.opTime, taskListForCheckPurgePrefetchTaskOutput.opTime) &&
        Objects.equals(this.operator, taskListForCheckPurgePrefetchTaskOutput.operator) &&
        Objects.equals(this.retries, taskListForCheckPurgePrefetchTaskOutput.retries) &&
        Objects.equals(this.taskId, taskListForCheckPurgePrefetchTaskOutput.taskId) &&
        Objects.equals(this.taskStatus, taskListForCheckPurgePrefetchTaskOutput.taskStatus) &&
        Objects.equals(this.taskType, taskListForCheckPurgePrefetchTaskOutput.taskType) &&
        Objects.equals(this.urls, taskListForCheckPurgePrefetchTaskOutput.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, fileName, opTime, operator, retries, taskId, taskStatus, taskType, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListForCheckPurgePrefetchTaskOutput {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    opTime: ").append(toIndentedString(opTime)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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