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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for linking accounts.
 */
@JsonPropertyOrder({
  LinkAccountRequestDto.JSON_PROPERTY_SERIALIZED_PROFILE
})

public class LinkAccountRequestDto {
  public static final String JSON_PROPERTY_SERIALIZED_PROFILE = "serializedProfile";
  @javax.annotation.Nullable  private JsonNullable<String> serializedProfile = JsonNullable.<String>undefined();

  public LinkAccountRequestDto() {
  }


  public LinkAccountRequestDto serializedProfile(@javax.annotation.Nullable String serializedProfile) {
    this.serializedProfile = JsonNullable.<String>of(serializedProfile);
    
    return this;
  }

  /**
   * The third-party profile in the serialized format.
   * @return serializedProfile
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSerializedProfile() {
        return serializedProfile.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SERIALIZED_PROFILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSerializedProfile_JsonNullable() {
    return serializedProfile;
  }
  
  @JsonProperty(JSON_PROPERTY_SERIALIZED_PROFILE)
  public void setSerializedProfile_JsonNullable(JsonNullable<String> serializedProfile) {
    this.serializedProfile = serializedProfile;
  }

  public void setSerializedProfile(@javax.annotation.Nullable String serializedProfile) {
    this.serializedProfile = JsonNullable.<String>of(serializedProfile);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkAccountRequestDto linkAccountRequestDto = (LinkAccountRequestDto) o;
    return equalsNullable(this.serializedProfile, linkAccountRequestDto.serializedProfile);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(serializedProfile));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkAccountRequestDto {\n");
    sb.append("    serializedProfile: ").append(toIndentedString(serializedProfile)).append("\n");
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

    // add `serializedProfile` to the URL query string
    if (getSerializedProfile() != null) {
      try {
        joiner.add(String.format("%sserializedProfile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSerializedProfile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

