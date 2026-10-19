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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.ApiDateTime;
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
 * The value of a metadata field on an entry. Exactly one of the value properties is set, the one matching the field type:  `stringValue` for a string field, `numberValue` for a number field, `dateValue` for a date field,  `optionIds` for a single or multiple choice field.
 */
@JsonPropertyOrder({
  MetadataValueDto.JSON_PROPERTY_STRING_VALUE,
  MetadataValueDto.JSON_PROPERTY_NUMBER_VALUE,
  MetadataValueDto.JSON_PROPERTY_DATE_VALUE,
  MetadataValueDto.JSON_PROPERTY_OPTION_IDS
})

public class MetadataValueDto {
  public static final String JSON_PROPERTY_STRING_VALUE = "stringValue";
  @javax.annotation.Nullable  private JsonNullable<String> stringValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NUMBER_VALUE = "numberValue";
  @javax.annotation.Nullable  private JsonNullable<Long> numberValue = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_DATE_VALUE = "dateValue";
  @javax.annotation.Nullable  private ApiDateTime dateValue;

  public static final String JSON_PROPERTY_OPTION_IDS = "optionIds";
  @javax.annotation.Nullable  private JsonNullable<List<UUID>> optionIds = JsonNullable.<List<UUID>>undefined();

  public MetadataValueDto() {
  }


  public MetadataValueDto stringValue(@javax.annotation.Nullable String stringValue) {
    this.stringValue = JsonNullable.<String>of(stringValue);
    
    return this;
  }

  /**
   * The string value.
   * @return stringValue
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getStringValue() {
        return stringValue.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_STRING_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStringValue_JsonNullable() {
    return stringValue;
  }
  
  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  public void setStringValue_JsonNullable(JsonNullable<String> stringValue) {
    this.stringValue = stringValue;
  }

  public void setStringValue(@javax.annotation.Nullable String stringValue) {
    this.stringValue = JsonNullable.<String>of(stringValue);
  }

  public MetadataValueDto numberValue(@javax.annotation.Nullable Long numberValue) {
    this.numberValue = JsonNullable.<Long>of(numberValue);
    
    return this;
  }

  /**
   * The number value.
   * @return numberValue
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Long getNumberValue() {
        return numberValue.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NUMBER_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNumberValue_JsonNullable() {
    return numberValue;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_VALUE)
  public void setNumberValue_JsonNullable(JsonNullable<Long> numberValue) {
    this.numberValue = numberValue;
  }

  public void setNumberValue(@javax.annotation.Nullable Long numberValue) {
    this.numberValue = JsonNullable.<Long>of(numberValue);
  }

  public MetadataValueDto dateValue(@javax.annotation.Nullable ApiDateTime dateValue) {
    
    this.dateValue = dateValue;
    return this;
  }

  /**
   * The date value.
   * @return dateValue
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DATE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDateValue() {
    return dateValue;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateValue(@javax.annotation.Nullable ApiDateTime dateValue) {
    this.dateValue = dateValue;
  }

  public MetadataValueDto optionIds(@javax.annotation.Nullable List<UUID> optionIds) {
    this.optionIds = JsonNullable.<List<UUID>>of(optionIds);
    
    return this;
  }

  public MetadataValueDto addOptionIdsItem(UUID optionIdsItem) {
    if (this.optionIds == null || !this.optionIds.isPresent()) {
      this.optionIds = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.optionIds.get().add(optionIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The selected choice option IDs.
   * @return optionIds
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<UUID> getOptionIds() {
        return optionIds.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OPTION_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<UUID>> getOptionIds_JsonNullable() {
    return optionIds;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTION_IDS)
  public void setOptionIds_JsonNullable(JsonNullable<List<UUID>> optionIds) {
    this.optionIds = optionIds;
  }

  public void setOptionIds(@javax.annotation.Nullable List<UUID> optionIds) {
    this.optionIds = JsonNullable.<List<UUID>>of(optionIds);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataValueDto metadataValueDto = (MetadataValueDto) o;
    return equalsNullable(this.stringValue, metadataValueDto.stringValue) &&
        equalsNullable(this.numberValue, metadataValueDto.numberValue) &&
        Objects.equals(this.dateValue, metadataValueDto.dateValue) &&
        equalsNullable(this.optionIds, metadataValueDto.optionIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(stringValue), hashCodeNullable(numberValue), dateValue, hashCodeNullable(optionIds));
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
    sb.append("class MetadataValueDto {\n");
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
      joiner.add(getDateValue().toUrlQueryString(prefix + "dateValue" + suffix));
    }

    // add `optionIds` to the URL query string
    if (getOptionIds() != null) {
      for (int i = 0; i < getOptionIds().size(); i++) {
        if (getOptionIds().get(i) != null) {
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
    }

    return joiner.toString();
  }

}

