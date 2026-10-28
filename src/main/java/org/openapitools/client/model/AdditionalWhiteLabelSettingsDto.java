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
 * Which of the ONLYOFFICE help and community entries the interface may offer, installation-wide.
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

public class AdditionalWhiteLabelSettingsDto {
  public static final String JSON_PROPERTY_START_DOCS_ENABLED = "startDocsEnabled";
  @javax.annotation.Nonnull  private Boolean startDocsEnabled;

  public static final String JSON_PROPERTY_HELP_CENTER_ENABLED = "helpCenterEnabled";
  @javax.annotation.Nonnull  private Boolean helpCenterEnabled;

  public static final String JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED = "feedbackAndSupportEnabled";
  @javax.annotation.Nonnull  private Boolean feedbackAndSupportEnabled;

  public static final String JSON_PROPERTY_USER_FORUM_ENABLED = "userForumEnabled";
  @javax.annotation.Nonnull  private Boolean userForumEnabled;

  public static final String JSON_PROPERTY_VIDEO_GUIDES_ENABLED = "videoGuidesEnabled";
  @javax.annotation.Nonnull  private Boolean videoGuidesEnabled;

  public static final String JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED = "licenseAgreementsEnabled";
  @javax.annotation.Nonnull  private Boolean licenseAgreementsEnabled;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  @javax.annotation.Nonnull  private Boolean isDefault;

  public AdditionalWhiteLabelSettingsDto() {
  }


  public AdditionalWhiteLabelSettingsDto startDocsEnabled(@javax.annotation.Nonnull Boolean startDocsEnabled) {
    
    this.startDocsEnabled = startDocsEnabled;
    return this;
  }

  /**
   * Whether the sample documents that ONLYOFFICE ships may be placed in a new user's Documents. Unlike the link  flags below it depends on nothing that has to be configured, so its built-in value is always `true`.
   * @return startDocsEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_START_DOCS_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getStartDocsEnabled() {
    return startDocsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_START_DOCS_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDocsEnabled(@javax.annotation.Nonnull Boolean startDocsEnabled) {
    this.startDocsEnabled = startDocsEnabled;
  }

  public AdditionalWhiteLabelSettingsDto helpCenterEnabled(@javax.annotation.Nonnull Boolean helpCenterEnabled) {
    
    this.helpCenterEnabled = helpCenterEnabled;
    return this;
  }

  /**
   * Whether the interface may offer the Help Center entry. It is `false` both when the entry was switched off  for the installation and when the installation configures no Help Center address at all; the addresses  themselves are not part of this answer and arrive in `externalResources` of `GET api/2.0/settings`.
   * @return helpCenterEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_HELP_CENTER_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHelpCenterEnabled() {
    return helpCenterEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_HELP_CENTER_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHelpCenterEnabled(@javax.annotation.Nonnull Boolean helpCenterEnabled) {
    this.helpCenterEnabled = helpCenterEnabled;
  }

  public AdditionalWhiteLabelSettingsDto feedbackAndSupportEnabled(@javax.annotation.Nonnull Boolean feedbackAndSupportEnabled) {
    
    this.feedbackAndSupportEnabled = feedbackAndSupportEnabled;
    return this;
  }

  /**
   * Whether the interface may offer the Feedback and Support entry, `false` for the same two reasons as  `helpCenterEnabled`.
   * @return feedbackAndSupportEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFeedbackAndSupportEnabled() {
    return feedbackAndSupportEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_FEEDBACK_AND_SUPPORT_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeedbackAndSupportEnabled(@javax.annotation.Nonnull Boolean feedbackAndSupportEnabled) {
    this.feedbackAndSupportEnabled = feedbackAndSupportEnabled;
  }

  public AdditionalWhiteLabelSettingsDto userForumEnabled(@javax.annotation.Nonnull Boolean userForumEnabled) {
    
    this.userForumEnabled = userForumEnabled;
    return this;
  }

  /**
   * Whether the interface may offer the user forum entry, `false` for the same two reasons as  `helpCenterEnabled`.
   * @return userForumEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_USER_FORUM_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUserForumEnabled() {
    return userForumEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_FORUM_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserForumEnabled(@javax.annotation.Nonnull Boolean userForumEnabled) {
    this.userForumEnabled = userForumEnabled;
  }

  public AdditionalWhiteLabelSettingsDto videoGuidesEnabled(@javax.annotation.Nonnull Boolean videoGuidesEnabled) {
    
    this.videoGuidesEnabled = videoGuidesEnabled;
    return this;
  }

  /**
   * Whether the interface may offer the Video Guides entry, `false` for the same two reasons as  `helpCenterEnabled`.
   * @return videoGuidesEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_VIDEO_GUIDES_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVideoGuidesEnabled() {
    return videoGuidesEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_VIDEO_GUIDES_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVideoGuidesEnabled(@javax.annotation.Nonnull Boolean videoGuidesEnabled) {
    this.videoGuidesEnabled = videoGuidesEnabled;
  }

  public AdditionalWhiteLabelSettingsDto licenseAgreementsEnabled(@javax.annotation.Nonnull Boolean licenseAgreementsEnabled) {
    
    this.licenseAgreementsEnabled = licenseAgreementsEnabled;
    return this;
  }

  /**
   * Whether the interface may offer the License Agreements entry, `false` for the same two reasons as  `helpCenterEnabled`.
   * @return licenseAgreementsEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLicenseAgreementsEnabled() {
    return licenseAgreementsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_LICENSE_AGREEMENTS_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLicenseAgreementsEnabled(@javax.annotation.Nonnull Boolean licenseAgreementsEnabled) {
    this.licenseAgreementsEnabled = licenseAgreementsEnabled;
  }

  public AdditionalWhiteLabelSettingsDto isDefault(@javax.annotation.Nonnull Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether all six flags still hold the values the installation starts out with. It turns `false` as soon as  one of them is saved differently and `true` again after `DELETE api/2.0/settings/rebranding/additional`.  Because a link flag starts out off when no address is configured for it, `true` does not mean every entry  is on.
   * @return isDefault
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_IS_DEFAULT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_DEFAULT, required = true)
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

