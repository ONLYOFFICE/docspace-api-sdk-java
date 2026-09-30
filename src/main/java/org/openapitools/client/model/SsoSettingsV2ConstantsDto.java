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
import org.openapitools.client.model.SsoBindingTypeDto;
import org.openapitools.client.model.SsoEncryptAlgorithmTypeDto;
import org.openapitools.client.model.SsoIdpCertificateActionTypeDto;
import org.openapitools.client.model.SsoNameIdFormatTypeDto;
import org.openapitools.client.model.SsoSigningAlgorithmTypeDto;
import org.openapitools.client.model.SsoSpCertificateActionTypeDto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The SSO settings constants: every value the settings accept, by name.
 */
@JsonPropertyOrder({
  SsoSettingsV2ConstantsDto.JSON_PROPERTY_SSO_NAME_ID_FORMAT_TYPE,
  SsoSettingsV2ConstantsDto.JSON_PROPERTY_SSO_BINDING_TYPE,
  SsoSettingsV2ConstantsDto.JSON_PROPERTY_SSO_SIGNING_ALGORITHM_TYPE,
  SsoSettingsV2ConstantsDto.JSON_PROPERTY_SSO_ENCRYPT_ALGORITHM_TYPE,
  SsoSettingsV2ConstantsDto.JSON_PROPERTY_SSO_SP_CERTIFICATE_ACTION_TYPE,
  SsoSettingsV2ConstantsDto.JSON_PROPERTY_SSO_IDP_CERTIFICATE_ACTION_TYPE
})

public class SsoSettingsV2ConstantsDto {
  public static final String JSON_PROPERTY_SSO_NAME_ID_FORMAT_TYPE = "ssoNameIdFormatType";
  @javax.annotation.Nullable  private SsoNameIdFormatTypeDto ssoNameIdFormatType;

  public static final String JSON_PROPERTY_SSO_BINDING_TYPE = "ssoBindingType";
  @javax.annotation.Nullable  private SsoBindingTypeDto ssoBindingType;

  public static final String JSON_PROPERTY_SSO_SIGNING_ALGORITHM_TYPE = "ssoSigningAlgorithmType";
  @javax.annotation.Nullable  private SsoSigningAlgorithmTypeDto ssoSigningAlgorithmType;

  public static final String JSON_PROPERTY_SSO_ENCRYPT_ALGORITHM_TYPE = "ssoEncryptAlgorithmType";
  @javax.annotation.Nullable  private SsoEncryptAlgorithmTypeDto ssoEncryptAlgorithmType;

  public static final String JSON_PROPERTY_SSO_SP_CERTIFICATE_ACTION_TYPE = "ssoSpCertificateActionType";
  @javax.annotation.Nullable  private SsoSpCertificateActionTypeDto ssoSpCertificateActionType;

  public static final String JSON_PROPERTY_SSO_IDP_CERTIFICATE_ACTION_TYPE = "ssoIdpCertificateActionType";
  @javax.annotation.Nullable  private SsoIdpCertificateActionTypeDto ssoIdpCertificateActionType;

  public SsoSettingsV2ConstantsDto() {
  }


  public SsoSettingsV2ConstantsDto ssoNameIdFormatType(@javax.annotation.Nullable SsoNameIdFormatTypeDto ssoNameIdFormatType) {
    
    this.ssoNameIdFormatType = ssoNameIdFormatType;
    return this;
  }

