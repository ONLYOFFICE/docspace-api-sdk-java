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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.AiFileEntryDtoAllOfAvailableShareRights;
import org.openapitools.client.model.AiFileEntryDtoAllOfSecurity;
import org.openapitools.client.model.AiFileEntryDtoAllOfShareSettings;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.EmployeeDto;
import org.openapitools.client.model.FileDtoAllOfViewAccessibility;
import org.openapitools.client.model.FileEntryType;
import org.openapitools.client.model.FileShare;
import org.openapitools.client.model.FileStatus;
import org.openapitools.client.model.FileType;
import org.openapitools.client.model.FolderType;
import org.openapitools.client.model.FormFillingStatus;
import org.openapitools.client.model.Size;
import org.openapitools.client.model.ThirdPartyDraftLocation;
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
 * A stored file as the calling account sees it: where it lives, which revision this is, how it can be opened and  what the portal is currently doing with it.
 */
@JsonPropertyOrder({
  ThirdPartyFileDto.JSON_PROPERTY_TITLE,
  ThirdPartyFileDto.JSON_PROPERTY_ACCESS,
  ThirdPartyFileDto.JSON_PROPERTY_SHARED_BY,
  ThirdPartyFileDto.JSON_PROPERTY_OWNED_BY,
  ThirdPartyFileDto.JSON_PROPERTY_SHARED,
  ThirdPartyFileDto.JSON_PROPERTY_SHARED_FOR_USER,
  ThirdPartyFileDto.JSON_PROPERTY_SHARED_EXTERNAL,
  ThirdPartyFileDto.JSON_PROPERTY_PARENT_SHARED,
  ThirdPartyFileDto.JSON_PROPERTY_SHORT_WEB_URL,
  ThirdPartyFileDto.JSON_PROPERTY_CREATED,
  ThirdPartyFileDto.JSON_PROPERTY_CREATED_BY,
  ThirdPartyFileDto.JSON_PROPERTY_UPDATED,
  ThirdPartyFileDto.JSON_PROPERTY_AUTO_DELETE,
  ThirdPartyFileDto.JSON_PROPERTY_ROOT_FOLDER_TYPE,
  ThirdPartyFileDto.JSON_PROPERTY_PARENT_ROOM_TYPE,
  ThirdPartyFileDto.JSON_PROPERTY_UPDATED_BY,
  ThirdPartyFileDto.JSON_PROPERTY_PROVIDER_ITEM,
  ThirdPartyFileDto.JSON_PROPERTY_PROVIDER_KEY,
  ThirdPartyFileDto.JSON_PROPERTY_PROVIDER_ID,
  ThirdPartyFileDto.JSON_PROPERTY_ORDER,
  ThirdPartyFileDto.JSON_PROPERTY_IS_FAVORITE,
  ThirdPartyFileDto.JSON_PROPERTY_FILE_ENTRY_TYPE,
  ThirdPartyFileDto.JSON_PROPERTY_ID,
  ThirdPartyFileDto.JSON_PROPERTY_ROOT_FOLDER_ID,
  ThirdPartyFileDto.JSON_PROPERTY_ORIGIN_ID,
  ThirdPartyFileDto.JSON_PROPERTY_ORIGIN_ROOM_ID,
  ThirdPartyFileDto.JSON_PROPERTY_ORIGIN_TITLE,
  ThirdPartyFileDto.JSON_PROPERTY_ORIGIN_ROOM_TITLE,
  ThirdPartyFileDto.JSON_PROPERTY_CAN_SHARE,
  ThirdPartyFileDto.JSON_PROPERTY_SHARE_SETTINGS,
  ThirdPartyFileDto.JSON_PROPERTY_SECURITY,
  ThirdPartyFileDto.JSON_PROPERTY_AVAILABLE_SHARE_RIGHTS,
  ThirdPartyFileDto.JSON_PROPERTY_REQUEST_TOKEN,
  ThirdPartyFileDto.JSON_PROPERTY_EXTERNAL,
  ThirdPartyFileDto.JSON_PROPERTY_EXPIRATION_DATE,
  ThirdPartyFileDto.JSON_PROPERTY_IS_LINK_EXPIRED,
  ThirdPartyFileDto.JSON_PROPERTY_FOLDER_ID,
  ThirdPartyFileDto.JSON_PROPERTY_VERSION,
  ThirdPartyFileDto.JSON_PROPERTY_VERSION_GROUP,
  ThirdPartyFileDto.JSON_PROPERTY_CONTENT_LENGTH,
  ThirdPartyFileDto.JSON_PROPERTY_PURE_CONTENT_LENGTH,
  ThirdPartyFileDto.JSON_PROPERTY_FILE_STATUS,
  ThirdPartyFileDto.JSON_PROPERTY_EDITING_BY,
  ThirdPartyFileDto.JSON_PROPERTY_MUTE,
  ThirdPartyFileDto.JSON_PROPERTY_VIEW_URL,
  ThirdPartyFileDto.JSON_PROPERTY_WEB_URL,
  ThirdPartyFileDto.JSON_PROPERTY_FILE_TYPE,
  ThirdPartyFileDto.JSON_PROPERTY_FILE_EXST,
  ThirdPartyFileDto.JSON_PROPERTY_COMMENT,
  ThirdPartyFileDto.JSON_PROPERTY_ENCRYPTED,
  ThirdPartyFileDto.JSON_PROPERTY_THUMBNAIL_URL,
  ThirdPartyFileDto.JSON_PROPERTY_THUMBNAIL_STATUS,
  ThirdPartyFileDto.JSON_PROPERTY_LOCKED,
  ThirdPartyFileDto.JSON_PROPERTY_LOCKED_BY,
  ThirdPartyFileDto.JSON_PROPERTY_HAS_DRAFT,
  ThirdPartyFileDto.JSON_PROPERTY_FORM_FILLING_STATUS,
  ThirdPartyFileDto.JSON_PROPERTY_IS_FORM,
  ThirdPartyFileDto.JSON_PROPERTY_CUSTOM_FILTER_ENABLED,
  ThirdPartyFileDto.JSON_PROPERTY_CUSTOM_FILTER_ENABLED_BY,
  ThirdPartyFileDto.JSON_PROPERTY_START_FILLING,
  ThirdPartyFileDto.JSON_PROPERTY_IS_FILLING_PREPARING,
  ThirdPartyFileDto.JSON_PROPERTY_IN_PROCESS_FOLDER_ID,
  ThirdPartyFileDto.JSON_PROPERTY_IN_PROCESS_FOLDER_TITLE,
  ThirdPartyFileDto.JSON_PROPERTY_RESULTS_FOLDER_ID,
  ThirdPartyFileDto.JSON_PROPERTY_DRAFT_LOCATION,
  ThirdPartyFileDto.JSON_PROPERTY_VIEW_ACCESSIBILITY,
  ThirdPartyFileDto.JSON_PROPERTY_LAST_OPENED,
  ThirdPartyFileDto.JSON_PROPERTY_EXPIRED,
  ThirdPartyFileDto.JSON_PROPERTY_VECTORIZATION_STATUS,
  ThirdPartyFileDto.JSON_PROPERTY_EXTERNAL_DB_TABLE_NAME,
  ThirdPartyFileDto.JSON_PROPERTY_DIMENSIONS
})

