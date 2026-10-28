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
import org.openapitools.client.model.ConvertSpreadsheetMarginsRequest;
import org.openapitools.client.model.ConvertSpreadsheetPageSizeRequest;
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
 * How a spreadsheet converted to PDF is laid out on the page. A field left out takes the document service default.
 */
@JsonPropertyOrder({
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_IGNORE_PRINT_AREA,
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_ORIENTATION,
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_FIT_TO_HEIGHT,
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_SCALE,
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_FIT_TO_WIDTH,
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_HEADINGS,
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_GRID_LINES,
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_MARGINS,
  ConvertSpreadsheetLayoutRequest.JSON_PROPERTY_PAGE_SIZE
})

public class ConvertSpreadsheetLayoutRequest {
  public static final String JSON_PROPERTY_IGNORE_PRINT_AREA = "ignorePrintArea";
  @javax.annotation.Nullable  private JsonNullable<Boolean> ignorePrintArea = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ORIENTATION = "orientation";
  @javax.annotation.Nullable  private JsonNullable<String> orientation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIT_TO_HEIGHT = "fitToHeight";
  @javax.annotation.Nullable  private JsonNullable<Integer> fitToHeight = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SCALE = "scale";
  @javax.annotation.Nullable  private JsonNullable<Integer> scale = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FIT_TO_WIDTH = "fitToWidth";
  @javax.annotation.Nullable  private JsonNullable<Integer> fitToWidth = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_HEADINGS = "headings";
  @javax.annotation.Nullable  private JsonNullable<Boolean> headings = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_GRID_LINES = "gridLines";
  @javax.annotation.Nullable  private JsonNullable<Boolean> gridLines = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_MARGINS = "margins";
  @javax.annotation.Nullable  private ConvertSpreadsheetMarginsRequest margins;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  @javax.annotation.Nullable  private ConvertSpreadsheetPageSizeRequest pageSize;

  public ConvertSpreadsheetLayoutRequest() {
  }


  public ConvertSpreadsheetLayoutRequest ignorePrintArea(@javax.annotation.Nullable Boolean ignorePrintArea) {
    this.ignorePrintArea = JsonNullable.<Boolean>of(ignorePrintArea);
    
    return this;
  }

