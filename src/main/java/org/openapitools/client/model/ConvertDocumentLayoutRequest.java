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
 * The layout of forms printed as pdf documents or images.
 */
@JsonPropertyOrder({
  ConvertDocumentLayoutRequest.JSON_PROPERTY_DRAW_PLACE_HOLDERS,
  ConvertDocumentLayoutRequest.JSON_PROPERTY_DRAW_FORM_HIGHLIGHT,
  ConvertDocumentLayoutRequest.JSON_PROPERTY_IS_PRINT
})

public class ConvertDocumentLayoutRequest {
  public static final String JSON_PROPERTY_DRAW_PLACE_HOLDERS = "drawPlaceHolders";
  @javax.annotation.Nullable  private JsonNullable<Boolean> drawPlaceHolders = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DRAW_FORM_HIGHLIGHT = "drawFormHighlight";
  @javax.annotation.Nullable  private JsonNullable<Boolean> drawFormHighlight = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_PRINT = "isPrint";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isPrint = JsonNullable.<Boolean>undefined();

  public ConvertDocumentLayoutRequest() {
  }


  public ConvertDocumentLayoutRequest drawPlaceHolders(@javax.annotation.Nullable Boolean drawPlaceHolders) {
    this.drawPlaceHolders = JsonNullable.<Boolean>of(drawPlaceHolders);
    
    return this;
  }

  /**
   * Whether an empty form field shows its placeholder text in the result; false leaves it blank.
   * @return drawPlaceHolders
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDrawPlaceHolders() {
        return drawPlaceHolders.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DRAW_PLACE_HOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDrawPlaceHolders_JsonNullable() {
    return drawPlaceHolders;
  }
  
  @JsonProperty(JSON_PROPERTY_DRAW_PLACE_HOLDERS)
  public void setDrawPlaceHolders_JsonNullable(JsonNullable<Boolean> drawPlaceHolders) {
    this.drawPlaceHolders = drawPlaceHolders;
  }

  public void setDrawPlaceHolders(@javax.annotation.Nullable Boolean drawPlaceHolders) {
    this.drawPlaceHolders = JsonNullable.<Boolean>of(drawPlaceHolders);
  }

  public ConvertDocumentLayoutRequest drawFormHighlight(@javax.annotation.Nullable Boolean drawFormHighlight) {
    this.drawFormHighlight = JsonNullable.<Boolean>of(drawFormHighlight);
    
    return this;
  }

  /**
   * Whether form fields keep their highlight colour in the result; false draws them without it.
   * @return drawFormHighlight
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDrawFormHighlight() {
        return drawFormHighlight.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DRAW_FORM_HIGHLIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDrawFormHighlight_JsonNullable() {
    return drawFormHighlight;
  }
  
  @JsonProperty(JSON_PROPERTY_DRAW_FORM_HIGHLIGHT)
  public void setDrawFormHighlight_JsonNullable(JsonNullable<Boolean> drawFormHighlight) {
    this.drawFormHighlight = drawFormHighlight;
  }

  public void setDrawFormHighlight(@javax.annotation.Nullable Boolean drawFormHighlight) {
    this.drawFormHighlight = JsonNullable.<Boolean>of(drawFormHighlight);
  }

  public ConvertDocumentLayoutRequest isPrint(@javax.annotation.Nullable Boolean isPrint) {
    this.isPrint = JsonNullable.<Boolean>of(isPrint);
    
    return this;
  }

  /**
   * Whether the print mode is turned on. It only applies to a docx converted into pdf: with the print mode off  the highlight flag does nothing and the placeholder flag saves the forms in the pdf.
   * @return isPrint
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsPrint() {
        return isPrint.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_PRINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsPrint_JsonNullable() {
    return isPrint;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_PRINT)
  public void setIsPrint_JsonNullable(JsonNullable<Boolean> isPrint) {
    this.isPrint = isPrint;
  }

  public void setIsPrint(@javax.annotation.Nullable Boolean isPrint) {
    this.isPrint = JsonNullable.<Boolean>of(isPrint);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertDocumentLayoutRequest convertDocumentLayoutRequest = (ConvertDocumentLayoutRequest) o;
    return equalsNullable(this.drawPlaceHolders, convertDocumentLayoutRequest.drawPlaceHolders) &&
        equalsNullable(this.drawFormHighlight, convertDocumentLayoutRequest.drawFormHighlight) &&
        equalsNullable(this.isPrint, convertDocumentLayoutRequest.isPrint);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(drawPlaceHolders), hashCodeNullable(drawFormHighlight), hashCodeNullable(isPrint));
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
    sb.append("class ConvertDocumentLayoutRequest {\n");
    sb.append("    drawPlaceHolders: ").append(toIndentedString(drawPlaceHolders)).append("\n");
    sb.append("    drawFormHighlight: ").append(toIndentedString(drawFormHighlight)).append("\n");
    sb.append("    isPrint: ").append(toIndentedString(isPrint)).append("\n");
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

    // add `drawPlaceHolders` to the URL query string
    if (getDrawPlaceHolders() != null) {
      try {
        joiner.add(String.format("%sdrawPlaceHolders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDrawPlaceHolders()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `drawFormHighlight` to the URL query string
    if (getDrawFormHighlight() != null) {
      try {
        joiner.add(String.format("%sdrawFormHighlight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDrawFormHighlight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isPrint` to the URL query string
    if (getIsPrint() != null) {
      try {
        joiner.add(String.format("%sisPrint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsPrint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

