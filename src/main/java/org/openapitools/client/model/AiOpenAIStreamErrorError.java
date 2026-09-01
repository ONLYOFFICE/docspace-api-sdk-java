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
 * The error that ended the stream: its message, type, code and the offending parameter.
 */
@JsonPropertyOrder({
  AiOpenAIStreamErrorError.JSON_PROPERTY_MESSAGE,
  AiOpenAIStreamErrorError.JSON_PROPERTY_TYPE,
  AiOpenAIStreamErrorError.JSON_PROPERTY_CODE,
  AiOpenAIStreamErrorError.JSON_PROPERTY_PARAM
})
@JsonTypeName("AiOpenAIStreamError_error")

public class AiOpenAIStreamErrorError {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nonnull  private String message;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull  private String type;

  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nullable  private String code;

  public static final String JSON_PROPERTY_PARAM = "param";
  @javax.annotation.Nullable  private String param;

  public AiOpenAIStreamErrorError() {
  }


  public AiOpenAIStreamErrorError message(@javax.annotation.Nonnull String message) {
    
    this.message = message;
    return this;
  }

  /**
   * Get message
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

  public AiOpenAIStreamErrorError type(@javax.annotation.Nonnull String type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }

  public AiOpenAIStreamErrorError code(@javax.annotation.Nullable String code) {
    
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(value = JSON_PROPERTY_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(@javax.annotation.Nullable String code) {
    this.code = code;
  }

  public AiOpenAIStreamErrorError param(@javax.annotation.Nullable String param) {
    
    this.param = param;
    return this;
  }

  /**
   * Get param
   * @return param
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PARAM, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParam() {
    return param;
  }


  @JsonProperty(value = JSON_PROPERTY_PARAM, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParam(@javax.annotation.Nullable String param) {
    this.param = param;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiOpenAIStreamErrorError aiOpenAIStreamErrorError = (AiOpenAIStreamErrorError) o;
    return Objects.equals(this.message, aiOpenAIStreamErrorError.message) &&
        Objects.equals(this.type, aiOpenAIStreamErrorError.type) &&
        Objects.equals(this.code, aiOpenAIStreamErrorError.code) &&
        Objects.equals(this.param, aiOpenAIStreamErrorError.param);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, type, code, param);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiOpenAIStreamErrorError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `param` to the URL query string
    if (getParam() != null) {
      try {
        joiner.add(String.format("%sparam%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParam()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