  /**
   * Whether the print area chosen in the spreadsheet is ignored; false converts only that area.
   * @return ignorePrintArea
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIgnorePrintArea() {
        return ignorePrintArea.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IGNORE_PRINT_AREA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIgnorePrintArea_JsonNullable() {
    return ignorePrintArea;
  }
  
  @JsonProperty(JSON_PROPERTY_IGNORE_PRINT_AREA)
  public void setIgnorePrintArea_JsonNullable(JsonNullable<Boolean> ignorePrintArea) {
    this.ignorePrintArea = ignorePrintArea;
  }

  public void setIgnorePrintArea(@javax.annotation.Nullable Boolean ignorePrintArea) {
    this.ignorePrintArea = JsonNullable.<Boolean>of(ignorePrintArea);
  }

  public ConvertSpreadsheetLayoutRequest orientation(@javax.annotation.Nullable String orientation) {
    this.orientation = JsonNullable.<String>of(orientation);
    
    return this;
  }

  /**
   * The page orientation of the output PDF file: portrait or landscape.
   * @return orientation
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOrientation() {
        return orientation.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORIENTATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOrientation_JsonNullable() {
    return orientation;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIENTATION)
  public void setOrientation_JsonNullable(JsonNullable<String> orientation) {
    this.orientation = orientation;
  }

  public void setOrientation(@javax.annotation.Nullable String orientation) {
    this.orientation = JsonNullable.<String>of(orientation);
  }

  public ConvertSpreadsheetLayoutRequest fitToHeight(@javax.annotation.Nullable Integer fitToHeight) {
    this.fitToHeight = JsonNullable.<Integer>of(fitToHeight);
    
    return this;
  }

  /**
   * The number of pages the converted area is fitted into in height; 0 does not fit it.
   * @return fitToHeight
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getFitToHeight() {
        return fitToHeight.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIT_TO_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getFitToHeight_JsonNullable() {
    return fitToHeight;
  }
  
  @JsonProperty(JSON_PROPERTY_FIT_TO_HEIGHT)
  public void setFitToHeight_JsonNullable(JsonNullable<Integer> fitToHeight) {
    this.fitToHeight = fitToHeight;
  }

  public void setFitToHeight(@javax.annotation.Nullable Integer fitToHeight) {
    this.fitToHeight = JsonNullable.<Integer>of(fitToHeight);
  }

  public ConvertSpreadsheetLayoutRequest scale(@javax.annotation.Nullable Integer scale) {
    this.scale = JsonNullable.<Integer>of(scale);
    
    return this;
  }

  /**
   * The scale of the output PDF file, in percent.
   * @return scale
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getScale() {
        return scale.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SCALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getScale_JsonNullable() {
    return scale;
  }
  
  @JsonProperty(JSON_PROPERTY_SCALE)
  public void setScale_JsonNullable(JsonNullable<Integer> scale) {
    this.scale = scale;
  }

  public void setScale(@javax.annotation.Nullable Integer scale) {
    this.scale = JsonNullable.<Integer>of(scale);
  }

  public ConvertSpreadsheetLayoutRequest fitToWidth(@javax.annotation.Nullable Integer fitToWidth) {
    this.fitToWidth = JsonNullable.<Integer>of(fitToWidth);
    
    return this;
  }

  /**
   * The number of pages the converted area is fitted into in width; 0 does not fit it.
   * @return fitToWidth
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getFitToWidth() {
        return fitToWidth.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIT_TO_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getFitToWidth_JsonNullable() {
    return fitToWidth;
  }
  
  @JsonProperty(JSON_PROPERTY_FIT_TO_WIDTH)
  public void setFitToWidth_JsonNullable(JsonNullable<Integer> fitToWidth) {
    this.fitToWidth = fitToWidth;
  }

  public void setFitToWidth(@javax.annotation.Nullable Integer fitToWidth) {
    this.fitToWidth = JsonNullable.<Integer>of(fitToWidth);
  }

  public ConvertSpreadsheetLayoutRequest headings(@javax.annotation.Nullable Boolean headings) {
    this.headings = JsonNullable.<Boolean>of(headings);
    
    return this;
  }

  /**
   * Whether the row and column headings are printed in the output PDF file.
   * @return headings
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getHeadings() {
        return headings.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HEADINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getHeadings_JsonNullable() {
    return headings;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADINGS)
  public void setHeadings_JsonNullable(JsonNullable<Boolean> headings) {
    this.headings = headings;
  }

  public void setHeadings(@javax.annotation.Nullable Boolean headings) {
    this.headings = JsonNullable.<Boolean>of(headings);
  }

  public ConvertSpreadsheetLayoutRequest gridLines(@javax.annotation.Nullable Boolean gridLines) {
    this.gridLines = JsonNullable.<Boolean>of(gridLines);
    
    return this;
  }

  /**
   * Whether the grid lines are printed in the output PDF file.
   * @return gridLines
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getGridLines() {
        return gridLines.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_GRID_LINES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getGridLines_JsonNullable() {
    return gridLines;
  }
  
  @JsonProperty(JSON_PROPERTY_GRID_LINES)
  public void setGridLines_JsonNullable(JsonNullable<Boolean> gridLines) {
    this.gridLines = gridLines;
  }

  public void setGridLines(@javax.annotation.Nullable Boolean gridLines) {
    this.gridLines = JsonNullable.<Boolean>of(gridLines);
  }

  public ConvertSpreadsheetLayoutRequest margins(@javax.annotation.Nullable ConvertSpreadsheetMarginsRequest margins) {
    
    this.margins = margins;
    return this;
  }

  /**
   * The margins of the output PDF file.
   * @return margins
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MARGINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConvertSpreadsheetMarginsRequest getMargins() {
    return margins;
  }


  @JsonProperty(value = JSON_PROPERTY_MARGINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMargins(@javax.annotation.Nullable ConvertSpreadsheetMarginsRequest margins) {
    this.margins = margins;
  }

  public ConvertSpreadsheetLayoutRequest pageSize(@javax.annotation.Nullable ConvertSpreadsheetPageSizeRequest pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The page size of the output PDF file.
   * @return pageSize
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PAGE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConvertSpreadsheetPageSizeRequest getPageSize() {
    return pageSize;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(@javax.annotation.Nullable ConvertSpreadsheetPageSizeRequest pageSize) {
    this.pageSize = pageSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertSpreadsheetLayoutRequest convertSpreadsheetLayoutRequest = (ConvertSpreadsheetLayoutRequest) o;
    return equalsNullable(this.ignorePrintArea, convertSpreadsheetLayoutRequest.ignorePrintArea) &&
        equalsNullable(this.orientation, convertSpreadsheetLayoutRequest.orientation) &&
        equalsNullable(this.fitToHeight, convertSpreadsheetLayoutRequest.fitToHeight) &&
        equalsNullable(this.scale, convertSpreadsheetLayoutRequest.scale) &&
        equalsNullable(this.fitToWidth, convertSpreadsheetLayoutRequest.fitToWidth) &&
        equalsNullable(this.headings, convertSpreadsheetLayoutRequest.headings) &&
        equalsNullable(this.gridLines, convertSpreadsheetLayoutRequest.gridLines) &&
        Objects.equals(this.margins, convertSpreadsheetLayoutRequest.margins) &&
        Objects.equals(this.pageSize, convertSpreadsheetLayoutRequest.pageSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ignorePrintArea), hashCodeNullable(orientation), hashCodeNullable(fitToHeight), hashCodeNullable(scale), hashCodeNullable(fitToWidth), hashCodeNullable(headings), hashCodeNullable(gridLines), margins, pageSize);
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
    sb.append("class ConvertSpreadsheetLayoutRequest {\n");
    sb.append("    ignorePrintArea: ").append(toIndentedString(ignorePrintArea)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    fitToHeight: ").append(toIndentedString(fitToHeight)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    fitToWidth: ").append(toIndentedString(fitToWidth)).append("\n");
    sb.append("    headings: ").append(toIndentedString(headings)).append("\n");
    sb.append("    gridLines: ").append(toIndentedString(gridLines)).append("\n");
    sb.append("    margins: ").append(toIndentedString(margins)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

    // add `ignorePrintArea` to the URL query string
    if (getIgnorePrintArea() != null) {
      try {
        joiner.add(String.format("%signorePrintArea%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIgnorePrintArea()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `orientation` to the URL query string
    if (getOrientation() != null) {
      try {
        joiner.add(String.format("%sorientation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrientation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fitToHeight` to the URL query string
    if (getFitToHeight() != null) {
      try {
        joiner.add(String.format("%sfitToHeight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFitToHeight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scale` to the URL query string
    if (getScale() != null) {
      try {
        joiner.add(String.format("%sscale%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScale()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fitToWidth` to the URL query string
    if (getFitToWidth() != null) {
      try {
        joiner.add(String.format("%sfitToWidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFitToWidth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `headings` to the URL query string
    if (getHeadings() != null) {
      try {
        joiner.add(String.format("%sheadings%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHeadings()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `gridLines` to the URL query string
    if (getGridLines() != null) {
      try {
        joiner.add(String.format("%sgridLines%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGridLines()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `margins` to the URL query string
    if (getMargins() != null) {
      joiner.add(getMargins().toUrlQueryString(prefix + "margins" + suffix));
    }

    // add `pageSize` to the URL query string
    if (getPageSize() != null) {
      joiner.add(getPageSize().toUrlQueryString(prefix + "pageSize" + suffix));
    }

    return joiner.toString();
  }

}

