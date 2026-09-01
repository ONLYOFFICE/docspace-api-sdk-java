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
import org.openapitools.client.model.AiThreadMessageLike;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiThreadsUpdateMessageRequest
 */
@JsonPropertyOrder({
  AiThreadsUpdateMessageRequest.JSON_PROPERTY_MESSAGE_ID,
  AiThreadsUpdateMessageRequest.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("aiThreadsUpdateMessage_request")

public class AiThreadsUpdateMessageRequest {
  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  @javax.annotation.Nonnull  private String messageId;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nonnull  private AiThreadMessageLike message;

  public AiThreadsUpdateMessageRequest() {
  }


  public AiThreadsUpdateMessageRequest messageId(@javax.annotation.Nonnull String messageId) {
    
    this.messageId = messageId;
    return this;
  }

  /**
   * Get messageId
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

  public AiThreadsUpdateMessageRequest message(@javax.annotation.Nonnull AiThreadMessageLike message) {
    
    this.message = message;
    return this;
  }

  /**
   * Replacement message content.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiThreadsUpdateMessageRequest aiThreadsUpdateMessageRequest = (AiThreadsUpdateMessageRequest) o;
    return Objects.equals(this.messageId, aiThreadsUpdateMessageRequest.messageId) &&
        Objects.equals(this.message, aiThreadsUpdateMessageRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiThreadsUpdateMessageRequest {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

    // add `messageId` to the URL query string
    if (getMessageId() != null) {
      try {
        joiner.add(String.format("%smessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(getMessage().toUrlQueryString(prefix + "message" + suffix));
    }

    return joiner.toString();
  }

}

