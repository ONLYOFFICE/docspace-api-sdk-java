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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiApiDateTime;
import org.openapitools.client.model.AiChatSettingsDto;
import org.openapitools.client.model.AiEmployeeDto;
import org.openapitools.client.model.AiFileEntryDtoAllOfAvailableShareRights;
import org.openapitools.client.model.AiFileEntryDtoAllOfSecurity;
import org.openapitools.client.model.AiFileEntryDtoAllOfShareSettings;
import org.openapitools.client.model.AiFileEntryType;
import org.openapitools.client.model.AiFileShare;
import org.openapitools.client.model.AiFolderType;
import org.openapitools.client.model.AiLogo;
import org.openapitools.client.model.AiRoomDataLifetimeDto;
import org.openapitools.client.model.AiRoomType;
import org.openapitools.client.model.AiWatermarkDto;
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
 * The folder, with the fields that only a room carries filled in when the folder is a room.
 */
@JsonPropertyOrder({
  AiFolderDto.JSON_PROPERTY_TITLE,
  AiFolderDto.JSON_PROPERTY_ACCESS,
  AiFolderDto.JSON_PROPERTY_SHARED_BY,
  AiFolderDto.JSON_PROPERTY_OWNED_BY,
  AiFolderDto.JSON_PROPERTY_SHARED,
  AiFolderDto.JSON_PROPERTY_SHARED_FOR_USER,
  AiFolderDto.JSON_PROPERTY_SHARED_EXTERNAL,
  AiFolderDto.JSON_PROPERTY_PARENT_SHARED,
  AiFolderDto.JSON_PROPERTY_SHORT_WEB_URL,
  AiFolderDto.JSON_PROPERTY_CREATED,
  AiFolderDto.JSON_PROPERTY_CREATED_BY,
  AiFolderDto.JSON_PROPERTY_UPDATED,
  AiFolderDto.JSON_PROPERTY_AUTO_DELETE,
  AiFolderDto.JSON_PROPERTY_ROOT_FOLDER_TYPE,
  AiFolderDto.JSON_PROPERTY_PARENT_ROOM_TYPE,
  AiFolderDto.JSON_PROPERTY_UPDATED_BY,
  AiFolderDto.JSON_PROPERTY_PROVIDER_ITEM,
  AiFolderDto.JSON_PROPERTY_PROVIDER_KEY,
  AiFolderDto.JSON_PROPERTY_PROVIDER_ID,
  AiFolderDto.JSON_PROPERTY_ORDER,
  AiFolderDto.JSON_PROPERTY_IS_FAVORITE,
  AiFolderDto.JSON_PROPERTY_FILE_ENTRY_TYPE,
  AiFolderDto.JSON_PROPERTY_ID,
  AiFolderDto.JSON_PROPERTY_ROOT_FOLDER_ID,
  AiFolderDto.JSON_PROPERTY_ORIGIN_ID,
  AiFolderDto.JSON_PROPERTY_ORIGIN_ROOM_ID,
  AiFolderDto.JSON_PROPERTY_ORIGIN_TITLE,
  AiFolderDto.JSON_PROPERTY_ORIGIN_ROOM_TITLE,
  AiFolderDto.JSON_PROPERTY_CAN_SHARE,
  AiFolderDto.JSON_PROPERTY_SHARE_SETTINGS,
  AiFolderDto.JSON_PROPERTY_SECURITY,
  AiFolderDto.JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS,
  AiFolderDto.JSON_PROPERTY_REQUEST_TOKEN,
  AiFolderDto.JSON_PROPERTY_EXTERNAL,
  AiFolderDto.JSON_PROPERTY_EXPIRATION_DATE,
  AiFolderDto.JSON_PROPERTY_IS_LINK_EXPIRED,
  AiFolderDto.JSON_PROPERTY_PARENT_ID,
  AiFolderDto.JSON_PROPERTY_FILES_COUNT,
  AiFolderDto.JSON_PROPERTY_FOLDERS_COUNT,
  AiFolderDto.JSON_PROPERTY_IS_SHAREABLE,
  AiFolderDto.JSON_PROPERTY_NEW,
  AiFolderDto.JSON_PROPERTY_MUTE,
  AiFolderDto.JSON_PROPERTY_TAGS,
  AiFolderDto.JSON_PROPERTY_LOGO,
  AiFolderDto.JSON_PROPERTY_PINNED,
  AiFolderDto.JSON_PROPERTY_ROOM_TYPE,
  AiFolderDto.JSON_PROPERTY_PRIVATE,
  AiFolderDto.JSON_PROPERTY_INDEXING,
  AiFolderDto.JSON_PROPERTY_DENY_DOWNLOAD,
  AiFolderDto.JSON_PROPERTY_LIFETIME,
  AiFolderDto.JSON_PROPERTY_WATERMARK,
  AiFolderDto.JSON_PROPERTY_TYPE,
  AiFolderDto.JSON_PROPERTY_IN_ROOM,
  AiFolderDto.JSON_PROPERTY_QUOTA_LIMIT,
  AiFolderDto.JSON_PROPERTY_IS_CUSTOM_QUOTA,
  AiFolderDto.JSON_PROPERTY_USED_SPACE,
  AiFolderDto.JSON_PROPERTY_PASSWORD_PROTECTED,
  AiFolderDto.JSON_PROPERTY_EXPIRED,
  AiFolderDto.JSON_PROPERTY_CHAT_SETTINGS,
  AiFolderDto.JSON_PROPERTY_ROOT_ROOM_TYPE,
  AiFolderDto.JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X,
  AiFolderDto.JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B,
  AiFolderDto.JSON_PROPERTY_ORIGINAL_FORM_ID
})

public class AiFolderDto {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable  private AiFileShare access;

  public static final String JSON_PROPERTY_SHARED_BY = "sharedBy";
  @javax.annotation.Nullable  private AiEmployeeDto sharedBy;

  public static final String JSON_PROPERTY_OWNED_BY = "ownedBy";
  @javax.annotation.Nullable  private AiEmployeeDto ownedBy;

  public static final String JSON_PROPERTY_SHARED = "shared";
  @javax.annotation.Nullable  private Boolean shared;

  public static final String JSON_PROPERTY_SHARED_FOR_USER = "sharedForUser";
  @javax.annotation.Nullable  private Boolean sharedForUser;

  public static final String JSON_PROPERTY_SHARED_EXTERNAL = "sharedExternal";
  @javax.annotation.Nullable  private Boolean sharedExternal;

  public static final String JSON_PROPERTY_PARENT_SHARED = "parentShared";
  @javax.annotation.Nullable  private Boolean parentShared;

  public static final String JSON_PROPERTY_SHORT_WEB_URL = "shortWebUrl";
  @javax.annotation.Nullable  private URI shortWebUrl;

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable  private AiApiDateTime created;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable  private AiEmployeeDto createdBy;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  @javax.annotation.Nullable  private AiApiDateTime updated;

  public static final String JSON_PROPERTY_AUTO_DELETE = "autoDelete";
  @javax.annotation.Nullable  private AiApiDateTime autoDelete;

  public static final String JSON_PROPERTY_ROOT_FOLDER_TYPE = "rootFolderType";
  @javax.annotation.Nullable  private AiFolderType rootFolderType;

  public static final String JSON_PROPERTY_PARENT_ROOM_TYPE = "parentRoomType";
  @javax.annotation.Nullable  private AiFolderType parentRoomType;

  public static final String JSON_PROPERTY_UPDATED_BY = "updatedBy";
  @javax.annotation.Nullable  private AiEmployeeDto updatedBy;

  public static final String JSON_PROPERTY_PROVIDER_ITEM = "providerItem";
  @javax.annotation.Nullable  private Boolean providerItem;

  public static final String JSON_PROPERTY_PROVIDER_KEY = "providerKey";
  @javax.annotation.Nullable  private String providerKey;

  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  @javax.annotation.Nullable  private Integer providerId;

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nullable  private String order;

