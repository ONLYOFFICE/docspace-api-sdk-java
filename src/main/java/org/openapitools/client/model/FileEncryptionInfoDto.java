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
import org.openapitools.client.model.EncryptionKeyDto;
import org.openapitools.client.model.FileKeys;
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
 * The encryption information of a file: the user key pairs and the per-user file keys.
 */
@JsonPropertyOrder({
  FileEncryptionInfoDto.JSON_PROPERTY_USER_KEYS,
  FileEncryptionInfoDto.JSON_PROPERTY_FILE_KEYS
})

public class FileEncryptionInfoDto {
  public static final String JSON_PROPERTY_USER_KEYS = "userKeys";
  @javax.annotation.Nullable  private JsonNullable<List<EncryptionKeyDto>> userKeys = JsonNullable.<List<EncryptionKeyDto>>undefined();

  public static final String JSON_PROPERTY_FILE_KEYS = "fileKeys";
  @javax.annotation.Nullable  private JsonNullable<List<FileKeys>> fileKeys = JsonNullable.<List<FileKeys>>undefined();

  public FileEncryptionInfoDto() {
  }


  public FileEncryptionInfoDto userKeys(@javax.annotation.Nullable List<EncryptionKeyDto> userKeys) {
    this.userKeys = JsonNullable.<List<EncryptionKeyDto>>of(userKeys);
    
    return this;
  }

  public FileEncryptionInfoDto addUserKeysItem(EncryptionKeyDto userKeysItem) {
    if (this.userKeys == null || !this.userKeys.isPresent()) {
      this.userKeys = JsonNullable.<List<EncryptionKeyDto>>of(new ArrayList<>());
    }
    try {
      this.userKeys.get().add(userKeysItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The key pairs of the users who have access to the file.
   * @return userKeys
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<EncryptionKeyDto> getUserKeys() {
        return userKeys.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<EncryptionKeyDto>> getUserKeys_JsonNullable() {
    return userKeys;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_KEYS)
  public void setUserKeys_JsonNullable(JsonNullable<List<EncryptionKeyDto>> userKeys) {
    this.userKeys = userKeys;
  }

  public void setUserKeys(@javax.annotation.Nullable List<EncryptionKeyDto> userKeys) {
    this.userKeys = JsonNullable.<List<EncryptionKeyDto>>of(userKeys);
  }

  public FileEncryptionInfoDto fileKeys(@javax.annotation.Nullable List<FileKeys> fileKeys) {
    this.fileKeys = JsonNullable.<List<FileKeys>>of(fileKeys);
    
    return this;
  }

  public FileEncryptionInfoDto addFileKeysItem(FileKeys fileKeysItem) {
    if (this.fileKeys == null || !this.fileKeys.isPresent()) {
      this.fileKeys = JsonNullable.<List<FileKeys>>of(new ArrayList<>());
    }
    try {
      this.fileKeys.get().add(fileKeysItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The file keys issued to those users.
   * @return fileKeys
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<FileKeys> getFileKeys() {
        return fileKeys.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FileKeys>> getFileKeys_JsonNullable() {
    return fileKeys;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_KEYS)
  public void setFileKeys_JsonNullable(JsonNullable<List<FileKeys>> fileKeys) {
    this.fileKeys = fileKeys;
  }

  public void setFileKeys(@javax.annotation.Nullable List<FileKeys> fileKeys) {
    this.fileKeys = JsonNullable.<List<FileKeys>>of(fileKeys);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileEncryptionInfoDto fileEncryptionInfoDto = (FileEncryptionInfoDto) o;
    return equalsNullable(this.userKeys, fileEncryptionInfoDto.userKeys) &&
        equalsNullable(this.fileKeys, fileEncryptionInfoDto.fileKeys);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(userKeys), hashCodeNullable(fileKeys));
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
    sb.append("class FileEncryptionInfoDto {\n");
    sb.append("    userKeys: ").append(toIndentedString(userKeys)).append("\n");
    sb.append("    fileKeys: ").append(toIndentedString(fileKeys)).append("\n");
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

    // add `userKeys` to the URL query string
    if (getUserKeys() != null) {
      for (int i = 0; i < getUserKeys().size(); i++) {
        if (getUserKeys().get(i) != null) {
          joiner.add(getUserKeys().get(i).toUrlQueryString(String.format("%suserKeys%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `fileKeys` to the URL query string
    if (getFileKeys() != null) {
      for (int i = 0; i < getFileKeys().size(); i++) {
        if (getFileKeys().get(i) != null) {
          joiner.add(getFileKeys().get(i).toUrlQueryString(String.format("%sfileKeys%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

