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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiAttachmentsLinkToMessageRequest
 */
@JsonPropertyOrder({
  AiAttachmentsLinkToMessageRequest.JSON_PROPERTY_IDS,
  AiAttachmentsLinkToMessageRequest.JSON_PROPERTY_MESSAGE_ID,
  AiAttachmentsLinkToMessageRequest.JSON_PROPERTY_THREAD_ID
})
@JsonTypeName("aiAttachmentsLinkToMessage_request")

public class AiAttachmentsLinkToMessageRequest {
  public static final String JSON_PROPERTY_IDS = "ids";
  @javax.annotation.Nonnull  private List<String> ids = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  @javax.annotation.Nonnull  private String messageId;

  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nonnull  private String threadId;

  public AiAttachmentsLinkToMessageRequest() {
  }


  public AiAttachmentsLinkToMessageRequest ids(@javax.annotation.Nonnull List<String> ids) {
    
    this.ids = ids;
    return this;
  }

  public AiAttachmentsLinkToMessageRequest addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Attachment ids to bind.
   * @return ids
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_IDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getIds() {
    return ids;
  }


  @JsonProperty(value = JSON_PROPERTY_IDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(@javax.annotation.Nonnull List<String> ids) {
    this.ids = ids;
  }

  public AiAttachmentsLinkToMessageRequest messageId(@javax.annotation.Nonnull String messageId) {
    
    this.messageId = messageId;
    return this;
  }

  /**
   * Owning message id.
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

  public AiAttachmentsLinkToMessageRequest threadId(@javax.annotation.Nonnull String threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * Owning thread id.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAttachmentsLinkToMessageRequest aiAttachmentsLinkToMessageRequest = (AiAttachmentsLinkToMessageRequest) o;
    return Objects.equals(this.ids, aiAttachmentsLinkToMessageRequest.ids) &&
        Objects.equals(this.messageId, aiAttachmentsLinkToMessageRequest.messageId) &&
        Objects.equals(this.threadId, aiAttachmentsLinkToMessageRequest.threadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, messageId, threadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAttachmentsLinkToMessageRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
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

    // add `ids` to the URL query string
    if (getIds() != null) {
      for (int i = 0; i < getIds().size(); i++) {
        try {
          joiner.add(String.format("%sids%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `threadId` to the URL query string
    if (getThreadId() != null) {
      try {
        joiner.add(String.format("%sthreadId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

