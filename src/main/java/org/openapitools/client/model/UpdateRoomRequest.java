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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ChatSettings;
import org.openapitools.client.model.LogoRequest;
import org.openapitools.client.model.RoomDataLifetimeDto;
import org.openapitools.client.model.WatermarkRequestDto;
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
 * The request parameters for updating a room.
 */
@JsonPropertyOrder({
  UpdateRoomRequest.JSON_PROPERTY_TITLE,
  UpdateRoomRequest.JSON_PROPERTY_QUOTA,
  UpdateRoomRequest.JSON_PROPERTY_INDEXING,
  UpdateRoomRequest.JSON_PROPERTY_DENY_DOWNLOAD,
  UpdateRoomRequest.JSON_PROPERTY_LIFETIME,
  UpdateRoomRequest.JSON_PROPERTY_WATERMARK,
  UpdateRoomRequest.JSON_PROPERTY_LOGO,
  UpdateRoomRequest.JSON_PROPERTY_TAGS,
  UpdateRoomRequest.JSON_PROPERTY_COLOR,
  UpdateRoomRequest.JSON_PROPERTY_COVER,
  UpdateRoomRequest.JSON_PROPERTY_CHAT_SETTINGS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class UpdateRoomRequest {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable
  private JsonNullable<Long> quota = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INDEXING = "indexing";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> indexing = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> denyDownload = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  @javax.annotation.Nullable
  private RoomDataLifetimeDto lifetime;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  @javax.annotation.Nullable
  private WatermarkRequestDto watermark;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable
  private LogoRequest logo;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private JsonNullable<String> color = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COVER = "cover";
  @javax.annotation.Nullable
  private JsonNullable<String> cover = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CHAT_SETTINGS = "chatSettings";
  @javax.annotation.Nullable
  private ChatSettings chatSettings;

  public UpdateRoomRequest() {
  }

  public UpdateRoomRequest title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The room title.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public UpdateRoomRequest quota(@javax.annotation.Nullable Long quota) {
    this.quota = JsonNullable.<Long>of(quota);
    
    return this;
  }

  /**
   * The room quota.
   * @return quota
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getQuota() {
        return quota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getQuota_JsonNullable() {
    return quota;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTA)
  public void setQuota_JsonNullable(JsonNullable<Long> quota) {
    this.quota = quota;
  }

  public void setQuota(@javax.annotation.Nullable Long quota) {
    this.quota = JsonNullable.<Long>of(quota);
  }

  public UpdateRoomRequest indexing(@javax.annotation.Nullable Boolean indexing) {
    this.indexing = JsonNullable.<Boolean>of(indexing);
    
    return this;
  }

  /**
   * Specifies whether to create a third-party room with indexing.
   * @return indexing
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIndexing() {
        return indexing.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INDEXING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIndexing_JsonNullable() {
    return indexing;
  }
  
  @JsonProperty(JSON_PROPERTY_INDEXING)
  public void setIndexing_JsonNullable(JsonNullable<Boolean> indexing) {
    this.indexing = indexing;
  }

  public void setIndexing(@javax.annotation.Nullable Boolean indexing) {
    this.indexing = JsonNullable.<Boolean>of(indexing);
  }

  public UpdateRoomRequest denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = JsonNullable.<Boolean>of(denyDownload);
    
    return this;
  }

  /**
   * Specifies whether to deny downloads from the third-party room.
   * @return denyDownload
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getDenyDownload() {
        return denyDownload.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DENY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getDenyDownload_JsonNullable() {
    return denyDownload;
  }
  
  @JsonProperty(JSON_PROPERTY_DENY_DOWNLOAD)
  public void setDenyDownload_JsonNullable(JsonNullable<Boolean> denyDownload) {
    this.denyDownload = denyDownload;
  }

  public void setDenyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = JsonNullable.<Boolean>of(denyDownload);
  }

  public UpdateRoomRequest lifetime(@javax.annotation.Nullable RoomDataLifetimeDto lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

  /**
   * Get lifetime
   * @return lifetime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoomDataLifetimeDto getLifetime() {
    return lifetime;
  }


  @JsonProperty(JSON_PROPERTY_LIFETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifetime(@javax.annotation.Nullable RoomDataLifetimeDto lifetime) {
    this.lifetime = lifetime;
  }

  public UpdateRoomRequest watermark(@javax.annotation.Nullable WatermarkRequestDto watermark) {
    
    this.watermark = watermark;
    return this;
  }

  /**
   * Get watermark
   * @return watermark
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WATERMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WatermarkRequestDto getWatermark() {
    return watermark;
  }


  @JsonProperty(JSON_PROPERTY_WATERMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermark(@javax.annotation.Nullable WatermarkRequestDto watermark) {
    this.watermark = watermark;
  }

  public UpdateRoomRequest logo(@javax.annotation.Nullable LogoRequest logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogoRequest getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable LogoRequest logo) {
    this.logo = logo;
  }

  public UpdateRoomRequest tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public UpdateRoomRequest addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of tags.
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }

  public UpdateRoomRequest color(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
    
    return this;
  }

  /**
   * The room color.
   * @return color
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getColor() {
        return color.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getColor_JsonNullable() {
    return color;
  }
  
  @JsonProperty(JSON_PROPERTY_COLOR)
  public void setColor_JsonNullable(JsonNullable<String> color) {
    this.color = color;
  }

  public void setColor(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
  }

  public UpdateRoomRequest cover(@javax.annotation.Nullable String cover) {
    this.cover = JsonNullable.<String>of(cover);
    
    return this;
  }

  /**
   * The room cover.
   * @return cover
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCover() {
        return cover.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCover_JsonNullable() {
    return cover;
  }
  
  @JsonProperty(JSON_PROPERTY_COVER)
  public void setCover_JsonNullable(JsonNullable<String> cover) {
    this.cover = cover;
  }

  public void setCover(@javax.annotation.Nullable String cover) {
    this.cover = JsonNullable.<String>of(cover);
  }

  public UpdateRoomRequest chatSettings(@javax.annotation.Nullable ChatSettings chatSettings) {
    
    this.chatSettings = chatSettings;
    return this;
  }

  /**
   * Get chatSettings
   * @return chatSettings
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHAT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChatSettings getChatSettings() {
    return chatSettings;
  }


  @JsonProperty(JSON_PROPERTY_CHAT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChatSettings(@javax.annotation.Nullable ChatSettings chatSettings) {
    this.chatSettings = chatSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRoomRequest updateRoomRequest = (UpdateRoomRequest) o;
    return equalsNullable(this.title, updateRoomRequest.title) &&
        equalsNullable(this.quota, updateRoomRequest.quota) &&
        equalsNullable(this.indexing, updateRoomRequest.indexing) &&
        equalsNullable(this.denyDownload, updateRoomRequest.denyDownload) &&
        Objects.equals(this.lifetime, updateRoomRequest.lifetime) &&
        Objects.equals(this.watermark, updateRoomRequest.watermark) &&
        Objects.equals(this.logo, updateRoomRequest.logo) &&
        equalsNullable(this.tags, updateRoomRequest.tags) &&
        equalsNullable(this.color, updateRoomRequest.color) &&
        equalsNullable(this.cover, updateRoomRequest.cover) &&
        Objects.equals(this.chatSettings, updateRoomRequest.chatSettings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(title), hashCodeNullable(quota), hashCodeNullable(indexing), hashCodeNullable(denyDownload), lifetime, watermark, logo, hashCodeNullable(tags), hashCodeNullable(color), hashCodeNullable(cover), chatSettings);
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
    sb.append("class UpdateRoomRequest {\n");
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
    sb.append("    chatSettings: ").append(toIndentedString(chatSettings)).append("\n");
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
      joiner.add(getLifetime().toUrlQueryString(prefix + "lifetime" + suffix));
    }

    // add `watermark` to the URL query string
    if (getWatermark() != null) {
      joiner.add(getWatermark().toUrlQueryString(prefix + "watermark" + suffix));
    }

    // add `logo` to the URL query string
    if (getLogo() != null) {
      joiner.add(getLogo().toUrlQueryString(prefix + "logo" + suffix));
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

    // add `chatSettings` to the URL query string
    if (getChatSettings() != null) {
      joiner.add(getChatSettings().toUrlQueryString(prefix + "chatSettings" + suffix));
    }

    return joiner.toString();
  }

}

