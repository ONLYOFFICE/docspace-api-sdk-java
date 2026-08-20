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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * The capabilities parameters.
 */
@JsonPropertyOrder({
  CapabilitiesDto.JSON_PROPERTY_LDAP_ENABLED,
  CapabilitiesDto.JSON_PROPERTY_LDAP_DOMAIN,
  CapabilitiesDto.JSON_PROPERTY_PROVIDERS,
  CapabilitiesDto.JSON_PROPERTY_SSO_LABEL,
  CapabilitiesDto.JSON_PROPERTY_OAUTH_ENABLED,
  CapabilitiesDto.JSON_PROPERTY_SSO_URL,
  CapabilitiesDto.JSON_PROPERTY_IDENTITY_SERVER_ENABLED
})

public class CapabilitiesDto {
  public static final String JSON_PROPERTY_LDAP_ENABLED = "ldapEnabled";
  @javax.annotation.Nonnull  private Boolean ldapEnabled;

  public static final String JSON_PROPERTY_LDAP_DOMAIN = "ldapDomain";
  @javax.annotation.Nullable  private JsonNullable<String> ldapDomain = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDERS = "providers";
  @javax.annotation.Nullable  private List<String> providers;

  public static final String JSON_PROPERTY_SSO_LABEL = "ssoLabel";
  @javax.annotation.Nullable  private String ssoLabel;

  public static final String JSON_PROPERTY_OAUTH_ENABLED = "oauthEnabled";
  @javax.annotation.Nonnull  private Boolean oauthEnabled;

  public static final String JSON_PROPERTY_SSO_URL = "ssoUrl";
  @javax.annotation.Nullable  private URI ssoUrl;

  public static final String JSON_PROPERTY_IDENTITY_SERVER_ENABLED = "identityServerEnabled";
  @javax.annotation.Nonnull  private Boolean identityServerEnabled;

  public CapabilitiesDto() {
  }


  public CapabilitiesDto ldapEnabled(@javax.annotation.Nonnull Boolean ldapEnabled) {
    
    this.ldapEnabled = ldapEnabled;
    return this;
  }

