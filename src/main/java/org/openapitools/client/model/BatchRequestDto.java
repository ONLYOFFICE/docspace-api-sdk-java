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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BatchRequestDtoAllOfDestFolderId;
import org.openapitools.client.model.BatchRequestDtoAllOfFileIds;
import org.openapitools.client.model.BatchRequestDtoAllOfFolderIds;
import org.openapitools.client.model.FileConflictResolveType;
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
 * The files and folders to move or copy, the folder they go to, and the way name clashes are settled.
 */
@JsonPropertyOrder({
  BatchRequestDto.JSON_PROPERTY_RETURN_SINGLE_OPERATION,
  BatchRequestDto.JSON_PROPERTY_FOLDER_IDS,
  BatchRequestDto.JSON_PROPERTY_FILE_IDS,
  BatchRequestDto.JSON_PROPERTY_DEST_FOLDER_ID,
  BatchRequestDto.JSON_PROPERTY_CONFLICT_RESOLVE_TYPE,
  BatchRequestDto.JSON_PROPERTY_DELETE_AFTER,
  BatchRequestDto.JSON_PROPERTY_CONTENT,
  BatchRequestDto.JSON_PROPERTY_TO_FILL_OUT
})

public class BatchRequestDto {
  public static final String JSON_PROPERTY_RETURN_SINGLE_OPERATION = "returnSingleOperation";
  @javax.annotation.Nullable  private Boolean returnSingleOperation;

  public static final String JSON_PROPERTY_FOLDER_IDS = "folderIds";
  @javax.annotation.Nullable  private JsonNullable<List<BatchRequestDtoAllOfFolderIds>> folderIds = JsonNullable.<List<BatchRequestDtoAllOfFolderIds>>undefined();

  public static final String JSON_PROPERTY_FILE_IDS = "fileIds";
  @javax.annotation.Nullable  private JsonNullable<List<BatchRequestDtoAllOfFileIds>> fileIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_DEST_FOLDER_ID = "destFolderId";
  @javax.annotation.Nullable  private BatchRequestDtoAllOfDestFolderId destFolderId;

  public static final String JSON_PROPERTY_CONFLICT_RESOLVE_TYPE = "conflictResolveType";
  @javax.annotation.Nullable  private FileConflictResolveType conflictResolveType;

  public static final String JSON_PROPERTY_DELETE_AFTER = "deleteAfter";
  @javax.annotation.Nullable  private Boolean deleteAfter;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable  private Boolean content;

  public static final String JSON_PROPERTY_TO_FILL_OUT = "toFillOut";
  @javax.annotation.Nullable  private Boolean toFillOut;

  public BatchRequestDto() {
  }


  public BatchRequestDto returnSingleOperation(@javax.annotation.Nullable Boolean returnSingleOperation) {
    
    this.returnSingleOperation = returnSingleOperation;
    return this;
  }

