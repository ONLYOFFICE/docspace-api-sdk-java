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
import org.openapitools.client.model.LogoRequest;
import org.openapitools.client.model.RoomType;
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
 * The parameters for creating a third-party room.
 */
@JsonPropertyOrder({
  CreateThirdPartyRoom.JSON_PROPERTY_CREATE_AS_NEW_FOLDER,
  CreateThirdPartyRoom.JSON_PROPERTY_TITLE,
  CreateThirdPartyRoom.JSON_PROPERTY_ROOM_TYPE,
  CreateThirdPartyRoom.JSON_PROPERTY_PRIVATE,
  CreateThirdPartyRoom.JSON_PROPERTY_INDEXING,
  CreateThirdPartyRoom.JSON_PROPERTY_DENY_DOWNLOAD,
  CreateThirdPartyRoom.JSON_PROPERTY_COLOR,
  CreateThirdPartyRoom.JSON_PROPERTY_COVER,
  CreateThirdPartyRoom.JSON_PROPERTY_TAGS,
  CreateThirdPartyRoom.JSON_PROPERTY_LOGO
})

public class CreateThirdPartyRoom {
  public static final String JSON_PROPERTY_CREATE_AS_NEW_FOLDER = "createAsNewFolder";
  @javax.annotation.Nullable
  private Boolean createAsNewFolder;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_ROOM_TYPE = "roomType";
  @javax.annotation.Nonnull
  private RoomType roomType;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  @javax.annotation.Nullable
  private Boolean _private;

  public static final String JSON_PROPERTY_INDEXING = "indexing";
  @javax.annotation.Nullable
  private Boolean indexing;

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable
  private Boolean denyDownload;

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private JsonNullable<String> color = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COVER = "cover";
  @javax.annotation.Nullable
  private JsonNullable<String> cover = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable
  private LogoRequest logo;

  public CreateThirdPartyRoom() {
  }

  public CreateThirdPartyRoom createAsNewFolder(@javax.annotation.Nullable Boolean createAsNewFolder) {
    
    this.createAsNewFolder = createAsNewFolder;
    return this;
  }

  /**
   * Specifies whether to create a third-party room as a new folder or not.
   * @return createAsNewFolder
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_AS_NEW_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateAsNewFolder() {
    return createAsNewFolder;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_AS_NEW_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateAsNewFolder(@javax.annotation.Nullable Boolean createAsNewFolder) {
    this.createAsNewFolder = createAsNewFolder;
  }

  public CreateThirdPartyRoom title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The third-party room name to be created.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public CreateThirdPartyRoom roomType(@javax.annotation.Nonnull RoomType roomType) {
    
    this.roomType = roomType;
    return this;
  }

  /**
   * Get roomType
   * @return roomType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoomType getRoomType() {
    return roomType;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomType(@javax.annotation.Nonnull RoomType roomType) {
    this.roomType = roomType;
  }

  public CreateThirdPartyRoom _private(@javax.annotation.Nullable Boolean _private) {
    
    this._private = _private;
    return this;
  }

  /**
   * Specifies whether to create the private third-party room or not.
   * @return _private
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrivate() {
    return _private;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivate(@javax.annotation.Nullable Boolean _private) {
    this._private = _private;
  }

  public CreateThirdPartyRoom indexing(@javax.annotation.Nullable Boolean indexing) {
    
    this.indexing = indexing;
    return this;
  }

  /**
   * Specifies whether to create the third-party room with indexing.
   * @return indexing
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIndexing() {
    return indexing;
  }


  @JsonProperty(JSON_PROPERTY_INDEXING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexing(@javax.annotation.Nullable Boolean indexing) {
    this.indexing = indexing;
  }

  public CreateThirdPartyRoom denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    
    this.denyDownload = denyDownload;
    return this;
  }

  /**
   * Specifies whether to deny downloads from the third-party room.
   * @return denyDownload
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DENY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDenyDownload() {
    return denyDownload;
  }


  @JsonProperty(JSON_PROPERTY_DENY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDenyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = denyDownload;
  }

  public CreateThirdPartyRoom color(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
    
    return this;
  }

  /**
   * The color of the third-party room.
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

  public CreateThirdPartyRoom cover(@javax.annotation.Nullable String cover) {
    this.cover = JsonNullable.<String>of(cover);
    
    return this;
  }

  /**
   * The cover of the third-party room.
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

  public CreateThirdPartyRoom tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public CreateThirdPartyRoom addTagsItem(String tagsItem) {
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
   * The list of tags of the third-party room.
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

  public CreateThirdPartyRoom logo(@javax.annotation.Nullable LogoRequest logo) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThirdPartyRoom createThirdPartyRoom = (CreateThirdPartyRoom) o;
    return Objects.equals(this.createAsNewFolder, createThirdPartyRoom.createAsNewFolder) &&
        Objects.equals(this.title, createThirdPartyRoom.title) &&
        Objects.equals(this.roomType, createThirdPartyRoom.roomType) &&
        Objects.equals(this._private, createThirdPartyRoom._private) &&
        Objects.equals(this.indexing, createThirdPartyRoom.indexing) &&
        Objects.equals(this.denyDownload, createThirdPartyRoom.denyDownload) &&
        equalsNullable(this.color, createThirdPartyRoom.color) &&
        equalsNullable(this.cover, createThirdPartyRoom.cover) &&
        equalsNullable(this.tags, createThirdPartyRoom.tags) &&
        Objects.equals(this.logo, createThirdPartyRoom.logo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createAsNewFolder, title, roomType, _private, indexing, denyDownload, hashCodeNullable(color), hashCodeNullable(cover), hashCodeNullable(tags), logo);
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
    sb.append("class CreateThirdPartyRoom {\n");
    sb.append("    createAsNewFolder: ").append(toIndentedString(createAsNewFolder)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    indexing: ").append(toIndentedString(indexing)).append("\n");
    sb.append("    denyDownload: ").append(toIndentedString(denyDownload)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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

    // add `createAsNewFolder` to the URL query string
    if (getCreateAsNewFolder() != null) {
      try {
        joiner.add(String.format("%screateAsNewFolder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateAsNewFolder()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `roomType` to the URL query string
    if (getRoomType() != null) {
      try {
        joiner.add(String.format("%sroomType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `private` to the URL query string
    if (getPrivate() != null) {
      try {
        joiner.add(String.format("%sprivate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrivate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `indexing` to the URL query string
    if (getIndexing() != null) {
      try {
        joiner.add(String.format("%sindexing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndexing()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `denyDownload` to the URL query string
    if (getDenyDownload() != null) {
      try {
        joiner.add(String.format("%sdenyDownload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDenyDownload()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `logo` to the URL query string
    if (getLogo() != null) {
      joiner.add(getLogo().toUrlQueryString(prefix + "logo" + suffix));
    }

    return joiner.toString();
  }

}

