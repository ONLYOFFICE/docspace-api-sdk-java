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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.OperationStatus;
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
 * One payment into the portal wallet: when it was made, how much it brought in, how it ended, and whether an  invoice stands behind it.
 */
@JsonPropertyOrder({
  DepositDto.JSON_PROPERTY_ID,
  DepositDto.JSON_PROPERTY_DATE,
  DepositDto.JSON_PROPERTY_AMOUNT,
  DepositDto.JSON_PROPERTY_CURRENCY,
  DepositDto.JSON_PROPERTY_STATUS,
  DepositDto.JSON_PROPERTY_HAS_INVOICE
})

public class DepositDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Long id;

  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nullable  private ApiDateTime date;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable  private Double amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private OperationStatus status;

  public static final String JSON_PROPERTY_HAS_INVOICE = "hasInvoice";
  @javax.annotation.Nullable  private Boolean hasInvoice;

  public DepositDto() {
  }


  public DepositDto id(@javax.annotation.Nullable Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * The identifier of the top-up, which is what `GET api/2.0/portal/payment/customer/deposits/{id}/invoice` takes  to read its invoice.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Long id) {
    this.id = id;
  }

  public DepositDto date(@javax.annotation.Nullable ApiDateTime date) {
    
    this.date = date;
    return this;
  }

  /**
   * When the top-up was booked, as an ISO 8601 timestamp that carries its own offset: that of the portal's time  zone, written as `Z` for a portal in UTC - the zone in which `startDate` and `endDate` without an offset are  read.
   * @return date
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(@javax.annotation.Nullable ApiDateTime date) {
    this.date = date;
  }

  public DepositDto amount(@javax.annotation.Nullable Double amount) {
    
    this.amount = amount;
    return this;
  }

  /**
   * The amount that went into the wallet, in `currency`.
   * @return amount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AMOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAmount() {
    return amount;
  }


  @JsonProperty(value = JSON_PROPERTY_AMOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(@javax.annotation.Nullable Double amount) {
    this.amount = amount;
  }

  public DepositDto currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The currency `amount` is expressed in, as a three-letter ISO 4217 code - the accounting currency of the  wallet.
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

  public DepositDto status(@javax.annotation.Nullable OperationStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * How the top-up ended. A pending one is still being settled and may change later, so only a completed one has  actually raised the balance.
   * @return status
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable OperationStatus status) {
    this.status = status;
  }

  public DepositDto hasInvoice(@javax.annotation.Nullable Boolean hasInvoice) {
    
    this.hasInvoice = hasInvoice;
    return this;
  }

  /**
   * Whether the billing provider holds an invoice for the payment behind the top-up, which is when  `GET api/2.0/portal/payment/customer/deposits/{id}/invoice` can open it. It is `false` for a top-up whose  payment came without one, and asking for its invoice then fails with 404.
   * @return hasInvoice
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HAS_INVOICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasInvoice() {
    return hasInvoice;
  }


  @JsonProperty(value = JSON_PROPERTY_HAS_INVOICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasInvoice(@javax.annotation.Nullable Boolean hasInvoice) {
    this.hasInvoice = hasInvoice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositDto depositDto = (DepositDto) o;
    return Objects.equals(this.id, depositDto.id) &&
        Objects.equals(this.date, depositDto.date) &&
        Objects.equals(this.amount, depositDto.amount) &&
        equalsNullable(this.currency, depositDto.currency) &&
        Objects.equals(this.status, depositDto.status) &&
        Objects.equals(this.hasInvoice, depositDto.hasInvoice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, amount, hashCodeNullable(currency), status, hasInvoice);
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
    sb.append("class DepositDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hasInvoice: ").append(toIndentedString(hasInvoice)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(getDate().toUrlQueryString(prefix + "date" + suffix));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hasInvoice` to the URL query string
    if (getHasInvoice() != null) {
      try {
        joiner.add(String.format("%shasInvoice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasInvoice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

