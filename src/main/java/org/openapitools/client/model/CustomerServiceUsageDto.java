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
 * What one wallet service was consumed and cost over the requested period, added up rather than listed.
 */
@JsonPropertyOrder({
  CustomerServiceUsageDto.JSON_PROPERTY_SERVICE,
  CustomerServiceUsageDto.JSON_PROPERTY_TITLE,
  CustomerServiceUsageDto.JSON_PROPERTY_SERVICE_UNIT,
  CustomerServiceUsageDto.JSON_PROPERTY_CURRENCY,
  CustomerServiceUsageDto.JSON_PROPERTY_TOTAL_QUANTITY,
  CustomerServiceUsageDto.JSON_PROPERTY_TOTAL_AMOUNT,
  CustomerServiceUsageDto.JSON_PROPERTY_OPERATION_COUNT,
  CustomerServiceUsageDto.JSON_PROPERTY_PRICE,
  CustomerServiceUsageDto.JSON_PROPERTY_SUBSCRIPTION
})

public class CustomerServiceUsageDto {
  public static final String JSON_PROPERTY_SERVICE = "service";
  @javax.annotation.Nullable  private JsonNullable<String> service = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVICE_UNIT = "serviceUnit";
  @javax.annotation.Nullable  private JsonNullable<String> serviceUnit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOTAL_QUANTITY = "totalQuantity";
  @javax.annotation.Nullable  private Integer totalQuantity;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "totalAmount";
  @javax.annotation.Nullable  private Double totalAmount;

  public static final String JSON_PROPERTY_OPERATION_COUNT = "operationCount";
  @javax.annotation.Nullable  private Integer operationCount;

  public static final String JSON_PROPERTY_PRICE = "price";
  @javax.annotation.Nullable  private Double price;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  @javax.annotation.Nullable  private Boolean subscription;

  public CustomerServiceUsageDto() {
  }


  public CustomerServiceUsageDto service(@javax.annotation.Nullable String service) {
    this.service = JsonNullable.<String>of(service);
    
    return this;
  }

  /**
   * The stable key of the service, which is what the `serviceName` filter of this operation matches on and  what `GET api/2.0/portal/payment/walletservice` looks a service up by.
   * @return service
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getService() {
        return service.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SERVICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getService_JsonNullable() {
    return service;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVICE)
  public void setService_JsonNullable(JsonNullable<String> service) {
    this.service = service;
  }

  public void setService(@javax.annotation.Nullable String service) {
    this.service = JsonNullable.<String>of(service);
  }

  public CustomerServiceUsageDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The service name in the portal language, for printing rather than matching.
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

  public CustomerServiceUsageDto serviceUnit(@javax.annotation.Nullable String serviceUnit) {
    this.serviceUnit = JsonNullable.<String>of(serviceUnit);
    
    return this;
  }

  /**
   * What `totalQuantity` counts, in the portal language. AI consumption is reported in tokens here rather  than in the AI credits the service is sold in, so it does not line up with the price list.
   * @return serviceUnit
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getServiceUnit() {
        return serviceUnit.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SERVICE_UNIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getServiceUnit_JsonNullable() {
    return serviceUnit;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVICE_UNIT)
  public void setServiceUnit_JsonNullable(JsonNullable<String> serviceUnit) {
    this.serviceUnit = serviceUnit;
  }

  public void setServiceUnit(@javax.annotation.Nullable String serviceUnit) {
    this.serviceUnit = JsonNullable.<String>of(serviceUnit);
  }

  public CustomerServiceUsageDto currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The currency `totalAmount` and `price` are expressed in, as a three-letter ISO 4217 code.
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

  public CustomerServiceUsageDto totalQuantity(@javax.annotation.Nullable Integer totalQuantity) {
    
    this.totalQuantity = totalQuantity;
    return this;
  }

  /**
   * How many units of the service were consumed over the period, in the unit named by `serviceUnit`.
   * @return totalQuantity
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOTAL_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalQuantity() {
    return totalQuantity;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalQuantity(@javax.annotation.Nullable Integer totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  public CustomerServiceUsageDto totalAmount(@javax.annotation.Nullable Double totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * What that consumption cost over the period. It is what was actually charged, so it can differ from  `price` times `totalQuantity` when the price changed inside the period.
   * @return totalAmount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOTAL_AMOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_AMOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmount(@javax.annotation.Nullable Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public CustomerServiceUsageDto operationCount(@javax.annotation.Nullable Integer operationCount) {
    
    this.operationCount = operationCount;
    return this;
  }

  /**
   * How many separate charges the total was added up from. The charges themselves are in  `GET api/2.0/portal/payment/customer/operations`.
   * @return operationCount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OPERATION_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOperationCount() {
    return operationCount;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATION_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationCount(@javax.annotation.Nullable Integer operationCount) {
    this.operationCount = operationCount;
  }

  public CustomerServiceUsageDto price(@javax.annotation.Nullable Double price) {
    
    this.price = price;
    return this;
  }

  /**
   * What one unit of the service costs today, not what it cost during the period. It is `0` when the service  is no longer on the installation's price list.
   * @return price
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(@javax.annotation.Nullable Double price) {
    this.price = price;
  }

  public CustomerServiceUsageDto subscription(@javax.annotation.Nullable Boolean subscription) {
    
    this.subscription = subscription;
    return this;
  }

  /**
   * Whether the service is billed as a standing subscription rather than per unit consumed. It is derived  from today's price list, so it describes the service as it is sold now.
   * @return subscription
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubscription() {
    return subscription;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscription(@javax.annotation.Nullable Boolean subscription) {
    this.subscription = subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerServiceUsageDto customerServiceUsageDto = (CustomerServiceUsageDto) o;
    return equalsNullable(this.service, customerServiceUsageDto.service) &&
        equalsNullable(this.title, customerServiceUsageDto.title) &&
        equalsNullable(this.serviceUnit, customerServiceUsageDto.serviceUnit) &&
        equalsNullable(this.currency, customerServiceUsageDto.currency) &&
        Objects.equals(this.totalQuantity, customerServiceUsageDto.totalQuantity) &&
        Objects.equals(this.totalAmount, customerServiceUsageDto.totalAmount) &&
        Objects.equals(this.operationCount, customerServiceUsageDto.operationCount) &&
        Objects.equals(this.price, customerServiceUsageDto.price) &&
        Objects.equals(this.subscription, customerServiceUsageDto.subscription);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(service), hashCodeNullable(title), hashCodeNullable(serviceUnit), hashCodeNullable(currency), totalQuantity, totalAmount, operationCount, price, subscription);
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
    sb.append("class CustomerServiceUsageDto {\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    serviceUnit: ").append(toIndentedString(serviceUnit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    operationCount: ").append(toIndentedString(operationCount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

    // add `service` to the URL query string
    if (getService() != null) {
      try {
        joiner.add(String.format("%sservice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getService()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `serviceUnit` to the URL query string
    if (getServiceUnit() != null) {
      try {
        joiner.add(String.format("%sserviceUnit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceUnit()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `totalQuantity` to the URL query string
    if (getTotalQuantity() != null) {
      try {
        joiner.add(String.format("%stotalQuantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalAmount` to the URL query string
    if (getTotalAmount() != null) {
      try {
        joiner.add(String.format("%stotalAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `operationCount` to the URL query string
    if (getOperationCount() != null) {
      try {
        joiner.add(String.format("%soperationCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOperationCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `price` to the URL query string
    if (getPrice() != null) {
      try {
        joiner.add(String.format("%sprice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscription` to the URL query string
    if (getSubscription() != null) {
      try {
        joiner.add(String.format("%ssubscription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

