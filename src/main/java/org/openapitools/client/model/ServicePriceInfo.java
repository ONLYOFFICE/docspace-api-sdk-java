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
import org.openapitools.client.model.DiscountCategory;
import org.openapitools.client.model.PriceStatus;
import org.openapitools.client.model.PriceTimeUnit;
import org.openapitools.client.model.TimeBound;
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
 * Represents a price of the service.
 */
@JsonPropertyOrder({
  ServicePriceInfo.JSON_PROPERTY_ID,
  ServicePriceInfo.JSON_PROPERTY_ACCOUNT_NUMBER,
  ServicePriceInfo.JSON_PROPERTY_SERVICE_ID,
  ServicePriceInfo.JSON_PROPERTY_TIME_UNIT,
  ServicePriceInfo.JSON_PROPERTY_COST_PRICE,
  ServicePriceInfo.JSON_PROPERTY_EXTRA_CHARGE,
  ServicePriceInfo.JSON_PROPERTY_SERVICE_PRICE,
  ServicePriceInfo.JSON_PROPERTY_QUOTA,
  ServicePriceInfo.JSON_PROPERTY_TIME_BOUND,
  ServicePriceInfo.JSON_PROPERTY_STATUS,
  ServicePriceInfo.JSON_PROPERTY_CREATED,
  ServicePriceInfo.JSON_PROPERTY_DISCOUNT_CATEGORY_ID,
  ServicePriceInfo.JSON_PROPERTY_DISCOUNT_CATEGORY
})

