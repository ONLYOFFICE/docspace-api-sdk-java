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
 * The cascade metadata assignment operation status.
 */
@JsonPropertyOrder({
  MetadataOperationDto.JSON_PROPERTY_ID,
  MetadataOperationDto.JSON_PROPERTY_PROGRESS,
  MetadataOperationDto.JSON_PROPERTY_IS_COMPLETED,
  MetadataOperationDto.JSON_PROPERTY_ERROR,
  MetadataOperationDto.JSON_PROPERTY_TEMPLATE_IDS
})

public class MetadataOperationDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  @javax.annotation.Nullable  private Double progress;

  public static final String JSON_PROPERTY_IS_COMPLETED = "isCompleted";
  @javax.annotation.Nullable  private Boolean isCompleted;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TEMPLATE_IDS = "templateIds";
  @javax.annotation.Nullable  private JsonNullable<List<Integer>> templateIds = JsonNullable.<List<Integer>>undefined();

  public MetadataOperationDto() {
  }


  public MetadataOperationDto id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The operation ID.
   * @return id
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
  }

  public MetadataOperationDto progress(@javax.annotation.Nullable Double progress) {
    
    this.progress = progress;
    return this;
  }

  /**
   * The operation progress percentage.
   * @return progress
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROGRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getProgress() {
    return progress;
  }


  @JsonProperty(value = JSON_PROPERTY_PROGRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgress(@javax.annotation.Nullable Double progress) {
    this.progress = progress;
  }

  public MetadataOperationDto isCompleted(@javax.annotation.Nullable Boolean isCompleted) {
    
    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Specifies if the operation is completed.
   * @return isCompleted
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_COMPLETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCompleted() {
    return isCompleted;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_COMPLETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCompleted(@javax.annotation.Nullable Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public MetadataOperationDto error(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
    
    return this;
  }

  /**
   * The operation error message.
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

  public MetadataOperationDto templateIds(@javax.annotation.Nullable List<Integer> templateIds) {
    this.templateIds = JsonNullable.<List<Integer>>of(templateIds);
    
    return this;
  }

  public MetadataOperationDto addTemplateIdsItem(Integer templateIdsItem) {
    if (this.templateIds == null || !this.templateIds.isPresent()) {
      this.templateIds = JsonNullable.<List<Integer>>of(new ArrayList<>());
    }
    try {
      this.templateIds.get().add(templateIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The IDs of the metadata templates the operation propagates to the subtree. Empty when there is no operation to  report, so the answer describes nothing in progress.
   * @return templateIds
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<Integer> getTemplateIds() {
        return templateIds.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Integer>> getTemplateIds_JsonNullable() {
    return templateIds;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_IDS)
  public void setTemplateIds_JsonNullable(JsonNullable<List<Integer>> templateIds) {
    this.templateIds = templateIds;
  }

  public void setTemplateIds(@javax.annotation.Nullable List<Integer> templateIds) {
    this.templateIds = JsonNullable.<List<Integer>>of(templateIds);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataOperationDto metadataOperationDto = (MetadataOperationDto) o;
    return equalsNullable(this.id, metadataOperationDto.id) &&
        Objects.equals(this.progress, metadataOperationDto.progress) &&
        Objects.equals(this.isCompleted, metadataOperationDto.isCompleted) &&
        equalsNullable(this.error, metadataOperationDto.error) &&
        equalsNullable(this.templateIds, metadataOperationDto.templateIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), progress, isCompleted, hashCodeNullable(error), hashCodeNullable(templateIds));
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
    sb.append("class MetadataOperationDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
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

    // add `progress` to the URL query string
    if (getProgress() != null) {
      try {
        joiner.add(String.format("%sprogress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProgress()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `templateIds` to the URL query string
    if (getTemplateIds() != null) {
      for (int i = 0; i < getTemplateIds().size(); i++) {
        try {
          joiner.add(String.format("%stemplateIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTemplateIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

