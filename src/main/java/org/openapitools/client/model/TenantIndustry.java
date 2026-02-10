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
 * [0 - Other, 1 - Accounting, 2 - Advertising marketing PR, 3 - Banking, 4 - Consulting, 5 - Design, 6 - Education, 7 - Environment, 8 - Financial services, 9 - Health care, 10 - IT, 11 - Legal, 12 - Manufacturing, 13 - Public sector, 14 - Publishing, 15 - Retail sales, 16 - Telecommunications]
 */
public enum TenantIndustry {
  
  /**
   * Other
   */
  Other(0),
  
  /**
   * Accounting
   */
  Accounting(1),
  
  /**
   * Advertising marketing PR
   */
  AdvertisingMarketingPR(2),
  
  /**
   * Banking
   */
  Banking(3),
  
  /**
   * Consulting
   */
  Consulting(4),
  
  /**
   * Design
   */
  Design(5),
  
  /**
   * Education
   */
  Education(6),
  
  /**
   * Environment
   */
  Environment(7),
  
  /**
   * Financial services
   */
  FinancialServices(8),
  
  /**
   * Health care
   */
  HealthCare(9),
  
  /**
   * IT
   */
  IT(10),
  
  /**
   * Legal
   */
  Legal(11),
  
  /**
   * Manufacturing
   */
  Manufacturing(12),
  
  /**
   * Public sector
   */
  PublicSector(13),
  
  /**
   * Publishing
   */
  Publishing(14),
  
  /**
   * Retail sales
   */
  RetailSales(15),
  
  /**
   * Telecommunications
   */
  Telecommunications(16);

  private Integer value;

  TenantIndustry(Integer value) {
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
  public static TenantIndustry fromValue(Integer value) {
    for (TenantIndustry b : TenantIndustry.values()) {
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

