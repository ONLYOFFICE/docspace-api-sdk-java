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
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Folder for organizing saved prompts.
 */
@JsonPropertyOrder({
  AiPromptFolder.JSON_PROPERTY_ID,
  AiPromptFolder.JSON_PROPERTY_NAME,
  AiPromptFolder.JSON_PROPERTY_CREATED_AT,
  AiPromptFolder.JSON_PROPERTY_UPDATED_AT
})

public class AiPromptFolder {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  @javax.annotation.Nonnull  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  @javax.annotation.Nonnull  private BigDecimal updatedAt;

  public AiPromptFolder() {
  }


  public AiPromptFolder id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Unique folder identifier (UUID).
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }

  public AiPromptFolder name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Folder display name.
   * @return name
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public AiPromptFolder createdAt(@javax.annotation.Nonnull BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp (ms since epoch) when the folder was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@javax.annotation.Nonnull BigDecimal createdAt) {
    this.createdAt = createdAt;
  }

  public AiPromptFolder updatedAt(@javax.annotation.Nonnull BigDecimal updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp (ms since epoch) of the last folder modification.
   * @return updatedAt
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_UPDATED_AT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED_AT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(@javax.annotation.Nonnull BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPromptFolder aiPromptFolder = (AiPromptFolder) o;
    return Objects.equals(this.id, aiPromptFolder.id) &&
        Objects.equals(this.name, aiPromptFolder.name) &&
        Objects.equals(this.createdAt, aiPromptFolder.createdAt) &&
        Objects.equals(this.updatedAt, aiPromptFolder.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptFolder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      try {
        joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

