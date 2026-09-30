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
 * The same credentials as an ordinary sign-in, plus the one-time code that completes it.
 */
@JsonPropertyOrder({
  AuthWithCodeRequestsDto.JSON_PROPERTY_USER_NAME,
  AuthWithCodeRequestsDto.JSON_PROPERTY_PASSWORD,
  AuthWithCodeRequestsDto.JSON_PROPERTY_PASSWORD_HASH,
  AuthWithCodeRequestsDto.JSON_PROPERTY_PROVIDER,
  AuthWithCodeRequestsDto.JSON_PROPERTY_ACCESS_TOKEN,
  AuthWithCodeRequestsDto.JSON_PROPERTY_SERIALIZED_PROFILE,
  AuthWithCodeRequestsDto.JSON_PROPERTY_CODE_O_AUTH,
  AuthWithCodeRequestsDto.JSON_PROPERTY_SESSION,
  AuthWithCodeRequestsDto.JSON_PROPERTY_CONFIRM_DATA,
  AuthWithCodeRequestsDto.JSON_PROPERTY_RECAPTCHA_TYPE,
  AuthWithCodeRequestsDto.JSON_PROPERTY_RECAPTCHA_RESPONSE,
  AuthWithCodeRequestsDto.JSON_PROPERTY_CULTURE,
  AuthWithCodeRequestsDto.JSON_PROPERTY_CODE
})

public class AuthWithCodeRequestsDto {
  public static final String JSON_PROPERTY_USER_NAME = "userName";
  @javax.annotation.Nullable  private String userName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable  private String password;

  public static final String JSON_PROPERTY_PASSWORD_HASH = "passwordHash";
  @javax.annotation.Nullable  private String passwordHash;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable  private String provider;

  public static final String JSON_PROPERTY_ACCESS_TOKEN = "accessToken";
  @javax.annotation.Nullable  private String accessToken;

  public static final String JSON_PROPERTY_SERIALIZED_PROFILE = "serializedProfile";
  @javax.annotation.Nullable  private String serializedProfile;

  public static final String JSON_PROPERTY_CODE_O_AUTH = "codeOAuth";
  @javax.annotation.Nullable  private String codeOAuth;

  public static final String JSON_PROPERTY_SESSION = "session";
  @javax.annotation.Nullable  private Boolean session;

  public static final String JSON_PROPERTY_CONFIRM_DATA = "confirmData";
  @javax.annotation.Nullable  private ConfirmData confirmData;

  public static final String JSON_PROPERTY_RECAPTCHA_TYPE = "recaptchaType";
  @javax.annotation.Nullable  private RecaptchaType recaptchaType;

  public static final String JSON_PROPERTY_RECAPTCHA_RESPONSE = "recaptchaResponse";
  @javax.annotation.Nullable  private String recaptchaResponse;

  public static final String JSON_PROPERTY_CULTURE = "culture";
  @javax.annotation.Nullable  private String culture;

  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nullable  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public AuthWithCodeRequestsDto() {
  }


  public AuthWithCodeRequestsDto userName(@javax.annotation.Nullable String userName) {
    
    this.userName = userName;
    return this;
  }

