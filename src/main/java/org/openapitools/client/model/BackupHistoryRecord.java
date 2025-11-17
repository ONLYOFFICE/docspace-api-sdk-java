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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.client.model.BackupStorageType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * BackupHistoryRecord
 */
@JsonPropertyOrder({
  BackupHistoryRecord.JSON_PROPERTY_ID,
  BackupHistoryRecord.JSON_PROPERTY_FILE_NAME,
  BackupHistoryRecord.JSON_PROPERTY_STORAGE_TYPE,
  BackupHistoryRecord.JSON_PROPERTY_CREATED_ON,
  BackupHistoryRecord.JSON_PROPERTY_EXPIRES_ON
})

public class BackupHistoryRecord {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private UUID id;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @javax.annotation.Nullable
  private String fileName;

  public static final String JSON_PROPERTY_STORAGE_TYPE = "storageType";
  @javax.annotation.Nonnull
  private BackupStorageType storageType;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nonnull
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_EXPIRES_ON = "expiresOn";
  @javax.annotation.Nonnull
  private OffsetDateTime expiresOn;

  public BackupHistoryRecord() {
  }

  public BackupHistoryRecord id(@javax.annotation.Nonnull UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }

  public BackupHistoryRecord fileName(@javax.annotation.Nullable String fileName) {
    
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
  }

  public BackupHistoryRecord storageType(@javax.annotation.Nonnull BackupStorageType storageType) {
    
    this.storageType = storageType;
    return this;
  }

  /**
   * Get storageType
   * @return storageType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STORAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BackupStorageType getStorageType() {
    return storageType;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStorageType(@javax.annotation.Nonnull BackupStorageType storageType) {
    this.storageType = storageType;
  }

  public BackupHistoryRecord createdOn(@javax.annotation.Nonnull OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedOn(@javax.annotation.Nonnull OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public BackupHistoryRecord expiresOn(@javax.annotation.Nonnull OffsetDateTime expiresOn) {
    
    this.expiresOn = expiresOn;
    return this;
  }

  /**
   * Get expiresOn
   * @return expiresOn
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRES_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiresOn(@javax.annotation.Nonnull OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupHistoryRecord backupHistoryRecord = (BackupHistoryRecord) o;
    return Objects.equals(this.id, backupHistoryRecord.id) &&
        Objects.equals(this.fileName, backupHistoryRecord.fileName) &&
        Objects.equals(this.storageType, backupHistoryRecord.storageType) &&
        Objects.equals(this.createdOn, backupHistoryRecord.createdOn) &&
        Objects.equals(this.expiresOn, backupHistoryRecord.expiresOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileName, storageType, createdOn, expiresOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupHistoryRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileName` to the URL query string
    if (getFileName() != null) {
      try {
        joiner.add(String.format("%sfileName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expiresOn` to the URL query string
    if (getExpiresOn() != null) {
      try {
        joiner.add(String.format("%sexpiresOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiresOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

