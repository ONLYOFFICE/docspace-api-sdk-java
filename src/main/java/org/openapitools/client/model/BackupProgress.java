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
import org.openapitools.client.model.BackupProgressEnum;
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
 * BackupProgress
 */
@JsonPropertyOrder({
  BackupProgress.JSON_PROPERTY_IS_COMPLETED,
  BackupProgress.JSON_PROPERTY_PROGRESS,
  BackupProgress.JSON_PROPERTY_ERROR,
  BackupProgress.JSON_PROPERTY_WARNING,
  BackupProgress.JSON_PROPERTY_LINK,
  BackupProgress.JSON_PROPERTY_TENANT_ID,
  BackupProgress.JSON_PROPERTY_BACKUP_PROGRESS_ENUM,
  BackupProgress.JSON_PROPERTY_TASK_ID
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class BackupProgress {
  public static final String JSON_PROPERTY_IS_COMPLETED = "isCompleted";
  @javax.annotation.Nullable
  private Boolean isCompleted;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  @javax.annotation.Nullable
  private Integer progress;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WARNING = "warning";
  @javax.annotation.Nullable
  private JsonNullable<String> warning = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable
  private JsonNullable<String> link = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private Integer tenantId;

  public static final String JSON_PROPERTY_BACKUP_PROGRESS_ENUM = "backupProgressEnum";
  @javax.annotation.Nullable
  private BackupProgressEnum backupProgressEnum;

  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  @javax.annotation.Nullable
  private JsonNullable<String> taskId = JsonNullable.<String>undefined();

  public BackupProgress() {
  }

  public BackupProgress isCompleted(@javax.annotation.Nullable Boolean isCompleted) {
    
    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Get isCompleted
   * @return isCompleted
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCompleted() {
    return isCompleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCompleted(@javax.annotation.Nullable Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public BackupProgress progress(@javax.annotation.Nullable Integer progress) {
    
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProgress() {
    return progress;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgress(@javax.annotation.Nullable Integer progress) {
    this.progress = progress;
  }

  public BackupProgress error(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
    
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getError() {
        return error.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getError_JsonNullable() {
    return error;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR)
  public void setError_JsonNullable(JsonNullable<String> error) {
    this.error = error;
  }

  public void setError(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
  }

  public BackupProgress warning(@javax.annotation.Nullable String warning) {
    this.warning = JsonNullable.<String>of(warning);
    
    return this;
  }

  /**
   * Get warning
   * @return warning
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getWarning() {
        return warning.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWarning_JsonNullable() {
    return warning;
  }
  
  @JsonProperty(JSON_PROPERTY_WARNING)
  public void setWarning_JsonNullable(JsonNullable<String> warning) {
    this.warning = warning;
  }

  public void setWarning(@javax.annotation.Nullable String warning) {
    this.warning = JsonNullable.<String>of(warning);
  }

  public BackupProgress link(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
    
    return this;
  }

  /**
   * Get link
   * @return link
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLink() {
        return link.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLink_JsonNullable() {
    return link;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK)
  public void setLink_JsonNullable(JsonNullable<String> link) {
    this.link = link;
  }

  public void setLink(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
  }

  public BackupProgress tenantId(@javax.annotation.Nullable Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable Integer tenantId) {
    this.tenantId = tenantId;
  }

  public BackupProgress backupProgressEnum(@javax.annotation.Nullable BackupProgressEnum backupProgressEnum) {
    
    this.backupProgressEnum = backupProgressEnum;
    return this;
  }

  /**
   * Get backupProgressEnum
   * @return backupProgressEnum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKUP_PROGRESS_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BackupProgressEnum getBackupProgressEnum() {
    return backupProgressEnum;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_PROGRESS_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupProgressEnum(@javax.annotation.Nullable BackupProgressEnum backupProgressEnum) {
    this.backupProgressEnum = backupProgressEnum;
  }

  public BackupProgress taskId(@javax.annotation.Nullable String taskId) {
    this.taskId = JsonNullable.<String>of(taskId);
    
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTaskId() {
        return taskId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTaskId_JsonNullable() {
    return taskId;
  }
  
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  public void setTaskId_JsonNullable(JsonNullable<String> taskId) {
    this.taskId = taskId;
  }

  public void setTaskId(@javax.annotation.Nullable String taskId) {
    this.taskId = JsonNullable.<String>of(taskId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupProgress backupProgress = (BackupProgress) o;
    return Objects.equals(this.isCompleted, backupProgress.isCompleted) &&
        Objects.equals(this.progress, backupProgress.progress) &&
        equalsNullable(this.error, backupProgress.error) &&
        equalsNullable(this.warning, backupProgress.warning) &&
        equalsNullable(this.link, backupProgress.link) &&
        Objects.equals(this.tenantId, backupProgress.tenantId) &&
        Objects.equals(this.backupProgressEnum, backupProgress.backupProgressEnum) &&
        equalsNullable(this.taskId, backupProgress.taskId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompleted, progress, hashCodeNullable(error), hashCodeNullable(warning), hashCodeNullable(link), tenantId, backupProgressEnum, hashCodeNullable(taskId));
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
    sb.append("class BackupProgress {\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    backupProgressEnum: ").append(toIndentedString(backupProgressEnum)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

    // add `isCompleted` to the URL query string
    if (getIsCompleted() != null) {
      try {
        joiner.add(String.format("%sisCompleted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsCompleted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `progress` to the URL query string
    if (getProgress() != null) {
      try {
        joiner.add(String.format("%sprogress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProgress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `warning` to the URL query string
    if (getWarning() != null) {
      try {
        joiner.add(String.format("%swarning%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWarning()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      try {
        joiner.add(String.format("%slink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      try {
        joiner.add(String.format("%stenantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `backupProgressEnum` to the URL query string
    if (getBackupProgressEnum() != null) {
      try {
        joiner.add(String.format("%sbackupProgressEnum%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackupProgressEnum()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taskId` to the URL query string
    if (getTaskId() != null) {
      try {
        joiner.add(String.format("%staskId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaskId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

