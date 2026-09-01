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
 * AiAgentsCreateRequest
 */
@JsonPropertyOrder({
  AiAgentsCreateRequest.JSON_PROPERTY_PROFILE_ID,
  AiAgentsCreateRequest.JSON_PROPERTY_PROMPT,
  AiAgentsCreateRequest.JSON_PROPERTY_PRIVATE,
  AiAgentsCreateRequest.JSON_PROPERTY_SHARE,
  AiAgentsCreateRequest.JSON_PROPERTY_ATTACH_DEFAULT_TOOLS,
  AiAgentsCreateRequest.JSON_PROPERTY_TITLE,
  AiAgentsCreateRequest.JSON_PROPERTY_QUOTA,
  AiAgentsCreateRequest.JSON_PROPERTY_INDEXING,
  AiAgentsCreateRequest.JSON_PROPERTY_DENY_DOWNLOAD,
  AiAgentsCreateRequest.JSON_PROPERTY_LIFETIME,
  AiAgentsCreateRequest.JSON_PROPERTY_WATERMARK,
  AiAgentsCreateRequest.JSON_PROPERTY_LOGO,
  AiAgentsCreateRequest.JSON_PROPERTY_TAGS,
  AiAgentsCreateRequest.JSON_PROPERTY_COLOR,
  AiAgentsCreateRequest.JSON_PROPERTY_COVER
})
@JsonTypeName("aiAgentsCreate_request")

public class AiAgentsCreateRequest {
  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nonnull  private String profileId;

  public static final String JSON_PROPERTY_PROMPT = "prompt";
  @javax.annotation.Nonnull  private String prompt;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  @javax.annotation.Nullable  private Boolean _private;

  public static final String JSON_PROPERTY_SHARE = "share";
  @javax.annotation.Nullable  private List<Object> share = new ArrayList<>();

  public static final String JSON_PROPERTY_ATTACH_DEFAULT_TOOLS = "attachDefaultTools";
  @javax.annotation.Nullable  private Boolean attachDefaultTools;

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

  public AiAgentsCreateRequest() {
  }


  public AiAgentsCreateRequest profileId(@javax.annotation.Nonnull String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * Profile id bound to the agent.
   * @return profileId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileId(@javax.annotation.Nonnull String profileId) {
    this.profileId = profileId;
  }

  public AiAgentsCreateRequest prompt(@javax.annotation.Nonnull String prompt) {
    
    this.prompt = prompt;
    return this;
  }

  /**
   * Agent system prompt; stored as the room's `chatSettings.prompt`.
   * @return prompt
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrompt() {
    return prompt;
  }


  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrompt(@javax.annotation.Nonnull String prompt) {
    this.prompt = prompt;
  }

  public AiAgentsCreateRequest _private(@javax.annotation.Nullable Boolean _private) {
    
    this._private = _private;
    return this;
  }

  /**
   * Whether the agent room is private.
   * @return _private
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRIVATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrivate() {
    return _private;
  }


  @JsonProperty(value = JSON_PROPERTY_PRIVATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivate(@javax.annotation.Nullable Boolean _private) {
    this._private = _private;
  }

  public AiAgentsCreateRequest share(@javax.annotation.Nullable List<Object> share) {
    
    this.share = share;
    return this;
  }

  public AiAgentsCreateRequest addShareItem(Object shareItem) {
    if (this.share == null) {
      this.share = new ArrayList<>();
    }
    this.share.add(shareItem);
    return this;
  }

  /**
   * Initial share entries (`FileShareParams`).
   * @return share
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getShare() {
    return share;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShare(@javax.annotation.Nullable List<Object> share) {
    this.share = share;
  }

  public AiAgentsCreateRequest attachDefaultTools(@javax.annotation.Nullable Boolean attachDefaultTools) {
    
    this.attachDefaultTools = attachDefaultTools;
    return this;
  }

  /**
   * Whether to attach the default DocSpace MCP tool server.
   * @return attachDefaultTools
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ATTACH_DEFAULT_TOOLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAttachDefaultTools() {
    return attachDefaultTools;
  }


  @JsonProperty(value = JSON_PROPERTY_ATTACH_DEFAULT_TOOLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachDefaultTools(@javax.annotation.Nullable Boolean attachDefaultTools) {
    this.attachDefaultTools = attachDefaultTools;
  }

  public AiAgentsCreateRequest title(@javax.annotation.Nullable String title) {
    
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

  public AiAgentsCreateRequest quota(@javax.annotation.Nullable BigDecimal quota) {
    
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

  public AiAgentsCreateRequest indexing(@javax.annotation.Nullable Boolean indexing) {
    
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

  public AiAgentsCreateRequest denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    
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

  public AiAgentsCreateRequest lifetime(@javax.annotation.Nullable Object lifetime) {
    
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

  public AiAgentsCreateRequest watermark(@javax.annotation.Nullable Object watermark) {
    
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

  public AiAgentsCreateRequest logo(@javax.annotation.Nullable Object logo) {
    
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

  public AiAgentsCreateRequest tags(@javax.annotation.Nullable List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AiAgentsCreateRequest addTagsItem(String tagsItem) {
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

  public AiAgentsCreateRequest color(@javax.annotation.Nullable String color) {
    
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

  public AiAgentsCreateRequest cover(@javax.annotation.Nullable String cover) {
    
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
    AiAgentsCreateRequest aiAgentsCreateRequest = (AiAgentsCreateRequest) o;
    return Objects.equals(this.profileId, aiAgentsCreateRequest.profileId) &&
        Objects.equals(this.prompt, aiAgentsCreateRequest.prompt) &&
        Objects.equals(this._private, aiAgentsCreateRequest._private) &&
        Objects.equals(this.share, aiAgentsCreateRequest.share) &&
        Objects.equals(this.attachDefaultTools, aiAgentsCreateRequest.attachDefaultTools) &&
        Objects.equals(this.title, aiAgentsCreateRequest.title) &&
        Objects.equals(this.quota, aiAgentsCreateRequest.quota) &&
        Objects.equals(this.indexing, aiAgentsCreateRequest.indexing) &&
        Objects.equals(this.denyDownload, aiAgentsCreateRequest.denyDownload) &&
        Objects.equals(this.lifetime, aiAgentsCreateRequest.lifetime) &&
        Objects.equals(this.watermark, aiAgentsCreateRequest.watermark) &&
        Objects.equals(this.logo, aiAgentsCreateRequest.logo) &&
        Objects.equals(this.tags, aiAgentsCreateRequest.tags) &&
        Objects.equals(this.color, aiAgentsCreateRequest.color) &&
        Objects.equals(this.cover, aiAgentsCreateRequest.cover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, prompt, _private, share, attachDefaultTools, title, quota, indexing, denyDownload, lifetime, watermark, logo, tags, color, cover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAgentsCreateRequest {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    attachDefaultTools: ").append(toIndentedString(attachDefaultTools)).append("\n");
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

    // add `prompt` to the URL query string
    if (getPrompt() != null) {
      try {
        joiner.add(String.format("%sprompt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrompt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `private` to the URL query string
    if (getPrivate() != null) {
      try {
        joiner.add(String.format("%sprivate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrivate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `share` to the URL query string
    if (getShare() != null) {
      for (int i = 0; i < getShare().size(); i++) {
        try {
          joiner.add(String.format("%sshare%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getShare().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `attachDefaultTools` to the URL query string
    if (getAttachDefaultTools() != null) {
      try {
        joiner.add(String.format("%sattachDefaultTools%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAttachDefaultTools()), "UTF-8").replaceAll("\\+", "%20")));
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

