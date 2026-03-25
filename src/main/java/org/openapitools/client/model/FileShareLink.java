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
import java.util.UUID;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.LinkType;
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
 * A shareable link for a file with its configuration and status.
 */
@JsonPropertyOrder({
  FileShareLink.JSON_PROPERTY_ID,
  FileShareLink.JSON_PROPERTY_TITLE,
  FileShareLink.JSON_PROPERTY_SHARE_LINK,
  FileShareLink.JSON_PROPERTY_EXPIRATION_DATE,
  FileShareLink.JSON_PROPERTY_LINK_TYPE,
  FileShareLink.JSON_PROPERTY_PASSWORD,
  FileShareLink.JSON_PROPERTY_DENY_DOWNLOAD,
  FileShareLink.JSON_PROPERTY_IS_EXPIRED,
  FileShareLink.JSON_PROPERTY_PRIMARY,
  FileShareLink.JSON_PROPERTY_INTERNAL,
  FileShareLink.JSON_PROPERTY_REQUEST_TOKEN,
  FileShareLink.JSON_PROPERTY_MAX_USE_COUNT,
  FileShareLink.JSON_PROPERTY_CURRENT_USE_COUNT
})

public class FileShareLink {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private UUID id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHARE_LINK = "shareLink";
  @javax.annotation.Nullable  private JsonNullable<String> shareLink = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  @javax.annotation.Nullable  private ApiDateTime expirationDate;

  public static final String JSON_PROPERTY_LINK_TYPE = "linkType";
  @javax.annotation.Nullable  private LinkType linkType;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable  private JsonNullable<Boolean> denyDownload = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_EXPIRED = "isExpired";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isExpired = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  @javax.annotation.Nullable  private Boolean primary;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  @javax.annotation.Nullable  private JsonNullable<Boolean> internal = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_REQUEST_TOKEN = "requestToken";
  @javax.annotation.Nullable  private JsonNullable<String> requestToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAX_USE_COUNT = "maxUseCount";
  @javax.annotation.Nullable  private JsonNullable<Integer> maxUseCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CURRENT_USE_COUNT = "currentUseCount";
  @javax.annotation.Nullable  private JsonNullable<Integer> currentUseCount = JsonNullable.<Integer>undefined();

  public FileShareLink() {
  }


  public FileShareLink id(@javax.annotation.Nullable UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the shared link.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }

  public FileShareLink title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The title of the shared content.
   * @return title
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public FileShareLink shareLink(@javax.annotation.Nullable String shareLink) {
    this.shareLink = JsonNullable.<String>of(shareLink);
    
    return this;
  }

