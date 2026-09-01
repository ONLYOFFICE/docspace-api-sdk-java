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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiAgentsUpdateRequest
 */
@JsonPropertyOrder({
  AiAgentsUpdateRequest.JSON_PROPERTY_PROFILE_ID,
  AiAgentsUpdateRequest.JSON_PROPERTY_CHAT_SETTINGS,
  AiAgentsUpdateRequest.JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B,
  AiAgentsUpdateRequest.JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X,
  AiAgentsUpdateRequest.JSON_PROPERTY_TITLE,
  AiAgentsUpdateRequest.JSON_PROPERTY_QUOTA,
  AiAgentsUpdateRequest.JSON_PROPERTY_INDEXING,
  AiAgentsUpdateRequest.JSON_PROPERTY_DENY_DOWNLOAD,
  AiAgentsUpdateRequest.JSON_PROPERTY_LIFETIME,
  AiAgentsUpdateRequest.JSON_PROPERTY_WATERMARK,
  AiAgentsUpdateRequest.JSON_PROPERTY_LOGO,
  AiAgentsUpdateRequest.JSON_PROPERTY_TAGS,
  AiAgentsUpdateRequest.JSON_PROPERTY_COLOR,
  AiAgentsUpdateRequest.JSON_PROPERTY_COVER
})
@JsonTypeName("aiAgentsUpdate_request")

public class AiAgentsUpdateRequest {
  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nullable  private String profileId;

  public static final String JSON_PROPERTY_CHAT_SETTINGS = "chatSettings";
  @javax.annotation.Nullable  private Object chatSettings;

  public static final String JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B = "sendFormToExternalDB";
  @javax.annotation.Nullable  private Boolean sendFormToExternalDB;

  public static final String JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X = "saveFormAsXLSX";
  @javax.annotation.Nullable  private Boolean saveFormAsXLSX;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable  private BigDecimal quota;

  public static final String JSON_PROPERTY_INDEXING = "indexing";
  @javax.annotation.Nullable  private Boolean indexing;

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable  private Boolean denyDownload;

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  @javax.annotation.Nullable  private Object lifetime;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  @javax.annotation.Nullable  private Object watermark;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable  private Object logo;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable  private String color;

  public static final String JSON_PROPERTY_COVER = "cover";
  @javax.annotation.Nullable  private String cover;

  public AiAgentsUpdateRequest() {
  }


