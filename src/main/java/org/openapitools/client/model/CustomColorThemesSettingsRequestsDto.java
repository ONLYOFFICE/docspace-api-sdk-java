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
import org.openapitools.client.model.CustomColorThemesSettingsItem;
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
 * The request parameters for managing the portal theme settings.
 */
@JsonPropertyOrder({
  CustomColorThemesSettingsRequestsDto.JSON_PROPERTY_THEME,
  CustomColorThemesSettingsRequestsDto.JSON_PROPERTY_SELECTED
})

public class CustomColorThemesSettingsRequestsDto {
  public static final String JSON_PROPERTY_THEME = "theme";
  @javax.annotation.Nullable
  private CustomColorThemesSettingsItem theme;

  public static final String JSON_PROPERTY_SELECTED = "selected";
  @javax.annotation.Nullable
  private JsonNullable<Integer> selected = JsonNullable.<Integer>undefined();

  public CustomColorThemesSettingsRequestsDto() {
  }

  public CustomColorThemesSettingsRequestsDto theme(@javax.annotation.Nullable CustomColorThemesSettingsItem theme) {
    
    this.theme = theme;
    return this;
  }

  /**
   * Get theme
   * @return theme
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomColorThemesSettingsItem getTheme() {
    return theme;
  }


  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheme(@javax.annotation.Nullable CustomColorThemesSettingsItem theme) {
    this.theme = theme;
  }

  public CustomColorThemesSettingsRequestsDto selected(@javax.annotation.Nullable Integer selected) {
    this.selected = JsonNullable.<Integer>of(selected);
    
    return this;
  }

  /**
   * Specifies the optional value indicating the selected custom color theme.
   * @return selected
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getSelected() {
        return selected.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getSelected_JsonNullable() {
    return selected;
  }
  
  @JsonProperty(JSON_PROPERTY_SELECTED)
  public void setSelected_JsonNullable(JsonNullable<Integer> selected) {
    this.selected = selected;
  }

  public void setSelected(@javax.annotation.Nullable Integer selected) {
    this.selected = JsonNullable.<Integer>of(selected);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomColorThemesSettingsRequestsDto customColorThemesSettingsRequestsDto = (CustomColorThemesSettingsRequestsDto) o;
    return Objects.equals(this.theme, customColorThemesSettingsRequestsDto.theme) &&
        equalsNullable(this.selected, customColorThemesSettingsRequestsDto.selected);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(theme, hashCodeNullable(selected));
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
    sb.append("class CustomColorThemesSettingsRequestsDto {\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

    // add `theme` to the URL query string
    if (getTheme() != null) {
      joiner.add(getTheme().toUrlQueryString(prefix + "theme" + suffix));
    }

    // add `selected` to the URL query string
    if (getSelected() != null) {
      try {
        joiner.add(String.format("%sselected%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSelected()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

