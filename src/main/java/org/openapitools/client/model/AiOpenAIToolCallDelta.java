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
import java.math.BigDecimal;
import org.openapitools.client.model.AiOpenAIToolCallDeltaFunction;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The incremental part of one tool call the model requested.
 */
@JsonPropertyOrder({
  AiOpenAIToolCallDelta.JSON_PROPERTY_INDEX,
  AiOpenAIToolCallDelta.JSON_PROPERTY_ID,
  AiOpenAIToolCallDelta.JSON_PROPERTY_TYPE,
  AiOpenAIToolCallDelta.JSON_PROPERTY_FUNCTION
})

public class AiOpenAIToolCallDelta {
  public static final String JSON_PROPERTY_INDEX = "index";
  @javax.annotation.Nonnull  private BigDecimal index;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private String id;

  /**
   * Always &#x60;function&#x60; - the only tool kind the API defines.
   */
  public enum TypeEnum {
    FUNCTION(String.valueOf("function"));

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private TypeEnum type;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  @javax.annotation.Nullable  private AiOpenAIToolCallDeltaFunction function;

  public AiOpenAIToolCallDelta() {
  }


  public AiOpenAIToolCallDelta index(@javax.annotation.Nonnull BigDecimal index) {
    
    this.index = index;
    return this;
  }

  /**
   * The zero-based position of the tool call within the message.
   * @return index
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_INDEX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getIndex() {
    return index;
  }


  @JsonProperty(value = JSON_PROPERTY_INDEX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(@javax.annotation.Nonnull BigDecimal index) {
    this.index = index;
  }

  public AiOpenAIToolCallDelta id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The tool call identifier, quoted back when its result is submitted.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public AiOpenAIToolCallDelta type(@javax.annotation.Nullable TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * Always `function` - the only tool kind the API defines.
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }

  public AiOpenAIToolCallDelta function(@javax.annotation.Nullable AiOpenAIToolCallDeltaFunction function) {
    
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FUNCTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiOpenAIToolCallDeltaFunction getFunction() {
    return function;
  }


  @JsonProperty(value = JSON_PROPERTY_FUNCTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(@javax.annotation.Nullable AiOpenAIToolCallDeltaFunction function) {
    this.function = function;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiOpenAIToolCallDelta aiOpenAIToolCallDelta = (AiOpenAIToolCallDelta) o;
    return Objects.equals(this.index, aiOpenAIToolCallDelta.index) &&
        Objects.equals(this.id, aiOpenAIToolCallDelta.id) &&
        Objects.equals(this.type, aiOpenAIToolCallDelta.type) &&
        Objects.equals(this.function, aiOpenAIToolCallDelta.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiOpenAIToolCallDelta {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

    // add `index` to the URL query string
    if (getIndex() != null) {
      try {
        joiner.add(String.format("%sindex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `function` to the URL query string
    if (getFunction() != null) {
      joiner.add(getFunction().toUrlQueryString(prefix + "function" + suffix));
    }

    return joiner.toString();
  }

}

