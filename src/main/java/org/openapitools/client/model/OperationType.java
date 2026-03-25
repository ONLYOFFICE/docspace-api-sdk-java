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
 * [0 - Any, 1 - Unknown, 2 - ServicePayment, 4 - PackagePayment, 8 - ServiceUsage, 16 - Deposit, 32 - ReceiveProviderInvoice, 64 - ProcessProviderInvoice, 128 - WriteOffServiceProfit, 256 - Profit, 512 - PartnerAccrual, 1024 - ProviderPayment, 2048 - PartnerPayment, 4096 - Refund, 8192 - BankDeposit, 16384 - BankWithdrawal, 32768 - GoodwillCredit, 65536 - WriteOffProfit, 131072 - WriteOffDifferenceCurrency]
 */
public enum OperationType {
  
  Any(0),
  
  Unknown(1),
  
  ServicePayment(2),
  
  PackagePayment(4),
  
  ServiceUsage(8),
  
  Deposit(16),
  
  ReceiveProviderInvoice(32),
  
  ProcessProviderInvoice(64),
  
  WriteOffServiceProfit(128),
  
  Profit(256),
  
  PartnerAccrual(512),
  
  ProviderPayment(1024),
  
  PartnerPayment(2048),
  
  Refund(4096),
  
  BankDeposit(8192),
  
  BankWithdrawal(16384),
  
  GoodwillCredit(32768),
  
  WriteOffProfit(65536),
  
  WriteOffDifferenceCurrency(131072);

  private Integer value;

  OperationType(Integer value) {
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
  public static OperationType fromValue(Integer value) {
    for (OperationType b : OperationType.values()) {
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

    return String.format(java.util.Locale.ROOT, "%s=%s", prefix, this.toString());
  }
}

