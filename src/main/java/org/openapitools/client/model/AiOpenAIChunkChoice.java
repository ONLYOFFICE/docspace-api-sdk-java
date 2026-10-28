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
import org.openapitools.client.model.AiOpenAIChoiceDelta;
import org.openapitools.client.model.AiOpenAIFinishReason;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * One choice of a streaming completion, carrying the part this chunk adds.
 */
@JsonPropertyOrder({
  AiOpenAIChunkChoice.JSON_PROPERTY_INDEX,
  AiOpenAIChunkChoice.JSON_PROPERTY_DELTA,
  AiOpenAIChunkChoice.JSON_PROPERTY_FINISH_REASON
})

public class AiOpenAIChunkChoice {
  public static final String JSON_PROPERTY_INDEX = "index";
  @javax.annotation.Nonnull  private BigDecimal index;

  public static final String JSON_PROPERTY_DELTA = "delta";
  @javax.annotation.Nonnull  private AiOpenAIChoiceDelta delta;

  public static final String JSON_PROPERTY_FINISH_REASON = "finish_reason";
  @javax.annotation.Nullable  private AiOpenAIFinishReason finishReason;

  public AiOpenAIChunkChoice() {
  }


  public AiOpenAIChunkChoice index(@javax.annotation.Nonnull BigDecimal index) {
    
    this.index = index;
    return this;
  }

  /**
   * The zero-based position of the choice. This service emits a single choice, so always 0.
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

  public AiOpenAIChunkChoice delta(@javax.annotation.Nonnull AiOpenAIChoiceDelta delta) {
    
    this.delta = delta;
    return this;
  }

  /**
   * What this chunk adds to the choice.
   * @return delta
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DELTA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiOpenAIChoiceDelta getDelta() {
    return delta;
  }


  @JsonProperty(value = JSON_PROPERTY_DELTA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelta(@javax.annotation.Nonnull AiOpenAIChoiceDelta delta) {
    this.delta = delta;
  }

  public AiOpenAIChunkChoice finishReason(@javax.annotation.Nullable AiOpenAIFinishReason finishReason) {
    
    this.finishReason = finishReason;
    return this;
  }

  /**
   * Why the completion stopped, or null while it is still streaming.
   * @return finishReason
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FINISH_REASON, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiOpenAIFinishReason getFinishReason() {
    return finishReason;
  }


  @JsonProperty(value = JSON_PROPERTY_FINISH_REASON, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFinishReason(@javax.annotation.Nullable AiOpenAIFinishReason finishReason) {
    this.finishReason = finishReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiOpenAIChunkChoice aiOpenAIChunkChoice = (AiOpenAIChunkChoice) o;
    return Objects.equals(this.index, aiOpenAIChunkChoice.index) &&
        Objects.equals(this.delta, aiOpenAIChunkChoice.delta) &&
        Objects.equals(this.finishReason, aiOpenAIChunkChoice.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, delta, finishReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiOpenAIChunkChoice {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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

    // add `delta` to the URL query string
    if (getDelta() != null) {
      joiner.add(getDelta().toUrlQueryString(prefix + "delta" + suffix));
    }

    // add `finish_reason` to the URL query string
    if (getFinishReason() != null) {
      try {
        joiner.add(String.format("%sfinish_reason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFinishReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

