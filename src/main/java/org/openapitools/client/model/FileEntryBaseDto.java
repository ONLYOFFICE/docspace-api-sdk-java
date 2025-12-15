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
 * The file entry information.
 */
@JsonPropertyOrder({
  FileEntryBaseDto.JSON_PROPERTY_TITLE,
  FileEntryBaseDto.JSON_PROPERTY_ACCESS,
  FileEntryBaseDto.JSON_PROPERTY_SHARED_BY,
  FileEntryBaseDto.JSON_PROPERTY_OWNED_BY,
  FileEntryBaseDto.JSON_PROPERTY_SHARED,
  FileEntryBaseDto.JSON_PROPERTY_SHARED_FOR_USER,
  FileEntryBaseDto.JSON_PROPERTY_PARENT_SHARED,
  FileEntryBaseDto.JSON_PROPERTY_SHORT_WEB_URL,
  FileEntryBaseDto.JSON_PROPERTY_CREATED,
  FileEntryBaseDto.JSON_PROPERTY_CREATED_BY,
  FileEntryBaseDto.JSON_PROPERTY_UPDATED,
  FileEntryBaseDto.JSON_PROPERTY_AUTO_DELETE,
  FileEntryBaseDto.JSON_PROPERTY_ROOT_FOLDER_TYPE,
  FileEntryBaseDto.JSON_PROPERTY_PARENT_ROOM_TYPE,
  FileEntryBaseDto.JSON_PROPERTY_UPDATED_BY,
  FileEntryBaseDto.JSON_PROPERTY_PROVIDER_ITEM,
  FileEntryBaseDto.JSON_PROPERTY_PROVIDER_KEY,
  FileEntryBaseDto.JSON_PROPERTY_PROVIDER_ID,
  FileEntryBaseDto.JSON_PROPERTY_ORDER,
  FileEntryBaseDto.JSON_PROPERTY_IS_FAVORITE,
  FileEntryBaseDto.JSON_PROPERTY_FILE_ENTRY_TYPE
})

public class FileEntryBaseDto {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable
  private FileShare access;

  public static final String JSON_PROPERTY_SHARED_BY = "sharedBy";
  @javax.annotation.Nullable
  private EmployeeDto sharedBy;

  public static final String JSON_PROPERTY_OWNED_BY = "ownedBy";
  @javax.annotation.Nullable
  private EmployeeDto ownedBy;

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

  public FileEntryBaseDto() {
  }

  public FileEntryBaseDto title(@javax.annotation.Nullable String title) {
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

  public FileEntryBaseDto access(@javax.annotation.Nullable FileShare access) {
    
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

  public FileEntryBaseDto sharedBy(@javax.annotation.Nullable EmployeeDto sharedBy) {
    
    this.sharedBy = sharedBy;
    return this;
  }

  /**
   * Get sharedBy
   * @return sharedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getSharedBy() {
    return sharedBy;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedBy(@javax.annotation.Nullable EmployeeDto sharedBy) {
    this.sharedBy = sharedBy;
  }

  public FileEntryBaseDto ownedBy(@javax.annotation.Nullable EmployeeDto ownedBy) {
    
    this.ownedBy = ownedBy;
    return this;
  }

  /**
   * Get ownedBy
   * @return ownedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getOwnedBy() {
    return ownedBy;
  }


  @JsonProperty(JSON_PROPERTY_OWNED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnedBy(@javax.annotation.Nullable EmployeeDto ownedBy) {
    this.ownedBy = ownedBy;
  }

  public FileEntryBaseDto shared(@javax.annotation.Nullable Boolean shared) {
    
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

  public FileEntryBaseDto sharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    
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

  public FileEntryBaseDto parentShared(@javax.annotation.Nullable Boolean parentShared) {
    
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

  public FileEntryBaseDto shortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
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

  public FileEntryBaseDto created(@javax.annotation.Nullable ApiDateTime created) {
    
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

  public FileEntryBaseDto createdBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    
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

  public FileEntryBaseDto updated(@javax.annotation.Nullable ApiDateTime updated) {
    
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

  public FileEntryBaseDto autoDelete(@javax.annotation.Nullable ApiDateTime autoDelete) {
    
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

  public FileEntryBaseDto rootFolderType(@javax.annotation.Nullable FolderType rootFolderType) {
    
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

  public FileEntryBaseDto parentRoomType(@javax.annotation.Nullable FolderType parentRoomType) {
    
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

  public FileEntryBaseDto updatedBy(@javax.annotation.Nullable EmployeeDto updatedBy) {
    
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

  public FileEntryBaseDto providerItem(@javax.annotation.Nullable Boolean providerItem) {
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

  public FileEntryBaseDto providerKey(@javax.annotation.Nullable String providerKey) {
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

  public FileEntryBaseDto providerId(@javax.annotation.Nullable Integer providerId) {
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

  public FileEntryBaseDto order(@javax.annotation.Nullable String order) {
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

  public FileEntryBaseDto isFavorite(@javax.annotation.Nullable Boolean isFavorite) {
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

  public FileEntryBaseDto fileEntryType(@javax.annotation.Nullable FileEntryType fileEntryType) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileEntryBaseDto fileEntryBaseDto = (FileEntryBaseDto) o;
    return equalsNullable(this.title, fileEntryBaseDto.title) &&
        Objects.equals(this.access, fileEntryBaseDto.access) &&
        Objects.equals(this.sharedBy, fileEntryBaseDto.sharedBy) &&
        Objects.equals(this.ownedBy, fileEntryBaseDto.ownedBy) &&
        Objects.equals(this.shared, fileEntryBaseDto.shared) &&
        Objects.equals(this.sharedForUser, fileEntryBaseDto.sharedForUser) &&
        Objects.equals(this.parentShared, fileEntryBaseDto.parentShared) &&
        equalsNullable(this.shortWebUrl, fileEntryBaseDto.shortWebUrl) &&
        Objects.equals(this.created, fileEntryBaseDto.created) &&
        Objects.equals(this.createdBy, fileEntryBaseDto.createdBy) &&
        Objects.equals(this.updated, fileEntryBaseDto.updated) &&
        Objects.equals(this.autoDelete, fileEntryBaseDto.autoDelete) &&
        Objects.equals(this.rootFolderType, fileEntryBaseDto.rootFolderType) &&
        Objects.equals(this.parentRoomType, fileEntryBaseDto.parentRoomType) &&
        Objects.equals(this.updatedBy, fileEntryBaseDto.updatedBy) &&
        equalsNullable(this.providerItem, fileEntryBaseDto.providerItem) &&
        equalsNullable(this.providerKey, fileEntryBaseDto.providerKey) &&
        equalsNullable(this.providerId, fileEntryBaseDto.providerId) &&
        equalsNullable(this.order, fileEntryBaseDto.order) &&
        equalsNullable(this.isFavorite, fileEntryBaseDto.isFavorite) &&
        Objects.equals(this.fileEntryType, fileEntryBaseDto.fileEntryType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(title), access, sharedBy, ownedBy, shared, sharedForUser, parentShared, hashCodeNullable(shortWebUrl), created, createdBy, updated, autoDelete, rootFolderType, parentRoomType, updatedBy, hashCodeNullable(providerItem), hashCodeNullable(providerKey), hashCodeNullable(providerId), hashCodeNullable(order), hashCodeNullable(isFavorite), fileEntryType);
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
    sb.append("class FileEntryBaseDto {\n");
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

    return joiner.toString();
  }

}

