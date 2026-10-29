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
 * AiMetaGenerate200ResponseSkippedInner
 */
@JsonPropertyOrder({
  AiMetaGenerate200ResponseSkippedInner.JSON_PROPERTY_ID,
  AiMetaGenerate200ResponseSkippedInner.JSON_PROPERTY_TITLE,
  AiMetaGenerate200ResponseSkippedInner.JSON_PROPERTY_REASON
})
@JsonTypeName("aiMetaGenerate_200_response_skipped_inner")

public class AiMetaGenerate200ResponseSkippedInner {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  /**
   * Gets or Sets reason
   */
  public enum ReasonEnum {
    UNSUPPORTED(String.valueOf("unsupported")),
    
    LIMIT(String.valueOf("limit")),
    
    FORBIDDEN(String.valueOf("forbidden")),
    
    NOT_FOUND(String.valueOf("not_found")),
    
    EMPTY(String.valueOf("empty")),
    
    FAILED(String.valueOf("failed"));

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_REASON = "reason";
  @javax.annotation.Nonnull  private ReasonEnum reason;

  public AiMetaGenerate200ResponseSkippedInner() {
  }


  public AiMetaGenerate200ResponseSkippedInner id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
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

  public AiMetaGenerate200ResponseSkippedInner title(@javax.annotation.Nullable String title) {
    
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

  public AiMetaGenerate200ResponseSkippedInner reason(@javax.annotation.Nonnull ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_REASON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReasonEnum getReason() {
    return reason;
  }


  @JsonProperty(value = JSON_PROPERTY_REASON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReason(@javax.annotation.Nonnull ReasonEnum reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMetaGenerate200ResponseSkippedInner aiMetaGenerate200ResponseSkippedInner = (AiMetaGenerate200ResponseSkippedInner) o;
    return Objects.equals(this.id, aiMetaGenerate200ResponseSkippedInner.id) &&
        Objects.equals(this.title, aiMetaGenerate200ResponseSkippedInner.title) &&
        Objects.equals(this.reason, aiMetaGenerate200ResponseSkippedInner.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMetaGenerate200ResponseSkippedInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

    // add `reason` to the URL query string
    if (getReason() != null) {
      try {
        joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

