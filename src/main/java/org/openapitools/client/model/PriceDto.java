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
 * The price parameters.
 */
@JsonPropertyOrder({
  PriceDto.JSON_PROPERTY_VALUE,
  PriceDto.JSON_PROPERTY_CURRENCY_SYMBOL,
  PriceDto.JSON_PROPERTY_ISO_CURRENCY_SYMBOL
})

public class PriceDto {
  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable  private JsonNullable<Double> value = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CURRENCY_SYMBOL = "currencySymbol";
  @javax.annotation.Nullable  private JsonNullable<String> currencySymbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISO_CURRENCY_SYMBOL = "isoCurrencySymbol";
  @javax.annotation.Nullable  private JsonNullable<String> isoCurrencySymbol = JsonNullable.<String>undefined();

  public PriceDto() {
  }


  public PriceDto value(@javax.annotation.Nullable Double value) {
    this.value = JsonNullable.<Double>of(value);
    
    return this;
  }

  /**
   * The price value.
   * @return value
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Double getValue() {
        return value.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getValue_JsonNullable() {
    return value;
  }
  
  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<Double> value) {
    this.value = value;
  }

  public void setValue(@javax.annotation.Nullable Double value) {
    this.value = JsonNullable.<Double>of(value);
  }

  public PriceDto currencySymbol(@javax.annotation.Nullable String currencySymbol) {
    this.currencySymbol = JsonNullable.<String>of(currencySymbol);
    
    return this;
  }

  /**
   * The currency symbol.
   * @return currencySymbol
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCurrencySymbol() {
        return currencySymbol.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CURRENCY_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCurrencySymbol_JsonNullable() {
    return currencySymbol;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY_SYMBOL)
  public void setCurrencySymbol_JsonNullable(JsonNullable<String> currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public void setCurrencySymbol(@javax.annotation.Nullable String currencySymbol) {
    this.currencySymbol = JsonNullable.<String>of(currencySymbol);
  }

  public PriceDto isoCurrencySymbol(@javax.annotation.Nullable String isoCurrencySymbol) {
    this.isoCurrencySymbol = JsonNullable.<String>of(isoCurrencySymbol);
    
    return this;
  }

  /**
   * The three-character ISO 4217 currency symbol.
   * @return isoCurrencySymbol
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getIsoCurrencySymbol() {
        return isoCurrencySymbol.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ISO_CURRENCY_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getIsoCurrencySymbol_JsonNullable() {
    return isoCurrencySymbol;
  }
  
  @JsonProperty(JSON_PROPERTY_ISO_CURRENCY_SYMBOL)
  public void setIsoCurrencySymbol_JsonNullable(JsonNullable<String> isoCurrencySymbol) {
    this.isoCurrencySymbol = isoCurrencySymbol;
  }

  public void setIsoCurrencySymbol(@javax.annotation.Nullable String isoCurrencySymbol) {
    this.isoCurrencySymbol = JsonNullable.<String>of(isoCurrencySymbol);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDto priceDto = (PriceDto) o;
    return equalsNullable(this.value, priceDto.value) &&
        equalsNullable(this.currencySymbol, priceDto.currencySymbol) &&
        equalsNullable(this.isoCurrencySymbol, priceDto.isoCurrencySymbol);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(value), hashCodeNullable(currencySymbol), hashCodeNullable(isoCurrencySymbol));
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
    sb.append("class PriceDto {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    isoCurrencySymbol: ").append(toIndentedString(isoCurrencySymbol)).append("\n");
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

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currencySymbol` to the URL query string
    if (getCurrencySymbol() != null) {
      try {
        joiner.add(String.format("%scurrencySymbol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrencySymbol()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isoCurrencySymbol` to the URL query string
    if (getIsoCurrencySymbol() != null) {
      try {
        joiner.add(String.format("%sisoCurrencySymbol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsoCurrencySymbol()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

