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
import org.openapitools.client.model.AiThreadMessageLike;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Discriminated event emitted by the streaming methods of  {@link  AIEngine } . The engine never invokes user-supplied middleware or callbacks directly — every observable side-effect is encoded as a  {@link  ChatEvent }  so the same stream can be replayed over SSE, WebSocket, or in-process.  Pause point: `tool-call-pending` is the only stop. The UI must execute the tool itself (consulting `autoAllow` to decide between the silent path and the approve dialog) and resume via  {@link  AIEngine.approveToolCall }  or  {@link  AIEngine.denyToolCall } .  Other variants are pure data:  - `message-start` / `message-delta` / `message-end` — assistant   reply lifecycle. - `message-incomplete` — the provider returned an error or   incomplete status. - `thread-title` — auto-generated title ready for a new thread.
 */
@JsonPropertyOrder({
  AiChatEvent.JSON_PROPERTY_TYPE,
  AiChatEvent.JSON_PROPERTY_MESSAGE,
  AiChatEvent.JSON_PROPERTY_MESSAGE_ID,
  AiChatEvent.JSON_PROPERTY_IDX,
  AiChatEvent.JSON_PROPERTY_THREAD_ID,
  AiChatEvent.JSON_PROPERTY_AUTO_ALLOW,
  AiChatEvent.JSON_PROPERTY_SERVER_EXECUTED,
  AiChatEvent.JSON_PROPERTY_TITLE,
  AiChatEvent.JSON_PROPERTY_PROFILE_ID
})

public class AiChatEvent {
  /**
   * Emitted once per &#x60;sendWithStream&#x60; call, immediately after the user message has been persisted by storage and before the assistant stream starts. Carries the storage-assigned &#x60;id&#x60; and &#x60;createdAt&#x60;. The UI uses it to render the user bubble — no client-side optimistic placeholder is needed, which keeps the runtime tree free of phantom nodes from index-fallback ids.
   */
  public enum TypeEnum {
    USER_MESSAGE_STORED(String.valueOf("user-message-stored")),
    
    MESSAGE_START(String.valueOf("message-start")),
    
    MESSAGE_DELTA(String.valueOf("message-delta")),
    
    MESSAGE_END(String.valueOf("message-end")),
    
    MESSAGE_INCOMPLETE(String.valueOf("message-incomplete")),
    
    TOOL_CALL_PENDING(String.valueOf("tool-call-pending")),
    
    THREAD_TITLE(String.valueOf("thread-title"));

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull  private TypeEnum type;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable  private AiThreadMessageLike message;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  @javax.annotation.Nullable  private String messageId;

  public static final String JSON_PROPERTY_IDX = "idx";
  @javax.annotation.Nullable  private BigDecimal idx;

  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nullable  private String threadId;

  public static final String JSON_PROPERTY_AUTO_ALLOW = "autoAllow";
  @javax.annotation.Nullable  private Boolean autoAllow;

  public static final String JSON_PROPERTY_SERVER_EXECUTED = "serverExecuted";
  @javax.annotation.Nullable  private Boolean serverExecuted;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nullable  private String profileId;

  public AiChatEvent() {
  }


  public AiChatEvent type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * Emitted once per `sendWithStream` call, immediately after the user message has been persisted by storage and before the assistant stream starts. Carries the storage-assigned `id` and `createdAt`. The UI uses it to render the user bubble — no client-side optimistic placeholder is needed, which keeps the runtime tree free of phantom nodes from index-fallback ids.
   * @return type
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }

  public AiChatEvent message(@javax.annotation.Nullable AiThreadMessageLike message) {
    
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiThreadMessageLike getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(@javax.annotation.Nullable AiThreadMessageLike message) {
    this.message = message;
  }

  public AiChatEvent messageId(@javax.annotation.Nullable String messageId) {
    
    this.messageId = messageId;
    return this;
  }

  /**
   * Get messageId
   * @return messageId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MESSAGE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageId() {
    return messageId;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageId(@javax.annotation.Nullable String messageId) {
    this.messageId = messageId;
  }

  public AiChatEvent idx(@javax.annotation.Nullable BigDecimal idx) {
    
    this.idx = idx;
    return this;
  }

  /**
   * Get idx
   * @return idx
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IDX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdx() {
    return idx;
  }


  @JsonProperty(value = JSON_PROPERTY_IDX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdx(@javax.annotation.Nullable BigDecimal idx) {
    this.idx = idx;
  }

  public AiChatEvent threadId(@javax.annotation.Nullable String threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * Get threadId
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

  public AiChatEvent autoAllow(@javax.annotation.Nullable Boolean autoAllow) {
    
    this.autoAllow = autoAllow;
    return this;
  }

  /**
   * The consumer should execute the tool without prompting the user. True when the tool is in the persisted always-allow list, or the tool itself opts in via `TMCPItem.requireApproval === false` (host tools default to this). For a client-side tool with a server-side engine, this lets the engine return the pending call already flagged auto-allow so the client runs it and streams the result back without a dialog round-trip.
   * @return autoAllow
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AUTO_ALLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoAllow() {
    return autoAllow;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTO_ALLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoAllow(@javax.annotation.Nullable Boolean autoAllow) {
    this.autoAllow = autoAllow;
  }

  public AiChatEvent serverExecuted(@javax.annotation.Nullable Boolean serverExecuted) {
    
    this.serverExecuted = serverExecuted;
    return this;
  }

  /**
   * Set when the tool is served by a server-side system source: the consumer must NOT execute it locally — only show the approval UI (unless `autoAllow`) and resume via `approveToolCall` (no `result` needed) / `denyToolCall`. The engine runs it in-engine.
   * @return serverExecuted
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERVER_EXECUTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getServerExecuted() {
    return serverExecuted;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVER_EXECUTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerExecuted(@javax.annotation.Nullable Boolean serverExecuted) {
    this.serverExecuted = serverExecuted;
  }

  public AiChatEvent title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public AiChatEvent profileId(@javax.annotation.Nullable String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
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
    AiChatEvent aiChatEvent = (AiChatEvent) o;
    return Objects.equals(this.type, aiChatEvent.type) &&
        Objects.equals(this.message, aiChatEvent.message) &&
        Objects.equals(this.messageId, aiChatEvent.messageId) &&
        Objects.equals(this.idx, aiChatEvent.idx) &&
        Objects.equals(this.threadId, aiChatEvent.threadId) &&
        Objects.equals(this.autoAllow, aiChatEvent.autoAllow) &&
        Objects.equals(this.serverExecuted, aiChatEvent.serverExecuted) &&
        Objects.equals(this.title, aiChatEvent.title) &&
        Objects.equals(this.profileId, aiChatEvent.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message, messageId, idx, threadId, autoAllow, serverExecuted, title, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiChatEvent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    autoAllow: ").append(toIndentedString(autoAllow)).append("\n");
    sb.append("    serverExecuted: ").append(toIndentedString(serverExecuted)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(getMessage().toUrlQueryString(prefix + "message" + suffix));
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

    // add `threadId` to the URL query string
    if (getThreadId() != null) {
      try {
        joiner.add(String.format("%sthreadId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `autoAllow` to the URL query string
    if (getAutoAllow() != null) {
      try {
        joiner.add(String.format("%sautoAllow%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutoAllow()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `serverExecuted` to the URL query string
    if (getServerExecuted() != null) {
      try {
        joiner.add(String.format("%sserverExecuted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerExecuted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
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

