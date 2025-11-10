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
 * The collection of file sharing parameters.
 */
@JsonPropertyOrder({
  FileShareParams.JSON_PROPERTY_SHARE_TO,
  FileShareParams.JSON_PROPERTY_EMAIL,
  FileShareParams.JSON_PROPERTY_ACCESS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FileShareParams {
  public static final String JSON_PROPERTY_SHARE_TO = "shareTo";
  @javax.annotation.Nullable
  private UUID shareTo;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable
  private FileShare access;

  public FileShareParams() {
  }

  public FileShareParams shareTo(@javax.annotation.Nullable UUID shareTo) {
    
    this.shareTo = shareTo;
    return this;
  }

  /**
   * The ID of the user to whom the file will be shared.
   * @return shareTo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getShareTo() {
    return shareTo;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareTo(@javax.annotation.Nullable UUID shareTo) {
    this.shareTo = shareTo;
  }

  public FileShareParams email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The user email address.
   * @return email
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
  }

  public FileShareParams access(@javax.annotation.Nullable FileShare access) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileShareParams fileShareParams = (FileShareParams) o;
    return Objects.equals(this.shareTo, fileShareParams.shareTo) &&
        equalsNullable(this.email, fileShareParams.email) &&
        Objects.equals(this.access, fileShareParams.access);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareTo, hashCodeNullable(email), access);
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
    sb.append("class FileShareParams {\n");
    sb.append("    shareTo: ").append(toIndentedString(shareTo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

    // add `shareTo` to the URL query string
    if (getShareTo() != null) {
      try {
        joiner.add(String.format("%sshareTo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShareTo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

