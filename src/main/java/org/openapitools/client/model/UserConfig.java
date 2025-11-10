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
 * The configuration parameters of the user currently viewing or editing the document.
 */
@JsonPropertyOrder({
  UserConfig.JSON_PROPERTY_ID,
  UserConfig.JSON_PROPERTY_NAME,
  UserConfig.JSON_PROPERTY_IMAGE,
  UserConfig.JSON_PROPERTY_ROLES,
  UserConfig.JSON_PROPERTY_CUSTOMER_ID
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class UserConfig {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private JsonNullable<String> image = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROLES = "roles";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> roles = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public UserConfig() {
  }

  public UserConfig id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The user ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
  }

  public UserConfig name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The full name of the user.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public UserConfig image(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
    
    return this;
  }

  /**
   * The path to the user&#39;s avatar.
   * @return image
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImage() {
        return image.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImage_JsonNullable() {
    return image;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE)
  public void setImage_JsonNullable(JsonNullable<String> image) {
    this.image = image;
  }

  public void setImage(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
  }

  public UserConfig roles(@javax.annotation.Nullable List<String> roles) {
    this.roles = JsonNullable.<List<String>>of(roles);
    
    return this;
  }

  public UserConfig addRolesItem(String rolesItem) {
    if (this.roles == null || !this.roles.isPresent()) {
      this.roles = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.roles.get().add(rolesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Roles
   * @return roles
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getRoles() {
        return roles.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getRoles_JsonNullable() {
    return roles;
  }
  
  @JsonProperty(JSON_PROPERTY_ROLES)
  public void setRoles_JsonNullable(JsonNullable<List<String>> roles) {
    this.roles = roles;
  }

  public void setRoles(@javax.annotation.Nullable List<String> roles) {
    this.roles = JsonNullable.<List<String>>of(roles);
  }

  public UserConfig customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCustomerId() {
        return customerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomerId_JsonNullable() {
    return customerId;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  public void setCustomerId_JsonNullable(JsonNullable<String> customerId) {
    this.customerId = customerId;
  }

  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConfig userConfig = (UserConfig) o;
    return equalsNullable(this.id, userConfig.id) &&
        equalsNullable(this.name, userConfig.name) &&
        equalsNullable(this.image, userConfig.image) &&
        equalsNullable(this.roles, userConfig.roles) &&
        equalsNullable(this.customerId, userConfig.customerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(name), hashCodeNullable(image), hashCodeNullable(roles), hashCodeNullable(customerId));
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
    sb.append("class UserConfig {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

    // add `image` to the URL query string
    if (getImage() != null) {
      try {
        joiner.add(String.format("%simage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `roles` to the URL query string
    if (getRoles() != null) {
      for (int i = 0; i < getRoles().size(); i++) {
        try {
          joiner.add(String.format("%sroles%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getRoles().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      try {
        joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

