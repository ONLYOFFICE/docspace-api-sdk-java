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
import org.openapitools.client.model.FileShareDto;
import org.openapitools.client.model.RoomSecurityError;
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
 * The room security parameters.
 */
@JsonPropertyOrder({
  RoomSecurityDto.JSON_PROPERTY_MEMBERS,
  RoomSecurityDto.JSON_PROPERTY_WARNING,
  RoomSecurityDto.JSON_PROPERTY_ERROR
})

public class RoomSecurityDto {
  public static final String JSON_PROPERTY_MEMBERS = "members";
  @javax.annotation.Nullable  private JsonNullable<List<FileShareDto>> members = JsonNullable.<List<FileShareDto>>undefined();

  public static final String JSON_PROPERTY_WARNING = "warning";
  @javax.annotation.Nullable  private JsonNullable<String> warning = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable  private RoomSecurityError error;

  public RoomSecurityDto() {
  }


  public RoomSecurityDto members(@javax.annotation.Nullable List<FileShareDto> members) {
    this.members = JsonNullable.<List<FileShareDto>>of(members);
    
    return this;
  }

  public RoomSecurityDto addMembersItem(FileShareDto membersItem) {
    if (this.members == null || !this.members.isPresent()) {
      this.members = JsonNullable.<List<FileShareDto>>of(new ArrayList<>());
    }
    try {
      this.members.get().add(membersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of room members.
   * @return members
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<FileShareDto> getMembers() {
        return members.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MEMBERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FileShareDto>> getMembers_JsonNullable() {
    return members;
  }
  
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  public void setMembers_JsonNullable(JsonNullable<List<FileShareDto>> members) {
    this.members = members;
  }

  public void setMembers(@javax.annotation.Nullable List<FileShareDto> members) {
    this.members = JsonNullable.<List<FileShareDto>>of(members);
  }

  public RoomSecurityDto warning(@javax.annotation.Nullable String warning) {
    this.warning = JsonNullable.<String>of(warning);
    
    return this;
  }

  /**
   * The warning message.
   * @return warning
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getWarning() {
        return warning.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WARNING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getWarning_JsonNullable() {
    return warning;
  }
  
  @JsonProperty(JSON_PROPERTY_WARNING)
  public void setWarning_JsonNullable(JsonNullable<String> warning) {
    this.warning = warning;
  }

  public void setWarning(@javax.annotation.Nullable String warning) {
    this.warning = JsonNullable.<String>of(warning);
  }

  public RoomSecurityDto error(@javax.annotation.Nullable RoomSecurityError error) {
    
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoomSecurityError getError() {
    return error;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(@javax.annotation.Nullable RoomSecurityError error) {
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
    RoomSecurityDto roomSecurityDto = (RoomSecurityDto) o;
    return equalsNullable(this.members, roomSecurityDto.members) &&
        equalsNullable(this.warning, roomSecurityDto.warning) &&
        Objects.equals(this.error, roomSecurityDto.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(members), hashCodeNullable(warning), error);
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
    sb.append("class RoomSecurityDto {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

    // add `members` to the URL query string
    if (getMembers() != null) {
      for (int i = 0; i < getMembers().size(); i++) {
        if (getMembers().get(i) != null) {
          joiner.add(getMembers().get(i).toUrlQueryString(String.format("%smembers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `warning` to the URL query string
    if (getWarning() != null) {
      try {
        joiner.add(String.format("%swarning%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWarning()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

