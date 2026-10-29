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
import java.util.UUID;
import org.openapitools.client.model.ServiceLimitPeriod;
import org.openapitools.client.model.ServiceLimitScope;
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
 * The spending limit to create on the AI services: for the portal as a whole, for every user, or for one user.
 */
@JsonPropertyOrder({
  CreateServiceLimitRequestDto.JSON_PROPERTY_SCOPE,
  CreateServiceLimitRequestDto.JSON_PROPERTY_USER_ID,
  CreateServiceLimitRequestDto.JSON_PROPERTY_AMOUNT_VALUE,
  CreateServiceLimitRequestDto.JSON_PROPERTY_QUANTITY_VALUE,
  CreateServiceLimitRequestDto.JSON_PROPERTY_PERIOD
})

public class CreateServiceLimitRequestDto {
  public static final String JSON_PROPERTY_SCOPE = "scope";
  @javax.annotation.Nullable  private ServiceLimitScope scope;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private JsonNullable<UUID> userId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_AMOUNT_VALUE = "amountValue";
  @javax.annotation.Nullable  private JsonNullable<Double> amountValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_QUANTITY_VALUE = "quantityValue";
  @javax.annotation.Nullable  private JsonNullable<Integer> quantityValue = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable  private ServiceLimitPeriod period;

  public CreateServiceLimitRequestDto() {
  }


  public CreateServiceLimitRequestDto scope(@javax.annotation.Nullable ServiceLimitScope scope) {
    
    this.scope = scope;
    return this;
  }

  /**
   * Whom the limit applies to.
   * @return scope
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceLimitScope getScope() {
    return scope;
  }


  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(@javax.annotation.Nullable ServiceLimitScope scope) {
    this.scope = scope;
  }

  public CreateServiceLimitRequestDto userId(@javax.annotation.Nullable UUID userId) {
    this.userId = JsonNullable.<UUID>of(userId);
    
    return this;
  }

  /**
   * The ID of the portal user a personal limit is set for, as returned in `id` by the people operations.
   * @return userId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public UUID getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<UUID> userId) {
    this.userId = userId;
  }

  public void setUserId(@javax.annotation.Nullable UUID userId) {
    this.userId = JsonNullable.<UUID>of(userId);
  }

  public CreateServiceLimitRequestDto amountValue(@javax.annotation.Nullable Double amountValue) {
    this.amountValue = JsonNullable.<Double>of(amountValue);
    
    return this;
  }

  /**
   * The most money the AI services may cost per period, in their currency, which cannot be chosen. Zero blocks the  AI services completely.
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

  public CreateServiceLimitRequestDto quantityValue(@javax.annotation.Nullable Integer quantityValue) {
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

  public CreateServiceLimitRequestDto period(@javax.annotation.Nullable ServiceLimitPeriod period) {
    
    this.period = period;
    return this;
  }

  /**
   * The window the thresholds apply to, in UTC. A day, week or month is calendar-aligned rather than rolling - a  daily limit resets at midnight UTC, a weekly one on Monday - while a lifetime limit counts from its creation and  never resets.
   * @return period
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceLimitPeriod getPeriod() {
    return period;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(@javax.annotation.Nullable ServiceLimitPeriod period) {
    this.period = period;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceLimitRequestDto createServiceLimitRequestDto = (CreateServiceLimitRequestDto) o;
    return Objects.equals(this.scope, createServiceLimitRequestDto.scope) &&
        equalsNullable(this.userId, createServiceLimitRequestDto.userId) &&
        equalsNullable(this.amountValue, createServiceLimitRequestDto.amountValue) &&
        equalsNullable(this.quantityValue, createServiceLimitRequestDto.quantityValue) &&
        Objects.equals(this.period, createServiceLimitRequestDto.period);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, hashCodeNullable(userId), hashCodeNullable(amountValue), hashCodeNullable(quantityValue), period);
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
    sb.append("class CreateServiceLimitRequestDto {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
    sb.append("    quantityValue: ").append(toIndentedString(quantityValue)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

    // add `scope` to the URL query string
    if (getScope() != null) {
      try {
        joiner.add(String.format("%sscope%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScope()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `period` to the URL query string
    if (getPeriod() != null) {
      try {
        joiner.add(String.format("%speriod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

