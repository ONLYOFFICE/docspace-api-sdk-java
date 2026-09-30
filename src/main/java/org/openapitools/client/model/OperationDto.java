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
import org.openapitools.client.model.OperationTokenUsage;
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
 * One movement on the portal wallet: what it was for, who caused it, and how much money it moved.
 */
@JsonPropertyOrder({
  OperationDto.JSON_PROPERTY_DATE,
  OperationDto.JSON_PROPERTY_SERVICE,
  OperationDto.JSON_PROPERTY_DESCRIPTION,
  OperationDto.JSON_PROPERTY_DETAILS,
  OperationDto.JSON_PROPERTY_SERVICE_UNIT,
  OperationDto.JSON_PROPERTY_QUANTITY,
  OperationDto.JSON_PROPERTY_CURRENCY,
  OperationDto.JSON_PROPERTY_CREDIT,
  OperationDto.JSON_PROPERTY_DEBIT,
  OperationDto.JSON_PROPERTY_PARTICIPANT_NAME,
  OperationDto.JSON_PROPERTY_PARTICIPANT_DISPLAY_NAME,
  OperationDto.JSON_PROPERTY_SOURCE_TYPE,
  OperationDto.JSON_PROPERTY_SOURCE_TITLE,
  OperationDto.JSON_PROPERTY_SOURCE_ID,
  OperationDto.JSON_PROPERTY_TOKEN_USAGE,
  OperationDto.JSON_PROPERTY_TYPE
})

public class OperationDto {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nullable  private ApiDateTime date;

  public static final String JSON_PROPERTY_SERVICE = "service";
  @javax.annotation.Nullable  private JsonNullable<String> service = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DETAILS = "details";
  @javax.annotation.Nullable  private JsonNullable<String> details = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVICE_UNIT = "serviceUnit";
  @javax.annotation.Nullable  private JsonNullable<String> serviceUnit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nullable  private Integer quantity;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREDIT = "credit";
  @javax.annotation.Nullable  private Double credit;

  public static final String JSON_PROPERTY_DEBIT = "debit";
  @javax.annotation.Nullable  private Double debit;

  public static final String JSON_PROPERTY_PARTICIPANT_NAME = "participantName";
  @javax.annotation.Nullable  private JsonNullable<String> participantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARTICIPANT_DISPLAY_NAME = "participantDisplayName";
  @javax.annotation.Nullable  private JsonNullable<String> participantDisplayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  @javax.annotation.Nullable  private JsonNullable<String> sourceType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_TITLE = "sourceTitle";
  @javax.annotation.Nullable  private JsonNullable<String> sourceTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  @javax.annotation.Nullable  private JsonNullable<String> sourceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOKEN_USAGE = "tokenUsage";
  @javax.annotation.Nullable  private OperationTokenUsage tokenUsage;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private OperationType type;

  public OperationDto() {
  }


  public OperationDto date(@javax.annotation.Nullable ApiDateTime date) {
    
    this.date = date;
    return this;
  }

