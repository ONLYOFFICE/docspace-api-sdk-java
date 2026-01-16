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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.DownloadRequestDtoAllOfFileIds;
import org.openapitools.client.model.DownloadRequestDtoAllOfFolderIds;
import org.openapitools.client.model.DownloadRequestItemDto;
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
 * The request parameters for downloading files.
 */
@JsonPropertyOrder({
  DownloadRequestDto.JSON_PROPERTY_RETURN_SINGLE_OPERATION,
  DownloadRequestDto.JSON_PROPERTY_FOLDER_IDS,
  DownloadRequestDto.JSON_PROPERTY_FILE_IDS,
  DownloadRequestDto.JSON_PROPERTY_FILE_CONVERT_IDS
})

public class DownloadRequestDto {
  public static final String JSON_PROPERTY_RETURN_SINGLE_OPERATION = "returnSingleOperation";
  @javax.annotation.Nullable
  private Boolean returnSingleOperation;

  public static final String JSON_PROPERTY_FOLDER_IDS = "folderIds";
  @javax.annotation.Nullable
  private JsonNullable<List<DownloadRequestDtoAllOfFolderIds>> folderIds = JsonNullable.<List<DownloadRequestDtoAllOfFolderIds>>undefined();

  public static final String JSON_PROPERTY_FILE_IDS = "fileIds";
  @javax.annotation.Nullable
  private JsonNullable<List<DownloadRequestDtoAllOfFileIds>> fileIds = JsonNullable.<List<DownloadRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_FILE_CONVERT_IDS = "fileConvertIds";
  @javax.annotation.Nullable
  private JsonNullable<List<DownloadRequestItemDto>> fileConvertIds = JsonNullable.<List<DownloadRequestItemDto>>undefined();

  public DownloadRequestDto() {
  }


  public DownloadRequestDto returnSingleOperation(@javax.annotation.Nullable Boolean returnSingleOperation) {
    
    this.returnSingleOperation = returnSingleOperation;
    return this;
  }

  /**
   * Specifies whether to return only the current operation
   * @return returnSingleOperation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_SINGLE_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReturnSingleOperation() {
    return returnSingleOperation;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_SINGLE_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnSingleOperation(@javax.annotation.Nullable Boolean returnSingleOperation) {
    this.returnSingleOperation = returnSingleOperation;
  }

  public DownloadRequestDto folderIds(@javax.annotation.Nullable List<DownloadRequestDtoAllOfFolderIds> folderIds) {
    this.folderIds = JsonNullable.<List<DownloadRequestDtoAllOfFolderIds>>of(folderIds);
    
    return this;
  }

  public DownloadRequestDto addFolderIdsItem(DownloadRequestDtoAllOfFolderIds folderIdsItem) {
    if (this.folderIds == null || !this.folderIds.isPresent()) {
      this.folderIds = JsonNullable.<List<DownloadRequestDtoAllOfFolderIds>>of(new ArrayList<>());
    }
    try {
      this.folderIds.get().add(folderIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of folder IDs to be downloaded.
   * @return folderIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<DownloadRequestDtoAllOfFolderIds> getFolderIds() {
        return folderIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FOLDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DownloadRequestDtoAllOfFolderIds>> getFolderIds_JsonNullable() {
    return folderIds;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_IDS)
  public void setFolderIds_JsonNullable(JsonNullable<List<DownloadRequestDtoAllOfFolderIds>> folderIds) {
    this.folderIds = folderIds;
  }

  public void setFolderIds(@javax.annotation.Nullable List<DownloadRequestDtoAllOfFolderIds> folderIds) {
    this.folderIds = JsonNullable.<List<DownloadRequestDtoAllOfFolderIds>>of(folderIds);
  }

  public DownloadRequestDto fileIds(@javax.annotation.Nullable List<DownloadRequestDtoAllOfFileIds> fileIds) {
    this.fileIds = JsonNullable.<List<DownloadRequestDtoAllOfFileIds>>of(fileIds);
    
    return this;
  }

  public DownloadRequestDto addFileIdsItem(DownloadRequestDtoAllOfFileIds fileIdsItem) {
    if (this.fileIds == null || !this.fileIds.isPresent()) {
      this.fileIds = JsonNullable.<List<DownloadRequestDtoAllOfFileIds>>of(new ArrayList<>());
    }
    try {
      this.fileIds.get().add(fileIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of file IDs to be downloaded.
   * @return fileIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<DownloadRequestDtoAllOfFileIds> getFileIds() {
        return fileIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DownloadRequestDtoAllOfFileIds>> getFileIds_JsonNullable() {
    return fileIds;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_IDS)
  public void setFileIds_JsonNullable(JsonNullable<List<DownloadRequestDtoAllOfFileIds>> fileIds) {
    this.fileIds = fileIds;
  }

  public void setFileIds(@javax.annotation.Nullable List<DownloadRequestDtoAllOfFileIds> fileIds) {
    this.fileIds = JsonNullable.<List<DownloadRequestDtoAllOfFileIds>>of(fileIds);
  }

  public DownloadRequestDto fileConvertIds(@javax.annotation.Nullable List<DownloadRequestItemDto> fileConvertIds) {
    this.fileConvertIds = JsonNullable.<List<DownloadRequestItemDto>>of(fileConvertIds);
    
    return this;
  }

  public DownloadRequestDto addFileConvertIdsItem(DownloadRequestItemDto fileConvertIdsItem) {
    if (this.fileConvertIds == null || !this.fileConvertIds.isPresent()) {
      this.fileConvertIds = JsonNullable.<List<DownloadRequestItemDto>>of(new ArrayList<>());
    }
    try {
      this.fileConvertIds.get().add(fileConvertIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of file IDs which will be converted.
   * @return fileConvertIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<DownloadRequestItemDto> getFileConvertIds() {
        return fileConvertIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_CONVERT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DownloadRequestItemDto>> getFileConvertIds_JsonNullable() {
    return fileConvertIds;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_CONVERT_IDS)
  public void setFileConvertIds_JsonNullable(JsonNullable<List<DownloadRequestItemDto>> fileConvertIds) {
    this.fileConvertIds = fileConvertIds;
  }

  public void setFileConvertIds(@javax.annotation.Nullable List<DownloadRequestItemDto> fileConvertIds) {
    this.fileConvertIds = JsonNullable.<List<DownloadRequestItemDto>>of(fileConvertIds);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadRequestDto downloadRequestDto = (DownloadRequestDto) o;
    return Objects.equals(this.returnSingleOperation, downloadRequestDto.returnSingleOperation) &&
        equalsNullable(this.folderIds, downloadRequestDto.folderIds) &&
        equalsNullable(this.fileIds, downloadRequestDto.fileIds) &&
        equalsNullable(this.fileConvertIds, downloadRequestDto.fileConvertIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnSingleOperation, hashCodeNullable(folderIds), hashCodeNullable(fileIds), hashCodeNullable(fileConvertIds));
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
    sb.append("class DownloadRequestDto {\n");
    sb.append("    returnSingleOperation: ").append(toIndentedString(returnSingleOperation)).append("\n");
    sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    fileConvertIds: ").append(toIndentedString(fileConvertIds)).append("\n");
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

    // add `fileConvertIds` to the URL query string
    if (getFileConvertIds() != null) {
      for (int i = 0; i < getFileConvertIds().size(); i++) {
        if (getFileConvertIds().get(i) != null) {
          joiner.add(getFileConvertIds().get(i).toUrlQueryString(String.format("%sfileConvertIds%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

