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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.BackupStorageType;
import org.openapitools.client.model.CronParams;
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
  ScheduleDto.JSON_PROPERTY_STORAGE_TYPE,
  ScheduleDto.JSON_PROPERTY_STORAGE_PARAMS,
  ScheduleDto.JSON_PROPERTY_CRON_PARAMS,
  ScheduleDto.JSON_PROPERTY_BACKUPS_STORED,
  ScheduleDto.JSON_PROPERTY_LAST_BACKUP_TIME,
  ScheduleDto.JSON_PROPERTY_DUMP
})

public class ScheduleDto {
  public static final String JSON_PROPERTY_STORAGE_TYPE = "storageType";
  @javax.annotation.Nonnull  private BackupStorageType storageType;

  public static final String JSON_PROPERTY_STORAGE_PARAMS = "storageParams";
  @javax.annotation.Nullable  private Map<String, String> storageParams;

  public static final String JSON_PROPERTY_CRON_PARAMS = "cronParams";
  @javax.annotation.Nonnull  private CronParams cronParams;

  public static final String JSON_PROPERTY_BACKUPS_STORED = "backupsStored";
  @javax.annotation.Nullable  private JsonNullable<Integer> backupsStored = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_LAST_BACKUP_TIME = "lastBackupTime";
  @javax.annotation.Nonnull  private OffsetDateTime lastBackupTime;

  public static final String JSON_PROPERTY_DUMP = "dump";
  @javax.annotation.Nonnull  private Boolean dump;

  public ScheduleDto() {
  }


  public ScheduleDto storageType(@javax.annotation.Nonnull BackupStorageType storageType) {
    
    this.storageType = storageType;
    return this;
  }

  /**
   * Get storageType
   * @return storageType
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_STORAGE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BackupStorageType getStorageType() {
    return storageType;
  }


  @JsonProperty(value = JSON_PROPERTY_STORAGE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStorageType(@javax.annotation.Nonnull BackupStorageType storageType) {
    this.storageType = storageType;
  }

  public ScheduleDto storageParams(@javax.annotation.Nullable Map<String, String> storageParams) {
    
    this.storageParams = storageParams;
    return this;
  }

  public ScheduleDto putStorageParamsItem(String key, String storageParamsItem) {
    this.storageParams.put(key, storageParamsItem);
    return this;
  }

  /**
   * The backup storage parameters.
   * @return storageParams
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STORAGE_PARAMS, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getStorageParams() {
    return storageParams;
  }


  @JsonProperty(value = JSON_PROPERTY_STORAGE_PARAMS, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setStorageParams(@javax.annotation.Nullable Map<String, String> storageParams) {
    this.storageParams = storageParams;
  }

  public ScheduleDto cronParams(@javax.annotation.Nonnull CronParams cronParams) {
    
    this.cronParams = cronParams;
    return this;
  }

  /**
   * Get cronParams
   * @return cronParams
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CRON_PARAMS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CronParams getCronParams() {
    return cronParams;
  }


  @JsonProperty(value = JSON_PROPERTY_CRON_PARAMS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCronParams(@javax.annotation.Nonnull CronParams cronParams) {
    this.cronParams = cronParams;
  }

  public ScheduleDto backupsStored(@javax.annotation.Nullable Integer backupsStored) {
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

  public ScheduleDto lastBackupTime(@javax.annotation.Nonnull OffsetDateTime lastBackupTime) {
    
    this.lastBackupTime = lastBackupTime;
    return this;
  }

  /**
   * The date and time when the last backup was reated.
   * @return lastBackupTime
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_LAST_BACKUP_TIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getLastBackupTime() {
    return lastBackupTime;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_BACKUP_TIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastBackupTime(@javax.annotation.Nonnull OffsetDateTime lastBackupTime) {
    this.lastBackupTime = lastBackupTime;
  }

  public ScheduleDto dump(@javax.annotation.Nonnull Boolean dump) {
    
    this.dump = dump;
    return this;
  }

  /**
   * Specifies if a dump will be created or not.
   * @return dump
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DUMP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDump() {
    return dump;
  }


  @JsonProperty(value = JSON_PROPERTY_DUMP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDump(@javax.annotation.Nonnull Boolean dump) {
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
    ScheduleDto scheduleDto = (ScheduleDto) o;
    return Objects.equals(this.storageType, scheduleDto.storageType) &&
        Objects.equals(this.storageParams, scheduleDto.storageParams) &&
        Objects.equals(this.cronParams, scheduleDto.cronParams) &&
        equalsNullable(this.backupsStored, scheduleDto.backupsStored) &&
        Objects.equals(this.lastBackupTime, scheduleDto.lastBackupTime) &&
        Objects.equals(this.dump, scheduleDto.dump);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageType, storageParams, cronParams, hashCodeNullable(backupsStored), lastBackupTime, dump);
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
    sb.append("class ScheduleDto {\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    storageParams: ").append(toIndentedString(storageParams)).append("\n");
    sb.append("    cronParams: ").append(toIndentedString(cronParams)).append("\n");
    sb.append("    backupsStored: ").append(toIndentedString(backupsStored)).append("\n");
    sb.append("    lastBackupTime: ").append(toIndentedString(lastBackupTime)).append("\n");
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
      for (String _key : getStorageParams().keySet()) {
        try {
          joiner.add(String.format("%sstorageParams%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getStorageParams().get(_key), URLEncoder.encode(String.valueOf(getStorageParams().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `cronParams` to the URL query string
    if (getCronParams() != null) {
      joiner.add(getCronParams().toUrlQueryString(prefix + "cronParams" + suffix));
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

    // add `lastBackupTime` to the URL query string
    if (getLastBackupTime() != null) {
      try {
        joiner.add(String.format("%slastBackupTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastBackupTime()), "UTF-8").replaceAll("\\+", "%20")));
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

