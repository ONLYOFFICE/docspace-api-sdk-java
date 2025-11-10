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
 * The parameters for checking file conversion.
 */
@JsonPropertyOrder({
  CheckConversionRequestDtoInteger.JSON_PROPERTY_FILE_ID,
  CheckConversionRequestDtoInteger.JSON_PROPERTY_SYNC,
  CheckConversionRequestDtoInteger.JSON_PROPERTY_START_CONVERT,
  CheckConversionRequestDtoInteger.JSON_PROPERTY_VERSION,
  CheckConversionRequestDtoInteger.JSON_PROPERTY_PASSWORD,
  CheckConversionRequestDtoInteger.JSON_PROPERTY_OUTPUT_TYPE,
  CheckConversionRequestDtoInteger.JSON_PROPERTY_CREATE_NEW_IF_EXIST
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class CheckConversionRequestDtoInteger {
  public static final String JSON_PROPERTY_FILE_ID = "fileId";
  @javax.annotation.Nullable
  private Integer fileId;

  public static final String JSON_PROPERTY_SYNC = "sync";
  @javax.annotation.Nullable
  private Boolean sync;

  public static final String JSON_PROPERTY_START_CONVERT = "startConvert";
  @javax.annotation.Nullable
  private Boolean startConvert;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OUTPUT_TYPE = "outputType";
  @javax.annotation.Nullable
  private JsonNullable<String> outputType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATE_NEW_IF_EXIST = "createNewIfExist";
  @javax.annotation.Nullable
  private Boolean createNewIfExist;

  public CheckConversionRequestDtoInteger() {
  }

  public CheckConversionRequestDtoInteger fileId(@javax.annotation.Nullable Integer fileId) {
    
    this.fileId = fileId;
    return this;
  }

  /**
   * The file ID to check conversion proccess.
   * @return fileId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileId() {
    return fileId;
  }


  @JsonProperty(JSON_PROPERTY_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileId(@javax.annotation.Nullable Integer fileId) {
    this.fileId = fileId;
  }

  public CheckConversionRequestDtoInteger sync(@javax.annotation.Nullable Boolean sync) {
    
    this.sync = sync;
    return this;
  }

  /**
   * Specifies if the conversion process is synchronous or not.
   * @return sync
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSync() {
    return sync;
  }


  @JsonProperty(JSON_PROPERTY_SYNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSync(@javax.annotation.Nullable Boolean sync) {
    this.sync = sync;
  }

  public CheckConversionRequestDtoInteger startConvert(@javax.annotation.Nullable Boolean startConvert) {
    
    this.startConvert = startConvert;
    return this;
  }

  /**
   * Specifies whether to start a conversion process or not.
   * @return startConvert
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_CONVERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStartConvert() {
    return startConvert;
  }


  @JsonProperty(JSON_PROPERTY_START_CONVERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartConvert(@javax.annotation.Nullable Boolean startConvert) {
    this.startConvert = startConvert;
  }

  public CheckConversionRequestDtoInteger version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The file version that is converted.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }

  public CheckConversionRequestDtoInteger password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The password of the converted file.
   * @return password
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
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

  public CheckConversionRequestDtoInteger outputType(@javax.annotation.Nullable String outputType) {
    this.outputType = JsonNullable.<String>of(outputType);
    
    return this;
  }

  /**
   * The conversion output type.
   * @return outputType
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOutputType() {
        return outputType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTPUT_TYPE)
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

  public CheckConversionRequestDtoInteger createNewIfExist(@javax.annotation.Nullable Boolean createNewIfExist) {
    
    this.createNewIfExist = createNewIfExist;
    return this;
  }

  /**
   * Specifies whether to create a new file if it exists or not.
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
    CheckConversionRequestDtoInteger checkConversionRequestDtoInteger = (CheckConversionRequestDtoInteger) o;
    return Objects.equals(this.fileId, checkConversionRequestDtoInteger.fileId) &&
        Objects.equals(this.sync, checkConversionRequestDtoInteger.sync) &&
        Objects.equals(this.startConvert, checkConversionRequestDtoInteger.startConvert) &&
        Objects.equals(this.version, checkConversionRequestDtoInteger.version) &&
        equalsNullable(this.password, checkConversionRequestDtoInteger.password) &&
        equalsNullable(this.outputType, checkConversionRequestDtoInteger.outputType) &&
        Objects.equals(this.createNewIfExist, checkConversionRequestDtoInteger.createNewIfExist);
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
    sb.append("class CheckConversionRequestDtoInteger {\n");
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

