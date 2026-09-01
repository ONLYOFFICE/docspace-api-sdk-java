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
import org.openapitools.client.model.AiThreadMessageLike;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Resolved thread state returned by  {@link  ThreadsEngine.openOrCreate } .
 */
@JsonPropertyOrder({
  AiOpenOrCreateResult.JSON_PROPERTY_THREAD_ID,
  AiOpenOrCreateResult.JSON_PROPERTY_TITLE,
  AiOpenOrCreateResult.JSON_PROPERTY_PRIOR_MESSAGES
})

public class AiOpenOrCreateResult {
  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nonnull  private String threadId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull  private String title;

  public static final String JSON_PROPERTY_PRIOR_MESSAGES = "priorMessages";
  @javax.annotation.Nonnull  private List<AiThreadMessageLike> priorMessages = new ArrayList<>();

  public AiOpenOrCreateResult() {
  }


  public AiOpenOrCreateResult threadId(@javax.annotation.Nonnull String threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * Get threadId
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

  public AiOpenOrCreateResult title(@javax.annotation.Nonnull String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Empty string for existing threads — the engine doesn't re-fetch.
   * @return title
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }

  public AiOpenOrCreateResult priorMessages(@javax.annotation.Nonnull List<AiThreadMessageLike> priorMessages) {
    
    this.priorMessages = priorMessages;
    return this;
  }

  public AiOpenOrCreateResult addPriorMessagesItem(AiThreadMessageLike priorMessagesItem) {
    if (this.priorMessages == null) {
      this.priorMessages = new ArrayList<>();
    }
    this.priorMessages.add(priorMessagesItem);
    return this;
  }

  /**
   * Get priorMessages
   * @return priorMessages
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PRIOR_MESSAGES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiThreadMessageLike> getPriorMessages() {
    return priorMessages;
  }


  @JsonProperty(value = JSON_PROPERTY_PRIOR_MESSAGES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPriorMessages(@javax.annotation.Nonnull List<AiThreadMessageLike> priorMessages) {
    this.priorMessages = priorMessages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiOpenOrCreateResult aiOpenOrCreateResult = (AiOpenOrCreateResult) o;
    return Objects.equals(this.threadId, aiOpenOrCreateResult.threadId) &&
        Objects.equals(this.title, aiOpenOrCreateResult.title) &&
        Objects.equals(this.priorMessages, aiOpenOrCreateResult.priorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, title, priorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiOpenOrCreateResult {\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    priorMessages: ").append(toIndentedString(priorMessages)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `priorMessages` to the URL query string
    if (getPriorMessages() != null) {
      for (int i = 0; i < getPriorMessages().size(); i++) {
        if (getPriorMessages().get(i) != null) {
          joiner.add(getPriorMessages().get(i).toUrlQueryString(String.format("%spriorMessages%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

