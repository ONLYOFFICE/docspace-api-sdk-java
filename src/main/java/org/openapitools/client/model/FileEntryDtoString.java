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
import org.openapitools.client.model.EmployeeDto;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfAvailableShareRights;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfSecurity;
import org.openapitools.client.model.FileEntryDtoIntegerAllOfShareSettings;
import org.openapitools.client.model.FileEntryType;
import org.openapitools.client.model.FileShare;
import org.openapitools.client.model.FolderType;
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
  FileEntryDtoString.JSON_PROPERTY_TITLE,
  FileEntryDtoString.JSON_PROPERTY_ACCESS,
  FileEntryDtoString.JSON_PROPERTY_SHARED,
  FileEntryDtoString.JSON_PROPERTY_SHARED_FOR_USER,
  FileEntryDtoString.JSON_PROPERTY_PARENT_SHARED,
  FileEntryDtoString.JSON_PROPERTY_SHORT_WEB_URL,
  FileEntryDtoString.JSON_PROPERTY_CREATED,
  FileEntryDtoString.JSON_PROPERTY_CREATED_BY,
  FileEntryDtoString.JSON_PROPERTY_UPDATED,
  FileEntryDtoString.JSON_PROPERTY_AUTO_DELETE,
  FileEntryDtoString.JSON_PROPERTY_ROOT_FOLDER_TYPE,
  FileEntryDtoString.JSON_PROPERTY_PARENT_ROOM_TYPE,
  FileEntryDtoString.JSON_PROPERTY_UPDATED_BY,
  FileEntryDtoString.JSON_PROPERTY_PROVIDER_ITEM,
  FileEntryDtoString.JSON_PROPERTY_PROVIDER_KEY,
  FileEntryDtoString.JSON_PROPERTY_PROVIDER_ID,
  FileEntryDtoString.JSON_PROPERTY_ORDER,
  FileEntryDtoString.JSON_PROPERTY_IS_FAVORITE,
  FileEntryDtoString.JSON_PROPERTY_FILE_ENTRY_TYPE,
  FileEntryDtoString.JSON_PROPERTY_ID,
  FileEntryDtoString.JSON_PROPERTY_ROOT_FOLDER_ID,
  FileEntryDtoString.JSON_PROPERTY_ORIGIN_ID,
  FileEntryDtoString.JSON_PROPERTY_ORIGIN_ROOM_ID,
  FileEntryDtoString.JSON_PROPERTY_ORIGIN_TITLE,
  FileEntryDtoString.JSON_PROPERTY_ORIGIN_ROOM_TITLE,
  FileEntryDtoString.JSON_PROPERTY_CAN_SHARE,
  FileEntryDtoString.JSON_PROPERTY_SHARE_SETTINGS,
  FileEntryDtoString.JSON_PROPERTY_SECURITY,
  FileEntryDtoString.JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS,
  FileEntryDtoString.JSON_PROPERTY_REQUEST_TOKEN,
  FileEntryDtoString.JSON_PROPERTY_EXTERNAL,
  FileEntryDtoString.JSON_PROPERTY_EXPIRATION_DATE,
  FileEntryDtoString.JSON_PROPERTY_IS_LINK_EXPIRED
})

public class FileEntryDtoString {
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
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROOT_FOLDER_ID = "rootFolderId";
  @javax.annotation.Nullable
  private JsonNullable<String> rootFolderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGIN_ID = "originId";
  @javax.annotation.Nullable
  private JsonNullable<String> originId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGIN_ROOM_ID = "originRoomId";
  @javax.annotation.Nullable
  private JsonNullable<String> originRoomId = JsonNullable.<String>undefined();

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

  public FileEntryDtoString() {
  }

