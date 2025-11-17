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
 * The thumbnails data parameters.
 */
@JsonPropertyOrder({
  ThumbnailsDataDto.JSON_PROPERTY_ORIGINAL,
  ThumbnailsDataDto.JSON_PROPERTY_RETINA,
  ThumbnailsDataDto.JSON_PROPERTY_MAX,
  ThumbnailsDataDto.JSON_PROPERTY_BIG,
  ThumbnailsDataDto.JSON_PROPERTY_MEDIUM,
  ThumbnailsDataDto.JSON_PROPERTY_SMALL
})

public class ThumbnailsDataDto {
  public static final String JSON_PROPERTY_ORIGINAL = "original";
  @javax.annotation.Nullable
  private JsonNullable<String> original = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RETINA = "retina";
  @javax.annotation.Nullable
  private JsonNullable<String> retina = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAX = "max";
  @javax.annotation.Nullable
  private JsonNullable<String> max = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BIG = "big";
  @javax.annotation.Nullable
  private JsonNullable<String> big = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  @javax.annotation.Nullable
  private JsonNullable<String> medium = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SMALL = "small";
  @javax.annotation.Nullable
  private JsonNullable<String> small = JsonNullable.<String>undefined();

  public ThumbnailsDataDto() {
  }

  public ThumbnailsDataDto original(@javax.annotation.Nullable String original) {
    this.original = JsonNullable.<String>of(original);
    
    return this;
  }

  /**
   * The thumbnail original photo.
   * @return original
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOriginal() {
        return original.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOriginal_JsonNullable() {
    return original;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  public void setOriginal_JsonNullable(JsonNullable<String> original) {
    this.original = original;
  }

  public void setOriginal(@javax.annotation.Nullable String original) {
    this.original = JsonNullable.<String>of(original);
  }

  public ThumbnailsDataDto retina(@javax.annotation.Nullable String retina) {
    this.retina = JsonNullable.<String>of(retina);
    
    return this;
  }

  /**
   * The thumbnail retina.
   * @return retina
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRetina() {
        return retina.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETINA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRetina_JsonNullable() {
    return retina;
  }
  
  @JsonProperty(JSON_PROPERTY_RETINA)
  public void setRetina_JsonNullable(JsonNullable<String> retina) {
    this.retina = retina;
  }

  public void setRetina(@javax.annotation.Nullable String retina) {
    this.retina = JsonNullable.<String>of(retina);
  }

  public ThumbnailsDataDto max(@javax.annotation.Nullable String max) {
    this.max = JsonNullable.<String>of(max);
    
    return this;
  }

  /**
   * The thumbnail maximum size photo.
   * @return max
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMax() {
        return max.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMax_JsonNullable() {
    return max;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX)
  public void setMax_JsonNullable(JsonNullable<String> max) {
    this.max = max;
  }

  public void setMax(@javax.annotation.Nullable String max) {
    this.max = JsonNullable.<String>of(max);
  }

  public ThumbnailsDataDto big(@javax.annotation.Nullable String big) {
    this.big = JsonNullable.<String>of(big);
    
    return this;
  }

  /**
   * The thumbnail big size photo.
   * @return big
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBig() {
        return big.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBig_JsonNullable() {
    return big;
  }
  
  @JsonProperty(JSON_PROPERTY_BIG)
  public void setBig_JsonNullable(JsonNullable<String> big) {
    this.big = big;
  }

  public void setBig(@javax.annotation.Nullable String big) {
    this.big = JsonNullable.<String>of(big);
  }

  public ThumbnailsDataDto medium(@javax.annotation.Nullable String medium) {
    this.medium = JsonNullable.<String>of(medium);
    
    return this;
  }

  /**
   * The thumbnail medium size photo.
   * @return medium
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMedium() {
        return medium.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMedium_JsonNullable() {
    return medium;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  public void setMedium_JsonNullable(JsonNullable<String> medium) {
    this.medium = medium;
  }

  public void setMedium(@javax.annotation.Nullable String medium) {
    this.medium = JsonNullable.<String>of(medium);
  }

  public ThumbnailsDataDto small(@javax.annotation.Nullable String small) {
    this.small = JsonNullable.<String>of(small);
    
    return this;
  }

  /**
   * The thumbnail small size photo.
   * @return small
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSmall() {
        return small.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SMALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSmall_JsonNullable() {
    return small;
  }
  
  @JsonProperty(JSON_PROPERTY_SMALL)
  public void setSmall_JsonNullable(JsonNullable<String> small) {
    this.small = small;
  }

  public void setSmall(@javax.annotation.Nullable String small) {
    this.small = JsonNullable.<String>of(small);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThumbnailsDataDto thumbnailsDataDto = (ThumbnailsDataDto) o;
    return equalsNullable(this.original, thumbnailsDataDto.original) &&
        equalsNullable(this.retina, thumbnailsDataDto.retina) &&
        equalsNullable(this.max, thumbnailsDataDto.max) &&
        equalsNullable(this.big, thumbnailsDataDto.big) &&
        equalsNullable(this.medium, thumbnailsDataDto.medium) &&
        equalsNullable(this.small, thumbnailsDataDto.small);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(original), hashCodeNullable(retina), hashCodeNullable(max), hashCodeNullable(big), hashCodeNullable(medium), hashCodeNullable(small));
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
    sb.append("class ThumbnailsDataDto {\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    retina: ").append(toIndentedString(retina)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    big: ").append(toIndentedString(big)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
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

    // add `retina` to the URL query string
    if (getRetina() != null) {
      try {
        joiner.add(String.format("%sretina%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRetina()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max` to the URL query string
    if (getMax() != null) {
      try {
        joiner.add(String.format("%smax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `big` to the URL query string
    if (getBig() != null) {
      try {
        joiner.add(String.format("%sbig%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBig()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

