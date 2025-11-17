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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A dictionary representing the sharing settings for the file entry.
 */
@JsonPropertyOrder({
  FileEntryDtoIntegerAllOfShareSettings.JSON_PROPERTY_USER,
  FileEntryDtoIntegerAllOfShareSettings.JSON_PROPERTY_EXTERNAL_LINK,
  FileEntryDtoIntegerAllOfShareSettings.JSON_PROPERTY_GROUP,
  FileEntryDtoIntegerAllOfShareSettings.JSON_PROPERTY_INVITATION_LINK,
  FileEntryDtoIntegerAllOfShareSettings.JSON_PROPERTY_PRIMARY_EXTERNAL_LINK
})
@JsonTypeName("FileEntryDtoInteger_allOf_shareSettings")

public class FileEntryDtoIntegerAllOfShareSettings {
  public static final String JSON_PROPERTY_USER = "User";
  @javax.annotation.Nullable
  private Integer user;

  public static final String JSON_PROPERTY_EXTERNAL_LINK = "ExternalLink";
  @javax.annotation.Nullable
  private Integer externalLink;

  public static final String JSON_PROPERTY_GROUP = "Group";
  @javax.annotation.Nullable
  private Integer group;

  public static final String JSON_PROPERTY_INVITATION_LINK = "InvitationLink";
  @javax.annotation.Nullable
  private Integer invitationLink;

  public static final String JSON_PROPERTY_PRIMARY_EXTERNAL_LINK = "PrimaryExternalLink";
  @javax.annotation.Nullable
  private Integer primaryExternalLink;

  public FileEntryDtoIntegerAllOfShareSettings() {
  }

  public FileEntryDtoIntegerAllOfShareSettings user(@javax.annotation.Nullable Integer user) {
    
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(@javax.annotation.Nullable Integer user) {
    this.user = user;
  }

  public FileEntryDtoIntegerAllOfShareSettings externalLink(@javax.annotation.Nullable Integer externalLink) {
    
    this.externalLink = externalLink;
    return this;
  }

  /**
   * Get externalLink
   * @return externalLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExternalLink() {
    return externalLink;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalLink(@javax.annotation.Nullable Integer externalLink) {
    this.externalLink = externalLink;
  }

  public FileEntryDtoIntegerAllOfShareSettings group(@javax.annotation.Nullable Integer group) {
    
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(@javax.annotation.Nullable Integer group) {
    this.group = group;
  }

  public FileEntryDtoIntegerAllOfShareSettings invitationLink(@javax.annotation.Nullable Integer invitationLink) {
    
    this.invitationLink = invitationLink;
    return this;
  }

  /**
   * Get invitationLink
   * @return invitationLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITATION_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInvitationLink() {
    return invitationLink;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitationLink(@javax.annotation.Nullable Integer invitationLink) {
    this.invitationLink = invitationLink;
  }

  public FileEntryDtoIntegerAllOfShareSettings primaryExternalLink(@javax.annotation.Nullable Integer primaryExternalLink) {
    
    this.primaryExternalLink = primaryExternalLink;
    return this;
  }

  /**
   * Get primaryExternalLink
   * @return primaryExternalLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_EXTERNAL_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrimaryExternalLink() {
    return primaryExternalLink;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_EXTERNAL_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryExternalLink(@javax.annotation.Nullable Integer primaryExternalLink) {
    this.primaryExternalLink = primaryExternalLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileEntryDtoIntegerAllOfShareSettings fileEntryDtoIntegerAllOfShareSettings = (FileEntryDtoIntegerAllOfShareSettings) o;
    return Objects.equals(this.user, fileEntryDtoIntegerAllOfShareSettings.user) &&
        Objects.equals(this.externalLink, fileEntryDtoIntegerAllOfShareSettings.externalLink) &&
        Objects.equals(this.group, fileEntryDtoIntegerAllOfShareSettings.group) &&
        Objects.equals(this.invitationLink, fileEntryDtoIntegerAllOfShareSettings.invitationLink) &&
        Objects.equals(this.primaryExternalLink, fileEntryDtoIntegerAllOfShareSettings.primaryExternalLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, externalLink, group, invitationLink, primaryExternalLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileEntryDtoIntegerAllOfShareSettings {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    externalLink: ").append(toIndentedString(externalLink)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    invitationLink: ").append(toIndentedString(invitationLink)).append("\n");
    sb.append("    primaryExternalLink: ").append(toIndentedString(primaryExternalLink)).append("\n");
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

    // add `User` to the URL query string
    if (getUser() != null) {
      try {
        joiner.add(String.format("%sUser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUser()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ExternalLink` to the URL query string
    if (getExternalLink() != null) {
      try {
        joiner.add(String.format("%sExternalLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Group` to the URL query string
    if (getGroup() != null) {
      try {
        joiner.add(String.format("%sGroup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroup()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `InvitationLink` to the URL query string
    if (getInvitationLink() != null) {
      try {
        joiner.add(String.format("%sInvitationLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvitationLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `PrimaryExternalLink` to the URL query string
    if (getPrimaryExternalLink() != null) {
      try {
        joiner.add(String.format("%sPrimaryExternalLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryExternalLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

