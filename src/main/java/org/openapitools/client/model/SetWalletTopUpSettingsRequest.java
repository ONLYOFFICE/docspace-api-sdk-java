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
 * The part of the automatic top-up settings a payer chooses. The low-balance warning state is kept by the portal  itself and cannot be set here.
 */
@JsonPropertyOrder({
  SetWalletTopUpSettingsRequest.JSON_PROPERTY_ENABLED,
  SetWalletTopUpSettingsRequest.JSON_PROPERTY_MIN_BALANCE,
  SetWalletTopUpSettingsRequest.JSON_PROPERTY_UP_TO_BALANCE,
  SetWalletTopUpSettingsRequest.JSON_PROPERTY_CURRENCY,
  SetWalletTopUpSettingsRequest.JSON_PROPERTY_LOW_BALANCE_THRESHOLD,
  SetWalletTopUpSettingsRequest.JSON_PROPERTY_LOW_BALANCE_NOTIFIED,
  SetWalletTopUpSettingsRequest.JSON_PROPERTY_LAST_MODIFIED
})

public class SetWalletTopUpSettingsRequest {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable  private Boolean enabled;

  public static final String JSON_PROPERTY_MIN_BALANCE = "minBalance";
  @javax.annotation.Nullable  private Integer minBalance;

  public static final String JSON_PROPERTY_UP_TO_BALANCE = "upToBalance";
  @javax.annotation.Nullable  private Integer upToBalance;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOW_BALANCE_THRESHOLD = "lowBalanceThreshold";
  @javax.annotation.Nullable  private Integer lowBalanceThreshold;

  public static final String JSON_PROPERTY_LOW_BALANCE_NOTIFIED = "lowBalanceNotified";
  @javax.annotation.Nullable  private Boolean lowBalanceNotified;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private OffsetDateTime lastModified;

  public SetWalletTopUpSettingsRequest() {
  }


  public SetWalletTopUpSettingsRequest enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the payment method on file is charged automatically when the wallet balance runs low.
   * @return enabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public SetWalletTopUpSettingsRequest minBalance(@javax.annotation.Nullable Integer minBalance) {
    
    this.minBalance = minBalance;
    return this;
  }

  /**
   * The balance below which a top-up is charged, in `currency`.
   * minimum: 5
   * maximum: 1000
   * @return minBalance
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MIN_BALANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinBalance() {
    return minBalance;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_BALANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinBalance(@javax.annotation.Nullable Integer minBalance) {
    this.minBalance = minBalance;
  }

  public SetWalletTopUpSettingsRequest upToBalance(@javax.annotation.Nullable Integer upToBalance) {
    
    this.upToBalance = upToBalance;
    return this;
  }

  /**
   * The balance a top-up brings the wallet up to, in `currency`.
   * minimum: 6
   * maximum: 5000
   * @return upToBalance
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UP_TO_BALANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpToBalance() {
    return upToBalance;
  }


  @JsonProperty(value = JSON_PROPERTY_UP_TO_BALANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpToBalance(@javax.annotation.Nullable Integer upToBalance) {
    this.upToBalance = upToBalance;
  }

  public SetWalletTopUpSettingsRequest currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The three-letter ISO 4217 code both amounts are expressed in; it has to be the currency of the wallet.
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

  public SetWalletTopUpSettingsRequest lowBalanceThreshold(@javax.annotation.Nullable Integer lowBalanceThreshold) {
    
    this.lowBalanceThreshold = lowBalanceThreshold;
    return this;
  }

  /**
   * Accepted for compatibility with earlier clients and not read: the server keeps its own value.
   * @return lowBalanceThreshold
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOW_BALANCE_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLowBalanceThreshold() {
    return lowBalanceThreshold;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW_BALANCE_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowBalanceThreshold(@javax.annotation.Nullable Integer lowBalanceThreshold) {
    this.lowBalanceThreshold = lowBalanceThreshold;
  }

  public SetWalletTopUpSettingsRequest lowBalanceNotified(@javax.annotation.Nullable Boolean lowBalanceNotified) {
    
    this.lowBalanceNotified = lowBalanceNotified;
    return this;
  }

  /**
   * Accepted for compatibility with earlier clients and not read: the server keeps its own value.
   * @return lowBalanceNotified
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOW_BALANCE_NOTIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLowBalanceNotified() {
    return lowBalanceNotified;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW_BALANCE_NOTIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowBalanceNotified(@javax.annotation.Nullable Boolean lowBalanceNotified) {
    this.lowBalanceNotified = lowBalanceNotified;
  }

  public SetWalletTopUpSettingsRequest lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Accepted for compatibility with earlier clients and not read: the server keeps its own value.
   * @return lastModified
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetWalletTopUpSettingsRequest setWalletTopUpSettingsRequest = (SetWalletTopUpSettingsRequest) o;
    return Objects.equals(this.enabled, setWalletTopUpSettingsRequest.enabled) &&
        Objects.equals(this.minBalance, setWalletTopUpSettingsRequest.minBalance) &&
        Objects.equals(this.upToBalance, setWalletTopUpSettingsRequest.upToBalance) &&
        equalsNullable(this.currency, setWalletTopUpSettingsRequest.currency) &&
        Objects.equals(this.lowBalanceThreshold, setWalletTopUpSettingsRequest.lowBalanceThreshold) &&
        Objects.equals(this.lowBalanceNotified, setWalletTopUpSettingsRequest.lowBalanceNotified) &&
        Objects.equals(this.lastModified, setWalletTopUpSettingsRequest.lastModified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, minBalance, upToBalance, hashCodeNullable(currency), lowBalanceThreshold, lowBalanceNotified, lastModified);
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
    sb.append("class SetWalletTopUpSettingsRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minBalance: ").append(toIndentedString(minBalance)).append("\n");
    sb.append("    upToBalance: ").append(toIndentedString(upToBalance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    lowBalanceThreshold: ").append(toIndentedString(lowBalanceThreshold)).append("\n");
    sb.append("    lowBalanceNotified: ").append(toIndentedString(lowBalanceNotified)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `minBalance` to the URL query string
    if (getMinBalance() != null) {
      try {
        joiner.add(String.format("%sminBalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinBalance()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `upToBalance` to the URL query string
    if (getUpToBalance() != null) {
      try {
        joiner.add(String.format("%supToBalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpToBalance()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `lowBalanceThreshold` to the URL query string
    if (getLowBalanceThreshold() != null) {
      try {
        joiner.add(String.format("%slowBalanceThreshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLowBalanceThreshold()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lowBalanceNotified` to the URL query string
    if (getLowBalanceNotified() != null) {
      try {
        joiner.add(String.format("%slowBalanceNotified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLowBalanceNotified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

