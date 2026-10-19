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
import org.openapitools.client.model.ColorThemeColorsRequestDto;
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
 * A colour theme to store.
 */
@JsonPropertyOrder({
  CustomColorThemeRequestDto.JSON_PROPERTY_ID,
  CustomColorThemeRequestDto.JSON_PROPERTY_NAME,
  CustomColorThemeRequestDto.JSON_PROPERTY_MAIN,
  CustomColorThemeRequestDto.JSON_PROPERTY_TEXT
})

public class CustomColorThemeRequestDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAIN = "main";
  @javax.annotation.Nullable  private ColorThemeColorsRequestDto main;

  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nullable  private ColorThemeColorsRequestDto text;

  public CustomColorThemeRequestDto() {
  }


  public CustomColorThemeRequestDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The id of the custom theme to replace, or an id no stored theme has to add a new one.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public CustomColorThemeRequestDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * Accepted for compatibility with earlier clients and not read: a custom theme is always stored without a name.
   * @return name
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public CustomColorThemeRequestDto main(@javax.annotation.Nullable ColorThemeColorsRequestDto main) {
    
    this.main = main;
    return this;
  }

  /**
   * The accent and button colours of the interface. Left out, a stored theme keeps its own.
   * @return main
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MAIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ColorThemeColorsRequestDto getMain() {
    return main;
  }


  @JsonProperty(value = JSON_PROPERTY_MAIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMain(@javax.annotation.Nullable ColorThemeColorsRequestDto main) {
    this.main = main;
  }

  public CustomColorThemeRequestDto text(@javax.annotation.Nullable ColorThemeColorsRequestDto text) {
    
    this.text = text;
    return this;
  }

  /**
   * The colours of the text shown on the accent and on the buttons. Left out, a stored theme keeps its own.
   * @return text
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ColorThemeColorsRequestDto getText() {
    return text;
  }


  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(@javax.annotation.Nullable ColorThemeColorsRequestDto text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomColorThemeRequestDto customColorThemeRequestDto = (CustomColorThemeRequestDto) o;
    return Objects.equals(this.id, customColorThemeRequestDto.id) &&
        equalsNullable(this.name, customColorThemeRequestDto.name) &&
        Objects.equals(this.main, customColorThemeRequestDto.main) &&
        Objects.equals(this.text, customColorThemeRequestDto.text);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), main, text);
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
    sb.append("class CustomColorThemeRequestDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `main` to the URL query string
    if (getMain() != null) {
      joiner.add(getMain().toUrlQueryString(prefix + "main" + suffix));
    }

    // add `text` to the URL query string
    if (getText() != null) {
      joiner.add(getText().toUrlQueryString(prefix + "text" + suffix));
    }

    return joiner.toString();
  }

}

