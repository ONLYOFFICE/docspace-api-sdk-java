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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.ChatSettingsDto;
import org.openapitools.client.model.EmployeeDto;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfAvailableShareRights;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfSecurity;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfShareSettings;
import org.openapitools.client.model.FileEntryType;
import org.openapitools.client.model.FileShare;
import org.openapitools.client.model.FolderType;
import org.openapitools.client.model.Logo;
import org.openapitools.client.model.RoomDataLifetimeDto;
import org.openapitools.client.model.RoomType;
import org.openapitools.client.model.WatermarkDto;
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
  FolderDtoString.JSON_PROPERTY_TITLE,
  FolderDtoString.JSON_PROPERTY_ACCESS,
  FolderDtoString.JSON_PROPERTY_SHARED_BY,
  FolderDtoString.JSON_PROPERTY_OWNED_BY,
  FolderDtoString.JSON_PROPERTY_SHARED,
  FolderDtoString.JSON_PROPERTY_SHARED_FOR_USER,
  FolderDtoString.JSON_PROPERTY_PARENT_SHARED,
  FolderDtoString.JSON_PROPERTY_SHORT_WEB_URL,
  FolderDtoString.JSON_PROPERTY_CREATED,
  FolderDtoString.JSON_PROPERTY_CREATED_BY,
  FolderDtoString.JSON_PROPERTY_UPDATED,
  FolderDtoString.JSON_PROPERTY_AUTO_DELETE,
  FolderDtoString.JSON_PROPERTY_ROOT_FOLDER_TYPE,
  FolderDtoString.JSON_PROPERTY_PARENT_ROOM_TYPE,
  FolderDtoString.JSON_PROPERTY_UPDATED_BY,
  FolderDtoString.JSON_PROPERTY_PROVIDER_ITEM,
  FolderDtoString.JSON_PROPERTY_PROVIDER_KEY,
  FolderDtoString.JSON_PROPERTY_PROVIDER_ID,
  FolderDtoString.JSON_PROPERTY_ORDER,
  FolderDtoString.JSON_PROPERTY_IS_FAVORITE,
  FolderDtoString.JSON_PROPERTY_FILE_ENTRY_TYPE,
  FolderDtoString.JSON_PROPERTY_ID,
  FolderDtoString.JSON_PROPERTY_ROOT_FOLDER_ID,
  FolderDtoString.JSON_PROPERTY_ORIGIN_ID,
  FolderDtoString.JSON_PROPERTY_ORIGIN_ROOM_ID,
  FolderDtoString.JSON_PROPERTY_ORIGIN_TITLE,
  FolderDtoString.JSON_PROPERTY_ORIGIN_ROOM_TITLE,
  FolderDtoString.JSON_PROPERTY_CAN_SHARE,
  FolderDtoString.JSON_PROPERTY_SHARE_SETTINGS,
  FolderDtoString.JSON_PROPERTY_SECURITY,
  FolderDtoString.JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS,
  FolderDtoString.JSON_PROPERTY_REQUEST_TOKEN,
  FolderDtoString.JSON_PROPERTY_EXTERNAL,
  FolderDtoString.JSON_PROPERTY_EXPIRATION_DATE,
  FolderDtoString.JSON_PROPERTY_IS_LINK_EXPIRED,
  FolderDtoString.JSON_PROPERTY_PARENT_ID,
  FolderDtoString.JSON_PROPERTY_FILES_COUNT,
  FolderDtoString.JSON_PROPERTY_FOLDERS_COUNT,
  FolderDtoString.JSON_PROPERTY_IS_SHAREABLE,
  FolderDtoString.JSON_PROPERTY_NEW,
  FolderDtoString.JSON_PROPERTY_MUTE,
  FolderDtoString.JSON_PROPERTY_TAGS,
  FolderDtoString.JSON_PROPERTY_LOGO,
  FolderDtoString.JSON_PROPERTY_PINNED,
  FolderDtoString.JSON_PROPERTY_ROOM_TYPE,
  FolderDtoString.JSON_PROPERTY_PRIVATE,
  FolderDtoString.JSON_PROPERTY_INDEXING,
  FolderDtoString.JSON_PROPERTY_DENY_DOWNLOAD,
  FolderDtoString.JSON_PROPERTY_LIFETIME,
  FolderDtoString.JSON_PROPERTY_WATERMARK,
  FolderDtoString.JSON_PROPERTY_TYPE,
  FolderDtoString.JSON_PROPERTY_IN_ROOM,
  FolderDtoString.JSON_PROPERTY_QUOTA_LIMIT,
  FolderDtoString.JSON_PROPERTY_IS_CUSTOM_QUOTA,
  FolderDtoString.JSON_PROPERTY_USED_SPACE,
  FolderDtoString.JSON_PROPERTY_PASSWORD_PROTECTED,
  FolderDtoString.JSON_PROPERTY_EXPIRED,
  FolderDtoString.JSON_PROPERTY_CHAT_SETTINGS,
  FolderDtoString.JSON_PROPERTY_ROOT_ROOM_TYPE,
  FolderDtoString.JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X,
  FolderDtoString.JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B
})

