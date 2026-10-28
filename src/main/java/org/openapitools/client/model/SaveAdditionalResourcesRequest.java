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
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Which help and community resources the interface links to.
 */
@JsonPropertyOrder({
  SaveAdditionalResourcesRequest.JSON_PROPERTY_START_DOCS_ENABLED,
  SaveAdditionalResourcesRequest.JSON_PROPERTY_HELP_CENTER_ENABLED,
  SaveAdditionalResourcesRequest.JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED,
  SaveAdditionalResourcesRequest.JSON_PROPERTY_USER_FORUM_ENABLED,
  SaveAdditionalResourcesRequest.JSON_PROPERTY_VIDEO_GUIDES_ENABLED,
  SaveAdditionalResourcesRequest.JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED,
  SaveAdditionalResourcesRequest.JSON_PROPERTY_LAST_MODIFIED
})

public class SaveAdditionalResourcesRequest {
  public static final String JSON_PROPERTY_START_DOCS_ENABLED = "startDocsEnabled";
  @javax.annotation.Nullable  private Boolean startDocsEnabled;

  public static final String JSON_PROPERTY_HELP_CENTER_ENABLED = "helpCenterEnabled";
  @javax.annotation.Nullable  private Boolean helpCenterEnabled;

  public static final String JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED = "feedbackAndSupportEnabled";
  @javax.annotation.Nullable  private Boolean feedbackAndSupportEnabled;

  public static final String JSON_PROPERTY_USER_FORUM_ENABLED = "userForumEnabled";
  @javax.annotation.Nullable  private Boolean userForumEnabled;

  public static final String JSON_PROPERTY_VIDEO_GUIDES_ENABLED = "videoGuidesEnabled";
  @javax.annotation.Nullable  private Boolean videoGuidesEnabled;

  public static final String JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED = "licenseAgreementsEnabled";
  @javax.annotation.Nullable  private Boolean licenseAgreementsEnabled;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private OffsetDateTime lastModified;

  public SaveAdditionalResourcesRequest() {
  }


  public SaveAdditionalResourcesRequest startDocsEnabled(@javax.annotation.Nullable Boolean startDocsEnabled) {
    
    this.startDocsEnabled = startDocsEnabled;
    return this;
  }

