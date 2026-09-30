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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.OperationOrderType;
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
 * The filters that select which wallet service consumption is reported: the services, the period, the participant,  the outcome, the usage metadata and the ordering.
 */
@JsonPropertyOrder({
  CustomerServiceUsageReportRequestDto.JSON_PROPERTY_SERVICE_NAME,
  CustomerServiceUsageReportRequestDto.JSON_PROPERTY_START_DATE,
  CustomerServiceUsageReportRequestDto.JSON_PROPERTY_END_DATE,
  CustomerServiceUsageReportRequestDto.JSON_PROPERTY_PARTICIPANT_NAME,
  CustomerServiceUsageReportRequestDto.JSON_PROPERTY_STATUS,
  CustomerServiceUsageReportRequestDto.JSON_PROPERTY_METADATA,
  CustomerServiceUsageReportRequestDto.JSON_PROPERTY_ORDER_BY,
  CustomerServiceUsageReportRequestDto.JSON_PROPERTY_ORDER_TYPE
})

public class CustomerServiceUsageReportRequestDto {
  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  @javax.annotation.Nullable  private JsonNullable<List<String>> serviceName = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_PARTICIPANT_NAME = "participantName";
  @javax.annotation.Nullable  private JsonNullable<String> participantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private OperationStatus status;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable  private Map<String, String> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
  @javax.annotation.Nullable  private JsonNullable<String> orderBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORDER_TYPE = "orderType";
  @javax.annotation.Nullable  private OperationOrderType orderType;

  public CustomerServiceUsageReportRequestDto() {
  }


  public CustomerServiceUsageReportRequestDto serviceName(@javax.annotation.Nullable List<String> serviceName) {
    this.serviceName = JsonNullable.<List<String>>of(serviceName);
    
    return this;
  }

