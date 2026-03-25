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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The internal file formats.
 */
@JsonPropertyOrder({
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_UNKNOWN,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_ARCHIVE,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_VIDEO,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_AUDIO,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_IMAGE,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_SPREADSHEET,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_PRESENTATION,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_DOCUMENT,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_PDF,
  FilesSettingsDtoInternalFormats.JSON_PROPERTY_DIAGRAM
})
@JsonTypeName("FilesSettingsDto_internalFormats")

public class FilesSettingsDtoInternalFormats {
  public static final String JSON_PROPERTY_UNKNOWN = "Unknown";
  @javax.annotation.Nullable  private String unknown;

  public static final String JSON_PROPERTY_ARCHIVE = "Archive";
  @javax.annotation.Nullable  private String archive;

  public static final String JSON_PROPERTY_VIDEO = "Video";
  @javax.annotation.Nullable  private String video;

  public static final String JSON_PROPERTY_AUDIO = "Audio";
  @javax.annotation.Nullable  private String audio;

  public static final String JSON_PROPERTY_IMAGE = "Image";
  @javax.annotation.Nullable  private String image;

  public static final String JSON_PROPERTY_SPREADSHEET = "Spreadsheet";
  @javax.annotation.Nullable  private String spreadsheet;

  public static final String JSON_PROPERTY_PRESENTATION = "Presentation";
  @javax.annotation.Nullable  private String presentation;

  public static final String JSON_PROPERTY_DOCUMENT = "Document";
  @javax.annotation.Nullable  private String document;

  public static final String JSON_PROPERTY_PDF = "Pdf";
  @javax.annotation.Nullable  private String pdf;

  public static final String JSON_PROPERTY_DIAGRAM = "Diagram";
  @javax.annotation.Nullable  private String diagram;

  public FilesSettingsDtoInternalFormats() {
  }


  public FilesSettingsDtoInternalFormats unknown(@javax.annotation.Nullable String unknown) {
    
    this.unknown = unknown;
    return this;
  }

