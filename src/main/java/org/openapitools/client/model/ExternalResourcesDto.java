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
import org.openapitools.client.model.ExternalResourceDto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The external resources settings.
 */
@JsonPropertyOrder({
  ExternalResourcesDto.JSON_PROPERTY_ADMIN_PANEL,
  ExternalResourcesDto.JSON_PROPERTY_API,
  ExternalResourcesDto.JSON_PROPERTY_COMMON,
  ExternalResourcesDto.JSON_PROPERTY_FORUM,
  ExternalResourcesDto.JSON_PROPERTY_HELPCENTER,
  ExternalResourcesDto.JSON_PROPERTY_INTEGRATIONS,
  ExternalResourcesDto.JSON_PROPERTY_SITE,
  ExternalResourcesDto.JSON_PROPERTY_SOCIAL_NETWORKS,
  ExternalResourcesDto.JSON_PROPERTY_SUPPORT,
  ExternalResourcesDto.JSON_PROPERTY_VIDEOGUIDES
})

public class ExternalResourcesDto {
  public static final String JSON_PROPERTY_ADMIN_PANEL = "adminPanel";
  @javax.annotation.Nullable  private ExternalResourceDto adminPanel;

  public static final String JSON_PROPERTY_API = "api";
  @javax.annotation.Nullable  private ExternalResourceDto api;

  public static final String JSON_PROPERTY_COMMON = "common";
  @javax.annotation.Nullable  private ExternalResourceDto common;

  public static final String JSON_PROPERTY_FORUM = "forum";
  @javax.annotation.Nullable  private ExternalResourceDto forum;

  public static final String JSON_PROPERTY_HELPCENTER = "helpcenter";
  @javax.annotation.Nullable  private ExternalResourceDto helpcenter;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  @javax.annotation.Nullable  private ExternalResourceDto integrations;

  public static final String JSON_PROPERTY_SITE = "site";
  @javax.annotation.Nullable  private ExternalResourceDto site;

  public static final String JSON_PROPERTY_SOCIAL_NETWORKS = "socialNetworks";
  @javax.annotation.Nullable  private ExternalResourceDto socialNetworks;

  public static final String JSON_PROPERTY_SUPPORT = "support";
  @javax.annotation.Nullable  private ExternalResourceDto support;

  public static final String JSON_PROPERTY_VIDEOGUIDES = "videoguides";
  @javax.annotation.Nullable  private ExternalResourceDto videoguides;

  public ExternalResourcesDto() {
  }


  public ExternalResourcesDto adminPanel(@javax.annotation.Nullable ExternalResourceDto adminPanel) {
    
    this.adminPanel = adminPanel;
    return this;
  }

