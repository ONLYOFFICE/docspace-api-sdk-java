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
import org.openapitools.client.model.DocsCloudIpFilterConfig;
import org.openapitools.client.model.DocsCloudSecurityConfig;
import org.openapitools.client.model.DocsCloudServerConfig;
import org.openapitools.client.model.DocsCloudWopiConfig;
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
 * Represents the configuration of a DocsCloud tenant.
 */
@JsonPropertyOrder({
  DocsCloudConfig.JSON_PROPERTY_TENANT_NAME,
  DocsCloudConfig.JSON_PROPERTY_SECURITY,
  DocsCloudConfig.JSON_PROPERTY_SERVER,
  DocsCloudConfig.JSON_PROPERTY_WOPI,
  DocsCloudConfig.JSON_PROPERTY_IP_FILTER
})

public class DocsCloudConfig {
  public static final String JSON_PROPERTY_TENANT_NAME = "tenantName";
  @javax.annotation.Nullable  private JsonNullable<String> tenantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECURITY = "security";
  @javax.annotation.Nullable  private DocsCloudSecurityConfig security;

  public static final String JSON_PROPERTY_SERVER = "server";
  @javax.annotation.Nullable  private DocsCloudServerConfig server;

  public static final String JSON_PROPERTY_WOPI = "wopi";
  @javax.annotation.Nullable  private DocsCloudWopiConfig wopi;

  public static final String JSON_PROPERTY_IP_FILTER = "ipFilter";
  @javax.annotation.Nullable  private DocsCloudIpFilterConfig ipFilter;

  public DocsCloudConfig() {
  }


  public DocsCloudConfig tenantName(@javax.annotation.Nullable String tenantName) {
    this.tenantName = JsonNullable.<String>of(tenantName);
    
    return this;
  }

  /**
   * The tenant name.
   * @return tenantName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTenantName() {
        return tenantName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TENANT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTenantName_JsonNullable() {
    return tenantName;
  }
  
  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  public void setTenantName_JsonNullable(JsonNullable<String> tenantName) {
    this.tenantName = tenantName;
  }

  public void setTenantName(@javax.annotation.Nullable String tenantName) {
    this.tenantName = JsonNullable.<String>of(tenantName);
  }

  public DocsCloudConfig security(@javax.annotation.Nullable DocsCloudSecurityConfig security) {
    
    this.security = security;
    return this;
  }

  /**
   * The security configuration.
   * @return security
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SECURITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudSecurityConfig getSecurity() {
    return security;
  }


  @JsonProperty(value = JSON_PROPERTY_SECURITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurity(@javax.annotation.Nullable DocsCloudSecurityConfig security) {
    this.security = security;
  }

  public DocsCloudConfig server(@javax.annotation.Nullable DocsCloudServerConfig server) {
    
    this.server = server;
    return this;
  }

  /**
   * The server configuration.
   * @return server
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERVER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudServerConfig getServer() {
    return server;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServer(@javax.annotation.Nullable DocsCloudServerConfig server) {
    this.server = server;
  }

  public DocsCloudConfig wopi(@javax.annotation.Nullable DocsCloudWopiConfig wopi) {
    
    this.wopi = wopi;
    return this;
  }

  /**
   * The WOPI configuration.
   * @return wopi
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WOPI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudWopiConfig getWopi() {
    return wopi;
  }


  @JsonProperty(value = JSON_PROPERTY_WOPI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWopi(@javax.annotation.Nullable DocsCloudWopiConfig wopi) {
    this.wopi = wopi;
  }

  public DocsCloudConfig ipFilter(@javax.annotation.Nullable DocsCloudIpFilterConfig ipFilter) {
    
    this.ipFilter = ipFilter;
    return this;
  }

  /**
   * The IP filter configuration.
   * @return ipFilter
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IP_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudIpFilterConfig getIpFilter() {
    return ipFilter;
  }


  @JsonProperty(value = JSON_PROPERTY_IP_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpFilter(@javax.annotation.Nullable DocsCloudIpFilterConfig ipFilter) {
    this.ipFilter = ipFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudConfig docsCloudConfig = (DocsCloudConfig) o;
    return equalsNullable(this.tenantName, docsCloudConfig.tenantName) &&
        Objects.equals(this.security, docsCloudConfig.security) &&
        Objects.equals(this.server, docsCloudConfig.server) &&
        Objects.equals(this.wopi, docsCloudConfig.wopi) &&
        Objects.equals(this.ipFilter, docsCloudConfig.ipFilter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(tenantName), security, server, wopi, ipFilter);
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
    sb.append("class DocsCloudConfig {\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    wopi: ").append(toIndentedString(wopi)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
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

    // add `tenantName` to the URL query string
    if (getTenantName() != null) {
      try {
        joiner.add(String.format("%stenantName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `security` to the URL query string
    if (getSecurity() != null) {
      joiner.add(getSecurity().toUrlQueryString(prefix + "security" + suffix));
    }

    // add `server` to the URL query string
    if (getServer() != null) {
      joiner.add(getServer().toUrlQueryString(prefix + "server" + suffix));
    }

    // add `wopi` to the URL query string
    if (getWopi() != null) {
      joiner.add(getWopi().toUrlQueryString(prefix + "wopi" + suffix));
    }

    // add `ipFilter` to the URL query string
    if (getIpFilter() != null) {
      joiner.add(getIpFilter().toUrlQueryString(prefix + "ipFilter" + suffix));
    }

    return joiner.toString();
  }

}