  public AiAgentsUpdateRequest profileId(@javax.annotation.Nullable String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * Profile id to rebind (optional).
   * @return profileId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileId(@javax.annotation.Nullable String profileId) {
    this.profileId = profileId;
  }

  public AiAgentsUpdateRequest chatSettings(@javax.annotation.Nullable Object chatSettings) {
    
    this.chatSettings = chatSettings;
    return this;
  }

  /**
   * Chat settings (`ChatSettings`); requires a valid provider/model.
   * @return chatSettings
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CHAT_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getChatSettings() {
    return chatSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAT_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChatSettings(@javax.annotation.Nullable Object chatSettings) {
    this.chatSettings = chatSettings;
  }

  public AiAgentsUpdateRequest sendFormToExternalDB(@javax.annotation.Nullable Boolean sendFormToExternalDB) {
    
    this.sendFormToExternalDB = sendFormToExternalDB;
    return this;
  }

  /**
   * Whether form results are sent to an external DB.
   * @return sendFormToExternalDB
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSendFormToExternalDB() {
    return sendFormToExternalDB;
  }


  @JsonProperty(value = JSON_PROPERTY_SEND_FORM_TO_EXTERNAL_D_B, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendFormToExternalDB(@javax.annotation.Nullable Boolean sendFormToExternalDB) {
    this.sendFormToExternalDB = sendFormToExternalDB;
  }

  public AiAgentsUpdateRequest saveFormAsXLSX(@javax.annotation.Nullable Boolean saveFormAsXLSX) {
    
    this.saveFormAsXLSX = saveFormAsXLSX;
    return this;
  }

  /**
   * Whether forms are saved as XLSX.
   * @return saveFormAsXLSX
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSaveFormAsXLSX() {
    return saveFormAsXLSX;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_FORM_AS_X_L_S_X, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveFormAsXLSX(@javax.annotation.Nullable Boolean saveFormAsXLSX) {
    this.saveFormAsXLSX = saveFormAsXLSX;
  }

  public AiAgentsUpdateRequest title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Agent (room) title.
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public AiAgentsUpdateRequest quota(@javax.annotation.Nullable BigDecimal quota) {
    
    this.quota = quota;
    return this;
  }

  /**
   * Room quota in bytes.
   * @return quota
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuota() {
    return quota;
  }


  @JsonProperty(value = JSON_PROPERTY_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuota(@javax.annotation.Nullable BigDecimal quota) {
    this.quota = quota;
  }

  public AiAgentsUpdateRequest indexing(@javax.annotation.Nullable Boolean indexing) {
    
    this.indexing = indexing;
    return this;
  }

  /**
   * Whether room content is indexed for search.
   * @return indexing
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INDEXING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIndexing() {
    return indexing;
  }


  @JsonProperty(value = JSON_PROPERTY_INDEXING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexing(@javax.annotation.Nullable Boolean indexing) {
    this.indexing = indexing;
  }

  public AiAgentsUpdateRequest denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    
    this.denyDownload = denyDownload;
    return this;
  }

  /**
   * Whether downloading room content is denied.
   * @return denyDownload
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDenyDownload() {
    return denyDownload;
  }


  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDenyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = denyDownload;
  }

  public AiAgentsUpdateRequest lifetime(@javax.annotation.Nullable Object lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

  /**
   * Room data lifetime policy (`RoomDataLifetimeDto`).
   * @return lifetime
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getLifetime() {
    return lifetime;
  }


  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifetime(@javax.annotation.Nullable Object lifetime) {
    this.lifetime = lifetime;
  }

  public AiAgentsUpdateRequest watermark(@javax.annotation.Nullable Object watermark) {
    
    this.watermark = watermark;
    return this;
  }

  /**
   * Watermark settings (`WatermarkRequestDto`).
   * @return watermark
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getWatermark() {
    return watermark;
  }


  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermark(@javax.annotation.Nullable Object watermark) {
    this.watermark = watermark;
  }

  public AiAgentsUpdateRequest logo(@javax.annotation.Nullable Object logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * Room logo (`LogoRequest`).
   * @return logo
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getLogo() {
    return logo;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable Object logo) {
    this.logo = logo;
  }

  public AiAgentsUpdateRequest tags(@javax.annotation.Nullable List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AiAgentsUpdateRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Room tags.
   * @return tags
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }

  public AiAgentsUpdateRequest color(@javax.annotation.Nullable String color) {
    
    this.color = color;
    return this;
  }

  /**
   * Room accent color.
   * @return color
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(@javax.annotation.Nullable String color) {
    this.color = color;
  }

  public AiAgentsUpdateRequest cover(@javax.annotation.Nullable String cover) {
    
    this.cover = cover;
    return this;
  }

  /**
   * Room cover image id.
   * @return cover
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COVER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCover() {
    return cover;
  }


  @JsonProperty(value = JSON_PROPERTY_COVER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCover(@javax.annotation.Nullable String cover) {
    this.cover = cover;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAgentsUpdateRequest aiAgentsUpdateRequest = (AiAgentsUpdateRequest) o;
    return Objects.equals(this.profileId, aiAgentsUpdateRequest.profileId) &&
        Objects.equals(this.chatSettings, aiAgentsUpdateRequest.chatSettings) &&
        Objects.equals(this.sendFormToExternalDB, aiAgentsUpdateRequest.sendFormToExternalDB) &&
        Objects.equals(this.saveFormAsXLSX, aiAgentsUpdateRequest.saveFormAsXLSX) &&
        Objects.equals(this.title, aiAgentsUpdateRequest.title) &&
        Objects.equals(this.quota, aiAgentsUpdateRequest.quota) &&
        Objects.equals(this.indexing, aiAgentsUpdateRequest.indexing) &&
        Objects.equals(this.denyDownload, aiAgentsUpdateRequest.denyDownload) &&
        Objects.equals(this.lifetime, aiAgentsUpdateRequest.lifetime) &&
        Objects.equals(this.watermark, aiAgentsUpdateRequest.watermark) &&
        Objects.equals(this.logo, aiAgentsUpdateRequest.logo) &&
        Objects.equals(this.tags, aiAgentsUpdateRequest.tags) &&
        Objects.equals(this.color, aiAgentsUpdateRequest.color) &&
        Objects.equals(this.cover, aiAgentsUpdateRequest.cover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, chatSettings, sendFormToExternalDB, saveFormAsXLSX, title, quota, indexing, denyDownload, lifetime, watermark, logo, tags, color, cover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAgentsUpdateRequest {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    chatSettings: ").append(toIndentedString(chatSettings)).append("\n");
    sb.append("    sendFormToExternalDB: ").append(toIndentedString(sendFormToExternalDB)).append("\n");
    sb.append("    saveFormAsXLSX: ").append(toIndentedString(saveFormAsXLSX)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    indexing: ").append(toIndentedString(indexing)).append("\n");
    sb.append("    denyDownload: ").append(toIndentedString(denyDownload)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
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

    // add `profileId` to the URL query string
    if (getProfileId() != null) {
      try {
        joiner.add(String.format("%sprofileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `chatSettings` to the URL query string
    if (getChatSettings() != null) {
      try {
        joiner.add(String.format("%schatSettings%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChatSettings()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sendFormToExternalDB` to the URL query string
    if (getSendFormToExternalDB() != null) {
      try {
        joiner.add(String.format("%ssendFormToExternalDB%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSendFormToExternalDB()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saveFormAsXLSX` to the URL query string
    if (getSaveFormAsXLSX() != null) {
      try {
        joiner.add(String.format("%ssaveFormAsXLSX%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaveFormAsXLSX()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quota` to the URL query string
    if (getQuota() != null) {
      try {
        joiner.add(String.format("%squota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `indexing` to the URL query string
    if (getIndexing() != null) {
      try {
        joiner.add(String.format("%sindexing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndexing()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `denyDownload` to the URL query string
    if (getDenyDownload() != null) {
      try {
        joiner.add(String.format("%sdenyDownload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDenyDownload()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lifetime` to the URL query string
    if (getLifetime() != null) {
      try {
        joiner.add(String.format("%slifetime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLifetime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `watermark` to the URL query string
    if (getWatermark() != null) {
      try {
        joiner.add(String.format("%swatermark%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWatermark()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logo` to the URL query string
    if (getLogo() != null) {
      try {
        joiner.add(String.format("%slogo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        try {
          joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTags().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      try {
        joiner.add(String.format("%scolor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getColor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cover` to the URL query string
    if (getCover() != null) {
      try {
        joiner.add(String.format("%scover%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCover()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

