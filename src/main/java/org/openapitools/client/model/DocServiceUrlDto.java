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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The document service URL parameters.
 */
@JsonPropertyOrder({
  DocServiceUrlDto.JSON_PROPERTY_VERSION,
  DocServiceUrlDto.JSON_PROPERTY_DOC_SERVICE_URL_API,
  DocServiceUrlDto.JSON_PROPERTY_DOC_SERVICE_URL,
  DocServiceUrlDto.JSON_PROPERTY_DOC_SERVICE_PRELOAD_URL,
  DocServiceUrlDto.JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL,
  DocServiceUrlDto.JSON_PROPERTY_DOC_SERVICE_PORTAL_URL,
  DocServiceUrlDto.JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER,
  DocServiceUrlDto.JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION,
  DocServiceUrlDto.JSON_PROPERTY_IS_DEFAULT
})

public class DocServiceUrlDto {
  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private String version;

  public static final String JSON_PROPERTY_DOC_SERVICE_URL_API = "docServiceUrlApi";
  @javax.annotation.Nullable
  private String docServiceUrlApi;

  public static final String JSON_PROPERTY_DOC_SERVICE_URL = "docServiceUrl";
  @javax.annotation.Nullable
  private String docServiceUrl;

  public static final String JSON_PROPERTY_DOC_SERVICE_PRELOAD_URL = "docServicePreloadUrl";
  @javax.annotation.Nullable
  private String docServicePreloadUrl;

  public static final String JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL = "docServiceUrlInternal";
  @javax.annotation.Nullable
  private String docServiceUrlInternal;

  public static final String JSON_PROPERTY_DOC_SERVICE_PORTAL_URL = "docServicePortalUrl";
  @javax.annotation.Nullable
  private String docServicePortalUrl;

  public static final String JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER = "docServiceSignatureHeader";
  @javax.annotation.Nullable
  private String docServiceSignatureHeader;

  public static final String JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION = "docServiceSslVerification";
  @javax.annotation.Nonnull
  private Boolean docServiceSslVerification;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  @javax.annotation.Nonnull
  private Boolean isDefault;

  public DocServiceUrlDto() {
  }


  public DocServiceUrlDto version(@javax.annotation.Nullable String version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version of the document service.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = version;
  }

  public DocServiceUrlDto docServiceUrlApi(@javax.annotation.Nullable String docServiceUrlApi) {
    
    this.docServiceUrlApi = docServiceUrlApi;
    return this;
  }