  /**
   * Whether the getting-started documents are offered.
   * @return startDocsEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_START_DOCS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStartDocsEnabled() {
    return startDocsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_START_DOCS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDocsEnabled(@javax.annotation.Nullable Boolean startDocsEnabled) {
    this.startDocsEnabled = startDocsEnabled;
  }

  public SaveAdditionalResourcesRequest helpCenterEnabled(@javax.annotation.Nullable Boolean helpCenterEnabled) {
    
    this.helpCenterEnabled = helpCenterEnabled;
    return this;
  }

  /**
   * Whether the help center is linked.
   * @return helpCenterEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HELP_CENTER_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHelpCenterEnabled() {
    return helpCenterEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_HELP_CENTER_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelpCenterEnabled(@javax.annotation.Nullable Boolean helpCenterEnabled) {
    this.helpCenterEnabled = helpCenterEnabled;
  }

  public SaveAdditionalResourcesRequest feedbackAndSupportEnabled(@javax.annotation.Nullable Boolean feedbackAndSupportEnabled) {
    
    this.feedbackAndSupportEnabled = feedbackAndSupportEnabled;
    return this;
  }

  /**
   * Whether the feedback and support link is shown.
   * @return feedbackAndSupportEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFeedbackAndSupportEnabled() {
    return feedbackAndSupportEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbackAndSupportEnabled(@javax.annotation.Nullable Boolean feedbackAndSupportEnabled) {
    this.feedbackAndSupportEnabled = feedbackAndSupportEnabled;
  }

  public SaveAdditionalResourcesRequest userForumEnabled(@javax.annotation.Nullable Boolean userForumEnabled) {
    
    this.userForumEnabled = userForumEnabled;
    return this;
  }

  /**
   * Whether the user forum is linked.
   * @return userForumEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USER_FORUM_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUserForumEnabled() {
    return userForumEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_FORUM_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserForumEnabled(@javax.annotation.Nullable Boolean userForumEnabled) {
    this.userForumEnabled = userForumEnabled;
  }

  public SaveAdditionalResourcesRequest videoGuidesEnabled(@javax.annotation.Nullable Boolean videoGuidesEnabled) {
    
    this.videoGuidesEnabled = videoGuidesEnabled;
    return this;
  }

  /**
   * Whether the video guides are linked.
   * @return videoGuidesEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VIDEO_GUIDES_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVideoGuidesEnabled() {
    return videoGuidesEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_VIDEO_GUIDES_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoGuidesEnabled(@javax.annotation.Nullable Boolean videoGuidesEnabled) {
    this.videoGuidesEnabled = videoGuidesEnabled;
  }

  public SaveAdditionalResourcesRequest licenseAgreementsEnabled(@javax.annotation.Nullable Boolean licenseAgreementsEnabled) {
    
    this.licenseAgreementsEnabled = licenseAgreementsEnabled;
    return this;
  }

  /**
   * Whether the license agreements are linked.
   * @return licenseAgreementsEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLicenseAgreementsEnabled() {
    return licenseAgreementsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseAgreementsEnabled(@javax.annotation.Nullable Boolean licenseAgreementsEnabled) {
    this.licenseAgreementsEnabled = licenseAgreementsEnabled;
  }

  public SaveAdditionalResourcesRequest lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Accepted for compatibility with earlier clients and not read: the server keeps its own value.
   * @return lastModified
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveAdditionalResourcesRequest saveAdditionalResourcesRequest = (SaveAdditionalResourcesRequest) o;
    return Objects.equals(this.startDocsEnabled, saveAdditionalResourcesRequest.startDocsEnabled) &&
        Objects.equals(this.helpCenterEnabled, saveAdditionalResourcesRequest.helpCenterEnabled) &&
        Objects.equals(this.feedbackAndSupportEnabled, saveAdditionalResourcesRequest.feedbackAndSupportEnabled) &&
        Objects.equals(this.userForumEnabled, saveAdditionalResourcesRequest.userForumEnabled) &&
        Objects.equals(this.videoGuidesEnabled, saveAdditionalResourcesRequest.videoGuidesEnabled) &&
        Objects.equals(this.licenseAgreementsEnabled, saveAdditionalResourcesRequest.licenseAgreementsEnabled) &&
        Objects.equals(this.lastModified, saveAdditionalResourcesRequest.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDocsEnabled, helpCenterEnabled, feedbackAndSupportEnabled, userForumEnabled, videoGuidesEnabled, licenseAgreementsEnabled, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveAdditionalResourcesRequest {\n");
    sb.append("    startDocsEnabled: ").append(toIndentedString(startDocsEnabled)).append("\n");
    sb.append("    helpCenterEnabled: ").append(toIndentedString(helpCenterEnabled)).append("\n");
    sb.append("    feedbackAndSupportEnabled: ").append(toIndentedString(feedbackAndSupportEnabled)).append("\n");
    sb.append("    userForumEnabled: ").append(toIndentedString(userForumEnabled)).append("\n");
    sb.append("    videoGuidesEnabled: ").append(toIndentedString(videoGuidesEnabled)).append("\n");
    sb.append("    licenseAgreementsEnabled: ").append(toIndentedString(licenseAgreementsEnabled)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

    // add `startDocsEnabled` to the URL query string
    if (getStartDocsEnabled() != null) {
      try {
        joiner.add(String.format("%sstartDocsEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartDocsEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `helpCenterEnabled` to the URL query string
    if (getHelpCenterEnabled() != null) {
      try {
        joiner.add(String.format("%shelpCenterEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHelpCenterEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `feedbackAndSupportEnabled` to the URL query string
    if (getFeedbackAndSupportEnabled() != null) {
      try {
        joiner.add(String.format("%sfeedbackAndSupportEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeedbackAndSupportEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userForumEnabled` to the URL query string
    if (getUserForumEnabled() != null) {
      try {
        joiner.add(String.format("%suserForumEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserForumEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `videoGuidesEnabled` to the URL query string
    if (getVideoGuidesEnabled() != null) {
      try {
        joiner.add(String.format("%svideoGuidesEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVideoGuidesEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `licenseAgreementsEnabled` to the URL query string
    if (getLicenseAgreementsEnabled() != null) {
      try {
        joiner.add(String.format("%slicenseAgreementsEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLicenseAgreementsEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

