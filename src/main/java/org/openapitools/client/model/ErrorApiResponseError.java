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
 * What went wrong.
 */
@JsonPropertyOrder({
  ErrorApiResponseError.JSON_PROPERTY_MESSAGE,
  ErrorApiResponseError.JSON_PROPERTY_TYPE,
  ErrorApiResponseError.JSON_PROPERTY_STACK,
  ErrorApiResponseError.JSON_PROPERTY_HRESULT
})
@JsonTypeName("ErrorApiResponse_error")

public class ErrorApiResponseError {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable  private String message;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private String type;

  public static final String JSON_PROPERTY_STACK = "stack";
  @javax.annotation.Nullable  private String stack;

  public static final String JSON_PROPERTY_HRESULT = "hresult";
  @javax.annotation.Nullable  private Integer hresult;

  public ErrorApiResponseError() {
  }


  public ErrorApiResponseError message(@javax.annotation.Nullable String message) {
    
    this.message = message;
    return this;
  }

  /**
   * The human-readable error message.
   * @return message
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }

  public ErrorApiResponseError type(@javax.annotation.Nullable String type) {
    
    this.type = type;
    return this;
  }

  /**
   * The .NET type of the underlying exception. Only sent when stack traces are enabled.
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }

  public ErrorApiResponseError stack(@javax.annotation.Nullable String stack) {
    
    this.stack = stack;
    return this;
  }

  /**
   * The stack trace of the underlying exception. Only sent when stack traces are enabled.
   * @return stack
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STACK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStack() {
    return stack;
  }


  @JsonProperty(value = JSON_PROPERTY_STACK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStack(@javax.annotation.Nullable String stack) {
    this.stack = stack;
  }

  public ErrorApiResponseError hresult(@javax.annotation.Nullable Integer hresult) {
    
    this.hresult = hresult;
    return this;
  }

  /**
   * The HRESULT of the underlying exception. Only sent when stack traces are enabled.
   * @return hresult
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HRESULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHresult() {
    return hresult;
  }


  @JsonProperty(value = JSON_PROPERTY_HRESULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHresult(@javax.annotation.Nullable Integer hresult) {
    this.hresult = hresult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorApiResponseError errorApiResponseError = (ErrorApiResponseError) o;
    return Objects.equals(this.message, errorApiResponseError.message) &&
        Objects.equals(this.type, errorApiResponseError.type) &&
        Objects.equals(this.stack, errorApiResponseError.stack) &&
        Objects.equals(this.hresult, errorApiResponseError.hresult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, type, stack, hresult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorApiResponseError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
    sb.append("    hresult: ").append(toIndentedString(hresult)).append("\n");
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

    // add `stack` to the URL query string
    if (getStack() != null) {
      try {
        joiner.add(String.format("%sstack%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStack()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hresult` to the URL query string
    if (getHresult() != null) {
      try {
        joiner.add(String.format("%shresult%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHresult()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

