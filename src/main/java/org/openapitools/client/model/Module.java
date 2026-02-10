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
import java.util.UUID;
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
 * The module information.
 */
@JsonPropertyOrder({
  Module.JSON_PROPERTY_ID,
  Module.JSON_PROPERTY_APP_NAME,
  Module.JSON_PROPERTY_TITLE,
  Module.JSON_PROPERTY_LINK,
  Module.JSON_PROPERTY_ICON_URL,
  Module.JSON_PROPERTY_IMAGE_URL,
  Module.JSON_PROPERTY_HELP_URL,
  Module.JSON_PROPERTY_DESCRIPTION,
  Module.JSON_PROPERTY_IS_PRIMARY
})

public class Module {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private UUID id;

  public static final String JSON_PROPERTY_APP_NAME = "appName";
  @javax.annotation.Nullable
  private JsonNullable<String> appName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable
  private JsonNullable<String> link = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ICON_URL = "iconUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> iconUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HELP_URL = "helpUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> helpUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_PRIMARY = "isPrimary";
  @javax.annotation.Nullable
  private Boolean isPrimary;

  public Module() {
  }


  public Module id(@javax.annotation.Nullable UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The module ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }

  public Module appName(@javax.annotation.Nullable String appName) {
    this.appName = JsonNullable.<String>of(appName);
    
    return this;
  }

  /**
   * The module product class name.
   * @return appName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAppName() {
        return appName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAppName_JsonNullable() {
    return appName;
  }
  
  @JsonProperty(JSON_PROPERTY_APP_NAME)
  public void setAppName_JsonNullable(JsonNullable<String> appName) {
    this.appName = appName;
  }

  public void setAppName(@javax.annotation.Nullable String appName) {
    this.appName = JsonNullable.<String>of(appName);
  }

  public Module title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The module product class name.
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

  public Module link(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
    
    return this;
  }

  /**
   * The URL to the module start page.
   * @return link
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLink() {
        return link.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLink_JsonNullable() {
    return link;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK)
  public void setLink_JsonNullable(JsonNullable<String> link) {
    this.link = link;
  }

  public void setLink(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
  }

  public Module iconUrl(@javax.annotation.Nullable String iconUrl) {
    this.iconUrl = JsonNullable.<String>of(iconUrl);
    
    return this;
  }

  /**
   * The module icon URL.
   * @return iconUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getIconUrl() {
        return iconUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIconUrl_JsonNullable() {
    return iconUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  public void setIconUrl_JsonNullable(JsonNullable<String> iconUrl) {
    this.iconUrl = iconUrl;
  }

  public void setIconUrl(@javax.annotation.Nullable String iconUrl) {
    this.iconUrl = JsonNullable.<String>of(iconUrl);
  }

  public Module imageUrl(@javax.annotation.Nullable String imageUrl) {
    this.imageUrl = JsonNullable.<String>of(imageUrl);
    
    return this;
  }

  /**
   * The module large image URL.
   * @return imageUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImageUrl() {
        return imageUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImageUrl_JsonNullable() {
    return imageUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  public void setImageUrl_JsonNullable(JsonNullable<String> imageUrl) {
    this.imageUrl = imageUrl;
  }

  public void setImageUrl(@javax.annotation.Nullable String imageUrl) {
    this.imageUrl = JsonNullable.<String>of(imageUrl);
  }

  public Module helpUrl(@javax.annotation.Nullable String helpUrl) {
    this.helpUrl = JsonNullable.<String>of(helpUrl);
    
    return this;
  }

  /**
   * The module help URL.
   * @return helpUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getHelpUrl() {
        return helpUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HELP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHelpUrl_JsonNullable() {
    return helpUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_HELP_URL)
  public void setHelpUrl_JsonNullable(JsonNullable<String> helpUrl) {
    this.helpUrl = helpUrl;
  }

  public void setHelpUrl(@javax.annotation.Nullable String helpUrl) {
    this.helpUrl = JsonNullable.<String>of(helpUrl);
  }

  public Module description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

  /**
   * The module description.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public Module isPrimary(@javax.annotation.Nullable Boolean isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * Specifies if the module is primary or not.
   * @return isPrimary
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrimary(@javax.annotation.Nullable Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Module module = (Module) o;
    return Objects.equals(this.id, module.id) &&
        equalsNullable(this.appName, module.appName) &&
        equalsNullable(this.title, module.title) &&
        equalsNullable(this.link, module.link) &&
        equalsNullable(this.iconUrl, module.iconUrl) &&
        equalsNullable(this.imageUrl, module.imageUrl) &&
        equalsNullable(this.helpUrl, module.helpUrl) &&
        equalsNullable(this.description, module.description) &&
        Objects.equals(this.isPrimary, module.isPrimary);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(appName), hashCodeNullable(title), hashCodeNullable(link), hashCodeNullable(iconUrl), hashCodeNullable(imageUrl), hashCodeNullable(helpUrl), hashCodeNullable(description), isPrimary);
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
    sb.append("class Module {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    helpUrl: ").append(toIndentedString(helpUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `appName` to the URL query string
    if (getAppName() != null) {
      try {
        joiner.add(String.format("%sappName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAppName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `link` to the URL query string
    if (getLink() != null) {
      try {
        joiner.add(String.format("%slink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `iconUrl` to the URL query string
    if (getIconUrl() != null) {
      try {
        joiner.add(String.format("%siconUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIconUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageUrl` to the URL query string
    if (getImageUrl() != null) {
      try {
        joiner.add(String.format("%simageUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `helpUrl` to the URL query string
    if (getHelpUrl() != null) {
      try {
        joiner.add(String.format("%shelpUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHelpUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `isPrimary` to the URL query string
    if (getIsPrimary() != null) {
      try {
        joiner.add(String.format("%sisPrimary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsPrimary()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

