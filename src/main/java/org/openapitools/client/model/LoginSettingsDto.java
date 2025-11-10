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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The login settings parameters.
 */
@JsonPropertyOrder({
  LoginSettingsDto.JSON_PROPERTY_ATTEMPT_COUNT,
  LoginSettingsDto.JSON_PROPERTY_BLOCK_TIME,
  LoginSettingsDto.JSON_PROPERTY_CHECK_PERIOD,
  LoginSettingsDto.JSON_PROPERTY_IS_DEFAULT
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class LoginSettingsDto {
  public static final String JSON_PROPERTY_ATTEMPT_COUNT = "attemptCount";
  @javax.annotation.Nonnull
  private Integer attemptCount;

  public static final String JSON_PROPERTY_BLOCK_TIME = "blockTime";
  @javax.annotation.Nonnull
  private Integer blockTime;

  public static final String JSON_PROPERTY_CHECK_PERIOD = "checkPeriod";
  @javax.annotation.Nonnull
  private Integer checkPeriod;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  @javax.annotation.Nonnull
  private Boolean isDefault;

  public LoginSettingsDto() {
  }

  public LoginSettingsDto attemptCount(@javax.annotation.Nonnull Integer attemptCount) {
    
    this.attemptCount = attemptCount;
    return this;
  }

  /**
   * The maximum number of consecutive failed login attempts allowed before triggering account suspension.
   * @return attemptCount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTEMPT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAttemptCount() {
    return attemptCount;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttemptCount(@javax.annotation.Nonnull Integer attemptCount) {
    this.attemptCount = attemptCount;
  }

  public LoginSettingsDto blockTime(@javax.annotation.Nonnull Integer blockTime) {
    
    this.blockTime = blockTime;
    return this;
  }

  /**
   * The duration (in minutes) for which an account remains suspended after exceeding maximum login attempts.
   * @return blockTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLOCK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBlockTime() {
    return blockTime;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlockTime(@javax.annotation.Nonnull Integer blockTime) {
    this.blockTime = blockTime;
  }

  public LoginSettingsDto checkPeriod(@javax.annotation.Nonnull Integer checkPeriod) {
    
    this.checkPeriod = checkPeriod;
    return this;
  }

  /**
   * The maximum time (in seconds) allowed for server to process and respond to login requests.
   * @return checkPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHECK_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCheckPeriod() {
    return checkPeriod;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCheckPeriod(@javax.annotation.Nonnull Integer checkPeriod) {
    this.checkPeriod = checkPeriod;
  }

  public LoginSettingsDto isDefault(@javax.annotation.Nonnull Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Specifies if these settings are default or not
   * @return isDefault
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDefault(@javax.annotation.Nonnull Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginSettingsDto loginSettingsDto = (LoginSettingsDto) o;
    return Objects.equals(this.attemptCount, loginSettingsDto.attemptCount) &&
        Objects.equals(this.blockTime, loginSettingsDto.blockTime) &&
        Objects.equals(this.checkPeriod, loginSettingsDto.checkPeriod) &&
        Objects.equals(this.isDefault, loginSettingsDto.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptCount, blockTime, checkPeriod, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginSettingsDto {\n");
    sb.append("    attemptCount: ").append(toIndentedString(attemptCount)).append("\n");
    sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
    sb.append("    checkPeriod: ").append(toIndentedString(checkPeriod)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

    // add `attemptCount` to the URL query string
    if (getAttemptCount() != null) {
      try {
        joiner.add(String.format("%sattemptCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAttemptCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `blockTime` to the URL query string
    if (getBlockTime() != null) {
      try {
        joiner.add(String.format("%sblockTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBlockTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `checkPeriod` to the URL query string
    if (getCheckPeriod() != null) {
      try {
        joiner.add(String.format("%scheckPeriod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCheckPeriod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isDefault` to the URL query string
    if (getIsDefault() != null) {
      try {
        joiner.add(String.format("%sisDefault%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDefault()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

