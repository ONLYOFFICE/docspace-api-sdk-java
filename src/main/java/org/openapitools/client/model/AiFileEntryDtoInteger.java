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
import org.openapitools.client.model.AiApiDateTime;
import org.openapitools.client.model.AiEmployeeDto;
import org.openapitools.client.model.AiFileEntryType;
import org.openapitools.client.model.AiFileShare;
import org.openapitools.client.model.AiFolderType;
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
 * The generic file entry information.
 */
@JsonPropertyOrder({
  AiFileEntryDtoInteger.JSON_PROPERTY_TITLE,
  AiFileEntryDtoInteger.JSON_PROPERTY_ACCESS,
  AiFileEntryDtoInteger.JSON_PROPERTY_SHARED_BY,
  AiFileEntryDtoInteger.JSON_PROPERTY_OWNED_BY,
  AiFileEntryDtoInteger.JSON_PROPERTY_SHARED,
  AiFileEntryDtoInteger.JSON_PROPERTY_SHARED_FOR_USER,
  AiFileEntryDtoInteger.JSON_PROPERTY_SHARED_EXTERNAL,
  AiFileEntryDtoInteger.JSON_PROPERTY_PARENT_SHARED,
  AiFileEntryDtoInteger.JSON_PROPERTY_SHORT_WEB_URL,
  AiFileEntryDtoInteger.JSON_PROPERTY_CREATED,
  AiFileEntryDtoInteger.JSON_PROPERTY_CREATED_BY,
  AiFileEntryDtoInteger.JSON_PROPERTY_UPDATED,
  AiFileEntryDtoInteger.JSON_PROPERTY_AUTO_DELETE,
  AiFileEntryDtoInteger.JSON_PROPERTY_ROOT_FOLDER_TYPE,
  AiFileEntryDtoInteger.JSON_PROPERTY_PARENT_ROOM_TYPE,
  AiFileEntryDtoInteger.JSON_PROPERTY_UPDATED_BY,
  AiFileEntryDtoInteger.JSON_PROPERTY_PROVIDER_ITEM,
  AiFileEntryDtoInteger.JSON_PROPERTY_PROVIDER_KEY,
  AiFileEntryDtoInteger.JSON_PROPERTY_PROVIDER_ID,
  AiFileEntryDtoInteger.JSON_PROPERTY_ORDER,
  AiFileEntryDtoInteger.JSON_PROPERTY_IS_FAVORITE,
  AiFileEntryDtoInteger.JSON_PROPERTY_FILE_ENTRY_TYPE,
  AiFileEntryDtoInteger.JSON_PROPERTY_ID,
  AiFileEntryDtoInteger.JSON_PROPERTY_ROOT_FOLDER_ID,
  AiFileEntryDtoInteger.JSON_PROPERTY_ORIGIN_ID,
  AiFileEntryDtoInteger.JSON_PROPERTY_ORIGIN_ROOM_ID,
  AiFileEntryDtoInteger.JSON_PROPERTY_ORIGIN_TITLE,
  AiFileEntryDtoInteger.JSON_PROPERTY_ORIGIN_ROOM_TITLE,
  AiFileEntryDtoInteger.JSON_PROPERTY_CAN_SHARE,
  AiFileEntryDtoInteger.JSON_PROPERTY_SHARE_SETTINGS,
  AiFileEntryDtoInteger.JSON_PROPERTY_SECURITY,
  AiFileEntryDtoInteger.JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS,
  AiFileEntryDtoInteger.JSON_PROPERTY_REQUEST_TOKEN,
  AiFileEntryDtoInteger.JSON_PROPERTY_EXTERNAL,
  AiFileEntryDtoInteger.JSON_PROPERTY_EXPIRATION_DATE,
  AiFileEntryDtoInteger.JSON_PROPERTY_IS_LINK_EXPIRED
})

public class AiFileEntryDtoInteger {
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
  @javax.annotation.Nullable  private AiApiDateTime expirationDate;

  public static final String JSON_PROPERTY_IS_LINK_EXPIRED = "isLinkExpired";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isLinkExpired = JsonNullable.<Boolean>undefined();

  public AiFileEntryDtoInteger() {
  }


