/*
 * (c) Copyright Ascensio System SIA 2026
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * One audit trail action, with the kind of change it stands for and the kind of object it applies to.
 */
@JsonPropertyOrder({
  AuditTrailActionMapperDto.JSON_PROPERTY_MESSAGE_ACTION,
  AuditTrailActionMapperDto.JSON_PROPERTY_ACTION_TYPE,
  AuditTrailActionMapperDto.JSON_PROPERTY_ENTITY
})

public class AuditTrailActionMapperDto {
  public static final String JSON_PROPERTY_MESSAGE_ACTION = "messageAction";
  @javax.annotation.Nullable  private JsonNullable<String> messageAction = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @javax.annotation.Nullable  private JsonNullable<String> actionType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY = "entity";
  @javax.annotation.Nullable  private JsonNullable<String> entity = JsonNullable.<String>undefined();

  public AuditTrailActionMapperDto() {
  }


  public AuditTrailActionMapperDto messageAction(@javax.annotation.Nullable String messageAction) {
    this.messageAction = JsonNullable.<String>of(messageAction);
    
    return this;
  }

  /**
   * The action name to send as the `action` filter of `GET api/2.0/security/audit/events/filter`, and the value  that comes back as `actionId` on an event.
   * @return messageAction
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getMessageAction() {
        return messageAction.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MESSAGE_ACTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMessageAction_JsonNullable() {
    return messageAction;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE_ACTION)
  public void setMessageAction_JsonNullable(JsonNullable<String> messageAction) {
    this.messageAction = messageAction;
  }

  public void setMessageAction(@javax.annotation.Nullable String messageAction) {
    this.messageAction = JsonNullable.<String>of(messageAction);
  }

  public AuditTrailActionMapperDto actionType(@javax.annotation.Nullable String actionType) {
    this.actionType = JsonNullable.<String>of(actionType);
    
    return this;
  }

  /**
   * The kind of change the action makes, accepted by the `actionType` filter of the same operation.
   * @return actionType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getActionType() {
        return actionType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getActionType_JsonNullable() {
    return actionType;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  public void setActionType_JsonNullable(JsonNullable<String> actionType) {
    this.actionType = actionType;
  }

  public void setActionType(@javax.annotation.Nullable String actionType) {
    this.actionType = JsonNullable.<String>of(actionType);
  }

  public AuditTrailActionMapperDto entity(@javax.annotation.Nullable String entity) {
    this.entity = JsonNullable.<String>of(entity);
    
    return this;
  }

  /**
   * The kind of object the action applies to, accepted by the `entryType` filter. It is `None` for an action  that targets no object, such as a settings change, and an action with a second object type reports only the  first one here.
   * @return entity
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEntity() {
        return entity.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEntity_JsonNullable() {
    return entity;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY)
  public void setEntity_JsonNullable(JsonNullable<String> entity) {
    this.entity = entity;
  }

  public void setEntity(@javax.annotation.Nullable String entity) {
    this.entity = JsonNullable.<String>of(entity);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTrailActionMapperDto auditTrailActionMapperDto = (AuditTrailActionMapperDto) o;
    return equalsNullable(this.messageAction, auditTrailActionMapperDto.messageAction) &&
        equalsNullable(this.actionType, auditTrailActionMapperDto.actionType) &&
        equalsNullable(this.entity, auditTrailActionMapperDto.entity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(messageAction), hashCodeNullable(actionType), hashCodeNullable(entity));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailActionMapperDto {\n");
    sb.append("    messageAction: ").append(toIndentedString(messageAction)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `messageAction` to the URL query string
    if (getMessageAction() != null) {
      try {
        joiner.add(String.format("%smessageAction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageAction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `actionType` to the URL query string
    if (getActionType() != null) {
      try {
        joiner.add(String.format("%sactionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entity` to the URL query string
    if (getEntity() != null) {
      try {
        joiner.add(String.format("%sentity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

