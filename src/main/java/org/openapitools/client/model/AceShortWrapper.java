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
 * The information about the settings which allow to share the document with other users.
 */
@JsonPropertyOrder({
  AceShortWrapper.JSON_PROPERTY_USER,
  AceShortWrapper.JSON_PROPERTY_PERMISSIONS,
  AceShortWrapper.JSON_PROPERTY_IS_LINK
})

public class AceShortWrapper {
  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable
  private JsonNullable<String> user = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  @javax.annotation.Nullable
  private JsonNullable<String> permissions = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_LINK = "isLink";
  @javax.annotation.Nullable
  private Boolean isLink;

  public AceShortWrapper() {
  }

  public AceShortWrapper user(@javax.annotation.Nullable String user) {
    this.user = JsonNullable.<String>of(user);
    
    return this;
  }

  /**
   * The name of the user the document will be shared with.
   * @return user
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUser() {
        return user.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUser_JsonNullable() {
    return user;
  }
  
  @JsonProperty(JSON_PROPERTY_USER)
  public void setUser_JsonNullable(JsonNullable<String> user) {
    this.user = user;
  }

  public void setUser(@javax.annotation.Nullable String user) {
    this.user = JsonNullable.<String>of(user);
  }

  public AceShortWrapper permissions(@javax.annotation.Nullable String permissions) {
    this.permissions = JsonNullable.<String>of(permissions);
    
    return this;
  }

  /**
   * The access rights for the user with the name above.  Can be Full Access, Read Only, or Deny Access.
   * @return permissions
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPermissions() {
        return permissions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPermissions_JsonNullable() {
    return permissions;
  }
  
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  public void setPermissions_JsonNullable(JsonNullable<String> permissions) {
    this.permissions = permissions;
  }

  public void setPermissions(@javax.annotation.Nullable String permissions) {
    this.permissions = JsonNullable.<String>of(permissions);
  }

  public AceShortWrapper isLink(@javax.annotation.Nullable Boolean isLink) {
    
    this.isLink = isLink;
    return this;
  }

  /**
   * Specifies whether to change the user icon to the link icon.
   * @return isLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLink() {
    return isLink;
  }


  @JsonProperty(JSON_PROPERTY_IS_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLink(@javax.annotation.Nullable Boolean isLink) {
    this.isLink = isLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AceShortWrapper aceShortWrapper = (AceShortWrapper) o;
    return equalsNullable(this.user, aceShortWrapper.user) &&
        equalsNullable(this.permissions, aceShortWrapper.permissions) &&
        Objects.equals(this.isLink, aceShortWrapper.isLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(user), hashCodeNullable(permissions), isLink);
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
    sb.append("class AceShortWrapper {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isLink: ").append(toIndentedString(isLink)).append("\n");
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

    // add `user` to the URL query string
    if (getUser() != null) {
      try {
        joiner.add(String.format("%suser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUser()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      try {
        joiner.add(String.format("%spermissions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPermissions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isLink` to the URL query string
    if (getIsLink() != null) {
      try {
        joiner.add(String.format("%sisLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