  /**
   * When the movement was booked, in the portal time zone - the same zone the `startDate` and `endDate`  filters are read in, so the two do line up here.
   * @return date
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(@javax.annotation.Nullable ApiDateTime date) {
    this.date = date;
  }

  public OperationDto service(@javax.annotation.Nullable String service) {
    this.service = JsonNullable.<String>of(service);
    
    return this;
  }

  /**
   * The wallet service the movement belongs to, by its stable key. It is what the `serviceName` filter  matches on, and it is empty for a movement that belongs to no service, such as a top-up.
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

  public OperationDto description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

  /**
   * A one-line summary of the movement in the portal language, already composed from the service and the  quantity - meant to be printed as it is rather than parsed.
   * @return description
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public OperationDto details(@javax.annotation.Nullable String details) {
    this.details = JsonNullable.<String>of(details);
    
    return this;
  }

  /**
   * The longer explanation of the same movement, where the service recorded one. It is empty for a movement  that has nothing to add to `description`.
   * @return details
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDetails() {
        return details.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDetails_JsonNullable() {
    return details;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAILS)
  public void setDetails_JsonNullable(JsonNullable<String> details) {
    this.details = details;
  }

  public void setDetails(@javax.annotation.Nullable String details) {
    this.details = JsonNullable.<String>of(details);
  }

  public OperationDto serviceUnit(@javax.annotation.Nullable String serviceUnit) {
    this.serviceUnit = JsonNullable.<String>of(serviceUnit);
    
    return this;
  }

  /**
   * What `quantity` counts for this service, in the portal language. AI consumption is reported in tokens  here rather than in the AI credits the service is sold in.
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

  public OperationDto quantity(@javax.annotation.Nullable Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

  /**
   * How many units the movement covers, in the unit named by `serviceUnit`. It is `0` for a movement that  moves money without consuming a service.
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

  public OperationDto currency(@javax.annotation.Nullable String currency) {
    this.currency = JsonNullable.<String>of(currency);
    
    return this;
  }

  /**
   * The currency `credit` and `debit` are expressed in, as a three-letter ISO 4217 code. It is the accounting  currency of the wallet, which need not be the currency the subscription is priced in.
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

  public OperationDto credit(@javax.annotation.Nullable Double credit) {
    
    this.credit = credit;
    return this;
  }

  /**
   * The amount that went into the wallet. It is `0` on a movement that only took money out, so the pair of  `credit` and `debit` is what shows which way the money went; the `credit` and `debit` filters of the  operation select the two directions by exactly this.
   * @return credit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCredit() {
    return credit;
  }


  @JsonProperty(value = JSON_PROPERTY_CREDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredit(@javax.annotation.Nullable Double credit) {
    this.credit = credit;
  }

  public OperationDto debit(@javax.annotation.Nullable Double debit) {
    
    this.debit = debit;
    return this;
  }

  /**
   * The amount that was taken out of the wallet, `0` on a movement that put money in.
   * @return debit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEBIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDebit() {
    return debit;
  }


  @JsonProperty(value = JSON_PROPERTY_DEBIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebit(@javax.annotation.Nullable Double debit) {
    this.debit = debit;
  }

  public OperationDto participantName(@javax.annotation.Nullable String participantName) {
    this.participantName = JsonNullable.<String>of(participantName);
    
    return this;
  }

  /**
   * Who caused the movement, as the billing service records them - an internal name, which is what the  `participantName` filter matches on. Show `participantDisplayName` instead.
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

  public OperationDto participantDisplayName(@javax.annotation.Nullable String participantDisplayName) {
    this.participantDisplayName = JsonNullable.<String>of(participantDisplayName);
    
    return this;
  }

  /**
   * The same person as their portal display name. It falls back to `participantName` when the name belongs to  no portal account, so it is never empty while `participantName` is filled.
   * @return participantDisplayName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getParticipantDisplayName() {
        return participantDisplayName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARTICIPANT_DISPLAY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getParticipantDisplayName_JsonNullable() {
    return participantDisplayName;
  }
  
  @JsonProperty(JSON_PROPERTY_PARTICIPANT_DISPLAY_NAME)
  public void setParticipantDisplayName_JsonNullable(JsonNullable<String> participantDisplayName) {
    this.participantDisplayName = participantDisplayName;
  }

  public void setParticipantDisplayName(@javax.annotation.Nullable String participantDisplayName) {
    this.participantDisplayName = JsonNullable.<String>of(participantDisplayName);
  }

  public OperationDto sourceType(@javax.annotation.Nullable String sourceType) {
    this.sourceType = JsonNullable.<String>of(sourceType);
    
    return this;
  }

  /**
   * What kind of thing an AI operation was run on - an agent, a file, a folder, a room or a form. It is empty  on any movement that is not an AI charge.
   * @return sourceType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSourceType() {
        return sourceType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSourceType_JsonNullable() {
    return sourceType;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  public void setSourceType_JsonNullable(JsonNullable<String> sourceType) {
    this.sourceType = sourceType;
  }

  public void setSourceType(@javax.annotation.Nullable String sourceType) {
    this.sourceType = JsonNullable.<String>of(sourceType);
  }

  public OperationDto sourceTitle(@javax.annotation.Nullable String sourceTitle) {
    this.sourceTitle = JsonNullable.<String>of(sourceTitle);
    
    return this;
  }

  /**
   * The title that thing had when the operation ran, kept as recorded, so it does not follow a later rename.  Empty under the same conditions as `sourceType`.
   * @return sourceTitle
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSourceTitle() {
        return sourceTitle.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SOURCE_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSourceTitle_JsonNullable() {
    return sourceTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_TITLE)
  public void setSourceTitle_JsonNullable(JsonNullable<String> sourceTitle) {
    this.sourceTitle = sourceTitle;
  }

  public void setSourceTitle(@javax.annotation.Nullable String sourceTitle) {
    this.sourceTitle = JsonNullable.<String>of(sourceTitle);
  }

  public OperationDto sourceId(@javax.annotation.Nullable String sourceId) {
    this.sourceId = JsonNullable.<String>of(sourceId);
    
    return this;
  }

  /**
   * The identifier of that thing, to look it up in the module it belongs to. Empty under the same conditions  as `sourceType`.
   * @return sourceId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSourceId() {
        return sourceId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SOURCE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSourceId_JsonNullable() {
    return sourceId;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  public void setSourceId_JsonNullable(JsonNullable<String> sourceId) {
    this.sourceId = sourceId;
  }

  public void setSourceId(@javax.annotation.Nullable String sourceId) {
    this.sourceId = JsonNullable.<String>of(sourceId);
  }

  public OperationDto tokenUsage(@javax.annotation.Nullable OperationTokenUsage tokenUsage) {
    
    this.tokenUsage = tokenUsage;
    return this;
  }

  /**
   * The tokens an AI operation consumed, broken down by kind - prompt, completion, cache reads and writes,  reasoning, images. It is `null` on any movement that is not an AI charge, and on an AI charge the billing  service recorded without token counts.
   * @return tokenUsage
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOKEN_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationTokenUsage getTokenUsage() {
    return tokenUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_TOKEN_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenUsage(@javax.annotation.Nullable OperationTokenUsage tokenUsage) {
    this.tokenUsage = tokenUsage;
  }

  public OperationDto type(@javax.annotation.Nullable OperationType type) {
    
    this.type = type;
    return this;
  }

  /**
   * What kind of movement this is - a payment, a charge, a refund, a correction. It is what the `type` filter  matches on, and `Unknown` covers a movement the billing service reported under a kind this build does not  recognise.
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable OperationType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationDto operationDto = (OperationDto) o;
    return Objects.equals(this.date, operationDto.date) &&
        equalsNullable(this.service, operationDto.service) &&
        equalsNullable(this.description, operationDto.description) &&
        equalsNullable(this.details, operationDto.details) &&
        equalsNullable(this.serviceUnit, operationDto.serviceUnit) &&
        Objects.equals(this.quantity, operationDto.quantity) &&
        equalsNullable(this.currency, operationDto.currency) &&
        Objects.equals(this.credit, operationDto.credit) &&
        Objects.equals(this.debit, operationDto.debit) &&
        equalsNullable(this.participantName, operationDto.participantName) &&
        equalsNullable(this.participantDisplayName, operationDto.participantDisplayName) &&
        equalsNullable(this.sourceType, operationDto.sourceType) &&
        equalsNullable(this.sourceTitle, operationDto.sourceTitle) &&
        equalsNullable(this.sourceId, operationDto.sourceId) &&
        Objects.equals(this.tokenUsage, operationDto.tokenUsage) &&
        Objects.equals(this.type, operationDto.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, hashCodeNullable(service), hashCodeNullable(description), hashCodeNullable(details), hashCodeNullable(serviceUnit), quantity, hashCodeNullable(currency), credit, debit, hashCodeNullable(participantName), hashCodeNullable(participantDisplayName), hashCodeNullable(sourceType), hashCodeNullable(sourceTitle), hashCodeNullable(sourceId), tokenUsage, type);
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
    sb.append("class OperationDto {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    serviceUnit: ").append(toIndentedString(serviceUnit)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    participantDisplayName: ").append(toIndentedString(participantDisplayName)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceTitle: ").append(toIndentedString(sourceTitle)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    tokenUsage: ").append(toIndentedString(tokenUsage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(getDate().toUrlQueryString(prefix + "date" + suffix));
    }

    // add `service` to the URL query string
    if (getService() != null) {
      try {
        joiner.add(String.format("%sservice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getService()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      try {
        joiner.add(String.format("%sdetails%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDetails()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `participantName` to the URL query string
    if (getParticipantName() != null) {
      try {
        joiner.add(String.format("%sparticipantName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParticipantName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `participantDisplayName` to the URL query string
    if (getParticipantDisplayName() != null) {
      try {
        joiner.add(String.format("%sparticipantDisplayName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParticipantDisplayName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sourceType` to the URL query string
    if (getSourceType() != null) {
      try {
        joiner.add(String.format("%ssourceType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sourceTitle` to the URL query string
    if (getSourceTitle() != null) {
      try {
        joiner.add(String.format("%ssourceTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sourceId` to the URL query string
    if (getSourceId() != null) {
      try {
        joiner.add(String.format("%ssourceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenUsage` to the URL query string
    if (getTokenUsage() != null) {
      joiner.add(getTokenUsage().toUrlQueryString(prefix + "tokenUsage" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

