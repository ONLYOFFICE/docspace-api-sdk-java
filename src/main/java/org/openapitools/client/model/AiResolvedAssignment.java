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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Resolved profile for an action — both the storage row and its ID.
 */
@JsonPropertyOrder({
  AiResolvedAssignment.JSON_PROPERTY_PROFILE_ID,
  AiResolvedAssignment.JSON_PROPERTY_PROFILE
})

public class AiResolvedAssignment {
  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nonnull  private String profileId;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  @javax.annotation.Nonnull  private AiProfile profile;

  public AiResolvedAssignment() {
  }


  public AiResolvedAssignment profileId(@javax.annotation.Nonnull String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * The identifier of the resolved profile.
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

  public AiResolvedAssignment profile(@javax.annotation.Nonnull AiProfile profile) {
    
    this.profile = profile;
    return this;
  }

  /**
   * The resolved profile itself.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiResolvedAssignment aiResolvedAssignment = (AiResolvedAssignment) o;
    return Objects.equals(this.profileId, aiResolvedAssignment.profileId) &&
        Objects.equals(this.profile, aiResolvedAssignment.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiResolvedAssignment {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

    // add `profileId` to the URL query string
    if (getProfileId() != null) {
      try {
        joiner.add(String.format("%sprofileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profile` to the URL query string
    if (getProfile() != null) {
      joiner.add(getProfile().toUrlQueryString(prefix + "profile" + suffix));
    }

    return joiner.toString();
  }

}

