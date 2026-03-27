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
import java.util.UUID;
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
 * The user parameters.
 */
@JsonPropertyOrder({
  EmployeeDto.JSON_PROPERTY_ID,
  EmployeeDto.JSON_PROPERTY_DISPLAY_NAME,
  EmployeeDto.JSON_PROPERTY_TITLE,
  EmployeeDto.JSON_PROPERTY_AVATAR,
  EmployeeDto.JSON_PROPERTY_AVATAR_ORIGINAL,
  EmployeeDto.JSON_PROPERTY_AVATAR_MAX,
  EmployeeDto.JSON_PROPERTY_AVATAR_MEDIUM,
  EmployeeDto.JSON_PROPERTY_AVATAR_SMALL,
  EmployeeDto.JSON_PROPERTY_PROFILE_URL,
  EmployeeDto.JSON_PROPERTY_HAS_AVATAR,
  EmployeeDto.JSON_PROPERTY_IS_ANONIM
})

public class EmployeeDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private UUID id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  @javax.annotation.Nullable  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  @javax.annotation.Nullable  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_ORIGINAL = "avatarOriginal";
  @javax.annotation.Nullable  private JsonNullable<String> avatarOriginal = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_MAX = "avatarMax";
  @javax.annotation.Nullable  private JsonNullable<String> avatarMax = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_MEDIUM = "avatarMedium";
  @javax.annotation.Nullable  private JsonNullable<String> avatarMedium = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_SMALL = "avatarSmall";
  @javax.annotation.Nullable  private JsonNullable<String> avatarSmall = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROFILE_URL = "profileUrl";
  @javax.annotation.Nullable  private JsonNullable<String> profileUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_AVATAR = "hasAvatar";
  @javax.annotation.Nullable  private Boolean hasAvatar;

  public static final String JSON_PROPERTY_IS_ANONIM = "isAnonim";
  @javax.annotation.Nullable  private Boolean isAnonim;

  public EmployeeDto() {
  }


  public EmployeeDto id(@javax.annotation.Nullable UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The user ID.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }

  public EmployeeDto displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

  /**
   * The HTML-encoded user's display name formatted according to the default format for the current culture.
   * @return displayName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DISPLAY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }

  public EmployeeDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The user title.
   * @return title
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public EmployeeDto avatar(@javax.annotation.Nullable String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
    
    return this;
  }

  /**
   * The user avatar.
   * @return avatar
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAvatar() {
        return avatar.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AVATAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAvatar_JsonNullable() {
    return avatar;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR)
  public void setAvatar_JsonNullable(JsonNullable<String> avatar) {
    this.avatar = avatar;
  }

  public void setAvatar(@javax.annotation.Nullable String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
  }

  public EmployeeDto avatarOriginal(@javax.annotation.Nullable String avatarOriginal) {
    this.avatarOriginal = JsonNullable.<String>of(avatarOriginal);
    
    return this;
  }

  /**
   * The user original size avatar.
   * @return avatarOriginal
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAvatarOriginal() {
        return avatarOriginal.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AVATAR_ORIGINAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAvatarOriginal_JsonNullable() {
    return avatarOriginal;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_ORIGINAL)
  public void setAvatarOriginal_JsonNullable(JsonNullable<String> avatarOriginal) {
    this.avatarOriginal = avatarOriginal;
  }

  public void setAvatarOriginal(@javax.annotation.Nullable String avatarOriginal) {
    this.avatarOriginal = JsonNullable.<String>of(avatarOriginal);
  }

  public EmployeeDto avatarMax(@javax.annotation.Nullable String avatarMax) {
    this.avatarMax = JsonNullable.<String>of(avatarMax);
    
    return this;
  }

  /**
   * The user maximum size avatar.
   * @return avatarMax
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAvatarMax() {
        return avatarMax.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AVATAR_MAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAvatarMax_JsonNullable() {
    return avatarMax;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_MAX)
  public void setAvatarMax_JsonNullable(JsonNullable<String> avatarMax) {
    this.avatarMax = avatarMax;
  }

  public void setAvatarMax(@javax.annotation.Nullable String avatarMax) {
    this.avatarMax = JsonNullable.<String>of(avatarMax);
  }

  public EmployeeDto avatarMedium(@javax.annotation.Nullable String avatarMedium) {
    this.avatarMedium = JsonNullable.<String>of(avatarMedium);
    
    return this;
  }

  /**
   * The user medium size avatar.
   * @return avatarMedium
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAvatarMedium() {
        return avatarMedium.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AVATAR_MEDIUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAvatarMedium_JsonNullable() {
    return avatarMedium;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_MEDIUM)
  public void setAvatarMedium_JsonNullable(JsonNullable<String> avatarMedium) {
    this.avatarMedium = avatarMedium;
  }

  public void setAvatarMedium(@javax.annotation.Nullable String avatarMedium) {
    this.avatarMedium = JsonNullable.<String>of(avatarMedium);
  }

  public EmployeeDto avatarSmall(@javax.annotation.Nullable String avatarSmall) {
    this.avatarSmall = JsonNullable.<String>of(avatarSmall);
    
    return this;
  }

  /**
   * The user small size avatar.
   * @return avatarSmall
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAvatarSmall() {
        return avatarSmall.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AVATAR_SMALL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAvatarSmall_JsonNullable() {
    return avatarSmall;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_SMALL)
  public void setAvatarSmall_JsonNullable(JsonNullable<String> avatarSmall) {
    this.avatarSmall = avatarSmall;
  }

  public void setAvatarSmall(@javax.annotation.Nullable String avatarSmall) {
    this.avatarSmall = JsonNullable.<String>of(avatarSmall);
  }

  public EmployeeDto profileUrl(@javax.annotation.Nullable String profileUrl) {
    this.profileUrl = JsonNullable.<String>of(profileUrl);
    
    return this;
  }

  /**
   * The user profile URL.
   * @return profileUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getProfileUrl() {
        return profileUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROFILE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getProfileUrl_JsonNullable() {
    return profileUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  public void setProfileUrl_JsonNullable(JsonNullable<String> profileUrl) {
    this.profileUrl = profileUrl;
  }

  public void setProfileUrl(@javax.annotation.Nullable String profileUrl) {
    this.profileUrl = JsonNullable.<String>of(profileUrl);
  }

  public EmployeeDto hasAvatar(@javax.annotation.Nullable Boolean hasAvatar) {
    
    this.hasAvatar = hasAvatar;
    return this;
  }

  /**
   * Specifies if the user has an avatar or not.
   * @return hasAvatar
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HAS_AVATAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasAvatar() {
    return hasAvatar;
  }


  @JsonProperty(value = JSON_PROPERTY_HAS_AVATAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAvatar(@javax.annotation.Nullable Boolean hasAvatar) {
    this.hasAvatar = hasAvatar;
  }

  public EmployeeDto isAnonim(@javax.annotation.Nullable Boolean isAnonim) {
    
    this.isAnonim = isAnonim;
    return this;
  }

  /**
   * Specifies if the user is anonymous or not.
   * @return isAnonim
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_ANONIM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAnonim() {
    return isAnonim;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_ANONIM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAnonim(@javax.annotation.Nullable Boolean isAnonim) {
    this.isAnonim = isAnonim;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeDto employeeDto = (EmployeeDto) o;
    return Objects.equals(this.id, employeeDto.id) &&
        equalsNullable(this.displayName, employeeDto.displayName) &&
        equalsNullable(this.title, employeeDto.title) &&
        equalsNullable(this.avatar, employeeDto.avatar) &&
        equalsNullable(this.avatarOriginal, employeeDto.avatarOriginal) &&
        equalsNullable(this.avatarMax, employeeDto.avatarMax) &&
        equalsNullable(this.avatarMedium, employeeDto.avatarMedium) &&
        equalsNullable(this.avatarSmall, employeeDto.avatarSmall) &&
        equalsNullable(this.profileUrl, employeeDto.profileUrl) &&
        Objects.equals(this.hasAvatar, employeeDto.hasAvatar) &&
        Objects.equals(this.isAnonim, employeeDto.isAnonim);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(displayName), hashCodeNullable(title), hashCodeNullable(avatar), hashCodeNullable(avatarOriginal), hashCodeNullable(avatarMax), hashCodeNullable(avatarMedium), hashCodeNullable(avatarSmall), hashCodeNullable(profileUrl), hasAvatar, isAnonim);
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
    sb.append("class EmployeeDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    avatarOriginal: ").append(toIndentedString(avatarOriginal)).append("\n");
    sb.append("    avatarMax: ").append(toIndentedString(avatarMax)).append("\n");
    sb.append("    avatarMedium: ").append(toIndentedString(avatarMedium)).append("\n");
    sb.append("    avatarSmall: ").append(toIndentedString(avatarSmall)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    hasAvatar: ").append(toIndentedString(hasAvatar)).append("\n");
    sb.append("    isAnonim: ").append(toIndentedString(isAnonim)).append("\n");
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

    // add `displayName` to the URL query string
    if (getDisplayName() != null) {
      try {
        joiner.add(String.format("%sdisplayName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatar` to the URL query string
    if (getAvatar() != null) {
      try {
        joiner.add(String.format("%savatar%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatar()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatarOriginal` to the URL query string
    if (getAvatarOriginal() != null) {
      try {
        joiner.add(String.format("%savatarOriginal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatarOriginal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatarMax` to the URL query string
    if (getAvatarMax() != null) {
      try {
        joiner.add(String.format("%savatarMax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatarMax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatarMedium` to the URL query string
    if (getAvatarMedium() != null) {
      try {
        joiner.add(String.format("%savatarMedium%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatarMedium()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatarSmall` to the URL query string
    if (getAvatarSmall() != null) {
      try {
        joiner.add(String.format("%savatarSmall%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatarSmall()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profileUrl` to the URL query string
    if (getProfileUrl() != null) {
      try {
        joiner.add(String.format("%sprofileUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hasAvatar` to the URL query string
    if (getHasAvatar() != null) {
      try {
        joiner.add(String.format("%shasAvatar%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasAvatar()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isAnonim` to the URL query string
    if (getIsAnonim() != null) {
      try {
        joiner.add(String.format("%sisAnonim%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAnonim()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

