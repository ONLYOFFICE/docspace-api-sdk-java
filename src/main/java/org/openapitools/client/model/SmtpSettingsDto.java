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
 * The SMTP settings parameters.
 */
@JsonPropertyOrder({
  SmtpSettingsDto.JSON_PROPERTY_HOST,
  SmtpSettingsDto.JSON_PROPERTY_PORT,
  SmtpSettingsDto.JSON_PROPERTY_SENDER_ADDRESS,
  SmtpSettingsDto.JSON_PROPERTY_SENDER_DISPLAY_NAME,
  SmtpSettingsDto.JSON_PROPERTY_CREDENTIALS_USER_NAME,
  SmtpSettingsDto.JSON_PROPERTY_CREDENTIALS_USER_PASSWORD,
  SmtpSettingsDto.JSON_PROPERTY_ENABLE_S_S_L,
  SmtpSettingsDto.JSON_PROPERTY_ENABLE_AUTH,
  SmtpSettingsDto.JSON_PROPERTY_USE_NTLM,
  SmtpSettingsDto.JSON_PROPERTY_IS_DEFAULT_SETTINGS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class SmtpSettingsDto {
  public static final String JSON_PROPERTY_HOST = "host";
  @javax.annotation.Nullable
  private JsonNullable<String> host = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PORT = "port";
  @javax.annotation.Nullable
  private JsonNullable<Integer> port = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SENDER_ADDRESS = "senderAddress";
  @javax.annotation.Nullable
  private JsonNullable<String> senderAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SENDER_DISPLAY_NAME = "senderDisplayName";
  @javax.annotation.Nullable
  private JsonNullable<String> senderDisplayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREDENTIALS_USER_NAME = "credentialsUserName";
  @javax.annotation.Nullable
  private JsonNullable<String> credentialsUserName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREDENTIALS_USER_PASSWORD = "credentialsUserPassword";
  @javax.annotation.Nullable
  private JsonNullable<String> credentialsUserPassword = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLE_S_S_L = "enableSSL";
  @javax.annotation.Nullable
  private Boolean enableSSL;

  public static final String JSON_PROPERTY_ENABLE_AUTH = "enableAuth";
  @javax.annotation.Nullable
  private Boolean enableAuth;

  public static final String JSON_PROPERTY_USE_NTLM = "useNtlm";
  @javax.annotation.Nullable
  private Boolean useNtlm;

  public static final String JSON_PROPERTY_IS_DEFAULT_SETTINGS = "isDefaultSettings";
  @javax.annotation.Nullable
  private Boolean isDefaultSettings;

  public SmtpSettingsDto() {
  }

  public SmtpSettingsDto host(@javax.annotation.Nullable String host) {
    this.host = JsonNullable.<String>of(host);
    
    return this;
  }

  /**
   * The SMTP host.
   * @return host
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getHost() {
        return host.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHost_JsonNullable() {
    return host;
  }
  
  @JsonProperty(JSON_PROPERTY_HOST)
  public void setHost_JsonNullable(JsonNullable<String> host) {
    this.host = host;
  }

  public void setHost(@javax.annotation.Nullable String host) {
    this.host = JsonNullable.<String>of(host);
  }

  public SmtpSettingsDto port(@javax.annotation.Nullable Integer port) {
    this.port = JsonNullable.<Integer>of(port);
    
    return this;
  }

  /**
   * The SMTP port.
   * minimum: 1
   * maximum: 65535
   * @return port
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getPort() {
        return port.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPort_JsonNullable() {
    return port;
  }
  
  @JsonProperty(JSON_PROPERTY_PORT)
  public void setPort_JsonNullable(JsonNullable<Integer> port) {
    this.port = port;
  }

  public void setPort(@javax.annotation.Nullable Integer port) {
    this.port = JsonNullable.<Integer>of(port);
  }

  public SmtpSettingsDto senderAddress(@javax.annotation.Nullable String senderAddress) {
    this.senderAddress = JsonNullable.<String>of(senderAddress);
    
    return this;
  }

  /**
   * The sender address.
   * @return senderAddress
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSenderAddress() {
        return senderAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENDER_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSenderAddress_JsonNullable() {
    return senderAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_SENDER_ADDRESS)
  public void setSenderAddress_JsonNullable(JsonNullable<String> senderAddress) {
    this.senderAddress = senderAddress;
  }

  public void setSenderAddress(@javax.annotation.Nullable String senderAddress) {
    this.senderAddress = JsonNullable.<String>of(senderAddress);
  }

  public SmtpSettingsDto senderDisplayName(@javax.annotation.Nullable String senderDisplayName) {
    this.senderDisplayName = JsonNullable.<String>of(senderDisplayName);
    
    return this;
  }

  /**
   * The sender display name.
   * @return senderDisplayName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSenderDisplayName() {
        return senderDisplayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENDER_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSenderDisplayName_JsonNullable() {
    return senderDisplayName;
  }
  
  @JsonProperty(JSON_PROPERTY_SENDER_DISPLAY_NAME)
  public void setSenderDisplayName_JsonNullable(JsonNullable<String> senderDisplayName) {
    this.senderDisplayName = senderDisplayName;
  }

  public void setSenderDisplayName(@javax.annotation.Nullable String senderDisplayName) {
    this.senderDisplayName = JsonNullable.<String>of(senderDisplayName);
  }

  public SmtpSettingsDto credentialsUserName(@javax.annotation.Nullable String credentialsUserName) {
    this.credentialsUserName = JsonNullable.<String>of(credentialsUserName);
    
    return this;
  }

  /**
   * The credentials username.
   * @return credentialsUserName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCredentialsUserName() {
        return credentialsUserName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREDENTIALS_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCredentialsUserName_JsonNullable() {
    return credentialsUserName;
  }
  
  @JsonProperty(JSON_PROPERTY_CREDENTIALS_USER_NAME)
  public void setCredentialsUserName_JsonNullable(JsonNullable<String> credentialsUserName) {
    this.credentialsUserName = credentialsUserName;
  }

  public void setCredentialsUserName(@javax.annotation.Nullable String credentialsUserName) {
    this.credentialsUserName = JsonNullable.<String>of(credentialsUserName);
  }

  public SmtpSettingsDto credentialsUserPassword(@javax.annotation.Nullable String credentialsUserPassword) {
    this.credentialsUserPassword = JsonNullable.<String>of(credentialsUserPassword);
    
    return this;
  }

  /**
   * The credentials user password.
   * @return credentialsUserPassword
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCredentialsUserPassword() {
        return credentialsUserPassword.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREDENTIALS_USER_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCredentialsUserPassword_JsonNullable() {
    return credentialsUserPassword;
  }
  
  @JsonProperty(JSON_PROPERTY_CREDENTIALS_USER_PASSWORD)
  public void setCredentialsUserPassword_JsonNullable(JsonNullable<String> credentialsUserPassword) {
    this.credentialsUserPassword = credentialsUserPassword;
  }

  public void setCredentialsUserPassword(@javax.annotation.Nullable String credentialsUserPassword) {
    this.credentialsUserPassword = JsonNullable.<String>of(credentialsUserPassword);
  }

  public SmtpSettingsDto enableSSL(@javax.annotation.Nullable Boolean enableSSL) {
    
    this.enableSSL = enableSSL;
    return this;
  }

  /**
   * Specifies whether the SSL is enabled or not.
   * @return enableSSL
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_S_S_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableSSL() {
    return enableSSL;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_S_S_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableSSL(@javax.annotation.Nullable Boolean enableSSL) {
    this.enableSSL = enableSSL;
  }

  public SmtpSettingsDto enableAuth(@javax.annotation.Nullable Boolean enableAuth) {
    
    this.enableAuth = enableAuth;
    return this;
  }

  /**
   * Specifies whether the authentication is enabled or not.
   * @return enableAuth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableAuth() {
    return enableAuth;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableAuth(@javax.annotation.Nullable Boolean enableAuth) {
    this.enableAuth = enableAuth;
  }

  public SmtpSettingsDto useNtlm(@javax.annotation.Nullable Boolean useNtlm) {
    
    this.useNtlm = useNtlm;
    return this;
  }

  /**
   * Specifies whether to use NTLM or not.
   * @return useNtlm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_NTLM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseNtlm() {
    return useNtlm;
  }


  @JsonProperty(JSON_PROPERTY_USE_NTLM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseNtlm(@javax.annotation.Nullable Boolean useNtlm) {
    this.useNtlm = useNtlm;
  }

  public SmtpSettingsDto isDefaultSettings(@javax.annotation.Nullable Boolean isDefaultSettings) {
    
    this.isDefaultSettings = isDefaultSettings;
    return this;
  }

  /**
   * Specifies if the current settings are default or not.
   * @return isDefaultSettings
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefaultSettings() {
    return isDefaultSettings;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefaultSettings(@javax.annotation.Nullable Boolean isDefaultSettings) {
    this.isDefaultSettings = isDefaultSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmtpSettingsDto smtpSettingsDto = (SmtpSettingsDto) o;
    return equalsNullable(this.host, smtpSettingsDto.host) &&
        equalsNullable(this.port, smtpSettingsDto.port) &&
        equalsNullable(this.senderAddress, smtpSettingsDto.senderAddress) &&
        equalsNullable(this.senderDisplayName, smtpSettingsDto.senderDisplayName) &&
        equalsNullable(this.credentialsUserName, smtpSettingsDto.credentialsUserName) &&
        equalsNullable(this.credentialsUserPassword, smtpSettingsDto.credentialsUserPassword) &&
        Objects.equals(this.enableSSL, smtpSettingsDto.enableSSL) &&
        Objects.equals(this.enableAuth, smtpSettingsDto.enableAuth) &&
        Objects.equals(this.useNtlm, smtpSettingsDto.useNtlm) &&
        Objects.equals(this.isDefaultSettings, smtpSettingsDto.isDefaultSettings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(host), hashCodeNullable(port), hashCodeNullable(senderAddress), hashCodeNullable(senderDisplayName), hashCodeNullable(credentialsUserName), hashCodeNullable(credentialsUserPassword), enableSSL, enableAuth, useNtlm, isDefaultSettings);
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
    sb.append("class SmtpSettingsDto {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    senderDisplayName: ").append(toIndentedString(senderDisplayName)).append("\n");
    sb.append("    credentialsUserName: ").append(toIndentedString(credentialsUserName)).append("\n");
    sb.append("    credentialsUserPassword: ").append(toIndentedString(credentialsUserPassword)).append("\n");
    sb.append("    enableSSL: ").append(toIndentedString(enableSSL)).append("\n");
    sb.append("    enableAuth: ").append(toIndentedString(enableAuth)).append("\n");
    sb.append("    useNtlm: ").append(toIndentedString(useNtlm)).append("\n");
    sb.append("    isDefaultSettings: ").append(toIndentedString(isDefaultSettings)).append("\n");
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

    // add `host` to the URL query string
    if (getHost() != null) {
      try {
        joiner.add(String.format("%shost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHost()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      try {
        joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `senderAddress` to the URL query string
    if (getSenderAddress() != null) {
      try {
        joiner.add(String.format("%ssenderAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSenderAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `senderDisplayName` to the URL query string
    if (getSenderDisplayName() != null) {
      try {
        joiner.add(String.format("%ssenderDisplayName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSenderDisplayName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `credentialsUserName` to the URL query string
    if (getCredentialsUserName() != null) {
      try {
        joiner.add(String.format("%scredentialsUserName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCredentialsUserName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `credentialsUserPassword` to the URL query string
    if (getCredentialsUserPassword() != null) {
      try {
        joiner.add(String.format("%scredentialsUserPassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCredentialsUserPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enableSSL` to the URL query string
    if (getEnableSSL() != null) {
      try {
        joiner.add(String.format("%senableSSL%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableSSL()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enableAuth` to the URL query string
    if (getEnableAuth() != null) {
      try {
        joiner.add(String.format("%senableAuth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableAuth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `useNtlm` to the URL query string
    if (getUseNtlm() != null) {
      try {
        joiner.add(String.format("%suseNtlm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUseNtlm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isDefaultSettings` to the URL query string
    if (getIsDefaultSettings() != null) {
      try {
        joiner.add(String.format("%sisDefaultSettings%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDefaultSettings()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

