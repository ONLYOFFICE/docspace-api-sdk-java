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
import java.util.UUID;
import org.openapitools.client.model.LogoRequest;
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
 * The room template parameters.
 */
@JsonPropertyOrder({
  RoomTemplateDto.JSON_PROPERTY_ROOM_ID,
  RoomTemplateDto.JSON_PROPERTY_TITLE,
  RoomTemplateDto.JSON_PROPERTY_LOGO,
  RoomTemplateDto.JSON_PROPERTY_COPY_LOGO,
  RoomTemplateDto.JSON_PROPERTY_SHARE,
  RoomTemplateDto.JSON_PROPERTY_GROUPS,
  RoomTemplateDto.JSON_PROPERTY_PUBLIC,
  RoomTemplateDto.JSON_PROPERTY_TAGS,
  RoomTemplateDto.JSON_PROPERTY_COLOR,
  RoomTemplateDto.JSON_PROPERTY_COVER,
  RoomTemplateDto.JSON_PROPERTY_QUOTA
})

public class RoomTemplateDto {
  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  @javax.annotation.Nonnull
  private Integer roomId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable
  private LogoRequest logo;

  public static final String JSON_PROPERTY_COPY_LOGO = "copyLogo";
  @javax.annotation.Nullable
  private Boolean copyLogo;

  public static final String JSON_PROPERTY_SHARE = "share";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> share = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> groups = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_PUBLIC = "public";
  @javax.annotation.Nullable
  private Boolean _public;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private JsonNullable<String> color = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COVER = "cover";
  @javax.annotation.Nullable
  private JsonNullable<String> cover = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable
  private JsonNullable<Long> quota = JsonNullable.<Long>undefined();

  public RoomTemplateDto() {
  }

  public RoomTemplateDto roomId(@javax.annotation.Nonnull Integer roomId) {
    
    this.roomId = roomId;
    return this;
  }

