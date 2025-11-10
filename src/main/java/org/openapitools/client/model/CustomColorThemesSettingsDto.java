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
 * The custom color themes settings.
 */
@JsonPropertyOrder({
  CustomColorThemesSettingsDto.JSON_PROPERTY_THEMES,
  CustomColorThemesSettingsDto.JSON_PROPERTY_SELECTED,
  CustomColorThemesSettingsDto.JSON_PROPERTY_LIMIT
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class CustomColorThemesSettingsDto {
  public static final String JSON_PROPERTY_THEMES = "themes";
  @javax.annotation.Nullable
  private JsonNullable<List<CustomColorThemesSettingsItem>> themes = JsonNullable.<List<CustomColorThemesSettingsItem>>undefined();

  public static final String JSON_PROPERTY_SELECTED = "selected";
  @javax.annotation.Nullable
  private Integer selected;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable
  private Integer limit;

  public CustomColorThemesSettingsDto() {
  }

  public CustomColorThemesSettingsDto themes(@javax.annotation.Nullable List<CustomColorThemesSettingsItem> themes) {
    this.themes = JsonNullable.<List<CustomColorThemesSettingsItem>>of(themes);
    
    return this;
  }

  public CustomColorThemesSettingsDto addThemesItem(CustomColorThemesSettingsItem themesItem) {
    if (this.themes == null || !this.themes.isPresent()) {
      this.themes = JsonNullable.<List<CustomColorThemesSettingsItem>>of(new ArrayList<>());
    }
    try {
      this.themes.get().add(themesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the custom color themes.
   * @return themes
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<CustomColorThemesSettingsItem> getThemes() {
        return themes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THEMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CustomColorThemesSettingsItem>> getThemes_JsonNullable() {
    return themes;
  }
  
  @JsonProperty(JSON_PROPERTY_THEMES)
  public void setThemes_JsonNullable(JsonNullable<List<CustomColorThemesSettingsItem>> themes) {
    this.themes = themes;
  }

  public void setThemes(@javax.annotation.Nullable List<CustomColorThemesSettingsItem> themes) {
    this.themes = JsonNullable.<List<CustomColorThemesSettingsItem>>of(themes);
  }

  public CustomColorThemesSettingsDto selected(@javax.annotation.Nullable Integer selected) {
    
    this.selected = selected;
    return this;
  }

  /**
   * Specifies whether the custom color theme is selected.
   * @return selected
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSelected() {
    return selected;
  }


  @JsonProperty(JSON_PROPERTY_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelected(@javax.annotation.Nullable Integer selected) {
    this.selected = selected;
  }

  public CustomColorThemesSettingsDto limit(@javax.annotation.Nullable Integer limit) {
    
    this.limit = limit;
    return this;
  }

  /**
   * The maximum number of the custom color themes.
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomColorThemesSettingsDto customColorThemesSettingsDto = (CustomColorThemesSettingsDto) o;
    return equalsNullable(this.themes, customColorThemesSettingsDto.themes) &&
        Objects.equals(this.selected, customColorThemesSettingsDto.selected) &&
        Objects.equals(this.limit, customColorThemesSettingsDto.limit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(themes), selected, limit);
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
    sb.append("class CustomColorThemesSettingsDto {\n");
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

    // add `themes` to the URL query string
    if (getThemes() != null) {
      for (int i = 0; i < getThemes().size(); i++) {
        if (getThemes().get(i) != null) {
          joiner.add(getThemes().get(i).toUrlQueryString(String.format("%sthemes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
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

    // add `limit` to the URL query string
    if (getLimit() != null) {
      try {
        joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