  /**
   * The values the `nameIdFormat` of the identity provider settings accepts. The built-in configuration uses  the SAML 2.0 transient format.
   * @return ssoNameIdFormatType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SSO_NAME_ID_FORMAT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoNameIdFormatTypeDto getSsoNameIdFormatType() {
    return ssoNameIdFormatType;
  }


  @JsonProperty(value = JSON_PROPERTY_SSO_NAME_ID_FORMAT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsoNameIdFormatType(@javax.annotation.Nullable SsoNameIdFormatTypeDto ssoNameIdFormatType) {
    this.ssoNameIdFormatType = ssoNameIdFormatType;
  }

  public SsoSettingsV2ConstantsDto ssoBindingType(@javax.annotation.Nullable SsoBindingTypeDto ssoBindingType) {
    
    this.ssoBindingType = ssoBindingType;
    return this;
  }

  /**
   * The values the `ssoBinding` and `sloBinding` of the identity provider settings accept - how the portal  sends its sign-in and sign-out requests. The built-in configuration uses HTTP POST for both.
   * @return ssoBindingType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SSO_BINDING_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoBindingTypeDto getSsoBindingType() {
    return ssoBindingType;
  }


  @JsonProperty(value = JSON_PROPERTY_SSO_BINDING_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsoBindingType(@javax.annotation.Nullable SsoBindingTypeDto ssoBindingType) {
    this.ssoBindingType = ssoBindingType;
  }

  public SsoSettingsV2ConstantsDto ssoSigningAlgorithmType(@javax.annotation.Nullable SsoSigningAlgorithmTypeDto ssoSigningAlgorithmType) {
    
    this.ssoSigningAlgorithmType = ssoSigningAlgorithmType;
    return this;
  }

  /**
   * The values the `signingAlgorithm` of the service provider certificate and the `verifyAlgorithm` of the  identity provider certificate accept. The built-in configuration uses RSA-SHA1 for both.
   * @return ssoSigningAlgorithmType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SSO_SIGNING_ALGORITHM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoSigningAlgorithmTypeDto getSsoSigningAlgorithmType() {
    return ssoSigningAlgorithmType;
  }


  @JsonProperty(value = JSON_PROPERTY_SSO_SIGNING_ALGORITHM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsoSigningAlgorithmType(@javax.annotation.Nullable SsoSigningAlgorithmTypeDto ssoSigningAlgorithmType) {
    this.ssoSigningAlgorithmType = ssoSigningAlgorithmType;
  }

  public SsoSettingsV2ConstantsDto ssoEncryptAlgorithmType(@javax.annotation.Nullable SsoEncryptAlgorithmTypeDto ssoEncryptAlgorithmType) {
    
    this.ssoEncryptAlgorithmType = ssoEncryptAlgorithmType;
    return this;
  }

  /**
   * The values the `encryptAlgorithm` and `decryptAlgorithm` of the certificate settings accept. The built-in  configuration uses AES-128 everywhere.
   * @return ssoEncryptAlgorithmType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SSO_ENCRYPT_ALGORITHM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoEncryptAlgorithmTypeDto getSsoEncryptAlgorithmType() {
    return ssoEncryptAlgorithmType;
  }


  @JsonProperty(value = JSON_PROPERTY_SSO_ENCRYPT_ALGORITHM_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsoEncryptAlgorithmType(@javax.annotation.Nullable SsoEncryptAlgorithmTypeDto ssoEncryptAlgorithmType) {
    this.ssoEncryptAlgorithmType = ssoEncryptAlgorithmType;
  }

  public SsoSettingsV2ConstantsDto ssoSpCertificateActionType(@javax.annotation.Nullable SsoSpCertificateActionTypeDto ssoSpCertificateActionType) {
    
    this.ssoSpCertificateActionType = ssoSpCertificateActionType;
    return this;
  }

  /**
   * The values the `action` of a service provider certificate accepts, which is what the portal's own key  pair may be used for.
   * @return ssoSpCertificateActionType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SSO_SP_CERTIFICATE_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoSpCertificateActionTypeDto getSsoSpCertificateActionType() {
    return ssoSpCertificateActionType;
  }


  @JsonProperty(value = JSON_PROPERTY_SSO_SP_CERTIFICATE_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsoSpCertificateActionType(@javax.annotation.Nullable SsoSpCertificateActionTypeDto ssoSpCertificateActionType) {
    this.ssoSpCertificateActionType = ssoSpCertificateActionType;
  }

  public SsoSettingsV2ConstantsDto ssoIdpCertificateActionType(@javax.annotation.Nullable SsoIdpCertificateActionTypeDto ssoIdpCertificateActionType) {
    
    this.ssoIdpCertificateActionType = ssoIdpCertificateActionType;
    return this;
  }

  /**
   * The values the `action` of an identity provider certificate accepts, which is what the provider's  certificate may be used for - the mirror image of the service provider actions.
   * @return ssoIdpCertificateActionType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SSO_IDP_CERTIFICATE_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsoIdpCertificateActionTypeDto getSsoIdpCertificateActionType() {
    return ssoIdpCertificateActionType;
  }


  @JsonProperty(value = JSON_PROPERTY_SSO_IDP_CERTIFICATE_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsoIdpCertificateActionType(@javax.annotation.Nullable SsoIdpCertificateActionTypeDto ssoIdpCertificateActionType) {
    this.ssoIdpCertificateActionType = ssoIdpCertificateActionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoSettingsV2ConstantsDto ssoSettingsV2ConstantsDto = (SsoSettingsV2ConstantsDto) o;
    return Objects.equals(this.ssoNameIdFormatType, ssoSettingsV2ConstantsDto.ssoNameIdFormatType) &&
        Objects.equals(this.ssoBindingType, ssoSettingsV2ConstantsDto.ssoBindingType) &&
        Objects.equals(this.ssoSigningAlgorithmType, ssoSettingsV2ConstantsDto.ssoSigningAlgorithmType) &&
        Objects.equals(this.ssoEncryptAlgorithmType, ssoSettingsV2ConstantsDto.ssoEncryptAlgorithmType) &&
        Objects.equals(this.ssoSpCertificateActionType, ssoSettingsV2ConstantsDto.ssoSpCertificateActionType) &&
        Objects.equals(this.ssoIdpCertificateActionType, ssoSettingsV2ConstantsDto.ssoIdpCertificateActionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssoNameIdFormatType, ssoBindingType, ssoSigningAlgorithmType, ssoEncryptAlgorithmType, ssoSpCertificateActionType, ssoIdpCertificateActionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsoSettingsV2ConstantsDto {\n");
    sb.append("    ssoNameIdFormatType: ").append(toIndentedString(ssoNameIdFormatType)).append("\n");
    sb.append("    ssoBindingType: ").append(toIndentedString(ssoBindingType)).append("\n");
    sb.append("    ssoSigningAlgorithmType: ").append(toIndentedString(ssoSigningAlgorithmType)).append("\n");
    sb.append("    ssoEncryptAlgorithmType: ").append(toIndentedString(ssoEncryptAlgorithmType)).append("\n");
    sb.append("    ssoSpCertificateActionType: ").append(toIndentedString(ssoSpCertificateActionType)).append("\n");
    sb.append("    ssoIdpCertificateActionType: ").append(toIndentedString(ssoIdpCertificateActionType)).append("\n");
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

    // add `ssoNameIdFormatType` to the URL query string
    if (getSsoNameIdFormatType() != null) {
      joiner.add(getSsoNameIdFormatType().toUrlQueryString(prefix + "ssoNameIdFormatType" + suffix));
    }

    // add `ssoBindingType` to the URL query string
    if (getSsoBindingType() != null) {
      joiner.add(getSsoBindingType().toUrlQueryString(prefix + "ssoBindingType" + suffix));
    }

    // add `ssoSigningAlgorithmType` to the URL query string
    if (getSsoSigningAlgorithmType() != null) {
      joiner.add(getSsoSigningAlgorithmType().toUrlQueryString(prefix + "ssoSigningAlgorithmType" + suffix));
    }

    // add `ssoEncryptAlgorithmType` to the URL query string
    if (getSsoEncryptAlgorithmType() != null) {
      joiner.add(getSsoEncryptAlgorithmType().toUrlQueryString(prefix + "ssoEncryptAlgorithmType" + suffix));
    }

    // add `ssoSpCertificateActionType` to the URL query string
    if (getSsoSpCertificateActionType() != null) {
      joiner.add(getSsoSpCertificateActionType().toUrlQueryString(prefix + "ssoSpCertificateActionType" + suffix));
    }

    // add `ssoIdpCertificateActionType` to the URL query string
    if (getSsoIdpCertificateActionType() != null) {
      joiner.add(getSsoIdpCertificateActionType().toUrlQueryString(prefix + "ssoIdpCertificateActionType" + suffix));
    }

    return joiner.toString();
  }

}

