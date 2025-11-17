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
 * The thumbnail request.
 */
@JsonPropertyOrder({
  ThumbnailsRequest.JSON_PROPERTY_TMP_FILE,
  ThumbnailsRequest.JSON_PROPERTY_X,
  ThumbnailsRequest.JSON_PROPERTY_Y,
  ThumbnailsRequest.JSON_PROPERTY_WIDTH,
  ThumbnailsRequest.JSON_PROPERTY_HEIGHT
})

public class ThumbnailsRequest {
  public static final String JSON_PROPERTY_TMP_FILE = "tmpFile";
  @javax.annotation.Nullable
  private JsonNullable<String> tmpFile = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_X = "x";
  @javax.annotation.Nullable
  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  @javax.annotation.Nullable
  private Integer y;

  public static final String JSON_PROPERTY_WIDTH = "width";
  @javax.annotation.Nullable
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  @javax.annotation.Nullable
  private Integer height;

  public ThumbnailsRequest() {
  }

  public ThumbnailsRequest tmpFile(@javax.annotation.Nullable String tmpFile) {
    this.tmpFile = JsonNullable.<String>of(tmpFile);
    
    return this;
  }

  /**
   * The path to the temporary thumbnail file.
   * @return tmpFile
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTmpFile() {
        return tmpFile.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TMP_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTmpFile_JsonNullable() {
    return tmpFile;
  }
  
  @JsonProperty(JSON_PROPERTY_TMP_FILE)
  public void setTmpFile_JsonNullable(JsonNullable<String> tmpFile) {
    this.tmpFile = tmpFile;
  }

  public void setTmpFile(@javax.annotation.Nullable String tmpFile) {
    this.tmpFile = JsonNullable.<String>of(tmpFile);
  }

  public ThumbnailsRequest x(@javax.annotation.Nullable Integer x) {
    
    this.x = x;
    return this;
  }

  /**
   * The thumbnail horizontal coordinate.
   * @return x
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getX() {
    return x;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(@javax.annotation.Nullable Integer x) {
    this.x = x;
  }

  public ThumbnailsRequest y(@javax.annotation.Nullable Integer y) {
    
    this.y = y;
    return this;
  }

  /**
   * The thumbnail vertical coordinate.
   * @return y
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getY() {
    return y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(@javax.annotation.Nullable Integer y) {
    this.y = y;
  }

  public ThumbnailsRequest width(@javax.annotation.Nullable Integer width) {
    
    this.width = width;
    return this;
  }

  /**
   * The thumbnail width.
   * @return width
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(@javax.annotation.Nullable Integer width) {
    this.width = width;
  }

  public ThumbnailsRequest height(@javax.annotation.Nullable Integer height) {
    
    this.height = height;
    return this;
  }

  /**
   * The thumbnail height.
   * @return height
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
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
    ThumbnailsRequest thumbnailsRequest = (ThumbnailsRequest) o;
    return equalsNullable(this.tmpFile, thumbnailsRequest.tmpFile) &&
        Objects.equals(this.x, thumbnailsRequest.x) &&
        Objects.equals(this.y, thumbnailsRequest.y) &&
        Objects.equals(this.width, thumbnailsRequest.width) &&
        Objects.equals(this.height, thumbnailsRequest.height);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(tmpFile), x, y, width, height);
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
    sb.append("class ThumbnailsRequest {\n");
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

