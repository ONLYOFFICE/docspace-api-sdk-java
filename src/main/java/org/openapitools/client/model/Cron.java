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
import org.openapitools.client.model.BackupPeriod;
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
 * The backup cron parameters.
 */
@JsonPropertyOrder({
  Cron.JSON_PROPERTY_PERIOD,
  Cron.JSON_PROPERTY_HOUR,
  Cron.JSON_PROPERTY_DAY
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class Cron {
  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable
  private BackupPeriod period;

  public static final String JSON_PROPERTY_HOUR = "hour";
  @javax.annotation.Nullable
  private Integer hour;

  public static final String JSON_PROPERTY_DAY = "day";
  @javax.annotation.Nullable
  private JsonNullable<Integer> day = JsonNullable.<Integer>undefined();

  public Cron() {
  }

  public Cron period(@javax.annotation.Nullable BackupPeriod period) {
    
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BackupPeriod getPeriod() {
    return period;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(@javax.annotation.Nullable BackupPeriod period) {
    this.period = period;
  }

  public Cron hour(@javax.annotation.Nullable Integer hour) {
    
    this.hour = hour;
    return this;
  }

  /**
   * The time of the day to start the backup process.
   * @return hour
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHour() {
    return hour;
  }


  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHour(@javax.annotation.Nullable Integer hour) {
    this.hour = hour;
  }

  public Cron day(@javax.annotation.Nullable Integer day) {
    this.day = JsonNullable.<Integer>of(day);
    
    return this;
  }

  /**
   * The day of the week to start the backup process.
   * @return day
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getDay() {
        return day.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getDay_JsonNullable() {
    return day;
  }
  
  @JsonProperty(JSON_PROPERTY_DAY)
  public void setDay_JsonNullable(JsonNullable<Integer> day) {
    this.day = day;
  }

  public void setDay(@javax.annotation.Nullable Integer day) {
    this.day = JsonNullable.<Integer>of(day);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cron cron = (Cron) o;
    return Objects.equals(this.period, cron.period) &&
        Objects.equals(this.hour, cron.hour) &&
        equalsNullable(this.day, cron.day);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, hour, hashCodeNullable(day));
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
    sb.append("class Cron {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
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

    // add `period` to the URL query string
    if (getPeriod() != null) {
      try {
        joiner.add(String.format("%speriod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hour` to the URL query string
    if (getHour() != null) {
      try {
        joiner.add(String.format("%shour%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHour()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `day` to the URL query string
    if (getDay() != null) {
      try {
        joiner.add(String.format("%sday%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDay()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

