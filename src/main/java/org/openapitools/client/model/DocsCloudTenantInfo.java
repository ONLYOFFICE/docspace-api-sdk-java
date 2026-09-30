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
import org.openapitools.client.model.DocsCloudLicenseInfo;
import org.openapitools.client.model.DocsCloudServerInfo;
import org.openapitools.client.model.DocsCloudStats;
import org.openapitools.client.model.DocsCloudUsersLimit;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Represents the license and server information of a Docs Connect tenant, with usage statistics for the current period.
 */
@JsonPropertyOrder({
  DocsCloudTenantInfo.JSON_PROPERTY_LICENSE,
  DocsCloudTenantInfo.JSON_PROPERTY_SERVER,
  DocsCloudTenantInfo.JSON_PROPERTY_USERS_LIMIT,
  DocsCloudTenantInfo.JSON_PROPERTY_STATS
})

public class DocsCloudTenantInfo {
  public static final String JSON_PROPERTY_LICENSE = "license";
  @javax.annotation.Nullable  private DocsCloudLicenseInfo license;

  public static final String JSON_PROPERTY_SERVER = "server";
  @javax.annotation.Nullable  private DocsCloudServerInfo server;

  public static final String JSON_PROPERTY_USERS_LIMIT = "usersLimit";
  @javax.annotation.Nullable  private DocsCloudUsersLimit usersLimit;

  public static final String JSON_PROPERTY_STATS = "stats";
  @javax.annotation.Nullable  private DocsCloudStats stats;

  public DocsCloudTenantInfo() {
  }


  public DocsCloudTenantInfo license(@javax.annotation.Nullable DocsCloudLicenseInfo license) {
    
    this.license = license;
    return this;
  }

  /**
   * The license information.
   * @return license
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LICENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudLicenseInfo getLicense() {
    return license;
  }


  @JsonProperty(value = JSON_PROPERTY_LICENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicense(@javax.annotation.Nullable DocsCloudLicenseInfo license) {
    this.license = license;
  }

  public DocsCloudTenantInfo server(@javax.annotation.Nullable DocsCloudServerInfo server) {
    
    this.server = server;
    return this;
  }

  /**
   * The Docs Connect server information.
   * @return server
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERVER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudServerInfo getServer() {
    return server;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServer(@javax.annotation.Nullable DocsCloudServerInfo server) {
    this.server = server;
  }

  public DocsCloudTenantInfo usersLimit(@javax.annotation.Nullable DocsCloudUsersLimit usersLimit) {
    
    this.usersLimit = usersLimit;
    return this;
  }

  /**
   * The user limits of the license.
   * @return usersLimit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USERS_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudUsersLimit getUsersLimit() {
    return usersLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_USERS_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsersLimit(@javax.annotation.Nullable DocsCloudUsersLimit usersLimit) {
    this.usersLimit = usersLimit;
  }

  public DocsCloudTenantInfo stats(@javax.annotation.Nullable DocsCloudStats stats) {
    
    this.stats = stats;
    return this;
  }

  /**
   * The usage statistics for the current period.
   * @return stats
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudStats getStats() {
    return stats;
  }


  @JsonProperty(value = JSON_PROPERTY_STATS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStats(@javax.annotation.Nullable DocsCloudStats stats) {
    this.stats = stats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudTenantInfo docsCloudTenantInfo = (DocsCloudTenantInfo) o;
    return Objects.equals(this.license, docsCloudTenantInfo.license) &&
        Objects.equals(this.server, docsCloudTenantInfo.server) &&
        Objects.equals(this.usersLimit, docsCloudTenantInfo.usersLimit) &&
        Objects.equals(this.stats, docsCloudTenantInfo.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(license, server, usersLimit, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsCloudTenantInfo {\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    usersLimit: ").append(toIndentedString(usersLimit)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

    // add `license` to the URL query string
    if (getLicense() != null) {
      joiner.add(getLicense().toUrlQueryString(prefix + "license" + suffix));
    }

    // add `server` to the URL query string
    if (getServer() != null) {
      joiner.add(getServer().toUrlQueryString(prefix + "server" + suffix));
    }

    // add `usersLimit` to the URL query string
    if (getUsersLimit() != null) {
      joiner.add(getUsersLimit().toUrlQueryString(prefix + "usersLimit" + suffix));
    }

    // add `stats` to the URL query string
    if (getStats() != null) {
      joiner.add(getStats().toUrlQueryString(prefix + "stats" + suffix));
    }

    return joiner.toString();
  }

}

