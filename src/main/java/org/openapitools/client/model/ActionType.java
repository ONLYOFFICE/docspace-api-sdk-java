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
 * [0 - None, 1 - Create, 2 - Update, 3 - Delete, 4 - Link, 5 - Unlink, 6 - Attach, 7 - Detach, 8 - Send, 9 - Import, 10 - Export, 11 - Update access, 12 - Download, 13 - Upload, 14 - Copy, 15 - Move, 16 - Reassigns, 17 - Follow, 18 - Unfollow, 19 - Logout]
 */
public enum ActionType {
  
  /**
   * None
   */
  None(0),
  
  /**
   * Create
   */
  Create(1),
  
  /**
   * Update
   */
  Update(2),
  
  /**
   * Delete
   */
  Delete(3),
  
  /**
   * Link
   */
  Link(4),
  
  /**
   * Unlink
   */
  Unlink(5),
  
  /**
   * Attach
   */
  Attach(6),
  
  /**
   * Detach
   */
  Detach(7),
  
  /**
   * Send
   */
  Send(8),
  
  /**
   * Import
   */
  Import(9),
  
  /**
   * Export
   */
  Export(10),
  
  /**
   * Update access
   */
  UpdateAccess(11),
  
  /**
   * Download
   */
  Download(12),
  
  /**
   * Upload
   */
  Upload(13),
  
  /**
   * Copy
   */
  Copy(14),
  
  /**
   * Move
   */
  Move(15),
  
  /**
   * Reassigns
   */
  Reassigns(16),
  
  /**
   * Follow
   */
  Follow(17),
  
  /**
   * Unfollow
   */
  Unfollow(18),
  
  /**
   * Logout
   */
  Logout(19);

  private Integer value;

  ActionType(Integer value) {
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
  public static ActionType fromValue(Integer value) {
    for (ActionType b : ActionType.values()) {
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

