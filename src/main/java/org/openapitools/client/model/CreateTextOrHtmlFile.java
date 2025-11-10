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
 * The parameters for creating an HTML or text file.
 */
@JsonPropertyOrder({
  CreateTextOrHtmlFile.JSON_PROPERTY_TITLE,
  CreateTextOrHtmlFile.JSON_PROPERTY_CONTENT,
  CreateTextOrHtmlFile.JSON_PROPERTY_CREATE_NEW_IF_EXIST
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class CreateTextOrHtmlFile {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable
  private JsonNullable<String> content = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATE_NEW_IF_EXIST = "createNewIfExist";
  @javax.annotation.Nullable
  private Boolean createNewIfExist;

  public CreateTextOrHtmlFile() {
  }

  public CreateTextOrHtmlFile title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The file title for text or HTML file.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public CreateTextOrHtmlFile content(@javax.annotation.Nullable String content) {
    this.content = JsonNullable.<String>of(content);
    
    return this;
  }

  /**
   * The text or HTML file contents.
   * @return content
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getContent() {
        return content.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContent_JsonNullable() {
    return content;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT)
  public void setContent_JsonNullable(JsonNullable<String> content) {
    this.content = content;
  }

  public void setContent(@javax.annotation.Nullable String content) {
    this.content = JsonNullable.<String>of(content);
  }

  public CreateTextOrHtmlFile createNewIfExist(@javax.annotation.Nullable Boolean createNewIfExist) {
    
    this.createNewIfExist = createNewIfExist;
    return this;
  }

  /**
   * Specifies whether to create a new text or HTML file if it exists or not.
   * @return createNewIfExist
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_NEW_IF_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateNewIfExist() {
    return createNewIfExist;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_NEW_IF_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateNewIfExist(@javax.annotation.Nullable Boolean createNewIfExist) {
    this.createNewIfExist = createNewIfExist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTextOrHtmlFile createTextOrHtmlFile = (CreateTextOrHtmlFile) o;
    return Objects.equals(this.title, createTextOrHtmlFile.title) &&
        equalsNullable(this.content, createTextOrHtmlFile.content) &&
        Objects.equals(this.createNewIfExist, createTextOrHtmlFile.createNewIfExist);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, hashCodeNullable(content), createNewIfExist);
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
    sb.append("class CreateTextOrHtmlFile {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createNewIfExist: ").append(toIndentedString(createNewIfExist)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      try {
        joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createNewIfExist` to the URL query string
    if (getCreateNewIfExist() != null) {
      try {
        joiner.add(String.format("%screateNewIfExist%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateNewIfExist()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

