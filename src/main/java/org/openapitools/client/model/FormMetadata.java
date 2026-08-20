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
 * FormMetadata
 */
@JsonPropertyOrder({
  FormMetadata.JSON_PROPERTY_KEY,
  FormMetadata.JSON_PROPERTY_TYPE,
  FormMetadata.JSON_PROPERTY_FORMAT,
  FormMetadata.JSON_PROPERTY_POSSIBLE_VALUES
})

public class FormMetadata {
  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FORMAT = "format";
  @javax.annotation.Nullable  private JsonNullable<String> format = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POSSIBLE_VALUES = "possibleValues";
  @javax.annotation.Nullable  private JsonNullable<List<String>> possibleValues = JsonNullable.<List<String>>undefined();

  public FormMetadata() {
  }


  public FormMetadata key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The form field key.
   * @return key
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getKey_JsonNullable() {
    return key;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY)
  public void setKey_JsonNullable(JsonNullable<String> key) {
    this.key = key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
  }

  public FormMetadata type(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

  /**
   * The form field type.
   * @return type
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
  }

  public FormMetadata format(@javax.annotation.Nullable String format) {
    this.format = JsonNullable.<String>of(format);
    
    return this;
  }

  /**
   * The form field format.
   * @return format
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFormat() {
        return format.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FORMAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFormat_JsonNullable() {
    return format;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMAT)
  public void setFormat_JsonNullable(JsonNullable<String> format) {
    this.format = format;
  }

  public void setFormat(@javax.annotation.Nullable String format) {
    this.format = JsonNullable.<String>of(format);
  }

  public FormMetadata possibleValues(@javax.annotation.Nullable List<String> possibleValues) {
    this.possibleValues = JsonNullable.<List<String>>of(possibleValues);
    
    return this;
  }

  public FormMetadata addPossibleValuesItem(String possibleValuesItem) {
    if (this.possibleValues == null || !this.possibleValues.isPresent()) {
      this.possibleValues = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.possibleValues.get().add(possibleValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of possible values for the form field.
   * @return possibleValues
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getPossibleValues() {
        return possibleValues.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_POSSIBLE_VALUES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getPossibleValues_JsonNullable() {
    return possibleValues;
  }
  
  @JsonProperty(JSON_PROPERTY_POSSIBLE_VALUES)
  public void setPossibleValues_JsonNullable(JsonNullable<List<String>> possibleValues) {
    this.possibleValues = possibleValues;
  }

  public void setPossibleValues(@javax.annotation.Nullable List<String> possibleValues) {
    this.possibleValues = JsonNullable.<List<String>>of(possibleValues);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormMetadata formMetadata = (FormMetadata) o;
    return equalsNullable(this.key, formMetadata.key) &&
        equalsNullable(this.type, formMetadata.type) &&
        equalsNullable(this.format, formMetadata.format) &&
        equalsNullable(this.possibleValues, formMetadata.possibleValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(key), hashCodeNullable(type), hashCodeNullable(format), hashCodeNullable(possibleValues));
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
    sb.append("class FormMetadata {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
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

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `format` to the URL query string
    if (getFormat() != null) {
      try {
        joiner.add(String.format("%sformat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormat()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `possibleValues` to the URL query string
    if (getPossibleValues() != null) {
      for (int i = 0; i < getPossibleValues().size(); i++) {
        try {
          joiner.add(String.format("%spossibleValues%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPossibleValues().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

