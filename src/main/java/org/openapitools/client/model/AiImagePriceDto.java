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
 * What an image model charges: the tokens of the request and the images that come out of it.
 */
@JsonPropertyOrder({
  AiImagePriceDto.JSON_PROPERTY_PROMPT,
  AiImagePriceDto.JSON_PROPERTY_COMPLETION,
  AiImagePriceDto.JSON_PROPERTY_IMAGE
})

public class AiImagePriceDto {
  public static final String JSON_PROPERTY_PROMPT = "prompt";
  @javax.annotation.Nullable  private Double prompt;

  public static final String JSON_PROPERTY_COMPLETION = "completion";
  @javax.annotation.Nullable  private Double completion;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable  private Double image;

  public AiImagePriceDto() {
  }


  public AiImagePriceDto prompt(@javax.annotation.Nullable Double prompt) {
    
    this.prompt = prompt;
    return this;
  }

  /**
   * The cost of one million tokens sent to the image model, which is the prompt describing the picture.
   * @return prompt
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrompt() {
    return prompt;
  }


  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrompt(@javax.annotation.Nullable Double prompt) {
    this.prompt = prompt;
  }

  public AiImagePriceDto completion(@javax.annotation.Nullable Double completion) {
    
    this.completion = completion;
    return this;
  }

  /**
   * The cost of one million tokens the image model writes back alongside the picture.
   * @return completion
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COMPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCompletion() {
    return completion;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletion(@javax.annotation.Nullable Double completion) {
    this.completion = completion;
  }

  public AiImagePriceDto image(@javax.annotation.Nullable Double image) {
    
    this.image = image;
    return this;
  }

  /**
   * The cost of one produced image, charged on top of the token amounts above.
   * @return image
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImage() {
    return image;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(@javax.annotation.Nullable Double image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiImagePriceDto aiImagePriceDto = (AiImagePriceDto) o;
    return Objects.equals(this.prompt, aiImagePriceDto.prompt) &&
        Objects.equals(this.completion, aiImagePriceDto.completion) &&
        Objects.equals(this.image, aiImagePriceDto.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, completion, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiImagePriceDto {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

    // add `prompt` to the URL query string
    if (getPrompt() != null) {
      try {
        joiner.add(String.format("%sprompt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrompt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completion` to the URL query string
    if (getCompletion() != null) {
      try {
        joiner.add(String.format("%scompletion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      try {
        joiner.add(String.format("%simage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

