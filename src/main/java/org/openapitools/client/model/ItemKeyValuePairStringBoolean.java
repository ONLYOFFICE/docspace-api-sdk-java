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
 * One entry of a keyed collection, carried as an explicit pair of `key` and `value` fields instead of as a member  of a JSON object, so that the key is not restricted to a string and the entries keep the order they are sent in.
 */
@JsonPropertyOrder({
  ItemKeyValuePairStringBoolean.JSON_PROPERTY_KEY,
  ItemKeyValuePairStringBoolean.JSON_PROPERTY_VALUE
})

public class ItemKeyValuePairStringBoolean {
  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable  private Boolean value;

  public ItemKeyValuePairStringBoolean() {
  }


  public ItemKeyValuePairStringBoolean key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The left half of the pair. Where the pair configures something, this is the identifier the value belongs to -  a setting name, a module id, a logo slot; where the pair reports the result of a call, this is the result  itself, such as the flag telling whether the call succeeded. Which of the two it is, and which keys are  accepted, is stated by the operation that sends or returns the pair.
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

  public ItemKeyValuePairStringBoolean value(@javax.annotation.Nullable Boolean value) {
    
    this.value = value;
    return this;
  }

  /**
   * The right half of the pair: what is assigned to the key next to it, or what is reported for it. Its meaning  and its accepted values follow from the key, so read them from the operation that sends or returns the pair.
   * @return value
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@javax.annotation.Nullable Boolean value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemKeyValuePairStringBoolean itemKeyValuePairStringBoolean = (ItemKeyValuePairStringBoolean) o;
    return equalsNullable(this.key, itemKeyValuePairStringBoolean.key) &&
        Objects.equals(this.value, itemKeyValuePairStringBoolean.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(key), value);
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
    sb.append("class ItemKeyValuePairStringBoolean {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

