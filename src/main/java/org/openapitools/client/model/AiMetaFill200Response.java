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
import org.openapitools.client.model.AiEntryMetadata;
import org.openapitools.client.model.AiMetaFill200ResponseFilledInner;
import org.openapitools.client.model.AiMetaFill200ResponseSourcesInner;
import org.openapitools.client.model.AiMetaFill200ResponseUnresolvedInner;
import org.openapitools.client.model.AiMetaGenerate200ResponseSkippedInner;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiMetaFill200Response
 */
@JsonPropertyOrder({
  AiMetaFill200Response.JSON_PROPERTY_DRY_RUN,
  AiMetaFill200Response.JSON_PROPERTY_METADATA,
  AiMetaFill200Response.JSON_PROPERTY_FILLED,
  AiMetaFill200Response.JSON_PROPERTY_UNRESOLVED,
  AiMetaFill200Response.JSON_PROPERTY_SOURCES,
  AiMetaFill200Response.JSON_PROPERTY_SKIPPED
})
@JsonTypeName("aiMetaFill_200_response")

public class AiMetaFill200Response {
  public static final String JSON_PROPERTY_DRY_RUN = "dryRun";
  @javax.annotation.Nonnull  private Boolean dryRun;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nonnull  private AiEntryMetadata metadata;

  public static final String JSON_PROPERTY_FILLED = "filled";
  @javax.annotation.Nonnull  private List<AiMetaFill200ResponseFilledInner> filled = new ArrayList<>();

  public static final String JSON_PROPERTY_UNRESOLVED = "unresolved";
  @javax.annotation.Nonnull  private List<AiMetaFill200ResponseUnresolvedInner> unresolved = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCES = "sources";
  @javax.annotation.Nonnull  private List<AiMetaFill200ResponseSourcesInner> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_SKIPPED = "skipped";
  @javax.annotation.Nonnull  private List<AiMetaGenerate200ResponseSkippedInner> skipped = new ArrayList<>();

  public AiMetaFill200Response() {
  }