  /**
   * The URL for accessing the shared content.
   * @return shareLink
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getShareLink() {
        return shareLink.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SHARE_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getShareLink_JsonNullable() {
    return shareLink;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARE_LINK)
  public void setShareLink_JsonNullable(JsonNullable<String> shareLink) {
    this.shareLink = shareLink;
  }

  public void setShareLink(@javax.annotation.Nullable String shareLink) {
    this.shareLink = JsonNullable.<String>of(shareLink);
  }

  public FileShareLink expirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public FileShareLink linkType(@javax.annotation.Nullable LinkType linkType) {
    
    this.linkType = linkType;
    return this;
  }

  /**
   * Get linkType
   * @return linkType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LINK_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinkType getLinkType() {
    return linkType;
  }


  @JsonProperty(value = JSON_PROPERTY_LINK_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkType(@javax.annotation.Nullable LinkType linkType) {
    this.linkType = linkType;
  }

  public FileShareLink password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The password protection for accessing the shared content.
   * @return password
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
  }

  public FileShareLink denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = JsonNullable.<Boolean>of(denyDownload);
    
    return this;
  }

  /**
   * Indicates whether downloading of the shared content is prohibited.
   * @return denyDownload
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDenyDownload() {
        return denyDownload.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDenyDownload_JsonNullable() {
    return denyDownload;
  }
  
  @JsonProperty(JSON_PROPERTY_DENY_DOWNLOAD)
  public void setDenyDownload_JsonNullable(JsonNullable<Boolean> denyDownload) {
    this.denyDownload = denyDownload;
  }

  public void setDenyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = JsonNullable.<Boolean>of(denyDownload);
  }

  public FileShareLink isExpired(@javax.annotation.Nullable Boolean isExpired) {
    this.isExpired = JsonNullable.<Boolean>of(isExpired);
    
    return this;
  }

  /**
   * Indicates whether the shared link has expired.
   * @return isExpired
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsExpired() {
        return isExpired.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsExpired_JsonNullable() {
    return isExpired;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_EXPIRED)
  public void setIsExpired_JsonNullable(JsonNullable<Boolean> isExpired) {
    this.isExpired = isExpired;
  }

  public void setIsExpired(@javax.annotation.Nullable Boolean isExpired) {
    this.isExpired = JsonNullable.<Boolean>of(isExpired);
  }

  public FileShareLink primary(@javax.annotation.Nullable Boolean primary) {
    
    this.primary = primary;
    return this;
  }

  /**
   * Indicates whether this is the primary shared link.
   * @return primary
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRIMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  @JsonProperty(value = JSON_PROPERTY_PRIMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimary(@javax.annotation.Nullable Boolean primary) {
    this.primary = primary;
  }

  public FileShareLink internal(@javax.annotation.Nullable Boolean internal) {
    this.internal = JsonNullable.<Boolean>of(internal);
    
    return this;
  }

  /**
   * Indicates whether the link is for the internal sharing only.
   * @return internal
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getInternal() {
        return internal.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getInternal_JsonNullable() {
    return internal;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERNAL)
  public void setInternal_JsonNullable(JsonNullable<Boolean> internal) {
    this.internal = internal;
  }

  public void setInternal(@javax.annotation.Nullable Boolean internal) {
    this.internal = JsonNullable.<Boolean>of(internal);
  }

  public FileShareLink requestToken(@javax.annotation.Nullable String requestToken) {
    this.requestToken = JsonNullable.<String>of(requestToken);
    
    return this;
  }

  /**
   * The token for validating access requests.
   * @return requestToken
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRequestToken() {
        return requestToken.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_REQUEST_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRequestToken_JsonNullable() {
    return requestToken;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUEST_TOKEN)
  public void setRequestToken_JsonNullable(JsonNullable<String> requestToken) {
    this.requestToken = requestToken;
  }

  public void setRequestToken(@javax.annotation.Nullable String requestToken) {
    this.requestToken = JsonNullable.<String>of(requestToken);
  }

  public FileShareLink maxUseCount(@javax.annotation.Nullable Integer maxUseCount) {
    this.maxUseCount = JsonNullable.<Integer>of(maxUseCount);
    
    return this;
  }

  /**
   * The maximum number of times the invitation link can be used.
   * @return maxUseCount
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getMaxUseCount() {
        return maxUseCount.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MAX_USE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getMaxUseCount_JsonNullable() {
    return maxUseCount;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX_USE_COUNT)
  public void setMaxUseCount_JsonNullable(JsonNullable<Integer> maxUseCount) {
    this.maxUseCount = maxUseCount;
  }

  public void setMaxUseCount(@javax.annotation.Nullable Integer maxUseCount) {
    this.maxUseCount = JsonNullable.<Integer>of(maxUseCount);
  }

  public FileShareLink currentUseCount(@javax.annotation.Nullable Integer currentUseCount) {
    this.currentUseCount = JsonNullable.<Integer>of(currentUseCount);
    
    return this;
  }

  /**
   * The current number of times the invitation link has been used.
   * @return currentUseCount
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getCurrentUseCount() {
        return currentUseCount.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CURRENT_USE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getCurrentUseCount_JsonNullable() {
    return currentUseCount;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENT_USE_COUNT)
  public void setCurrentUseCount_JsonNullable(JsonNullable<Integer> currentUseCount) {
    this.currentUseCount = currentUseCount;
  }

  public void setCurrentUseCount(@javax.annotation.Nullable Integer currentUseCount) {
    this.currentUseCount = JsonNullable.<Integer>of(currentUseCount);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileShareLink fileShareLink = (FileShareLink) o;
    return Objects.equals(this.id, fileShareLink.id) &&
        equalsNullable(this.title, fileShareLink.title) &&
        equalsNullable(this.shareLink, fileShareLink.shareLink) &&
        Objects.equals(this.expirationDate, fileShareLink.expirationDate) &&
        Objects.equals(this.linkType, fileShareLink.linkType) &&
        equalsNullable(this.password, fileShareLink.password) &&
        equalsNullable(this.denyDownload, fileShareLink.denyDownload) &&
        equalsNullable(this.isExpired, fileShareLink.isExpired) &&
        Objects.equals(this.primary, fileShareLink.primary) &&
        equalsNullable(this.internal, fileShareLink.internal) &&
        equalsNullable(this.requestToken, fileShareLink.requestToken) &&
        equalsNullable(this.maxUseCount, fileShareLink.maxUseCount) &&
        equalsNullable(this.currentUseCount, fileShareLink.currentUseCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(title), hashCodeNullable(shareLink), expirationDate, linkType, hashCodeNullable(password), hashCodeNullable(denyDownload), hashCodeNullable(isExpired), primary, hashCodeNullable(internal), hashCodeNullable(requestToken), hashCodeNullable(maxUseCount), hashCodeNullable(currentUseCount));
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
    sb.append("class FileShareLink {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    shareLink: ").append(toIndentedString(shareLink)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    denyDownload: ").append(toIndentedString(denyDownload)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    requestToken: ").append(toIndentedString(requestToken)).append("\n");
    sb.append("    maxUseCount: ").append(toIndentedString(maxUseCount)).append("\n");
    sb.append("    currentUseCount: ").append(toIndentedString(currentUseCount)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shareLink` to the URL query string
    if (getShareLink() != null) {
      try {
        joiner.add(String.format("%sshareLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShareLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expirationDate` to the URL query string
    if (getExpirationDate() != null) {
      joiner.add(getExpirationDate().toUrlQueryString(prefix + "expirationDate" + suffix));
    }

    // add `linkType` to the URL query string
    if (getLinkType() != null) {
      try {
        joiner.add(String.format("%slinkType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `denyDownload` to the URL query string
    if (getDenyDownload() != null) {
      try {
        joiner.add(String.format("%sdenyDownload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDenyDownload()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isExpired` to the URL query string
    if (getIsExpired() != null) {
      try {
        joiner.add(String.format("%sisExpired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsExpired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `primary` to the URL query string
    if (getPrimary() != null) {
      try {
        joiner.add(String.format("%sprimary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimary()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `internal` to the URL query string
    if (getInternal() != null) {
      try {
        joiner.add(String.format("%sinternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requestToken` to the URL query string
    if (getRequestToken() != null) {
      try {
        joiner.add(String.format("%srequestToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `maxUseCount` to the URL query string
    if (getMaxUseCount() != null) {
      try {
        joiner.add(String.format("%smaxUseCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxUseCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currentUseCount` to the URL query string
    if (getCurrentUseCount() != null) {
      try {
        joiner.add(String.format("%scurrentUseCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrentUseCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

