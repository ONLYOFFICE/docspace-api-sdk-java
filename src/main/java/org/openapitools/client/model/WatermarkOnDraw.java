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
import org.openapitools.client.model.Paragraph;
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
 * The document watermark parameters.
 */
@JsonPropertyOrder({
  WatermarkOnDraw.JSON_PROPERTY_WIDTH,
  WatermarkOnDraw.JSON_PROPERTY_HEIGHT,
  WatermarkOnDraw.JSON_PROPERTY_MARGINS,
  WatermarkOnDraw.JSON_PROPERTY_FILL,
  WatermarkOnDraw.JSON_PROPERTY_ROTATE,
  WatermarkOnDraw.JSON_PROPERTY_TRANSPARENT,
  WatermarkOnDraw.JSON_PROPERTY_PARAGRAPHS
})

public class WatermarkOnDraw {
  public static final String JSON_PROPERTY_WIDTH = "width";
  @javax.annotation.Nullable  private Double width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  @javax.annotation.Nullable  private Double height;

  public static final String JSON_PROPERTY_MARGINS = "margins";
  @javax.annotation.Nullable  private JsonNullable<List<Integer>> margins = JsonNullable.<List<Integer>>undefined();

  public static final String JSON_PROPERTY_FILL = "fill";
  @javax.annotation.Nullable  private JsonNullable<String> fill = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROTATE = "rotate";
  @javax.annotation.Nullable  private Integer rotate;

  public static final String JSON_PROPERTY_TRANSPARENT = "transparent";
  @javax.annotation.Nullable  private Double transparent;

  public static final String JSON_PROPERTY_PARAGRAPHS = "paragraphs";
  @javax.annotation.Nullable  private JsonNullable<List<Paragraph>> paragraphs = JsonNullable.<List<Paragraph>>undefined();

  public WatermarkOnDraw() {
  }


  public WatermarkOnDraw width(@javax.annotation.Nullable Double width) {
    
    this.width = width;
    return this;
  }

