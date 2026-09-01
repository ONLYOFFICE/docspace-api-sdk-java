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
import org.openapitools.client.model.AiThreadMessageLike;
import org.openapitools.client.model.AiThreadsOpenOrCreateRequestEntityMeta;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiThreadsOpenOrCreateRequest
 */
@JsonPropertyOrder({
  AiThreadsOpenOrCreateRequest.JSON_PROPERTY_THREAD_ID,
  AiThreadsOpenOrCreateRequest.JSON_PROPERTY_PROFILE,
  AiThreadsOpenOrCreateRequest.JSON_PROPERTY_PROFILE_ID,
  AiThreadsOpenOrCreateRequest.JSON_PROPERTY_FIRST_MESSAGE,
  AiThreadsOpenOrCreateRequest.JSON_PROPERTY_ENTITY_ID,
  AiThreadsOpenOrCreateRequest.JSON_PROPERTY_ENTITY_META
})
@JsonTypeName("aiThreadsOpenOrCreate_request")

public class AiThreadsOpenOrCreateRequest {
  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nullable  private String threadId;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  @javax.annotation.Nonnull  private AiProfile profile;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nonnull  private String profileId;

  public static final String JSON_PROPERTY_FIRST_MESSAGE = "firstMessage";
  @javax.annotation.Nonnull  private AiThreadMessageLike firstMessage;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable  private String entityId;

  public static final String JSON_PROPERTY_ENTITY_META = "entityMeta";
  @javax.annotation.Nullable  private AiThreadsOpenOrCreateRequestEntityMeta entityMeta;

  public AiThreadsOpenOrCreateRequest() {
  }


  public AiThreadsOpenOrCreateRequest threadId(@javax.annotation.Nullable String threadId) {
    
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

  public AiThreadsOpenOrCreateRequest profile(@javax.annotation.Nonnull AiProfile profile) {
    
    this.profile = profile;
    return this;
  }

  /**
   * Profile the title generation runs on.
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

  public AiThreadsOpenOrCreateRequest profileId(@javax.annotation.Nonnull String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   * @return profileId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileId(@javax.annotation.Nonnull String profileId) {
    this.profileId = profileId;
  }

  public AiThreadsOpenOrCreateRequest firstMessage(@javax.annotation.Nonnull AiThreadMessageLike firstMessage) {
    
    this.firstMessage = firstMessage;
    return this;
  }

  /**
   * First user message a fresh thread derives its title from.
   * @return firstMessage
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FIRST_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiThreadMessageLike getFirstMessage() {
    return firstMessage;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRST_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstMessage(@javax.annotation.Nonnull AiThreadMessageLike firstMessage) {
    this.firstMessage = firstMessage;
  }

  public AiThreadsOpenOrCreateRequest entityId(@javax.annotation.Nullable String entityId) {
    
    this.entityId = entityId;
    return this;
  }

  /**
   * Opaque scope token persisted on a freshly created thread.
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

  public AiThreadsOpenOrCreateRequest entityMeta(@javax.annotation.Nullable AiThreadsOpenOrCreateRequestEntityMeta entityMeta) {
    
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
    AiThreadsOpenOrCreateRequest aiThreadsOpenOrCreateRequest = (AiThreadsOpenOrCreateRequest) o;
    return Objects.equals(this.threadId, aiThreadsOpenOrCreateRequest.threadId) &&
        Objects.equals(this.profile, aiThreadsOpenOrCreateRequest.profile) &&
        Objects.equals(this.profileId, aiThreadsOpenOrCreateRequest.profileId) &&
        Objects.equals(this.firstMessage, aiThreadsOpenOrCreateRequest.firstMessage) &&
        Objects.equals(this.entityId, aiThreadsOpenOrCreateRequest.entityId) &&
        Objects.equals(this.entityMeta, aiThreadsOpenOrCreateRequest.entityMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, profile, profileId, firstMessage, entityId, entityMeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiThreadsOpenOrCreateRequest {\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    firstMessage: ").append(toIndentedString(firstMessage)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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

    // add `profileId` to the URL query string
    if (getProfileId() != null) {
      try {
        joiner.add(String.format("%sprofileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `firstMessage` to the URL query string
    if (getFirstMessage() != null) {
      joiner.add(getFirstMessage().toUrlQueryString(prefix + "firstMessage" + suffix));
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

    // add `entityMeta` to the URL query string
    if (getEntityMeta() != null) {
      joiner.add(getEntityMeta().toUrlQueryString(prefix + "entityMeta" + suffix));
    }

    return joiner.toString();
  }

}

