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
 * [0 - Date and time, 1 - AZ, 2 - Size, 3 - Author, 4 - Type, 5 - New, 6 - Date and time creation, 7 - Room type, 8 - Tags, 9 - Room, 10 - Custom order, 11 - Last opened, 12 - Used space]
 */
public enum SortedByType {
  
  /**
   * Date and time
   */
  DateAndTime(0),
  
  /**
   * AZ
   */
  AZ(1),
  
  /**
   * Size
   */
  Size(2),
  
  /**
   * Author
   */
  Author(3),
  
  /**
   * Type
   */
  Type(4),
  
  /**
   * New
   */
  New(5),
  
  /**
   * Date and time creation
   */
  DateAndTimeCreation(6),
  
  /**
   * Room type
   */
  RoomType(7),
  
  /**
   * Tags
   */
  Tags(8),
  
  /**
   * Room
   */
  Room(9),
  
  /**
   * Custom order
   */
  CustomOrder(10),
  
  /**
   * Last opened
   */
  LastOpened(11),
  
  /**
   * Used space
   */
  UsedSpace(12);

  private Integer value;

  SortedByType(Integer value) {
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
  public static SortedByType fromValue(Integer value) {
    for (SortedByType b : SortedByType.values()) {
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