  /**
   * Defines the watermark width measured in millimeters.
   * @return width
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWidth() {
    return width;
  }


  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(@javax.annotation.Nullable Double width) {
    this.width = width;
  }

  public WatermarkOnDraw height(@javax.annotation.Nullable Double height) {
    
    this.height = height;
    return this;
  }

  /**
   * Defines the watermark height measured in millimeters.
   * @return height
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getHeight() {
    return height;
  }


  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(@javax.annotation.Nullable Double height) {
    this.height = height;
  }

  public WatermarkOnDraw margins(@javax.annotation.Nullable List<Integer> margins) {
    this.margins = JsonNullable.<List<Integer>>of(margins);
    
    return this;
  }

  public WatermarkOnDraw addMarginsItem(Integer marginsItem) {
    if (this.margins == null || !this.margins.isPresent()) {
      this.margins = JsonNullable.<List<Integer>>of(new ArrayList<>());
    }
    try {
      this.margins.get().add(marginsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Defines the watermark margins measured in millimeters.
   * @return margins
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<Integer> getMargins() {
        return margins.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MARGINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Integer>> getMargins_JsonNullable() {
    return margins;
  }
  
  @JsonProperty(JSON_PROPERTY_MARGINS)
  public void setMargins_JsonNullable(JsonNullable<List<Integer>> margins) {
    this.margins = margins;
  }

  public void setMargins(@javax.annotation.Nullable List<Integer> margins) {
    this.margins = JsonNullable.<List<Integer>>of(margins);
  }

  public WatermarkOnDraw fill(@javax.annotation.Nullable String fill) {
    this.fill = JsonNullable.<String>of(fill);
    
    return this;
  }

  /**
   * Defines the watermark fill color.
   * @return fill
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFill() {
        return fill.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFill_JsonNullable() {
    return fill;
  }
  
  @JsonProperty(JSON_PROPERTY_FILL)
  public void setFill_JsonNullable(JsonNullable<String> fill) {
    this.fill = fill;
  }

  public void setFill(@javax.annotation.Nullable String fill) {
    this.fill = JsonNullable.<String>of(fill);
  }

  public WatermarkOnDraw rotate(@javax.annotation.Nullable Integer rotate) {
    
    this.rotate = rotate;
    return this;
  }

  /**
   * Defines the watermark rotation angle.
   * @return rotate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROTATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRotate() {
    return rotate;
  }


  @JsonProperty(value = JSON_PROPERTY_ROTATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRotate(@javax.annotation.Nullable Integer rotate) {
    this.rotate = rotate;
  }

  public WatermarkOnDraw transparent(@javax.annotation.Nullable Double transparent) {
    
    this.transparent = transparent;
    return this;
  }

  /**
   * Defines the watermark transparency percentage.
   * @return transparent
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TRANSPARENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTransparent() {
    return transparent;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPARENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransparent(@javax.annotation.Nullable Double transparent) {
    this.transparent = transparent;
  }

  public WatermarkOnDraw paragraphs(@javax.annotation.Nullable List<Paragraph> paragraphs) {
    this.paragraphs = JsonNullable.<List<Paragraph>>of(paragraphs);
    
    return this;
  }

  public WatermarkOnDraw addParagraphsItem(Paragraph paragraphsItem) {
    if (this.paragraphs == null || !this.paragraphs.isPresent()) {
      this.paragraphs = JsonNullable.<List<Paragraph>>of(new ArrayList<>());
    }
    try {
      this.paragraphs.get().add(paragraphsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of paragraphs of the watermark.
   * @return paragraphs
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<Paragraph> getParagraphs() {
        return paragraphs.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARAGRAPHS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Paragraph>> getParagraphs_JsonNullable() {
    return paragraphs;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAGRAPHS)
  public void setParagraphs_JsonNullable(JsonNullable<List<Paragraph>> paragraphs) {
    this.paragraphs = paragraphs;
  }

  public void setParagraphs(@javax.annotation.Nullable List<Paragraph> paragraphs) {
    this.paragraphs = JsonNullable.<List<Paragraph>>of(paragraphs);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatermarkOnDraw watermarkOnDraw = (WatermarkOnDraw) o;
    return Objects.equals(this.width, watermarkOnDraw.width) &&
        Objects.equals(this.height, watermarkOnDraw.height) &&
        equalsNullable(this.margins, watermarkOnDraw.margins) &&
        equalsNullable(this.fill, watermarkOnDraw.fill) &&
        Objects.equals(this.rotate, watermarkOnDraw.rotate) &&
        Objects.equals(this.transparent, watermarkOnDraw.transparent) &&
        equalsNullable(this.paragraphs, watermarkOnDraw.paragraphs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, hashCodeNullable(margins), hashCodeNullable(fill), rotate, transparent, hashCodeNullable(paragraphs));
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
    sb.append("class WatermarkOnDraw {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    margins: ").append(toIndentedString(margins)).append("\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    transparent: ").append(toIndentedString(transparent)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
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

    // add `width` to the URL query string
    if (getWidth() != null) {
      try {
        joiner.add(String.format("%swidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWidth()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `margins` to the URL query string
    if (getMargins() != null) {
      for (int i = 0; i < getMargins().size(); i++) {
        try {
          joiner.add(String.format("%smargins%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getMargins().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `fill` to the URL query string
    if (getFill() != null) {
      try {
        joiner.add(String.format("%sfill%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFill()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rotate` to the URL query string
    if (getRotate() != null) {
      try {
        joiner.add(String.format("%srotate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRotate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transparent` to the URL query string
    if (getTransparent() != null) {
      try {
        joiner.add(String.format("%stransparent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransparent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paragraphs` to the URL query string
    if (getParagraphs() != null) {
      for (int i = 0; i < getParagraphs().size(); i++) {
        if (getParagraphs().get(i) != null) {
          joiner.add(getParagraphs().get(i).toUrlQueryString(String.format("%sparagraphs%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