  public AiFileEntryDtoInteger title(@javax.annotation.Nullable String title) {
    
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

  public AiFileEntryDtoInteger access(@javax.annotation.Nullable AiFileShare access) {
    
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

  public AiFileEntryDtoInteger sharedBy(@javax.annotation.Nullable AiEmployeeDto sharedBy) {
    
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

  public AiFileEntryDtoInteger ownedBy(@javax.annotation.Nullable AiEmployeeDto ownedBy) {
    
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

  public AiFileEntryDtoInteger shared(@javax.annotation.Nullable Boolean shared) {
    
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

  public AiFileEntryDtoInteger sharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    
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

  public AiFileEntryDtoInteger sharedExternal(@javax.annotation.Nullable Boolean sharedExternal) {
    
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

  public AiFileEntryDtoInteger parentShared(@javax.annotation.Nullable Boolean parentShared) {
    
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

  public AiFileEntryDtoInteger shortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
    
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

  public AiFileEntryDtoInteger created(@javax.annotation.Nullable AiApiDateTime created) {
    
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

  public AiFileEntryDtoInteger createdBy(@javax.annotation.Nullable AiEmployeeDto createdBy) {
    
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

  public AiFileEntryDtoInteger updated(@javax.annotation.Nullable AiApiDateTime updated) {
    
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

  public AiFileEntryDtoInteger autoDelete(@javax.annotation.Nullable AiApiDateTime autoDelete) {
    
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

  public AiFileEntryDtoInteger rootFolderType(@javax.annotation.Nullable AiFolderType rootFolderType) {
    
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

  public AiFileEntryDtoInteger parentRoomType(@javax.annotation.Nullable AiFolderType parentRoomType) {
    
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

  public AiFileEntryDtoInteger updatedBy(@javax.annotation.Nullable AiEmployeeDto updatedBy) {
    
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

  public AiFileEntryDtoInteger providerItem(@javax.annotation.Nullable Boolean providerItem) {
    
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

  public AiFileEntryDtoInteger providerKey(@javax.annotation.Nullable String providerKey) {
    
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

  public AiFileEntryDtoInteger providerId(@javax.annotation.Nullable Integer providerId) {
    
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

  public AiFileEntryDtoInteger order(@javax.annotation.Nullable String order) {
    
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

  public AiFileEntryDtoInteger isFavorite(@javax.annotation.Nullable Boolean isFavorite) {
    
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

  public AiFileEntryDtoInteger fileEntryType(@javax.annotation.Nullable AiFileEntryType fileEntryType) {
    
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

  public AiFileEntryDtoInteger id(@javax.annotation.Nullable Integer id) {
    
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

  public AiFileEntryDtoInteger rootFolderId(@javax.annotation.Nullable Integer rootFolderId) {
    
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

  public AiFileEntryDtoInteger originId(@javax.annotation.Nullable Integer originId) {
    
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

  public AiFileEntryDtoInteger originRoomId(@javax.annotation.Nullable Integer originRoomId) {
    
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

  public AiFileEntryDtoInteger originTitle(@javax.annotation.Nullable String originTitle) {
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

  public AiFileEntryDtoInteger originRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
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

  public AiFileEntryDtoInteger canShare(@javax.annotation.Nullable Boolean canShare) {
    
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

  public AiFileEntryDtoInteger shareSettings(@javax.annotation.Nullable FileEntryDtoIntegerAllOfShareSettings shareSettings) {
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

  public AiFileEntryDtoInteger security(@javax.annotation.Nullable FileEntryDtoIntegerAllOfSecurity security) {
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

  public AiFileEntryDtoInteger availableShareRights(@javax.annotation.Nullable FileEntryDtoIntegerAllOfAvailableShareRights availableShareRights) {
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

  public AiFileEntryDtoInteger requestToken(@javax.annotation.Nullable String requestToken) {
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

  public AiFileEntryDtoInteger external(@javax.annotation.Nullable Boolean external) {
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

  public AiFileEntryDtoInteger expirationDate(@javax.annotation.Nullable AiApiDateTime expirationDate) {
    
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

  public AiFileEntryDtoInteger isLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiFileEntryDtoInteger aiFileEntryDtoInteger = (AiFileEntryDtoInteger) o;
    return Objects.equals(this.title, aiFileEntryDtoInteger.title) &&
        Objects.equals(this.access, aiFileEntryDtoInteger.access) &&
        Objects.equals(this.sharedBy, aiFileEntryDtoInteger.sharedBy) &&
        Objects.equals(this.ownedBy, aiFileEntryDtoInteger.ownedBy) &&
        Objects.equals(this.shared, aiFileEntryDtoInteger.shared) &&
        Objects.equals(this.sharedForUser, aiFileEntryDtoInteger.sharedForUser) &&
        Objects.equals(this.sharedExternal, aiFileEntryDtoInteger.sharedExternal) &&
        Objects.equals(this.parentShared, aiFileEntryDtoInteger.parentShared) &&
        Objects.equals(this.shortWebUrl, aiFileEntryDtoInteger.shortWebUrl) &&
        Objects.equals(this.created, aiFileEntryDtoInteger.created) &&
        Objects.equals(this.createdBy, aiFileEntryDtoInteger.createdBy) &&
        Objects.equals(this.updated, aiFileEntryDtoInteger.updated) &&
        Objects.equals(this.autoDelete, aiFileEntryDtoInteger.autoDelete) &&
        Objects.equals(this.rootFolderType, aiFileEntryDtoInteger.rootFolderType) &&
        Objects.equals(this.parentRoomType, aiFileEntryDtoInteger.parentRoomType) &&
        Objects.equals(this.updatedBy, aiFileEntryDtoInteger.updatedBy) &&
        Objects.equals(this.providerItem, aiFileEntryDtoInteger.providerItem) &&
        Objects.equals(this.providerKey, aiFileEntryDtoInteger.providerKey) &&
        Objects.equals(this.providerId, aiFileEntryDtoInteger.providerId) &&
        Objects.equals(this.order, aiFileEntryDtoInteger.order) &&
        Objects.equals(this.isFavorite, aiFileEntryDtoInteger.isFavorite) &&
        Objects.equals(this.fileEntryType, aiFileEntryDtoInteger.fileEntryType) &&
        Objects.equals(this.id, aiFileEntryDtoInteger.id) &&
        Objects.equals(this.rootFolderId, aiFileEntryDtoInteger.rootFolderId) &&
        Objects.equals(this.originId, aiFileEntryDtoInteger.originId) &&
        Objects.equals(this.originRoomId, aiFileEntryDtoInteger.originRoomId) &&
        equalsNullable(this.originTitle, aiFileEntryDtoInteger.originTitle) &&
        equalsNullable(this.originRoomTitle, aiFileEntryDtoInteger.originRoomTitle) &&
        Objects.equals(this.canShare, aiFileEntryDtoInteger.canShare) &&
        equalsNullable(this.shareSettings, aiFileEntryDtoInteger.shareSettings) &&
        equalsNullable(this.security, aiFileEntryDtoInteger.security) &&
        equalsNullable(this.availableShareRights, aiFileEntryDtoInteger.availableShareRights) &&
        equalsNullable(this.requestToken, aiFileEntryDtoInteger.requestToken) &&
        equalsNullable(this.external, aiFileEntryDtoInteger.external) &&
        Objects.equals(this.expirationDate, aiFileEntryDtoInteger.expirationDate) &&
        equalsNullable(this.isLinkExpired, aiFileEntryDtoInteger.isLinkExpired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, access, sharedBy, ownedBy, shared, sharedForUser, sharedExternal, parentShared, shortWebUrl, created, createdBy, updated, autoDelete, rootFolderType, parentRoomType, updatedBy, providerItem, providerKey, providerId, order, isFavorite, fileEntryType, id, rootFolderId, originId, originRoomId, hashCodeNullable(originTitle), hashCodeNullable(originRoomTitle), canShare, hashCodeNullable(shareSettings), hashCodeNullable(security), hashCodeNullable(availableShareRights), hashCodeNullable(requestToken), hashCodeNullable(external), expirationDate, hashCodeNullable(isLinkExpired));
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
    sb.append("class AiFileEntryDtoInteger {\n");
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

    return joiner.toString();
  }

}

