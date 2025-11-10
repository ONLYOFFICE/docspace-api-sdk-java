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
 * The logo config parameters.
 */
@JsonPropertyOrder({
  LogoConfigDto.JSON_PROPERTY_IMAGE,
  LogoConfigDto.JSON_PROPERTY_IMAGE_DARK,
  LogoConfigDto.JSON_PROPERTY_IMAGE_LIGHT,
  LogoConfigDto.JSON_PROPERTY_IMAGE_EMBEDDED,
  LogoConfigDto.JSON_PROPERTY_URL,
  LogoConfigDto.JSON_PROPERTY_VISIBLE
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class LogoConfigDto {
  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private JsonNullable<String> image = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE_DARK = "imageDark";
  @javax.annotation.Nullable
  private JsonNullable<String> imageDark = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE_LIGHT = "imageLight";
  @javax.annotation.Nullable
  private JsonNullable<String> imageLight = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE_EMBEDDED = "imageEmbedded";
  @javax.annotation.Nullable
  private JsonNullable<String> imageEmbedded = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  @javax.annotation.Nullable
  private Boolean visible;

  public LogoConfigDto() {
  }

  public LogoConfigDto image(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
    
    return this;
  }

  /**
   * The image of the logo.
   * @return image
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImage() {
        return image.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImage_JsonNullable() {
    return image;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE)
  public void setImage_JsonNullable(JsonNullable<String> image) {
    this.image = image;
  }

  public void setImage(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
  }

  public LogoConfigDto imageDark(@javax.annotation.Nullable String imageDark) {
    this.imageDark = JsonNullable.<String>of(imageDark);
    
    return this;
  }

  /**
   * The dark image of the logo.
   * @return imageDark
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImageDark() {
        return imageDark.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE_DARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImageDark_JsonNullable() {
    return imageDark;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE_DARK)
  public void setImageDark_JsonNullable(JsonNullable<String> imageDark) {
    this.imageDark = imageDark;
  }

  public void setImageDark(@javax.annotation.Nullable String imageDark) {
    this.imageDark = JsonNullable.<String>of(imageDark);
  }

  public LogoConfigDto imageLight(@javax.annotation.Nullable String imageLight) {
    this.imageLight = JsonNullable.<String>of(imageLight);
    
    return this;
  }

  /**
   * The light image of the logo.
   * @return imageLight
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImageLight() {
        return imageLight.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE_LIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImageLight_JsonNullable() {
    return imageLight;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE_LIGHT)
  public void setImageLight_JsonNullable(JsonNullable<String> imageLight) {
    this.imageLight = imageLight;
  }

  public void setImageLight(@javax.annotation.Nullable String imageLight) {
    this.imageLight = JsonNullable.<String>of(imageLight);
  }

  public LogoConfigDto imageEmbedded(@javax.annotation.Nullable String imageEmbedded) {
    this.imageEmbedded = JsonNullable.<String>of(imageEmbedded);
    
    return this;
  }

  /**
   * The embedded image of the logo.
   * @return imageEmbedded
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImageEmbedded() {
        return imageEmbedded.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImageEmbedded_JsonNullable() {
    return imageEmbedded;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE_EMBEDDED)
  public void setImageEmbedded_JsonNullable(JsonNullable<String> imageEmbedded) {
    this.imageEmbedded = imageEmbedded;
  }

  public void setImageEmbedded(@javax.annotation.Nullable String imageEmbedded) {
    this.imageEmbedded = JsonNullable.<String>of(imageEmbedded);
  }

  public LogoConfigDto url(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
    
    return this;
  }

  /**
   * The url link of the logo.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
  }

  public LogoConfigDto visible(@javax.annotation.Nullable Boolean visible) {
    
    this.visible = visible;
    return this;
  }

  /**
   * Specifies if the logo is visible.
   * @return visible
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisible() {
    return visible;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisible(@javax.annotation.Nullable Boolean visible) {
    this.visible = visible;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoConfigDto logoConfigDto = (LogoConfigDto) o;
    return equalsNullable(this.image, logoConfigDto.image) &&
        equalsNullable(this.imageDark, logoConfigDto.imageDark) &&
        equalsNullable(this.imageLight, logoConfigDto.imageLight) &&
        equalsNullable(this.imageEmbedded, logoConfigDto.imageEmbedded) &&
        equalsNullable(this.url, logoConfigDto.url) &&
        Objects.equals(this.visible, logoConfigDto.visible);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(image), hashCodeNullable(imageDark), hashCodeNullable(imageLight), hashCodeNullable(imageEmbedded), hashCodeNullable(url), visible);
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
    sb.append("class LogoConfigDto {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageDark: ").append(toIndentedString(imageDark)).append("\n");
    sb.append("    imageLight: ").append(toIndentedString(imageLight)).append("\n");
    sb.append("    imageEmbedded: ").append(toIndentedString(imageEmbedded)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

    // add `image` to the URL query string
    if (getImage() != null) {
      try {
        joiner.add(String.format("%simage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageDark` to the URL query string
    if (getImageDark() != null) {
      try {
        joiner.add(String.format("%simageDark%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageDark()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageLight` to the URL query string
    if (getImageLight() != null) {
      try {
        joiner.add(String.format("%simageLight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageLight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageEmbedded` to the URL query string
    if (getImageEmbedded() != null) {
      try {
        joiner.add(String.format("%simageEmbedded%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageEmbedded()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `visible` to the URL query string
    if (getVisible() != null) {
      try {
        joiner.add(String.format("%svisible%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVisible()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

