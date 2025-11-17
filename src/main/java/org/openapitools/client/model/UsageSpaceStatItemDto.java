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
 * The parameters of the usage space statistics item.
 */
@JsonPropertyOrder({
  UsageSpaceStatItemDto.JSON_PROPERTY_NAME,
  UsageSpaceStatItemDto.JSON_PROPERTY_ICON,
  UsageSpaceStatItemDto.JSON_PROPERTY_DISABLED,
  UsageSpaceStatItemDto.JSON_PROPERTY_SIZE,
  UsageSpaceStatItemDto.JSON_PROPERTY_URL
})

public class UsageSpaceStatItemDto {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ICON = "icon";
  @javax.annotation.Nullable
  private JsonNullable<String> icon = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  @javax.annotation.Nullable
  private Boolean disabled;

  public static final String JSON_PROPERTY_SIZE = "size";
  @javax.annotation.Nullable
  private JsonNullable<String> size = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public UsageSpaceStatItemDto() {
  }

  public UsageSpaceStatItemDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The item name.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public UsageSpaceStatItemDto icon(@javax.annotation.Nullable String icon) {
    this.icon = JsonNullable.<String>of(icon);
    
    return this;
  }

  /**
   * The item icon path.
   * @return icon
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getIcon() {
        return icon.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIcon_JsonNullable() {
    return icon;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON)
  public void setIcon_JsonNullable(JsonNullable<String> icon) {
    this.icon = icon;
  }

  public void setIcon(@javax.annotation.Nullable String icon) {
    this.icon = JsonNullable.<String>of(icon);
  }

  public UsageSpaceStatItemDto disabled(@javax.annotation.Nullable Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

  /**
   * Specifies if the item is disabled or not.
   * @return disabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(@javax.annotation.Nullable Boolean disabled) {
    this.disabled = disabled;
  }

  public UsageSpaceStatItemDto size(@javax.annotation.Nullable String size) {
    this.size = JsonNullable.<String>of(size);
    
    return this;
  }

  /**
   * The item used space.
   * @return size
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSize() {
        return size.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSize_JsonNullable() {
    return size;
  }
  
  @JsonProperty(JSON_PROPERTY_SIZE)
  public void setSize_JsonNullable(JsonNullable<String> size) {
    this.size = size;
  }

  public void setSize(@javax.annotation.Nullable String size) {
    this.size = JsonNullable.<String>of(size);
  }

  public UsageSpaceStatItemDto url(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
    
    return this;
  }

  /**
   * The item URL.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSpaceStatItemDto usageSpaceStatItemDto = (UsageSpaceStatItemDto) o;
    return equalsNullable(this.name, usageSpaceStatItemDto.name) &&
        equalsNullable(this.icon, usageSpaceStatItemDto.icon) &&
        Objects.equals(this.disabled, usageSpaceStatItemDto.disabled) &&
        equalsNullable(this.size, usageSpaceStatItemDto.size) &&
        equalsNullable(this.url, usageSpaceStatItemDto.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(icon), disabled, hashCodeNullable(size), hashCodeNullable(url));
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
    sb.append("class UsageSpaceStatItemDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `icon` to the URL query string
    if (getIcon() != null) {
      try {
        joiner.add(String.format("%sicon%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIcon()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `disabled` to the URL query string
    if (getDisabled() != null) {
      try {
        joiner.add(String.format("%sdisabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      try {
        joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

