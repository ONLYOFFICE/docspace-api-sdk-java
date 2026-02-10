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
 * [0 - None, 1 - Read and write, 2 - Read, 3 - Restrict, 4 - Varies, 5 - Review, 6 - Comment, 7 - Fill forms, 8 - Custom filter, 9 - Room manager, 10 - Editing, 11 - Content creator]
 */
public enum FileShare {
  
  /**
   * None
   */
  None(0),
  
  /**
   * Read and write
   */
  ReadWrite(1),
  
  /**
   * Read
   */
  Read(2),
  
  /**
   * Restrict
   */
  Restrict(3),
  
  /**
   * Varies
   */
  Varies(4),
  
  /**
   * Review
   */
  Review(5),
  
  /**
   * Comment
   */
  Comment(6),
  
  /**
   * Fill forms
   */
  FillForms(7),
  
  /**
   * Custom filter
   */
  CustomFilter(8),
  
  /**
   * Room manager
   */
  RoomManager(9),
  
  /**
   * Editing
   */
  Editing(10),
  
  /**
   * Content creator
   */
  ContentCreator(11);

  private Integer value;

  FileShare(Integer value) {
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
  public static FileShare fromValue(Integer value) {
    for (FileShare b : FileShare.values()) {
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

