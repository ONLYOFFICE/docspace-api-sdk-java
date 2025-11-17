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
 * The request parameters for configuring login security and performance settings.
 */
@JsonPropertyOrder({
  LoginSettingsRequestDto.JSON_PROPERTY_ATTEMPT_COUNT,
  LoginSettingsRequestDto.JSON_PROPERTY_BLOCK_TIME,
  LoginSettingsRequestDto.JSON_PROPERTY_CHECK_PERIOD
})

public class LoginSettingsRequestDto {
  public static final String JSON_PROPERTY_ATTEMPT_COUNT = "attemptCount";
  @javax.annotation.Nullable
  private Integer attemptCount;

  public static final String JSON_PROPERTY_BLOCK_TIME = "blockTime";
  @javax.annotation.Nullable
  private Integer blockTime;

  public static final String JSON_PROPERTY_CHECK_PERIOD = "checkPeriod";
  @javax.annotation.Nullable
  private Integer checkPeriod;

  public LoginSettingsRequestDto() {
  }

  public LoginSettingsRequestDto attemptCount(@javax.annotation.Nullable Integer attemptCount) {
    
    this.attemptCount = attemptCount;
    return this;
  }

  /**
   * The maximum number of consecutive failed login attempts allowed before triggering account suspension.
   * minimum: 1
   * maximum: 9999
   * @return attemptCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTEMPT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttemptCount() {
    return attemptCount;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttemptCount(@javax.annotation.Nullable Integer attemptCount) {
    this.attemptCount = attemptCount;
  }

  public LoginSettingsRequestDto blockTime(@javax.annotation.Nullable Integer blockTime) {
    
    this.blockTime = blockTime;
    return this;
  }

  /**
   * The duration (in minutes) for which an account remains suspended after exceeding maximum login attempts.
   * minimum: 1
   * maximum: 9999
   * @return blockTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBlockTime() {
    return blockTime;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockTime(@javax.annotation.Nullable Integer blockTime) {
    this.blockTime = blockTime;
  }

  public LoginSettingsRequestDto checkPeriod(@javax.annotation.Nullable Integer checkPeriod) {
    
    this.checkPeriod = checkPeriod;
    return this;
  }

  /**
   * The maximum time (in seconds) allowed for server to process and respond to login requests.
   * minimum: 1
   * maximum: 9999
   * @return checkPeriod
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCheckPeriod() {
    return checkPeriod;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckPeriod(@javax.annotation.Nullable Integer checkPeriod) {
    this.checkPeriod = checkPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginSettingsRequestDto loginSettingsRequestDto = (LoginSettingsRequestDto) o;
    return Objects.equals(this.attemptCount, loginSettingsRequestDto.attemptCount) &&
        Objects.equals(this.blockTime, loginSettingsRequestDto.blockTime) &&
        Objects.equals(this.checkPeriod, loginSettingsRequestDto.checkPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptCount, blockTime, checkPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginSettingsRequestDto {\n");
    sb.append("    attemptCount: ").append(toIndentedString(attemptCount)).append("\n");
    sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
    sb.append("    checkPeriod: ").append(toIndentedString(checkPeriod)).append("\n");
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

    return joiner.toString();
  }

}

