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
 * The SSO IdP settings.
 */
@JsonPropertyOrder({
  SsoIdpSettings.JSON_PROPERTY_ENTITY_ID,
  SsoIdpSettings.JSON_PROPERTY_SSO_URL,
  SsoIdpSettings.JSON_PROPERTY_SSO_BINDING,
  SsoIdpSettings.JSON_PROPERTY_SLO_URL,
  SsoIdpSettings.JSON_PROPERTY_SLO_BINDING,
  SsoIdpSettings.JSON_PROPERTY_NAME_ID_FORMAT
})

public class SsoIdpSettings {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable  private JsonNullable<String> entityId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SSO_URL = "ssoUrl";
  @javax.annotation.Nullable  private JsonNullable<String> ssoUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SSO_BINDING = "ssoBinding";
  @javax.annotation.Nullable  private JsonNullable<String> ssoBinding = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SLO_URL = "sloUrl";
  @javax.annotation.Nullable  private JsonNullable<String> sloUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SLO_BINDING = "sloBinding";
  @javax.annotation.Nullable  private JsonNullable<String> sloBinding = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME_ID_FORMAT = "nameIdFormat";
  @javax.annotation.Nullable  private JsonNullable<String> nameIdFormat = JsonNullable.<String>undefined();

  public SsoIdpSettings() {
  }


  public SsoIdpSettings entityId(@javax.annotation.Nullable String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
    
    return this;
  }

  /**
   * The entity ID.
   * @return entityId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEntityId() {
        return entityId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEntityId_JsonNullable() {
    return entityId;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  public void setEntityId_JsonNullable(JsonNullable<String> entityId) {
    this.entityId = entityId;
  }

  public void setEntityId(@javax.annotation.Nullable String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
  }

  public SsoIdpSettings ssoUrl(@javax.annotation.Nullable String ssoUrl) {
    this.ssoUrl = JsonNullable.<String>of(ssoUrl);
    
    return this;
  }

  /**
   * The SSO URL.
   * @return ssoUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSsoUrl() {
        return ssoUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SSO_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSsoUrl_JsonNullable() {
    return ssoUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_SSO_URL)
  public void setSsoUrl_JsonNullable(JsonNullable<String> ssoUrl) {
    this.ssoUrl = ssoUrl;
  }

  public void setSsoUrl(@javax.annotation.Nullable String ssoUrl) {
    this.ssoUrl = JsonNullable.<String>of(ssoUrl);
  }

  public SsoIdpSettings ssoBinding(@javax.annotation.Nullable String ssoBinding) {
    this.ssoBinding = JsonNullable.<String>of(ssoBinding);
    
    return this;
  }

  /**
   * The SSO binding.
   * @return ssoBinding
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSsoBinding() {
        return ssoBinding.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SSO_BINDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSsoBinding_JsonNullable() {
    return ssoBinding;
  }
  
  @JsonProperty(JSON_PROPERTY_SSO_BINDING)
  public void setSsoBinding_JsonNullable(JsonNullable<String> ssoBinding) {
    this.ssoBinding = ssoBinding;
  }

  public void setSsoBinding(@javax.annotation.Nullable String ssoBinding) {
    this.ssoBinding = JsonNullable.<String>of(ssoBinding);
  }

  public SsoIdpSettings sloUrl(@javax.annotation.Nullable String sloUrl) {
    this.sloUrl = JsonNullable.<String>of(sloUrl);
    
    return this;
  }

  /**
   * The SLO URL.
   * @return sloUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSloUrl() {
        return sloUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SLO_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSloUrl_JsonNullable() {
    return sloUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_SLO_URL)
  public void setSloUrl_JsonNullable(JsonNullable<String> sloUrl) {
    this.sloUrl = sloUrl;
  }

  public void setSloUrl(@javax.annotation.Nullable String sloUrl) {
    this.sloUrl = JsonNullable.<String>of(sloUrl);
  }

  public SsoIdpSettings sloBinding(@javax.annotation.Nullable String sloBinding) {
    this.sloBinding = JsonNullable.<String>of(sloBinding);
    
    return this;
  }

  /**
   * The SLO binding.
   * @return sloBinding
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSloBinding() {
        return sloBinding.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SLO_BINDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSloBinding_JsonNullable() {
    return sloBinding;
  }
  
  @JsonProperty(JSON_PROPERTY_SLO_BINDING)
  public void setSloBinding_JsonNullable(JsonNullable<String> sloBinding) {
    this.sloBinding = sloBinding;
  }

  public void setSloBinding(@javax.annotation.Nullable String sloBinding) {
    this.sloBinding = JsonNullable.<String>of(sloBinding);
  }

  public SsoIdpSettings nameIdFormat(@javax.annotation.Nullable String nameIdFormat) {
    this.nameIdFormat = JsonNullable.<String>of(nameIdFormat);
    
    return this;
  }

  /**
   * The name ID format.
   * @return nameIdFormat
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getNameIdFormat() {
        return nameIdFormat.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME_ID_FORMAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNameIdFormat_JsonNullable() {
    return nameIdFormat;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME_ID_FORMAT)
  public void setNameIdFormat_JsonNullable(JsonNullable<String> nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  public void setNameIdFormat(@javax.annotation.Nullable String nameIdFormat) {
    this.nameIdFormat = JsonNullable.<String>of(nameIdFormat);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoIdpSettings ssoIdpSettings = (SsoIdpSettings) o;
    return equalsNullable(this.entityId, ssoIdpSettings.entityId) &&
        equalsNullable(this.ssoUrl, ssoIdpSettings.ssoUrl) &&
        equalsNullable(this.ssoBinding, ssoIdpSettings.ssoBinding) &&
        equalsNullable(this.sloUrl, ssoIdpSettings.sloUrl) &&
        equalsNullable(this.sloBinding, ssoIdpSettings.sloBinding) &&
        equalsNullable(this.nameIdFormat, ssoIdpSettings.nameIdFormat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(entityId), hashCodeNullable(ssoUrl), hashCodeNullable(ssoBinding), hashCodeNullable(sloUrl), hashCodeNullable(sloBinding), hashCodeNullable(nameIdFormat));
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
    sb.append("class SsoIdpSettings {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    ssoUrl: ").append(toIndentedString(ssoUrl)).append("\n");
    sb.append("    ssoBinding: ").append(toIndentedString(ssoBinding)).append("\n");
    sb.append("    sloUrl: ").append(toIndentedString(sloUrl)).append("\n");
    sb.append("    sloBinding: ").append(toIndentedString(sloBinding)).append("\n");
    sb.append("    nameIdFormat: ").append(toIndentedString(nameIdFormat)).append("\n");
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

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      try {
        joiner.add(String.format("%sentityId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ssoUrl` to the URL query string
    if (getSsoUrl() != null) {
      try {
        joiner.add(String.format("%sssoUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsoUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ssoBinding` to the URL query string
    if (getSsoBinding() != null) {
      try {
        joiner.add(String.format("%sssoBinding%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsoBinding()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sloUrl` to the URL query string
    if (getSloUrl() != null) {
      try {
        joiner.add(String.format("%ssloUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSloUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sloBinding` to the URL query string
    if (getSloBinding() != null) {
      try {
        joiner.add(String.format("%ssloBinding%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSloBinding()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nameIdFormat` to the URL query string
    if (getNameIdFormat() != null) {
      try {
        joiner.add(String.format("%snameIdFormat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNameIdFormat()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

