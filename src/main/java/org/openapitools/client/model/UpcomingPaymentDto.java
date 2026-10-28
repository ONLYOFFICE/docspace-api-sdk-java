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
 * One charge the portal is going to be billed for at the start of the next period.
 */
@JsonPropertyOrder({
  UpcomingPaymentDto.JSON_PROPERTY_ID,
  UpcomingPaymentDto.JSON_PROPERTY_NAME,
  UpcomingPaymentDto.JSON_PROPERTY_TITLE,
  UpcomingPaymentDto.JSON_PROPERTY_UNIT_OF_MEASURE,
  UpcomingPaymentDto.JSON_PROPERTY_QUANTITY,
  UpcomingPaymentDto.JSON_PROPERTY_WALLET,
  UpcomingPaymentDto.JSON_PROPERTY_DUE_DATE,
  UpcomingPaymentDto.JSON_PROPERTY_AMOUNT,
  UpcomingPaymentDto.JSON_PROPERTY_CURRENCY
})

public class UpcomingPaymentDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIT_OF_MEASURE = "unitOfMeasure";
  @javax.annotation.Nullable  private JsonNullable<String> unitOfMeasure = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nullable  private Integer quantity;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  @javax.annotation.Nullable  private Boolean wallet;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  @javax.annotation.Nullable  private ApiDateTime dueDate;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable  private Double amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public UpcomingPaymentDto() {
  }


  public UpcomingPaymentDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The quota that is going to be charged. When a switch to another quota is scheduled, this is the quota  being switched to, so it can differ from what `GET api/2.0/portal/tariff` reports for today.
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

  public UpcomingPaymentDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The quota's stable key, which is the same identifier the wallet operations use for a service.
   * @return name
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public UpcomingPaymentDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The quota name in the portal language, meant to be printed on an invoice preview.
   * @return title
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public UpcomingPaymentDto unitOfMeasure(@javax.annotation.Nullable String unitOfMeasure) {
    this.unitOfMeasure = JsonNullable.<String>of(unitOfMeasure);
    
    return this;
  }

  /**
   * What `quantity` counts, in the portal language - seats, administrators, gigabytes. It is empty for a quota  that is simply on or off.
   * @return unitOfMeasure
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUnitOfMeasure() {
        return unitOfMeasure.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_UNIT_OF_MEASURE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUnitOfMeasure_JsonNullable() {
    return unitOfMeasure;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASURE)
  public void setUnitOfMeasure_JsonNullable(JsonNullable<String> unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public void setUnitOfMeasure(@javax.annotation.Nullable String unitOfMeasure) {
    this.unitOfMeasure = JsonNullable.<String>of(unitOfMeasure);
  }

  public UpcomingPaymentDto quantity(@javax.annotation.Nullable Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

  /**
   * How much is going to be charged for, which is the quantity scheduled for the next period when one has been  scheduled and today's quantity otherwise.
   * @return quantity
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuantity() {
    return quantity;
  }


  @JsonProperty(value = JSON_PROPERTY_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantity(@javax.annotation.Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public UpcomingPaymentDto wallet(@javax.annotation.Nullable Boolean wallet) {
    
    this.wallet = wallet;
    return this;
  }

  /**
   * Whether the charge is paid out of the portal wallet rather than from the subscription.
   * @return wallet
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WALLET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWallet() {
    return wallet;
  }


  @JsonProperty(value = JSON_PROPERTY_WALLET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWallet(@javax.annotation.Nullable Boolean wallet) {
    this.wallet = wallet;
  }

  public UpcomingPaymentDto dueDate(@javax.annotation.Nullable ApiDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

  /**
   * When the charge falls due, in the portal time zone.
   * @return dueDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDueDate() {
    return dueDate;
  }


  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueDate(@javax.annotation.Nullable ApiDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public UpcomingPaymentDto amount(@javax.annotation.Nullable Double amount) {
    
    this.amount = amount;
    return this;
  }

  /**
   * What the charge comes to: the unit price of the quota multiplied by `quantity`. Taxes are not part of it,  and a quota with no price of its own is not listed at all rather than listed with a zero.
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

  public UpcomingPaymentDto currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The currency `amount` is expressed in, as a three-letter ISO 4217 code. It follows the portal's billing  account, so every entry of one answer carries the same code.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpcomingPaymentDto upcomingPaymentDto = (UpcomingPaymentDto) o;
    return Objects.equals(this.id, upcomingPaymentDto.id) &&
        equalsNullable(this.name, upcomingPaymentDto.name) &&
        equalsNullable(this.title, upcomingPaymentDto.title) &&
        equalsNullable(this.unitOfMeasure, upcomingPaymentDto.unitOfMeasure) &&
        Objects.equals(this.quantity, upcomingPaymentDto.quantity) &&
        Objects.equals(this.wallet, upcomingPaymentDto.wallet) &&
        Objects.equals(this.dueDate, upcomingPaymentDto.dueDate) &&
        Objects.equals(this.amount, upcomingPaymentDto.amount) &&
        equalsNullable(this.currency, upcomingPaymentDto.currency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(title), hashCodeNullable(unitOfMeasure), quantity, wallet, dueDate, amount, hashCodeNullable(currency));
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
    sb.append("class UpcomingPaymentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unitOfMeasure` to the URL query string
    if (getUnitOfMeasure() != null) {
      try {
        joiner.add(String.format("%sunitOfMeasure%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnitOfMeasure()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `wallet` to the URL query string
    if (getWallet() != null) {
      try {
        joiner.add(String.format("%swallet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWallet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dueDate` to the URL query string
    if (getDueDate() != null) {
      joiner.add(getDueDate().toUrlQueryString(prefix + "dueDate" + suffix));
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

    return joiner.toString();
  }

}

