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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Why a field-scoped operation was refused, independent of the wording of &#x60;message&#x60;, so a host can pick an HTTP status without parsing text:  - &#x60;required&#x60; — the field is empty. - &#x60;conflict&#x60; — the value collides with an existing entry. - &#x60;not_found&#x60; — the referenced entry does not exist. - &#x60;invalid&#x60; — the value has the wrong shape or an unsupported value.
 */
public enum AiErrorCode {
  
  REQUIRED("required"),
  
  CONFLICT("conflict"),
  
  NOT_FOUND("not_found"),
  
  INVALID("invalid");

  private String value;

  AiErrorCode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return java.lang.String.valueOf(value);
  }

  @JsonCreator
  public static AiErrorCode fromValue(String value) {
    for (AiErrorCode b : AiErrorCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return java.lang.String.format(java.util.Locale.ROOT, "%s=%s", prefix, this.toString());
  }
}

