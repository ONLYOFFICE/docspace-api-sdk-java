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
import org.openapitools.client.model.EmployeeStatus;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The user existence check response parameters.
 */
@JsonPropertyOrder({
  UserExistsResponseDto.JSON_PROPERTY_EXISTS,
  UserExistsResponseDto.JSON_PROPERTY_STATUS
})

public class UserExistsResponseDto {
  public static final String JSON_PROPERTY_EXISTS = "exists";
  @javax.annotation.Nonnull  private Boolean exists;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private EmployeeStatus status;

  public UserExistsResponseDto() {
  }


  public UserExistsResponseDto exists(@javax.annotation.Nonnull Boolean exists) {
    
    this.exists = exists;
    return this;
  }

  /**
   * Specifies whether the user exists or not.
   * @return exists
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_EXISTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getExists() {
    return exists;
  }


  @JsonProperty(value = JSON_PROPERTY_EXISTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExists(@javax.annotation.Nonnull Boolean exists) {
    this.exists = exists;
  }

  public UserExistsResponseDto status(@javax.annotation.Nullable EmployeeStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable EmployeeStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserExistsResponseDto userExistsResponseDto = (UserExistsResponseDto) o;
    return Objects.equals(this.exists, userExistsResponseDto.exists) &&
        Objects.equals(this.status, userExistsResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exists, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserExistsResponseDto {\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `exists` to the URL query string
    if (getExists() != null) {
      try {
        joiner.add(String.format("%sexists%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExists()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

