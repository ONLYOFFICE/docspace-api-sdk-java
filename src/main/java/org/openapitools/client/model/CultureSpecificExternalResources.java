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
import org.openapitools.client.model.CultureSpecificExternalResource;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The external resources settings.
 */
@JsonPropertyOrder({
  CultureSpecificExternalResources.JSON_PROPERTY_API,
  CultureSpecificExternalResources.JSON_PROPERTY_COMMON,
  CultureSpecificExternalResources.JSON_PROPERTY_FORUM,
  CultureSpecificExternalResources.JSON_PROPERTY_HELPCENTER,
  CultureSpecificExternalResources.JSON_PROPERTY_INTEGRATIONS,
  CultureSpecificExternalResources.JSON_PROPERTY_SITE,
  CultureSpecificExternalResources.JSON_PROPERTY_SOCIAL_NETWORKS,
  CultureSpecificExternalResources.JSON_PROPERTY_SUPPORT,
  CultureSpecificExternalResources.JSON_PROPERTY_VIDEOGUIDES
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class CultureSpecificExternalResources {
  public static final String JSON_PROPERTY_API = "api";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource api;

  public static final String JSON_PROPERTY_COMMON = "common";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource common;

  public static final String JSON_PROPERTY_FORUM = "forum";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource forum;

  public static final String JSON_PROPERTY_HELPCENTER = "helpcenter";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource helpcenter;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource integrations;

  public static final String JSON_PROPERTY_SITE = "site";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource site;

  public static final String JSON_PROPERTY_SOCIAL_NETWORKS = "socialNetworks";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource socialNetworks;

  public static final String JSON_PROPERTY_SUPPORT = "support";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource support;

  public static final String JSON_PROPERTY_VIDEOGUIDES = "videoguides";
  @javax.annotation.Nullable
  private CultureSpecificExternalResource videoguides;

  public CultureSpecificExternalResources() {
  }

  public CultureSpecificExternalResources api(@javax.annotation.Nullable CultureSpecificExternalResource api) {
    
    this.api = api;
    return this;
  }

  /**
   * Get api
   * @return api
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getApi() {
    return api;
  }


  @JsonProperty(JSON_PROPERTY_API)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApi(@javax.annotation.Nullable CultureSpecificExternalResource api) {
    this.api = api;
  }

  public CultureSpecificExternalResources common(@javax.annotation.Nullable CultureSpecificExternalResource common) {
    
    this.common = common;
    return this;
  }

  /**
   * Get common
   * @return common
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getCommon() {
    return common;
  }


  @JsonProperty(JSON_PROPERTY_COMMON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommon(@javax.annotation.Nullable CultureSpecificExternalResource common) {
    this.common = common;
  }

  public CultureSpecificExternalResources forum(@javax.annotation.Nullable CultureSpecificExternalResource forum) {
    
    this.forum = forum;
    return this;
  }

  /**
   * Get forum
   * @return forum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getForum() {
    return forum;
  }


  @JsonProperty(JSON_PROPERTY_FORUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForum(@javax.annotation.Nullable CultureSpecificExternalResource forum) {
    this.forum = forum;
  }

  public CultureSpecificExternalResources helpcenter(@javax.annotation.Nullable CultureSpecificExternalResource helpcenter) {
    
    this.helpcenter = helpcenter;
    return this;
  }

  /**
   * Get helpcenter
   * @return helpcenter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HELPCENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getHelpcenter() {
    return helpcenter;
  }


  @JsonProperty(JSON_PROPERTY_HELPCENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelpcenter(@javax.annotation.Nullable CultureSpecificExternalResource helpcenter) {
    this.helpcenter = helpcenter;
  }

  public CultureSpecificExternalResources integrations(@javax.annotation.Nullable CultureSpecificExternalResource integrations) {
    
    this.integrations = integrations;
    return this;
  }

  /**
   * Get integrations
   * @return integrations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getIntegrations() {
    return integrations;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrations(@javax.annotation.Nullable CultureSpecificExternalResource integrations) {
    this.integrations = integrations;
  }

  public CultureSpecificExternalResources site(@javax.annotation.Nullable CultureSpecificExternalResource site) {
    
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getSite() {
    return site;
  }


  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSite(@javax.annotation.Nullable CultureSpecificExternalResource site) {
    this.site = site;
  }

  public CultureSpecificExternalResources socialNetworks(@javax.annotation.Nullable CultureSpecificExternalResource socialNetworks) {
    
    this.socialNetworks = socialNetworks;
    return this;
  }

  /**
   * Get socialNetworks
   * @return socialNetworks
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCIAL_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getSocialNetworks() {
    return socialNetworks;
  }


  @JsonProperty(JSON_PROPERTY_SOCIAL_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocialNetworks(@javax.annotation.Nullable CultureSpecificExternalResource socialNetworks) {
    this.socialNetworks = socialNetworks;
  }

  public CultureSpecificExternalResources support(@javax.annotation.Nullable CultureSpecificExternalResource support) {
    
    this.support = support;
    return this;
  }

  /**
   * Get support
   * @return support
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getSupport() {
    return support;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupport(@javax.annotation.Nullable CultureSpecificExternalResource support) {
    this.support = support;
  }

  public CultureSpecificExternalResources videoguides(@javax.annotation.Nullable CultureSpecificExternalResource videoguides) {
    
    this.videoguides = videoguides;
    return this;
  }

  /**
   * Get videoguides
   * @return videoguides
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEOGUIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResource getVideoguides() {
    return videoguides;
  }


  @JsonProperty(JSON_PROPERTY_VIDEOGUIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoguides(@javax.annotation.Nullable CultureSpecificExternalResource videoguides) {
    this.videoguides = videoguides;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CultureSpecificExternalResources cultureSpecificExternalResources = (CultureSpecificExternalResources) o;
    return Objects.equals(this.api, cultureSpecificExternalResources.api) &&
        Objects.equals(this.common, cultureSpecificExternalResources.common) &&
        Objects.equals(this.forum, cultureSpecificExternalResources.forum) &&
        Objects.equals(this.helpcenter, cultureSpecificExternalResources.helpcenter) &&
        Objects.equals(this.integrations, cultureSpecificExternalResources.integrations) &&
        Objects.equals(this.site, cultureSpecificExternalResources.site) &&
        Objects.equals(this.socialNetworks, cultureSpecificExternalResources.socialNetworks) &&
        Objects.equals(this.support, cultureSpecificExternalResources.support) &&
        Objects.equals(this.videoguides, cultureSpecificExternalResources.videoguides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, common, forum, helpcenter, integrations, site, socialNetworks, support, videoguides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CultureSpecificExternalResources {\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
    sb.append("    forum: ").append(toIndentedString(forum)).append("\n");
    sb.append("    helpcenter: ").append(toIndentedString(helpcenter)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    socialNetworks: ").append(toIndentedString(socialNetworks)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    videoguides: ").append(toIndentedString(videoguides)).append("\n");
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

    // add `api` to the URL query string
    if (getApi() != null) {
      joiner.add(getApi().toUrlQueryString(prefix + "api" + suffix));
    }

    // add `common` to the URL query string
    if (getCommon() != null) {
      joiner.add(getCommon().toUrlQueryString(prefix + "common" + suffix));
    }

    // add `forum` to the URL query string
    if (getForum() != null) {
      joiner.add(getForum().toUrlQueryString(prefix + "forum" + suffix));
    }

    // add `helpcenter` to the URL query string
    if (getHelpcenter() != null) {
      joiner.add(getHelpcenter().toUrlQueryString(prefix + "helpcenter" + suffix));
    }

    // add `integrations` to the URL query string
    if (getIntegrations() != null) {
      joiner.add(getIntegrations().toUrlQueryString(prefix + "integrations" + suffix));
    }

    // add `site` to the URL query string
    if (getSite() != null) {
      joiner.add(getSite().toUrlQueryString(prefix + "site" + suffix));
    }

    // add `socialNetworks` to the URL query string
    if (getSocialNetworks() != null) {
      joiner.add(getSocialNetworks().toUrlQueryString(prefix + "socialNetworks" + suffix));
    }

    // add `support` to the URL query string
    if (getSupport() != null) {
      joiner.add(getSupport().toUrlQueryString(prefix + "support" + suffix));
    }

    // add `videoguides` to the URL query string
    if (getVideoguides() != null) {
      joiner.add(getVideoguides().toUrlQueryString(prefix + "videoguides" + suffix));
    }

    return joiner.toString();
  }

}

