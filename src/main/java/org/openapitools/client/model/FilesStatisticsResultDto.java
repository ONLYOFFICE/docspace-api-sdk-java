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
import org.openapitools.client.model.FilesStatisticsFolder;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The file statistics result parameters.
 */
@JsonPropertyOrder({
  FilesStatisticsResultDto.JSON_PROPERTY_MY_DOCUMENTS_USED_SPACE,
  FilesStatisticsResultDto.JSON_PROPERTY_TRASH_USED_SPACE,
  FilesStatisticsResultDto.JSON_PROPERTY_ARCHIVE_USED_SPACE,
  FilesStatisticsResultDto.JSON_PROPERTY_ROOMS_USED_SPACE,
  FilesStatisticsResultDto.JSON_PROPERTY_AI_AGENTS_USED_SPACE
})

public class FilesStatisticsResultDto {
  public static final String JSON_PROPERTY_MY_DOCUMENTS_USED_SPACE = "myDocumentsUsedSpace";
  @javax.annotation.Nullable
  private FilesStatisticsFolder myDocumentsUsedSpace;

  public static final String JSON_PROPERTY_TRASH_USED_SPACE = "trashUsedSpace";
  @javax.annotation.Nullable
  private FilesStatisticsFolder trashUsedSpace;

  public static final String JSON_PROPERTY_ARCHIVE_USED_SPACE = "archiveUsedSpace";
  @javax.annotation.Nullable
  private FilesStatisticsFolder archiveUsedSpace;

  public static final String JSON_PROPERTY_ROOMS_USED_SPACE = "roomsUsedSpace";
  @javax.annotation.Nullable
  private FilesStatisticsFolder roomsUsedSpace;

  public static final String JSON_PROPERTY_AI_AGENTS_USED_SPACE = "aiAgentsUsedSpace";
  @javax.annotation.Nullable
  private FilesStatisticsFolder aiAgentsUsedSpace;

  public FilesStatisticsResultDto() {
  }

  public FilesStatisticsResultDto myDocumentsUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder myDocumentsUsedSpace) {
    
    this.myDocumentsUsedSpace = myDocumentsUsedSpace;
    return this;
  }

  /**
   * Get myDocumentsUsedSpace
   * @return myDocumentsUsedSpace
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MY_DOCUMENTS_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilesStatisticsFolder getMyDocumentsUsedSpace() {
    return myDocumentsUsedSpace;
  }


  @JsonProperty(JSON_PROPERTY_MY_DOCUMENTS_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyDocumentsUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder myDocumentsUsedSpace) {
    this.myDocumentsUsedSpace = myDocumentsUsedSpace;
  }

  public FilesStatisticsResultDto trashUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder trashUsedSpace) {
    
    this.trashUsedSpace = trashUsedSpace;
    return this;
  }

  /**
   * Get trashUsedSpace
   * @return trashUsedSpace
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRASH_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilesStatisticsFolder getTrashUsedSpace() {
    return trashUsedSpace;
  }


  @JsonProperty(JSON_PROPERTY_TRASH_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrashUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder trashUsedSpace) {
    this.trashUsedSpace = trashUsedSpace;
  }

  public FilesStatisticsResultDto archiveUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder archiveUsedSpace) {
    
    this.archiveUsedSpace = archiveUsedSpace;
    return this;
  }

  /**
   * Get archiveUsedSpace
   * @return archiveUsedSpace
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilesStatisticsFolder getArchiveUsedSpace() {
    return archiveUsedSpace;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVE_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchiveUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder archiveUsedSpace) {
    this.archiveUsedSpace = archiveUsedSpace;
  }

  public FilesStatisticsResultDto roomsUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder roomsUsedSpace) {
    
    this.roomsUsedSpace = roomsUsedSpace;
    return this;
  }

  /**
   * Get roomsUsedSpace
   * @return roomsUsedSpace
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOMS_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilesStatisticsFolder getRoomsUsedSpace() {
    return roomsUsedSpace;
  }


  @JsonProperty(JSON_PROPERTY_ROOMS_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomsUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder roomsUsedSpace) {
    this.roomsUsedSpace = roomsUsedSpace;
  }

  public FilesStatisticsResultDto aiAgentsUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder aiAgentsUsedSpace) {
    
    this.aiAgentsUsedSpace = aiAgentsUsedSpace;
    return this;
  }

  /**
   * Get aiAgentsUsedSpace
   * @return aiAgentsUsedSpace
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AI_AGENTS_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilesStatisticsFolder getAiAgentsUsedSpace() {
    return aiAgentsUsedSpace;
  }


  @JsonProperty(JSON_PROPERTY_AI_AGENTS_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiAgentsUsedSpace(@javax.annotation.Nullable FilesStatisticsFolder aiAgentsUsedSpace) {
    this.aiAgentsUsedSpace = aiAgentsUsedSpace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesStatisticsResultDto filesStatisticsResultDto = (FilesStatisticsResultDto) o;
    return Objects.equals(this.myDocumentsUsedSpace, filesStatisticsResultDto.myDocumentsUsedSpace) &&
        Objects.equals(this.trashUsedSpace, filesStatisticsResultDto.trashUsedSpace) &&
        Objects.equals(this.archiveUsedSpace, filesStatisticsResultDto.archiveUsedSpace) &&
        Objects.equals(this.roomsUsedSpace, filesStatisticsResultDto.roomsUsedSpace) &&
        Objects.equals(this.aiAgentsUsedSpace, filesStatisticsResultDto.aiAgentsUsedSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myDocumentsUsedSpace, trashUsedSpace, archiveUsedSpace, roomsUsedSpace, aiAgentsUsedSpace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesStatisticsResultDto {\n");
    sb.append("    myDocumentsUsedSpace: ").append(toIndentedString(myDocumentsUsedSpace)).append("\n");
    sb.append("    trashUsedSpace: ").append(toIndentedString(trashUsedSpace)).append("\n");
    sb.append("    archiveUsedSpace: ").append(toIndentedString(archiveUsedSpace)).append("\n");
    sb.append("    roomsUsedSpace: ").append(toIndentedString(roomsUsedSpace)).append("\n");
    sb.append("    aiAgentsUsedSpace: ").append(toIndentedString(aiAgentsUsedSpace)).append("\n");
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

    // add `myDocumentsUsedSpace` to the URL query string
    if (getMyDocumentsUsedSpace() != null) {
      joiner.add(getMyDocumentsUsedSpace().toUrlQueryString(prefix + "myDocumentsUsedSpace" + suffix));
    }

    // add `trashUsedSpace` to the URL query string
    if (getTrashUsedSpace() != null) {
      joiner.add(getTrashUsedSpace().toUrlQueryString(prefix + "trashUsedSpace" + suffix));
    }

    // add `archiveUsedSpace` to the URL query string
    if (getArchiveUsedSpace() != null) {
      joiner.add(getArchiveUsedSpace().toUrlQueryString(prefix + "archiveUsedSpace" + suffix));
    }

    // add `roomsUsedSpace` to the URL query string
    if (getRoomsUsedSpace() != null) {
      joiner.add(getRoomsUsedSpace().toUrlQueryString(prefix + "roomsUsedSpace" + suffix));
    }

    // add `aiAgentsUsedSpace` to the URL query string
    if (getAiAgentsUsedSpace() != null) {
      joiner.add(getAiAgentsUsedSpace().toUrlQueryString(prefix + "aiAgentsUsedSpace" + suffix));
    }

    return joiner.toString();
  }

}

