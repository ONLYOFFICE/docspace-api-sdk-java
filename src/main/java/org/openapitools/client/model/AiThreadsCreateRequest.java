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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiThreadsCreateRequest
 */
@JsonPropertyOrder({
  AiThreadsCreateRequest.JSON_PROPERTY_TITLE,
  AiThreadsCreateRequest.JSON_PROPERTY_PROFILE_ID,
  AiThreadsCreateRequest.JSON_PROPERTY_ENTITY_ID
})
@JsonTypeName("aiThreadsCreate_request")

public class AiThreadsCreateRequest {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull  private String title;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nullable  private String profileId;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable  private String entityId;

  public AiThreadsCreateRequest() {
  }


  public AiThreadsCreateRequest title(@javax.annotation.Nonnull String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Thread title.
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

  public AiThreadsCreateRequest profileId(@javax.annotation.Nullable String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * Optional profile to bind.
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

  public AiThreadsCreateRequest entityId(@javax.annotation.Nullable String entityId) {
    
    this.entityId = entityId;
    return this;
  }

  /**
   * Optional entity (room) scope.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiThreadsCreateRequest aiThreadsCreateRequest = (AiThreadsCreateRequest) o;
    return Objects.equals(this.title, aiThreadsCreateRequest.title) &&
        Objects.equals(this.profileId, aiThreadsCreateRequest.profileId) &&
        Objects.equals(this.entityId, aiThreadsCreateRequest.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, profileId, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiThreadsCreateRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      try {
        joiner.add(String.format("%sentityId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

