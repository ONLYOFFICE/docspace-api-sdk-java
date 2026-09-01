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
import java.time.OffsetDateTime;
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
 * The encrypted file key issued to one user.
 */
@JsonPropertyOrder({
  FileKeys.JSON_PROPERTY_USER_ID,
  FileKeys.JSON_PROPERTY_PUBLIC_KEY_ID,
  FileKeys.JSON_PROPERTY_PRIVATE_KEY_ENC,
  FileKeys.JSON_PROPERTY_TENANT_ID,
  FileKeys.JSON_PROPERTY_FILE_ID,
  FileKeys.JSON_PROPERTY_CREATE_ON
})

public class FileKeys {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private UUID userId;

  public static final String JSON_PROPERTY_PUBLIC_KEY_ID = "publicKeyId";
  @javax.annotation.Nullable  private UUID publicKeyId;

  public static final String JSON_PROPERTY_PRIVATE_KEY_ENC = "privateKeyEnc";
  @javax.annotation.Nullable  private JsonNullable<String> privateKeyEnc = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable  private Integer tenantId;

  public static final String JSON_PROPERTY_FILE_ID = "fileId";
  @javax.annotation.Nullable  private Integer fileId;

  public static final String JSON_PROPERTY_CREATE_ON = "createOn";
  @javax.annotation.Nullable  private OffsetDateTime createOn;

  public FileKeys() {
  }


  public FileKeys userId(@javax.annotation.Nullable UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The identifier of the user the file key was issued to.
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

  public FileKeys publicKeyId(@javax.annotation.Nullable UUID publicKeyId) {
    
    this.publicKeyId = publicKeyId;
    return this;
  }

  /**
   * The identifier of the key pair the file key is encrypted for.
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

  public FileKeys privateKeyEnc(@javax.annotation.Nullable String privateKeyEnc) {
    this.privateKeyEnc = JsonNullable.<String>of(privateKeyEnc);
    
    return this;
  }

  /**
   * The file key, encrypted with the public key of the pair.
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

  public FileKeys tenantId(@javax.annotation.Nullable Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The identifier of the portal the file belongs to.
   * @return tenantId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable Integer tenantId) {
    this.tenantId = tenantId;
  }

  public FileKeys fileId(@javax.annotation.Nullable Integer fileId) {
    
    this.fileId = fileId;
    return this;
  }

  /**
   * The identifier of the file the key unlocks.
   * @return fileId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileId() {
    return fileId;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileId(@javax.annotation.Nullable Integer fileId) {
    this.fileId = fileId;
  }

  public FileKeys createOn(@javax.annotation.Nullable OffsetDateTime createOn) {
    
    this.createOn = createOn;
    return this;
  }

  /**
   * The date and time when the file key was issued.
   * @return createOn
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATE_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreateOn() {
    return createOn;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateOn(@javax.annotation.Nullable OffsetDateTime createOn) {
    this.createOn = createOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileKeys fileKeys = (FileKeys) o;
    return Objects.equals(this.userId, fileKeys.userId) &&
        Objects.equals(this.publicKeyId, fileKeys.publicKeyId) &&
        equalsNullable(this.privateKeyEnc, fileKeys.privateKeyEnc) &&
        Objects.equals(this.tenantId, fileKeys.tenantId) &&
        Objects.equals(this.fileId, fileKeys.fileId) &&
        Objects.equals(this.createOn, fileKeys.createOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, publicKeyId, hashCodeNullable(privateKeyEnc), tenantId, fileId, createOn);
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
    sb.append("class FileKeys {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    publicKeyId: ").append(toIndentedString(publicKeyId)).append("\n");
    sb.append("    privateKeyEnc: ").append(toIndentedString(privateKeyEnc)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    createOn: ").append(toIndentedString(createOn)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      try {
        joiner.add(String.format("%stenantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileId` to the URL query string
    if (getFileId() != null) {
      try {
        joiner.add(String.format("%sfileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createOn` to the URL query string
    if (getCreateOn() != null) {
      try {
        joiner.add(String.format("%screateOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

