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
import org.openapitools.client.model.AiFileEntryType;
import org.openapitools.client.model.AiFileShare;
import org.openapitools.client.model.AiFolderType;
import org.openapitools.client.model.AiLogo;
import org.openapitools.client.model.AiRoomDataLifetimeDto;
import org.openapitools.client.model.AiRoomType;
import org.openapitools.client.model.AiWatermarkDto;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfAvailableShareRights;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfSecurity;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfShareSettings;
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
 * The folder parameters.
 */
@JsonPropertyOrder({
  AiFolderDtoInteger.JSON_PROPERTY_TITLE,
  AiFolderDtoInteger.JSON_PROPERTY_ACCESS,
  AiFolderDtoInteger.JSON_PROPERTY_SHARED_BY,
  AiFolderDtoInteger.JSON_PROPERTY_OWNED_BY,
  AiFolderDtoInteger.JSON_PROPERTY_SHARED,
  AiFolderDtoInteger.JSON_PROPERTY_SHARED_FOR_USER,
  AiFolderDtoInteger.JSON_PROPERTY_SHARED_EXTERNAL,
  AiFolderDtoInteger.JSON_PROPERTY_PARENT_SHARED,
  AiFolderDtoInteger.JSON_PROPERTY_SHORT_WEB_URL,
  AiFolderDtoInteger.JSON_PROPERTY_CREATED,
  AiFolderDtoInteger.JSON_PROPERTY_CREATED_BY,
  AiFolderDtoInteger.JSON_PROPERTY_UPDATED,
  AiFolderDtoInteger.JSON_PROPERTY_AUTO_DELETE,
  AiFolderDtoInteger.JSON_PROPERTY_ROOT_FOLDER_TYPE,
  AiFolderDtoInteger.JSON_PROPERTY_PARENT_ROOM_TYPE,
  AiFolderDtoInteger.JSON_PROPERTY_UPDATED_BY,
  AiFolderDtoInteger.JSON_PROPERTY_PROVIDER_ITEM,
  AiFolderDtoInteger.JSON_PROPERTY_PROVIDER_KEY,
  AiFolderDtoInteger.JSON_PROPERTY_PROVIDER_ID,
  AiFolderDtoInteger.JSON_PROPERTY_ORDER,
  AiFolderDtoInteger.JSON_PROPERTY_IS_FAVORITE,
  AiFolderDtoInteger.JSON_PROPERTY_FILE_ENTRY_TYPE,
  AiFolderDtoInteger.JSON_PROPERTY_ID,
  AiFolderDtoInteger.JSON_PROPERTY_ROOT_FOLDER_ID,
  AiFolderDtoInteger.JSON_PROPERTY_ORIGIN_ID,
  AiFolderDtoInteger.JSON_PROPERTY_ORIGIN_ROOM_ID,
  AiFolderDtoInteger.JSON_PROPERTY_ORIGIN_TITLE,
  AiFolderDtoInteger.JSON_PROPERTY_ORIGIN_ROOM_TITLE,
  AiFolderDtoInteger.JSON_PROPERTY_CAN_SHARE,
  AiFolderDtoInteger.JSON_PROPERTY_SHARE_SETTINGS,
  AiFolderDtoInteger.JSON_PROPERTY_SECURITY,
  AiFolderDtoInteger.JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS,
  AiFolderDtoInteger.JSON_PROPERTY_REQUEST_TOKEN,
  AiFolderDtoInteger.JSON_PROPERTY_EXTERNAL,
  AiFolderDtoInteger.JSON_PROPERTY_EXPIRATION_DATE,
  AiFolderDtoInteger.JSON_PROPERTY_IS_LINK_EXPIRED,
  AiFolderDtoInteger.JSON_PROPERTY_PARENT_ID,
  AiFolderDtoInteger.JSON_PROPERTY_FILES_COUNT,
  AiFolderDtoInteger.JSON_PROPERTY_FOLDERS_COUNT,
  AiFolderDtoInteger.JSON_PROPERTY_IS_SHAREABLE,
  AiFolderDtoInteger.JSON_PROPERTY_NEW,
  AiFolderDtoInteger.JSON_PROPERTY_MUTE,
  AiFolderDtoInteger.JSON_PROPERTY_TAGS,
  AiFolderDtoInteger.JSON_PROPERTY_LOGO,
  AiFolderDtoInteger.JSON_PROPERTY_PINNED,
  AiFolderDtoInteger.JSON_PROPERTY_ROOM_TYPE,
  AiFolderDtoInteger.JSON_PROPERTY_PRIVATE,
  AiFolderDtoInteger.JSON_PROPERTY_INDEXING,
  AiFolderDtoInteger.JSON_PROPERTY_DENY_DOWNLOAD,
  AiFolderDtoInteger.JSON_PROPERTY_LIFETIME,
  AiFolderDtoInteger.JSON_PROPERTY_WATERMARK,
  AiFolderDtoInteger.JSON_PROPERTY_TYPE,
  AiFolderDtoInteger.JSON_PROPERTY_IN_ROOM,
  AiFolderDtoInteger.JSON_PROPERTY_QUOTA_LIMIT,
  AiFolderDtoInteger.JSON_PROPERTY_IS_CUSTOM_QUOTA,
  AiFolderDtoInteger.JSON_PROPERTY_USED_SPACE,
  AiFolderDtoInteger.JSON_PROPERTY_PASSWORD_PROTECTED,
  AiFolderDtoInteger.JSON_PROPERTY_EXPIRED,
  AiFolderDtoInteger.JSON_PROPERTY_CHAT_SETTINGS,
  AiFolderDtoInteger.JSON_PROPERTY_ROOT_ROOM_TYPE,
  AiFolderDtoInteger.JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X,
  AiFolderDtoInteger.JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B,
  AiFolderDtoInteger.JSON_PROPERTY_ORIGINAL_FORM_ID
})

