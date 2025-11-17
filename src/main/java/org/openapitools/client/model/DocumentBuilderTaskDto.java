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
import org.openapitools.client.model.DistributedTaskStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The Document Builder task parameters.
 */
@JsonPropertyOrder({
  DocumentBuilderTaskDto.JSON_PROPERTY_ID,
  DocumentBuilderTaskDto.JSON_PROPERTY_ERROR,
  DocumentBuilderTaskDto.JSON_PROPERTY_PERCENTAGE,
  DocumentBuilderTaskDto.JSON_PROPERTY_IS_COMPLETED,
  DocumentBuilderTaskDto.JSON_PROPERTY_STATUS,
  DocumentBuilderTaskDto.JSON_PROPERTY_RESULT_FILE_ID,
  DocumentBuilderTaskDto.JSON_PROPERTY_RESULT_FILE_NAME,
  DocumentBuilderTaskDto.JSON_PROPERTY_RESULT_FILE_URL
})

public class DocumentBuilderTaskDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private String error;

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  @javax.annotation.Nonnull
  private Integer percentage;

  public static final String JSON_PROPERTY_IS_COMPLETED = "isCompleted";
  @javax.annotation.Nonnull
  private Boolean isCompleted;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private DistributedTaskStatus status;

  public static final String JSON_PROPERTY_RESULT_FILE_ID = "resultFileId";
  @javax.annotation.Nullable
  private Object resultFileId = null;

  public static final String JSON_PROPERTY_RESULT_FILE_NAME = "resultFileName";
  @javax.annotation.Nullable
  private String resultFileName;

  public static final String JSON_PROPERTY_RESULT_FILE_URL = "resultFileUrl";
  @javax.annotation.Nullable
  private String resultFileUrl;

  public DocumentBuilderTaskDto() {
  }

  public DocumentBuilderTaskDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The Document Builder task ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public DocumentBuilderTaskDto error(@javax.annotation.Nullable String error) {
    
    this.error = error;
    return this;
  }

  /**
   * The error message occurred during the document building process.
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(@javax.annotation.Nullable String error) {
    this.error = error;
  }

  public DocumentBuilderTaskDto percentage(@javax.annotation.Nonnull Integer percentage) {
    
    this.percentage = percentage;
    return this;
  }

  /**
   * The progress percentage of the document building process.
   * @return percentage
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPercentage() {
    return percentage;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercentage(@javax.annotation.Nonnull Integer percentage) {
    this.percentage = percentage;
  }

  public DocumentBuilderTaskDto isCompleted(@javax.annotation.Nonnull Boolean isCompleted) {
    
    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Specifies whether the document building process is completed or not.
   * @return isCompleted
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsCompleted() {
    return isCompleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsCompleted(@javax.annotation.Nonnull Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public DocumentBuilderTaskDto status(@javax.annotation.Nonnull DistributedTaskStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DistributedTaskStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull DistributedTaskStatus status) {
    this.status = status;
  }

  public DocumentBuilderTaskDto resultFileId(@javax.annotation.Nullable Object resultFileId) {
    
    this.resultFileId = resultFileId;
    return this;
  }

  /**
   * The result file ID.
   * @return resultFileId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getResultFileId() {
    return resultFileId;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultFileId(@javax.annotation.Nullable Object resultFileId) {
    this.resultFileId = resultFileId;
  }

  public DocumentBuilderTaskDto resultFileName(@javax.annotation.Nullable String resultFileName) {
    
    this.resultFileName = resultFileName;
    return this;
  }

  /**
   * The result file name.
   * @return resultFileName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResultFileName() {
    return resultFileName;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultFileName(@javax.annotation.Nullable String resultFileName) {
    this.resultFileName = resultFileName;
  }

  public DocumentBuilderTaskDto resultFileUrl(@javax.annotation.Nullable String resultFileUrl) {
    
    this.resultFileUrl = resultFileUrl;
    return this;
  }

  /**
   * The result file URL.
   * @return resultFileUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResultFileUrl() {
    return resultFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultFileUrl(@javax.annotation.Nullable String resultFileUrl) {
    this.resultFileUrl = resultFileUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBuilderTaskDto documentBuilderTaskDto = (DocumentBuilderTaskDto) o;
    return Objects.equals(this.id, documentBuilderTaskDto.id) &&
        Objects.equals(this.error, documentBuilderTaskDto.error) &&
        Objects.equals(this.percentage, documentBuilderTaskDto.percentage) &&
        Objects.equals(this.isCompleted, documentBuilderTaskDto.isCompleted) &&
        Objects.equals(this.status, documentBuilderTaskDto.status) &&
        Objects.equals(this.resultFileId, documentBuilderTaskDto.resultFileId) &&
        Objects.equals(this.resultFileName, documentBuilderTaskDto.resultFileName) &&
        Objects.equals(this.resultFileUrl, documentBuilderTaskDto.resultFileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, error, percentage, isCompleted, status, resultFileId, resultFileName, resultFileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBuilderTaskDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resultFileId: ").append(toIndentedString(resultFileId)).append("\n");
    sb.append("    resultFileName: ").append(toIndentedString(resultFileName)).append("\n");
    sb.append("    resultFileUrl: ").append(toIndentedString(resultFileUrl)).append("\n");
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

    // add `resultFileId` to the URL query string
    if (getResultFileId() != null) {
      try {
        joiner.add(String.format("%sresultFileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResultFileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resultFileName` to the URL query string
    if (getResultFileName() != null) {
      try {
        joiner.add(String.format("%sresultFileName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResultFileName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resultFileUrl` to the URL query string
    if (getResultFileUrl() != null) {
      try {
        joiner.add(String.format("%sresultFileUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResultFileUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

