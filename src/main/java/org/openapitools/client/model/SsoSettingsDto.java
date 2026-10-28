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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.SsoCertificateDto;
import org.openapitools.client.model.SsoFieldMappingDto;
import org.openapitools.client.model.SsoIdpCertificateAdvancedDto;
import org.openapitools.client.model.SsoIdpSettingsDto;
import org.openapitools.client.model.SsoSpCertificateAdvancedDto;
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
 * The SAML single sign-on configuration of the portal.
 */
@JsonPropertyOrder({
  SsoSettingsDto.JSON_PROPERTY_LAST_MODIFIED,
  SsoSettingsDto.JSON_PROPERTY_ENABLE_SSO,
  SsoSettingsDto.JSON_PROPERTY_IDP_SETTINGS,
  SsoSettingsDto.JSON_PROPERTY_IDP_CERTIFICATES,
  SsoSettingsDto.JSON_PROPERTY_IDP_CERTIFICATE_ADVANCED,
  SsoSettingsDto.JSON_PROPERTY_SP_LOGIN_LABEL,
  SsoSettingsDto.JSON_PROPERTY_SP_CERTIFICATES,
  SsoSettingsDto.JSON_PROPERTY_SP_CERTIFICATE_ADVANCED,
  SsoSettingsDto.JSON_PROPERTY_FIELD_MAPPING,
  SsoSettingsDto.JSON_PROPERTY_HIDE_AUTH_PAGE,
  SsoSettingsDto.JSON_PROPERTY_USERS_TYPE,
  SsoSettingsDto.JSON_PROPERTY_DISABLE_EMAIL_VERIFICATION
})

public class SsoSettingsDto {
  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private OffsetDateTime lastModified;

  public static final String JSON_PROPERTY_ENABLE_SSO = "enableSso";
  @javax.annotation.Nullable  private JsonNullable<Boolean> enableSso = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IDP_SETTINGS = "idpSettings";
  @javax.annotation.Nullable  private SsoIdpSettingsDto idpSettings;

  public static final String JSON_PROPERTY_IDP_CERTIFICATES = "idpCertificates";
  @javax.annotation.Nullable  private JsonNullable<List<SsoCertificateDto>> idpCertificates = JsonNullable.<List<SsoCertificateDto>>undefined();

  public static final String JSON_PROPERTY_IDP_CERTIFICATE_ADVANCED = "idpCertificateAdvanced";
  @javax.annotation.Nullable  private SsoIdpCertificateAdvancedDto idpCertificateAdvanced;

  public static final String JSON_PROPERTY_SP_LOGIN_LABEL = "spLoginLabel";
  @javax.annotation.Nullable  private JsonNullable<String> spLoginLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SP_CERTIFICATES = "spCertificates";
  @javax.annotation.Nullable  private JsonNullable<List<SsoCertificateDto>> spCertificates = JsonNullable.<List<SsoCertificateDto>>undefined();

  public static final String JSON_PROPERTY_SP_CERTIFICATE_ADVANCED = "spCertificateAdvanced";
  @javax.annotation.Nullable  private SsoSpCertificateAdvancedDto spCertificateAdvanced;

  public static final String JSON_PROPERTY_FIELD_MAPPING = "fieldMapping";
  @javax.annotation.Nullable  private SsoFieldMappingDto fieldMapping;

  public static final String JSON_PROPERTY_HIDE_AUTH_PAGE = "hideAuthPage";
  @javax.annotation.Nullable  private Boolean hideAuthPage;

  public static final String JSON_PROPERTY_USERS_TYPE = "usersType";
  @javax.annotation.Nullable  private Integer usersType;

  public static final String JSON_PROPERTY_DISABLE_EMAIL_VERIFICATION = "disableEmailVerification";
  @javax.annotation.Nullable  private Boolean disableEmailVerification;

  public SsoSettingsDto() {
  }


  public SsoSettingsDto lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The timestamp indicating when the settings were last modified.
   * @return lastModified
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public SsoSettingsDto enableSso(@javax.annotation.Nullable Boolean enableSso) {
    this.enableSso = JsonNullable.<Boolean>of(enableSso);
    
    return this;
  }