public class AiFolderDtoInteger {
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
  @javax.annotation.Nullable  private JsonNullable<FileEntryDtoIntegerAllOfShareSettings> shareSettings = JsonNullable.<FileEntryDtoIntegerAllOfShareSettings>undefined();

  public static final String JSON_PROPERTY_SECURITY = "security";
  @javax.annotation.Nullable  private JsonNullable<FileEntryDtoIntegerAllOfSecurity> security = JsonNullable.<FileEntryDtoIntegerAllOfSecurity>undefined();

  public static final String JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS = "availableShareRights";
  @javax.annotation.Nullable  private JsonNullable<FileEntryDtoIntegerAllOfAvailableShareRights> availableShareRights = JsonNullable.<FileEntryDtoIntegerAllOfAvailableShareRights>undefined();

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

  public AiFolderDtoInteger() {
  }


  public AiFolderDtoInteger title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The file entry title.
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

  public AiFolderDtoInteger access(@javax.annotation.Nullable AiFileShare access) {
    
    this.access = access;
    return this;
  }

  /**
   * The access rights to the file entry.
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

  public AiFolderDtoInteger sharedBy(@javax.annotation.Nullable AiEmployeeDto sharedBy) {
    
    this.sharedBy = sharedBy;
    return this;
  }

  /**
   * Provides information about the employee who shared the file or folder.
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

  public AiFolderDtoInteger ownedBy(@javax.annotation.Nullable AiEmployeeDto ownedBy) {
    
    this.ownedBy = ownedBy;
    return this;
  }

  /**
   * The information about the employee who owns the file entry.
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

  public AiFolderDtoInteger shared(@javax.annotation.Nullable Boolean shared) {
    
    this.shared = shared;
    return this;
  }

  /**
   * Specifies if the file entry is shared via link or not.
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

  public AiFolderDtoInteger sharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    
    this.sharedForUser = sharedForUser;
    return this;
  }

  /**
   * Specifies if the file entry is shared for user or not.
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

  public AiFolderDtoInteger sharedExternal(@javax.annotation.Nullable Boolean sharedExternal) {
    
    this.sharedExternal = sharedExternal;
    return this;
  }

  /**
   * Specifies if the file entry is shared via a public (non-internal) external link.
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

  public AiFolderDtoInteger parentShared(@javax.annotation.Nullable Boolean parentShared) {
    
    this.parentShared = parentShared;
    return this;
  }

  /**
   * Indicates whether the parent entity is shared.
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

  public AiFolderDtoInteger shortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
    
    this.shortWebUrl = shortWebUrl;
    return this;
  }

  /**
   * The short Web URL.
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

  public AiFolderDtoInteger created(@javax.annotation.Nullable AiApiDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * The creation date and time of the file entry.
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

  public AiFolderDtoInteger createdBy(@javax.annotation.Nullable AiEmployeeDto createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The file entry author.
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

  public AiFolderDtoInteger updated(@javax.annotation.Nullable AiApiDateTime updated) {
    
    this.updated = updated;
    return this;
  }

  /**
   * The last date and time when the file entry was updated.
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

  public AiFolderDtoInteger autoDelete(@javax.annotation.Nullable AiApiDateTime autoDelete) {
    
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * The date and time when the file entry will be automatically deleted.
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

  public AiFolderDtoInteger rootFolderType(@javax.annotation.Nullable AiFolderType rootFolderType) {
    
    this.rootFolderType = rootFolderType;
    return this;
  }

  /**
   * The root folder type of the file entry.
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

  public AiFolderDtoInteger parentRoomType(@javax.annotation.Nullable AiFolderType parentRoomType) {
    
    this.parentRoomType = parentRoomType;
    return this;
  }

  /**
   * The parent room type of the file entry.
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

  public AiFolderDtoInteger updatedBy(@javax.annotation.Nullable AiEmployeeDto updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * The user who updated the file entry.
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

  public AiFolderDtoInteger providerItem(@javax.annotation.Nullable Boolean providerItem) {
    
    this.providerItem = providerItem;
    return this;
  }

  /**
   * Specifies if the file entry provider is specified or not.
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

  public AiFolderDtoInteger providerKey(@javax.annotation.Nullable String providerKey) {
    
    this.providerKey = providerKey;
    return this;
  }

  /**
   * The provider key of the file entry.
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

  public AiFolderDtoInteger providerId(@javax.annotation.Nullable Integer providerId) {
    
    this.providerId = providerId;
    return this;
  }

  /**
   * The provider ID of the file entry.
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

  public AiFolderDtoInteger order(@javax.annotation.Nullable String order) {
    
    this.order = order;
    return this;
  }

  /**
   * The order of the file entry.
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

  public AiFolderDtoInteger isFavorite(@javax.annotation.Nullable Boolean isFavorite) {
    
    this.isFavorite = isFavorite;
    return this;
  }

  /**
   * Specifies if the file is a favorite or not.
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

  public AiFolderDtoInteger fileEntryType(@javax.annotation.Nullable AiFileEntryType fileEntryType) {
    
    this.fileEntryType = fileEntryType;
    return this;
  }

  /**
   * The file entry type.
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

  public AiFolderDtoInteger id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The file entry ID.
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

  public AiFolderDtoInteger rootFolderId(@javax.annotation.Nullable Integer rootFolderId) {
    
    this.rootFolderId = rootFolderId;
    return this;
  }

  /**
   * The root folder ID of the file entry.
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

  public AiFolderDtoInteger originId(@javax.annotation.Nullable Integer originId) {
    
    this.originId = originId;
    return this;
  }

  /**
   * The origin ID of the file entry.
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

  public AiFolderDtoInteger originRoomId(@javax.annotation.Nullable Integer originRoomId) {
    
    this.originRoomId = originRoomId;
    return this;
  }

  /**
   * The origin room ID of the file entry.
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

  public AiFolderDtoInteger originTitle(@javax.annotation.Nullable String originTitle) {
    
    this.originTitle = originTitle;
    return this;
  }

  /**
   * The origin title of the file entry.
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

  public AiFolderDtoInteger originRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
    
    this.originRoomTitle = originRoomTitle;
    return this;
  }

  /**
   * The origin room title of the file entry.
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

  public AiFolderDtoInteger canShare(@javax.annotation.Nullable Boolean canShare) {
    
    this.canShare = canShare;
    return this;
  }

  /**
   * Specifies if the file entry can be shared or not.
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

  public AiFolderDtoInteger shareSettings(@javax.annotation.Nullable FileEntryDtoIntegerAllOfShareSettings shareSettings) {
    this.shareSettings = JsonNullable.<FileEntryDtoIntegerAllOfShareSettings>of(shareSettings);
    
    return this;
  }

  /**
   * Get shareSettings
   * @return shareSettings
   */
  @javax.annotation.Nullable  @JsonIgnore

