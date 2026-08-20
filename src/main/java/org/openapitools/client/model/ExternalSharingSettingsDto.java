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
 * The Access Control external sharing settings.
 */
@JsonPropertyOrder({
  ExternalSharingSettingsDto.JSON_PROPERTY_EXTERNAL_SHARE,
  ExternalSharingSettingsDto.JSON_PROPERTY_DEFAULT_SHARE_LINK_INTERNAL,
  ExternalSharingSettingsDto.JSON_PROPERTY_EXTERNAL_SHARE_APPLY_TO_DOCUMENTS,
  ExternalSharingSettingsDto.JSON_PROPERTY_EXTERNAL_SHARE_APPLY_TO_ROOMS,
  ExternalSharingSettingsDto.JSON_PROPERTY_BLOCK_EXISTING_LINKS_ON_RESTRICT
})

public class ExternalSharingSettingsDto {
  public static final String JSON_PROPERTY_EXTERNAL_SHARE = "externalShare";
  @javax.annotation.Nullable  private Boolean externalShare;

  public static final String JSON_PROPERTY_DEFAULT_SHARE_LINK_INTERNAL = "defaultShareLinkInternal";
  @javax.annotation.Nullable  private Boolean defaultShareLinkInternal;

  public static final String JSON_PROPERTY_EXTERNAL_SHARE_APPLY_TO_DOCUMENTS = "externalShareApplyToDocuments";
  @javax.annotation.Nullable  private Boolean externalShareApplyToDocuments;

  public static final String JSON_PROPERTY_EXTERNAL_SHARE_APPLY_TO_ROOMS = "externalShareApplyToRooms";
  @javax.annotation.Nullable  private Boolean externalShareApplyToRooms;

  public static final String JSON_PROPERTY_BLOCK_EXISTING_LINKS_ON_RESTRICT = "blockExistingLinksOnRestrict";
  @javax.annotation.Nullable  private Boolean blockExistingLinksOnRestrict;

  public ExternalSharingSettingsDto() {
  }


  public ExternalSharingSettingsDto externalShare(@javax.annotation.Nullable Boolean externalShare) {
    
    this.externalShare = externalShare;
    return this;
  }

