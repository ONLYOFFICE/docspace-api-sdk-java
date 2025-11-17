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
import org.openapitools.client.model.ApiDateTime;
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
 * The session request parameters.
 */
@JsonPropertyOrder({
  SessionRequest.JSON_PROPERTY_FILE_NAME,
  SessionRequest.JSON_PROPERTY_FILE_SIZE,
  SessionRequest.JSON_PROPERTY_RELATIVE_PATH,
  SessionRequest.JSON_PROPERTY_CREATE_ON,
  SessionRequest.JSON_PROPERTY_ENCRYPTED,
  SessionRequest.JSON_PROPERTY_CREATE_NEW_IF_EXIST
})

public class SessionRequest {
  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @javax.annotation.Nullable
  private String fileName;

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  @javax.annotation.Nullable
  private Long fileSize;

  public static final String JSON_PROPERTY_RELATIVE_PATH = "relativePath";
  @javax.annotation.Nullable
  private JsonNullable<String> relativePath = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATE_ON = "createOn";
  @javax.annotation.Nullable
  private ApiDateTime createOn;

  public static final String JSON_PROPERTY_ENCRYPTED = "encrypted";
  @javax.annotation.Nullable
  private Boolean encrypted;

  public static final String JSON_PROPERTY_CREATE_NEW_IF_EXIST = "createNewIfExist";
  @javax.annotation.Nullable
  private Boolean createNewIfExist;

  public SessionRequest() {
  }

  public SessionRequest fileName(@javax.annotation.Nullable String fileName) {
    
    this.fileName = fileName;
    return this;
  }

  /**
   * The file name.
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

  public SessionRequest fileSize(@javax.annotation.Nullable Long fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

  /**
   * The file size.
   * @return fileSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(@javax.annotation.Nullable Long fileSize) {
    this.fileSize = fileSize;
  }

  public SessionRequest relativePath(@javax.annotation.Nullable String relativePath) {
    this.relativePath = JsonNullable.<String>of(relativePath);
    
    return this;
  }

  /**
   * The relative path to the file.
   * @return relativePath
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRelativePath() {
        return relativePath.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRelativePath_JsonNullable() {
    return relativePath;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATIVE_PATH)
  public void setRelativePath_JsonNullable(JsonNullable<String> relativePath) {
    this.relativePath = relativePath;
  }

  public void setRelativePath(@javax.annotation.Nullable String relativePath) {
    this.relativePath = JsonNullable.<String>of(relativePath);
  }

  public SessionRequest createOn(@javax.annotation.Nullable ApiDateTime createOn) {
    
    this.createOn = createOn;
    return this;
  }

  /**
   * Get createOn
   * @return createOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getCreateOn() {
    return createOn;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateOn(@javax.annotation.Nullable ApiDateTime createOn) {
    this.createOn = createOn;
  }

  public SessionRequest encrypted(@javax.annotation.Nullable Boolean encrypted) {
    
    this.encrypted = encrypted;
    return this;
  }

  /**
   * Specifies whether the file is encrypted or not.
   * @return encrypted
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCRYPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEncrypted() {
    return encrypted;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncrypted(@javax.annotation.Nullable Boolean encrypted) {
    this.encrypted = encrypted;
  }

  public SessionRequest createNewIfExist(@javax.annotation.Nullable Boolean createNewIfExist) {
    
    this.createNewIfExist = createNewIfExist;
    return this;
  }

  /**
   * Specifies whether to create a new file if it already exists.
   * @return createNewIfExist
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_NEW_IF_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateNewIfExist() {
    return createNewIfExist;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_NEW_IF_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateNewIfExist(@javax.annotation.Nullable Boolean createNewIfExist) {
    this.createNewIfExist = createNewIfExist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionRequest sessionRequest = (SessionRequest) o;
    return Objects.equals(this.fileName, sessionRequest.fileName) &&
        Objects.equals(this.fileSize, sessionRequest.fileSize) &&
        equalsNullable(this.relativePath, sessionRequest.relativePath) &&
        Objects.equals(this.createOn, sessionRequest.createOn) &&
        Objects.equals(this.encrypted, sessionRequest.encrypted) &&
        Objects.equals(this.createNewIfExist, sessionRequest.createNewIfExist);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileSize, hashCodeNullable(relativePath), createOn, encrypted, createNewIfExist);
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
    sb.append("class SessionRequest {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
    sb.append("    createOn: ").append(toIndentedString(createOn)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    createNewIfExist: ").append(toIndentedString(createNewIfExist)).append("\n");
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

    // add `fileName` to the URL query string
    if (getFileName() != null) {
      try {
        joiner.add(String.format("%sfileName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileSize` to the URL query string
    if (getFileSize() != null) {
      try {
        joiner.add(String.format("%sfileSize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `relativePath` to the URL query string
    if (getRelativePath() != null) {
      try {
        joiner.add(String.format("%srelativePath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRelativePath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createOn` to the URL query string
    if (getCreateOn() != null) {
      joiner.add(getCreateOn().toUrlQueryString(prefix + "createOn" + suffix));
    }

    // add `encrypted` to the URL query string
    if (getEncrypted() != null) {
      try {
        joiner.add(String.format("%sencrypted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncrypted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createNewIfExist` to the URL query string
    if (getCreateNewIfExist() != null) {
      try {
        joiner.add(String.format("%screateNewIfExist%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateNewIfExist()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