public class ThirdPartyFileDto {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

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

  public static final String JSON_PROPERTY_SHARED_EXTERNAL = "sharedExternal";
  @javax.annotation.Nullable  private Boolean sharedExternal;

  public static final String JSON_PROPERTY_PARENT_SHARED = "parentShared";
  @javax.annotation.Nullable  private Boolean parentShared;

  public static final String JSON_PROPERTY_SHORT_WEB_URL = "shortWebUrl";
  @javax.annotation.Nullable  private URI shortWebUrl;

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
  @javax.annotation.Nullable  private FileEntryType fileEntryType;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private String id;

  public static final String JSON_PROPERTY_ROOT_FOLDER_ID = "rootFolderId";
  @javax.annotation.Nullable  private String rootFolderId;

  public static final String JSON_PROPERTY_ORIGIN_ID = "originId";
  @javax.annotation.Nullable  private String originId;

  public static final String JSON_PROPERTY_ORIGIN_ROOM_ID = "originRoomId";
  @javax.annotation.Nullable  private String originRoomId;

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
  @javax.annotation.Nullable  private ApiDateTime expirationDate;

  public static final String JSON_PROPERTY_IS_LINK_EXPIRED = "isLinkExpired";
  @javax.annotation.Nullable  private Boolean isLinkExpired;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nullable  private JsonNullable<String> folderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable  private Integer version;

  public static final String JSON_PROPERTY_VERSION_GROUP = "versionGroup";
  @javax.annotation.Nullable  private Integer versionGroup;

  public static final String JSON_PROPERTY_CONTENT_LENGTH = "contentLength";
  @javax.annotation.Nullable  private JsonNullable<String> contentLength = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PURE_CONTENT_LENGTH = "pureContentLength";
  @javax.annotation.Nullable  private JsonNullable<Long> pureContentLength = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_FILE_STATUS = "fileStatus";
  @javax.annotation.Nullable  private FileStatus fileStatus;

  public static final String JSON_PROPERTY_EDITING_BY = "editingBy";
  @javax.annotation.Nullable  private Map<String, String> editingBy = new HashMap<>();

  public static final String JSON_PROPERTY_MUTE = "mute";
  @javax.annotation.Nullable  private Boolean mute;

  public static final String JSON_PROPERTY_VIEW_URL = "viewUrl";
  @javax.annotation.Nullable  private JsonNullable<URI> viewUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_WEB_URL = "webUrl";
  @javax.annotation.Nullable  private JsonNullable<URI> webUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  @javax.annotation.Nullable  private FileType fileType;

  public static final String JSON_PROPERTY_FILE_EXST = "fileExst";
  @javax.annotation.Nullable  private JsonNullable<String> fileExst = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENCRYPTED = "encrypted";
  @javax.annotation.Nullable  private JsonNullable<Boolean> encrypted = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_THUMBNAIL_URL = "thumbnailUrl";
  @javax.annotation.Nullable  private JsonNullable<URI> thumbnailUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_THUMBNAIL_STATUS = "thumbnailStatus";
  @javax.annotation.Nullable  private Thumbnail thumbnailStatus;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  @javax.annotation.Nullable  private JsonNullable<Boolean> locked = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LOCKED_BY = "lockedBy";
  @javax.annotation.Nullable  private JsonNullable<String> lockedBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_DRAFT = "hasDraft";
  @javax.annotation.Nullable  private JsonNullable<Boolean> hasDraft = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FORM_FILLING_STATUS = "formFillingStatus";
  @javax.annotation.Nullable  private FormFillingStatus formFillingStatus;

  public static final String JSON_PROPERTY_IS_FORM = "isForm";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isForm = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FILTER_ENABLED = "customFilterEnabled";
  @javax.annotation.Nullable  private JsonNullable<Boolean> customFilterEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FILTER_ENABLED_BY = "customFilterEnabledBy";
  @javax.annotation.Nullable  private JsonNullable<String> customFilterEnabledBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_START_FILLING = "startFilling";
  @javax.annotation.Nullable  private JsonNullable<Boolean> startFilling = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_FILLING_PREPARING = "isFillingPreparing";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isFillingPreparing = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IN_PROCESS_FOLDER_ID = "inProcessFolderId";
  @javax.annotation.Nullable  private JsonNullable<Integer> inProcessFolderId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_IN_PROCESS_FOLDER_TITLE = "inProcessFolderTitle";
  @javax.annotation.Nullable  private JsonNullable<String> inProcessFolderTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESULTS_FOLDER_ID = "resultsFolderId";
  @javax.annotation.Nullable  private JsonNullable<Integer> resultsFolderId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DRAFT_LOCATION = "draftLocation";
  @javax.annotation.Nullable  private ThirdPartyDraftLocation draftLocation;

  public static final String JSON_PROPERTY_VIEW_ACCESSIBILITY = "viewAccessibility";
  @javax.annotation.Nullable  private JsonNullable<FileDtoAllOfViewAccessibility> viewAccessibility = JsonNullable.<FileDtoAllOfViewAccessibility>undefined();

  public static final String JSON_PROPERTY_LAST_OPENED = "lastOpened";
  @javax.annotation.Nullable  private ApiDateTime lastOpened;

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  @javax.annotation.Nullable  private ApiDateTime expired;

