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
import org.openapitools.client.model.WebhookTrigger;
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
 * The request parameters for updating the webhook configuration.
 */
@JsonPropertyOrder({
  UpdateWebhooksConfigRequestsDto.JSON_PROPERTY_NAME,
  UpdateWebhooksConfigRequestsDto.JSON_PROPERTY_URI,
  UpdateWebhooksConfigRequestsDto.JSON_PROPERTY_SECRET_KEY,
  UpdateWebhooksConfigRequestsDto.JSON_PROPERTY_ENABLED,
  UpdateWebhooksConfigRequestsDto.JSON_PROPERTY_SSL,
  UpdateWebhooksConfigRequestsDto.JSON_PROPERTY_TRIGGERS,
  UpdateWebhooksConfigRequestsDto.JSON_PROPERTY_TARGET_ID,
  UpdateWebhooksConfigRequestsDto.JSON_PROPERTY_ID
})

public class UpdateWebhooksConfigRequestsDto {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_URI = "uri";
  @javax.annotation.Nonnull
  private String uri;

  public static final String JSON_PROPERTY_SECRET_KEY = "secretKey";
  @javax.annotation.Nullable
  private JsonNullable<String> secretKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_SSL = "ssl";
  @javax.annotation.Nullable
  private Boolean ssl;

  public static final String JSON_PROPERTY_TRIGGERS = "triggers";
  @javax.annotation.Nullable
  private WebhookTrigger triggers;

  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  @javax.annotation.Nullable
  private JsonNullable<String> targetId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private Integer id;

  public UpdateWebhooksConfigRequestsDto() {
  }

  public UpdateWebhooksConfigRequestsDto name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The human-readable name of the webhook configuration.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public UpdateWebhooksConfigRequestsDto uri(@javax.annotation.Nonnull String uri) {
    
    this.uri = uri;
    return this;
  }

  /**
   * The destination URL where the webhook events will be sent.
   * @return uri
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUri(@javax.annotation.Nonnull String uri) {
    this.uri = uri;
  }

  public UpdateWebhooksConfigRequestsDto secretKey(@javax.annotation.Nullable String secretKey) {
    this.secretKey = JsonNullable.<String>of(secretKey);
    
    return this;
  }

  /**
   * The webhook secret key used to sign the webhook payloads for the security verification.
   * @return secretKey
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSecretKey() {
        return secretKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecretKey_JsonNullable() {
    return secretKey;
  }
  
  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  public void setSecretKey_JsonNullable(JsonNullable<String> secretKey) {
    this.secretKey = secretKey;
  }

  public void setSecretKey(@javax.annotation.Nullable String secretKey) {
    this.secretKey = JsonNullable.<String>of(secretKey);
  }

  public UpdateWebhooksConfigRequestsDto enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Specifies whether the webhook configuration is active or not.
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public UpdateWebhooksConfigRequestsDto ssl(@javax.annotation.Nullable Boolean ssl) {
    
    this.ssl = ssl;
    return this;
  }

  /**
   * Specifies whether the SSL certificate verification is required or not.
   * @return ssl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSsl() {
    return ssl;
  }


  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsl(@javax.annotation.Nullable Boolean ssl) {
    this.ssl = ssl;
  }

  public UpdateWebhooksConfigRequestsDto triggers(@javax.annotation.Nullable WebhookTrigger triggers) {
    
    this.triggers = triggers;
    return this;
  }

  /**
   * Get triggers
   * @return triggers
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookTrigger getTriggers() {
    return triggers;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggers(@javax.annotation.Nullable WebhookTrigger triggers) {
    this.triggers = triggers;
  }

  public UpdateWebhooksConfigRequestsDto targetId(@javax.annotation.Nullable String targetId) {
    this.targetId = JsonNullable.<String>of(targetId);
    
    return this;
  }

  /**
   * Target ID
   * @return targetId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTargetId() {
        return targetId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTargetId_JsonNullable() {
    return targetId;
  }
  
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  public void setTargetId_JsonNullable(JsonNullable<String> targetId) {
    this.targetId = targetId;
  }

  public void setTargetId(@javax.annotation.Nullable String targetId) {
    this.targetId = JsonNullable.<String>of(targetId);
  }

  public UpdateWebhooksConfigRequestsDto id(@javax.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The webhook configuration ID.
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull Integer id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto = (UpdateWebhooksConfigRequestsDto) o;
    return Objects.equals(this.name, updateWebhooksConfigRequestsDto.name) &&
        Objects.equals(this.uri, updateWebhooksConfigRequestsDto.uri) &&
        equalsNullable(this.secretKey, updateWebhooksConfigRequestsDto.secretKey) &&
        Objects.equals(this.enabled, updateWebhooksConfigRequestsDto.enabled) &&
        Objects.equals(this.ssl, updateWebhooksConfigRequestsDto.ssl) &&
        Objects.equals(this.triggers, updateWebhooksConfigRequestsDto.triggers) &&
        equalsNullable(this.targetId, updateWebhooksConfigRequestsDto.targetId) &&
        Objects.equals(this.id, updateWebhooksConfigRequestsDto.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uri, hashCodeNullable(secretKey), enabled, ssl, triggers, hashCodeNullable(targetId), id);
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
    sb.append("class UpdateWebhooksConfigRequestsDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uri` to the URL query string
    if (getUri() != null) {
      try {
        joiner.add(String.format("%suri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `secretKey` to the URL query string
    if (getSecretKey() != null) {
      try {
        joiner.add(String.format("%ssecretKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecretKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ssl` to the URL query string
    if (getSsl() != null) {
      try {
        joiner.add(String.format("%sssl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `triggers` to the URL query string
    if (getTriggers() != null) {
      try {
        joiner.add(String.format("%striggers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTriggers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `targetId` to the URL query string
    if (getTargetId() != null) {
      try {
        joiner.add(String.format("%stargetId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTargetId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

