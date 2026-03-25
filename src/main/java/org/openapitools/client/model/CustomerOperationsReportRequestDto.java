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
import org.openapitools.client.model.OperationOrderType;
import org.openapitools.client.model.OperationStatus;
import org.openapitools.client.model.OperationType;
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
 * The request parameters for generating a report on client operations.
 */
@JsonPropertyOrder({
  CustomerOperationsReportRequestDto.JSON_PROPERTY_SERVICE_NAME,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_WRITE_OFF_SERVICE_QUOTA,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_START_DATE,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_END_DATE,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_PARTICIPANT_NAME,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_CREDIT,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_DEBIT,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_TYPES,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_STATUS,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_ORDER_BY,
  CustomerOperationsReportRequestDto.JSON_PROPERTY_ORDER_TYPE
})

public class CustomerOperationsReportRequestDto {
  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  @javax.annotation.Nullable  private JsonNullable<String> serviceName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WRITE_OFF_SERVICE_QUOTA = "writeOffServiceQuota";
  @javax.annotation.Nullable  private Boolean writeOffServiceQuota;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_PARTICIPANT_NAME = "participantName";
  @javax.annotation.Nullable  private JsonNullable<String> participantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREDIT = "credit";
  @javax.annotation.Nullable  private JsonNullable<Boolean> credit = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DEBIT = "debit";
  @javax.annotation.Nullable  private JsonNullable<Boolean> debit = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TYPES = "types";
  @javax.annotation.Nullable  private OperationType types;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private OperationStatus status;

  public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
  @javax.annotation.Nullable  private JsonNullable<String> orderBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORDER_TYPE = "orderType";
  @javax.annotation.Nullable  private OperationOrderType orderType;

  public CustomerOperationsReportRequestDto() {
  }


  public CustomerOperationsReportRequestDto serviceName(@javax.annotation.Nullable String serviceName) {
    this.serviceName = JsonNullable.<String>of(serviceName);
    
    return this;
  }

