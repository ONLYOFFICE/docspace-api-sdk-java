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
 * The request parameters for creating a new API key.
 */
@JsonPropertyOrder({
  CreateApiKeyRequestDto.JSON_PROPERTY_NAME,
  CreateApiKeyRequestDto.JSON_PROPERTY_PERMISSIONS,
  CreateApiKeyRequestDto.JSON_PROPERTY_EXPIRES_IN_DAYS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class CreateApiKeyRequestDto {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> permissions = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXPIRES_IN_DAYS = "expiresInDays";
  @javax.annotation.Nullable
  private JsonNullable<Integer> expiresInDays = JsonNullable.<Integer>undefined();

  public CreateApiKeyRequestDto() {
  }

  public CreateApiKeyRequestDto name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The API key name.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public CreateApiKeyRequestDto permissions(@javax.annotation.Nullable List<String> permissions) {
    this.permissions = JsonNullable.<List<String>>of(permissions);
    
    return this;
  }

  public CreateApiKeyRequestDto addPermissionsItem(String permissionsItem) {
    if (this.permissions == null || !this.permissions.isPresent()) {
      this.permissions = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.permissions.get().add(permissionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of permissions granted to the API key.
   * @return permissions
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getPermissions() {
        return permissions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getPermissions_JsonNullable() {
    return permissions;
  }
  
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  public void setPermissions_JsonNullable(JsonNullable<List<String>> permissions) {
    this.permissions = permissions;
  }

  public void setPermissions(@javax.annotation.Nullable List<String> permissions) {
    this.permissions = JsonNullable.<List<String>>of(permissions);
  }

  public CreateApiKeyRequestDto expiresInDays(@javax.annotation.Nullable Integer expiresInDays) {
    this.expiresInDays = JsonNullable.<Integer>of(expiresInDays);
    
    return this;
  }

  /**
   * The number of days until the API key expires (null for no expiration).
   * minimum: 1
   * maximum: 365
   * @return expiresInDays
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getExpiresInDays() {
        return expiresInDays.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getExpiresInDays_JsonNullable() {
    return expiresInDays;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRES_IN_DAYS)
  public void setExpiresInDays_JsonNullable(JsonNullable<Integer> expiresInDays) {
    this.expiresInDays = expiresInDays;
  }

  public void setExpiresInDays(@javax.annotation.Nullable Integer expiresInDays) {
    this.expiresInDays = JsonNullable.<Integer>of(expiresInDays);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApiKeyRequestDto createApiKeyRequestDto = (CreateApiKeyRequestDto) o;
    return Objects.equals(this.name, createApiKeyRequestDto.name) &&
        equalsNullable(this.permissions, createApiKeyRequestDto.permissions) &&
        equalsNullable(this.expiresInDays, createApiKeyRequestDto.expiresInDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hashCodeNullable(permissions), hashCodeNullable(expiresInDays));
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
    sb.append("class CreateApiKeyRequestDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expiresInDays: ").append(toIndentedString(expiresInDays)).append("\n");
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

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      for (int i = 0; i < getPermissions().size(); i++) {
        try {
          joiner.add(String.format("%spermissions%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPermissions().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `expiresInDays` to the URL query string
    if (getExpiresInDays() != null) {
      try {
        joiner.add(String.format("%sexpiresInDays%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiresInDays()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

