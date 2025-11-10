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
import java.net.URI;
import org.openapitools.client.model.FileReferenceData;
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
 * The file reference parameters.
 */
@JsonPropertyOrder({
  FileReference.JSON_PROPERTY_REFERENCE_DATA,
  FileReference.JSON_PROPERTY_ERROR,
  FileReference.JSON_PROPERTY_PATH,
  FileReference.JSON_PROPERTY_URL,
  FileReference.JSON_PROPERTY_FILE_TYPE,
  FileReference.JSON_PROPERTY_KEY,
  FileReference.JSON_PROPERTY_LINK,
  FileReference.JSON_PROPERTY_TOKEN
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FileReference {
  public static final String JSON_PROPERTY_REFERENCE_DATA = "referenceData";
  @javax.annotation.Nullable
  private FileReferenceData referenceData;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PATH = "path";
  @javax.annotation.Nullable
  private JsonNullable<String> path = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  @javax.annotation.Nullable
  private JsonNullable<String> fileType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable
  private JsonNullable<String> link = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private JsonNullable<String> token = JsonNullable.<String>undefined();

  public FileReference() {
  }

  public FileReference referenceData(@javax.annotation.Nullable FileReferenceData referenceData) {
    
    this.referenceData = referenceData;
    return this;
  }

  /**
   * Get referenceData
   * @return referenceData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileReferenceData getReferenceData() {
    return referenceData;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceData(@javax.annotation.Nullable FileReferenceData referenceData) {
    this.referenceData = referenceData;
  }

  public FileReference error(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
    
    return this;
  }

  /**
   * The error message text.
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

  public FileReference path(@javax.annotation.Nullable String path) {
    this.path = JsonNullable.<String>of(path);
    
    return this;
  }

  /**
   * The file name or relative path for the formula editor.
   * @return path
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPath() {
        return path.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPath_JsonNullable() {
    return path;
  }
  
  @JsonProperty(JSON_PROPERTY_PATH)
  public void setPath_JsonNullable(JsonNullable<String> path) {
    this.path = path;
  }

  public void setPath(@javax.annotation.Nullable String path) {
    this.path = JsonNullable.<String>of(path);
  }

  public FileReference url(@javax.annotation.Nullable URI url) {
    this.url = JsonNullable.<URI>of(url);
    
    return this;
  }

  /**
   * The URL address to download the current file.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<URI> url) {
    this.url = url;
  }

  public void setUrl(@javax.annotation.Nullable URI url) {
    this.url = JsonNullable.<URI>of(url);
  }

  public FileReference fileType(@javax.annotation.Nullable String fileType) {
    this.fileType = JsonNullable.<String>of(fileType);
    
    return this;
  }

  /**
   * An extension of the document specified with the url parameter.
   * @return fileType
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFileType() {
        return fileType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFileType_JsonNullable() {
    return fileType;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  public void setFileType_JsonNullable(JsonNullable<String> fileType) {
    this.fileType = fileType;
  }

  public void setFileType(@javax.annotation.Nullable String fileType) {
    this.fileType = JsonNullable.<String>of(fileType);
  }

  public FileReference key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The unique document identifier used by the service to take the data from the co-editing session.
   * @return key
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getKey_JsonNullable() {
    return key;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY)
  public void setKey_JsonNullable(JsonNullable<String> key) {
    this.key = key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
  }

  public FileReference link(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
    
    return this;
  }

  /**
   * The file URL.
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

  public FileReference token(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
    
    return this;
  }

  /**
   * The encrypted signature added to the parameter in the form of a token.
   * @return token
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getToken() {
        return token.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getToken_JsonNullable() {
    return token;
  }
  
  @JsonProperty(JSON_PROPERTY_TOKEN)
  public void setToken_JsonNullable(JsonNullable<String> token) {
    this.token = token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileReference fileReference = (FileReference) o;
    return Objects.equals(this.referenceData, fileReference.referenceData) &&
        equalsNullable(this.error, fileReference.error) &&
        equalsNullable(this.path, fileReference.path) &&
        equalsNullable(this.url, fileReference.url) &&
        equalsNullable(this.fileType, fileReference.fileType) &&
        equalsNullable(this.key, fileReference.key) &&
        equalsNullable(this.link, fileReference.link) &&
        equalsNullable(this.token, fileReference.token);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceData, hashCodeNullable(error), hashCodeNullable(path), hashCodeNullable(url), hashCodeNullable(fileType), hashCodeNullable(key), hashCodeNullable(link), hashCodeNullable(token));
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
    sb.append("class FileReference {\n");
    sb.append("    referenceData: ").append(toIndentedString(referenceData)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

    // add `referenceData` to the URL query string
    if (getReferenceData() != null) {
      joiner.add(getReferenceData().toUrlQueryString(prefix + "referenceData" + suffix));
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

    // add `path` to the URL query string
    if (getPath() != null) {
      try {
        joiner.add(String.format("%spath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileType` to the URL query string
    if (getFileType() != null) {
      try {
        joiner.add(String.format("%sfileType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `token` to the URL query string
    if (getToken() != null) {
      try {
        joiner.add(String.format("%stoken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

