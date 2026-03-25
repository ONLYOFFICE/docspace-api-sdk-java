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
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Parameters specifying which MCP servers to delete.
 */
@JsonPropertyOrder({
  DeleteServersRequestBody.JSON_PROPERTY_SERVERS
})

public class DeleteServersRequestBody {
  public static final String JSON_PROPERTY_SERVERS = "servers";
  @javax.annotation.Nullable  private Set<UUID> servers;

  public DeleteServersRequestBody() {
  }


  public DeleteServersRequestBody servers(@javax.annotation.Nullable Set<UUID> servers) {
    
    this.servers = servers;
    return this;
  }

  public DeleteServersRequestBody addServersItem(UUID serversItem) {
    if (this.servers == null) {
      this.servers = new LinkedHashSet<>();
    }
    this.servers.add(serversItem);
    return this;
  }

  /**
   * Set of unique identifiers of the MCP servers to permanently remove. All room associations and connection data will also be deleted.
   * @return servers
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERVERS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<UUID> getServers() {
    return servers;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVERS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServers(@javax.annotation.Nullable Set<UUID> servers) {
    this.servers = servers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteServersRequestBody deleteServersRequestBody = (DeleteServersRequestBody) o;
    return Objects.equals(this.servers, deleteServersRequestBody.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteServersRequestBody {\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

    // add `servers` to the URL query string
    if (getServers() != null) {
      int i = 0;
      for (UUID _item : getServers()) {
        if (_item != null) {
          try {
            joiner.add(String.format("%sservers%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
        i++;
      }
    }

    return joiner.toString();
  }

}

