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
 * Represents an active wallet service (quota) of the current portal.
 */
@JsonPropertyOrder({
  ActiveServiceDto.JSON_PROPERTY_SERVICE,
  ActiveServiceDto.JSON_PROPERTY_SERVICE_UNIT,
  ActiveServiceDto.JSON_PROPERTY_SUBSCRIPTION,
  ActiveServiceDto.JSON_PROPERTY_TITLE,
  ActiveServiceDto.JSON_PROPERTY_LIMIT,
  ActiveServiceDto.JSON_PROPERTY_USED
})

public class ActiveServiceDto {
  public static final String JSON_PROPERTY_SERVICE = "service";
  @javax.annotation.Nullable  private JsonNullable<String> service = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVICE_UNIT = "serviceUnit";
  @javax.annotation.Nullable  private JsonNullable<String> serviceUnit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  @javax.annotation.Nullable  private Boolean subscription;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable  private JsonNullable<Integer> limit = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_USED = "used";
  @javax.annotation.Nullable  private JsonNullable<Integer> used = JsonNullable.<Integer>undefined();

  public ActiveServiceDto() {
  }


  public ActiveServiceDto service(@javax.annotation.Nullable String service) {
    this.service = JsonNullable.<String>of(service);
    
    return this;
  }

  /**
   * The name of the service.
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

  public ActiveServiceDto serviceUnit(@javax.annotation.Nullable String serviceUnit) {
    this.serviceUnit = JsonNullable.<String>of(serviceUnit);
    
    return this;
  }

  /**
   * The unit of measurement for the service.
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

  public ActiveServiceDto subscription(@javax.annotation.Nullable Boolean subscription) {
    
    this.subscription = subscription;
    return this;
  }

  /**
   * Indicates whether the service is subscription-based.
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

  public ActiveServiceDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The title of the service.
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

  public ActiveServiceDto limit(@javax.annotation.Nullable Integer limit) {
    this.limit = JsonNullable.<Integer>of(limit);
    
    return this;
  }

  /**
   * The service limit. Populated only for the subscription-based services.
   * @return limit
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getLimit() {
        return limit.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getLimit_JsonNullable() {
    return limit;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT)
  public void setLimit_JsonNullable(JsonNullable<Integer> limit) {
    this.limit = limit;
  }

  public void setLimit(@javax.annotation.Nullable Integer limit) {
    this.limit = JsonNullable.<Integer>of(limit);
  }

  public ActiveServiceDto used(@javax.annotation.Nullable Integer used) {
    this.used = JsonNullable.<Integer>of(used);
    
    return this;
  }

  /**
   * The current service usage. Populated only for the subscription-based services.
   * @return used
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getUsed() {
        return used.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getUsed_JsonNullable() {
    return used;
  }
  
  @JsonProperty(JSON_PROPERTY_USED)
  public void setUsed_JsonNullable(JsonNullable<Integer> used) {
    this.used = used;
  }

  public void setUsed(@javax.annotation.Nullable Integer used) {
    this.used = JsonNullable.<Integer>of(used);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveServiceDto activeServiceDto = (ActiveServiceDto) o;
    return equalsNullable(this.service, activeServiceDto.service) &&
        equalsNullable(this.serviceUnit, activeServiceDto.serviceUnit) &&
        Objects.equals(this.subscription, activeServiceDto.subscription) &&
        equalsNullable(this.title, activeServiceDto.title) &&
        equalsNullable(this.limit, activeServiceDto.limit) &&
        equalsNullable(this.used, activeServiceDto.used);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(service), hashCodeNullable(serviceUnit), subscription, hashCodeNullable(title), hashCodeNullable(limit), hashCodeNullable(used));
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
    sb.append("class ActiveServiceDto {\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceUnit: ").append(toIndentedString(serviceUnit)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

    // add `serviceUnit` to the URL query string
    if (getServiceUnit() != null) {
      try {
        joiner.add(String.format("%sserviceUnit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceUnit()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      try {
        joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `used` to the URL query string
    if (getUsed() != null) {
      try {
        joiner.add(String.format("%sused%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

