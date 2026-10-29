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
 * What has been spent against a spending limit in its current period, and what is left.
 */
@JsonPropertyOrder({
  ServiceLimitUsageDto.JSON_PROPERTY_PERIOD_START,
  ServiceLimitUsageDto.JSON_PROPERTY_PERIOD_END,
  ServiceLimitUsageDto.JSON_PROPERTY_AMOUNT_CONSUMED,
  ServiceLimitUsageDto.JSON_PROPERTY_AMOUNT_AVAILABLE,
  ServiceLimitUsageDto.JSON_PROPERTY_QUANTITY_CONSUMED,
  ServiceLimitUsageDto.JSON_PROPERTY_QUANTITY_AVAILABLE
})

public class ServiceLimitUsageDto {
  public static final String JSON_PROPERTY_PERIOD_START = "periodStart";
  @javax.annotation.Nullable  private OffsetDateTime periodStart;

  public static final String JSON_PROPERTY_PERIOD_END = "periodEnd";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> periodEnd = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_AMOUNT_CONSUMED = "amountConsumed";
  @javax.annotation.Nullable  private Double amountConsumed;

  public static final String JSON_PROPERTY_AMOUNT_AVAILABLE = "amountAvailable";
  @javax.annotation.Nullable  private JsonNullable<Double> amountAvailable = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_QUANTITY_CONSUMED = "quantityConsumed";
  @javax.annotation.Nullable  private Integer quantityConsumed;

  public static final String JSON_PROPERTY_QUANTITY_AVAILABLE = "quantityAvailable";
  @javax.annotation.Nullable  private JsonNullable<Integer> quantityAvailable = JsonNullable.<Integer>undefined();

  public ServiceLimitUsageDto() {
  }


  public ServiceLimitUsageDto periodStart(@javax.annotation.Nullable OffsetDateTime periodStart) {
    
    this.periodStart = periodStart;
    return this;
  }

