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
 * The information about the current subscription and its unused balance.
 */
@JsonPropertyOrder({
  SubscriptionBalanceInfo.JSON_PROPERTY_TOTAL_COST,
  SubscriptionBalanceInfo.JSON_PROPERTY_CURRENCY,
  SubscriptionBalanceInfo.JSON_PROPERTY_PERIOD_START,
  SubscriptionBalanceInfo.JSON_PROPERTY_PERIOD_END,
  SubscriptionBalanceInfo.JSON_PROPERTY_PERIOD_USED_UNTIL,
  SubscriptionBalanceInfo.JSON_PROPERTY_DAYS_ELAPSED,
  SubscriptionBalanceInfo.JSON_PROPERTY_REMAINING_BALANCE,
  SubscriptionBalanceInfo.JSON_PROPERTY_REMAINING_BALANCE_IN_WALLET_CURRENCY,
  SubscriptionBalanceInfo.JSON_PROPERTY_WALLET_CURRENCY
})

public class SubscriptionBalanceInfo {
  public static final String JSON_PROPERTY_TOTAL_COST = "totalCost";
  @javax.annotation.Nullable  private Double totalCost;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERIOD_START = "periodStart";
  @javax.annotation.Nullable  private OffsetDateTime periodStart;

  public static final String JSON_PROPERTY_PERIOD_END = "periodEnd";
  @javax.annotation.Nullable  private OffsetDateTime periodEnd;

  public static final String JSON_PROPERTY_PERIOD_USED_UNTIL = "periodUsedUntil";
  @javax.annotation.Nullable  private OffsetDateTime periodUsedUntil;

  public static final String JSON_PROPERTY_DAYS_ELAPSED = "daysElapsed";
  @javax.annotation.Nullable  private Integer daysElapsed;

  public static final String JSON_PROPERTY_REMAINING_BALANCE = "remainingBalance";
  @javax.annotation.Nullable  private Double remainingBalance;

  public static final String JSON_PROPERTY_REMAINING_BALANCE_IN_WALLET_CURRENCY = "remainingBalanceInWalletCurrency";
  @javax.annotation.Nullable  private Double remainingBalanceInWalletCurrency;

  public static final String JSON_PROPERTY_WALLET_CURRENCY = "walletCurrency";
  @javax.annotation.Nullable  private JsonNullable<String> walletCurrency = JsonNullable.<String>undefined();

  public SubscriptionBalanceInfo() {
  }


  public SubscriptionBalanceInfo totalCost(@javax.annotation.Nullable Double totalCost) {
    
    this.totalCost = totalCost;
    return this;
  }