public class FolderDtoString {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable  private FileShare access;

  public static final String JSON_PROPERTY_SHARED_BY = "sharedBy";
  @javax.annotation.Nullable  private EmployeeDto sharedBy;

  public static final String JSON_PROPERTY_OWNED_BY = "ownedBy";
  @javax.annotation.Nullable  private EmployeeDto ownedBy;

  public static final String JSON_PROPERTY_SHARED = "shared";
  @javax.annotation.Nullable  private Boolean shared;

  public static final String JSON_PROPERTY_SHARED_FOR_USER = "sharedForUser";
  @javax.annotation.Nullable  private Boolean sharedForUser;

  public static final String JSON_PROPERTY_PARENT_SHARED = "parentShared";
  @javax.annotation.Nullable  private Boolean parentShared;

  public static final String JSON_PROPERTY_SHORT_WEB_URL = "shortWebUrl";
  @javax.annotation.Nullable  private JsonNullable<URI> shortWebUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable  private ApiDateTime created;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable  private EmployeeDto createdBy;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  @javax.annotation.Nullable  private ApiDateTime updated;

  public static final String JSON_PROPERTY_AUTO_DELETE = "autoDelete";
  @javax.annotation.Nullable  private ApiDateTime autoDelete;

  public static final String JSON_PROPERTY_ROOT_FOLDER_TYPE = "rootFolderType";
  @javax.annotation.Nullable  private FolderType rootFolderType;

  public static final String JSON_PROPERTY_PARENT_ROOM_TYPE = "parentRoomType";
  @javax.annotation.Nullable  private FolderType parentRoomType;

  public static final String JSON_PROPERTY_UPDATED_BY = "updatedBy";
  @javax.annotation.Nullable  private EmployeeDto updatedBy;

  public static final String JSON_PROPERTY_PROVIDER_ITEM = "providerItem";
  @javax.annotation.Nullable  private JsonNullable<Boolean> providerItem = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PROVIDER_KEY = "providerKey";
  @javax.annotation.Nullable  private JsonNullable<String> providerKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  @javax.annotation.Nullable  private JsonNullable<Integer> providerId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nullable  private JsonNullable<String> order = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_FAVORITE = "isFavorite";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isFavorite = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FILE_ENTRY_TYPE = "fileEntryType";
  @javax.annotation.Nullable  private FileEntryType fileEntryType;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROOT_FOLDER_ID = "rootFolderId";
  @javax.annotation.Nullable  private JsonNullable<String> rootFolderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGIN_ID = "originId";
  @javax.annotation.Nullable  private JsonNullable<String> originId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGIN_ROOM_ID = "originRoomId";
  @javax.annotation.Nullable  private JsonNullable<String> originRoomId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGIN_TITLE = "originTitle";
  @javax.annotation.Nullable  private JsonNullable<String> originTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGIN_ROOM_TITLE = "originRoomTitle";
  @javax.annotation.Nullable  private JsonNullable<String> originRoomTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAN_SHARE = "canShare";
  @javax.annotation.Nullable  private Boolean canShare;

  public static final String JSON_PROPERTY_SHARE_SETTINGS = "shareSettings";
  @javax.annotation.Nullable  private JsonNullable<FileEntryDtoIntegerAllOfShareSettings> shareSettings = JsonNullable.<FileEntryDtoIntegerAllOfShareSettings>undefined();

  public static final String JSON_PROPERTY_SECURITY = "security";
  @javax.annotation.Nullable  private JsonNullable<FileEntryDtoIntegerAllOfSecurity> security = JsonNullable.<FileEntryDtoIntegerAllOfSecurity>undefined();

