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
 * AiMetaGenerate402Response
 */
@JsonPropertyOrder({
  AiMetaGenerate402Response.JSON_PROPERTY_ERROR,
  AiMetaGenerate402Response.JSON_PROPERTY_CODE,
  AiMetaGenerate402Response.JSON_PROPERTY_PROVIDER_MESSAGE
})
@JsonTypeName("aiMetaGenerate_402_response")

public class AiMetaGenerate402Response {
  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nonnull  private String error;

  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nonnull  private String code;

  public static final String JSON_PROPERTY_PROVIDER_MESSAGE = "providerMessage";
  @javax.annotation.Nullable  private String providerMessage;

  public AiMetaGenerate402Response() {
  }


  public AiMetaGenerate402Response error(@javax.annotation.Nonnull String error) {
    
    this.error = error;
    return this;
  }

  /**
   * Short reason, ready to be shown to the caller.
   * @return error
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ERROR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getError() {
    return error;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(@javax.annotation.Nonnull String error) {
    this.error = error;
  }

  public AiMetaGenerate402Response code(@javax.annotation.Nonnull String code) {
    
    this.code = code;
    return this;
  }

  /**
   * Stable classification of the failure: `rate_limit`, `insufficient_funds`, `auth`, `model_not_found`, `timeout`, `network`, `bad_request`, `server`, `unknown`, or a provider-specific code relayed as it came.
   * @return code
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(@javax.annotation.Nonnull String code) {
    this.code = code;
  }

  public AiMetaGenerate402Response providerMessage(@javax.annotation.Nullable String providerMessage) {
    
    this.providerMessage = providerMessage;
    return this;
  }

  /**
   * The provider's own error message, cut to 500 characters. Absent when the failure never reached the provider, or was a timeout.
   * @return providerMessage
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderMessage() {
    return providerMessage;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderMessage(@javax.annotation.Nullable String providerMessage) {
    this.providerMessage = providerMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMetaGenerate402Response aiMetaGenerate402Response = (AiMetaGenerate402Response) o;
    return Objects.equals(this.error, aiMetaGenerate402Response.error) &&
        Objects.equals(this.code, aiMetaGenerate402Response.code) &&
        Objects.equals(this.providerMessage, aiMetaGenerate402Response.providerMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, code, providerMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMetaGenerate402Response {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    providerMessage: ").append(toIndentedString(providerMessage)).append("\n");
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

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `providerMessage` to the URL query string
    if (getProviderMessage() != null) {
      try {
        joiner.add(String.format("%sproviderMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

