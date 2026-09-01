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
 * Represents a single user entry of a DocsCloud quota.
 */
@JsonPropertyOrder({
  DocsCloudQuotaUser.JSON_PROPERTY_USER_ID,
  DocsCloudQuotaUser.JSON_PROPERTY_EXPIRE
})

public class DocsCloudQuotaUser {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRE = "expire";
  @javax.annotation.Nullable  private JsonNullable<String> expire = JsonNullable.<String>undefined();

  public DocsCloudQuotaUser() {
  }


  public DocsCloudQuotaUser userId(@javax.annotation.Nullable String userId) {
    this.userId = JsonNullable.<String>of(userId);
    
    return this;
  }

  /**
   * The user ID.
   * @return userId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = JsonNullable.<String>of(userId);
  }

  public DocsCloudQuotaUser expire(@javax.annotation.Nullable String expire) {
    this.expire = JsonNullable.<String>of(expire);
    
    return this;
  }

  /**
   * The expiration date of the user.
   * @return expire
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getExpire() {
        return expire.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXPIRE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getExpire_JsonNullable() {
    return expire;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRE)
  public void setExpire_JsonNullable(JsonNullable<String> expire) {
    this.expire = expire;
  }

  public void setExpire(@javax.annotation.Nullable String expire) {
    this.expire = JsonNullable.<String>of(expire);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudQuotaUser docsCloudQuotaUser = (DocsCloudQuotaUser) o;
    return equalsNullable(this.userId, docsCloudQuotaUser.userId) &&
        equalsNullable(this.expire, docsCloudQuotaUser.expire);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(userId), hashCodeNullable(expire));
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
    sb.append("class DocsCloudQuotaUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
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

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expire` to the URL query string
    if (getExpire() != null) {
      try {
        joiner.add(String.format("%sexpire%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpire()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