  public static final String JSON_PROPERTY_IS_FAVORITE = "isFavorite";
  @javax.annotation.Nullable  private Boolean isFavorite;

  public static final String JSON_PROPERTY_FILE_ENTRY_TYPE = "fileEntryType";
  @javax.annotation.Nullable  private AiFileEntryType fileEntryType;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_ROOT_FOLDER_ID = "rootFolderId";
  @javax.annotation.Nullable  private Integer rootFolderId;

  public static final String JSON_PROPERTY_ORIGIN_ID = "originId";
  @javax.annotation.Nullable  private Integer originId;

  public static final String JSON_PROPERTY_ORIGIN_ROOM_ID = "originRoomId";
  @javax.annotation.Nullable  private Integer originRoomId;

  public static final String JSON_PROPERTY_ORIGIN_TITLE = "originTitle";
  @javax.annotation.Nullable  private String originTitle;

  public static final String JSON_PROPERTY_ORIGIN_ROOM_TITLE = "originRoomTitle";
  @javax.annotation.Nullable  private String originRoomTitle;

  public static final String JSON_PROPERTY_CAN_SHARE = "canShare";
  @javax.annotation.Nullable  private Boolean canShare;

  public static final String JSON_PROPERTY_SHARE_SETTINGS = "shareSettings";
  @javax.annotation.Nullable  private JsonNullable<AiFileEntryDtoAllOfShareSettings> shareSettings = JsonNullable.<AiFileEntryDtoAllOfShareSettings>undefined();

  public static final String JSON_PROPERTY_SECURITY = "security";
  @javax.annotation.Nullable  private JsonNullable<AiFileEntryDtoAllOfSecurity> security = JsonNullable.<AiFileEntryDtoAllOfSecurity>undefined();

  public static final String JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS = "availableShareRights";
  @javax.annotation.Nullable  private JsonNullable<AiFileEntryDtoAllOfAvailableShareRights> availableShareRights = JsonNullable.<AiFileEntryDtoAllOfAvailableShareRights>undefined();

  public static final String JSON_PROPERTY_REQUEST_TOKEN = "requestToken";
  @javax.annotation.Nullable  private String requestToken;

  public static final String JSON_PROPERTY_EXTERNAL = "external";
  @javax.annotation.Nullable  private Boolean external;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  @javax.annotation.Nullable  private AiApiDateTime expirationDate;

  public static final String JSON_PROPERTY_IS_LINK_EXPIRED = "isLinkExpired";
  @javax.annotation.Nullable  private Boolean isLinkExpired;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  @javax.annotation.Nullable  private Integer parentId;

  public static final String JSON_PROPERTY_FILES_COUNT = "filesCount";
  @javax.annotation.Nullable  private Integer filesCount;

  public static final String JSON_PROPERTY_FOLDERS_COUNT = "foldersCount";
  @javax.annotation.Nullable  private Integer foldersCount;

  public static final String JSON_PROPERTY_IS_SHAREABLE = "isShareable";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isShareable = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_NEW = "new";
  @javax.annotation.Nullable  private Integer _new;

  public static final String JSON_PROPERTY_MUTE = "mute";
  @javax.annotation.Nullable  private Boolean mute;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable  private AiLogo logo;

  public static final String JSON_PROPERTY_PINNED = "pinned";
  @javax.annotation.Nullable  private Boolean pinned;

  public static final String JSON_PROPERTY_ROOM_TYPE = "roomType";
  @javax.annotation.Nullable  private AiRoomType roomType;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  @javax.annotation.Nullable  private Boolean _private;

  public static final String JSON_PROPERTY_INDEXING = "indexing";
  @javax.annotation.Nullable  private Boolean indexing;

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable  private Boolean denyDownload;

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  @javax.annotation.Nullable  private AiRoomDataLifetimeDto lifetime;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  @javax.annotation.Nullable  private AiWatermarkDto watermark;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private AiFolderType type;

  public static final String JSON_PROPERTY_IN_ROOM = "inRoom";
  @javax.annotation.Nullable  private JsonNullable<Boolean> inRoom = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_QUOTA_LIMIT = "quotaLimit";
  @javax.annotation.Nullable  private JsonNullable<Long> quotaLimit = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_IS_CUSTOM_QUOTA = "isCustomQuota";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isCustomQuota = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_USED_SPACE = "usedSpace";
  @javax.annotation.Nullable  private JsonNullable<Long> usedSpace = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PASSWORD_PROTECTED = "passwordProtected";
  @javax.annotation.Nullable  private JsonNullable<Boolean> passwordProtected = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  @javax.annotation.Nullable  private JsonNullable<Boolean> expired = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CHAT_SETTINGS = "chatSettings";
  @javax.annotation.Nullable  private AiChatSettingsDto chatSettings;

  public static final String JSON_PROPERTY_ROOT_ROOM_TYPE = "rootRoomType";
  @javax.annotation.Nullable  private AiRoomType rootRoomType;

  public static final String JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X = "saveFormAsXLSX";
  @javax.annotation.Nullable  private JsonNullable<Boolean> saveFormAsXLSX = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B = "sendFormToExternalDB";
  @javax.annotation.Nullable  private JsonNullable<Boolean> sendFormToExternalDB = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ORIGINAL_FORM_ID = "originalFormId";
  @javax.annotation.Nullable  private JsonNullable<Integer> originalFormId = JsonNullable.<Integer>undefined();

  public AiFolderDto() {
  }


  public AiFolderDto title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The name shown for the entry. For a file it carries the extension, which is how the format is recognised, and  for a room it is the room name.
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public AiFolderDto access(@javax.annotation.Nullable AiFileShare access) {
    
    this.access = access;
    return this;
  }

