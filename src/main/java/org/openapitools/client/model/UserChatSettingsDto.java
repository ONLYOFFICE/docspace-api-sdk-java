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
import org.openapitools.client.model.ChatReasoningEffort;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The user chat settings.
 */
@JsonPropertyOrder({
  UserChatSettingsDto.JSON_PROPERTY_WEB_SEARCH_ENABLED,
  UserChatSettingsDto.JSON_PROPERTY_REASONING_EFFORT
})

public class UserChatSettingsDto {
  public static final String JSON_PROPERTY_WEB_SEARCH_ENABLED = "webSearchEnabled";
  @javax.annotation.Nullable  private Boolean webSearchEnabled;

  public static final String JSON_PROPERTY_REASONING_EFFORT = "reasoningEffort";
  @javax.annotation.Nullable  private ChatReasoningEffort reasoningEffort;

  public UserChatSettingsDto() {
  }


  public UserChatSettingsDto webSearchEnabled(@javax.annotation.Nullable Boolean webSearchEnabled) {
    
    this.webSearchEnabled = webSearchEnabled;
    return this;
  }

  /**
   * Indicates whether the AI assistant is allowed to perform web searches when generating responses in this room.
   * @return webSearchEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebSearchEnabled() {
    return webSearchEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebSearchEnabled(@javax.annotation.Nullable Boolean webSearchEnabled) {
    this.webSearchEnabled = webSearchEnabled;
  }

  public UserChatSettingsDto reasoningEffort(@javax.annotation.Nullable ChatReasoningEffort reasoningEffort) {
    
    this.reasoningEffort = reasoningEffort;
    return this;
  }

  /**
   * Get reasoningEffort
   * @return reasoningEffort
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REASONING_EFFORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChatReasoningEffort getReasoningEffort() {
    return reasoningEffort;
  }


  @JsonProperty(value = JSON_PROPERTY_REASONING_EFFORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasoningEffort(@javax.annotation.Nullable ChatReasoningEffort reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserChatSettingsDto userChatSettingsDto = (UserChatSettingsDto) o;
    return Objects.equals(this.webSearchEnabled, userChatSettingsDto.webSearchEnabled) &&
        Objects.equals(this.reasoningEffort, userChatSettingsDto.reasoningEffort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webSearchEnabled, reasoningEffort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserChatSettingsDto {\n");
    sb.append("    webSearchEnabled: ").append(toIndentedString(webSearchEnabled)).append("\n");
    sb.append("    reasoningEffort: ").append(toIndentedString(reasoningEffort)).append("\n");
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

    // add `webSearchEnabled` to the URL query string
    if (getWebSearchEnabled() != null) {
      try {
        joiner.add(String.format("%swebSearchEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebSearchEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reasoningEffort` to the URL query string
    if (getReasoningEffort() != null) {
      try {
        joiner.add(String.format("%sreasoningEffort%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReasoningEffort()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

