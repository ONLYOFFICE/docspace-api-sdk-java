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
import java.time.OffsetDateTime;
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
 * The SSO certificate parameters.
 */
@JsonPropertyOrder({
  SsoCertificate.JSON_PROPERTY_SELF_SIGNED,
  SsoCertificate.JSON_PROPERTY_CRT,
  SsoCertificate.JSON_PROPERTY_KEY,
  SsoCertificate.JSON_PROPERTY_ACTION,
  SsoCertificate.JSON_PROPERTY_DOMAIN_NAME,
  SsoCertificate.JSON_PROPERTY_START_DATE,
  SsoCertificate.JSON_PROPERTY_EXPIRED_DATE
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class SsoCertificate {
  public static final String JSON_PROPERTY_SELF_SIGNED = "selfSigned";
  @javax.annotation.Nullable
  private Boolean selfSigned;

  public static final String JSON_PROPERTY_CRT = "crt";
  @javax.annotation.Nullable
  private JsonNullable<String> crt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTION = "action";
  @javax.annotation.Nullable
  private JsonNullable<String> action = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domainName";
  @javax.annotation.Nullable
  private JsonNullable<String> domainName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  @javax.annotation.Nullable
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_EXPIRED_DATE = "expiredDate";
  @javax.annotation.Nullable
  private OffsetDateTime expiredDate;

  public SsoCertificate() {
  }

  public SsoCertificate selfSigned(@javax.annotation.Nullable Boolean selfSigned) {
    
    this.selfSigned = selfSigned;
    return this;
  }

  /**
   * Specifies if a certificate is self-signed or not.
   * @return selfSigned
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF_SIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSelfSigned() {
    return selfSigned;
  }


  @JsonProperty(JSON_PROPERTY_SELF_SIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelfSigned(@javax.annotation.Nullable Boolean selfSigned) {
    this.selfSigned = selfSigned;
  }

  public SsoCertificate crt(@javax.annotation.Nullable String crt) {
    this.crt = JsonNullable.<String>of(crt);
    
    return this;
  }

  /**
   * The CRT certificate file.
   * @return crt
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCrt() {
        return crt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CRT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCrt_JsonNullable() {
    return crt;
  }
  
  @JsonProperty(JSON_PROPERTY_CRT)
  public void setCrt_JsonNullable(JsonNullable<String> crt) {
    this.crt = crt;
  }

  public void setCrt(@javax.annotation.Nullable String crt) {
    this.crt = JsonNullable.<String>of(crt);
  }

  public SsoCertificate key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The certificate key.
   * @return key
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getKey_JsonNullable() {
    return key;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY)
  public void setKey_JsonNullable(JsonNullable<String> key) {
    this.key = key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
  }

  public SsoCertificate action(@javax.annotation.Nullable String action) {
    this.action = JsonNullable.<String>of(action);
    
    return this;
  }

  /**
   * The certificate action.
   * @return action
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAction() {
        return action.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAction_JsonNullable() {
    return action;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTION)
  public void setAction_JsonNullable(JsonNullable<String> action) {
    this.action = action;
  }

  public void setAction(@javax.annotation.Nullable String action) {
    this.action = JsonNullable.<String>of(action);
  }

  public SsoCertificate domainName(@javax.annotation.Nullable String domainName) {
    this.domainName = JsonNullable.<String>of(domainName);
    
    return this;
  }

  /**
   * The certificate domain name.
   * @return domainName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDomainName() {
        return domainName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDomainName_JsonNullable() {
    return domainName;
  }
  
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  public void setDomainName_JsonNullable(JsonNullable<String> domainName) {
    this.domainName = domainName;
  }

  public void setDomainName(@javax.annotation.Nullable String domainName) {
    this.domainName = JsonNullable.<String>of(domainName);
  }

  public SsoCertificate startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

  /**
   * The certificate start date.
   * @return startDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public SsoCertificate expiredDate(@javax.annotation.Nullable OffsetDateTime expiredDate) {
    
    this.expiredDate = expiredDate;
    return this;
  }

  /**
   * The certificate expiration date.
   * @return expiredDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiredDate() {
    return expiredDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiredDate(@javax.annotation.Nullable OffsetDateTime expiredDate) {
    this.expiredDate = expiredDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoCertificate ssoCertificate = (SsoCertificate) o;
    return Objects.equals(this.selfSigned, ssoCertificate.selfSigned) &&
        equalsNullable(this.crt, ssoCertificate.crt) &&
        equalsNullable(this.key, ssoCertificate.key) &&
        equalsNullable(this.action, ssoCertificate.action) &&
        equalsNullable(this.domainName, ssoCertificate.domainName) &&
        Objects.equals(this.startDate, ssoCertificate.startDate) &&
        Objects.equals(this.expiredDate, ssoCertificate.expiredDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(selfSigned, hashCodeNullable(crt), hashCodeNullable(key), hashCodeNullable(action), hashCodeNullable(domainName), startDate, expiredDate);
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
    sb.append("class SsoCertificate {\n");
    sb.append("    selfSigned: ").append(toIndentedString(selfSigned)).append("\n");
    sb.append("    crt: ").append(toIndentedString(crt)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiredDate: ").append(toIndentedString(expiredDate)).append("\n");
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

    // add `selfSigned` to the URL query string
    if (getSelfSigned() != null) {
      try {
        joiner.add(String.format("%sselfSigned%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSelfSigned()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `crt` to the URL query string
    if (getCrt() != null) {
      try {
        joiner.add(String.format("%scrt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCrt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `action` to the URL query string
    if (getAction() != null) {
      try {
        joiner.add(String.format("%saction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `domainName` to the URL query string
    if (getDomainName() != null) {
      try {
        joiner.add(String.format("%sdomainName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDomainName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startDate` to the URL query string
    if (getStartDate() != null) {
      try {
        joiner.add(String.format("%sstartDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expiredDate` to the URL query string
    if (getExpiredDate() != null) {
      try {
        joiner.add(String.format("%sexpiredDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiredDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