  public static final String JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS = "availableShareRights";
  @javax.annotation.Nullable  private JsonNullable<FileEntryDtoIntegerAllOfAvailableShareRights> availableShareRights = JsonNullable.<FileEntryDtoIntegerAllOfAvailableShareRights>undefined();

  public static final String JSON_PROPERTY_REQUEST_TOKEN = "requestToken";
  @javax.annotation.Nullable  private JsonNullable<String> requestToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL = "external";
  @javax.annotation.Nullable  private JsonNullable<Boolean> external = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  @javax.annotation.Nullable  private ApiDateTime expirationDate;

  public static final String JSON_PROPERTY_IS_LINK_EXPIRED = "isLinkExpired";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isLinkExpired = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  @javax.annotation.Nullable  private JsonNullable<String> parentId = JsonNullable.<String>undefined();

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
  @javax.annotation.Nullable  private Logo logo;

  public static final String JSON_PROPERTY_PINNED = "pinned";
  @javax.annotation.Nullable  private Boolean pinned;

  public static final String JSON_PROPERTY_ROOM_TYPE = "roomType";
  @javax.annotation.Nullable  private RoomType roomType;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  @javax.annotation.Nullable  private Boolean _private;

  public static final String JSON_PROPERTY_INDEXING = "indexing";
  @javax.annotation.Nullable  private Boolean indexing;

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable  private Boolean denyDownload;

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  @javax.annotation.Nullable  private RoomDataLifetimeDto lifetime;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  @javax.annotation.Nullable  private WatermarkDto watermark;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private FolderType type;

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
  @javax.annotation.Nullable  private ChatSettingsDto chatSettings;

  public static final String JSON_PROPERTY_ROOT_ROOM_TYPE = "rootRoomType";
  @javax.annotation.Nullable  private RoomType rootRoomType;

  public static final String JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X = "saveFormAsXLSX";
  @javax.annotation.Nullable  private JsonNullable<Boolean> saveFormAsXLSX = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B = "sendFormToExternalDB";
  @javax.annotation.Nullable  private JsonNullable<Boolean> sendFormToExternalDB = JsonNullable.<Boolean>undefined();

  public FolderDtoString() {
  }


  public FolderDtoString title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The file entry title.
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