  public FileEntryDtoIntegerAllOfShareSettings getShareSettings() {
        return shareSettings.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SHARE_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<FileEntryDtoIntegerAllOfShareSettings> getShareSettings_JsonNullable() {
    return shareSettings;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARE_SETTINGS)
  public void setShareSettings_JsonNullable(JsonNullable<FileEntryDtoIntegerAllOfShareSettings> shareSettings) {
    this.shareSettings = shareSettings;
  }

  public void setShareSettings(@javax.annotation.Nullable FileEntryDtoIntegerAllOfShareSettings shareSettings) {
    this.shareSettings = JsonNullable.<FileEntryDtoIntegerAllOfShareSettings>of(shareSettings);
  }

  public AiFolderDtoInteger security(@javax.annotation.Nullable FileEntryDtoIntegerAllOfSecurity security) {
    this.security = JsonNullable.<FileEntryDtoIntegerAllOfSecurity>of(security);
    
    return this;
  }

  /**
   * Get security
   * @return security
   */
  @javax.annotation.Nullable  @JsonIgnore

  public FileEntryDtoIntegerAllOfSecurity getSecurity() {
        return security.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SECURITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<FileEntryDtoIntegerAllOfSecurity> getSecurity_JsonNullable() {
    return security;
  }
  
  @JsonProperty(JSON_PROPERTY_SECURITY)
  public void setSecurity_JsonNullable(JsonNullable<FileEntryDtoIntegerAllOfSecurity> security) {
    this.security = security;
  }

  public void setSecurity(@javax.annotation.Nullable FileEntryDtoIntegerAllOfSecurity security) {
    this.security = JsonNullable.<FileEntryDtoIntegerAllOfSecurity>of(security);
  }

  public AiFolderDtoInteger availableShareRights(@javax.annotation.Nullable FileEntryDtoIntegerAllOfAvailableShareRights availableShareRights) {
    this.availableShareRights = JsonNullable.<FileEntryDtoIntegerAllOfAvailableShareRights>of(availableShareRights);
    
    return this;
  }

  /**
   * Get availableShareRights
   * @return availableShareRights
   */
  @javax.annotation.Nullable  @JsonIgnore

  public FileEntryDtoIntegerAllOfAvailableShareRights getAvailableShareRights() {
        return availableShareRights.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<FileEntryDtoIntegerAllOfAvailableShareRights> getAvailableShareRights_JsonNullable() {
    return availableShareRights;
  }
  
  @JsonProperty(JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS)
  public void setAvailableShareRights_JsonNullable(JsonNullable<FileEntryDtoIntegerAllOfAvailableShareRights> availableShareRights) {
    this.availableShareRights = availableShareRights;
  }

  public void setAvailableShareRights(@javax.annotation.Nullable FileEntryDtoIntegerAllOfAvailableShareRights availableShareRights) {
    this.availableShareRights = JsonNullable.<FileEntryDtoIntegerAllOfAvailableShareRights>of(availableShareRights);
  }

  public AiFolderDtoInteger requestToken(@javax.annotation.Nullable String requestToken) {
    
    this.requestToken = requestToken;
    return this;
  }

  /**
   * The request token of the file entry.
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

  public AiFolderDtoInteger external(@javax.annotation.Nullable Boolean external) {
    
    this.external = external;
    return this;
  }

  /**
   * Specifies if the folder can be accessed via an external link or not.
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

  public AiFolderDtoInteger expirationDate(@javax.annotation.Nullable AiApiDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Represents the expiration date of the file entry.
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

  public AiFolderDtoInteger isLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
    
    this.isLinkExpired = isLinkExpired;
    return this;
  }

  /**
   * Indicates whether the shareable link associated with the file or folder has expired.
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

  public AiFolderDtoInteger parentId(@javax.annotation.Nullable Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

  /**
   * The parent folder ID of the folder.
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

  public AiFolderDtoInteger filesCount(@javax.annotation.Nullable Integer filesCount) {
    
    this.filesCount = filesCount;
    return this;
  }

  /**
   * The number of files that the folder contains.
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

  public AiFolderDtoInteger foldersCount(@javax.annotation.Nullable Integer foldersCount) {
    
    this.foldersCount = foldersCount;
    return this;
  }

  /**
   * The number of folders that the folder contains.
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

  public AiFolderDtoInteger isShareable(@javax.annotation.Nullable Boolean isShareable) {
    this.isShareable = JsonNullable.<Boolean>of(isShareable);
    
    return this;
  }

  /**
   * Specifies if the folder can be shared or not.
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

  public AiFolderDtoInteger _new(@javax.annotation.Nullable Integer _new) {
    
    this._new = _new;
    return this;
  }

  /**
   * The new element index in the folder.
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

  public AiFolderDtoInteger mute(@javax.annotation.Nullable Boolean mute) {
    
    this.mute = mute;
    return this;
  }

  /**
   * Specifies if the folder notifications are enabled or not.
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

  public AiFolderDtoInteger tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public AiFolderDtoInteger addTagsItem(String tagsItem) {
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
   * The list of tags of the folder.
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

  public AiFolderDtoInteger logo(@javax.annotation.Nullable AiLogo logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * The folder logo.
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

  public AiFolderDtoInteger pinned(@javax.annotation.Nullable Boolean pinned) {
    
    this.pinned = pinned;
    return this;
  }

  /**
   * Specifies if the folder is pinned or not.
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

  public AiFolderDtoInteger roomType(@javax.annotation.Nullable AiRoomType roomType) {
    
    this.roomType = roomType;
    return this;
  }

  /**
   * The room type of the folder.
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

  public AiFolderDtoInteger _private(@javax.annotation.Nullable Boolean _private) {
    
    this._private = _private;
    return this;
  }

  /**
   * Specifies if the folder is private or not.
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

  public AiFolderDtoInteger indexing(@javax.annotation.Nullable Boolean indexing) {
    
    this.indexing = indexing;
    return this;
  }

  /**
   * Specifies if the folder is indexed or not.
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

  public AiFolderDtoInteger denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    
    this.denyDownload = denyDownload;
    return this;
  }

  /**
   * Specifies if the folder can be downloaded or not.
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

  public AiFolderDtoInteger lifetime(@javax.annotation.Nullable AiRoomDataLifetimeDto lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

  /**
   * The room data lifetime settings of the folder.
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

  public AiFolderDtoInteger watermark(@javax.annotation.Nullable AiWatermarkDto watermark) {
    
    this.watermark = watermark;
    return this;
  }

  /**
   * The watermark settings of the folder.
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

  public AiFolderDtoInteger type(@javax.annotation.Nullable AiFolderType type) {
    
    this.type = type;
    return this;
  }

  /**
   * The folder type.
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

  public AiFolderDtoInteger inRoom(@javax.annotation.Nullable Boolean inRoom) {
    this.inRoom = JsonNullable.<Boolean>of(inRoom);
    
    return this;
  }

  /**
   * Specifies if the folder is placed in the room or not.
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

  public AiFolderDtoInteger quotaLimit(@javax.annotation.Nullable Long quotaLimit) {
    this.quotaLimit = JsonNullable.<Long>of(quotaLimit);
    
    return this;
  }

  /**
   * The folder quota limit.
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

  public AiFolderDtoInteger isCustomQuota(@javax.annotation.Nullable Boolean isCustomQuota) {
    this.isCustomQuota = JsonNullable.<Boolean>of(isCustomQuota);
    
    return this;
  }

  /**
   * Specifies if the folder room has a custom quota or not.
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

  public AiFolderDtoInteger usedSpace(@javax.annotation.Nullable Long usedSpace) {
    this.usedSpace = JsonNullable.<Long>of(usedSpace);
    
    return this;
  }

  /**
   * How much folder space is used (counter).
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

  public AiFolderDtoInteger passwordProtected(@javax.annotation.Nullable Boolean passwordProtected) {
    this.passwordProtected = JsonNullable.<Boolean>of(passwordProtected);
    
    return this;
  }

  /**
   * Specifies if the folder is password protected or not.
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

  public AiFolderDtoInteger expired(@javax.annotation.Nullable Boolean expired) {
    this.expired = JsonNullable.<Boolean>of(expired);
    
    return this;
  }

  /**
   * Specifies if an external link to the folder is expired or not.
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

  public AiFolderDtoInteger chatSettings(@javax.annotation.Nullable AiChatSettingsDto chatSettings) {
    
    this.chatSettings = chatSettings;
    return this;
  }

  /**
   * The AI chat settings for the folder room. Contains configuration for AI provider, model selection, and custom prompts.  Only applicable to rooms with AI chat functionality enabled. Null if the room does not have chat settings configured.
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

  public AiFolderDtoInteger rootRoomType(@javax.annotation.Nullable AiRoomType rootRoomType) {
    
    this.rootRoomType = rootRoomType;
    return this;
  }

  /**
   * The room type of the root folder. Indicates the type of the parent room if the current folder is nested within a room hierarchy.  This property helps identify the context in which a nested folder exists.
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

  public AiFolderDtoInteger saveFormAsXLSX(@javax.annotation.Nullable Boolean saveFormAsXLSX) {
    this.saveFormAsXLSX = JsonNullable.<Boolean>of(saveFormAsXLSX);
    
    return this;
  }

  /**
   * Specifies whether to save form data as XLSX file.
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

  public AiFolderDtoInteger sendFormToExternalDB(@javax.annotation.Nullable Boolean sendFormToExternalDB) {
    this.sendFormToExternalDB = JsonNullable.<Boolean>of(sendFormToExternalDB);
    
    return this;
  }

  /**
   * Specifies whether to send form data to external database.
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

  public AiFolderDtoInteger originalFormId(@javax.annotation.Nullable Integer originalFormId) {
    this.originalFormId = JsonNullable.<Integer>of(originalFormId);
    
    return this;
  }

  /**
   * The original form ID that corresponds to this FormFillingFolderDone folder.
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
    AiFolderDtoInteger aiFolderDtoInteger = (AiFolderDtoInteger) o;
    return Objects.equals(this.title, aiFolderDtoInteger.title) &&
        Objects.equals(this.access, aiFolderDtoInteger.access) &&
        Objects.equals(this.sharedBy, aiFolderDtoInteger.sharedBy) &&
        Objects.equals(this.ownedBy, aiFolderDtoInteger.ownedBy) &&
        Objects.equals(this.shared, aiFolderDtoInteger.shared) &&
        Objects.equals(this.sharedForUser, aiFolderDtoInteger.sharedForUser) &&
        Objects.equals(this.sharedExternal, aiFolderDtoInteger.sharedExternal) &&
        Objects.equals(this.parentShared, aiFolderDtoInteger.parentShared) &&
        Objects.equals(this.shortWebUrl, aiFolderDtoInteger.shortWebUrl) &&
        Objects.equals(this.created, aiFolderDtoInteger.created) &&
        Objects.equals(this.createdBy, aiFolderDtoInteger.createdBy) &&
        Objects.equals(this.updated, aiFolderDtoInteger.updated) &&
        Objects.equals(this.autoDelete, aiFolderDtoInteger.autoDelete) &&
        Objects.equals(this.rootFolderType, aiFolderDtoInteger.rootFolderType) &&
        Objects.equals(this.parentRoomType, aiFolderDtoInteger.parentRoomType) &&
        Objects.equals(this.updatedBy, aiFolderDtoInteger.updatedBy) &&
        Objects.equals(this.providerItem, aiFolderDtoInteger.providerItem) &&
        Objects.equals(this.providerKey, aiFolderDtoInteger.providerKey) &&
        Objects.equals(this.providerId, aiFolderDtoInteger.providerId) &&
        Objects.equals(this.order, aiFolderDtoInteger.order) &&
        Objects.equals(this.isFavorite, aiFolderDtoInteger.isFavorite) &&
        Objects.equals(this.fileEntryType, aiFolderDtoInteger.fileEntryType) &&
        Objects.equals(this.id, aiFolderDtoInteger.id) &&
        Objects.equals(this.rootFolderId, aiFolderDtoInteger.rootFolderId) &&
        Objects.equals(this.originId, aiFolderDtoInteger.originId) &&
        Objects.equals(this.originRoomId, aiFolderDtoInteger.originRoomId) &&
        Objects.equals(this.originTitle, aiFolderDtoInteger.originTitle) &&
        Objects.equals(this.originRoomTitle, aiFolderDtoInteger.originRoomTitle) &&
        Objects.equals(this.canShare, aiFolderDtoInteger.canShare) &&
        equalsNullable(this.shareSettings, aiFolderDtoInteger.shareSettings) &&
        equalsNullable(this.security, aiFolderDtoInteger.security) &&
        equalsNullable(this.availableShareRights, aiFolderDtoInteger.availableShareRights) &&
        Objects.equals(this.requestToken, aiFolderDtoInteger.requestToken) &&
        Objects.equals(this.external, aiFolderDtoInteger.external) &&
        Objects.equals(this.expirationDate, aiFolderDtoInteger.expirationDate) &&
        Objects.equals(this.isLinkExpired, aiFolderDtoInteger.isLinkExpired) &&
        Objects.equals(this.parentId, aiFolderDtoInteger.parentId) &&
        Objects.equals(this.filesCount, aiFolderDtoInteger.filesCount) &&
        Objects.equals(this.foldersCount, aiFolderDtoInteger.foldersCount) &&
        equalsNullable(this.isShareable, aiFolderDtoInteger.isShareable) &&
        Objects.equals(this._new, aiFolderDtoInteger._new) &&
        Objects.equals(this.mute, aiFolderDtoInteger.mute) &&
        equalsNullable(this.tags, aiFolderDtoInteger.tags) &&
        Objects.equals(this.logo, aiFolderDtoInteger.logo) &&
        Objects.equals(this.pinned, aiFolderDtoInteger.pinned) &&
        Objects.equals(this.roomType, aiFolderDtoInteger.roomType) &&
        Objects.equals(this._private, aiFolderDtoInteger._private) &&
        Objects.equals(this.indexing, aiFolderDtoInteger.indexing) &&
        Objects.equals(this.denyDownload, aiFolderDtoInteger.denyDownload) &&
        Objects.equals(this.lifetime, aiFolderDtoInteger.lifetime) &&
        Objects.equals(this.watermark, aiFolderDtoInteger.watermark) &&
        Objects.equals(this.type, aiFolderDtoInteger.type) &&
        equalsNullable(this.inRoom, aiFolderDtoInteger.inRoom) &&
        equalsNullable(this.quotaLimit, aiFolderDtoInteger.quotaLimit) &&
        equalsNullable(this.isCustomQuota, aiFolderDtoInteger.isCustomQuota) &&
        equalsNullable(this.usedSpace, aiFolderDtoInteger.usedSpace) &&
        equalsNullable(this.passwordProtected, aiFolderDtoInteger.passwordProtected) &&
        equalsNullable(this.expired, aiFolderDtoInteger.expired) &&
        Objects.equals(this.chatSettings, aiFolderDtoInteger.chatSettings) &&
        Objects.equals(this.rootRoomType, aiFolderDtoInteger.rootRoomType) &&
        equalsNullable(this.saveFormAsXLSX, aiFolderDtoInteger.saveFormAsXLSX) &&
        equalsNullable(this.sendFormToExternalDB, aiFolderDtoInteger.sendFormToExternalDB) &&
        equalsNullable(this.originalFormId, aiFolderDtoInteger.originalFormId);
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
    sb.append("class AiFolderDtoInteger {\n");
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

