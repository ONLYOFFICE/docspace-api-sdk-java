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
import java.util.UUID;
import org.openapitools.client.model.ServiceLimitPeriod;
import org.openapitools.client.model.ServiceLimitScope;
import org.openapitools.client.model.ServiceLimitUsageDto;
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
 * A spending limit on the AI services: for the portal as a whole, for every user, or for one user.
 */
@JsonPropertyOrder({
  ServiceLimitDto.JSON_PROPERTY_ID,
  ServiceLimitDto.JSON_PROPERTY_SERVICE_GROUP_NAME,
  ServiceLimitDto.JSON_PROPERTY_CUSTOMER_ACCOUNT_NUMBER,
  ServiceLimitDto.JSON_PROPERTY_SCOPE,
  ServiceLimitDto.JSON_PROPERTY_USER_ID,
  ServiceLimitDto.JSON_PROPERTY_AMOUNT_VALUE,
  ServiceLimitDto.JSON_PROPERTY_CURRENCY,
  ServiceLimitDto.JSON_PROPERTY_QUANTITY_VALUE,
  ServiceLimitDto.JSON_PROPERTY_SERVICE_UNIT,
  ServiceLimitDto.JSON_PROPERTY_PERIOD,
  ServiceLimitDto.JSON_PROPERTY_PERIOD_END,
  ServiceLimitDto.JSON_PROPERTY_USAGE_FROM,
  ServiceLimitDto.JSON_PROPERTY_ENABLED,
  ServiceLimitDto.JSON_PROPERTY_CREATED,
  ServiceLimitDto.JSON_PROPERTY_MODIFIED,
  ServiceLimitDto.JSON_PROPERTY_USAGE
})

