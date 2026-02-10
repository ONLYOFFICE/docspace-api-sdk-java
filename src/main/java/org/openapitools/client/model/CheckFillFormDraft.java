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
 * The parameters for checking the form draft filling.
 */
@JsonPropertyOrder({
  CheckFillFormDraft.JSON_PROPERTY_VERSION,
  CheckFillFormDraft.JSON_PROPERTY_ACTION,
  CheckFillFormDraft.JSON_PROPERTY_REQUEST_VIEW,
  CheckFillFormDraft.JSON_PROPERTY_REQUEST_EMBEDDED
})

public class CheckFillFormDraft {
  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public static final String JSON_PROPERTY_ACTION = "action";
  @javax.annotation.Nullable
  private JsonNullable<String> action = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_VIEW = "requestView";
  @javax.annotation.Nullable
  private Boolean requestView;

  public static final String JSON_PROPERTY_REQUEST_EMBEDDED = "requestEmbedded";
  @javax.annotation.Nullable
  private Boolean requestEmbedded;

  public CheckFillFormDraft() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public CheckFillFormDraft(
    @JsonProperty(JSON_PROPERTY_REQUEST_VIEW) Boolean requestView, 
    @JsonProperty(JSON_PROPERTY_REQUEST_EMBEDDED) Boolean requestEmbedded
  ) {
    this();
    this.requestView = requestView;
    this.requestEmbedded = requestEmbedded;
  }


  public CheckFillFormDraft version(@javax.annotation.Nonnull Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The file version of the form draft.
   * @return version
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull Integer version) {
    this.version = version;
  }

  public CheckFillFormDraft action(@javax.annotation.Nullable String action) {
    this.action = JsonNullable.<String>of(action);
    
    return this;
  }

  /**
   * The action with the form draft.
   * @return action
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAction() {
        return action.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAction_JsonNullable() {
    return action;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTION)
  public void setAction_JsonNullable(JsonNullable<String> action) {
    this.action = action;
  }

  public void setAction(@javax.annotation.Nullable String action) {
    this.action = JsonNullable.<String>of(action);
  }

  /**
   * Specifies whether to request the form for viewing or not.
   * @return requestView
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequestView() {
    return requestView;
  }



  /**
   * Specifies whether to request an embedded form or not.
   * @return requestEmbedded
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequestEmbedded() {
    return requestEmbedded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckFillFormDraft checkFillFormDraft = (CheckFillFormDraft) o;
    return Objects.equals(this.version, checkFillFormDraft.version) &&
        equalsNullable(this.action, checkFillFormDraft.action) &&
        Objects.equals(this.requestView, checkFillFormDraft.requestView) &&
        Objects.equals(this.requestEmbedded, checkFillFormDraft.requestEmbedded);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, hashCodeNullable(action), requestView, requestEmbedded);
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
    sb.append("class CheckFillFormDraft {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    requestView: ").append(toIndentedString(requestView)).append("\n");
    sb.append("    requestEmbedded: ").append(toIndentedString(requestEmbedded)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `action` to the URL query string
    if (getAction() != null) {
      try {
        joiner.add(String.format("%saction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requestView` to the URL query string
    if (getRequestView() != null) {
      try {
        joiner.add(String.format("%srequestView%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestView()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requestEmbedded` to the URL query string
    if (getRequestEmbedded() != null) {
      try {
        joiner.add(String.format("%srequestEmbedded%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestEmbedded()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

