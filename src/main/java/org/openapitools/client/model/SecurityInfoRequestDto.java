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
import org.openapitools.client.model.DuplicateRequestDtoAllOfFileIds;
import org.openapitools.client.model.FileShareParams;
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
 * The security information request parameters.
 */
@JsonPropertyOrder({
  SecurityInfoRequestDto.JSON_PROPERTY_FOLDER_IDS,
  SecurityInfoRequestDto.JSON_PROPERTY_FILE_IDS,
  SecurityInfoRequestDto.JSON_PROPERTY_SHARE,
  SecurityInfoRequestDto.JSON_PROPERTY_NOTIFY,
  SecurityInfoRequestDto.JSON_PROPERTY_SHARING_MESSAGE
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class SecurityInfoRequestDto {
  public static final String JSON_PROPERTY_FOLDER_IDS = "folderIds";
  @javax.annotation.Nullable
  private JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> folderIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_FILE_IDS = "fileIds";
  @javax.annotation.Nullable
  private JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> fileIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_SHARE = "share";
  @javax.annotation.Nullable
  private JsonNullable<List<FileShareParams>> share = JsonNullable.<List<FileShareParams>>undefined();

  public static final String JSON_PROPERTY_NOTIFY = "notify";
  @javax.annotation.Nullable
  private Boolean notify;

  public static final String JSON_PROPERTY_SHARING_MESSAGE = "sharingMessage";
  @javax.annotation.Nullable
  private JsonNullable<String> sharingMessage = JsonNullable.<String>undefined();

  public SecurityInfoRequestDto() {
  }

  public SecurityInfoRequestDto folderIds(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> folderIds) {
    this.folderIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(folderIds);
    
    return this;
  }

  public SecurityInfoRequestDto addFolderIdsItem(DuplicateRequestDtoAllOfFileIds folderIdsItem) {
    if (this.folderIds == null || !this.folderIds.isPresent()) {
      this.folderIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(new ArrayList<>());
    }
    try {
      this.folderIds.get().add(folderIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the shared folder IDs.
   * @return folderIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<DuplicateRequestDtoAllOfFileIds> getFolderIds() {
        return folderIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FOLDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> getFolderIds_JsonNullable() {
    return folderIds;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_IDS)
  public void setFolderIds_JsonNullable(JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> folderIds) {
    this.folderIds = folderIds;
  }

  public void setFolderIds(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> folderIds) {
    this.folderIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(folderIds);
  }

  public SecurityInfoRequestDto fileIds(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> fileIds) {
    this.fileIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(fileIds);
    
    return this;
  }

  public SecurityInfoRequestDto addFileIdsItem(DuplicateRequestDtoAllOfFileIds fileIdsItem) {
    if (this.fileIds == null || !this.fileIds.isPresent()) {
      this.fileIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(new ArrayList<>());
    }
    try {
      this.fileIds.get().add(fileIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the shared file IDs.
   * @return fileIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<DuplicateRequestDtoAllOfFileIds> getFileIds() {
        return fileIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> getFileIds_JsonNullable() {
    return fileIds;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_IDS)
  public void setFileIds_JsonNullable(JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> fileIds) {
    this.fileIds = fileIds;
  }

  public void setFileIds(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> fileIds) {
    this.fileIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(fileIds);
  }

  public SecurityInfoRequestDto share(@javax.annotation.Nullable List<FileShareParams> share) {
    this.share = JsonNullable.<List<FileShareParams>>of(share);
    
    return this;
  }

  public SecurityInfoRequestDto addShareItem(FileShareParams shareItem) {
    if (this.share == null || !this.share.isPresent()) {
      this.share = JsonNullable.<List<FileShareParams>>of(new ArrayList<>());
    }
    try {
      this.share.get().add(shareItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The collection of sharing parameters.
   * @return share
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<FileShareParams> getShare() {
        return share.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<FileShareParams>> getShare_JsonNullable() {
    return share;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARE)
  public void setShare_JsonNullable(JsonNullable<List<FileShareParams>> share) {
    this.share = share;
  }

  public void setShare(@javax.annotation.Nullable List<FileShareParams> share) {
    this.share = JsonNullable.<List<FileShareParams>>of(share);
  }

  public SecurityInfoRequestDto notify(@javax.annotation.Nullable Boolean notify) {
    
    this.notify = notify;
    return this;
  }

  /**
   * Specifies whether to notify users about the shared file or not.
   * @return notify
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotify() {
    return notify;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotify(@javax.annotation.Nullable Boolean notify) {
    this.notify = notify;
  }

  public SecurityInfoRequestDto sharingMessage(@javax.annotation.Nullable String sharingMessage) {
    this.sharingMessage = JsonNullable.<String>of(sharingMessage);
    
    return this;
  }

  /**
   * The message to send when notifying about the shared file.
   * @return sharingMessage
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSharingMessage() {
        return sharingMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARING_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSharingMessage_JsonNullable() {
    return sharingMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARING_MESSAGE)
  public void setSharingMessage_JsonNullable(JsonNullable<String> sharingMessage) {
    this.sharingMessage = sharingMessage;
  }

  public void setSharingMessage(@javax.annotation.Nullable String sharingMessage) {
    this.sharingMessage = JsonNullable.<String>of(sharingMessage);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityInfoRequestDto securityInfoRequestDto = (SecurityInfoRequestDto) o;
    return equalsNullable(this.folderIds, securityInfoRequestDto.folderIds) &&
        equalsNullable(this.fileIds, securityInfoRequestDto.fileIds) &&
        equalsNullable(this.share, securityInfoRequestDto.share) &&
        Objects.equals(this.notify, securityInfoRequestDto.notify) &&
        equalsNullable(this.sharingMessage, securityInfoRequestDto.sharingMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(folderIds), hashCodeNullable(fileIds), hashCodeNullable(share), notify, hashCodeNullable(sharingMessage));
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
    sb.append("class SecurityInfoRequestDto {\n");
    sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    sharingMessage: ").append(toIndentedString(sharingMessage)).append("\n");
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

    // add `share` to the URL query string
    if (getShare() != null) {
      for (int i = 0; i < getShare().size(); i++) {
        if (getShare().get(i) != null) {
          joiner.add(getShare().get(i).toUrlQueryString(String.format("%sshare%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `notify` to the URL query string
    if (getNotify() != null) {
      try {
        joiner.add(String.format("%snotify%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotify()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sharingMessage` to the URL query string
    if (getSharingMessage() != null) {
      try {
        joiner.add(String.format("%ssharingMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharingMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

