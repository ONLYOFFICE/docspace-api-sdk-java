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
 * The page size of the output PDF file, each side a length with its unit: mm, cm or in.
 */
@JsonPropertyOrder({
  ConvertSpreadsheetPageSizeRequest.JSON_PROPERTY_HEIGHT,
  ConvertSpreadsheetPageSizeRequest.JSON_PROPERTY_WIDTH
})

public class ConvertSpreadsheetPageSizeRequest {
  public static final String JSON_PROPERTY_HEIGHT = "height";
  @javax.annotation.Nullable  private JsonNullable<String> height = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WIDTH = "width";
  @javax.annotation.Nullable  private JsonNullable<String> width = JsonNullable.<String>undefined();

  public ConvertSpreadsheetPageSizeRequest() {
  }


  public ConvertSpreadsheetPageSizeRequest height(@javax.annotation.Nullable String height) {
    this.height = JsonNullable.<String>of(height);
    
    return this;
  }

  /**
   * The page height of the output PDF file.
   * @return height
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getHeight() {
        return height.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getHeight_JsonNullable() {
    return height;
  }
  
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  public void setHeight_JsonNullable(JsonNullable<String> height) {
    this.height = height;
  }

  public void setHeight(@javax.annotation.Nullable String height) {
    this.height = JsonNullable.<String>of(height);
  }

  public ConvertSpreadsheetPageSizeRequest width(@javax.annotation.Nullable String width) {
    this.width = JsonNullable.<String>of(width);
    
    return this;
  }

  /**
   * The page width of the output PDF file.
   * @return width
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getWidth() {
        return width.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getWidth_JsonNullable() {
    return width;
  }
  
  @JsonProperty(JSON_PROPERTY_WIDTH)
  public void setWidth_JsonNullable(JsonNullable<String> width) {
    this.width = width;
  }

  public void setWidth(@javax.annotation.Nullable String width) {
    this.width = JsonNullable.<String>of(width);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertSpreadsheetPageSizeRequest convertSpreadsheetPageSizeRequest = (ConvertSpreadsheetPageSizeRequest) o;
    return equalsNullable(this.height, convertSpreadsheetPageSizeRequest.height) &&
        equalsNullable(this.width, convertSpreadsheetPageSizeRequest.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(height), hashCodeNullable(width));
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
    sb.append("class ConvertSpreadsheetPageSizeRequest {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

    // add `height` to the URL query string
    if (getHeight() != null) {
      try {
        joiner.add(String.format("%sheight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHeight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `width` to the URL query string
    if (getWidth() != null) {
      try {
        joiner.add(String.format("%swidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWidth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

