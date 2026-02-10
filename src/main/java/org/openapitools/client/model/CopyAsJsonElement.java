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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.CopyAsJsonElementDestFolderId;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The parameters for copying a file.
 */
@JsonPropertyOrder({
  CopyAsJsonElement.JSON_PROPERTY_DEST_TITLE,
  CopyAsJsonElement.JSON_PROPERTY_DEST_FOLDER_ID,
  CopyAsJsonElement.JSON_PROPERTY_ENABLE_EXTERNAL_EXT,
  CopyAsJsonElement.JSON_PROPERTY_PASSWORD,
  CopyAsJsonElement.JSON_PROPERTY_TO_FORM
})

public class CopyAsJsonElement {
  public static final String JSON_PROPERTY_DEST_TITLE = "destTitle";
  @javax.annotation.Nullable
  private String destTitle;

  public static final String JSON_PROPERTY_DEST_FOLDER_ID = "destFolderId";
  @javax.annotation.Nonnull
  private CopyAsJsonElementDestFolderId destFolderId;

  public static final String JSON_PROPERTY_ENABLE_EXTERNAL_EXT = "enableExternalExt";
  @javax.annotation.Nullable
  private Boolean enableExternalExt;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TO_FORM = "toForm";
  @javax.annotation.Nullable
  private Boolean toForm;

  public CopyAsJsonElement() {
  }


  public CopyAsJsonElement destTitle(@javax.annotation.Nullable String destTitle) {
    
    this.destTitle = destTitle;
    return this;
  }

  /**
   * The copied file name.
   * @return destTitle
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEST_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestTitle() {
    return destTitle;
  }


  @JsonProperty(JSON_PROPERTY_DEST_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestTitle(@javax.annotation.Nullable String destTitle) {
    this.destTitle = destTitle;
  }

  public CopyAsJsonElement destFolderId(@javax.annotation.Nonnull CopyAsJsonElementDestFolderId destFolderId) {
    
    this.destFolderId = destFolderId;
    return this;
  }

  /**
   * Get destFolderId
   * @return destFolderId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEST_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CopyAsJsonElementDestFolderId getDestFolderId() {
    return destFolderId;
  }


  @JsonProperty(JSON_PROPERTY_DEST_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestFolderId(@javax.annotation.Nonnull CopyAsJsonElementDestFolderId destFolderId) {
    this.destFolderId = destFolderId;
  }

  public CopyAsJsonElement enableExternalExt(@javax.annotation.Nullable Boolean enableExternalExt) {
    
    this.enableExternalExt = enableExternalExt;
    return this;
  }

  /**
   * Specifies whether to allow creating the copied file of an external extension or not.
   * @return enableExternalExt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_EXTERNAL_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableExternalExt() {
    return enableExternalExt;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_EXTERNAL_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableExternalExt(@javax.annotation.Nullable Boolean enableExternalExt) {
    this.enableExternalExt = enableExternalExt;
  }

  public CopyAsJsonElement password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The copied file password.
   * @return password
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
  }

  public CopyAsJsonElement toForm(@javax.annotation.Nullable Boolean toForm) {
    
    this.toForm = toForm;
    return this;
  }

  /**
   * Specifies whether to convert the file to form or not.
   * @return toForm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getToForm() {
    return toForm;
  }


  @JsonProperty(JSON_PROPERTY_TO_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToForm(@javax.annotation.Nullable Boolean toForm) {
    this.toForm = toForm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyAsJsonElement copyAsJsonElement = (CopyAsJsonElement) o;
    return Objects.equals(this.destTitle, copyAsJsonElement.destTitle) &&
        Objects.equals(this.destFolderId, copyAsJsonElement.destFolderId) &&
        Objects.equals(this.enableExternalExt, copyAsJsonElement.enableExternalExt) &&
        equalsNullable(this.password, copyAsJsonElement.password) &&
        Objects.equals(this.toForm, copyAsJsonElement.toForm);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(destTitle, destFolderId, enableExternalExt, hashCodeNullable(password), toForm);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyAsJsonElement {\n");
    sb.append("    destTitle: ").append(toIndentedString(destTitle)).append("\n");
    sb.append("    destFolderId: ").append(toIndentedString(destFolderId)).append("\n");
    sb.append("    enableExternalExt: ").append(toIndentedString(enableExternalExt)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    toForm: ").append(toIndentedString(toForm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `destTitle` to the URL query string
    if (getDestTitle() != null) {
      try {
        joiner.add(String.format("%sdestTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `destFolderId` to the URL query string
    if (getDestFolderId() != null) {
      joiner.add(getDestFolderId().toUrlQueryString(prefix + "destFolderId" + suffix));
    }

    // add `enableExternalExt` to the URL query string
    if (getEnableExternalExt() != null) {
      try {
        joiner.add(String.format("%senableExternalExt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableExternalExt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `toForm` to the URL query string
    if (getToForm() != null) {
      try {
        joiner.add(String.format("%stoForm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToForm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