public class ServiceLimitDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_SERVICE_GROUP_NAME = "serviceGroupName";
  @javax.annotation.Nullable  private JsonNullable<String> serviceGroupName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ACCOUNT_NUMBER = "customerAccountNumber";
  @javax.annotation.Nullable  private Integer customerAccountNumber;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @javax.annotation.Nullable  private ServiceLimitScope scope;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private JsonNullable<UUID> userId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_AMOUNT_VALUE = "amountValue";
  @javax.annotation.Nullable  private JsonNullable<Double> amountValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUANTITY_VALUE = "quantityValue";
  @javax.annotation.Nullable  private JsonNullable<Integer> quantityValue = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SERVICE_UNIT = "serviceUnit";
  @javax.annotation.Nullable  private JsonNullable<String> serviceUnit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable  private ServiceLimitPeriod period;

  public static final String JSON_PROPERTY_PERIOD_END = "periodEnd";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> periodEnd = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_USAGE_FROM = "usageFrom";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> usageFrom = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable  private Boolean enabled;

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable  private OffsetDateTime created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  @javax.annotation.Nullable  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_USAGE = "usage";
  @javax.annotation.Nullable  private ServiceLimitUsageDto usage;

  public ServiceLimitDto() {
  }


  public ServiceLimitDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The service limit ID, used to read, change, switch off or delete the limit. In the list of the users the same  ID repeats for every user the limit for every user applies to.
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

  public ServiceLimitDto serviceGroupName(@javax.annotation.Nullable String serviceGroupName) {
    this.serviceGroupName = JsonNullable.<String>of(serviceGroupName);
    
    return this;
  }

  /**
   * The limited service group; the AI services are `ai-services`.
   * @return serviceGroupName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getServiceGroupName() {
        return serviceGroupName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SERVICE_GROUP_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getServiceGroupName_JsonNullable() {
    return serviceGroupName;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVICE_GROUP_NAME)
  public void setServiceGroupName_JsonNullable(JsonNullable<String> serviceGroupName) {
    this.serviceGroupName = serviceGroupName;
  }

  public void setServiceGroupName(@javax.annotation.Nullable String serviceGroupName) {
    this.serviceGroupName = JsonNullable.<String>of(serviceGroupName);
  }

  public ServiceLimitDto customerAccountNumber(@javax.annotation.Nullable Integer customerAccountNumber) {
    
    this.customerAccountNumber = customerAccountNumber;
    return this;
  }

  /**
   * The number of the billing account of the portal the limit belongs to.
   * @return customerAccountNumber
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ACCOUNT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCustomerAccountNumber() {
    return customerAccountNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ACCOUNT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerAccountNumber(@javax.annotation.Nullable Integer customerAccountNumber) {
    this.customerAccountNumber = customerAccountNumber;
  }

  public ServiceLimitDto scope(@javax.annotation.Nullable ServiceLimitScope scope) {
    
    this.scope = scope;
    return this;
  }

  /**
   * Whom the limit applies to.
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

  public ServiceLimitDto userId(@javax.annotation.Nullable UUID userId) {
    this.userId = JsonNullable.<UUID>of(userId);
    
    return this;
  }

  /**
   * The ID of the portal user the limit applies to: the user of a personal limit, or, in the list of the users, the  user a limit for every user applies to. Null for a limit of the portal as a whole, and for a limit for every  user read on its own.
   * @return userId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public UUID getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<UUID> userId) {
    this.userId = userId;
  }

  public void setUserId(@javax.annotation.Nullable UUID userId) {
    this.userId = JsonNullable.<UUID>of(userId);
  }

  public ServiceLimitDto amountValue(@javax.annotation.Nullable Double amountValue) {
    this.amountValue = JsonNullable.<Double>of(amountValue);
    
    return this;
  }

  /**
   * The most money the AI services may cost per period, in `currency`; null when the limit has no money threshold.
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

  public ServiceLimitDto currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The currency `amountValue` is expressed in; null when the limit has no money threshold.
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

  public ServiceLimitDto quantityValue(@javax.annotation.Nullable Integer quantityValue) {
    this.quantityValue = JsonNullable.<Integer>of(quantityValue);
    
    return this;
  }

  /**
   * The largest quantity the AI services may consume per period, in `serviceUnit`; null when the limit has no  quantity threshold.
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

  public ServiceLimitDto serviceUnit(@javax.annotation.Nullable String serviceUnit) {
    this.serviceUnit = JsonNullable.<String>of(serviceUnit);
    
    return this;
  }

  /**
   * The unit `quantityValue` is expressed in; null when the limit has no quantity threshold.
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

  public ServiceLimitDto period(@javax.annotation.Nullable ServiceLimitPeriod period) {
    
    this.period = period;
    return this;
  }

  /**
   * The window the thresholds apply to. A day, week or month resets at the start of the next one in UTC (a week on  Monday), not a fixed time after the first charge; a lifetime limit never resets.
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

  public ServiceLimitDto periodEnd(@javax.annotation.Nullable OffsetDateTime periodEnd) {
    this.periodEnd = JsonNullable.<OffsetDateTime>of(periodEnd);
    
    return this;
  }

  /**
   * The last moment of the current period, in UTC, after which the spending starts over from zero; null for a  lifetime limit, which never resets. Filled for every limit, the limit for every user included, whose spending is  counted per user.
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

  public ServiceLimitDto usageFrom(@javax.annotation.Nullable OffsetDateTime usageFrom) {
    this.usageFrom = JsonNullable.<OffsetDateTime>of(usageFrom);
    
    return this;
  }

  /**
   * The moment a lifetime limit counts from, in UTC; null for the other periods.
   * @return usageFrom
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getUsageFrom() {
        return usageFrom.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USAGE_FROM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getUsageFrom_JsonNullable() {
    return usageFrom;
  }
  
  @JsonProperty(JSON_PROPERTY_USAGE_FROM)
  public void setUsageFrom_JsonNullable(JsonNullable<OffsetDateTime> usageFrom) {
    this.usageFrom = usageFrom;
  }

  public void setUsageFrom(@javax.annotation.Nullable OffsetDateTime usageFrom) {
    this.usageFrom = JsonNullable.<OffsetDateTime>of(usageFrom);
  }

  public ServiceLimitDto enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the limit is in force. A switched-off limit no longer restricts the AI services and can be switched  back on.
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

  public ServiceLimitDto created(@javax.annotation.Nullable OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * The date and time when the limit was created, in UTC.
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

  public ServiceLimitDto modified(@javax.annotation.Nullable OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

  /**
   * The date and time when the limit was last changed, in UTC.
   * @return modified
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModified() {
    return modified;
  }


  @JsonProperty(value = JSON_PROPERTY_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModified(@javax.annotation.Nullable OffsetDateTime modified) {
    this.modified = modified;
  }

  public ServiceLimitDto usage(@javax.annotation.Nullable ServiceLimitUsageDto usage) {
    
    this.usage = usage;
    return this;
  }

  /**
   * What was spent against the limit in its current period and what is left. Filled for the limit of the portal as  a whole and in the list of the users; null where the spending is not read, such as for a limit read by its ID  or the limit for every user, whose spending is counted per user.
   * @return usage
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceLimitUsageDto getUsage() {
    return usage;
  }


  @JsonProperty(value = JSON_PROPERTY_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsage(@javax.annotation.Nullable ServiceLimitUsageDto usage) {
    this.usage = usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLimitDto serviceLimitDto = (ServiceLimitDto) o;
    return Objects.equals(this.id, serviceLimitDto.id) &&
        equalsNullable(this.serviceGroupName, serviceLimitDto.serviceGroupName) &&
        Objects.equals(this.customerAccountNumber, serviceLimitDto.customerAccountNumber) &&
        Objects.equals(this.scope, serviceLimitDto.scope) &&
        equalsNullable(this.userId, serviceLimitDto.userId) &&
        equalsNullable(this.amountValue, serviceLimitDto.amountValue) &&
        equalsNullable(this.currency, serviceLimitDto.currency) &&
        equalsNullable(this.quantityValue, serviceLimitDto.quantityValue) &&
        equalsNullable(this.serviceUnit, serviceLimitDto.serviceUnit) &&
        Objects.equals(this.period, serviceLimitDto.period) &&
        equalsNullable(this.periodEnd, serviceLimitDto.periodEnd) &&
        equalsNullable(this.usageFrom, serviceLimitDto.usageFrom) &&
        Objects.equals(this.enabled, serviceLimitDto.enabled) &&
        Objects.equals(this.created, serviceLimitDto.created) &&
        Objects.equals(this.modified, serviceLimitDto.modified) &&
        Objects.equals(this.usage, serviceLimitDto.usage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(serviceGroupName), customerAccountNumber, scope, hashCodeNullable(userId), hashCodeNullable(amountValue), hashCodeNullable(currency), hashCodeNullable(quantityValue), hashCodeNullable(serviceUnit), period, hashCodeNullable(periodEnd), hashCodeNullable(usageFrom), enabled, created, modified, usage);
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
    sb.append("class ServiceLimitDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceGroupName: ").append(toIndentedString(serviceGroupName)).append("\n");
    sb.append("    customerAccountNumber: ").append(toIndentedString(customerAccountNumber)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    quantityValue: ").append(toIndentedString(quantityValue)).append("\n");
    sb.append("    serviceUnit: ").append(toIndentedString(serviceUnit)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    usageFrom: ").append(toIndentedString(usageFrom)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

    // add `serviceGroupName` to the URL query string
    if (getServiceGroupName() != null) {
      try {
        joiner.add(String.format("%sserviceGroupName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceGroupName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerAccountNumber` to the URL query string
    if (getCustomerAccountNumber() != null) {
      try {
        joiner.add(String.format("%scustomerAccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerAccountNumber()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `serviceUnit` to the URL query string
    if (getServiceUnit() != null) {
      try {
        joiner.add(String.format("%sserviceUnit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceUnit()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `usageFrom` to the URL query string
    if (getUsageFrom() != null) {
      try {
        joiner.add(String.format("%susageFrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsageFrom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `modified` to the URL query string
    if (getModified() != null) {
      try {
        joiner.add(String.format("%smodified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usage` to the URL query string
    if (getUsage() != null) {
      joiner.add(getUsage().toUrlQueryString(prefix + "usage" + suffix));
    }

    return joiner.toString();
  }

}

