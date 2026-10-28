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
 * Client update request containing modified client details
 */
@JsonPropertyOrder({
  UpdateClientRequest.JSON_PROPERTY_NAME,
  UpdateClientRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateClientRequest.JSON_PROPERTY_LOGO,
  UpdateClientRequest.JSON_PROPERTY_SCOPES,
  UpdateClientRequest.JSON_PROPERTY_ALLOW_PKCE,
  UpdateClientRequest.JSON_PROPERTY_ALLOWED_ORIGINS,
  UpdateClientRequest.JSON_PROPERTY_REDIRECT_URIS,
  UpdateClientRequest.JSON_PROPERTY_IS_PUBLIC
})

public class UpdateClientRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable  private String description;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nonnull  private String logo;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  @javax.annotation.Nonnull  private Set<String> scopes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ALLOW_PKCE = "allow_pkce";
  @javax.annotation.Nullable  private Boolean allowPkce;

  public static final String JSON_PROPERTY_ALLOWED_ORIGINS = "allowed_origins";
  @javax.annotation.Nonnull  private Set<String> allowedOrigins = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_REDIRECT_URIS = "redirect_uris";
  @javax.annotation.Nonnull  private Set<String> redirectUris = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_IS_PUBLIC = "is_public";
  @javax.annotation.Nullable  private Boolean isPublic;

  public UpdateClientRequest() {
  }


  public UpdateClientRequest name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The display name shown to the user on the consent screen. It has to be between 3 and 256 characters long.
   * @return name
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public UpdateClientRequest description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * The free-text description shown next to the name on the consent screen, at most 255 characters.
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

  public UpdateClientRequest logo(@javax.annotation.Nonnull String logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * The client logo as a data URI carrying base64 image data, shown on the consent screen. Only png, jpeg, jpg and svg+xml are accepted.
   * @return logo
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_LOGO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogo() {
    return logo;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogo(@javax.annotation.Nonnull String logo) {
    this.logo = logo;
  }

  public UpdateClientRequest scopes(@javax.annotation.Nonnull Set<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public UpdateClientRequest addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new LinkedHashSet<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * The permissions the client may ask for, named as they appear in the tenant scope catalogue - for example files:read, rooms:write or openid. A client cannot request a scope that is not listed here.
   * @return scopes
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SCOPES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getScopes() {
    return scopes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_SCOPES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScopes(@javax.annotation.Nonnull Set<String> scopes) {
    this.scopes = scopes;
  }

  public UpdateClientRequest allowPkce(@javax.annotation.Nullable Boolean allowPkce) {
    
    this.allowPkce = allowPkce;
    return this;
  }

  /**
   * Whether the client may use PKCE. Turning it on lets the client authenticate with the none method and prove itself with a code verifier instead of sending a secret, which is what a client that cannot keep a secret needs.
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

  public UpdateClientRequest allowedOrigins(@javax.annotation.Nonnull Set<String> allowedOrigins) {
    
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public UpdateClientRequest addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new LinkedHashSet<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

  /**
   * The web origins allowed to call the portal on behalf of this client, used for the CORS check. The set holds between 1 and 12 addresses.
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

  public UpdateClientRequest redirectUris(@javax.annotation.Nonnull Set<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public UpdateClientRequest addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new LinkedHashSet<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * The URIs an authorization code may be delivered to. An authorization request naming any other URI is refused, and the set holds between 1 and 12 addresses.
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

  public UpdateClientRequest isPublic(@javax.annotation.Nullable Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Whether the client is offered to third-party tenants rather than only to the tenant that registers it.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClientRequest updateClientRequest = (UpdateClientRequest) o;
    return Objects.equals(this.name, updateClientRequest.name) &&
        Objects.equals(this.description, updateClientRequest.description) &&
        Objects.equals(this.logo, updateClientRequest.logo) &&
        Objects.equals(this.scopes, updateClientRequest.scopes) &&
        Objects.equals(this.allowPkce, updateClientRequest.allowPkce) &&
        Objects.equals(this.allowedOrigins, updateClientRequest.allowedOrigins) &&
        Objects.equals(this.redirectUris, updateClientRequest.redirectUris) &&
        Objects.equals(this.isPublic, updateClientRequest.isPublic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, logo, scopes, allowPkce, allowedOrigins, redirectUris, isPublic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClientRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    allowPkce: ").append(toIndentedString(allowPkce)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
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

    // add `allow_pkce` to the URL query string
    if (getAllowPkce() != null) {
      try {
        joiner.add(String.format("%sallow_pkce%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowPkce()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `is_public` to the URL query string
    if (getIsPublic() != null) {
      try {
        joiner.add(String.format("%sis_public%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsPublic()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

