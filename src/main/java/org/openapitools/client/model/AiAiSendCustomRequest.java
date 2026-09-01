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
 * AiAiSendCustomRequest
 */
@JsonPropertyOrder({
  AiAiSendCustomRequest.JSON_PROPERTY_IS_STREAM,
  AiAiSendCustomRequest.JSON_PROPERTY_SYSTEM_PROMPT,
  AiAiSendCustomRequest.JSON_PROPERTY_USER_MESSAGE,
  AiAiSendCustomRequest.JSON_PROPERTY_ACTION_ARGS
})
@JsonTypeName("aiAiSendCustom_request")

public class AiAiSendCustomRequest {
  public static final String JSON_PROPERTY_IS_STREAM = "isStream";
  @javax.annotation.Nonnull  private Boolean isStream;

  public static final String JSON_PROPERTY_SYSTEM_PROMPT = "systemPrompt";
  @javax.annotation.Nonnull  private String systemPrompt;

  public static final String JSON_PROPERTY_USER_MESSAGE = "userMessage";
  @javax.annotation.Nonnull  private AiThreadMessageLike userMessage;

  public static final String JSON_PROPERTY_ACTION_ARGS = "actionArgs";
  @javax.annotation.Nullable  private AiAiActionArgs actionArgs;

  public AiAiSendCustomRequest() {
  }


  public AiAiSendCustomRequest isStream(@javax.annotation.Nonnull Boolean isStream) {
    
    this.isStream = isStream;
    return this;
  }

  /**
   * Stream the reply (ndjson) when true, else return a single message.
   * @return isStream
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_IS_STREAM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsStream() {
    return isStream;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_STREAM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsStream(@javax.annotation.Nonnull Boolean isStream) {
    this.isStream = isStream;
  }

  public AiAiSendCustomRequest systemPrompt(@javax.annotation.Nonnull String systemPrompt) {
    
    this.systemPrompt = systemPrompt;
    return this;
  }

  /**
   * Caller-supplied system prompt for this one-turn call.
   * @return systemPrompt
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SYSTEM_PROMPT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSystemPrompt() {
    return systemPrompt;
  }


  @JsonProperty(value = JSON_PROPERTY_SYSTEM_PROMPT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSystemPrompt(@javax.annotation.Nonnull String systemPrompt) {
    this.systemPrompt = systemPrompt;
  }

  public AiAiSendCustomRequest userMessage(@javax.annotation.Nonnull AiThreadMessageLike userMessage) {
    
    this.userMessage = userMessage;
    return this;
  }

  /**
   * Get userMessage
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

  public AiAiSendCustomRequest actionArgs(@javax.annotation.Nullable AiAiActionArgs actionArgs) {
    
    this.actionArgs = actionArgs;
    return this;
  }

  /**
   * Get actionArgs
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAiSendCustomRequest aiAiSendCustomRequest = (AiAiSendCustomRequest) o;
    return Objects.equals(this.isStream, aiAiSendCustomRequest.isStream) &&
        Objects.equals(this.systemPrompt, aiAiSendCustomRequest.systemPrompt) &&
        Objects.equals(this.userMessage, aiAiSendCustomRequest.userMessage) &&
        Objects.equals(this.actionArgs, aiAiSendCustomRequest.actionArgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isStream, systemPrompt, userMessage, actionArgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAiSendCustomRequest {\n");
    sb.append("    isStream: ").append(toIndentedString(isStream)).append("\n");
    sb.append("    systemPrompt: ").append(toIndentedString(systemPrompt)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    actionArgs: ").append(toIndentedString(actionArgs)).append("\n");
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

    // add `isStream` to the URL query string
    if (getIsStream() != null) {
      try {
        joiner.add(String.format("%sisStream%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsStream()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `systemPrompt` to the URL query string
    if (getSystemPrompt() != null) {
      try {
        joiner.add(String.format("%ssystemPrompt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSystemPrompt()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

