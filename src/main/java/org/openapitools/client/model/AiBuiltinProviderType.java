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
 * Union of all 17 built-in AI provider type identifiers.  The &#x60;external&#x60; provider has no built-in transport — it delegates every HTTP request to &#x60;PlatformAdapter.externalFetch&#x60; and parses the response with the inner provider selected by &#x60;Profile.basedOn&#x60;.
 */
public enum AiBuiltinProviderType {
  
  ANTHROPIC("anthropic"),
  
  OLLAMA("ollama"),
  
  OPENAI("openai"),
  
  OPENAICOMPATIBLE("openaicompatible"),
  
  TOGETHER("together"),
  
  OPENROUTER("openrouter"),
  
  GENAI("genai"),
  
  DEEPSEEK("deepseek"),
  
  XAI("xai"),
  
  LM_STUDIO("lm-studio"),
  
  MISTRAL("mistral"),
  
  GROQ("groq"),
  
  ZHIPU("zhipu"),
  
  STABILITYAI("stabilityai"),
  
  GPT4ALL("gpt4all"),
  
  ONLYOFFICE("onlyoffice"),
  
  EXTERNAL("external");

  private String value;

  AiBuiltinProviderType(String value) {
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
  public static AiBuiltinProviderType fromValue(String value) {
    for (AiBuiltinProviderType b : AiBuiltinProviderType.values()) {
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

    return String.format(java.util.Locale.ROOT, "%s=%s", prefix, this.toString());
  }
}