  public FolderDtoString access(@javax.annotation.Nullable FileShare access) {
    
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileShare getAccess() {
    return access;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable FileShare access) {
    this.access = access;
  }

  public FolderDtoString sharedBy(@javax.annotation.Nullable EmployeeDto sharedBy) {
    
    this.sharedBy = sharedBy;
    return this;
  }

  /**
   * Get sharedBy
   * @return sharedBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SHARED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getSharedBy() {
    return sharedBy;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedBy(@javax.annotation.Nullable EmployeeDto sharedBy) {
    this.sharedBy = sharedBy;
  }

  public FolderDtoString ownedBy(@javax.annotation.Nullable EmployeeDto ownedBy) {
    
    this.ownedBy = ownedBy;
    return this;
  }

  /**
   * Get ownedBy
   * @return ownedBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OWNED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getOwnedBy() {
    return ownedBy;
  }


  @JsonProperty(value = JSON_PROPERTY_OWNED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnedBy(@javax.annotation.Nullable EmployeeDto ownedBy) {
    this.ownedBy = ownedBy;
  }

  public FolderDtoString shared(@javax.annotation.Nullable Boolean shared) {
    
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

  public FolderDtoString sharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    
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

  public FolderDtoString parentShared(@javax.annotation.Nullable Boolean parentShared) {
    
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

  public FolderDtoString shortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
    this.shortWebUrl = JsonNullable.<URI>of(shortWebUrl);
    
    return this;
  }

  /**
   * The short Web URL.
   * @return shortWebUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getShortWebUrl() {
        return shortWebUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SHORT_WEB_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<URI> getShortWebUrl_JsonNullable() {
    return shortWebUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_SHORT_WEB_URL)
  public void setShortWebUrl_JsonNullable(JsonNullable<URI> shortWebUrl) {
    this.shortWebUrl = shortWebUrl;
  }

  public void setShortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
    this.shortWebUrl = JsonNullable.<URI>of(shortWebUrl);
  }

  public FolderDtoString created(@javax.annotation.Nullable ApiDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getCreated() {
    return created;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@javax.annotation.Nullable ApiDateTime created) {
    this.created = created;
  }

  public FolderDtoString createdBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    this.createdBy = createdBy;
  }

  public FolderDtoString updated(@javax.annotation.Nullable ApiDateTime updated) {
    
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getUpdated() {
    return updated;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(@javax.annotation.Nullable ApiDateTime updated) {
    this.updated = updated;
  }

  public FolderDtoString autoDelete(@javax.annotation.Nullable ApiDateTime autoDelete) {
    
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * Get autoDelete
   * @return autoDelete
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AUTO_DELETE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getAutoDelete() {
    return autoDelete;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTO_DELETE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoDelete(@javax.annotation.Nullable ApiDateTime autoDelete) {
    this.autoDelete = autoDelete;
  }

  public FolderDtoString rootFolderType(@javax.annotation.Nullable FolderType rootFolderType) {
    
    this.rootFolderType = rootFolderType;
    return this;
  }

  /**
   * Get rootFolderType
   * @return rootFolderType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FolderType getRootFolderType() {
    return rootFolderType;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootFolderType(@javax.annotation.Nullable FolderType rootFolderType) {
    this.rootFolderType = rootFolderType;
  }

  public FolderDtoString parentRoomType(@javax.annotation.Nullable FolderType parentRoomType) {
    
    this.parentRoomType = parentRoomType;
    return this;
  }

  /**
   * Get parentRoomType
   * @return parentRoomType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PARENT_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FolderType getParentRoomType() {
    return parentRoomType;
  }


  @JsonProperty(value = JSON_PROPERTY_PARENT_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentRoomType(@javax.annotation.Nullable FolderType parentRoomType) {
    this.parentRoomType = parentRoomType;
  }

  public FolderDtoString updatedBy(@javax.annotation.Nullable EmployeeDto updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UPDATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getUpdatedBy() {
    return updatedBy;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedBy(@javax.annotation.Nullable EmployeeDto updatedBy) {
    this.updatedBy = updatedBy;
  }

  public FolderDtoString providerItem(@javax.annotation.Nullable Boolean providerItem) {
    this.providerItem = JsonNullable.<Boolean>of(providerItem);
    
    return this;
  }

  /**
   * Specifies if the file entry provider is specified or not.
   * @return providerItem
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getProviderItem() {
        return providerItem.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ITEM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getProviderItem_JsonNullable() {
    return providerItem;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_ITEM)
  public void setProviderItem_JsonNullable(JsonNullable<Boolean> providerItem) {
    this.providerItem = providerItem;
  }

  public void setProviderItem(@javax.annotation.Nullable Boolean providerItem) {
    this.providerItem = JsonNullable.<Boolean>of(providerItem);
  }

  public FolderDtoString providerKey(@javax.annotation.Nullable String providerKey) {
    this.providerKey = JsonNullable.<String>of(providerKey);
    
    return this;
  }

  /**
   * The provider key of the file entry.
   * @return providerKey
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getProviderKey() {
        return providerKey.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROVIDER_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getProviderKey_JsonNullable() {
    return providerKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_KEY)
  public void setProviderKey_JsonNullable(JsonNullable<String> providerKey) {
    this.providerKey = providerKey;
  }

  public void setProviderKey(@javax.annotation.Nullable String providerKey) {
    this.providerKey = JsonNullable.<String>of(providerKey);
  }

  public FolderDtoString providerId(@javax.annotation.Nullable Integer providerId) {
    this.providerId = JsonNullable.<Integer>of(providerId);
    
    return this;
  }

  /**
   * The provider ID of the file entry.
   * @return providerId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getProviderId() {
        return providerId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getProviderId_JsonNullable() {
    return providerId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  public void setProviderId_JsonNullable(JsonNullable<Integer> providerId) {
    this.providerId = providerId;
  }

  public void setProviderId(@javax.annotation.Nullable Integer providerId) {
    this.providerId = JsonNullable.<Integer>of(providerId);
  }

  public FolderDtoString order(@javax.annotation.Nullable String order) {
    this.order = JsonNullable.<String>of(order);
    
    return this;
  }

  /**
   * The order of the file entry.
   * @return order
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOrder() {
        return order.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOrder_JsonNullable() {
    return order;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER)
  public void setOrder_JsonNullable(JsonNullable<String> order) {
    this.order = order;
  }

  public void setOrder(@javax.annotation.Nullable String order) {
    this.order = JsonNullable.<String>of(order);
  }

  public FolderDtoString isFavorite(@javax.annotation.Nullable Boolean isFavorite) {
    this.isFavorite = JsonNullable.<Boolean>of(isFavorite);
    
    return this;
  }

  /**
   * Specifies if the file is a favorite or not.
   * @return isFavorite
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsFavorite() {
        return isFavorite.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_FAVORITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsFavorite_JsonNullable() {
    return isFavorite;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
  public void setIsFavorite_JsonNullable(JsonNullable<Boolean> isFavorite) {
    this.isFavorite = isFavorite;
  }

  public void setIsFavorite(@javax.annotation.Nullable Boolean isFavorite) {
    this.isFavorite = JsonNullable.<Boolean>of(isFavorite);
  }

  public FolderDtoString fileEntryType(@javax.annotation.Nullable FileEntryType fileEntryType) {
    
    this.fileEntryType = fileEntryType;
    return this;
  }

  /**
   * Get fileEntryType
   * @return fileEntryType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_ENTRY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileEntryType getFileEntryType() {
    return fileEntryType;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_ENTRY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileEntryType(@javax.annotation.Nullable FileEntryType fileEntryType) {
    this.fileEntryType = fileEntryType;
  }

  public FolderDtoString id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The file entry ID.
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

  public FolderDtoString rootFolderId(@javax.annotation.Nullable String rootFolderId) {
    this.rootFolderId = JsonNullable.<String>of(rootFolderId);
    
    return this;
  }

  /**
   * The root folder ID of the file entry.
   * @return rootFolderId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRootFolderId() {
        return rootFolderId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRootFolderId_JsonNullable() {
    return rootFolderId;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOT_FOLDER_ID)
  public void setRootFolderId_JsonNullable(JsonNullable<String> rootFolderId) {
    this.rootFolderId = rootFolderId;
  }

  public void setRootFolderId(@javax.annotation.Nullable String rootFolderId) {
    this.rootFolderId = JsonNullable.<String>of(rootFolderId);
  }

  public FolderDtoString originId(@javax.annotation.Nullable String originId) {
    this.originId = JsonNullable.<String>of(originId);
    
    return this;
  }

  /**
   * The origin ID of the file entry.
   * @return originId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOriginId() {
        return originId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOriginId_JsonNullable() {
    return originId;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGIN_ID)
  public void setOriginId_JsonNullable(JsonNullable<String> originId) {
    this.originId = originId;
  }

  public void setOriginId(@javax.annotation.Nullable String originId) {
    this.originId = JsonNullable.<String>of(originId);
  }

  public FolderDtoString originRoomId(@javax.annotation.Nullable String originRoomId) {
    this.originRoomId = JsonNullable.<String>of(originRoomId);
    
    return this;
  }

  /**
   * The origin room ID of the file entry.
   * @return originRoomId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOriginRoomId() {
        return originRoomId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ROOM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOriginRoomId_JsonNullable() {
    return originRoomId;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGIN_ROOM_ID)
  public void setOriginRoomId_JsonNullable(JsonNullable<String> originRoomId) {
    this.originRoomId = originRoomId;
  }

  public void setOriginRoomId(@javax.annotation.Nullable String originRoomId) {
    this.originRoomId = JsonNullable.<String>of(originRoomId);
  }

  public FolderDtoString originTitle(@javax.annotation.Nullable String originTitle) {
    this.originTitle = JsonNullable.<String>of(originTitle);
    
    return this;
  }

  /**
   * The origin title of the file entry.
   * @return originTitle
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOriginTitle() {
        return originTitle.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORIGIN_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOriginTitle_JsonNullable() {
    return originTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGIN_TITLE)
  public void setOriginTitle_JsonNullable(JsonNullable<String> originTitle) {
    this.originTitle = originTitle;
  }

  public void setOriginTitle(@javax.annotation.Nullable String originTitle) {
    this.originTitle = JsonNullable.<String>of(originTitle);
  }

  public FolderDtoString originRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
    this.originRoomTitle = JsonNullable.<String>of(originRoomTitle);
    
    return this;
  }

  /**
   * The origin room title of the file entry.
   * @return originRoomTitle
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOriginRoomTitle() {
        return originRoomTitle.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ROOM_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOriginRoomTitle_JsonNullable() {
    return originRoomTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGIN_ROOM_TITLE)
  public void setOriginRoomTitle_JsonNullable(JsonNullable<String> originRoomTitle) {
    this.originRoomTitle = originRoomTitle;
  }

  public void setOriginRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
    this.originRoomTitle = JsonNullable.<String>of(originRoomTitle);
  }

  public FolderDtoString canShare(@javax.annotation.Nullable Boolean canShare) {
    
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

  public FolderDtoString shareSettings(@javax.annotation.Nullable FileEntryDtoIntegerAllOfShareSettings shareSettings) {
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

  public FolderDtoString security(@javax.annotation.Nullable FileEntryDtoIntegerAllOfSecurity security) {
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

  public FolderDtoString availableShareRights(@javax.annotation.Nullable FileEntryDtoIntegerAllOfAvailableShareRights availableShareRights) {
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

  public FolderDtoString requestToken(@javax.annotation.Nullable String requestToken) {
    this.requestToken = JsonNullable.<String>of(requestToken);
    
    return this;
  }

  /**
   * The request token of the file entry.
   * @return requestToken
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRequestToken() {
        return requestToken.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_REQUEST_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRequestToken_JsonNullable() {
    return requestToken;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUEST_TOKEN)
  public void setRequestToken_JsonNullable(JsonNullable<String> requestToken) {
    this.requestToken = requestToken;
  }

  public void setRequestToken(@javax.annotation.Nullable String requestToken) {
    this.requestToken = JsonNullable.<String>of(requestToken);
  }

  public FolderDtoString external(@javax.annotation.Nullable Boolean external) {
    this.external = JsonNullable.<Boolean>of(external);
    
    return this;
  }

  /**
   * Specifies if the folder can be accessed via an external link or not.
   * @return external
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getExternal() {
        return external.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getExternal_JsonNullable() {
    return external;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL)
  public void setExternal_JsonNullable(JsonNullable<Boolean> external) {
    this.external = external;
  }

  public void setExternal(@javax.annotation.Nullable Boolean external) {
    this.external = JsonNullable.<Boolean>of(external);
  }

  public FolderDtoString expirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public FolderDtoString isLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
    this.isLinkExpired = JsonNullable.<Boolean>of(isLinkExpired);
    
    return this;
  }

  /**
   * Indicates whether the shareable link associated with the file or folder has expired.
   * @return isLinkExpired
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsLinkExpired() {
        return isLinkExpired.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_LINK_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsLinkExpired_JsonNullable() {
    return isLinkExpired;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_LINK_EXPIRED)
  public void setIsLinkExpired_JsonNullable(JsonNullable<Boolean> isLinkExpired) {
    this.isLinkExpired = isLinkExpired;
  }

  public void setIsLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
    this.isLinkExpired = JsonNullable.<Boolean>of(isLinkExpired);
  }

  public FolderDtoString parentId(@javax.annotation.Nullable String parentId) {
    this.parentId = JsonNullable.<String>of(parentId);
    
    return this;
  }

  /**
   * The parent folder ID of the folder.
   * @return parentId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getParentId() {
        return parentId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getParentId_JsonNullable() {
    return parentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  public void setParentId_JsonNullable(JsonNullable<String> parentId) {
    this.parentId = parentId;
  }

  public void setParentId(@javax.annotation.Nullable String parentId) {
    this.parentId = JsonNullable.<String>of(parentId);
  }

  public FolderDtoString filesCount(@javax.annotation.Nullable Integer filesCount) {
    
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

  public FolderDtoString foldersCount(@javax.annotation.Nullable Integer foldersCount) {
    
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

  public FolderDtoString isShareable(@javax.annotation.Nullable Boolean isShareable) {
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

  public FolderDtoString _new(@javax.annotation.Nullable Integer _new) {
    
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

  public FolderDtoString mute(@javax.annotation.Nullable Boolean mute) {
    
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

  public FolderDtoString tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public FolderDtoString addTagsItem(String tagsItem) {
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

  public FolderDtoString logo(@javax.annotation.Nullable Logo logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Logo getLogo() {
    return logo;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable Logo logo) {
    this.logo = logo;
  }

  public FolderDtoString pinned(@javax.annotation.Nullable Boolean pinned) {
    
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

  public FolderDtoString roomType(@javax.annotation.Nullable RoomType roomType) {
    
    this.roomType = roomType;
    return this;
  }

  /**
   * Get roomType
   * @return roomType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoomType getRoomType() {
    return roomType;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomType(@javax.annotation.Nullable RoomType roomType) {
    this.roomType = roomType;
  }

  public FolderDtoString _private(@javax.annotation.Nullable Boolean _private) {
    
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

  public FolderDtoString indexing(@javax.annotation.Nullable Boolean indexing) {
    
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

  public FolderDtoString denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    
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

  public FolderDtoString lifetime(@javax.annotation.Nullable RoomDataLifetimeDto lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

  /**
   * Get lifetime
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

  public FolderDtoString watermark(@javax.annotation.Nullable WatermarkDto watermark) {
    
    this.watermark = watermark;
    return this;
  }

  /**
   * Get watermark
   * @return watermark
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WatermarkDto getWatermark() {
    return watermark;
  }


  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermark(@javax.annotation.Nullable WatermarkDto watermark) {
    this.watermark = watermark;
  }

  public FolderDtoString type(@javax.annotation.Nullable FolderType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FolderType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable FolderType type) {
    this.type = type;
  }

  public FolderDtoString inRoom(@javax.annotation.Nullable Boolean inRoom) {
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

  public FolderDtoString quotaLimit(@javax.annotation.Nullable Long quotaLimit) {
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

  public FolderDtoString isCustomQuota(@javax.annotation.Nullable Boolean isCustomQuota) {
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

  public FolderDtoString usedSpace(@javax.annotation.Nullable Long usedSpace) {
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

  public FolderDtoString passwordProtected(@javax.annotation.Nullable Boolean passwordProtected) {
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

  public FolderDtoString expired(@javax.annotation.Nullable Boolean expired) {
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

  public FolderDtoString chatSettings(@javax.annotation.Nullable ChatSettingsDto chatSettings) {
    
    this.chatSettings = chatSettings;
    return this;
  }

  /**
   * Get chatSettings
   * @return chatSettings
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CHAT_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChatSettingsDto getChatSettings() {
    return chatSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAT_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChatSettings(@javax.annotation.Nullable ChatSettingsDto chatSettings) {
    this.chatSettings = chatSettings;
  }

  public FolderDtoString rootRoomType(@javax.annotation.Nullable RoomType rootRoomType) {
    
    this.rootRoomType = rootRoomType;
    return this;
  }

  /**
   * Get rootRoomType
   * @return rootRoomType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOT_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoomType getRootRoomType() {
    return rootRoomType;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT_ROOM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootRoomType(@javax.annotation.Nullable RoomType rootRoomType) {
    this.rootRoomType = rootRoomType;
  }

  public FolderDtoString saveFormAsXLSX(@javax.annotation.Nullable Boolean saveFormAsXLSX) {
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

  public FolderDtoString sendFormToExternalDB(@javax.annotation.Nullable Boolean sendFormToExternalDB) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderDtoString folderDtoString = (FolderDtoString) o;
    return equalsNullable(this.title, folderDtoString.title) &&
        Objects.equals(this.access, folderDtoString.access) &&
        Objects.equals(this.sharedBy, folderDtoString.sharedBy) &&
        Objects.equals(this.ownedBy, folderDtoString.ownedBy) &&
        Objects.equals(this.shared, folderDtoString.shared) &&
        Objects.equals(this.sharedForUser, folderDtoString.sharedForUser) &&
        Objects.equals(this.parentShared, folderDtoString.parentShared) &&
        equalsNullable(this.shortWebUrl, folderDtoString.shortWebUrl) &&
        Objects.equals(this.created, folderDtoString.created) &&
        Objects.equals(this.createdBy, folderDtoString.createdBy) &&
        Objects.equals(this.updated, folderDtoString.updated) &&
        Objects.equals(this.autoDelete, folderDtoString.autoDelete) &&
        Objects.equals(this.rootFolderType, folderDtoString.rootFolderType) &&
        Objects.equals(this.parentRoomType, folderDtoString.parentRoomType) &&
        Objects.equals(this.updatedBy, folderDtoString.updatedBy) &&
        equalsNullable(this.providerItem, folderDtoString.providerItem) &&
        equalsNullable(this.providerKey, folderDtoString.providerKey) &&
        equalsNullable(this.providerId, folderDtoString.providerId) &&
        equalsNullable(this.order, folderDtoString.order) &&
        equalsNullable(this.isFavorite, folderDtoString.isFavorite) &&
        Objects.equals(this.fileEntryType, folderDtoString.fileEntryType) &&
        equalsNullable(this.id, folderDtoString.id) &&
        equalsNullable(this.rootFolderId, folderDtoString.rootFolderId) &&
        equalsNullable(this.originId, folderDtoString.originId) &&
        equalsNullable(this.originRoomId, folderDtoString.originRoomId) &&
        equalsNullable(this.originTitle, folderDtoString.originTitle) &&
        equalsNullable(this.originRoomTitle, folderDtoString.originRoomTitle) &&
        Objects.equals(this.canShare, folderDtoString.canShare) &&
        equalsNullable(this.shareSettings, folderDtoString.shareSettings) &&
        equalsNullable(this.security, folderDtoString.security) &&
        equalsNullable(this.availableShareRights, folderDtoString.availableShareRights) &&
        equalsNullable(this.requestToken, folderDtoString.requestToken) &&
        equalsNullable(this.external, folderDtoString.external) &&
        Objects.equals(this.expirationDate, folderDtoString.expirationDate) &&
        equalsNullable(this.isLinkExpired, folderDtoString.isLinkExpired) &&
        equalsNullable(this.parentId, folderDtoString.parentId) &&
        Objects.equals(this.filesCount, folderDtoString.filesCount) &&
        Objects.equals(this.foldersCount, folderDtoString.foldersCount) &&
        equalsNullable(this.isShareable, folderDtoString.isShareable) &&
        Objects.equals(this._new, folderDtoString._new) &&
        Objects.equals(this.mute, folderDtoString.mute) &&
        equalsNullable(this.tags, folderDtoString.tags) &&
        Objects.equals(this.logo, folderDtoString.logo) &&
        Objects.equals(this.pinned, folderDtoString.pinned) &&
        Objects.equals(this.roomType, folderDtoString.roomType) &&
        Objects.equals(this._private, folderDtoString._private) &&
        Objects.equals(this.indexing, folderDtoString.indexing) &&
        Objects.equals(this.denyDownload, folderDtoString.denyDownload) &&
        Objects.equals(this.lifetime, folderDtoString.lifetime) &&
        Objects.equals(this.watermark, folderDtoString.watermark) &&
        Objects.equals(this.type, folderDtoString.type) &&
        equalsNullable(this.inRoom, folderDtoString.inRoom) &&
        equalsNullable(this.quotaLimit, folderDtoString.quotaLimit) &&
        equalsNullable(this.isCustomQuota, folderDtoString.isCustomQuota) &&
        equalsNullable(this.usedSpace, folderDtoString.usedSpace) &&
        equalsNullable(this.passwordProtected, folderDtoString.passwordProtected) &&
        equalsNullable(this.expired, folderDtoString.expired) &&
        Objects.equals(this.chatSettings, folderDtoString.chatSettings) &&
        Objects.equals(this.rootRoomType, folderDtoString.rootRoomType) &&
        equalsNullable(this.saveFormAsXLSX, folderDtoString.saveFormAsXLSX) &&
        equalsNullable(this.sendFormToExternalDB, folderDtoString.sendFormToExternalDB);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(title), access, sharedBy, ownedBy, shared, sharedForUser, parentShared, hashCodeNullable(shortWebUrl), created, createdBy, updated, autoDelete, rootFolderType, parentRoomType, updatedBy, hashCodeNullable(providerItem), hashCodeNullable(providerKey), hashCodeNullable(providerId), hashCodeNullable(order), hashCodeNullable(isFavorite), fileEntryType, hashCodeNullable(id), hashCodeNullable(rootFolderId), hashCodeNullable(originId), hashCodeNullable(originRoomId), hashCodeNullable(originTitle), hashCodeNullable(originRoomTitle), canShare, hashCodeNullable(shareSettings), hashCodeNullable(security), hashCodeNullable(availableShareRights), hashCodeNullable(requestToken), hashCodeNullable(external), expirationDate, hashCodeNullable(isLinkExpired), hashCodeNullable(parentId), filesCount, foldersCount, hashCodeNullable(isShareable), _new, mute, hashCodeNullable(tags), logo, pinned, roomType, _private, indexing, denyDownload, lifetime, watermark, type, hashCodeNullable(inRoom), hashCodeNullable(quotaLimit), hashCodeNullable(isCustomQuota), hashCodeNullable(usedSpace), hashCodeNullable(passwordProtected), hashCodeNullable(expired), chatSettings, rootRoomType, hashCodeNullable(saveFormAsXLSX), hashCodeNullable(sendFormToExternalDB));
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
    sb.append("class FolderDtoString {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedForUser: ").append(toIndentedString(sharedForUser)).append("\n");
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

    return joiner.toString();
  }

}

