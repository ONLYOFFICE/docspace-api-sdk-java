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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AuthKey;
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
 * The storage information.
 */
@JsonPropertyOrder({
  StorageDto.JSON_PROPERTY_ID,
  StorageDto.JSON_PROPERTY_TITLE,
  StorageDto.JSON_PROPERTY_PROPERTIES,
  StorageDto.JSON_PROPERTY_CURRENT,
  StorageDto.JSON_PROPERTY_IS_SET
})

public class StorageDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  @javax.annotation.Nullable
  private JsonNullable<List<AuthKey>> properties = JsonNullable.<List<AuthKey>>undefined();

  public static final String JSON_PROPERTY_CURRENT = "current";
  @javax.annotation.Nonnull
  private Boolean current;

  public static final String JSON_PROPERTY_IS_SET = "isSet";
  @javax.annotation.Nonnull
  private Boolean isSet;

  public StorageDto() {
  }

  public StorageDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The storage ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public StorageDto title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The storage title.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public StorageDto properties(@javax.annotation.Nullable List<AuthKey> properties) {
    this.properties = JsonNullable.<List<AuthKey>>of(properties);
    
    return this;
  }

  public StorageDto addPropertiesItem(AuthKey propertiesItem) {
    if (this.properties == null || !this.properties.isPresent()) {
      this.properties = JsonNullable.<List<AuthKey>>of(new ArrayList<>());
    }
    try {
      this.properties.get().add(propertiesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of storage authentication keys.
   * @return properties
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<AuthKey> getProperties() {
        return properties.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AuthKey>> getProperties_JsonNullable() {
    return properties;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  public void setProperties_JsonNullable(JsonNullable<List<AuthKey>> properties) {
    this.properties = properties;
  }

  public void setProperties(@javax.annotation.Nullable List<AuthKey> properties) {
    this.properties = JsonNullable.<List<AuthKey>>of(properties);
  }

  public StorageDto current(@javax.annotation.Nonnull Boolean current) {
    
    this.current = current;
    return this;
  }

  /**
   * Specifies if this is the current portal storage or not.
   * @return current
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCurrent() {
    return current;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrent(@javax.annotation.Nonnull Boolean current) {
    this.current = current;
  }

  public StorageDto isSet(@javax.annotation.Nonnull Boolean isSet) {
    
    this.isSet = isSet;
    return this;
  }

  /**
   * Specifies if this storage can be set or not.
   * @return isSet
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsSet() {
    return isSet;
  }


  @JsonProperty(JSON_PROPERTY_IS_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsSet(@javax.annotation.Nonnull Boolean isSet) {
    this.isSet = isSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageDto storageDto = (StorageDto) o;
    return Objects.equals(this.id, storageDto.id) &&
        Objects.equals(this.title, storageDto.title) &&
        equalsNullable(this.properties, storageDto.properties) &&
        Objects.equals(this.current, storageDto.current) &&
        Objects.equals(this.isSet, storageDto.isSet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, hashCodeNullable(properties), current, isSet);
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
    sb.append("class StorageDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      for (int i = 0; i < getProperties().size(); i++) {
        if (getProperties().get(i) != null) {
          joiner.add(getProperties().get(i).toUrlQueryString(String.format("%sproperties%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `current` to the URL query string
    if (getCurrent() != null) {
      try {
        joiner.add(String.format("%scurrent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isSet` to the URL query string
    if (getIsSet() != null) {
      try {
        joiner.add(String.format("%sisSet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsSet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

