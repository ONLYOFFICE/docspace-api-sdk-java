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
import org.openapitools.client.model.AiProfile;
import org.openapitools.client.model.AiThreadsOpenOrCreateRequestEntityMeta;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiThreadsRegenerateTitleRequest
 */
@JsonPropertyOrder({
  AiThreadsRegenerateTitleRequest.JSON_PROPERTY_THREAD_ID,
  AiThreadsRegenerateTitleRequest.JSON_PROPERTY_PROFILE,
  AiThreadsRegenerateTitleRequest.JSON_PROPERTY_ENTITY_META
})
@JsonTypeName("aiThreadsRegenerateTitle_request")

public class AiThreadsRegenerateTitleRequest {
  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nonnull  private String threadId;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  @javax.annotation.Nonnull  private AiProfile profile;

  public static final String JSON_PROPERTY_ENTITY_META = "entityMeta";
  @javax.annotation.Nullable  private AiThreadsOpenOrCreateRequestEntityMeta entityMeta;

  public AiThreadsRegenerateTitleRequest() {
  }


  public AiThreadsRegenerateTitleRequest threadId(@javax.annotation.Nonnull String threadId) {
    
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

  public AiThreadsRegenerateTitleRequest profile(@javax.annotation.Nonnull AiProfile profile) {
    
    this.profile = profile;
    return this;
  }

  /**
   * Profile used to regenerate the title.
   * @return profile
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROFILE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiProfile getProfile() {
    return profile;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfile(@javax.annotation.Nonnull AiProfile profile) {
    this.profile = profile;
  }

  public AiThreadsRegenerateTitleRequest entityMeta(@javax.annotation.Nullable AiThreadsOpenOrCreateRequestEntityMeta entityMeta) {
    
    this.entityMeta = entityMeta;
    return this;
  }

  /**
   * Get entityMeta
   * @return entityMeta
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENTITY_META, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiThreadsOpenOrCreateRequestEntityMeta getEntityMeta() {
    return entityMeta;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_META, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityMeta(@javax.annotation.Nullable AiThreadsOpenOrCreateRequestEntityMeta entityMeta) {
    this.entityMeta = entityMeta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiThreadsRegenerateTitleRequest aiThreadsRegenerateTitleRequest = (AiThreadsRegenerateTitleRequest) o;
    return Objects.equals(this.threadId, aiThreadsRegenerateTitleRequest.threadId) &&
        Objects.equals(this.profile, aiThreadsRegenerateTitleRequest.profile) &&
        Objects.equals(this.entityMeta, aiThreadsRegenerateTitleRequest.entityMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, profile, entityMeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiThreadsRegenerateTitleRequest {\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    entityMeta: ").append(toIndentedString(entityMeta)).append("\n");
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

    // add `profile` to the URL query string
    if (getProfile() != null) {
      joiner.add(getProfile().toUrlQueryString(prefix + "profile" + suffix));
    }

    // add `entityMeta` to the URL query string
    if (getEntityMeta() != null) {
      joiner.add(getEntityMeta().toUrlQueryString(prefix + "entityMeta" + suffix));
    }

    return joiner.toString();
  }

}

