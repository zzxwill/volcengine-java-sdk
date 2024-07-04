/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.EffectiveTimeForUpdateEventRuleInput;
import com.volcengine.volcobserve.model.MessageQueueForUpdateEventRuleInput;
import com.volcengine.volcobserve.model.TLSTargetForUpdateEventRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateEventRuleRequest
 */



public class UpdateEventRuleRequest {
  @SerializedName("ContactGroupIds")
  private List<String> contactGroupIds = null;

  @SerializedName("ContactMethods")
  private List<String> contactMethods = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EffectiveTime")
  private EffectiveTimeForUpdateEventRuleInput effectiveTime = null;

  @SerializedName("Endpoint")
  private String endpoint = null;

  /**
   * Gets or Sets eventBusName
   */
  @JsonAdapter(EventBusNameEnum.Adapter.class)
  public enum EventBusNameEnum {
    @SerializedName("default")
    DEFAULT("default");

    private String value;

    EventBusNameEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EventBusNameEnum fromValue(String input) {
      for (EventBusNameEnum b : EventBusNameEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EventBusNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventBusNameEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EventBusNameEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EventBusNameEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("EventBusName")
  private EventBusNameEnum eventBusName = null;

  @SerializedName("EventSource")
  private String eventSource = null;

  @SerializedName("EventType")
  private List<String> eventType = null;

  @SerializedName("FilterPattern")
  private Map<String, Object> filterPattern = null;

  @SerializedName("Level")
  private String level = null;

  @SerializedName("MessageQueue")
  private List<MessageQueueForUpdateEventRuleInput> messageQueue = null;

  @SerializedName("RuleId")
  private String ruleId = null;

  @SerializedName("RuleName")
  private String ruleName = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("enable")
    ENABLE("enable"),
    @SerializedName("disable")
    DISABLE("disable");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("TLSTarget")
  private List<TLSTargetForUpdateEventRuleInput> tlSTarget = null;

  @SerializedName("WebhookIds")
  private List<String> webhookIds = null;

  public UpdateEventRuleRequest contactGroupIds(List<String> contactGroupIds) {
    this.contactGroupIds = contactGroupIds;
    return this;
  }

  public UpdateEventRuleRequest addContactGroupIdsItem(String contactGroupIdsItem) {
    if (this.contactGroupIds == null) {
      this.contactGroupIds = new ArrayList<String>();
    }
    this.contactGroupIds.add(contactGroupIdsItem);
    return this;
  }

   /**
   * Get contactGroupIds
   * @return contactGroupIds
  **/
  @Schema(description = "")
  public List<String> getContactGroupIds() {
    return contactGroupIds;
  }

  public void setContactGroupIds(List<String> contactGroupIds) {
    this.contactGroupIds = contactGroupIds;
  }

  public UpdateEventRuleRequest contactMethods(List<String> contactMethods) {
    this.contactMethods = contactMethods;
    return this;
  }

  public UpdateEventRuleRequest addContactMethodsItem(String contactMethodsItem) {
    if (this.contactMethods == null) {
      this.contactMethods = new ArrayList<String>();
    }
    this.contactMethods.add(contactMethodsItem);
    return this;
  }

   /**
   * Get contactMethods
   * @return contactMethods
  **/
  @Schema(description = "")
  public List<String> getContactMethods() {
    return contactMethods;
  }

  public void setContactMethods(List<String> contactMethods) {
    this.contactMethods = contactMethods;
  }

  public UpdateEventRuleRequest description(String description) {
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

  public UpdateEventRuleRequest effectiveTime(EffectiveTimeForUpdateEventRuleInput effectiveTime) {
    this.effectiveTime = effectiveTime;
    return this;
  }

   /**
   * Get effectiveTime
   * @return effectiveTime
  **/
  @Valid
  @Schema(description = "")
  public EffectiveTimeForUpdateEventRuleInput getEffectiveTime() {
    return effectiveTime;
  }

  public void setEffectiveTime(EffectiveTimeForUpdateEventRuleInput effectiveTime) {
    this.effectiveTime = effectiveTime;
  }

  public UpdateEventRuleRequest endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Schema(description = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public UpdateEventRuleRequest eventBusName(EventBusNameEnum eventBusName) {
    this.eventBusName = eventBusName;
    return this;
  }

   /**
   * Get eventBusName
   * @return eventBusName
  **/
  @NotNull
 @Size(min=2,max=127)  @Schema(required = true, description = "")
  public EventBusNameEnum getEventBusName() {
    return eventBusName;
  }

  public void setEventBusName(EventBusNameEnum eventBusName) {
    this.eventBusName = eventBusName;
  }

  public UpdateEventRuleRequest eventSource(String eventSource) {
    this.eventSource = eventSource;
    return this;
  }

   /**
   * Get eventSource
   * @return eventSource
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEventSource() {
    return eventSource;
  }

  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }

  public UpdateEventRuleRequest eventType(List<String> eventType) {
    this.eventType = eventType;
    return this;
  }

  public UpdateEventRuleRequest addEventTypeItem(String eventTypeItem) {
    if (this.eventType == null) {
      this.eventType = new ArrayList<String>();
    }
    this.eventType.add(eventTypeItem);
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(description = "")
  public List<String> getEventType() {
    return eventType;
  }

  public void setEventType(List<String> eventType) {
    this.eventType = eventType;
  }

  public UpdateEventRuleRequest filterPattern(Map<String, Object> filterPattern) {
    this.filterPattern = filterPattern;
    return this;
  }

  public UpdateEventRuleRequest putFilterPatternItem(String key, Object filterPatternItem) {
    if (this.filterPattern == null) {
      this.filterPattern = new HashMap<String, Object>();
    }
    this.filterPattern.put(key, filterPatternItem);
    return this;
  }

   /**
   * Get filterPattern
   * @return filterPattern
  **/
  @Schema(description = "")
  public Map<String, Object> getFilterPattern() {
    return filterPattern;
  }

  public void setFilterPattern(Map<String, Object> filterPattern) {
    this.filterPattern = filterPattern;
  }

  public UpdateEventRuleRequest level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public UpdateEventRuleRequest messageQueue(List<MessageQueueForUpdateEventRuleInput> messageQueue) {
    this.messageQueue = messageQueue;
    return this;
  }

  public UpdateEventRuleRequest addMessageQueueItem(MessageQueueForUpdateEventRuleInput messageQueueItem) {
    if (this.messageQueue == null) {
      this.messageQueue = new ArrayList<MessageQueueForUpdateEventRuleInput>();
    }
    this.messageQueue.add(messageQueueItem);
    return this;
  }

   /**
   * Get messageQueue
   * @return messageQueue
  **/
  @Valid
  @Schema(description = "")
  public List<MessageQueueForUpdateEventRuleInput> getMessageQueue() {
    return messageQueue;
  }

  public void setMessageQueue(List<MessageQueueForUpdateEventRuleInput> messageQueue) {
    this.messageQueue = messageQueue;
  }

  public UpdateEventRuleRequest ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public UpdateEventRuleRequest ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @NotNull
 @Size(min=2,max=127)  @Schema(required = true, description = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public UpdateEventRuleRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UpdateEventRuleRequest tlSTarget(List<TLSTargetForUpdateEventRuleInput> tlSTarget) {
    this.tlSTarget = tlSTarget;
    return this;
  }

  public UpdateEventRuleRequest addTlSTargetItem(TLSTargetForUpdateEventRuleInput tlSTargetItem) {
    if (this.tlSTarget == null) {
      this.tlSTarget = new ArrayList<TLSTargetForUpdateEventRuleInput>();
    }
    this.tlSTarget.add(tlSTargetItem);
    return this;
  }

   /**
   * Get tlSTarget
   * @return tlSTarget
  **/
  @Valid
  @Schema(description = "")
  public List<TLSTargetForUpdateEventRuleInput> getTlSTarget() {
    return tlSTarget;
  }

  public void setTlSTarget(List<TLSTargetForUpdateEventRuleInput> tlSTarget) {
    this.tlSTarget = tlSTarget;
  }

  public UpdateEventRuleRequest webhookIds(List<String> webhookIds) {
    this.webhookIds = webhookIds;
    return this;
  }

  public UpdateEventRuleRequest addWebhookIdsItem(String webhookIdsItem) {
    if (this.webhookIds == null) {
      this.webhookIds = new ArrayList<String>();
    }
    this.webhookIds.add(webhookIdsItem);
    return this;
  }

   /**
   * Get webhookIds
   * @return webhookIds
  **/
  @Schema(description = "")
  public List<String> getWebhookIds() {
    return webhookIds;
  }

  public void setWebhookIds(List<String> webhookIds) {
    this.webhookIds = webhookIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEventRuleRequest updateEventRuleRequest = (UpdateEventRuleRequest) o;
    return Objects.equals(this.contactGroupIds, updateEventRuleRequest.contactGroupIds) &&
        Objects.equals(this.contactMethods, updateEventRuleRequest.contactMethods) &&
        Objects.equals(this.description, updateEventRuleRequest.description) &&
        Objects.equals(this.effectiveTime, updateEventRuleRequest.effectiveTime) &&
        Objects.equals(this.endpoint, updateEventRuleRequest.endpoint) &&
        Objects.equals(this.eventBusName, updateEventRuleRequest.eventBusName) &&
        Objects.equals(this.eventSource, updateEventRuleRequest.eventSource) &&
        Objects.equals(this.eventType, updateEventRuleRequest.eventType) &&
        Objects.equals(this.filterPattern, updateEventRuleRequest.filterPattern) &&
        Objects.equals(this.level, updateEventRuleRequest.level) &&
        Objects.equals(this.messageQueue, updateEventRuleRequest.messageQueue) &&
        Objects.equals(this.ruleId, updateEventRuleRequest.ruleId) &&
        Objects.equals(this.ruleName, updateEventRuleRequest.ruleName) &&
        Objects.equals(this.status, updateEventRuleRequest.status) &&
        Objects.equals(this.tlSTarget, updateEventRuleRequest.tlSTarget) &&
        Objects.equals(this.webhookIds, updateEventRuleRequest.webhookIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactGroupIds, contactMethods, description, effectiveTime, endpoint, eventBusName, eventSource, eventType, filterPattern, level, messageQueue, ruleId, ruleName, status, tlSTarget, webhookIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEventRuleRequest {\n");
    
    sb.append("    contactGroupIds: ").append(toIndentedString(contactGroupIds)).append("\n");
    sb.append("    contactMethods: ").append(toIndentedString(contactMethods)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    filterPattern: ").append(toIndentedString(filterPattern)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    messageQueue: ").append(toIndentedString(messageQueue)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tlSTarget: ").append(toIndentedString(tlSTarget)).append("\n");
    sb.append("    webhookIds: ").append(toIndentedString(webhookIds)).append("\n");
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
