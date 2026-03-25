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
 * ContentDisposition
 */
@JsonPropertyOrder({
  ContentDisposition.JSON_PROPERTY_DISPOSITION_TYPE,
  ContentDisposition.JSON_PROPERTY_PARAMETERS,
  ContentDisposition.JSON_PROPERTY_FILE_NAME,
  ContentDisposition.JSON_PROPERTY_CREATION_DATE,
  ContentDisposition.JSON_PROPERTY_MODIFICATION_DATE,
  ContentDisposition.JSON_PROPERTY_INLINE,
  ContentDisposition.JSON_PROPERTY_READ_DATE,
  ContentDisposition.JSON_PROPERTY_SIZE
})

public class ContentDisposition {
  public static final String JSON_PROPERTY_DISPOSITION_TYPE = "dispositionType";
  @javax.annotation.Nullable  private JsonNullable<String> dispositionType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @javax.annotation.Nullable  private JsonNullable<List<Object>> parameters = JsonNullable.<List<Object>>undefined();

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @javax.annotation.Nullable  private JsonNullable<String> fileName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  @javax.annotation.Nullable  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_MODIFICATION_DATE = "modificationDate";
  @javax.annotation.Nullable  private OffsetDateTime modificationDate;

  public static final String JSON_PROPERTY_INLINE = "inline";
  @javax.annotation.Nullable  private Boolean inline;

  public static final String JSON_PROPERTY_READ_DATE = "readDate";
  @javax.annotation.Nullable  private OffsetDateTime readDate;

  public static final String JSON_PROPERTY_SIZE = "size";
  @javax.annotation.Nullable  private Long size;

  public ContentDisposition() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ContentDisposition(
    @JsonProperty(JSON_PROPERTY_PARAMETERS) List<Object> parameters
  ) {
    this();
    this.parameters = parameters == null ? JsonNullable.<List<Object>>undefined() : JsonNullable.of(parameters);
  }


  public ContentDisposition dispositionType(@javax.annotation.Nullable String dispositionType) {
    this.dispositionType = JsonNullable.<String>of(dispositionType);
    
    return this;
  }

  /**
   * Get dispositionType
   * @return dispositionType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDispositionType() {
        return dispositionType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DISPOSITION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDispositionType_JsonNullable() {
    return dispositionType;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPOSITION_TYPE)
  public void setDispositionType_JsonNullable(JsonNullable<String> dispositionType) {
    this.dispositionType = dispositionType;
  }

  public void setDispositionType(@javax.annotation.Nullable String dispositionType) {
    this.dispositionType = JsonNullable.<String>of(dispositionType);
  }

  /**
   * Get parameters
   * @return parameters
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<Object> getParameters() {
    
    if (parameters == null) {
      parameters = JsonNullable.<List<Object>>undefined();
    }
    return parameters.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Object>> getParameters_JsonNullable() {
    return parameters;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  private void setParameters_JsonNullable(JsonNullable<List<Object>> parameters) {
    this.parameters = parameters;
  }


  public ContentDisposition fileName(@javax.annotation.Nullable String fileName) {
    this.fileName = JsonNullable.<String>of(fileName);
    
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFileName() {
        return fileName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFileName_JsonNullable() {
    return fileName;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  public void setFileName_JsonNullable(JsonNullable<String> fileName) {
    this.fileName = fileName;
  }

  public void setFileName(@javax.annotation.Nullable String fileName) {
    this.fileName = JsonNullable.<String>of(fileName);
  }

  public ContentDisposition creationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ContentDisposition modificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
    
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * Get modificationDate
   * @return modificationDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MODIFICATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }


  @JsonProperty(value = JSON_PROPERTY_MODIFICATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }

  public ContentDisposition inline(@javax.annotation.Nullable Boolean inline) {
    
    this.inline = inline;
    return this;
  }

  /**
   * Get inline
   * @return inline
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INLINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInline() {
    return inline;
  }


  @JsonProperty(value = JSON_PROPERTY_INLINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInline(@javax.annotation.Nullable Boolean inline) {
    this.inline = inline;
  }

  public ContentDisposition readDate(@javax.annotation.Nullable OffsetDateTime readDate) {
    
    this.readDate = readDate;
    return this;
  }

  /**
   * Get readDate
   * @return readDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_READ_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReadDate() {
    return readDate;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadDate(@javax.annotation.Nullable OffsetDateTime readDate) {
    this.readDate = readDate;
  }

  public ContentDisposition size(@javax.annotation.Nullable Long size) {
    
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(value = JSON_PROPERTY_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(@javax.annotation.Nullable Long size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentDisposition contentDisposition = (ContentDisposition) o;
    return equalsNullable(this.dispositionType, contentDisposition.dispositionType) &&
        equalsNullable(this.parameters, contentDisposition.parameters) &&
        equalsNullable(this.fileName, contentDisposition.fileName) &&
        Objects.equals(this.creationDate, contentDisposition.creationDate) &&
        Objects.equals(this.modificationDate, contentDisposition.modificationDate) &&
        Objects.equals(this.inline, contentDisposition.inline) &&
        Objects.equals(this.readDate, contentDisposition.readDate) &&
        Objects.equals(this.size, contentDisposition.size);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dispositionType), hashCodeNullable(parameters), hashCodeNullable(fileName), creationDate, modificationDate, inline, readDate, size);
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
    sb.append("class ContentDisposition {\n");
    sb.append("    dispositionType: ").append(toIndentedString(dispositionType)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
    sb.append("    readDate: ").append(toIndentedString(readDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

    // add `dispositionType` to the URL query string
    if (getDispositionType() != null) {
      try {
        joiner.add(String.format("%sdispositionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDispositionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `parameters` to the URL query string
    if (getParameters() != null) {
      for (int i = 0; i < getParameters().size(); i++) {
        try {
          joiner.add(String.format("%sparameters%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getParameters().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `creationDate` to the URL query string
    if (getCreationDate() != null) {
      try {
        joiner.add(String.format("%screationDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreationDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modificationDate` to the URL query string
    if (getModificationDate() != null) {
      try {
        joiner.add(String.format("%smodificationDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModificationDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `inline` to the URL query string
    if (getInline() != null) {
      try {
        joiner.add(String.format("%sinline%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInline()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `readDate` to the URL query string
    if (getReadDate() != null) {
      try {
        joiner.add(String.format("%sreadDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReadDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      try {
        joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