  /**
   * Get unknown
   * @return unknown
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UNKNOWN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnknown() {
    return unknown;
  }


  @JsonProperty(value = JSON_PROPERTY_UNKNOWN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnknown(@javax.annotation.Nullable String unknown) {
    this.unknown = unknown;
  }

  public FilesSettingsDtoInternalFormats archive(@javax.annotation.Nullable String archive) {
    
    this.archive = archive;
    return this;
  }

  /**
   * Get archive
   * @return archive
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ARCHIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArchive() {
    return archive;
  }


  @JsonProperty(value = JSON_PROPERTY_ARCHIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchive(@javax.annotation.Nullable String archive) {
    this.archive = archive;
  }

  public FilesSettingsDtoInternalFormats video(@javax.annotation.Nullable String video) {
    
    this.video = video;
    return this;
  }

  /**
   * Get video
   * @return video
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VIDEO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideo() {
    return video;
  }


  @JsonProperty(value = JSON_PROPERTY_VIDEO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo(@javax.annotation.Nullable String video) {
    this.video = video;
  }

  public FilesSettingsDtoInternalFormats audio(@javax.annotation.Nullable String audio) {
    
    this.audio = audio;
    return this;
  }

  /**
   * Get audio
   * @return audio
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AUDIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudio() {
    return audio;
  }


  @JsonProperty(value = JSON_PROPERTY_AUDIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudio(@javax.annotation.Nullable String audio) {
    this.audio = audio;
  }

  public FilesSettingsDtoInternalFormats image(@javax.annotation.Nullable String image) {
    
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImage() {
    return image;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(@javax.annotation.Nullable String image) {
    this.image = image;
  }

  public FilesSettingsDtoInternalFormats spreadsheet(@javax.annotation.Nullable String spreadsheet) {
    
    this.spreadsheet = spreadsheet;
    return this;
  }

  /**
   * Get spreadsheet
   * @return spreadsheet
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SPREADSHEET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpreadsheet() {
    return spreadsheet;
  }


  @JsonProperty(value = JSON_PROPERTY_SPREADSHEET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpreadsheet(@javax.annotation.Nullable String spreadsheet) {
    this.spreadsheet = spreadsheet;
  }

  public FilesSettingsDtoInternalFormats presentation(@javax.annotation.Nullable String presentation) {
    
    this.presentation = presentation;
    return this;
  }

  /**
   * Get presentation
   * @return presentation
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRESENTATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPresentation() {
    return presentation;
  }


  @JsonProperty(value = JSON_PROPERTY_PRESENTATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentation(@javax.annotation.Nullable String presentation) {
    this.presentation = presentation;
  }

  public FilesSettingsDtoInternalFormats document(@javax.annotation.Nullable String document) {
    
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOCUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocument() {
    return document;
  }


  @JsonProperty(value = JSON_PROPERTY_DOCUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocument(@javax.annotation.Nullable String document) {
    this.document = document;
  }

  public FilesSettingsDtoInternalFormats pdf(@javax.annotation.Nullable String pdf) {
    
    this.pdf = pdf;
    return this;
  }

  /**
   * Get pdf
   * @return pdf
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PDF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPdf() {
    return pdf;
  }


  @JsonProperty(value = JSON_PROPERTY_PDF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPdf(@javax.annotation.Nullable String pdf) {
    this.pdf = pdf;
  }

  public FilesSettingsDtoInternalFormats diagram(@javax.annotation.Nullable String diagram) {
    
    this.diagram = diagram;
    return this;
  }

  /**
   * Get diagram
   * @return diagram
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DIAGRAM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiagram() {
    return diagram;
  }


  @JsonProperty(value = JSON_PROPERTY_DIAGRAM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiagram(@javax.annotation.Nullable String diagram) {
    this.diagram = diagram;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesSettingsDtoInternalFormats filesSettingsDtoInternalFormats = (FilesSettingsDtoInternalFormats) o;
    return Objects.equals(this.unknown, filesSettingsDtoInternalFormats.unknown) &&
        Objects.equals(this.archive, filesSettingsDtoInternalFormats.archive) &&
        Objects.equals(this.video, filesSettingsDtoInternalFormats.video) &&
        Objects.equals(this.audio, filesSettingsDtoInternalFormats.audio) &&
        Objects.equals(this.image, filesSettingsDtoInternalFormats.image) &&
        Objects.equals(this.spreadsheet, filesSettingsDtoInternalFormats.spreadsheet) &&
        Objects.equals(this.presentation, filesSettingsDtoInternalFormats.presentation) &&
        Objects.equals(this.document, filesSettingsDtoInternalFormats.document) &&
        Objects.equals(this.pdf, filesSettingsDtoInternalFormats.pdf) &&
        Objects.equals(this.diagram, filesSettingsDtoInternalFormats.diagram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknown, archive, video, audio, image, spreadsheet, presentation, document, pdf, diagram);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesSettingsDtoInternalFormats {\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    spreadsheet: ").append(toIndentedString(spreadsheet)).append("\n");
    sb.append("    presentation: ").append(toIndentedString(presentation)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    diagram: ").append(toIndentedString(diagram)).append("\n");
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

    // add `Unknown` to the URL query string
    if (getUnknown() != null) {
      try {
        joiner.add(String.format("%sUnknown%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnknown()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Archive` to the URL query string
    if (getArchive() != null) {
      try {
        joiner.add(String.format("%sArchive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getArchive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Video` to the URL query string
    if (getVideo() != null) {
      try {
        joiner.add(String.format("%sVideo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVideo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Audio` to the URL query string
    if (getAudio() != null) {
      try {
        joiner.add(String.format("%sAudio%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAudio()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Image` to the URL query string
    if (getImage() != null) {
      try {
        joiner.add(String.format("%sImage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Spreadsheet` to the URL query string
    if (getSpreadsheet() != null) {
      try {
        joiner.add(String.format("%sSpreadsheet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpreadsheet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Presentation` to the URL query string
    if (getPresentation() != null) {
      try {
        joiner.add(String.format("%sPresentation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPresentation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Document` to the URL query string
    if (getDocument() != null) {
      try {
        joiner.add(String.format("%sDocument%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocument()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Pdf` to the URL query string
    if (getPdf() != null) {
      try {
        joiner.add(String.format("%sPdf%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPdf()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Diagram` to the URL query string
    if (getDiagram() != null) {
      try {
        joiner.add(String.format("%sDiagram%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiagram()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

