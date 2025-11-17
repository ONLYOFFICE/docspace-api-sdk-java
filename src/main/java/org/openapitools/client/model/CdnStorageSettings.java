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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
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
 * CdnStorageSettings
 */
@JsonPropertyOrder({
  CdnStorageSettings.JSON_PROPERTY_MODULE,
  CdnStorageSettings.JSON_PROPERTY_PROPS,
  CdnStorageSettings.JSON_PROPERTY_ID,
  CdnStorageSettings.JSON_PROPERTY_LAST_MODIFIED
})

public class CdnStorageSettings {
  public static final String JSON_PROPERTY_MODULE = "module";
  @javax.annotation.Nullable
  private JsonNullable<String> module = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROPS = "props";
  @javax.annotation.Nullable
  private JsonNullable<Map<String, String>> props = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private UUID id;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable
  private OffsetDateTime lastModified;

  public CdnStorageSettings() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public CdnStorageSettings(
    @JsonProperty(JSON_PROPERTY_ID) UUID id
  ) {
    this();
    this.id = id;
  }

  public CdnStorageSettings module(@javax.annotation.Nullable String module) {
    this.module = JsonNullable.<String>of(module);
    
    return this;
  }

  /**
   * Get module
   * @return module
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getModule() {
        return module.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getModule_JsonNullable() {
    return module;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULE)
  public void setModule_JsonNullable(JsonNullable<String> module) {
    this.module = module;
  }

  public void setModule(@javax.annotation.Nullable String module) {
    this.module = JsonNullable.<String>of(module);
  }

  public CdnStorageSettings props(@javax.annotation.Nullable Map<String, String> props) {
    this.props = JsonNullable.<Map<String, String>>of(props);
    
    return this;
  }

  public CdnStorageSettings putPropsItem(String key, String propsItem) {
    if (this.props == null || !this.props.isPresent()) {
      this.props = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.props.get().put(key, propsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get props
   * @return props
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getProps() {
        return props.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getProps_JsonNullable() {
    return props;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPS)
  public void setProps_JsonNullable(JsonNullable<Map<String, String>> props) {
    this.props = props;
  }

  public void setProps(@javax.annotation.Nullable Map<String, String> props) {
    this.props = JsonNullable.<Map<String, String>>of(props);
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }



  public CdnStorageSettings lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdnStorageSettings cdnStorageSettings = (CdnStorageSettings) o;
    return equalsNullable(this.module, cdnStorageSettings.module) &&
        equalsNullable(this.props, cdnStorageSettings.props) &&
        Objects.equals(this.id, cdnStorageSettings.id) &&
        Objects.equals(this.lastModified, cdnStorageSettings.lastModified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(module), hashCodeNullable(props), id, lastModified);
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
    sb.append("class CdnStorageSettings {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

    // add `module` to the URL query string
    if (getModule() != null) {
      try {
        joiner.add(String.format("%smodule%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModule()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `props` to the URL query string
    if (getProps() != null) {
      for (String _key : getProps().keySet()) {
        try {
          joiner.add(String.format("%sprops%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getProps().get(_key), URLEncoder.encode(String.valueOf(getProps().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