  /**
   * Which operations the answer carries: `true` returns the operation this call started and nothing else, `false`  returns every operation of the same kind that the caller has running or unread. When nothing was queued, which  happens for an empty selection, `true` falls back to the full list.
   * @return returnSingleOperation
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RETURN_SINGLE_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReturnSingleOperation() {
    return returnSingleOperation;
  }


  @JsonProperty(value = JSON_PROPERTY_RETURN_SINGLE_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnSingleOperation(@javax.annotation.Nullable Boolean returnSingleOperation) {
    this.returnSingleOperation = returnSingleOperation;
  }

  public BatchRequestDto folderIds(@javax.annotation.Nullable List<BatchRequestDtoAllOfFolderIds> folderIds) {
    this.folderIds = JsonNullable.<List<BatchRequestDtoAllOfFolderIds>>of(folderIds);
    
    return this;
  }

  public BatchRequestDto addFolderIdsItem(BatchRequestDtoAllOfFolderIds folderIdsItem) {
    if (this.folderIds == null || !this.folderIds.isPresent()) {
      this.folderIds = JsonNullable.<List<BatchRequestDtoAllOfFolderIds>>of(new ArrayList<>());
    }
    try {
      this.folderIds.get().add(folderIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The folders to move or copy, by id. A number addresses a folder stored in the portal itself, a string  addresses a folder on a connected third-party account, and both kinds may be sent in one list.
   * @return folderIds
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<BatchRequestDtoAllOfFolderIds> getFolderIds() {
        return folderIds.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FOLDER_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<BatchRequestDtoAllOfFolderIds>> getFolderIds_JsonNullable() {
    return folderIds;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_IDS)
  public void setFolderIds_JsonNullable(JsonNullable<List<BatchRequestDtoAllOfFolderIds>> folderIds) {
    this.folderIds = folderIds;
  }

  public void setFolderIds(@javax.annotation.Nullable List<BatchRequestDtoAllOfFolderIds> folderIds) {
    this.folderIds = JsonNullable.<List<BatchRequestDtoAllOfFolderIds>>of(folderIds);
  }

  public BatchRequestDto fileIds(@javax.annotation.Nullable List<BatchRequestDtoAllOfFileIds> fileIds) {
    this.fileIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>of(fileIds);
    
    return this;
  }

  public BatchRequestDto addFileIdsItem(BatchRequestDtoAllOfFileIds fileIdsItem) {
    if (this.fileIds == null || !this.fileIds.isPresent()) {
      this.fileIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>of(new ArrayList<>());
    }
    try {
      this.fileIds.get().add(fileIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The files to move or copy, by id. A number addresses a file stored in the portal itself, a string addresses a  file on a connected third-party account, and both kinds may be sent in one list.
   * @return fileIds
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<BatchRequestDtoAllOfFileIds> getFileIds() {
        return fileIds.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<BatchRequestDtoAllOfFileIds>> getFileIds_JsonNullable() {
    return fileIds;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_IDS)
  public void setFileIds_JsonNullable(JsonNullable<List<BatchRequestDtoAllOfFileIds>> fileIds) {
    this.fileIds = fileIds;
  }

  public void setFileIds(@javax.annotation.Nullable List<BatchRequestDtoAllOfFileIds> fileIds) {
    this.fileIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>of(fileIds);
  }

  public BatchRequestDto destFolderId(@javax.annotation.Nullable BatchRequestDtoAllOfDestFolderId destFolderId) {
    
    this.destFolderId = destFolderId;
    return this;
  }

  /**
   * Get destFolderId
   * @return destFolderId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEST_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BatchRequestDtoAllOfDestFolderId getDestFolderId() {
    return destFolderId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEST_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestFolderId(@javax.annotation.Nullable BatchRequestDtoAllOfDestFolderId destFolderId) {
    this.destFolderId = destFolderId;
  }

  public BatchRequestDto conflictResolveType(@javax.annotation.Nullable FileConflictResolveType conflictResolveType) {
    
    this.conflictResolveType = conflictResolveType;
    return this;
  }

  /**
   * What happens to an item whose name is already taken in the destination folder: `skip` leaves it where it is,  `overwrite` replaces the entry at the destination, and `duplicate` places it beside that entry under a name  with a numeric suffix. `GET api/2.0/files/fileops/move` reports which items would clash.
   * @return conflictResolveType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONFLICT_RESOLVE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileConflictResolveType getConflictResolveType() {
    return conflictResolveType;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFLICT_RESOLVE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConflictResolveType(@javax.annotation.Nullable FileConflictResolveType conflictResolveType) {
    this.conflictResolveType = conflictResolveType;
  }

  public BatchRequestDto deleteAfter(@javax.annotation.Nullable Boolean deleteAfter) {
    
    this.deleteAfter = deleteAfter;
    return this;
  }

  /**
   * Whether the finished operation is still reported: `false` keeps its final record readable through  `GET api/2.0/files/fileops` until it has been read once, `true` drops the record as soon as the work is done.  It deletes nothing: a move takes the sources away in any case, and a copy always leaves them.
   * @return deleteAfter
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DELETE_AFTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleteAfter() {
    return deleteAfter;
  }


  @JsonProperty(value = JSON_PROPERTY_DELETE_AFTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteAfter(@javax.annotation.Nullable Boolean deleteAfter) {
    this.deleteAfter = deleteAfter;
  }

  public BatchRequestDto content(@javax.annotation.Nullable Boolean content) {
    
    this.content = content;
    return this;
  }

  /**
   * What is taken from a listed folder: `false` moves or copies the folder itself, `true` takes only what it  contains, so its files and subfolders land in the destination and the folder is not recreated there.
   * @return content
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContent() {
    return content;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(@javax.annotation.Nullable Boolean content) {
    this.content = content;
  }

  public BatchRequestDto toFillOut(@javax.annotation.Nullable Boolean toFillOut) {
    
    this.toFillOut = toFillOut;
    return this;
  }

  /**
   * Marks every copied PDF form as a draft prepared for filling, which is how such a copy reports its filling  status in a virtual data room. Files that are not forms are left unaffected.
   * @return toFillOut
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TO_FILL_OUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getToFillOut() {
    return toFillOut;
  }


  @JsonProperty(value = JSON_PROPERTY_TO_FILL_OUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToFillOut(@javax.annotation.Nullable Boolean toFillOut) {
    this.toFillOut = toFillOut;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestDto batchRequestDto = (BatchRequestDto) o;
    return Objects.equals(this.returnSingleOperation, batchRequestDto.returnSingleOperation) &&
        equalsNullable(this.folderIds, batchRequestDto.folderIds) &&
        equalsNullable(this.fileIds, batchRequestDto.fileIds) &&
        Objects.equals(this.destFolderId, batchRequestDto.destFolderId) &&
        Objects.equals(this.conflictResolveType, batchRequestDto.conflictResolveType) &&
        Objects.equals(this.deleteAfter, batchRequestDto.deleteAfter) &&
        Objects.equals(this.content, batchRequestDto.content) &&
        Objects.equals(this.toFillOut, batchRequestDto.toFillOut);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnSingleOperation, hashCodeNullable(folderIds), hashCodeNullable(fileIds), destFolderId, conflictResolveType, deleteAfter, content, toFillOut);
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
    sb.append("class BatchRequestDto {\n");
    sb.append("    returnSingleOperation: ").append(toIndentedString(returnSingleOperation)).append("\n");
    sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    destFolderId: ").append(toIndentedString(destFolderId)).append("\n");
    sb.append("    conflictResolveType: ").append(toIndentedString(conflictResolveType)).append("\n");
    sb.append("    deleteAfter: ").append(toIndentedString(deleteAfter)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    toFillOut: ").append(toIndentedString(toFillOut)).append("\n");
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

    // add `returnSingleOperation` to the URL query string
    if (getReturnSingleOperation() != null) {
      try {
        joiner.add(String.format("%sreturnSingleOperation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReturnSingleOperation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folderIds` to the URL query string
    if (getFolderIds() != null) {
      for (int i = 0; i < getFolderIds().size(); i++) {
        if (getFolderIds().get(i) != null) {
          joiner.add(getFolderIds().get(i).toUrlQueryString(String.format("%sfolderIds%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `fileIds` to the URL query string
    if (getFileIds() != null) {
      for (int i = 0; i < getFileIds().size(); i++) {
        if (getFileIds().get(i) != null) {
          joiner.add(getFileIds().get(i).toUrlQueryString(String.format("%sfileIds%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `destFolderId` to the URL query string
    if (getDestFolderId() != null) {
      joiner.add(getDestFolderId().toUrlQueryString(prefix + "destFolderId" + suffix));
    }

    // add `conflictResolveType` to the URL query string
    if (getConflictResolveType() != null) {
      try {
        joiner.add(String.format("%sconflictResolveType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConflictResolveType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deleteAfter` to the URL query string
    if (getDeleteAfter() != null) {
      try {
        joiner.add(String.format("%sdeleteAfter%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeleteAfter()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      try {
        joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `toFillOut` to the URL query string
    if (getToFillOut() != null) {
      try {
        joiner.add(String.format("%stoFillOut%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToFillOut()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

