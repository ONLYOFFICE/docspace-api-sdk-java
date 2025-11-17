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
 * [EmpInvite - Emp invite, LinkInvite - Link invite, PortalSuspend - Portal suspend, PortalContinue - Portal continue, PortalRemove - Portal remove, DnsChange - Dns change, PortalOwnerChange - Portal owner change, Activation - Activation, EmailChange - Email change, EmailActivation - Email activation, PasswordChange - Password change, ProfileRemove - Profile remove, PhoneActivation - Phone activation, PhoneAuth - Phone auth, Auth - Auth, TfaActivation - Tfa activation, TfaAuth - Tfa auth, Wizard - Wizard, GuestShareLink - Guest share link]
 */
public enum ConfirmType {
  
  EMP_INVITE("EmpInvite"),
  
  LINK_INVITE("LinkInvite"),
  
  PORTAL_SUSPEND("PortalSuspend"),
  
  PORTAL_CONTINUE("PortalContinue"),
  
  PORTAL_REMOVE("PortalRemove"),
  
  DNS_CHANGE("DnsChange"),
  
  PORTAL_OWNER_CHANGE("PortalOwnerChange"),
  
  ACTIVATION("Activation"),
  
  EMAIL_CHANGE("EmailChange"),
  
  EMAIL_ACTIVATION("EmailActivation"),
  
  PASSWORD_CHANGE("PasswordChange"),
  
  PROFILE_REMOVE("ProfileRemove"),
  
  PHONE_ACTIVATION("PhoneActivation"),
  
  PHONE_AUTH("PhoneAuth"),
  
  AUTH("Auth"),
  
  TFA_ACTIVATION("TfaActivation"),
  
  TFA_AUTH("TfaAuth"),
  
  WIZARD("Wizard"),
  
  GUEST_SHARE_LINK("GuestShareLink");

  private String value;

  ConfirmType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConfirmType fromValue(String value) {
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

