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
import org.openapitools.client.model.DistributedTaskStatus;
import org.openapitools.client.model.ExternalDbSyncFormResultDto;
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
 * The external DB synchronization task parameters.
 */
@JsonPropertyOrder({
  ExternalDbSyncTaskDto.JSON_PROPERTY_ID,
  ExternalDbSyncTaskDto.JSON_PROPERTY_ERROR,
  ExternalDbSyncTaskDto.JSON_PROPERTY_PERCENTAGE,
  ExternalDbSyncTaskDto.JSON_PROPERTY_IS_COMPLETED,
  ExternalDbSyncTaskDto.JSON_PROPERTY_STATUS,
  ExternalDbSyncTaskDto.JSON_PROPERTY_FORMS
})

public class ExternalDbSyncTaskDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private String id;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  @javax.annotation.Nonnull  private Integer percentage;

  public static final String JSON_PROPERTY_IS_COMPLETED = "isCompleted";
  @javax.annotation.Nonnull  private Boolean isCompleted;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull  private DistributedTaskStatus status;

  public static final String JSON_PROPERTY_FORMS = "forms";
  @javax.annotation.Nullable  private List<ExternalDbSyncFormResultDto> forms;

  public ExternalDbSyncTaskDto() {
  }


  public ExternalDbSyncTaskDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The task ID.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public ExternalDbSyncTaskDto error(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
    
    return this;
  }

  /**
   * The error message if the synchronization failed.
   * @return error
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getError() {
        return error.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
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

  public ExternalDbSyncTaskDto percentage(@javax.annotation.Nonnull Integer percentage) {
    
    this.percentage = percentage;
    return this;
  }

  /**
   * The progress percentage of the synchronization.
   * @return percentage
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PERCENTAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPercentage() {
    return percentage;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENTAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercentage(@javax.annotation.Nonnull Integer percentage) {
    this.percentage = percentage;
  }

  public ExternalDbSyncTaskDto isCompleted(@javax.annotation.Nonnull Boolean isCompleted) {
    
    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Specifies whether the synchronization is completed or not.
   * @return isCompleted
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_IS_COMPLETED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsCompleted() {
    return isCompleted;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_COMPLETED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsCompleted(@javax.annotation.Nonnull Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public ExternalDbSyncTaskDto status(@javax.annotation.Nonnull DistributedTaskStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DistributedTaskStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull DistributedTaskStatus status) {
    this.status = status;
  }

  public ExternalDbSyncTaskDto forms(@javax.annotation.Nullable List<ExternalDbSyncFormResultDto> forms) {
    
    this.forms = forms;
    return this;
  }

  public ExternalDbSyncTaskDto addFormsItem(ExternalDbSyncFormResultDto formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<>();
    }
    this.forms.add(formsItem);
    return this;
  }

  /**
   * The synchronization results for all original forms in the room.
   * @return forms
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FORMS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ExternalDbSyncFormResultDto> getForms() {
    return forms;
  }


  @JsonProperty(value = JSON_PROPERTY_FORMS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setForms(@javax.annotation.Nullable List<ExternalDbSyncFormResultDto> forms) {
    this.forms = forms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDbSyncTaskDto externalDbSyncTaskDto = (ExternalDbSyncTaskDto) o;
    return Objects.equals(this.id, externalDbSyncTaskDto.id) &&
        equalsNullable(this.error, externalDbSyncTaskDto.error) &&
        Objects.equals(this.percentage, externalDbSyncTaskDto.percentage) &&
        Objects.equals(this.isCompleted, externalDbSyncTaskDto.isCompleted) &&
        Objects.equals(this.status, externalDbSyncTaskDto.status) &&
        Objects.equals(this.forms, externalDbSyncTaskDto.forms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(error), percentage, isCompleted, status, forms);
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
    sb.append("class ExternalDbSyncTaskDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
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

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `percentage` to the URL query string
    if (getPercentage() != null) {
      try {
        joiner.add(String.format("%spercentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPercentage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isCompleted` to the URL query string
    if (getIsCompleted() != null) {
      try {
        joiner.add(String.format("%sisCompleted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsCompleted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `forms` to the URL query string
    if (getForms() != null) {
      for (int i = 0; i < getForms().size(); i++) {
        if (getForms().get(i) != null) {
          joiner.add(getForms().get(i).toUrlQueryString(String.format("%sforms%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

