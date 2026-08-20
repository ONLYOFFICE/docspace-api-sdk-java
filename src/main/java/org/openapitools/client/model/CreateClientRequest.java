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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Client creation request containing client details
 */
@JsonPropertyOrder({
  CreateClientRequest.JSON_PROPERTY_NAME,
  CreateClientRequest.JSON_PROPERTY_DESCRIPTION,
  CreateClientRequest.JSON_PROPERTY_LOGO,
  CreateClientRequest.JSON_PROPERTY_SCOPES,
  CreateClientRequest.JSON_PROPERTY_PUBLIC,
  CreateClientRequest.JSON_PROPERTY_ALLOW_PKCE,
  CreateClientRequest.JSON_PROPERTY_IS_PUBLIC,
  CreateClientRequest.JSON_PROPERTY_WEBSITE_URL,
  CreateClientRequest.JSON_PROPERTY_TERMS_URL,
  CreateClientRequest.JSON_PROPERTY_POLICY_URL,
  CreateClientRequest.JSON_PROPERTY_REDIRECT_URIS,
  CreateClientRequest.JSON_PROPERTY_ALLOWED_ORIGINS,
  CreateClientRequest.JSON_PROPERTY_LOGOUT_REDIRECT_URI
})

public class CreateClientRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable  private String description;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable  private String logo;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  @javax.annotation.Nullable  private Set<String> scopes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PUBLIC = "public";
  @javax.annotation.Nullable  private Boolean _public;

  public static final String JSON_PROPERTY_ALLOW_PKCE = "allow_pkce";
  @javax.annotation.Nullable  private Boolean allowPkce;

  public static final String JSON_PROPERTY_IS_PUBLIC = "is_public";
  @javax.annotation.Nullable  private Boolean isPublic;

  public static final String JSON_PROPERTY_WEBSITE_URL = "website_url";
  @javax.annotation.Nullable  private String websiteUrl;

  public static final String JSON_PROPERTY_TERMS_URL = "terms_url";
  @javax.annotation.Nullable  private String termsUrl;

  public static final String JSON_PROPERTY_POLICY_URL = "policy_url";
  @javax.annotation.Nullable  private String policyUrl;

  public static final String JSON_PROPERTY_REDIRECT_URIS = "redirect_uris";
  @javax.annotation.Nonnull  private Set<String> redirectUris = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ALLOWED_ORIGINS = "allowed_origins";
  @javax.annotation.Nonnull  private Set<String> allowedOrigins = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LOGOUT_REDIRECT_URI = "logout_redirect_uri";
  @javax.annotation.Nullable  private String logoutRedirectUri;

  public CreateClientRequest() {
  }


  public CreateClientRequest name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The client name.
   * @return name
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public CreateClientRequest description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * The description of the client
   * @return description
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public CreateClientRequest logo(@javax.annotation.Nullable String logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * The logo of the client in base64 format
   * @return logo
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogo() {
    return logo;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = logo;
  }

  public CreateClientRequest scopes(@javax.annotation.Nullable Set<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public CreateClientRequest addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new LinkedHashSet<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * The scopes for the client
   * @return scopes
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SCOPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getScopes() {
    return scopes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_SCOPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScopes(@javax.annotation.Nullable Set<String> scopes) {
    this.scopes = scopes;
  }

  public CreateClientRequest _public(@javax.annotation.Nullable Boolean _public) {
    
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPublic() {
    return _public;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublic(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
  }

  public CreateClientRequest allowPkce(@javax.annotation.Nullable Boolean allowPkce) {
    
    this.allowPkce = allowPkce;
    return this;
  }

  /**
   * Indicates whether PKCE is allowed for the client
   * @return allowPkce
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ALLOW_PKCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowPkce() {
    return allowPkce;
  }


  @JsonProperty(value = JSON_PROPERTY_ALLOW_PKCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowPkce(@javax.annotation.Nullable Boolean allowPkce) {
    this.allowPkce = allowPkce;
  }

  public CreateClientRequest isPublic(@javax.annotation.Nullable Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Indicates if the client is public
   * @return isPublic
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(@javax.annotation.Nullable Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public CreateClientRequest websiteUrl(@javax.annotation.Nullable String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * The website URL of the client
   * @return websiteUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEBSITE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_WEBSITE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsiteUrl(@javax.annotation.Nullable String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public CreateClientRequest termsUrl(@javax.annotation.Nullable String termsUrl) {
    
    this.termsUrl = termsUrl;
    return this;
  }

  /**
   * The terms URL of the client
   * @return termsUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TERMS_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTermsUrl() {
    return termsUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_TERMS_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsUrl(@javax.annotation.Nullable String termsUrl) {
    this.termsUrl = termsUrl;
  }

  public CreateClientRequest policyUrl(@javax.annotation.Nullable String policyUrl) {
    
    this.policyUrl = policyUrl;
    return this;
  }

  /**
   * The policy URL of the client
   * @return policyUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_POLICY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolicyUrl() {
    return policyUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_POLICY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyUrl(@javax.annotation.Nullable String policyUrl) {
    this.policyUrl = policyUrl;
  }

  public CreateClientRequest redirectUris(@javax.annotation.Nonnull Set<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public CreateClientRequest addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new LinkedHashSet<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * The redirect URIs for the client
   * @return redirectUris
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_REDIRECT_URIS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getRedirectUris() {
    return redirectUris;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_REDIRECT_URIS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedirectUris(@javax.annotation.Nonnull Set<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public CreateClientRequest allowedOrigins(@javax.annotation.Nonnull Set<String> allowedOrigins) {
    
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public CreateClientRequest addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new LinkedHashSet<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

  /**
   * The allowed origins for the client
   * @return allowedOrigins
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ALLOWED_ORIGINS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getAllowedOrigins() {
    return allowedOrigins;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_ORIGINS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedOrigins(@javax.annotation.Nonnull Set<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  public CreateClientRequest logoutRedirectUri(@javax.annotation.Nullable String logoutRedirectUri) {
    
    this.logoutRedirectUri = logoutRedirectUri;
    return this;
  }

  /**
   * The logout redirect URI for the client
   * @return logoutRedirectUri
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOGOUT_REDIRECT_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoutRedirectUri() {
    return logoutRedirectUri;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGOUT_REDIRECT_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoutRedirectUri(@javax.annotation.Nullable String logoutRedirectUri) {
    this.logoutRedirectUri = logoutRedirectUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClientRequest createClientRequest = (CreateClientRequest) o;
    return Objects.equals(this.name, createClientRequest.name) &&
        Objects.equals(this.description, createClientRequest.description) &&
        Objects.equals(this.logo, createClientRequest.logo) &&
        Objects.equals(this.scopes, createClientRequest.scopes) &&
        Objects.equals(this._public, createClientRequest._public) &&
        Objects.equals(this.allowPkce, createClientRequest.allowPkce) &&
        Objects.equals(this.isPublic, createClientRequest.isPublic) &&
        Objects.equals(this.websiteUrl, createClientRequest.websiteUrl) &&
        Objects.equals(this.termsUrl, createClientRequest.termsUrl) &&
        Objects.equals(this.policyUrl, createClientRequest.policyUrl) &&
        Objects.equals(this.redirectUris, createClientRequest.redirectUris) &&
        Objects.equals(this.allowedOrigins, createClientRequest.allowedOrigins) &&
        Objects.equals(this.logoutRedirectUri, createClientRequest.logoutRedirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, logo, scopes, _public, allowPkce, isPublic, websiteUrl, termsUrl, policyUrl, redirectUris, allowedOrigins, logoutRedirectUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClientRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    allowPkce: ").append(toIndentedString(allowPkce)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    termsUrl: ").append(toIndentedString(termsUrl)).append("\n");
    sb.append("    policyUrl: ").append(toIndentedString(policyUrl)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    logoutRedirectUri: ").append(toIndentedString(logoutRedirectUri)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logo` to the URL query string
    if (getLogo() != null) {
      try {
        joiner.add(String.format("%slogo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scopes` to the URL query string
    if (getScopes() != null) {
      int i = 0;
      for (String _item : getScopes()) {
        try {
          joiner.add(String.format("%sscopes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    // add `public` to the URL query string
    if (getPublic() != null) {
      try {
        joiner.add(String.format("%spublic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPublic()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allow_pkce` to the URL query string
    if (getAllowPkce() != null) {
      try {
        joiner.add(String.format("%sallow_pkce%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowPkce()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_public` to the URL query string
    if (getIsPublic() != null) {
      try {
        joiner.add(String.format("%sis_public%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsPublic()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `website_url` to the URL query string
    if (getWebsiteUrl() != null) {
      try {
        joiner.add(String.format("%swebsite_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebsiteUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `terms_url` to the URL query string
    if (getTermsUrl() != null) {
      try {
        joiner.add(String.format("%sterms_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTermsUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `policy_url` to the URL query string
    if (getPolicyUrl() != null) {
      try {
        joiner.add(String.format("%spolicy_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPolicyUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirect_uris` to the URL query string
    if (getRedirectUris() != null) {
      int i = 0;
      for (String _item : getRedirectUris()) {
        try {
          joiner.add(String.format("%sredirect_uris%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    // add `allowed_origins` to the URL query string
    if (getAllowedOrigins() != null) {
      int i = 0;
      for (String _item : getAllowedOrigins()) {
        try {
          joiner.add(String.format("%sallowed_origins%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    // add `logout_redirect_uri` to the URL query string
    if (getLogoutRedirectUri() != null) {
      try {
        joiner.add(String.format("%slogout_redirect_uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogoutRedirectUri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