  public static final String JSON_PROPERTY_VECTORIZATION_STATUS = "vectorizationStatus";
  @javax.annotation.Nullable  private VectorizationStatus vectorizationStatus;

  public static final String JSON_PROPERTY_EXTERNAL_DB_TABLE_NAME = "externalDbTableName";
  @javax.annotation.Nullable  private JsonNullable<String> externalDbTableName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  @javax.annotation.Nullable  private Size dimensions;

  public ThirdPartyFileDto() {
  }


  public ThirdPartyFileDto title(@javax.annotation.Nullable String title) {
    
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

  public ThirdPartyFileDto access(@javax.annotation.Nullable FileShare access) {
    
    this.access = access;
    return this;
  }

  /**
   * The level the calling account holds on this entry, resolved from its own rights, the groups it belongs to and  any link it came in through. It is the level itself, not what the account may do with it - the action flags  below answer that.
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

  public ThirdPartyFileDto sharedBy(@javax.annotation.Nullable EmployeeDto sharedBy) {
    
    this.sharedBy = sharedBy;
    return this;
  }

  /**
   * Who gave the calling account the access it is using. It is filled in only while the entry is being read  through a share, and never for a caller without an account.
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

  public ThirdPartyFileDto ownedBy(@javax.annotation.Nullable EmployeeDto ownedBy) {
    
    this.ownedBy = ownedBy;
    return this;
  }

  /**
   * Who owns the place the entry is shared from - the creator of the room it lies in, or of the personal section  that holds it. It is filled in only while the entry is being read through a share, and never for a caller  without an account.
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

  public ThirdPartyFileDto shared(@javax.annotation.Nullable Boolean shared) {
    
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

  public ThirdPartyFileDto sharedForUser(@javax.annotation.Nullable Boolean sharedForUser) {
    
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

  public ThirdPartyFileDto sharedExternal(@javax.annotation.Nullable Boolean sharedExternal) {
    
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

  public ThirdPartyFileDto parentShared(@javax.annotation.Nullable Boolean parentShared) {
    
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

  public ThirdPartyFileDto shortWebUrl(@javax.annotation.Nullable URI shortWebUrl) {
    
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

  public ThirdPartyFileDto created(@javax.annotation.Nullable ApiDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * When the entry was created, written with the offset of the portal's time zone. For a file restored from an  older version this is still the moment the file first appeared.
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

  public ThirdPartyFileDto createdBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Who created the entry. It is null for a caller without an account, who is told nothing about the portal's  members.
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

  public ThirdPartyFileDto updated(@javax.annotation.Nullable ApiDateTime updated) {
    
    this.updated = updated;
    return this;
  }

  /**
   * When the entry last changed, written with the offset of the portal's time zone. It is never reported as  earlier than the creation moment, so the two can be compared safely.
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

  public ThirdPartyFileDto autoDelete(@javax.annotation.Nullable ApiDateTime autoDelete) {
    
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * When the entry will disappear on its own, written with the offset of the portal's time zone. It is filled in  only where a removal is actually scheduled - something in the trash while the portal cleans it up  automatically, or a guest's own documents - so a null means nothing is scheduled rather than that the entry is  permanent.
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

  public ThirdPartyFileDto rootFolderType(@javax.annotation.Nullable FolderType rootFolderType) {
    
    this.rootFolderType = rootFolderType;
    return this;
  }

  /**
   * The section the entry ultimately belongs to, which is what tells a personal document from one inside a room,  from a template and from something in the trash or the archive.
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

  public ThirdPartyFileDto parentRoomType(@javax.annotation.Nullable FolderType parentRoomType) {
    
    this.parentRoomType = parentRoomType;
    return this;
  }

  /**
   * The kind of room the entry lies in, which decides what the room allows - filling forms, public links,  indexing. It is null for an entry that is not inside a room at all.
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

  public ThirdPartyFileDto updatedBy(@javax.annotation.Nullable EmployeeDto updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Who changed the entry last. It is null for a caller without an account.
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

  public ThirdPartyFileDto providerItem(@javax.annotation.Nullable Boolean providerItem) {
    
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

  public ThirdPartyFileDto providerKey(@javax.annotation.Nullable String providerKey) {
    
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

  public ThirdPartyFileDto providerId(@javax.annotation.Nullable Integer providerId) {
    
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

  public ThirdPartyFileDto order(@javax.annotation.Nullable String order) {
    
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

  public ThirdPartyFileDto isFavorite(@javax.annotation.Nullable Boolean isFavorite) {
    
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

  public ThirdPartyFileDto fileEntryType(@javax.annotation.Nullable FileEntryType fileEntryType) {
    
    this.fileEntryType = fileEntryType;
    return this;
  }

  /**
   * Tells a folder from a file, and so which of the two shapes the rest of the object has. A room is reported as a  folder here.
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

  public ThirdPartyFileDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The identifier to pass back to the other operations of this entry. It is a number for storage on the portal  and a string for a connected third-party account, and it is unique only within its own kind, so files and  folders may carry the same value.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public ThirdPartyFileDto rootFolderId(@javax.annotation.Nullable String rootFolderId) {
    
    this.rootFolderId = rootFolderId;
    return this;
  }

  /**
   * The section the entry ultimately lies in, as an identifier that can be listed like any other folder. For an  entry inside a room this is the rooms section, not the room.
   * @return rootFolderId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRootFolderId() {
    return rootFolderId;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootFolderId(@javax.annotation.Nullable String rootFolderId) {
    this.rootFolderId = rootFolderId;
  }

  public ThirdPartyFileDto originId(@javax.annotation.Nullable String originId) {
    
    this.originId = originId;
    return this;
  }

  /**
   * The folder the entry was deleted from, which is where restoring it puts it back. It is left out of the answer  unless the entry is in the trash.
   * @return originId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginId() {
    return originId;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginId(@javax.annotation.Nullable String originId) {
    this.originId = originId;
  }

  public ThirdPartyFileDto originRoomId(@javax.annotation.Nullable String originRoomId) {
    
    this.originRoomId = originRoomId;
    return this;
  }

  /**
   * The room the entry was deleted from, left out of the answer for anything that was not deleted out of a room.
   * @return originRoomId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ROOM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginRoomId() {
    return originRoomId;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGIN_ROOM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginRoomId(@javax.annotation.Nullable String originRoomId) {
    this.originRoomId = originRoomId;
  }

  public ThirdPartyFileDto originTitle(@javax.annotation.Nullable String originTitle) {
    
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

  public ThirdPartyFileDto originRoomTitle(@javax.annotation.Nullable String originRoomTitle) {
    
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

  public ThirdPartyFileDto canShare(@javax.annotation.Nullable Boolean canShare) {
    
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

  public ThirdPartyFileDto shareSettings(@javax.annotation.Nullable AiFileEntryDtoAllOfShareSettings shareSettings) {
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

  public ThirdPartyFileDto security(@javax.annotation.Nullable AiFileEntryDtoAllOfSecurity security) {
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

  public ThirdPartyFileDto availableShareRights(@javax.annotation.Nullable AiFileEntryDtoAllOfAvailableShareRights availableShareRights) {
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

  public ThirdPartyFileDto requestToken(@javax.annotation.Nullable String requestToken) {
    
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

  public ThirdPartyFileDto external(@javax.annotation.Nullable Boolean external) {
    
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

  public ThirdPartyFileDto expirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * When the link being used stops working, written with the offset of the portal's time zone. It is null for a  link that never expires and whenever no link is involved.
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

  public ThirdPartyFileDto isLinkExpired(@javax.annotation.Nullable Boolean isLinkExpired) {
    
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

  public ThirdPartyFileDto folderId(@javax.annotation.Nullable String folderId) {
    this.folderId = JsonNullable.<String>of(folderId);
    
    return this;
  }

  /**
   * The folder the file is stored in. When the file was reached through a share and the caller cannot open its  real parent, the identifier of the Shared with me section is reported instead, so this is where the file is  visible rather than where it physically sits.
   * @return folderId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFolderId() {
        return folderId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFolderId_JsonNullable() {
    return folderId;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  public void setFolderId_JsonNullable(JsonNullable<String> folderId) {
    this.folderId = folderId;
  }

  public void setFolderId(@javax.annotation.Nullable String folderId) {
    this.folderId = JsonNullable.<String>of(folderId);
  }

  public ThirdPartyFileDto version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The revision this entry describes. It starts at 1 and moves to the next number each time new content is stored  over the file, except for an editing session opened against the file itself, which replaces the content and  keeps the number. `GET api/2.0/files/file/{fileId}/history` lists them all.
   * @return version
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }

  public ThirdPartyFileDto versionGroup(@javax.annotation.Nullable Integer versionGroup) {
    
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * Groups revisions that belong together, which is how a history can fold a long editing session into one entry:  versions saved inside one session share this number, and an upload over the file starts a new group.
   * @return versionGroup
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VERSION_GROUP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersionGroup() {
    return versionGroup;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION_GROUP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionGroup(@javax.annotation.Nullable Integer versionGroup) {
    this.versionGroup = versionGroup;
  }

  public ThirdPartyFileDto contentLength(@javax.annotation.Nullable String contentLength) {
    this.contentLength = JsonNullable.<String>of(contentLength);
    
    return this;
  }

  /**
   * The size already formatted for display, with a unit and the separators of the caller's language. Read  `pureContentLength` for a number to calculate with.
   * @return contentLength
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getContentLength() {
        return contentLength.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONTENT_LENGTH, required = false)
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

  public ThirdPartyFileDto pureContentLength(@javax.annotation.Nullable Long pureContentLength) {
    this.pureContentLength = JsonNullable.<Long>of(pureContentLength);
    
    return this;
  }

  /**
   * The size of the stored content in bytes, and null for an empty file.
   * @return pureContentLength
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Long getPureContentLength() {
        return pureContentLength.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PURE_CONTENT_LENGTH, required = false)
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

  public ThirdPartyFileDto fileStatus(@javax.annotation.Nullable FileStatus fileStatus) {
    
    this.fileStatus = fileStatus;
    return this;
  }

  /**
   * What the portal is currently doing with the file and how the caller stands towards it - open in the editor,  unread, being converted, and so on. The value is a bit mask that combines those states, so a file can report a  number that matches none of the published members on its own.
   * @return fileStatus
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileStatus getFileStatus() {
    return fileStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileStatus(@javax.annotation.Nullable FileStatus fileStatus) {
    this.fileStatus = fileStatus;
  }

  public ThirdPartyFileDto editingBy(@javax.annotation.Nullable Map<String, String> editingBy) {
    
    this.editingBy = editingBy;
    return this;
  }

  public ThirdPartyFileDto putEditingByItem(String key, String editingByItem) {
    if (this.editingBy == null) {
      this.editingBy = new HashMap<>();
    }
    this.editingBy.put(key, editingByItem);
    return this;
  }

  /**
   * The accounts that have the file open in the editor at this moment, as account identifier to display name, and  empty when nobody has. The all-zero identifier stands for people who came in through an external link without  signing in, and its name carries their number in brackets when there is more than one.
   * @return editingBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EDITING_BY, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getEditingBy() {
    return editingBy;
  }


  @JsonProperty(value = JSON_PROPERTY_EDITING_BY, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditingBy(@javax.annotation.Nullable Map<String, String> editingBy) {
    this.editingBy = editingBy;
  }

  public ThirdPartyFileDto mute(@javax.annotation.Nullable Boolean mute) {
    
    this.mute = mute;
    return this;
  }

  /**
   * Not a property of the file at all: it repeats, inverted, the calling account's own switch for new-item badges,  so it is the same in every entry of one answer. True means that account has badges turned off.
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

  public ThirdPartyFileDto viewUrl(@javax.annotation.Nullable URI viewUrl) {
    this.viewUrl = JsonNullable.<URI>of(viewUrl);
    
    return this;
  }

  /**
   * The address that returns the bytes of the file - a download, in spite of the name; `webUrl` is the address a  person opens. When the file was reached through an external link the address carries the key of that link, so  it keeps working without signing in.
   * @return viewUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getViewUrl() {
        return viewUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VIEW_URL, required = false)
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

  public ThirdPartyFileDto webUrl(@javax.annotation.Nullable URI webUrl) {
    this.webUrl = JsonNullable.<URI>of(webUrl);
    
    return this;
  }

  /**
   * The page that opens the file in a browser: the editor for a format the portal edits, the media viewer for  pictures, audio and video, and the download address for a format it cannot show at all.
   * @return webUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getWebUrl() {
        return webUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WEB_URL, required = false)
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

  public ThirdPartyFileDto fileType(@javax.annotation.Nullable FileType fileType) {
    
    this.fileType = fileType;
    return this;
  }

  /**
   * The broad kind of content, worked out from the extension, which is what a client uses to pick an icon or a  viewer without parsing `fileExst` itself.
   * @return fileType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileType getFileType() {
    return fileType;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileType(@javax.annotation.Nullable FileType fileType) {
    this.fileType = fileType;
  }

  public ThirdPartyFileDto fileExst(@javax.annotation.Nullable String fileExst) {
    this.fileExst = JsonNullable.<String>of(fileExst);
    
    return this;
  }

  /**
   * The extension of the stored file, leading dot included and always lower case. For a format the portal keeps in  a converted shape this is the extension it is served under, not the one it was uploaded with.
   * @return fileExst
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFileExst() {
        return fileExst.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_EXST, required = false)
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

  public ThirdPartyFileDto comment(@javax.annotation.Nullable String comment) {
    this.comment = JsonNullable.<String>of(comment);
    
    return this;
  }

  /**
   * The note kept with this revision. The portal writes it itself for revisions it creates, an upload over an  existing file among them, and an editor stores the note a person typed when saving a version.
   * @return comment
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COMMENT, required = false)
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

  public ThirdPartyFileDto encrypted(@javax.annotation.Nullable Boolean encrypted) {
    this.encrypted = JsonNullable.<Boolean>of(encrypted);
    
    return this;
  }

  /**
   * True for a file in a private room, whose content the server never sees and which therefore cannot be converted  or taken over by an upload. Null, rather than false, for an ordinary file.
   * @return encrypted
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getEncrypted() {
        return encrypted.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENCRYPTED, required = false)
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

  public ThirdPartyFileDto thumbnailUrl(@javax.annotation.Nullable URI thumbnailUrl) {
    this.thumbnailUrl = JsonNullable.<URI>of(thumbnailUrl);
    
    return this;
  }

  /**
   * The address of the generated preview image. It is filled in only while `thumbnailStatus` says the preview has  been created, and it carries a suffix that changes with the file, so an image cached for an earlier revision  is not reused.
   * @return thumbnailUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getThumbnailUrl() {
        return thumbnailUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_THUMBNAIL_URL, required = false)
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

  public ThirdPartyFileDto thumbnailStatus(@javax.annotation.Nullable Thumbnail thumbnailStatus) {
    
    this.thumbnailStatus = thumbnailStatus;
    return this;
  }

  /**
   * How far the preview image has got. Only the created state means `thumbnailUrl` holds an address; the others  mean there is none, either because it is still being produced or because this format has no preview.
   * @return thumbnailStatus
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_THUMBNAIL_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Thumbnail getThumbnailStatus() {
    return thumbnailStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_THUMBNAIL_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnailStatus(@javax.annotation.Nullable Thumbnail thumbnailStatus) {
    this.thumbnailStatus = thumbnailStatus;
  }

  public ThirdPartyFileDto locked(@javax.annotation.Nullable Boolean locked) {
    this.locked = JsonNullable.<Boolean>of(locked);
    
    return this;
  }

  /**
   * True while the file is held under a lock that stops anyone but its holder from editing it, and null rather  than false when there is no lock. `lockedBy` names the holder unless the caller is the holder.
   * @return locked
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getLocked() {
        return locked.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LOCKED, required = false)
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

  public ThirdPartyFileDto lockedBy(@javax.annotation.Nullable String lockedBy) {
    this.lockedBy = JsonNullable.<String>of(lockedBy);
    
    return this;
  }

  /**
   * The display name of the account holding the lock, and null when the caller holds it - so `locked` true  together with no name here means the lock is the caller's own.
   * @return lockedBy
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLockedBy() {
        return lockedBy.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LOCKED_BY, required = false)
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

  public ThirdPartyFileDto hasDraft(@javax.annotation.Nullable Boolean hasDraft) {
    this.hasDraft = JsonNullable.<Boolean>of(hasDraft);
    
    return this;
  }

  /**
   * For a fillable PDF form, whether the caller already has a filling draft of it, in which case `draftLocation`  says where that draft lives. Null for anything that is not a form.
   * @return hasDraft
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getHasDraft() {
        return hasDraft.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HAS_DRAFT, required = false)
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

  public ThirdPartyFileDto formFillingStatus(@javax.annotation.Nullable FormFillingStatus formFillingStatus) {
    
    this.formFillingStatus = formFillingStatus;
    return this;
  }

  /**
   * How far the filling of this form has got for the calling account, and whose turn it is now. It is worked out  only inside a virtual data room, where filling runs in steps; everywhere else it stays at the none value.
   * @return formFillingStatus
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FORM_FILLING_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFillingStatus getFormFillingStatus() {
    return formFillingStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_FORM_FILLING_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFillingStatus(@javax.annotation.Nullable FormFillingStatus formFillingStatus) {
    this.formFillingStatus = formFillingStatus;
  }

  public ThirdPartyFileDto isForm(@javax.annotation.Nullable Boolean isForm) {
    this.isForm = JsonNullable.<Boolean>of(isForm);
    
    return this;
  }

  /**
   * Whether the file is a PDF, and so offered as a fillable form. It is null for any other file type.
   * @return isForm
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsForm() {
        return isForm.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_FORM, required = false)
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

  public ThirdPartyFileDto customFilterEnabled(@javax.annotation.Nullable Boolean customFilterEnabled) {
    this.customFilterEnabled = JsonNullable.<Boolean>of(customFilterEnabled);
    
    return this;
  }

  /**
   * True while a spreadsheet is in the mode where each person sorts and filters their own view without changing  what the others see, and null rather than false when it is not.
   * @return customFilterEnabled
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getCustomFilterEnabled() {
        return customFilterEnabled.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CUSTOM_FILTER_ENABLED, required = false)
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

  public ThirdPartyFileDto customFilterEnabledBy(@javax.annotation.Nullable String customFilterEnabledBy) {
    this.customFilterEnabledBy = JsonNullable.<String>of(customFilterEnabledBy);
    
    return this;
  }

  /**
   * The display name of the account that turned that mode on, and null when the caller turned it on themselves.
   * @return customFilterEnabledBy
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCustomFilterEnabledBy() {
        return customFilterEnabledBy.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CUSTOM_FILTER_ENABLED_BY, required = false)
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

  public ThirdPartyFileDto startFilling(@javax.annotation.Nullable Boolean startFilling) {
    this.startFilling = JsonNullable.<Boolean>of(startFilling);
    
    return this;
  }

  /**
   * For a form in a room for filling, whether it has been released for filling; until then it is still being  prepared and only the people running the room work with it. Null for a file this does not apply to.
   * @return startFilling
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getStartFilling() {
        return startFilling.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_START_FILLING, required = false)
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

  public ThirdPartyFileDto isFillingPreparing(@javax.annotation.Nullable Boolean isFillingPreparing) {
    this.isFillingPreparing = JsonNullable.<Boolean>of(isFillingPreparing);
    
    return this;
  }

  /**
   * True during the short window in which a released form is still being written out by the editor. Neither  filling nor editing is accepted while it lasts, so a client should wait and read the file again.
   * @return isFillingPreparing
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsFillingPreparing() {
        return isFillingPreparing.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_FILLING_PREPARING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsFillingPreparing_JsonNullable() {
    return isFillingPreparing;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_FILLING_PREPARING)
  public void setIsFillingPreparing_JsonNullable(JsonNullable<Boolean> isFillingPreparing) {
    this.isFillingPreparing = isFillingPreparing;
  }

  public void setIsFillingPreparing(@javax.annotation.Nullable Boolean isFillingPreparing) {
    this.isFillingPreparing = JsonNullable.<Boolean>of(isFillingPreparing);
  }

  public ThirdPartyFileDto inProcessFolderId(@javax.annotation.Nullable Integer inProcessFolderId) {
    this.inProcessFolderId = JsonNullable.<Integer>of(inProcessFolderId);
    
    return this;
  }

  /**
   * Left empty by the portal: the folder holding the caller's draft is reported in `draftLocation` instead.
   * @return inProcessFolderId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getInProcessFolderId() {
        return inProcessFolderId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IN_PROCESS_FOLDER_ID, required = false)
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

  public ThirdPartyFileDto inProcessFolderTitle(@javax.annotation.Nullable String inProcessFolderTitle) {
    this.inProcessFolderTitle = JsonNullable.<String>of(inProcessFolderTitle);
    
    return this;
  }

  /**
   * Left empty by the portal, like the identifier beside it; the draft's folder is named in `draftLocation`.
   * @return inProcessFolderTitle
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getInProcessFolderTitle() {
        return inProcessFolderTitle.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IN_PROCESS_FOLDER_TITLE, required = false)
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

  public ThirdPartyFileDto resultsFolderId(@javax.annotation.Nullable Integer resultsFolderId) {
    this.resultsFolderId = JsonNullable.<Integer>of(resultsFolderId);
    
    return this;
  }

  /**
   * The folder that collects the completed copies of this form. It is filled in only for the original form of a  room for filling, and only for a caller allowed to work with that form; null everywhere else.
   * @return resultsFolderId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getResultsFolderId() {
        return resultsFolderId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RESULTS_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getResultsFolderId_JsonNullable() {
    return resultsFolderId;
  }
  
  @JsonProperty(JSON_PROPERTY_RESULTS_FOLDER_ID)
  public void setResultsFolderId_JsonNullable(JsonNullable<Integer> resultsFolderId) {
    this.resultsFolderId = resultsFolderId;
  }

  public void setResultsFolderId(@javax.annotation.Nullable Integer resultsFolderId) {
    this.resultsFolderId = JsonNullable.<Integer>of(resultsFolderId);
  }

  public ThirdPartyFileDto draftLocation(@javax.annotation.Nullable ThirdPartyDraftLocation draftLocation) {
    
    this.draftLocation = draftLocation;
    return this;
  }

  /**
   * Where the caller's own filling draft of this form is kept. Null when there is no draft yet, which is the same  thing `hasDraft` reports.
   * @return draftLocation
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DRAFT_LOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThirdPartyDraftLocation getDraftLocation() {
    return draftLocation;
  }


  @JsonProperty(value = JSON_PROPERTY_DRAFT_LOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDraftLocation(@javax.annotation.Nullable ThirdPartyDraftLocation draftLocation) {
    this.draftLocation = draftLocation;
  }

  public ThirdPartyFileDto viewAccessibility(@javax.annotation.Nullable FileDtoAllOfViewAccessibility viewAccessibility) {
    this.viewAccessibility = JsonNullable.<FileDtoAllOfViewAccessibility>of(viewAccessibility);
    
    return this;
  }

  /**
   * Get viewAccessibility
   * @return viewAccessibility
   */
  @javax.annotation.Nullable  @JsonIgnore

  public FileDtoAllOfViewAccessibility getViewAccessibility() {
        return viewAccessibility.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VIEW_ACCESSIBILITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<FileDtoAllOfViewAccessibility> getViewAccessibility_JsonNullable() {
    return viewAccessibility;
  }
  
  @JsonProperty(JSON_PROPERTY_VIEW_ACCESSIBILITY)
  public void setViewAccessibility_JsonNullable(JsonNullable<FileDtoAllOfViewAccessibility> viewAccessibility) {
    this.viewAccessibility = viewAccessibility;
  }

  public void setViewAccessibility(@javax.annotation.Nullable FileDtoAllOfViewAccessibility viewAccessibility) {
    this.viewAccessibility = JsonNullable.<FileDtoAllOfViewAccessibility>of(viewAccessibility);
  }

  public ThirdPartyFileDto lastOpened(@javax.annotation.Nullable ApiDateTime lastOpened) {
    
    this.lastOpened = lastOpened;
    return this;
  }

  /**
   * The moment the caller last opened the file. It is kept per account and is what orders the Recent section, so  it is null for a file this account has never opened. Written with the offset of the portal's time zone.
   * @return lastOpened
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_OPENED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getLastOpened() {
    return lastOpened;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_OPENED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastOpened(@javax.annotation.Nullable ApiDateTime lastOpened) {
    this.lastOpened = lastOpened;
  }

  public ThirdPartyFileDto expired(@javax.annotation.Nullable ApiDateTime expired) {
    
    this.expired = expired;
    return this;
  }

  /**
   * The moment the file falls under the lifetime rule of the room holding it and is removed. It is counted from  the first revision rather than the latest one, so editing a file does not postpone it, and it is null when the  room sets no lifetime. Written with the offset of the portal's time zone.
   * @return expired
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getExpired() {
    return expired;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpired(@javax.annotation.Nullable ApiDateTime expired) {
    this.expired = expired;
  }

  public ThirdPartyFileDto vectorizationStatus(@javax.annotation.Nullable VectorizationStatus vectorizationStatus) {
    
    this.vectorizationStatus = vectorizationStatus;
    return this;
  }

  /**
   * How far the indexing of the file's content for AI search has got. It is null for a file that has never been  queued for indexing, which is every file while the feature is off for the portal.
   * @return vectorizationStatus
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VectorizationStatus getVectorizationStatus() {
    return vectorizationStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVectorizationStatus(@javax.annotation.Nullable VectorizationStatus vectorizationStatus) {
    this.vectorizationStatus = vectorizationStatus;
  }

  public ThirdPartyFileDto externalDbTableName(@javax.annotation.Nullable String externalDbTableName) {
    this.externalDbTableName = JsonNullable.<String>of(externalDbTableName);
    
    return this;
  }

  /**
   * The table collecting the submitted values of this form in the external database configured for its room. The  field is left out of the answer entirely when the form has no such table.
   * @return externalDbTableName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getExternalDbTableName() {
        return externalDbTableName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_DB_TABLE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getExternalDbTableName_JsonNullable() {
    return externalDbTableName;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_DB_TABLE_NAME)
  public void setExternalDbTableName_JsonNullable(JsonNullable<String> externalDbTableName) {
    this.externalDbTableName = externalDbTableName;
  }

  public void setExternalDbTableName(@javax.annotation.Nullable String externalDbTableName) {
    this.externalDbTableName = JsonNullable.<String>of(externalDbTableName);
  }

  public ThirdPartyFileDto dimensions(@javax.annotation.Nullable Size dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  /**
   * The pixel size of the picture, measured by reading the stored file rather than taken from any stored metadata.  Null for anything that is not a picture the portal can show, and also when the file could not be read.
   * @return dimensions
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DIMENSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Size getDimensions() {
    return dimensions;
  }


  @JsonProperty(value = JSON_PROPERTY_DIMENSIONS, required = false)
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
    ThirdPartyFileDto thirdPartyFileDto = (ThirdPartyFileDto) o;
    return Objects.equals(this.title, thirdPartyFileDto.title) &&
        Objects.equals(this.access, thirdPartyFileDto.access) &&
        Objects.equals(this.sharedBy, thirdPartyFileDto.sharedBy) &&
        Objects.equals(this.ownedBy, thirdPartyFileDto.ownedBy) &&
        Objects.equals(this.shared, thirdPartyFileDto.shared) &&
        Objects.equals(this.sharedForUser, thirdPartyFileDto.sharedForUser) &&
        Objects.equals(this.sharedExternal, thirdPartyFileDto.sharedExternal) &&
        Objects.equals(this.parentShared, thirdPartyFileDto.parentShared) &&
        Objects.equals(this.shortWebUrl, thirdPartyFileDto.shortWebUrl) &&
        Objects.equals(this.created, thirdPartyFileDto.created) &&
        Objects.equals(this.createdBy, thirdPartyFileDto.createdBy) &&
        Objects.equals(this.updated, thirdPartyFileDto.updated) &&
        Objects.equals(this.autoDelete, thirdPartyFileDto.autoDelete) &&
        Objects.equals(this.rootFolderType, thirdPartyFileDto.rootFolderType) &&
        Objects.equals(this.parentRoomType, thirdPartyFileDto.parentRoomType) &&
        Objects.equals(this.updatedBy, thirdPartyFileDto.updatedBy) &&
        Objects.equals(this.providerItem, thirdPartyFileDto.providerItem) &&
        Objects.equals(this.providerKey, thirdPartyFileDto.providerKey) &&
        Objects.equals(this.providerId, thirdPartyFileDto.providerId) &&
        Objects.equals(this.order, thirdPartyFileDto.order) &&
        Objects.equals(this.isFavorite, thirdPartyFileDto.isFavorite) &&
        Objects.equals(this.fileEntryType, thirdPartyFileDto.fileEntryType) &&
        Objects.equals(this.id, thirdPartyFileDto.id) &&
        Objects.equals(this.rootFolderId, thirdPartyFileDto.rootFolderId) &&
        Objects.equals(this.originId, thirdPartyFileDto.originId) &&
        Objects.equals(this.originRoomId, thirdPartyFileDto.originRoomId) &&
        Objects.equals(this.originTitle, thirdPartyFileDto.originTitle) &&
        Objects.equals(this.originRoomTitle, thirdPartyFileDto.originRoomTitle) &&
        Objects.equals(this.canShare, thirdPartyFileDto.canShare) &&
        equalsNullable(this.shareSettings, thirdPartyFileDto.shareSettings) &&
        equalsNullable(this.security, thirdPartyFileDto.security) &&
        equalsNullable(this.availableShareRights, thirdPartyFileDto.availableShareRights) &&
        Objects.equals(this.requestToken, thirdPartyFileDto.requestToken) &&
        Objects.equals(this.external, thirdPartyFileDto.external) &&
        Objects.equals(this.expirationDate, thirdPartyFileDto.expirationDate) &&
        Objects.equals(this.isLinkExpired, thirdPartyFileDto.isLinkExpired) &&
        equalsNullable(this.folderId, thirdPartyFileDto.folderId) &&
        Objects.equals(this.version, thirdPartyFileDto.version) &&
        Objects.equals(this.versionGroup, thirdPartyFileDto.versionGroup) &&
        equalsNullable(this.contentLength, thirdPartyFileDto.contentLength) &&
        equalsNullable(this.pureContentLength, thirdPartyFileDto.pureContentLength) &&
        Objects.equals(this.fileStatus, thirdPartyFileDto.fileStatus) &&
        Objects.equals(this.editingBy, thirdPartyFileDto.editingBy) &&
        Objects.equals(this.mute, thirdPartyFileDto.mute) &&
        equalsNullable(this.viewUrl, thirdPartyFileDto.viewUrl) &&
        equalsNullable(this.webUrl, thirdPartyFileDto.webUrl) &&
        Objects.equals(this.fileType, thirdPartyFileDto.fileType) &&
        equalsNullable(this.fileExst, thirdPartyFileDto.fileExst) &&
        equalsNullable(this.comment, thirdPartyFileDto.comment) &&
        equalsNullable(this.encrypted, thirdPartyFileDto.encrypted) &&
        equalsNullable(this.thumbnailUrl, thirdPartyFileDto.thumbnailUrl) &&
        Objects.equals(this.thumbnailStatus, thirdPartyFileDto.thumbnailStatus) &&
        equalsNullable(this.locked, thirdPartyFileDto.locked) &&
        equalsNullable(this.lockedBy, thirdPartyFileDto.lockedBy) &&
        equalsNullable(this.hasDraft, thirdPartyFileDto.hasDraft) &&
        Objects.equals(this.formFillingStatus, thirdPartyFileDto.formFillingStatus) &&
        equalsNullable(this.isForm, thirdPartyFileDto.isForm) &&
        equalsNullable(this.customFilterEnabled, thirdPartyFileDto.customFilterEnabled) &&
        equalsNullable(this.customFilterEnabledBy, thirdPartyFileDto.customFilterEnabledBy) &&
        equalsNullable(this.startFilling, thirdPartyFileDto.startFilling) &&
        equalsNullable(this.isFillingPreparing, thirdPartyFileDto.isFillingPreparing) &&
        equalsNullable(this.inProcessFolderId, thirdPartyFileDto.inProcessFolderId) &&
        equalsNullable(this.inProcessFolderTitle, thirdPartyFileDto.inProcessFolderTitle) &&
        equalsNullable(this.resultsFolderId, thirdPartyFileDto.resultsFolderId) &&
        Objects.equals(this.draftLocation, thirdPartyFileDto.draftLocation) &&
        equalsNullable(this.viewAccessibility, thirdPartyFileDto.viewAccessibility) &&
        Objects.equals(this.lastOpened, thirdPartyFileDto.lastOpened) &&
        Objects.equals(this.expired, thirdPartyFileDto.expired) &&
        Objects.equals(this.vectorizationStatus, thirdPartyFileDto.vectorizationStatus) &&
        equalsNullable(this.externalDbTableName, thirdPartyFileDto.externalDbTableName) &&
        Objects.equals(this.dimensions, thirdPartyFileDto.dimensions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, access, sharedBy, ownedBy, shared, sharedForUser, sharedExternal, parentShared, shortWebUrl, created, createdBy, updated, autoDelete, rootFolderType, parentRoomType, updatedBy, providerItem, providerKey, providerId, order, isFavorite, fileEntryType, id, rootFolderId, originId, originRoomId, originTitle, originRoomTitle, canShare, hashCodeNullable(shareSettings), hashCodeNullable(security), hashCodeNullable(availableShareRights), requestToken, external, expirationDate, isLinkExpired, hashCodeNullable(folderId), version, versionGroup, hashCodeNullable(contentLength), hashCodeNullable(pureContentLength), fileStatus, editingBy, mute, hashCodeNullable(viewUrl), hashCodeNullable(webUrl), fileType, hashCodeNullable(fileExst), hashCodeNullable(comment), hashCodeNullable(encrypted), hashCodeNullable(thumbnailUrl), thumbnailStatus, hashCodeNullable(locked), hashCodeNullable(lockedBy), hashCodeNullable(hasDraft), formFillingStatus, hashCodeNullable(isForm), hashCodeNullable(customFilterEnabled), hashCodeNullable(customFilterEnabledBy), hashCodeNullable(startFilling), hashCodeNullable(isFillingPreparing), hashCodeNullable(inProcessFolderId), hashCodeNullable(inProcessFolderTitle), hashCodeNullable(resultsFolderId), draftLocation, hashCodeNullable(viewAccessibility), lastOpened, expired, vectorizationStatus, hashCodeNullable(externalDbTableName), dimensions);
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
    sb.append("class ThirdPartyFileDto {\n");
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
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    pureContentLength: ").append(toIndentedString(pureContentLength)).append("\n");
    sb.append("    fileStatus: ").append(toIndentedString(fileStatus)).append("\n");
    sb.append("    editingBy: ").append(toIndentedString(editingBy)).append("\n");
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
    sb.append("    isFillingPreparing: ").append(toIndentedString(isFillingPreparing)).append("\n");
    sb.append("    inProcessFolderId: ").append(toIndentedString(inProcessFolderId)).append("\n");
    sb.append("    inProcessFolderTitle: ").append(toIndentedString(inProcessFolderTitle)).append("\n");
    sb.append("    resultsFolderId: ").append(toIndentedString(resultsFolderId)).append("\n");
    sb.append("    draftLocation: ").append(toIndentedString(draftLocation)).append("\n");
    sb.append("    viewAccessibility: ").append(toIndentedString(viewAccessibility)).append("\n");
    sb.append("    lastOpened: ").append(toIndentedString(lastOpened)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    vectorizationStatus: ").append(toIndentedString(vectorizationStatus)).append("\n");
    sb.append("    externalDbTableName: ").append(toIndentedString(externalDbTableName)).append("\n");
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

    // add `editingBy` to the URL query string
    if (getEditingBy() != null) {
      for (String _key : getEditingBy().keySet()) {
        try {
          joiner.add(String.format("%seditingBy%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getEditingBy().get(_key), URLEncoder.encode(String.valueOf(getEditingBy().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `isFillingPreparing` to the URL query string
    if (getIsFillingPreparing() != null) {
      try {
        joiner.add(String.format("%sisFillingPreparing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsFillingPreparing()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `resultsFolderId` to the URL query string
    if (getResultsFolderId() != null) {
      try {
        joiner.add(String.format("%sresultsFolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResultsFolderId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `externalDbTableName` to the URL query string
    if (getExternalDbTableName() != null) {
      try {
        joiner.add(String.format("%sexternalDbTableName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalDbTableName()), "UTF-8").replaceAll("\\+", "%20")));
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

