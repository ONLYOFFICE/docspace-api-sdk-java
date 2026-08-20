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
import org.openapitools.client.model.AceShortWrapper;
import org.openapitools.client.model.EditorType;
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
 * The information config parameters.
 */
@JsonPropertyOrder({
  InfoConfigDto.JSON_PROPERTY_FAVORITE,
  InfoConfigDto.JSON_PROPERTY_FOLDER,
  InfoConfigDto.JSON_PROPERTY_OWNER,
  InfoConfigDto.JSON_PROPERTY_SHARING_SETTINGS,
  InfoConfigDto.JSON_PROPERTY_TYPE,
  InfoConfigDto.JSON_PROPERTY_UPLOADED
})

public class InfoConfigDto {
  public static final String JSON_PROPERTY_FAVORITE = "favorite";
  @javax.annotation.Nullable  private JsonNullable<Boolean> favorite = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FOLDER = "folder";
  @javax.annotation.Nullable  private JsonNullable<String> folder = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OWNER = "owner";
  @javax.annotation.Nullable  private JsonNullable<String> owner = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHARING_SETTINGS = "sharingSettings";
  @javax.annotation.Nullable  private JsonNullable<List<AceShortWrapper>> sharingSettings = JsonNullable.<List<AceShortWrapper>>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private EditorType type;

  public static final String JSON_PROPERTY_UPLOADED = "uploaded";
  @javax.annotation.Nullable  private JsonNullable<String> uploaded = JsonNullable.<String>undefined();

  public InfoConfigDto() {
  }


  public InfoConfigDto favorite(@javax.annotation.Nullable Boolean favorite) {
    this.favorite = JsonNullable.<Boolean>of(favorite);
    
    return this;
  }

  /**
   * Specifies if the file is favorite or not.
   * @return favorite
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getFavorite() {
        return favorite.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FAVORITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getFavorite_JsonNullable() {
    return favorite;
  }
  
  @JsonProperty(JSON_PROPERTY_FAVORITE)
  public void setFavorite_JsonNullable(JsonNullable<Boolean> favorite) {
    this.favorite = favorite;
  }

  public void setFavorite(@javax.annotation.Nullable Boolean favorite) {
    this.favorite = JsonNullable.<Boolean>of(favorite);
  }

  public InfoConfigDto folder(@javax.annotation.Nullable String folder) {
    this.folder = JsonNullable.<String>of(folder);
    
    return this;
  }

  /**
   * The folder of the file.
   * @return folder
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFolder() {
        return folder.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FOLDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFolder_JsonNullable() {
    return folder;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER)
  public void setFolder_JsonNullable(JsonNullable<String> folder) {
    this.folder = folder;
  }

  public void setFolder(@javax.annotation.Nullable String folder) {
    this.folder = JsonNullable.<String>of(folder);
  }

  public InfoConfigDto owner(@javax.annotation.Nullable String owner) {
    this.owner = JsonNullable.<String>of(owner);
    
    return this;
  }

  /**
   * The file owner.
   * @return owner
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOwner() {
        return owner.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OWNER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOwner_JsonNullable() {
    return owner;
  }
  
  @JsonProperty(JSON_PROPERTY_OWNER)
  public void setOwner_JsonNullable(JsonNullable<String> owner) {
    this.owner = owner;
  }

  public void setOwner(@javax.annotation.Nullable String owner) {
    this.owner = JsonNullable.<String>of(owner);
  }

  public InfoConfigDto sharingSettings(@javax.annotation.Nullable List<AceShortWrapper> sharingSettings) {
    this.sharingSettings = JsonNullable.<List<AceShortWrapper>>of(sharingSettings);
    
    return this;
  }

  public InfoConfigDto addSharingSettingsItem(AceShortWrapper sharingSettingsItem) {
    if (this.sharingSettings == null || !this.sharingSettings.isPresent()) {
      this.sharingSettings = JsonNullable.<List<AceShortWrapper>>of(new ArrayList<>());
    }
    try {
      this.sharingSettings.get().add(sharingSettingsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The sharing settings of the file.
   * @return sharingSettings
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<AceShortWrapper> getSharingSettings() {
        return sharingSettings.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SHARING_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<AceShortWrapper>> getSharingSettings_JsonNullable() {
    return sharingSettings;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARING_SETTINGS)
  public void setSharingSettings_JsonNullable(JsonNullable<List<AceShortWrapper>> sharingSettings) {
    this.sharingSettings = sharingSettings;
  }

  public void setSharingSettings(@javax.annotation.Nullable List<AceShortWrapper> sharingSettings) {
    this.sharingSettings = JsonNullable.<List<AceShortWrapper>>of(sharingSettings);
  }

  public InfoConfigDto type(@javax.annotation.Nullable EditorType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EditorType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable EditorType type) {
    this.type = type;
  }

  public InfoConfigDto uploaded(@javax.annotation.Nullable String uploaded) {
    this.uploaded = JsonNullable.<String>of(uploaded);
    
    return this;
  }

  /**
   * The uploaded file.
   * @return uploaded
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUploaded() {
        return uploaded.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_UPLOADED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUploaded_JsonNullable() {
    return uploaded;
  }
  
  @JsonProperty(JSON_PROPERTY_UPLOADED)
  public void setUploaded_JsonNullable(JsonNullable<String> uploaded) {
    this.uploaded = uploaded;
  }

  public void setUploaded(@javax.annotation.Nullable String uploaded) {
    this.uploaded = JsonNullable.<String>of(uploaded);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoConfigDto infoConfigDto = (InfoConfigDto) o;
    return equalsNullable(this.favorite, infoConfigDto.favorite) &&
        equalsNullable(this.folder, infoConfigDto.folder) &&
        equalsNullable(this.owner, infoConfigDto.owner) &&
        equalsNullable(this.sharingSettings, infoConfigDto.sharingSettings) &&
        Objects.equals(this.type, infoConfigDto.type) &&
        equalsNullable(this.uploaded, infoConfigDto.uploaded);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(favorite), hashCodeNullable(folder), hashCodeNullable(owner), hashCodeNullable(sharingSettings), type, hashCodeNullable(uploaded));
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
    sb.append("class InfoConfigDto {\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sharingSettings: ").append(toIndentedString(sharingSettings)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
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

    // add `favorite` to the URL query string
    if (getFavorite() != null) {
      try {
        joiner.add(String.format("%sfavorite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFavorite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folder` to the URL query string
    if (getFolder() != null) {
      try {
        joiner.add(String.format("%sfolder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolder()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `owner` to the URL query string
    if (getOwner() != null) {
      try {
        joiner.add(String.format("%sowner%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOwner()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sharingSettings` to the URL query string
    if (getSharingSettings() != null) {
      for (int i = 0; i < getSharingSettings().size(); i++) {
        if (getSharingSettings().get(i) != null) {
          joiner.add(getSharingSettings().get(i).toUrlQueryString(String.format("%ssharingSettings%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uploaded` to the URL query string
    if (getUploaded() != null) {
      try {
        joiner.add(String.format("%suploaded%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploaded()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

