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
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.EmployeeDto;
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
 * The response data for the API key operations.
 */
@JsonPropertyOrder({
  ApiKeyResponseDto.JSON_PROPERTY_ID,
  ApiKeyResponseDto.JSON_PROPERTY_NAME,
  ApiKeyResponseDto.JSON_PROPERTY_KEY,
  ApiKeyResponseDto.JSON_PROPERTY_KEY_POSTFIX,
  ApiKeyResponseDto.JSON_PROPERTY_PERMISSIONS,
  ApiKeyResponseDto.JSON_PROPERTY_LAST_USED,
  ApiKeyResponseDto.JSON_PROPERTY_CREATE_ON,
  ApiKeyResponseDto.JSON_PROPERTY_CREATE_BY,
  ApiKeyResponseDto.JSON_PROPERTY_EXPIRES_AT,
  ApiKeyResponseDto.JSON_PROPERTY_IS_ACTIVE
})

public class ApiKeyResponseDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private String key;

  public static final String JSON_PROPERTY_KEY_POSTFIX = "keyPostfix";
  @javax.annotation.Nullable  private JsonNullable<String> keyPostfix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  @javax.annotation.Nullable  private List<String> permissions;

  public static final String JSON_PROPERTY_LAST_USED = "lastUsed";
  @javax.annotation.Nullable  private ApiDateTime lastUsed;

  public static final String JSON_PROPERTY_CREATE_ON = "createOn";
  @javax.annotation.Nullable  private ApiDateTime createOn;

  public static final String JSON_PROPERTY_CREATE_BY = "createBy";
  @javax.annotation.Nullable  private EmployeeDto createBy;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
  @javax.annotation.Nullable  private ApiDateTime expiresAt;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  @javax.annotation.Nonnull  private Boolean isActive;

  public ApiKeyResponseDto() {
  }


  public ApiKeyResponseDto id(@javax.annotation.Nonnull UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The API key unique identifier.
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }

  public ApiKeyResponseDto name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The API key name.
   * @return name
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public ApiKeyResponseDto key(@javax.annotation.Nullable String key) {
    
    this.key = key;
    return this;
  }

  /**
   * The full API key value (only returned when creating a new key).
   * @return key
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }

  public ApiKeyResponseDto keyPostfix(@javax.annotation.Nullable String keyPostfix) {
    this.keyPostfix = JsonNullable.<String>of(keyPostfix);
    
    return this;
  }

  /**
   * The API key postfix (used for identification).
   * @return keyPostfix
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getKeyPostfix() {
        return keyPostfix.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_KEY_POSTFIX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getKeyPostfix_JsonNullable() {
    return keyPostfix;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY_POSTFIX)
  public void setKeyPostfix_JsonNullable(JsonNullable<String> keyPostfix) {
    this.keyPostfix = keyPostfix;
  }

  public void setKeyPostfix(@javax.annotation.Nullable String keyPostfix) {
    this.keyPostfix = JsonNullable.<String>of(keyPostfix);
  }

  public ApiKeyResponseDto permissions(@javax.annotation.Nullable List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public ApiKeyResponseDto addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * The list of permissions granted to the API key.
   * @return permissions
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPermissions() {
    return permissions;
  }


  @JsonProperty(value = JSON_PROPERTY_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermissions(@javax.annotation.Nullable List<String> permissions) {
    this.permissions = permissions;
  }

  public ApiKeyResponseDto lastUsed(@javax.annotation.Nullable ApiDateTime lastUsed) {
    
    this.lastUsed = lastUsed;
    return this;
  }

  /**
   * Get lastUsed
   * @return lastUsed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getLastUsed() {
    return lastUsed;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUsed(@javax.annotation.Nullable ApiDateTime lastUsed) {
    this.lastUsed = lastUsed;
  }

  public ApiKeyResponseDto createOn(@javax.annotation.Nullable ApiDateTime createOn) {
    
    this.createOn = createOn;
    return this;
  }

  /**
   * Get createOn
   * @return createOn
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATE_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getCreateOn() {
    return createOn;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateOn(@javax.annotation.Nullable ApiDateTime createOn) {
    this.createOn = createOn;
  }

  public ApiKeyResponseDto createBy(@javax.annotation.Nullable EmployeeDto createBy) {
    
    this.createBy = createBy;
    return this;
  }

  /**
   * Get createBy
   * @return createBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATE_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getCreateBy() {
    return createBy;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateBy(@javax.annotation.Nullable EmployeeDto createBy) {
    this.createBy = createBy;
  }

  public ApiKeyResponseDto expiresAt(@javax.annotation.Nullable ApiDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXPIRES_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRES_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(@javax.annotation.Nullable ApiDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public ApiKeyResponseDto isActive(@javax.annotation.Nonnull Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates whether the API key is active or not.
   * @return isActive
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_IS_ACTIVE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_ACTIVE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsActive(@javax.annotation.Nonnull Boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyResponseDto apiKeyResponseDto = (ApiKeyResponseDto) o;
    return Objects.equals(this.id, apiKeyResponseDto.id) &&
        Objects.equals(this.name, apiKeyResponseDto.name) &&
        Objects.equals(this.key, apiKeyResponseDto.key) &&
        equalsNullable(this.keyPostfix, apiKeyResponseDto.keyPostfix) &&
        Objects.equals(this.permissions, apiKeyResponseDto.permissions) &&
        Objects.equals(this.lastUsed, apiKeyResponseDto.lastUsed) &&
        Objects.equals(this.createOn, apiKeyResponseDto.createOn) &&
        Objects.equals(this.createBy, apiKeyResponseDto.createBy) &&
        Objects.equals(this.expiresAt, apiKeyResponseDto.expiresAt) &&
        Objects.equals(this.isActive, apiKeyResponseDto.isActive);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, key, hashCodeNullable(keyPostfix), permissions, lastUsed, createOn, createBy, expiresAt, isActive);
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
    sb.append("class ApiKeyResponseDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyPostfix: ").append(toIndentedString(keyPostfix)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    createOn: ").append(toIndentedString(createOn)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `keyPostfix` to the URL query string
    if (getKeyPostfix() != null) {
      try {
        joiner.add(String.format("%skeyPostfix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKeyPostfix()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `lastUsed` to the URL query string
    if (getLastUsed() != null) {
      joiner.add(getLastUsed().toUrlQueryString(prefix + "lastUsed" + suffix));
    }

    // add `createOn` to the URL query string
    if (getCreateOn() != null) {
      joiner.add(getCreateOn().toUrlQueryString(prefix + "createOn" + suffix));
    }

    // add `createBy` to the URL query string
    if (getCreateBy() != null) {
      joiner.add(getCreateBy().toUrlQueryString(prefix + "createBy" + suffix));
    }

    // add `expiresAt` to the URL query string
    if (getExpiresAt() != null) {
      joiner.add(getExpiresAt().toUrlQueryString(prefix + "expiresAt" + suffix));
    }

    // add `isActive` to the URL query string
    if (getIsActive() != null) {
      try {
        joiner.add(String.format("%sisActive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

