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
 * The spending limit on the AI services in force for one user: the user's personal limit, or else the limit for every  user, together with the money the user spent against it in the current period.
 */
@JsonPropertyOrder({
  UserServiceLimitDto.JSON_PROPERTY_ID,
  UserServiceLimitDto.JSON_PROPERTY_SCOPE,
  UserServiceLimitDto.JSON_PROPERTY_AMOUNT_VALUE,
  UserServiceLimitDto.JSON_PROPERTY_AMOUNT_CONSUMED,
  UserServiceLimitDto.JSON_PROPERTY_CURRENCY,
  UserServiceLimitDto.JSON_PROPERTY_PERIOD,
  UserServiceLimitDto.JSON_PROPERTY_PERIOD_END
})

public class UserServiceLimitDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @javax.annotation.Nullable  private ServiceLimitScope scope;

  public static final String JSON_PROPERTY_AMOUNT_VALUE = "amountValue";
  @javax.annotation.Nullable  private JsonNullable<Double> amountValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_AMOUNT_CONSUMED = "amountConsumed";
  @javax.annotation.Nullable  private Double amountConsumed;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable  private ServiceLimitPeriod period;

  public static final String JSON_PROPERTY_PERIOD_END = "periodEnd";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> periodEnd = JsonNullable.<OffsetDateTime>undefined();

  public UserServiceLimitDto() {
  }


  public UserServiceLimitDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The service limit ID, used to read, change, switch off or delete the limit through the  `api/2.0/portal/payment/servicelimit` operations. For the limit for every user it is the same for all users.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public UserServiceLimitDto scope(@javax.annotation.Nullable ServiceLimitScope scope) {
    
    this.scope = scope;
    return this;
  }

  /**
   * Whether the limit is the user's own (`Custom`) or the limit for every user (`Global`) the user falls back to.
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

  public UserServiceLimitDto amountValue(@javax.annotation.Nullable Double amountValue) {
    this.amountValue = JsonNullable.<Double>of(amountValue);
    
    return this;
  }

  /**
   * The most money the AI services may cost the user per period, in `currency`. It is the only threshold a limit on  the AI services has: their services count in different units, so a threshold on a quantity is refused for them.
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

  public UserServiceLimitDto amountConsumed(@javax.annotation.Nullable Double amountConsumed) {
    
    this.amountConsumed = amountConsumed;
    return this;
  }

  /**
   * The money the AI services cost the user in the current period, in `currency`; 0 when nothing was spent yet,  including a user who has never used the AI services.
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

  public UserServiceLimitDto currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The currency `amountValue` and `amountConsumed` are expressed in; null when the limit has no money threshold.
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

  public UserServiceLimitDto period(@javax.annotation.Nullable ServiceLimitPeriod period) {
    
    this.period = period;
    return this;
  }

  /**
   * The window the threshold applies to. It resets at the start of the next day, week or month in UTC (a week on  Monday), not a fixed time after the first charge; a lifetime limit never resets.
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

  public UserServiceLimitDto periodEnd(@javax.annotation.Nullable OffsetDateTime periodEnd) {
    this.periodEnd = JsonNullable.<OffsetDateTime>of(periodEnd);
    
    return this;
  }

  /**
   * The moment the current period ends and the spending starts over from zero, in UTC. Null for a lifetime limit,  which never resets.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserServiceLimitDto userServiceLimitDto = (UserServiceLimitDto) o;
    return Objects.equals(this.id, userServiceLimitDto.id) &&
        Objects.equals(this.scope, userServiceLimitDto.scope) &&
        equalsNullable(this.amountValue, userServiceLimitDto.amountValue) &&
        Objects.equals(this.amountConsumed, userServiceLimitDto.amountConsumed) &&
        equalsNullable(this.currency, userServiceLimitDto.currency) &&
        Objects.equals(this.period, userServiceLimitDto.period) &&
        equalsNullable(this.periodEnd, userServiceLimitDto.periodEnd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scope, hashCodeNullable(amountValue), amountConsumed, hashCodeNullable(currency), period, hashCodeNullable(periodEnd));
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
    sb.append("class UserServiceLimitDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
    sb.append("    amountConsumed: ").append(toIndentedString(amountConsumed)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
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

    // add `scope` to the URL query string
    if (getScope() != null) {
      try {
        joiner.add(String.format("%sscope%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScope()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `amountConsumed` to the URL query string
    if (getAmountConsumed() != null) {
      try {
        joiner.add(String.format("%samountConsumed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountConsumed()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `period` to the URL query string
    if (getPeriod() != null) {
      try {
        joiner.add(String.format("%speriod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriod()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

