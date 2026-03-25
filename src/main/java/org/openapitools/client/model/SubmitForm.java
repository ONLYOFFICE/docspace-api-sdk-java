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
 * The Complete &amp; Submit button settings.
 */
@JsonPropertyOrder({
  SubmitForm.JSON_PROPERTY_VISIBLE,
  SubmitForm.JSON_PROPERTY_RESULT_MESSAGE
})

public class SubmitForm {
  public static final String JSON_PROPERTY_VISIBLE = "visible";
  @javax.annotation.Nullable  private Boolean visible;

  public static final String JSON_PROPERTY_RESULT_MESSAGE = "resultMessage";
  @javax.annotation.Nullable  private JsonNullable<String> resultMessage = JsonNullable.<String>undefined();

  public SubmitForm() {
  }


  public SubmitForm visible(@javax.annotation.Nullable Boolean visible) {
    
    this.visible = visible;
    return this;
  }

  /**
   * Specifies whether the Complete  &amp; Submit button will be displayed or hidden on the top toolbar.
   * @return visible
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VISIBLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisible() {
    return visible;
  }


  @JsonProperty(value = JSON_PROPERTY_VISIBLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisible(@javax.annotation.Nullable Boolean visible) {
    this.visible = visible;
  }

  public SubmitForm resultMessage(@javax.annotation.Nullable String resultMessage) {
    this.resultMessage = JsonNullable.<String>of(resultMessage);
    
    return this;
  }

  /**
   * A message displayed after forms are submitted.
   * @return resultMessage
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getResultMessage() {
        return resultMessage.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RESULT_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getResultMessage_JsonNullable() {
    return resultMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_RESULT_MESSAGE)
  public void setResultMessage_JsonNullable(JsonNullable<String> resultMessage) {
    this.resultMessage = resultMessage;
  }

  public void setResultMessage(@javax.annotation.Nullable String resultMessage) {
    this.resultMessage = JsonNullable.<String>of(resultMessage);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitForm submitForm = (SubmitForm) o;
    return Objects.equals(this.visible, submitForm.visible) &&
        equalsNullable(this.resultMessage, submitForm.resultMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(visible, hashCodeNullable(resultMessage));
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
    sb.append("class SubmitForm {\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
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

    // add `visible` to the URL query string
    if (getVisible() != null) {
      try {
        joiner.add(String.format("%svisible%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVisible()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resultMessage` to the URL query string
    if (getResultMessage() != null) {
      try {
        joiner.add(String.format("%sresultMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResultMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

