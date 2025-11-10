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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The available external rights of the file entry.
 */
@JsonPropertyOrder({
  FileEntryDtoIntegerAllOfAvailableShareRights.JSON_PROPERTY_USER,
  FileEntryDtoIntegerAllOfAvailableShareRights.JSON_PROPERTY_EXTERNAL_LINK,
  FileEntryDtoIntegerAllOfAvailableShareRights.JSON_PROPERTY_GROUP,
  FileEntryDtoIntegerAllOfAvailableShareRights.JSON_PROPERTY_INVITATION_LINK,
  FileEntryDtoIntegerAllOfAvailableShareRights.JSON_PROPERTY_PRIMARY_EXTERNAL_LINK
})
@JsonTypeName("FileEntryDtoInteger_allOf_availableShareRights")
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FileEntryDtoIntegerAllOfAvailableShareRights {
  public static final String JSON_PROPERTY_USER = "User";
  @javax.annotation.Nullable
  private List<String> user = new ArrayList<>();

  public static final String JSON_PROPERTY_EXTERNAL_LINK = "ExternalLink";
  @javax.annotation.Nullable
  private List<String> externalLink = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUP = "Group";
  @javax.annotation.Nullable
  private List<String> group = new ArrayList<>();

  public static final String JSON_PROPERTY_INVITATION_LINK = "InvitationLink";
  @javax.annotation.Nullable
  private List<String> invitationLink = new ArrayList<>();

  public static final String JSON_PROPERTY_PRIMARY_EXTERNAL_LINK = "PrimaryExternalLink";
  @javax.annotation.Nullable
  private List<String> primaryExternalLink = new ArrayList<>();

  public FileEntryDtoIntegerAllOfAvailableShareRights() {
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights user(@javax.annotation.Nullable List<String> user) {
    
    this.user = user;
    return this;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<>();
    }
    this.user.add(userItem);
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(@javax.annotation.Nullable List<String> user) {
    this.user = user;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights externalLink(@javax.annotation.Nullable List<String> externalLink) {
    
    this.externalLink = externalLink;
    return this;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights addExternalLinkItem(String externalLinkItem) {
    if (this.externalLink == null) {
      this.externalLink = new ArrayList<>();
    }
    this.externalLink.add(externalLinkItem);
    return this;
  }

  /**
   * Get externalLink
   * @return externalLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExternalLink() {
    return externalLink;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalLink(@javax.annotation.Nullable List<String> externalLink) {
    this.externalLink = externalLink;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights group(@javax.annotation.Nullable List<String> group) {
    
    this.group = group;
    return this;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(@javax.annotation.Nullable List<String> group) {
    this.group = group;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights invitationLink(@javax.annotation.Nullable List<String> invitationLink) {
    
    this.invitationLink = invitationLink;
    return this;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights addInvitationLinkItem(String invitationLinkItem) {
    if (this.invitationLink == null) {
      this.invitationLink = new ArrayList<>();
    }
    this.invitationLink.add(invitationLinkItem);
    return this;
  }

  /**
   * Get invitationLink
   * @return invitationLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITATION_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getInvitationLink() {
    return invitationLink;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitationLink(@javax.annotation.Nullable List<String> invitationLink) {
    this.invitationLink = invitationLink;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights primaryExternalLink(@javax.annotation.Nullable List<String> primaryExternalLink) {
    
    this.primaryExternalLink = primaryExternalLink;
    return this;
  }

  public FileEntryDtoIntegerAllOfAvailableShareRights addPrimaryExternalLinkItem(String primaryExternalLinkItem) {
    if (this.primaryExternalLink == null) {
      this.primaryExternalLink = new ArrayList<>();
    }
    this.primaryExternalLink.add(primaryExternalLinkItem);
    return this;
  }

  /**
   * Get primaryExternalLink
   * @return primaryExternalLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_EXTERNAL_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPrimaryExternalLink() {
    return primaryExternalLink;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_EXTERNAL_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryExternalLink(@javax.annotation.Nullable List<String> primaryExternalLink) {
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
    FileEntryDtoIntegerAllOfAvailableShareRights fileEntryDtoIntegerAllOfAvailableShareRights = (FileEntryDtoIntegerAllOfAvailableShareRights) o;
    return Objects.equals(this.user, fileEntryDtoIntegerAllOfAvailableShareRights.user) &&
        Objects.equals(this.externalLink, fileEntryDtoIntegerAllOfAvailableShareRights.externalLink) &&
        Objects.equals(this.group, fileEntryDtoIntegerAllOfAvailableShareRights.group) &&
        Objects.equals(this.invitationLink, fileEntryDtoIntegerAllOfAvailableShareRights.invitationLink) &&
        Objects.equals(this.primaryExternalLink, fileEntryDtoIntegerAllOfAvailableShareRights.primaryExternalLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, externalLink, group, invitationLink, primaryExternalLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileEntryDtoIntegerAllOfAvailableShareRights {\n");
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
      for (int i = 0; i < getUser().size(); i++) {
        try {
          joiner.add(String.format("%sUser%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getUser().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `ExternalLink` to the URL query string
    if (getExternalLink() != null) {
      for (int i = 0; i < getExternalLink().size(); i++) {
        try {
          joiner.add(String.format("%sExternalLink%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExternalLink().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `Group` to the URL query string
    if (getGroup() != null) {
      for (int i = 0; i < getGroup().size(); i++) {
        try {
          joiner.add(String.format("%sGroup%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getGroup().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `InvitationLink` to the URL query string
    if (getInvitationLink() != null) {
      for (int i = 0; i < getInvitationLink().size(); i++) {
        try {
          joiner.add(String.format("%sInvitationLink%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getInvitationLink().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `PrimaryExternalLink` to the URL query string
    if (getPrimaryExternalLink() != null) {
      for (int i = 0; i < getPrimaryExternalLink().size(); i++) {
        try {
          joiner.add(String.format("%sPrimaryExternalLink%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPrimaryExternalLink().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

