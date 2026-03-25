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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.AutoCleanUpData;
import org.openapitools.client.model.FilesSettingsDtoInternalFormats;
import org.openapitools.client.model.OrderBy;
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
 * The file settings parameters.
 */
@JsonPropertyOrder({
  FilesSettingsDto.JSON_PROPERTY_EXTS_IMAGE_PREVIEWED,
  FilesSettingsDto.JSON_PROPERTY_EXTS_MEDIA_PREVIEWED,
  FilesSettingsDto.JSON_PROPERTY_EXTS_WEB_PREVIEWED,
  FilesSettingsDto.JSON_PROPERTY_EXTS_WEB_EDITED,
  FilesSettingsDto.JSON_PROPERTY_EXTS_WEB_ENCRYPT,
  FilesSettingsDto.JSON_PROPERTY_EXTS_WEB_REVIEWED,
  FilesSettingsDto.JSON_PROPERTY_EXTS_WEB_CUSTOM_FILTER_EDITING,
  FilesSettingsDto.JSON_PROPERTY_EXTS_WEB_RESTRICTED_EDITING,
  FilesSettingsDto.JSON_PROPERTY_EXTS_WEB_COMMENTED,
  FilesSettingsDto.JSON_PROPERTY_EXTS_WEB_TEMPLATE,
  FilesSettingsDto.JSON_PROPERTY_EXTS_MUST_CONVERT,
  FilesSettingsDto.JSON_PROPERTY_EXTS_CONVERTIBLE,
  FilesSettingsDto.JSON_PROPERTY_EXTS_UPLOADABLE,
  FilesSettingsDto.JSON_PROPERTY_EXTS_ARCHIVE,
  FilesSettingsDto.JSON_PROPERTY_EXTS_VIDEO,
  FilesSettingsDto.JSON_PROPERTY_EXTS_AUDIO,
  FilesSettingsDto.JSON_PROPERTY_EXTS_IMAGE,
  FilesSettingsDto.JSON_PROPERTY_EXTS_SPREADSHEET,
  FilesSettingsDto.JSON_PROPERTY_EXTS_PRESENTATION,
  FilesSettingsDto.JSON_PROPERTY_EXTS_DOCUMENT,
  FilesSettingsDto.JSON_PROPERTY_EXTS_DIAGRAM,
  FilesSettingsDto.JSON_PROPERTY_INTERNAL_FORMATS,
  FilesSettingsDto.JSON_PROPERTY_MASTER_FORM_EXTENSION,
  FilesSettingsDto.JSON_PROPERTY_PARAM_VERSION,
  FilesSettingsDto.JSON_PROPERTY_PARAM_OUT_TYPE,
  FilesSettingsDto.JSON_PROPERTY_FILE_DOWNLOAD_URL_STRING,
  FilesSettingsDto.JSON_PROPERTY_FILE_WEB_VIEWER_URL_STRING,
  FilesSettingsDto.JSON_PROPERTY_FILE_WEB_VIEWER_EXTERNAL_URL_STRING,
  FilesSettingsDto.JSON_PROPERTY_FILE_WEB_EDITOR_URL_STRING,
  FilesSettingsDto.JSON_PROPERTY_FILE_WEB_EDITOR_EXTERNAL_URL_STRING,
  FilesSettingsDto.JSON_PROPERTY_FILE_REDIRECT_PREVIEW_URL_STRING,
  FilesSettingsDto.JSON_PROPERTY_FILE_THUMBNAIL_URL_STRING,
  FilesSettingsDto.JSON_PROPERTY_CONFIRM_DELETE,
  FilesSettingsDto.JSON_PROPERTY_ENABLE_THIRD_PARTY,
  FilesSettingsDto.JSON_PROPERTY_EXTERNAL_SHARE,
  FilesSettingsDto.JSON_PROPERTY_EXTERNAL_SHARE_SOCIAL_MEDIA,
  FilesSettingsDto.JSON_PROPERTY_STORE_ORIGINAL_FILES,
  FilesSettingsDto.JSON_PROPERTY_KEEP_NEW_FILE_NAME,
  FilesSettingsDto.JSON_PROPERTY_DISPLAY_FILE_EXTENSION,
  FilesSettingsDto.JSON_PROPERTY_CONVERT_NOTIFY,
  FilesSettingsDto.JSON_PROPERTY_HIDE_CONFIRM_CANCEL_OPERATION,
  FilesSettingsDto.JSON_PROPERTY_HIDE_CONFIRM_CONVERT_SAVE,
  FilesSettingsDto.JSON_PROPERTY_HIDE_CONFIRM_CONVERT_OPEN,
  FilesSettingsDto.JSON_PROPERTY_HIDE_CONFIRM_ROOM_LIFETIME,
  FilesSettingsDto.JSON_PROPERTY_DEFAULT_ORDER,
  FilesSettingsDto.JSON_PROPERTY_FORCESAVE,
  FilesSettingsDto.JSON_PROPERTY_STORE_FORCESAVE,
  FilesSettingsDto.JSON_PROPERTY_RECENT_SECTION,
  FilesSettingsDto.JSON_PROPERTY_FAVORITES_SECTION,
  FilesSettingsDto.JSON_PROPERTY_TEMPLATES_SECTION,
  FilesSettingsDto.JSON_PROPERTY_DOWNLOAD_TAR_GZ,
  FilesSettingsDto.JSON_PROPERTY_AUTOMATICALLY_CLEAN_UP,
  FilesSettingsDto.JSON_PROPERTY_CAN_SEARCH_BY_CONTENT,
  FilesSettingsDto.JSON_PROPERTY_DEFAULT_SHARING_ACCESS_RIGHTS,
  FilesSettingsDto.JSON_PROPERTY_MAX_UPLOAD_THREAD_COUNT,
  FilesSettingsDto.JSON_PROPERTY_CHUNK_UPLOAD_SIZE,
  FilesSettingsDto.JSON_PROPERTY_OPEN_EDITOR_IN_SAME_TAB,
  FilesSettingsDto.JSON_PROPERTY_ORGANIZE_ROOMS_GROUPING,
  FilesSettingsDto.JSON_PROPERTY_EXTS_FILES_VECTORIZED,
  FilesSettingsDto.JSON_PROPERTY_MAX_VECTORIZATION_FILE_SIZE
})

public class FilesSettingsDto {
  public static final String JSON_PROPERTY_EXTS_IMAGE_PREVIEWED = "extsImagePreviewed";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsImagePreviewed = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_MEDIA_PREVIEWED = "extsMediaPreviewed";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsMediaPreviewed = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_WEB_PREVIEWED = "extsWebPreviewed";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsWebPreviewed = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_WEB_EDITED = "extsWebEdited";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsWebEdited = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_WEB_ENCRYPT = "extsWebEncrypt";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsWebEncrypt = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_WEB_REVIEWED = "extsWebReviewed";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsWebReviewed = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_WEB_CUSTOM_FILTER_EDITING = "extsWebCustomFilterEditing";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsWebCustomFilterEditing = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_WEB_RESTRICTED_EDITING = "extsWebRestrictedEditing";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsWebRestrictedEditing = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_WEB_COMMENTED = "extsWebCommented";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsWebCommented = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_WEB_TEMPLATE = "extsWebTemplate";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsWebTemplate = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_MUST_CONVERT = "extsMustConvert";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsMustConvert = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_CONVERTIBLE = "extsConvertible";
  @javax.annotation.Nullable  private JsonNullable<Map<String, List<String>>> extsConvertible = JsonNullable.<Map<String, List<String>>>undefined();

  public static final String JSON_PROPERTY_EXTS_UPLOADABLE = "extsUploadable";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsUploadable = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_ARCHIVE = "extsArchive";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsArchive = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_VIDEO = "extsVideo";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsVideo = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_AUDIO = "extsAudio";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsAudio = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_IMAGE = "extsImage";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsImage = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_SPREADSHEET = "extsSpreadsheet";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsSpreadsheet = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_PRESENTATION = "extsPresentation";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsPresentation = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_DOCUMENT = "extsDocument";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsDocument = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXTS_DIAGRAM = "extsDiagram";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsDiagram = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_INTERNAL_FORMATS = "internalFormats";
  @javax.annotation.Nullable  private JsonNullable<FilesSettingsDtoInternalFormats> internalFormats = JsonNullable.<FilesSettingsDtoInternalFormats>undefined();

  public static final String JSON_PROPERTY_MASTER_FORM_EXTENSION = "masterFormExtension";
  @javax.annotation.Nullable  private JsonNullable<String> masterFormExtension = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARAM_VERSION = "paramVersion";
  @javax.annotation.Nullable  private JsonNullable<String> paramVersion = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARAM_OUT_TYPE = "paramOutType";
  @javax.annotation.Nullable  private JsonNullable<String> paramOutType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FILE_DOWNLOAD_URL_STRING = "fileDownloadUrlString";
  @javax.annotation.Nullable  private JsonNullable<URI> fileDownloadUrlString = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_FILE_WEB_VIEWER_URL_STRING = "fileWebViewerUrlString";
  @javax.annotation.Nullable  private JsonNullable<String> fileWebViewerUrlString = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FILE_WEB_VIEWER_EXTERNAL_URL_STRING = "fileWebViewerExternalUrlString";
  @javax.annotation.Nullable  private JsonNullable<URI> fileWebViewerExternalUrlString = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_FILE_WEB_EDITOR_URL_STRING = "fileWebEditorUrlString";
  @javax.annotation.Nullable  private JsonNullable<String> fileWebEditorUrlString = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FILE_WEB_EDITOR_EXTERNAL_URL_STRING = "fileWebEditorExternalUrlString";
  @javax.annotation.Nullable  private JsonNullable<URI> fileWebEditorExternalUrlString = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_FILE_REDIRECT_PREVIEW_URL_STRING = "fileRedirectPreviewUrlString";
  @javax.annotation.Nullable  private JsonNullable<URI> fileRedirectPreviewUrlString = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_FILE_THUMBNAIL_URL_STRING = "fileThumbnailUrlString";
  @javax.annotation.Nullable  private JsonNullable<URI> fileThumbnailUrlString = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_CONFIRM_DELETE = "confirmDelete";
  @javax.annotation.Nullable  private Boolean confirmDelete;

  public static final String JSON_PROPERTY_ENABLE_THIRD_PARTY = "enableThirdParty";
  @javax.annotation.Nullable  private Boolean enableThirdParty;

  public static final String JSON_PROPERTY_EXTERNAL_SHARE = "externalShare";
  @javax.annotation.Nullable  private Boolean externalShare;

  public static final String JSON_PROPERTY_EXTERNAL_SHARE_SOCIAL_MEDIA = "externalShareSocialMedia";
  @javax.annotation.Nullable  private Boolean externalShareSocialMedia;

  public static final String JSON_PROPERTY_STORE_ORIGINAL_FILES = "storeOriginalFiles";
  @javax.annotation.Nullable  private Boolean storeOriginalFiles;

  public static final String JSON_PROPERTY_KEEP_NEW_FILE_NAME = "keepNewFileName";
  @javax.annotation.Nullable  private Boolean keepNewFileName;

  public static final String JSON_PROPERTY_DISPLAY_FILE_EXTENSION = "displayFileExtension";
  @javax.annotation.Nullable  private Boolean displayFileExtension;

  public static final String JSON_PROPERTY_CONVERT_NOTIFY = "convertNotify";
  @javax.annotation.Nullable  private Boolean convertNotify;

  public static final String JSON_PROPERTY_HIDE_CONFIRM_CANCEL_OPERATION = "hideConfirmCancelOperation";
  @javax.annotation.Nullable  private Boolean hideConfirmCancelOperation;

  public static final String JSON_PROPERTY_HIDE_CONFIRM_CONVERT_SAVE = "hideConfirmConvertSave";
  @javax.annotation.Nullable  private Boolean hideConfirmConvertSave;

