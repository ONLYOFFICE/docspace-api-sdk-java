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
import org.openapitools.client.model.AiMetaGenerateRequestId;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiMetaGenerateRequest
 */
@JsonPropertyOrder({
  AiMetaGenerateRequest.JSON_PROPERTY_KIND,
  AiMetaGenerateRequest.JSON_PROPERTY_ID,
  AiMetaGenerateRequest.JSON_PROPERTY_PROMPT
})

public class AiMetaGenerateRequest {
  /**
   * The entry&#39;s table. Only &#x60;file&#x60; for now: a folder or a room answers 400.
   */
  public enum KindEnum {
    FILE(String.valueOf("file"));

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_KIND = "kind";
  @javax.annotation.Nonnull  private KindEnum kind;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private AiMetaGenerateRequestId id;

  public static final String JSON_PROPERTY_PROMPT = "prompt";
  @javax.annotation.Nullable  private String prompt;

  public AiMetaGenerateRequest() {
  }


  public AiMetaGenerateRequest kind(@javax.annotation.Nonnull KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

  /**
   * The entry's table. Only `file` for now: a folder or a room answers 400.
   * @return kind
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_KIND, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KindEnum getKind() {
    return kind;
  }


  @JsonProperty(value = JSON_PROPERTY_KIND, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKind(@javax.annotation.Nonnull KindEnum kind) {
    this.kind = kind;
  }

  public AiMetaGenerateRequest id(@javax.annotation.Nonnull AiMetaGenerateRequestId id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiMetaGenerateRequestId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull AiMetaGenerateRequestId id) {
    this.id = id;
  }

  public AiMetaGenerateRequest prompt(@javax.annotation.Nullable String prompt) {
    
    this.prompt = prompt;
    return this;
  }

  /**
   * What kind of metadata fields the caller is interested in; a hint for the model.
   * @return prompt
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrompt() {
    return prompt;
  }


  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrompt(@javax.annotation.Nullable String prompt) {
    this.prompt = prompt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMetaGenerateRequest aiMetaGenerateRequest = (AiMetaGenerateRequest) o;
    return Objects.equals(this.kind, aiMetaGenerateRequest.kind) &&
        Objects.equals(this.id, aiMetaGenerateRequest.id) &&
        Objects.equals(this.prompt, aiMetaGenerateRequest.prompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, prompt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMetaGenerateRequest {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
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

    // add `kind` to the URL query string
    if (getKind() != null) {
      try {
        joiner.add(String.format("%skind%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKind()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `prompt` to the URL query string
    if (getPrompt() != null) {
      try {
        joiner.add(String.format("%sprompt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrompt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

