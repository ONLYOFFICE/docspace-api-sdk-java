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
 * The request parameters for checking the document service location.
 */
@JsonPropertyOrder({
  CheckDocServiceUrlRequestDto.JSON_PROPERTY_DOC_SERVICE_URL,
  CheckDocServiceUrlRequestDto.JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL,
  CheckDocServiceUrlRequestDto.JSON_PROPERTY_DOC_SERVICE_URL_PORTAL,
  CheckDocServiceUrlRequestDto.JSON_PROPERTY_DOC_SERVICE_SIGNATURE_SECRET,
  CheckDocServiceUrlRequestDto.JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER,
  CheckDocServiceUrlRequestDto.JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION
})

public class CheckDocServiceUrlRequestDto {
  public static final String JSON_PROPERTY_DOC_SERVICE_URL = "docServiceUrl";
  @javax.annotation.Nullable  private String docServiceUrl;

  public static final String JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL = "docServiceUrlInternal";
  @javax.annotation.Nullable  private JsonNullable<String> docServiceUrlInternal = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DOC_SERVICE_URL_PORTAL = "docServiceUrlPortal";
  @javax.annotation.Nullable  private JsonNullable<String> docServiceUrlPortal = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DOC_SERVICE_SIGNATURE_SECRET = "docServiceSignatureSecret";
  @javax.annotation.Nullable  private JsonNullable<String> docServiceSignatureSecret = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER = "docServiceSignatureHeader";
  @javax.annotation.Nullable  private JsonNullable<String> docServiceSignatureHeader = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION = "docServiceSslVerification";
  @javax.annotation.Nullable  private JsonNullable<Boolean> docServiceSslVerification = JsonNullable.<Boolean>undefined();

  public CheckDocServiceUrlRequestDto() {
  }


  public CheckDocServiceUrlRequestDto docServiceUrl(@javax.annotation.Nullable String docServiceUrl) {
    
    this.docServiceUrl = docServiceUrl;
    return this;
  }

