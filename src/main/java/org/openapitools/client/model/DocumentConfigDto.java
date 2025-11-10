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
import org.openapitools.client.model.InfoConfigDto;
import org.openapitools.client.model.Options;
import org.openapitools.client.model.PermissionsConfig;
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
 * The document config parameters.
 */
@JsonPropertyOrder({
  DocumentConfigDto.JSON_PROPERTY_FILE_TYPE,
  DocumentConfigDto.JSON_PROPERTY_INFO,
  DocumentConfigDto.JSON_PROPERTY_IS_LINKED_FOR_ME,
  DocumentConfigDto.JSON_PROPERTY_KEY,
  DocumentConfigDto.JSON_PROPERTY_PERMISSIONS,
  DocumentConfigDto.JSON_PROPERTY_SHARED_LINK_PARAM,
  DocumentConfigDto.JSON_PROPERTY_SHARED_LINK_KEY,
  DocumentConfigDto.JSON_PROPERTY_REFERENCE_DATA,
  DocumentConfigDto.JSON_PROPERTY_TITLE,
  DocumentConfigDto.JSON_PROPERTY_URL,
  DocumentConfigDto.JSON_PROPERTY_IS_FORM,
  DocumentConfigDto.JSON_PROPERTY_OPTIONS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class DocumentConfigDto {
  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  @javax.annotation.Nullable
  private JsonNullable<String> fileType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INFO = "info";
  @javax.annotation.Nullable
  private InfoConfigDto info;

  public static final String JSON_PROPERTY_IS_LINKED_FOR_ME = "isLinkedForMe";
  @javax.annotation.Nullable
  private Boolean isLinkedForMe;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  @javax.annotation.Nullable
  private PermissionsConfig permissions;

  public static final String JSON_PROPERTY_SHARED_LINK_PARAM = "sharedLinkParam";
  @javax.annotation.Nullable
  private JsonNullable<String> sharedLinkParam = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHARED_LINK_KEY = "sharedLinkKey";
  @javax.annotation.Nullable
  private JsonNullable<String> sharedLinkKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REFERENCE_DATA = "referenceData";
  @javax.annotation.Nullable
  private FileReferenceData referenceData;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_IS_FORM = "isForm";
  @javax.annotation.Nullable
  private Boolean isForm;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  @javax.annotation.Nullable
  private Options options;

  public DocumentConfigDto() {
  }

  public DocumentConfigDto fileType(@javax.annotation.Nullable String fileType) {
    this.fileType = JsonNullable.<String>of(fileType);
    
    return this;
  }

  /**
   * The file type of the document.
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

  public DocumentConfigDto info(@javax.annotation.Nullable InfoConfigDto info) {
    
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InfoConfigDto getInfo() {
    return info;
  }


  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(@javax.annotation.Nullable InfoConfigDto info) {
    this.info = info;
  }

  public DocumentConfigDto isLinkedForMe(@javax.annotation.Nullable Boolean isLinkedForMe) {
    
    this.isLinkedForMe = isLinkedForMe;
    return this;
  }

  /**
   * Specifies if the documnet is linked for current user.
   * @return isLinkedForMe
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_LINKED_FOR_ME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLinkedForMe() {
    return isLinkedForMe;
  }


  @JsonProperty(JSON_PROPERTY_IS_LINKED_FOR_ME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLinkedForMe(@javax.annotation.Nullable Boolean isLinkedForMe) {
    this.isLinkedForMe = isLinkedForMe;
  }

  public DocumentConfigDto key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The document key.
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

  public DocumentConfigDto permissions(@javax.annotation.Nullable PermissionsConfig permissions) {
    
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PermissionsConfig getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissions(@javax.annotation.Nullable PermissionsConfig permissions) {
    this.permissions = permissions;
  }

  public DocumentConfigDto sharedLinkParam(@javax.annotation.Nullable String sharedLinkParam) {
    this.sharedLinkParam = JsonNullable.<String>of(sharedLinkParam);
    
    return this;
  }

  /**
   * The shared link parameter of the document.
   * @return sharedLinkParam
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSharedLinkParam() {
        return sharedLinkParam.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARED_LINK_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSharedLinkParam_JsonNullable() {
    return sharedLinkParam;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARED_LINK_PARAM)
  public void setSharedLinkParam_JsonNullable(JsonNullable<String> sharedLinkParam) {
    this.sharedLinkParam = sharedLinkParam;
  }

  public void setSharedLinkParam(@javax.annotation.Nullable String sharedLinkParam) {
    this.sharedLinkParam = JsonNullable.<String>of(sharedLinkParam);
  }

  public DocumentConfigDto sharedLinkKey(@javax.annotation.Nullable String sharedLinkKey) {
    this.sharedLinkKey = JsonNullable.<String>of(sharedLinkKey);
    
    return this;
  }

  /**
   * The shared link key of the document.
   * @return sharedLinkKey
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSharedLinkKey() {
        return sharedLinkKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARED_LINK_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSharedLinkKey_JsonNullable() {
    return sharedLinkKey;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARED_LINK_KEY)
  public void setSharedLinkKey_JsonNullable(JsonNullable<String> sharedLinkKey) {
    this.sharedLinkKey = sharedLinkKey;
  }

  public void setSharedLinkKey(@javax.annotation.Nullable String sharedLinkKey) {
    this.sharedLinkKey = JsonNullable.<String>of(sharedLinkKey);
  }

  public DocumentConfigDto referenceData(@javax.annotation.Nullable FileReferenceData referenceData) {
    
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

  public DocumentConfigDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The document title.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public DocumentConfigDto url(@javax.annotation.Nullable URI url) {
    this.url = JsonNullable.<URI>of(url);
    
    return this;
  }

  /**
   * The document url.
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

  public DocumentConfigDto isForm(@javax.annotation.Nullable Boolean isForm) {
    
    this.isForm = isForm;
    return this;
  }

  /**
   * Indicates whether this is a form.
   * @return isForm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsForm() {
    return isForm;
  }


  @JsonProperty(JSON_PROPERTY_IS_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsForm(@javax.annotation.Nullable Boolean isForm) {
    this.isForm = isForm;
  }

  public DocumentConfigDto options(@javax.annotation.Nullable Options options) {
    
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Options getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(@javax.annotation.Nullable Options options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentConfigDto documentConfigDto = (DocumentConfigDto) o;
    return equalsNullable(this.fileType, documentConfigDto.fileType) &&
        Objects.equals(this.info, documentConfigDto.info) &&
        Objects.equals(this.isLinkedForMe, documentConfigDto.isLinkedForMe) &&
        equalsNullable(this.key, documentConfigDto.key) &&
        Objects.equals(this.permissions, documentConfigDto.permissions) &&
        equalsNullable(this.sharedLinkParam, documentConfigDto.sharedLinkParam) &&
        equalsNullable(this.sharedLinkKey, documentConfigDto.sharedLinkKey) &&
        Objects.equals(this.referenceData, documentConfigDto.referenceData) &&
        equalsNullable(this.title, documentConfigDto.title) &&
        equalsNullable(this.url, documentConfigDto.url) &&
        Objects.equals(this.isForm, documentConfigDto.isForm) &&
        Objects.equals(this.options, documentConfigDto.options);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fileType), info, isLinkedForMe, hashCodeNullable(key), permissions, hashCodeNullable(sharedLinkParam), hashCodeNullable(sharedLinkKey), referenceData, hashCodeNullable(title), hashCodeNullable(url), isForm, options);
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
    sb.append("class DocumentConfigDto {\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    isLinkedForMe: ").append(toIndentedString(isLinkedForMe)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    sharedLinkParam: ").append(toIndentedString(sharedLinkParam)).append("\n");
    sb.append("    sharedLinkKey: ").append(toIndentedString(sharedLinkKey)).append("\n");
    sb.append("    referenceData: ").append(toIndentedString(referenceData)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isForm: ").append(toIndentedString(isForm)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

    // add `fileType` to the URL query string
    if (getFileType() != null) {
      try {
        joiner.add(String.format("%sfileType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `info` to the URL query string
    if (getInfo() != null) {
      joiner.add(getInfo().toUrlQueryString(prefix + "info" + suffix));
    }

    // add `isLinkedForMe` to the URL query string
    if (getIsLinkedForMe() != null) {
      try {
        joiner.add(String.format("%sisLinkedForMe%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsLinkedForMe()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      joiner.add(getPermissions().toUrlQueryString(prefix + "permissions" + suffix));
    }

    // add `sharedLinkParam` to the URL query string
    if (getSharedLinkParam() != null) {
      try {
        joiner.add(String.format("%ssharedLinkParam%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharedLinkParam()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sharedLinkKey` to the URL query string
    if (getSharedLinkKey() != null) {
      try {
        joiner.add(String.format("%ssharedLinkKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharedLinkKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `referenceData` to the URL query string
    if (getReferenceData() != null) {
      joiner.add(getReferenceData().toUrlQueryString(prefix + "referenceData" + suffix));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `isForm` to the URL query string
    if (getIsForm() != null) {
      try {
        joiner.add(String.format("%sisForm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsForm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `options` to the URL query string
    if (getOptions() != null) {
      joiner.add(getOptions().toUrlQueryString(prefix + "options" + suffix));
    }

    return joiner.toString();
  }

}