  public AiMetaFill200Response dryRun(@javax.annotation.Nonnull Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Whether the values were only proposed (`true`) or written as well.
   * @return dryRun
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DRY_RUN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDryRun() {
    return dryRun;
  }


  @JsonProperty(value = JSON_PROPERTY_DRY_RUN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDryRun(@javax.annotation.Nonnull Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public AiMetaFill200Response metadata(@javax.annotation.Nonnull AiEntryMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

  /**
   * The entry's metadata after the write (or as it stands, with `dryRun`), as `GET api/2.0/files/metadata/{kind}/{id}` returns it.
   * @return metadata
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_METADATA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiEntryMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(value = JSON_PROPERTY_METADATA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(@javax.annotation.Nonnull AiEntryMetadata metadata) {
    this.metadata = metadata;
  }

  public AiMetaFill200Response filled(@javax.annotation.Nonnull List<AiMetaFill200ResponseFilledInner> filled) {
    
    this.filled = filled;
    return this;
  }

  public AiMetaFill200Response addFilledItem(AiMetaFill200ResponseFilledInner filledItem) {
    if (this.filled == null) {
      this.filled = new ArrayList<>();
    }
    this.filled.add(filledItem);
    return this;
  }

  /**
   * The values written, or proposed with `dryRun`: a typed value for a template field, a string for a custom field.
   * @return filled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FILLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiMetaFill200ResponseFilledInner> getFilled() {
    return filled;
  }


  @JsonProperty(value = JSON_PROPERTY_FILLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilled(@javax.annotation.Nonnull List<AiMetaFill200ResponseFilledInner> filled) {
    this.filled = filled;
  }

  public AiMetaFill200Response unresolved(@javax.annotation.Nonnull List<AiMetaFill200ResponseUnresolvedInner> unresolved) {
    
    this.unresolved = unresolved;
    return this;
  }

  public AiMetaFill200Response addUnresolvedItem(AiMetaFill200ResponseUnresolvedInner unresolvedItem) {
    if (this.unresolved == null) {
      this.unresolved = new ArrayList<>();
    }
    this.unresolved.add(unresolvedItem);
    return this;
  }

  /**
   * The fields left as they were, with the reason for each.
   * @return unresolved
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_UNRESOLVED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiMetaFill200ResponseUnresolvedInner> getUnresolved() {
    return unresolved;
  }


  @JsonProperty(value = JSON_PROPERTY_UNRESOLVED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnresolved(@javax.annotation.Nonnull List<AiMetaFill200ResponseUnresolvedInner> unresolved) {
    this.unresolved = unresolved;
  }

  public AiMetaFill200Response sources(@javax.annotation.Nonnull List<AiMetaFill200ResponseSourcesInner> sources) {
    
    this.sources = sources;
    return this;
  }

  public AiMetaFill200Response addSourcesItem(AiMetaFill200ResponseSourcesInner sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * The documents the values were read from.
   * @return sources
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SOURCES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiMetaFill200ResponseSourcesInner> getSources() {
    return sources;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSources(@javax.annotation.Nonnull List<AiMetaFill200ResponseSourcesInner> sources) {
    this.sources = sources;
  }

  public AiMetaFill200Response skipped(@javax.annotation.Nonnull List<AiMetaGenerate200ResponseSkippedInner> skipped) {
    
    this.skipped = skipped;
    return this;
  }

  public AiMetaFill200Response addSkippedItem(AiMetaGenerate200ResponseSkippedInner skippedItem) {
    if (this.skipped == null) {
      this.skipped = new ArrayList<>();
    }
    this.skipped.add(skippedItem);
    return this;
  }

  /**
   * The entries that were left out, with the reason for each.
   * @return skipped
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SKIPPED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiMetaGenerate200ResponseSkippedInner> getSkipped() {
    return skipped;
  }


  @JsonProperty(value = JSON_PROPERTY_SKIPPED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSkipped(@javax.annotation.Nonnull List<AiMetaGenerate200ResponseSkippedInner> skipped) {
    this.skipped = skipped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMetaFill200Response aiMetaFill200Response = (AiMetaFill200Response) o;
    return Objects.equals(this.dryRun, aiMetaFill200Response.dryRun) &&
        Objects.equals(this.metadata, aiMetaFill200Response.metadata) &&
        Objects.equals(this.filled, aiMetaFill200Response.filled) &&
        Objects.equals(this.unresolved, aiMetaFill200Response.unresolved) &&
        Objects.equals(this.sources, aiMetaFill200Response.sources) &&
        Objects.equals(this.skipped, aiMetaFill200Response.skipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, metadata, filled, unresolved, sources, skipped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMetaFill200Response {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    filled: ").append(toIndentedString(filled)).append("\n");
    sb.append("    unresolved: ").append(toIndentedString(unresolved)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
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

    // add `dryRun` to the URL query string
    if (getDryRun() != null) {
      try {
        joiner.add(String.format("%sdryRun%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDryRun()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      joiner.add(getMetadata().toUrlQueryString(prefix + "metadata" + suffix));
    }

    // add `filled` to the URL query string
    if (getFilled() != null) {
      for (int i = 0; i < getFilled().size(); i++) {
        if (getFilled().get(i) != null) {
          joiner.add(getFilled().get(i).toUrlQueryString(String.format("%sfilled%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `unresolved` to the URL query string
    if (getUnresolved() != null) {
      for (int i = 0; i < getUnresolved().size(); i++) {
        if (getUnresolved().get(i) != null) {
          joiner.add(getUnresolved().get(i).toUrlQueryString(String.format("%sunresolved%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `sources` to the URL query string
    if (getSources() != null) {
      for (int i = 0; i < getSources().size(); i++) {
        if (getSources().get(i) != null) {
          joiner.add(getSources().get(i).toUrlQueryString(String.format("%ssources%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `skipped` to the URL query string
    if (getSkipped() != null) {
      for (int i = 0; i < getSkipped().size(); i++) {
        if (getSkipped().get(i) != null) {
          joiner.add(getSkipped().get(i).toUrlQueryString(String.format("%sskipped%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

