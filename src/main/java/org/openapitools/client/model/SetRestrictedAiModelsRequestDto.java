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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for setting restricted AI models.
 */
@JsonPropertyOrder({
  SetRestrictedAiModelsRequestDto.JSON_PROPERTY_MODELS
})

public class SetRestrictedAiModelsRequestDto {
  public static final String JSON_PROPERTY_MODELS = "models";
  @javax.annotation.Nonnull  private Set<String> models = new LinkedHashSet<>();

  public SetRestrictedAiModelsRequestDto() {
  }


  public SetRestrictedAiModelsRequestDto models(@javax.annotation.Nonnull Set<String> models) {
    
    this.models = models;
    return this;
  }

  public SetRestrictedAiModelsRequestDto addModelsItem(String modelsItem) {
    if (this.models == null) {
      this.models = new LinkedHashSet<>();
    }
    this.models.add(modelsItem);
    return this;
  }

  /**
   * The set of restricted AI model IDs.
   * @return models
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MODELS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getModels() {
    return models;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_MODELS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModels(@javax.annotation.Nonnull Set<String> models) {
    this.models = models;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRestrictedAiModelsRequestDto setRestrictedAiModelsRequestDto = (SetRestrictedAiModelsRequestDto) o;
    return Objects.equals(this.models, setRestrictedAiModelsRequestDto.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRestrictedAiModelsRequestDto {\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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

    // add `models` to the URL query string
    if (getModels() != null) {
      int i = 0;
      for (String _item : getModels()) {
        try {
          joiner.add(String.format("%smodels%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    return joiner.toString();
  }

}

