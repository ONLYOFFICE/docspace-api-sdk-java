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
import org.openapitools.client.model.MigrationApiInfo;
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
 * The migration status parameters.
 */
@JsonPropertyOrder({
  MigrationStatusDto.JSON_PROPERTY_PROGRESS,
  MigrationStatusDto.JSON_PROPERTY_ERROR,
  MigrationStatusDto.JSON_PROPERTY_PARSE_RESULT,
  MigrationStatusDto.JSON_PROPERTY_IS_COMPLETED
})

public class MigrationStatusDto {
  public static final String JSON_PROPERTY_PROGRESS = "progress";
  @javax.annotation.Nullable  private Double progress;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARSE_RESULT = "parseResult";
  @javax.annotation.Nullable  private MigrationApiInfo parseResult;

  public static final String JSON_PROPERTY_IS_COMPLETED = "isCompleted";
  @javax.annotation.Nullable  private Boolean isCompleted;

  public MigrationStatusDto() {
  }


  public MigrationStatusDto progress(@javax.annotation.Nullable Double progress) {
    
    this.progress = progress;
    return this;
  }

  /**
   * The migration progress.
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

  public MigrationStatusDto error(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
    
    return this;
  }

  /**
   * The migration error.
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

  public MigrationStatusDto parseResult(@javax.annotation.Nullable MigrationApiInfo parseResult) {
    
    this.parseResult = parseResult;
    return this;
  }

  /**
   * Get parseResult
   * @return parseResult
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PARSE_RESULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MigrationApiInfo getParseResult() {
    return parseResult;
  }


  @JsonProperty(value = JSON_PROPERTY_PARSE_RESULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParseResult(@javax.annotation.Nullable MigrationApiInfo parseResult) {
    this.parseResult = parseResult;
  }

  public MigrationStatusDto isCompleted(@javax.annotation.Nullable Boolean isCompleted) {
    
    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Specifies whether the migration is completed or not.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationStatusDto migrationStatusDto = (MigrationStatusDto) o;
    return Objects.equals(this.progress, migrationStatusDto.progress) &&
        equalsNullable(this.error, migrationStatusDto.error) &&
        Objects.equals(this.parseResult, migrationStatusDto.parseResult) &&
        Objects.equals(this.isCompleted, migrationStatusDto.isCompleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(progress, hashCodeNullable(error), parseResult, isCompleted);
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
    sb.append("class MigrationStatusDto {\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    parseResult: ").append(toIndentedString(parseResult)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
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

    // add `parseResult` to the URL query string
    if (getParseResult() != null) {
      joiner.add(getParseResult().toUrlQueryString(prefix + "parseResult" + suffix));
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

    return joiner.toString();
  }

}

