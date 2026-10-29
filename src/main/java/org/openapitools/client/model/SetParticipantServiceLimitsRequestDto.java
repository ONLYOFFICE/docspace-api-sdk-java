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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.ServiceLimitPeriod;
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
 * The personal spending limit on the AI services to set for each of several portal users.
 */
@JsonPropertyOrder({
  SetParticipantServiceLimitsRequestDto.JSON_PROPERTY_USER_IDS,
  SetParticipantServiceLimitsRequestDto.JSON_PROPERTY_AMOUNT_VALUE,
  SetParticipantServiceLimitsRequestDto.JSON_PROPERTY_QUANTITY_VALUE,
  SetParticipantServiceLimitsRequestDto.JSON_PROPERTY_PERIOD
})

public class SetParticipantServiceLimitsRequestDto {
  public static final String JSON_PROPERTY_USER_IDS = "userIds";
  @javax.annotation.Nonnull  private List<UUID> userIds = new ArrayList<>();

  public static final String JSON_PROPERTY_AMOUNT_VALUE = "amountValue";
  @javax.annotation.Nullable  private JsonNullable<Double> amountValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_QUANTITY_VALUE = "quantityValue";
  @javax.annotation.Nullable  private JsonNullable<Integer> quantityValue = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable  private ServiceLimitPeriod period;

  public SetParticipantServiceLimitsRequestDto() {
  }


  public SetParticipantServiceLimitsRequestDto userIds(@javax.annotation.Nonnull List<UUID> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public SetParticipantServiceLimitsRequestDto addUserIdsItem(UUID userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * The IDs of the portal users the limit is set for, as returned in `id` by the people operations.
   * @return userIds
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_USER_IDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UUID> getUserIds() {
    return userIds;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_IDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserIds(@javax.annotation.Nonnull List<UUID> userIds) {
    this.userIds = userIds;
  }

  public SetParticipantServiceLimitsRequestDto amountValue(@javax.annotation.Nullable Double amountValue) {
    this.amountValue = JsonNullable.<Double>of(amountValue);
    
    return this;
  }

  /**
   * The most money the AI services may cost each user per period, in their currency, which cannot be chosen. Zero  blocks the AI services completely.
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

  public SetParticipantServiceLimitsRequestDto quantityValue(@javax.annotation.Nullable Integer quantityValue) {
    this.quantityValue = JsonNullable.<Integer>of(quantityValue);
    
    return this;
  }

  /**
   * The largest quantity the AI services may consume per period for each user, in their common unit. Zero blocks the  AI services completely.
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

  public SetParticipantServiceLimitsRequestDto period(@javax.annotation.Nullable ServiceLimitPeriod period) {
    
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
    SetParticipantServiceLimitsRequestDto setParticipantServiceLimitsRequestDto = (SetParticipantServiceLimitsRequestDto) o;
    return Objects.equals(this.userIds, setParticipantServiceLimitsRequestDto.userIds) &&
        equalsNullable(this.amountValue, setParticipantServiceLimitsRequestDto.amountValue) &&
        equalsNullable(this.quantityValue, setParticipantServiceLimitsRequestDto.quantityValue) &&
        Objects.equals(this.period, setParticipantServiceLimitsRequestDto.period);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, hashCodeNullable(amountValue), hashCodeNullable(quantityValue), period);
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
    sb.append("class SetParticipantServiceLimitsRequestDto {\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

    // add `userIds` to the URL query string
    if (getUserIds() != null) {
      for (int i = 0; i < getUserIds().size(); i++) {
        if (getUserIds().get(i) != null) {
          try {
            joiner.add(String.format("%suserIds%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getUserIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
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

