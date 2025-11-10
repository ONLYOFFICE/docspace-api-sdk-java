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
import org.openapitools.client.model.FileOperationType;
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
 * The result of file convertion operation.
 */
@JsonPropertyOrder({
  ConversationResultDto.JSON_PROPERTY_ID,
  ConversationResultDto.JSON_PROPERTY_OPERATION,
  ConversationResultDto.JSON_PROPERTY_PROGRESS,
  ConversationResultDto.JSON_PROPERTY_SOURCE,
  ConversationResultDto.JSON_PROPERTY_RESULT,
  ConversationResultDto.JSON_PROPERTY_ERROR,
  ConversationResultDto.JSON_PROPERTY_PROCESSED
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class ConversationResultDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_OPERATION = "Operation";
  @javax.annotation.Nonnull
  private FileOperationType operation;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  @javax.annotation.Nonnull
  private Integer progress;

  public static final String JSON_PROPERTY_SOURCE = "source";
  @javax.annotation.Nullable
  private JsonNullable<String> source = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESULT = "result";
  @javax.annotation.Nullable
  private JsonNullable<Object> result = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESSED = "processed";
  @javax.annotation.Nullable
  private JsonNullable<String> processed = JsonNullable.<String>undefined();

  public ConversationResultDto() {
  }

  public ConversationResultDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The conversion operation ID.
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

  public ConversationResultDto operation(@javax.annotation.Nonnull FileOperationType operation) {
    
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileOperationType getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperation(@javax.annotation.Nonnull FileOperationType operation) {
    this.operation = operation;
  }

  public ConversationResultDto progress(@javax.annotation.Nonnull Integer progress) {
    
    this.progress = progress;
    return this;
  }

  /**
   * The conversion operation progress.
   * @return progress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getProgress() {
    return progress;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProgress(@javax.annotation.Nonnull Integer progress) {
    this.progress = progress;
  }

  public ConversationResultDto source(@javax.annotation.Nullable String source) {
    this.source = JsonNullable.<String>of(source);
    
    return this;
  }

  /**
   * The source file for the conversion.
   * @return source
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSource() {
        return source.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSource_JsonNullable() {
    return source;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE)
  public void setSource_JsonNullable(JsonNullable<String> source) {
    this.source = source;
  }

  public void setSource(@javax.annotation.Nullable String source) {
    this.source = JsonNullable.<String>of(source);
  }

  public ConversationResultDto result(@javax.annotation.Nullable Object result) {
    this.result = JsonNullable.<Object>of(result);
    
    return this;
  }

  /**
   * The resulting file after the conversion.
   * @return result
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getResult() {
        return result.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getResult_JsonNullable() {
    return result;
  }
  
  @JsonProperty(JSON_PROPERTY_RESULT)
  public void setResult_JsonNullable(JsonNullable<Object> result) {
    this.result = result;
  }

  public void setResult(@javax.annotation.Nullable Object result) {
    this.result = JsonNullable.<Object>of(result);
  }

  public ConversationResultDto error(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
    
    return this;
  }

  /**
   * The conversion operation error message.
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

  public ConversationResultDto processed(@javax.annotation.Nullable String processed) {
    this.processed = JsonNullable.<String>of(processed);
    
    return this;
  }

  /**
   * Specifies if the conversion operation is processed or not.
   * @return processed
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProcessed() {
        return processed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROCESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProcessed_JsonNullable() {
    return processed;
  }
  
  @JsonProperty(JSON_PROPERTY_PROCESSED)
  public void setProcessed_JsonNullable(JsonNullable<String> processed) {
    this.processed = processed;
  }

  public void setProcessed(@javax.annotation.Nullable String processed) {
    this.processed = JsonNullable.<String>of(processed);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationResultDto conversationResultDto = (ConversationResultDto) o;
    return Objects.equals(this.id, conversationResultDto.id) &&
        Objects.equals(this.operation, conversationResultDto.operation) &&
        Objects.equals(this.progress, conversationResultDto.progress) &&
        equalsNullable(this.source, conversationResultDto.source) &&
        equalsNullable(this.result, conversationResultDto.result) &&
        equalsNullable(this.error, conversationResultDto.error) &&
        equalsNullable(this.processed, conversationResultDto.processed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operation, progress, hashCodeNullable(source), hashCodeNullable(result), hashCodeNullable(error), hashCodeNullable(processed));
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
    sb.append("class ConversationResultDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
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

    // add `Operation` to the URL query string
    if (getOperation() != null) {
      try {
        joiner.add(String.format("%sOperation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOperation()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `source` to the URL query string
    if (getSource() != null) {
      try {
        joiner.add(String.format("%ssource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSource()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `result` to the URL query string
    if (getResult() != null) {
      try {
        joiner.add(String.format("%sresult%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResult()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `processed` to the URL query string
    if (getProcessed() != null) {
      try {
        joiner.add(String.format("%sprocessed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

