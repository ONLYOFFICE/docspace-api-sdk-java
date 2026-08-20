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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for managing user security and access permissions.
 */
@JsonPropertyOrder({
  SecurityRequestsDto.JSON_PROPERTY_PRODUCT_ID,
  SecurityRequestsDto.JSON_PROPERTY_USER_ID,
  SecurityRequestsDto.JSON_PROPERTY_ADMINISTRATOR
})

public class SecurityRequestsDto {
  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  @javax.annotation.Nonnull  private UUID productId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nonnull  private UUID userId;

  public static final String JSON_PROPERTY_ADMINISTRATOR = "administrator";
  @javax.annotation.Nullable  private Boolean administrator;

  public SecurityRequestsDto() {
  }


  public SecurityRequestsDto productId(@javax.annotation.Nonnull UUID productId) {
    
    this.productId = productId;
    return this;
  }

  /**
   * The product ID for which permissions are being set.
   * @return productId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PRODUCT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getProductId() {
    return productId;
  }


  @JsonProperty(value = JSON_PROPERTY_PRODUCT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(@javax.annotation.Nonnull UUID productId) {
    this.productId = productId;
  }

  public SecurityRequestsDto userId(@javax.annotation.Nonnull UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user whose permissions are being configured.
   * @return userId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
  }

  public SecurityRequestsDto administrator(@javax.annotation.Nullable Boolean administrator) {
    
    this.administrator = administrator;
    return this;
  }

  /**
   * Specifies whether the user has administrative privileges.
   * @return administrator
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ADMINISTRATOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdministrator() {
    return administrator;
  }


  @JsonProperty(value = JSON_PROPERTY_ADMINISTRATOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdministrator(@javax.annotation.Nullable Boolean administrator) {
    this.administrator = administrator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityRequestsDto securityRequestsDto = (SecurityRequestsDto) o;
    return Objects.equals(this.productId, securityRequestsDto.productId) &&
        Objects.equals(this.userId, securityRequestsDto.userId) &&
        Objects.equals(this.administrator, securityRequestsDto.administrator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, userId, administrator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityRequestsDto {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    administrator: ").append(toIndentedString(administrator)).append("\n");
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

    // add `productId` to the URL query string
    if (getProductId() != null) {
      try {
        joiner.add(String.format("%sproductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `administrator` to the URL query string
    if (getAdministrator() != null) {
      try {
        joiner.add(String.format("%sadministrator%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdministrator()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

