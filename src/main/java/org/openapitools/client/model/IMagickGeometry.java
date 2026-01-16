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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * IMagickGeometry
 */
@JsonPropertyOrder({
  IMagickGeometry.JSON_PROPERTY_ASPECT_RATIO,
  IMagickGeometry.JSON_PROPERTY_FILL_AREA,
  IMagickGeometry.JSON_PROPERTY_GREATER,
  IMagickGeometry.JSON_PROPERTY_HEIGHT,
  IMagickGeometry.JSON_PROPERTY_IGNORE_ASPECT_RATIO,
  IMagickGeometry.JSON_PROPERTY_IS_PERCENTAGE,
  IMagickGeometry.JSON_PROPERTY_LESS,
  IMagickGeometry.JSON_PROPERTY_LIMIT_PIXELS,
  IMagickGeometry.JSON_PROPERTY_WIDTH,
  IMagickGeometry.JSON_PROPERTY_X,
  IMagickGeometry.JSON_PROPERTY_Y
})

public class IMagickGeometry {
  public static final String JSON_PROPERTY_ASPECT_RATIO = "aspectRatio";
  @javax.annotation.Nullable
  private Boolean aspectRatio;

  public static final String JSON_PROPERTY_FILL_AREA = "fillArea";
  @javax.annotation.Nullable
  private Boolean fillArea;

  public static final String JSON_PROPERTY_GREATER = "greater";
  @javax.annotation.Nullable
  private Boolean greater;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  @javax.annotation.Nullable
  private Integer height;

  public static final String JSON_PROPERTY_IGNORE_ASPECT_RATIO = "ignoreAspectRatio";
  @javax.annotation.Nullable
  private Boolean ignoreAspectRatio;

  public static final String JSON_PROPERTY_IS_PERCENTAGE = "isPercentage";
  @javax.annotation.Nullable
  private Boolean isPercentage;

  public static final String JSON_PROPERTY_LESS = "less";
  @javax.annotation.Nullable
  private Boolean less;

  public static final String JSON_PROPERTY_LIMIT_PIXELS = "limitPixels";
  @javax.annotation.Nullable
  private Boolean limitPixels;

  public static final String JSON_PROPERTY_WIDTH = "width";
  @javax.annotation.Nullable
  private Integer width;

  public static final String JSON_PROPERTY_X = "x";
  @javax.annotation.Nullable
  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  @javax.annotation.Nullable
  private Integer y;

  public IMagickGeometry() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public IMagickGeometry(
    @JsonProperty(JSON_PROPERTY_ASPECT_RATIO) Boolean aspectRatio
  ) {
    this();
    this.aspectRatio = aspectRatio;
  }


