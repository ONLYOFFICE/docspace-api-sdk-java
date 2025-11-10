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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The additional white label settings.
 */
@JsonPropertyOrder({
  AdditionalWhiteLabelSettings.JSON_PROPERTY_START_DOCS_ENABLED,
  AdditionalWhiteLabelSettings.JSON_PROPERTY_HELP_CENTER_ENABLED,
  AdditionalWhiteLabelSettings.JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED,
  AdditionalWhiteLabelSettings.JSON_PROPERTY_USER_FORUM_ENABLED,
  AdditionalWhiteLabelSettings.JSON_PROPERTY_VIDEO_GUIDES_ENABLED,
  AdditionalWhiteLabelSettings.JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED,
  AdditionalWhiteLabelSettings.JSON_PROPERTY_LAST_MODIFIED
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class AdditionalWhiteLabelSettings {
  public static final String JSON_PROPERTY_START_DOCS_ENABLED = "startDocsEnabled";
  @javax.annotation.Nullable
  private Boolean startDocsEnabled;

  public static final String JSON_PROPERTY_HELP_CENTER_ENABLED = "helpCenterEnabled";
  @javax.annotation.Nullable
  private Boolean helpCenterEnabled;

  public static final String JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED = "feedbackAndSupportEnabled";
  @javax.annotation.Nullable
  private Boolean feedbackAndSupportEnabled;

  public static final String JSON_PROPERTY_USER_FORUM_ENABLED = "userForumEnabled";
  @javax.annotation.Nullable
  private Boolean userForumEnabled;

  public static final String JSON_PROPERTY_VIDEO_GUIDES_ENABLED = "videoGuidesEnabled";
  @javax.annotation.Nullable
  private Boolean videoGuidesEnabled;

  public static final String JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED = "licenseAgreementsEnabled";
  @javax.annotation.Nullable
  private Boolean licenseAgreementsEnabled;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable
  private OffsetDateTime lastModified;

  public AdditionalWhiteLabelSettings() {
  }

  public AdditionalWhiteLabelSettings startDocsEnabled(@javax.annotation.Nullable Boolean startDocsEnabled) {
    
    this.startDocsEnabled = startDocsEnabled;
    return this;
  }

  /**
   * Specifies if the sample documents are displayed or hidden.
   * @return startDocsEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DOCS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStartDocsEnabled() {
    return startDocsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_START_DOCS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDocsEnabled(@javax.annotation.Nullable Boolean startDocsEnabled) {
    this.startDocsEnabled = startDocsEnabled;
  }

  public AdditionalWhiteLabelSettings helpCenterEnabled(@javax.annotation.Nullable Boolean helpCenterEnabled) {
    
    this.helpCenterEnabled = helpCenterEnabled;
    return this;
  }

  /**
   * Specifies if the Help Center link is available or not.
   * @return helpCenterEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HELP_CENTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHelpCenterEnabled() {
    return helpCenterEnabled;
  }


  @JsonProperty(JSON_PROPERTY_HELP_CENTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelpCenterEnabled(@javax.annotation.Nullable Boolean helpCenterEnabled) {
    this.helpCenterEnabled = helpCenterEnabled;
  }

  public AdditionalWhiteLabelSettings feedbackAndSupportEnabled(@javax.annotation.Nullable Boolean feedbackAndSupportEnabled) {
    
    this.feedbackAndSupportEnabled = feedbackAndSupportEnabled;
    return this;
  }

  /**
   * Specifies if the Feedback &amp; Support link is available or not.
   * @return feedbackAndSupportEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFeedbackAndSupportEnabled() {
    return feedbackAndSupportEnabled;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbackAndSupportEnabled(@javax.annotation.Nullable Boolean feedbackAndSupportEnabled) {
    this.feedbackAndSupportEnabled = feedbackAndSupportEnabled;
  }

  public AdditionalWhiteLabelSettings userForumEnabled(@javax.annotation.Nullable Boolean userForumEnabled) {
    
    this.userForumEnabled = userForumEnabled;
    return this;
  }

  /**
   * Specifies if the user forum is available or not.
   * @return userForumEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_FORUM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUserForumEnabled() {
    return userForumEnabled;
  }


  @JsonProperty(JSON_PROPERTY_USER_FORUM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserForumEnabled(@javax.annotation.Nullable Boolean userForumEnabled) {
    this.userForumEnabled = userForumEnabled;
  }

  public AdditionalWhiteLabelSettings videoGuidesEnabled(@javax.annotation.Nullable Boolean videoGuidesEnabled) {
    
    this.videoGuidesEnabled = videoGuidesEnabled;
    return this;
  }

  /**
   * Specifies if the Video Guides link is available or not.
   * @return videoGuidesEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_GUIDES_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVideoGuidesEnabled() {
    return videoGuidesEnabled;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_GUIDES_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoGuidesEnabled(@javax.annotation.Nullable Boolean videoGuidesEnabled) {
    this.videoGuidesEnabled = videoGuidesEnabled;
  }

  public AdditionalWhiteLabelSettings licenseAgreementsEnabled(@javax.annotation.Nullable Boolean licenseAgreementsEnabled) {
    
    this.licenseAgreementsEnabled = licenseAgreementsEnabled;
    return this;
  }

  /**
   * Specifies if the License Agreements link is available or not.
   * @return licenseAgreementsEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLicenseAgreementsEnabled() {
    return licenseAgreementsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseAgreementsEnabled(@javax.annotation.Nullable Boolean licenseAgreementsEnabled) {
    this.licenseAgreementsEnabled = licenseAgreementsEnabled;
  }

  public AdditionalWhiteLabelSettings lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
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
    AdditionalWhiteLabelSettings additionalWhiteLabelSettings = (AdditionalWhiteLabelSettings) o;
    return Objects.equals(this.startDocsEnabled, additionalWhiteLabelSettings.startDocsEnabled) &&
        Objects.equals(this.helpCenterEnabled, additionalWhiteLabelSettings.helpCenterEnabled) &&
        Objects.equals(this.feedbackAndSupportEnabled, additionalWhiteLabelSettings.feedbackAndSupportEnabled) &&
        Objects.equals(this.userForumEnabled, additionalWhiteLabelSettings.userForumEnabled) &&
        Objects.equals(this.videoGuidesEnabled, additionalWhiteLabelSettings.videoGuidesEnabled) &&
        Objects.equals(this.licenseAgreementsEnabled, additionalWhiteLabelSettings.licenseAgreementsEnabled) &&
        Objects.equals(this.lastModified, additionalWhiteLabelSettings.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDocsEnabled, helpCenterEnabled, feedbackAndSupportEnabled, userForumEnabled, videoGuidesEnabled, licenseAgreementsEnabled, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalWhiteLabelSettings {\n");
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

