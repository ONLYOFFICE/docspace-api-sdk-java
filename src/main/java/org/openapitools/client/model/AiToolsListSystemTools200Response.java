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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.AiTMCPItem;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiToolsListSystemTools200Response
 */
@JsonPropertyOrder({
  AiToolsListSystemTools200Response.JSON_PROPERTY_GROUPS,
  AiToolsListSystemTools200Response.JSON_PROPERTY_ERRORS,
  AiToolsListSystemTools200Response.JSON_PROPERTY_SYSTEM
})
@JsonTypeName("aiToolsListSystemTools_200_response")

public class AiToolsListSystemTools200Response {
  public static final String JSON_PROPERTY_GROUPS = "groups";
  @javax.annotation.Nonnull  private Map<String, List<AiTMCPItem>> groups = new HashMap<>();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  @javax.annotation.Nonnull  private Map<String, String> errors = new HashMap<>();

  public static final String JSON_PROPERTY_SYSTEM = "system";
  @javax.annotation.Nonnull  private List<String> system = new ArrayList<>();

  public AiToolsListSystemTools200Response() {
  }


  public AiToolsListSystemTools200Response groups(@javax.annotation.Nonnull Map<String, List<AiTMCPItem>> groups) {
    
    this.groups = groups;
    return this;
  }

  public AiToolsListSystemTools200Response putGroupsItem(String key, List<AiTMCPItem> groupsItem) {
    this.groups.put(key, groupsItem);
    return this;
  }

  /**
   * Tools by server name, covering both the host-configured system servers and the custom MCP servers registered for this scope.
   * @return groups
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, List<AiTMCPItem>> getGroups() {
    return groups;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroups(@javax.annotation.Nonnull Map<String, List<AiTMCPItem>> groups) {
    this.groups = groups;
  }

  public AiToolsListSystemTools200Response errors(@javax.annotation.Nonnull Map<String, String> errors) {
    
    this.errors = errors;
    return this;
  }

  public AiToolsListSystemTools200Response putErrorsItem(String key, String errorsItem) {
    this.errors.put(key, errorsItem);
    return this;
  }

  /**
   * Why a registered custom server could not be reached, keyed by server name. A server that answered is absent from this map.
   * @return errors
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getErrors() {
    return errors;
  }


  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrors(@javax.annotation.Nonnull Map<String, String> errors) {
    this.errors = errors;
  }

  public AiToolsListSystemTools200Response system(@javax.annotation.Nonnull List<String> system) {
    
    this.system = system;
    return this;
  }

  public AiToolsListSystemTools200Response addSystemItem(String systemItem) {
    if (this.system == null) {
      this.system = new ArrayList<>();
    }
    this.system.add(systemItem);
    return this;
  }

  /**
   * Names of the host-configured system servers among the keys of `groups`; everything else there was registered as a custom server.
   * @return system
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SYSTEM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSystem() {
    return system;
  }


  @JsonProperty(value = JSON_PROPERTY_SYSTEM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSystem(@javax.annotation.Nonnull List<String> system) {
    this.system = system;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiToolsListSystemTools200Response aiToolsListSystemTools200Response = (AiToolsListSystemTools200Response) o;
    return Objects.equals(this.groups, aiToolsListSystemTools200Response.groups) &&
        Objects.equals(this.errors, aiToolsListSystemTools200Response.errors) &&
        Objects.equals(this.system, aiToolsListSystemTools200Response.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, errors, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiToolsListSystemTools200Response {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (String _key : getGroups().keySet()) {
        try {
          joiner.add(String.format("%sgroups%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getGroups().get(_key), URLEncoder.encode(String.valueOf(getGroups().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `errors` to the URL query string
    if (getErrors() != null) {
      for (String _key : getErrors().keySet()) {
        try {
          joiner.add(String.format("%serrors%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getErrors().get(_key), URLEncoder.encode(String.valueOf(getErrors().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `system` to the URL query string
    if (getSystem() != null) {
      for (int i = 0; i < getSystem().size(); i++) {
        try {
          joiner.add(String.format("%ssystem%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getSystem().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