  /**
   * The room template ID.
   * @return roomId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRoomId() {
    return roomId;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomId(@javax.annotation.Nonnull Integer roomId) {
    this.roomId = roomId;
  }

  public RoomTemplateDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The room template title.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
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

  public RoomTemplateDto logo(@javax.annotation.Nullable LogoRequest logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogoRequest getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable LogoRequest logo) {
    this.logo = logo;
  }

  public RoomTemplateDto copyLogo(@javax.annotation.Nullable Boolean copyLogo) {
    
    this.copyLogo = copyLogo;
    return this;
  }

  /**
   * Specifies whether to copy room logo or not.
   * @return copyLogo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COPY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopyLogo() {
    return copyLogo;
  }


  @JsonProperty(JSON_PROPERTY_COPY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopyLogo(@javax.annotation.Nullable Boolean copyLogo) {
    this.copyLogo = copyLogo;
  }

  public RoomTemplateDto share(@javax.annotation.Nullable List<String> share) {
    this.share = JsonNullable.<List<String>>of(share);
    
    return this;
  }

  public RoomTemplateDto addShareItem(String shareItem) {
    if (this.share == null || !this.share.isPresent()) {
      this.share = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.share.get().add(shareItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The collection of email addresses of users with whom to share a room.
   * @return share
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getShare() {
        return share.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getShare_JsonNullable() {
    return share;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARE)
  public void setShare_JsonNullable(JsonNullable<List<String>> share) {
    this.share = share;
  }

  public void setShare(@javax.annotation.Nullable List<String> share) {
    this.share = JsonNullable.<List<String>>of(share);
  }

  public RoomTemplateDto groups(@javax.annotation.Nullable List<UUID> groups) {
    this.groups = JsonNullable.<List<UUID>>of(groups);
    
    return this;
  }

  public RoomTemplateDto addGroupsItem(UUID groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.groups.get().add(groupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The collection of groups with whom to share a room.
   * @return groups
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<UUID> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<List<UUID>> groups) {
    this.groups = groups;
  }

  public void setGroups(@javax.annotation.Nullable List<UUID> groups) {
    this.groups = JsonNullable.<List<UUID>>of(groups);
  }

  public RoomTemplateDto _public(@javax.annotation.Nullable Boolean _public) {
    
    this._public = _public;
    return this;
  }

  /**
   * Specifies whether the room template is public or not.
   * @return _public
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPublic() {
    return _public;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublic(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
  }

  public RoomTemplateDto tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public RoomTemplateDto addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The collection of tags.
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }

  public RoomTemplateDto color(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
    
    return this;
  }

  /**
   * The color of the room template.
   * @return color
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getColor() {
        return color.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getColor_JsonNullable() {
    return color;
  }
  
  @JsonProperty(JSON_PROPERTY_COLOR)
  public void setColor_JsonNullable(JsonNullable<String> color) {
    this.color = color;
  }

  public void setColor(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
  }

  public RoomTemplateDto cover(@javax.annotation.Nullable String cover) {
    this.cover = JsonNullable.<String>of(cover);
    
    return this;
  }

  /**
   * The cover of the room template.
   * @return cover
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCover() {
        return cover.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCover_JsonNullable() {
    return cover;
  }
  
  @JsonProperty(JSON_PROPERTY_COVER)
  public void setCover_JsonNullable(JsonNullable<String> cover) {
    this.cover = cover;
  }

  public void setCover(@javax.annotation.Nullable String cover) {
    this.cover = JsonNullable.<String>of(cover);
  }

  public RoomTemplateDto quota(@javax.annotation.Nullable Long quota) {
    this.quota = JsonNullable.<Long>of(quota);
    
    return this;
  }

  /**
   * Room quota
   * @return quota
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getQuota() {
        return quota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getQuota_JsonNullable() {
    return quota;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTA)
  public void setQuota_JsonNullable(JsonNullable<Long> quota) {
    this.quota = quota;
  }

  public void setQuota(@javax.annotation.Nullable Long quota) {
    this.quota = JsonNullable.<Long>of(quota);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomTemplateDto roomTemplateDto = (RoomTemplateDto) o;
    return Objects.equals(this.roomId, roomTemplateDto.roomId) &&
        equalsNullable(this.title, roomTemplateDto.title) &&
        Objects.equals(this.logo, roomTemplateDto.logo) &&
        Objects.equals(this.copyLogo, roomTemplateDto.copyLogo) &&
        equalsNullable(this.share, roomTemplateDto.share) &&
        equalsNullable(this.groups, roomTemplateDto.groups) &&
        Objects.equals(this._public, roomTemplateDto._public) &&
        equalsNullable(this.tags, roomTemplateDto.tags) &&
        equalsNullable(this.color, roomTemplateDto.color) &&
        equalsNullable(this.cover, roomTemplateDto.cover) &&
        equalsNullable(this.quota, roomTemplateDto.quota);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, hashCodeNullable(title), logo, copyLogo, hashCodeNullable(share), hashCodeNullable(groups), _public, hashCodeNullable(tags), hashCodeNullable(color), hashCodeNullable(cover), hashCodeNullable(quota));
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
    sb.append("class RoomTemplateDto {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    copyLogo: ").append(toIndentedString(copyLogo)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

    // add `roomId` to the URL query string
    if (getRoomId() != null) {
      try {
        joiner.add(String.format("%sroomId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `logo` to the URL query string
    if (getLogo() != null) {
      joiner.add(getLogo().toUrlQueryString(prefix + "logo" + suffix));
    }

    // add `copyLogo` to the URL query string
    if (getCopyLogo() != null) {
      try {
        joiner.add(String.format("%scopyLogo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCopyLogo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `share` to the URL query string
    if (getShare() != null) {
      for (int i = 0; i < getShare().size(); i++) {
        try {
          joiner.add(String.format("%sshare%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getShare().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (int i = 0; i < getGroups().size(); i++) {
        if (getGroups().get(i) != null) {
          try {
            joiner.add(String.format("%sgroups%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getGroups().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `public` to the URL query string
    if (getPublic() != null) {
      try {
        joiner.add(String.format("%spublic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPublic()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        try {
          joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTags().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      try {
        joiner.add(String.format("%scolor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getColor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cover` to the URL query string
    if (getCover() != null) {
      try {
        joiner.add(String.format("%scover%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCover()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quota` to the URL query string
    if (getQuota() != null) {
      try {
        joiner.add(String.format("%squota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

