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
import org.openapitools.client.model.FileShare;
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
 * The room link parameters.
 */
@JsonPropertyOrder({
  RoomLinkRequest.JSON_PROPERTY_LINK_ID,
  RoomLinkRequest.JSON_PROPERTY_ACCESS,
  RoomLinkRequest.JSON_PROPERTY_EXPIRATION_DATE,
  RoomLinkRequest.JSON_PROPERTY_INTERNAL,
  RoomLinkRequest.JSON_PROPERTY_TITLE,
  RoomLinkRequest.JSON_PROPERTY_LINK_TYPE,
  RoomLinkRequest.JSON_PROPERTY_PASSWORD,
  RoomLinkRequest.JSON_PROPERTY_DENY_DOWNLOAD,
  RoomLinkRequest.JSON_PROPERTY_MAX_USE_COUNT,
  RoomLinkRequest.JSON_PROPERTY_CURRENT_USE_COUNT
})

public class RoomLinkRequest {
  public static final String JSON_PROPERTY_LINK_ID = "linkId";
  @javax.annotation.Nullable  private UUID linkId;

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable  private FileShare access;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  @javax.annotation.Nullable  private ApiDateTime expirationDate;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  @javax.annotation.Nullable  private Boolean internal;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINK_TYPE = "linkType";
  @javax.annotation.Nullable  private LinkType linkType;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable  private Boolean denyDownload;

  public static final String JSON_PROPERTY_MAX_USE_COUNT = "maxUseCount";
  @javax.annotation.Nullable  private JsonNullable<Integer> maxUseCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CURRENT_USE_COUNT = "currentUseCount";
  @javax.annotation.Nullable  private Integer currentUseCount;

  public RoomLinkRequest() {
  }


  public RoomLinkRequest linkId(@javax.annotation.Nullable UUID linkId) {
    
    this.linkId = linkId;
    return this;
  }

  /**
   * The room link ID.
   * @return linkId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LINK_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLinkId() {
    return linkId;
  }


  @JsonProperty(value = JSON_PROPERTY_LINK_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkId(@javax.annotation.Nullable UUID linkId) {
    this.linkId = linkId;
  }

  public RoomLinkRequest access(@javax.annotation.Nullable FileShare access) {
    
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileShare getAccess() {
    return access;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable FileShare access) {
    this.access = access;
  }

  public RoomLinkRequest expirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    
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

  public RoomLinkRequest internal(@javax.annotation.Nullable Boolean internal) {
    
    this.internal = internal;
    return this;
  }

  /**
   * The link scope, whether it is internal or not.
   * @return internal
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInternal() {
    return internal;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternal(@javax.annotation.Nullable Boolean internal) {
    this.internal = internal;
  }

  public RoomLinkRequest title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The link name.
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

  public RoomLinkRequest linkType(@javax.annotation.Nullable LinkType linkType) {
    
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

  public RoomLinkRequest password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The link password.
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

  public RoomLinkRequest denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    
    this.denyDownload = denyDownload;
    return this;
  }

  /**
   * Specifies if downloading the file from the link is disabled or not.
   * @return denyDownload
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDenyDownload() {
    return denyDownload;
  }


  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDenyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = denyDownload;
  }

  public RoomLinkRequest maxUseCount(@javax.annotation.Nullable Integer maxUseCount) {
    this.maxUseCount = JsonNullable.<Integer>of(maxUseCount);
    
    return this;
  }

  /**
   * The maximum number of times the invitation link can be used.
   * minimum: 1
   * maximum: 1000
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

  public RoomLinkRequest currentUseCount(@javax.annotation.Nullable Integer currentUseCount) {
    
    this.currentUseCount = currentUseCount;
    return this;
  }

  /**
   * The current number of times the invitation link has been used.
   * @return currentUseCount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CURRENT_USE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurrentUseCount() {
    return currentUseCount;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_USE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentUseCount(@javax.annotation.Nullable Integer currentUseCount) {
    this.currentUseCount = currentUseCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomLinkRequest roomLinkRequest = (RoomLinkRequest) o;
    return Objects.equals(this.linkId, roomLinkRequest.linkId) &&
        Objects.equals(this.access, roomLinkRequest.access) &&
        Objects.equals(this.expirationDate, roomLinkRequest.expirationDate) &&
        Objects.equals(this.internal, roomLinkRequest.internal) &&
        equalsNullable(this.title, roomLinkRequest.title) &&
        Objects.equals(this.linkType, roomLinkRequest.linkType) &&
        equalsNullable(this.password, roomLinkRequest.password) &&
        Objects.equals(this.denyDownload, roomLinkRequest.denyDownload) &&
        equalsNullable(this.maxUseCount, roomLinkRequest.maxUseCount) &&
        Objects.equals(this.currentUseCount, roomLinkRequest.currentUseCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkId, access, expirationDate, internal, hashCodeNullable(title), linkType, hashCodeNullable(password), denyDownload, hashCodeNullable(maxUseCount), currentUseCount);
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
    sb.append("class RoomLinkRequest {\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    denyDownload: ").append(toIndentedString(denyDownload)).append("\n");
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

    // add `linkId` to the URL query string
    if (getLinkId() != null) {
      try {
        joiner.add(String.format("%slinkId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `access` to the URL query string
    if (getAccess() != null) {
      try {
        joiner.add(String.format("%saccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expirationDate` to the URL query string
    if (getExpirationDate() != null) {
      joiner.add(getExpirationDate().toUrlQueryString(prefix + "expirationDate" + suffix));
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

