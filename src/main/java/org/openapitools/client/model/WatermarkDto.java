/*
 * (c) Copyright Ascensio System SIA 2025
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
import org.openapitools.client.model.WatermarkAdditions;
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
 * The watermark settings.
 */
@JsonPropertyOrder({
  WatermarkDto.JSON_PROPERTY_ADDITIONS,
  WatermarkDto.JSON_PROPERTY_TEXT,
  WatermarkDto.JSON_PROPERTY_ROTATE,
  WatermarkDto.JSON_PROPERTY_IMAGE_SCALE,
  WatermarkDto.JSON_PROPERTY_IMAGE_URL,
  WatermarkDto.JSON_PROPERTY_IMAGE_HEIGHT,
  WatermarkDto.JSON_PROPERTY_IMAGE_WIDTH
})

public class WatermarkDto {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  @javax.annotation.Nonnull
  private WatermarkAdditions additions;

  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nullable
  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROTATE = "rotate";
  @javax.annotation.Nonnull
  private Integer rotate;

  public static final String JSON_PROPERTY_IMAGE_SCALE = "imageScale";
  @javax.annotation.Nonnull
  private Integer imageScale;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE_HEIGHT = "imageHeight";
  @javax.annotation.Nonnull
  private Double imageHeight;

  public static final String JSON_PROPERTY_IMAGE_WIDTH = "imageWidth";
  @javax.annotation.Nonnull
  private Double imageWidth;

  public WatermarkDto() {
  }


  public WatermarkDto additions(@javax.annotation.Nonnull WatermarkAdditions additions) {
    
    this.additions = additions;
    return this;
  }

  /**
   * Get additions
   * @return additions
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WatermarkAdditions getAdditions() {
    return additions;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdditions(@javax.annotation.Nonnull WatermarkAdditions additions) {
    this.additions = additions;
  }

  public WatermarkDto text(@javax.annotation.Nullable String text) {
    this.text = JsonNullable.<String>of(text);
    
    return this;
  }

  /**
   * The watermark text.
   * @return text
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getText() {
        return text.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getText_JsonNullable() {
    return text;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT)
  public void setText_JsonNullable(JsonNullable<String> text) {
    this.text = text;
  }

  public void setText(@javax.annotation.Nullable String text) {
    this.text = JsonNullable.<String>of(text);
  }

  public WatermarkDto rotate(@javax.annotation.Nonnull Integer rotate) {
    
    this.rotate = rotate;
    return this;
  }

  /**
   * The watermark text and image rotate.
   * @return rotate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROTATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRotate() {
    return rotate;
  }


  @JsonProperty(JSON_PROPERTY_ROTATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRotate(@javax.annotation.Nonnull Integer rotate) {
    this.rotate = rotate;
  }

  public WatermarkDto imageScale(@javax.annotation.Nonnull Integer imageScale) {
    
    this.imageScale = imageScale;
    return this;
  }

  /**
   * The watermark image scale.
   * @return imageScale
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IMAGE_SCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getImageScale() {
    return imageScale;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_SCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageScale(@javax.annotation.Nonnull Integer imageScale) {
    this.imageScale = imageScale;
  }

  public WatermarkDto imageUrl(@javax.annotation.Nullable String imageUrl) {
    this.imageUrl = JsonNullable.<String>of(imageUrl);
    
    return this;
  }

  /**
   * The watermark image url.
   * @return imageUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImageUrl() {
        return imageUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImageUrl_JsonNullable() {
    return imageUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  public void setImageUrl_JsonNullable(JsonNullable<String> imageUrl) {
    this.imageUrl = imageUrl;
  }

  public void setImageUrl(@javax.annotation.Nullable String imageUrl) {
    this.imageUrl = JsonNullable.<String>of(imageUrl);
  }

  public WatermarkDto imageHeight(@javax.annotation.Nonnull Double imageHeight) {
    
    this.imageHeight = imageHeight;
    return this;
  }

  /**
   * The watermark image height.
   * @return imageHeight
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IMAGE_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getImageHeight() {
    return imageHeight;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageHeight(@javax.annotation.Nonnull Double imageHeight) {
    this.imageHeight = imageHeight;
  }

  public WatermarkDto imageWidth(@javax.annotation.Nonnull Double imageWidth) {
    
    this.imageWidth = imageWidth;
    return this;
  }

  /**
   * The watermark image width.
   * @return imageWidth
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IMAGE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getImageWidth() {
    return imageWidth;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageWidth(@javax.annotation.Nonnull Double imageWidth) {
    this.imageWidth = imageWidth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatermarkDto watermarkDto = (WatermarkDto) o;
    return Objects.equals(this.additions, watermarkDto.additions) &&
        equalsNullable(this.text, watermarkDto.text) &&
        Objects.equals(this.rotate, watermarkDto.rotate) &&
        Objects.equals(this.imageScale, watermarkDto.imageScale) &&
        equalsNullable(this.imageUrl, watermarkDto.imageUrl) &&
        Objects.equals(this.imageHeight, watermarkDto.imageHeight) &&
        Objects.equals(this.imageWidth, watermarkDto.imageWidth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, hashCodeNullable(text), rotate, imageScale, hashCodeNullable(imageUrl), imageHeight, imageWidth);
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
    sb.append("class WatermarkDto {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    imageScale: ").append(toIndentedString(imageScale)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
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

    // add `additions` to the URL query string
    if (getAdditions() != null) {
      try {
        joiner.add(String.format("%sadditions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdditions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `text` to the URL query string
    if (getText() != null) {
      try {
        joiner.add(String.format("%stext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getText()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `imageScale` to the URL query string
    if (getImageScale() != null) {
      try {
        joiner.add(String.format("%simageScale%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageScale()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageUrl` to the URL query string
    if (getImageUrl() != null) {
      try {
        joiner.add(String.format("%simageUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageHeight` to the URL query string
    if (getImageHeight() != null) {
      try {
        joiner.add(String.format("%simageHeight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageHeight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageWidth` to the URL query string
    if (getImageWidth() != null) {
      try {
        joiner.add(String.format("%simageWidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageWidth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

