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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The response containing public client information.
 */
@JsonPropertyOrder({
  ClientInfoResponse.JSON_PROPERTY_NAME,
  ClientInfoResponse.JSON_PROPERTY_DESCRIPTION,
  ClientInfoResponse.JSON_PROPERTY_SCOPES,
  ClientInfoResponse.JSON_PROPERTY_CLIENT_ID,
  ClientInfoResponse.JSON_PROPERTY_WEBSITE_URL,
  ClientInfoResponse.JSON_PROPERTY_TERMS_URL,
  ClientInfoResponse.JSON_PROPERTY_POLICY_URL,
  ClientInfoResponse.JSON_PROPERTY_LOGO,
  ClientInfoResponse.JSON_PROPERTY_AUTHENTICATION_METHODS,
  ClientInfoResponse.JSON_PROPERTY_IS_PUBLIC,
  ClientInfoResponse.JSON_PROPERTY_CREATED_ON,
  ClientInfoResponse.JSON_PROPERTY_CREATED_BY,
  ClientInfoResponse.JSON_PROPERTY_MODIFIED_ON,
  ClientInfoResponse.JSON_PROPERTY_MODIFIED_BY
})

public class ClientInfoResponse {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  @javax.annotation.Nullable
  private Set<String> scopes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  @javax.annotation.Nullable
  private String clientId;

  public static final String JSON_PROPERTY_WEBSITE_URL = "website_url";
  @javax.annotation.Nullable
  private String websiteUrl;

  public static final String JSON_PROPERTY_TERMS_URL = "terms_url";
  @javax.annotation.Nullable
  private String termsUrl;

  public static final String JSON_PROPERTY_POLICY_URL = "policy_url";
  @javax.annotation.Nullable
  private String policyUrl;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable
  private String logo;

  public static final String JSON_PROPERTY_AUTHENTICATION_METHODS = "authentication_methods";
  @javax.annotation.Nullable
  private Set<String> authenticationMethods = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_IS_PUBLIC = "is_public";
  @javax.annotation.Nullable
  private Boolean isPublic;

  public static final String JSON_PROPERTY_CREATED_ON = "created_on";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  @javax.annotation.Nullable
  private String createdBy;

  public static final String JSON_PROPERTY_MODIFIED_ON = "modified_on";
  @javax.annotation.Nullable
  private OffsetDateTime modifiedOn;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  @javax.annotation.Nullable
  private String modifiedBy;

  public ClientInfoResponse() {
  }

