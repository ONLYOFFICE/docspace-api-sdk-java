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
 * Aggregated customer spending for a single calendar month.
 */
@JsonPropertyOrder({
  CustomerMonthlyUsageDto.JSON_PROPERTY_YEAR,
  CustomerMonthlyUsageDto.JSON_PROPERTY_MONTH,
  CustomerMonthlyUsageDto.JSON_PROPERTY_CURRENCY,
  CustomerMonthlyUsageDto.JSON_PROPERTY_TOTAL_AMOUNT,
  CustomerMonthlyUsageDto.JSON_PROPERTY_OPERATION_COUNT
})

public class CustomerMonthlyUsageDto {
  public static final String JSON_PROPERTY_YEAR = "year";
  @javax.annotation.Nullable  private Integer year;

  public static final String JSON_PROPERTY_MONTH = "month";
  @javax.annotation.Nullable  private Integer month;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "totalAmount";
  @javax.annotation.Nullable  private Double totalAmount;

  public static final String JSON_PROPERTY_OPERATION_COUNT = "operationCount";
  @javax.annotation.Nullable  private Integer operationCount;

  public CustomerMonthlyUsageDto() {
  }


  public CustomerMonthlyUsageDto year(@javax.annotation.Nullable Integer year) {
    
    this.year = year;
    return this;
  }

  /**
   * The calendar year.
   * @return year
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYear() {
    return year;
  }


  @JsonProperty(value = JSON_PROPERTY_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(@javax.annotation.Nullable Integer year) {
    this.year = year;
  }

  public CustomerMonthlyUsageDto month(@javax.annotation.Nullable Integer month) {
    
    this.month = month;
    return this;
  }

  /**
   * The calendar month (1-12).
   * @return month
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonth() {
    return month;
  }


  @JsonProperty(value = JSON_PROPERTY_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonth(@javax.annotation.Nullable Integer month) {
    this.month = month;
  }

  public CustomerMonthlyUsageDto currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The three-character ISO 4217 currency symbol of the amounts.
   * @return currency
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<String> currency) {
    this.currency = currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
  }

  public CustomerMonthlyUsageDto totalAmount(@javax.annotation.Nullable Double totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * The total amount charged across all services in this month.
   * @return totalAmount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOTAL_AMOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_AMOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmount(@javax.annotation.Nullable Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public CustomerMonthlyUsageDto operationCount(@javax.annotation.Nullable Integer operationCount) {
    
    this.operationCount = operationCount;
    return this;
  }

  /**
   * The number of individual purchase operations in this month.
   * @return operationCount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OPERATION_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOperationCount() {
    return operationCount;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATION_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationCount(@javax.annotation.Nullable Integer operationCount) {
    this.operationCount = operationCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerMonthlyUsageDto customerMonthlyUsageDto = (CustomerMonthlyUsageDto) o;
    return Objects.equals(this.year, customerMonthlyUsageDto.year) &&
        Objects.equals(this.month, customerMonthlyUsageDto.month) &&
        equalsNullable(this.currency, customerMonthlyUsageDto.currency) &&
        Objects.equals(this.totalAmount, customerMonthlyUsageDto.totalAmount) &&
        Objects.equals(this.operationCount, customerMonthlyUsageDto.operationCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, hashCodeNullable(currency), totalAmount, operationCount);
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
    sb.append("class CustomerMonthlyUsageDto {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    operationCount: ").append(toIndentedString(operationCount)).append("\n");
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

    // add `year` to the URL query string
    if (getYear() != null) {
      try {
        joiner.add(String.format("%syear%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getYear()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `month` to the URL query string
    if (getMonth() != null) {
      try {
        joiner.add(String.format("%smonth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMonth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalAmount` to the URL query string
    if (getTotalAmount() != null) {
      try {
        joiner.add(String.format("%stotalAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `operationCount` to the URL query string
    if (getOperationCount() != null) {
      try {
        joiner.add(String.format("%soperationCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOperationCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

