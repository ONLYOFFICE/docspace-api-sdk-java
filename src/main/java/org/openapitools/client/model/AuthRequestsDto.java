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
import org.openapitools.client.model.ConfirmData;
import org.openapitools.client.model.RecaptchaType;
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
 * The parameters required for the user authentication requests.
 */
@JsonPropertyOrder({
  AuthRequestsDto.JSON_PROPERTY_USER_NAME,
  AuthRequestsDto.JSON_PROPERTY_PASSWORD,
  AuthRequestsDto.JSON_PROPERTY_PASSWORD_HASH,
  AuthRequestsDto.JSON_PROPERTY_PROVIDER,
  AuthRequestsDto.JSON_PROPERTY_ACCESS_TOKEN,
  AuthRequestsDto.JSON_PROPERTY_SERIALIZED_PROFILE,
  AuthRequestsDto.JSON_PROPERTY_CODE,
  AuthRequestsDto.JSON_PROPERTY_CODE_O_AUTH,
  AuthRequestsDto.JSON_PROPERTY_SESSION,
  AuthRequestsDto.JSON_PROPERTY_CONFIRM_DATA,
  AuthRequestsDto.JSON_PROPERTY_RECAPTCHA_TYPE,
  AuthRequestsDto.JSON_PROPERTY_RECAPTCHA_RESPONSE,
  AuthRequestsDto.JSON_PROPERTY_CULTURE
})

public class AuthRequestsDto {
  public static final String JSON_PROPERTY_USER_NAME = "userName";
  @javax.annotation.Nullable
  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD_HASH = "passwordHash";
  @javax.annotation.Nullable
  private JsonNullable<String> passwordHash = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable
  private JsonNullable<String> provider = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCESS_TOKEN = "accessToken";
  @javax.annotation.Nullable
  private JsonNullable<String> accessToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERIALIZED_PROFILE = "serializedProfile";
  @javax.annotation.Nullable
  private JsonNullable<String> serializedProfile = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nullable
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CODE_O_AUTH = "codeOAuth";
  @javax.annotation.Nullable
  private JsonNullable<String> codeOAuth = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SESSION = "session";
  @javax.annotation.Nullable
  private Boolean session;

  public static final String JSON_PROPERTY_CONFIRM_DATA = "confirmData";
  @javax.annotation.Nullable
  private ConfirmData confirmData;

  public static final String JSON_PROPERTY_RECAPTCHA_TYPE = "recaptchaType";
  @javax.annotation.Nullable
  private RecaptchaType recaptchaType;

  public static final String JSON_PROPERTY_RECAPTCHA_RESPONSE = "recaptchaResponse";
  @javax.annotation.Nullable
  private JsonNullable<String> recaptchaResponse = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CULTURE = "culture";
  @javax.annotation.Nullable
  private JsonNullable<String> culture = JsonNullable.<String>undefined();

  public AuthRequestsDto() {
  }


  public AuthRequestsDto userName(@javax.annotation.Nullable String userName) {
    this.userName = JsonNullable.<String>of(userName);
    
    return this;
  }

