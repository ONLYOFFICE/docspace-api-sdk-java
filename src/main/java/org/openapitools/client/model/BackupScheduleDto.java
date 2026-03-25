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
import org.openapitools.client.model.BackupStorageType;
import org.openapitools.client.model.Cron;
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
 * The backup schedule parameters.
 */
@JsonPropertyOrder({
  BackupScheduleDto.JSON_PROPERTY_STORAGE_TYPE,
  BackupScheduleDto.JSON_PROPERTY_STORAGE_PARAMS,
  BackupScheduleDto.JSON_PROPERTY_BACKUPS_STORED,
  BackupScheduleDto.JSON_PROPERTY_CRON_PARAMS,
  BackupScheduleDto.JSON_PROPERTY_DUMP
})

public class BackupScheduleDto {
  public static final String JSON_PROPERTY_STORAGE_TYPE = "storageType";
  @javax.annotation.Nullable  private BackupStorageType storageType;

  public static final String JSON_PROPERTY_STORAGE_PARAMS = "storageParams";
  @javax.annotation.Nullable  private JsonNullable<List<ItemKeyValuePairObjectObject>> storageParams = JsonNullable.<List<ItemKeyValuePairObjectObject>>undefined();

  public static final String JSON_PROPERTY_BACKUPS_STORED = "backupsStored";
  @javax.annotation.Nullable  private JsonNullable<Integer> backupsStored = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CRON_PARAMS = "cronParams";
  @javax.annotation.Nullable  private Cron cronParams;

  public static final String JSON_PROPERTY_DUMP = "dump";
  @javax.annotation.Nullable  private Boolean dump;

  public BackupScheduleDto() {
  }


  public BackupScheduleDto storageType(@javax.annotation.Nullable BackupStorageType storageType) {
    
    this.storageType = storageType;
    return this;
  }

  /**
   * Get storageType
   * @return storageType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STORAGE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BackupStorageType getStorageType() {
    return storageType;
  }


  @JsonProperty(value = JSON_PROPERTY_STORAGE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageType(@javax.annotation.Nullable BackupStorageType storageType) {
    this.storageType = storageType;
  }

  public BackupScheduleDto storageParams(@javax.annotation.Nullable List<ItemKeyValuePairObjectObject> storageParams) {
    this.storageParams = JsonNullable.<List<ItemKeyValuePairObjectObject>>of(storageParams);
    
    return this;
  }

  public BackupScheduleDto addStorageParamsItem(ItemKeyValuePairObjectObject storageParamsItem) {
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
  @javax.annotation.Nullable  @JsonIgnore

  public List<ItemKeyValuePairObjectObject> getStorageParams() {
        return storageParams.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_STORAGE_PARAMS, required = false)
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

  public BackupScheduleDto backupsStored(@javax.annotation.Nullable Integer backupsStored) {
    this.backupsStored = JsonNullable.<Integer>of(backupsStored);
    
    return this;
  }

  /**
   * The maximum number of the stored backup copies.
   * @return backupsStored
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getBackupsStored() {
        return backupsStored.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_BACKUPS_STORED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getBackupsStored_JsonNullable() {
    return backupsStored;
  }
  
  @JsonProperty(JSON_PROPERTY_BACKUPS_STORED)
  public void setBackupsStored_JsonNullable(JsonNullable<Integer> backupsStored) {
    this.backupsStored = backupsStored;
  }

  public void setBackupsStored(@javax.annotation.Nullable Integer backupsStored) {
    this.backupsStored = JsonNullable.<Integer>of(backupsStored);
  }

  public BackupScheduleDto cronParams(@javax.annotation.Nullable Cron cronParams) {
    
    this.cronParams = cronParams;
    return this;
  }

  /**
   * Get cronParams
   * @return cronParams
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CRON_PARAMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Cron getCronParams() {
    return cronParams;
  }


  @JsonProperty(value = JSON_PROPERTY_CRON_PARAMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCronParams(@javax.annotation.Nullable Cron cronParams) {
    this.cronParams = cronParams;
  }

  public BackupScheduleDto dump(@javax.annotation.Nullable Boolean dump) {
    
    this.dump = dump;
    return this;
  }

  /**
   * Specifies if a dump will be created or not.
   * @return dump
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DUMP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDump() {
    return dump;
  }


  @JsonProperty(value = JSON_PROPERTY_DUMP, required = false)
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
    BackupScheduleDto backupScheduleDto = (BackupScheduleDto) o;
    return Objects.equals(this.storageType, backupScheduleDto.storageType) &&
        equalsNullable(this.storageParams, backupScheduleDto.storageParams) &&
        equalsNullable(this.backupsStored, backupScheduleDto.backupsStored) &&
        Objects.equals(this.cronParams, backupScheduleDto.cronParams) &&
        Objects.equals(this.dump, backupScheduleDto.dump);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageType, hashCodeNullable(storageParams), hashCodeNullable(backupsStored), cronParams, dump);
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
    sb.append("class BackupScheduleDto {\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    storageParams: ").append(toIndentedString(storageParams)).append("\n");
    sb.append("    backupsStored: ").append(toIndentedString(backupsStored)).append("\n");
    sb.append("    cronParams: ").append(toIndentedString(cronParams)).append("\n");
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

    // add `backupsStored` to the URL query string
    if (getBackupsStored() != null) {
      try {
        joiner.add(String.format("%sbackupsStored%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackupsStored()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cronParams` to the URL query string
    if (getCronParams() != null) {
      joiner.add(getCronParams().toUrlQueryString(prefix + "cronParams" + suffix));
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

