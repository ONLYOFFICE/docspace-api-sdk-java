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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiMetadataValue;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiMetaFill200ResponseFilledInnerValue
 */
@JsonPropertyOrder({
  AiMetaFill200ResponseFilledInnerValue.JSON_PROPERTY_STRING_VALUE,
  AiMetaFill200ResponseFilledInnerValue.JSON_PROPERTY_NUMBER_VALUE,
  AiMetaFill200ResponseFilledInnerValue.JSON_PROPERTY_DATE_VALUE,
  AiMetaFill200ResponseFilledInnerValue.JSON_PROPERTY_OPTION_IDS
})
@JsonTypeName("aiMetaFill_200_response_filled_inner_value")

public class AiMetaFill200ResponseFilledInnerValue {
  public static final String JSON_PROPERTY_STRING_VALUE = "stringValue";
  @javax.annotation.Nullable  private String stringValue;

  public static final String JSON_PROPERTY_NUMBER_VALUE = "numberValue";
  @javax.annotation.Nullable  private BigDecimal numberValue;

  public static final String JSON_PROPERTY_DATE_VALUE = "dateValue";
  @javax.annotation.Nullable  private String dateValue;

  public static final String JSON_PROPERTY_OPTION_IDS = "optionIds";
  @javax.annotation.Nullable  private List<String> optionIds = new ArrayList<>();

  public AiMetaFill200ResponseFilledInnerValue() {
  }


  public AiMetaFill200ResponseFilledInnerValue stringValue(@javax.annotation.Nullable String stringValue) {
    
    this.stringValue = stringValue;
    return this;
  }

  /**
   * Get stringValue
   * @return stringValue
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STRING_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStringValue() {
    return stringValue;
  }


  @JsonProperty(value = JSON_PROPERTY_STRING_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStringValue(@javax.annotation.Nullable String stringValue) {
    this.stringValue = stringValue;
  }

  public AiMetaFill200ResponseFilledInnerValue numberValue(@javax.annotation.Nullable BigDecimal numberValue) {
    
    this.numberValue = numberValue;
    return this;
  }

  /**
   * Get numberValue
   * @return numberValue
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NUMBER_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumberValue() {
    return numberValue;
  }


  @JsonProperty(value = JSON_PROPERTY_NUMBER_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberValue(@javax.annotation.Nullable BigDecimal numberValue) {
    this.numberValue = numberValue;
  }

  public AiMetaFill200ResponseFilledInnerValue dateValue(@javax.annotation.Nullable String dateValue) {
    
    this.dateValue = dateValue;
    return this;
  }

  /**
   * ISO 8601 date-time, UTC midnight of the date.
   * @return dateValue
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DATE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateValue() {
    return dateValue;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateValue(@javax.annotation.Nullable String dateValue) {
    this.dateValue = dateValue;
  }

  public AiMetaFill200ResponseFilledInnerValue optionIds(@javax.annotation.Nullable List<String> optionIds) {
    
    this.optionIds = optionIds;
    return this;
  }

  public AiMetaFill200ResponseFilledInnerValue addOptionIdsItem(String optionIdsItem) {
    if (this.optionIds == null) {
      this.optionIds = new ArrayList<>();
    }
    this.optionIds.add(optionIdsItem);
    return this;
  }

  /**
   * Get optionIds
   * @return optionIds
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OPTION_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOptionIds() {
    return optionIds;
  }


  @JsonProperty(value = JSON_PROPERTY_OPTION_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionIds(@javax.annotation.Nullable List<String> optionIds) {
    this.optionIds = optionIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMetaFill200ResponseFilledInnerValue aiMetaFill200ResponseFilledInnerValue = (AiMetaFill200ResponseFilledInnerValue) o;
    return Objects.equals(this.stringValue, aiMetaFill200ResponseFilledInnerValue.stringValue) &&
        Objects.equals(this.numberValue, aiMetaFill200ResponseFilledInnerValue.numberValue) &&
        Objects.equals(this.dateValue, aiMetaFill200ResponseFilledInnerValue.dateValue) &&
        Objects.equals(this.optionIds, aiMetaFill200ResponseFilledInnerValue.optionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringValue, numberValue, dateValue, optionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMetaFill200ResponseFilledInnerValue {\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
    sb.append("    optionIds: ").append(toIndentedString(optionIds)).append("\n");
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

    // add `stringValue` to the URL query string
    if (getStringValue() != null) {
      try {
        joiner.add(String.format("%sstringValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStringValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `numberValue` to the URL query string
    if (getNumberValue() != null) {
      try {
        joiner.add(String.format("%snumberValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dateValue` to the URL query string
    if (getDateValue() != null) {
      try {
        joiner.add(String.format("%sdateValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `optionIds` to the URL query string
    if (getOptionIds() != null) {
      for (int i = 0; i < getOptionIds().size(); i++) {
        try {
          joiner.add(String.format("%soptionIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getOptionIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

