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
 * ReviewConfig
 */
@JsonPropertyOrder({
  ReviewConfig.JSON_PROPERTY_REVIEW_DISPLAY
})

public class ReviewConfig {
  public static final String JSON_PROPERTY_REVIEW_DISPLAY = "reviewDisplay";
  @javax.annotation.Nullable
  private JsonNullable<String> reviewDisplay = JsonNullable.<String>undefined();

  public ReviewConfig() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ReviewConfig(
    @JsonProperty(JSON_PROPERTY_REVIEW_DISPLAY) String reviewDisplay
  ) {
    this();
    this.reviewDisplay = reviewDisplay == null ? JsonNullable.<String>undefined() : JsonNullable.of(reviewDisplay);
  }


  /**
   * Get reviewDisplay
   * @return reviewDisplay
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getReviewDisplay() {
    
    if (reviewDisplay == null) {
      reviewDisplay = JsonNullable.<String>undefined();
    }
    return reviewDisplay.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REVIEW_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReviewDisplay_JsonNullable() {
    return reviewDisplay;
  }
  
  @JsonProperty(JSON_PROPERTY_REVIEW_DISPLAY)
  private void setReviewDisplay_JsonNullable(JsonNullable<String> reviewDisplay) {
    this.reviewDisplay = reviewDisplay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewConfig reviewConfig = (ReviewConfig) o;
    return equalsNullable(this.reviewDisplay, reviewConfig.reviewDisplay);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(reviewDisplay));
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
    sb.append("class ReviewConfig {\n");
    sb.append("    reviewDisplay: ").append(toIndentedString(reviewDisplay)).append("\n");
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

    // add `reviewDisplay` to the URL query string
    if (getReviewDisplay() != null) {
      try {
        joiner.add(String.format("%sreviewDisplay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReviewDisplay()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