  /**
   * The total cost of the current billing period (the sum across all subscription items).
   * @return totalCost
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOTAL_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTotalCost() {
    return totalCost;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCost(@javax.annotation.Nullable Double totalCost) {
    this.totalCost = totalCost;
  }

  public SubscriptionBalanceInfo currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The three-character ISO 4217 currency symbol of the subscription.
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

  public SubscriptionBalanceInfo periodStart(@javax.annotation.Nullable OffsetDateTime periodStart) {
    
    this.periodStart = periodStart;
    return this;
  }

  /**
   * The start of the current billing period.
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

  public SubscriptionBalanceInfo periodEnd(@javax.annotation.Nullable OffsetDateTime periodEnd) {
    
    this.periodEnd = periodEnd;
    return this;
  }

  /**
   * The end of the current billing period.
   * @return periodEnd
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PERIOD_END, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPeriodEnd() {
    return periodEnd;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD_END, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodEnd(@javax.annotation.Nullable OffsetDateTime periodEnd) {
    this.periodEnd = periodEnd;
  }

  public SubscriptionBalanceInfo periodUsedUntil(@javax.annotation.Nullable OffsetDateTime periodUsedUntil) {
    
    this.periodUsedUntil = periodUsedUntil;
    return this;
  }

  /**
   * The boundary of the used part of the period (the moment of the request).
   * @return periodUsedUntil
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PERIOD_USED_UNTIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPeriodUsedUntil() {
    return periodUsedUntil;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD_USED_UNTIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodUsedUntil(@javax.annotation.Nullable OffsetDateTime periodUsedUntil) {
    this.periodUsedUntil = periodUsedUntil;
  }

  public SubscriptionBalanceInfo daysElapsed(@javax.annotation.Nullable Integer daysElapsed) {
    
    this.daysElapsed = daysElapsed;
    return this;
  }

  /**
   * The number of days elapsed since the start of the period (inclusive).
   * @return daysElapsed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DAYS_ELAPSED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDaysElapsed() {
    return daysElapsed;
  }


  @JsonProperty(value = JSON_PROPERTY_DAYS_ELAPSED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDaysElapsed(@javax.annotation.Nullable Integer daysElapsed) {
    this.daysElapsed = daysElapsed;
  }

  public SubscriptionBalanceInfo remainingBalance(@javax.annotation.Nullable Double remainingBalance) {
    
    this.remainingBalance = remainingBalance;
    return this;
  }

  /**
   * The unused balance of the subscription, in the subscription currency.
   * @return remainingBalance
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REMAINING_BALANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRemainingBalance() {
    return remainingBalance;
  }


  @JsonProperty(value = JSON_PROPERTY_REMAINING_BALANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainingBalance(@javax.annotation.Nullable Double remainingBalance) {
    this.remainingBalance = remainingBalance;
  }

  public SubscriptionBalanceInfo remainingBalanceInWalletCurrency(@javax.annotation.Nullable Double remainingBalanceInWalletCurrency) {
    
    this.remainingBalanceInWalletCurrency = remainingBalanceInWalletCurrency;
    return this;
  }

  /**
   * The unused balance of the subscription, converted to the wallet currency.
   * @return remainingBalanceInWalletCurrency
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REMAINING_BALANCE_IN_WALLET_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRemainingBalanceInWalletCurrency() {
    return remainingBalanceInWalletCurrency;
  }


  @JsonProperty(value = JSON_PROPERTY_REMAINING_BALANCE_IN_WALLET_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainingBalanceInWalletCurrency(@javax.annotation.Nullable Double remainingBalanceInWalletCurrency) {
    this.remainingBalanceInWalletCurrency = remainingBalanceInWalletCurrency;
  }

  public SubscriptionBalanceInfo walletCurrency(@javax.annotation.Nullable String walletCurrency) {
    this.walletCurrency = JsonNullable.<String>of(walletCurrency);
    
    return this;
  }

  /**
   * The three-character ISO 4217 currency symbol of the wallet.
   * @return walletCurrency
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getWalletCurrency() {
        return walletCurrency.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WALLET_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getWalletCurrency_JsonNullable() {
    return walletCurrency;
  }
  
  @JsonProperty(JSON_PROPERTY_WALLET_CURRENCY)
  public void setWalletCurrency_JsonNullable(JsonNullable<String> walletCurrency) {
    this.walletCurrency = walletCurrency;
  }

  public void setWalletCurrency(@javax.annotation.Nullable String walletCurrency) {
    this.walletCurrency = JsonNullable.<String>of(walletCurrency);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionBalanceInfo subscriptionBalanceInfo = (SubscriptionBalanceInfo) o;
    return Objects.equals(this.totalCost, subscriptionBalanceInfo.totalCost) &&
        equalsNullable(this.currency, subscriptionBalanceInfo.currency) &&
        Objects.equals(this.periodStart, subscriptionBalanceInfo.periodStart) &&
        Objects.equals(this.periodEnd, subscriptionBalanceInfo.periodEnd) &&
        Objects.equals(this.periodUsedUntil, subscriptionBalanceInfo.periodUsedUntil) &&
        Objects.equals(this.daysElapsed, subscriptionBalanceInfo.daysElapsed) &&
        Objects.equals(this.remainingBalance, subscriptionBalanceInfo.remainingBalance) &&
        Objects.equals(this.remainingBalanceInWalletCurrency, subscriptionBalanceInfo.remainingBalanceInWalletCurrency) &&
        equalsNullable(this.walletCurrency, subscriptionBalanceInfo.walletCurrency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCost, hashCodeNullable(currency), periodStart, periodEnd, periodUsedUntil, daysElapsed, remainingBalance, remainingBalanceInWalletCurrency, hashCodeNullable(walletCurrency));
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
    sb.append("class SubscriptionBalanceInfo {\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    periodUsedUntil: ").append(toIndentedString(periodUsedUntil)).append("\n");
    sb.append("    daysElapsed: ").append(toIndentedString(daysElapsed)).append("\n");
    sb.append("    remainingBalance: ").append(toIndentedString(remainingBalance)).append("\n");
    sb.append("    remainingBalanceInWalletCurrency: ").append(toIndentedString(remainingBalanceInWalletCurrency)).append("\n");
    sb.append("    walletCurrency: ").append(toIndentedString(walletCurrency)).append("\n");
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

    // add `totalCost` to the URL query string
    if (getTotalCost() != null) {
      try {
        joiner.add(String.format("%stotalCost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalCost()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `periodUsedUntil` to the URL query string
    if (getPeriodUsedUntil() != null) {
      try {
        joiner.add(String.format("%speriodUsedUntil%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriodUsedUntil()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `daysElapsed` to the URL query string
    if (getDaysElapsed() != null) {
      try {
        joiner.add(String.format("%sdaysElapsed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDaysElapsed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `remainingBalance` to the URL query string
    if (getRemainingBalance() != null) {
      try {
        joiner.add(String.format("%sremainingBalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemainingBalance()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `remainingBalanceInWalletCurrency` to the URL query string
    if (getRemainingBalanceInWalletCurrency() != null) {
      try {
        joiner.add(String.format("%sremainingBalanceInWalletCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemainingBalanceInWalletCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `walletCurrency` to the URL query string
    if (getWalletCurrency() != null) {
      try {
        joiner.add(String.format("%swalletCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalletCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

