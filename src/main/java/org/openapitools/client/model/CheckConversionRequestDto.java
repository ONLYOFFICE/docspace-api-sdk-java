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
 * The parameters of one file conversion.
 */
@JsonPropertyOrder({
  CheckConversionRequestDto.JSON_PROPERTY_FILE_ID,
  CheckConversionRequestDto.JSON_PROPERTY_SYNC,
  CheckConversionRequestDto.JSON_PROPERTY_START_CONVERT,
  CheckConversionRequestDto.JSON_PROPERTY_VERSION,
  CheckConversionRequestDto.JSON_PROPERTY_PASSWORD,
  CheckConversionRequestDto.JSON_PROPERTY_OUTPUT_TYPE,
  CheckConversionRequestDto.JSON_PROPERTY_CREATE_NEW_IF_EXIST
})

public class CheckConversionRequestDto {
  public static final String JSON_PROPERTY_FILE_ID = "fileId";
  @javax.annotation.Nullable  private Integer fileId;

  public static final String JSON_PROPERTY_SYNC = "sync";
  @javax.annotation.Nullable  private Boolean sync;

  public static final String JSON_PROPERTY_START_CONVERT = "startConvert";
  @javax.annotation.Nullable  private Boolean startConvert;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable  private Integer version;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OUTPUT_TYPE = "outputType";
  @javax.annotation.Nullable  private JsonNullable<String> outputType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATE_NEW_IF_EXIST = "createNewIfExist";
  @javax.annotation.Nullable  private Boolean createNewIfExist;

  public CheckConversionRequestDto() {
  }


  public CheckConversionRequestDto fileId(@javax.annotation.Nullable Integer fileId) {
    
    this.fileId = fileId;
    return this;
  }

  /**
   * The file to convert. It is taken from the route of the operation, so a value sent in the body is overwritten.
   * @return fileId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileId() {
    return fileId;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileId(@javax.annotation.Nullable Integer fileId) {
    this.fileId = fileId;
  }

  public CheckConversionRequestDto sync(@javax.annotation.Nullable Boolean sync) {
    
    this.sync = sync;
    return this;
  }

  /**
   * How to wait for the result: `true` converts inside the request and answers with the finished result, which is  only sensible for small documents, while `false` queues the conversion and answers with an entry to poll.
   * @return sync
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SYNC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSync() {
    return sync;
  }


  @JsonProperty(value = JSON_PROPERTY_SYNC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSync(@javax.annotation.Nullable Boolean sync) {
    this.sync = sync;
  }

  public CheckConversionRequestDto startConvert(@javax.annotation.Nullable Boolean startConvert) {
    
    this.startConvert = startConvert;
    return this;
  }

  /**
   * Whether the conversion is to be started. It is set by the operation itself, so a value sent in the body is  overwritten.
   * @return startConvert
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_START_CONVERT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStartConvert() {
    return startConvert;
  }


  @JsonProperty(value = JSON_PROPERTY_START_CONVERT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartConvert(@javax.annotation.Nullable Boolean startConvert) {
    this.startConvert = startConvert;
  }

  public CheckConversionRequestDto version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version to convert; 0 or less means the current version.
   * @return version
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }

  public CheckConversionRequestDto password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The password that opens the source document, for a file that is protected by one; anything else may be left  out.
   * @return password
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
  }

  public CheckConversionRequestDto outputType(@javax.annotation.Nullable String outputType) {
    this.outputType = JsonNullable.<String>of(outputType);
    
    return this;
  }

  /**
   * The extension of the format to convert into, without the dot, and one the portal can produce from that  source format; left out, the default of the portal for that kind of document is used.
   * @return outputType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOutputType() {
        return outputType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OUTPUT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOutputType_JsonNullable() {
    return outputType;
  }
  
  @JsonProperty(JSON_PROPERTY_OUTPUT_TYPE)
  public void setOutputType_JsonNullable(JsonNullable<String> outputType) {
    this.outputType = outputType;
  }

  public void setOutputType(@javax.annotation.Nullable String outputType) {
    this.outputType = JsonNullable.<String>of(outputType);
  }

  public CheckConversionRequestDto createNewIfExist(@javax.annotation.Nullable Boolean createNewIfExist) {
    
    this.createNewIfExist = createNewIfExist;
    return this;
  }

  /**
   * Where the result goes when the file has been converted before: `true` creates another file beside the source,  `false` replaces the converted file that already exists.
   * @return createNewIfExist
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATE_NEW_IF_EXIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateNewIfExist() {
    return createNewIfExist;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_NEW_IF_EXIST, required = false)
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
    CheckConversionRequestDto checkConversionRequestDto = (CheckConversionRequestDto) o;
    return Objects.equals(this.fileId, checkConversionRequestDto.fileId) &&
        Objects.equals(this.sync, checkConversionRequestDto.sync) &&
        Objects.equals(this.startConvert, checkConversionRequestDto.startConvert) &&
        Objects.equals(this.version, checkConversionRequestDto.version) &&
        equalsNullable(this.password, checkConversionRequestDto.password) &&
        equalsNullable(this.outputType, checkConversionRequestDto.outputType) &&
        Objects.equals(this.createNewIfExist, checkConversionRequestDto.createNewIfExist);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, sync, startConvert, version, hashCodeNullable(password), hashCodeNullable(outputType), createNewIfExist);
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
    sb.append("class CheckConversionRequestDto {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
    sb.append("    startConvert: ").append(toIndentedString(startConvert)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
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

    // add `fileId` to the URL query string
    if (getFileId() != null) {
      try {
        joiner.add(String.format("%sfileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sync` to the URL query string
    if (getSync() != null) {
      try {
        joiner.add(String.format("%ssync%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSync()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startConvert` to the URL query string
    if (getStartConvert() != null) {
      try {
        joiner.add(String.format("%sstartConvert%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartConvert()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `outputType` to the URL query string
    if (getOutputType() != null) {
      try {
        joiner.add(String.format("%soutputType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutputType()), "UTF-8").replaceAll("\\+", "%20")));
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

