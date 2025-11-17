/*
 * (c) Copyright Ascensio System SIA 2025
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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for starting the reassignment process.
 */
@JsonPropertyOrder({
  StartReassignRequestDto.JSON_PROPERTY_FROM_USER_ID,
  StartReassignRequestDto.JSON_PROPERTY_TO_USER_ID,
  StartReassignRequestDto.JSON_PROPERTY_DELETE_PROFILE
})

public class StartReassignRequestDto {
  public static final String JSON_PROPERTY_FROM_USER_ID = "fromUserId";
  @javax.annotation.Nonnull
  private UUID fromUserId;

  public static final String JSON_PROPERTY_TO_USER_ID = "toUserId";
  @javax.annotation.Nonnull
  private UUID toUserId;

  public static final String JSON_PROPERTY_DELETE_PROFILE = "deleteProfile";
  @javax.annotation.Nullable
  private Boolean deleteProfile;

  public StartReassignRequestDto() {
  }

  public StartReassignRequestDto fromUserId(@javax.annotation.Nonnull UUID fromUserId) {
    
    this.fromUserId = fromUserId;
    return this;
  }

  /**
   * The user ID whose data will be reassigned to another user.
   * @return fromUserId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getFromUserId() {
    return fromUserId;
  }


  @JsonProperty(JSON_PROPERTY_FROM_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromUserId(@javax.annotation.Nonnull UUID fromUserId) {
    this.fromUserId = fromUserId;
  }

  public StartReassignRequestDto toUserId(@javax.annotation.Nonnull UUID toUserId) {
    
    this.toUserId = toUserId;
    return this;
  }

  /**
   * The user ID to whom all the data will be reassigned.
   * @return toUserId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getToUserId() {
    return toUserId;
  }


  @JsonProperty(JSON_PROPERTY_TO_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToUserId(@javax.annotation.Nonnull UUID toUserId) {
    this.toUserId = toUserId;
  }

  public StartReassignRequestDto deleteProfile(@javax.annotation.Nullable Boolean deleteProfile) {
    
    this.deleteProfile = deleteProfile;
    return this;
  }

  /**
   * Specifies whether to delete a profile when the data reassignment will be finished or not.
   * @return deleteProfile
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleteProfile() {
    return deleteProfile;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteProfile(@javax.annotation.Nullable Boolean deleteProfile) {
    this.deleteProfile = deleteProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartReassignRequestDto startReassignRequestDto = (StartReassignRequestDto) o;
    return Objects.equals(this.fromUserId, startReassignRequestDto.fromUserId) &&
        Objects.equals(this.toUserId, startReassignRequestDto.toUserId) &&
        Objects.equals(this.deleteProfile, startReassignRequestDto.deleteProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromUserId, toUserId, deleteProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartReassignRequestDto {\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    deleteProfile: ").append(toIndentedString(deleteProfile)).append("\n");
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

    // add `fromUserId` to the URL query string
    if (getFromUserId() != null) {
      try {
        joiner.add(String.format("%sfromUserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFromUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `toUserId` to the URL query string
    if (getToUserId() != null) {
      try {
        joiner.add(String.format("%stoUserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deleteProfile` to the URL query string
    if (getDeleteProfile() != null) {
      try {
        joiner.add(String.format("%sdeleteProfile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeleteProfile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

