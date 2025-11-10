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
import org.openapitools.client.model.LogoCover;
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
 * The room logo information.
 */
@JsonPropertyOrder({
  Logo.JSON_PROPERTY_ORIGINAL,
  Logo.JSON_PROPERTY_LARGE,
  Logo.JSON_PROPERTY_MEDIUM,
  Logo.JSON_PROPERTY_SMALL,
  Logo.JSON_PROPERTY_COLOR,
  Logo.JSON_PROPERTY_COVER
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class Logo {
  public static final String JSON_PROPERTY_ORIGINAL = "original";
  @javax.annotation.Nullable
  private String original;

  public static final String JSON_PROPERTY_LARGE = "large";
  @javax.annotation.Nullable
  private String large;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  @javax.annotation.Nullable
  private String medium;

  public static final String JSON_PROPERTY_SMALL = "small";
  @javax.annotation.Nullable
  private String small;

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private JsonNullable<String> color = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COVER = "cover";
  @javax.annotation.Nullable
  private LogoCover cover;

  public Logo() {
  }

  public Logo original(@javax.annotation.Nullable String original) {
    
    this.original = original;
    return this;
  }

  /**
   * The original logo.
   * @return original
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOriginal() {
    return original;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginal(@javax.annotation.Nullable String original) {
    this.original = original;
  }

  public Logo large(@javax.annotation.Nullable String large) {
    
    this.large = large;
    return this;
  }

  /**
   * The large logo.
   * @return large
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLarge() {
    return large;
  }


  @JsonProperty(JSON_PROPERTY_LARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLarge(@javax.annotation.Nullable String large) {
    this.large = large;
  }

  public Logo medium(@javax.annotation.Nullable String medium) {
    
    this.medium = medium;
    return this;
  }

  /**
   * The medium logo.
   * @return medium
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMedium(@javax.annotation.Nullable String medium) {
    this.medium = medium;
  }

  public Logo small(@javax.annotation.Nullable String small) {
    
    this.small = small;
    return this;
  }

  /**
   * The small logo.
   * @return small
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSmall() {
    return small;
  }


  @JsonProperty(JSON_PROPERTY_SMALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSmall(@javax.annotation.Nullable String small) {
    this.small = small;
  }

  public Logo color(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
    
    return this;
  }

  /**
   * The logo color.
   * @return color
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getColor() {
        return color.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getColor_JsonNullable() {
    return color;
  }
  
  @JsonProperty(JSON_PROPERTY_COLOR)
  public void setColor_JsonNullable(JsonNullable<String> color) {
    this.color = color;
  }

  public void setColor(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
  }

  public Logo cover(@javax.annotation.Nullable LogoCover cover) {
    
    this.cover = cover;
    return this;
  }

  /**
   * Get cover
   * @return cover
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogoCover getCover() {
    return cover;
  }


  @JsonProperty(JSON_PROPERTY_COVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCover(@javax.annotation.Nullable LogoCover cover) {
    this.cover = cover;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logo logo = (Logo) o;
    return Objects.equals(this.original, logo.original) &&
        Objects.equals(this.large, logo.large) &&
        Objects.equals(this.medium, logo.medium) &&
        Objects.equals(this.small, logo.small) &&
        equalsNullable(this.color, logo.color) &&
        Objects.equals(this.cover, logo.cover);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(original, large, medium, small, hashCodeNullable(color), cover);
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
    sb.append("class Logo {\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
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

    // add `original` to the URL query string
    if (getOriginal() != null) {
      try {
        joiner.add(String.format("%soriginal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `large` to the URL query string
    if (getLarge() != null) {
      try {
        joiner.add(String.format("%slarge%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLarge()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `medium` to the URL query string
    if (getMedium() != null) {
      try {
        joiner.add(String.format("%smedium%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMedium()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `small` to the URL query string
    if (getSmall() != null) {
      try {
        joiner.add(String.format("%ssmall%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmall()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      try {
        joiner.add(String.format("%scolor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getColor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cover` to the URL query string
    if (getCover() != null) {
      joiner.add(getCover().toUrlQueryString(prefix + "cover" + suffix));
    }

    return joiner.toString();
  }

}

