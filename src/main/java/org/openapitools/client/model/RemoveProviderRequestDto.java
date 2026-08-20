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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Request parameters for deleting one or more AI providers.
 */
@JsonPropertyOrder({
  RemoveProviderRequestDto.JSON_PROPERTY_IDS
})

public class RemoveProviderRequestDto {
  public static final String JSON_PROPERTY_IDS = "ids";
  @javax.annotation.Nullable  private Set<Integer> ids;

  public RemoveProviderRequestDto() {
  }


  public RemoveProviderRequestDto ids(@javax.annotation.Nullable Set<Integer> ids) {
    
    this.ids = ids;
    return this;
  }

  public RemoveProviderRequestDto addIdsItem(Integer idsItem) {
    if (this.ids == null) {
      this.ids = new LinkedHashSet<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * The set of AI provider identifiers to delete.
   * @return ids
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Integer> getIds() {
    return ids;
  }


  @JsonProperty(value = JSON_PROPERTY_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(@javax.annotation.Nullable Set<Integer> ids) {
    this.ids = ids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveProviderRequestDto removeProviderRequestDto = (RemoveProviderRequestDto) o;
    return Objects.equals(this.ids, removeProviderRequestDto.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveProviderRequestDto {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

    // add `ids` to the URL query string
    if (getIds() != null) {
      int i = 0;
      for (Integer _item : getIds()) {
        try {
          joiner.add(String.format("%sids%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    return joiner.toString();
  }

}

