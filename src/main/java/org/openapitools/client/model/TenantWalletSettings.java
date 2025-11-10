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
 * The tenant wallet settings.
 */
@JsonPropertyOrder({
  TenantWalletSettings.JSON_PROPERTY_ENABLED,
  TenantWalletSettings.JSON_PROPERTY_MIN_BALANCE,
  TenantWalletSettings.JSON_PROPERTY_UP_TO_BALANCE,
  TenantWalletSettings.JSON_PROPERTY_CURRENCY,
  TenantWalletSettings.JSON_PROPERTY_LAST_MODIFIED
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class TenantWalletSettings {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_MIN_BALANCE = "minBalance";
  @javax.annotation.Nullable
  private Integer minBalance;

  public static final String JSON_PROPERTY_UP_TO_BALANCE = "upToBalance";
  @javax.annotation.Nullable
  private Integer upToBalance;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable
  private OffsetDateTime lastModified;

  public TenantWalletSettings() {
  }

  public TenantWalletSettings enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Specifies whether automatic top-up for the tenant wallet is enabled.
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public TenantWalletSettings minBalance(@javax.annotation.Nullable Integer minBalance) {
    
    this.minBalance = minBalance;
    return this;
  }

  /**
   * The minimum wallet balance at which automatic top-up will be triggered. Must be between 5 and 1000.
   * minimum: 5
   * maximum: 1000
   * @return minBalance
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinBalance() {
    return minBalance;
  }


  @JsonProperty(JSON_PROPERTY_MIN_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinBalance(@javax.annotation.Nullable Integer minBalance) {
    this.minBalance = minBalance;
  }

  public TenantWalletSettings upToBalance(@javax.annotation.Nullable Integer upToBalance) {
    
    this.upToBalance = upToBalance;
    return this;
  }

  /**
   * The maximum wallet balance at which automatic top-up will be triggered. Must be between 6 and 5000.
   * minimum: 6
   * maximum: 5000
   * @return upToBalance
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UP_TO_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpToBalance() {
    return upToBalance;
  }


  @JsonProperty(JSON_PROPERTY_UP_TO_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpToBalance(@javax.annotation.Nullable Integer upToBalance) {
    this.upToBalance = upToBalance;
  }

  public TenantWalletSettings currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The three-character ISO 4217 currency symbol.
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
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

  public TenantWalletSettings lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time when the tenant wallet settings were last modified.
   * @return lastModified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
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
    TenantWalletSettings tenantWalletSettings = (TenantWalletSettings) o;
    return Objects.equals(this.enabled, tenantWalletSettings.enabled) &&
        Objects.equals(this.minBalance, tenantWalletSettings.minBalance) &&
        Objects.equals(this.upToBalance, tenantWalletSettings.upToBalance) &&
        equalsNullable(this.currency, tenantWalletSettings.currency) &&
        Objects.equals(this.lastModified, tenantWalletSettings.lastModified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, minBalance, upToBalance, hashCodeNullable(currency), lastModified);
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
    sb.append("class TenantWalletSettings {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minBalance: ").append(toIndentedString(minBalance)).append("\n");
    sb.append("    upToBalance: ").append(toIndentedString(upToBalance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

