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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * The parameters for creating a room from a template.
 */
@JsonPropertyOrder({
  CreateRoomFromTemplateDto.JSON_PROPERTY_TEMPLATE_ID,
  CreateRoomFromTemplateDto.JSON_PROPERTY_TITLE,
  CreateRoomFromTemplateDto.JSON_PROPERTY_LOGO,
  CreateRoomFromTemplateDto.JSON_PROPERTY_COPY_LOGO,
  CreateRoomFromTemplateDto.JSON_PROPERTY_TAGS,
  CreateRoomFromTemplateDto.JSON_PROPERTY_COLOR,
  CreateRoomFromTemplateDto.JSON_PROPERTY_COVER,
  CreateRoomFromTemplateDto.JSON_PROPERTY_QUOTA,
  CreateRoomFromTemplateDto.JSON_PROPERTY_INDEXING,
  CreateRoomFromTemplateDto.JSON_PROPERTY_DENY_DOWNLOAD,
  CreateRoomFromTemplateDto.JSON_PROPERTY_LIFETIME,
  CreateRoomFromTemplateDto.JSON_PROPERTY_WATERMARK,
  CreateRoomFromTemplateDto.JSON_PROPERTY_PRIVATE
})

public class CreateRoomFromTemplateDto {
  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  @javax.annotation.Nonnull  private Integer templateId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable  private LogoRequest logo;

  public static final String JSON_PROPERTY_COPY_LOGO = "copyLogo";
  @javax.annotation.Nullable  private Boolean copyLogo;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nullable  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable  private JsonNullable<String> color = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COVER = "cover";
  @javax.annotation.Nullable  private JsonNullable<String> cover = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable  private JsonNullable<Long> quota = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INDEXING = "indexing";
  @javax.annotation.Nullable  private JsonNullable<Boolean> indexing = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DENY_DOWNLOAD = "denyDownload";
  @javax.annotation.Nullable  private JsonNullable<Boolean> denyDownload = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  @javax.annotation.Nullable  private RoomDataLifetimeDto lifetime;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  @javax.annotation.Nullable  private WatermarkRequestDto watermark;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  @javax.annotation.Nullable  private JsonNullable<Boolean> _private = JsonNullable.<Boolean>undefined();

  public CreateRoomFromTemplateDto() {
  }


