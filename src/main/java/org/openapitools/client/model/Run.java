/*
 * (c) Copyright Ascensio System SIA 2025
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
 * The text run parameters.
 */
@JsonPropertyOrder({
  Run.JSON_PROPERTY_FILL,
  Run.JSON_PROPERTY_TEXT,
  Run.JSON_PROPERTY_FONT_SIZE
})

public class Run {
  public static final String JSON_PROPERTY_FILL = "fill";
  @javax.annotation.Nullable
  private JsonNullable<List<Integer>> fill = JsonNullable.<List<Integer>>undefined();

  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nullable
  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FONT_SIZE = "font-size";
  @javax.annotation.Nullable
  private JsonNullable<String> fontSize = JsonNullable.<String>undefined();

  public Run() {
  }

  public Run fill(@javax.annotation.Nullable List<Integer> fill) {
    this.fill = JsonNullable.<List<Integer>>of(fill);
    
    return this;
  }

  public Run addFillItem(Integer fillItem) {
    if (this.fill == null || !this.fill.isPresent()) {
      this.fill = JsonNullable.<List<Integer>>of(new ArrayList<>());
    }
    try {
      this.fill.get().add(fillItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The fill color of the text run in RGB format.
   * @return fill
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<Integer> getFill() {
        return fill.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<Integer>> getFill_JsonNullable() {
    return fill;
  }
  
  @JsonProperty(JSON_PROPERTY_FILL)
  public void setFill_JsonNullable(JsonNullable<List<Integer>> fill) {
    this.fill = fill;
  }

  public void setFill(@javax.annotation.Nullable List<Integer> fill) {
    this.fill = JsonNullable.<List<Integer>>of(fill);
  }

  public Run text(@javax.annotation.Nullable String text) {
    this.text = JsonNullable.<String>of(text);
    
    return this;
  }

  /**
   * The run text.
   * @return text
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getText() {
        return text.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getText_JsonNullable() {
    return text;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT)
  public void setText_JsonNullable(JsonNullable<String> text) {
    this.text = text;
  }

  public void setText(@javax.annotation.Nullable String text) {
    this.text = JsonNullable.<String>of(text);
  }

  public Run fontSize(@javax.annotation.Nullable String fontSize) {
    this.fontSize = JsonNullable.<String>of(fontSize);
    
    return this;
  }

  /**
   * The font size of the text run in points.
   * @return fontSize
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFontSize() {
        return fontSize.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFontSize_JsonNullable() {
    return fontSize;
  }
  
  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  public void setFontSize_JsonNullable(JsonNullable<String> fontSize) {
    this.fontSize = fontSize;
  }

  public void setFontSize(@javax.annotation.Nullable String fontSize) {
    this.fontSize = JsonNullable.<String>of(fontSize);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Run run = (Run) o;
    return equalsNullable(this.fill, run.fill) &&
        equalsNullable(this.text, run.text) &&
        equalsNullable(this.fontSize, run.fontSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fill), hashCodeNullable(text), hashCodeNullable(fontSize));
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
    sb.append("class Run {\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
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

    // add `fill` to the URL query string
    if (getFill() != null) {
      for (int i = 0; i < getFill().size(); i++) {
        try {
          joiner.add(String.format("%sfill%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getFill().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `text` to the URL query string
    if (getText() != null) {
      try {
        joiner.add(String.format("%stext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getText()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `font-size` to the URL query string
    if (getFontSize() != null) {
      try {
        joiner.add(String.format("%sfont-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFontSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

