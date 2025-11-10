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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The additional white label settings parameters.
 */
@JsonPropertyOrder({
  AdditionalWhiteLabelSettingsDto.JSON_PROPERTY_START_DOCS_ENABLED,
  AdditionalWhiteLabelSettingsDto.JSON_PROPERTY_HELP_CENTER_ENABLED,
  AdditionalWhiteLabelSettingsDto.JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED,
  AdditionalWhiteLabelSettingsDto.JSON_PROPERTY_USER_FORUM_ENABLED,
  AdditionalWhiteLabelSettingsDto.JSON_PROPERTY_VIDEO_GUIDES_ENABLED,
  AdditionalWhiteLabelSettingsDto.JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED,
  AdditionalWhiteLabelSettingsDto.JSON_PROPERTY_IS_DEFAULT
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class AdditionalWhiteLabelSettingsDto {
  public static final String JSON_PROPERTY_START_DOCS_ENABLED = "startDocsEnabled";
  @javax.annotation.Nonnull
  private Boolean startDocsEnabled;

  public static final String JSON_PROPERTY_HELP_CENTER_ENABLED = "helpCenterEnabled";
  @javax.annotation.Nonnull
  private Boolean helpCenterEnabled;

  public static final String JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED = "feedbackAndSupportEnabled";
  @javax.annotation.Nonnull
  private Boolean feedbackAndSupportEnabled;

  public static final String JSON_PROPERTY_USER_FORUM_ENABLED = "userForumEnabled";
  @javax.annotation.Nonnull
  private Boolean userForumEnabled;

  public static final String JSON_PROPERTY_VIDEO_GUIDES_ENABLED = "videoGuidesEnabled";
  @javax.annotation.Nonnull
  private Boolean videoGuidesEnabled;

  public static final String JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED = "licenseAgreementsEnabled";
  @javax.annotation.Nonnull
  private Boolean licenseAgreementsEnabled;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  @javax.annotation.Nonnull
  private Boolean isDefault;

  public AdditionalWhiteLabelSettingsDto() {
  }

  public AdditionalWhiteLabelSettingsDto startDocsEnabled(@javax.annotation.Nonnull Boolean startDocsEnabled) {
    
    this.startDocsEnabled = startDocsEnabled;
    return this;
  }

  /**
   * Specifies if the sample documents are displayed or hidden.
   * @return startDocsEnabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_DOCS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getStartDocsEnabled() {
    return startDocsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_START_DOCS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDocsEnabled(@javax.annotation.Nonnull Boolean startDocsEnabled) {
    this.startDocsEnabled = startDocsEnabled;
  }

  public AdditionalWhiteLabelSettingsDto helpCenterEnabled(@javax.annotation.Nonnull Boolean helpCenterEnabled) {
    
    this.helpCenterEnabled = helpCenterEnabled;
    return this;
  }

  /**
   * Specifies if the Help Center link is available or not.
   * @return helpCenterEnabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HELP_CENTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHelpCenterEnabled() {
    return helpCenterEnabled;
  }


  @JsonProperty(JSON_PROPERTY_HELP_CENTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHelpCenterEnabled(@javax.annotation.Nonnull Boolean helpCenterEnabled) {
    this.helpCenterEnabled = helpCenterEnabled;
  }

  public AdditionalWhiteLabelSettingsDto feedbackAndSupportEnabled(@javax.annotation.Nonnull Boolean feedbackAndSupportEnabled) {
    
    this.feedbackAndSupportEnabled = feedbackAndSupportEnabled;
    return this;
  }

  /**
   * Specifies if the Feedback &amp; Support link is available or not.
   * @return feedbackAndSupportEnabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFeedbackAndSupportEnabled() {
    return feedbackAndSupportEnabled;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeedbackAndSupportEnabled(@javax.annotation.Nonnull Boolean feedbackAndSupportEnabled) {
    this.feedbackAndSupportEnabled = feedbackAndSupportEnabled;
  }

  public AdditionalWhiteLabelSettingsDto userForumEnabled(@javax.annotation.Nonnull Boolean userForumEnabled) {
    
    this.userForumEnabled = userForumEnabled;
    return this;
  }

  /**
   * Specifies if the user forum is available or not.
   * @return userForumEnabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_FORUM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUserForumEnabled() {
    return userForumEnabled;
  }


  @JsonProperty(JSON_PROPERTY_USER_FORUM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserForumEnabled(@javax.annotation.Nonnull Boolean userForumEnabled) {
    this.userForumEnabled = userForumEnabled;
  }

  public AdditionalWhiteLabelSettingsDto videoGuidesEnabled(@javax.annotation.Nonnull Boolean videoGuidesEnabled) {
    
    this.videoGuidesEnabled = videoGuidesEnabled;
    return this;
  }

  /**
   * Specifies if the Video Guides link is available or not.
   * @return videoGuidesEnabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VIDEO_GUIDES_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVideoGuidesEnabled() {
    return videoGuidesEnabled;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_GUIDES_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVideoGuidesEnabled(@javax.annotation.Nonnull Boolean videoGuidesEnabled) {
    this.videoGuidesEnabled = videoGuidesEnabled;
  }

  public AdditionalWhiteLabelSettingsDto licenseAgreementsEnabled(@javax.annotation.Nonnull Boolean licenseAgreementsEnabled) {
    
    this.licenseAgreementsEnabled = licenseAgreementsEnabled;
    return this;
  }

  /**
   * Specifies if the License Agreements link is available or not.
   * @return licenseAgreementsEnabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLicenseAgreementsEnabled() {
    return licenseAgreementsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLicenseAgreementsEnabled(@javax.annotation.Nonnull Boolean licenseAgreementsEnabled) {
    this.licenseAgreementsEnabled = licenseAgreementsEnabled;
  }

  public AdditionalWhiteLabelSettingsDto isDefault(@javax.annotation.Nonnull Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Specifies if the additional white label settings are default or not.
   * @return isDefault
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDefault(@javax.annotation.Nonnull Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalWhiteLabelSettingsDto additionalWhiteLabelSettingsDto = (AdditionalWhiteLabelSettingsDto) o;
    return Objects.equals(this.startDocsEnabled, additionalWhiteLabelSettingsDto.startDocsEnabled) &&
        Objects.equals(this.helpCenterEnabled, additionalWhiteLabelSettingsDto.helpCenterEnabled) &&
        Objects.equals(this.feedbackAndSupportEnabled, additionalWhiteLabelSettingsDto.feedbackAndSupportEnabled) &&
        Objects.equals(this.userForumEnabled, additionalWhiteLabelSettingsDto.userForumEnabled) &&
        Objects.equals(this.videoGuidesEnabled, additionalWhiteLabelSettingsDto.videoGuidesEnabled) &&
        Objects.equals(this.licenseAgreementsEnabled, additionalWhiteLabelSettingsDto.licenseAgreementsEnabled) &&
        Objects.equals(this.isDefault, additionalWhiteLabelSettingsDto.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDocsEnabled, helpCenterEnabled, feedbackAndSupportEnabled, userForumEnabled, videoGuidesEnabled, licenseAgreementsEnabled, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalWhiteLabelSettingsDto {\n");
    sb.append("    startDocsEnabled: ").append(toIndentedString(startDocsEnabled)).append("\n");
    sb.append("    helpCenterEnabled: ").append(toIndentedString(helpCenterEnabled)).append("\n");
    sb.append("    feedbackAndSupportEnabled: ").append(toIndentedString(feedbackAndSupportEnabled)).append("\n");
    sb.append("    userForumEnabled: ").append(toIndentedString(userForumEnabled)).append("\n");
    sb.append("    videoGuidesEnabled: ").append(toIndentedString(videoGuidesEnabled)).append("\n");
    sb.append("    licenseAgreementsEnabled: ").append(toIndentedString(licenseAgreementsEnabled)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

    // add `isDefault` to the URL query string
    if (getIsDefault() != null) {
      try {
        joiner.add(String.format("%sisDefault%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDefault()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

