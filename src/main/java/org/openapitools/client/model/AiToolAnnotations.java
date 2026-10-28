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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MCP tool annotations (`Tool.annotations` in the protocol). All hints are advisory and optional; the protocol's defaults are `readOnlyHint: false` and `destructiveHint: true`, which is why an unannotated tool is treated as one that may destroy state.
 */
@JsonPropertyOrder({
  AiToolAnnotations.JSON_PROPERTY_TITLE,
  AiToolAnnotations.JSON_PROPERTY_READ_ONLY_HINT,
  AiToolAnnotations.JSON_PROPERTY_DESTRUCTIVE_HINT,
  AiToolAnnotations.JSON_PROPERTY_IDEMPOTENT_HINT,
  AiToolAnnotations.JSON_PROPERTY_OPEN_WORLD_HINT
})

public class AiToolAnnotations {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_READ_ONLY_HINT = "readOnlyHint";
  @javax.annotation.Nullable  private Boolean readOnlyHint;

  public static final String JSON_PROPERTY_DESTRUCTIVE_HINT = "destructiveHint";
  @javax.annotation.Nullable  private Boolean destructiveHint;

  public static final String JSON_PROPERTY_IDEMPOTENT_HINT = "idempotentHint";
  @javax.annotation.Nullable  private Boolean idempotentHint;

  public static final String JSON_PROPERTY_OPEN_WORLD_HINT = "openWorldHint";
  @javax.annotation.Nullable  private Boolean openWorldHint;

  public AiToolAnnotations() {
  }


  public AiToolAnnotations title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public AiToolAnnotations readOnlyHint(@javax.annotation.Nullable Boolean readOnlyHint) {
    
    this.readOnlyHint = readOnlyHint;
    return this;
  }

  /**
   * Get readOnlyHint
   * @return readOnlyHint
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_READ_ONLY_HINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReadOnlyHint() {
    return readOnlyHint;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_ONLY_HINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnlyHint(@javax.annotation.Nullable Boolean readOnlyHint) {
    this.readOnlyHint = readOnlyHint;
  }

  public AiToolAnnotations destructiveHint(@javax.annotation.Nullable Boolean destructiveHint) {
    
    this.destructiveHint = destructiveHint;
    return this;
  }

  /**
   * Get destructiveHint
   * @return destructiveHint
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DESTRUCTIVE_HINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDestructiveHint() {
    return destructiveHint;
  }


  @JsonProperty(value = JSON_PROPERTY_DESTRUCTIVE_HINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestructiveHint(@javax.annotation.Nullable Boolean destructiveHint) {
    this.destructiveHint = destructiveHint;
  }

  public AiToolAnnotations idempotentHint(@javax.annotation.Nullable Boolean idempotentHint) {
    
    this.idempotentHint = idempotentHint;
    return this;
  }

  /**
   * Get idempotentHint
   * @return idempotentHint
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IDEMPOTENT_HINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIdempotentHint() {
    return idempotentHint;
  }


  @JsonProperty(value = JSON_PROPERTY_IDEMPOTENT_HINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdempotentHint(@javax.annotation.Nullable Boolean idempotentHint) {
    this.idempotentHint = idempotentHint;
  }

  public AiToolAnnotations openWorldHint(@javax.annotation.Nullable Boolean openWorldHint) {
    
    this.openWorldHint = openWorldHint;
    return this;
  }

  /**
   * Get openWorldHint
   * @return openWorldHint
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OPEN_WORLD_HINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOpenWorldHint() {
    return openWorldHint;
  }


  @JsonProperty(value = JSON_PROPERTY_OPEN_WORLD_HINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenWorldHint(@javax.annotation.Nullable Boolean openWorldHint) {
    this.openWorldHint = openWorldHint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiToolAnnotations aiToolAnnotations = (AiToolAnnotations) o;
    return Objects.equals(this.title, aiToolAnnotations.title) &&
        Objects.equals(this.readOnlyHint, aiToolAnnotations.readOnlyHint) &&
        Objects.equals(this.destructiveHint, aiToolAnnotations.destructiveHint) &&
        Objects.equals(this.idempotentHint, aiToolAnnotations.idempotentHint) &&
        Objects.equals(this.openWorldHint, aiToolAnnotations.openWorldHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, readOnlyHint, destructiveHint, idempotentHint, openWorldHint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiToolAnnotations {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    readOnlyHint: ").append(toIndentedString(readOnlyHint)).append("\n");
    sb.append("    destructiveHint: ").append(toIndentedString(destructiveHint)).append("\n");
    sb.append("    idempotentHint: ").append(toIndentedString(idempotentHint)).append("\n");
    sb.append("    openWorldHint: ").append(toIndentedString(openWorldHint)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `readOnlyHint` to the URL query string
    if (getReadOnlyHint() != null) {
      try {
        joiner.add(String.format("%sreadOnlyHint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReadOnlyHint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `destructiveHint` to the URL query string
    if (getDestructiveHint() != null) {
      try {
        joiner.add(String.format("%sdestructiveHint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestructiveHint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `idempotentHint` to the URL query string
    if (getIdempotentHint() != null) {
      try {
        joiner.add(String.format("%sidempotentHint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdempotentHint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `openWorldHint` to the URL query string
    if (getOpenWorldHint() != null) {
      try {
        joiner.add(String.format("%sopenWorldHint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpenWorldHint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

