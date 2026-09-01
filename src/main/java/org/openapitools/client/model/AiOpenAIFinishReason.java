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
 * OpenAI Chat Completions streaming shapes.   &#x60;toOpenAIChatCompletionStream&#x60; maps the engine&#39;s transport-agnostic &#x60;ChatEvent&#x60; stream onto these chunks so a host can expose an OpenAI-compatible &#x60;POST /v1/chat/completions&#x60; (&#x60;stream: true&#x60;) endpoint backed by the same chat pipeline as the in-app widget. Only the subset of fields the engine can populate is emitted; everything else an OpenAI client tolerates as absent.
 */
public enum AiOpenAIFinishReason {
  
  STOP("stop"),
  
  LENGTH("length"),
  
  TOOL_CALLS("tool_calls"),
  
  CONTENT_FILTER("content_filter");

  private String value;

  AiOpenAIFinishReason(String value) {
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
  public static AiOpenAIFinishReason fromValue(String value) {
    for (AiOpenAIFinishReason b : AiOpenAIFinishReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
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

    return String.format(java.util.Locale.ROOT, "%s=%s", prefix, this.toString());
  }
}

