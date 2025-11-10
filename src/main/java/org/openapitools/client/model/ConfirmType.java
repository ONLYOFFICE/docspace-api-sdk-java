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
 * [0 - Emp invite, 1 - Link invite, 2 - Portal suspend, 3 - Portal continue, 4 - Portal remove, 5 - Dns change, 6 - Portal owner change, 7 - Activation, 8 - Email change, 9 - Email activation, 10 - Password change, 11 - Profile remove, 12 - Phone activation, 13 - Phone auth, 14 - Auth, 15 - Tfa activation, 16 - Tfa auth, 17 - Wizard, 18 - Guest share link]
 */
public enum ConfirmType {
  
  /**
   * Emp invite
   */
  EmpInvite(0),
  
  /**
   * Link invite
   */
  LinkInvite(1),
  
  /**
   * Portal suspend
   */
  PortalSuspend(2),
  
  /**
   * Portal continue
   */
  PortalContinue(3),
  
  /**
   * Portal remove
   */
  PortalRemove(4),
  
  /**
   * Dns change
   */
  DnsChange(5),
  
  /**
   * Portal owner change
   */
  PortalOwnerChange(6),
  
  /**
   * Activation
   */
  Activation(7),
  
  /**
   * Email change
   */
  EmailChange(8),
  
  /**
   * Email activation
   */
  EmailActivation(9),
  
  /**
   * Password change
   */
  PasswordChange(10),
  
  /**
   * Profile remove
   */
  ProfileRemove(11),
  
  /**
   * Phone activation
   */
  PhoneActivation(12),
  
  /**
   * Phone auth
   */
  PhoneAuth(13),
  
  /**
   * Auth
   */
  Auth(14),
  
  /**
   * Tfa activation
   */
  TfaActivation(15),
  
  /**
   * Tfa auth
   */
  TfaAuth(16),
  
  /**
   * Wizard
   */
  Wizard(17),
  
  /**
   * Guest share link
   */
  GuestShareLink(18);

  private Integer value;

  ConfirmType(Integer value) {
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
  public static ConfirmType fromValue(Integer value) {
    for (ConfirmType b : ConfirmType.values()) {
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