  /**
   * Get aspectRatio
   * @return aspectRatio
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAspectRatio() {
    return aspectRatio;
  }



  public IMagickGeometry fillArea(@javax.annotation.Nullable Boolean fillArea) {
    
    this.fillArea = fillArea;
    return this;
  }

  /**
   * Get fillArea
   * @return fillArea
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFillArea() {
    return fillArea;
  }


  @JsonProperty(JSON_PROPERTY_FILL_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillArea(@javax.annotation.Nullable Boolean fillArea) {
    this.fillArea = fillArea;
  }

  public IMagickGeometry greater(@javax.annotation.Nullable Boolean greater) {
    
    this.greater = greater;
    return this;
  }

  /**
   * Get greater
   * @return greater
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GREATER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGreater() {
    return greater;
  }


  @JsonProperty(JSON_PROPERTY_GREATER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGreater(@javax.annotation.Nullable Boolean greater) {
    this.greater = greater;
  }

  public IMagickGeometry height(@javax.annotation.Nullable Integer height) {
    
    this.height = height;
    return this;
  }

  /**
   * Get height
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

  public IMagickGeometry ignoreAspectRatio(@javax.annotation.Nullable Boolean ignoreAspectRatio) {
    
    this.ignoreAspectRatio = ignoreAspectRatio;
    return this;
  }

  /**
   * Get ignoreAspectRatio
   * @return ignoreAspectRatio
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIgnoreAspectRatio() {
    return ignoreAspectRatio;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnoreAspectRatio(@javax.annotation.Nullable Boolean ignoreAspectRatio) {
    this.ignoreAspectRatio = ignoreAspectRatio;
  }

  public IMagickGeometry isPercentage(@javax.annotation.Nullable Boolean isPercentage) {
    
    this.isPercentage = isPercentage;
    return this;
  }

  /**
   * Get isPercentage
   * @return isPercentage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPercentage() {
    return isPercentage;
  }


  @JsonProperty(JSON_PROPERTY_IS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPercentage(@javax.annotation.Nullable Boolean isPercentage) {
    this.isPercentage = isPercentage;
  }

  public IMagickGeometry less(@javax.annotation.Nullable Boolean less) {
    
    this.less = less;
    return this;
  }

  /**
   * Get less
   * @return less
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLess() {
    return less;
  }


  @JsonProperty(JSON_PROPERTY_LESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLess(@javax.annotation.Nullable Boolean less) {
    this.less = less;
  }

  public IMagickGeometry limitPixels(@javax.annotation.Nullable Boolean limitPixels) {
    
    this.limitPixels = limitPixels;
    return this;
  }

  /**
   * Get limitPixels
   * @return limitPixels
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_PIXELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLimitPixels() {
    return limitPixels;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_PIXELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitPixels(@javax.annotation.Nullable Boolean limitPixels) {
    this.limitPixels = limitPixels;
  }

  public IMagickGeometry width(@javax.annotation.Nullable Integer width) {
    
    this.width = width;
    return this;
  }

  /**
   * Get width
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

  public IMagickGeometry x(@javax.annotation.Nullable Integer x) {
    
    this.x = x;
    return this;
  }

  /**
   * Get x
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

  public IMagickGeometry y(@javax.annotation.Nullable Integer y) {
    
    this.y = y;
    return this;
  }

  /**
   * Get y
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IMagickGeometry imagickGeometry = (IMagickGeometry) o;
    return Objects.equals(this.aspectRatio, imagickGeometry.aspectRatio) &&
        Objects.equals(this.fillArea, imagickGeometry.fillArea) &&
        Objects.equals(this.greater, imagickGeometry.greater) &&
        Objects.equals(this.height, imagickGeometry.height) &&
        Objects.equals(this.ignoreAspectRatio, imagickGeometry.ignoreAspectRatio) &&
        Objects.equals(this.isPercentage, imagickGeometry.isPercentage) &&
        Objects.equals(this.less, imagickGeometry.less) &&
        Objects.equals(this.limitPixels, imagickGeometry.limitPixels) &&
        Objects.equals(this.width, imagickGeometry.width) &&
        Objects.equals(this.x, imagickGeometry.x) &&
        Objects.equals(this.y, imagickGeometry.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRatio, fillArea, greater, height, ignoreAspectRatio, isPercentage, less, limitPixels, width, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IMagickGeometry {\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    fillArea: ").append(toIndentedString(fillArea)).append("\n");
    sb.append("    greater: ").append(toIndentedString(greater)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    ignoreAspectRatio: ").append(toIndentedString(ignoreAspectRatio)).append("\n");
    sb.append("    isPercentage: ").append(toIndentedString(isPercentage)).append("\n");
    sb.append("    less: ").append(toIndentedString(less)).append("\n");
    sb.append("    limitPixels: ").append(toIndentedString(limitPixels)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

    // add `aspectRatio` to the URL query string
    if (getAspectRatio() != null) {
      try {
        joiner.add(String.format("%saspectRatio%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAspectRatio()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fillArea` to the URL query string
    if (getFillArea() != null) {
      try {
        joiner.add(String.format("%sfillArea%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFillArea()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `greater` to the URL query string
    if (getGreater() != null) {
      try {
        joiner.add(String.format("%sgreater%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGreater()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `ignoreAspectRatio` to the URL query string
    if (getIgnoreAspectRatio() != null) {
      try {
        joiner.add(String.format("%signoreAspectRatio%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIgnoreAspectRatio()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isPercentage` to the URL query string
    if (getIsPercentage() != null) {
      try {
        joiner.add(String.format("%sisPercentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsPercentage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `less` to the URL query string
    if (getLess() != null) {
      try {
        joiner.add(String.format("%sless%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limitPixels` to the URL query string
    if (getLimitPixels() != null) {
      try {
        joiner.add(String.format("%slimitPixels%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimitPixels()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

