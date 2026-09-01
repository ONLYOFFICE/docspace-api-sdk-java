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
import org.openapitools.client.model.AiPromptBundle;
import org.openapitools.client.model.AiPromptsImportBundleRequestOptions;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiPromptsImportBundleRequest
 */
@JsonPropertyOrder({
  AiPromptsImportBundleRequest.JSON_PROPERTY_BUNDLE,
  AiPromptsImportBundleRequest.JSON_PROPERTY_OPTIONS
})
@JsonTypeName("aiPromptsImportBundle_request")

public class AiPromptsImportBundleRequest {
  public static final String JSON_PROPERTY_BUNDLE = "bundle";
  @javax.annotation.Nonnull  private AiPromptBundle bundle;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  @javax.annotation.Nullable  private AiPromptsImportBundleRequestOptions options;

  public AiPromptsImportBundleRequest() {
  }


  public AiPromptsImportBundleRequest bundle(@javax.annotation.Nonnull AiPromptBundle bundle) {
    
    this.bundle = bundle;
    return this;
  }

  /**
   * Bundle to restore.
   * @return bundle
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_BUNDLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiPromptBundle getBundle() {
    return bundle;
  }


  @JsonProperty(value = JSON_PROPERTY_BUNDLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBundle(@javax.annotation.Nonnull AiPromptBundle bundle) {
    this.bundle = bundle;
  }

  public AiPromptsImportBundleRequest options(@javax.annotation.Nullable AiPromptsImportBundleRequestOptions options) {
    
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OPTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiPromptsImportBundleRequestOptions getOptions() {
    return options;
  }


  @JsonProperty(value = JSON_PROPERTY_OPTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(@javax.annotation.Nullable AiPromptsImportBundleRequestOptions options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPromptsImportBundleRequest aiPromptsImportBundleRequest = (AiPromptsImportBundleRequest) o;
    return Objects.equals(this.bundle, aiPromptsImportBundleRequest.bundle) &&
        Objects.equals(this.options, aiPromptsImportBundleRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundle, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptsImportBundleRequest {\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

    // add `bundle` to the URL query string
    if (getBundle() != null) {
      joiner.add(getBundle().toUrlQueryString(prefix + "bundle" + suffix));
    }

    // add `options` to the URL query string
    if (getOptions() != null) {
      joiner.add(getOptions().toUrlQueryString(prefix + "options" + suffix));
    }

    return joiner.toString();
  }

}

