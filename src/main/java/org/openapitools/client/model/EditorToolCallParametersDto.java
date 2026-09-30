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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The editor tool call parameters.
 */
@JsonPropertyOrder({
  EditorToolCallParametersDto.JSON_PROPERTY_DESCRIPTION,
  EditorToolCallParametersDto.JSON_PROPERTY_TOPIC,
  EditorToolCallParametersDto.JSON_PROPERTY_SLIDE_COUNT,
  EditorToolCallParametersDto.JSON_PROPERTY_STYLE
})

public class EditorToolCallParametersDto {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable  private String description;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  @javax.annotation.Nullable  private JsonNullable<String> topic = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SLIDE_COUNT = "slideCount";
  @javax.annotation.Nullable  private JsonNullable<String> slideCount = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STYLE = "style";
  @javax.annotation.Nullable  private JsonNullable<String> style = JsonNullable.<String>undefined();

  public EditorToolCallParametersDto() {
  }


  public EditorToolCallParametersDto description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * What the generated fillable form should ask for, in the words the request was made in.
   * @return description
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public EditorToolCallParametersDto topic(@javax.annotation.Nullable String topic) {
    this.topic = JsonNullable.<String>of(topic);
    
    return this;
  }

  /**
   * What the generated presentation is about.
   * @return topic
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTopic() {
        return topic.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TOPIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTopic_JsonNullable() {
    return topic;
  }
  
  @JsonProperty(JSON_PROPERTY_TOPIC)
  public void setTopic_JsonNullable(JsonNullable<String> topic) {
    this.topic = topic;
  }

  public void setTopic(@javax.annotation.Nullable String topic) {
    this.topic = JsonNullable.<String>of(topic);
  }

  public EditorToolCallParametersDto slideCount(@javax.annotation.Nullable String slideCount) {
    this.slideCount = JsonNullable.<String>of(slideCount);
    
    return this;
  }

  /**
   * How many slides to generate, as the request spelled it.
   * @return slideCount
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSlideCount() {
        return slideCount.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SLIDE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSlideCount_JsonNullable() {
    return slideCount;
  }
  
  @JsonProperty(JSON_PROPERTY_SLIDE_COUNT)
  public void setSlideCount_JsonNullable(JsonNullable<String> slideCount) {
    this.slideCount = slideCount;
  }

  public void setSlideCount(@javax.annotation.Nullable String slideCount) {
    this.slideCount = JsonNullable.<String>of(slideCount);
  }

  public EditorToolCallParametersDto style(@javax.annotation.Nullable String style) {
    this.style = JsonNullable.<String>of(style);
    
    return this;
  }

  /**
   * The visual style the slides should be generated in.
   * @return style
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getStyle() {
        return style.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_STYLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStyle_JsonNullable() {
    return style;
  }
  
  @JsonProperty(JSON_PROPERTY_STYLE)
  public void setStyle_JsonNullable(JsonNullable<String> style) {
    this.style = style;
  }

  public void setStyle(@javax.annotation.Nullable String style) {
    this.style = JsonNullable.<String>of(style);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditorToolCallParametersDto editorToolCallParametersDto = (EditorToolCallParametersDto) o;
    return Objects.equals(this.description, editorToolCallParametersDto.description) &&
        equalsNullable(this.topic, editorToolCallParametersDto.topic) &&
        equalsNullable(this.slideCount, editorToolCallParametersDto.slideCount) &&
        equalsNullable(this.style, editorToolCallParametersDto.style);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, hashCodeNullable(topic), hashCodeNullable(slideCount), hashCodeNullable(style));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditorToolCallParametersDto {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    slideCount: ").append(toIndentedString(slideCount)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `topic` to the URL query string
    if (getTopic() != null) {
      try {
        joiner.add(String.format("%stopic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTopic()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `slideCount` to the URL query string
    if (getSlideCount() != null) {
      try {
        joiner.add(String.format("%sslideCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSlideCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `style` to the URL query string
    if (getStyle() != null) {
      try {
        joiner.add(String.format("%sstyle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStyle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

