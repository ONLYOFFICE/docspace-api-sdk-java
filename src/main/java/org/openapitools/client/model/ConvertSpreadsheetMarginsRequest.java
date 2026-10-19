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
 * The margins of the output PDF file, each a length with its unit: mm, cm or in.
 */
@JsonPropertyOrder({
  ConvertSpreadsheetMarginsRequest.JSON_PROPERTY_LEFT,
  ConvertSpreadsheetMarginsRequest.JSON_PROPERTY_RIGHT,
  ConvertSpreadsheetMarginsRequest.JSON_PROPERTY_TOP,
  ConvertSpreadsheetMarginsRequest.JSON_PROPERTY_BOTTOM
})

public class ConvertSpreadsheetMarginsRequest {
  public static final String JSON_PROPERTY_LEFT = "left";
  @javax.annotation.Nullable  private JsonNullable<String> left = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RIGHT = "right";
  @javax.annotation.Nullable  private JsonNullable<String> right = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOP = "top";
  @javax.annotation.Nullable  private JsonNullable<String> top = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BOTTOM = "bottom";
  @javax.annotation.Nullable  private JsonNullable<String> bottom = JsonNullable.<String>undefined();

  public ConvertSpreadsheetMarginsRequest() {
  }


  public ConvertSpreadsheetMarginsRequest left(@javax.annotation.Nullable String left) {
    this.left = JsonNullable.<String>of(left);
    
    return this;
  }

  /**
   * The left margin of the output PDF file.
   * @return left
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLeft() {
        return left.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LEFT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLeft_JsonNullable() {
    return left;
  }
  
  @JsonProperty(JSON_PROPERTY_LEFT)
  public void setLeft_JsonNullable(JsonNullable<String> left) {
    this.left = left;
  }

  public void setLeft(@javax.annotation.Nullable String left) {
    this.left = JsonNullable.<String>of(left);
  }

  public ConvertSpreadsheetMarginsRequest right(@javax.annotation.Nullable String right) {
    this.right = JsonNullable.<String>of(right);
    
    return this;
  }

  /**
   * The right margin of the output PDF file.
   * @return right
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRight() {
        return right.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRight_JsonNullable() {
    return right;
  }
  
  @JsonProperty(JSON_PROPERTY_RIGHT)
  public void setRight_JsonNullable(JsonNullable<String> right) {
    this.right = right;
  }

  public void setRight(@javax.annotation.Nullable String right) {
    this.right = JsonNullable.<String>of(right);
  }

  public ConvertSpreadsheetMarginsRequest top(@javax.annotation.Nullable String top) {
    this.top = JsonNullable.<String>of(top);
    
    return this;
  }

  /**
   * The top margin of the output PDF file.
   * @return top
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTop() {
        return top.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TOP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTop_JsonNullable() {
    return top;
  }
  
  @JsonProperty(JSON_PROPERTY_TOP)
  public void setTop_JsonNullable(JsonNullable<String> top) {
    this.top = top;
  }

  public void setTop(@javax.annotation.Nullable String top) {
    this.top = JsonNullable.<String>of(top);
  }

  public ConvertSpreadsheetMarginsRequest bottom(@javax.annotation.Nullable String bottom) {
    this.bottom = JsonNullable.<String>of(bottom);
    
    return this;
  }

  /**
   * The bottom margin of the output PDF file.
   * @return bottom
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getBottom() {
        return bottom.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_BOTTOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getBottom_JsonNullable() {
    return bottom;
  }
  
  @JsonProperty(JSON_PROPERTY_BOTTOM)
  public void setBottom_JsonNullable(JsonNullable<String> bottom) {
    this.bottom = bottom;
  }

  public void setBottom(@javax.annotation.Nullable String bottom) {
    this.bottom = JsonNullable.<String>of(bottom);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertSpreadsheetMarginsRequest convertSpreadsheetMarginsRequest = (ConvertSpreadsheetMarginsRequest) o;
    return equalsNullable(this.left, convertSpreadsheetMarginsRequest.left) &&
        equalsNullable(this.right, convertSpreadsheetMarginsRequest.right) &&
        equalsNullable(this.top, convertSpreadsheetMarginsRequest.top) &&
        equalsNullable(this.bottom, convertSpreadsheetMarginsRequest.bottom);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(left), hashCodeNullable(right), hashCodeNullable(top), hashCodeNullable(bottom));
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
    sb.append("class ConvertSpreadsheetMarginsRequest {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
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

    // add `left` to the URL query string
    if (getLeft() != null) {
      try {
        joiner.add(String.format("%sleft%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLeft()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `right` to the URL query string
    if (getRight() != null) {
      try {
        joiner.add(String.format("%sright%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `top` to the URL query string
    if (getTop() != null) {
      try {
        joiner.add(String.format("%stop%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTop()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bottom` to the URL query string
    if (getBottom() != null) {
      try {
        joiner.add(String.format("%sbottom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBottom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

