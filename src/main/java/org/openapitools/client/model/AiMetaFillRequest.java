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
 * AiMetaFillRequest
 */
@JsonPropertyOrder({
  AiMetaFillRequest.JSON_PROPERTY_KIND,
  AiMetaFillRequest.JSON_PROPERTY_ID,
  AiMetaFillRequest.JSON_PROPERTY_PROMPT,
  AiMetaFillRequest.JSON_PROPERTY_OVERWRITE,
  AiMetaFillRequest.JSON_PROPERTY_DRY_RUN
})

public class AiMetaFillRequest {
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

  public static final String JSON_PROPERTY_OVERWRITE = "overwrite";
  @javax.annotation.Nullable  private Boolean overwrite;

  public static final String JSON_PROPERTY_DRY_RUN = "dryRun";
  @javax.annotation.Nullable  private Boolean dryRun;

  public AiMetaFillRequest() {
  }


  public AiMetaFillRequest kind(@javax.annotation.Nonnull KindEnum kind) {
    
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

  public AiMetaFillRequest id(@javax.annotation.Nonnull AiMetaGenerateRequestId id) {
    
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

  public AiMetaFillRequest prompt(@javax.annotation.Nullable String prompt) {
    
    this.prompt = prompt;
    return this;
  }

  /**
   * What to pay attention to; a hint for the model.
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

  public AiMetaFillRequest overwrite(@javax.annotation.Nullable Boolean overwrite) {
    
    this.overwrite = overwrite;
    return this;
  }

  /**
   * Also replace the fields that already carry a value. Default false.
   * @return overwrite
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OVERWRITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverwrite() {
    return overwrite;
  }


  @JsonProperty(value = JSON_PROPERTY_OVERWRITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverwrite(@javax.annotation.Nullable Boolean overwrite) {
    this.overwrite = overwrite;
  }

  public AiMetaFillRequest dryRun(@javax.annotation.Nullable Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Resolve the values but write nothing; the caller writes what the user confirms. Default true: a write needs an explicit false.
   * @return dryRun
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DRY_RUN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDryRun() {
    return dryRun;
  }


  @JsonProperty(value = JSON_PROPERTY_DRY_RUN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDryRun(@javax.annotation.Nullable Boolean dryRun) {
    this.dryRun = dryRun;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMetaFillRequest aiMetaFillRequest = (AiMetaFillRequest) o;
    return Objects.equals(this.kind, aiMetaFillRequest.kind) &&
        Objects.equals(this.id, aiMetaFillRequest.id) &&
        Objects.equals(this.prompt, aiMetaFillRequest.prompt) &&
        Objects.equals(this.overwrite, aiMetaFillRequest.overwrite) &&
        Objects.equals(this.dryRun, aiMetaFillRequest.dryRun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, prompt, overwrite, dryRun);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMetaFillRequest {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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

    // add `overwrite` to the URL query string
    if (getOverwrite() != null) {
      try {
        joiner.add(String.format("%soverwrite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOverwrite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dryRun` to the URL query string
    if (getDryRun() != null) {
      try {
        joiner.add(String.format("%sdryRun%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDryRun()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

