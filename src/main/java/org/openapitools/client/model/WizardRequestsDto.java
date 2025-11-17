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
 * The request parameters for initial configuration of the setup wizard.
 */
@JsonPropertyOrder({
  WizardRequestsDto.JSON_PROPERTY_EMAIL,
  WizardRequestsDto.JSON_PROPERTY_PASSWORD_HASH,
  WizardRequestsDto.JSON_PROPERTY_LNG,
  WizardRequestsDto.JSON_PROPERTY_TIME_ZONE,
  WizardRequestsDto.JSON_PROPERTY_AMI_ID,
  WizardRequestsDto.JSON_PROPERTY_SUBSCRIBE_FROM_SITE
})

public class WizardRequestsDto {
  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_PASSWORD_HASH = "passwordHash";
  @javax.annotation.Nullable
  private String passwordHash;

  public static final String JSON_PROPERTY_LNG = "lng";
  @javax.annotation.Nullable
  private JsonNullable<String> lng = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private JsonNullable<String> timeZone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AMI_ID = "amiId";
  @javax.annotation.Nullable
  private JsonNullable<String> amiId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBSCRIBE_FROM_SITE = "subscribeFromSite";
  @javax.annotation.Nullable
  private Boolean subscribeFromSite;

  public WizardRequestsDto() {
  }

  public WizardRequestsDto email(@javax.annotation.Nullable String email) {
    
    this.email = email;
    return this;
  }

  /**
   * The user&#39;s email address for authentication and communication.
   * @return email
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }

  public WizardRequestsDto passwordHash(@javax.annotation.Nullable String passwordHash) {
    
    this.passwordHash = passwordHash;
    return this;
  }

  /**
   * The hashed representation of the user&#39;s password.
   * @return passwordHash
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPasswordHash() {
    return passwordHash;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPasswordHash(@javax.annotation.Nullable String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public WizardRequestsDto lng(@javax.annotation.Nullable String lng) {
    this.lng = JsonNullable.<String>of(lng);
    
    return this;
  }

  /**
   * The user&#39;s preferred interface language code.
   * @return lng
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLng() {
        return lng.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LNG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLng_JsonNullable() {
    return lng;
  }
  
  @JsonProperty(JSON_PROPERTY_LNG)
  public void setLng_JsonNullable(JsonNullable<String> lng) {
    this.lng = lng;
  }

  public void setLng(@javax.annotation.Nullable String lng) {
    this.lng = JsonNullable.<String>of(lng);
  }

  public WizardRequestsDto timeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = JsonNullable.<String>of(timeZone);
    
    return this;
  }

  /**
   * The user&#39;s time zone identifier.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTimeZone() {
        return timeZone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTimeZone_JsonNullable() {
    return timeZone;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  public void setTimeZone_JsonNullable(JsonNullable<String> timeZone) {
    this.timeZone = timeZone;
  }

  public void setTimeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = JsonNullable.<String>of(timeZone);
  }

  public WizardRequestsDto amiId(@javax.annotation.Nullable String amiId) {
    this.amiId = JsonNullable.<String>of(amiId);
    
    return this;
  }

  /**
   * The Amazon Machine Image (AMI) identifier.
   * @return amiId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAmiId() {
        return amiId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMI_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAmiId_JsonNullable() {
    return amiId;
  }
  
  @JsonProperty(JSON_PROPERTY_AMI_ID)
  public void setAmiId_JsonNullable(JsonNullable<String> amiId) {
    this.amiId = amiId;
  }

  public void setAmiId(@javax.annotation.Nullable String amiId) {
    this.amiId = JsonNullable.<String>of(amiId);
  }

  public WizardRequestsDto subscribeFromSite(@javax.annotation.Nullable Boolean subscribeFromSite) {
    
    this.subscribeFromSite = subscribeFromSite;
    return this;
  }

  /**
   * Specifies whether the user opted in for site communications.
   * @return subscribeFromSite
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBE_FROM_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubscribeFromSite() {
    return subscribeFromSite;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBE_FROM_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscribeFromSite(@javax.annotation.Nullable Boolean subscribeFromSite) {
    this.subscribeFromSite = subscribeFromSite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WizardRequestsDto wizardRequestsDto = (WizardRequestsDto) o;
    return Objects.equals(this.email, wizardRequestsDto.email) &&
        Objects.equals(this.passwordHash, wizardRequestsDto.passwordHash) &&
        equalsNullable(this.lng, wizardRequestsDto.lng) &&
        equalsNullable(this.timeZone, wizardRequestsDto.timeZone) &&
        equalsNullable(this.amiId, wizardRequestsDto.amiId) &&
        Objects.equals(this.subscribeFromSite, wizardRequestsDto.subscribeFromSite);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, passwordHash, hashCodeNullable(lng), hashCodeNullable(timeZone), hashCodeNullable(amiId), subscribeFromSite);
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
    sb.append("class WizardRequestsDto {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    amiId: ").append(toIndentedString(amiId)).append("\n");
    sb.append("    subscribeFromSite: ").append(toIndentedString(subscribeFromSite)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `lng` to the URL query string
    if (getLng() != null) {
      try {
        joiner.add(String.format("%slng%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLng()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amiId` to the URL query string
    if (getAmiId() != null) {
      try {
        joiner.add(String.format("%samiId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmiId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscribeFromSite` to the URL query string
    if (getSubscribeFromSite() != null) {
      try {
        joiner.add(String.format("%ssubscribeFromSite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscribeFromSite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

