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
import org.openapitools.client.model.WebhookTrigger;
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
 * The webhook log parameters.
 */
@JsonPropertyOrder({
  WebhooksLogDto.JSON_PROPERTY_ID,
  WebhooksLogDto.JSON_PROPERTY_CONFIG_NAME,
  WebhooksLogDto.JSON_PROPERTY_TRIGGER,
  WebhooksLogDto.JSON_PROPERTY_CREATION_TIME,
  WebhooksLogDto.JSON_PROPERTY_METHOD,
  WebhooksLogDto.JSON_PROPERTY_ROUTE,
  WebhooksLogDto.JSON_PROPERTY_REQUEST_HEADERS,
  WebhooksLogDto.JSON_PROPERTY_REQUEST_PAYLOAD,
  WebhooksLogDto.JSON_PROPERTY_RESPONSE_HEADERS,
  WebhooksLogDto.JSON_PROPERTY_RESPONSE_PAYLOAD,
  WebhooksLogDto.JSON_PROPERTY_STATUS,
  WebhooksLogDto.JSON_PROPERTY_DELIVERY
})

public class WebhooksLogDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private Integer id;

  public static final String JSON_PROPERTY_CONFIG_NAME = "configName";
  @javax.annotation.Nullable  private JsonNullable<String> configName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  @javax.annotation.Nullable  private WebhookTrigger trigger;

  public static final String JSON_PROPERTY_CREATION_TIME = "creationTime";
  @javax.annotation.Nullable  private OffsetDateTime creationTime;

  public static final String JSON_PROPERTY_METHOD = "method";
  @javax.annotation.Nullable  private JsonNullable<String> method = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROUTE = "route";
  @javax.annotation.Nullable  private JsonNullable<String> route = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_HEADERS = "requestHeaders";
  @javax.annotation.Nullable  private JsonNullable<String> requestHeaders = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_PAYLOAD = "requestPayload";
  @javax.annotation.Nullable  private JsonNullable<String> requestPayload = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESPONSE_HEADERS = "responseHeaders";
  @javax.annotation.Nullable  private JsonNullable<String> responseHeaders = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESPONSE_PAYLOAD = "responsePayload";
  @javax.annotation.Nullable  private JsonNullable<String> responsePayload = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private Integer status;

  public static final String JSON_PROPERTY_DELIVERY = "delivery";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> delivery = JsonNullable.<OffsetDateTime>undefined();

  public WebhooksLogDto() {
  }


  public WebhooksLogDto id(@javax.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The webhook log ID.
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull Integer id) {
    this.id = id;
  }

  public WebhooksLogDto configName(@javax.annotation.Nullable String configName) {
    this.configName = JsonNullable.<String>of(configName);
    
    return this;
  }

  /**
   * The webhook configuration name.
   * @return configName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getConfigName() {
        return configName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONFIG_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getConfigName_JsonNullable() {
    return configName;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIG_NAME)
  public void setConfigName_JsonNullable(JsonNullable<String> configName) {
    this.configName = configName;
  }

  public void setConfigName(@javax.annotation.Nullable String configName) {
    this.configName = JsonNullable.<String>of(configName);
  }

  public WebhooksLogDto trigger(@javax.annotation.Nullable WebhookTrigger trigger) {
    
    this.trigger = trigger;
    return this;
  }

  /**
   * Get trigger
   * @return trigger
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TRIGGER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookTrigger getTrigger() {
    return trigger;
  }


  @JsonProperty(value = JSON_PROPERTY_TRIGGER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrigger(@javax.annotation.Nullable WebhookTrigger trigger) {
    this.trigger = trigger;
  }

  public WebhooksLogDto creationTime(@javax.annotation.Nullable OffsetDateTime creationTime) {
    
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The webhook creation time.
   * @return creationTime
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATION_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationTime() {
    return creationTime;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATION_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationTime(@javax.annotation.Nullable OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public WebhooksLogDto method(@javax.annotation.Nullable String method) {
    this.method = JsonNullable.<String>of(method);
    
    return this;
  }

  /**
   * The webhook method.
   * @return method
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getMethod() {
        return method.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMethod_JsonNullable() {
    return method;
  }
  
  @JsonProperty(JSON_PROPERTY_METHOD)
  public void setMethod_JsonNullable(JsonNullable<String> method) {
    this.method = method;
  }

  public void setMethod(@javax.annotation.Nullable String method) {
    this.method = JsonNullable.<String>of(method);
  }

  public WebhooksLogDto route(@javax.annotation.Nullable String route) {
    this.route = JsonNullable.<String>of(route);
    
    return this;
  }

  /**
   * The webhook route.
   * @return route
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRoute() {
        return route.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRoute_JsonNullable() {
    return route;
  }
  
  @JsonProperty(JSON_PROPERTY_ROUTE)
  public void setRoute_JsonNullable(JsonNullable<String> route) {
    this.route = route;
  }

  public void setRoute(@javax.annotation.Nullable String route) {
    this.route = JsonNullable.<String>of(route);
  }

  public WebhooksLogDto requestHeaders(@javax.annotation.Nullable String requestHeaders) {
    this.requestHeaders = JsonNullable.<String>of(requestHeaders);
    
    return this;
  }

  /**
   * The webhook request headers.
   * @return requestHeaders
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRequestHeaders() {
        return requestHeaders.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_REQUEST_HEADERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRequestHeaders_JsonNullable() {
    return requestHeaders;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  public void setRequestHeaders_JsonNullable(JsonNullable<String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public void setRequestHeaders(@javax.annotation.Nullable String requestHeaders) {
    this.requestHeaders = JsonNullable.<String>of(requestHeaders);
  }

  public WebhooksLogDto requestPayload(@javax.annotation.Nullable String requestPayload) {
    this.requestPayload = JsonNullable.<String>of(requestPayload);
    
    return this;
  }

  /**
   * The webhook request payload.
   * @return requestPayload
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRequestPayload() {
        return requestPayload.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_REQUEST_PAYLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRequestPayload_JsonNullable() {
    return requestPayload;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUEST_PAYLOAD)
  public void setRequestPayload_JsonNullable(JsonNullable<String> requestPayload) {
    this.requestPayload = requestPayload;
  }

  public void setRequestPayload(@javax.annotation.Nullable String requestPayload) {
    this.requestPayload = JsonNullable.<String>of(requestPayload);
  }

  public WebhooksLogDto responseHeaders(@javax.annotation.Nullable String responseHeaders) {
    this.responseHeaders = JsonNullable.<String>of(responseHeaders);
    
    return this;
  }

  /**
   * The webhook response headers.
   * @return responseHeaders
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getResponseHeaders() {
        return responseHeaders.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RESPONSE_HEADERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getResponseHeaders_JsonNullable() {
    return responseHeaders;
  }
  
  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  public void setResponseHeaders_JsonNullable(JsonNullable<String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public void setResponseHeaders(@javax.annotation.Nullable String responseHeaders) {
    this.responseHeaders = JsonNullable.<String>of(responseHeaders);
  }

  public WebhooksLogDto responsePayload(@javax.annotation.Nullable String responsePayload) {
    this.responsePayload = JsonNullable.<String>of(responsePayload);
    
    return this;
  }

  /**
   * The webhook response payload.
   * @return responsePayload
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getResponsePayload() {
        return responsePayload.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RESPONSE_PAYLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getResponsePayload_JsonNullable() {
    return responsePayload;
  }
  
  @JsonProperty(JSON_PROPERTY_RESPONSE_PAYLOAD)
  public void setResponsePayload_JsonNullable(JsonNullable<String> responsePayload) {
    this.responsePayload = responsePayload;
  }

  public void setResponsePayload(@javax.annotation.Nullable String responsePayload) {
    this.responsePayload = JsonNullable.<String>of(responsePayload);
  }

  public WebhooksLogDto status(@javax.annotation.Nullable Integer status) {
    
    this.status = status;
    return this;
  }

  /**
   * The webhook status.
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

  public WebhooksLogDto delivery(@javax.annotation.Nullable OffsetDateTime delivery) {
    this.delivery = JsonNullable.<OffsetDateTime>of(delivery);
    
    return this;
  }

  /**
   * The webhook delivery time.
   * @return delivery
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getDelivery() {
        return delivery.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DELIVERY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDelivery_JsonNullable() {
    return delivery;
  }
  
  @JsonProperty(JSON_PROPERTY_DELIVERY)
  public void setDelivery_JsonNullable(JsonNullable<OffsetDateTime> delivery) {
    this.delivery = delivery;
  }

  public void setDelivery(@javax.annotation.Nullable OffsetDateTime delivery) {
    this.delivery = JsonNullable.<OffsetDateTime>of(delivery);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksLogDto webhooksLogDto = (WebhooksLogDto) o;
    return Objects.equals(this.id, webhooksLogDto.id) &&
        equalsNullable(this.configName, webhooksLogDto.configName) &&
        Objects.equals(this.trigger, webhooksLogDto.trigger) &&
        Objects.equals(this.creationTime, webhooksLogDto.creationTime) &&
        equalsNullable(this.method, webhooksLogDto.method) &&
        equalsNullable(this.route, webhooksLogDto.route) &&
        equalsNullable(this.requestHeaders, webhooksLogDto.requestHeaders) &&
        equalsNullable(this.requestPayload, webhooksLogDto.requestPayload) &&
        equalsNullable(this.responseHeaders, webhooksLogDto.responseHeaders) &&
        equalsNullable(this.responsePayload, webhooksLogDto.responsePayload) &&
        Objects.equals(this.status, webhooksLogDto.status) &&
        equalsNullable(this.delivery, webhooksLogDto.delivery);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(configName), trigger, creationTime, hashCodeNullable(method), hashCodeNullable(route), hashCodeNullable(requestHeaders), hashCodeNullable(requestPayload), hashCodeNullable(responseHeaders), hashCodeNullable(responsePayload), status, hashCodeNullable(delivery));
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
    sb.append("class WebhooksLogDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestPayload: ").append(toIndentedString(requestPayload)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    responsePayload: ").append(toIndentedString(responsePayload)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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

    // add `configName` to the URL query string
    if (getConfigName() != null) {
      try {
        joiner.add(String.format("%sconfigName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfigName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trigger` to the URL query string
    if (getTrigger() != null) {
      try {
        joiner.add(String.format("%strigger%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrigger()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `creationTime` to the URL query string
    if (getCreationTime() != null) {
      try {
        joiner.add(String.format("%screationTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreationTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `method` to the URL query string
    if (getMethod() != null) {
      try {
        joiner.add(String.format("%smethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMethod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `route` to the URL query string
    if (getRoute() != null) {
      try {
        joiner.add(String.format("%sroute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoute()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requestHeaders` to the URL query string
    if (getRequestHeaders() != null) {
      try {
        joiner.add(String.format("%srequestHeaders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestHeaders()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requestPayload` to the URL query string
    if (getRequestPayload() != null) {
      try {
        joiner.add(String.format("%srequestPayload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestPayload()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `responseHeaders` to the URL query string
    if (getResponseHeaders() != null) {
      try {
        joiner.add(String.format("%sresponseHeaders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResponseHeaders()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `responsePayload` to the URL query string
    if (getResponsePayload() != null) {
      try {
        joiner.add(String.format("%sresponsePayload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResponsePayload()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `delivery` to the URL query string
    if (getDelivery() != null) {
      try {
        joiner.add(String.format("%sdelivery%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelivery()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

