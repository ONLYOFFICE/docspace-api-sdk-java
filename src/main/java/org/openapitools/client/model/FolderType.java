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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * [0 - Default, 1 - Coomon, 2 - Bunch, 3 - Trash, 5 - User, 6 - Share, 8 - Projects, 10 - Favourites, 11 - Recent, 12 - Templates, 13 - Privacy, 14 - Virtual rooms, 15 - Filling forms room, 16 - Editing room, 19 - Custom room, 20 - Archive, 21 - Thirdparty backup, 22 - Public room, 25 - Ready form folder, 26 - In process form folder, 27 - Form filling folder done, 28 - Form filling folder in progress, 29 - Virtual Data Room, 30 - Room templates folder, 31 - AI Room, 32 - Knowledge, 33 - Result storage, 34 - AI Agents]
 */
public enum FolderType {
  
  /**
   * Default
   */
  DEFAULT(0),
  
  /**
   * Coomon
   */
  COMMON(1),
  
  /**
   * Bunch
   */
  BUNCH(2),
  
  /**
   * Trash
   */
  TRASH(3),
  
  /**
   * User
   */
  USER(5),
  
  /**
   * Share
   */
  SHARE(6),
  
  /**
   * Projects
   */
  Projects(8),
  
  /**
   * Favourites
   */
  Favorites(10),
  
  /**
   * Recent
   */
  Recent(11),
  
  /**
   * Templates
   */
  Templates(12),
  
  /**
   * Privacy
   */
  Privacy(13),
  
  /**
   * Virtual rooms
   */
  VirtualRooms(14),
  
  /**
   * Filling forms room
   */
  FillingFormsRoom(15),
  
  /**
   * Editing room
   */
  EditingRoom(16),
  
  /**
   * Custom room
   */
  CustomRoom(19),
  
  /**
   * Archive
   */
  Archive(20),
  
  /**
   * Thirdparty backup
   */
  ThirdpartyBackup(21),
  
  /**
   * Public room
   */
  PublicRoom(22),
  
  /**
   * Ready form folder
   */
  ReadyFormFolder(25),
  
  /**
   * In process form folder
   */
  InProcessFormFolder(26),
  
  /**
   * Form filling folder done
   */
  FormFillingFolderDone(27),
  
  /**
   * Form filling folder in progress
   */
  FormFillingFolderInProgress(28),
  
  /**
   * Virtual Data Room
   */
  VirtualDataRoom(29),
  
  /**
   * Room templates folder
   */
  RoomTemplates(30),
  
  /**
   * AI Room
   */
  AiRoom(31),
  
  /**
   * Knowledge
   */
  Knowledge(32),
  
  /**
   * Result storage
   */
  ResultStorage(33),
  
  /**
   * AI Agents
   */
  AiAgents(34);

  private Integer value;

  FolderType(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FolderType fromValue(Integer value) {
    for (FolderType b : FolderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }
}

