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
 * How a thumbnail is fitted. A field left out takes the document service default.
 */
@JsonPropertyOrder({
  ConvertThumbnailRequest.JSON_PROPERTY_ASPECT,
  ConvertThumbnailRequest.JSON_PROPERTY_FIRST,
  ConvertThumbnailRequest.JSON_PROPERTY_HEIGHT,
  ConvertThumbnailRequest.JSON_PROPERTY_WIDTH
})

public class ConvertThumbnailRequest {
  public static final String JSON_PROPERTY_ASPECT = "aspect";
  @javax.annotation.Nullable  private JsonNullable<Integer> aspect = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FIRST = "first";
  @javax.annotation.Nullable  private JsonNullable<Boolean> first = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_HEIGHT = "height";
  @javax.annotation.Nullable  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_WIDTH = "width";
  @javax.annotation.Nullable  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public ConvertThumbnailRequest() {
  }


  public ConvertThumbnailRequest aspect(@javax.annotation.Nullable Integer aspect) {
    this.aspect = JsonNullable.<Integer>of(aspect);
    
    return this;
  }

  /**
   * The mode to fit the image to the height and width specified:  0 - stretch file to fit height and width;  1 - keep the aspect for the image;  2 - convert the metric size of the page into pixels at 96 dpi.
   * @return aspect
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getAspect() {
        return aspect.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ASPECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getAspect_JsonNullable() {
    return aspect;
  }
  
  @JsonProperty(JSON_PROPERTY_ASPECT)
  public void setAspect_JsonNullable(JsonNullable<Integer> aspect) {
    this.aspect = aspect;
  }

  public void setAspect(@javax.annotation.Nullable Integer aspect) {
    this.aspect = JsonNullable.<Integer>of(aspect);
  }

  public ConvertThumbnailRequest first(@javax.annotation.Nullable Boolean first) {
    this.first = JsonNullable.<Boolean>of(first);
    
    return this;
  }

  /**
   * Whether a thumbnail is made of the first page only; false makes one of every page.
   * @return first
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getFirst() {
        return first.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIRST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getFirst_JsonNullable() {
    return first;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST)
  public void setFirst_JsonNullable(JsonNullable<Boolean> first) {
    this.first = first;
  }

  public void setFirst(@javax.annotation.Nullable Boolean first) {
    this.first = JsonNullable.<Boolean>of(first);
  }

  public ConvertThumbnailRequest height(@javax.annotation.Nullable Integer height) {
    this.height = JsonNullable.<Integer>of(height);
    
    return this;
  }

  /**
   * The thumbnail height in pixels; not used with aspect 2.
   * @return height
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getHeight() {
        return height.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getHeight_JsonNullable() {
    return height;
  }
  
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  public void setHeight_JsonNullable(JsonNullable<Integer> height) {
    this.height = height;
  }

  public void setHeight(@javax.annotation.Nullable Integer height) {
    this.height = JsonNullable.<Integer>of(height);
  }

  public ConvertThumbnailRequest width(@javax.annotation.Nullable Integer width) {
    this.width = JsonNullable.<Integer>of(width);
    
    return this;
  }

  /**
   * The thumbnail width in pixels; not used with aspect 2.
   * @return width
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getWidth() {
        return width.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getWidth_JsonNullable() {
    return width;
  }
  
  @JsonProperty(JSON_PROPERTY_WIDTH)
  public void setWidth_JsonNullable(JsonNullable<Integer> width) {
    this.width = width;
  }

  public void setWidth(@javax.annotation.Nullable Integer width) {
    this.width = JsonNullable.<Integer>of(width);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertThumbnailRequest convertThumbnailRequest = (ConvertThumbnailRequest) o;
    return equalsNullable(this.aspect, convertThumbnailRequest.aspect) &&
        equalsNullable(this.first, convertThumbnailRequest.first) &&
        equalsNullable(this.height, convertThumbnailRequest.height) &&
        equalsNullable(this.width, convertThumbnailRequest.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(aspect), hashCodeNullable(first), hashCodeNullable(height), hashCodeNullable(width));
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
    sb.append("class ConvertThumbnailRequest {\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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

    // add `aspect` to the URL query string
    if (getAspect() != null) {
      try {
        joiner.add(String.format("%saspect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAspect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `first` to the URL query string
    if (getFirst() != null) {
      try {
        joiner.add(String.format("%sfirst%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirst()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

