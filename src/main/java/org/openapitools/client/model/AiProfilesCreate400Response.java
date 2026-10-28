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
import org.openapitools.client.model.AiErrorResponse;
import org.openapitools.client.model.AiProfile;
import org.openapitools.client.model.AiProfileMutationResult;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiProfilesCreate400Response
 */
@JsonPropertyOrder({
  AiProfilesCreate400Response.JSON_PROPERTY_SUCCESS,
  AiProfilesCreate400Response.JSON_PROPERTY_PROFILE,
  AiProfilesCreate400Response.JSON_PROPERTY_ERROR
})
@JsonTypeName("aiProfilesCreate_400_response")

public class AiProfilesCreate400Response {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  @javax.annotation.Nonnull  private Boolean success;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  @javax.annotation.Nullable  private AiProfile profile;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nonnull  private String error;

  public AiProfilesCreate400Response() {
  }


  public AiProfilesCreate400Response success(@javax.annotation.Nonnull Boolean success) {
    
    this.success = success;
    return this;
  }

  /**
   * True when the profile was persisted.
   * @return success
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SUCCESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(value = JSON_PROPERTY_SUCCESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(@javax.annotation.Nonnull Boolean success) {
    this.success = success;
  }

  public AiProfilesCreate400Response profile(@javax.annotation.Nullable AiProfile profile) {
    
    this.profile = profile;
    return this;
  }

  /**
   * The persisted profile. Present on success.
   * @return profile
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROFILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiProfile getProfile() {
    return profile;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfile(@javax.annotation.Nullable AiProfile profile) {
    this.profile = profile;
  }

  public AiProfilesCreate400Response error(@javax.annotation.Nonnull String error) {
    
    this.error = error;
    return this;
  }

  /**
   * The error message, ready to be shown to the caller.
   * @return error
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ERROR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getError() {
    return error;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(@javax.annotation.Nonnull String error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiProfilesCreate400Response aiProfilesCreate400Response = (AiProfilesCreate400Response) o;
    return Objects.equals(this.success, aiProfilesCreate400Response.success) &&
        Objects.equals(this.profile, aiProfilesCreate400Response.profile) &&
        Objects.equals(this.error, aiProfilesCreate400Response.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, profile, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiProfilesCreate400Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

    // add `success` to the URL query string
    if (getSuccess() != null) {
      try {
        joiner.add(String.format("%ssuccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profile` to the URL query string
    if (getProfile() != null) {
      joiner.add(getProfile().toUrlQueryString(prefix + "profile" + suffix));
    }

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

