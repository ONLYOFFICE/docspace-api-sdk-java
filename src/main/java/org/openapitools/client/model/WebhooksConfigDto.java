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
import java.time.OffsetDateTime;
import org.openapitools.client.model.EmployeeDto;
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
 * The webhook configuration parameters.
 */
@JsonPropertyOrder({
  WebhooksConfigDto.JSON_PROPERTY_ID,
  WebhooksConfigDto.JSON_PROPERTY_NAME,
  WebhooksConfigDto.JSON_PROPERTY_URI,
  WebhooksConfigDto.JSON_PROPERTY_ENABLED,
  WebhooksConfigDto.JSON_PROPERTY_SSL,
  WebhooksConfigDto.JSON_PROPERTY_TRIGGERS,
  WebhooksConfigDto.JSON_PROPERTY_TARGET_ID,
  WebhooksConfigDto.JSON_PROPERTY_CREATED_BY,
  WebhooksConfigDto.JSON_PROPERTY_CREATED_ON,
  WebhooksConfigDto.JSON_PROPERTY_MODIFIED_BY,
  WebhooksConfigDto.JSON_PROPERTY_MODIFIED_ON,
  WebhooksConfigDto.JSON_PROPERTY_LAST_FAILURE_ON,
  WebhooksConfigDto.JSON_PROPERTY_LAST_FAILURE_CONTENT,
  WebhooksConfigDto.JSON_PROPERTY_LAST_SUCCESS_ON
})