  /**
   * The account signing in, given as its email address or its portal user name. It is required for a password  sign-in and ignored when the credentials are a confirmation key or a third-party account.
   * @return userName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(@javax.annotation.Nullable String userName) {
    this.userName = userName;
  }

  public AuthWithCodeRequestsDto password(@javax.annotation.Nullable String password) {
    
    this.password = password;
    return this;
  }

  /**
   * The password in the clear. Send either this or `passwordHash`, never both; hashing it in the client with the  parameters from `GET api/2.0/settings?withpassword=true` and sending `passwordHash` instead keeps the plain  password off the wire.
   * @return password
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }

  public AuthWithCodeRequestsDto passwordHash(@javax.annotation.Nullable String passwordHash) {
    
    this.passwordHash = passwordHash;
    return this;
  }

  /**
   * The password already hashed in the client. It has to be produced with the `salt`, iteration count and hash  size that `GET api/2.0/settings?withpassword=true` publishes, or the portal cannot recognise it; a value sent  here takes the place of `password`.
   * @return passwordHash
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PASSWORD_HASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPasswordHash() {
    return passwordHash;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD_HASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordHash(@javax.annotation.Nullable String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public AuthWithCodeRequestsDto provider(@javax.annotation.Nullable String provider) {
    
    this.provider = provider;
    return this;
  }

  /**
   * The third-party identity provider the account is being signed in through, by its internal key such as  `google` or `linkedin`. Sending it switches the call to a third-party sign-in, which needs `accessToken` or  `serializedProfile` and is only allowed on a self-hosted installation or a tariff that includes third-party  sign-in.
   * @return provider
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvider() {
    return provider;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(@javax.annotation.Nullable String provider) {
    this.provider = provider;
  }

  public AuthWithCodeRequestsDto accessToken(@javax.annotation.Nullable String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

  /**
   * The access token the provider named in `provider` issued for the account, passed on unchanged for the portal  to verify with that provider. The portal then matches the address it gets back against its own accounts, so a  valid token for an address unknown here is answered as no such user.
   * @return accessToken
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACCESS_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessToken() {
    return accessToken;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessToken(@javax.annotation.Nullable String accessToken) {
    this.accessToken = accessToken;
  }

  public AuthWithCodeRequestsDto serializedProfile(@javax.annotation.Nullable String serializedProfile) {
    
    this.serializedProfile = serializedProfile;
    return this;
  }

  /**
   * The third-party profile already fetched and serialised by the caller, as an alternative to `accessToken` for  a provider whose profile the client holds. It identifies the account by the address it carries.
   * @return serializedProfile
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERIALIZED_PROFILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerializedProfile() {
    return serializedProfile;
  }


  @JsonProperty(value = JSON_PROPERTY_SERIALIZED_PROFILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerializedProfile(@javax.annotation.Nullable String serializedProfile) {
    this.serializedProfile = serializedProfile;
  }

  public AuthWithCodeRequestsDto codeOAuth(@javax.annotation.Nullable String codeOAuth) {
    
    this.codeOAuth = codeOAuth;
    return this;
  }

  /**
   * The OAuth authorization code obtained from the provider, for a flow that has not been exchanged for an access  token yet. It is recorded with the sign-in rather than replacing `accessToken`.
   * @return codeOAuth
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CODE_O_AUTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodeOAuth() {
    return codeOAuth;
  }


  @JsonProperty(value = JSON_PROPERTY_CODE_O_AUTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeOAuth(@javax.annotation.Nullable String codeOAuth) {
    this.codeOAuth = codeOAuth;
  }

  public AuthWithCodeRequestsDto session(@javax.annotation.Nullable Boolean session) {
    
    this.session = session;
    return this;
  }

  /**
   * Whether the issued token is tied to the browser session. When it is, the answer carries no `expires` and the  token dies with the session; otherwise it lives for the portal session lifetime.
   * @return session
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SESSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSession() {
    return session;
  }


  @JsonProperty(value = JSON_PROPERTY_SESSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSession(@javax.annotation.Nullable Boolean session) {
    this.session = session;
  }

  public AuthWithCodeRequestsDto confirmData(@javax.annotation.Nullable ConfirmData confirmData) {
    
    this.confirmData = confirmData;
    return this;
  }

  /**
   * The confirmation link data, as a third way to identify the account beside a password and a third-party  account. Send it when the sign-in comes from a link the portal mailed, in which case `userName` and the  password fields are not read.
   * @return confirmData
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONFIRM_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfirmData getConfirmData() {
    return confirmData;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIRM_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmData(@javax.annotation.Nullable ConfirmData confirmData) {
    this.confirmData = confirmData;
  }

  public AuthWithCodeRequestsDto recaptchaType(@javax.annotation.Nullable RecaptchaType recaptchaType) {
    
    this.recaptchaType = recaptchaType;
    return this;
  }

  /**
   * Which CAPTCHA service the proof in `recaptchaResponse` came from. It has to match the service the  installation is configured with, which `GET api/2.0/settings` publishes together with the site key.
   * @return recaptchaType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecaptchaType getRecaptchaType() {
    return recaptchaType;
  }


  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecaptchaType(@javax.annotation.Nullable RecaptchaType recaptchaType) {
    this.recaptchaType = recaptchaType;
  }

  public AuthWithCodeRequestsDto recaptchaResponse(@javax.annotation.Nullable String recaptchaResponse) {
    
    this.recaptchaResponse = recaptchaResponse;
    return this;
  }

  /**
   * The token the CAPTCHA widget produced in the browser, passed on unchanged for the portal to verify. It is  only demanded once repeated failures have made the portal ask for a challenge, and it is single-use, so a  retry needs a freshly solved one.
   * @return recaptchaResponse
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_RESPONSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecaptchaResponse() {
    return recaptchaResponse;
  }


  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_RESPONSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecaptchaResponse(@javax.annotation.Nullable String recaptchaResponse) {
    this.recaptchaResponse = recaptchaResponse;
  }

  public AuthWithCodeRequestsDto culture(@javax.annotation.Nullable String culture) {
    
    this.culture = culture;
    return this;
  }

  /**
   * The language the sign-in messages and any letter that follows are written in, as a culture name such as  `en-US`. A culture the installation does not have falls back to the portal language.
   * @return culture
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CULTURE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCulture() {
    return culture;
  }


  @JsonProperty(value = JSON_PROPERTY_CULTURE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCulture(@javax.annotation.Nullable String culture) {
    this.culture = culture;
  }

  public AuthWithCodeRequestsDto code(@javax.annotation.Nullable String code) {
    this.code = JsonNullable.<String>of(code);
    
    return this;
  }

  /**
   * The one-time code from the SMS the portal sent or from the authenticator app, whichever second factor the  portal has enabled for this user. It is single-use and expires; a wrong, empty or expired value fails the  sign-in and counts against the brute-force limit.
   * @return code
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CODE, required = false)
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthWithCodeRequestsDto authWithCodeRequestsDto = (AuthWithCodeRequestsDto) o;
    return Objects.equals(this.userName, authWithCodeRequestsDto.userName) &&
        Objects.equals(this.password, authWithCodeRequestsDto.password) &&
        Objects.equals(this.passwordHash, authWithCodeRequestsDto.passwordHash) &&
        Objects.equals(this.provider, authWithCodeRequestsDto.provider) &&
        Objects.equals(this.accessToken, authWithCodeRequestsDto.accessToken) &&
        Objects.equals(this.serializedProfile, authWithCodeRequestsDto.serializedProfile) &&
        Objects.equals(this.codeOAuth, authWithCodeRequestsDto.codeOAuth) &&
        Objects.equals(this.session, authWithCodeRequestsDto.session) &&
        Objects.equals(this.confirmData, authWithCodeRequestsDto.confirmData) &&
        Objects.equals(this.recaptchaType, authWithCodeRequestsDto.recaptchaType) &&
        Objects.equals(this.recaptchaResponse, authWithCodeRequestsDto.recaptchaResponse) &&
        Objects.equals(this.culture, authWithCodeRequestsDto.culture) &&
        equalsNullable(this.code, authWithCodeRequestsDto.code);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, passwordHash, provider, accessToken, serializedProfile, codeOAuth, session, confirmData, recaptchaType, recaptchaResponse, culture, hashCodeNullable(code));
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
    sb.append("class AuthWithCodeRequestsDto {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    serializedProfile: ").append(toIndentedString(serializedProfile)).append("\n");
    sb.append("    codeOAuth: ").append(toIndentedString(codeOAuth)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    confirmData: ").append(toIndentedString(confirmData)).append("\n");
    sb.append("    recaptchaType: ").append(toIndentedString(recaptchaType)).append("\n");
    sb.append("    recaptchaResponse: ").append(toIndentedString(recaptchaResponse)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

