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
import org.openapitools.client.model.AiPrompt;
import org.openapitools.client.model.AiPromptFolder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Versioned, self-contained bundle of every saved prompt and folder. Stable wire format — `version` lets the import path migrate older shapes if the schema ever changes.
 */
@JsonPropertyOrder({
  AiPromptBundle.JSON_PROPERTY_VERSION,
  AiPromptBundle.JSON_PROPERTY_FOLDERS,
  AiPromptBundle.JSON_PROPERTY_PROMPTS
})

public class AiPromptBundle {
  /**
   * Gets or Sets version
   */
  public enum VersionEnum {
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    VersionEnum(BigDecimal value) {
      this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VersionEnum fromValue(BigDecimal value) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull  private VersionEnum version;

  public static final String JSON_PROPERTY_FOLDERS = "folders";
  @javax.annotation.Nonnull  private List<AiPromptFolder> folders = new ArrayList<>();

  public static final String JSON_PROPERTY_PROMPTS = "prompts";
  @javax.annotation.Nonnull  private List<AiPrompt> prompts = new ArrayList<>();

  public AiPromptBundle() {
  }


  public AiPromptBundle version(@javax.annotation.Nonnull VersionEnum version) {
    
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VersionEnum getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull VersionEnum version) {
    this.version = version;
  }

  public AiPromptBundle folders(@javax.annotation.Nonnull List<AiPromptFolder> folders) {
    
    this.folders = folders;
    return this;
  }

  public AiPromptBundle addFoldersItem(AiPromptFolder foldersItem) {
    if (this.folders == null) {
      this.folders = new ArrayList<>();
    }
    this.folders.add(foldersItem);
    return this;
  }

  /**
   * Get folders
   * @return folders
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FOLDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiPromptFolder> getFolders() {
    return folders;
  }


  @JsonProperty(value = JSON_PROPERTY_FOLDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFolders(@javax.annotation.Nonnull List<AiPromptFolder> folders) {
    this.folders = folders;
  }

  public AiPromptBundle prompts(@javax.annotation.Nonnull List<AiPrompt> prompts) {
    
    this.prompts = prompts;
    return this;
  }

  public AiPromptBundle addPromptsItem(AiPrompt promptsItem) {
    if (this.prompts == null) {
      this.prompts = new ArrayList<>();
    }
    this.prompts.add(promptsItem);
    return this;
  }

  /**
   * Get prompts
   * @return prompts
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROMPTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiPrompt> getPrompts() {
    return prompts;
  }


  @JsonProperty(value = JSON_PROPERTY_PROMPTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrompts(@javax.annotation.Nonnull List<AiPrompt> prompts) {
    this.prompts = prompts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPromptBundle aiPromptBundle = (AiPromptBundle) o;
    return Objects.equals(this.version, aiPromptBundle.version) &&
        Objects.equals(this.folders, aiPromptBundle.folders) &&
        Objects.equals(this.prompts, aiPromptBundle.prompts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, folders, prompts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptBundle {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folders` to the URL query string
    if (getFolders() != null) {
      for (int i = 0; i < getFolders().size(); i++) {
        if (getFolders().get(i) != null) {
          joiner.add(getFolders().get(i).toUrlQueryString(String.format("%sfolders%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `prompts` to the URL query string
    if (getPrompts() != null) {
      for (int i = 0; i < getPrompts().size(); i++) {
        if (getPrompts().get(i) != null) {
          joiner.add(getPrompts().get(i).toUrlQueryString(String.format("%sprompts%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