  /**
   * Specifies if the SSO settings are enabled or not.
   * @return enableSso
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getEnableSso() {
        return enableSso.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENABLE_SSO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getEnableSso_JsonNullable() {
    return enableSso;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLE_SSO)
  public void setEnableSso_JsonNullable(JsonNullable<Boolean> enableSso) {
    this.enableSso = enableSso;
  }

  public void setEnableSso(@javax.annotation.Nullable Boolean enableSso) {
    this.enableSso = JsonNullable.<Boolean>of(enableSso);
  }

  public SsoSettingsDto idpSettings(@javax.annotation.Nullable SsoIdpSettingsDto idpSettings) {
    
    this.idpSettings = idpSettings;
    return this;
  }

  /**
   * The SSO IdP settings.
   * @return idpSettings
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IDP_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoIdpSettingsDto getIdpSettings() {
    return idpSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_IDP_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpSettings(@javax.annotation.Nullable SsoIdpSettingsDto idpSettings) {
    this.idpSettings = idpSettings;
  }

  public SsoSettingsDto idpCertificates(@javax.annotation.Nullable List<SsoCertificateDto> idpCertificates) {
    this.idpCertificates = JsonNullable.<List<SsoCertificateDto>>of(idpCertificates);
    
    return this;
  }

  public SsoSettingsDto addIdpCertificatesItem(SsoCertificateDto idpCertificatesItem) {
    if (this.idpCertificates == null || !this.idpCertificates.isPresent()) {
      this.idpCertificates = JsonNullable.<List<SsoCertificateDto>>of(new ArrayList<>());
    }
    try {
      this.idpCertificates.get().add(idpCertificatesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the IdP certificates.
   * @return idpCertificates
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<SsoCertificateDto> getIdpCertificates() {
        return idpCertificates.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IDP_CERTIFICATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SsoCertificateDto>> getIdpCertificates_JsonNullable() {
    return idpCertificates;
  }
  
  @JsonProperty(JSON_PROPERTY_IDP_CERTIFICATES)
  public void setIdpCertificates_JsonNullable(JsonNullable<List<SsoCertificateDto>> idpCertificates) {
    this.idpCertificates = idpCertificates;
  }

  public void setIdpCertificates(@javax.annotation.Nullable List<SsoCertificateDto> idpCertificates) {
    this.idpCertificates = JsonNullable.<List<SsoCertificateDto>>of(idpCertificates);
  }

  public SsoSettingsDto idpCertificateAdvanced(@javax.annotation.Nullable SsoIdpCertificateAdvancedDto idpCertificateAdvanced) {
    
    this.idpCertificateAdvanced = idpCertificateAdvanced;
    return this;
  }

  /**
   * The IdP advanced certificate.
   * @return idpCertificateAdvanced
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IDP_CERTIFICATE_ADVANCED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoIdpCertificateAdvancedDto getIdpCertificateAdvanced() {
    return idpCertificateAdvanced;
  }


  @JsonProperty(value = JSON_PROPERTY_IDP_CERTIFICATE_ADVANCED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpCertificateAdvanced(@javax.annotation.Nullable SsoIdpCertificateAdvancedDto idpCertificateAdvanced) {
    this.idpCertificateAdvanced = idpCertificateAdvanced;
  }

  public SsoSettingsDto spLoginLabel(@javax.annotation.Nullable String spLoginLabel) {
    this.spLoginLabel = JsonNullable.<String>of(spLoginLabel);
    
    return this;
  }

  /**
   * The SP login label.
   * @return spLoginLabel
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSpLoginLabel() {
        return spLoginLabel.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SP_LOGIN_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSpLoginLabel_JsonNullable() {
    return spLoginLabel;
  }
  
  @JsonProperty(JSON_PROPERTY_SP_LOGIN_LABEL)
  public void setSpLoginLabel_JsonNullable(JsonNullable<String> spLoginLabel) {
    this.spLoginLabel = spLoginLabel;
  }

  public void setSpLoginLabel(@javax.annotation.Nullable String spLoginLabel) {
    this.spLoginLabel = JsonNullable.<String>of(spLoginLabel);
  }

  public SsoSettingsDto spCertificates(@javax.annotation.Nullable List<SsoCertificateDto> spCertificates) {
    this.spCertificates = JsonNullable.<List<SsoCertificateDto>>of(spCertificates);
    
    return this;
  }

  public SsoSettingsDto addSpCertificatesItem(SsoCertificateDto spCertificatesItem) {
    if (this.spCertificates == null || !this.spCertificates.isPresent()) {
      this.spCertificates = JsonNullable.<List<SsoCertificateDto>>of(new ArrayList<>());
    }
    try {
      this.spCertificates.get().add(spCertificatesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the SP certificates.
   * @return spCertificates
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<SsoCertificateDto> getSpCertificates() {
        return spCertificates.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SP_CERTIFICATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SsoCertificateDto>> getSpCertificates_JsonNullable() {
    return spCertificates;
  }
  
  @JsonProperty(JSON_PROPERTY_SP_CERTIFICATES)
  public void setSpCertificates_JsonNullable(JsonNullable<List<SsoCertificateDto>> spCertificates) {
    this.spCertificates = spCertificates;
  }

  public void setSpCertificates(@javax.annotation.Nullable List<SsoCertificateDto> spCertificates) {
    this.spCertificates = JsonNullable.<List<SsoCertificateDto>>of(spCertificates);
  }

  public SsoSettingsDto spCertificateAdvanced(@javax.annotation.Nullable SsoSpCertificateAdvancedDto spCertificateAdvanced) {
    
    this.spCertificateAdvanced = spCertificateAdvanced;
    return this;
  }

  /**
   * The SP advanced certificate.
   * @return spCertificateAdvanced
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SP_CERTIFICATE_ADVANCED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoSpCertificateAdvancedDto getSpCertificateAdvanced() {
    return spCertificateAdvanced;
  }


  @JsonProperty(value = JSON_PROPERTY_SP_CERTIFICATE_ADVANCED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpCertificateAdvanced(@javax.annotation.Nullable SsoSpCertificateAdvancedDto spCertificateAdvanced) {
    this.spCertificateAdvanced = spCertificateAdvanced;
  }

  public SsoSettingsDto fieldMapping(@javax.annotation.Nullable SsoFieldMappingDto fieldMapping) {
    
    this.fieldMapping = fieldMapping;
    return this;
  }

  /**
   * The SSO field mapping.
   * @return fieldMapping
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FIELD_MAPPING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoFieldMappingDto getFieldMapping() {
    return fieldMapping;
  }


  @JsonProperty(value = JSON_PROPERTY_FIELD_MAPPING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldMapping(@javax.annotation.Nullable SsoFieldMappingDto fieldMapping) {
    this.fieldMapping = fieldMapping;
  }

  public SsoSettingsDto hideAuthPage(@javax.annotation.Nullable Boolean hideAuthPage) {
    
    this.hideAuthPage = hideAuthPage;
    return this;
  }

  /**
   * Specifies if the authentication page will be hidden or not.
   * @return hideAuthPage
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HIDE_AUTH_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideAuthPage() {
    return hideAuthPage;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_AUTH_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideAuthPage(@javax.annotation.Nullable Boolean hideAuthPage) {
    this.hideAuthPage = hideAuthPage;
  }

  public SsoSettingsDto usersType(@javax.annotation.Nullable Integer usersType) {
    
    this.usersType = usersType;
    return this;
  }

  /**
   * The user type.
   * @return usersType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USERS_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUsersType() {
    return usersType;
  }


  @JsonProperty(value = JSON_PROPERTY_USERS_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsersType(@javax.annotation.Nullable Integer usersType) {
    this.usersType = usersType;
  }

  public SsoSettingsDto disableEmailVerification(@javax.annotation.Nullable Boolean disableEmailVerification) {
    
    this.disableEmailVerification = disableEmailVerification;
    return this;
  }

  /**
   * Specifies if the email verification is disabled or not.
   * @return disableEmailVerification
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DISABLE_EMAIL_VERIFICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisableEmailVerification() {
    return disableEmailVerification;
  }


  @JsonProperty(value = JSON_PROPERTY_DISABLE_EMAIL_VERIFICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisableEmailVerification(@javax.annotation.Nullable Boolean disableEmailVerification) {
    this.disableEmailVerification = disableEmailVerification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoSettingsDto ssoSettingsDto = (SsoSettingsDto) o;
    return Objects.equals(this.lastModified, ssoSettingsDto.lastModified) &&
        equalsNullable(this.enableSso, ssoSettingsDto.enableSso) &&
        Objects.equals(this.idpSettings, ssoSettingsDto.idpSettings) &&
        equalsNullable(this.idpCertificates, ssoSettingsDto.idpCertificates) &&
        Objects.equals(this.idpCertificateAdvanced, ssoSettingsDto.idpCertificateAdvanced) &&
        equalsNullable(this.spLoginLabel, ssoSettingsDto.spLoginLabel) &&
        equalsNullable(this.spCertificates, ssoSettingsDto.spCertificates) &&
        Objects.equals(this.spCertificateAdvanced, ssoSettingsDto.spCertificateAdvanced) &&
        Objects.equals(this.fieldMapping, ssoSettingsDto.fieldMapping) &&
        Objects.equals(this.hideAuthPage, ssoSettingsDto.hideAuthPage) &&
        Objects.equals(this.usersType, ssoSettingsDto.usersType) &&
        Objects.equals(this.disableEmailVerification, ssoSettingsDto.disableEmailVerification);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, hashCodeNullable(enableSso), idpSettings, hashCodeNullable(idpCertificates), idpCertificateAdvanced, hashCodeNullable(spLoginLabel), hashCodeNullable(spCertificates), spCertificateAdvanced, fieldMapping, hideAuthPage, usersType, disableEmailVerification);
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
    sb.append("class SsoSettingsDto {\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    enableSso: ").append(toIndentedString(enableSso)).append("\n");
    sb.append("    idpSettings: ").append(toIndentedString(idpSettings)).append("\n");
    sb.append("    idpCertificates: ").append(toIndentedString(idpCertificates)).append("\n");
    sb.append("    idpCertificateAdvanced: ").append(toIndentedString(idpCertificateAdvanced)).append("\n");
    sb.append("    spLoginLabel: ").append(toIndentedString(spLoginLabel)).append("\n");
    sb.append("    spCertificates: ").append(toIndentedString(spCertificates)).append("\n");
    sb.append("    spCertificateAdvanced: ").append(toIndentedString(spCertificateAdvanced)).append("\n");
    sb.append("    fieldMapping: ").append(toIndentedString(fieldMapping)).append("\n");
    sb.append("    hideAuthPage: ").append(toIndentedString(hideAuthPage)).append("\n");
    sb.append("    usersType: ").append(toIndentedString(usersType)).append("\n");
    sb.append("    disableEmailVerification: ").append(toIndentedString(disableEmailVerification)).append("\n");
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

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enableSso` to the URL query string
    if (getEnableSso() != null) {
      try {
        joiner.add(String.format("%senableSso%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableSso()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `idpSettings` to the URL query string
    if (getIdpSettings() != null) {
      joiner.add(getIdpSettings().toUrlQueryString(prefix + "idpSettings" + suffix));
    }

    // add `idpCertificates` to the URL query string
    if (getIdpCertificates() != null) {
      for (int i = 0; i < getIdpCertificates().size(); i++) {
        if (getIdpCertificates().get(i) != null) {
          joiner.add(getIdpCertificates().get(i).toUrlQueryString(String.format("%sidpCertificates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `idpCertificateAdvanced` to the URL query string
    if (getIdpCertificateAdvanced() != null) {
      joiner.add(getIdpCertificateAdvanced().toUrlQueryString(prefix + "idpCertificateAdvanced" + suffix));
    }

    // add `spLoginLabel` to the URL query string
    if (getSpLoginLabel() != null) {
      try {
        joiner.add(String.format("%sspLoginLabel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpLoginLabel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spCertificates` to the URL query string
    if (getSpCertificates() != null) {
      for (int i = 0; i < getSpCertificates().size(); i++) {
        if (getSpCertificates().get(i) != null) {
          joiner.add(getSpCertificates().get(i).toUrlQueryString(String.format("%sspCertificates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `spCertificateAdvanced` to the URL query string
    if (getSpCertificateAdvanced() != null) {
      joiner.add(getSpCertificateAdvanced().toUrlQueryString(prefix + "spCertificateAdvanced" + suffix));
    }

    // add `fieldMapping` to the URL query string
    if (getFieldMapping() != null) {
      joiner.add(getFieldMapping().toUrlQueryString(prefix + "fieldMapping" + suffix));
    }

    // add `hideAuthPage` to the URL query string
    if (getHideAuthPage() != null) {
      try {
        joiner.add(String.format("%shideAuthPage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHideAuthPage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usersType` to the URL query string
    if (getUsersType() != null) {
      try {
        joiner.add(String.format("%susersType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsersType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `disableEmailVerification` to the URL query string
    if (getDisableEmailVerification() != null) {
      try {
        joiner.add(String.format("%sdisableEmailVerification%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisableEmailVerification()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

