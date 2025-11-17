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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The API date and time parameters.
 */
@JsonPropertyOrder({
  ApiDateTime.JSON_PROPERTY_UTC_TIME,
  ApiDateTime.JSON_PROPERTY_TIME_ZONE_OFFSET
})

public class ApiDateTime {
  public static final String JSON_PROPERTY_UTC_TIME = "utcTime";
  @javax.annotation.Nullable
  private OffsetDateTime utcTime;

  public static final String JSON_PROPERTY_TIME_ZONE_OFFSET = "timeZoneOffset";
  @javax.annotation.Nullable
  private String timeZoneOffset;

  public ApiDateTime() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ApiDateTime(
    @JsonProperty(JSON_PROPERTY_UTC_TIME) OffsetDateTime utcTime, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET) String timeZoneOffset
  ) {
    this();
    this.utcTime = utcTime;
    this.timeZoneOffset = timeZoneOffset;
  }

  /**
   * The time in UTC format.
   * @return utcTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UTC_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUtcTime() {
    return utcTime;
  }



  /**
   * The time zone offset.
   * @return timeZoneOffset
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZoneOffset() {
    return timeZoneOffset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDateTime apiDateTime = (ApiDateTime) o;
    return Objects.equals(this.utcTime, apiDateTime.utcTime) &&
        Objects.equals(this.timeZoneOffset, apiDateTime.timeZoneOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utcTime, timeZoneOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDateTime {\n");
    sb.append("    utcTime: ").append(toIndentedString(utcTime)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
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

    // add `utcTime` to the URL query string
    if (getUtcTime() != null) {
      try {
        joiner.add(String.format("%sutcTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUtcTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZoneOffset` to the URL query string
    if (getTimeZoneOffset() != null) {
      try {
        joiner.add(String.format("%stimeZoneOffset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZoneOffset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

