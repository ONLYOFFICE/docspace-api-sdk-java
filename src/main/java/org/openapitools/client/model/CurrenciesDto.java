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
 * The currencies parameters.
 */
@JsonPropertyOrder({
  CurrenciesDto.JSON_PROPERTY_ISO_COUNTRY_CODE,
  CurrenciesDto.JSON_PROPERTY_ISO_CURRENCY_SYMBOL,
  CurrenciesDto.JSON_PROPERTY_CURRENCY_NATIVE_NAME
})

public class CurrenciesDto {
  public static final String JSON_PROPERTY_ISO_COUNTRY_CODE = "isoCountryCode";
  @javax.annotation.Nullable
  private JsonNullable<String> isoCountryCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISO_CURRENCY_SYMBOL = "isoCurrencySymbol";
  @javax.annotation.Nullable
  private JsonNullable<String> isoCurrencySymbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CURRENCY_NATIVE_NAME = "currencyNativeName";
  @javax.annotation.Nullable
  private JsonNullable<String> currencyNativeName = JsonNullable.<String>undefined();

  public CurrenciesDto() {
  }


  public CurrenciesDto isoCountryCode(@javax.annotation.Nullable String isoCountryCode) {
    this.isoCountryCode = JsonNullable.<String>of(isoCountryCode);
    
    return this;
  }

  /**
   * The ISO country code.
   * @return isoCountryCode
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getIsoCountryCode() {
        return isoCountryCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISO_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIsoCountryCode_JsonNullable() {
    return isoCountryCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ISO_COUNTRY_CODE)
  public void setIsoCountryCode_JsonNullable(JsonNullable<String> isoCountryCode) {
    this.isoCountryCode = isoCountryCode;
  }

  public void setIsoCountryCode(@javax.annotation.Nullable String isoCountryCode) {
    this.isoCountryCode = JsonNullable.<String>of(isoCountryCode);
  }

  public CurrenciesDto isoCurrencySymbol(@javax.annotation.Nullable String isoCurrencySymbol) {
    this.isoCurrencySymbol = JsonNullable.<String>of(isoCurrencySymbol);
    
    return this;
  }

  /**
   * The ISO currency symbol.
   * @return isoCurrencySymbol
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getIsoCurrencySymbol() {
        return isoCurrencySymbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISO_CURRENCY_SYMBOL)
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

  public CurrenciesDto currencyNativeName(@javax.annotation.Nullable String currencyNativeName) {
    this.currencyNativeName = JsonNullable.<String>of(currencyNativeName);
    
    return this;
  }

  /**
   * The currency native name.
   * @return currencyNativeName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCurrencyNativeName() {
        return currencyNativeName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY_NATIVE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrencyNativeName_JsonNullable() {
    return currencyNativeName;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY_NATIVE_NAME)
  public void setCurrencyNativeName_JsonNullable(JsonNullable<String> currencyNativeName) {
    this.currencyNativeName = currencyNativeName;
  }

  public void setCurrencyNativeName(@javax.annotation.Nullable String currencyNativeName) {
    this.currencyNativeName = JsonNullable.<String>of(currencyNativeName);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrenciesDto currenciesDto = (CurrenciesDto) o;
    return equalsNullable(this.isoCountryCode, currenciesDto.isoCountryCode) &&
        equalsNullable(this.isoCurrencySymbol, currenciesDto.isoCurrencySymbol) &&
        equalsNullable(this.currencyNativeName, currenciesDto.currencyNativeName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(isoCountryCode), hashCodeNullable(isoCurrencySymbol), hashCodeNullable(currencyNativeName));
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
    sb.append("class CurrenciesDto {\n");
    sb.append("    isoCountryCode: ").append(toIndentedString(isoCountryCode)).append("\n");
    sb.append("    isoCurrencySymbol: ").append(toIndentedString(isoCurrencySymbol)).append("\n");
    sb.append("    currencyNativeName: ").append(toIndentedString(currencyNativeName)).append("\n");
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

    // add `isoCountryCode` to the URL query string
    if (getIsoCountryCode() != null) {
      try {
        joiner.add(String.format("%sisoCountryCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsoCountryCode()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `currencyNativeName` to the URL query string
    if (getCurrencyNativeName() != null) {
      try {
        joiner.add(String.format("%scurrencyNativeName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrencyNativeName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