  public ClientInfoResponse name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The client name.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public ClientInfoResponse description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * The client description.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public ClientInfoResponse scopes(@javax.annotation.Nullable Set<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public ClientInfoResponse addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new LinkedHashSet<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * The client scopes.
   * @return scopes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getScopes() {
    return scopes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScopes(@javax.annotation.Nullable Set<String> scopes) {
    this.scopes = scopes;
  }

  public ClientInfoResponse clientId(@javax.annotation.Nullable String clientId) {
    
    this.clientId = clientId;
    return this;
  }

  /**
   * The client ID.
   * @return clientId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
  }

  public ClientInfoResponse websiteUrl(@javax.annotation.Nullable String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * The URL to the client&#39;s website
   * @return websiteUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsiteUrl(@javax.annotation.Nullable String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public ClientInfoResponse termsUrl(@javax.annotation.Nullable String termsUrl) {
    
    this.termsUrl = termsUrl;
    return this;
  }

  /**
   * The URL to the client&#39;s terms of service.
   * @return termsUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTermsUrl() {
    return termsUrl;
  }


  @JsonProperty(JSON_PROPERTY_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsUrl(@javax.annotation.Nullable String termsUrl) {
    this.termsUrl = termsUrl;
  }

  public ClientInfoResponse policyUrl(@javax.annotation.Nullable String policyUrl) {
    
    this.policyUrl = policyUrl;
    return this;
  }

  /**
   * The URL to the client&#39;s privacy policy.
   * @return policyUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolicyUrl() {
    return policyUrl;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyUrl(@javax.annotation.Nullable String policyUrl) {
    this.policyUrl = policyUrl;
  }

  public ClientInfoResponse logo(@javax.annotation.Nullable String logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * The client logo in base64 format.
   * @return logo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = logo;
  }

  public ClientInfoResponse authenticationMethods(@javax.annotation.Nullable Set<String> authenticationMethods) {
    
    this.authenticationMethods = authenticationMethods;
    return this;
  }

  public ClientInfoResponse addAuthenticationMethodsItem(String authenticationMethodsItem) {
    if (this.authenticationMethods == null) {
      this.authenticationMethods = new LinkedHashSet<>();
    }
    this.authenticationMethods.add(authenticationMethodsItem);
    return this;
  }

  /**
   * The authentication methods supported by the client.
   * @return authenticationMethods
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getAuthenticationMethods() {
    return authenticationMethods;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationMethods(@javax.annotation.Nullable Set<String> authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }

  public ClientInfoResponse isPublic(@javax.annotation.Nullable Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Indicates whether the client is accessible by third-party tenants.
   * @return isPublic
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(@javax.annotation.Nullable Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public ClientInfoResponse createdOn(@javax.annotation.Nullable OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date and time when the client was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedOn(@javax.annotation.Nullable OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public ClientInfoResponse createdBy(@javax.annotation.Nullable String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The user who created the client.
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(@javax.annotation.Nullable String createdBy) {
    this.createdBy = createdBy;
  }

  public ClientInfoResponse modifiedOn(@javax.annotation.Nullable OffsetDateTime modifiedOn) {
    
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date and time when the client was last modified.
   * @return modifiedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedOn(@javax.annotation.Nullable OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public ClientInfoResponse modifiedBy(@javax.annotation.Nullable String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The user who last modified the client.
   * @return modifiedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedBy(@javax.annotation.Nullable String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInfoResponse clientInfoResponse = (ClientInfoResponse) o;
    return Objects.equals(this.name, clientInfoResponse.name) &&
        Objects.equals(this.description, clientInfoResponse.description) &&
        Objects.equals(this.scopes, clientInfoResponse.scopes) &&
        Objects.equals(this.clientId, clientInfoResponse.clientId) &&
        Objects.equals(this.websiteUrl, clientInfoResponse.websiteUrl) &&
        Objects.equals(this.termsUrl, clientInfoResponse.termsUrl) &&
        Objects.equals(this.policyUrl, clientInfoResponse.policyUrl) &&
        Objects.equals(this.logo, clientInfoResponse.logo) &&
        Objects.equals(this.authenticationMethods, clientInfoResponse.authenticationMethods) &&
        Objects.equals(this.isPublic, clientInfoResponse.isPublic) &&
        Objects.equals(this.createdOn, clientInfoResponse.createdOn) &&
        Objects.equals(this.createdBy, clientInfoResponse.createdBy) &&
        Objects.equals(this.modifiedOn, clientInfoResponse.modifiedOn) &&
        Objects.equals(this.modifiedBy, clientInfoResponse.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, scopes, clientId, websiteUrl, termsUrl, policyUrl, logo, authenticationMethods, isPublic, createdOn, createdBy, modifiedOn, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfoResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    termsUrl: ").append(toIndentedString(termsUrl)).append("\n");
    sb.append("    policyUrl: ").append(toIndentedString(policyUrl)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

    // add `client_id` to the URL query string
    if (getClientId() != null) {
      try {
        joiner.add(String.format("%sclient_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `logo` to the URL query string
    if (getLogo() != null) {
      try {
        joiner.add(String.format("%slogo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authentication_methods` to the URL query string
    if (getAuthenticationMethods() != null) {
      int i = 0;
      for (String _item : getAuthenticationMethods()) {
        try {
          joiner.add(String.format("%sauthentication_methods%s%s=%s", prefix, suffix,
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

    // add `created_on` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screated_on%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `created_by` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screated_by%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modified_on` to the URL query string
    if (getModifiedOn() != null) {
      try {
        joiner.add(String.format("%smodified_on%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modified_by` to the URL query string
    if (getModifiedBy() != null) {
      try {
        joiner.add(String.format("%smodified_by%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