  /**
   * Specifies whether external (public) link creation is allowed.
   * @return externalShare
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternalShare() {
    return externalShare;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalShare(@javax.annotation.Nullable Boolean externalShare) {
    this.externalShare = externalShare;
  }

  public ExternalSharingSettingsDto defaultShareLinkInternal(@javax.annotation.Nullable Boolean defaultShareLinkInternal) {
    
    this.defaultShareLinkInternal = defaultShareLinkInternal;
    return this;
  }

  /**
   * Specifies the default sharing link type: true = DocSpace users only, false = Anyone with the link.
   * @return defaultShareLinkInternal
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEFAULT_SHARE_LINK_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultShareLinkInternal() {
    return defaultShareLinkInternal;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_SHARE_LINK_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultShareLinkInternal(@javax.annotation.Nullable Boolean defaultShareLinkInternal) {
    this.defaultShareLinkInternal = defaultShareLinkInternal;
  }

  public ExternalSharingSettingsDto externalShareApplyToDocuments(@javax.annotation.Nullable Boolean externalShareApplyToDocuments) {
    
    this.externalShareApplyToDocuments = externalShareApplyToDocuments;
    return this;
  }

  /**
   * When external sharing is restricted, specifies whether the restriction applies to the My Documents section.
   * @return externalShareApplyToDocuments
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE_APPLY_TO_DOCUMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternalShareApplyToDocuments() {
    return externalShareApplyToDocuments;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE_APPLY_TO_DOCUMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalShareApplyToDocuments(@javax.annotation.Nullable Boolean externalShareApplyToDocuments) {
    this.externalShareApplyToDocuments = externalShareApplyToDocuments;
  }

  public ExternalSharingSettingsDto externalShareApplyToRooms(@javax.annotation.Nullable Boolean externalShareApplyToRooms) {
    
    this.externalShareApplyToRooms = externalShareApplyToRooms;
    return this;
  }

  /**
   * When external sharing is restricted, specifies whether the restriction applies to the Rooms section.
   * @return externalShareApplyToRooms
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE_APPLY_TO_ROOMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternalShareApplyToRooms() {
    return externalShareApplyToRooms;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_SHARE_APPLY_TO_ROOMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalShareApplyToRooms(@javax.annotation.Nullable Boolean externalShareApplyToRooms) {
    this.externalShareApplyToRooms = externalShareApplyToRooms;
  }

  public ExternalSharingSettingsDto blockExistingLinksOnRestrict(@javax.annotation.Nullable Boolean blockExistingLinksOnRestrict) {
    
    this.blockExistingLinksOnRestrict = blockExistingLinksOnRestrict;
    return this;
  }

  /**
   * When external sharing is restricted, specifies whether existing public links are blocked immediately.
   * @return blockExistingLinksOnRestrict
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_BLOCK_EXISTING_LINKS_ON_RESTRICT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBlockExistingLinksOnRestrict() {
    return blockExistingLinksOnRestrict;
  }


  @JsonProperty(value = JSON_PROPERTY_BLOCK_EXISTING_LINKS_ON_RESTRICT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockExistingLinksOnRestrict(@javax.annotation.Nullable Boolean blockExistingLinksOnRestrict) {
    this.blockExistingLinksOnRestrict = blockExistingLinksOnRestrict;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalSharingSettingsDto externalSharingSettingsDto = (ExternalSharingSettingsDto) o;
    return Objects.equals(this.externalShare, externalSharingSettingsDto.externalShare) &&
        Objects.equals(this.defaultShareLinkInternal, externalSharingSettingsDto.defaultShareLinkInternal) &&
        Objects.equals(this.externalShareApplyToDocuments, externalSharingSettingsDto.externalShareApplyToDocuments) &&
        Objects.equals(this.externalShareApplyToRooms, externalSharingSettingsDto.externalShareApplyToRooms) &&
        Objects.equals(this.blockExistingLinksOnRestrict, externalSharingSettingsDto.blockExistingLinksOnRestrict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalShare, defaultShareLinkInternal, externalShareApplyToDocuments, externalShareApplyToRooms, blockExistingLinksOnRestrict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalSharingSettingsDto {\n");
    sb.append("    externalShare: ").append(toIndentedString(externalShare)).append("\n");
    sb.append("    defaultShareLinkInternal: ").append(toIndentedString(defaultShareLinkInternal)).append("\n");
    sb.append("    externalShareApplyToDocuments: ").append(toIndentedString(externalShareApplyToDocuments)).append("\n");
    sb.append("    externalShareApplyToRooms: ").append(toIndentedString(externalShareApplyToRooms)).append("\n");
    sb.append("    blockExistingLinksOnRestrict: ").append(toIndentedString(blockExistingLinksOnRestrict)).append("\n");
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

    // add `externalShare` to the URL query string
    if (getExternalShare() != null) {
      try {
        joiner.add(String.format("%sexternalShare%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalShare()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultShareLinkInternal` to the URL query string
    if (getDefaultShareLinkInternal() != null) {
      try {
        joiner.add(String.format("%sdefaultShareLinkInternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultShareLinkInternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalShareApplyToDocuments` to the URL query string
    if (getExternalShareApplyToDocuments() != null) {
      try {
        joiner.add(String.format("%sexternalShareApplyToDocuments%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalShareApplyToDocuments()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalShareApplyToRooms` to the URL query string
    if (getExternalShareApplyToRooms() != null) {
      try {
        joiner.add(String.format("%sexternalShareApplyToRooms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalShareApplyToRooms()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `blockExistingLinksOnRestrict` to the URL query string
    if (getBlockExistingLinksOnRestrict() != null) {
      try {
        joiner.add(String.format("%sblockExistingLinksOnRestrict%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBlockExistingLinksOnRestrict()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

