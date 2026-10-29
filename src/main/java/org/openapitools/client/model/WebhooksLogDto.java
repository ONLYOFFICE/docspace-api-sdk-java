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
import org.openapitools.client.model.EmployeeDto;
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
 * One delivery of a webhook event, updated in place by its automatic retries: what was sent where, and what came  back the last time. A manual retry is a delivery record of its own for the same event.
 */
@JsonPropertyOrder({
  WebhooksLogDto.JSON_PROPERTY_ID,
  WebhooksLogDto.JSON_PROPERTY_EVENT_ID,
  WebhooksLogDto.JSON_PROPERTY_RETRIED_BY,
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
  WebhooksLogDto.JSON_PROPERTY_DELIVERY,
  WebhooksLogDto.JSON_PROPERTY_ATTEMPTS,
  WebhooksLogDto.JSON_PROPERTY_NEXT_ATTEMPT_ON
})

public class WebhooksLogDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private Integer id;

  public static final String JSON_PROPERTY_EVENT_ID = "eventId";
  @javax.annotation.Nullable  private Integer eventId;

  public static final String JSON_PROPERTY_RETRIED_BY = "retriedBy";
  @javax.annotation.Nullable  private EmployeeDto retriedBy;

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

  public static final String JSON_PROPERTY_ATTEMPTS = "attempts";
  @javax.annotation.Nullable  private Integer attempts;

  public static final String JSON_PROPERTY_NEXT_ATTEMPT_ON = "nextAttemptOn";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> nextAttemptOn = JsonNullable.<OffsetDateTime>undefined();

  public WebhooksLogDto() {
  }


  public WebhooksLogDto id(@javax.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The identifier of this delivery record, which is what `PUT api/2.0/settings/webhook/{id}/retry` re-sends.  The automatic retries of the delivery update this same record, while a manual retry gets a record and an  identifier of its own.
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

  public WebhooksLogDto eventId(@javax.annotation.Nullable Integer eventId) {
    
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the event the delivery is for, which the receiver sees as `event.id` and in the  `x-docspace-event-id` header. It is the `id` of the event's first delivery record, so it equals `id` there and  stays the same on every manual retry, which makes it the value to group the records of one event by.
   * @return eventId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EVENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEventId() {
    return eventId;
  }


  @JsonProperty(value = JSON_PROPERTY_EVENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventId(@javax.annotation.Nullable Integer eventId) {
    this.eventId = eventId;
  }

  public WebhooksLogDto retriedBy(@javax.annotation.Nullable EmployeeDto retriedBy) {
    
    this.retriedBy = retriedBy;
    return this;
  }

  /**
   * The member who asked for this delivery with a manual retry. It is empty on the first delivery of an event,  which the portal sends by itself.
   * @return retriedBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RETRIED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getRetriedBy() {
    return retriedBy;
  }


  @JsonProperty(value = JSON_PROPERTY_RETRIED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetriedBy(@javax.annotation.Nullable EmployeeDto retriedBy) {
    this.retriedBy = retriedBy;
  }

  public WebhooksLogDto configName(@javax.annotation.Nullable String configName) {
    this.configName = JsonNullable.<String>of(configName);
    
    return this;
  }

  /**
   * The name of the subscription the delivery belongs to. It is the name as it stands now, so it follows a  later rename of the subscription rather than recording what it was called at the time.
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
   * The event that caused the delivery, as a single bit rather than a mask - a delivery is always for one  event, even though a subscription covers several.
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
   * When this delivery record was queued, as a UTC instant ending in `Z`. For the first delivery that is when the  event happened; for a manual retry it is the  moment of the retry. Records come back newest first by this moment.
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
   * The HTTP method the delivery was sent with, which is `POST` for every webhook the portal sends.
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
   * The address the delivery is sent to: the subscription's URL as it stands now. The journal does not keep the  address of each attempt, so after the subscription's URL changes, an older record names the new one too.
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
   * The headers the portal sent, serialised as one string, including the signature header a receiver verifies  the payload with.
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
   * The body the portal sent, which is the event payload as JSON text. It is stored as it was sent, so it  still describes the entity as it looked at the time of the event.
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
   * The headers the target answered with on the latest attempt, serialised the same way as `requestHeaders`. It  is empty until an attempt is answered, and when the target was not reached.
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
   * The body the target answered with on the latest attempt, truncated for storage. Empty under the same  conditions as `responseHeaders`, and also for a target that answers with no body at all. A record the portal  stopped without sending holds the portal's own note here instead - a text that starts with `Not sent:` and  gives the reason - which is not an answer of the target: on a record that never went out `status` is then `0`  and `responseHeaders` is empty, while on one stopped after failed attempts they still describe the last of them.
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
   * The HTTP status code the target answered on the latest attempt. It is `0` while the first attempt is still  on its way and on one that never reached the target, so `0` is not a failure code - it is the absence of an  answer. While `nextAttemptOn` is set it is the status of the failed attempt that caused the retry.
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
   * When the successful answer came back, as a UTC instant ending in `Z` like `creationTime`. It stays empty until an  attempt succeeds, and for good once the portal has given up retrying.
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

  public WebhooksLogDto attempts(@javax.annotation.Nullable Integer attempts) {
    
    this.attempts = attempts;
    return this;
  }

  /**
   * How many times the portal has tried to deliver this record so far. A failed attempt is retried with  growing pauses - on the default schedule about 1 minute, 5 minutes, 30 minutes, 2, 5 and 10 hours, though  an installation may configure its own - all of them under the same record and the same  `x-docspace-event-id` header, so a receiver can drop a delivery it has already processed. The one exception  is a portal moved to another region while retries are pending: the moved records get new IDs, so the attempts  made there carry a new `x-docspace-event-id`.
   * @return attempts
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ATTEMPTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttempts() {
    return attempts;
  }


  @JsonProperty(value = JSON_PROPERTY_ATTEMPTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttempts(@javax.annotation.Nullable Integer attempts) {
    this.attempts = attempts;
  }

  public WebhooksLogDto nextAttemptOn(@javax.annotation.Nullable OffsetDateTime nextAttemptOn) {
    this.nextAttemptOn = JsonNullable.<OffsetDateTime>of(nextAttemptOn);
    
    return this;
  }

  /**
   * When the next attempt is due, as a UTC instant ending in `Z` like `creationTime`. While an attempt is being sent  right now it holds the moment that attempt's lease expires, a few minutes ahead, rather than a scheduled retry;  it changes again once the attempt ends. Empty means no attempt will follow: the record is delivered, its retries  ran out, a manual retry of the same event took over from it, or the portal stopped it - because the subscription  was disabled or removed or its address rejected, the subscription's creator may no longer receive the event,  the stored body cannot be read or is in the payload format of a previous version, the portal is removed, the  record waited longer than the retry schedule allows, the portal was restored from a backup taken before the  record was answered, or the portal was moved to another region while the record was being sent. A stopped  record that was never attempted says why in `responsePayload`; one that was keeps the target's last answer there.
   * @return nextAttemptOn
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getNextAttemptOn() {
        return nextAttemptOn.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NEXT_ATTEMPT_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getNextAttemptOn_JsonNullable() {
    return nextAttemptOn;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_ATTEMPT_ON)
  public void setNextAttemptOn_JsonNullable(JsonNullable<OffsetDateTime> nextAttemptOn) {
    this.nextAttemptOn = nextAttemptOn;
  }

  public void setNextAttemptOn(@javax.annotation.Nullable OffsetDateTime nextAttemptOn) {
    this.nextAttemptOn = JsonNullable.<OffsetDateTime>of(nextAttemptOn);
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
        Objects.equals(this.eventId, webhooksLogDto.eventId) &&
        Objects.equals(this.retriedBy, webhooksLogDto.retriedBy) &&
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
        equalsNullable(this.delivery, webhooksLogDto.delivery) &&
        Objects.equals(this.attempts, webhooksLogDto.attempts) &&
        equalsNullable(this.nextAttemptOn, webhooksLogDto.nextAttemptOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventId, retriedBy, hashCodeNullable(configName), trigger, creationTime, hashCodeNullable(method), hashCodeNullable(route), hashCodeNullable(requestHeaders), hashCodeNullable(requestPayload), hashCodeNullable(responseHeaders), hashCodeNullable(responsePayload), status, hashCodeNullable(delivery), attempts, hashCodeNullable(nextAttemptOn));
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
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    retriedBy: ").append(toIndentedString(retriedBy)).append("\n");
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
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    nextAttemptOn: ").append(toIndentedString(nextAttemptOn)).append("\n");
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

    // add `eventId` to the URL query string
    if (getEventId() != null) {
      try {
        joiner.add(String.format("%seventId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `retriedBy` to the URL query string
    if (getRetriedBy() != null) {
      joiner.add(getRetriedBy().toUrlQueryString(prefix + "retriedBy" + suffix));
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

    // add `attempts` to the URL query string
    if (getAttempts() != null) {
      try {
        joiner.add(String.format("%sattempts%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAttempts()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nextAttemptOn` to the URL query string
    if (getNextAttemptOn() != null) {
      try {
        joiner.add(String.format("%snextAttemptOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextAttemptOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