  /**
   * The level the calling account holds on this entry, resolved from its own rights, the groups it belongs to and  any link it came in through. It is the level itself, not what the account may do with it - the action flags  below answer that.
   * @return access
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiFileShare getAccess() {
    return access;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable AiFileShare access) {
    this.access = access;
  }

  public AiFolderDto sharedBy(@javax.annotation.Nullable AiEmployeeDto sharedBy) {
    
    this.sharedBy = sharedBy;
    return this;
  }

  /**
   * Who gave the calling account the access it is using. It is filled in only while the entry is being read  through a share, and never for a caller without an account.
   * @return sharedBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SHARED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiEmployeeDto getSharedBy() {
    return sharedBy;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedBy(@javax.annotation.Nullable AiEmployeeDto sharedBy) {
    this.sharedBy = sharedBy;
  }

  public AiFolderDto ownedBy(@javax.annotation.Nullable AiEmployeeDto ownedBy) {
    
    this.ownedBy = ownedBy;
    return this;
  }

  /**
   * Who owns the place the entry is shared from - the creator of the room it lies in, or of the personal section  that holds it. It is filled in only while the entry is being read through a share, and never for a caller  without an account.
   * @return ownedBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OWNED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiEmployeeDto getOwnedBy() {
    return ownedBy;
  }


  @JsonProperty(value = JSON_PROPERTY_OWNED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnedBy(@javax.annotation.Nullable AiEmployeeDto ownedBy) {
    this.ownedBy = ownedBy;
  }

  public AiFolderDto shared(@javax.annotation.Nullable Boolean shared) {
    
    this.shared = shared;
    return this;
  }

  /**
   * Whether at least one external link exists for the entry, whichever kind. It says nothing about accounts and  groups - those are counted by the flag for members below.
   * @return shared
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SHARED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShared() {
    return shared;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShared(@javax.annotation.Nullable Boolean shared) {
    this.shared = shared;
  }

  public AiFolderDto sharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    
    this.sharedForUser = sharedForUser;
    return this;
  }

  /**
   * Whether at least one account or group has been given rights on the entry directly, as opposed to reaching it  through a link or through the room around it.
   * @return sharedForUser
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SHARED_FOR_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSharedForUser() {
    return sharedForUser;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARED_FOR_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    this.sharedForUser = sharedForUser;
  }

  public AiFolderDto sharedExternal(@javax.annotation.Nullable Boolean sharedExternal) {
    
    this.sharedExternal = sharedExternal;
    return this;
  }

  /**
   * Whether one of the entry's links is open to people outside the portal, as opposed to a link that only its own  members can follow. This is the flag to watch when the concern is who can reach the content from outside.
   * @return sharedExternal
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SHARED_EXTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSharedExternal() {
    return sharedExternal;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARED_EXTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedExternal(@javax.annotation.Nullable Boolean sharedExternal) {
    this.sharedExternal = sharedExternal;
  }

  public AiFolderDto parentShared(@javax.annotation.Nullable Boolean parentShared) {
    
    this.parentShared = parentShared;
    return this;
  }

  /**
   * Whether the entry is reachable because the room or folder around it is shared, rather than through rights of  its own. A copy or a move takes the entry out of that scope.
   * @return parentShared
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PARENT_SHARED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getParentShared() {
    return parentShared;
  }


  @JsonProperty(value = JSON_PROPERTY_PARENT_SHARED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentShared(@javax.annotation.Nullable Boolean parentShared) {
    this.parentShared = parentShared;
  }

  public AiFolderDto shortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
    
    this.shortWebUrl = shortWebUrl;
    return this;
  }

  /**
   * A shortened address that opens the entry through the link it is being read with. It is an empty string  whenever no link applies, which is the usual case for a member browsing their own rooms.
   * @return shortWebUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SHORT_WEB_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getShortWebUrl() {
    return shortWebUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_SHORT_WEB_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
    this.shortWebUrl = shortWebUrl;
  }

  public AiFolderDto created(@javax.annotation.Nullable AiApiDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * When the entry was created, written with the offset of the portal's time zone. For a file restored from an  older version this is still the moment the file first appeared.
   * @return created
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiApiDateTime getCreated() {
    return created;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@javax.annotation.Nullable AiApiDateTime created) {
    this.created = created;
  }

  public AiFolderDto createdBy(@javax.annotation.Nullable AiEmployeeDto createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Who created the entry. It is null for a caller without an account, who is told nothing about the portal's  members.
   * @return createdBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiEmployeeDto getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(@javax.annotation.Nullable AiEmployeeDto createdBy) {
    this.createdBy = createdBy;
  }

  public AiFolderDto updated(@javax.annotation.Nullable AiApiDateTime updated) {
    
    this.updated = updated;
    return this;
  }

  /**
   * When the entry last changed, written with the offset of the portal's time zone. It is never reported as  earlier than the creation moment, so the two can be compared safely.
   * @return updated
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiApiDateTime getUpdated() {
    return updated;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(@javax.annotation.Nullable AiApiDateTime updated) {
    this.updated = updated;
  }

  public AiFolderDto autoDelete(@javax.annotation.Nullable AiApiDateTime autoDelete) {
    
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * When the entry will disappear on its own, written with the offset of the portal's time zone. It is filled in  only where a removal is actually scheduled - something in the trash while the portal cleans it up  automatically, or a guest's own documents - so a null means nothing is scheduled rather than that the entry is  permanent.
   * @return autoDelete
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AUTO_DELETE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiApiDateTime getAutoDelete() {
    return autoDelete;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTO_DELETE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoDelete(@javax.annotation.Nullable AiApiDateTime autoDelete) {
    this.autoDelete = autoDelete;
  }

  public AiFolderDto rootFolderType(@javax.annotation.Nullable AiFolderType rootFolderType) {
    
    this.rootFolderType = rootFolderType;
    return this;
  }

  /**
   * The section the entry ultimately belongs to, which is what tells a personal document from one inside a room,  from a template and from something in the trash or the archive.
   * @return rootFolderType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiFolderType getRootFolderType() {
    return rootFolderType;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootFolderType(@javax.annotation.Nullable AiFolderType rootFolderType) {
    this.rootFolderType = rootFolderType;
  }

  public AiFolderDto parentRoomType(@javax.annotation.Nullable AiFolderType parentRoomType) {
    
    this.parentRoomType = parentRoomType;
    return this;
  }

  /**
   * The kind of room the entry lies in, which decides what the room allows - filling forms, public links,  indexing. It is null for an entry that is not inside a room at all.
   * @return parentRoomType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PARENT_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiFolderType getParentRoomType() {
    return parentRoomType;
  }


  @JsonProperty(value = JSON_PROPERTY_PARENT_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentRoomType(@javax.annotation.Nullable AiFolderType parentRoomType) {
    this.parentRoomType = parentRoomType;
  }

  public AiFolderDto updatedBy(@javax.annotation.Nullable AiEmployeeDto updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Who changed the entry last. It is null for a caller without an account.
   * @return updatedBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UPDATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiEmployeeDto getUpdatedBy() {
    return updatedBy;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedBy(@javax.annotation.Nullable AiEmployeeDto updatedBy) {
    this.updatedBy = updatedBy;
  }

  public AiFolderDto providerItem(@javax.annotation.Nullable Boolean providerItem) {
    
    this.providerItem = providerItem;
    return this;
  }

  /**
   * Set when the entry is stored on a connected third-party account rather than on the portal, and null when it is  stored on the portal. Such an entry is identified by a string rather than a number, and some operations skip  it.
   * @return providerItem
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ITEM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProviderItem() {
    return providerItem;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ITEM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderItem(@javax.annotation.Nullable Boolean providerItem) {
    this.providerItem = providerItem;
  }

  public AiFolderDto providerKey(@javax.annotation.Nullable String providerKey) {
    
    this.providerKey = providerKey;
    return this;
  }

  /**
   * Which third-party service holds the entry, matching the keys accepted by the third-party operations. It is  null for an entry stored on the portal.
   * @return providerKey
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderKey() {
    return providerKey;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderKey(@javax.annotation.Nullable String providerKey) {
    this.providerKey = providerKey;
  }

  public AiFolderDto providerId(@javax.annotation.Nullable Integer providerId) {
    
    this.providerId = providerId;
    return this;
  }

  /**
   * The connected account the entry comes from, for telling apart two connections to the same service. It is null  for an entry stored on the portal.
   * @return providerId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProviderId() {
    return providerId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderId(@javax.annotation.Nullable Integer providerId) {
    this.providerId = providerId;
  }

  public AiFolderDto order(@javax.annotation.Nullable String order) {
    
    this.order = order;
    return this;
  }

  /**
   * The place of the entry in a room where the members arrange the content themselves, given as the position of  the entry preceded by the positions of the folders leading to it, separated by dots. It is empty when nothing  has been arranged.
   * @return order
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrder() {
    return order;
  }


  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(@javax.annotation.Nullable String order) {
    this.order = order;
  }

  public AiFolderDto isFavorite(@javax.annotation.Nullable Boolean isFavorite) {
    
    this.isFavorite = isFavorite;
    return this;
  }

  /**
   * Set when the calling account has marked the entry as a favorite, which is what puts it into the favorites  listing. For a file that is not marked it is null rather than false.
   * @return isFavorite
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_FAVORITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFavorite() {
    return isFavorite;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_FAVORITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFavorite(@javax.annotation.Nullable Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public AiFolderDto fileEntryType(@javax.annotation.Nullable AiFileEntryType fileEntryType) {
    
    this.fileEntryType = fileEntryType;
    return this;
  }

  /**
   * Tells a folder from a file, and so which of the two shapes the rest of the object has. A room is reported as a  folder here.
   * @return fileEntryType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_ENTRY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiFileEntryType getFileEntryType() {
    return fileEntryType;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_ENTRY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileEntryType(@javax.annotation.Nullable AiFileEntryType fileEntryType) {
    this.fileEntryType = fileEntryType;
  }

  public AiFolderDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The identifier to pass back to the other operations of this entry. It is a number for storage on the portal  and a string for a connected third-party account, and it is unique only within its own kind, so files and  folders may carry the same value.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public AiFolderDto rootFolderId(@javax.annotation.Nullable Integer rootFolderId) {
    
    this.rootFolderId = rootFolderId;
    return this;
  }

  /**
   * The section the entry ultimately lies in, as an identifier that can be listed like any other folder. For an  entry inside a room this is the rooms section, not the room.
   * @return rootFolderId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRootFolderId() {
    return rootFolderId;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootFolderId(@javax.annotation.Nullable Integer rootFolderId) {
    this.rootFolderId = rootFolderId;
  }

  public AiFolderDto originId(@javax.annotation.Nullable Integer originId) {
    
    this.originId = originId;
    return this;
  }

  /**
   * The folder the entry was deleted from, which is where restoring it puts it back. It is left out of the answer  unless the entry is in the trash.
   * @return originId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOriginId() {
    return originId;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginId(@javax.annotation.Nullable Integer originId) {
    this.originId = originId;
  }

  public AiFolderDto originRoomId(@javax.annotation.Nullable Integer originRoomId) {
    
    this.originRoomId = originRoomId;
    return this;
  }

  /**
   * The room the entry was deleted from, left out of the answer for anything that was not deleted out of a room.
   * @return originRoomId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ROOM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOriginRoomId() {
    return originRoomId;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ROOM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginRoomId(@javax.annotation.Nullable Integer originRoomId) {
    this.originRoomId = originRoomId;
  }

  public AiFolderDto originTitle(@javax.annotation.Nullable String originTitle) {
    
    this.originTitle = originTitle;
    return this;
  }

  /**
   * The name of the folder the entry was deleted from, for showing where it would be restored to. It is null for  an entry that is not in the trash.
   * @return originTitle
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORIGIN_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginTitle() {
    return originTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGIN_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginTitle(@javax.annotation.Nullable String originTitle) {
    this.originTitle = originTitle;
  }

  public AiFolderDto originRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
    
    this.originRoomTitle = originRoomTitle;
    return this;
  }

  /**
   * The name of the room the entry was deleted from, null for anything that was not deleted out of a room.
   * @return originRoomTitle
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ROOM_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginRoomTitle() {
    return originRoomTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ROOM_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
    this.originRoomTitle = originRoomTitle;
  }

  public AiFolderDto canShare(@javax.annotation.Nullable Boolean canShare) {
    
    this.canShare = canShare;
    return this;
  }

  /**
   * Whether the calling account may change who has access to the entry, and so whether offering a sharing dialog  for it makes sense. It is false in rooms whose access is fixed by the room itself, such as a private one, even  for its manager.
   * @return canShare
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CAN_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanShare() {
    return canShare;
  }


  @JsonProperty(value = JSON_PROPERTY_CAN_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanShare(@javax.annotation.Nullable Boolean canShare) {
    this.canShare = canShare;
  }

  public AiFolderDto shareSettings(@javax.annotation.Nullable AiFileEntryDtoAllOfShareSettings shareSettings) {
    this.shareSettings = JsonNullable.<AiFileEntryDtoAllOfShareSettings>of(shareSettings);
    
    return this;
  }

  /**
   * Get shareSettings
   * @return shareSettings
   */
  @javax.annotation.Nullable  @JsonIgnore

