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
 * The custom color theme color parameters.
 */
@JsonPropertyOrder({
  CustomColorThemesSettingsColorItem.JSON_PROPERTY_ACCENT,
  CustomColorThemesSettingsColorItem.JSON_PROPERTY_BUTTONS
})

public class CustomColorThemesSettingsColorItem {
  public static final String JSON_PROPERTY_ACCENT = "accent";
  @javax.annotation.Nullable
  private JsonNullable<String> accent = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUTTONS = "buttons";
  @javax.annotation.Nullable
  private JsonNullable<String> buttons = JsonNullable.<String>undefined();

  public CustomColorThemesSettingsColorItem() {
  }

  public CustomColorThemesSettingsColorItem accent(@javax.annotation.Nullable String accent) {
    this.accent = JsonNullable.<String>of(accent);
    
    return this;
  }

  /**
   * The accent color.
   * @return accent
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAccent() {
        return accent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAccent_JsonNullable() {
    return accent;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCENT)
  public void setAccent_JsonNullable(JsonNullable<String> accent) {
    this.accent = accent;
  }

  public void setAccent(@javax.annotation.Nullable String accent) {
    this.accent = JsonNullable.<String>of(accent);
  }

  public CustomColorThemesSettingsColorItem buttons(@javax.annotation.Nullable String buttons) {
    this.buttons = JsonNullable.<String>of(buttons);
    
    return this;
  }

  /**
   * The button color.
   * @return buttons
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getButtons() {
        return buttons.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUTTONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getButtons_JsonNullable() {
    return buttons;
  }
  
  @JsonProperty(JSON_PROPERTY_BUTTONS)
  public void setButtons_JsonNullable(JsonNullable<String> buttons) {
    this.buttons = buttons;
  }

  public void setButtons(@javax.annotation.Nullable String buttons) {
    this.buttons = JsonNullable.<String>of(buttons);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomColorThemesSettingsColorItem customColorThemesSettingsColorItem = (CustomColorThemesSettingsColorItem) o;
    return equalsNullable(this.accent, customColorThemesSettingsColorItem.accent) &&
        equalsNullable(this.buttons, customColorThemesSettingsColorItem.buttons);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accent), hashCodeNullable(buttons));
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
    sb.append("class CustomColorThemesSettingsColorItem {\n");
    sb.append("    accent: ").append(toIndentedString(accent)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
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

    // add `accent` to the URL query string
    if (getAccent() != null) {
      try {
        joiner.add(String.format("%saccent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `buttons` to the URL query string
    if (getButtons() != null) {
      try {
        joiner.add(String.format("%sbuttons%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getButtons()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

