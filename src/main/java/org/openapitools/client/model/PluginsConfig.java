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
 * The configuration settings to connect the special add-ons.
 */
@JsonPropertyOrder({
  PluginsConfig.JSON_PROPERTY_PLUGINS_DATA
})

public class PluginsConfig {
  public static final String JSON_PROPERTY_PLUGINS_DATA = "pluginsData";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> pluginsData = JsonNullable.<List<String>>undefined();

  public PluginsConfig() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PluginsConfig(
    @JsonProperty(JSON_PROPERTY_PLUGINS_DATA) List<String> pluginsData
  ) {
    this();
    this.pluginsData = pluginsData == null ? JsonNullable.<List<String>>undefined() : JsonNullable.of(pluginsData);
  }


  /**
   * The array of absolute URLs to the plugin configuration files.
   * @return pluginsData
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getPluginsData() {
    
    if (pluginsData == null) {
      pluginsData = JsonNullable.<List<String>>undefined();
    }
    return pluginsData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PLUGINS_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getPluginsData_JsonNullable() {
    return pluginsData;
  }
  
  @JsonProperty(JSON_PROPERTY_PLUGINS_DATA)
  private void setPluginsData_JsonNullable(JsonNullable<List<String>> pluginsData) {
    this.pluginsData = pluginsData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsConfig pluginsConfig = (PluginsConfig) o;
    return equalsNullable(this.pluginsData, pluginsConfig.pluginsData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(pluginsData));
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
    sb.append("class PluginsConfig {\n");
    sb.append("    pluginsData: ").append(toIndentedString(pluginsData)).append("\n");
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

    // add `pluginsData` to the URL query string
    if (getPluginsData() != null) {
      for (int i = 0; i < getPluginsData().size(); i++) {
        try {
          joiner.add(String.format("%spluginsData%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPluginsData().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

