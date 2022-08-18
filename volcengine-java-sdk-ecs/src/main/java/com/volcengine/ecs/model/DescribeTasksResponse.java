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
import com.volcengine.ecs.model.TaskForDescribeTasksOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTasksResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-18T12:02:03.744330+08:00[Asia/Shanghai]")
public class DescribeTasksResponse {
  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("Tasks")
  private List<TaskForDescribeTasksOutput> tasks = null;

  public DescribeTasksResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeTasksResponse tasks(List<TaskForDescribeTasksOutput> tasks) {
    this.tasks = tasks;
    return this;
  }

  public DescribeTasksResponse addTasksItem(TaskForDescribeTasksOutput tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TaskForDescribeTasksOutput>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @Valid
  @Schema(description = "")
  public List<TaskForDescribeTasksOutput> getTasks() {
    return tasks;
  }

  public void setTasks(List<TaskForDescribeTasksOutput> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTasksResponse describeTasksResponse = (DescribeTasksResponse) o;
    return Objects.equals(this.nextToken, describeTasksResponse.nextToken) &&
        Objects.equals(this.tasks, describeTasksResponse.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, tasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTasksResponse {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