  public CustomerServiceUsageReportRequestDto addServiceNameItem(String serviceNameItem) {
    if (this.serviceName == null || !this.serviceName.isPresent()) {
      this.serviceName = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.serviceName.get().add(serviceNameItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The wallet services whose consumption is reported, named the way the billing catalogue names them -  `backup`, `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field  of `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not  sell fails the call with 404, and an omitted list reports every service. A bare string is accepted in place  of an array for backward compatibility.
   * @return serviceName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getServiceName() {
        return serviceName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SERVICE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getServiceName_JsonNullable() {
    return serviceName;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  public void setServiceName_JsonNullable(JsonNullable<List<String>> serviceName) {
    this.serviceName = serviceName;
  }

  public void setServiceName(@javax.annotation.Nullable List<String> serviceName) {
    this.serviceName = JsonNullable.<List<String>>of(serviceName);
  }

  public CustomerServiceUsageReportRequestDto startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
    
    return this;
  }

  /**
   * The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, and  defaults to the portal creation date.
   * @return startDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getStartDate() {
        return startDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_START_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getStartDate_JsonNullable() {
    return startDate;
  }
  
  @JsonProperty(JSON_PROPERTY_START_DATE)
  public void setStartDate_JsonNullable(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
  }

  public CustomerServiceUsageReportRequestDto endDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
    
    return this;
  }

  /**
   * The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made.
   * @return endDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_END_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
  }

  public CustomerServiceUsageReportRequestDto participantName(@javax.annotation.Nullable String participantName) {
    this.participantName = JsonNullable.<String>of(participantName);
    
    return this;
  }

  /**
   * The participant whose consumption is reported - the account the accounting service records as the consumer.  Consumption caused by a portal user carries that user ID here; surrounding whitespace is trimmed, and an  omitted value reports every participant.
   * @return participantName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getParticipantName() {
        return participantName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARTICIPANT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getParticipantName_JsonNullable() {
    return participantName;
  }
  
  @JsonProperty(JSON_PROPERTY_PARTICIPANT_NAME)
  public void setParticipantName_JsonNullable(JsonNullable<String> participantName) {
    this.participantName = participantName;
  }

  public void setParticipantName(@javax.annotation.Nullable String participantName) {
    this.participantName = JsonNullable.<String>of(participantName);
  }

  public CustomerServiceUsageReportRequestDto status(@javax.annotation.Nullable OperationStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * The outcome to keep. Consumption that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is reported when this is omitted.
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

  public CustomerServiceUsageReportRequestDto metadata(@javax.annotation.Nullable Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CustomerServiceUsageReportRequestDto putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * The usage annotations a wallet service records alongside its consumption, as the key and value pairs that  must all match for a record to be reported. The keys are chosen by the service that writes them, so read  them off the `metadata` of the records returned by `GET api/2.0/portal/payment/customer/usage` rather than  guessing; an omitted map reports every record.
   * @return metadata
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_METADATA, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(value = JSON_PROPERTY_METADATA, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public CustomerServiceUsageReportRequestDto orderBy(@javax.annotation.Nullable String orderBy) {
    this.orderBy = JsonNullable.<String>of(orderBy);
    
    return this;
  }

  /**
   * The name of the field the per-service totals are sorted by, spelled as the accounting service names it, such  as `ServiceName` or `StartDate`. Surrounding whitespace is trimmed, and the accounting service applies its  own ordering when this is omitted.
   * @return orderBy
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOrderBy() {
        return orderBy.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORDER_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOrderBy_JsonNullable() {
    return orderBy;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  public void setOrderBy_JsonNullable(JsonNullable<String> orderBy) {
    this.orderBy = orderBy;
  }

  public void setOrderBy(@javax.annotation.Nullable String orderBy) {
    this.orderBy = JsonNullable.<String>of(orderBy);
  }

  public CustomerServiceUsageReportRequestDto orderType(@javax.annotation.Nullable OperationOrderType orderType) {
    
    this.orderType = orderType;
    return this;
  }

  /**
   * The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly.
   * @return orderType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORDER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationOrderType getOrderType() {
    return orderType;
  }


  @JsonProperty(value = JSON_PROPERTY_ORDER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderType(@javax.annotation.Nullable OperationOrderType orderType) {
    this.orderType = orderType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerServiceUsageReportRequestDto customerServiceUsageReportRequestDto = (CustomerServiceUsageReportRequestDto) o;
    return equalsNullable(this.serviceName, customerServiceUsageReportRequestDto.serviceName) &&
        equalsNullable(this.startDate, customerServiceUsageReportRequestDto.startDate) &&
        equalsNullable(this.endDate, customerServiceUsageReportRequestDto.endDate) &&
        equalsNullable(this.participantName, customerServiceUsageReportRequestDto.participantName) &&
        Objects.equals(this.status, customerServiceUsageReportRequestDto.status) &&
        Objects.equals(this.metadata, customerServiceUsageReportRequestDto.metadata) &&
        equalsNullable(this.orderBy, customerServiceUsageReportRequestDto.orderBy) &&
        Objects.equals(this.orderType, customerServiceUsageReportRequestDto.orderType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(serviceName), hashCodeNullable(startDate), hashCodeNullable(endDate), hashCodeNullable(participantName), status, metadata, hashCodeNullable(orderBy), orderType);
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
    sb.append("class CustomerServiceUsageReportRequestDto {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
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

    // add `serviceName` to the URL query string
    if (getServiceName() != null) {
      for (int i = 0; i < getServiceName().size(); i++) {
        try {
          joiner.add(String.format("%sserviceName%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getServiceName().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `startDate` to the URL query string
    if (getStartDate() != null) {
      try {
        joiner.add(String.format("%sstartDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `endDate` to the URL query string
    if (getEndDate() != null) {
      try {
        joiner.add(String.format("%sendDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `participantName` to the URL query string
    if (getParticipantName() != null) {
      try {
        joiner.add(String.format("%sparticipantName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParticipantName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      for (String _key : getMetadata().keySet()) {
        try {
          joiner.add(String.format("%smetadata%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetadata().get(_key), URLEncoder.encode(String.valueOf(getMetadata().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `orderBy` to the URL query string
    if (getOrderBy() != null) {
      try {
        joiner.add(String.format("%sorderBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `orderType` to the URL query string
    if (getOrderType() != null) {
      try {
        joiner.add(String.format("%sorderType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

