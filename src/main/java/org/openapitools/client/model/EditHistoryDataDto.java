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
import java.net.URI;
import org.openapitools.client.model.EditHistoryUrl;
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
 * The file editing history data.
 */
@JsonPropertyOrder({
  EditHistoryDataDto.JSON_PROPERTY_CHANGES_URL,
  EditHistoryDataDto.JSON_PROPERTY_KEY,
  EditHistoryDataDto.JSON_PROPERTY_PREVIOUS,
  EditHistoryDataDto.JSON_PROPERTY_TOKEN,
  EditHistoryDataDto.JSON_PROPERTY_URL,
  EditHistoryDataDto.JSON_PROPERTY_VERSION,
  EditHistoryDataDto.JSON_PROPERTY_FILE_TYPE
})

public class EditHistoryDataDto {
  public static final String JSON_PROPERTY_CHANGES_URL = "changesUrl";
  @javax.annotation.Nullable  private JsonNullable<URI> changesUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private String key;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  @javax.annotation.Nullable  private EditHistoryUrl previous;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable  private JsonNullable<String> token = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable  private URI url;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull  private Integer version;

  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  @javax.annotation.Nullable  private String fileType;

  public EditHistoryDataDto() {
  }


  public EditHistoryDataDto changesUrl(@javax.annotation.Nullable URI changesUrl) {
    this.changesUrl = JsonNullable.<URI>of(changesUrl);
    
    return this;
  }

  /**
   * The URL address of the file with the document changes data.
   * @return changesUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getChangesUrl() {
        return changesUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CHANGES_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<URI> getChangesUrl_JsonNullable() {
    return changesUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANGES_URL)
  public void setChangesUrl_JsonNullable(JsonNullable<URI> changesUrl) {
    this.changesUrl = changesUrl;
  }

  public void setChangesUrl(@javax.annotation.Nullable URI changesUrl) {
    this.changesUrl = JsonNullable.<URI>of(changesUrl);
  }

  public EditHistoryDataDto key(@javax.annotation.Nullable String key) {
    
    this.key = key;
    return this;
  }

  /**
   * The document identifier used to unambiguously identify the document file.
   * @return key
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }

  public EditHistoryDataDto previous(@javax.annotation.Nullable EditHistoryUrl previous) {
    
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PREVIOUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EditHistoryUrl getPrevious() {
    return previous;
  }


  @JsonProperty(value = JSON_PROPERTY_PREVIOUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevious(@javax.annotation.Nullable EditHistoryUrl previous) {
    this.previous = previous;
  }

  public EditHistoryDataDto token(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
    
    return this;
  }

  /**
   * The encrypted signature added to the parameter in the form of a token.
   * @return token
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getToken() {
        return token.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TOKEN, required = false)
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

  public EditHistoryDataDto url(@javax.annotation.Nullable URI url) {
    
    this.url = url;
    return this;
  }

  /**
   * The URL address of the current document version.
   * @return url
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getUrl() {
    return url;
  }


  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(@javax.annotation.Nullable URI url) {
    this.url = url;
  }

  public EditHistoryDataDto version(@javax.annotation.Nonnull Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The document version number.
   * @return version
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull Integer version) {
    this.version = version;
  }

  public EditHistoryDataDto fileType(@javax.annotation.Nullable String fileType) {
    
    this.fileType = fileType;
    return this;
  }

  /**
   * The document extension.
   * @return fileType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileType() {
    return fileType;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileType(@javax.annotation.Nullable String fileType) {
    this.fileType = fileType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditHistoryDataDto editHistoryDataDto = (EditHistoryDataDto) o;
    return equalsNullable(this.changesUrl, editHistoryDataDto.changesUrl) &&
        Objects.equals(this.key, editHistoryDataDto.key) &&
        Objects.equals(this.previous, editHistoryDataDto.previous) &&
        equalsNullable(this.token, editHistoryDataDto.token) &&
        Objects.equals(this.url, editHistoryDataDto.url) &&
        Objects.equals(this.version, editHistoryDataDto.version) &&
        Objects.equals(this.fileType, editHistoryDataDto.fileType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(changesUrl), key, previous, hashCodeNullable(token), url, version, fileType);
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
    sb.append("class EditHistoryDataDto {\n");
    sb.append("    changesUrl: ").append(toIndentedString(changesUrl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

    // add `changesUrl` to the URL query string
    if (getChangesUrl() != null) {
      try {
        joiner.add(String.format("%schangesUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChangesUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `previous` to the URL query string
    if (getPrevious() != null) {
      joiner.add(getPrevious().toUrlQueryString(prefix + "previous" + suffix));
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `fileType` to the URL query string
    if (getFileType() != null) {
      try {
        joiner.add(String.format("%sfileType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