  /**
   * The ONLYOFFICE Docs URL address.
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

  public CheckDocServiceUrlRequestDto docServiceUrlInternal(@javax.annotation.Nullable String docServiceUrlInternal) {
    this.docServiceUrlInternal = JsonNullable.<String>of(docServiceUrlInternal);
    
    return this;
  }

  /**
   * The ONLYOFFICE Docs URL address in the local private network.
   * @return docServiceUrlInternal
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDocServiceUrlInternal() {
        return docServiceUrlInternal.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDocServiceUrlInternal_JsonNullable() {
    return docServiceUrlInternal;
  }
  
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_URL_INTERNAL)
  public void setDocServiceUrlInternal_JsonNullable(JsonNullable<String> docServiceUrlInternal) {
    this.docServiceUrlInternal = docServiceUrlInternal;
  }

  public void setDocServiceUrlInternal(@javax.annotation.Nullable String docServiceUrlInternal) {
    this.docServiceUrlInternal = JsonNullable.<String>of(docServiceUrlInternal);
  }

  public CheckDocServiceUrlRequestDto docServiceUrlPortal(@javax.annotation.Nullable String docServiceUrlPortal) {
    this.docServiceUrlPortal = JsonNullable.<String>of(docServiceUrlPortal);
    
    return this;
  }

  /**
   * The ONLYOFFICE Docs URL address.
   * @return docServiceUrlPortal
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDocServiceUrlPortal() {
        return docServiceUrlPortal.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_URL_PORTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDocServiceUrlPortal_JsonNullable() {
    return docServiceUrlPortal;
  }
  
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_URL_PORTAL)
  public void setDocServiceUrlPortal_JsonNullable(JsonNullable<String> docServiceUrlPortal) {
    this.docServiceUrlPortal = docServiceUrlPortal;
  }

  public void setDocServiceUrlPortal(@javax.annotation.Nullable String docServiceUrlPortal) {
    this.docServiceUrlPortal = JsonNullable.<String>of(docServiceUrlPortal);
  }

  public CheckDocServiceUrlRequestDto docServiceSignatureSecret(@javax.annotation.Nullable String docServiceSignatureSecret) {
    this.docServiceSignatureSecret = JsonNullable.<String>of(docServiceSignatureSecret);
    
    return this;
  }

  /**
   * The signature secret of the ONLYOFFICE Docs.
   * @return docServiceSignatureSecret
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDocServiceSignatureSecret() {
        return docServiceSignatureSecret.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_SIGNATURE_SECRET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDocServiceSignatureSecret_JsonNullable() {
    return docServiceSignatureSecret;
  }
  
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_SIGNATURE_SECRET)
  public void setDocServiceSignatureSecret_JsonNullable(JsonNullable<String> docServiceSignatureSecret) {
    this.docServiceSignatureSecret = docServiceSignatureSecret;
  }

  public void setDocServiceSignatureSecret(@javax.annotation.Nullable String docServiceSignatureSecret) {
    this.docServiceSignatureSecret = JsonNullable.<String>of(docServiceSignatureSecret);
  }

  public CheckDocServiceUrlRequestDto docServiceSignatureHeader(@javax.annotation.Nullable String docServiceSignatureHeader) {
    this.docServiceSignatureHeader = JsonNullable.<String>of(docServiceSignatureHeader);
    
    return this;
  }

  /**
   * The signature header of the ONLYOFFICE Docs.
   * @return docServiceSignatureHeader
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDocServiceSignatureHeader() {
        return docServiceSignatureHeader.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDocServiceSignatureHeader_JsonNullable() {
    return docServiceSignatureHeader;
  }
  
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_SIGNATURE_HEADER)
  public void setDocServiceSignatureHeader_JsonNullable(JsonNullable<String> docServiceSignatureHeader) {
    this.docServiceSignatureHeader = docServiceSignatureHeader;
  }

  public void setDocServiceSignatureHeader(@javax.annotation.Nullable String docServiceSignatureHeader) {
    this.docServiceSignatureHeader = JsonNullable.<String>of(docServiceSignatureHeader);
  }

  public CheckDocServiceUrlRequestDto docServiceSslVerification(@javax.annotation.Nullable Boolean docServiceSslVerification) {
    this.docServiceSslVerification = JsonNullable.<Boolean>of(docServiceSslVerification);
    
    return this;
  }

  /**
   * Specifies if the SSL verification of the ONLYOFFICE Docs is enabled or not.
   * @return docServiceSslVerification
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDocServiceSslVerification() {
        return docServiceSslVerification.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDocServiceSslVerification_JsonNullable() {
    return docServiceSslVerification;
  }
  
  @JsonProperty(JSON_PROPERTY_DOC_SERVICE_SSL_VERIFICATION)
  public void setDocServiceSslVerification_JsonNullable(JsonNullable<Boolean> docServiceSslVerification) {
    this.docServiceSslVerification = docServiceSslVerification;
  }

  public void setDocServiceSslVerification(@javax.annotation.Nullable Boolean docServiceSslVerification) {
    this.docServiceSslVerification = JsonNullable.<Boolean>of(docServiceSslVerification);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDocServiceUrlRequestDto checkDocServiceUrlRequestDto = (CheckDocServiceUrlRequestDto) o;
    return Objects.equals(this.docServiceUrl, checkDocServiceUrlRequestDto.docServiceUrl) &&
        equalsNullable(this.docServiceUrlInternal, checkDocServiceUrlRequestDto.docServiceUrlInternal) &&
        equalsNullable(this.docServiceUrlPortal, checkDocServiceUrlRequestDto.docServiceUrlPortal) &&
        equalsNullable(this.docServiceSignatureSecret, checkDocServiceUrlRequestDto.docServiceSignatureSecret) &&
        equalsNullable(this.docServiceSignatureHeader, checkDocServiceUrlRequestDto.docServiceSignatureHeader) &&
        equalsNullable(this.docServiceSslVerification, checkDocServiceUrlRequestDto.docServiceSslVerification);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(docServiceUrl, hashCodeNullable(docServiceUrlInternal), hashCodeNullable(docServiceUrlPortal), hashCodeNullable(docServiceSignatureSecret), hashCodeNullable(docServiceSignatureHeader), hashCodeNullable(docServiceSslVerification));
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
    sb.append("class CheckDocServiceUrlRequestDto {\n");
    sb.append("    docServiceUrl: ").append(toIndentedString(docServiceUrl)).append("\n");
    sb.append("    docServiceUrlInternal: ").append(toIndentedString(docServiceUrlInternal)).append("\n");
    sb.append("    docServiceUrlPortal: ").append(toIndentedString(docServiceUrlPortal)).append("\n");
    sb.append("    docServiceSignatureSecret: ").append(toIndentedString(docServiceSignatureSecret)).append("\n");
    sb.append("    docServiceSignatureHeader: ").append(toIndentedString(docServiceSignatureHeader)).append("\n");
    sb.append("    docServiceSslVerification: ").append(toIndentedString(docServiceSslVerification)).append("\n");
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

    // add `docServiceUrl` to the URL query string
    if (getDocServiceUrl() != null) {
      try {
        joiner.add(String.format("%sdocServiceUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServiceUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `docServiceUrlPortal` to the URL query string
    if (getDocServiceUrlPortal() != null) {
      try {
        joiner.add(String.format("%sdocServiceUrlPortal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServiceUrlPortal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docServiceSignatureSecret` to the URL query string
    if (getDocServiceSignatureSecret() != null) {
      try {
        joiner.add(String.format("%sdocServiceSignatureSecret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocServiceSignatureSecret()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

