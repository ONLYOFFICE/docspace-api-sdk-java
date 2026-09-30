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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The document service location as this portal has it configured, together with the editor entry points a client  needs in order to open a document.
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
  @javax.annotation.Nullable  private String version;

  public static final String JSON_PROPERTY_DOC_SERVICE_URL_API = "docServiceUrlApi";
  @javax.annotation.Nullable  private String docServiceUrlApi;

  public static final String JSON_PROPERTY_DOC_SERVICE_URL = "docServiceUrl";
  @javax.annotation.Nullable  private String docServiceUrl;

  public static final String JSON_PROPERTY_DOC_SERVICE_PRELOAD_URL = "docServicePreloadUrl";
  @javax.annotation.Nullable  private String docServicePreloadUrl;

  public static final String JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL = "docServiceUrlInternal";
  @javax.annotation.Nullable  private String docServiceUrlInternal;

  public static final String JSON_PROPERTY_DOC_SERVICE_PORTAL_URL = "docServicePortalUrl";
  @javax.annotation.Nullable  private String docServicePortalUrl;

  public static final String JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER = "docServiceSignatureHeader";
  @javax.annotation.Nullable  private String docServiceSignatureHeader;

  public static final String JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION = "docServiceSslVerification";
  @javax.annotation.Nonnull  private Boolean docServiceSslVerification;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  @javax.annotation.Nonnull  private Boolean isDefault;

  public DocServiceUrlDto() {
  }


  public DocServiceUrlDto version(@javax.annotation.Nullable String version) {
    
    this.version = version;
    return this;
  }

  /**
   * The editor version the running Document Server reported. It is filled in only when the version was asked for,  and comes back empty otherwise. When the Document Server does not answer, a fallback version is reported  rather than an error, so a value here is no proof that the server is reachable.
   * @return version
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = version;
  }

  public DocServiceUrlDto docServiceUrlApi(@javax.annotation.Nullable String docServiceUrlApi) {
    
    this.docServiceUrlApi = docServiceUrlApi;
    return this;
  }

  /**
   * The absolute URL of the editor api script that a client has to load before it can open a document. It is  derived from the public Document Server address unless the deployment overrides it separately.
   * @return docServiceUrlApi
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_URL_API, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServiceUrlApi() {
    return docServiceUrlApi;
  }


  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_URL_API, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceUrlApi(@javax.annotation.Nullable String docServiceUrlApi) {
    this.docServiceUrlApi = docServiceUrlApi;
  }

  public DocServiceUrlDto docServiceUrl(@javax.annotation.Nullable String docServiceUrl) {
    
    this.docServiceUrl = docServiceUrl;
    return this;
  }

  /**
   * The public Document Server address a browser loads the editor from. Empty means no document server is  configured for this portal, and documents cannot be opened for editing or viewing.
   * @return docServiceUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServiceUrl() {
    return docServiceUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceUrl(@javax.annotation.Nullable String docServiceUrl) {
    this.docServiceUrl = docServiceUrl;
  }

  public DocServiceUrlDto docServicePreloadUrl(@javax.annotation.Nullable String docServicePreloadUrl) {
    
    this.docServicePreloadUrl = docServicePreloadUrl;
    return this;
  }

  /**
   * The absolute URL of a page a client may load in advance to warm the editor scripts up. Loading it is optional  and changes nothing on the portal.
   * @return docServicePreloadUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_PRELOAD_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServicePreloadUrl() {
    return docServicePreloadUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_PRELOAD_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServicePreloadUrl(@javax.annotation.Nullable String docServicePreloadUrl) {
    this.docServicePreloadUrl = docServicePreloadUrl;
  }

  public DocServiceUrlDto docServiceUrlInternal(@javax.annotation.Nullable String docServiceUrlInternal) {
    
    this.docServiceUrlInternal = docServiceUrlInternal;
    return this;
  }

  /**
   * The address the portal uses for its own server-to-server calls to the Document Server. When no private-network  address is configured, it repeats the public one.
   * @return docServiceUrlInternal
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServiceUrlInternal() {
    return docServiceUrlInternal;
  }


  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceUrlInternal(@javax.annotation.Nullable String docServiceUrlInternal) {
    this.docServiceUrlInternal = docServiceUrlInternal;
  }

  public DocServiceUrlDto docServicePortalUrl(@javax.annotation.Nullable String docServicePortalUrl) {
    
    this.docServicePortalUrl = docServicePortalUrl;
    return this;
  }

  /**
   * The address the Document Server is told to call this portal back on. Empty means nothing overrides it and the  portal's own resolved address is used.
   * @return docServicePortalUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_PORTAL_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServicePortalUrl() {
    return docServicePortalUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_PORTAL_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServicePortalUrl(@javax.annotation.Nullable String docServicePortalUrl) {
    this.docServicePortalUrl = docServicePortalUrl;
  }

  public DocServiceUrlDto docServiceSignatureHeader(@javax.annotation.Nullable String docServiceSignatureHeader) {
    
    this.docServiceSignatureHeader = docServiceSignatureHeader;
    return this;
  }

  /**
   * The name of the HTTP header that carries the signature on requests between the portal and the Document Server.  The secret itself is not part of the answer, so this only tells a client whether request signing is set up and  under which header.
   * @return docServiceSignatureHeader
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocServiceSignatureHeader() {
    return docServiceSignatureHeader;
  }


  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceSignatureHeader(@javax.annotation.Nullable String docServiceSignatureHeader) {
    this.docServiceSignatureHeader = docServiceSignatureHeader;
  }

  public DocServiceUrlDto docServiceSslVerification(@javax.annotation.Nonnull Boolean docServiceSslVerification) {
    
    this.docServiceSslVerification = docServiceSslVerification;
    return this;
  }

  /**
   * Whether the portal validates the TLS certificate of the Document Server. False means any certificate is  accepted, which is expected only in a test deployment.
   * @return docServiceSslVerification
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDocServiceSslVerification() {
    return docServiceSslVerification;
  }


  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocServiceSslVerification(@javax.annotation.Nonnull Boolean docServiceSslVerification) {
    this.docServiceSslVerification = docServiceSslVerification;
  }

  public DocServiceUrlDto isDefault(@javax.annotation.Nonnull Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether every one of these settings is still the one the deployment ships with. False means at least one of  the addresses, the signature settings or SSL verification has been overridden for this portal.
   * @return isDefault
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_IS_DEFAULT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_DEFAULT, required = true)
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

