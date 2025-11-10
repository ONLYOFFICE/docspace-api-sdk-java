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
import org.openapitools.client.model.EmployeeDto;
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
 * The web plugin information.
 */
@JsonPropertyOrder({
  WebPluginDto.JSON_PROPERTY_NAME,
  WebPluginDto.JSON_PROPERTY_VERSION,
  WebPluginDto.JSON_PROPERTY_MIN_DOC_SPACE_VERSION,
  WebPluginDto.JSON_PROPERTY_DESCRIPTION,
  WebPluginDto.JSON_PROPERTY_LICENSE,
  WebPluginDto.JSON_PROPERTY_AUTHOR,
  WebPluginDto.JSON_PROPERTY_HOME_PAGE,
  WebPluginDto.JSON_PROPERTY_PLUGIN_NAME,
  WebPluginDto.JSON_PROPERTY_SCOPES,
  WebPluginDto.JSON_PROPERTY_IMAGE,
  WebPluginDto.JSON_PROPERTY_CREATE_BY,
  WebPluginDto.JSON_PROPERTY_CREATE_ON,
  WebPluginDto.JSON_PROPERTY_ENABLED,
  WebPluginDto.JSON_PROPERTY_SYSTEM,
  WebPluginDto.JSON_PROPERTY_URL,
  WebPluginDto.JSON_PROPERTY_SETTINGS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class WebPluginDto {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private String version;

  public static final String JSON_PROPERTY_MIN_DOC_SPACE_VERSION = "minDocSpaceVersion";
  @javax.annotation.Nullable
  private JsonNullable<String> minDocSpaceVersion = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_LICENSE = "license";
  @javax.annotation.Nullable
  private String license;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  @javax.annotation.Nullable
  private String author;

  public static final String JSON_PROPERTY_HOME_PAGE = "homePage";
  @javax.annotation.Nullable
  private String homePage;

  public static final String JSON_PROPERTY_PLUGIN_NAME = "pluginName";
  @javax.annotation.Nullable
  private String pluginName;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  @javax.annotation.Nullable
  private String scopes;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private String image;

  public static final String JSON_PROPERTY_CREATE_BY = "createBy";
  @javax.annotation.Nonnull
  private EmployeeDto createBy;

  public static final String JSON_PROPERTY_CREATE_ON = "createOn";
  @javax.annotation.Nonnull
  private OffsetDateTime createOn;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nonnull
  private Boolean enabled;

  public static final String JSON_PROPERTY_SYSTEM = "system";
  @javax.annotation.Nonnull
  private Boolean system;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private String url;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  @javax.annotation.Nullable
  private String settings;

  public WebPluginDto() {
  }

  public WebPluginDto name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The web plugin name.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public WebPluginDto version(@javax.annotation.Nullable String version) {
    
    this.version = version;
    return this;
  }

  /**
   * The web plugin version.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = version;
  }

  public WebPluginDto minDocSpaceVersion(@javax.annotation.Nullable String minDocSpaceVersion) {
    this.minDocSpaceVersion = JsonNullable.<String>of(minDocSpaceVersion);
    
    return this;
  }

  /**
   * The minimum version of DocSpace with which the plugin is guaranteed to work.
   * @return minDocSpaceVersion
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMinDocSpaceVersion() {
        return minDocSpaceVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIN_DOC_SPACE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMinDocSpaceVersion_JsonNullable() {
    return minDocSpaceVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_MIN_DOC_SPACE_VERSION)
  public void setMinDocSpaceVersion_JsonNullable(JsonNullable<String> minDocSpaceVersion) {
    this.minDocSpaceVersion = minDocSpaceVersion;
  }

  public void setMinDocSpaceVersion(@javax.annotation.Nullable String minDocSpaceVersion) {
    this.minDocSpaceVersion = JsonNullable.<String>of(minDocSpaceVersion);
  }

  public WebPluginDto description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * The web plugin description.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public WebPluginDto license(@javax.annotation.Nullable String license) {
    
    this.license = license;
    return this;
  }

  /**
   * The web plugin license.
   * @return license
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LICENSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLicense() {
    return license;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLicense(@javax.annotation.Nullable String license) {
    this.license = license;
  }

  public WebPluginDto author(@javax.annotation.Nullable String author) {
    
    this.author = author;
    return this;
  }

  /**
   * The web plugin author.
   * @return author
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthor(@javax.annotation.Nullable String author) {
    this.author = author;
  }

  public WebPluginDto homePage(@javax.annotation.Nullable String homePage) {
    
    this.homePage = homePage;
    return this;
  }

  /**
   * The web plugin home page URL.
   * @return homePage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOME_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHomePage() {
    return homePage;
  }


  @JsonProperty(JSON_PROPERTY_HOME_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHomePage(@javax.annotation.Nullable String homePage) {
    this.homePage = homePage;
  }

  public WebPluginDto pluginName(@javax.annotation.Nullable String pluginName) {
    
    this.pluginName = pluginName;
    return this;
  }

  /**
   * The name by which the web plugin is registered in the window object.
   * @return pluginName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLUGIN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPluginName() {
    return pluginName;
  }


  @JsonProperty(JSON_PROPERTY_PLUGIN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPluginName(@javax.annotation.Nullable String pluginName) {
    this.pluginName = pluginName;
  }

  public WebPluginDto scopes(@javax.annotation.Nullable String scopes) {
    
    this.scopes = scopes;
    return this;
  }

  /**
   * The web plugin scopes.
   * @return scopes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getScopes() {
    return scopes;
  }


  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScopes(@javax.annotation.Nullable String scopes) {
    this.scopes = scopes;
  }

  public WebPluginDto image(@javax.annotation.Nullable String image) {
    
    this.image = image;
    return this;
  }

  /**
   * The web plugin image.
   * @return image
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImage(@javax.annotation.Nullable String image) {
    this.image = image;
  }

  public WebPluginDto createBy(@javax.annotation.Nonnull EmployeeDto createBy) {
    
    this.createBy = createBy;
    return this;
  }

  /**
   * Get createBy
   * @return createBy
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EmployeeDto getCreateBy() {
    return createBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateBy(@javax.annotation.Nonnull EmployeeDto createBy) {
    this.createBy = createBy;
  }

  public WebPluginDto createOn(@javax.annotation.Nonnull OffsetDateTime createOn) {
    
    this.createOn = createOn;
    return this;
  }

  /**
   * The date and time when the web plugin was created.
   * @return createOn
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreateOn() {
    return createOn;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateOn(@javax.annotation.Nonnull OffsetDateTime createOn) {
    this.createOn = createOn;
  }

  public WebPluginDto enabled(@javax.annotation.Nonnull Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Specifies if the web plugin is enabled or not.
   * @return enabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(@javax.annotation.Nonnull Boolean enabled) {
    this.enabled = enabled;
  }

  public WebPluginDto system(@javax.annotation.Nonnull Boolean system) {
    
    this.system = system;
    return this;
  }

  /**
   * Specifies if the web plugin is system or not.
   * @return system
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSystem() {
    return system;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSystem(@javax.annotation.Nonnull Boolean system) {
    this.system = system;
  }

  public WebPluginDto url(@javax.annotation.Nullable String url) {
    
    this.url = url;
    return this;
  }

  /**
   * The web plugin URL.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }

  public WebPluginDto settings(@javax.annotation.Nullable String settings) {
    
    this.settings = settings;
    return this;
  }

  /**
   * The web plugin settings.
   * @return settings
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSettings(@javax.annotation.Nullable String settings) {
    this.settings = settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebPluginDto webPluginDto = (WebPluginDto) o;
    return Objects.equals(this.name, webPluginDto.name) &&
        Objects.equals(this.version, webPluginDto.version) &&
        equalsNullable(this.minDocSpaceVersion, webPluginDto.minDocSpaceVersion) &&
        Objects.equals(this.description, webPluginDto.description) &&
        Objects.equals(this.license, webPluginDto.license) &&
        Objects.equals(this.author, webPluginDto.author) &&
        Objects.equals(this.homePage, webPluginDto.homePage) &&
        Objects.equals(this.pluginName, webPluginDto.pluginName) &&
        Objects.equals(this.scopes, webPluginDto.scopes) &&
        Objects.equals(this.image, webPluginDto.image) &&
        Objects.equals(this.createBy, webPluginDto.createBy) &&
        Objects.equals(this.createOn, webPluginDto.createOn) &&
        Objects.equals(this.enabled, webPluginDto.enabled) &&
        Objects.equals(this.system, webPluginDto.system) &&
        Objects.equals(this.url, webPluginDto.url) &&
        Objects.equals(this.settings, webPluginDto.settings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, hashCodeNullable(minDocSpaceVersion), description, license, author, homePage, pluginName, scopes, image, createBy, createOn, enabled, system, url, settings);
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
    sb.append("class WebPluginDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    minDocSpaceVersion: ").append(toIndentedString(minDocSpaceVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    homePage: ").append(toIndentedString(homePage)).append("\n");
    sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    createOn: ").append(toIndentedString(createOn)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `minDocSpaceVersion` to the URL query string
    if (getMinDocSpaceVersion() != null) {
      try {
        joiner.add(String.format("%sminDocSpaceVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinDocSpaceVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `license` to the URL query string
    if (getLicense() != null) {
      try {
        joiner.add(String.format("%slicense%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLicense()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `author` to the URL query string
    if (getAuthor() != null) {
      try {
        joiner.add(String.format("%sauthor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `homePage` to the URL query string
    if (getHomePage() != null) {
      try {
        joiner.add(String.format("%shomePage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHomePage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pluginName` to the URL query string
    if (getPluginName() != null) {
      try {
        joiner.add(String.format("%spluginName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPluginName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scopes` to the URL query string
    if (getScopes() != null) {
      try {
        joiner.add(String.format("%sscopes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScopes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      try {
        joiner.add(String.format("%simage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createBy` to the URL query string
    if (getCreateBy() != null) {
      joiner.add(getCreateBy().toUrlQueryString(prefix + "createBy" + suffix));
    }

    // add `createOn` to the URL query string
    if (getCreateOn() != null) {
      try {
        joiner.add(String.format("%screateOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `system` to the URL query string
    if (getSystem() != null) {
      try {
        joiner.add(String.format("%ssystem%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSystem()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `settings` to the URL query string
    if (getSettings() != null) {
      try {
        joiner.add(String.format("%ssettings%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSettings()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

