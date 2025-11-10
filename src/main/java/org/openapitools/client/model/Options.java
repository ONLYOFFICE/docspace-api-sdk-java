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
import org.openapitools.client.model.WatermarkOnDraw;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The document options.
 */
@JsonPropertyOrder({
  Options.JSON_PROPERTY_WATERMARK_ON_DRAW
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class Options {
  public static final String JSON_PROPERTY_WATERMARK_ON_DRAW = "watermark_on_draw";
  @javax.annotation.Nullable
  private WatermarkOnDraw watermarkOnDraw;

  public Options() {
  }

  public Options watermarkOnDraw(@javax.annotation.Nullable WatermarkOnDraw watermarkOnDraw) {
    
    this.watermarkOnDraw = watermarkOnDraw;
    return this;
  }

  /**
   * Get watermarkOnDraw
   * @return watermarkOnDraw
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WATERMARK_ON_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WatermarkOnDraw getWatermarkOnDraw() {
    return watermarkOnDraw;
  }


  @JsonProperty(JSON_PROPERTY_WATERMARK_ON_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermarkOnDraw(@javax.annotation.Nullable WatermarkOnDraw watermarkOnDraw) {
    this.watermarkOnDraw = watermarkOnDraw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Options options = (Options) o;
    return Objects.equals(this.watermarkOnDraw, options.watermarkOnDraw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watermarkOnDraw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Options {\n");
    sb.append("    watermarkOnDraw: ").append(toIndentedString(watermarkOnDraw)).append("\n");
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

    // add `watermark_on_draw` to the URL query string
    if (getWatermarkOnDraw() != null) {
      joiner.add(getWatermarkOnDraw().toUrlQueryString(prefix + "watermark_on_draw" + suffix));
    }

    return joiner.toString();
  }

}

