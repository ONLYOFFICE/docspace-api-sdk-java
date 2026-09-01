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
 * Represents the payment information of a DocsCloud tenant.
 */
@JsonPropertyOrder({
  DocsCloudPayment.JSON_PROPERTY_CART_ID,
  DocsCloudPayment.JSON_PROPERTY_PRODUCT_ID,
  DocsCloudPayment.JSON_PROPERTY_STATUS,
  DocsCloudPayment.JSON_PROPERTY_INTERVAL_UNIT,
  DocsCloudPayment.JSON_PROPERTY_IS_YEAR,
  DocsCloudPayment.JSON_PROPERTY_IS_PREPAID,
  DocsCloudPayment.JSON_PROPERTY_QUANTITY,
  DocsCloudPayment.JSON_PROPERTY_CURRENCY
})

public class DocsCloudPayment {
  public static final String JSON_PROPERTY_CART_ID = "cartId";
  @javax.annotation.Nullable  private JsonNullable<String> cartId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  @javax.annotation.Nullable  private Integer productId;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private Integer status;

  public static final String JSON_PROPERTY_INTERVAL_UNIT = "intervalUnit";
  @javax.annotation.Nullable  private Integer intervalUnit;

  public static final String JSON_PROPERTY_IS_YEAR = "isYear";
  @javax.annotation.Nullable  private Boolean isYear;

  public static final String JSON_PROPERTY_IS_PREPAID = "isPrepaid";
  @javax.annotation.Nullable  private Boolean isPrepaid;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nullable  private Integer quantity;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public DocsCloudPayment() {
  }


  public DocsCloudPayment cartId(@javax.annotation.Nullable String cartId) {
    this.cartId = JsonNullable.<String>of(cartId);
    
    return this;
  }

  /**
   * The cart ID.
   * @return cartId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCartId() {
        return cartId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CART_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCartId_JsonNullable() {
    return cartId;
  }
  
  @JsonProperty(JSON_PROPERTY_CART_ID)
  public void setCartId_JsonNullable(JsonNullable<String> cartId) {
    this.cartId = cartId;
  }

  public void setCartId(@javax.annotation.Nullable String cartId) {
    this.cartId = JsonNullable.<String>of(cartId);
  }

  public DocsCloudPayment productId(@javax.annotation.Nullable Integer productId) {
    
    this.productId = productId;
    return this;
  }

  /**
   * The product ID.
   * @return productId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRODUCT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProductId() {
    return productId;
  }


  @JsonProperty(value = JSON_PROPERTY_PRODUCT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductId(@javax.annotation.Nullable Integer productId) {
    this.productId = productId;
  }

  public DocsCloudPayment status(@javax.annotation.Nullable Integer status) {
    
    this.status = status;
    return this;
  }

  /**
   * The payment status.
   * @return status
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable Integer status) {
    this.status = status;
  }

  public DocsCloudPayment intervalUnit(@javax.annotation.Nullable Integer intervalUnit) {
    
    this.intervalUnit = intervalUnit;
    return this;
  }

  /**
   * The interval unit.
   * @return intervalUnit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INTERVAL_UNIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIntervalUnit() {
    return intervalUnit;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERVAL_UNIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalUnit(@javax.annotation.Nullable Integer intervalUnit) {
    this.intervalUnit = intervalUnit;
  }

  public DocsCloudPayment isYear(@javax.annotation.Nullable Boolean isYear) {
    
    this.isYear = isYear;
    return this;
  }

  /**
   * Whether the payment interval is yearly.
   * @return isYear
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsYear() {
    return isYear;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsYear(@javax.annotation.Nullable Boolean isYear) {
    this.isYear = isYear;
  }

  public DocsCloudPayment isPrepaid(@javax.annotation.Nullable Boolean isPrepaid) {
    
    this.isPrepaid = isPrepaid;
    return this;
  }

  /**
   * Whether the payment is prepaid.
   * @return isPrepaid
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_PREPAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrepaid() {
    return isPrepaid;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_PREPAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrepaid(@javax.annotation.Nullable Boolean isPrepaid) {
    this.isPrepaid = isPrepaid;
  }

  public DocsCloudPayment quantity(@javax.annotation.Nullable Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity.
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

  public DocsCloudPayment currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The three-character ISO 4217 currency symbol of the payment.
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
    DocsCloudPayment docsCloudPayment = (DocsCloudPayment) o;
    return equalsNullable(this.cartId, docsCloudPayment.cartId) &&
        Objects.equals(this.productId, docsCloudPayment.productId) &&
        Objects.equals(this.status, docsCloudPayment.status) &&
        Objects.equals(this.intervalUnit, docsCloudPayment.intervalUnit) &&
        Objects.equals(this.isYear, docsCloudPayment.isYear) &&
        Objects.equals(this.isPrepaid, docsCloudPayment.isPrepaid) &&
        Objects.equals(this.quantity, docsCloudPayment.quantity) &&
        equalsNullable(this.currency, docsCloudPayment.currency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(cartId), productId, status, intervalUnit, isYear, isPrepaid, quantity, hashCodeNullable(currency));
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
    sb.append("class DocsCloudPayment {\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    intervalUnit: ").append(toIndentedString(intervalUnit)).append("\n");
    sb.append("    isYear: ").append(toIndentedString(isYear)).append("\n");
    sb.append("    isPrepaid: ").append(toIndentedString(isPrepaid)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

    // add `cartId` to the URL query string
    if (getCartId() != null) {
      try {
        joiner.add(String.format("%scartId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCartId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `productId` to the URL query string
    if (getProductId() != null) {
      try {
        joiner.add(String.format("%sproductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `intervalUnit` to the URL query string
    if (getIntervalUnit() != null) {
      try {
        joiner.add(String.format("%sintervalUnit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntervalUnit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isYear` to the URL query string
    if (getIsYear() != null) {
      try {
        joiner.add(String.format("%sisYear%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsYear()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isPrepaid` to the URL query string
    if (getIsPrepaid() != null) {
      try {
        joiner.add(String.format("%sisPrepaid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsPrepaid()), "UTF-8").replaceAll("\\+", "%20")));
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

