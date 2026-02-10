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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CoEditingConfig;
import org.openapitools.client.model.CustomizationConfigDto;
import org.openapitools.client.model.EmbeddedConfig;
import org.openapitools.client.model.EncryptionKeysConfig;
import org.openapitools.client.model.PluginsConfig;
import org.openapitools.client.model.RecentConfig;
import org.openapitools.client.model.TemplatesConfig;
import org.openapitools.client.model.UserConfig;
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
 * The editor configuration parameters.
 */
@JsonPropertyOrder({
  EditorConfigurationDto.JSON_PROPERTY_CALLBACK_URL,
  EditorConfigurationDto.JSON_PROPERTY_CO_EDITING,
  EditorConfigurationDto.JSON_PROPERTY_CREATE_URL,
  EditorConfigurationDto.JSON_PROPERTY_CUSTOMIZATION,
  EditorConfigurationDto.JSON_PROPERTY_EMBEDDED,
  EditorConfigurationDto.JSON_PROPERTY_ENCRYPTION_KEYS,
  EditorConfigurationDto.JSON_PROPERTY_LANG,
  EditorConfigurationDto.JSON_PROPERTY_MODE,
  EditorConfigurationDto.JSON_PROPERTY_MODE_WRITE,
  EditorConfigurationDto.JSON_PROPERTY_PLUGINS,
  EditorConfigurationDto.JSON_PROPERTY_RECENT,
  EditorConfigurationDto.JSON_PROPERTY_TEMPLATES,
  EditorConfigurationDto.JSON_PROPERTY_USER
})

public class EditorConfigurationDto {
  public static final String JSON_PROPERTY_CALLBACK_URL = "callbackUrl";
  @javax.annotation.Nullable
  private JsonNullable<URI> callbackUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_CO_EDITING = "coEditing";
  @javax.annotation.Nullable
  private CoEditingConfig coEditing;

  public static final String JSON_PROPERTY_CREATE_URL = "createUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> createUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMIZATION = "customization";
  @javax.annotation.Nullable
  private CustomizationConfigDto customization;

  public static final String JSON_PROPERTY_EMBEDDED = "embedded";
  @javax.annotation.Nullable
  private EmbeddedConfig embedded;

  public static final String JSON_PROPERTY_ENCRYPTION_KEYS = "encryptionKeys";
  @javax.annotation.Nullable
  private EncryptionKeysConfig encryptionKeys;

  public static final String JSON_PROPERTY_LANG = "lang";
  @javax.annotation.Nullable
  private String lang;

  public static final String JSON_PROPERTY_MODE = "mode";
  @javax.annotation.Nullable
  private String mode;

  public static final String JSON_PROPERTY_MODE_WRITE = "modeWrite";
  @javax.annotation.Nullable
  private Boolean modeWrite;

  public static final String JSON_PROPERTY_PLUGINS = "plugins";
  @javax.annotation.Nullable
  private PluginsConfig plugins;

  public static final String JSON_PROPERTY_RECENT = "recent";
  @javax.annotation.Nullable
  private JsonNullable<List<RecentConfig>> recent = JsonNullable.<List<RecentConfig>>undefined();

  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  @javax.annotation.Nullable
  private JsonNullable<List<TemplatesConfig>> templates = JsonNullable.<List<TemplatesConfig>>undefined();

  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nonnull
  private UserConfig user;

  public EditorConfigurationDto() {
  }


  public EditorConfigurationDto callbackUrl(@javax.annotation.Nullable URI callbackUrl) {
    this.callbackUrl = JsonNullable.<URI>of(callbackUrl);
    
    return this;
  }