  public FileEntryDtoString title(@javax.annotation.Nullable String title) {
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

  public FileEntryDtoString access(@javax.annotation.Nullable FileShare access) {
    
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

  public FileEntryDtoString shared(@javax.annotation.Nullable Boolean shared) {
    
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

  public FileEntryDtoString sharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    
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

  public FileEntryDtoString parentShared(@javax.annotation.Nullable Boolean parentShared) {
    
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

  public FileEntryDtoString shortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
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

  public FileEntryDtoString created(@javax.annotation.Nullable ApiDateTime created) {
    
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

  public FileEntryDtoString createdBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    
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

  public FileEntryDtoString updated(@javax.annotation.Nullable ApiDateTime updated) {
    
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

  public FileEntryDtoString autoDelete(@javax.annotation.Nullable ApiDateTime autoDelete) {
    
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

  public FileEntryDtoString rootFolderType(@javax.annotation.Nullable FolderType rootFolderType) {
    
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

  public FileEntryDtoString parentRoomType(@javax.annotation.Nullable FolderType parentRoomType) {
    
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

  public FileEntryDtoString updatedBy(@javax.annotation.Nullable EmployeeDto updatedBy) {
    
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

  public FileEntryDtoString providerItem(@javax.annotation.Nullable Boolean providerItem) {
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

  public FileEntryDtoString providerKey(@javax.annotation.Nullable String providerKey) {
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

  public FileEntryDtoString providerId(@javax.annotation.Nullable Integer providerId) {
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

  public FileEntryDtoString order(@javax.annotation.Nullable String order) {
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

  public FileEntryDtoString isFavorite(@javax.annotation.Nullable Boolean isFavorite) {
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

  public FileEntryDtoString fileEntryType(@javax.annotation.Nullable FileEntryType fileEntryType) {
    
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

  public FileEntryDtoString id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The file entry ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
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

  public FileEntryDtoString rootFolderId(@javax.annotation.Nullable String rootFolderId) {
    this.rootFolderId = JsonNullable.<String>of(rootFolderId);
    
    return this;
  }

  /**
   * The root folder ID of the file entry.
   * @return rootFolderId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRootFolderId() {
        return rootFolderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOT_FOLDER_ID)
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

  public FileEntryDtoString originId(@javax.annotation.Nullable String originId) {
    this.originId = JsonNullable.<String>of(originId);
    
    return this;
  }

  /**
   * The origin ID of the file entry.
   * @return originId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOriginId() {
        return originId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGIN_ID)
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

  public FileEntryDtoString originRoomId(@javax.annotation.Nullable String originRoomId) {
    this.originRoomId = JsonNullable.<String>of(originRoomId);
    
    return this;
  }

  /**
   * The origin room ID of the file entry.
   * @return originRoomId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOriginRoomId() {
        return originRoomId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGIN_ROOM_ID)
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

  public FileEntryDtoString originTitle(@javax.annotation.Nullable String originTitle) {
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

  public FileEntryDtoString originRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
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

  public FileEntryDtoString canShare(@javax.annotation.Nullable Boolean canShare) {
    
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

  public FileEntryDtoString shareSettings(@javax.annotation.Nullable FileEntryDtoIntegerAllOfShareSettings shareSettings) {
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

  public FileEntryDtoString security(@javax.annotation.Nullable FileEntryDtoIntegerAllOfSecurity security) {
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

  public FileEntryDtoString availableShareRights(@javax.annotation.Nullable FileEntryDtoIntegerAllOfAvailableShareRights availableShareRights) {
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

  public FileEntryDtoString requestToken(@javax.annotation.Nullable String requestToken) {
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

  public FileEntryDtoString external(@javax.annotation.Nullable Boolean external) {
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

  public FileEntryDtoString expirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    
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

  public FileEntryDtoString isLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileEntryDtoString fileEntryDtoString = (FileEntryDtoString) o;
    return equalsNullable(this.title, fileEntryDtoString.title) &&
        Objects.equals(this.access, fileEntryDtoString.access) &&
        Objects.equals(this.shared, fileEntryDtoString.shared) &&
        Objects.equals(this.sharedForUser, fileEntryDtoString.sharedForUser) &&
        Objects.equals(this.parentShared, fileEntryDtoString.parentShared) &&
        equalsNullable(this.shortWebUrl, fileEntryDtoString.shortWebUrl) &&
        Objects.equals(this.created, fileEntryDtoString.created) &&
        Objects.equals(this.createdBy, fileEntryDtoString.createdBy) &&
        Objects.equals(this.updated, fileEntryDtoString.updated) &&
        Objects.equals(this.autoDelete, fileEntryDtoString.autoDelete) &&
        Objects.equals(this.rootFolderType, fileEntryDtoString.rootFolderType) &&
        Objects.equals(this.parentRoomType, fileEntryDtoString.parentRoomType) &&
        Objects.equals(this.updatedBy, fileEntryDtoString.updatedBy) &&
        equalsNullable(this.providerItem, fileEntryDtoString.providerItem) &&
        equalsNullable(this.providerKey, fileEntryDtoString.providerKey) &&
        equalsNullable(this.providerId, fileEntryDtoString.providerId) &&
        equalsNullable(this.order, fileEntryDtoString.order) &&
        equalsNullable(this.isFavorite, fileEntryDtoString.isFavorite) &&
        Objects.equals(this.fileEntryType, fileEntryDtoString.fileEntryType) &&
        equalsNullable(this.id, fileEntryDtoString.id) &&
        equalsNullable(this.rootFolderId, fileEntryDtoString.rootFolderId) &&
        equalsNullable(this.originId, fileEntryDtoString.originId) &&
        equalsNullable(this.originRoomId, fileEntryDtoString.originRoomId) &&
        equalsNullable(this.originTitle, fileEntryDtoString.originTitle) &&
        equalsNullable(this.originRoomTitle, fileEntryDtoString.originRoomTitle) &&
        Objects.equals(this.canShare, fileEntryDtoString.canShare) &&
        equalsNullable(this.shareSettings, fileEntryDtoString.shareSettings) &&
        equalsNullable(this.security, fileEntryDtoString.security) &&
        equalsNullable(this.availableShareRights, fileEntryDtoString.availableShareRights) &&
        equalsNullable(this.requestToken, fileEntryDtoString.requestToken) &&
        equalsNullable(this.external, fileEntryDtoString.external) &&
        Objects.equals(this.expirationDate, fileEntryDtoString.expirationDate) &&
        equalsNullable(this.isLinkExpired, fileEntryDtoString.isLinkExpired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(title), access, shared, sharedForUser, parentShared, hashCodeNullable(shortWebUrl), created, createdBy, updated, autoDelete, rootFolderType, parentRoomType, updatedBy, hashCodeNullable(providerItem), hashCodeNullable(providerKey), hashCodeNullable(providerId), hashCodeNullable(order), hashCodeNullable(isFavorite), fileEntryType, hashCodeNullable(id), hashCodeNullable(rootFolderId), hashCodeNullable(originId), hashCodeNullable(originRoomId), hashCodeNullable(originTitle), hashCodeNullable(originRoomTitle), canShare, hashCodeNullable(shareSettings), hashCodeNullable(security), hashCodeNullable(availableShareRights), hashCodeNullable(requestToken), hashCodeNullable(external), expirationDate, hashCodeNullable(isLinkExpired));
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
    sb.append("class FileEntryDtoString {\n");
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

    return joiner.toString();
  }

}

