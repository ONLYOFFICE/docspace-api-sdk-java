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
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiToolsReplaceAllCustomServersRequest
 */
@JsonPropertyOrder({
  AiToolsReplaceAllCustomServersRequest.JSON_PROPERTY_MAP,
  AiToolsReplaceAllCustomServersRequest.JSON_PROPERTY_ENTITY_ID
})
@JsonTypeName("aiToolsReplaceAllCustomServers_request")

public class AiToolsReplaceAllCustomServersRequest {
  public static final String JSON_PROPERTY_MAP = "map";
  @javax.annotation.Nonnull  private Map<String, Object> map = new HashMap<>();

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable  private String entityId;

  public AiToolsReplaceAllCustomServersRequest() {
  }


  public AiToolsReplaceAllCustomServersRequest map(@javax.annotation.Nonnull Map<String, Object> map) {
    
    this.map = map;
    return this;
  }

  public AiToolsReplaceAllCustomServersRequest putMapItem(String key, Object mapItem) {
    this.map.put(key, mapItem);
    return this;
  }

  /**
   * Full replacement set, keyed by server name.
   * @return map
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MAP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getMap() {
    return map;
  }


  @JsonProperty(value = JSON_PROPERTY_MAP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMap(@javax.annotation.Nonnull Map<String, Object> map) {
    this.map = map;
  }

  public AiToolsReplaceAllCustomServersRequest entityId(@javax.annotation.Nullable String entityId) {
    
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@javax.annotation.Nullable String entityId) {
    this.entityId = entityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiToolsReplaceAllCustomServersRequest aiToolsReplaceAllCustomServersRequest = (AiToolsReplaceAllCustomServersRequest) o;
    return Objects.equals(this.map, aiToolsReplaceAllCustomServersRequest.map) &&
        Objects.equals(this.entityId, aiToolsReplaceAllCustomServersRequest.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(map, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiToolsReplaceAllCustomServersRequest {\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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

    // add `map` to the URL query string
    if (getMap() != null) {
      for (String _key : getMap().keySet()) {
        try {
          joiner.add(String.format("%smap%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMap().get(_key), URLEncoder.encode(String.valueOf(getMap().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      try {
        joiner.add(String.format("%sentityId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

