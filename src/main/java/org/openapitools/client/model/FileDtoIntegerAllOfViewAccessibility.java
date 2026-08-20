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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The file accessibility.
 */
@JsonPropertyOrder({
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_IMAGE_VIEW,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_MEDIA_VIEW,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_WEB_VIEW,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_WEB_EDIT,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_WEB_REVIEW,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_WEB_CUSTOM_FILTER_EDITING,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_WEB_RESTRICTED_EDITING,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_WEB_COMMENT,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_CAN_CONVERT,
  FileDtoIntegerAllOfViewAccessibility.JSON_PROPERTY_MUST_CONVERT
})
@JsonTypeName("FileDtoInteger_allOf_viewAccessibility")

public class FileDtoIntegerAllOfViewAccessibility {
  public static final String JSON_PROPERTY_IMAGE_VIEW = "ImageView";
  @javax.annotation.Nullable  private Boolean imageView;

  public static final String JSON_PROPERTY_MEDIA_VIEW = "MediaView";
  @javax.annotation.Nullable  private Boolean mediaView;

  public static final String JSON_PROPERTY_WEB_VIEW = "WebView";
  @javax.annotation.Nullable  private Boolean webView;

  public static final String JSON_PROPERTY_WEB_EDIT = "WebEdit";
  @javax.annotation.Nullable  private Boolean webEdit;

  public static final String JSON_PROPERTY_WEB_REVIEW = "WebReview";
  @javax.annotation.Nullable  private Boolean webReview;

  public static final String JSON_PROPERTY_WEB_CUSTOM_FILTER_EDITING = "WebCustomFilterEditing";
  @javax.annotation.Nullable  private Boolean webCustomFilterEditing;

  public static final String JSON_PROPERTY_WEB_RESTRICTED_EDITING = "WebRestrictedEditing";
  @javax.annotation.Nullable  private Boolean webRestrictedEditing;

  public static final String JSON_PROPERTY_WEB_COMMENT = "WebComment";
  @javax.annotation.Nullable  private Boolean webComment;

  public static final String JSON_PROPERTY_CAN_CONVERT = "CanConvert";
  @javax.annotation.Nullable  private Boolean canConvert;

  public static final String JSON_PROPERTY_MUST_CONVERT = "MustConvert";
  @javax.annotation.Nullable  private Boolean mustConvert;

  public FileDtoIntegerAllOfViewAccessibility() {
  }


  public FileDtoIntegerAllOfViewAccessibility imageView(@javax.annotation.Nullable Boolean imageView) {
    
    this.imageView = imageView;
    return this;
  }

