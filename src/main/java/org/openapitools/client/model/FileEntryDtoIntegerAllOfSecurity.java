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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The actions that can be performed with the file entry.
 */
@JsonPropertyOrder({
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_READ,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_COMMENT,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_FILL_FORMS,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_REVIEW,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_CREATE,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_CREATE_FROM,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_EDIT,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_DELETE,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_CUSTOM_FILTER,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_EDIT_ROOM,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_RENAME,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_READ_HISTORY,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_LOCK,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_EDIT_HISTORY,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_COPY_TO,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_COPY,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_MOVE_TO,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_MOVE,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_PIN,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_MUTE,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_EDIT_ACCESS,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_DUPLICATE,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_SUBMIT_TO_FORM_GALLERY,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_DOWNLOAD,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_CONVERT,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_COPY_SHARED_LINK,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_READ_LINKS,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_RECONNECT,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_CREATE_ROOM_FROM,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_COPY_LINK,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_EMBED,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_CHANGE_OWNER,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_INDEX_EXPORT,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_START_FILLING,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_FILLING_STATUS,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_RESET_FILLING,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_STOP_FILLING,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_OPEN_FORM,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_EDIT_INTERNAL,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_EDIT_EXPIRATION,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_VECTORIZATION,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_ASC_AI,
  FileEntryDtoIntegerAllOfSecurity.JSON_PROPERTY_USE_CHAT
})
@JsonTypeName("FileEntryDtoInteger_allOf_security")
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FileEntryDtoIntegerAllOfSecurity {
  public static final String JSON_PROPERTY_READ = "Read";
  @javax.annotation.Nullable
  private Boolean read;

  public static final String JSON_PROPERTY_COMMENT = "Comment";
  @javax.annotation.Nullable
  private Boolean comment;

  public static final String JSON_PROPERTY_FILL_FORMS = "FillForms";
  @javax.annotation.Nullable
  private Boolean fillForms;

  public static final String JSON_PROPERTY_REVIEW = "Review";
  @javax.annotation.Nullable
  private Boolean review;

  public static final String JSON_PROPERTY_CREATE = "Create";
  @javax.annotation.Nullable
  private Boolean create;

  public static final String JSON_PROPERTY_CREATE_FROM = "CreateFrom";
  @javax.annotation.Nullable
  private Boolean createFrom;

  public static final String JSON_PROPERTY_EDIT = "Edit";
  @javax.annotation.Nullable
  private Boolean edit;

  public static final String JSON_PROPERTY_DELETE = "Delete";
  @javax.annotation.Nullable
  private Boolean delete;

  public static final String JSON_PROPERTY_CUSTOM_FILTER = "CustomFilter";
  @javax.annotation.Nullable
  private Boolean customFilter;

  public static final String JSON_PROPERTY_EDIT_ROOM = "EditRoom";
  @javax.annotation.Nullable
  private Boolean editRoom;

  public static final String JSON_PROPERTY_RENAME = "Rename";
  @javax.annotation.Nullable
  private Boolean rename;

  public static final String JSON_PROPERTY_READ_HISTORY = "ReadHistory";
  @javax.annotation.Nullable
  private Boolean readHistory;

  public static final String JSON_PROPERTY_LOCK = "Lock";
  @javax.annotation.Nullable
  private Boolean lock;

  public static final String JSON_PROPERTY_EDIT_HISTORY = "EditHistory";
  @javax.annotation.Nullable
  private Boolean editHistory;

  public static final String JSON_PROPERTY_COPY_TO = "CopyTo";
  @javax.annotation.Nullable
  private Boolean copyTo;

  public static final String JSON_PROPERTY_COPY = "Copy";
  @javax.annotation.Nullable
  private Boolean copy;

  public static final String JSON_PROPERTY_MOVE_TO = "MoveTo";
  @javax.annotation.Nullable
  private Boolean moveTo;

  public static final String JSON_PROPERTY_MOVE = "Move";
  @javax.annotation.Nullable
  private Boolean move;

  public static final String JSON_PROPERTY_PIN = "Pin";
  @javax.annotation.Nullable
  private Boolean pin;

  public static final String JSON_PROPERTY_MUTE = "Mute";
  @javax.annotation.Nullable
  private Boolean mute;

  public static final String JSON_PROPERTY_EDIT_ACCESS = "EditAccess";
  @javax.annotation.Nullable
  private Boolean editAccess;

  public static final String JSON_PROPERTY_DUPLICATE = "Duplicate";
  @javax.annotation.Nullable
  private Boolean duplicate;

  public static final String JSON_PROPERTY_SUBMIT_TO_FORM_GALLERY = "SubmitToFormGallery";
  @javax.annotation.Nullable
  private Boolean submitToFormGallery;

  public static final String JSON_PROPERTY_DOWNLOAD = "Download";
  @javax.annotation.Nullable
  private Boolean download;

  public static final String JSON_PROPERTY_CONVERT = "Convert";
  @javax.annotation.Nullable
  private Boolean convert;

  public static final String JSON_PROPERTY_COPY_SHARED_LINK = "CopySharedLink";
  @javax.annotation.Nullable
  private Boolean copySharedLink;

  public static final String JSON_PROPERTY_READ_LINKS = "ReadLinks";
  @javax.annotation.Nullable
  private Boolean readLinks;

  public static final String JSON_PROPERTY_RECONNECT = "Reconnect";
  @javax.annotation.Nullable
  private Boolean reconnect;

  public static final String JSON_PROPERTY_CREATE_ROOM_FROM = "CreateRoomFrom";
  @javax.annotation.Nullable
  private Boolean createRoomFrom;

  public static final String JSON_PROPERTY_COPY_LINK = "CopyLink";
  @javax.annotation.Nullable
  private Boolean copyLink;

  public static final String JSON_PROPERTY_EMBED = "Embed";
  @javax.annotation.Nullable
  private Boolean embed;

  public static final String JSON_PROPERTY_CHANGE_OWNER = "ChangeOwner";
  @javax.annotation.Nullable
  private Boolean changeOwner;

  public static final String JSON_PROPERTY_INDEX_EXPORT = "IndexExport";
  @javax.annotation.Nullable
  private Boolean indexExport;

  public static final String JSON_PROPERTY_START_FILLING = "StartFilling";
  @javax.annotation.Nullable
  private Boolean startFilling;

  public static final String JSON_PROPERTY_FILLING_STATUS = "FillingStatus";
  @javax.annotation.Nullable
  private Boolean fillingStatus;

  public static final String JSON_PROPERTY_RESET_FILLING = "ResetFilling";
  @javax.annotation.Nullable
  private Boolean resetFilling;

  public static final String JSON_PROPERTY_STOP_FILLING = "StopFilling";
  @javax.annotation.Nullable
  private Boolean stopFilling;

  public static final String JSON_PROPERTY_OPEN_FORM = "OpenForm";
  @javax.annotation.Nullable
  private Boolean openForm;

  public static final String JSON_PROPERTY_EDIT_INTERNAL = "EditInternal";
  @javax.annotation.Nullable
  private Boolean editInternal;

  public static final String JSON_PROPERTY_EDIT_EXPIRATION = "EditExpiration";
  @javax.annotation.Nullable
  private Boolean editExpiration;

  public static final String JSON_PROPERTY_VECTORIZATION = "Vectorization";
  @javax.annotation.Nullable
  private Boolean vectorization;

  public static final String JSON_PROPERTY_ASC_AI = "AscAi";
  @javax.annotation.Nullable
  private Boolean ascAi;

  public static final String JSON_PROPERTY_USE_CHAT = "UseChat";
  @javax.annotation.Nullable
  private Boolean useChat;

  public FileEntryDtoIntegerAllOfSecurity() {
  }

  public FileEntryDtoIntegerAllOfSecurity read(@javax.annotation.Nullable Boolean read) {
    
    this.read = read;
    return this;
  }

  /**
   * Get read
   * @return read
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRead() {
    return read;
  }


  @JsonProperty(JSON_PROPERTY_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRead(@javax.annotation.Nullable Boolean read) {
    this.read = read;
  }

  public FileEntryDtoIntegerAllOfSecurity comment(@javax.annotation.Nullable Boolean comment) {
    
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(@javax.annotation.Nullable Boolean comment) {
    this.comment = comment;
  }

  public FileEntryDtoIntegerAllOfSecurity fillForms(@javax.annotation.Nullable Boolean fillForms) {
    
    this.fillForms = fillForms;
    return this;
  }

  /**
   * Get fillForms
   * @return fillForms
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL_FORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFillForms() {
    return fillForms;
  }


  @JsonProperty(JSON_PROPERTY_FILL_FORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillForms(@javax.annotation.Nullable Boolean fillForms) {
    this.fillForms = fillForms;
  }

  public FileEntryDtoIntegerAllOfSecurity review(@javax.annotation.Nullable Boolean review) {
    
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReview() {
    return review;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReview(@javax.annotation.Nullable Boolean review) {
    this.review = review;
  }

  public FileEntryDtoIntegerAllOfSecurity create(@javax.annotation.Nullable Boolean create) {
    
    this.create = create;
    return this;
  }

  /**
   * Get create
   * @return create
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreate() {
    return create;
  }


  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreate(@javax.annotation.Nullable Boolean create) {
    this.create = create;
  }

  public FileEntryDtoIntegerAllOfSecurity createFrom(@javax.annotation.Nullable Boolean createFrom) {
    
    this.createFrom = createFrom;
    return this;
  }

  /**
   * Get createFrom
   * @return createFrom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateFrom() {
    return createFrom;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateFrom(@javax.annotation.Nullable Boolean createFrom) {
    this.createFrom = createFrom;
  }

  public FileEntryDtoIntegerAllOfSecurity edit(@javax.annotation.Nullable Boolean edit) {
    
    this.edit = edit;
    return this;
  }

  /**
   * Get edit
   * @return edit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEdit() {
    return edit;
  }


  @JsonProperty(JSON_PROPERTY_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdit(@javax.annotation.Nullable Boolean edit) {
    this.edit = edit;
  }

  public FileEntryDtoIntegerAllOfSecurity delete(@javax.annotation.Nullable Boolean delete) {
    
    this.delete = delete;
    return this;
  }

  /**
   * Get delete
   * @return delete
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDelete() {
    return delete;
  }


  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelete(@javax.annotation.Nullable Boolean delete) {
    this.delete = delete;
  }

  public FileEntryDtoIntegerAllOfSecurity customFilter(@javax.annotation.Nullable Boolean customFilter) {
    
    this.customFilter = customFilter;
    return this;
  }

  /**
   * Get customFilter
   * @return customFilter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCustomFilter() {
    return customFilter;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFilter(@javax.annotation.Nullable Boolean customFilter) {
    this.customFilter = customFilter;
  }

  public FileEntryDtoIntegerAllOfSecurity editRoom(@javax.annotation.Nullable Boolean editRoom) {
    
    this.editRoom = editRoom;
    return this;
  }

  /**
   * Get editRoom
   * @return editRoom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditRoom() {
    return editRoom;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditRoom(@javax.annotation.Nullable Boolean editRoom) {
    this.editRoom = editRoom;
  }

  public FileEntryDtoIntegerAllOfSecurity rename(@javax.annotation.Nullable Boolean rename) {
    
    this.rename = rename;
    return this;
  }

  /**
   * Get rename
   * @return rename
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRename() {
    return rename;
  }


  @JsonProperty(JSON_PROPERTY_RENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRename(@javax.annotation.Nullable Boolean rename) {
    this.rename = rename;
  }

  public FileEntryDtoIntegerAllOfSecurity readHistory(@javax.annotation.Nullable Boolean readHistory) {
    
    this.readHistory = readHistory;
    return this;
  }

  /**
   * Get readHistory
   * @return readHistory
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_READ_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReadHistory() {
    return readHistory;
  }


  @JsonProperty(JSON_PROPERTY_READ_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadHistory(@javax.annotation.Nullable Boolean readHistory) {
    this.readHistory = readHistory;
  }

  public FileEntryDtoIntegerAllOfSecurity lock(@javax.annotation.Nullable Boolean lock) {
    
    this.lock = lock;
    return this;
  }

  /**
   * Get lock
   * @return lock
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLock() {
    return lock;
  }


  @JsonProperty(JSON_PROPERTY_LOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLock(@javax.annotation.Nullable Boolean lock) {
    this.lock = lock;
  }

  public FileEntryDtoIntegerAllOfSecurity editHistory(@javax.annotation.Nullable Boolean editHistory) {
    
    this.editHistory = editHistory;
    return this;
  }

  /**
   * Get editHistory
   * @return editHistory
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditHistory() {
    return editHistory;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditHistory(@javax.annotation.Nullable Boolean editHistory) {
    this.editHistory = editHistory;
  }

  public FileEntryDtoIntegerAllOfSecurity copyTo(@javax.annotation.Nullable Boolean copyTo) {
    
    this.copyTo = copyTo;
    return this;
  }

  /**
   * Get copyTo
   * @return copyTo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COPY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopyTo() {
    return copyTo;
  }


  @JsonProperty(JSON_PROPERTY_COPY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopyTo(@javax.annotation.Nullable Boolean copyTo) {
    this.copyTo = copyTo;
  }

  public FileEntryDtoIntegerAllOfSecurity copy(@javax.annotation.Nullable Boolean copy) {
    
    this.copy = copy;
    return this;
  }

  /**
   * Get copy
   * @return copy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COPY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopy() {
    return copy;
  }


  @JsonProperty(JSON_PROPERTY_COPY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopy(@javax.annotation.Nullable Boolean copy) {
    this.copy = copy;
  }

  public FileEntryDtoIntegerAllOfSecurity moveTo(@javax.annotation.Nullable Boolean moveTo) {
    
    this.moveTo = moveTo;
    return this;
  }

  /**
   * Get moveTo
   * @return moveTo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOVE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMoveTo() {
    return moveTo;
  }


  @JsonProperty(JSON_PROPERTY_MOVE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMoveTo(@javax.annotation.Nullable Boolean moveTo) {
    this.moveTo = moveTo;
  }

  public FileEntryDtoIntegerAllOfSecurity move(@javax.annotation.Nullable Boolean move) {
    
    this.move = move;
    return this;
  }

  /**
   * Get move
   * @return move
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMove() {
    return move;
  }


  @JsonProperty(JSON_PROPERTY_MOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMove(@javax.annotation.Nullable Boolean move) {
    this.move = move;
  }

  public FileEntryDtoIntegerAllOfSecurity pin(@javax.annotation.Nullable Boolean pin) {
    
    this.pin = pin;
    return this;
  }

  /**
   * Get pin
   * @return pin
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPin() {
    return pin;
  }


  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPin(@javax.annotation.Nullable Boolean pin) {
    this.pin = pin;
  }

  public FileEntryDtoIntegerAllOfSecurity mute(@javax.annotation.Nullable Boolean mute) {
    
    this.mute = mute;
    return this;
  }

  /**
   * Get mute
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

  public FileEntryDtoIntegerAllOfSecurity editAccess(@javax.annotation.Nullable Boolean editAccess) {
    
    this.editAccess = editAccess;
    return this;
  }

  /**
   * Get editAccess
   * @return editAccess
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditAccess() {
    return editAccess;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditAccess(@javax.annotation.Nullable Boolean editAccess) {
    this.editAccess = editAccess;
  }

  public FileEntryDtoIntegerAllOfSecurity duplicate(@javax.annotation.Nullable Boolean duplicate) {
    
    this.duplicate = duplicate;
    return this;
  }

  /**
   * Get duplicate
   * @return duplicate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUPLICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDuplicate() {
    return duplicate;
  }


  @JsonProperty(JSON_PROPERTY_DUPLICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuplicate(@javax.annotation.Nullable Boolean duplicate) {
    this.duplicate = duplicate;
  }

  public FileEntryDtoIntegerAllOfSecurity submitToFormGallery(@javax.annotation.Nullable Boolean submitToFormGallery) {
    
    this.submitToFormGallery = submitToFormGallery;
    return this;
  }

  /**
   * Get submitToFormGallery
   * @return submitToFormGallery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMIT_TO_FORM_GALLERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubmitToFormGallery() {
    return submitToFormGallery;
  }


  @JsonProperty(JSON_PROPERTY_SUBMIT_TO_FORM_GALLERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitToFormGallery(@javax.annotation.Nullable Boolean submitToFormGallery) {
    this.submitToFormGallery = submitToFormGallery;
  }

  public FileEntryDtoIntegerAllOfSecurity download(@javax.annotation.Nullable Boolean download) {
    
    this.download = download;
    return this;
  }

  /**
   * Get download
   * @return download
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDownload() {
    return download;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownload(@javax.annotation.Nullable Boolean download) {
    this.download = download;
  }

  public FileEntryDtoIntegerAllOfSecurity convert(@javax.annotation.Nullable Boolean convert) {
    
    this.convert = convert;
    return this;
  }

  /**
   * Get convert
   * @return convert
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConvert() {
    return convert;
  }


  @JsonProperty(JSON_PROPERTY_CONVERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvert(@javax.annotation.Nullable Boolean convert) {
    this.convert = convert;
  }

  public FileEntryDtoIntegerAllOfSecurity copySharedLink(@javax.annotation.Nullable Boolean copySharedLink) {
    
    this.copySharedLink = copySharedLink;
    return this;
  }

  /**
   * Get copySharedLink
   * @return copySharedLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COPY_SHARED_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopySharedLink() {
    return copySharedLink;
  }


  @JsonProperty(JSON_PROPERTY_COPY_SHARED_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopySharedLink(@javax.annotation.Nullable Boolean copySharedLink) {
    this.copySharedLink = copySharedLink;
  }

  public FileEntryDtoIntegerAllOfSecurity readLinks(@javax.annotation.Nullable Boolean readLinks) {
    
    this.readLinks = readLinks;
    return this;
  }

  /**
   * Get readLinks
   * @return readLinks
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_READ_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReadLinks() {
    return readLinks;
  }


  @JsonProperty(JSON_PROPERTY_READ_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadLinks(@javax.annotation.Nullable Boolean readLinks) {
    this.readLinks = readLinks;
  }

  public FileEntryDtoIntegerAllOfSecurity reconnect(@javax.annotation.Nullable Boolean reconnect) {
    
    this.reconnect = reconnect;
    return this;
  }

  /**
   * Get reconnect
   * @return reconnect
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECONNECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReconnect() {
    return reconnect;
  }


  @JsonProperty(JSON_PROPERTY_RECONNECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReconnect(@javax.annotation.Nullable Boolean reconnect) {
    this.reconnect = reconnect;
  }

  public FileEntryDtoIntegerAllOfSecurity createRoomFrom(@javax.annotation.Nullable Boolean createRoomFrom) {
    
    this.createRoomFrom = createRoomFrom;
    return this;
  }

  /**
   * Get createRoomFrom
   * @return createRoomFrom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_ROOM_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateRoomFrom() {
    return createRoomFrom;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_ROOM_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateRoomFrom(@javax.annotation.Nullable Boolean createRoomFrom) {
    this.createRoomFrom = createRoomFrom;
  }

  public FileEntryDtoIntegerAllOfSecurity copyLink(@javax.annotation.Nullable Boolean copyLink) {
    
    this.copyLink = copyLink;
    return this;
  }

  /**
   * Get copyLink
   * @return copyLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COPY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopyLink() {
    return copyLink;
  }


  @JsonProperty(JSON_PROPERTY_COPY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopyLink(@javax.annotation.Nullable Boolean copyLink) {
    this.copyLink = copyLink;
  }

  public FileEntryDtoIntegerAllOfSecurity embed(@javax.annotation.Nullable Boolean embed) {
    
    this.embed = embed;
    return this;
  }

  /**
   * Get embed
   * @return embed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmbed() {
    return embed;
  }


  @JsonProperty(JSON_PROPERTY_EMBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmbed(@javax.annotation.Nullable Boolean embed) {
    this.embed = embed;
  }

  public FileEntryDtoIntegerAllOfSecurity changeOwner(@javax.annotation.Nullable Boolean changeOwner) {
    
    this.changeOwner = changeOwner;
    return this;
  }

  /**
   * Get changeOwner
   * @return changeOwner
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getChangeOwner() {
    return changeOwner;
  }


  @JsonProperty(JSON_PROPERTY_CHANGE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeOwner(@javax.annotation.Nullable Boolean changeOwner) {
    this.changeOwner = changeOwner;
  }

  public FileEntryDtoIntegerAllOfSecurity indexExport(@javax.annotation.Nullable Boolean indexExport) {
    
    this.indexExport = indexExport;
    return this;
  }

  /**
   * Get indexExport
   * @return indexExport
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX_EXPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIndexExport() {
    return indexExport;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_EXPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexExport(@javax.annotation.Nullable Boolean indexExport) {
    this.indexExport = indexExport;
  }

  public FileEntryDtoIntegerAllOfSecurity startFilling(@javax.annotation.Nullable Boolean startFilling) {
    
    this.startFilling = startFilling;
    return this;
  }

  /**
   * Get startFilling
   * @return startFilling
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_FILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStartFilling() {
    return startFilling;
  }


  @JsonProperty(JSON_PROPERTY_START_FILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartFilling(@javax.annotation.Nullable Boolean startFilling) {
    this.startFilling = startFilling;
  }

  public FileEntryDtoIntegerAllOfSecurity fillingStatus(@javax.annotation.Nullable Boolean fillingStatus) {
    
    this.fillingStatus = fillingStatus;
    return this;
  }

  /**
   * Get fillingStatus
   * @return fillingStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILLING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFillingStatus() {
    return fillingStatus;
  }


  @JsonProperty(JSON_PROPERTY_FILLING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillingStatus(@javax.annotation.Nullable Boolean fillingStatus) {
    this.fillingStatus = fillingStatus;
  }

  public FileEntryDtoIntegerAllOfSecurity resetFilling(@javax.annotation.Nullable Boolean resetFilling) {
    
    this.resetFilling = resetFilling;
    return this;
  }

  /**
   * Get resetFilling
   * @return resetFilling
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESET_FILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResetFilling() {
    return resetFilling;
  }


  @JsonProperty(JSON_PROPERTY_RESET_FILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResetFilling(@javax.annotation.Nullable Boolean resetFilling) {
    this.resetFilling = resetFilling;
  }

  public FileEntryDtoIntegerAllOfSecurity stopFilling(@javax.annotation.Nullable Boolean stopFilling) {
    
    this.stopFilling = stopFilling;
    return this;
  }

  /**
   * Get stopFilling
   * @return stopFilling
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STOP_FILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStopFilling() {
    return stopFilling;
  }


  @JsonProperty(JSON_PROPERTY_STOP_FILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStopFilling(@javax.annotation.Nullable Boolean stopFilling) {
    this.stopFilling = stopFilling;
  }

  public FileEntryDtoIntegerAllOfSecurity openForm(@javax.annotation.Nullable Boolean openForm) {
    
    this.openForm = openForm;
    return this;
  }

  /**
   * Get openForm
   * @return openForm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOpenForm() {
    return openForm;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenForm(@javax.annotation.Nullable Boolean openForm) {
    this.openForm = openForm;
  }

  public FileEntryDtoIntegerAllOfSecurity editInternal(@javax.annotation.Nullable Boolean editInternal) {
    
    this.editInternal = editInternal;
    return this;
  }

  /**
   * Get editInternal
   * @return editInternal
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditInternal() {
    return editInternal;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditInternal(@javax.annotation.Nullable Boolean editInternal) {
    this.editInternal = editInternal;
  }

  public FileEntryDtoIntegerAllOfSecurity editExpiration(@javax.annotation.Nullable Boolean editExpiration) {
    
    this.editExpiration = editExpiration;
    return this;
  }

  /**
   * Get editExpiration
   * @return editExpiration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditExpiration() {
    return editExpiration;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditExpiration(@javax.annotation.Nullable Boolean editExpiration) {
    this.editExpiration = editExpiration;
  }

  public FileEntryDtoIntegerAllOfSecurity vectorization(@javax.annotation.Nullable Boolean vectorization) {
    
    this.vectorization = vectorization;
    return this;
  }

  /**
   * Get vectorization
   * @return vectorization
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VECTORIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVectorization() {
    return vectorization;
  }


  @JsonProperty(JSON_PROPERTY_VECTORIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVectorization(@javax.annotation.Nullable Boolean vectorization) {
    this.vectorization = vectorization;
  }

  public FileEntryDtoIntegerAllOfSecurity ascAi(@javax.annotation.Nullable Boolean ascAi) {
    
    this.ascAi = ascAi;
    return this;
  }

  /**
   * Get ascAi
   * @return ascAi
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASC_AI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAscAi() {
    return ascAi;
  }


  @JsonProperty(JSON_PROPERTY_ASC_AI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAscAi(@javax.annotation.Nullable Boolean ascAi) {
    this.ascAi = ascAi;
  }

  public FileEntryDtoIntegerAllOfSecurity useChat(@javax.annotation.Nullable Boolean useChat) {
    
    this.useChat = useChat;
    return this;
  }

  /**
   * Get useChat
   * @return useChat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_CHAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseChat() {
    return useChat;
  }


  @JsonProperty(JSON_PROPERTY_USE_CHAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseChat(@javax.annotation.Nullable Boolean useChat) {
    this.useChat = useChat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileEntryDtoIntegerAllOfSecurity fileEntryDtoIntegerAllOfSecurity = (FileEntryDtoIntegerAllOfSecurity) o;
    return Objects.equals(this.read, fileEntryDtoIntegerAllOfSecurity.read) &&
        Objects.equals(this.comment, fileEntryDtoIntegerAllOfSecurity.comment) &&
        Objects.equals(this.fillForms, fileEntryDtoIntegerAllOfSecurity.fillForms) &&
        Objects.equals(this.review, fileEntryDtoIntegerAllOfSecurity.review) &&
        Objects.equals(this.create, fileEntryDtoIntegerAllOfSecurity.create) &&
        Objects.equals(this.createFrom, fileEntryDtoIntegerAllOfSecurity.createFrom) &&
        Objects.equals(this.edit, fileEntryDtoIntegerAllOfSecurity.edit) &&
        Objects.equals(this.delete, fileEntryDtoIntegerAllOfSecurity.delete) &&
        Objects.equals(this.customFilter, fileEntryDtoIntegerAllOfSecurity.customFilter) &&
        Objects.equals(this.editRoom, fileEntryDtoIntegerAllOfSecurity.editRoom) &&
        Objects.equals(this.rename, fileEntryDtoIntegerAllOfSecurity.rename) &&
        Objects.equals(this.readHistory, fileEntryDtoIntegerAllOfSecurity.readHistory) &&
        Objects.equals(this.lock, fileEntryDtoIntegerAllOfSecurity.lock) &&
        Objects.equals(this.editHistory, fileEntryDtoIntegerAllOfSecurity.editHistory) &&
        Objects.equals(this.copyTo, fileEntryDtoIntegerAllOfSecurity.copyTo) &&
        Objects.equals(this.copy, fileEntryDtoIntegerAllOfSecurity.copy) &&
        Objects.equals(this.moveTo, fileEntryDtoIntegerAllOfSecurity.moveTo) &&
        Objects.equals(this.move, fileEntryDtoIntegerAllOfSecurity.move) &&
        Objects.equals(this.pin, fileEntryDtoIntegerAllOfSecurity.pin) &&
        Objects.equals(this.mute, fileEntryDtoIntegerAllOfSecurity.mute) &&
        Objects.equals(this.editAccess, fileEntryDtoIntegerAllOfSecurity.editAccess) &&
        Objects.equals(this.duplicate, fileEntryDtoIntegerAllOfSecurity.duplicate) &&
        Objects.equals(this.submitToFormGallery, fileEntryDtoIntegerAllOfSecurity.submitToFormGallery) &&
        Objects.equals(this.download, fileEntryDtoIntegerAllOfSecurity.download) &&
        Objects.equals(this.convert, fileEntryDtoIntegerAllOfSecurity.convert) &&
        Objects.equals(this.copySharedLink, fileEntryDtoIntegerAllOfSecurity.copySharedLink) &&
        Objects.equals(this.readLinks, fileEntryDtoIntegerAllOfSecurity.readLinks) &&
        Objects.equals(this.reconnect, fileEntryDtoIntegerAllOfSecurity.reconnect) &&
        Objects.equals(this.createRoomFrom, fileEntryDtoIntegerAllOfSecurity.createRoomFrom) &&
        Objects.equals(this.copyLink, fileEntryDtoIntegerAllOfSecurity.copyLink) &&
        Objects.equals(this.embed, fileEntryDtoIntegerAllOfSecurity.embed) &&
        Objects.equals(this.changeOwner, fileEntryDtoIntegerAllOfSecurity.changeOwner) &&
        Objects.equals(this.indexExport, fileEntryDtoIntegerAllOfSecurity.indexExport) &&
        Objects.equals(this.startFilling, fileEntryDtoIntegerAllOfSecurity.startFilling) &&
        Objects.equals(this.fillingStatus, fileEntryDtoIntegerAllOfSecurity.fillingStatus) &&
        Objects.equals(this.resetFilling, fileEntryDtoIntegerAllOfSecurity.resetFilling) &&
        Objects.equals(this.stopFilling, fileEntryDtoIntegerAllOfSecurity.stopFilling) &&
        Objects.equals(this.openForm, fileEntryDtoIntegerAllOfSecurity.openForm) &&
        Objects.equals(this.editInternal, fileEntryDtoIntegerAllOfSecurity.editInternal) &&
        Objects.equals(this.editExpiration, fileEntryDtoIntegerAllOfSecurity.editExpiration) &&
        Objects.equals(this.vectorization, fileEntryDtoIntegerAllOfSecurity.vectorization) &&
        Objects.equals(this.ascAi, fileEntryDtoIntegerAllOfSecurity.ascAi) &&
        Objects.equals(this.useChat, fileEntryDtoIntegerAllOfSecurity.useChat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, comment, fillForms, review, create, createFrom, edit, delete, customFilter, editRoom, rename, readHistory, lock, editHistory, copyTo, copy, moveTo, move, pin, mute, editAccess, duplicate, submitToFormGallery, download, convert, copySharedLink, readLinks, reconnect, createRoomFrom, copyLink, embed, changeOwner, indexExport, startFilling, fillingStatus, resetFilling, stopFilling, openForm, editInternal, editExpiration, vectorization, ascAi, useChat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileEntryDtoIntegerAllOfSecurity {\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    fillForms: ").append(toIndentedString(fillForms)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    createFrom: ").append(toIndentedString(createFrom)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    customFilter: ").append(toIndentedString(customFilter)).append("\n");
    sb.append("    editRoom: ").append(toIndentedString(editRoom)).append("\n");
    sb.append("    rename: ").append(toIndentedString(rename)).append("\n");
    sb.append("    readHistory: ").append(toIndentedString(readHistory)).append("\n");
    sb.append("    lock: ").append(toIndentedString(lock)).append("\n");
    sb.append("    editHistory: ").append(toIndentedString(editHistory)).append("\n");
    sb.append("    copyTo: ").append(toIndentedString(copyTo)).append("\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
    sb.append("    moveTo: ").append(toIndentedString(moveTo)).append("\n");
    sb.append("    move: ").append(toIndentedString(move)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    editAccess: ").append(toIndentedString(editAccess)).append("\n");
    sb.append("    duplicate: ").append(toIndentedString(duplicate)).append("\n");
    sb.append("    submitToFormGallery: ").append(toIndentedString(submitToFormGallery)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    copySharedLink: ").append(toIndentedString(copySharedLink)).append("\n");
    sb.append("    readLinks: ").append(toIndentedString(readLinks)).append("\n");
    sb.append("    reconnect: ").append(toIndentedString(reconnect)).append("\n");
    sb.append("    createRoomFrom: ").append(toIndentedString(createRoomFrom)).append("\n");
    sb.append("    copyLink: ").append(toIndentedString(copyLink)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    changeOwner: ").append(toIndentedString(changeOwner)).append("\n");
    sb.append("    indexExport: ").append(toIndentedString(indexExport)).append("\n");
    sb.append("    startFilling: ").append(toIndentedString(startFilling)).append("\n");
    sb.append("    fillingStatus: ").append(toIndentedString(fillingStatus)).append("\n");
    sb.append("    resetFilling: ").append(toIndentedString(resetFilling)).append("\n");
    sb.append("    stopFilling: ").append(toIndentedString(stopFilling)).append("\n");
    sb.append("    openForm: ").append(toIndentedString(openForm)).append("\n");
    sb.append("    editInternal: ").append(toIndentedString(editInternal)).append("\n");
    sb.append("    editExpiration: ").append(toIndentedString(editExpiration)).append("\n");
    sb.append("    vectorization: ").append(toIndentedString(vectorization)).append("\n");
    sb.append("    ascAi: ").append(toIndentedString(ascAi)).append("\n");
    sb.append("    useChat: ").append(toIndentedString(useChat)).append("\n");
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

    // add `Read` to the URL query string
    if (getRead() != null) {
      try {
        joiner.add(String.format("%sRead%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRead()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Comment` to the URL query string
    if (getComment() != null) {
      try {
        joiner.add(String.format("%sComment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `FillForms` to the URL query string
    if (getFillForms() != null) {
      try {
        joiner.add(String.format("%sFillForms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFillForms()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Review` to the URL query string
    if (getReview() != null) {
      try {
        joiner.add(String.format("%sReview%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReview()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Create` to the URL query string
    if (getCreate() != null) {
      try {
        joiner.add(String.format("%sCreate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `CreateFrom` to the URL query string
    if (getCreateFrom() != null) {
      try {
        joiner.add(String.format("%sCreateFrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateFrom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Edit` to the URL query string
    if (getEdit() != null) {
      try {
        joiner.add(String.format("%sEdit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEdit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Delete` to the URL query string
    if (getDelete() != null) {
      try {
        joiner.add(String.format("%sDelete%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelete()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `CustomFilter` to the URL query string
    if (getCustomFilter() != null) {
      try {
        joiner.add(String.format("%sCustomFilter%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomFilter()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `EditRoom` to the URL query string
    if (getEditRoom() != null) {
      try {
        joiner.add(String.format("%sEditRoom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditRoom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Rename` to the URL query string
    if (getRename() != null) {
      try {
        joiner.add(String.format("%sRename%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRename()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ReadHistory` to the URL query string
    if (getReadHistory() != null) {
      try {
        joiner.add(String.format("%sReadHistory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReadHistory()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Lock` to the URL query string
    if (getLock() != null) {
      try {
        joiner.add(String.format("%sLock%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLock()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `EditHistory` to the URL query string
    if (getEditHistory() != null) {
      try {
        joiner.add(String.format("%sEditHistory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditHistory()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `CopyTo` to the URL query string
    if (getCopyTo() != null) {
      try {
        joiner.add(String.format("%sCopyTo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCopyTo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Copy` to the URL query string
    if (getCopy() != null) {
      try {
        joiner.add(String.format("%sCopy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCopy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `MoveTo` to the URL query string
    if (getMoveTo() != null) {
      try {
        joiner.add(String.format("%sMoveTo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMoveTo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Move` to the URL query string
    if (getMove() != null) {
      try {
        joiner.add(String.format("%sMove%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMove()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Pin` to the URL query string
    if (getPin() != null) {
      try {
        joiner.add(String.format("%sPin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Mute` to the URL query string
    if (getMute() != null) {
      try {
        joiner.add(String.format("%sMute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMute()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `EditAccess` to the URL query string
    if (getEditAccess() != null) {
      try {
        joiner.add(String.format("%sEditAccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Duplicate` to the URL query string
    if (getDuplicate() != null) {
      try {
        joiner.add(String.format("%sDuplicate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDuplicate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `SubmitToFormGallery` to the URL query string
    if (getSubmitToFormGallery() != null) {
      try {
        joiner.add(String.format("%sSubmitToFormGallery%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubmitToFormGallery()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Download` to the URL query string
    if (getDownload() != null) {
      try {
        joiner.add(String.format("%sDownload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDownload()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Convert` to the URL query string
    if (getConvert() != null) {
      try {
        joiner.add(String.format("%sConvert%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConvert()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `CopySharedLink` to the URL query string
    if (getCopySharedLink() != null) {
      try {
        joiner.add(String.format("%sCopySharedLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCopySharedLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ReadLinks` to the URL query string
    if (getReadLinks() != null) {
      try {
        joiner.add(String.format("%sReadLinks%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReadLinks()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Reconnect` to the URL query string
    if (getReconnect() != null) {
      try {
        joiner.add(String.format("%sReconnect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReconnect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `CreateRoomFrom` to the URL query string
    if (getCreateRoomFrom() != null) {
      try {
        joiner.add(String.format("%sCreateRoomFrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateRoomFrom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `CopyLink` to the URL query string
    if (getCopyLink() != null) {
      try {
        joiner.add(String.format("%sCopyLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCopyLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Embed` to the URL query string
    if (getEmbed() != null) {
      try {
        joiner.add(String.format("%sEmbed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmbed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ChangeOwner` to the URL query string
    if (getChangeOwner() != null) {
      try {
        joiner.add(String.format("%sChangeOwner%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChangeOwner()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `IndexExport` to the URL query string
    if (getIndexExport() != null) {
      try {
        joiner.add(String.format("%sIndexExport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndexExport()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `StartFilling` to the URL query string
    if (getStartFilling() != null) {
      try {
        joiner.add(String.format("%sStartFilling%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartFilling()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `FillingStatus` to the URL query string
    if (getFillingStatus() != null) {
      try {
        joiner.add(String.format("%sFillingStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFillingStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ResetFilling` to the URL query string
    if (getResetFilling() != null) {
      try {
        joiner.add(String.format("%sResetFilling%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResetFilling()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `StopFilling` to the URL query string
    if (getStopFilling() != null) {
      try {
        joiner.add(String.format("%sStopFilling%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStopFilling()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `OpenForm` to the URL query string
    if (getOpenForm() != null) {
      try {
        joiner.add(String.format("%sOpenForm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpenForm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `EditInternal` to the URL query string
    if (getEditInternal() != null) {
      try {
        joiner.add(String.format("%sEditInternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditInternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `EditExpiration` to the URL query string
    if (getEditExpiration() != null) {
      try {
        joiner.add(String.format("%sEditExpiration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditExpiration()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Vectorization` to the URL query string
    if (getVectorization() != null) {
      try {
        joiner.add(String.format("%sVectorization%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVectorization()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `AscAi` to the URL query string
    if (getAscAi() != null) {
      try {
        joiner.add(String.format("%sAscAi%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAscAi()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `UseChat` to the URL query string
    if (getUseChat() != null) {
      try {
        joiner.add(String.format("%sUseChat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUseChat()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

