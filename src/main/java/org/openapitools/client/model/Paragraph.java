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
import org.openapitools.client.model.Run;
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
 * The paragraph parameters.
 */
@JsonPropertyOrder({
  Paragraph.JSON_PROPERTY_ALIGN,
  Paragraph.JSON_PROPERTY_RUNS
})

public class Paragraph {
  public static final String JSON_PROPERTY_ALIGN = "align";
  @javax.annotation.Nullable
  private Integer align;

  public static final String JSON_PROPERTY_RUNS = "runs";
  @javax.annotation.Nullable
  private JsonNullable<List<Run>> runs = JsonNullable.<List<Run>>undefined();

  public Paragraph() {
  }

  public Paragraph align(@javax.annotation.Nullable Integer align) {
    
    this.align = align;
    return this;
  }

  /**
   * The paragraph align.
   * @return align
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAlign() {
    return align;
  }


  @JsonProperty(JSON_PROPERTY_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlign(@javax.annotation.Nullable Integer align) {
    this.align = align;
  }

  public Paragraph runs(@javax.annotation.Nullable List<Run> runs) {
    this.runs = JsonNullable.<List<Run>>of(runs);
    
    return this;
  }

  public Paragraph addRunsItem(Run runsItem) {
    if (this.runs == null || !this.runs.isPresent()) {
      this.runs = JsonNullable.<List<Run>>of(new ArrayList<>());
    }
    try {
      this.runs.get().add(runsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of text runs from the paragraph.
   * @return runs
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<Run> getRuns() {
        return runs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<Run>> getRuns_JsonNullable() {
    return runs;
  }
  
  @JsonProperty(JSON_PROPERTY_RUNS)
  public void setRuns_JsonNullable(JsonNullable<List<Run>> runs) {
    this.runs = runs;
  }

  public void setRuns(@javax.annotation.Nullable List<Run> runs) {
    this.runs = JsonNullable.<List<Run>>of(runs);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paragraph paragraph = (Paragraph) o;
    return Objects.equals(this.align, paragraph.align) &&
        equalsNullable(this.runs, paragraph.runs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(align, hashCodeNullable(runs));
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
    sb.append("class Paragraph {\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
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

    // add `align` to the URL query string
    if (getAlign() != null) {
      try {
        joiner.add(String.format("%salign%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAlign()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `runs` to the URL query string
    if (getRuns() != null) {
      for (int i = 0; i < getRuns().size(); i++) {
        if (getRuns().get(i) != null) {
          joiner.add(getRuns().get(i).toUrlQueryString(String.format("%sruns%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