  public CreateRoomFromTemplateDto templateId(@javax.annotation.Nonnull Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

  /**
   * The template ID from which the room to be created.
   * @return templateId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTemplateId() {
    return templateId;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateId(@javax.annotation.Nonnull Integer templateId) {
    this.templateId = templateId;
  }

  public CreateRoomFromTemplateDto title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The room title.
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public CreateRoomFromTemplateDto logo(@javax.annotation.Nullable LogoRequest logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogoRequest getLogo() {
    return logo;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable LogoRequest logo) {
    this.logo = logo;
  }

  public CreateRoomFromTemplateDto copyLogo(@javax.annotation.Nullable Boolean copyLogo) {
    
    this.copyLogo = copyLogo;
    return this;
  }

  /**
   * Specifies whether to copy a logo or not.
   * @return copyLogo
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COPY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopyLogo() {
    return copyLogo;
  }


  @JsonProperty(value = JSON_PROPERTY_COPY_LOGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopyLogo(@javax.annotation.Nullable Boolean copyLogo) {
    this.copyLogo = copyLogo;
  }

  public CreateRoomFromTemplateDto tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    
    return this;
  }

  public CreateRoomFromTemplateDto addTagsItem(String tagsItem) {
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
   * The collection of tags.
   * @return tags
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TAGS, required = false)
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

  public CreateRoomFromTemplateDto color(@javax.annotation.Nullable String color) {
    this.color = JsonNullable.<String>of(color);
    
    return this;
  }

  /**
   * The color of the room to be created.
   * @return color
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getColor() {
        return color.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
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

  public CreateRoomFromTemplateDto cover(@javax.annotation.Nullable String cover) {
    this.cover = JsonNullable.<String>of(cover);
    
    return this;
  }

  /**
   * The cover of the room to be created.
   * @return cover
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCover() {
        return cover.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COVER, required = false)
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

  public CreateRoomFromTemplateDto quota(@javax.annotation.Nullable Long quota) {
    this.quota = JsonNullable.<Long>of(quota);
    
    return this;
  }

  /**
   * The room quota.
   * @return quota
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Long getQuota() {
        return quota.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_QUOTA, required = false)
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

  public CreateRoomFromTemplateDto indexing(@javax.annotation.Nullable Boolean indexing) {
    this.indexing = JsonNullable.<Boolean>of(indexing);
    
    return this;
  }

  /**
   * Specifies whether to create a room with indexing.
   * @return indexing
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIndexing() {
        return indexing.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INDEXING, required = false)
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

  public CreateRoomFromTemplateDto denyDownload(@javax.annotation.Nullable Boolean denyDownload) {
    this.denyDownload = JsonNullable.<Boolean>of(denyDownload);
    
    return this;
  }

  /**
   * Specifies whether to deny downloads from the room.
   * @return denyDownload
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDenyDownload() {
        return denyDownload.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DENY_DOWNLOAD, required = false)
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

  public CreateRoomFromTemplateDto lifetime(@javax.annotation.Nullable RoomDataLifetimeDto lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

  /**
   * Get lifetime
   * @return lifetime
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoomDataLifetimeDto getLifetime() {
    return lifetime;
  }


  @JsonProperty(value = JSON_PROPERTY_LIFETIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifetime(@javax.annotation.Nullable RoomDataLifetimeDto lifetime) {
    this.lifetime = lifetime;
  }

  public CreateRoomFromTemplateDto watermark(@javax.annotation.Nullable WatermarkRequestDto watermark) {
    
    this.watermark = watermark;
    return this;
  }

  /**
   * Get watermark
   * @return watermark
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WatermarkRequestDto getWatermark() {
    return watermark;
  }


  @JsonProperty(value = JSON_PROPERTY_WATERMARK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermark(@javax.annotation.Nullable WatermarkRequestDto watermark) {
    this.watermark = watermark;
  }

  public CreateRoomFromTemplateDto _private(@javax.annotation.Nullable Boolean _private) {
    this._private = JsonNullable.<Boolean>of(_private);
    
    return this;
  }

  /**
   * Specifies whether the room to be created is private or not.
   * @return _private
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getPrivate() {
        return _private.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PRIVATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getPrivate_JsonNullable() {
    return _private;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIVATE)
  public void setPrivate_JsonNullable(JsonNullable<Boolean> _private) {
    this._private = _private;
  }

  public void setPrivate(@javax.annotation.Nullable Boolean _private) {
    this._private = JsonNullable.<Boolean>of(_private);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoomFromTemplateDto createRoomFromTemplateDto = (CreateRoomFromTemplateDto) o;
    return Objects.equals(this.templateId, createRoomFromTemplateDto.templateId) &&
        Objects.equals(this.title, createRoomFromTemplateDto.title) &&
        Objects.equals(this.logo, createRoomFromTemplateDto.logo) &&
        Objects.equals(this.copyLogo, createRoomFromTemplateDto.copyLogo) &&
        equalsNullable(this.tags, createRoomFromTemplateDto.tags) &&
        equalsNullable(this.color, createRoomFromTemplateDto.color) &&
        equalsNullable(this.cover, createRoomFromTemplateDto.cover) &&
        equalsNullable(this.quota, createRoomFromTemplateDto.quota) &&
        equalsNullable(this.indexing, createRoomFromTemplateDto.indexing) &&
        equalsNullable(this.denyDownload, createRoomFromTemplateDto.denyDownload) &&
        Objects.equals(this.lifetime, createRoomFromTemplateDto.lifetime) &&
        Objects.equals(this.watermark, createRoomFromTemplateDto.watermark) &&
        equalsNullable(this._private, createRoomFromTemplateDto._private);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, title, logo, copyLogo, hashCodeNullable(tags), hashCodeNullable(color), hashCodeNullable(cover), hashCodeNullable(quota), hashCodeNullable(indexing), hashCodeNullable(denyDownload), lifetime, watermark, hashCodeNullable(_private));
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
    sb.append("class CreateRoomFromTemplateDto {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    copyLogo: ").append(toIndentedString(copyLogo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    indexing: ").append(toIndentedString(indexing)).append("\n");
    sb.append("    denyDownload: ").append(toIndentedString(denyDownload)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

    // add `templateId` to the URL query string
    if (getTemplateId() != null) {
      try {
        joiner.add(String.format("%stemplateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplateId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `logo` to the URL query string
    if (getLogo() != null) {
      joiner.add(getLogo().toUrlQueryString(prefix + "logo" + suffix));
    }

    // add `copyLogo` to the URL query string
    if (getCopyLogo() != null) {
      try {
        joiner.add(String.format("%scopyLogo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCopyLogo()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `private` to the URL query string
    if (getPrivate() != null) {
      try {
        joiner.add(String.format("%sprivate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrivate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

