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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.TenantTrustedDomainsType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for configuring trusted mail domains and visitor invitation settings.
 */
@JsonPropertyOrder({
  MailDomainSettingsRequestsDto.JSON_PROPERTY_TYPE,
  MailDomainSettingsRequestsDto.JSON_PROPERTY_DOMAINS,
  MailDomainSettingsRequestsDto.JSON_PROPERTY_INVITE_USERS_AS_VISITORS
})

public class MailDomainSettingsRequestsDto {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull  private TenantTrustedDomainsType type;

  public static final String JSON_PROPERTY_DOMAINS = "domains";
  @javax.annotation.Nullable  private List<String> domains;

  public static final String JSON_PROPERTY_INVITE_USERS_AS_VISITORS = "inviteUsersAsVisitors";
  @javax.annotation.Nonnull  private Boolean inviteUsersAsVisitors;

  public MailDomainSettingsRequestsDto() {
  }


  public MailDomainSettingsRequestsDto type(@javax.annotation.Nonnull TenantTrustedDomainsType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TenantTrustedDomainsType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull TenantTrustedDomainsType type) {
    this.type = type;
  }

  public MailDomainSettingsRequestsDto domains(@javax.annotation.Nullable List<String> domains) {
    
    this.domains = domains;
    return this;
  }

  public MailDomainSettingsRequestsDto addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

  /**
   * The list of authorized email domains that are considered trusted.
   * @return domains
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOMAINS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getDomains() {
    return domains;
  }


  @JsonProperty(value = JSON_PROPERTY_DOMAINS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomains(@javax.annotation.Nullable List<String> domains) {
    this.domains = domains;
  }

  public MailDomainSettingsRequestsDto inviteUsersAsVisitors(@javax.annotation.Nonnull Boolean inviteUsersAsVisitors) {
    
    this.inviteUsersAsVisitors = inviteUsersAsVisitors;
    return this;
  }

  /**
   * Specifies the default permission level for the invited users (visitors or not).
   * @return inviteUsersAsVisitors
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_INVITE_USERS_AS_VISITORS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getInviteUsersAsVisitors() {
    return inviteUsersAsVisitors;
  }


  @JsonProperty(value = JSON_PROPERTY_INVITE_USERS_AS_VISITORS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInviteUsersAsVisitors(@javax.annotation.Nonnull Boolean inviteUsersAsVisitors) {
    this.inviteUsersAsVisitors = inviteUsersAsVisitors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailDomainSettingsRequestsDto mailDomainSettingsRequestsDto = (MailDomainSettingsRequestsDto) o;
    return Objects.equals(this.type, mailDomainSettingsRequestsDto.type) &&
        Objects.equals(this.domains, mailDomainSettingsRequestsDto.domains) &&
        Objects.equals(this.inviteUsersAsVisitors, mailDomainSettingsRequestsDto.inviteUsersAsVisitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, domains, inviteUsersAsVisitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailDomainSettingsRequestsDto {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    inviteUsersAsVisitors: ").append(toIndentedString(inviteUsersAsVisitors)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `domains` to the URL query string
    if (getDomains() != null) {
      for (int i = 0; i < getDomains().size(); i++) {
        try {
          joiner.add(String.format("%sdomains%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getDomains().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `inviteUsersAsVisitors` to the URL query string
    if (getInviteUsersAsVisitors() != null) {
      try {
        joiner.add(String.format("%sinviteUsersAsVisitors%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInviteUsersAsVisitors()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

