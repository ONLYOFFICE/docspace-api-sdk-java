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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.ProviderType;
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
 * AI provider details.
 */
@JsonPropertyOrder({
  AiProviderDto.JSON_PROPERTY_ID,
  AiProviderDto.JSON_PROPERTY_TITLE,
  AiProviderDto.JSON_PROPERTY_TYPE,
  AiProviderDto.JSON_PROPERTY_URL,
  AiProviderDto.JSON_PROPERTY_CREATED_ON,
  AiProviderDto.JSON_PROPERTY_MODIFIED_ON,
  AiProviderDto.JSON_PROPERTY_NEED_RESET,
  AiProviderDto.JSON_PROPERTY_IS_DEFAULT
})

public class AiProviderDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private ProviderType type;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nonnull  private ApiDateTime createdOn;

  public static final String JSON_PROPERTY_MODIFIED_ON = "modifiedOn";
  @javax.annotation.Nonnull  private ApiDateTime modifiedOn;

  public static final String JSON_PROPERTY_NEED_RESET = "needReset";
  @javax.annotation.Nullable  private Boolean needReset;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  @javax.annotation.Nullable  private Boolean isDefault;

  public AiProviderDto() {
  }


  public AiProviderDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * AI provider identifier.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public AiProviderDto title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * AI provider display title.
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public AiProviderDto type(@javax.annotation.Nullable ProviderType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProviderType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable ProviderType type) {
    this.type = type;
  }

  public AiProviderDto url(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
    
    return this;
  }

  /**
   * API endpoint URL for the AI provider.
   * @return url
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
  }

  public AiProviderDto createdOn(@javax.annotation.Nonnull ApiDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CREATED_ON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ApiDateTime getCreatedOn() {
    return createdOn;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_ON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedOn(@javax.annotation.Nonnull ApiDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public AiProviderDto modifiedOn(@javax.annotation.Nonnull ApiDateTime modifiedOn) {
    
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * Get modifiedOn
   * @return modifiedOn
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MODIFIED_ON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ApiDateTime getModifiedOn() {
    return modifiedOn;
  }


  @JsonProperty(value = JSON_PROPERTY_MODIFIED_ON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModifiedOn(@javax.annotation.Nonnull ApiDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public AiProviderDto needReset(@javax.annotation.Nullable Boolean needReset) {
    
    this.needReset = needReset;
    return this;
  }

  /**
   * Indicates whether the provider's API key needs to be reset.
   * @return needReset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeedReset() {
    return needReset;
  }


  @JsonProperty(value = JSON_PROPERTY_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeedReset(@javax.annotation.Nullable Boolean needReset) {
    this.needReset = needReset;
  }

  public AiProviderDto isDefault(@javax.annotation.Nullable Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Indicates whether this provider is the default provider for the tenant.
   * @return isDefault
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(@javax.annotation.Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiProviderDto aiProviderDto = (AiProviderDto) o;
    return Objects.equals(this.id, aiProviderDto.id) &&
        Objects.equals(this.title, aiProviderDto.title) &&
        Objects.equals(this.type, aiProviderDto.type) &&
        equalsNullable(this.url, aiProviderDto.url) &&
        Objects.equals(this.createdOn, aiProviderDto.createdOn) &&
        Objects.equals(this.modifiedOn, aiProviderDto.modifiedOn) &&
        Objects.equals(this.needReset, aiProviderDto.needReset) &&
        Objects.equals(this.isDefault, aiProviderDto.isDefault);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, type, hashCodeNullable(url), createdOn, modifiedOn, needReset, isDefault);
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
    sb.append("class AiProviderDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    needReset: ").append(toIndentedString(needReset)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      joiner.add(getCreatedOn().toUrlQueryString(prefix + "createdOn" + suffix));
    }

    // add `modifiedOn` to the URL query string
    if (getModifiedOn() != null) {
      joiner.add(getModifiedOn().toUrlQueryString(prefix + "modifiedOn" + suffix));
    }

    // add `needReset` to the URL query string
    if (getNeedReset() != null) {
      try {
        joiner.add(String.format("%sneedReset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNeedReset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isDefault` to the URL query string
    if (getIsDefault() != null) {
      try {
        joiner.add(String.format("%sisDefault%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDefault()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

