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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * [1 - None, 2 - Hour, 3 - Day, 4 - Week, 5 - Month, 6 - Year, 7 - ThreeYears, 8 - Minute]
 */
public enum PriceTimeUnit {
  
  None(1),
  
  Hour(2),
  
  Day(3),
  
  Week(4),
  
  Month(5),
  
  Year(6),
  
  ThreeYears(7),
  
  Minute(8);

  private Integer value;

  PriceTimeUnit(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return java.lang.String.valueOf(value);
  }

  @JsonCreator
  public static PriceTimeUnit fromValue(Integer value) {
    for (PriceTimeUnit b : PriceTimeUnit.values()) {
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

    return java.lang.String.format(java.util.Locale.ROOT, "%s=%s", prefix, this.toString());
  }
}

