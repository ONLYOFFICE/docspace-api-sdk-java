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
 * [0 - *, 1 - user.created, 2 - user.invited, 4 - user.updated, 8 - user.deleted, 16 - group.created, 32 - group.updated, 64 - group.deleted, 128 - file.created, 256 - file.uploaded, 512 - file.updated, 1024 - file.trashed, 2048 - file.deleted, 4096 - file.restored, 8192 - file.copied, 16384 - file.moved, 32768 - folder.created, 65536 - folder.updated, 131072 - folder.trashed, 262144 - folder.deleted, 524288 - folder.restored, 1048576 - folder.copied, 2097152 - folder.moved, 4194304 - room.created, 8388608 - room.updated, 16777216 - room.archived, 33554432 - room.deleted, 67108864 - room.restored, 134217728 - room.copied, 268435456 - form.submit, 536870912 - form.filled.out, 1073741824 - form.stopped]
 */
public enum WebhookTrigger {
  
  All(0),
  
  UserCreated(1),
  
  UserInvited(2),
  
  UserUpdated(4),
  
  UserDeleted(8),
  
  GroupCreated(16),
  
  GroupUpdated(32),
  
  GroupDeleted(64),
  
  FileCreated(128),
  
  FileUploaded(256),
  
  FileUpdated(512),
  
  FileTrashed(1024),
  
  FileDeleted(2048),
  
  FileRestored(4096),
  
  FileCopied(8192),
  
  FileMoved(16384),
  
  FolderCreated(32768),
  
  FolderUpdated(65536),
  
  FolderTrashed(131072),
  
  FolderDeleted(262144),
  
  FolderRestored(524288),
  
  FolderCopied(1048576),
  
  FolderMoved(2097152),
  
  RoomCreated(4194304),
  
  RoomUpdated(8388608),
  
  RoomArchived(16777216),
  
  RoomDeleted(33554432),
  
  RoomRestored(67108864),
  
  RoomCopied(134217728),
  
  FormSubmit(268435456),
  
  FormFilledOut(536870912),
  
  FormStopped(1073741824);

  private Integer value;

  WebhookTrigger(Integer value) {
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
  public static WebhookTrigger fromValue(Integer value) {
    for (WebhookTrigger b : WebhookTrigger.values()) {
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