  /**
   * The link to the administration panel. It is returned only to the full administrators of a licensed (Enterprise) server (standalone) portal.
   * @return adminPanel
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ADMIN_PANEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getAdminPanel() {
    return adminPanel;
  }


  @JsonProperty(value = JSON_PROPERTY_ADMIN_PANEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminPanel(@javax.annotation.Nullable ExternalResourceDto adminPanel) {
    this.adminPanel = adminPanel;
  }

  public ExternalResourcesDto api(@javax.annotation.Nullable ExternalResourceDto api) {
    
    this.api = api;
    return this;
  }

  /**
   * The link to the product API.
   * @return api
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_API, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getApi() {
    return api;
  }


  @JsonProperty(value = JSON_PROPERTY_API, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApi(@javax.annotation.Nullable ExternalResourceDto api) {
    this.api = api;
  }

  public ExternalResourcesDto common(@javax.annotation.Nullable ExternalResourceDto common) {
    
    this.common = common;
    return this;
  }

  /**
   * The link to the common product information.
   * @return common
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COMMON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getCommon() {
    return common;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommon(@javax.annotation.Nullable ExternalResourceDto common) {
    this.common = common;
  }

  public ExternalResourcesDto forum(@javax.annotation.Nullable ExternalResourceDto forum) {
    
    this.forum = forum;
    return this;
  }

  /**
   * The link to the forum.
   * @return forum
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FORUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getForum() {
    return forum;
  }


  @JsonProperty(value = JSON_PROPERTY_FORUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForum(@javax.annotation.Nullable ExternalResourceDto forum) {
    this.forum = forum;
  }

  public ExternalResourcesDto helpcenter(@javax.annotation.Nullable ExternalResourceDto helpcenter) {
    
    this.helpcenter = helpcenter;
    return this;
  }

  /**
   * The link to the Help Center.
   * @return helpcenter
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HELPCENTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getHelpcenter() {
    return helpcenter;
  }


  @JsonProperty(value = JSON_PROPERTY_HELPCENTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelpcenter(@javax.annotation.Nullable ExternalResourceDto helpcenter) {
    this.helpcenter = helpcenter;
  }

  public ExternalResourcesDto integrations(@javax.annotation.Nullable ExternalResourceDto integrations) {
    
    this.integrations = integrations;
    return this;
  }

  /**
   * The link to the product integrations.
   * @return integrations
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INTEGRATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getIntegrations() {
    return integrations;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEGRATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrations(@javax.annotation.Nullable ExternalResourceDto integrations) {
    this.integrations = integrations;
  }

  public ExternalResourcesDto site(@javax.annotation.Nullable ExternalResourceDto site) {
    
    this.site = site;
    return this;
  }

  /**
   * The link to the product website.
   * @return site
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getSite() {
    return site;
  }


  @JsonProperty(value = JSON_PROPERTY_SITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSite(@javax.annotation.Nullable ExternalResourceDto site) {
    this.site = site;
  }

  public ExternalResourcesDto socialNetworks(@javax.annotation.Nullable ExternalResourceDto socialNetworks) {
    
    this.socialNetworks = socialNetworks;
    return this;
  }

  /**
   * The link to the product social nerworks.
   * @return socialNetworks
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SOCIAL_NETWORKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getSocialNetworks() {
    return socialNetworks;
  }


  @JsonProperty(value = JSON_PROPERTY_SOCIAL_NETWORKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocialNetworks(@javax.annotation.Nullable ExternalResourceDto socialNetworks) {
    this.socialNetworks = socialNetworks;
  }

  public ExternalResourcesDto support(@javax.annotation.Nullable ExternalResourceDto support) {
    
    this.support = support;
    return this;
  }

  /**
   * The link to the product support.
   * @return support
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SUPPORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getSupport() {
    return support;
  }


  @JsonProperty(value = JSON_PROPERTY_SUPPORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupport(@javax.annotation.Nullable ExternalResourceDto support) {
    this.support = support;
  }

  public ExternalResourcesDto videoguides(@javax.annotation.Nullable ExternalResourceDto videoguides) {
    
    this.videoguides = videoguides;
    return this;
  }

  /**
   * The link to the video guides.
   * @return videoguides
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VIDEOGUIDES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalResourceDto getVideoguides() {
    return videoguides;
  }


  @JsonProperty(value = JSON_PROPERTY_VIDEOGUIDES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoguides(@javax.annotation.Nullable ExternalResourceDto videoguides) {
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
    ExternalResourcesDto externalResourcesDto = (ExternalResourcesDto) o;
    return Objects.equals(this.adminPanel, externalResourcesDto.adminPanel) &&
        Objects.equals(this.api, externalResourcesDto.api) &&
        Objects.equals(this.common, externalResourcesDto.common) &&
        Objects.equals(this.forum, externalResourcesDto.forum) &&
        Objects.equals(this.helpcenter, externalResourcesDto.helpcenter) &&
        Objects.equals(this.integrations, externalResourcesDto.integrations) &&
        Objects.equals(this.site, externalResourcesDto.site) &&
        Objects.equals(this.socialNetworks, externalResourcesDto.socialNetworks) &&
        Objects.equals(this.support, externalResourcesDto.support) &&
        Objects.equals(this.videoguides, externalResourcesDto.videoguides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminPanel, api, common, forum, helpcenter, integrations, site, socialNetworks, support, videoguides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalResourcesDto {\n");
    sb.append("    adminPanel: ").append(toIndentedString(adminPanel)).append("\n");
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

    // add `adminPanel` to the URL query string
    if (getAdminPanel() != null) {
      joiner.add(getAdminPanel().toUrlQueryString(prefix + "adminPanel" + suffix));
    }

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

