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
import org.openapitools.client.model.PortalUserDto;
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
 * A portal member the editor can offer when the author types a mention: who they are, where the notification goes  and how to show them in the suggestion list.
 */
@JsonPropertyOrder({
  MentionDto.JSON_PROPERTY_USER,
  MentionDto.JSON_PROPERTY_EMAIL,
  MentionDto.JSON_PROPERTY_ID,
  MentionDto.JSON_PROPERTY_IMAGE,
  MentionDto.JSON_PROPERTY_HAS_ACCESS,
  MentionDto.JSON_PROPERTY_NAME
})

public class MentionDto {
  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable  private PortalUserDto user;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable  private JsonNullable<String> image = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_ACCESS = "hasAccess";
  @javax.annotation.Nullable  private Boolean hasAccess;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public MentionDto() {
  }


  public MentionDto user(@javax.annotation.Nullable PortalUserDto user) {
    
    this.user = user;
    return this;
  }

  /**
   * The account itself, as the portal stores it.
   * @return user
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PortalUserDto getUser() {
    return user;
  }


  @JsonProperty(value = JSON_PROPERTY_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(@javax.annotation.Nullable PortalUserDto user) {
    this.user = user;
  }

  public MentionDto email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * Where a mention notification for this user is delivered.
   * @return email
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
  }

  public MentionDto id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The account id as text, the same value the account object carries; it is what identifies the user in a sharing  request built from this list.
   * @return id
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
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

  public MentionDto image(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
    
    return this;
  }

  /**
   * An absolute address of the medium-sized avatar. A generated default avatar is reported when the user never  uploaded one, so the field is never empty.
   * @return image
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getImage() {
        return image.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
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

  public MentionDto hasAccess(@javax.annotation.Nullable Boolean hasAccess) {
    
    this.hasAccess = hasAccess;
    return this;
  }

  /**
   * Not filled in by the operations that return this list: it always comes back false. Whether a user can already  open the document has to be read from the sharing settings of the file.
   * @return hasAccess
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HAS_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasAccess() {
    return hasAccess;
  }


  @JsonProperty(value = JSON_PROPERTY_HAS_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAccess(@javax.annotation.Nullable Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }

  public MentionDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The name to display, assembled the way the portal is configured to show names.
   * @return name
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MentionDto mentionDto = (MentionDto) o;
    return Objects.equals(this.user, mentionDto.user) &&
        equalsNullable(this.email, mentionDto.email) &&
        equalsNullable(this.id, mentionDto.id) &&
        equalsNullable(this.image, mentionDto.image) &&
        Objects.equals(this.hasAccess, mentionDto.hasAccess) &&
        equalsNullable(this.name, mentionDto.name);
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
    sb.append("class MentionDto {\n");
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

