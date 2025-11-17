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
import org.openapitools.client.model.UserInfo;
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
 * The parameters of a user mentioned in a message.
 */
@JsonPropertyOrder({
  MentionWrapper.JSON_PROPERTY_USER,
  MentionWrapper.JSON_PROPERTY_EMAIL,
  MentionWrapper.JSON_PROPERTY_ID,
  MentionWrapper.JSON_PROPERTY_IMAGE,
  MentionWrapper.JSON_PROPERTY_HAS_ACCESS,
  MentionWrapper.JSON_PROPERTY_NAME
})

public class MentionWrapper {
  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable
  private UserInfo user;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private JsonNullable<String> image = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_ACCESS = "hasAccess";
  @javax.annotation.Nullable
  private Boolean hasAccess;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public MentionWrapper() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public MentionWrapper(
    @JsonProperty(JSON_PROPERTY_EMAIL) String email, 
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_IMAGE) String image, 
    @JsonProperty(JSON_PROPERTY_HAS_ACCESS) Boolean hasAccess, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
    this();
    this.email = email == null ? JsonNullable.<String>undefined() : JsonNullable.of(email);
    this.id = id == null ? JsonNullable.<String>undefined() : JsonNullable.of(id);
    this.image = image == null ? JsonNullable.<String>undefined() : JsonNullable.of(image);
    this.hasAccess = hasAccess;
    this.name = name == null ? JsonNullable.<String>undefined() : JsonNullable.of(name);
  }

  public MentionWrapper user(@javax.annotation.Nullable UserInfo user) {
    
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserInfo getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(@javax.annotation.Nullable UserInfo user) {
    this.user = user;
  }

  /**
   * The user email address.
   * @return email
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
    
    if (email == null) {
      email = JsonNullable.<String>undefined();
    }
    return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  private void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }


  /**
   * The user unique identification.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getId() {
    
    if (id == null) {
      id = JsonNullable.<String>undefined();
    }
    return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  private void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }


  /**
   * The path to the user&#39;s avatar.
   * @return image
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImage() {
    
    if (image == null) {
      image = JsonNullable.<String>undefined();
    }
    return image.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImage_JsonNullable() {
    return image;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE)
  private void setImage_JsonNullable(JsonNullable<String> image) {
    this.image = image;
  }


  /**
   * Specifies whether the user has the access to the file where they are mentioned.
   * @return hasAccess
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasAccess() {
    return hasAccess;
  }



  /**
   * The user full name.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
    
    if (name == null) {
      name = JsonNullable.<String>undefined();
    }
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  private void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MentionWrapper mentionWrapper = (MentionWrapper) o;
    return Objects.equals(this.user, mentionWrapper.user) &&
        equalsNullable(this.email, mentionWrapper.email) &&
        equalsNullable(this.id, mentionWrapper.id) &&
        equalsNullable(this.image, mentionWrapper.image) &&
        Objects.equals(this.hasAccess, mentionWrapper.hasAccess) &&
        equalsNullable(this.name, mentionWrapper.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, hashCodeNullable(email), hashCodeNullable(id), hashCodeNullable(image), hasAccess, hashCodeNullable(name));
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
    sb.append("class MentionWrapper {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
      joiner.add(getUser().toUrlQueryString(prefix + "user" + suffix));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `hasAccess` to the URL query string
    if (getHasAccess() != null) {
      try {
        joiner.add(String.format("%shasAccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasAccess()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

