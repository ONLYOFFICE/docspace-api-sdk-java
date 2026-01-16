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
import java.util.HashMap;
import java.util.Map;
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
 * The external resource parameters.
 */
@JsonPropertyOrder({
  CultureSpecificExternalResource.JSON_PROPERTY_DOMAIN,
  CultureSpecificExternalResource.JSON_PROPERTY_ENTRIES
})

public class CultureSpecificExternalResource {
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  @javax.annotation.Nullable
  private JsonNullable<String> domain = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  @javax.annotation.Nullable
  private JsonNullable<Map<String, String>> entries = JsonNullable.<Map<String, String>>undefined();

  public CultureSpecificExternalResource() {
  }


  public CultureSpecificExternalResource domain(@javax.annotation.Nullable String domain) {
    this.domain = JsonNullable.<String>of(domain);
    
    return this;
  }

  /**
   * The external resource domain.
   * @return domain
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDomain() {
        return domain.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDomain_JsonNullable() {
    return domain;
  }
  
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  public void setDomain_JsonNullable(JsonNullable<String> domain) {
    this.domain = domain;
  }

  public void setDomain(@javax.annotation.Nullable String domain) {
    this.domain = JsonNullable.<String>of(domain);
  }

  public CultureSpecificExternalResource entries(@javax.annotation.Nullable Map<String, String> entries) {
    this.entries = JsonNullable.<Map<String, String>>of(entries);
    
    return this;
  }

  public CultureSpecificExternalResource putEntriesItem(String key, String entriesItem) {
    if (this.entries == null || !this.entries.isPresent()) {
      this.entries = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.entries.get().put(key, entriesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The external resource entries.
   * @return entries
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getEntries() {
        return entries.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getEntries_JsonNullable() {
    return entries;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  public void setEntries_JsonNullable(JsonNullable<Map<String, String>> entries) {
    this.entries = entries;
  }

  public void setEntries(@javax.annotation.Nullable Map<String, String> entries) {
    this.entries = JsonNullable.<Map<String, String>>of(entries);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CultureSpecificExternalResource cultureSpecificExternalResource = (CultureSpecificExternalResource) o;
    return equalsNullable(this.domain, cultureSpecificExternalResource.domain) &&
        equalsNullable(this.entries, cultureSpecificExternalResource.entries);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(domain), hashCodeNullable(entries));
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
    sb.append("class CultureSpecificExternalResource {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

    // add `domain` to the URL query string
    if (getDomain() != null) {
      try {
        joiner.add(String.format("%sdomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entries` to the URL query string
    if (getEntries() != null) {
      for (String _key : getEntries().keySet()) {
        try {
          joiner.add(String.format("%sentries%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getEntries().get(_key), URLEncoder.encode(String.valueOf(getEntries().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