  /**
   * Specifies if the LDAP settings are enabled or not.
   * @return ldapEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_LDAP_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLdapEnabled() {
    return ldapEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_LDAP_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLdapEnabled(@javax.annotation.Nonnull Boolean ldapEnabled) {
    this.ldapEnabled = ldapEnabled;
  }

  public CapabilitiesDto ldapDomain(@javax.annotation.Nullable String ldapDomain) {
    this.ldapDomain = JsonNullable.<String>of(ldapDomain);
    
    return this;
  }

  /**
   * The LDAP domain.
   * @return ldapDomain
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLdapDomain() {
        return ldapDomain.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LDAP_DOMAIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLdapDomain_JsonNullable() {
    return ldapDomain;
  }
  
  @JsonProperty(JSON_PROPERTY_LDAP_DOMAIN)
  public void setLdapDomain_JsonNullable(JsonNullable<String> ldapDomain) {
    this.ldapDomain = ldapDomain;
  }

  public void setLdapDomain(@javax.annotation.Nullable String ldapDomain) {
    this.ldapDomain = JsonNullable.<String>of(ldapDomain);
  }

  public CapabilitiesDto providers(@javax.annotation.Nullable List<String> providers) {
    
    this.providers = providers;
    return this;
  }

  public CapabilitiesDto addProvidersItem(String providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * The list of providers.
   * @return providers
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getProviders() {
    return providers;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviders(@javax.annotation.Nullable List<String> providers) {
    this.providers = providers;
  }

  public CapabilitiesDto ssoLabel(@javax.annotation.Nullable String ssoLabel) {
    
    this.ssoLabel = ssoLabel;
    return this;
  }

  /**
   * The SP login label.
   * @return ssoLabel
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SSO_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSsoLabel() {
    return ssoLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_SSO_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSsoLabel(@javax.annotation.Nullable String ssoLabel) {
    this.ssoLabel = ssoLabel;
  }

  public CapabilitiesDto oauthEnabled(@javax.annotation.Nonnull Boolean oauthEnabled) {
    
    this.oauthEnabled = oauthEnabled;
    return this;
  }

  /**
   * Specifies if OAuth is enabled or not.
   * @return oauthEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_OAUTH_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getOauthEnabled() {
    return oauthEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_OAUTH_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOauthEnabled(@javax.annotation.Nonnull Boolean oauthEnabled) {
    this.oauthEnabled = oauthEnabled;
  }

  public CapabilitiesDto ssoUrl(@javax.annotation.Nullable URI ssoUrl) {
    
    this.ssoUrl = ssoUrl;
    return this;
  }

  /**
   * The SSO URL. If this parameter is empty, then the SSO settings are disabled.
   * @return ssoUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SSO_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getSsoUrl() {
    return ssoUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_SSO_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSsoUrl(@javax.annotation.Nullable URI ssoUrl) {
    this.ssoUrl = ssoUrl;
  }

  public CapabilitiesDto identityServerEnabled(@javax.annotation.Nonnull Boolean identityServerEnabled) {
    
    this.identityServerEnabled = identityServerEnabled;
    return this;
  }

  /**
   * Specifies if an identity server is enabled or not.
   * @return identityServerEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_IDENTITY_SERVER_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIdentityServerEnabled() {
    return identityServerEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_IDENTITY_SERVER_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentityServerEnabled(@javax.annotation.Nonnull Boolean identityServerEnabled) {
    this.identityServerEnabled = identityServerEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilitiesDto capabilitiesDto = (CapabilitiesDto) o;
    return Objects.equals(this.ldapEnabled, capabilitiesDto.ldapEnabled) &&
        equalsNullable(this.ldapDomain, capabilitiesDto.ldapDomain) &&
        Objects.equals(this.providers, capabilitiesDto.providers) &&
        Objects.equals(this.ssoLabel, capabilitiesDto.ssoLabel) &&
        Objects.equals(this.oauthEnabled, capabilitiesDto.oauthEnabled) &&
        Objects.equals(this.ssoUrl, capabilitiesDto.ssoUrl) &&
        Objects.equals(this.identityServerEnabled, capabilitiesDto.identityServerEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldapEnabled, hashCodeNullable(ldapDomain), providers, ssoLabel, oauthEnabled, ssoUrl, identityServerEnabled);
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
    sb.append("class CapabilitiesDto {\n");
    sb.append("    ldapEnabled: ").append(toIndentedString(ldapEnabled)).append("\n");
    sb.append("    ldapDomain: ").append(toIndentedString(ldapDomain)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    ssoLabel: ").append(toIndentedString(ssoLabel)).append("\n");
    sb.append("    oauthEnabled: ").append(toIndentedString(oauthEnabled)).append("\n");
    sb.append("    ssoUrl: ").append(toIndentedString(ssoUrl)).append("\n");
    sb.append("    identityServerEnabled: ").append(toIndentedString(identityServerEnabled)).append("\n");
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

    // add `ldapEnabled` to the URL query string
    if (getLdapEnabled() != null) {
      try {
        joiner.add(String.format("%sldapEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLdapEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ldapDomain` to the URL query string
    if (getLdapDomain() != null) {
      try {
        joiner.add(String.format("%sldapDomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLdapDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `providers` to the URL query string
    if (getProviders() != null) {
      for (int i = 0; i < getProviders().size(); i++) {
        try {
          joiner.add(String.format("%sproviders%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getProviders().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `ssoLabel` to the URL query string
    if (getSsoLabel() != null) {
      try {
        joiner.add(String.format("%sssoLabel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsoLabel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `oauthEnabled` to the URL query string
    if (getOauthEnabled() != null) {
      try {
        joiner.add(String.format("%soauthEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOauthEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ssoUrl` to the URL query string
    if (getSsoUrl() != null) {
      try {
        joiner.add(String.format("%sssoUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsoUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `identityServerEnabled` to the URL query string
    if (getIdentityServerEnabled() != null) {
      try {
        joiner.add(String.format("%sidentityServerEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdentityServerEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