  public AiFileEntryDtoAllOfShareSettings getShareSettings() {
        return shareSettings.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SHARE_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AiFileEntryDtoAllOfShareSettings> getShareSettings_JsonNullable() {
    return shareSettings;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARE_SETTINGS)
  public void setShareSettings_JsonNullable(JsonNullable<AiFileEntryDtoAllOfShareSettings> shareSettings) {
    this.shareSettings = shareSettings;
  }

  public void setShareSettings(@javax.annotation.Nullable AiFileEntryDtoAllOfShareSettings shareSettings) {
    this.shareSettings = JsonNullable.<AiFileEntryDtoAllOfShareSettings>of(shareSettings);
  }

  public AiFolderDto security(@javax.annotation.Nullable AiFileEntryDtoAllOfSecurity security) {
    this.security = JsonNullable.<AiFileEntryDtoAllOfSecurity>of(security);
    
    return this;
  }

  /**
   * Get security
   * @return security
   */
  @javax.annotation.Nullable  @JsonIgnore

  public AiFileEntryDtoAllOfSecurity getSecurity() {
        return security.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SECURITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AiFileEntryDtoAllOfSecurity> getSecurity_JsonNullable() {
    return security;
  }
  
  @JsonProperty(JSON_PROPERTY_SECURITY)
  public void setSecurity_JsonNullable(JsonNullable<AiFileEntryDtoAllOfSecurity> security) {
    this.security = security;
  }

  public void setSecurity(@javax.annotation.Nullable AiFileEntryDtoAllOfSecurity security) {
    this.security = JsonNullable.<AiFileEntryDtoAllOfSecurity>of(security);
  }

  public AiFolderDto availableShareRights(@javax.annotation.Nullable AiFileEntryDtoAllOfAvailableShareRights availableShareRights) {
    this.availableShareRights = JsonNullable.<AiFileEntryDtoAllOfAvailableShareRights>of(availableShareRights);
    
    return this;
  }

  /**
   * Get availableShareRights
   * @return availableShareRights
   */
  @javax.annotation.Nullable  @JsonIgnore

  public AiFileEntryDtoAllOfAvailableShareRights getAvailableShareRights() {
        return availableShareRights.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AiFileEntryDtoAllOfAvailableShareRights> getAvailableShareRights_JsonNullable() {
    return availableShareRights;
  }
  
  @JsonProperty(JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS)
  public void setAvailableShareRights_JsonNullable(JsonNullable<AiFileEntryDtoAllOfAvailableShareRights> availableShareRights) {
    this.availableShareRights = availableShareRights;
  }

  public void setAvailableShareRights(@javax.annotation.Nullable AiFileEntryDtoAllOfAvailableShareRights availableShareRights) {
    this.availableShareRights = JsonNullable.<AiFileEntryDtoAllOfAvailableShareRights>of(availableShareRights);
  }

  public AiFolderDto requestToken(@javax.annotation.Nullable String requestToken) {
    
    this.requestToken = requestToken;
    return this;
  }

  /**
   * The token of the link the entry is being read through, which is the value the external-share operations expect  and which also has to be carried by the download and preview addresses. It is null whenever the entry is not  being read through a link.
   * @return requestToken
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REQUEST_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestToken() {
    return requestToken;
  }


  @JsonProperty(value = JSON_PROPERTY_REQUEST_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestToken(@javax.annotation.Nullable String requestToken) {
    this.requestToken = requestToken;
  }

  public AiFolderDto external(@javax.annotation.Nullable Boolean external) {
    
    this.external = external;
    return this;
  }

  /**
   * Set when the link being used was made for this very entry, and false when the entry is reached through a link  to the room around it. It is null when no link is involved.
   * @return external
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternal() {
    return external;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternal(@javax.annotation.Nullable Boolean external) {
    this.external = external;
  }

  public AiFolderDto expirationDate(@javax.annotation.Nullable AiApiDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * When the link being used stops working, written with the offset of the portal's time zone. It is null for a  link that never expires and whenever no link is involved.
   * @return expirationDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiApiDateTime getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(@javax.annotation.Nullable AiApiDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public AiFolderDto isLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
    
    this.isLinkExpired = isLinkExpired;
    return this;
  }

  /**
   * Set when the link being used has already passed its expiration date, which is why the entry cannot be opened  even though it is described here. It is null when no link is involved.
   * @return isLinkExpired
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_LINK_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLinkExpired() {
    return isLinkExpired;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_LINK_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
    this.isLinkExpired = isLinkExpired;
  }

  public AiFolderDto parentId(@javax.annotation.Nullable Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

  /**
   * The folder this one is listed in. For a room it is the root of the section the room lives in, and for an entry  opened through a sharing link whose real parent the caller may not read it is the root of the section with the  entries shared with them.
   * @return parentId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PARENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParentId() {
    return parentId;
  }


  @JsonProperty(value = JSON_PROPERTY_PARENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(@javax.annotation.Nullable Integer parentId) {
    this.parentId = parentId;
  }

  public AiFolderDto filesCount(@javax.annotation.Nullable Integer filesCount) {
    
    this.filesCount = filesCount;
    return this;
  }

  /**
   * How many files lie directly in the folder, without counting the subfolders. The roots of the `Rooms`, room  templates and default templates sections always report 0, because the number is not collected for them.
   * @return filesCount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFilesCount() {
    return filesCount;
  }


  @JsonProperty(value = JSON_PROPERTY_FILES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilesCount(@javax.annotation.Nullable Integer filesCount) {
    this.filesCount = filesCount;
  }

  public AiFolderDto foldersCount(@javax.annotation.Nullable Integer foldersCount) {
    
    this.foldersCount = foldersCount;
    return this;
  }

  /**
   * How many subfolders lie directly in the folder. For an AI room the two service subfolders it always holds are  subtracted, so the number matches what a listing of it shows, and the roots of the `Rooms` and templates  sections report 0.
   * @return foldersCount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FOLDERS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFoldersCount() {
    return foldersCount;
  }


  @JsonProperty(value = JSON_PROPERTY_FOLDERS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFoldersCount(@javax.annotation.Nullable Integer foldersCount) {
    this.foldersCount = foldersCount;
  }

  public AiFolderDto isShareable(@javax.annotation.Nullable Boolean isShareable) {
    this.isShareable = JsonNullable.<Boolean>of(isShareable);
    
    return this;
  }

  /**
   * Whether the caller may hand out access to the folder. It is filled in only for the folder a folder-contents  answer is about, and is null in every other answer, so null says nothing about the sharing rights.
   * @return isShareable
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsShareable() {
        return isShareable.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_SHAREABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsShareable_JsonNullable() {
    return isShareable;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_SHAREABLE)
  public void setIsShareable_JsonNullable(JsonNullable<Boolean> isShareable) {
    this.isShareable = isShareable;
  }

  public void setIsShareable(@javax.annotation.Nullable Boolean isShareable) {
    this.isShareable = JsonNullable.<Boolean>of(isShareable);
  }

  public AiFolderDto _new(@javax.annotation.Nullable Integer _new) {
    
    this._new = _new;
    return this;
  }

  /**
   * How many entries inside the folder the caller has not opened yet, the number drawn as the badge on it. An  account that turned the badges off in its own settings always reads 0 here, so 0 alone does not prove that  everything has been seen.
   * @return _new
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNew() {
    return _new;
  }


  @JsonProperty(value = JSON_PROPERTY_NEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNew(@javax.annotation.Nullable Integer _new) {
    this._new = _new;
  }

  public AiFolderDto mute(@javax.annotation.Nullable Boolean mute) {
    
    this.mute = mute;
    return this;
  }

  /**
   * Whether the caller silenced the notifications of this room: true means no message about its activity reaches  them. The choice belongs to the reading account rather than to the room, so two members of one room read  different values.
   * @return mute
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMute() {
    return mute;
  }


  @JsonProperty(value = JSON_PROPERTY_MUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMute(@javax.annotation.Nullable Boolean mute) {
    this.mute = mute;
  }

  public AiFolderDto tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public AiFolderDto addTagsItem(String tagsItem) {
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
   * The names of the tags attached to the room. Empty for a folder that is not a room, since only rooms carry  tags, and the names are the ones from the portal tag catalogue.
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

  public AiFolderDto logo(@javax.annotation.Nullable AiLogo logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * The addresses of the room logo in four sizes, together with the colour and the built-in cover that are drawn  when no logo was uploaded. A room without a logo answers with four empty addresses rather than with null, and  the field is null for a folder that is not a room.
   * @return logo
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiLogo getLogo() {
    return logo;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable AiLogo logo) {
    this.logo = logo;
  }

  public AiFolderDto pinned(@javax.annotation.Nullable Boolean pinned) {
    
    this.pinned = pinned;
    return this;
  }

  /**
   * Whether the caller pinned the room to the top of their own room list. Pinning is personal and is lost when the  room is archived.
   * @return pinned
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PINNED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPinned() {
    return pinned;
  }


  @JsonProperty(value = JSON_PROPERTY_PINNED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinned(@javax.annotation.Nullable Boolean pinned) {
    this.pinned = pinned;
  }

  public AiFolderDto roomType(@javax.annotation.Nullable AiRoomType roomType) {
    
    this.roomType = roomType;
    return this;
  }

  /**
   * The kind of the room, which decides the default access rules of its members. Null for a folder that is not a  room.
   * @return roomType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiRoomType getRoomType() {
    return roomType;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomType(@javax.annotation.Nullable AiRoomType roomType) {
    this.roomType = roomType;
  }

  public AiFolderDto _private(@javax.annotation.Nullable Boolean _private) {
    
    this._private = _private;
    return this;
  }

  /**
   * Whether the room is a private one, which limits it to the accounts invited into it and needs encryption keys  set up for each of them.
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

  public AiFolderDto indexing(@javax.annotation.Nullable Boolean indexing) {
    
    this.indexing = indexing;
    return this;
  }

  /**
   * Whether the contents of the room are kept in an explicit numbered order, the one reported as `order` on each  entry, instead of being left to the sorting the reader asks for.
   * @return indexing
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INDEXING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIndexing() {
    return indexing;
  }


  @JsonProperty(value = JSON_PROPERTY_INDEXING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexing(@javax.annotation.Nullable Boolean indexing) {
    this.indexing = indexing;
  }

  public AiFolderDto denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    
    this.denyDownload = denyDownload;
    return this;
  }

  /**
   * Whether downloading and printing the contents of the room is forbidden, which leaves its members with viewing  and editing in the editor.
   * @return denyDownload
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDenyDownload() {
    return denyDownload;
  }


  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDenyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = denyDownload;
  }

  public AiFolderDto lifetime(@javax.annotation.Nullable AiRoomDataLifetimeDto lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

  /**
   * The rule by which the files of the room are removed once they grow old. Null when the room has no such rule,  which is also what is reported after the rule is switched off, because switching it off erases it.
   * @return lifetime
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiRoomDataLifetimeDto getLifetime() {
    return lifetime;
  }


  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifetime(@javax.annotation.Nullable AiRoomDataLifetimeDto lifetime) {
    this.lifetime = lifetime;
  }

  public AiFolderDto watermark(@javax.annotation.Nullable AiWatermarkDto watermark) {
    
    this.watermark = watermark;
    return this;
  }

  /**
   * The watermark stamped over the documents of the room while they are viewed and printed. Null when the room has  no watermark, and for every folder that is not a room.
   * @return watermark
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiWatermarkDto getWatermark() {
    return watermark;
  }


  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermark(@javax.annotation.Nullable AiWatermarkDto watermark) {
    this.watermark = watermark;
  }

  public AiFolderDto type(@javax.annotation.Nullable AiFolderType type) {
    
    this.type = type;
    return this;
  }

  /**
   * The part the folder plays inside its room: one of the service folders of the form-filling flow, or the  knowledge and result storages of an AI room. It stays null for an ordinary folder and for the room itself, so  it does not describe folders in general.
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiFolderType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable AiFolderType type) {
    this.type = type;
  }

  public AiFolderDto inRoom(@javax.annotation.Nullable Boolean inRoom) {
    this.inRoom = JsonNullable.<Boolean>of(inRoom);
    
    return this;
  }

  /**
   * Whether the caller holds the room through an invitation of their own: true for the account that created it and  for a member invited personally, false when the access comes from a group they belong to, and null for a  folder that is not a room.
   * @return inRoom
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getInRoom() {
        return inRoom.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IN_ROOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getInRoom_JsonNullable() {
    return inRoom;
  }
  
  @JsonProperty(JSON_PROPERTY_IN_ROOM)
  public void setInRoom_JsonNullable(JsonNullable<Boolean> inRoom) {
    this.inRoom = inRoom;
  }

  public void setInRoom(@javax.annotation.Nullable Boolean inRoom) {
    this.inRoom = JsonNullable.<Boolean>of(inRoom);
  }

  public AiFolderDto quotaLimit(@javax.annotation.Nullable Long quotaLimit) {
    this.quotaLimit = JsonNullable.<Long>of(quotaLimit);
    
    return this;
  }

  /**
   * How much space the files of the room may take, in bytes. It is the limit set on this room, or the portal  default for rooms when none was set. Null when the tariff of the portal does not count room statistics, when  room quotas are switched off, when the room lies in the archive or the trash, or when the caller may only read  it.
   * @return quotaLimit
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Long getQuotaLimit() {
        return quotaLimit.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_QUOTA_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getQuotaLimit_JsonNullable() {
    return quotaLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTA_LIMIT)
  public void setQuotaLimit_JsonNullable(JsonNullable<Long> quotaLimit) {
    this.quotaLimit = quotaLimit;
  }

  public void setQuotaLimit(@javax.annotation.Nullable Long quotaLimit) {
    this.quotaLimit = JsonNullable.<Long>of(quotaLimit);
  }

  public AiFolderDto isCustomQuota(@javax.annotation.Nullable Boolean isCustomQuota) {
    this.isCustomQuota = JsonNullable.<Boolean>of(isCustomQuota);
    
    return this;
  }

  /**
   * Whether `quotaLimit` is a limit set on this room (true) or the portal default for rooms (false). Null exactly  when `quotaLimit` is null.
   * @return isCustomQuota
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsCustomQuota() {
        return isCustomQuota.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_CUSTOM_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsCustomQuota_JsonNullable() {
    return isCustomQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_CUSTOM_QUOTA)
  public void setIsCustomQuota_JsonNullable(JsonNullable<Boolean> isCustomQuota) {
    this.isCustomQuota = isCustomQuota;
  }

  public void setIsCustomQuota(@javax.annotation.Nullable Boolean isCustomQuota) {
    this.isCustomQuota = JsonNullable.<Boolean>of(isCustomQuota);
  }

  public AiFolderDto usedSpace(@javax.annotation.Nullable Long usedSpace) {
    this.usedSpace = JsonNullable.<Long>of(usedSpace);
    
    return this;
  }

  /**
   * How much the files of the room take, in bytes, as of the last time the counter was recomputed. The counter is  refreshed when a file operation finishes, so a read right after an upload or a deletion can still report the  previous figure. Null for a folder that is not a room.
   * @return usedSpace
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Long getUsedSpace() {
        return usedSpace.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USED_SPACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getUsedSpace_JsonNullable() {
    return usedSpace;
  }
  
  @JsonProperty(JSON_PROPERTY_USED_SPACE)
  public void setUsedSpace_JsonNullable(JsonNullable<Long> usedSpace) {
    this.usedSpace = usedSpace;
  }

  public void setUsedSpace(@javax.annotation.Nullable Long usedSpace) {
    this.usedSpace = JsonNullable.<Long>of(usedSpace);
  }

  public AiFolderDto passwordProtected(@javax.annotation.Nullable Boolean passwordProtected) {
    this.passwordProtected = JsonNullable.<Boolean>of(passwordProtected);
    
    return this;
  }

  /**
   * Whether the sharing link the folder was opened through asks for a password that has not been entered yet.  While it is true the contents stay unreadable; send the password to `POST api/2.0/files/share/{key}/password`  first. Null when the folder was not reached through a link.
   * @return passwordProtected
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getPasswordProtected() {
        return passwordProtected.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PASSWORD_PROTECTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getPasswordProtected_JsonNullable() {
    return passwordProtected;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD_PROTECTED)
  public void setPasswordProtected_JsonNullable(JsonNullable<Boolean> passwordProtected) {
    this.passwordProtected = passwordProtected;
  }

  public void setPasswordProtected(@javax.annotation.Nullable Boolean passwordProtected) {
    this.passwordProtected = JsonNullable.<Boolean>of(passwordProtected);
  }

  public AiFolderDto expired(@javax.annotation.Nullable Boolean expired) {
    this.expired = JsonNullable.<Boolean>of(expired);
    
    return this;
  }

  /**
   * Deprecated, read `isLinkExpired` instead: whether the sharing link the folder was opened through has run out  of its lifetime.
   * @return expired
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getExpired() {
        return expired.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getExpired_JsonNullable() {
    return expired;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRED)
  public void setExpired_JsonNullable(JsonNullable<Boolean> expired) {
    this.expired = expired;
  }

  public void setExpired(@javax.annotation.Nullable Boolean expired) {
    this.expired = JsonNullable.<Boolean>of(expired);
  }

  public AiFolderDto chatSettings(@javax.annotation.Nullable AiChatSettingsDto chatSettings) {
    
    this.chatSettings = chatSettings;
    return this;
  }

  /**
   * The chat configuration of an AI room. Only the system prompt is reported here, whatever else the room stores,  and the field is null for every folder that is not an AI room.
   * @return chatSettings
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CHAT_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiChatSettingsDto getChatSettings() {
    return chatSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAT_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChatSettings(@javax.annotation.Nullable AiChatSettingsDto chatSettings) {
    this.chatSettings = chatSettings;
  }

  public AiFolderDto rootRoomType(@javax.annotation.Nullable AiRoomType rootRoomType) {
    
    this.rootRoomType = rootRoomType;
    return this;
  }

  /**
   * The kind of the room the folder lies in. It is filled in only for the folder a folder-contents answer is  about, and only when that room is an AI room, so it is null in every other answer and for every other room  kind.
   * @return rootRoomType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOT_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiRoomType getRootRoomType() {
    return rootRoomType;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootRoomType(@javax.annotation.Nullable AiRoomType rootRoomType) {
    this.rootRoomType = rootRoomType;
  }

  public AiFolderDto saveFormAsXLSX(@javax.annotation.Nullable Boolean saveFormAsXLSX) {
    this.saveFormAsXLSX = JsonNullable.<Boolean>of(saveFormAsXLSX);
    
    return this;
  }

  /**
   * Whether the answers collected in this form-filling room are also gathered into a spreadsheet next to the  completed copies. Filled in for form-filling rooms only.
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

  public AiFolderDto sendFormToExternalDB(@javax.annotation.Nullable Boolean sendFormToExternalDB) {
    this.sendFormToExternalDB = JsonNullable.<Boolean>of(sendFormToExternalDB);
    
    return this;
  }

  /**
   * Whether the answers collected in this form-filling room are also pushed into the external database configured  for the portal. Filled in for form-filling rooms only.
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

  public AiFolderDto originalFormId(@javax.annotation.Nullable Integer originalFormId) {
    this.originalFormId = JsonNullable.<Integer>of(originalFormId);
    
    return this;
  }

  /**
   * The form the completed copies in this folder were filled from, taken from the copy submitted last. Null while  the folder holds no completed copy, and for every folder that does not collect them.
   * @return originalFormId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getOriginalFormId() {
        return originalFormId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORIGINAL_FORM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getOriginalFormId_JsonNullable() {
    return originalFormId;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINAL_FORM_ID)
  public void setOriginalFormId_JsonNullable(JsonNullable<Integer> originalFormId) {
    this.originalFormId = originalFormId;
  }

  public void setOriginalFormId(@javax.annotation.Nullable Integer originalFormId) {
    this.originalFormId = JsonNullable.<Integer>of(originalFormId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiFolderDto aiFolderDto = (AiFolderDto) o;
    return Objects.equals(this.title, aiFolderDto.title) &&
        Objects.equals(this.access, aiFolderDto.access) &&
        Objects.equals(this.sharedBy, aiFolderDto.sharedBy) &&
        Objects.equals(this.ownedBy, aiFolderDto.ownedBy) &&
        Objects.equals(this.shared, aiFolderDto.shared) &&
        Objects.equals(this.sharedForUser, aiFolderDto.sharedForUser) &&
        Objects.equals(this.sharedExternal, aiFolderDto.sharedExternal) &&
        Objects.equals(this.parentShared, aiFolderDto.parentShared) &&
        Objects.equals(this.shortWebUrl, aiFolderDto.shortWebUrl) &&
        Objects.equals(this.created, aiFolderDto.created) &&
        Objects.equals(this.createdBy, aiFolderDto.createdBy) &&
        Objects.equals(this.updated, aiFolderDto.updated) &&
        Objects.equals(this.autoDelete, aiFolderDto.autoDelete) &&
        Objects.equals(this.rootFolderType, aiFolderDto.rootFolderType) &&
        Objects.equals(this.parentRoomType, aiFolderDto.parentRoomType) &&
        Objects.equals(this.updatedBy, aiFolderDto.updatedBy) &&
        Objects.equals(this.providerItem, aiFolderDto.providerItem) &&
        Objects.equals(this.providerKey, aiFolderDto.providerKey) &&
        Objects.equals(this.providerId, aiFolderDto.providerId) &&
        Objects.equals(this.order, aiFolderDto.order) &&
        Objects.equals(this.isFavorite, aiFolderDto.isFavorite) &&
        Objects.equals(this.fileEntryType, aiFolderDto.fileEntryType) &&
        Objects.equals(this.id, aiFolderDto.id) &&
        Objects.equals(this.rootFolderId, aiFolderDto.rootFolderId) &&
        Objects.equals(this.originId, aiFolderDto.originId) &&
        Objects.equals(this.originRoomId, aiFolderDto.originRoomId) &&
        Objects.equals(this.originTitle, aiFolderDto.originTitle) &&
        Objects.equals(this.originRoomTitle, aiFolderDto.originRoomTitle) &&
        Objects.equals(this.canShare, aiFolderDto.canShare) &&
        equalsNullable(this.shareSettings, aiFolderDto.shareSettings) &&
        equalsNullable(this.security, aiFolderDto.security) &&
        equalsNullable(this.availableShareRights, aiFolderDto.availableShareRights) &&
        Objects.equals(this.requestToken, aiFolderDto.requestToken) &&
        Objects.equals(this.external, aiFolderDto.external) &&
        Objects.equals(this.expirationDate, aiFolderDto.expirationDate) &&
        Objects.equals(this.isLinkExpired, aiFolderDto.isLinkExpired) &&
        Objects.equals(this.parentId, aiFolderDto.parentId) &&
        Objects.equals(this.filesCount, aiFolderDto.filesCount) &&
        Objects.equals(this.foldersCount, aiFolderDto.foldersCount) &&
        equalsNullable(this.isShareable, aiFolderDto.isShareable) &&
        Objects.equals(this._new, aiFolderDto._new) &&
        Objects.equals(this.mute, aiFolderDto.mute) &&
        equalsNullable(this.tags, aiFolderDto.tags) &&
        Objects.equals(this.logo, aiFolderDto.logo) &&
        Objects.equals(this.pinned, aiFolderDto.pinned) &&
        Objects.equals(this.roomType, aiFolderDto.roomType) &&
        Objects.equals(this._private, aiFolderDto._private) &&
        Objects.equals(this.indexing, aiFolderDto.indexing) &&
        Objects.equals(this.denyDownload, aiFolderDto.denyDownload) &&
        Objects.equals(this.lifetime, aiFolderDto.lifetime) &&
        Objects.equals(this.watermark, aiFolderDto.watermark) &&
        Objects.equals(this.type, aiFolderDto.type) &&
        equalsNullable(this.inRoom, aiFolderDto.inRoom) &&
        equalsNullable(this.quotaLimit, aiFolderDto.quotaLimit) &&
        equalsNullable(this.isCustomQuota, aiFolderDto.isCustomQuota) &&
        equalsNullable(this.usedSpace, aiFolderDto.usedSpace) &&
        equalsNullable(this.passwordProtected, aiFolderDto.passwordProtected) &&
        equalsNullable(this.expired, aiFolderDto.expired) &&
        Objects.equals(this.chatSettings, aiFolderDto.chatSettings) &&
        Objects.equals(this.rootRoomType, aiFolderDto.rootRoomType) &&
        equalsNullable(this.saveFormAsXLSX, aiFolderDto.saveFormAsXLSX) &&
        equalsNullable(this.sendFormToExternalDB, aiFolderDto.sendFormToExternalDB) &&
        equalsNullable(this.originalFormId, aiFolderDto.originalFormId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, access, sharedBy, ownedBy, shared, sharedForUser, sharedExternal, parentShared, shortWebUrl, created, createdBy, updated, autoDelete, rootFolderType, parentRoomType, updatedBy, providerItem, providerKey, providerId, order, isFavorite, fileEntryType, id, rootFolderId, originId, originRoomId, originTitle, originRoomTitle, canShare, hashCodeNullable(shareSettings), hashCodeNullable(security), hashCodeNullable(availableShareRights), requestToken, external, expirationDate, isLinkExpired, parentId, filesCount, foldersCount, hashCodeNullable(isShareable), _new, mute, hashCodeNullable(tags), logo, pinned, roomType, _private, indexing, denyDownload, lifetime, watermark, type, hashCodeNullable(inRoom), hashCodeNullable(quotaLimit), hashCodeNullable(isCustomQuota), hashCodeNullable(usedSpace), hashCodeNullable(passwordProtected), hashCodeNullable(expired), chatSettings, rootRoomType, hashCodeNullable(saveFormAsXLSX), hashCodeNullable(sendFormToExternalDB), hashCodeNullable(originalFormId));
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
    sb.append("class AiFolderDto {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedForUser: ").append(toIndentedString(sharedForUser)).append("\n");
    sb.append("    sharedExternal: ").append(toIndentedString(sharedExternal)).append("\n");
    sb.append("    parentShared: ").append(toIndentedString(parentShared)).append("\n");
    sb.append("    shortWebUrl: ").append(toIndentedString(shortWebUrl)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
    sb.append("    rootFolderType: ").append(toIndentedString(rootFolderType)).append("\n");
    sb.append("    parentRoomType: ").append(toIndentedString(parentRoomType)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    providerItem: ").append(toIndentedString(providerItem)).append("\n");
    sb.append("    providerKey: ").append(toIndentedString(providerKey)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    fileEntryType: ").append(toIndentedString(fileEntryType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rootFolderId: ").append(toIndentedString(rootFolderId)).append("\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
    sb.append("    originRoomId: ").append(toIndentedString(originRoomId)).append("\n");
    sb.append("    originTitle: ").append(toIndentedString(originTitle)).append("\n");
    sb.append("    originRoomTitle: ").append(toIndentedString(originRoomTitle)).append("\n");
    sb.append("    canShare: ").append(toIndentedString(canShare)).append("\n");
    sb.append("    shareSettings: ").append(toIndentedString(shareSettings)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    availableShareRights: ").append(toIndentedString(availableShareRights)).append("\n");
    sb.append("    requestToken: ").append(toIndentedString(requestToken)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    isLinkExpired: ").append(toIndentedString(isLinkExpired)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
    sb.append("    foldersCount: ").append(toIndentedString(foldersCount)).append("\n");
    sb.append("    isShareable: ").append(toIndentedString(isShareable)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    indexing: ").append(toIndentedString(indexing)).append("\n");
    sb.append("    denyDownload: ").append(toIndentedString(denyDownload)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inRoom: ").append(toIndentedString(inRoom)).append("\n");
    sb.append("    quotaLimit: ").append(toIndentedString(quotaLimit)).append("\n");
    sb.append("    isCustomQuota: ").append(toIndentedString(isCustomQuota)).append("\n");
    sb.append("    usedSpace: ").append(toIndentedString(usedSpace)).append("\n");
    sb.append("    passwordProtected: ").append(toIndentedString(passwordProtected)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    chatSettings: ").append(toIndentedString(chatSettings)).append("\n");
    sb.append("    rootRoomType: ").append(toIndentedString(rootRoomType)).append("\n");
    sb.append("    saveFormAsXLSX: ").append(toIndentedString(saveFormAsXLSX)).append("\n");
    sb.append("    sendFormToExternalDB: ").append(toIndentedString(sendFormToExternalDB)).append("\n");
    sb.append("    originalFormId: ").append(toIndentedString(originalFormId)).append("\n");
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

    // add `access` to the URL query string
    if (getAccess() != null) {
      try {
        joiner.add(String.format("%saccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sharedBy` to the URL query string
    if (getSharedBy() != null) {
      joiner.add(getSharedBy().toUrlQueryString(prefix + "sharedBy" + suffix));
    }

    // add `ownedBy` to the URL query string
    if (getOwnedBy() != null) {
      joiner.add(getOwnedBy().toUrlQueryString(prefix + "ownedBy" + suffix));
    }

    // add `shared` to the URL query string
    if (getShared() != null) {
      try {
        joiner.add(String.format("%sshared%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShared()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sharedForUser` to the URL query string
    if (getSharedForUser() != null) {
      try {
        joiner.add(String.format("%ssharedForUser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharedForUser()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sharedExternal` to the URL query string
    if (getSharedExternal() != null) {
      try {
        joiner.add(String.format("%ssharedExternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharedExternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `parentShared` to the URL query string
    if (getParentShared() != null) {
      try {
        joiner.add(String.format("%sparentShared%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParentShared()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shortWebUrl` to the URL query string
    if (getShortWebUrl() != null) {
      try {
        joiner.add(String.format("%sshortWebUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShortWebUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(getCreated().toUrlQueryString(prefix + "created" + suffix));
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      joiner.add(getCreatedBy().toUrlQueryString(prefix + "createdBy" + suffix));
    }

    // add `updated` to the URL query string
    if (getUpdated() != null) {
      joiner.add(getUpdated().toUrlQueryString(prefix + "updated" + suffix));
    }

    // add `autoDelete` to the URL query string
    if (getAutoDelete() != null) {
      joiner.add(getAutoDelete().toUrlQueryString(prefix + "autoDelete" + suffix));
    }

    // add `rootFolderType` to the URL query string
    if (getRootFolderType() != null) {
      try {
        joiner.add(String.format("%srootFolderType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRootFolderType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `parentRoomType` to the URL query string
    if (getParentRoomType() != null) {
      try {
        joiner.add(String.format("%sparentRoomType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParentRoomType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `updatedBy` to the URL query string
    if (getUpdatedBy() != null) {
      joiner.add(getUpdatedBy().toUrlQueryString(prefix + "updatedBy" + suffix));
    }

    // add `providerItem` to the URL query string
    if (getProviderItem() != null) {
      try {
        joiner.add(String.format("%sproviderItem%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderItem()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `providerKey` to the URL query string
    if (getProviderKey() != null) {
      try {
        joiner.add(String.format("%sproviderKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `providerId` to the URL query string
    if (getProviderId() != null) {
      try {
        joiner.add(String.format("%sproviderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `order` to the URL query string
    if (getOrder() != null) {
      try {
        joiner.add(String.format("%sorder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrder()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isFavorite` to the URL query string
    if (getIsFavorite() != null) {
      try {
        joiner.add(String.format("%sisFavorite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsFavorite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileEntryType` to the URL query string
    if (getFileEntryType() != null) {
      try {
        joiner.add(String.format("%sfileEntryType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileEntryType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `rootFolderId` to the URL query string
    if (getRootFolderId() != null) {
      try {
        joiner.add(String.format("%srootFolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRootFolderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `originId` to the URL query string
    if (getOriginId() != null) {
      try {
        joiner.add(String.format("%soriginId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `originRoomId` to the URL query string
    if (getOriginRoomId() != null) {
      try {
        joiner.add(String.format("%soriginRoomId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginRoomId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `originTitle` to the URL query string
    if (getOriginTitle() != null) {
      try {
        joiner.add(String.format("%soriginTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `originRoomTitle` to the URL query string
    if (getOriginRoomTitle() != null) {
      try {
        joiner.add(String.format("%soriginRoomTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginRoomTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canShare` to the URL query string
    if (getCanShare() != null) {
      try {
        joiner.add(String.format("%scanShare%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanShare()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shareSettings` to the URL query string
    if (getShareSettings() != null) {
      joiner.add(getShareSettings().toUrlQueryString(prefix + "shareSettings" + suffix));
    }

    // add `security` to the URL query string
    if (getSecurity() != null) {
      joiner.add(getSecurity().toUrlQueryString(prefix + "security" + suffix));
    }

    // add `availableShareRights` to the URL query string
    if (getAvailableShareRights() != null) {
      joiner.add(getAvailableShareRights().toUrlQueryString(prefix + "availableShareRights" + suffix));
    }

    // add `requestToken` to the URL query string
    if (getRequestToken() != null) {
      try {
        joiner.add(String.format("%srequestToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `external` to the URL query string
    if (getExternal() != null) {
      try {
        joiner.add(String.format("%sexternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expirationDate` to the URL query string
    if (getExpirationDate() != null) {
      joiner.add(getExpirationDate().toUrlQueryString(prefix + "expirationDate" + suffix));
    }

    // add `isLinkExpired` to the URL query string
    if (getIsLinkExpired() != null) {
      try {
        joiner.add(String.format("%sisLinkExpired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsLinkExpired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `parentId` to the URL query string
    if (getParentId() != null) {
      try {
        joiner.add(String.format("%sparentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParentId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `filesCount` to the URL query string
    if (getFilesCount() != null) {
      try {
        joiner.add(String.format("%sfilesCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFilesCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `foldersCount` to the URL query string
    if (getFoldersCount() != null) {
      try {
        joiner.add(String.format("%sfoldersCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFoldersCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isShareable` to the URL query string
    if (getIsShareable() != null) {
      try {
        joiner.add(String.format("%sisShareable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsShareable()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `new` to the URL query string
    if (getNew() != null) {
      try {
        joiner.add(String.format("%snew%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNew()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mute` to the URL query string
    if (getMute() != null) {
      try {
        joiner.add(String.format("%smute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMute()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `pinned` to the URL query string
    if (getPinned() != null) {
      try {
        joiner.add(String.format("%spinned%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPinned()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `lifetime` to the URL query string
    if (getLifetime() != null) {
      joiner.add(getLifetime().toUrlQueryString(prefix + "lifetime" + suffix));
    }

    // add `watermark` to the URL query string
    if (getWatermark() != null) {
      joiner.add(getWatermark().toUrlQueryString(prefix + "watermark" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `inRoom` to the URL query string
    if (getInRoom() != null) {
      try {
        joiner.add(String.format("%sinRoom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInRoom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quotaLimit` to the URL query string
    if (getQuotaLimit() != null) {
      try {
        joiner.add(String.format("%squotaLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuotaLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isCustomQuota` to the URL query string
    if (getIsCustomQuota() != null) {
      try {
        joiner.add(String.format("%sisCustomQuota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsCustomQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usedSpace` to the URL query string
    if (getUsedSpace() != null) {
      try {
        joiner.add(String.format("%susedSpace%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsedSpace()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `passwordProtected` to the URL query string
    if (getPasswordProtected() != null) {
      try {
        joiner.add(String.format("%spasswordProtected%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPasswordProtected()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expired` to the URL query string
    if (getExpired() != null) {
      try {
        joiner.add(String.format("%sexpired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `chatSettings` to the URL query string
    if (getChatSettings() != null) {
      joiner.add(getChatSettings().toUrlQueryString(prefix + "chatSettings" + suffix));
    }

    // add `rootRoomType` to the URL query string
    if (getRootRoomType() != null) {
      try {
        joiner.add(String.format("%srootRoomType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRootRoomType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `sendFormToExternalDB` to the URL query string
    if (getSendFormToExternalDB() != null) {
      try {
        joiner.add(String.format("%ssendFormToExternalDB%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSendFormToExternalDB()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `originalFormId` to the URL query string
    if (getOriginalFormId() != null) {
      try {
        joiner.add(String.format("%soriginalFormId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginalFormId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

