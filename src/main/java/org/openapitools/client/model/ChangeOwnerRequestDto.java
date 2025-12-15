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
import java.util.UUID;
import org.openapitools.client.model.BatchRequestDtoAllOfFileIds;
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
 * The request parameters for changing the file owner.
 */
@JsonPropertyOrder({
  ChangeOwnerRequestDto.JSON_PROPERTY_FOLDER_IDS,
  ChangeOwnerRequestDto.JSON_PROPERTY_FILE_IDS,
  ChangeOwnerRequestDto.JSON_PROPERTY_USER_ID
})

public class ChangeOwnerRequestDto {
  public static final String JSON_PROPERTY_FOLDER_IDS = "folderIds";
  @javax.annotation.Nullable
  private JsonNullable<List<BatchRequestDtoAllOfFileIds>> folderIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_FILE_IDS = "fileIds";
  @javax.annotation.Nullable
  private JsonNullable<List<BatchRequestDtoAllOfFileIds>> fileIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nonnull
  private UUID userId;

  public ChangeOwnerRequestDto() {
  }

  public ChangeOwnerRequestDto folderIds(@javax.annotation.Nullable List<BatchRequestDtoAllOfFileIds> folderIds) {
    this.folderIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>of(folderIds);
    
    return this;
  }

  public ChangeOwnerRequestDto addFolderIdsItem(BatchRequestDtoAllOfFileIds folderIdsItem) {
    if (this.folderIds == null || !this.folderIds.isPresent()) {
      this.folderIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>of(new ArrayList<>());
    }
    try {
      this.folderIds.get().add(folderIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of folder IDs to change the owner.
   * @return folderIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<BatchRequestDtoAllOfFileIds> getFolderIds() {
        return folderIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FOLDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<BatchRequestDtoAllOfFileIds>> getFolderIds_JsonNullable() {
    return folderIds;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_IDS)
  public void setFolderIds_JsonNullable(JsonNullable<List<BatchRequestDtoAllOfFileIds>> folderIds) {
    this.folderIds = folderIds;
  }

  public void setFolderIds(@javax.annotation.Nullable List<BatchRequestDtoAllOfFileIds> folderIds) {
    this.folderIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>of(folderIds);
  }

  public ChangeOwnerRequestDto fileIds(@javax.annotation.Nullable List<BatchRequestDtoAllOfFileIds> fileIds) {
    this.fileIds = JsonNullable.<List<BatchRequestDtoAllOfFileIds>>of(fileIds);
    
    return this;
  }

  public ChangeOwnerRequestDto addFileIdsItem(BatchRequestDtoAllOfFileIds fileIdsItem) {
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
   * The list of file IDs to change the owner.
   * @return fileIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<BatchRequestDtoAllOfFileIds> getFileIds() {
        return fileIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_IDS)
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

  public ChangeOwnerRequestDto userId(@javax.annotation.Nonnull UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The new file owner ID.
   * @return userId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeOwnerRequestDto changeOwnerRequestDto = (ChangeOwnerRequestDto) o;
    return equalsNullable(this.folderIds, changeOwnerRequestDto.folderIds) &&
        equalsNullable(this.fileIds, changeOwnerRequestDto.fileIds) &&
        Objects.equals(this.userId, changeOwnerRequestDto.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(folderIds), hashCodeNullable(fileIds), userId);
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
    sb.append("class ChangeOwnerRequestDto {\n");
    sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

