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
 * The configuration parameters for the embedded document type.
 */
@JsonPropertyOrder({
  EmbeddedConfig.JSON_PROPERTY_EMBED_URL,
  EmbeddedConfig.JSON_PROPERTY_SAVE_URL,
  EmbeddedConfig.JSON_PROPERTY_SHARE_LINK_PARAM,
  EmbeddedConfig.JSON_PROPERTY_SHARE_URL,
  EmbeddedConfig.JSON_PROPERTY_TOOLBAR_DOCKED
})

public class EmbeddedConfig {
  public static final String JSON_PROPERTY_EMBED_URL = "embedUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> embedUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAVE_URL = "saveUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> saveUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHARE_LINK_PARAM = "shareLinkParam";
  @javax.annotation.Nullable
  private JsonNullable<String> shareLinkParam = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHARE_URL = "shareUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> shareUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOOLBAR_DOCKED = "toolbarDocked";
  @javax.annotation.Nullable
  private JsonNullable<String> toolbarDocked = JsonNullable.<String>undefined();

  public EmbeddedConfig() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public EmbeddedConfig(
    @JsonProperty(JSON_PROPERTY_SAVE_URL) String saveUrl, 
    @JsonProperty(JSON_PROPERTY_TOOLBAR_DOCKED) String toolbarDocked
  ) {
    this();
    this.saveUrl = saveUrl == null ? JsonNullable.<String>undefined() : JsonNullable.of(saveUrl);
    this.toolbarDocked = toolbarDocked == null ? JsonNullable.<String>undefined() : JsonNullable.of(toolbarDocked);
  }


  public EmbeddedConfig embedUrl(@javax.annotation.Nullable String embedUrl) {
    this.embedUrl = JsonNullable.<String>of(embedUrl);
    
    return this;
  }

  /**
   * The absolute URL to the document serving as a source file for the document embedded into the web page.
   * @return embedUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmbedUrl() {
        return embedUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMBED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmbedUrl_JsonNullable() {
    return embedUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_EMBED_URL)
  public void setEmbedUrl_JsonNullable(JsonNullable<String> embedUrl) {
    this.embedUrl = embedUrl;
  }

  public void setEmbedUrl(@javax.annotation.Nullable String embedUrl) {
    this.embedUrl = JsonNullable.<String>of(embedUrl);
  }

  /**
   * The absolute URL that will allow the document to be saved onto the user personal computer.
   * @return saveUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSaveUrl() {
    
    if (saveUrl == null) {
      saveUrl = JsonNullable.<String>undefined();
    }
    return saveUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SAVE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSaveUrl_JsonNullable() {
    return saveUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_SAVE_URL)
  private void setSaveUrl_JsonNullable(JsonNullable<String> saveUrl) {
    this.saveUrl = saveUrl;
  }


  public EmbeddedConfig shareLinkParam(@javax.annotation.Nullable String shareLinkParam) {
    this.shareLinkParam = JsonNullable.<String>of(shareLinkParam);
    
    return this;
  }

  /**
   * The shared URL parameter.
   * @return shareLinkParam
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getShareLinkParam() {
        return shareLinkParam.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARE_LINK_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getShareLinkParam_JsonNullable() {
    return shareLinkParam;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARE_LINK_PARAM)
  public void setShareLinkParam_JsonNullable(JsonNullable<String> shareLinkParam) {
    this.shareLinkParam = shareLinkParam;
  }

  public void setShareLinkParam(@javax.annotation.Nullable String shareLinkParam) {
    this.shareLinkParam = JsonNullable.<String>of(shareLinkParam);
  }

  public EmbeddedConfig shareUrl(@javax.annotation.Nullable String shareUrl) {
    this.shareUrl = JsonNullable.<String>of(shareUrl);
    
    return this;
  }

  /**
   * The absolute URL that will allow other users to share this document.
   * @return shareUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getShareUrl() {
        return shareUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getShareUrl_JsonNullable() {
    return shareUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARE_URL)
  public void setShareUrl_JsonNullable(JsonNullable<String> shareUrl) {
    this.shareUrl = shareUrl;
  }

  public void setShareUrl(@javax.annotation.Nullable String shareUrl) {
    this.shareUrl = JsonNullable.<String>of(shareUrl);
  }

  /**
   * The place for the embedded viewer toolbar, can be either top or bottom.
   * @return toolbarDocked
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getToolbarDocked() {
    
    if (toolbarDocked == null) {
      toolbarDocked = JsonNullable.<String>undefined();
    }
    return toolbarDocked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOOLBAR_DOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getToolbarDocked_JsonNullable() {
    return toolbarDocked;
  }
  
  @JsonProperty(JSON_PROPERTY_TOOLBAR_DOCKED)
  private void setToolbarDocked_JsonNullable(JsonNullable<String> toolbarDocked) {
    this.toolbarDocked = toolbarDocked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedConfig embeddedConfig = (EmbeddedConfig) o;
    return equalsNullable(this.embedUrl, embeddedConfig.embedUrl) &&
        equalsNullable(this.saveUrl, embeddedConfig.saveUrl) &&
        equalsNullable(this.shareLinkParam, embeddedConfig.shareLinkParam) &&
        equalsNullable(this.shareUrl, embeddedConfig.shareUrl) &&
        equalsNullable(this.toolbarDocked, embeddedConfig.toolbarDocked);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(embedUrl), hashCodeNullable(saveUrl), hashCodeNullable(shareLinkParam), hashCodeNullable(shareUrl), hashCodeNullable(toolbarDocked));
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
    sb.append("class EmbeddedConfig {\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    saveUrl: ").append(toIndentedString(saveUrl)).append("\n");
    sb.append("    shareLinkParam: ").append(toIndentedString(shareLinkParam)).append("\n");
    sb.append("    shareUrl: ").append(toIndentedString(shareUrl)).append("\n");
    sb.append("    toolbarDocked: ").append(toIndentedString(toolbarDocked)).append("\n");
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

    // add `embedUrl` to the URL query string
    if (getEmbedUrl() != null) {
      try {
        joiner.add(String.format("%sembedUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmbedUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saveUrl` to the URL query string
    if (getSaveUrl() != null) {
      try {
        joiner.add(String.format("%ssaveUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaveUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shareLinkParam` to the URL query string
    if (getShareLinkParam() != null) {
      try {
        joiner.add(String.format("%sshareLinkParam%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShareLinkParam()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shareUrl` to the URL query string
    if (getShareUrl() != null) {
      try {
        joiner.add(String.format("%sshareUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShareUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `toolbarDocked` to the URL query string
    if (getToolbarDocked() != null) {
      try {
        joiner.add(String.format("%stoolbarDocked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToolbarDocked()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