public class ServicePriceInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  @javax.annotation.Nullable  private Integer accountNumber;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  @javax.annotation.Nullable  private Integer serviceId;

  public static final String JSON_PROPERTY_TIME_UNIT = "timeUnit";
  @javax.annotation.Nullable  private PriceTimeUnit timeUnit;

  public static final String JSON_PROPERTY_COST_PRICE = "costPrice";
  @javax.annotation.Nullable  private Double costPrice;

  public static final String JSON_PROPERTY_EXTRA_CHARGE = "extraCharge";
  @javax.annotation.Nullable  private Double extraCharge;

  public static final String JSON_PROPERTY_SERVICE_PRICE = "servicePrice";
  @javax.annotation.Nullable  private Double servicePrice;

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable  private JsonNullable<Double> quota = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_TIME_BOUND = "timeBound";
  @javax.annotation.Nullable  private TimeBound timeBound;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private PriceStatus status;

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DISCOUNT_CATEGORY_ID = "discountCategoryId";
  @javax.annotation.Nullable  private JsonNullable<Integer> discountCategoryId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DISCOUNT_CATEGORY = "discountCategory";
  @javax.annotation.Nullable  private DiscountCategory discountCategory;

  public ServicePriceInfo() {
  }


  public ServicePriceInfo id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The price unique identifier.
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

  public ServicePriceInfo accountNumber(@javax.annotation.Nullable Integer accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number.
   * @return accountNumber
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACCOUNT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCOUNT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(@javax.annotation.Nullable Integer accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ServicePriceInfo serviceId(@javax.annotation.Nullable Integer serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

  /**
   * The service ID.
   * @return serviceId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServiceId() {
    return serviceId;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceId(@javax.annotation.Nullable Integer serviceId) {
    this.serviceId = serviceId;
  }

  public ServicePriceInfo timeUnit(@javax.annotation.Nullable PriceTimeUnit timeUnit) {
    
    this.timeUnit = timeUnit;
    return this;
  }

  /**
   * The time unit the price is bound to.
   * @return timeUnit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TIME_UNIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PriceTimeUnit getTimeUnit() {
    return timeUnit;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_UNIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeUnit(@javax.annotation.Nullable PriceTimeUnit timeUnit) {
    this.timeUnit = timeUnit;
  }

  public ServicePriceInfo costPrice(@javax.annotation.Nullable Double costPrice) {
    
    this.costPrice = costPrice;
    return this;
  }

  /**
   * The cost price.
   * @return costPrice
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COST_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCostPrice() {
    return costPrice;
  }


  @JsonProperty(value = JSON_PROPERTY_COST_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostPrice(@javax.annotation.Nullable Double costPrice) {
    this.costPrice = costPrice;
  }

  public ServicePriceInfo extraCharge(@javax.annotation.Nullable Double extraCharge) {
    
    this.extraCharge = extraCharge;
    return this;
  }

  /**
   * The extra charge added to the cost price.
   * @return extraCharge
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTRA_CHARGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getExtraCharge() {
    return extraCharge;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTRA_CHARGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraCharge(@javax.annotation.Nullable Double extraCharge) {
    this.extraCharge = extraCharge;
  }

  public ServicePriceInfo servicePrice(@javax.annotation.Nullable Double servicePrice) {
    
    this.servicePrice = servicePrice;
    return this;
  }

  /**
   * The resulting service price.
   * @return servicePrice
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERVICE_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getServicePrice() {
    return servicePrice;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVICE_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicePrice(@javax.annotation.Nullable Double servicePrice) {
    this.servicePrice = servicePrice;
  }

  public ServicePriceInfo quota(@javax.annotation.Nullable Double quota) {
    this.quota = JsonNullable.<Double>of(quota);
    
    return this;
  }

  /**
   * The quota the price is set for.
   * @return quota
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Double getQuota() {
        return quota.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getQuota_JsonNullable() {
    return quota;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTA)
  public void setQuota_JsonNullable(JsonNullable<Double> quota) {
    this.quota = quota;
  }

  public void setQuota(@javax.annotation.Nullable Double quota) {
    this.quota = JsonNullable.<Double>of(quota);
  }

  public ServicePriceInfo timeBound(@javax.annotation.Nullable TimeBound timeBound) {
    
    this.timeBound = timeBound;
    return this;
  }

  /**
   * The period the price is effective in.
   * @return timeBound
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TIME_BOUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TimeBound getTimeBound() {
    return timeBound;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_BOUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeBound(@javax.annotation.Nullable TimeBound timeBound) {
    this.timeBound = timeBound;
  }

  public ServicePriceInfo status(@javax.annotation.Nullable PriceStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * The price status.
   * @return status
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PriceStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable PriceStatus status) {
    this.status = status;
  }

  public ServicePriceInfo created(@javax.annotation.Nullable OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * The date and time when the price was created.
   * @return created
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@javax.annotation.Nullable OffsetDateTime created) {
    this.created = created;
  }

  public ServicePriceInfo discountCategoryId(@javax.annotation.Nullable Integer discountCategoryId) {
    this.discountCategoryId = JsonNullable.<Integer>of(discountCategoryId);
    
    return this;
  }

  /**
   * The discount category ID.
   * @return discountCategoryId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getDiscountCategoryId() {
        return discountCategoryId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DISCOUNT_CATEGORY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getDiscountCategoryId_JsonNullable() {
    return discountCategoryId;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCOUNT_CATEGORY_ID)
  public void setDiscountCategoryId_JsonNullable(JsonNullable<Integer> discountCategoryId) {
    this.discountCategoryId = discountCategoryId;
  }

  public void setDiscountCategoryId(@javax.annotation.Nullable Integer discountCategoryId) {
    this.discountCategoryId = JsonNullable.<Integer>of(discountCategoryId);
  }

  public ServicePriceInfo discountCategory(@javax.annotation.Nullable DiscountCategory discountCategory) {
    
    this.discountCategory = discountCategory;
    return this;
  }

  /**
   * The discount category.
   * @return discountCategory
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DISCOUNT_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DiscountCategory getDiscountCategory() {
    return discountCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_DISCOUNT_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscountCategory(@javax.annotation.Nullable DiscountCategory discountCategory) {
    this.discountCategory = discountCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePriceInfo servicePriceInfo = (ServicePriceInfo) o;
    return Objects.equals(this.id, servicePriceInfo.id) &&
        Objects.equals(this.accountNumber, servicePriceInfo.accountNumber) &&
        Objects.equals(this.serviceId, servicePriceInfo.serviceId) &&
        Objects.equals(this.timeUnit, servicePriceInfo.timeUnit) &&
        Objects.equals(this.costPrice, servicePriceInfo.costPrice) &&
        Objects.equals(this.extraCharge, servicePriceInfo.extraCharge) &&
        Objects.equals(this.servicePrice, servicePriceInfo.servicePrice) &&
        equalsNullable(this.quota, servicePriceInfo.quota) &&
        Objects.equals(this.timeBound, servicePriceInfo.timeBound) &&
        Objects.equals(this.status, servicePriceInfo.status) &&
        Objects.equals(this.created, servicePriceInfo.created) &&
        equalsNullable(this.discountCategoryId, servicePriceInfo.discountCategoryId) &&
        Objects.equals(this.discountCategory, servicePriceInfo.discountCategory);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNumber, serviceId, timeUnit, costPrice, extraCharge, servicePrice, hashCodeNullable(quota), timeBound, status, created, hashCodeNullable(discountCategoryId), discountCategory);
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
    sb.append("class ServicePriceInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    costPrice: ").append(toIndentedString(costPrice)).append("\n");
    sb.append("    extraCharge: ").append(toIndentedString(extraCharge)).append("\n");
    sb.append("    servicePrice: ").append(toIndentedString(servicePrice)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    timeBound: ").append(toIndentedString(timeBound)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    discountCategoryId: ").append(toIndentedString(discountCategoryId)).append("\n");
    sb.append("    discountCategory: ").append(toIndentedString(discountCategory)).append("\n");
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

    // add `accountNumber` to the URL query string
    if (getAccountNumber() != null) {
      try {
        joiner.add(String.format("%saccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `serviceId` to the URL query string
    if (getServiceId() != null) {
      try {
        joiner.add(String.format("%sserviceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeUnit` to the URL query string
    if (getTimeUnit() != null) {
      try {
        joiner.add(String.format("%stimeUnit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeUnit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `costPrice` to the URL query string
    if (getCostPrice() != null) {
      try {
        joiner.add(String.format("%scostPrice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCostPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `extraCharge` to the URL query string
    if (getExtraCharge() != null) {
      try {
        joiner.add(String.format("%sextraCharge%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExtraCharge()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `servicePrice` to the URL query string
    if (getServicePrice() != null) {
      try {
        joiner.add(String.format("%sservicePrice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServicePrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quota` to the URL query string
    if (getQuota() != null) {
      try {
        joiner.add(String.format("%squota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeBound` to the URL query string
    if (getTimeBound() != null) {
      joiner.add(getTimeBound().toUrlQueryString(prefix + "timeBound" + suffix));
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

    // add `created` to the URL query string
    if (getCreated() != null) {
      try {
        joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreated()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `discountCategoryId` to the URL query string
    if (getDiscountCategoryId() != null) {
      try {
        joiner.add(String.format("%sdiscountCategoryId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiscountCategoryId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `discountCategory` to the URL query string
    if (getDiscountCategory() != null) {
      joiner.add(getDiscountCategory().toUrlQueryString(prefix + "discountCategory" + suffix));
    }

    return joiner.toString();
  }

}

