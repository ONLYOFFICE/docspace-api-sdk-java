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
import java.util.UUID;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.EmployeeType;
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
 * The invitation link parameters.
 */
@JsonPropertyOrder({
  InvitationLinkDto.JSON_PROPERTY_ID,
  InvitationLinkDto.JSON_PROPERTY_EMPLOYEE_TYPE,
  InvitationLinkDto.JSON_PROPERTY_EXPIRATION,
  InvitationLinkDto.JSON_PROPERTY_IS_EXPIRED,
  InvitationLinkDto.JSON_PROPERTY_MAX_USE_COUNT,
  InvitationLinkDto.JSON_PROPERTY_CURRENT_USE_COUNT,
  InvitationLinkDto.JSON_PROPERTY_URL
})

public class InvitationLinkDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private UUID id;

  public static final String JSON_PROPERTY_EMPLOYEE_TYPE = "employeeType";
  @javax.annotation.Nonnull  private EmployeeType employeeType;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  @javax.annotation.Nullable  private ApiDateTime expiration;

  public static final String JSON_PROPERTY_IS_EXPIRED = "isExpired";
  @javax.annotation.Nullable  private Boolean isExpired;

  public static final String JSON_PROPERTY_MAX_USE_COUNT = "maxUseCount";
  @javax.annotation.Nullable  private JsonNullable<Integer> maxUseCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CURRENT_USE_COUNT = "currentUseCount";
  @javax.annotation.Nullable  private Integer currentUseCount;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public InvitationLinkDto() {
  }


  public InvitationLinkDto id(@javax.annotation.Nullable UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The ID of the invitation link.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }

  public InvitationLinkDto employeeType(@javax.annotation.Nonnull EmployeeType employeeType) {
    
    this.employeeType = employeeType;
    return this;
  }

  /**
   * Get employeeType
   * @return employeeType
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_EMPLOYEE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EmployeeType getEmployeeType() {
    return employeeType;
  }


  @JsonProperty(value = JSON_PROPERTY_EMPLOYEE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmployeeType(@javax.annotation.Nonnull EmployeeType employeeType) {
    this.employeeType = employeeType;
  }

  public InvitationLinkDto expiration(@javax.annotation.Nullable ApiDateTime expiration) {
    
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXPIRATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getExpiration() {
    return expiration;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiration(@javax.annotation.Nullable ApiDateTime expiration) {
    this.expiration = expiration;
  }

  public InvitationLinkDto isExpired(@javax.annotation.Nullable Boolean isExpired) {
    
    this.isExpired = isExpired;
    return this;
  }

  /**
   * Indicates whether the invitation link has expired.
   * @return isExpired
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsExpired() {
    return isExpired;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsExpired(@javax.annotation.Nullable Boolean isExpired) {
    this.isExpired = isExpired;
  }

  public InvitationLinkDto maxUseCount(@javax.annotation.Nullable Integer maxUseCount) {
    this.maxUseCount = JsonNullable.<Integer>of(maxUseCount);
    
    return this;
  }

  /**
   * The maximum number of times the invitation link can be used.
   * @return maxUseCount
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getMaxUseCount() {
        return maxUseCount.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MAX_USE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getMaxUseCount_JsonNullable() {
    return maxUseCount;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX_USE_COUNT)
  public void setMaxUseCount_JsonNullable(JsonNullable<Integer> maxUseCount) {
    this.maxUseCount = maxUseCount;
  }

  public void setMaxUseCount(@javax.annotation.Nullable Integer maxUseCount) {
    this.maxUseCount = JsonNullable.<Integer>of(maxUseCount);
  }

  public InvitationLinkDto currentUseCount(@javax.annotation.Nullable Integer currentUseCount) {
    
    this.currentUseCount = currentUseCount;
    return this;
  }

  /**
   * The current number of times the invitation link has been used.
   * @return currentUseCount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CURRENT_USE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurrentUseCount() {
    return currentUseCount;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_USE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentUseCount(@javax.annotation.Nullable Integer currentUseCount) {
    this.currentUseCount = currentUseCount;
  }

  public InvitationLinkDto url(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
    
    return this;
  }

  /**
   * The URL of the invitation link.
   * @return url
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationLinkDto invitationLinkDto = (InvitationLinkDto) o;
    return Objects.equals(this.id, invitationLinkDto.id) &&
        Objects.equals(this.employeeType, invitationLinkDto.employeeType) &&
        Objects.equals(this.expiration, invitationLinkDto.expiration) &&
        Objects.equals(this.isExpired, invitationLinkDto.isExpired) &&
        equalsNullable(this.maxUseCount, invitationLinkDto.maxUseCount) &&
        Objects.equals(this.currentUseCount, invitationLinkDto.currentUseCount) &&
        equalsNullable(this.url, invitationLinkDto.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeType, expiration, isExpired, hashCodeNullable(maxUseCount), currentUseCount, hashCodeNullable(url));
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
    sb.append("class InvitationLinkDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    maxUseCount: ").append(toIndentedString(maxUseCount)).append("\n");
    sb.append("    currentUseCount: ").append(toIndentedString(currentUseCount)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `employeeType` to the URL query string
    if (getEmployeeType() != null) {
      try {
        joiner.add(String.format("%semployeeType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmployeeType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expiration` to the URL query string
    if (getExpiration() != null) {
      joiner.add(getExpiration().toUrlQueryString(prefix + "expiration" + suffix));
    }

    // add `isExpired` to the URL query string
    if (getIsExpired() != null) {
      try {
        joiner.add(String.format("%sisExpired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsExpired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `maxUseCount` to the URL query string
    if (getMaxUseCount() != null) {
      try {
        joiner.add(String.format("%smaxUseCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxUseCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currentUseCount` to the URL query string
    if (getCurrentUseCount() != null) {
      try {
        joiner.add(String.format("%scurrentUseCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrentUseCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

