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
import java.math.BigDecimal;
import org.openapitools.client.model.AiAiActionArgs;
import org.openapitools.client.model.AiThreadMessageLike;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Identifies a pending tool call to resume — mirrors the library `ToolCallData` (its serializable fields).
 */
@JsonPropertyOrder({
  AiAiToolCallData.JSON_PROPERTY_THREAD_ID,
  AiAiToolCallData.JSON_PROPERTY_MESSAGE_ID,
  AiAiToolCallData.JSON_PROPERTY_IDX,
  AiAiToolCallData.JSON_PROPERTY_MESSAGE,
  AiAiToolCallData.JSON_PROPERTY_ACTION_ARGS,
  AiAiToolCallData.JSON_PROPERTY_ENTITY_ID,
  AiAiToolCallData.JSON_PROPERTY_PROFILE_ID
})

public class AiAiToolCallData {
  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nonnull  private String threadId;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  @javax.annotation.Nonnull  private String messageId;

  public static final String JSON_PROPERTY_IDX = "idx";
  @javax.annotation.Nonnull  private BigDecimal idx;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nonnull  private AiThreadMessageLike message;

  public static final String JSON_PROPERTY_ACTION_ARGS = "actionArgs";
  @javax.annotation.Nullable  private AiAiActionArgs actionArgs;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable  private String entityId;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nullable  private String profileId;

  public AiAiToolCallData() {
  }


  public AiAiToolCallData threadId(@javax.annotation.Nonnull String threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * Thread the assistant message belongs to.
   * @return threadId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_THREAD_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(value = JSON_PROPERTY_THREAD_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreadId(@javax.annotation.Nonnull String threadId) {
    this.threadId = threadId;
  }

  public AiAiToolCallData messageId(@javax.annotation.Nonnull String messageId) {
    
    this.messageId = messageId;
    return this;
  }

  /**
   * Storage id of the assistant message holding the tool call.
   * @return messageId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MESSAGE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessageId() {
    return messageId;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageId(@javax.annotation.Nonnull String messageId) {
    this.messageId = messageId;
  }

  public AiAiToolCallData idx(@javax.annotation.Nonnull BigDecimal idx) {
    
    this.idx = idx;
    return this;
  }

  /**
   * Index of the tool-call content part inside `message.content`.
   * @return idx
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_IDX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getIdx() {
    return idx;
  }


  @JsonProperty(value = JSON_PROPERTY_IDX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdx(@javax.annotation.Nonnull BigDecimal idx) {
    this.idx = idx;
  }

  public AiAiToolCallData message(@javax.annotation.Nonnull AiThreadMessageLike message) {
    
    this.message = message;
    return this;
  }

  /**
   * Snapshot of the assistant message at the time the tool call surfaced.
   * @return message
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiThreadMessageLike getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(@javax.annotation.Nonnull AiThreadMessageLike message) {
    this.message = message;
  }

  public AiAiToolCallData actionArgs(@javax.annotation.Nullable AiAiActionArgs actionArgs) {
    
    this.actionArgs = actionArgs;
    return this;
  }

  /**
   * Per-request engine options: extra tools, reasoning, prompt override.
   * @return actionArgs
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACTION_ARGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiAiActionArgs getActionArgs() {
    return actionArgs;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTION_ARGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionArgs(@javax.annotation.Nullable AiAiActionArgs actionArgs) {
    this.actionArgs = actionArgs;
  }

  public AiAiToolCallData entityId(@javax.annotation.Nullable String entityId) {
    
    this.entityId = entityId;
    return this;
  }

  /**
   * Optional entity (room) scope for profile resolution.
   * @return entityId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@javax.annotation.Nullable String entityId) {
    this.entityId = entityId;
  }

  public AiAiToolCallData profileId(@javax.annotation.Nullable String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * Session-level profile override for this request only.
   * @return profileId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileId(@javax.annotation.Nullable String profileId) {
    this.profileId = profileId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAiToolCallData aiAiToolCallData = (AiAiToolCallData) o;
    return Objects.equals(this.threadId, aiAiToolCallData.threadId) &&
        Objects.equals(this.messageId, aiAiToolCallData.messageId) &&
        Objects.equals(this.idx, aiAiToolCallData.idx) &&
        Objects.equals(this.message, aiAiToolCallData.message) &&
        Objects.equals(this.actionArgs, aiAiToolCallData.actionArgs) &&
        Objects.equals(this.entityId, aiAiToolCallData.entityId) &&
        Objects.equals(this.profileId, aiAiToolCallData.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, messageId, idx, message, actionArgs, entityId, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAiToolCallData {\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    actionArgs: ").append(toIndentedString(actionArgs)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
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

    // add `threadId` to the URL query string
    if (getThreadId() != null) {
      try {
        joiner.add(String.format("%sthreadId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `messageId` to the URL query string
    if (getMessageId() != null) {
      try {
        joiner.add(String.format("%smessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `idx` to the URL query string
    if (getIdx() != null) {
      try {
        joiner.add(String.format("%sidx%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdx()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(getMessage().toUrlQueryString(prefix + "message" + suffix));
    }

    // add `actionArgs` to the URL query string
    if (getActionArgs() != null) {
      joiner.add(getActionArgs().toUrlQueryString(prefix + "actionArgs" + suffix));
    }

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      try {
        joiner.add(String.format("%sentityId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profileId` to the URL query string
    if (getProfileId() != null) {
      try {
        joiner.add(String.format("%sprofileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

