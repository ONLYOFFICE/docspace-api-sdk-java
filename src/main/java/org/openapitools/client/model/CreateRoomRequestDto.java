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
import org.openapitools.client.model.ChatSettings;
import org.openapitools.client.model.FileShareParams;
import org.openapitools.client.model.LogoRequest;
import org.openapitools.client.model.RoomDataLifetimeDto;
import org.openapitools.client.model.RoomType;
import org.openapitools.client.model.WatermarkRequestDto;
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
 * The parameters of a new room in the Rooms section.
 */
@JsonPropertyOrder({
  CreateRoomRequestDto.JSON_PROPERTY_TITLE,
  CreateRoomRequestDto.JSON_PROPERTY_QUOTA,
  CreateRoomRequestDto.JSON_PROPERTY_INDEXING,
  CreateRoomRequestDto.JSON_PROPERTY_DENY_DOWNLOAD,
  CreateRoomRequestDto.JSON_PROPERTY_LIFETIME,
  CreateRoomRequestDto.JSON_PROPERTY_WATERMARK,
  CreateRoomRequestDto.JSON_PROPERTY_LOGO,
  CreateRoomRequestDto.JSON_PROPERTY_TAGS,
  CreateRoomRequestDto.JSON_PROPERTY_COLOR,
  CreateRoomRequestDto.JSON_PROPERTY_COVER,
  CreateRoomRequestDto.JSON_PROPERTY_ROOM_TYPE,
  CreateRoomRequestDto.JSON_PROPERTY_PRIVATE,
  CreateRoomRequestDto.JSON_PROPERTY_SHARE,
  CreateRoomRequestDto.JSON_PROPERTY_CHAT_SETTINGS,
  CreateRoomRequestDto.JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B,
  CreateRoomRequestDto.JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X
})

public class CreateRoomRequestDto {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable  private JsonNullable<Long> quota = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INDEXING = "indexing";
  @javax.annotation.Nullable  private JsonNullable<Boolean> indexing = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable  private JsonNullable<Boolean> denyDownload = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  @javax.annotation.Nullable  private RoomDataLifetimeDto lifetime;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  @javax.annotation.Nullable  private WatermarkRequestDto watermark;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable  private LogoRequest logo;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable  private JsonNullable<String> color = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COVER = "cover";
  @javax.annotation.Nullable  private JsonNullable<String> cover = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROOM_TYPE = "roomType";
  @javax.annotation.Nonnull  private RoomType roomType;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  @javax.annotation.Nullable  private Boolean _private;

  public static final String JSON_PROPERTY_SHARE = "share";
  @javax.annotation.Nullable  private JsonNullable<List<FileShareParams>> share = JsonNullable.<List<FileShareParams>>undefined();

  public static final String JSON_PROPERTY_CHAT_SETTINGS = "chatSettings";
  @javax.annotation.Nullable  private ChatSettings chatSettings;

  public static final String JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B = "sendFormToExternalDB";
  @javax.annotation.Nullable  private JsonNullable<Boolean> sendFormToExternalDB = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X = "saveFormAsXLSX";
  @javax.annotation.Nullable  private JsonNullable<Boolean> saveFormAsXLSX = JsonNullable.<Boolean>undefined();

  public CreateRoomRequestDto() {
  }


  public CreateRoomRequestDto title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The name of the room. It is trimmed, characters that a folder name cannot hold are replaced with underscores  and the rest is truncated, so the stored title can differ from the one sent; a blank title is rejected. Titles  are not unique, and rooms are told apart by their id.
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public CreateRoomRequestDto quota(@javax.annotation.Nullable Long quota) {
    this.quota = JsonNullable.<Long>of(quota);
    
    return this;
  }

