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
import org.openapitools.client.model.AiTErrorData;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Per-entry error reported by  {@link  PromptsEngine.importBundle } .
 */
@JsonPropertyOrder({
  AiImportError.JSON_PROPERTY_KIND,
  AiImportError.JSON_PROPERTY_REF,
  AiImportError.JSON_PROPERTY_ERROR
})

public class AiImportError {
  /**
   * &#x60;folder&#x60; or &#x60;prompt&#x60;, plus the offending name or id.
   */
  public enum KindEnum {
    FOLDER(String.valueOf("folder")),
    
    PROMPT(String.valueOf("prompt"));

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

  public static final String JSON_PROPERTY_REF = "ref";
  @javax.annotation.Nonnull  private String ref;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nonnull  private AiTErrorData error;

  public AiImportError() {
  }


  public AiImportError kind(@javax.annotation.Nonnull KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

  /**
   * `folder` or `prompt`, plus the offending name or id.
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

  public AiImportError ref(@javax.annotation.Nonnull String ref) {
    
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_REF, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRef() {
    return ref;
  }


  @JsonProperty(value = JSON_PROPERTY_REF, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRef(@javax.annotation.Nonnull String ref) {
    this.ref = ref;
  }

  public AiImportError error(@javax.annotation.Nonnull AiTErrorData error) {
    
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ERROR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiTErrorData getError() {
    return error;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(@javax.annotation.Nonnull AiTErrorData error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiImportError aiImportError = (AiImportError) o;
    return Objects.equals(this.kind, aiImportError.kind) &&
        Objects.equals(this.ref, aiImportError.ref) &&
        Objects.equals(this.error, aiImportError.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, ref, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiImportError {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

    // add `ref` to the URL query string
    if (getRef() != null) {
      try {
        joiner.add(String.format("%sref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRef()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(getError().toUrlQueryString(prefix + "error" + suffix));
    }

    return joiner.toString();
  }

}

