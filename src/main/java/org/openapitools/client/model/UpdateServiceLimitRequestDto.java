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
 * The new thresholds and state of an existing service limit.
 */
@JsonPropertyOrder({
  UpdateServiceLimitRequestDto.JSON_PROPERTY_ID,
  UpdateServiceLimitRequestDto.JSON_PROPERTY_AMOUNT_VALUE,
  UpdateServiceLimitRequestDto.JSON_PROPERTY_QUANTITY_VALUE,
  UpdateServiceLimitRequestDto.JSON_PROPERTY_ENABLED
})

public class UpdateServiceLimitRequestDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private Integer id;

  public static final String JSON_PROPERTY_AMOUNT_VALUE = "amountValue";
  @javax.annotation.Nullable  private JsonNullable<Double> amountValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_QUANTITY_VALUE = "quantityValue";
  @javax.annotation.Nullable  private JsonNullable<Integer> quantityValue = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable  private JsonNullable<Boolean> enabled = JsonNullable.<Boolean>undefined();

  public UpdateServiceLimitRequestDto() {
  }


  public UpdateServiceLimitRequestDto id(@javax.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The ID of the service limit, as returned in `id` by the operation that created it or by the reads of limits.
   * minimum: 1
   * maximum: 2147483647
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull Integer id) {
    this.id = id;
  }

  public UpdateServiceLimitRequestDto amountValue(@javax.annotation.Nullable Double amountValue) {
    this.amountValue = JsonNullable.<Double>of(amountValue);
    
    return this;
  }

  /**
   * The most money the AI services may cost per period, in their currency. Zero blocks the AI services completely.
   * minimum: 0
   * maximum: 10000
   * @return amountValue
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Double getAmountValue() {
        return amountValue.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AMOUNT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAmountValue_JsonNullable() {
    return amountValue;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT_VALUE)
  public void setAmountValue_JsonNullable(JsonNullable<Double> amountValue) {
    this.amountValue = amountValue;
  }

  public void setAmountValue(@javax.annotation.Nullable Double amountValue) {
    this.amountValue = JsonNullable.<Double>of(amountValue);
  }

  public UpdateServiceLimitRequestDto quantityValue(@javax.annotation.Nullable Integer quantityValue) {
    this.quantityValue = JsonNullable.<Integer>of(quantityValue);
    
    return this;
  }

  /**
   * The largest quantity the AI services may consume per period, in their common unit. Zero blocks the AI services  completely.
   * minimum: 0
   * maximum: 2147483647
   * @return quantityValue
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getQuantityValue() {
        return quantityValue.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_QUANTITY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getQuantityValue_JsonNullable() {
    return quantityValue;
  }
  
  @JsonProperty(JSON_PROPERTY_QUANTITY_VALUE)
  public void setQuantityValue_JsonNullable(JsonNullable<Integer> quantityValue) {
    this.quantityValue = quantityValue;
  }

  public void setQuantityValue(@javax.annotation.Nullable Integer quantityValue) {
    this.quantityValue = JsonNullable.<Integer>of(quantityValue);
  }

  public UpdateServiceLimitRequestDto enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
    
    return this;
  }

  /**
   * Whether the limit is in force: false switches it off at once, true switches it back on.
   * @return enabled
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getEnabled() {
        return enabled.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getEnabled_JsonNullable() {
    return enabled;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED)
  public void setEnabled_JsonNullable(JsonNullable<Boolean> enabled) {
    this.enabled = enabled;
  }

  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServiceLimitRequestDto updateServiceLimitRequestDto = (UpdateServiceLimitRequestDto) o;
    return Objects.equals(this.id, updateServiceLimitRequestDto.id) &&
        equalsNullable(this.amountValue, updateServiceLimitRequestDto.amountValue) &&
        equalsNullable(this.quantityValue, updateServiceLimitRequestDto.quantityValue) &&
        equalsNullable(this.enabled, updateServiceLimitRequestDto.enabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(amountValue), hashCodeNullable(quantityValue), hashCodeNullable(enabled));
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
    sb.append("class UpdateServiceLimitRequestDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
    sb.append("    quantityValue: ").append(toIndentedString(quantityValue)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

    // add `amountValue` to the URL query string
    if (getAmountValue() != null) {
      try {
        joiner.add(String.format("%samountValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantityValue` to the URL query string
    if (getQuantityValue() != null) {
      try {
        joiner.add(String.format("%squantityValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantityValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

