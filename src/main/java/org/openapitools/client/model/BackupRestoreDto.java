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
import org.openapitools.client.model.BackupStorageType;
import org.openapitools.client.model.ItemKeyValuePairObjectObject;
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
 * The backup restoring parameters.
 */
@JsonPropertyOrder({
  BackupRestoreDto.JSON_PROPERTY_BACKUP_ID,
  BackupRestoreDto.JSON_PROPERTY_STORAGE_TYPE,
  BackupRestoreDto.JSON_PROPERTY_STORAGE_PARAMS,
  BackupRestoreDto.JSON_PROPERTY_NOTIFY,
  BackupRestoreDto.JSON_PROPERTY_DUMP
})

public class BackupRestoreDto {
  public static final String JSON_PROPERTY_BACKUP_ID = "backupId";
  @javax.annotation.Nullable
  private String backupId;

  public static final String JSON_PROPERTY_STORAGE_TYPE = "storageType";
  @javax.annotation.Nullable
  private BackupStorageType storageType;

  public static final String JSON_PROPERTY_STORAGE_PARAMS = "storageParams";
  @javax.annotation.Nullable
  private JsonNullable<List<ItemKeyValuePairObjectObject>> storageParams = JsonNullable.<List<ItemKeyValuePairObjectObject>>undefined();

  public static final String JSON_PROPERTY_NOTIFY = "notify";
  @javax.annotation.Nullable
  private Boolean notify;

  public static final String JSON_PROPERTY_DUMP = "dump";
  @javax.annotation.Nullable
  private Boolean dump;

  public BackupRestoreDto() {
  }


  public BackupRestoreDto backupId(@javax.annotation.Nullable String backupId) {
    
    this.backupId = backupId;
    return this;
  }

  /**
   * The backup ID.
   * @return backupId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBackupId() {
    return backupId;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBackupId(@javax.annotation.Nullable String backupId) {
    this.backupId = backupId;
  }

  public BackupRestoreDto storageType(@javax.annotation.Nullable BackupStorageType storageType) {
    
    this.storageType = storageType;
    return this;
  }

  /**
   * Get storageType
   * @return storageType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BackupStorageType getStorageType() {
    return storageType;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageType(@javax.annotation.Nullable BackupStorageType storageType) {
    this.storageType = storageType;
  }

  public BackupRestoreDto storageParams(@javax.annotation.Nullable List<ItemKeyValuePairObjectObject> storageParams) {
    this.storageParams = JsonNullable.<List<ItemKeyValuePairObjectObject>>of(storageParams);
    
    return this;
  }

  public BackupRestoreDto addStorageParamsItem(ItemKeyValuePairObjectObject storageParamsItem) {
    if (this.storageParams == null || !this.storageParams.isPresent()) {
      this.storageParams = JsonNullable.<List<ItemKeyValuePairObjectObject>>of(new ArrayList<>());
    }
    try {
      this.storageParams.get().add(storageParamsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The backup storage parameters.
   * @return storageParams
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<ItemKeyValuePairObjectObject> getStorageParams() {
        return storageParams.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STORAGE_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ItemKeyValuePairObjectObject>> getStorageParams_JsonNullable() {
    return storageParams;
  }
  
  @JsonProperty(JSON_PROPERTY_STORAGE_PARAMS)
  public void setStorageParams_JsonNullable(JsonNullable<List<ItemKeyValuePairObjectObject>> storageParams) {
    this.storageParams = storageParams;
  }

  public void setStorageParams(@javax.annotation.Nullable List<ItemKeyValuePairObjectObject> storageParams) {
    this.storageParams = JsonNullable.<List<ItemKeyValuePairObjectObject>>of(storageParams);
  }

  public BackupRestoreDto notify(@javax.annotation.Nullable Boolean notify) {
    
    this.notify = notify;
    return this;
  }

  /**
   * Notifies users about the portal restoring process or not.
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

  public BackupRestoreDto dump(@javax.annotation.Nullable Boolean dump) {
    
    this.dump = dump;
    return this;
  }

  /**
   * Specifies if a dump will be created or not.
   * @return dump
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDump() {
    return dump;
  }


  @JsonProperty(JSON_PROPERTY_DUMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDump(@javax.annotation.Nullable Boolean dump) {
    this.dump = dump;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupRestoreDto backupRestoreDto = (BackupRestoreDto) o;
    return Objects.equals(this.backupId, backupRestoreDto.backupId) &&
        Objects.equals(this.storageType, backupRestoreDto.storageType) &&
        equalsNullable(this.storageParams, backupRestoreDto.storageParams) &&
        Objects.equals(this.notify, backupRestoreDto.notify) &&
        Objects.equals(this.dump, backupRestoreDto.dump);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupId, storageType, hashCodeNullable(storageParams), notify, dump);
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
    sb.append("class BackupRestoreDto {\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    storageParams: ").append(toIndentedString(storageParams)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    dump: ").append(toIndentedString(dump)).append("\n");
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

    // add `backupId` to the URL query string
    if (getBackupId() != null) {
      try {
        joiner.add(String.format("%sbackupId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackupId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `storageType` to the URL query string
    if (getStorageType() != null) {
      try {
        joiner.add(String.format("%sstorageType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStorageType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `storageParams` to the URL query string
    if (getStorageParams() != null) {
      for (int i = 0; i < getStorageParams().size(); i++) {
        if (getStorageParams().get(i) != null) {
          joiner.add(getStorageParams().get(i).toUrlQueryString(String.format("%sstorageParams%s%s", prefix, suffix,
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

    // add `dump` to the URL query string
    if (getDump() != null) {
      try {
        joiner.add(String.format("%sdump%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDump()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