  public static final String JSON_PROPERTY_HIDE_CONFIRM_CONVERT_OPEN = "hideConfirmConvertOpen";
  @javax.annotation.Nullable  private Boolean hideConfirmConvertOpen;

  public static final String JSON_PROPERTY_HIDE_CONFIRM_ROOM_LIFETIME = "hideConfirmRoomLifetime";
  @javax.annotation.Nullable  private Boolean hideConfirmRoomLifetime;

  public static final String JSON_PROPERTY_DEFAULT_ORDER = "defaultOrder";
  @javax.annotation.Nullable  private OrderBy defaultOrder;

  public static final String JSON_PROPERTY_FORCESAVE = "forcesave";
  @javax.annotation.Nullable  private Boolean forcesave;

  public static final String JSON_PROPERTY_STORE_FORCESAVE = "storeForcesave";
  @javax.annotation.Nullable  private Boolean storeForcesave;

  public static final String JSON_PROPERTY_RECENT_SECTION = "recentSection";
  @javax.annotation.Nullable  private Boolean recentSection;

  public static final String JSON_PROPERTY_FAVORITES_SECTION = "favoritesSection";
  @javax.annotation.Nullable  private Boolean favoritesSection;

  public static final String JSON_PROPERTY_TEMPLATES_SECTION = "templatesSection";
  @javax.annotation.Nullable  private Boolean templatesSection;

  public static final String JSON_PROPERTY_DOWNLOAD_TAR_GZ = "downloadTarGz";
  @javax.annotation.Nullable  private Boolean downloadTarGz;

  public static final String JSON_PROPERTY_AUTOMATICALLY_CLEAN_UP = "automaticallyCleanUp";
  @javax.annotation.Nullable  private AutoCleanUpData automaticallyCleanUp;

  public static final String JSON_PROPERTY_CAN_SEARCH_BY_CONTENT = "canSearchByContent";
  @javax.annotation.Nullable  private Boolean canSearchByContent;

  /**
   * The default access rights in sharing settings.
   */
  public enum DefaultSharingAccessRightsEnum {
    None(Integer.valueOf(0)),
    
    ReadWrite(Integer.valueOf(1)),
    
    Read(Integer.valueOf(2)),
    
    Restrict(Integer.valueOf(3)),
    
    Varies(Integer.valueOf(4)),
    
    Review(Integer.valueOf(5)),
    
    Comment(Integer.valueOf(6)),
    
    FillForms(Integer.valueOf(7)),
    
    CustomFilter(Integer.valueOf(8)),
    
    RoomManager(Integer.valueOf(9)),
    
    Editing(Integer.valueOf(10)),
    
    ContentCreator(Integer.valueOf(11));

    private Integer value;

    DefaultSharingAccessRightsEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefaultSharingAccessRightsEnum fromValue(Integer value) {
      for (DefaultSharingAccessRightsEnum b : DefaultSharingAccessRightsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_DEFAULT_SHARING_ACCESS_RIGHTS = "defaultSharingAccessRights";
  @javax.annotation.Nullable  private JsonNullable<List<DefaultSharingAccessRightsEnum>> defaultSharingAccessRights = JsonNullable.<List<DefaultSharingAccessRightsEnum>>undefined();

  public static final String JSON_PROPERTY_MAX_UPLOAD_THREAD_COUNT = "maxUploadThreadCount";
  @javax.annotation.Nullable  private Integer maxUploadThreadCount;

  public static final String JSON_PROPERTY_CHUNK_UPLOAD_SIZE = "chunkUploadSize";
  @javax.annotation.Nullable  private Long chunkUploadSize;

  public static final String JSON_PROPERTY_OPEN_EDITOR_IN_SAME_TAB = "openEditorInSameTab";
  @javax.annotation.Nullable  private Boolean openEditorInSameTab;

  public static final String JSON_PROPERTY_ORGANIZE_ROOMS_GROUPING = "organizeRoomsGrouping";
  @javax.annotation.Nullable  private Boolean organizeRoomsGrouping;

  public static final String JSON_PROPERTY_EXTS_FILES_VECTORIZED = "extsFilesVectorized";
  @javax.annotation.Nullable  private JsonNullable<List<String>> extsFilesVectorized = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MAX_VECTORIZATION_FILE_SIZE = "maxVectorizationFileSize";
  @javax.annotation.Nullable  private Long maxVectorizationFileSize;

  public FilesSettingsDto() {
  }


  public FilesSettingsDto extsImagePreviewed(@javax.annotation.Nullable List<String> extsImagePreviewed) {
    this.extsImagePreviewed = JsonNullable.<List<String>>of(extsImagePreviewed);
    
    return this;
  }

  public FilesSettingsDto addExtsImagePreviewedItem(String extsImagePreviewedItem) {
    if (this.extsImagePreviewed == null || !this.extsImagePreviewed.isPresent()) {
      this.extsImagePreviewed = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsImagePreviewed.get().add(extsImagePreviewedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the viewed images.
   * @return extsImagePreviewed
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsImagePreviewed() {
        return extsImagePreviewed.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_IMAGE_PREVIEWED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsImagePreviewed_JsonNullable() {
    return extsImagePreviewed;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_IMAGE_PREVIEWED)
  public void setExtsImagePreviewed_JsonNullable(JsonNullable<List<String>> extsImagePreviewed) {
    this.extsImagePreviewed = extsImagePreviewed;
  }

  public void setExtsImagePreviewed(@javax.annotation.Nullable List<String> extsImagePreviewed) {
    this.extsImagePreviewed = JsonNullable.<List<String>>of(extsImagePreviewed);
  }

  public FilesSettingsDto extsMediaPreviewed(@javax.annotation.Nullable List<String> extsMediaPreviewed) {
    this.extsMediaPreviewed = JsonNullable.<List<String>>of(extsMediaPreviewed);
    
    return this;
  }

  public FilesSettingsDto addExtsMediaPreviewedItem(String extsMediaPreviewedItem) {
    if (this.extsMediaPreviewed == null || !this.extsMediaPreviewed.isPresent()) {
      this.extsMediaPreviewed = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsMediaPreviewed.get().add(extsMediaPreviewedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the viewed media files.
   * @return extsMediaPreviewed
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsMediaPreviewed() {
        return extsMediaPreviewed.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_MEDIA_PREVIEWED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsMediaPreviewed_JsonNullable() {
    return extsMediaPreviewed;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_MEDIA_PREVIEWED)
  public void setExtsMediaPreviewed_JsonNullable(JsonNullable<List<String>> extsMediaPreviewed) {
    this.extsMediaPreviewed = extsMediaPreviewed;
  }

  public void setExtsMediaPreviewed(@javax.annotation.Nullable List<String> extsMediaPreviewed) {
    this.extsMediaPreviewed = JsonNullable.<List<String>>of(extsMediaPreviewed);
  }

  public FilesSettingsDto extsWebPreviewed(@javax.annotation.Nullable List<String> extsWebPreviewed) {
    this.extsWebPreviewed = JsonNullable.<List<String>>of(extsWebPreviewed);
    
    return this;
  }

  public FilesSettingsDto addExtsWebPreviewedItem(String extsWebPreviewedItem) {
    if (this.extsWebPreviewed == null || !this.extsWebPreviewed.isPresent()) {
      this.extsWebPreviewed = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsWebPreviewed.get().add(extsWebPreviewedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the viewed files.
   * @return extsWebPreviewed
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsWebPreviewed() {
        return extsWebPreviewed.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_WEB_PREVIEWED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsWebPreviewed_JsonNullable() {
    return extsWebPreviewed;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_WEB_PREVIEWED)
  public void setExtsWebPreviewed_JsonNullable(JsonNullable<List<String>> extsWebPreviewed) {
    this.extsWebPreviewed = extsWebPreviewed;
  }

  public void setExtsWebPreviewed(@javax.annotation.Nullable List<String> extsWebPreviewed) {
    this.extsWebPreviewed = JsonNullable.<List<String>>of(extsWebPreviewed);
  }

  public FilesSettingsDto extsWebEdited(@javax.annotation.Nullable List<String> extsWebEdited) {
    this.extsWebEdited = JsonNullable.<List<String>>of(extsWebEdited);
    
    return this;
  }

  public FilesSettingsDto addExtsWebEditedItem(String extsWebEditedItem) {
    if (this.extsWebEdited == null || !this.extsWebEdited.isPresent()) {
      this.extsWebEdited = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsWebEdited.get().add(extsWebEditedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the edited files.
   * @return extsWebEdited
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsWebEdited() {
        return extsWebEdited.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_WEB_EDITED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsWebEdited_JsonNullable() {
    return extsWebEdited;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_WEB_EDITED)
  public void setExtsWebEdited_JsonNullable(JsonNullable<List<String>> extsWebEdited) {
    this.extsWebEdited = extsWebEdited;
  }

  public void setExtsWebEdited(@javax.annotation.Nullable List<String> extsWebEdited) {
    this.extsWebEdited = JsonNullable.<List<String>>of(extsWebEdited);
  }

  public FilesSettingsDto extsWebEncrypt(@javax.annotation.Nullable List<String> extsWebEncrypt) {
    this.extsWebEncrypt = JsonNullable.<List<String>>of(extsWebEncrypt);
    
    return this;
  }

  public FilesSettingsDto addExtsWebEncryptItem(String extsWebEncryptItem) {
    if (this.extsWebEncrypt == null || !this.extsWebEncrypt.isPresent()) {
      this.extsWebEncrypt = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsWebEncrypt.get().add(extsWebEncryptItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the encrypted files.
   * @return extsWebEncrypt
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsWebEncrypt() {
        return extsWebEncrypt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_WEB_ENCRYPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsWebEncrypt_JsonNullable() {
    return extsWebEncrypt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_WEB_ENCRYPT)
  public void setExtsWebEncrypt_JsonNullable(JsonNullable<List<String>> extsWebEncrypt) {
    this.extsWebEncrypt = extsWebEncrypt;
  }

  public void setExtsWebEncrypt(@javax.annotation.Nullable List<String> extsWebEncrypt) {
    this.extsWebEncrypt = JsonNullable.<List<String>>of(extsWebEncrypt);
  }

  public FilesSettingsDto extsWebReviewed(@javax.annotation.Nullable List<String> extsWebReviewed) {
    this.extsWebReviewed = JsonNullable.<List<String>>of(extsWebReviewed);
    
    return this;
  }

  public FilesSettingsDto addExtsWebReviewedItem(String extsWebReviewedItem) {
    if (this.extsWebReviewed == null || !this.extsWebReviewed.isPresent()) {
      this.extsWebReviewed = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsWebReviewed.get().add(extsWebReviewedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the reviewed files.
   * @return extsWebReviewed
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsWebReviewed() {
        return extsWebReviewed.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_WEB_REVIEWED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsWebReviewed_JsonNullable() {
    return extsWebReviewed;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_WEB_REVIEWED)
  public void setExtsWebReviewed_JsonNullable(JsonNullable<List<String>> extsWebReviewed) {
    this.extsWebReviewed = extsWebReviewed;
  }

  public void setExtsWebReviewed(@javax.annotation.Nullable List<String> extsWebReviewed) {
    this.extsWebReviewed = JsonNullable.<List<String>>of(extsWebReviewed);
  }

  public FilesSettingsDto extsWebCustomFilterEditing(@javax.annotation.Nullable List<String> extsWebCustomFilterEditing) {
    this.extsWebCustomFilterEditing = JsonNullable.<List<String>>of(extsWebCustomFilterEditing);
    
    return this;
  }

  public FilesSettingsDto addExtsWebCustomFilterEditingItem(String extsWebCustomFilterEditingItem) {
    if (this.extsWebCustomFilterEditing == null || !this.extsWebCustomFilterEditing.isPresent()) {
      this.extsWebCustomFilterEditing = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsWebCustomFilterEditing.get().add(extsWebCustomFilterEditingItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the custom filter files.
   * @return extsWebCustomFilterEditing
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsWebCustomFilterEditing() {
        return extsWebCustomFilterEditing.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_WEB_CUSTOM_FILTER_EDITING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsWebCustomFilterEditing_JsonNullable() {
    return extsWebCustomFilterEditing;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_WEB_CUSTOM_FILTER_EDITING)
  public void setExtsWebCustomFilterEditing_JsonNullable(JsonNullable<List<String>> extsWebCustomFilterEditing) {
    this.extsWebCustomFilterEditing = extsWebCustomFilterEditing;
  }

  public void setExtsWebCustomFilterEditing(@javax.annotation.Nullable List<String> extsWebCustomFilterEditing) {
    this.extsWebCustomFilterEditing = JsonNullable.<List<String>>of(extsWebCustomFilterEditing);
  }

  public FilesSettingsDto extsWebRestrictedEditing(@javax.annotation.Nullable List<String> extsWebRestrictedEditing) {
    this.extsWebRestrictedEditing = JsonNullable.<List<String>>of(extsWebRestrictedEditing);
    
    return this;
  }

  public FilesSettingsDto addExtsWebRestrictedEditingItem(String extsWebRestrictedEditingItem) {
    if (this.extsWebRestrictedEditing == null || !this.extsWebRestrictedEditing.isPresent()) {
      this.extsWebRestrictedEditing = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsWebRestrictedEditing.get().add(extsWebRestrictedEditingItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the files that are restricted for editing.
   * @return extsWebRestrictedEditing
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsWebRestrictedEditing() {
        return extsWebRestrictedEditing.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_WEB_RESTRICTED_EDITING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsWebRestrictedEditing_JsonNullable() {
    return extsWebRestrictedEditing;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_WEB_RESTRICTED_EDITING)
  public void setExtsWebRestrictedEditing_JsonNullable(JsonNullable<List<String>> extsWebRestrictedEditing) {
    this.extsWebRestrictedEditing = extsWebRestrictedEditing;
  }

  public void setExtsWebRestrictedEditing(@javax.annotation.Nullable List<String> extsWebRestrictedEditing) {
    this.extsWebRestrictedEditing = JsonNullable.<List<String>>of(extsWebRestrictedEditing);
  }

  public FilesSettingsDto extsWebCommented(@javax.annotation.Nullable List<String> extsWebCommented) {
    this.extsWebCommented = JsonNullable.<List<String>>of(extsWebCommented);
    
    return this;
  }

  public FilesSettingsDto addExtsWebCommentedItem(String extsWebCommentedItem) {
    if (this.extsWebCommented == null || !this.extsWebCommented.isPresent()) {
      this.extsWebCommented = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsWebCommented.get().add(extsWebCommentedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the commented files.
   * @return extsWebCommented
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsWebCommented() {
        return extsWebCommented.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_WEB_COMMENTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsWebCommented_JsonNullable() {
    return extsWebCommented;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_WEB_COMMENTED)
  public void setExtsWebCommented_JsonNullable(JsonNullable<List<String>> extsWebCommented) {
    this.extsWebCommented = extsWebCommented;
  }

  public void setExtsWebCommented(@javax.annotation.Nullable List<String> extsWebCommented) {
    this.extsWebCommented = JsonNullable.<List<String>>of(extsWebCommented);
  }

  public FilesSettingsDto extsWebTemplate(@javax.annotation.Nullable List<String> extsWebTemplate) {
    this.extsWebTemplate = JsonNullable.<List<String>>of(extsWebTemplate);
    
    return this;
  }

  public FilesSettingsDto addExtsWebTemplateItem(String extsWebTemplateItem) {
    if (this.extsWebTemplate == null || !this.extsWebTemplate.isPresent()) {
      this.extsWebTemplate = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsWebTemplate.get().add(extsWebTemplateItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the template files.
   * @return extsWebTemplate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsWebTemplate() {
        return extsWebTemplate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_WEB_TEMPLATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsWebTemplate_JsonNullable() {
    return extsWebTemplate;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_WEB_TEMPLATE)
  public void setExtsWebTemplate_JsonNullable(JsonNullable<List<String>> extsWebTemplate) {
    this.extsWebTemplate = extsWebTemplate;
  }

  public void setExtsWebTemplate(@javax.annotation.Nullable List<String> extsWebTemplate) {
    this.extsWebTemplate = JsonNullable.<List<String>>of(extsWebTemplate);
  }

  public FilesSettingsDto extsMustConvert(@javax.annotation.Nullable List<String> extsMustConvert) {
    this.extsMustConvert = JsonNullable.<List<String>>of(extsMustConvert);
    
    return this;
  }

  public FilesSettingsDto addExtsMustConvertItem(String extsMustConvertItem) {
    if (this.extsMustConvert == null || !this.extsMustConvert.isPresent()) {
      this.extsMustConvert = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsMustConvert.get().add(extsMustConvertItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the files that must be converted.
   * @return extsMustConvert
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsMustConvert() {
        return extsMustConvert.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_MUST_CONVERT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsMustConvert_JsonNullable() {
    return extsMustConvert;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_MUST_CONVERT)
  public void setExtsMustConvert_JsonNullable(JsonNullable<List<String>> extsMustConvert) {
    this.extsMustConvert = extsMustConvert;
  }

  public void setExtsMustConvert(@javax.annotation.Nullable List<String> extsMustConvert) {
    this.extsMustConvert = JsonNullable.<List<String>>of(extsMustConvert);
  }

  public FilesSettingsDto extsConvertible(@javax.annotation.Nullable Map<String, List<String>> extsConvertible) {
    this.extsConvertible = JsonNullable.<Map<String, List<String>>>of(extsConvertible);
    
    return this;
  }

  public FilesSettingsDto putExtsConvertibleItem(String key, List<String> extsConvertibleItem) {
    if (this.extsConvertible == null || !this.extsConvertible.isPresent()) {
      this.extsConvertible = JsonNullable.<Map<String, List<String>>>of(new HashMap<>());
    }
    try {
      this.extsConvertible.get().put(key, extsConvertibleItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the convertible extensions.
   * @return extsConvertible
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Map<String, List<String>> getExtsConvertible() {
        return extsConvertible.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_CONVERTIBLE, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, List<String>>> getExtsConvertible_JsonNullable() {
    return extsConvertible;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_CONVERTIBLE)
  public void setExtsConvertible_JsonNullable(JsonNullable<Map<String, List<String>>> extsConvertible) {
    this.extsConvertible = extsConvertible;
  }

  public void setExtsConvertible(@javax.annotation.Nullable Map<String, List<String>> extsConvertible) {
    this.extsConvertible = JsonNullable.<Map<String, List<String>>>of(extsConvertible);
  }

  public FilesSettingsDto extsUploadable(@javax.annotation.Nullable List<String> extsUploadable) {
    this.extsUploadable = JsonNullable.<List<String>>of(extsUploadable);
    
    return this;
  }

  public FilesSettingsDto addExtsUploadableItem(String extsUploadableItem) {
    if (this.extsUploadable == null || !this.extsUploadable.isPresent()) {
      this.extsUploadable = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsUploadable.get().add(extsUploadableItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the uploadable extensions.
   * @return extsUploadable
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsUploadable() {
        return extsUploadable.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_UPLOADABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsUploadable_JsonNullable() {
    return extsUploadable;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_UPLOADABLE)
  public void setExtsUploadable_JsonNullable(JsonNullable<List<String>> extsUploadable) {
    this.extsUploadable = extsUploadable;
  }

  public void setExtsUploadable(@javax.annotation.Nullable List<String> extsUploadable) {
    this.extsUploadable = JsonNullable.<List<String>>of(extsUploadable);
  }

  public FilesSettingsDto extsArchive(@javax.annotation.Nullable List<String> extsArchive) {
    this.extsArchive = JsonNullable.<List<String>>of(extsArchive);
    
    return this;
  }

  public FilesSettingsDto addExtsArchiveItem(String extsArchiveItem) {
    if (this.extsArchive == null || !this.extsArchive.isPresent()) {
      this.extsArchive = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsArchive.get().add(extsArchiveItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of extensions of the archive files.
   * @return extsArchive
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsArchive() {
        return extsArchive.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_ARCHIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsArchive_JsonNullable() {
    return extsArchive;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_ARCHIVE)
  public void setExtsArchive_JsonNullable(JsonNullable<List<String>> extsArchive) {
    this.extsArchive = extsArchive;
  }

  public void setExtsArchive(@javax.annotation.Nullable List<String> extsArchive) {
    this.extsArchive = JsonNullable.<List<String>>of(extsArchive);
  }

  public FilesSettingsDto extsVideo(@javax.annotation.Nullable List<String> extsVideo) {
    this.extsVideo = JsonNullable.<List<String>>of(extsVideo);
    
    return this;
  }

  public FilesSettingsDto addExtsVideoItem(String extsVideoItem) {
    if (this.extsVideo == null || !this.extsVideo.isPresent()) {
      this.extsVideo = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsVideo.get().add(extsVideoItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the video extensions.
   * @return extsVideo
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsVideo() {
        return extsVideo.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_VIDEO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsVideo_JsonNullable() {
    return extsVideo;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_VIDEO)
  public void setExtsVideo_JsonNullable(JsonNullable<List<String>> extsVideo) {
    this.extsVideo = extsVideo;
  }

  public void setExtsVideo(@javax.annotation.Nullable List<String> extsVideo) {
    this.extsVideo = JsonNullable.<List<String>>of(extsVideo);
  }

  public FilesSettingsDto extsAudio(@javax.annotation.Nullable List<String> extsAudio) {
    this.extsAudio = JsonNullable.<List<String>>of(extsAudio);
    
    return this;
  }

  public FilesSettingsDto addExtsAudioItem(String extsAudioItem) {
    if (this.extsAudio == null || !this.extsAudio.isPresent()) {
      this.extsAudio = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsAudio.get().add(extsAudioItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the audio extensions.
   * @return extsAudio
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsAudio() {
        return extsAudio.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_AUDIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsAudio_JsonNullable() {
    return extsAudio;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_AUDIO)
  public void setExtsAudio_JsonNullable(JsonNullable<List<String>> extsAudio) {
    this.extsAudio = extsAudio;
  }

  public void setExtsAudio(@javax.annotation.Nullable List<String> extsAudio) {
    this.extsAudio = JsonNullable.<List<String>>of(extsAudio);
  }

  public FilesSettingsDto extsImage(@javax.annotation.Nullable List<String> extsImage) {
    this.extsImage = JsonNullable.<List<String>>of(extsImage);
    
    return this;
  }

  public FilesSettingsDto addExtsImageItem(String extsImageItem) {
    if (this.extsImage == null || !this.extsImage.isPresent()) {
      this.extsImage = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsImage.get().add(extsImageItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the image extensions.
   * @return extsImage
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsImage() {
        return extsImage.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsImage_JsonNullable() {
    return extsImage;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_IMAGE)
  public void setExtsImage_JsonNullable(JsonNullable<List<String>> extsImage) {
    this.extsImage = extsImage;
  }

  public void setExtsImage(@javax.annotation.Nullable List<String> extsImage) {
    this.extsImage = JsonNullable.<List<String>>of(extsImage);
  }

  public FilesSettingsDto extsSpreadsheet(@javax.annotation.Nullable List<String> extsSpreadsheet) {
    this.extsSpreadsheet = JsonNullable.<List<String>>of(extsSpreadsheet);
    
    return this;
  }

  public FilesSettingsDto addExtsSpreadsheetItem(String extsSpreadsheetItem) {
    if (this.extsSpreadsheet == null || !this.extsSpreadsheet.isPresent()) {
      this.extsSpreadsheet = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsSpreadsheet.get().add(extsSpreadsheetItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the spreadsheet extensions.
   * @return extsSpreadsheet
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsSpreadsheet() {
        return extsSpreadsheet.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_SPREADSHEET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsSpreadsheet_JsonNullable() {
    return extsSpreadsheet;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_SPREADSHEET)
  public void setExtsSpreadsheet_JsonNullable(JsonNullable<List<String>> extsSpreadsheet) {
    this.extsSpreadsheet = extsSpreadsheet;
  }

  public void setExtsSpreadsheet(@javax.annotation.Nullable List<String> extsSpreadsheet) {
    this.extsSpreadsheet = JsonNullable.<List<String>>of(extsSpreadsheet);
  }

  public FilesSettingsDto extsPresentation(@javax.annotation.Nullable List<String> extsPresentation) {
    this.extsPresentation = JsonNullable.<List<String>>of(extsPresentation);
    
    return this;
  }

  public FilesSettingsDto addExtsPresentationItem(String extsPresentationItem) {
    if (this.extsPresentation == null || !this.extsPresentation.isPresent()) {
      this.extsPresentation = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsPresentation.get().add(extsPresentationItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the presentation extensions.
   * @return extsPresentation
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsPresentation() {
        return extsPresentation.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_PRESENTATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsPresentation_JsonNullable() {
    return extsPresentation;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_PRESENTATION)
  public void setExtsPresentation_JsonNullable(JsonNullable<List<String>> extsPresentation) {
    this.extsPresentation = extsPresentation;
  }

  public void setExtsPresentation(@javax.annotation.Nullable List<String> extsPresentation) {
    this.extsPresentation = JsonNullable.<List<String>>of(extsPresentation);
  }

  public FilesSettingsDto extsDocument(@javax.annotation.Nullable List<String> extsDocument) {
    this.extsDocument = JsonNullable.<List<String>>of(extsDocument);
    
    return this;
  }

  public FilesSettingsDto addExtsDocumentItem(String extsDocumentItem) {
    if (this.extsDocument == null || !this.extsDocument.isPresent()) {
      this.extsDocument = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsDocument.get().add(extsDocumentItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the text document extensions.
   * @return extsDocument
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsDocument() {
        return extsDocument.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_DOCUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsDocument_JsonNullable() {
    return extsDocument;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_DOCUMENT)
  public void setExtsDocument_JsonNullable(JsonNullable<List<String>> extsDocument) {
    this.extsDocument = extsDocument;
  }

  public void setExtsDocument(@javax.annotation.Nullable List<String> extsDocument) {
    this.extsDocument = JsonNullable.<List<String>>of(extsDocument);
  }

  public FilesSettingsDto extsDiagram(@javax.annotation.Nullable List<String> extsDiagram) {
    this.extsDiagram = JsonNullable.<List<String>>of(extsDiagram);
    
    return this;
  }

  public FilesSettingsDto addExtsDiagramItem(String extsDiagramItem) {
    if (this.extsDiagram == null || !this.extsDiagram.isPresent()) {
      this.extsDiagram = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsDiagram.get().add(extsDiagramItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the diagram extensions.
   * @return extsDiagram
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsDiagram() {
        return extsDiagram.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_DIAGRAM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsDiagram_JsonNullable() {
    return extsDiagram;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_DIAGRAM)
  public void setExtsDiagram_JsonNullable(JsonNullable<List<String>> extsDiagram) {
    this.extsDiagram = extsDiagram;
  }

  public void setExtsDiagram(@javax.annotation.Nullable List<String> extsDiagram) {
    this.extsDiagram = JsonNullable.<List<String>>of(extsDiagram);
  }

  public FilesSettingsDto internalFormats(@javax.annotation.Nullable FilesSettingsDtoInternalFormats internalFormats) {
    this.internalFormats = JsonNullable.<FilesSettingsDtoInternalFormats>of(internalFormats);
    
    return this;
  }

  /**
   * Get internalFormats
   * @return internalFormats
   */
  @javax.annotation.Nullable  @JsonIgnore

  public FilesSettingsDtoInternalFormats getInternalFormats() {
        return internalFormats.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INTERNAL_FORMATS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<FilesSettingsDtoInternalFormats> getInternalFormats_JsonNullable() {
    return internalFormats;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERNAL_FORMATS)
  public void setInternalFormats_JsonNullable(JsonNullable<FilesSettingsDtoInternalFormats> internalFormats) {
    this.internalFormats = internalFormats;
  }

  public void setInternalFormats(@javax.annotation.Nullable FilesSettingsDtoInternalFormats internalFormats) {
    this.internalFormats = JsonNullable.<FilesSettingsDtoInternalFormats>of(internalFormats);
  }

  public FilesSettingsDto masterFormExtension(@javax.annotation.Nullable String masterFormExtension) {
    this.masterFormExtension = JsonNullable.<String>of(masterFormExtension);
    
    return this;
  }

  /**
   * The master form extension.
   * @return masterFormExtension
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getMasterFormExtension() {
        return masterFormExtension.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MASTER_FORM_EXTENSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMasterFormExtension_JsonNullable() {
    return masterFormExtension;
  }
  
  @JsonProperty(JSON_PROPERTY_MASTER_FORM_EXTENSION)
  public void setMasterFormExtension_JsonNullable(JsonNullable<String> masterFormExtension) {
    this.masterFormExtension = masterFormExtension;
  }

  public void setMasterFormExtension(@javax.annotation.Nullable String masterFormExtension) {
    this.masterFormExtension = JsonNullable.<String>of(masterFormExtension);
  }

  public FilesSettingsDto paramVersion(@javax.annotation.Nullable String paramVersion) {
    this.paramVersion = JsonNullable.<String>of(paramVersion);
    
    return this;
  }

  /**
   * The URL parameter which specifies the file version.
   * @return paramVersion
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getParamVersion() {
        return paramVersion.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARAM_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getParamVersion_JsonNullable() {
    return paramVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAM_VERSION)
  public void setParamVersion_JsonNullable(JsonNullable<String> paramVersion) {
    this.paramVersion = paramVersion;
  }

  public void setParamVersion(@javax.annotation.Nullable String paramVersion) {
    this.paramVersion = JsonNullable.<String>of(paramVersion);
  }

  public FilesSettingsDto paramOutType(@javax.annotation.Nullable String paramOutType) {
    this.paramOutType = JsonNullable.<String>of(paramOutType);
    
    return this;
  }

  /**
   * The URL parameter which specifies the output type of the converted file.
   * @return paramOutType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getParamOutType() {
        return paramOutType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARAM_OUT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getParamOutType_JsonNullable() {
    return paramOutType;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAM_OUT_TYPE)
  public void setParamOutType_JsonNullable(JsonNullable<String> paramOutType) {
    this.paramOutType = paramOutType;
  }

  public void setParamOutType(@javax.annotation.Nullable String paramOutType) {
    this.paramOutType = JsonNullable.<String>of(paramOutType);
  }

  public FilesSettingsDto fileDownloadUrlString(@javax.annotation.Nullable URI fileDownloadUrlString) {
    this.fileDownloadUrlString = JsonNullable.<URI>of(fileDownloadUrlString);
    
    return this;
  }

  /**
   * The URL to download a file.
   * @return fileDownloadUrlString
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getFileDownloadUrlString() {
        return fileDownloadUrlString.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_DOWNLOAD_URL_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<URI> getFileDownloadUrlString_JsonNullable() {
    return fileDownloadUrlString;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_DOWNLOAD_URL_STRING)
  public void setFileDownloadUrlString_JsonNullable(JsonNullable<URI> fileDownloadUrlString) {
    this.fileDownloadUrlString = fileDownloadUrlString;
  }

  public void setFileDownloadUrlString(@javax.annotation.Nullable URI fileDownloadUrlString) {
    this.fileDownloadUrlString = JsonNullable.<URI>of(fileDownloadUrlString);
  }

  public FilesSettingsDto fileWebViewerUrlString(@javax.annotation.Nullable String fileWebViewerUrlString) {
    this.fileWebViewerUrlString = JsonNullable.<String>of(fileWebViewerUrlString);
    
    return this;
  }

  /**
   * The URL to the file web viewer.
   * @return fileWebViewerUrlString
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFileWebViewerUrlString() {
        return fileWebViewerUrlString.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_WEB_VIEWER_URL_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFileWebViewerUrlString_JsonNullable() {
    return fileWebViewerUrlString;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_WEB_VIEWER_URL_STRING)
  public void setFileWebViewerUrlString_JsonNullable(JsonNullable<String> fileWebViewerUrlString) {
    this.fileWebViewerUrlString = fileWebViewerUrlString;
  }

  public void setFileWebViewerUrlString(@javax.annotation.Nullable String fileWebViewerUrlString) {
    this.fileWebViewerUrlString = JsonNullable.<String>of(fileWebViewerUrlString);
  }

  public FilesSettingsDto fileWebViewerExternalUrlString(@javax.annotation.Nullable URI fileWebViewerExternalUrlString) {
    this.fileWebViewerExternalUrlString = JsonNullable.<URI>of(fileWebViewerExternalUrlString);
    
    return this;
  }

  /**
   * The external URL to the file web viewer.
   * @return fileWebViewerExternalUrlString
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getFileWebViewerExternalUrlString() {
        return fileWebViewerExternalUrlString.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_WEB_VIEWER_EXTERNAL_URL_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<URI> getFileWebViewerExternalUrlString_JsonNullable() {
    return fileWebViewerExternalUrlString;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_WEB_VIEWER_EXTERNAL_URL_STRING)
  public void setFileWebViewerExternalUrlString_JsonNullable(JsonNullable<URI> fileWebViewerExternalUrlString) {
    this.fileWebViewerExternalUrlString = fileWebViewerExternalUrlString;
  }

  public void setFileWebViewerExternalUrlString(@javax.annotation.Nullable URI fileWebViewerExternalUrlString) {
    this.fileWebViewerExternalUrlString = JsonNullable.<URI>of(fileWebViewerExternalUrlString);
  }

  public FilesSettingsDto fileWebEditorUrlString(@javax.annotation.Nullable String fileWebEditorUrlString) {
    this.fileWebEditorUrlString = JsonNullable.<String>of(fileWebEditorUrlString);
    
    return this;
  }

  /**
   * The URL to the file web editor.
   * @return fileWebEditorUrlString
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFileWebEditorUrlString() {
        return fileWebEditorUrlString.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_WEB_EDITOR_URL_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFileWebEditorUrlString_JsonNullable() {
    return fileWebEditorUrlString;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_WEB_EDITOR_URL_STRING)
  public void setFileWebEditorUrlString_JsonNullable(JsonNullable<String> fileWebEditorUrlString) {
    this.fileWebEditorUrlString = fileWebEditorUrlString;
  }

  public void setFileWebEditorUrlString(@javax.annotation.Nullable String fileWebEditorUrlString) {
    this.fileWebEditorUrlString = JsonNullable.<String>of(fileWebEditorUrlString);
  }

  public FilesSettingsDto fileWebEditorExternalUrlString(@javax.annotation.Nullable URI fileWebEditorExternalUrlString) {
    this.fileWebEditorExternalUrlString = JsonNullable.<URI>of(fileWebEditorExternalUrlString);
    
    return this;
  }

  /**
   * The external URL to the file web editor.
   * @return fileWebEditorExternalUrlString
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getFileWebEditorExternalUrlString() {
        return fileWebEditorExternalUrlString.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_WEB_EDITOR_EXTERNAL_URL_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<URI> getFileWebEditorExternalUrlString_JsonNullable() {
    return fileWebEditorExternalUrlString;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_WEB_EDITOR_EXTERNAL_URL_STRING)
  public void setFileWebEditorExternalUrlString_JsonNullable(JsonNullable<URI> fileWebEditorExternalUrlString) {
    this.fileWebEditorExternalUrlString = fileWebEditorExternalUrlString;
  }

  public void setFileWebEditorExternalUrlString(@javax.annotation.Nullable URI fileWebEditorExternalUrlString) {
    this.fileWebEditorExternalUrlString = JsonNullable.<URI>of(fileWebEditorExternalUrlString);
  }

  public FilesSettingsDto fileRedirectPreviewUrlString(@javax.annotation.Nullable URI fileRedirectPreviewUrlString) {
    this.fileRedirectPreviewUrlString = JsonNullable.<URI>of(fileRedirectPreviewUrlString);
    
    return this;
  }

  /**
   * The redirect URL to the file viewer.
   * @return fileRedirectPreviewUrlString
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getFileRedirectPreviewUrlString() {
        return fileRedirectPreviewUrlString.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_REDIRECT_PREVIEW_URL_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<URI> getFileRedirectPreviewUrlString_JsonNullable() {
    return fileRedirectPreviewUrlString;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_REDIRECT_PREVIEW_URL_STRING)
  public void setFileRedirectPreviewUrlString_JsonNullable(JsonNullable<URI> fileRedirectPreviewUrlString) {
    this.fileRedirectPreviewUrlString = fileRedirectPreviewUrlString;
  }

  public void setFileRedirectPreviewUrlString(@javax.annotation.Nullable URI fileRedirectPreviewUrlString) {
    this.fileRedirectPreviewUrlString = JsonNullable.<URI>of(fileRedirectPreviewUrlString);
  }

  public FilesSettingsDto fileThumbnailUrlString(@javax.annotation.Nullable URI fileThumbnailUrlString) {
    this.fileThumbnailUrlString = JsonNullable.<URI>of(fileThumbnailUrlString);
    
    return this;
  }

  /**
   * The URL to the file thumbnail.
   * @return fileThumbnailUrlString
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getFileThumbnailUrlString() {
        return fileThumbnailUrlString.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_THUMBNAIL_URL_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<URI> getFileThumbnailUrlString_JsonNullable() {
    return fileThumbnailUrlString;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_THUMBNAIL_URL_STRING)
  public void setFileThumbnailUrlString_JsonNullable(JsonNullable<URI> fileThumbnailUrlString) {
    this.fileThumbnailUrlString = fileThumbnailUrlString;
  }

  public void setFileThumbnailUrlString(@javax.annotation.Nullable URI fileThumbnailUrlString) {
    this.fileThumbnailUrlString = JsonNullable.<URI>of(fileThumbnailUrlString);
  }

  public FilesSettingsDto confirmDelete(@javax.annotation.Nullable Boolean confirmDelete) {
    
    this.confirmDelete = confirmDelete;
    return this;
  }

  /**
   * Specifies whether to confirm the file deletion or not.
   * @return confirmDelete
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONFIRM_DELETE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConfirmDelete() {
    return confirmDelete;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIRM_DELETE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmDelete(@javax.annotation.Nullable Boolean confirmDelete) {
    this.confirmDelete = confirmDelete;
  }

  public FilesSettingsDto enableThirdParty(@javax.annotation.Nullable Boolean enableThirdParty) {
    
    this.enableThirdParty = enableThirdParty;
    return this;
  }

  /**
   * Specifies whether to allow users to connect the third-party storages.
   * @return enableThirdParty
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENABLE_THIRD_PARTY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableThirdParty() {
    return enableThirdParty;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLE_THIRD_PARTY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableThirdParty(@javax.annotation.Nullable Boolean enableThirdParty) {
    this.enableThirdParty = enableThirdParty;
  }

  public FilesSettingsDto externalShare(@javax.annotation.Nullable Boolean externalShare) {
    
    this.externalShare = externalShare;
    return this;
  }

  /**
   * Specifies whether to enable sharing external links to the files.
   * @return externalShare
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternalShare() {
    return externalShare;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalShare(@javax.annotation.Nullable Boolean externalShare) {
    this.externalShare = externalShare;
  }

  public FilesSettingsDto externalShareSocialMedia(@javax.annotation.Nullable Boolean externalShareSocialMedia) {
    
    this.externalShareSocialMedia = externalShareSocialMedia;
    return this;
  }

  /**
   * Specifies whether to enable sharing files on social media.
   * @return externalShareSocialMedia
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE_SOCIAL_MEDIA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternalShareSocialMedia() {
    return externalShareSocialMedia;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE_SOCIAL_MEDIA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalShareSocialMedia(@javax.annotation.Nullable Boolean externalShareSocialMedia) {
    this.externalShareSocialMedia = externalShareSocialMedia;
  }

  public FilesSettingsDto storeOriginalFiles(@javax.annotation.Nullable Boolean storeOriginalFiles) {
    
    this.storeOriginalFiles = storeOriginalFiles;
    return this;
  }

  /**
   * Specifies whether to enable storing original files.
   * @return storeOriginalFiles
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STORE_ORIGINAL_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStoreOriginalFiles() {
    return storeOriginalFiles;
  }


  @JsonProperty(value = JSON_PROPERTY_STORE_ORIGINAL_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreOriginalFiles(@javax.annotation.Nullable Boolean storeOriginalFiles) {
    this.storeOriginalFiles = storeOriginalFiles;
  }

  public FilesSettingsDto keepNewFileName(@javax.annotation.Nullable Boolean keepNewFileName) {
    
    this.keepNewFileName = keepNewFileName;
    return this;
  }

  /**
   * Specifies whether to keep the new file name.
   * @return keepNewFileName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_KEEP_NEW_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKeepNewFileName() {
    return keepNewFileName;
  }


  @JsonProperty(value = JSON_PROPERTY_KEEP_NEW_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeepNewFileName(@javax.annotation.Nullable Boolean keepNewFileName) {
    this.keepNewFileName = keepNewFileName;
  }

  public FilesSettingsDto displayFileExtension(@javax.annotation.Nullable Boolean displayFileExtension) {
    
    this.displayFileExtension = displayFileExtension;
    return this;
  }

  /**
   * Specifies whether to display the file extension.
   * @return displayFileExtension
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DISPLAY_FILE_EXTENSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisplayFileExtension() {
    return displayFileExtension;
  }


  @JsonProperty(value = JSON_PROPERTY_DISPLAY_FILE_EXTENSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayFileExtension(@javax.annotation.Nullable Boolean displayFileExtension) {
    this.displayFileExtension = displayFileExtension;
  }

  public FilesSettingsDto convertNotify(@javax.annotation.Nullable Boolean convertNotify) {
    
    this.convertNotify = convertNotify;
    return this;
  }

  /**
   * Specifies whether to display the conversion notification.
   * @return convertNotify
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONVERT_NOTIFY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConvertNotify() {
    return convertNotify;
  }


  @JsonProperty(value = JSON_PROPERTY_CONVERT_NOTIFY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvertNotify(@javax.annotation.Nullable Boolean convertNotify) {
    this.convertNotify = convertNotify;
  }

  public FilesSettingsDto hideConfirmCancelOperation(@javax.annotation.Nullable Boolean hideConfirmCancelOperation) {
    
    this.hideConfirmCancelOperation = hideConfirmCancelOperation;
    return this;
  }

  /**
   * Specifies whether to hide the confirmation dialog for the cancel operation.
   * @return hideConfirmCancelOperation
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HIDE_CONFIRM_CANCEL_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideConfirmCancelOperation() {
    return hideConfirmCancelOperation;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_CONFIRM_CANCEL_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideConfirmCancelOperation(@javax.annotation.Nullable Boolean hideConfirmCancelOperation) {
    this.hideConfirmCancelOperation = hideConfirmCancelOperation;
  }

  public FilesSettingsDto hideConfirmConvertSave(@javax.annotation.Nullable Boolean hideConfirmConvertSave) {
    
    this.hideConfirmConvertSave = hideConfirmConvertSave;
    return this;
  }

  /**
   * Specifies whether to hide the confirmation dialog  for saving the file copy in the original format when converting a file.
   * @return hideConfirmConvertSave
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HIDE_CONFIRM_CONVERT_SAVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideConfirmConvertSave() {
    return hideConfirmConvertSave;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_CONFIRM_CONVERT_SAVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideConfirmConvertSave(@javax.annotation.Nullable Boolean hideConfirmConvertSave) {
    this.hideConfirmConvertSave = hideConfirmConvertSave;
  }

  public FilesSettingsDto hideConfirmConvertOpen(@javax.annotation.Nullable Boolean hideConfirmConvertOpen) {
    
    this.hideConfirmConvertOpen = hideConfirmConvertOpen;
    return this;
  }

  /**
   * Specifies whether to hide the confirmation dialog  for opening the conversion result.
   * @return hideConfirmConvertOpen
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HIDE_CONFIRM_CONVERT_OPEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideConfirmConvertOpen() {
    return hideConfirmConvertOpen;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_CONFIRM_CONVERT_OPEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideConfirmConvertOpen(@javax.annotation.Nullable Boolean hideConfirmConvertOpen) {
    this.hideConfirmConvertOpen = hideConfirmConvertOpen;
  }

  public FilesSettingsDto hideConfirmRoomLifetime(@javax.annotation.Nullable Boolean hideConfirmRoomLifetime) {
    
    this.hideConfirmRoomLifetime = hideConfirmRoomLifetime;
    return this;
  }

  /**
   * Specifies whether to hide the confirmation dialog about the file lifetime in the room.
   * @return hideConfirmRoomLifetime
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HIDE_CONFIRM_ROOM_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideConfirmRoomLifetime() {
    return hideConfirmRoomLifetime;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_CONFIRM_ROOM_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideConfirmRoomLifetime(@javax.annotation.Nullable Boolean hideConfirmRoomLifetime) {
    this.hideConfirmRoomLifetime = hideConfirmRoomLifetime;
  }

  public FilesSettingsDto defaultOrder(@javax.annotation.Nullable OrderBy defaultOrder) {
    
    this.defaultOrder = defaultOrder;
    return this;
  }

  /**
   * Get defaultOrder
   * @return defaultOrder
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEFAULT_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderBy getDefaultOrder() {
    return defaultOrder;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultOrder(@javax.annotation.Nullable OrderBy defaultOrder) {
    this.defaultOrder = defaultOrder;
  }

  public FilesSettingsDto forcesave(@javax.annotation.Nullable Boolean forcesave) {
    
    this.forcesave = forcesave;
    return this;
  }

  /**
   * Specifies whether to forcesave the files or not.
   * @return forcesave
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FORCESAVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForcesave() {
    return forcesave;
  }


  @JsonProperty(value = JSON_PROPERTY_FORCESAVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForcesave(@javax.annotation.Nullable Boolean forcesave) {
    this.forcesave = forcesave;
  }

  public FilesSettingsDto storeForcesave(@javax.annotation.Nullable Boolean storeForcesave) {
    
    this.storeForcesave = storeForcesave;
    return this;
  }

  /**
   * Specifies whether to store the forcesaved file versions or not.
   * @return storeForcesave
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STORE_FORCESAVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStoreForcesave() {
    return storeForcesave;
  }


  @JsonProperty(value = JSON_PROPERTY_STORE_FORCESAVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreForcesave(@javax.annotation.Nullable Boolean storeForcesave) {
    this.storeForcesave = storeForcesave;
  }

  public FilesSettingsDto recentSection(@javax.annotation.Nullable Boolean recentSection) {
    
    this.recentSection = recentSection;
    return this;
  }

  /**
   * Specifies if the Recent section is displayed or not.
   * @return recentSection
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RECENT_SECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRecentSection() {
    return recentSection;
  }


  @JsonProperty(value = JSON_PROPERTY_RECENT_SECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecentSection(@javax.annotation.Nullable Boolean recentSection) {
    this.recentSection = recentSection;
  }

  public FilesSettingsDto favoritesSection(@javax.annotation.Nullable Boolean favoritesSection) {
    
    this.favoritesSection = favoritesSection;
    return this;
  }

  /**
   * Specifies if the Favorites section is displayed or not.
   * @return favoritesSection
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FAVORITES_SECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFavoritesSection() {
    return favoritesSection;
  }


  @JsonProperty(value = JSON_PROPERTY_FAVORITES_SECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFavoritesSection(@javax.annotation.Nullable Boolean favoritesSection) {
    this.favoritesSection = favoritesSection;
  }

  public FilesSettingsDto templatesSection(@javax.annotation.Nullable Boolean templatesSection) {
    
    this.templatesSection = templatesSection;
    return this;
  }

  /**
   * Specifies if the Templates section is displayed or not.
   * @return templatesSection
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TEMPLATES_SECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTemplatesSection() {
    return templatesSection;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATES_SECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplatesSection(@javax.annotation.Nullable Boolean templatesSection) {
    this.templatesSection = templatesSection;
  }

  public FilesSettingsDto downloadTarGz(@javax.annotation.Nullable Boolean downloadTarGz) {
    
    this.downloadTarGz = downloadTarGz;
    return this;
  }

  /**
   * Specifies whether to download the .tar.gz files or not.
   * @return downloadTarGz
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOWNLOAD_TAR_GZ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDownloadTarGz() {
    return downloadTarGz;
  }


  @JsonProperty(value = JSON_PROPERTY_DOWNLOAD_TAR_GZ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadTarGz(@javax.annotation.Nullable Boolean downloadTarGz) {
    this.downloadTarGz = downloadTarGz;
  }

  public FilesSettingsDto automaticallyCleanUp(@javax.annotation.Nullable AutoCleanUpData automaticallyCleanUp) {
    
    this.automaticallyCleanUp = automaticallyCleanUp;
    return this;
  }

  /**
   * Get automaticallyCleanUp
   * @return automaticallyCleanUp
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AUTOMATICALLY_CLEAN_UP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AutoCleanUpData getAutomaticallyCleanUp() {
    return automaticallyCleanUp;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTOMATICALLY_CLEAN_UP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutomaticallyCleanUp(@javax.annotation.Nullable AutoCleanUpData automaticallyCleanUp) {
    this.automaticallyCleanUp = automaticallyCleanUp;
  }

  public FilesSettingsDto canSearchByContent(@javax.annotation.Nullable Boolean canSearchByContent) {
    
    this.canSearchByContent = canSearchByContent;
    return this;
  }

  /**
   * Specifies whether the file can be searched by its content or not.
   * @return canSearchByContent
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CAN_SEARCH_BY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanSearchByContent() {
    return canSearchByContent;
  }


  @JsonProperty(value = JSON_PROPERTY_CAN_SEARCH_BY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanSearchByContent(@javax.annotation.Nullable Boolean canSearchByContent) {
    this.canSearchByContent = canSearchByContent;
  }

  public FilesSettingsDto defaultSharingAccessRights(@javax.annotation.Nullable List<DefaultSharingAccessRightsEnum> defaultSharingAccessRights) {
    this.defaultSharingAccessRights = JsonNullable.<List<DefaultSharingAccessRightsEnum>>of(defaultSharingAccessRights);
    
    return this;
  }

  public FilesSettingsDto addDefaultSharingAccessRightsItem(DefaultSharingAccessRightsEnum defaultSharingAccessRightsItem) {
    if (this.defaultSharingAccessRights == null || !this.defaultSharingAccessRights.isPresent()) {
      this.defaultSharingAccessRights = JsonNullable.<List<DefaultSharingAccessRightsEnum>>of(new ArrayList<>());
    }
    try {
      this.defaultSharingAccessRights.get().add(defaultSharingAccessRightsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The default access rights in sharing settings.
   * @return defaultSharingAccessRights
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<DefaultSharingAccessRightsEnum> getDefaultSharingAccessRights() {
        return defaultSharingAccessRights.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DEFAULT_SHARING_ACCESS_RIGHTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<DefaultSharingAccessRightsEnum>> getDefaultSharingAccessRights_JsonNullable() {
    return defaultSharingAccessRights;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_SHARING_ACCESS_RIGHTS)
  public void setDefaultSharingAccessRights_JsonNullable(JsonNullable<List<DefaultSharingAccessRightsEnum>> defaultSharingAccessRights) {
    this.defaultSharingAccessRights = defaultSharingAccessRights;
  }

  public void setDefaultSharingAccessRights(@javax.annotation.Nullable List<DefaultSharingAccessRightsEnum> defaultSharingAccessRights) {
    this.defaultSharingAccessRights = JsonNullable.<List<DefaultSharingAccessRightsEnum>>of(defaultSharingAccessRights);
  }

  public FilesSettingsDto maxUploadThreadCount(@javax.annotation.Nullable Integer maxUploadThreadCount) {
    
    this.maxUploadThreadCount = maxUploadThreadCount;
    return this;
  }

  /**
   * The maximum number of upload threads.
   * @return maxUploadThreadCount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MAX_UPLOAD_THREAD_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxUploadThreadCount() {
    return maxUploadThreadCount;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_UPLOAD_THREAD_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxUploadThreadCount(@javax.annotation.Nullable Integer maxUploadThreadCount) {
    this.maxUploadThreadCount = maxUploadThreadCount;
  }

  public FilesSettingsDto chunkUploadSize(@javax.annotation.Nullable Long chunkUploadSize) {
    
    this.chunkUploadSize = chunkUploadSize;
    return this;
  }

  /**
   * The size of a large file that is uploaded in chunks.
   * @return chunkUploadSize
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CHUNK_UPLOAD_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getChunkUploadSize() {
    return chunkUploadSize;
  }


  @JsonProperty(value = JSON_PROPERTY_CHUNK_UPLOAD_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChunkUploadSize(@javax.annotation.Nullable Long chunkUploadSize) {
    this.chunkUploadSize = chunkUploadSize;
  }

  public FilesSettingsDto openEditorInSameTab(@javax.annotation.Nullable Boolean openEditorInSameTab) {
    
    this.openEditorInSameTab = openEditorInSameTab;
    return this;
  }

  /**
   * Specifies whether to open the editor in the same tab or not.
   * @return openEditorInSameTab
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OPEN_EDITOR_IN_SAME_TAB, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOpenEditorInSameTab() {
    return openEditorInSameTab;
  }


  @JsonProperty(value = JSON_PROPERTY_OPEN_EDITOR_IN_SAME_TAB, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenEditorInSameTab(@javax.annotation.Nullable Boolean openEditorInSameTab) {
    this.openEditorInSameTab = openEditorInSameTab;
  }

  public FilesSettingsDto organizeRoomsGrouping(@javax.annotation.Nullable Boolean organizeRoomsGrouping) {
    
    this.organizeRoomsGrouping = organizeRoomsGrouping;
    return this;
  }

  /**
   * Specifies whether the grouping of rooms is enabled or not.
   * @return organizeRoomsGrouping
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORGANIZE_ROOMS_GROUPING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOrganizeRoomsGrouping() {
    return organizeRoomsGrouping;
  }


  @JsonProperty(value = JSON_PROPERTY_ORGANIZE_ROOMS_GROUPING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizeRoomsGrouping(@javax.annotation.Nullable Boolean organizeRoomsGrouping) {
    this.organizeRoomsGrouping = organizeRoomsGrouping;
  }

  public FilesSettingsDto extsFilesVectorized(@javax.annotation.Nullable List<String> extsFilesVectorized) {
    this.extsFilesVectorized = JsonNullable.<List<String>>of(extsFilesVectorized);
    
    return this;
  }

  public FilesSettingsDto addExtsFilesVectorizedItem(String extsFilesVectorizedItem) {
    if (this.extsFilesVectorized == null || !this.extsFilesVectorized.isPresent()) {
      this.extsFilesVectorized = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.extsFilesVectorized.get().add(extsFilesVectorizedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of extensions available for vectorization
   * @return extsFilesVectorized
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getExtsFilesVectorized() {
        return extsFilesVectorized.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXTS_FILES_VECTORIZED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getExtsFilesVectorized_JsonNullable() {
    return extsFilesVectorized;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTS_FILES_VECTORIZED)
  public void setExtsFilesVectorized_JsonNullable(JsonNullable<List<String>> extsFilesVectorized) {
    this.extsFilesVectorized = extsFilesVectorized;
  }

  public void setExtsFilesVectorized(@javax.annotation.Nullable List<String> extsFilesVectorized) {
    this.extsFilesVectorized = JsonNullable.<List<String>>of(extsFilesVectorized);
  }

  public FilesSettingsDto maxVectorizationFileSize(@javax.annotation.Nullable Long maxVectorizationFileSize) {
    
    this.maxVectorizationFileSize = maxVectorizationFileSize;
    return this;
  }

  /**
   * The maximum file size for vectorization
   * @return maxVectorizationFileSize
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MAX_VECTORIZATION_FILE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxVectorizationFileSize() {
    return maxVectorizationFileSize;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_VECTORIZATION_FILE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxVectorizationFileSize(@javax.annotation.Nullable Long maxVectorizationFileSize) {
    this.maxVectorizationFileSize = maxVectorizationFileSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesSettingsDto filesSettingsDto = (FilesSettingsDto) o;
    return equalsNullable(this.extsImagePreviewed, filesSettingsDto.extsImagePreviewed) &&
        equalsNullable(this.extsMediaPreviewed, filesSettingsDto.extsMediaPreviewed) &&
        equalsNullable(this.extsWebPreviewed, filesSettingsDto.extsWebPreviewed) &&
        equalsNullable(this.extsWebEdited, filesSettingsDto.extsWebEdited) &&
        equalsNullable(this.extsWebEncrypt, filesSettingsDto.extsWebEncrypt) &&
        equalsNullable(this.extsWebReviewed, filesSettingsDto.extsWebReviewed) &&
        equalsNullable(this.extsWebCustomFilterEditing, filesSettingsDto.extsWebCustomFilterEditing) &&
        equalsNullable(this.extsWebRestrictedEditing, filesSettingsDto.extsWebRestrictedEditing) &&
        equalsNullable(this.extsWebCommented, filesSettingsDto.extsWebCommented) &&
        equalsNullable(this.extsWebTemplate, filesSettingsDto.extsWebTemplate) &&
        equalsNullable(this.extsMustConvert, filesSettingsDto.extsMustConvert) &&
        equalsNullable(this.extsConvertible, filesSettingsDto.extsConvertible) &&
        equalsNullable(this.extsUploadable, filesSettingsDto.extsUploadable) &&
        equalsNullable(this.extsArchive, filesSettingsDto.extsArchive) &&
        equalsNullable(this.extsVideo, filesSettingsDto.extsVideo) &&
        equalsNullable(this.extsAudio, filesSettingsDto.extsAudio) &&
        equalsNullable(this.extsImage, filesSettingsDto.extsImage) &&
        equalsNullable(this.extsSpreadsheet, filesSettingsDto.extsSpreadsheet) &&
        equalsNullable(this.extsPresentation, filesSettingsDto.extsPresentation) &&
        equalsNullable(this.extsDocument, filesSettingsDto.extsDocument) &&
        equalsNullable(this.extsDiagram, filesSettingsDto.extsDiagram) &&
        equalsNullable(this.internalFormats, filesSettingsDto.internalFormats) &&
        equalsNullable(this.masterFormExtension, filesSettingsDto.masterFormExtension) &&
        equalsNullable(this.paramVersion, filesSettingsDto.paramVersion) &&
        equalsNullable(this.paramOutType, filesSettingsDto.paramOutType) &&
        equalsNullable(this.fileDownloadUrlString, filesSettingsDto.fileDownloadUrlString) &&
        equalsNullable(this.fileWebViewerUrlString, filesSettingsDto.fileWebViewerUrlString) &&
        equalsNullable(this.fileWebViewerExternalUrlString, filesSettingsDto.fileWebViewerExternalUrlString) &&
        equalsNullable(this.fileWebEditorUrlString, filesSettingsDto.fileWebEditorUrlString) &&
        equalsNullable(this.fileWebEditorExternalUrlString, filesSettingsDto.fileWebEditorExternalUrlString) &&
        equalsNullable(this.fileRedirectPreviewUrlString, filesSettingsDto.fileRedirectPreviewUrlString) &&
        equalsNullable(this.fileThumbnailUrlString, filesSettingsDto.fileThumbnailUrlString) &&
        Objects.equals(this.confirmDelete, filesSettingsDto.confirmDelete) &&
        Objects.equals(this.enableThirdParty, filesSettingsDto.enableThirdParty) &&
        Objects.equals(this.externalShare, filesSettingsDto.externalShare) &&
        Objects.equals(this.externalShareSocialMedia, filesSettingsDto.externalShareSocialMedia) &&
        Objects.equals(this.storeOriginalFiles, filesSettingsDto.storeOriginalFiles) &&
        Objects.equals(this.keepNewFileName, filesSettingsDto.keepNewFileName) &&
        Objects.equals(this.displayFileExtension, filesSettingsDto.displayFileExtension) &&
        Objects.equals(this.convertNotify, filesSettingsDto.convertNotify) &&
        Objects.equals(this.hideConfirmCancelOperation, filesSettingsDto.hideConfirmCancelOperation) &&
        Objects.equals(this.hideConfirmConvertSave, filesSettingsDto.hideConfirmConvertSave) &&
        Objects.equals(this.hideConfirmConvertOpen, filesSettingsDto.hideConfirmConvertOpen) &&
        Objects.equals(this.hideConfirmRoomLifetime, filesSettingsDto.hideConfirmRoomLifetime) &&
        Objects.equals(this.defaultOrder, filesSettingsDto.defaultOrder) &&
        Objects.equals(this.forcesave, filesSettingsDto.forcesave) &&
        Objects.equals(this.storeForcesave, filesSettingsDto.storeForcesave) &&
        Objects.equals(this.recentSection, filesSettingsDto.recentSection) &&
        Objects.equals(this.favoritesSection, filesSettingsDto.favoritesSection) &&
        Objects.equals(this.templatesSection, filesSettingsDto.templatesSection) &&
        Objects.equals(this.downloadTarGz, filesSettingsDto.downloadTarGz) &&
        Objects.equals(this.automaticallyCleanUp, filesSettingsDto.automaticallyCleanUp) &&
        Objects.equals(this.canSearchByContent, filesSettingsDto.canSearchByContent) &&
        equalsNullable(this.defaultSharingAccessRights, filesSettingsDto.defaultSharingAccessRights) &&
        Objects.equals(this.maxUploadThreadCount, filesSettingsDto.maxUploadThreadCount) &&
        Objects.equals(this.chunkUploadSize, filesSettingsDto.chunkUploadSize) &&
        Objects.equals(this.openEditorInSameTab, filesSettingsDto.openEditorInSameTab) &&
        Objects.equals(this.organizeRoomsGrouping, filesSettingsDto.organizeRoomsGrouping) &&
        equalsNullable(this.extsFilesVectorized, filesSettingsDto.extsFilesVectorized) &&
        Objects.equals(this.maxVectorizationFileSize, filesSettingsDto.maxVectorizationFileSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(extsImagePreviewed), hashCodeNullable(extsMediaPreviewed), hashCodeNullable(extsWebPreviewed), hashCodeNullable(extsWebEdited), hashCodeNullable(extsWebEncrypt), hashCodeNullable(extsWebReviewed), hashCodeNullable(extsWebCustomFilterEditing), hashCodeNullable(extsWebRestrictedEditing), hashCodeNullable(extsWebCommented), hashCodeNullable(extsWebTemplate), hashCodeNullable(extsMustConvert), hashCodeNullable(extsConvertible), hashCodeNullable(extsUploadable), hashCodeNullable(extsArchive), hashCodeNullable(extsVideo), hashCodeNullable(extsAudio), hashCodeNullable(extsImage), hashCodeNullable(extsSpreadsheet), hashCodeNullable(extsPresentation), hashCodeNullable(extsDocument), hashCodeNullable(extsDiagram), hashCodeNullable(internalFormats), hashCodeNullable(masterFormExtension), hashCodeNullable(paramVersion), hashCodeNullable(paramOutType), hashCodeNullable(fileDownloadUrlString), hashCodeNullable(fileWebViewerUrlString), hashCodeNullable(fileWebViewerExternalUrlString), hashCodeNullable(fileWebEditorUrlString), hashCodeNullable(fileWebEditorExternalUrlString), hashCodeNullable(fileRedirectPreviewUrlString), hashCodeNullable(fileThumbnailUrlString), confirmDelete, enableThirdParty, externalShare, externalShareSocialMedia, storeOriginalFiles, keepNewFileName, displayFileExtension, convertNotify, hideConfirmCancelOperation, hideConfirmConvertSave, hideConfirmConvertOpen, hideConfirmRoomLifetime, defaultOrder, forcesave, storeForcesave, recentSection, favoritesSection, templatesSection, downloadTarGz, automaticallyCleanUp, canSearchByContent, hashCodeNullable(defaultSharingAccessRights), maxUploadThreadCount, chunkUploadSize, openEditorInSameTab, organizeRoomsGrouping, hashCodeNullable(extsFilesVectorized), maxVectorizationFileSize);
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
    sb.append("class FilesSettingsDto {\n");
    sb.append("    extsImagePreviewed: ").append(toIndentedString(extsImagePreviewed)).append("\n");
    sb.append("    extsMediaPreviewed: ").append(toIndentedString(extsMediaPreviewed)).append("\n");
    sb.append("    extsWebPreviewed: ").append(toIndentedString(extsWebPreviewed)).append("\n");
    sb.append("    extsWebEdited: ").append(toIndentedString(extsWebEdited)).append("\n");
    sb.append("    extsWebEncrypt: ").append(toIndentedString(extsWebEncrypt)).append("\n");
    sb.append("    extsWebReviewed: ").append(toIndentedString(extsWebReviewed)).append("\n");
    sb.append("    extsWebCustomFilterEditing: ").append(toIndentedString(extsWebCustomFilterEditing)).append("\n");
    sb.append("    extsWebRestrictedEditing: ").append(toIndentedString(extsWebRestrictedEditing)).append("\n");
    sb.append("    extsWebCommented: ").append(toIndentedString(extsWebCommented)).append("\n");
    sb.append("    extsWebTemplate: ").append(toIndentedString(extsWebTemplate)).append("\n");
    sb.append("    extsMustConvert: ").append(toIndentedString(extsMustConvert)).append("\n");
    sb.append("    extsConvertible: ").append(toIndentedString(extsConvertible)).append("\n");
    sb.append("    extsUploadable: ").append(toIndentedString(extsUploadable)).append("\n");
    sb.append("    extsArchive: ").append(toIndentedString(extsArchive)).append("\n");
    sb.append("    extsVideo: ").append(toIndentedString(extsVideo)).append("\n");
    sb.append("    extsAudio: ").append(toIndentedString(extsAudio)).append("\n");
    sb.append("    extsImage: ").append(toIndentedString(extsImage)).append("\n");
    sb.append("    extsSpreadsheet: ").append(toIndentedString(extsSpreadsheet)).append("\n");
    sb.append("    extsPresentation: ").append(toIndentedString(extsPresentation)).append("\n");
    sb.append("    extsDocument: ").append(toIndentedString(extsDocument)).append("\n");
    sb.append("    extsDiagram: ").append(toIndentedString(extsDiagram)).append("\n");
    sb.append("    internalFormats: ").append(toIndentedString(internalFormats)).append("\n");
    sb.append("    masterFormExtension: ").append(toIndentedString(masterFormExtension)).append("\n");
    sb.append("    paramVersion: ").append(toIndentedString(paramVersion)).append("\n");
    sb.append("    paramOutType: ").append(toIndentedString(paramOutType)).append("\n");
    sb.append("    fileDownloadUrlString: ").append(toIndentedString(fileDownloadUrlString)).append("\n");
    sb.append("    fileWebViewerUrlString: ").append(toIndentedString(fileWebViewerUrlString)).append("\n");
    sb.append("    fileWebViewerExternalUrlString: ").append(toIndentedString(fileWebViewerExternalUrlString)).append("\n");
    sb.append("    fileWebEditorUrlString: ").append(toIndentedString(fileWebEditorUrlString)).append("\n");
    sb.append("    fileWebEditorExternalUrlString: ").append(toIndentedString(fileWebEditorExternalUrlString)).append("\n");
    sb.append("    fileRedirectPreviewUrlString: ").append(toIndentedString(fileRedirectPreviewUrlString)).append("\n");
    sb.append("    fileThumbnailUrlString: ").append(toIndentedString(fileThumbnailUrlString)).append("\n");
    sb.append("    confirmDelete: ").append(toIndentedString(confirmDelete)).append("\n");
    sb.append("    enableThirdParty: ").append(toIndentedString(enableThirdParty)).append("\n");
    sb.append("    externalShare: ").append(toIndentedString(externalShare)).append("\n");
    sb.append("    externalShareSocialMedia: ").append(toIndentedString(externalShareSocialMedia)).append("\n");
    sb.append("    storeOriginalFiles: ").append(toIndentedString(storeOriginalFiles)).append("\n");
    sb.append("    keepNewFileName: ").append(toIndentedString(keepNewFileName)).append("\n");
    sb.append("    displayFileExtension: ").append(toIndentedString(displayFileExtension)).append("\n");
    sb.append("    convertNotify: ").append(toIndentedString(convertNotify)).append("\n");
    sb.append("    hideConfirmCancelOperation: ").append(toIndentedString(hideConfirmCancelOperation)).append("\n");
    sb.append("    hideConfirmConvertSave: ").append(toIndentedString(hideConfirmConvertSave)).append("\n");
    sb.append("    hideConfirmConvertOpen: ").append(toIndentedString(hideConfirmConvertOpen)).append("\n");
    sb.append("    hideConfirmRoomLifetime: ").append(toIndentedString(hideConfirmRoomLifetime)).append("\n");
    sb.append("    defaultOrder: ").append(toIndentedString(defaultOrder)).append("\n");
    sb.append("    forcesave: ").append(toIndentedString(forcesave)).append("\n");
    sb.append("    storeForcesave: ").append(toIndentedString(storeForcesave)).append("\n");
    sb.append("    recentSection: ").append(toIndentedString(recentSection)).append("\n");
    sb.append("    favoritesSection: ").append(toIndentedString(favoritesSection)).append("\n");
    sb.append("    templatesSection: ").append(toIndentedString(templatesSection)).append("\n");
    sb.append("    downloadTarGz: ").append(toIndentedString(downloadTarGz)).append("\n");
    sb.append("    automaticallyCleanUp: ").append(toIndentedString(automaticallyCleanUp)).append("\n");
    sb.append("    canSearchByContent: ").append(toIndentedString(canSearchByContent)).append("\n");
    sb.append("    defaultSharingAccessRights: ").append(toIndentedString(defaultSharingAccessRights)).append("\n");
    sb.append("    maxUploadThreadCount: ").append(toIndentedString(maxUploadThreadCount)).append("\n");
    sb.append("    chunkUploadSize: ").append(toIndentedString(chunkUploadSize)).append("\n");
    sb.append("    openEditorInSameTab: ").append(toIndentedString(openEditorInSameTab)).append("\n");
    sb.append("    organizeRoomsGrouping: ").append(toIndentedString(organizeRoomsGrouping)).append("\n");
    sb.append("    extsFilesVectorized: ").append(toIndentedString(extsFilesVectorized)).append("\n");
    sb.append("    maxVectorizationFileSize: ").append(toIndentedString(maxVectorizationFileSize)).append("\n");
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

    // add `extsImagePreviewed` to the URL query string
    if (getExtsImagePreviewed() != null) {
      for (int i = 0; i < getExtsImagePreviewed().size(); i++) {
        try {
          joiner.add(String.format("%sextsImagePreviewed%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsImagePreviewed().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsMediaPreviewed` to the URL query string
    if (getExtsMediaPreviewed() != null) {
      for (int i = 0; i < getExtsMediaPreviewed().size(); i++) {
        try {
          joiner.add(String.format("%sextsMediaPreviewed%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsMediaPreviewed().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsWebPreviewed` to the URL query string
    if (getExtsWebPreviewed() != null) {
      for (int i = 0; i < getExtsWebPreviewed().size(); i++) {
        try {
          joiner.add(String.format("%sextsWebPreviewed%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsWebPreviewed().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsWebEdited` to the URL query string
    if (getExtsWebEdited() != null) {
      for (int i = 0; i < getExtsWebEdited().size(); i++) {
        try {
          joiner.add(String.format("%sextsWebEdited%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsWebEdited().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsWebEncrypt` to the URL query string
    if (getExtsWebEncrypt() != null) {
      for (int i = 0; i < getExtsWebEncrypt().size(); i++) {
        try {
          joiner.add(String.format("%sextsWebEncrypt%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsWebEncrypt().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsWebReviewed` to the URL query string
    if (getExtsWebReviewed() != null) {
      for (int i = 0; i < getExtsWebReviewed().size(); i++) {
        try {
          joiner.add(String.format("%sextsWebReviewed%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsWebReviewed().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsWebCustomFilterEditing` to the URL query string
    if (getExtsWebCustomFilterEditing() != null) {
      for (int i = 0; i < getExtsWebCustomFilterEditing().size(); i++) {
        try {
          joiner.add(String.format("%sextsWebCustomFilterEditing%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsWebCustomFilterEditing().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsWebRestrictedEditing` to the URL query string
    if (getExtsWebRestrictedEditing() != null) {
      for (int i = 0; i < getExtsWebRestrictedEditing().size(); i++) {
        try {
          joiner.add(String.format("%sextsWebRestrictedEditing%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsWebRestrictedEditing().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsWebCommented` to the URL query string
    if (getExtsWebCommented() != null) {
      for (int i = 0; i < getExtsWebCommented().size(); i++) {
        try {
          joiner.add(String.format("%sextsWebCommented%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsWebCommented().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsWebTemplate` to the URL query string
    if (getExtsWebTemplate() != null) {
      for (int i = 0; i < getExtsWebTemplate().size(); i++) {
        try {
          joiner.add(String.format("%sextsWebTemplate%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsWebTemplate().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsMustConvert` to the URL query string
    if (getExtsMustConvert() != null) {
      for (int i = 0; i < getExtsMustConvert().size(); i++) {
        try {
          joiner.add(String.format("%sextsMustConvert%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsMustConvert().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsConvertible` to the URL query string
    if (getExtsConvertible() != null) {
      for (String _key : getExtsConvertible().keySet()) {
        try {
          joiner.add(String.format("%sextsConvertible%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getExtsConvertible().get(_key), URLEncoder.encode(String.valueOf(getExtsConvertible().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsUploadable` to the URL query string
    if (getExtsUploadable() != null) {
      for (int i = 0; i < getExtsUploadable().size(); i++) {
        try {
          joiner.add(String.format("%sextsUploadable%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsUploadable().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsArchive` to the URL query string
    if (getExtsArchive() != null) {
      for (int i = 0; i < getExtsArchive().size(); i++) {
        try {
          joiner.add(String.format("%sextsArchive%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsArchive().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsVideo` to the URL query string
    if (getExtsVideo() != null) {
      for (int i = 0; i < getExtsVideo().size(); i++) {
        try {
          joiner.add(String.format("%sextsVideo%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsVideo().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsAudio` to the URL query string
    if (getExtsAudio() != null) {
      for (int i = 0; i < getExtsAudio().size(); i++) {
        try {
          joiner.add(String.format("%sextsAudio%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsAudio().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsImage` to the URL query string
    if (getExtsImage() != null) {
      for (int i = 0; i < getExtsImage().size(); i++) {
        try {
          joiner.add(String.format("%sextsImage%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsImage().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsSpreadsheet` to the URL query string
    if (getExtsSpreadsheet() != null) {
      for (int i = 0; i < getExtsSpreadsheet().size(); i++) {
        try {
          joiner.add(String.format("%sextsSpreadsheet%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsSpreadsheet().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsPresentation` to the URL query string
    if (getExtsPresentation() != null) {
      for (int i = 0; i < getExtsPresentation().size(); i++) {
        try {
          joiner.add(String.format("%sextsPresentation%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsPresentation().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsDocument` to the URL query string
    if (getExtsDocument() != null) {
      for (int i = 0; i < getExtsDocument().size(); i++) {
        try {
          joiner.add(String.format("%sextsDocument%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsDocument().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `extsDiagram` to the URL query string
    if (getExtsDiagram() != null) {
      for (int i = 0; i < getExtsDiagram().size(); i++) {
        try {
          joiner.add(String.format("%sextsDiagram%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsDiagram().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `internalFormats` to the URL query string
    if (getInternalFormats() != null) {
      joiner.add(getInternalFormats().toUrlQueryString(prefix + "internalFormats" + suffix));
    }

    // add `masterFormExtension` to the URL query string
    if (getMasterFormExtension() != null) {
      try {
        joiner.add(String.format("%smasterFormExtension%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMasterFormExtension()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paramVersion` to the URL query string
    if (getParamVersion() != null) {
      try {
        joiner.add(String.format("%sparamVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParamVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paramOutType` to the URL query string
    if (getParamOutType() != null) {
      try {
        joiner.add(String.format("%sparamOutType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParamOutType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileDownloadUrlString` to the URL query string
    if (getFileDownloadUrlString() != null) {
      try {
        joiner.add(String.format("%sfileDownloadUrlString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileDownloadUrlString()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileWebViewerUrlString` to the URL query string
    if (getFileWebViewerUrlString() != null) {
      try {
        joiner.add(String.format("%sfileWebViewerUrlString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileWebViewerUrlString()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileWebViewerExternalUrlString` to the URL query string
    if (getFileWebViewerExternalUrlString() != null) {
      try {
        joiner.add(String.format("%sfileWebViewerExternalUrlString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileWebViewerExternalUrlString()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileWebEditorUrlString` to the URL query string
    if (getFileWebEditorUrlString() != null) {
      try {
        joiner.add(String.format("%sfileWebEditorUrlString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileWebEditorUrlString()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileWebEditorExternalUrlString` to the URL query string
    if (getFileWebEditorExternalUrlString() != null) {
      try {
        joiner.add(String.format("%sfileWebEditorExternalUrlString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileWebEditorExternalUrlString()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileRedirectPreviewUrlString` to the URL query string
    if (getFileRedirectPreviewUrlString() != null) {
      try {
        joiner.add(String.format("%sfileRedirectPreviewUrlString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileRedirectPreviewUrlString()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileThumbnailUrlString` to the URL query string
    if (getFileThumbnailUrlString() != null) {
      try {
        joiner.add(String.format("%sfileThumbnailUrlString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileThumbnailUrlString()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `confirmDelete` to the URL query string
    if (getConfirmDelete() != null) {
      try {
        joiner.add(String.format("%sconfirmDelete%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfirmDelete()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enableThirdParty` to the URL query string
    if (getEnableThirdParty() != null) {
      try {
        joiner.add(String.format("%senableThirdParty%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableThirdParty()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalShare` to the URL query string
    if (getExternalShare() != null) {
      try {
        joiner.add(String.format("%sexternalShare%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalShare()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalShareSocialMedia` to the URL query string
    if (getExternalShareSocialMedia() != null) {
      try {
        joiner.add(String.format("%sexternalShareSocialMedia%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalShareSocialMedia()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `storeOriginalFiles` to the URL query string
    if (getStoreOriginalFiles() != null) {
      try {
        joiner.add(String.format("%sstoreOriginalFiles%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStoreOriginalFiles()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `keepNewFileName` to the URL query string
    if (getKeepNewFileName() != null) {
      try {
        joiner.add(String.format("%skeepNewFileName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKeepNewFileName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `displayFileExtension` to the URL query string
    if (getDisplayFileExtension() != null) {
      try {
        joiner.add(String.format("%sdisplayFileExtension%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayFileExtension()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `convertNotify` to the URL query string
    if (getConvertNotify() != null) {
      try {
        joiner.add(String.format("%sconvertNotify%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConvertNotify()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hideConfirmCancelOperation` to the URL query string
    if (getHideConfirmCancelOperation() != null) {
      try {
        joiner.add(String.format("%shideConfirmCancelOperation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHideConfirmCancelOperation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hideConfirmConvertSave` to the URL query string
    if (getHideConfirmConvertSave() != null) {
      try {
        joiner.add(String.format("%shideConfirmConvertSave%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHideConfirmConvertSave()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hideConfirmConvertOpen` to the URL query string
    if (getHideConfirmConvertOpen() != null) {
      try {
        joiner.add(String.format("%shideConfirmConvertOpen%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHideConfirmConvertOpen()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hideConfirmRoomLifetime` to the URL query string
    if (getHideConfirmRoomLifetime() != null) {
      try {
        joiner.add(String.format("%shideConfirmRoomLifetime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHideConfirmRoomLifetime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultOrder` to the URL query string
    if (getDefaultOrder() != null) {
      joiner.add(getDefaultOrder().toUrlQueryString(prefix + "defaultOrder" + suffix));
    }

    // add `forcesave` to the URL query string
    if (getForcesave() != null) {
      try {
        joiner.add(String.format("%sforcesave%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForcesave()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `storeForcesave` to the URL query string
    if (getStoreForcesave() != null) {
      try {
        joiner.add(String.format("%sstoreForcesave%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStoreForcesave()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recentSection` to the URL query string
    if (getRecentSection() != null) {
      try {
        joiner.add(String.format("%srecentSection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecentSection()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `favoritesSection` to the URL query string
    if (getFavoritesSection() != null) {
      try {
        joiner.add(String.format("%sfavoritesSection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFavoritesSection()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `templatesSection` to the URL query string
    if (getTemplatesSection() != null) {
      try {
        joiner.add(String.format("%stemplatesSection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplatesSection()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `downloadTarGz` to the URL query string
    if (getDownloadTarGz() != null) {
      try {
        joiner.add(String.format("%sdownloadTarGz%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDownloadTarGz()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `automaticallyCleanUp` to the URL query string
    if (getAutomaticallyCleanUp() != null) {
      joiner.add(getAutomaticallyCleanUp().toUrlQueryString(prefix + "automaticallyCleanUp" + suffix));
    }

    // add `canSearchByContent` to the URL query string
    if (getCanSearchByContent() != null) {
      try {
        joiner.add(String.format("%scanSearchByContent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanSearchByContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultSharingAccessRights` to the URL query string
    if (getDefaultSharingAccessRights() != null) {
      for (int i = 0; i < getDefaultSharingAccessRights().size(); i++) {
        try {
          joiner.add(String.format("%sdefaultSharingAccessRights%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getDefaultSharingAccessRights().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `maxUploadThreadCount` to the URL query string
    if (getMaxUploadThreadCount() != null) {
      try {
        joiner.add(String.format("%smaxUploadThreadCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxUploadThreadCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `chunkUploadSize` to the URL query string
    if (getChunkUploadSize() != null) {
      try {
        joiner.add(String.format("%schunkUploadSize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChunkUploadSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `openEditorInSameTab` to the URL query string
    if (getOpenEditorInSameTab() != null) {
      try {
        joiner.add(String.format("%sopenEditorInSameTab%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpenEditorInSameTab()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `organizeRoomsGrouping` to the URL query string
    if (getOrganizeRoomsGrouping() != null) {
      try {
        joiner.add(String.format("%sorganizeRoomsGrouping%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrganizeRoomsGrouping()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `extsFilesVectorized` to the URL query string
    if (getExtsFilesVectorized() != null) {
      for (int i = 0; i < getExtsFilesVectorized().size(); i++) {
        try {
          joiner.add(String.format("%sextsFilesVectorized%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExtsFilesVectorized().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `maxVectorizationFileSize` to the URL query string
    if (getMaxVectorizationFileSize() != null) {
      try {
        joiner.add(String.format("%smaxVectorizationFileSize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxVectorizationFileSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