  /**
   * The username or email used for authentication.
   * @return userName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUserName() {
        return userName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserName_JsonNullable() {
    return userName;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  public void setUserName_JsonNullable(JsonNullable<String> userName) {
    this.userName = userName;
  }

  public void setUserName(@javax.annotation.Nullable String userName) {
    this.userName = JsonNullable.<String>of(userName);
  }

  public AuthRequestsDto password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The password in plain text for user authentication.
   * @return password
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
  }

  public AuthRequestsDto passwordHash(@javax.annotation.Nullable String passwordHash) {
    this.passwordHash = JsonNullable.<String>of(passwordHash);
    
    return this;
  }

  /**
   * The hashed password for secure verification.
   * @return passwordHash
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPasswordHash() {
        return passwordHash.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPasswordHash_JsonNullable() {
    return passwordHash;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD_HASH)
  public void setPasswordHash_JsonNullable(JsonNullable<String> passwordHash) {
    this.passwordHash = passwordHash;
  }

  public void setPasswordHash(@javax.annotation.Nullable String passwordHash) {
    this.passwordHash = JsonNullable.<String>of(passwordHash);
  }

  public AuthRequestsDto provider(@javax.annotation.Nullable String provider) {
    this.provider = JsonNullable.<String>of(provider);
    
    return this;
  }

  /**
   * The type of authentication provider (e.g., internal, Google, Azure).
   * @return provider
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProvider() {
        return provider.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProvider_JsonNullable() {
    return provider;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  public void setProvider_JsonNullable(JsonNullable<String> provider) {
    this.provider = provider;
  }

  public void setProvider(@javax.annotation.Nullable String provider) {
    this.provider = JsonNullable.<String>of(provider);
  }

  public AuthRequestsDto accessToken(@javax.annotation.Nullable String accessToken) {
    this.accessToken = JsonNullable.<String>of(accessToken);
    
    return this;
  }

  /**
   * The access token used for authentication with external providers.
   * @return accessToken
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAccessToken() {
        return accessToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAccessToken_JsonNullable() {
    return accessToken;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  public void setAccessToken_JsonNullable(JsonNullable<String> accessToken) {
    this.accessToken = accessToken;
  }

  public void setAccessToken(@javax.annotation.Nullable String accessToken) {
    this.accessToken = JsonNullable.<String>of(accessToken);
  }

  public AuthRequestsDto serializedProfile(@javax.annotation.Nullable String serializedProfile) {
    this.serializedProfile = JsonNullable.<String>of(serializedProfile);
    
    return this;
  }

  /**
   * The serialized user profile data, if applicable.
   * @return serializedProfile
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSerializedProfile() {
        return serializedProfile.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERIALIZED_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSerializedProfile_JsonNullable() {
    return serializedProfile;
  }
  
  @JsonProperty(JSON_PROPERTY_SERIALIZED_PROFILE)
  public void setSerializedProfile_JsonNullable(JsonNullable<String> serializedProfile) {
    this.serializedProfile = serializedProfile;
  }

  public void setSerializedProfile(@javax.annotation.Nullable String serializedProfile) {
    this.serializedProfile = JsonNullable.<String>of(serializedProfile);
  }

  public AuthRequestsDto code(@javax.annotation.Nullable String code) {
    this.code = JsonNullable.<String>of(code);
    
    return this;
  }

  /**
   * The code for two-factor authentication.
   * @return code
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(@javax.annotation.Nullable String code) {
    this.code = JsonNullable.<String>of(code);
  }

  public AuthRequestsDto codeOAuth(@javax.annotation.Nullable String codeOAuth) {
    this.codeOAuth = JsonNullable.<String>of(codeOAuth);
    
    return this;
  }

  /**
   * The authorization code used for obtaining OAuth tokens.
   * @return codeOAuth
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCodeOAuth() {
        return codeOAuth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE_O_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCodeOAuth_JsonNullable() {
    return codeOAuth;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE_O_AUTH)
  public void setCodeOAuth_JsonNullable(JsonNullable<String> codeOAuth) {
    this.codeOAuth = codeOAuth;
  }

  public void setCodeOAuth(@javax.annotation.Nullable String codeOAuth) {
    this.codeOAuth = JsonNullable.<String>of(codeOAuth);
  }

  public AuthRequestsDto session(@javax.annotation.Nullable Boolean session) {
    
    this.session = session;
    return this;
  }

  /**
   * Specifies whether the authentication is session-based.
   * @return session
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSession() {
    return session;
  }


  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSession(@javax.annotation.Nullable Boolean session) {
    this.session = session;
  }

  public AuthRequestsDto confirmData(@javax.annotation.Nullable ConfirmData confirmData) {
    
    this.confirmData = confirmData;
    return this;
  }

  /**
   * Get confirmData
   * @return confirmData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRM_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfirmData getConfirmData() {
    return confirmData;
  }


  @JsonProperty(JSON_PROPERTY_CONFIRM_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmData(@javax.annotation.Nullable ConfirmData confirmData) {
    this.confirmData = confirmData;
  }

  public AuthRequestsDto recaptchaType(@javax.annotation.Nullable RecaptchaType recaptchaType) {
    
    this.recaptchaType = recaptchaType;
    return this;
  }

  /**
   * Get recaptchaType
   * @return recaptchaType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECAPTCHA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecaptchaType getRecaptchaType() {
    return recaptchaType;
  }


  @JsonProperty(JSON_PROPERTY_RECAPTCHA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecaptchaType(@javax.annotation.Nullable RecaptchaType recaptchaType) {
    this.recaptchaType = recaptchaType;
  }

  public AuthRequestsDto recaptchaResponse(@javax.annotation.Nullable String recaptchaResponse) {
    this.recaptchaResponse = JsonNullable.<String>of(recaptchaResponse);
    
    return this;
  }

  /**
   * The user&#39;s response to the CAPTCHA challenge.
   * @return recaptchaResponse
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRecaptchaResponse() {
        return recaptchaResponse.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECAPTCHA_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRecaptchaResponse_JsonNullable() {
    return recaptchaResponse;
  }
  
  @JsonProperty(JSON_PROPERTY_RECAPTCHA_RESPONSE)
  public void setRecaptchaResponse_JsonNullable(JsonNullable<String> recaptchaResponse) {
    this.recaptchaResponse = recaptchaResponse;
  }

  public void setRecaptchaResponse(@javax.annotation.Nullable String recaptchaResponse) {
    this.recaptchaResponse = JsonNullable.<String>of(recaptchaResponse);
  }

  public AuthRequestsDto culture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
    
    return this;
  }

  /**
   * The culture code for localization during authentication.
   * @return culture
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCulture() {
        return culture.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CULTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCulture_JsonNullable() {
    return culture;
  }
  
  @JsonProperty(JSON_PROPERTY_CULTURE)
  public void setCulture_JsonNullable(JsonNullable<String> culture) {
    this.culture = culture;
  }

  public void setCulture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthRequestsDto authRequestsDto = (AuthRequestsDto) o;
    return equalsNullable(this.userName, authRequestsDto.userName) &&
        equalsNullable(this.password, authRequestsDto.password) &&
        equalsNullable(this.passwordHash, authRequestsDto.passwordHash) &&
        equalsNullable(this.provider, authRequestsDto.provider) &&
        equalsNullable(this.accessToken, authRequestsDto.accessToken) &&
        equalsNullable(this.serializedProfile, authRequestsDto.serializedProfile) &&
        equalsNullable(this.code, authRequestsDto.code) &&
        equalsNullable(this.codeOAuth, authRequestsDto.codeOAuth) &&
        Objects.equals(this.session, authRequestsDto.session) &&
        Objects.equals(this.confirmData, authRequestsDto.confirmData) &&
        Objects.equals(this.recaptchaType, authRequestsDto.recaptchaType) &&
        equalsNullable(this.recaptchaResponse, authRequestsDto.recaptchaResponse) &&
        equalsNullable(this.culture, authRequestsDto.culture);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(userName), hashCodeNullable(password), hashCodeNullable(passwordHash), hashCodeNullable(provider), hashCodeNullable(accessToken), hashCodeNullable(serializedProfile), hashCodeNullable(code), hashCodeNullable(codeOAuth), session, confirmData, recaptchaType, hashCodeNullable(recaptchaResponse), hashCodeNullable(culture));
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
    sb.append("class AuthRequestsDto {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    serializedProfile: ").append(toIndentedString(serializedProfile)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeOAuth: ").append(toIndentedString(codeOAuth)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    confirmData: ").append(toIndentedString(confirmData)).append("\n");
    sb.append("    recaptchaType: ").append(toIndentedString(recaptchaType)).append("\n");
    sb.append("    recaptchaResponse: ").append(toIndentedString(recaptchaResponse)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
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

    // add `userName` to the URL query string
    if (getUserName() != null) {
      try {
        joiner.add(String.format("%suserName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `passwordHash` to the URL query string
    if (getPasswordHash() != null) {
      try {
        joiner.add(String.format("%spasswordHash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPasswordHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `provider` to the URL query string
    if (getProvider() != null) {
      try {
        joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProvider()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `accessToken` to the URL query string
    if (getAccessToken() != null) {
      try {
        joiner.add(String.format("%saccessToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `serializedProfile` to the URL query string
    if (getSerializedProfile() != null) {
      try {
        joiner.add(String.format("%sserializedProfile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSerializedProfile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `codeOAuth` to the URL query string
    if (getCodeOAuth() != null) {
      try {
        joiner.add(String.format("%scodeOAuth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCodeOAuth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `session` to the URL query string
    if (getSession() != null) {
      try {
        joiner.add(String.format("%ssession%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSession()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `confirmData` to the URL query string
    if (getConfirmData() != null) {
      joiner.add(getConfirmData().toUrlQueryString(prefix + "confirmData" + suffix));
    }

    // add `recaptchaType` to the URL query string
    if (getRecaptchaType() != null) {
      try {
        joiner.add(String.format("%srecaptchaType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecaptchaType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recaptchaResponse` to the URL query string
    if (getRecaptchaResponse() != null) {
      try {
        joiner.add(String.format("%srecaptchaResponse%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecaptchaResponse()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `culture` to the URL query string
    if (getCulture() != null) {
      try {
        joiner.add(String.format("%sculture%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCulture()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

