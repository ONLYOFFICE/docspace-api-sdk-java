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
import java.time.OffsetDateTime;
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
 * The period covered by the monthly wallet spending report.
 */
@JsonPropertyOrder({
  CustomerMonthlyUsageReportRequestDto.JSON_PROPERTY_START_DATE,
  CustomerMonthlyUsageReportRequestDto.JSON_PROPERTY_END_DATE
})

public class CustomerMonthlyUsageReportRequestDto {
  public static final String JSON_PROPERTY_START_DATE = "startDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  public CustomerMonthlyUsageReportRequestDto() {
  }


  public CustomerMonthlyUsageReportRequestDto startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
    
    return this;
  }

  /**
   * The beginning of the reported period, inclusive. The months are cut in the portal time zone rather than in  UTC, so spending at the turn of a month falls where the portal sees it; defaults to the portal creation date.
   * @return startDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getStartDate() {
        return startDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_START_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getStartDate_JsonNullable() {
    return startDate;
  }
  
  @JsonProperty(JSON_PROPERTY_START_DATE)
  public void setStartDate_JsonNullable(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
  }

  public CustomerMonthlyUsageReportRequestDto endDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
    
    return this;
  }

  /**
   * The end of the reported period, inclusive. Cut in the portal time zone in the same way as `startDate`, and  defaults to the moment the call is made.
   * @return endDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_END_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerMonthlyUsageReportRequestDto customerMonthlyUsageReportRequestDto = (CustomerMonthlyUsageReportRequestDto) o;
    return equalsNullable(this.startDate, customerMonthlyUsageReportRequestDto.startDate) &&
        equalsNullable(this.endDate, customerMonthlyUsageReportRequestDto.endDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(startDate), hashCodeNullable(endDate));
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
    sb.append("class CustomerMonthlyUsageReportRequestDto {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

    // add `startDate` to the URL query string
    if (getStartDate() != null) {
      try {
        joiner.add(String.format("%sstartDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `endDate` to the URL query string
    if (getEndDate() != null) {
      try {
        joiner.add(String.format("%sendDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

