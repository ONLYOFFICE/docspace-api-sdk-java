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
import org.openapitools.client.model.AiAiActionArgs;
import org.openapitools.client.model.AiThreadMessageLike;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Shared body of the two streaming send endpoints (`sendWithStream` and its OpenAI-framed twin) — the `Chat` action is implied, so there is no `actionType`.
 */
@JsonPropertyOrder({
  AiAiSendStreamBody.JSON_PROPERTY_THREAD_ID,
  AiAiSendStreamBody.JSON_PROPERTY_USER_MESSAGE,
  AiAiSendStreamBody.JSON_PROPERTY_ACTION_ARGS,
  AiAiSendStreamBody.JSON_PROPERTY_ENTITY_ID,
  AiAiSendStreamBody.JSON_PROPERTY_PROFILE_ID
})

public class AiAiSendStreamBody {
  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nullable  private String threadId;

  public static final String JSON_PROPERTY_USER_MESSAGE = "userMessage";
  @javax.annotation.Nonnull  private AiThreadMessageLike userMessage;

  public static final String JSON_PROPERTY_ACTION_ARGS = "actionArgs";
  @javax.annotation.Nullable  private AiAiActionArgs actionArgs;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable  private String entityId;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nullable  private String profileId;

  public AiAiSendStreamBody() {
  }


  public AiAiSendStreamBody threadId(@javax.annotation.Nullable String threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * Target thread; a new one is created (with an auto title) when omitted.
   * @return threadId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_THREAD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(value = JSON_PROPERTY_THREAD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadId(@javax.annotation.Nullable String threadId) {
    this.threadId = threadId;
  }

  public AiAiSendStreamBody userMessage(@javax.annotation.Nonnull AiThreadMessageLike userMessage) {
    
    this.userMessage = userMessage;
    return this;
  }

  /**
   * The user turn to send.
   * @return userMessage
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_USER_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiThreadMessageLike getUserMessage() {
    return userMessage;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserMessage(@javax.annotation.Nonnull AiThreadMessageLike userMessage) {
    this.userMessage = userMessage;
  }

  public AiAiSendStreamBody actionArgs(@javax.annotation.Nullable AiAiActionArgs actionArgs) {
    
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

  public AiAiSendStreamBody entityId(@javax.annotation.Nullable String entityId) {
    
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

  public AiAiSendStreamBody profileId(@javax.annotation.Nullable String profileId) {
    
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
    AiAiSendStreamBody aiAiSendStreamBody = (AiAiSendStreamBody) o;
    return Objects.equals(this.threadId, aiAiSendStreamBody.threadId) &&
        Objects.equals(this.userMessage, aiAiSendStreamBody.userMessage) &&
        Objects.equals(this.actionArgs, aiAiSendStreamBody.actionArgs) &&
        Objects.equals(this.entityId, aiAiSendStreamBody.entityId) &&
        Objects.equals(this.profileId, aiAiSendStreamBody.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, userMessage, actionArgs, entityId, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAiSendStreamBody {\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
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

    // add `userMessage` to the URL query string
    if (getUserMessage() != null) {
      joiner.add(getUserMessage().toUrlQueryString(prefix + "userMessage" + suffix));
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