  /**
   * The callback URL of the editor.
   * @return callbackUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getCallbackUrl() {
        return callbackUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getCallbackUrl_JsonNullable() {
    return callbackUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  public void setCallbackUrl_JsonNullable(JsonNullable<URI> callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public void setCallbackUrl(@javax.annotation.Nullable URI callbackUrl) {
    this.callbackUrl = JsonNullable.<URI>of(callbackUrl);
  }

  public EditorConfigurationDto coEditing(@javax.annotation.Nullable CoEditingConfig coEditing) {
    
    this.coEditing = coEditing;
    return this;
  }

  /**
   * Get coEditing
   * @return coEditing
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CO_EDITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoEditingConfig getCoEditing() {
    return coEditing;
  }


  @JsonProperty(JSON_PROPERTY_CO_EDITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoEditing(@javax.annotation.Nullable CoEditingConfig coEditing) {
    this.coEditing = coEditing;
  }

  public EditorConfigurationDto createUrl(@javax.annotation.Nullable String createUrl) {
    this.createUrl = JsonNullable.<String>of(createUrl);
    
    return this;
  }

  /**
   * The creation URL of the editor.
   * @return createUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCreateUrl() {
        return createUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreateUrl_JsonNullable() {
    return createUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATE_URL)
  public void setCreateUrl_JsonNullable(JsonNullable<String> createUrl) {
    this.createUrl = createUrl;
  }

  public void setCreateUrl(@javax.annotation.Nullable String createUrl) {
    this.createUrl = JsonNullable.<String>of(createUrl);
  }

  public EditorConfigurationDto customization(@javax.annotation.Nullable CustomizationConfigDto customization) {
    
    this.customization = customization;
    return this;
  }

  /**
   * Get customization
   * @return customization
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomizationConfigDto getCustomization() {
    return customization;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomization(@javax.annotation.Nullable CustomizationConfigDto customization) {
    this.customization = customization;
  }

  public EditorConfigurationDto embedded(@javax.annotation.Nullable EmbeddedConfig embedded) {
    
    this.embedded = embedded;
    return this;
  }

  /**
   * Get embedded
   * @return embedded
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmbeddedConfig getEmbedded() {
    return embedded;
  }


  @JsonProperty(JSON_PROPERTY_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmbedded(@javax.annotation.Nullable EmbeddedConfig embedded) {
    this.embedded = embedded;
  }

  public EditorConfigurationDto encryptionKeys(@javax.annotation.Nullable EncryptionKeysConfig encryptionKeys) {
    
    this.encryptionKeys = encryptionKeys;
    return this;
  }

  /**
   * Get encryptionKeys
   * @return encryptionKeys
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EncryptionKeysConfig getEncryptionKeys() {
    return encryptionKeys;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionKeys(@javax.annotation.Nullable EncryptionKeysConfig encryptionKeys) {
    this.encryptionKeys = encryptionKeys;
  }

  public EditorConfigurationDto lang(@javax.annotation.Nullable String lang) {
    
    this.lang = lang;
    return this;
  }

  /**
   * The language of the editor configuration.
   * @return lang
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLang() {
    return lang;
  }


  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLang(@javax.annotation.Nullable String lang) {
    this.lang = lang;
  }

  public EditorConfigurationDto mode(@javax.annotation.Nullable String mode) {
    
    this.mode = mode;
    return this;
  }

  /**
   * The mode of the editor configuration.
   * @return mode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMode(@javax.annotation.Nullable String mode) {
    this.mode = mode;
  }

  public EditorConfigurationDto modeWrite(@javax.annotation.Nullable Boolean modeWrite) {
    
    this.modeWrite = modeWrite;
    return this;
  }

  /**
   * Specifies if the mode is write of the editor configuration.
   * @return modeWrite
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE_WRITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getModeWrite() {
    return modeWrite;
  }


  @JsonProperty(JSON_PROPERTY_MODE_WRITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModeWrite(@javax.annotation.Nullable Boolean modeWrite) {
    this.modeWrite = modeWrite;
  }

  public EditorConfigurationDto plugins(@javax.annotation.Nullable PluginsConfig plugins) {
    
    this.plugins = plugins;
    return this;
  }

  /**
   * Get plugins
   * @return plugins
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLUGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PluginsConfig getPlugins() {
    return plugins;
  }


  @JsonProperty(JSON_PROPERTY_PLUGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlugins(@javax.annotation.Nullable PluginsConfig plugins) {
    this.plugins = plugins;
  }

  public EditorConfigurationDto recent(@javax.annotation.Nullable List<RecentConfig> recent) {
    this.recent = JsonNullable.<List<RecentConfig>>of(recent);
    
    return this;
  }

  public EditorConfigurationDto addRecentItem(RecentConfig recentItem) {
    if (this.recent == null || !this.recent.isPresent()) {
      this.recent = JsonNullable.<List<RecentConfig>>of(new ArrayList<>());
    }
    try {
      this.recent.get().add(recentItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The recent configuration of the editor.
   * @return recent
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<RecentConfig> getRecent() {
        return recent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<RecentConfig>> getRecent_JsonNullable() {
    return recent;
  }
  
  @JsonProperty(JSON_PROPERTY_RECENT)
  public void setRecent_JsonNullable(JsonNullable<List<RecentConfig>> recent) {
    this.recent = recent;
  }

  public void setRecent(@javax.annotation.Nullable List<RecentConfig> recent) {
    this.recent = JsonNullable.<List<RecentConfig>>of(recent);
  }

  public EditorConfigurationDto templates(@javax.annotation.Nullable List<TemplatesConfig> templates) {
    this.templates = JsonNullable.<List<TemplatesConfig>>of(templates);
    
    return this;
  }

  public EditorConfigurationDto addTemplatesItem(TemplatesConfig templatesItem) {
    if (this.templates == null || !this.templates.isPresent()) {
      this.templates = JsonNullable.<List<TemplatesConfig>>of(new ArrayList<>());
    }
    try {
      this.templates.get().add(templatesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The templates of the editor configuration.
   * @return templates
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<TemplatesConfig> getTemplates() {
        return templates.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TemplatesConfig>> getTemplates_JsonNullable() {
    return templates;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  public void setTemplates_JsonNullable(JsonNullable<List<TemplatesConfig>> templates) {
    this.templates = templates;
  }

  public void setTemplates(@javax.annotation.Nullable List<TemplatesConfig> templates) {
    this.templates = JsonNullable.<List<TemplatesConfig>>of(templates);
  }

  public EditorConfigurationDto user(@javax.annotation.Nonnull UserConfig user) {
    
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UserConfig getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUser(@javax.annotation.Nonnull UserConfig user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditorConfigurationDto editorConfigurationDto = (EditorConfigurationDto) o;
    return equalsNullable(this.callbackUrl, editorConfigurationDto.callbackUrl) &&
        Objects.equals(this.coEditing, editorConfigurationDto.coEditing) &&
        equalsNullable(this.createUrl, editorConfigurationDto.createUrl) &&
        Objects.equals(this.customization, editorConfigurationDto.customization) &&
        Objects.equals(this.embedded, editorConfigurationDto.embedded) &&
        Objects.equals(this.encryptionKeys, editorConfigurationDto.encryptionKeys) &&
        Objects.equals(this.lang, editorConfigurationDto.lang) &&
        Objects.equals(this.mode, editorConfigurationDto.mode) &&
        Objects.equals(this.modeWrite, editorConfigurationDto.modeWrite) &&
        Objects.equals(this.plugins, editorConfigurationDto.plugins) &&
        equalsNullable(this.recent, editorConfigurationDto.recent) &&
        equalsNullable(this.templates, editorConfigurationDto.templates) &&
        Objects.equals(this.user, editorConfigurationDto.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(callbackUrl), coEditing, hashCodeNullable(createUrl), customization, embedded, encryptionKeys, lang, mode, modeWrite, plugins, hashCodeNullable(recent), hashCodeNullable(templates), user);
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
    sb.append("class EditorConfigurationDto {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    coEditing: ").append(toIndentedString(coEditing)).append("\n");
    sb.append("    createUrl: ").append(toIndentedString(createUrl)).append("\n");
    sb.append("    customization: ").append(toIndentedString(customization)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    encryptionKeys: ").append(toIndentedString(encryptionKeys)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    modeWrite: ").append(toIndentedString(modeWrite)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

    // add `callbackUrl` to the URL query string
    if (getCallbackUrl() != null) {
      try {
        joiner.add(String.format("%scallbackUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCallbackUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `coEditing` to the URL query string
    if (getCoEditing() != null) {
      joiner.add(getCoEditing().toUrlQueryString(prefix + "coEditing" + suffix));
    }

    // add `createUrl` to the URL query string
    if (getCreateUrl() != null) {
      try {
        joiner.add(String.format("%screateUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customization` to the URL query string
    if (getCustomization() != null) {
      joiner.add(getCustomization().toUrlQueryString(prefix + "customization" + suffix));
    }

    // add `embedded` to the URL query string
    if (getEmbedded() != null) {
      joiner.add(getEmbedded().toUrlQueryString(prefix + "embedded" + suffix));
    }

    // add `encryptionKeys` to the URL query string
    if (getEncryptionKeys() != null) {
      joiner.add(getEncryptionKeys().toUrlQueryString(prefix + "encryptionKeys" + suffix));
    }

    // add `lang` to the URL query string
    if (getLang() != null) {
      try {
        joiner.add(String.format("%slang%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLang()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      try {
        joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modeWrite` to the URL query string
    if (getModeWrite() != null) {
      try {
        joiner.add(String.format("%smodeWrite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModeWrite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plugins` to the URL query string
    if (getPlugins() != null) {
      joiner.add(getPlugins().toUrlQueryString(prefix + "plugins" + suffix));
    }

    // add `recent` to the URL query string
    if (getRecent() != null) {
      for (int i = 0; i < getRecent().size(); i++) {
        if (getRecent().get(i) != null) {
          joiner.add(getRecent().get(i).toUrlQueryString(String.format("%srecent%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `templates` to the URL query string
    if (getTemplates() != null) {
      for (int i = 0; i < getTemplates().size(); i++) {
        if (getTemplates().get(i) != null) {
          joiner.add(getTemplates().get(i).toUrlQueryString(String.format("%stemplates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `user` to the URL query string
    if (getUser() != null) {
      joiner.add(getUser().toUrlQueryString(prefix + "user" + suffix));
    }

    return joiner.toString();
  }

}