  /**
   * Get imageView
   * @return imageView
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImageView() {
    return imageView;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageView(@javax.annotation.Nullable Boolean imageView) {
    this.imageView = imageView;
  }

  public FileDtoIntegerAllOfViewAccessibility mediaView(@javax.annotation.Nullable Boolean mediaView) {
    
    this.mediaView = mediaView;
    return this;
  }

  /**
   * Get mediaView
   * @return mediaView
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MEDIA_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMediaView() {
    return mediaView;
  }


  @JsonProperty(value = JSON_PROPERTY_MEDIA_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaView(@javax.annotation.Nullable Boolean mediaView) {
    this.mediaView = mediaView;
  }

  public FileDtoIntegerAllOfViewAccessibility webView(@javax.annotation.Nullable Boolean webView) {
    
    this.webView = webView;
    return this;
  }

  /**
   * Get webView
   * @return webView
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebView() {
    return webView;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebView(@javax.annotation.Nullable Boolean webView) {
    this.webView = webView;
  }

  public FileDtoIntegerAllOfViewAccessibility webEdit(@javax.annotation.Nullable Boolean webEdit) {
    
    this.webEdit = webEdit;
    return this;
  }

  /**
   * Get webEdit
   * @return webEdit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_EDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebEdit() {
    return webEdit;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_EDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebEdit(@javax.annotation.Nullable Boolean webEdit) {
    this.webEdit = webEdit;
  }

  public FileDtoIntegerAllOfViewAccessibility webReview(@javax.annotation.Nullable Boolean webReview) {
    
    this.webReview = webReview;
    return this;
  }

  /**
   * Get webReview
   * @return webReview
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_REVIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebReview() {
    return webReview;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_REVIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebReview(@javax.annotation.Nullable Boolean webReview) {
    this.webReview = webReview;
  }

  public FileDtoIntegerAllOfViewAccessibility webCustomFilterEditing(@javax.annotation.Nullable Boolean webCustomFilterEditing) {
    
    this.webCustomFilterEditing = webCustomFilterEditing;
    return this;
  }

  /**
   * Get webCustomFilterEditing
   * @return webCustomFilterEditing
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_CUSTOM_FILTER_EDITING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebCustomFilterEditing() {
    return webCustomFilterEditing;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_CUSTOM_FILTER_EDITING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebCustomFilterEditing(@javax.annotation.Nullable Boolean webCustomFilterEditing) {
    this.webCustomFilterEditing = webCustomFilterEditing;
  }

  public FileDtoIntegerAllOfViewAccessibility webRestrictedEditing(@javax.annotation.Nullable Boolean webRestrictedEditing) {
    
    this.webRestrictedEditing = webRestrictedEditing;
    return this;
  }

  /**
   * Get webRestrictedEditing
   * @return webRestrictedEditing
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_RESTRICTED_EDITING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebRestrictedEditing() {
    return webRestrictedEditing;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_RESTRICTED_EDITING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebRestrictedEditing(@javax.annotation.Nullable Boolean webRestrictedEditing) {
    this.webRestrictedEditing = webRestrictedEditing;
  }

  public FileDtoIntegerAllOfViewAccessibility webComment(@javax.annotation.Nullable Boolean webComment) {
    
    this.webComment = webComment;
    return this;
  }

  /**
   * Get webComment
   * @return webComment
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_COMMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebComment() {
    return webComment;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_COMMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebComment(@javax.annotation.Nullable Boolean webComment) {
    this.webComment = webComment;
  }

  public FileDtoIntegerAllOfViewAccessibility canConvert(@javax.annotation.Nullable Boolean canConvert) {
    
    this.canConvert = canConvert;
    return this;
  }

  /**
   * Get canConvert
   * @return canConvert
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CAN_CONVERT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanConvert() {
    return canConvert;
  }


  @JsonProperty(value = JSON_PROPERTY_CAN_CONVERT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanConvert(@javax.annotation.Nullable Boolean canConvert) {
    this.canConvert = canConvert;
  }

  public FileDtoIntegerAllOfViewAccessibility mustConvert(@javax.annotation.Nullable Boolean mustConvert) {
    
    this.mustConvert = mustConvert;
    return this;
  }

  /**
   * Get mustConvert
   * @return mustConvert
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MUST_CONVERT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMustConvert() {
    return mustConvert;
  }


  @JsonProperty(value = JSON_PROPERTY_MUST_CONVERT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMustConvert(@javax.annotation.Nullable Boolean mustConvert) {
    this.mustConvert = mustConvert;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDtoIntegerAllOfViewAccessibility fileDtoIntegerAllOfViewAccessibility = (FileDtoIntegerAllOfViewAccessibility) o;
    return Objects.equals(this.imageView, fileDtoIntegerAllOfViewAccessibility.imageView) &&
        Objects.equals(this.mediaView, fileDtoIntegerAllOfViewAccessibility.mediaView) &&
        Objects.equals(this.webView, fileDtoIntegerAllOfViewAccessibility.webView) &&
        Objects.equals(this.webEdit, fileDtoIntegerAllOfViewAccessibility.webEdit) &&
        Objects.equals(this.webReview, fileDtoIntegerAllOfViewAccessibility.webReview) &&
        Objects.equals(this.webCustomFilterEditing, fileDtoIntegerAllOfViewAccessibility.webCustomFilterEditing) &&
        Objects.equals(this.webRestrictedEditing, fileDtoIntegerAllOfViewAccessibility.webRestrictedEditing) &&
        Objects.equals(this.webComment, fileDtoIntegerAllOfViewAccessibility.webComment) &&
        Objects.equals(this.canConvert, fileDtoIntegerAllOfViewAccessibility.canConvert) &&
        Objects.equals(this.mustConvert, fileDtoIntegerAllOfViewAccessibility.mustConvert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageView, mediaView, webView, webEdit, webReview, webCustomFilterEditing, webRestrictedEditing, webComment, canConvert, mustConvert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDtoIntegerAllOfViewAccessibility {\n");
    sb.append("    imageView: ").append(toIndentedString(imageView)).append("\n");
    sb.append("    mediaView: ").append(toIndentedString(mediaView)).append("\n");
    sb.append("    webView: ").append(toIndentedString(webView)).append("\n");
    sb.append("    webEdit: ").append(toIndentedString(webEdit)).append("\n");
    sb.append("    webReview: ").append(toIndentedString(webReview)).append("\n");
    sb.append("    webCustomFilterEditing: ").append(toIndentedString(webCustomFilterEditing)).append("\n");
    sb.append("    webRestrictedEditing: ").append(toIndentedString(webRestrictedEditing)).append("\n");
    sb.append("    webComment: ").append(toIndentedString(webComment)).append("\n");
    sb.append("    canConvert: ").append(toIndentedString(canConvert)).append("\n");
    sb.append("    mustConvert: ").append(toIndentedString(mustConvert)).append("\n");
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

    // add `ImageView` to the URL query string
    if (getImageView() != null) {
      try {
        joiner.add(String.format("%sImageView%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageView()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `MediaView` to the URL query string
    if (getMediaView() != null) {
      try {
        joiner.add(String.format("%sMediaView%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMediaView()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `WebView` to the URL query string
    if (getWebView() != null) {
      try {
        joiner.add(String.format("%sWebView%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebView()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `WebEdit` to the URL query string
    if (getWebEdit() != null) {
      try {
        joiner.add(String.format("%sWebEdit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebEdit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `WebReview` to the URL query string
    if (getWebReview() != null) {
      try {
        joiner.add(String.format("%sWebReview%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebReview()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `WebCustomFilterEditing` to the URL query string
    if (getWebCustomFilterEditing() != null) {
      try {
        joiner.add(String.format("%sWebCustomFilterEditing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebCustomFilterEditing()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `WebRestrictedEditing` to the URL query string
    if (getWebRestrictedEditing() != null) {
      try {
        joiner.add(String.format("%sWebRestrictedEditing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebRestrictedEditing()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `WebComment` to the URL query string
    if (getWebComment() != null) {
      try {
        joiner.add(String.format("%sWebComment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebComment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `CanConvert` to the URL query string
    if (getCanConvert() != null) {
      try {
        joiner.add(String.format("%sCanConvert%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanConvert()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `MustConvert` to the URL query string
    if (getMustConvert() != null) {
      try {
        joiner.add(String.format("%sMustConvert%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMustConvert()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

