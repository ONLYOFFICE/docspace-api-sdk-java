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
 * ContentType
 */
@JsonPropertyOrder({
  ContentType.JSON_PROPERTY_BOUNDARY,
  ContentType.JSON_PROPERTY_CHAR_SET,
  ContentType.JSON_PROPERTY_MEDIA_TYPE,
  ContentType.JSON_PROPERTY_NAME,
  ContentType.JSON_PROPERTY_PARAMETERS
})

public class ContentType {
  public static final String JSON_PROPERTY_BOUNDARY = "boundary";
  @javax.annotation.Nullable
  private JsonNullable<String> boundary = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CHAR_SET = "charSet";
  @javax.annotation.Nullable
  private JsonNullable<String> charSet = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  @javax.annotation.Nullable
  private JsonNullable<String> mediaType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @javax.annotation.Nullable
  private JsonNullable<List<Object>> parameters = JsonNullable.<List<Object>>undefined();

  public ContentType() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ContentType(
    @JsonProperty(JSON_PROPERTY_PARAMETERS) List<Object> parameters
  ) {
    this();
    this.parameters = parameters == null ? JsonNullable.<List<Object>>undefined() : JsonNullable.of(parameters);
  }


  public ContentType boundary(@javax.annotation.Nullable String boundary) {
    this.boundary = JsonNullable.<String>of(boundary);
    
    return this;
  }

  /**
   * Get boundary
   * @return boundary
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBoundary() {
        return boundary.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BOUNDARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBoundary_JsonNullable() {
    return boundary;
  }
  
  @JsonProperty(JSON_PROPERTY_BOUNDARY)
  public void setBoundary_JsonNullable(JsonNullable<String> boundary) {
    this.boundary = boundary;
  }

  public void setBoundary(@javax.annotation.Nullable String boundary) {
    this.boundary = JsonNullable.<String>of(boundary);
  }

  public ContentType charSet(@javax.annotation.Nullable String charSet) {
    this.charSet = JsonNullable.<String>of(charSet);
    
    return this;
  }

  /**
   * Get charSet
   * @return charSet
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCharSet() {
        return charSet.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHAR_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCharSet_JsonNullable() {
    return charSet;
  }
  
  @JsonProperty(JSON_PROPERTY_CHAR_SET)
  public void setCharSet_JsonNullable(JsonNullable<String> charSet) {
    this.charSet = charSet;
  }

  public void setCharSet(@javax.annotation.Nullable String charSet) {
    this.charSet = JsonNullable.<String>of(charSet);
  }

  public ContentType mediaType(@javax.annotation.Nullable String mediaType) {
    this.mediaType = JsonNullable.<String>of(mediaType);
    
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMediaType() {
        return mediaType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMediaType_JsonNullable() {
    return mediaType;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  public void setMediaType_JsonNullable(JsonNullable<String> mediaType) {
    this.mediaType = mediaType;
  }

  public void setMediaType(@javax.annotation.Nullable String mediaType) {
    this.mediaType = JsonNullable.<String>of(mediaType);
  }

  public ContentType name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
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

  /**
   * Get parameters
   * @return parameters
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<Object> getParameters() {
    
    if (parameters == null) {
      parameters = JsonNullable.<List<Object>>undefined();
    }
    return parameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<Object>> getParameters_JsonNullable() {
    return parameters;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  private void setParameters_JsonNullable(JsonNullable<List<Object>> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentType contentType = (ContentType) o;
    return equalsNullable(this.boundary, contentType.boundary) &&
        equalsNullable(this.charSet, contentType.charSet) &&
        equalsNullable(this.mediaType, contentType.mediaType) &&
        equalsNullable(this.name, contentType.name) &&
        equalsNullable(this.parameters, contentType.parameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(boundary), hashCodeNullable(charSet), hashCodeNullable(mediaType), hashCodeNullable(name), hashCodeNullable(parameters));
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
    sb.append("class ContentType {\n");
    sb.append("    boundary: ").append(toIndentedString(boundary)).append("\n");
    sb.append("    charSet: ").append(toIndentedString(charSet)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

    // add `boundary` to the URL query string
    if (getBoundary() != null) {
      try {
        joiner.add(String.format("%sboundary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBoundary()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `charSet` to the URL query string
    if (getCharSet() != null) {
      try {
        joiner.add(String.format("%scharSet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCharSet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mediaType` to the URL query string
    if (getMediaType() != null) {
      try {
        joiner.add(String.format("%smediaType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMediaType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `parameters` to the URL query string
    if (getParameters() != null) {
      for (int i = 0; i < getParameters().size(); i++) {
        try {
          joiner.add(String.format("%sparameters%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getParameters().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