  /**
   * The document service URL API.
   * @return docServiceUrlApi
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_URL_API)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServiceUrlApi() {
    return docServiceUrlApi;
  }


  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_URL_API)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceUrlApi(@javax.annotation.Nullable String docServiceUrlApi) {
    this.docServiceUrlApi = docServiceUrlApi;
  }

  public DocServiceUrlDto docServiceUrl(@javax.annotation.Nullable String docServiceUrl) {
    
    this.docServiceUrl = docServiceUrl;
    return this;
  }

  /**
   * The document service URL.
   * @return docServiceUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServiceUrl() {
    return docServiceUrl;
  }


  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceUrl(@javax.annotation.Nullable String docServiceUrl) {
    this.docServiceUrl = docServiceUrl;
  }

  public DocServiceUrlDto docServicePreloadUrl(@javax.annotation.Nullable String docServicePreloadUrl) {
    
    this.docServicePreloadUrl = docServicePreloadUrl;
    return this;
  }

  /**
   * The URL used to preload the document service scripts.
   * @return docServicePreloadUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_PRELOAD_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServicePreloadUrl() {
    return docServicePreloadUrl;
  }


  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_PRELOAD_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServicePreloadUrl(@javax.annotation.Nullable String docServicePreloadUrl) {
    this.docServicePreloadUrl = docServicePreloadUrl;
  }

  public DocServiceUrlDto docServiceUrlInternal(@javax.annotation.Nullable String docServiceUrlInternal) {
    
    this.docServiceUrlInternal = docServiceUrlInternal;
    return this;
  }

  /**
   * The internal document service URL.
   * @return docServiceUrlInternal
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServiceUrlInternal() {
    return docServiceUrlInternal;
  }


  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceUrlInternal(@javax.annotation.Nullable String docServiceUrlInternal) {
    this.docServiceUrlInternal = docServiceUrlInternal;
  }

  public DocServiceUrlDto docServicePortalUrl(@javax.annotation.Nullable String docServicePortalUrl) {
    
    this.docServicePortalUrl = docServicePortalUrl;
    return this;
  }

  /**
   * The document service portal URL.
   * @return docServicePortalUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_PORTAL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServicePortalUrl() {
    return docServicePortalUrl;
  }


  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_PORTAL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServicePortalUrl(@javax.annotation.Nullable String docServicePortalUrl) {
    this.docServicePortalUrl = docServicePortalUrl;
  }

  public DocServiceUrlDto docServiceSignatureHeader(@javax.annotation.Nullable String docServiceSignatureHeader) {
    
    this.docServiceSignatureHeader = docServiceSignatureHeader;
    return this;
  }

  /**
   * The document service signature header.
   * @return docServiceSignatureHeader
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServiceSignatureHeader() {
    return docServiceSignatureHeader;
  }


  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceSignatureHeader(@javax.annotation.Nullable String docServiceSignatureHeader) {
    this.docServiceSignatureHeader = docServiceSignatureHeader;
  }

  public DocServiceUrlDto docServiceSslVerification(@javax.annotation.Nonnull Boolean docServiceSslVerification) {
    
    this.docServiceSslVerification = docServiceSslVerification;
    return this;
  }

  /**
   * Specifies if the document service SSL verification is enabled.
   * @return docServiceSslVerification
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDocServiceSslVerification() {
    return docServiceSslVerification;
  }


  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceSslVerification(@javax.annotation.Nonnull Boolean docServiceSslVerification) {
    this.docServiceSslVerification = docServiceSslVerification;
  }

  public DocServiceUrlDto isDefault(@javax.annotation.Nonnull Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Specifies if the document service is default.
   * @return isDefault
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDefault(@javax.annotation.Nonnull Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocServiceUrlDto docServiceUrlDto = (DocServiceUrlDto) o;
    return Objects.equals(this.version, docServiceUrlDto.version) &&
        Objects.equals(this.docServiceUrlApi, docServiceUrlDto.docServiceUrlApi) &&
        Objects.equals(this.docServiceUrl, docServiceUrlDto.docServiceUrl) &&
        Objects.equals(this.docServicePreloadUrl, docServiceUrlDto.docServicePreloadUrl) &&
        Objects.equals(this.docServiceUrlInternal, docServiceUrlDto.docServiceUrlInternal) &&
        Objects.equals(this.docServicePortalUrl, docServiceUrlDto.docServicePortalUrl) &&
        Objects.equals(this.docServiceSignatureHeader, docServiceUrlDto.docServiceSignatureHeader) &&
        Objects.equals(this.docServiceSslVerification, docServiceUrlDto.docServiceSslVerification) &&
        Objects.equals(this.isDefault, docServiceUrlDto.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, docServiceUrlApi, docServiceUrl, docServicePreloadUrl, docServiceUrlInternal, docServicePortalUrl, docServiceSignatureHeader, docServiceSslVerification, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocServiceUrlDto {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    docServiceUrlApi: ").append(toIndentedString(docServiceUrlApi)).append("\n");
    sb.append("    docServiceUrl: ").append(toIndentedString(docServiceUrl)).append("\n");
    sb.append("    docServicePreloadUrl: ").append(toIndentedString(docServicePreloadUrl)).append("\n");
    sb.append("    docServiceUrlInternal: ").append(toIndentedString(docServiceUrlInternal)).append("\n");
    sb.append("    docServicePortalUrl: ").append(toIndentedString(docServicePortalUrl)).append("\n");
    sb.append("    docServiceSignatureHeader: ").append(toIndentedString(docServiceSignatureHeader)).append("\n");
    sb.append("    docServiceSslVerification: ").append(toIndentedString(docServiceSslVerification)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docServiceUrlApi` to the URL query string
    if (getDocServiceUrlApi() != null) {
      try {
        joiner.add(String.format("%sdocServiceUrlApi%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServiceUrlApi()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docServiceUrl` to the URL query string
    if (getDocServiceUrl() != null) {
      try {
        joiner.add(String.format("%sdocServiceUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServiceUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docServicePreloadUrl` to the URL query string
    if (getDocServicePreloadUrl() != null) {
      try {
        joiner.add(String.format("%sdocServicePreloadUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServicePreloadUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docServiceUrlInternal` to the URL query string
    if (getDocServiceUrlInternal() != null) {
      try {
        joiner.add(String.format("%sdocServiceUrlInternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServiceUrlInternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docServicePortalUrl` to the URL query string
    if (getDocServicePortalUrl() != null) {
      try {
        joiner.add(String.format("%sdocServicePortalUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServicePortalUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docServiceSignatureHeader` to the URL query string
    if (getDocServiceSignatureHeader() != null) {
      try {
        joiner.add(String.format("%sdocServiceSignatureHeader%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServiceSignatureHeader()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docServiceSslVerification` to the URL query string
    if (getDocServiceSslVerification() != null) {
      try {
        joiner.add(String.format("%sdocServiceSslVerification%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServiceSslVerification()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isDefault` to the URL query string
    if (getIsDefault() != null) {
      try {
        joiner.add(String.format("%sisDefault%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDefault()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

