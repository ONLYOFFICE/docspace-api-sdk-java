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
 * AccessRequestKeyDto
 */
@JsonPropertyOrder({
  AccessRequestKeyDto.JSON_PROPERTY_USER_ID,
  AccessRequestKeyDto.JSON_PROPERTY_PUBLIC_KEY_ID,
  AccessRequestKeyDto.JSON_PROPERTY_PRIVATE_KEY_ENC
})

public class AccessRequestKeyDto {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private UUID userId;

  public static final String JSON_PROPERTY_PUBLIC_KEY_ID = "publicKeyId";
  @javax.annotation.Nullable  private UUID publicKeyId;

  public static final String JSON_PROPERTY_PRIVATE_KEY_ENC = "privateKeyEnc";
  @javax.annotation.Nullable  private JsonNullable<String> privateKeyEnc = JsonNullable.<String>undefined();

  public AccessRequestKeyDto() {
  }


  public AccessRequestKeyDto userId(@javax.annotation.Nullable UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * User ID
   * @return userId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@javax.annotation.Nullable UUID userId) {
    this.userId = userId;
  }

  public AccessRequestKeyDto publicKeyId(@javax.annotation.Nullable UUID publicKeyId) {
    
    this.publicKeyId = publicKeyId;
    return this;
  }

  /**
   * Public key ID
   * @return publicKeyId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PUBLIC_KEY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getPublicKeyId() {
    return publicKeyId;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC_KEY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicKeyId(@javax.annotation.Nullable UUID publicKeyId) {
    this.publicKeyId = publicKeyId;
  }

  public AccessRequestKeyDto privateKeyEnc(@javax.annotation.Nullable String privateKeyEnc) {
    this.privateKeyEnc = JsonNullable.<String>of(privateKeyEnc);
    
    return this;
  }

  /**
   * Encrypted private key
   * @return privateKeyEnc
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPrivateKeyEnc() {
        return privateKeyEnc.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PRIVATE_KEY_ENC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrivateKeyEnc_JsonNullable() {
    return privateKeyEnc;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_ENC)
  public void setPrivateKeyEnc_JsonNullable(JsonNullable<String> privateKeyEnc) {
    this.privateKeyEnc = privateKeyEnc;
  }

  public void setPrivateKeyEnc(@javax.annotation.Nullable String privateKeyEnc) {
    this.privateKeyEnc = JsonNullable.<String>of(privateKeyEnc);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRequestKeyDto accessRequestKeyDto = (AccessRequestKeyDto) o;
    return Objects.equals(this.userId, accessRequestKeyDto.userId) &&
        Objects.equals(this.publicKeyId, accessRequestKeyDto.publicKeyId) &&
        equalsNullable(this.privateKeyEnc, accessRequestKeyDto.privateKeyEnc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, publicKeyId, hashCodeNullable(privateKeyEnc));
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
    sb.append("class AccessRequestKeyDto {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    publicKeyId: ").append(toIndentedString(publicKeyId)).append("\n");
    sb.append("    privateKeyEnc: ").append(toIndentedString(privateKeyEnc)).append("\n");
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

    // add `publicKeyId` to the URL query string
    if (getPublicKeyId() != null) {
      try {
        joiner.add(String.format("%spublicKeyId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPublicKeyId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `privateKeyEnc` to the URL query string
    if (getPrivateKeyEnc() != null) {
      try {
        joiner.add(String.format("%sprivateKeyEnc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrivateKeyEnc()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

