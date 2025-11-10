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
import java.util.UUID;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.FileShare;
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
 * The external link request parameters.
 */
@JsonPropertyOrder({
  FileLinkRequest.JSON_PROPERTY_LINK_ID,
  FileLinkRequest.JSON_PROPERTY_ACCESS,
  FileLinkRequest.JSON_PROPERTY_EXPIRATION_DATE,
  FileLinkRequest.JSON_PROPERTY_TITLE,
  FileLinkRequest.JSON_PROPERTY_INTERNAL,
  FileLinkRequest.JSON_PROPERTY_PRIMARY,
  FileLinkRequest.JSON_PROPERTY_DENY_DOWNLOAD,
  FileLinkRequest.JSON_PROPERTY_PASSWORD
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FileLinkRequest {
  public static final String JSON_PROPERTY_LINK_ID = "linkId";
  @javax.annotation.Nullable
  private UUID linkId;

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable
  private FileShare access;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  @javax.annotation.Nullable
  private ApiDateTime expirationDate;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  @javax.annotation.Nullable
  private Boolean internal;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  @javax.annotation.Nullable
  private Boolean primary;

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable
  private Boolean denyDownload;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public FileLinkRequest() {
  }

  public FileLinkRequest linkId(@javax.annotation.Nullable UUID linkId) {
    
    this.linkId = linkId;
    return this;
  }

  /**
   * The external link ID.
   * @return linkId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLinkId() {
    return linkId;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkId(@javax.annotation.Nullable UUID linkId) {
    this.linkId = linkId;
  }

  public FileLinkRequest access(@javax.annotation.Nullable FileShare access) {
    
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileShare getAccess() {
    return access;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable FileShare access) {
    this.access = access;
  }

  public FileLinkRequest expirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(@javax.annotation.Nullable ApiDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public FileLinkRequest title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The link name.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
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

  public FileLinkRequest internal(@javax.annotation.Nullable Boolean internal) {
    
    this.internal = internal;
    return this;
  }

  /**
   * The link scope, whether it is internal or not.
   * @return internal
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInternal() {
    return internal;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternal(@javax.annotation.Nullable Boolean internal) {
    this.internal = internal;
  }

  public FileLinkRequest primary(@javax.annotation.Nullable Boolean primary) {
    
    this.primary = primary;
    return this;
  }

  /**
   * Specifies whether the file link is primary or not.
   * @return primary
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimary(@javax.annotation.Nullable Boolean primary) {
    this.primary = primary;
  }

  public FileLinkRequest denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    
    this.denyDownload = denyDownload;
    return this;
  }

  /**
   * Specifies whether to deny downloading the file or not.
   * @return denyDownload
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DENY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDenyDownload() {
    return denyDownload;
  }


  @JsonProperty(JSON_PROPERTY_DENY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDenyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = denyDownload;
  }

  public FileLinkRequest password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * Password for access via link.
   * @return password
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileLinkRequest fileLinkRequest = (FileLinkRequest) o;
    return Objects.equals(this.linkId, fileLinkRequest.linkId) &&
        Objects.equals(this.access, fileLinkRequest.access) &&
        Objects.equals(this.expirationDate, fileLinkRequest.expirationDate) &&
        equalsNullable(this.title, fileLinkRequest.title) &&
        Objects.equals(this.internal, fileLinkRequest.internal) &&
        Objects.equals(this.primary, fileLinkRequest.primary) &&
        Objects.equals(this.denyDownload, fileLinkRequest.denyDownload) &&
        equalsNullable(this.password, fileLinkRequest.password);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkId, access, expirationDate, hashCodeNullable(title), internal, primary, denyDownload, hashCodeNullable(password));
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
    sb.append("class FileLinkRequest {\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    denyDownload: ").append(toIndentedString(denyDownload)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `primary` to the URL query string
    if (getPrimary() != null) {
      try {
        joiner.add(String.format("%sprimary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimary()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

