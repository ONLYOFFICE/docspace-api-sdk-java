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
 * A field-scoped validation error: which form field was rejected, and why.
 */
@JsonPropertyOrder({
  AiTErrorData.JSON_PROPERTY_FIELD,
  AiTErrorData.JSON_PROPERTY_MESSAGE
})

public class AiTErrorData {
  /**
   * The rejected field.
   */
  public enum FieldEnum {
    KEY(String.valueOf("key")),
    
    URL(String.valueOf("url")),
    
    NAME(String.valueOf("name"));

    private String value;

    FieldEnum(String value) {
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
    public static FieldEnum fromValue(String value) {
      for (FieldEnum b : FieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_FIELD = "field";
  @javax.annotation.Nonnull  private FieldEnum field;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nonnull  private String message;

  public AiTErrorData() {
  }


  public AiTErrorData field(@javax.annotation.Nonnull FieldEnum field) {
    
    this.field = field;
    return this;
  }

  /**
   * The rejected field.
   * @return field
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FIELD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FieldEnum getField() {
    return field;
  }


  @JsonProperty(value = JSON_PROPERTY_FIELD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setField(@javax.annotation.Nonnull FieldEnum field) {
    this.field = field;
  }

  public AiTErrorData message(@javax.annotation.Nonnull String message) {
    
    this.message = message;
    return this;
  }

  /**
   * The human-readable reason the field was rejected.
   * @return message
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(@javax.annotation.Nonnull String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiTErrorData aiTErrorData = (AiTErrorData) o;
    return Objects.equals(this.field, aiTErrorData.field) &&
        Objects.equals(this.message, aiTErrorData.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiTErrorData {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

    // add `field` to the URL query string
    if (getField() != null) {
      try {
        joiner.add(String.format("%sfield%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getField()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

