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
 * How the text of a pdf, xps or oxps source is read back when converting from it.
 */
@JsonPropertyOrder({
  ConvertDocumentRendererRequest.JSON_PROPERTY_TEXT_ASSOCIATION
})

public class ConvertDocumentRendererRequest {
  public static final String JSON_PROPERTY_TEXT_ASSOCIATION = "textAssociation";
  @javax.annotation.Nullable  private JsonNullable<String> textAssociation = JsonNullable.<String>undefined();

  public ConvertDocumentRendererRequest() {
  }


  public ConvertDocumentRendererRequest textAssociation(@javax.annotation.Nullable String textAssociation) {
    this.textAssociation = JsonNullable.<String>of(textAssociation);
    
    return this;
  }

  /**
   * The rendering mode: blockChar reads the text by single characters, blockLine by separate lines, plainLine as  plain text with a paragraph per line, plainParagraph as plain text with lines combined into paragraphs.
   * @return textAssociation
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTextAssociation() {
        return textAssociation.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TEXT_ASSOCIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTextAssociation_JsonNullable() {
    return textAssociation;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT_ASSOCIATION)
  public void setTextAssociation_JsonNullable(JsonNullable<String> textAssociation) {
    this.textAssociation = textAssociation;
  }

  public void setTextAssociation(@javax.annotation.Nullable String textAssociation) {
    this.textAssociation = JsonNullable.<String>of(textAssociation);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertDocumentRendererRequest convertDocumentRendererRequest = (ConvertDocumentRendererRequest) o;
    return equalsNullable(this.textAssociation, convertDocumentRendererRequest.textAssociation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(textAssociation));
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
    sb.append("class ConvertDocumentRendererRequest {\n");
    sb.append("    textAssociation: ").append(toIndentedString(textAssociation)).append("\n");
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

    // add `textAssociation` to the URL query string
    if (getTextAssociation() != null) {
      try {
        joiner.add(String.format("%stextAssociation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTextAssociation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

