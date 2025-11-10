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
import java.net.URI;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.DraftLocationInteger;
import org.openapitools.client.model.EmployeeDto;
import org.openapitools.client.model.FileDtoIntegerAllOfViewAccessibility;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfAvailableShareRights;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfSecurity;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfShareSettings;
import org.openapitools.client.model.FileEntryType;
import org.openapitools.client.model.FileShare;
import org.openapitools.client.model.FileStatus;
import org.openapitools.client.model.FileType;
import org.openapitools.client.model.FolderType;
import org.openapitools.client.model.FormFillingStatus;
import org.openapitools.client.model.Size;
import org.openapitools.client.model.Thumbnail;
import org.openapitools.client.model.VectorizationStatus;
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
 * The file parameters.
 */
@JsonPropertyOrder({
  FileDtoInteger.JSON_PROPERTY_TITLE,
  FileDtoInteger.JSON_PROPERTY_ACCESS,
  FileDtoInteger.JSON_PROPERTY_SHARED,
  FileDtoInteger.JSON_PROPERTY_SHARED_FOR_USER,
  FileDtoInteger.JSON_PROPERTY_PARENT_SHARED,
  FileDtoInteger.JSON_PROPERTY_SHORT_WEB_URL,
  FileDtoInteger.JSON_PROPERTY_CREATED,
  FileDtoInteger.JSON_PROPERTY_CREATED_BY,
  FileDtoInteger.JSON_PROPERTY_UPDATED,
  FileDtoInteger.JSON_PROPERTY_AUTO_DELETE,
  FileDtoInteger.JSON_PROPERTY_ROOT_FOLDER_TYPE,
  FileDtoInteger.JSON_PROPERTY_PARENT_ROOM_TYPE,
  FileDtoInteger.JSON_PROPERTY_UPDATED_BY,
  FileDtoInteger.JSON_PROPERTY_PROVIDER_ITEM,
  FileDtoInteger.JSON_PROPERTY_PROVIDER_KEY,
  FileDtoInteger.JSON_PROPERTY_PROVIDER_ID,
  FileDtoInteger.JSON_PROPERTY_ORDER,
  FileDtoInteger.JSON_PROPERTY_IS_FAVORITE,
  FileDtoInteger.JSON_PROPERTY_FILE_ENTRY_TYPE,
  FileDtoInteger.JSON_PROPERTY_ID,
  FileDtoInteger.JSON_PROPERTY_ROOT_FOLDER_ID,
  FileDtoInteger.JSON_PROPERTY_ORIGIN_ID,
  FileDtoInteger.JSON_PROPERTY_ORIGIN_ROOM_ID,
  FileDtoInteger.JSON_PROPERTY_ORIGIN_TITLE,
  FileDtoInteger.JSON_PROPERTY_ORIGIN_ROOM_TITLE,
  FileDtoInteger.JSON_PROPERTY_CAN_SHARE,
  FileDtoInteger.JSON_PROPERTY_SHARE_SETTINGS,
  FileDtoInteger.JSON_PROPERTY_SECURITY,
  FileDtoInteger.JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS,
  FileDtoInteger.JSON_PROPERTY_REQUEST_TOKEN,
  FileDtoInteger.JSON_PROPERTY_EXTERNAL,
  FileDtoInteger.JSON_PROPERTY_EXPIRATION_DATE,
  FileDtoInteger.JSON_PROPERTY_IS_LINK_EXPIRED,
  FileDtoInteger.JSON_PROPERTY_FOLDER_ID,
  FileDtoInteger.JSON_PROPERTY_VERSION,
  FileDtoInteger.JSON_PROPERTY_VERSION_GROUP,
  FileDtoInteger.JSON_PROPERTY_CONTENT_LENGTH,
  FileDtoInteger.JSON_PROPERTY_PURE_CONTENT_LENGTH,
  FileDtoInteger.JSON_PROPERTY_FILE_STATUS,
  FileDtoInteger.JSON_PROPERTY_MUTE,
  FileDtoInteger.JSON_PROPERTY_VIEW_URL,
  FileDtoInteger.JSON_PROPERTY_WEB_URL,
  FileDtoInteger.JSON_PROPERTY_FILE_TYPE,
  FileDtoInteger.JSON_PROPERTY_FILE_EXST,
  FileDtoInteger.JSON_PROPERTY_COMMENT,
  FileDtoInteger.JSON_PROPERTY_ENCRYPTED,
  FileDtoInteger.JSON_PROPERTY_THUMBNAIL_URL,
  FileDtoInteger.JSON_PROPERTY_THUMBNAIL_STATUS,
  FileDtoInteger.JSON_PROPERTY_LOCKED,
  FileDtoInteger.JSON_PROPERTY_LOCKED_BY,
  FileDtoInteger.JSON_PROPERTY_HAS_DRAFT,
  FileDtoInteger.JSON_PROPERTY_FORM_FILLING_STATUS,
  FileDtoInteger.JSON_PROPERTY_IS_FORM,
  FileDtoInteger.JSON_PROPERTY_CUSTOM_FILTER_ENABLED,
  FileDtoInteger.JSON_PROPERTY_CUSTOM_FILTER_ENABLED_BY,
  FileDtoInteger.JSON_PROPERTY_START_FILLING,
  FileDtoInteger.JSON_PROPERTY_IN_PROCESS_FOLDER_ID,
  FileDtoInteger.JSON_PROPERTY_IN_PROCESS_FOLDER_TITLE,
  FileDtoInteger.JSON_PROPERTY_DRAFT_LOCATION,
  FileDtoInteger.JSON_PROPERTY_VIEW_ACCESSIBILITY,
  FileDtoInteger.JSON_PROPERTY_LAST_OPENED,
  FileDtoInteger.JSON_PROPERTY_EXPIRED,
  FileDtoInteger.JSON_PROPERTY_VECTORIZATION_STATUS,
  FileDtoInteger.JSON_PROPERTY_DIMENSIONS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FileDtoInteger {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable
  private FileShare access;

  public static final String JSON_PROPERTY_SHARED = "shared";
  @javax.annotation.Nullable
  private Boolean shared;

  public static final String JSON_PROPERTY_SHARED_FOR_USER = "sharedForUser";
  @javax.annotation.Nullable
  private Boolean sharedForUser;

  public static final String JSON_PROPERTY_PARENT_SHARED = "parentShared";
  @javax.annotation.Nullable
  private Boolean parentShared;

  public static final String JSON_PROPERTY_SHORT_WEB_URL = "shortWebUrl";
  @javax.annotation.Nullable
  private JsonNullable<URI> shortWebUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable
  private ApiDateTime created;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private EmployeeDto createdBy;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  @javax.annotation.Nullable
  private ApiDateTime updated;

  public static final String JSON_PROPERTY_AUTO_DELETE = "autoDelete";
  @javax.annotation.Nullable
  private ApiDateTime autoDelete;

  public static final String JSON_PROPERTY_ROOT_FOLDER_TYPE = "rootFolderType";
  @javax.annotation.Nullable
  private FolderType rootFolderType;

  public static final String JSON_PROPERTY_PARENT_ROOM_TYPE = "parentRoomType";
  @javax.annotation.Nullable
  private FolderType parentRoomType;

  public static final String JSON_PROPERTY_UPDATED_BY = "updatedBy";
  @javax.annotation.Nullable
  private EmployeeDto updatedBy;

  public static final String JSON_PROPERTY_PROVIDER_ITEM = "providerItem";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> providerItem = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PROVIDER_KEY = "providerKey";
  @javax.annotation.Nullable
  private JsonNullable<String> providerKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  @javax.annotation.Nullable
  private JsonNullable<Integer> providerId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nullable
  private JsonNullable<String> order = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_FAVORITE = "isFavorite";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> isFavorite = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FILE_ENTRY_TYPE = "fileEntryType";
  @javax.annotation.Nullable
  private FileEntryType fileEntryType;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_ROOT_FOLDER_ID = "rootFolderId";
  @javax.annotation.Nullable
  private Integer rootFolderId;

  public static final String JSON_PROPERTY_ORIGIN_ID = "originId";
  @javax.annotation.Nullable
  private Integer originId;

  public static final String JSON_PROPERTY_ORIGIN_ROOM_ID = "originRoomId";
  @javax.annotation.Nullable
  private Integer originRoomId;

  public static final String JSON_PROPERTY_ORIGIN_TITLE = "originTitle";
  @javax.annotation.Nullable
  private JsonNullable<String> originTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGIN_ROOM_TITLE = "originRoomTitle";
  @javax.annotation.Nullable
  private JsonNullable<String> originRoomTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAN_SHARE = "canShare";
  @javax.annotation.Nullable
  private Boolean canShare;

  public static final String JSON_PROPERTY_SHARE_SETTINGS = "shareSettings";
  @javax.annotation.Nullable
  private JsonNullable<FileEntryDtoIntegerAllOfShareSettings> shareSettings = JsonNullable.<FileEntryDtoIntegerAllOfShareSettings>undefined();

  public static final String JSON_PROPERTY_SECURITY = "security";
  @javax.annotation.Nullable
  private JsonNullable<FileEntryDtoIntegerAllOfSecurity> security = JsonNullable.<FileEntryDtoIntegerAllOfSecurity>undefined();

  public static final String JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS = "availableShareRights";
  @javax.annotation.Nullable
  private JsonNullable<FileEntryDtoIntegerAllOfAvailableShareRights> availableShareRights = JsonNullable.<FileEntryDtoIntegerAllOfAvailableShareRights>undefined();

  public static final String JSON_PROPERTY_REQUEST_TOKEN = "requestToken";
  @javax.annotation.Nullable
  private JsonNullable<String> requestToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL = "external";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> external = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  @javax.annotation.Nullable
  private ApiDateTime expirationDate;

  public static final String JSON_PROPERTY_IS_LINK_EXPIRED = "isLinkExpired";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> isLinkExpired = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nullable
  private Integer folderId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_VERSION_GROUP = "versionGroup";
  @javax.annotation.Nullable
  private Integer versionGroup;

  public static final String JSON_PROPERTY_CONTENT_LENGTH = "contentLength";
  @javax.annotation.Nullable
  private JsonNullable<String> contentLength = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PURE_CONTENT_LENGTH = "pureContentLength";
  @javax.annotation.Nullable
  private JsonNullable<Long> pureContentLength = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_FILE_STATUS = "fileStatus";
  @javax.annotation.Nullable
  private FileStatus fileStatus;

  public static final String JSON_PROPERTY_MUTE = "mute";
  @javax.annotation.Nullable
  private Boolean mute;

  public static final String JSON_PROPERTY_VIEW_URL = "viewUrl";
  @javax.annotation.Nullable
  private JsonNullable<URI> viewUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_WEB_URL = "webUrl";
  @javax.annotation.Nullable
  private JsonNullable<URI> webUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  @javax.annotation.Nullable
  private FileType fileType;

  public static final String JSON_PROPERTY_FILE_EXST = "fileExst";
  @javax.annotation.Nullable
  private JsonNullable<String> fileExst = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENCRYPTED = "encrypted";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> encrypted = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_THUMBNAIL_URL = "thumbnailUrl";
  @javax.annotation.Nullable
  private JsonNullable<URI> thumbnailUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_THUMBNAIL_STATUS = "thumbnailStatus";
  @javax.annotation.Nullable
  private Thumbnail thumbnailStatus;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> locked = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LOCKED_BY = "lockedBy";
  @javax.annotation.Nullable
  private JsonNullable<String> lockedBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_DRAFT = "hasDraft";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> hasDraft = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FORM_FILLING_STATUS = "formFillingStatus";
  @javax.annotation.Nullable
  private FormFillingStatus formFillingStatus;

  public static final String JSON_PROPERTY_IS_FORM = "isForm";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> isForm = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FILTER_ENABLED = "customFilterEnabled";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> customFilterEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FILTER_ENABLED_BY = "customFilterEnabledBy";
  @javax.annotation.Nullable
  private JsonNullable<String> customFilterEnabledBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_START_FILLING = "startFilling";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> startFilling = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IN_PROCESS_FOLDER_ID = "inProcessFolderId";
  @javax.annotation.Nullable
  private JsonNullable<Integer> inProcessFolderId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_IN_PROCESS_FOLDER_TITLE = "inProcessFolderTitle";
  @javax.annotation.Nullable
  private JsonNullable<String> inProcessFolderTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DRAFT_LOCATION = "draftLocation";
  @javax.annotation.Nullable
  private DraftLocationInteger draftLocation;

  public static final String JSON_PROPERTY_VIEW_ACCESSIBILITY = "viewAccessibility";
  @javax.annotation.Nullable
  private JsonNullable<FileDtoIntegerAllOfViewAccessibility> viewAccessibility = JsonNullable.<FileDtoIntegerAllOfViewAccessibility>undefined();

  public static final String JSON_PROPERTY_LAST_OPENED = "lastOpened";
  @javax.annotation.Nullable
  private ApiDateTime lastOpened;

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  @javax.annotation.Nullable
  private ApiDateTime expired;

  public static final String JSON_PROPERTY_VECTORIZATION_STATUS = "vectorizationStatus";
  @javax.annotation.Nullable
  private VectorizationStatus vectorizationStatus;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  @javax.annotation.Nullable
  private Size dimensions;

  public FileDtoInteger() {
  }

  public FileDtoInteger title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The file entry title.
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

  public FileDtoInteger access(@javax.annotation.Nullable FileShare access) {
    
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileShare getAccess() {
    return access;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable FileShare access) {
    this.access = access;
  }

  public FileDtoInteger shared(@javax.annotation.Nullable Boolean shared) {
    
    this.shared = shared;
    return this;
  }

  /**
   * Specifies if the file entry is shared via link or not.
   * @return shared
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShared() {
    return shared;
  }


  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShared(@javax.annotation.Nullable Boolean shared) {
    this.shared = shared;
  }

  public FileDtoInteger sharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    
    this.sharedForUser = sharedForUser;
    return this;
  }

  /**
   * Specifies if the file entry is shared for user or not.
   * @return sharedForUser
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_FOR_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSharedForUser() {
    return sharedForUser;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_FOR_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    this.sharedForUser = sharedForUser;
  }

  public FileDtoInteger parentShared(@javax.annotation.Nullable Boolean parentShared) {
    
    this.parentShared = parentShared;
    return this;
  }

  /**
   * Indicates whether the parent entity is shared.
   * @return parentShared
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getParentShared() {
    return parentShared;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentShared(@javax.annotation.Nullable Boolean parentShared) {
    this.parentShared = parentShared;
  }

  public FileDtoInteger shortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
    this.shortWebUrl = JsonNullable.<URI>of(shortWebUrl);
    
    return this;
  }

  /**
   * The short Web URL.
   * @return shortWebUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getShortWebUrl() {
        return shortWebUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHORT_WEB_URL)
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

  public FileDtoInteger created(@javax.annotation.Nullable ApiDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@javax.annotation.Nullable ApiDateTime created) {
    this.created = created;
  }

  public FileDtoInteger createdBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    this.createdBy = createdBy;
  }

  public FileDtoInteger updated(@javax.annotation.Nullable ApiDateTime updated) {
    
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getUpdated() {
    return updated;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(@javax.annotation.Nullable ApiDateTime updated) {
    this.updated = updated;
  }

  public FileDtoInteger autoDelete(@javax.annotation.Nullable ApiDateTime autoDelete) {
    
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * Get autoDelete
   * @return autoDelete
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getAutoDelete() {
    return autoDelete;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoDelete(@javax.annotation.Nullable ApiDateTime autoDelete) {
    this.autoDelete = autoDelete;
  }

  public FileDtoInteger rootFolderType(@javax.annotation.Nullable FolderType rootFolderType) {
    
    this.rootFolderType = rootFolderType;
    return this;
  }

  /**
   * Get rootFolderType
   * @return rootFolderType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOT_FOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FolderType getRootFolderType() {
    return rootFolderType;
  }


  @JsonProperty(JSON_PROPERTY_ROOT_FOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootFolderType(@javax.annotation.Nullable FolderType rootFolderType) {
    this.rootFolderType = rootFolderType;
  }

  public FileDtoInteger parentRoomType(@javax.annotation.Nullable FolderType parentRoomType) {
    
    this.parentRoomType = parentRoomType;
    return this;
  }

  /**
   * Get parentRoomType
   * @return parentRoomType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ROOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FolderType getParentRoomType() {
    return parentRoomType;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ROOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentRoomType(@javax.annotation.Nullable FolderType parentRoomType) {
    this.parentRoomType = parentRoomType;
  }

  public FileDtoInteger updatedBy(@javax.annotation.Nullable EmployeeDto updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getUpdatedBy() {
    return updatedBy;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedBy(@javax.annotation.Nullable EmployeeDto updatedBy) {
    this.updatedBy = updatedBy;
  }

  public FileDtoInteger providerItem(@javax.annotation.Nullable Boolean providerItem) {
    this.providerItem = JsonNullable.<Boolean>of(providerItem);
    
    return this;
  }

  /**
   * Specifies if the file entry provider is specified or not.
   * @return providerItem
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getProviderItem() {
        return providerItem.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_ITEM)
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

  public FileDtoInteger providerKey(@javax.annotation.Nullable String providerKey) {
    this.providerKey = JsonNullable.<String>of(providerKey);
    
    return this;
  }

  /**
   * The provider key of the file entry.
   * @return providerKey
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProviderKey() {
        return providerKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_KEY)
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

  public FileDtoInteger providerId(@javax.annotation.Nullable Integer providerId) {
    this.providerId = JsonNullable.<Integer>of(providerId);
    
    return this;
  }

  /**
   * The provider ID of the file entry.
   * @return providerId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getProviderId() {
        return providerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
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

  public FileDtoInteger order(@javax.annotation.Nullable String order) {
    this.order = JsonNullable.<String>of(order);
    
    return this;
  }

  /**
   * The order of the file entry.
   * @return order
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOrder() {
        return order.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER)
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

  public FileDtoInteger isFavorite(@javax.annotation.Nullable Boolean isFavorite) {
    this.isFavorite = JsonNullable.<Boolean>of(isFavorite);
    
    return this;
  }

  /**
   * Specifies if the file is a favorite or not.
   * @return isFavorite
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsFavorite() {
        return isFavorite.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
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

  public FileDtoInteger fileEntryType(@javax.annotation.Nullable FileEntryType fileEntryType) {
    
    this.fileEntryType = fileEntryType;
    return this;
  }

  /**
   * Get fileEntryType
   * @return fileEntryType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_ENTRY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileEntryType getFileEntryType() {
    return fileEntryType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_ENTRY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileEntryType(@javax.annotation.Nullable FileEntryType fileEntryType) {
    this.fileEntryType = fileEntryType;
  }

  public FileDtoInteger id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The file entry ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public FileDtoInteger rootFolderId(@javax.annotation.Nullable Integer rootFolderId) {
    
    this.rootFolderId = rootFolderId;
    return this;
  }

  /**
   * The root folder ID of the file entry.
   * @return rootFolderId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOT_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRootFolderId() {
    return rootFolderId;
  }


  @JsonProperty(JSON_PROPERTY_ROOT_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootFolderId(@javax.annotation.Nullable Integer rootFolderId) {
    this.rootFolderId = rootFolderId;
  }

  public FileDtoInteger originId(@javax.annotation.Nullable Integer originId) {
    
    this.originId = originId;
    return this;
  }

  /**
   * The origin ID of the file entry.
   * @return originId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOriginId() {
    return originId;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginId(@javax.annotation.Nullable Integer originId) {
    this.originId = originId;
  }

  public FileDtoInteger originRoomId(@javax.annotation.Nullable Integer originRoomId) {
    
    this.originRoomId = originRoomId;
    return this;
  }

  /**
   * The origin room ID of the file entry.
   * @return originRoomId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOriginRoomId() {
    return originRoomId;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginRoomId(@javax.annotation.Nullable Integer originRoomId) {
    this.originRoomId = originRoomId;
  }

  public FileDtoInteger originTitle(@javax.annotation.Nullable String originTitle) {
    this.originTitle = JsonNullable.<String>of(originTitle);
    
    return this;
  }

  /**
   * The origin title of the file entry.
   * @return originTitle
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOriginTitle() {
        return originTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGIN_TITLE)
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

  public FileDtoInteger originRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
    this.originRoomTitle = JsonNullable.<String>of(originRoomTitle);
    
    return this;
  }

  /**
   * The origin room title of the file entry.
   * @return originRoomTitle
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOriginRoomTitle() {
        return originRoomTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGIN_ROOM_TITLE)
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

  public FileDtoInteger canShare(@javax.annotation.Nullable Boolean canShare) {
    
    this.canShare = canShare;
    return this;
  }

  /**
   * Specifies if the file entry can be shared or not.
   * @return canShare
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanShare() {
    return canShare;
  }


  @JsonProperty(JSON_PROPERTY_CAN_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanShare(@javax.annotation.Nullable Boolean canShare) {
    this.canShare = canShare;
  }

  public FileDtoInteger shareSettings(@javax.annotation.Nullable FileEntryDtoIntegerAllOfShareSettings shareSettings) {
    this.shareSettings = JsonNullable.<FileEntryDtoIntegerAllOfShareSettings>of(shareSettings);
    
    return this;
  }

  /**
   * Get shareSettings
   * @return shareSettings
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public FileEntryDtoIntegerAllOfShareSettings getShareSettings() {
        return shareSettings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARE_SETTINGS)
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

  public FileDtoInteger security(@javax.annotation.Nullable FileEntryDtoIntegerAllOfSecurity security) {
    this.security = JsonNullable.<FileEntryDtoIntegerAllOfSecurity>of(security);
    
    return this;
  }

  /**
   * Get security
   * @return security
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public FileEntryDtoIntegerAllOfSecurity getSecurity() {
        return security.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECURITY)
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

  public FileDtoInteger availableShareRights(@javax.annotation.Nullable FileEntryDtoIntegerAllOfAvailableShareRights availableShareRights) {
    this.availableShareRights = JsonNullable.<FileEntryDtoIntegerAllOfAvailableShareRights>of(availableShareRights);
    
    return this;
  }

  /**
   * Get availableShareRights
   * @return availableShareRights
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public FileEntryDtoIntegerAllOfAvailableShareRights getAvailableShareRights() {
        return availableShareRights.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS)
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

  public FileDtoInteger requestToken(@javax.annotation.Nullable String requestToken) {
    this.requestToken = JsonNullable.<String>of(requestToken);
    
    return this;
  }

  /**
   * The request token of the file entry.
   * @return requestToken
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRequestToken() {
        return requestToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUEST_TOKEN)
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

  public FileDtoInteger external(@javax.annotation.Nullable Boolean external) {
    this.external = JsonNullable.<Boolean>of(external);
    
    return this;
  }

  /**
   * Specifies if the folder can be accessed via an external link or not.
   * @return external
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getExternal() {
        return external.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL)
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

  public FileDtoInteger expirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public FileDtoInteger isLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
    this.isLinkExpired = JsonNullable.<Boolean>of(isLinkExpired);
    
    return this;
  }

  /**
   * Indicates whether the shareable link associated with the file or folder has expired.
   * @return isLinkExpired
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsLinkExpired() {
        return isLinkExpired.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_LINK_EXPIRED)
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

  public FileDtoInteger folderId(@javax.annotation.Nullable Integer folderId) {
    
    this.folderId = folderId;
    return this;
  }

  /**
   * The folder ID where the file is located.
   * @return folderId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFolderId() {
    return folderId;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolderId(@javax.annotation.Nullable Integer folderId) {
    this.folderId = folderId;
  }

  public FileDtoInteger version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The file version.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }

  public FileDtoInteger versionGroup(@javax.annotation.Nullable Integer versionGroup) {
    
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * The version group of the file.
   * @return versionGroup
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersionGroup() {
    return versionGroup;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionGroup(@javax.annotation.Nullable Integer versionGroup) {
    this.versionGroup = versionGroup;
  }

  public FileDtoInteger contentLength(@javax.annotation.Nullable String contentLength) {
    this.contentLength = JsonNullable.<String>of(contentLength);
    
    return this;
  }

  /**
   * The content length of the file.
   * @return contentLength
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getContentLength() {
        return contentLength.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContentLength_JsonNullable() {
    return contentLength;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT_LENGTH)
  public void setContentLength_JsonNullable(JsonNullable<String> contentLength) {
    this.contentLength = contentLength;
  }

  public void setContentLength(@javax.annotation.Nullable String contentLength) {
    this.contentLength = JsonNullable.<String>of(contentLength);
  }

  public FileDtoInteger pureContentLength(@javax.annotation.Nullable Long pureContentLength) {
    this.pureContentLength = JsonNullable.<Long>of(pureContentLength);
    
    return this;
  }

  /**
   * The pure content length of the file.
   * @return pureContentLength
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getPureContentLength() {
        return pureContentLength.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PURE_CONTENT_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getPureContentLength_JsonNullable() {
    return pureContentLength;
  }
  
  @JsonProperty(JSON_PROPERTY_PURE_CONTENT_LENGTH)
  public void setPureContentLength_JsonNullable(JsonNullable<Long> pureContentLength) {
    this.pureContentLength = pureContentLength;
  }

  public void setPureContentLength(@javax.annotation.Nullable Long pureContentLength) {
    this.pureContentLength = JsonNullable.<Long>of(pureContentLength);
  }

  public FileDtoInteger fileStatus(@javax.annotation.Nullable FileStatus fileStatus) {
    
    this.fileStatus = fileStatus;
    return this;
  }

  /**
   * Get fileStatus
   * @return fileStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileStatus getFileStatus() {
    return fileStatus;
  }


  @JsonProperty(JSON_PROPERTY_FILE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileStatus(@javax.annotation.Nullable FileStatus fileStatus) {
    this.fileStatus = fileStatus;
  }

  public FileDtoInteger mute(@javax.annotation.Nullable Boolean mute) {
    
    this.mute = mute;
    return this;
  }

  /**
   * Specifies if the file is muted or not.
   * @return mute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMute() {
    return mute;
  }


  @JsonProperty(JSON_PROPERTY_MUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMute(@javax.annotation.Nullable Boolean mute) {
    this.mute = mute;
  }

  public FileDtoInteger viewUrl(@javax.annotation.Nullable URI viewUrl) {
    this.viewUrl = JsonNullable.<URI>of(viewUrl);
    
    return this;
  }

  /**
   * The URL link to view the file.
   * @return viewUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getViewUrl() {
        return viewUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getViewUrl_JsonNullable() {
    return viewUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_VIEW_URL)
  public void setViewUrl_JsonNullable(JsonNullable<URI> viewUrl) {
    this.viewUrl = viewUrl;
  }

  public void setViewUrl(@javax.annotation.Nullable URI viewUrl) {
    this.viewUrl = JsonNullable.<URI>of(viewUrl);
  }

  public FileDtoInteger webUrl(@javax.annotation.Nullable URI webUrl) {
    this.webUrl = JsonNullable.<URI>of(webUrl);
    
    return this;
  }

  /**
   * The Web URL link to the file.
   * @return webUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getWebUrl() {
        return webUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getWebUrl_JsonNullable() {
    return webUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEB_URL)
  public void setWebUrl_JsonNullable(JsonNullable<URI> webUrl) {
    this.webUrl = webUrl;
  }

  public void setWebUrl(@javax.annotation.Nullable URI webUrl) {
    this.webUrl = JsonNullable.<URI>of(webUrl);
  }

  public FileDtoInteger fileType(@javax.annotation.Nullable FileType fileType) {
    
    this.fileType = fileType;
    return this;
  }

  /**
   * Get fileType
   * @return fileType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileType getFileType() {
    return fileType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileType(@javax.annotation.Nullable FileType fileType) {
    this.fileType = fileType;
  }

  public FileDtoInteger fileExst(@javax.annotation.Nullable String fileExst) {
    this.fileExst = JsonNullable.<String>of(fileExst);
    
    return this;
  }

  /**
   * The file extension.
   * @return fileExst
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFileExst() {
        return fileExst.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_EXST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFileExst_JsonNullable() {
    return fileExst;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_EXST)
  public void setFileExst_JsonNullable(JsonNullable<String> fileExst) {
    this.fileExst = fileExst;
  }

  public void setFileExst(@javax.annotation.Nullable String fileExst) {
    this.fileExst = JsonNullable.<String>of(fileExst);
  }

  public FileDtoInteger comment(@javax.annotation.Nullable String comment) {
    this.comment = JsonNullable.<String>of(comment);
    
    return this;
  }

  /**
   * The comment to the file.
   * @return comment
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }

  public FileDtoInteger encrypted(@javax.annotation.Nullable Boolean encrypted) {
    this.encrypted = JsonNullable.<Boolean>of(encrypted);
    
    return this;
  }

  /**
   * Specifies if the file is encrypted or not.
   * @return encrypted
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getEncrypted() {
        return encrypted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENCRYPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getEncrypted_JsonNullable() {
    return encrypted;
  }
  
  @JsonProperty(JSON_PROPERTY_ENCRYPTED)
  public void setEncrypted_JsonNullable(JsonNullable<Boolean> encrypted) {
    this.encrypted = encrypted;
  }

  public void setEncrypted(@javax.annotation.Nullable Boolean encrypted) {
    this.encrypted = JsonNullable.<Boolean>of(encrypted);
  }

  public FileDtoInteger thumbnailUrl(@javax.annotation.Nullable URI thumbnailUrl) {
    this.thumbnailUrl = JsonNullable.<URI>of(thumbnailUrl);
    
    return this;
  }

  /**
   * The thumbnail URL of the file.
   * @return thumbnailUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getThumbnailUrl() {
        return thumbnailUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THUMBNAIL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getThumbnailUrl_JsonNullable() {
    return thumbnailUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_URL)
  public void setThumbnailUrl_JsonNullable(JsonNullable<URI> thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public void setThumbnailUrl(@javax.annotation.Nullable URI thumbnailUrl) {
    this.thumbnailUrl = JsonNullable.<URI>of(thumbnailUrl);
  }

  public FileDtoInteger thumbnailStatus(@javax.annotation.Nullable Thumbnail thumbnailStatus) {
    
    this.thumbnailStatus = thumbnailStatus;
    return this;
  }

  /**
   * Get thumbnailStatus
   * @return thumbnailStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Thumbnail getThumbnailStatus() {
    return thumbnailStatus;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnailStatus(@javax.annotation.Nullable Thumbnail thumbnailStatus) {
    this.thumbnailStatus = thumbnailStatus;
  }

  public FileDtoInteger locked(@javax.annotation.Nullable Boolean locked) {
    this.locked = JsonNullable.<Boolean>of(locked);
    
    return this;
  }

  /**
   * Specifies if the file is locked or not.
   * @return locked
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getLocked() {
        return locked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getLocked_JsonNullable() {
    return locked;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKED)
  public void setLocked_JsonNullable(JsonNullable<Boolean> locked) {
    this.locked = locked;
  }

  public void setLocked(@javax.annotation.Nullable Boolean locked) {
    this.locked = JsonNullable.<Boolean>of(locked);
  }

  public FileDtoInteger lockedBy(@javax.annotation.Nullable String lockedBy) {
    this.lockedBy = JsonNullable.<String>of(lockedBy);
    
    return this;
  }

  /**
   * The user ID of the person who locked the file.
   * @return lockedBy
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLockedBy() {
        return lockedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLockedBy_JsonNullable() {
    return lockedBy;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKED_BY)
  public void setLockedBy_JsonNullable(JsonNullable<String> lockedBy) {
    this.lockedBy = lockedBy;
  }

  public void setLockedBy(@javax.annotation.Nullable String lockedBy) {
    this.lockedBy = JsonNullable.<String>of(lockedBy);
  }

  public FileDtoInteger hasDraft(@javax.annotation.Nullable Boolean hasDraft) {
    this.hasDraft = JsonNullable.<Boolean>of(hasDraft);
    
    return this;
  }

  /**
   * Specifies if the file has a draft or not.
   * @return hasDraft
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getHasDraft() {
        return hasDraft.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HAS_DRAFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getHasDraft_JsonNullable() {
    return hasDraft;
  }
  
  @JsonProperty(JSON_PROPERTY_HAS_DRAFT)
  public void setHasDraft_JsonNullable(JsonNullable<Boolean> hasDraft) {
    this.hasDraft = hasDraft;
  }

  public void setHasDraft(@javax.annotation.Nullable Boolean hasDraft) {
    this.hasDraft = JsonNullable.<Boolean>of(hasDraft);
  }

  public FileDtoInteger formFillingStatus(@javax.annotation.Nullable FormFillingStatus formFillingStatus) {
    
    this.formFillingStatus = formFillingStatus;
    return this;
  }

  /**
   * Get formFillingStatus
   * @return formFillingStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORM_FILLING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFillingStatus getFormFillingStatus() {
    return formFillingStatus;
  }


  @JsonProperty(JSON_PROPERTY_FORM_FILLING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFillingStatus(@javax.annotation.Nullable FormFillingStatus formFillingStatus) {
    this.formFillingStatus = formFillingStatus;
  }

  public FileDtoInteger isForm(@javax.annotation.Nullable Boolean isForm) {
    this.isForm = JsonNullable.<Boolean>of(isForm);
    
    return this;
  }

  /**
   * Specifies if the file is a form or not.
   * @return isForm
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsForm() {
        return isForm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsForm_JsonNullable() {
    return isForm;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_FORM)
  public void setIsForm_JsonNullable(JsonNullable<Boolean> isForm) {
    this.isForm = isForm;
  }

  public void setIsForm(@javax.annotation.Nullable Boolean isForm) {
    this.isForm = JsonNullable.<Boolean>of(isForm);
  }

  public FileDtoInteger customFilterEnabled(@javax.annotation.Nullable Boolean customFilterEnabled) {
    this.customFilterEnabled = JsonNullable.<Boolean>of(customFilterEnabled);
    
    return this;
  }

  /**
   * Specifies if the Custom Filter editing mode is enabled for a file or not.
   * @return customFilterEnabled
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getCustomFilterEnabled() {
        return customFilterEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FILTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getCustomFilterEnabled_JsonNullable() {
    return customFilterEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FILTER_ENABLED)
  public void setCustomFilterEnabled_JsonNullable(JsonNullable<Boolean> customFilterEnabled) {
    this.customFilterEnabled = customFilterEnabled;
  }

  public void setCustomFilterEnabled(@javax.annotation.Nullable Boolean customFilterEnabled) {
    this.customFilterEnabled = JsonNullable.<Boolean>of(customFilterEnabled);
  }

  public FileDtoInteger customFilterEnabledBy(@javax.annotation.Nullable String customFilterEnabledBy) {
    this.customFilterEnabledBy = JsonNullable.<String>of(customFilterEnabledBy);
    
    return this;
  }

  /**
   * The name of the user who enabled a Custom Filter editing mode for a file.
   * @return customFilterEnabledBy
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCustomFilterEnabledBy() {
        return customFilterEnabledBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FILTER_ENABLED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomFilterEnabledBy_JsonNullable() {
    return customFilterEnabledBy;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FILTER_ENABLED_BY)
  public void setCustomFilterEnabledBy_JsonNullable(JsonNullable<String> customFilterEnabledBy) {
    this.customFilterEnabledBy = customFilterEnabledBy;
  }

  public void setCustomFilterEnabledBy(@javax.annotation.Nullable String customFilterEnabledBy) {
    this.customFilterEnabledBy = JsonNullable.<String>of(customFilterEnabledBy);
  }

  public FileDtoInteger startFilling(@javax.annotation.Nullable Boolean startFilling) {
    this.startFilling = JsonNullable.<Boolean>of(startFilling);
    
    return this;
  }

  /**
   * Specifies if the filling has started or not.
   * @return startFilling
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getStartFilling() {
        return startFilling.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_FILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getStartFilling_JsonNullable() {
    return startFilling;
  }
  
  @JsonProperty(JSON_PROPERTY_START_FILLING)
  public void setStartFilling_JsonNullable(JsonNullable<Boolean> startFilling) {
    this.startFilling = startFilling;
  }

  public void setStartFilling(@javax.annotation.Nullable Boolean startFilling) {
    this.startFilling = JsonNullable.<Boolean>of(startFilling);
  }

  public FileDtoInteger inProcessFolderId(@javax.annotation.Nullable Integer inProcessFolderId) {
    this.inProcessFolderId = JsonNullable.<Integer>of(inProcessFolderId);
    
    return this;
  }

  /**
   * The InProcess folder ID of the file.
   * @return inProcessFolderId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getInProcessFolderId() {
        return inProcessFolderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IN_PROCESS_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getInProcessFolderId_JsonNullable() {
    return inProcessFolderId;
  }
  
  @JsonProperty(JSON_PROPERTY_IN_PROCESS_FOLDER_ID)
  public void setInProcessFolderId_JsonNullable(JsonNullable<Integer> inProcessFolderId) {
    this.inProcessFolderId = inProcessFolderId;
  }

  public void setInProcessFolderId(@javax.annotation.Nullable Integer inProcessFolderId) {
    this.inProcessFolderId = JsonNullable.<Integer>of(inProcessFolderId);
  }

  public FileDtoInteger inProcessFolderTitle(@javax.annotation.Nullable String inProcessFolderTitle) {
    this.inProcessFolderTitle = JsonNullable.<String>of(inProcessFolderTitle);
    
    return this;
  }

  /**
   * The InProcess folder title of the file.
   * @return inProcessFolderTitle
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getInProcessFolderTitle() {
        return inProcessFolderTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IN_PROCESS_FOLDER_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInProcessFolderTitle_JsonNullable() {
    return inProcessFolderTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_IN_PROCESS_FOLDER_TITLE)
  public void setInProcessFolderTitle_JsonNullable(JsonNullable<String> inProcessFolderTitle) {
    this.inProcessFolderTitle = inProcessFolderTitle;
  }

  public void setInProcessFolderTitle(@javax.annotation.Nullable String inProcessFolderTitle) {
    this.inProcessFolderTitle = JsonNullable.<String>of(inProcessFolderTitle);
  }

  public FileDtoInteger draftLocation(@javax.annotation.Nullable DraftLocationInteger draftLocation) {
    
    this.draftLocation = draftLocation;
    return this;
  }

  /**
   * Get draftLocation
   * @return draftLocation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRAFT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DraftLocationInteger getDraftLocation() {
    return draftLocation;
  }


  @JsonProperty(JSON_PROPERTY_DRAFT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDraftLocation(@javax.annotation.Nullable DraftLocationInteger draftLocation) {
    this.draftLocation = draftLocation;
  }

  public FileDtoInteger viewAccessibility(@javax.annotation.Nullable FileDtoIntegerAllOfViewAccessibility viewAccessibility) {
    this.viewAccessibility = JsonNullable.<FileDtoIntegerAllOfViewAccessibility>of(viewAccessibility);
    
    return this;
  }

  /**
   * Get viewAccessibility
   * @return viewAccessibility
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public FileDtoIntegerAllOfViewAccessibility getViewAccessibility() {
        return viewAccessibility.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIEW_ACCESSIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<FileDtoIntegerAllOfViewAccessibility> getViewAccessibility_JsonNullable() {
    return viewAccessibility;
  }
  
  @JsonProperty(JSON_PROPERTY_VIEW_ACCESSIBILITY)
  public void setViewAccessibility_JsonNullable(JsonNullable<FileDtoIntegerAllOfViewAccessibility> viewAccessibility) {
    this.viewAccessibility = viewAccessibility;
  }

  public void setViewAccessibility(@javax.annotation.Nullable FileDtoIntegerAllOfViewAccessibility viewAccessibility) {
    this.viewAccessibility = JsonNullable.<FileDtoIntegerAllOfViewAccessibility>of(viewAccessibility);
  }

  public FileDtoInteger lastOpened(@javax.annotation.Nullable ApiDateTime lastOpened) {
    
    this.lastOpened = lastOpened;
    return this;
  }

  /**
   * Get lastOpened
   * @return lastOpened
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_OPENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getLastOpened() {
    return lastOpened;
  }


  @JsonProperty(JSON_PROPERTY_LAST_OPENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastOpened(@javax.annotation.Nullable ApiDateTime lastOpened) {
    this.lastOpened = lastOpened;
  }

  public FileDtoInteger expired(@javax.annotation.Nullable ApiDateTime expired) {
    
    this.expired = expired;
    return this;
  }

  /**
   * Get expired
   * @return expired
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getExpired() {
    return expired;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpired(@javax.annotation.Nullable ApiDateTime expired) {
    this.expired = expired;
  }

  public FileDtoInteger vectorizationStatus(@javax.annotation.Nullable VectorizationStatus vectorizationStatus) {
    
    this.vectorizationStatus = vectorizationStatus;
    return this;
  }

  /**
   * Get vectorizationStatus
   * @return vectorizationStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VECTORIZATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VectorizationStatus getVectorizationStatus() {
    return vectorizationStatus;
  }


  @JsonProperty(JSON_PROPERTY_VECTORIZATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVectorizationStatus(@javax.annotation.Nullable VectorizationStatus vectorizationStatus) {
    this.vectorizationStatus = vectorizationStatus;
  }

  public FileDtoInteger dimensions(@javax.annotation.Nullable Size dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Get dimensions
   * @return dimensions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Size getDimensions() {
    return dimensions;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensions(@javax.annotation.Nullable Size dimensions) {
    this.dimensions = dimensions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDtoInteger fileDtoInteger = (FileDtoInteger) o;
    return equalsNullable(this.title, fileDtoInteger.title) &&
        Objects.equals(this.access, fileDtoInteger.access) &&
        Objects.equals(this.shared, fileDtoInteger.shared) &&
        Objects.equals(this.sharedForUser, fileDtoInteger.sharedForUser) &&
        Objects.equals(this.parentShared, fileDtoInteger.parentShared) &&
        equalsNullable(this.shortWebUrl, fileDtoInteger.shortWebUrl) &&
        Objects.equals(this.created, fileDtoInteger.created) &&
        Objects.equals(this.createdBy, fileDtoInteger.createdBy) &&
        Objects.equals(this.updated, fileDtoInteger.updated) &&
        Objects.equals(this.autoDelete, fileDtoInteger.autoDelete) &&
        Objects.equals(this.rootFolderType, fileDtoInteger.rootFolderType) &&
        Objects.equals(this.parentRoomType, fileDtoInteger.parentRoomType) &&
        Objects.equals(this.updatedBy, fileDtoInteger.updatedBy) &&
        equalsNullable(this.providerItem, fileDtoInteger.providerItem) &&
        equalsNullable(this.providerKey, fileDtoInteger.providerKey) &&
        equalsNullable(this.providerId, fileDtoInteger.providerId) &&
        equalsNullable(this.order, fileDtoInteger.order) &&
        equalsNullable(this.isFavorite, fileDtoInteger.isFavorite) &&
        Objects.equals(this.fileEntryType, fileDtoInteger.fileEntryType) &&
        Objects.equals(this.id, fileDtoInteger.id) &&
        Objects.equals(this.rootFolderId, fileDtoInteger.rootFolderId) &&
        Objects.equals(this.originId, fileDtoInteger.originId) &&
        Objects.equals(this.originRoomId, fileDtoInteger.originRoomId) &&
        equalsNullable(this.originTitle, fileDtoInteger.originTitle) &&
        equalsNullable(this.originRoomTitle, fileDtoInteger.originRoomTitle) &&
        Objects.equals(this.canShare, fileDtoInteger.canShare) &&
        equalsNullable(this.shareSettings, fileDtoInteger.shareSettings) &&
        equalsNullable(this.security, fileDtoInteger.security) &&
        equalsNullable(this.availableShareRights, fileDtoInteger.availableShareRights) &&
        equalsNullable(this.requestToken, fileDtoInteger.requestToken) &&
        equalsNullable(this.external, fileDtoInteger.external) &&
        Objects.equals(this.expirationDate, fileDtoInteger.expirationDate) &&
        equalsNullable(this.isLinkExpired, fileDtoInteger.isLinkExpired) &&
        Objects.equals(this.folderId, fileDtoInteger.folderId) &&
        Objects.equals(this.version, fileDtoInteger.version) &&
        Objects.equals(this.versionGroup, fileDtoInteger.versionGroup) &&
        equalsNullable(this.contentLength, fileDtoInteger.contentLength) &&
        equalsNullable(this.pureContentLength, fileDtoInteger.pureContentLength) &&
        Objects.equals(this.fileStatus, fileDtoInteger.fileStatus) &&
        Objects.equals(this.mute, fileDtoInteger.mute) &&
        equalsNullable(this.viewUrl, fileDtoInteger.viewUrl) &&
        equalsNullable(this.webUrl, fileDtoInteger.webUrl) &&
        Objects.equals(this.fileType, fileDtoInteger.fileType) &&
        equalsNullable(this.fileExst, fileDtoInteger.fileExst) &&
        equalsNullable(this.comment, fileDtoInteger.comment) &&
        equalsNullable(this.encrypted, fileDtoInteger.encrypted) &&
        equalsNullable(this.thumbnailUrl, fileDtoInteger.thumbnailUrl) &&
        Objects.equals(this.thumbnailStatus, fileDtoInteger.thumbnailStatus) &&
        equalsNullable(this.locked, fileDtoInteger.locked) &&
        equalsNullable(this.lockedBy, fileDtoInteger.lockedBy) &&
        equalsNullable(this.hasDraft, fileDtoInteger.hasDraft) &&
        Objects.equals(this.formFillingStatus, fileDtoInteger.formFillingStatus) &&
        equalsNullable(this.isForm, fileDtoInteger.isForm) &&
        equalsNullable(this.customFilterEnabled, fileDtoInteger.customFilterEnabled) &&
        equalsNullable(this.customFilterEnabledBy, fileDtoInteger.customFilterEnabledBy) &&
        equalsNullable(this.startFilling, fileDtoInteger.startFilling) &&
        equalsNullable(this.inProcessFolderId, fileDtoInteger.inProcessFolderId) &&
        equalsNullable(this.inProcessFolderTitle, fileDtoInteger.inProcessFolderTitle) &&
        Objects.equals(this.draftLocation, fileDtoInteger.draftLocation) &&
        equalsNullable(this.viewAccessibility, fileDtoInteger.viewAccessibility) &&
        Objects.equals(this.lastOpened, fileDtoInteger.lastOpened) &&
        Objects.equals(this.expired, fileDtoInteger.expired) &&
        Objects.equals(this.vectorizationStatus, fileDtoInteger.vectorizationStatus) &&
        Objects.equals(this.dimensions, fileDtoInteger.dimensions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(title), access, shared, sharedForUser, parentShared, hashCodeNullable(shortWebUrl), created, createdBy, updated, autoDelete, rootFolderType, parentRoomType, updatedBy, hashCodeNullable(providerItem), hashCodeNullable(providerKey), hashCodeNullable(providerId), hashCodeNullable(order), hashCodeNullable(isFavorite), fileEntryType, id, rootFolderId, originId, originRoomId, hashCodeNullable(originTitle), hashCodeNullable(originRoomTitle), canShare, hashCodeNullable(shareSettings), hashCodeNullable(security), hashCodeNullable(availableShareRights), hashCodeNullable(requestToken), hashCodeNullable(external), expirationDate, hashCodeNullable(isLinkExpired), folderId, version, versionGroup, hashCodeNullable(contentLength), hashCodeNullable(pureContentLength), fileStatus, mute, hashCodeNullable(viewUrl), hashCodeNullable(webUrl), fileType, hashCodeNullable(fileExst), hashCodeNullable(comment), hashCodeNullable(encrypted), hashCodeNullable(thumbnailUrl), thumbnailStatus, hashCodeNullable(locked), hashCodeNullable(lockedBy), hashCodeNullable(hasDraft), formFillingStatus, hashCodeNullable(isForm), hashCodeNullable(customFilterEnabled), hashCodeNullable(customFilterEnabledBy), hashCodeNullable(startFilling), hashCodeNullable(inProcessFolderId), hashCodeNullable(inProcessFolderTitle), draftLocation, hashCodeNullable(viewAccessibility), lastOpened, expired, vectorizationStatus, dimensions);
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
    sb.append("class FileDtoInteger {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    pureContentLength: ").append(toIndentedString(pureContentLength)).append("\n");
    sb.append("    fileStatus: ").append(toIndentedString(fileStatus)).append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileExst: ").append(toIndentedString(fileExst)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    thumbnailStatus: ").append(toIndentedString(thumbnailStatus)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    hasDraft: ").append(toIndentedString(hasDraft)).append("\n");
    sb.append("    formFillingStatus: ").append(toIndentedString(formFillingStatus)).append("\n");
    sb.append("    isForm: ").append(toIndentedString(isForm)).append("\n");
    sb.append("    customFilterEnabled: ").append(toIndentedString(customFilterEnabled)).append("\n");
    sb.append("    customFilterEnabledBy: ").append(toIndentedString(customFilterEnabledBy)).append("\n");
    sb.append("    startFilling: ").append(toIndentedString(startFilling)).append("\n");
    sb.append("    inProcessFolderId: ").append(toIndentedString(inProcessFolderId)).append("\n");
    sb.append("    inProcessFolderTitle: ").append(toIndentedString(inProcessFolderTitle)).append("\n");
    sb.append("    draftLocation: ").append(toIndentedString(draftLocation)).append("\n");
    sb.append("    viewAccessibility: ").append(toIndentedString(viewAccessibility)).append("\n");
    sb.append("    lastOpened: ").append(toIndentedString(lastOpened)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    vectorizationStatus: ").append(toIndentedString(vectorizationStatus)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

    // add `folderId` to the URL query string
    if (getFolderId() != null) {
      try {
        joiner.add(String.format("%sfolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `versionGroup` to the URL query string
    if (getVersionGroup() != null) {
      try {
        joiner.add(String.format("%sversionGroup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersionGroup()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contentLength` to the URL query string
    if (getContentLength() != null) {
      try {
        joiner.add(String.format("%scontentLength%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContentLength()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pureContentLength` to the URL query string
    if (getPureContentLength() != null) {
      try {
        joiner.add(String.format("%spureContentLength%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPureContentLength()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileStatus` to the URL query string
    if (getFileStatus() != null) {
      try {
        joiner.add(String.format("%sfileStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileStatus()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `viewUrl` to the URL query string
    if (getViewUrl() != null) {
      try {
        joiner.add(String.format("%sviewUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViewUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `webUrl` to the URL query string
    if (getWebUrl() != null) {
      try {
        joiner.add(String.format("%swebUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileType` to the URL query string
    if (getFileType() != null) {
      try {
        joiner.add(String.format("%sfileType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileExst` to the URL query string
    if (getFileExst() != null) {
      try {
        joiner.add(String.format("%sfileExst%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileExst()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `comment` to the URL query string
    if (getComment() != null) {
      try {
        joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `encrypted` to the URL query string
    if (getEncrypted() != null) {
      try {
        joiner.add(String.format("%sencrypted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncrypted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `thumbnailUrl` to the URL query string
    if (getThumbnailUrl() != null) {
      try {
        joiner.add(String.format("%sthumbnailUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThumbnailUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `thumbnailStatus` to the URL query string
    if (getThumbnailStatus() != null) {
      try {
        joiner.add(String.format("%sthumbnailStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThumbnailStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `locked` to the URL query string
    if (getLocked() != null) {
      try {
        joiner.add(String.format("%slocked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocked()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lockedBy` to the URL query string
    if (getLockedBy() != null) {
      try {
        joiner.add(String.format("%slockedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLockedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hasDraft` to the URL query string
    if (getHasDraft() != null) {
      try {
        joiner.add(String.format("%shasDraft%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasDraft()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `formFillingStatus` to the URL query string
    if (getFormFillingStatus() != null) {
      try {
        joiner.add(String.format("%sformFillingStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormFillingStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isForm` to the URL query string
    if (getIsForm() != null) {
      try {
        joiner.add(String.format("%sisForm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsForm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customFilterEnabled` to the URL query string
    if (getCustomFilterEnabled() != null) {
      try {
        joiner.add(String.format("%scustomFilterEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomFilterEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customFilterEnabledBy` to the URL query string
    if (getCustomFilterEnabledBy() != null) {
      try {
        joiner.add(String.format("%scustomFilterEnabledBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomFilterEnabledBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startFilling` to the URL query string
    if (getStartFilling() != null) {
      try {
        joiner.add(String.format("%sstartFilling%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartFilling()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `inProcessFolderId` to the URL query string
    if (getInProcessFolderId() != null) {
      try {
        joiner.add(String.format("%sinProcessFolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInProcessFolderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `inProcessFolderTitle` to the URL query string
    if (getInProcessFolderTitle() != null) {
      try {
        joiner.add(String.format("%sinProcessFolderTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInProcessFolderTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `draftLocation` to the URL query string
    if (getDraftLocation() != null) {
      joiner.add(getDraftLocation().toUrlQueryString(prefix + "draftLocation" + suffix));
    }

    // add `viewAccessibility` to the URL query string
    if (getViewAccessibility() != null) {
      joiner.add(getViewAccessibility().toUrlQueryString(prefix + "viewAccessibility" + suffix));
    }

    // add `lastOpened` to the URL query string
    if (getLastOpened() != null) {
      joiner.add(getLastOpened().toUrlQueryString(prefix + "lastOpened" + suffix));
    }

    // add `expired` to the URL query string
    if (getExpired() != null) {
      joiner.add(getExpired().toUrlQueryString(prefix + "expired" + suffix));
    }

    // add `vectorizationStatus` to the URL query string
    if (getVectorizationStatus() != null) {
      try {
        joiner.add(String.format("%svectorizationStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVectorizationStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dimensions` to the URL query string
    if (getDimensions() != null) {
      joiner.add(getDimensions().toUrlQueryString(prefix + "dimensions" + suffix));
    }

    return joiner.toString();
  }

}

