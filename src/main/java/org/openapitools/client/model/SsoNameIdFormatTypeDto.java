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
 * The SAML name ID formats the SSO settings accept.
 */
@JsonPropertyOrder({
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML11_UNSPECIFIED,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML11_EMAIL_ADDRESS,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML20_ENTITY,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML20_TRANSIENT,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML20_PERSISTENT,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML20_ENCRYPTED,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML20_UNSPECIFIED,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML11_X509_SUBJECT_NAME,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML11_WINDOWS_DOMAIN_QUALIFIED_NAME,
  SsoNameIdFormatTypeDto.JSON_PROPERTY_SAML20_KERBEROS
})

public class SsoNameIdFormatTypeDto {
  public static final String JSON_PROPERTY_SAML11_UNSPECIFIED = "saml11Unspecified";
  @javax.annotation.Nullable  private JsonNullable<String> saml11Unspecified = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML11_EMAIL_ADDRESS = "saml11EmailAddress";
  @javax.annotation.Nullable  private JsonNullable<String> saml11EmailAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML20_ENTITY = "saml20Entity";
  @javax.annotation.Nullable  private JsonNullable<String> saml20Entity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML20_TRANSIENT = "saml20Transient";
  @javax.annotation.Nullable  private JsonNullable<String> saml20Transient = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML20_PERSISTENT = "saml20Persistent";
  @javax.annotation.Nullable  private JsonNullable<String> saml20Persistent = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML20_ENCRYPTED = "saml20Encrypted";
  @javax.annotation.Nullable  private JsonNullable<String> saml20Encrypted = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML20_UNSPECIFIED = "saml20Unspecified";
  @javax.annotation.Nullable  private JsonNullable<String> saml20Unspecified = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML11_X509_SUBJECT_NAME = "saml11X509SubjectName";
  @javax.annotation.Nullable  private JsonNullable<String> saml11X509SubjectName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML11_WINDOWS_DOMAIN_QUALIFIED_NAME = "saml11WindowsDomainQualifiedName";
  @javax.annotation.Nullable  private JsonNullable<String> saml11WindowsDomainQualifiedName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML20_KERBEROS = "saml20Kerberos";
  @javax.annotation.Nullable  private JsonNullable<String> saml20Kerberos = JsonNullable.<String>undefined();

  public SsoNameIdFormatTypeDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SsoNameIdFormatTypeDto(
    @JsonProperty(JSON_PROPERTY_SAML11_UNSPECIFIED) String saml11Unspecified, 
    @JsonProperty(JSON_PROPERTY_SAML11_EMAIL_ADDRESS) String saml11EmailAddress, 
    @JsonProperty(JSON_PROPERTY_SAML20_ENTITY) String saml20Entity, 
    @JsonProperty(JSON_PROPERTY_SAML20_TRANSIENT) String saml20Transient, 
    @JsonProperty(JSON_PROPERTY_SAML20_PERSISTENT) String saml20Persistent, 
    @JsonProperty(JSON_PROPERTY_SAML20_ENCRYPTED) String saml20Encrypted, 
    @JsonProperty(JSON_PROPERTY_SAML20_UNSPECIFIED) String saml20Unspecified, 
    @JsonProperty(JSON_PROPERTY_SAML11_X509_SUBJECT_NAME) String saml11X509SubjectName, 
    @JsonProperty(JSON_PROPERTY_SAML11_WINDOWS_DOMAIN_QUALIFIED_NAME) String saml11WindowsDomainQualifiedName, 
    @JsonProperty(JSON_PROPERTY_SAML20_KERBEROS) String saml20Kerberos
  ) {
    this();
    this.saml11Unspecified = saml11Unspecified == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml11Unspecified);
    this.saml11EmailAddress = saml11EmailAddress == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml11EmailAddress);
    this.saml20Entity = saml20Entity == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml20Entity);
    this.saml20Transient = saml20Transient == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml20Transient);
    this.saml20Persistent = saml20Persistent == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml20Persistent);
    this.saml20Encrypted = saml20Encrypted == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml20Encrypted);
    this.saml20Unspecified = saml20Unspecified == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml20Unspecified);
    this.saml11X509SubjectName = saml11X509SubjectName == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml11X509SubjectName);
    this.saml11WindowsDomainQualifiedName = saml11WindowsDomainQualifiedName == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml11WindowsDomainQualifiedName);
    this.saml20Kerberos = saml20Kerberos == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml20Kerberos);
  }


  /**
   * The SAML 1.1 unspecified name ID format.
   * @return saml11Unspecified
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml11Unspecified() {
    
    if (saml11Unspecified == null) {
      saml11Unspecified = JsonNullable.<String>undefined();
    }
    return saml11Unspecified.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML11_UNSPECIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml11Unspecified_JsonNullable() {
    return saml11Unspecified;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML11_UNSPECIFIED)
  private void setSaml11Unspecified_JsonNullable(JsonNullable<String> saml11Unspecified) {
    this.saml11Unspecified = saml11Unspecified;
  }


  /**
   * The SAML 1.1 email address name ID format.
   * @return saml11EmailAddress
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml11EmailAddress() {
    
    if (saml11EmailAddress == null) {
      saml11EmailAddress = JsonNullable.<String>undefined();
    }
    return saml11EmailAddress.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML11_EMAIL_ADDRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml11EmailAddress_JsonNullable() {
    return saml11EmailAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML11_EMAIL_ADDRESS)
  private void setSaml11EmailAddress_JsonNullable(JsonNullable<String> saml11EmailAddress) {
    this.saml11EmailAddress = saml11EmailAddress;
  }


  /**
   * The SAML 2.0 entity name ID format.
   * @return saml20Entity
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml20Entity() {
    
    if (saml20Entity == null) {
      saml20Entity = JsonNullable.<String>undefined();
    }
    return saml20Entity.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML20_ENTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml20Entity_JsonNullable() {
    return saml20Entity;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML20_ENTITY)
  private void setSaml20Entity_JsonNullable(JsonNullable<String> saml20Entity) {
    this.saml20Entity = saml20Entity;
  }


  /**
   * The SAML 2.0 transient name ID format, whose identifier differs from one session to the next. It is what  the built-in configuration uses.
   * @return saml20Transient
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml20Transient() {
    
    if (saml20Transient == null) {
      saml20Transient = JsonNullable.<String>undefined();
    }
    return saml20Transient.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML20_TRANSIENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml20Transient_JsonNullable() {
    return saml20Transient;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML20_TRANSIENT)
  private void setSaml20Transient_JsonNullable(JsonNullable<String> saml20Transient) {
    this.saml20Transient = saml20Transient;
  }


  /**
   * The SAML 2.0 persistent name ID format, whose identifier stays the same for one person across sessions.
   * @return saml20Persistent
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml20Persistent() {
    
    if (saml20Persistent == null) {
      saml20Persistent = JsonNullable.<String>undefined();
    }
    return saml20Persistent.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML20_PERSISTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml20Persistent_JsonNullable() {
    return saml20Persistent;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML20_PERSISTENT)
  private void setSaml20Persistent_JsonNullable(JsonNullable<String> saml20Persistent) {
    this.saml20Persistent = saml20Persistent;
  }


  /**
   * The SAML 2.0 encrypted name ID format.
   * @return saml20Encrypted
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml20Encrypted() {
    
    if (saml20Encrypted == null) {
      saml20Encrypted = JsonNullable.<String>undefined();
    }
    return saml20Encrypted.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML20_ENCRYPTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml20Encrypted_JsonNullable() {
    return saml20Encrypted;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML20_ENCRYPTED)
  private void setSaml20Encrypted_JsonNullable(JsonNullable<String> saml20Encrypted) {
    this.saml20Encrypted = saml20Encrypted;
  }


  /**
   * The SAML 2.0 unspecified name ID format.
   * @return saml20Unspecified
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml20Unspecified() {
    
    if (saml20Unspecified == null) {
      saml20Unspecified = JsonNullable.<String>undefined();
    }
    return saml20Unspecified.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML20_UNSPECIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml20Unspecified_JsonNullable() {
    return saml20Unspecified;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML20_UNSPECIFIED)
  private void setSaml20Unspecified_JsonNullable(JsonNullable<String> saml20Unspecified) {
    this.saml20Unspecified = saml20Unspecified;
  }


  /**
   * The SAML 1.1 X.509 subject name name ID format.
   * @return saml11X509SubjectName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml11X509SubjectName() {
    
    if (saml11X509SubjectName == null) {
      saml11X509SubjectName = JsonNullable.<String>undefined();
    }
    return saml11X509SubjectName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML11_X509_SUBJECT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml11X509SubjectName_JsonNullable() {
    return saml11X509SubjectName;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML11_X509_SUBJECT_NAME)
  private void setSaml11X509SubjectName_JsonNullable(JsonNullable<String> saml11X509SubjectName) {
    this.saml11X509SubjectName = saml11X509SubjectName;
  }


  /**
   * The SAML 1.1 Windows domain qualified name name ID format.
   * @return saml11WindowsDomainQualifiedName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml11WindowsDomainQualifiedName() {
    
    if (saml11WindowsDomainQualifiedName == null) {
      saml11WindowsDomainQualifiedName = JsonNullable.<String>undefined();
    }
    return saml11WindowsDomainQualifiedName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML11_WINDOWS_DOMAIN_QUALIFIED_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml11WindowsDomainQualifiedName_JsonNullable() {
    return saml11WindowsDomainQualifiedName;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML11_WINDOWS_DOMAIN_QUALIFIED_NAME)
  private void setSaml11WindowsDomainQualifiedName_JsonNullable(JsonNullable<String> saml11WindowsDomainQualifiedName) {
    this.saml11WindowsDomainQualifiedName = saml11WindowsDomainQualifiedName;
  }


  /**
   * The SAML 2.0 Kerberos name ID format.
   * @return saml20Kerberos
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml20Kerberos() {
    
    if (saml20Kerberos == null) {
      saml20Kerberos = JsonNullable.<String>undefined();
    }
    return saml20Kerberos.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML20_KERBEROS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml20Kerberos_JsonNullable() {
    return saml20Kerberos;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML20_KERBEROS)
  private void setSaml20Kerberos_JsonNullable(JsonNullable<String> saml20Kerberos) {
    this.saml20Kerberos = saml20Kerberos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoNameIdFormatTypeDto ssoNameIdFormatTypeDto = (SsoNameIdFormatTypeDto) o;
    return equalsNullable(this.saml11Unspecified, ssoNameIdFormatTypeDto.saml11Unspecified) &&
        equalsNullable(this.saml11EmailAddress, ssoNameIdFormatTypeDto.saml11EmailAddress) &&
        equalsNullable(this.saml20Entity, ssoNameIdFormatTypeDto.saml20Entity) &&
        equalsNullable(this.saml20Transient, ssoNameIdFormatTypeDto.saml20Transient) &&
        equalsNullable(this.saml20Persistent, ssoNameIdFormatTypeDto.saml20Persistent) &&
        equalsNullable(this.saml20Encrypted, ssoNameIdFormatTypeDto.saml20Encrypted) &&
        equalsNullable(this.saml20Unspecified, ssoNameIdFormatTypeDto.saml20Unspecified) &&
        equalsNullable(this.saml11X509SubjectName, ssoNameIdFormatTypeDto.saml11X509SubjectName) &&
        equalsNullable(this.saml11WindowsDomainQualifiedName, ssoNameIdFormatTypeDto.saml11WindowsDomainQualifiedName) &&
        equalsNullable(this.saml20Kerberos, ssoNameIdFormatTypeDto.saml20Kerberos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(saml11Unspecified), hashCodeNullable(saml11EmailAddress), hashCodeNullable(saml20Entity), hashCodeNullable(saml20Transient), hashCodeNullable(saml20Persistent), hashCodeNullable(saml20Encrypted), hashCodeNullable(saml20Unspecified), hashCodeNullable(saml11X509SubjectName), hashCodeNullable(saml11WindowsDomainQualifiedName), hashCodeNullable(saml20Kerberos));
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
    sb.append("class SsoNameIdFormatTypeDto {\n");
    sb.append("    saml11Unspecified: ").append(toIndentedString(saml11Unspecified)).append("\n");
    sb.append("    saml11EmailAddress: ").append(toIndentedString(saml11EmailAddress)).append("\n");
    sb.append("    saml20Entity: ").append(toIndentedString(saml20Entity)).append("\n");
    sb.append("    saml20Transient: ").append(toIndentedString(saml20Transient)).append("\n");
    sb.append("    saml20Persistent: ").append(toIndentedString(saml20Persistent)).append("\n");
    sb.append("    saml20Encrypted: ").append(toIndentedString(saml20Encrypted)).append("\n");
    sb.append("    saml20Unspecified: ").append(toIndentedString(saml20Unspecified)).append("\n");
    sb.append("    saml11X509SubjectName: ").append(toIndentedString(saml11X509SubjectName)).append("\n");
    sb.append("    saml11WindowsDomainQualifiedName: ").append(toIndentedString(saml11WindowsDomainQualifiedName)).append("\n");
    sb.append("    saml20Kerberos: ").append(toIndentedString(saml20Kerberos)).append("\n");
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

    // add `saml11Unspecified` to the URL query string
    if (getSaml11Unspecified() != null) {
      try {
        joiner.add(String.format("%ssaml11Unspecified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml11Unspecified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml11EmailAddress` to the URL query string
    if (getSaml11EmailAddress() != null) {
      try {
        joiner.add(String.format("%ssaml11EmailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml11EmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml20Entity` to the URL query string
    if (getSaml20Entity() != null) {
      try {
        joiner.add(String.format("%ssaml20Entity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml20Entity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml20Transient` to the URL query string
    if (getSaml20Transient() != null) {
      try {
        joiner.add(String.format("%ssaml20Transient%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml20Transient()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml20Persistent` to the URL query string
    if (getSaml20Persistent() != null) {
      try {
        joiner.add(String.format("%ssaml20Persistent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml20Persistent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml20Encrypted` to the URL query string
    if (getSaml20Encrypted() != null) {
      try {
        joiner.add(String.format("%ssaml20Encrypted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml20Encrypted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml20Unspecified` to the URL query string
    if (getSaml20Unspecified() != null) {
      try {
        joiner.add(String.format("%ssaml20Unspecified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml20Unspecified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml11X509SubjectName` to the URL query string
    if (getSaml11X509SubjectName() != null) {
      try {
        joiner.add(String.format("%ssaml11X509SubjectName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml11X509SubjectName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml11WindowsDomainQualifiedName` to the URL query string
    if (getSaml11WindowsDomainQualifiedName() != null) {
      try {
        joiner.add(String.format("%ssaml11WindowsDomainQualifiedName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml11WindowsDomainQualifiedName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml20Kerberos` to the URL query string
    if (getSaml20Kerberos() != null) {
      try {
        joiner.add(String.format("%ssaml20Kerberos%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml20Kerberos()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

