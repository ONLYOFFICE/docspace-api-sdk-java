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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The tenant audit settings parameters.
 */
@JsonPropertyOrder({
  TenantAuditSettings.JSON_PROPERTY_LOGIN_HISTORY_LIFE_TIME,
  TenantAuditSettings.JSON_PROPERTY_AUDIT_TRAIL_LIFE_TIME,
  TenantAuditSettings.JSON_PROPERTY_LAST_MODIFIED
})

public class TenantAuditSettings {
  public static final String JSON_PROPERTY_LOGIN_HISTORY_LIFE_TIME = "loginHistoryLifeTime";
  @javax.annotation.Nullable
  private Integer loginHistoryLifeTime;

  public static final String JSON_PROPERTY_AUDIT_TRAIL_LIFE_TIME = "auditTrailLifeTime";
  @javax.annotation.Nullable
  private Integer auditTrailLifeTime;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable
  private OffsetDateTime lastModified;

  public TenantAuditSettings() {
  }


  public TenantAuditSettings loginHistoryLifeTime(@javax.annotation.Nullable Integer loginHistoryLifeTime) {
    
    this.loginHistoryLifeTime = loginHistoryLifeTime;
    return this;
  }

  /**
   * The login history lifetime.
   * @return loginHistoryLifeTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN_HISTORY_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLoginHistoryLifeTime() {
    return loginHistoryLifeTime;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_HISTORY_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginHistoryLifeTime(@javax.annotation.Nullable Integer loginHistoryLifeTime) {
    this.loginHistoryLifeTime = loginHistoryLifeTime;
  }

  public TenantAuditSettings auditTrailLifeTime(@javax.annotation.Nullable Integer auditTrailLifeTime) {
    
    this.auditTrailLifeTime = auditTrailLifeTime;
    return this;
  }

  /**
   * The audit trail lifetime.
   * @return auditTrailLifeTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_TRAIL_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAuditTrailLifeTime() {
    return auditTrailLifeTime;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_TRAIL_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditTrailLifeTime(@javax.annotation.Nullable Integer auditTrailLifeTime) {
    this.auditTrailLifeTime = auditTrailLifeTime;
  }

  public TenantAuditSettings lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantAuditSettings tenantAuditSettings = (TenantAuditSettings) o;
    return Objects.equals(this.loginHistoryLifeTime, tenantAuditSettings.loginHistoryLifeTime) &&
        Objects.equals(this.auditTrailLifeTime, tenantAuditSettings.auditTrailLifeTime) &&
        Objects.equals(this.lastModified, tenantAuditSettings.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginHistoryLifeTime, auditTrailLifeTime, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantAuditSettings {\n");
    sb.append("    loginHistoryLifeTime: ").append(toIndentedString(loginHistoryLifeTime)).append("\n");
    sb.append("    auditTrailLifeTime: ").append(toIndentedString(auditTrailLifeTime)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

    // add `loginHistoryLifeTime` to the URL query string
    if (getLoginHistoryLifeTime() != null) {
      try {
        joiner.add(String.format("%sloginHistoryLifeTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLoginHistoryLifeTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `auditTrailLifeTime` to the URL query string
    if (getAuditTrailLifeTime() != null) {
      try {
        joiner.add(String.format("%sauditTrailLifeTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuditTrailLifeTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

