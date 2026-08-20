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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The logo request parameters.
 */
@JsonPropertyOrder({
  LogoRequest.JSON_PROPERTY_TMP_FILE,
  LogoRequest.JSON_PROPERTY_X,
  LogoRequest.JSON_PROPERTY_Y,
  LogoRequest.JSON_PROPERTY_WIDTH,
  LogoRequest.JSON_PROPERTY_HEIGHT
})

public class LogoRequest {
  public static final String JSON_PROPERTY_TMP_FILE = "tmpFile";
  @javax.annotation.Nonnull  private String tmpFile;

  public static final String JSON_PROPERTY_X = "x";
  @javax.annotation.Nullable  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  @javax.annotation.Nullable  private Integer y;

  public static final String JSON_PROPERTY_WIDTH = "width";
  @javax.annotation.Nullable  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  @javax.annotation.Nullable  private Integer height;

  public LogoRequest() {
  }


  public LogoRequest tmpFile(@javax.annotation.Nonnull String tmpFile) {
    
    this.tmpFile = tmpFile;
    return this;
  }

  /**
   * The path to the temporary image file.
   * @return tmpFile
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TMP_FILE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTmpFile() {
    return tmpFile;
  }


  @JsonProperty(value = JSON_PROPERTY_TMP_FILE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTmpFile(@javax.annotation.Nonnull String tmpFile) {
    this.tmpFile = tmpFile;
  }

  public LogoRequest x(@javax.annotation.Nullable Integer x) {
    
    this.x = x;
    return this;
  }

  /**
   * The X coordinate of the rectangle starting point.
   * minimum: 0
   * maximum: 1280
   * @return x
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_X, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getX() {
    return x;
  }


  @JsonProperty(value = JSON_PROPERTY_X, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(@javax.annotation.Nullable Integer x) {
    this.x = x;
  }

  public LogoRequest y(@javax.annotation.Nullable Integer y) {
    
    this.y = y;
    return this;
  }

  /**
   * The Y coordinate of the rectangle starting point.
   * minimum: 0
   * maximum: 1280
   * @return y
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_Y, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getY() {
    return y;
  }


  @JsonProperty(value = JSON_PROPERTY_Y, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(@javax.annotation.Nullable Integer y) {
    this.y = y;
  }

  public LogoRequest width(@javax.annotation.Nullable Integer width) {
    
    this.width = width;
    return this;
  }

  /**
   * The rectangle width.
   * minimum: 1
   * maximum: 1280
   * @return width
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(@javax.annotation.Nullable Integer width) {
    this.width = width;
  }

  public LogoRequest height(@javax.annotation.Nullable Integer height) {
    
    this.height = height;
    return this;
  }

  /**
   * The rectangle height.
   * minimum: 1
   * maximum: 1280
   * @return height
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(@javax.annotation.Nullable Integer height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoRequest logoRequest = (LogoRequest) o;
    return Objects.equals(this.tmpFile, logoRequest.tmpFile) &&
        Objects.equals(this.x, logoRequest.x) &&
        Objects.equals(this.y, logoRequest.y) &&
        Objects.equals(this.width, logoRequest.width) &&
        Objects.equals(this.height, logoRequest.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tmpFile, x, y, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoRequest {\n");
    sb.append("    tmpFile: ").append(toIndentedString(tmpFile)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

    // add `tmpFile` to the URL query string
    if (getTmpFile() != null) {
      try {
        joiner.add(String.format("%stmpFile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTmpFile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `x` to the URL query string
    if (getX() != null) {
      try {
        joiner.add(String.format("%sx%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getX()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `y` to the URL query string
    if (getY() != null) {
      try {
        joiner.add(String.format("%sy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getY()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `height` to the URL query string
    if (getHeight() != null) {
      try {
        joiner.add(String.format("%sheight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHeight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