public class WebhooksConfigDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URI = "uri";
  @javax.annotation.Nullable
  private JsonNullable<String> uri = JsonNullable.<String>undefined();

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

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private EmployeeDto createdBy;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> createdOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  @javax.annotation.Nullable
  private EmployeeDto modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_ON = "modifiedOn";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> modifiedOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_LAST_FAILURE_ON = "lastFailureOn";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> lastFailureOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_LAST_FAILURE_CONTENT = "lastFailureContent";
  @javax.annotation.Nullable
  private JsonNullable<String> lastFailureContent = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_SUCCESS_ON = "lastSuccessOn";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> lastSuccessOn = JsonNullable.<OffsetDateTime>undefined();

  public WebhooksConfigDto() {
  }

  public WebhooksConfigDto id(@javax.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The webhook ID.
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

  public WebhooksConfigDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The webhook name.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public WebhooksConfigDto uri(@javax.annotation.Nullable String uri) {
    this.uri = JsonNullable.<String>of(uri);
    
    return this;
  }

  /**
   * The webhook URI.
   * @return uri
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUri() {
        return uri.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUri_JsonNullable() {
    return uri;
  }
  
  @JsonProperty(JSON_PROPERTY_URI)
  public void setUri_JsonNullable(JsonNullable<String> uri) {
    this.uri = uri;
  }

  public void setUri(@javax.annotation.Nullable String uri) {
    this.uri = JsonNullable.<String>of(uri);
  }

  public WebhooksConfigDto enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Specifies if the webhooks are enabled or not.
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

  public WebhooksConfigDto ssl(@javax.annotation.Nullable Boolean ssl) {
    
    this.ssl = ssl;
    return this;
  }

  /**
   * The webhook SSL verification (enabled or not).
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

  public WebhooksConfigDto triggers(@javax.annotation.Nullable WebhookTrigger triggers) {
    
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

  public WebhooksConfigDto targetId(@javax.annotation.Nullable String targetId) {
    this.targetId = JsonNullable.<String>of(targetId);
    
    return this;
  }

  /**
   * The webhook target ID.
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

  public WebhooksConfigDto createdBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    this.createdBy = createdBy;
  }

  public WebhooksConfigDto createdOn(@javax.annotation.Nullable OffsetDateTime createdOn) {
    this.createdOn = JsonNullable.<OffsetDateTime>of(createdOn);
    
    return this;
  }

  /**
   * The date and time when the webhook was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getCreatedOn() {
        return createdOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedOn_JsonNullable() {
    return createdOn;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  public void setCreatedOn_JsonNullable(JsonNullable<OffsetDateTime> createdOn) {
    this.createdOn = createdOn;
  }

  public void setCreatedOn(@javax.annotation.Nullable OffsetDateTime createdOn) {
    this.createdOn = JsonNullable.<OffsetDateTime>of(createdOn);
  }

  public WebhooksConfigDto modifiedBy(@javax.annotation.Nullable EmployeeDto modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Get modifiedBy
   * @return modifiedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getModifiedBy() {
    return modifiedBy;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedBy(@javax.annotation.Nullable EmployeeDto modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public WebhooksConfigDto modifiedOn(@javax.annotation.Nullable OffsetDateTime modifiedOn) {
    this.modifiedOn = JsonNullable.<OffsetDateTime>of(modifiedOn);
    
    return this;
  }

  /**
   * The date and time when the webhook was modified.
   * @return modifiedOn
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getModifiedOn() {
        return modifiedOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getModifiedOn_JsonNullable() {
    return modifiedOn;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_ON)
  public void setModifiedOn_JsonNullable(JsonNullable<OffsetDateTime> modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public void setModifiedOn(@javax.annotation.Nullable OffsetDateTime modifiedOn) {
    this.modifiedOn = JsonNullable.<OffsetDateTime>of(modifiedOn);
  }

  public WebhooksConfigDto lastFailureOn(@javax.annotation.Nullable OffsetDateTime lastFailureOn) {
    this.lastFailureOn = JsonNullable.<OffsetDateTime>of(lastFailureOn);
    
    return this;
  }

  /**
   * The date and time of the webhook last failure.
   * @return lastFailureOn
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getLastFailureOn() {
        return lastFailureOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_FAILURE_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getLastFailureOn_JsonNullable() {
    return lastFailureOn;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_FAILURE_ON)
  public void setLastFailureOn_JsonNullable(JsonNullable<OffsetDateTime> lastFailureOn) {
    this.lastFailureOn = lastFailureOn;
  }

  public void setLastFailureOn(@javax.annotation.Nullable OffsetDateTime lastFailureOn) {
    this.lastFailureOn = JsonNullable.<OffsetDateTime>of(lastFailureOn);
  }

  public WebhooksConfigDto lastFailureContent(@javax.annotation.Nullable String lastFailureContent) {
    this.lastFailureContent = JsonNullable.<String>of(lastFailureContent);
    
    return this;
  }

  /**
   * The webhook last failure content.
   * @return lastFailureContent
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLastFailureContent() {
        return lastFailureContent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_FAILURE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastFailureContent_JsonNullable() {
    return lastFailureContent;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_FAILURE_CONTENT)
  public void setLastFailureContent_JsonNullable(JsonNullable<String> lastFailureContent) {
    this.lastFailureContent = lastFailureContent;
  }

  public void setLastFailureContent(@javax.annotation.Nullable String lastFailureContent) {
    this.lastFailureContent = JsonNullable.<String>of(lastFailureContent);
  }

  public WebhooksConfigDto lastSuccessOn(@javax.annotation.Nullable OffsetDateTime lastSuccessOn) {
    this.lastSuccessOn = JsonNullable.<OffsetDateTime>of(lastSuccessOn);
    
    return this;
  }

  /**
   * The date and time of the webhook last success.
   * @return lastSuccessOn
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getLastSuccessOn() {
        return lastSuccessOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_SUCCESS_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getLastSuccessOn_JsonNullable() {
    return lastSuccessOn;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_SUCCESS_ON)
  public void setLastSuccessOn_JsonNullable(JsonNullable<OffsetDateTime> lastSuccessOn) {
    this.lastSuccessOn = lastSuccessOn;
  }

  public void setLastSuccessOn(@javax.annotation.Nullable OffsetDateTime lastSuccessOn) {
    this.lastSuccessOn = JsonNullable.<OffsetDateTime>of(lastSuccessOn);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksConfigDto webhooksConfigDto = (WebhooksConfigDto) o;
    return Objects.equals(this.id, webhooksConfigDto.id) &&
        equalsNullable(this.name, webhooksConfigDto.name) &&
        equalsNullable(this.uri, webhooksConfigDto.uri) &&
        Objects.equals(this.enabled, webhooksConfigDto.enabled) &&
        Objects.equals(this.ssl, webhooksConfigDto.ssl) &&
        Objects.equals(this.triggers, webhooksConfigDto.triggers) &&
        equalsNullable(this.targetId, webhooksConfigDto.targetId) &&
        Objects.equals(this.createdBy, webhooksConfigDto.createdBy) &&
        equalsNullable(this.createdOn, webhooksConfigDto.createdOn) &&
        Objects.equals(this.modifiedBy, webhooksConfigDto.modifiedBy) &&
        equalsNullable(this.modifiedOn, webhooksConfigDto.modifiedOn) &&
        equalsNullable(this.lastFailureOn, webhooksConfigDto.lastFailureOn) &&
        equalsNullable(this.lastFailureContent, webhooksConfigDto.lastFailureContent) &&
        equalsNullable(this.lastSuccessOn, webhooksConfigDto.lastSuccessOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(uri), enabled, ssl, triggers, hashCodeNullable(targetId), createdBy, hashCodeNullable(createdOn), modifiedBy, hashCodeNullable(modifiedOn), hashCodeNullable(lastFailureOn), hashCodeNullable(lastFailureContent), hashCodeNullable(lastSuccessOn));
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
    sb.append("class WebhooksConfigDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    lastFailureOn: ").append(toIndentedString(lastFailureOn)).append("\n");
    sb.append("    lastFailureContent: ").append(toIndentedString(lastFailureContent)).append("\n");
    sb.append("    lastSuccessOn: ").append(toIndentedString(lastSuccessOn)).append("\n");
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

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      joiner.add(getCreatedBy().toUrlQueryString(prefix + "createdBy" + suffix));
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modifiedBy` to the URL query string
    if (getModifiedBy() != null) {
      joiner.add(getModifiedBy().toUrlQueryString(prefix + "modifiedBy" + suffix));
    }

    // add `modifiedOn` to the URL query string
    if (getModifiedOn() != null) {
      try {
        joiner.add(String.format("%smodifiedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastFailureOn` to the URL query string
    if (getLastFailureOn() != null) {
      try {
        joiner.add(String.format("%slastFailureOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastFailureOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastFailureContent` to the URL query string
    if (getLastFailureContent() != null) {
      try {
        joiner.add(String.format("%slastFailureContent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastFailureContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastSuccessOn` to the URL query string
    if (getLastSuccessOn() != null) {
      try {
        joiner.add(String.format("%slastSuccessOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastSuccessOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

