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
import org.openapitools.client.model.AiModel;
import org.openapitools.client.model.AiTProvider;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Chat conversation metadata. Represents a single chat session (thread).
 */
@JsonPropertyOrder({
  AiThread.JSON_PROPERTY_THREAD_ID,
  AiThread.JSON_PROPERTY_TITLE,
  AiThread.JSON_PROPERTY_LAST_EDIT_DATE,
  AiThread.JSON_PROPERTY_PROVIDER,
  AiThread.JSON_PROPERTY_MODEL,
  AiThread.JSON_PROPERTY_PROFILE_ID
})

public class AiThread {
  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nonnull  private String threadId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_LAST_EDIT_DATE = "lastEditDate";
  @javax.annotation.Nullable  private BigDecimal lastEditDate;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable  private AiTProvider provider;

  public static final String JSON_PROPERTY_MODEL = "model";
  @javax.annotation.Nullable  private AiModel model;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nullable  private String profileId;

  public AiThread() {
  }


  public AiThread threadId(@javax.annotation.Nonnull String threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * Unique thread identifier (UUID).
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

  public AiThread title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Optional thread title. Auto-generated from the first message if not set.
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

  public AiThread lastEditDate(@javax.annotation.Nullable BigDecimal lastEditDate) {
    
    this.lastEditDate = lastEditDate;
    return this;
  }

  /**
   * Timestamp (ms since epoch) of the last message in this thread. Used for sorting.
   * @return lastEditDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_EDIT_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLastEditDate() {
    return lastEditDate;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_EDIT_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastEditDate(@javax.annotation.Nullable BigDecimal lastEditDate) {
    this.lastEditDate = lastEditDate;
  }

  public AiThread provider(@javax.annotation.Nullable AiTProvider provider) {
    
    this.provider = provider;
    return this;
  }

  /**
   * Provider configuration at the time of last message. Used for thread-level provider display.
   * @return provider
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiTProvider getProvider() {
    return provider;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(@javax.annotation.Nullable AiTProvider provider) {
    this.provider = provider;
  }

  public AiThread model(@javax.annotation.Nullable AiModel model) {
    
    this.model = model;
    return this;
  }

  /**
   * Model info at the time of last message.
   * @return model
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MODEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiModel getModel() {
    return model;
  }


  @JsonProperty(value = JSON_PROPERTY_MODEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModel(@javax.annotation.Nullable AiModel model) {
    this.model = model;
  }

  public AiThread profileId(@javax.annotation.Nullable String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * ID of the profile used for this thread. Links to `Profile.id`.
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
    AiThread aiThread = (AiThread) o;
    return Objects.equals(this.threadId, aiThread.threadId) &&
        Objects.equals(this.title, aiThread.title) &&
        Objects.equals(this.lastEditDate, aiThread.lastEditDate) &&
        Objects.equals(this.provider, aiThread.provider) &&
        Objects.equals(this.model, aiThread.model) &&
        Objects.equals(this.profileId, aiThread.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, title, lastEditDate, provider, model, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiThread {\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lastEditDate: ").append(toIndentedString(lastEditDate)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastEditDate` to the URL query string
    if (getLastEditDate() != null) {
      try {
        joiner.add(String.format("%slastEditDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastEditDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `provider` to the URL query string
    if (getProvider() != null) {
      joiner.add(getProvider().toUrlQueryString(prefix + "provider" + suffix));
    }

    // add `model` to the URL query string
    if (getModel() != null) {
      joiner.add(getModel().toUrlQueryString(prefix + "model" + suffix));
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