  /**
   * The start of the current period, in UTC.
   * @return periodStart
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PERIOD_START, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPeriodStart() {
    return periodStart;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD_START, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodStart(@javax.annotation.Nullable OffsetDateTime periodStart) {
    this.periodStart = periodStart;
  }

  public ServiceLimitUsageDto periodEnd(@javax.annotation.Nullable OffsetDateTime periodEnd) {
    this.periodEnd = JsonNullable.<OffsetDateTime>of(periodEnd);
    
    return this;
  }

  /**
   * The end of the current period, in UTC: the moment the spending starts again from zero. Null for a lifetime  limit, which never resets.
   * @return periodEnd
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getPeriodEnd() {
        return periodEnd.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PERIOD_END, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getPeriodEnd_JsonNullable() {
    return periodEnd;
  }
  
  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  public void setPeriodEnd_JsonNullable(JsonNullable<OffsetDateTime> periodEnd) {
    this.periodEnd = periodEnd;
  }

  public void setPeriodEnd(@javax.annotation.Nullable OffsetDateTime periodEnd) {
    this.periodEnd = JsonNullable.<OffsetDateTime>of(periodEnd);
  }

  public ServiceLimitUsageDto amountConsumed(@javax.annotation.Nullable Double amountConsumed) {
    
    this.amountConsumed = amountConsumed;
    return this;
  }

  /**
   * The money charged in the current period, in the currency of the limit.
   * @return amountConsumed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AMOUNT_CONSUMED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAmountConsumed() {
    return amountConsumed;
  }


  @JsonProperty(value = JSON_PROPERTY_AMOUNT_CONSUMED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountConsumed(@javax.annotation.Nullable Double amountConsumed) {
    this.amountConsumed = amountConsumed;
  }

  public ServiceLimitUsageDto amountAvailable(@javax.annotation.Nullable Double amountAvailable) {
    this.amountAvailable = JsonNullable.<Double>of(amountAvailable);
    
    return this;
  }

  /**
   * The money still available in the current period: the threshold less what was charged and what is reserved for  operations in progress, never below zero. Null when the limit has no money threshold.
   * @return amountAvailable
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Double getAmountAvailable() {
        return amountAvailable.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AMOUNT_AVAILABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAmountAvailable_JsonNullable() {
    return amountAvailable;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT_AVAILABLE)
  public void setAmountAvailable_JsonNullable(JsonNullable<Double> amountAvailable) {
    this.amountAvailable = amountAvailable;
  }

  public void setAmountAvailable(@javax.annotation.Nullable Double amountAvailable) {
    this.amountAvailable = JsonNullable.<Double>of(amountAvailable);
  }

  public ServiceLimitUsageDto quantityConsumed(@javax.annotation.Nullable Integer quantityConsumed) {
    
    this.quantityConsumed = quantityConsumed;
    return this;
  }

  /**
   * The quantity consumed in the current period, in the unit of the limit.
   * @return quantityConsumed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_QUANTITY_CONSUMED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuantityConsumed() {
    return quantityConsumed;
  }


  @JsonProperty(value = JSON_PROPERTY_QUANTITY_CONSUMED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantityConsumed(@javax.annotation.Nullable Integer quantityConsumed) {
    this.quantityConsumed = quantityConsumed;
  }

  public ServiceLimitUsageDto quantityAvailable(@javax.annotation.Nullable Integer quantityAvailable) {
    this.quantityAvailable = JsonNullable.<Integer>of(quantityAvailable);
    
    return this;
  }

  /**
   * The quantity still available in the current period, never below zero; null when the limit has no quantity  threshold.
   * @return quantityAvailable
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getQuantityAvailable() {
        return quantityAvailable.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_QUANTITY_AVAILABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getQuantityAvailable_JsonNullable() {
    return quantityAvailable;
  }
  
  @JsonProperty(JSON_PROPERTY_QUANTITY_AVAILABLE)
  public void setQuantityAvailable_JsonNullable(JsonNullable<Integer> quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
  }

  public void setQuantityAvailable(@javax.annotation.Nullable Integer quantityAvailable) {
    this.quantityAvailable = JsonNullable.<Integer>of(quantityAvailable);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLimitUsageDto serviceLimitUsageDto = (ServiceLimitUsageDto) o;
    return Objects.equals(this.periodStart, serviceLimitUsageDto.periodStart) &&
        equalsNullable(this.periodEnd, serviceLimitUsageDto.periodEnd) &&
        Objects.equals(this.amountConsumed, serviceLimitUsageDto.amountConsumed) &&
        equalsNullable(this.amountAvailable, serviceLimitUsageDto.amountAvailable) &&
        Objects.equals(this.quantityConsumed, serviceLimitUsageDto.quantityConsumed) &&
        equalsNullable(this.quantityAvailable, serviceLimitUsageDto.quantityAvailable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStart, hashCodeNullable(periodEnd), amountConsumed, hashCodeNullable(amountAvailable), quantityConsumed, hashCodeNullable(quantityAvailable));
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
    sb.append("class ServiceLimitUsageDto {\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    amountConsumed: ").append(toIndentedString(amountConsumed)).append("\n");
    sb.append("    amountAvailable: ").append(toIndentedString(amountAvailable)).append("\n");
    sb.append("    quantityConsumed: ").append(toIndentedString(quantityConsumed)).append("\n");
    sb.append("    quantityAvailable: ").append(toIndentedString(quantityAvailable)).append("\n");
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

    // add `periodStart` to the URL query string
    if (getPeriodStart() != null) {
      try {
        joiner.add(String.format("%speriodStart%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriodStart()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `periodEnd` to the URL query string
    if (getPeriodEnd() != null) {
      try {
        joiner.add(String.format("%speriodEnd%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriodEnd()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amountConsumed` to the URL query string
    if (getAmountConsumed() != null) {
      try {
        joiner.add(String.format("%samountConsumed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountConsumed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amountAvailable` to the URL query string
    if (getAmountAvailable() != null) {
      try {
        joiner.add(String.format("%samountAvailable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountAvailable()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantityConsumed` to the URL query string
    if (getQuantityConsumed() != null) {
      try {
        joiner.add(String.format("%squantityConsumed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantityConsumed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantityAvailable` to the URL query string
    if (getQuantityAvailable() != null) {
      try {
        joiner.add(String.format("%squantityAvailable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantityAvailable()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

