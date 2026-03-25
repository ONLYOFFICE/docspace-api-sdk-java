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
 * The request parameters for adding watermarks.
 */
@JsonPropertyOrder({
  WatermarkRequestDto.JSON_PROPERTY_ENABLED,
  WatermarkRequestDto.JSON_PROPERTY_ADDITIONS,
  WatermarkRequestDto.JSON_PROPERTY_TEXT,
  WatermarkRequestDto.JSON_PROPERTY_ROTATE,
  WatermarkRequestDto.JSON_PROPERTY_IMAGE_SCALE,
  WatermarkRequestDto.JSON_PROPERTY_IMAGE_URL,
  WatermarkRequestDto.JSON_PROPERTY_IMAGE_HEIGHT,
  WatermarkRequestDto.JSON_PROPERTY_IMAGE_WIDTH
})

public class WatermarkRequestDto {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable  private JsonNullable<Boolean> enabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  @javax.annotation.Nullable  private WatermarkAdditions additions;

  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nullable  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROTATE = "rotate";
  @javax.annotation.Nullable  private Integer rotate;

  public static final String JSON_PROPERTY_IMAGE_SCALE = "imageScale";
  @javax.annotation.Nullable  private Integer imageScale;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  @javax.annotation.Nullable  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE_HEIGHT = "imageHeight";
  @javax.annotation.Nullable  private Double imageHeight;

  public static final String JSON_PROPERTY_IMAGE_WIDTH = "imageWidth";
  @javax.annotation.Nullable  private Double imageWidth;

  public WatermarkRequestDto() {
  }


  public WatermarkRequestDto enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
    
    return this;
  }

  /**
   * Specifies whether watermarks are on or off.
   * @return enabled
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getEnabled() {
        return enabled.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getEnabled_JsonNullable() {
    return enabled;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED)
  public void setEnabled_JsonNullable(JsonNullable<Boolean> enabled) {
    this.enabled = enabled;
  }

  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
  }

  public WatermarkRequestDto additions(@javax.annotation.Nullable WatermarkAdditions additions) {
    
    this.additions = additions;
    return this;
  }

  /**
   * Get additions
   * @return additions
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ADDITIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WatermarkAdditions getAdditions() {
    return additions;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditions(@javax.annotation.Nullable WatermarkAdditions additions) {
    this.additions = additions;
  }

  public WatermarkRequestDto text(@javax.annotation.Nullable String text) {
    this.text = JsonNullable.<String>of(text);
    
    return this;
  }

  /**
   * The watermark text.
   * @return text
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getText() {
        return text.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
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

  public WatermarkRequestDto rotate(@javax.annotation.Nullable Integer rotate) {
    
    this.rotate = rotate;
    return this;
  }

  /**
   * The watermark text and image rotate angle.
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

  public WatermarkRequestDto imageScale(@javax.annotation.Nullable Integer imageScale) {
    
    this.imageScale = imageScale;
    return this;
  }

  /**
   * The watermark image scale.
   * @return imageScale
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE_SCALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getImageScale() {
    return imageScale;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE_SCALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageScale(@javax.annotation.Nullable Integer imageScale) {
    this.imageScale = imageScale;
  }

  public WatermarkRequestDto imageUrl(@javax.annotation.Nullable String imageUrl) {
    this.imageUrl = JsonNullable.<String>of(imageUrl);
    
    return this;
  }

  /**
   * The path to the temporary image file.
   * @return imageUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getImageUrl() {
        return imageUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IMAGE_URL, required = false)
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

  public WatermarkRequestDto imageHeight(@javax.annotation.Nullable Double imageHeight) {
    
    this.imageHeight = imageHeight;
    return this;
  }

  /**
   * The watermark image height.
   * @return imageHeight
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImageHeight() {
    return imageHeight;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageHeight(@javax.annotation.Nullable Double imageHeight) {
    this.imageHeight = imageHeight;
  }

  public WatermarkRequestDto imageWidth(@javax.annotation.Nullable Double imageWidth) {
    
    this.imageWidth = imageWidth;
    return this;
  }

  /**
   * The watermark image width.
   * @return imageWidth
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImageWidth() {
    return imageWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageWidth(@javax.annotation.Nullable Double imageWidth) {
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
    WatermarkRequestDto watermarkRequestDto = (WatermarkRequestDto) o;
    return equalsNullable(this.enabled, watermarkRequestDto.enabled) &&
        Objects.equals(this.additions, watermarkRequestDto.additions) &&
        equalsNullable(this.text, watermarkRequestDto.text) &&
        Objects.equals(this.rotate, watermarkRequestDto.rotate) &&
        Objects.equals(this.imageScale, watermarkRequestDto.imageScale) &&
        equalsNullable(this.imageUrl, watermarkRequestDto.imageUrl) &&
        Objects.equals(this.imageHeight, watermarkRequestDto.imageHeight) &&
        Objects.equals(this.imageWidth, watermarkRequestDto.imageWidth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(enabled), additions, hashCodeNullable(text), rotate, imageScale, hashCodeNullable(imageUrl), imageHeight, imageWidth);
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
    sb.append("class WatermarkRequestDto {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