  /**
   * The service name.
   * @return serviceName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getServiceName() {
        return serviceName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SERVICE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getServiceName_JsonNullable() {
    return serviceName;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  public void setServiceName_JsonNullable(JsonNullable<String> serviceName) {
    this.serviceName = serviceName;
  }

  public void setServiceName(@javax.annotation.Nullable String serviceName) {
    this.serviceName = JsonNullable.<String>of(serviceName);
  }

  public CustomerOperationsReportRequestDto writeOffServiceQuota(@javax.annotation.Nullable Boolean writeOffServiceQuota) {
    
    this.writeOffServiceQuota = writeOffServiceQuota;
    return this;
  }

  /**
   * Write-off of the quota for the service
   * @return writeOffServiceQuota
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WRITE_OFF_SERVICE_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWriteOffServiceQuota() {
    return writeOffServiceQuota;
  }


  @JsonProperty(value = JSON_PROPERTY_WRITE_OFF_SERVICE_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWriteOffServiceQuota(@javax.annotation.Nullable Boolean writeOffServiceQuota) {
    this.writeOffServiceQuota = writeOffServiceQuota;
  }

  public CustomerOperationsReportRequestDto startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
    
    return this;
  }

  /**
   * The report start date.
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

  public CustomerOperationsReportRequestDto endDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
    
    return this;
  }

  /**
   * The report end date.
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

  public CustomerOperationsReportRequestDto participantName(@javax.annotation.Nullable String participantName) {
    this.participantName = JsonNullable.<String>of(participantName);
    
    return this;
  }

  /**
   * The participant name.
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

  public CustomerOperationsReportRequestDto credit(@javax.annotation.Nullable Boolean credit) {
    this.credit = JsonNullable.<Boolean>of(credit);
    
    return this;
  }

  /**
   * Specifies whether to include credit operations in the report.
   * @return credit
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getCredit() {
        return credit.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CREDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getCredit_JsonNullable() {
    return credit;
  }
  
  @JsonProperty(JSON_PROPERTY_CREDIT)
  public void setCredit_JsonNullable(JsonNullable<Boolean> credit) {
    this.credit = credit;
  }

  public void setCredit(@javax.annotation.Nullable Boolean credit) {
    this.credit = JsonNullable.<Boolean>of(credit);
  }

  public CustomerOperationsReportRequestDto debit(@javax.annotation.Nullable Boolean debit) {
    this.debit = JsonNullable.<Boolean>of(debit);
    
    return this;
  }

  /**
   * Specifies whether to include debit operations in the report.
   * @return debit
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDebit() {
        return debit.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DEBIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDebit_JsonNullable() {
    return debit;
  }
  
  @JsonProperty(JSON_PROPERTY_DEBIT)
  public void setDebit_JsonNullable(JsonNullable<Boolean> debit) {
    this.debit = debit;
  }

  public void setDebit(@javax.annotation.Nullable Boolean debit) {
    this.debit = JsonNullable.<Boolean>of(debit);
  }

  public CustomerOperationsReportRequestDto types(@javax.annotation.Nullable OperationType types) {
    
    this.types = types;
    return this;
  }

  /**
   * Get types
   * @return types
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationType getTypes() {
    return types;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(@javax.annotation.Nullable OperationType types) {
    this.types = types;
  }

  public CustomerOperationsReportRequestDto status(@javax.annotation.Nullable OperationStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
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

  public CustomerOperationsReportRequestDto orderBy(@javax.annotation.Nullable String orderBy) {
    this.orderBy = JsonNullable.<String>of(orderBy);
    
    return this;
  }

  /**
   * The field to order by.
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

  public CustomerOperationsReportRequestDto orderType(@javax.annotation.Nullable OperationOrderType orderType) {
    
    this.orderType = orderType;
    return this;
  }

  /**
   * Get orderType
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
    CustomerOperationsReportRequestDto customerOperationsReportRequestDto = (CustomerOperationsReportRequestDto) o;
    return equalsNullable(this.serviceName, customerOperationsReportRequestDto.serviceName) &&
        Objects.equals(this.writeOffServiceQuota, customerOperationsReportRequestDto.writeOffServiceQuota) &&
        equalsNullable(this.startDate, customerOperationsReportRequestDto.startDate) &&
        equalsNullable(this.endDate, customerOperationsReportRequestDto.endDate) &&
        equalsNullable(this.participantName, customerOperationsReportRequestDto.participantName) &&
        equalsNullable(this.credit, customerOperationsReportRequestDto.credit) &&
        equalsNullable(this.debit, customerOperationsReportRequestDto.debit) &&
        Objects.equals(this.types, customerOperationsReportRequestDto.types) &&
        Objects.equals(this.status, customerOperationsReportRequestDto.status) &&
        equalsNullable(this.orderBy, customerOperationsReportRequestDto.orderBy) &&
        Objects.equals(this.orderType, customerOperationsReportRequestDto.orderType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(serviceName), writeOffServiceQuota, hashCodeNullable(startDate), hashCodeNullable(endDate), hashCodeNullable(participantName), hashCodeNullable(credit), hashCodeNullable(debit), types, status, hashCodeNullable(orderBy), orderType);
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
    sb.append("class CustomerOperationsReportRequestDto {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    writeOffServiceQuota: ").append(toIndentedString(writeOffServiceQuota)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
      try {
        joiner.add(String.format("%sserviceName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `writeOffServiceQuota` to the URL query string
    if (getWriteOffServiceQuota() != null) {
      try {
        joiner.add(String.format("%swriteOffServiceQuota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWriteOffServiceQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `credit` to the URL query string
    if (getCredit() != null) {
      try {
        joiner.add(String.format("%scredit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCredit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `debit` to the URL query string
    if (getDebit() != null) {
      try {
        joiner.add(String.format("%sdebit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDebit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `types` to the URL query string
    if (getTypes() != null) {
      try {
        joiner.add(String.format("%stypes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTypes()), "UTF-8").replaceAll("\\+", "%20")));
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

