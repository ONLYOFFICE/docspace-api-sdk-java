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
 * The authorization key parameters.
 */
@JsonPropertyOrder({
  AuthKey.JSON_PROPERTY_NAME,
  AuthKey.JSON_PROPERTY_VALUE,
  AuthKey.JSON_PROPERTY_TITLE,
  AuthKey.JSON_PROPERTY_TYPE,
  AuthKey.JSON_PROPERTY_OPTIONS,
  AuthKey.JSON_PROPERTY_DEPENDS_ON,
  AuthKey.JSON_PROPERTY_DEPENDS_ON_VALUE
})

public class AuthKey {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable  private String value;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPTIONS = "options";
  @javax.annotation.Nullable  private JsonNullable<List<String>> options = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_DEPENDS_ON = "dependsOn";
  @javax.annotation.Nullable  private JsonNullable<String> dependsOn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPENDS_ON_VALUE = "dependsOnValue";
  @javax.annotation.Nullable  private JsonNullable<String> dependsOnValue = JsonNullable.<String>undefined();

  public AuthKey() {
  }


  public AuthKey name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The authorization key name.
   * @return name
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public AuthKey value(@javax.annotation.Nullable String value) {
    
    this.value = value;
    return this;
  }

  /**
   * The authorization key value.
   * @return value
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(@javax.annotation.Nullable String value) {
    this.value = value;
  }

  public AuthKey title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The authorization key title.
   * @return title
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public AuthKey type(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

  /**
   * The field type: text, password, select, toggle.
   * @return type
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
  }

  public AuthKey options(@javax.annotation.Nullable List<String> options) {
    this.options = JsonNullable.<List<String>>of(options);
    
    return this;
  }

  public AuthKey addOptionsItem(String optionsItem) {
    if (this.options == null || !this.options.isPresent()) {
      this.options = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.options.get().add(optionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of options for select type fields.
   * @return options
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getOptions() {
        return options.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OPTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getOptions_JsonNullable() {
    return options;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  public void setOptions_JsonNullable(JsonNullable<List<String>> options) {
    this.options = options;
  }

  public void setOptions(@javax.annotation.Nullable List<String> options) {
    this.options = JsonNullable.<List<String>>of(options);
  }

  public AuthKey dependsOn(@javax.annotation.Nullable String dependsOn) {
    this.dependsOn = JsonNullable.<String>of(dependsOn);
    
    return this;
  }

  /**
   * The name of another key this field depends on for visibility.
   * @return dependsOn
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDependsOn() {
        return dependsOn.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DEPENDS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDependsOn_JsonNullable() {
    return dependsOn;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPENDS_ON)
  public void setDependsOn_JsonNullable(JsonNullable<String> dependsOn) {
    this.dependsOn = dependsOn;
  }

  public void setDependsOn(@javax.annotation.Nullable String dependsOn) {
    this.dependsOn = JsonNullable.<String>of(dependsOn);
  }

  public AuthKey dependsOnValue(@javax.annotation.Nullable String dependsOnValue) {
    this.dependsOnValue = JsonNullable.<String>of(dependsOnValue);
    
    return this;
  }

  /**
   * The value of ASC.Web.Studio.UserControls.Management.AuthKey.DependsOn key that makes this field visible.
   * @return dependsOnValue
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDependsOnValue() {
        return dependsOnValue.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DEPENDS_ON_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDependsOnValue_JsonNullable() {
    return dependsOnValue;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPENDS_ON_VALUE)
  public void setDependsOnValue_JsonNullable(JsonNullable<String> dependsOnValue) {
    this.dependsOnValue = dependsOnValue;
  }

  public void setDependsOnValue(@javax.annotation.Nullable String dependsOnValue) {
    this.dependsOnValue = JsonNullable.<String>of(dependsOnValue);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthKey authKey = (AuthKey) o;
    return Objects.equals(this.name, authKey.name) &&
        Objects.equals(this.value, authKey.value) &&
        equalsNullable(this.title, authKey.title) &&
        equalsNullable(this.type, authKey.type) &&
        equalsNullable(this.options, authKey.options) &&
        equalsNullable(this.dependsOn, authKey.dependsOn) &&
        equalsNullable(this.dependsOnValue, authKey.dependsOnValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, hashCodeNullable(title), hashCodeNullable(type), hashCodeNullable(options), hashCodeNullable(dependsOn), hashCodeNullable(dependsOnValue));
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
    sb.append("class AuthKey {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    dependsOnValue: ").append(toIndentedString(dependsOnValue)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `options` to the URL query string
    if (getOptions() != null) {
      for (int i = 0; i < getOptions().size(); i++) {
        try {
          joiner.add(String.format("%soptions%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getOptions().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `dependsOn` to the URL query string
    if (getDependsOn() != null) {
      try {
        joiner.add(String.format("%sdependsOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDependsOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dependsOnValue` to the URL query string
    if (getDependsOnValue() != null) {
      try {
        joiner.add(String.format("%sdependsOnValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDependsOnValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

