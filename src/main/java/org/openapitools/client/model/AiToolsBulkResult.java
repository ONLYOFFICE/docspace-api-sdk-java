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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiToolsBulkResultErrorsInner;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Outcome of `ToolsEngine.replaceAllCustomServers` — either every entry persisted, or no entries persisted plus a per-key error report.
 */
@JsonPropertyOrder({
  AiToolsBulkResult.JSON_PROPERTY_SUCCESS,
  AiToolsBulkResult.JSON_PROPERTY_ERRORS
})

public class AiToolsBulkResult {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  @javax.annotation.Nonnull  private Boolean success;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  @javax.annotation.Nullable  private List<AiToolsBulkResultErrorsInner> errors = new ArrayList<>();

  public AiToolsBulkResult() {
  }


  public AiToolsBulkResult success(@javax.annotation.Nonnull Boolean success) {
    
    this.success = success;
    return this;
  }

  /**
   * True when every custom MCP server was persisted.
   * @return success
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SUCCESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(value = JSON_PROPERTY_SUCCESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(@javax.annotation.Nonnull Boolean success) {
    this.success = success;
  }

  public AiToolsBulkResult errors(@javax.annotation.Nullable List<AiToolsBulkResultErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public AiToolsBulkResult addErrorsItem(AiToolsBulkResultErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * What was rejected, per server. Present on failure - and then no server was persisted.
   * @return errors
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AiToolsBulkResultErrorsInner> getErrors() {
    return errors;
  }


  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(@javax.annotation.Nullable List<AiToolsBulkResultErrorsInner> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiToolsBulkResult aiToolsBulkResult = (AiToolsBulkResult) o;
    return Objects.equals(this.success, aiToolsBulkResult.success) &&
        Objects.equals(this.errors, aiToolsBulkResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiToolsBulkResult {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

    // add `success` to the URL query string
    if (getSuccess() != null) {
      try {
        joiner.add(String.format("%ssuccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `errors` to the URL query string
    if (getErrors() != null) {
      for (int i = 0; i < getErrors().size(); i++) {
        if (getErrors().get(i) != null) {
          joiner.add(getErrors().get(i).toUrlQueryString(String.format("%serrors%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