  /**
   * The storage the room may take, in bytes. It is accepted only while the per-room quota feature is on for the  portal and must stay inside the portal own limit; leaving it out lets the room follow the portal default.
   * @return quota
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Long getQuota() {
        return quota.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_QUOTA, required = false)
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

  public CreateRoomRequestDto indexing(@javax.annotation.Nullable Boolean indexing) {
    this.indexing = JsonNullable.<Boolean>of(indexing);
    
    return this;
  }

  /**
   * Whether the room keeps a manual order of its contents. With it on every file and folder carries a position  that listings follow and that `PUT api/2.0/files/rooms/{id}/reorder` compacts; with it off the contents are  ordered by the sorting of the request.
   * @return indexing
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIndexing() {
        return indexing.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INDEXING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIndexing_JsonNullable() {
    return indexing;
  }
  
  @JsonProperty(JSON_PROPERTY_INDEXING)
  public void setIndexing_JsonNullable(JsonNullable<Boolean> indexing) {
    this.indexing = indexing;
  }

  public void setIndexing(@javax.annotation.Nullable Boolean indexing) {
    this.indexing = JsonNullable.<Boolean>of(indexing);
  }

  public CreateRoomRequestDto denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = JsonNullable.<Boolean>of(denyDownload);
    
    return this;
  }

  /**
   * Whether members without editing rights are stopped from downloading and printing the contents of the room.  They can still open the documents in the editor.
   * @return denyDownload
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDenyDownload() {
        return denyDownload.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDenyDownload_JsonNullable() {
    return denyDownload;
  }
  
  @JsonProperty(JSON_PROPERTY_DENY_DOWNLOAD)
  public void setDenyDownload_JsonNullable(JsonNullable<Boolean> denyDownload) {
    this.denyDownload = denyDownload;
  }

  public void setDenyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = JsonNullable.<Boolean>of(denyDownload);
  }

  public CreateRoomRequestDto lifetime(@javax.annotation.Nullable RoomDataLifetimeDto lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

  /**
   * How long files may stay in the room before they are deleted automatically. The countdown starts when the  setting is saved, and leaving the field out keeps the files forever.
   * @return lifetime
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoomDataLifetimeDto getLifetime() {
    return lifetime;
  }


  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifetime(@javax.annotation.Nullable RoomDataLifetimeDto lifetime) {
    this.lifetime = lifetime;
  }

  public CreateRoomRequestDto watermark(@javax.annotation.Nullable WatermarkRequestDto watermark) {
    
    this.watermark = watermark;
    return this;
  }

  /**
   * The watermark drawn over documents opened in the room. Leaving the field out adds no watermark, and sending it  with the switch turned off removes the one the room has.
   * @return watermark
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WatermarkRequestDto getWatermark() {
    return watermark;
  }


  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermark(@javax.annotation.Nullable WatermarkRequestDto watermark) {
    this.watermark = watermark;
  }

  public CreateRoomRequestDto logo(@javax.annotation.Nullable LogoRequest logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * The picture to use as the room logo, named by the path that `POST api/2.0/files/logos` returned for an image  uploaded beforehand, plus the crop to take from it. Leaving the field out keeps the room on its cover and  colour.
   * @return logo
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogoRequest getLogo() {
    return logo;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable LogoRequest logo) {
    this.logo = logo;
  }

  public CreateRoomRequestDto tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public CreateRoomRequestDto addTagsItem(String tagsItem) {
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
   * The labels to attach to the room, by name. Names the portal tag catalogue does not hold yet are added to it,  and `GET api/2.0/files/tags` lists what already exists.
   * @return tags
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
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

  public CreateRoomRequestDto color(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
    
    return this;
  }

  /**
   * The background colour the room is drawn with while it has no logo, as six hexadecimal digits with no leading  number sign. An empty value restores the default colour of the room type.
   * @return color
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getColor() {
        return color.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
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

  public CreateRoomRequestDto cover(@javax.annotation.Nullable String cover) {
    this.cover = JsonNullable.<String>of(cover);
    
    return this;
  }

  /**
   * The picture drawn on the room while it has no logo, named by an identifier from  `GET api/2.0/files/rooms/covers`. Any other value is rejected, and an empty value leaves the room without a  cover.
   * @return cover
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCover() {
        return cover.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COVER, required = false)
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

  public CreateRoomRequestDto roomType(@javax.annotation.Nonnull RoomType roomType) {
    
    this.roomType = roomType;
    return this;
  }

  /**
   * What the room is for. It decides which sharing links, roles and form features the room offers, and it cannot  be changed once the room exists, so a room of the wrong kind has to be recreated.
   * @return roomType
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ROOM_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoomType getRoomType() {
    return roomType;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOM_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomType(@javax.annotation.Nonnull RoomType roomType) {
    this.roomType = roomType;
  }

  public CreateRoomRequestDto _private(@javax.annotation.Nullable Boolean _private) {
    
    this._private = _private;
    return this;
  }

  /**
   * Whether the room is end-to-end encrypted. Its files can then be opened only in the desktop application by  members whose encryption keys are set up, and the flag cannot be changed after the room is created.
   * @return _private
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRIVATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrivate() {
    return _private;
  }


  @JsonProperty(value = JSON_PROPERTY_PRIVATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivate(@javax.annotation.Nullable Boolean _private) {
    this._private = _private;
  }

  public CreateRoomRequestDto share(@javax.annotation.Nullable List<FileShareParams> share) {
    this.share = JsonNullable.<List<FileShareParams>>of(share);
    
    return this;
  }

  public CreateRoomRequestDto addShareItem(FileShareParams shareItem) {
    if (this.share == null || !this.share.isPresent()) {
      this.share = JsonNullable.<List<FileShareParams>>of(new ArrayList<>());
    }
    try {
      this.share.get().add(shareItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Not implemented on room creation: any non-empty value is rejected, and members are invited afterwards with  `PUT api/2.0/files/rooms/{id}/share`.
   * @return share
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<FileShareParams> getShare() {
        return share.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FileShareParams>> getShare_JsonNullable() {
    return share;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARE)
  public void setShare_JsonNullable(JsonNullable<List<FileShareParams>> share) {
    this.share = share;
  }

  public void setShare(@javax.annotation.Nullable List<FileShareParams> share) {
    this.share = JsonNullable.<List<FileShareParams>>of(share);
  }

  public CreateRoomRequestDto chatSettings(@javax.annotation.Nullable ChatSettings chatSettings) {
    
    this.chatSettings = chatSettings;
    return this;
  }

  /**
   * The model and the prompt an AI room answers with. It belongs to AI rooms only and is rejected for a room of  any other kind.
   * @return chatSettings
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CHAT_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChatSettings getChatSettings() {
    return chatSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAT_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChatSettings(@javax.annotation.Nullable ChatSettings chatSettings) {
    this.chatSettings = chatSettings;
  }

  public CreateRoomRequestDto sendFormToExternalDB(@javax.annotation.Nullable Boolean sendFormToExternalDB) {
    this.sendFormToExternalDB = JsonNullable.<Boolean>of(sendFormToExternalDB);
    
    return this;
  }

  /**
   * For a form filling room, whether the data of every completed submission is also pushed to the external  database configured for the portal. It is what `POST api/2.0/files/rooms/{id}/externaldbsync` re-runs for the  forms already collected.
   * @return sendFormToExternalDB
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getSendFormToExternalDB() {
        return sendFormToExternalDB.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getSendFormToExternalDB_JsonNullable() {
    return sendFormToExternalDB;
  }
  
  @JsonProperty(JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B)
  public void setSendFormToExternalDB_JsonNullable(JsonNullable<Boolean> sendFormToExternalDB) {
    this.sendFormToExternalDB = sendFormToExternalDB;
  }

  public void setSendFormToExternalDB(@javax.annotation.Nullable Boolean sendFormToExternalDB) {
    this.sendFormToExternalDB = JsonNullable.<Boolean>of(sendFormToExternalDB);
  }

  public CreateRoomRequestDto saveFormAsXLSX(@javax.annotation.Nullable Boolean saveFormAsXLSX) {
    this.saveFormAsXLSX = JsonNullable.<Boolean>of(saveFormAsXLSX);
    
    return this;
  }

  /**
   * For a form filling room, whether the collected submissions are also gathered into a spreadsheet stored next to  the completed forms. With it off the submissions are kept only as the filled documents themselves.
   * @return saveFormAsXLSX
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getSaveFormAsXLSX() {
        return saveFormAsXLSX.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getSaveFormAsXLSX_JsonNullable() {
    return saveFormAsXLSX;
  }
  
  @JsonProperty(JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X)
  public void setSaveFormAsXLSX_JsonNullable(JsonNullable<Boolean> saveFormAsXLSX) {
    this.saveFormAsXLSX = saveFormAsXLSX;
  }

  public void setSaveFormAsXLSX(@javax.annotation.Nullable Boolean saveFormAsXLSX) {
    this.saveFormAsXLSX = JsonNullable.<Boolean>of(saveFormAsXLSX);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoomRequestDto createRoomRequestDto = (CreateRoomRequestDto) o;
    return Objects.equals(this.title, createRoomRequestDto.title) &&
        equalsNullable(this.quota, createRoomRequestDto.quota) &&
        equalsNullable(this.indexing, createRoomRequestDto.indexing) &&
        equalsNullable(this.denyDownload, createRoomRequestDto.denyDownload) &&
        Objects.equals(this.lifetime, createRoomRequestDto.lifetime) &&
        Objects.equals(this.watermark, createRoomRequestDto.watermark) &&
        Objects.equals(this.logo, createRoomRequestDto.logo) &&
        equalsNullable(this.tags, createRoomRequestDto.tags) &&
        equalsNullable(this.color, createRoomRequestDto.color) &&
        equalsNullable(this.cover, createRoomRequestDto.cover) &&
        Objects.equals(this.roomType, createRoomRequestDto.roomType) &&
        Objects.equals(this._private, createRoomRequestDto._private) &&
        equalsNullable(this.share, createRoomRequestDto.share) &&
        Objects.equals(this.chatSettings, createRoomRequestDto.chatSettings) &&
        equalsNullable(this.sendFormToExternalDB, createRoomRequestDto.sendFormToExternalDB) &&
        equalsNullable(this.saveFormAsXLSX, createRoomRequestDto.saveFormAsXLSX);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, hashCodeNullable(quota), hashCodeNullable(indexing), hashCodeNullable(denyDownload), lifetime, watermark, logo, hashCodeNullable(tags), hashCodeNullable(color), hashCodeNullable(cover), roomType, _private, hashCodeNullable(share), chatSettings, hashCodeNullable(sendFormToExternalDB), hashCodeNullable(saveFormAsXLSX));
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
    sb.append("class CreateRoomRequestDto {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    indexing: ").append(toIndentedString(indexing)).append("\n");
    sb.append("    denyDownload: ").append(toIndentedString(denyDownload)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    chatSettings: ").append(toIndentedString(chatSettings)).append("\n");
    sb.append("    sendFormToExternalDB: ").append(toIndentedString(sendFormToExternalDB)).append("\n");
    sb.append("    saveFormAsXLSX: ").append(toIndentedString(saveFormAsXLSX)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `lifetime` to the URL query string
    if (getLifetime() != null) {
      joiner.add(getLifetime().toUrlQueryString(prefix + "lifetime" + suffix));
    }

    // add `watermark` to the URL query string
    if (getWatermark() != null) {
      joiner.add(getWatermark().toUrlQueryString(prefix + "watermark" + suffix));
    }

    // add `logo` to the URL query string
    if (getLogo() != null) {
      joiner.add(getLogo().toUrlQueryString(prefix + "logo" + suffix));
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

    // add `share` to the URL query string
    if (getShare() != null) {
      for (int i = 0; i < getShare().size(); i++) {
        if (getShare().get(i) != null) {
          joiner.add(getShare().get(i).toUrlQueryString(String.format("%sshare%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `chatSettings` to the URL query string
    if (getChatSettings() != null) {
      joiner.add(getChatSettings().toUrlQueryString(prefix + "chatSettings" + suffix));
    }

    // add `sendFormToExternalDB` to the URL query string
    if (getSendFormToExternalDB() != null) {
      try {
        joiner.add(String.format("%ssendFormToExternalDB%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSendFormToExternalDB()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saveFormAsXLSX` to the URL query string
    if (getSaveFormAsXLSX() != null) {
      try {
        joiner.add(String.format("%ssaveFormAsXLSX%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaveFormAsXLSX()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

