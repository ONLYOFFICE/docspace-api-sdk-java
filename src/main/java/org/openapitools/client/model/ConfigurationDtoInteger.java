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
import java.net.URI;
import org.openapitools.client.model.DocumentConfigDto;
import org.openapitools.client.model.EditorConfigurationDto;
import org.openapitools.client.model.EditorType;
import org.openapitools.client.model.FileDtoInteger;
import org.openapitools.client.model.StartFillingMode;
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
 * The configuration parameters.
 */
@JsonPropertyOrder({
  ConfigurationDtoInteger.JSON_PROPERTY_DOCUMENT,
  ConfigurationDtoInteger.JSON_PROPERTY_DOCUMENT_TYPE,
  ConfigurationDtoInteger.JSON_PROPERTY_EDITOR_CONFIG,
  ConfigurationDtoInteger.JSON_PROPERTY_EDITOR_TYPE,
  ConfigurationDtoInteger.JSON_PROPERTY_EDITOR_URL,
  ConfigurationDtoInteger.JSON_PROPERTY_TOKEN,
  ConfigurationDtoInteger.JSON_PROPERTY_TYPE,
  ConfigurationDtoInteger.JSON_PROPERTY_FILE,
  ConfigurationDtoInteger.JSON_PROPERTY_ERROR_MESSAGE,
  ConfigurationDtoInteger.JSON_PROPERTY_START_FILLING,
  ConfigurationDtoInteger.JSON_PROPERTY_FILLING_STATUS,
  ConfigurationDtoInteger.JSON_PROPERTY_START_FILLING_MODE,
  ConfigurationDtoInteger.JSON_PROPERTY_FILLING_SESSION_ID
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class ConfigurationDtoInteger {
  public static final String JSON_PROPERTY_DOCUMENT = "document";
  @javax.annotation.Nonnull
  private DocumentConfigDto document;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "documentType";
  @javax.annotation.Nullable
  private String documentType;

  public static final String JSON_PROPERTY_EDITOR_CONFIG = "editorConfig";
  @javax.annotation.Nonnull
  private EditorConfigurationDto editorConfig;

  public static final String JSON_PROPERTY_EDITOR_TYPE = "editorType";
  @javax.annotation.Nonnull
  private EditorType editorType;

  public static final String JSON_PROPERTY_EDITOR_URL = "editorUrl";
  @javax.annotation.Nullable
  private URI editorUrl;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private JsonNullable<String> token = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FILE = "file";
  @javax.annotation.Nonnull
  private FileDtoInteger _file;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  @javax.annotation.Nullable
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_START_FILLING = "startFilling";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> startFilling = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FILLING_STATUS = "fillingStatus";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> fillingStatus = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_START_FILLING_MODE = "startFillingMode";
  @javax.annotation.Nullable
  private StartFillingMode startFillingMode;

  public static final String JSON_PROPERTY_FILLING_SESSION_ID = "fillingSessionId";
  @javax.annotation.Nullable
  private JsonNullable<String> fillingSessionId = JsonNullable.<String>undefined();

  public ConfigurationDtoInteger() {
  }

  public ConfigurationDtoInteger document(@javax.annotation.Nonnull DocumentConfigDto document) {
    
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DocumentConfigDto getDocument() {
    return document;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocument(@javax.annotation.Nonnull DocumentConfigDto document) {
    this.document = document;
  }

  public ConfigurationDtoInteger documentType(@javax.annotation.Nullable String documentType) {
    
    this.documentType = documentType;
    return this;
  }

  /**
   * The document type.
   * @return documentType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocumentType() {
    return documentType;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentType(@javax.annotation.Nullable String documentType) {
    this.documentType = documentType;
  }

  public ConfigurationDtoInteger editorConfig(@javax.annotation.Nonnull EditorConfigurationDto editorConfig) {
    
    this.editorConfig = editorConfig;
    return this;
  }

  /**
   * Get editorConfig
   * @return editorConfig
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EDITOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EditorConfigurationDto getEditorConfig() {
    return editorConfig;
  }


  @JsonProperty(JSON_PROPERTY_EDITOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEditorConfig(@javax.annotation.Nonnull EditorConfigurationDto editorConfig) {
    this.editorConfig = editorConfig;
  }

  public ConfigurationDtoInteger editorType(@javax.annotation.Nonnull EditorType editorType) {
    
    this.editorType = editorType;
    return this;
  }

  /**
   * Get editorType
   * @return editorType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EDITOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EditorType getEditorType() {
    return editorType;
  }


  @JsonProperty(JSON_PROPERTY_EDITOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEditorType(@javax.annotation.Nonnull EditorType editorType) {
    this.editorType = editorType;
  }

  public ConfigurationDtoInteger editorUrl(@javax.annotation.Nullable URI editorUrl) {
    
    this.editorUrl = editorUrl;
    return this;
  }

  /**
   * The editor URL.
   * @return editorUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITOR_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getEditorUrl() {
    return editorUrl;
  }


  @JsonProperty(JSON_PROPERTY_EDITOR_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEditorUrl(@javax.annotation.Nullable URI editorUrl) {
    this.editorUrl = editorUrl;
  }

  public ConfigurationDtoInteger token(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
    
    return this;
  }

  /**
   * The token of the file configuration.
   * @return token
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getToken() {
        return token.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getToken_JsonNullable() {
    return token;
  }
  
  @JsonProperty(JSON_PROPERTY_TOKEN)
  public void setToken_JsonNullable(JsonNullable<String> token) {
    this.token = token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
  }

  public ConfigurationDtoInteger type(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

  /**
   * The platform type.
   * @return type
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
  }

  public ConfigurationDtoInteger _file(@javax.annotation.Nonnull FileDtoInteger _file) {
    
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileDtoInteger getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(@javax.annotation.Nonnull FileDtoInteger _file) {
    this._file = _file;
  }

  public ConfigurationDtoInteger errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    
    return this;
  }

  /**
   * The error message.
   * @return errorMessage
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }

  public ConfigurationDtoInteger startFilling(@javax.annotation.Nullable Boolean startFilling) {
    this.startFilling = JsonNullable.<Boolean>of(startFilling);
    
    return this;
  }

  /**
   * Specifies if the file filling has started or not.
   * @return startFilling
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getStartFilling() {
        return startFilling.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_FILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getStartFilling_JsonNullable() {
    return startFilling;
  }
  
  @JsonProperty(JSON_PROPERTY_START_FILLING)
  public void setStartFilling_JsonNullable(JsonNullable<Boolean> startFilling) {
    this.startFilling = startFilling;
  }

  public void setStartFilling(@javax.annotation.Nullable Boolean startFilling) {
    this.startFilling = JsonNullable.<Boolean>of(startFilling);
  }

  public ConfigurationDtoInteger fillingStatus(@javax.annotation.Nullable Boolean fillingStatus) {
    this.fillingStatus = JsonNullable.<Boolean>of(fillingStatus);
    
    return this;
  }

  /**
   * The file filling status.
   * @return fillingStatus
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getFillingStatus() {
        return fillingStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILLING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getFillingStatus_JsonNullable() {
    return fillingStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_FILLING_STATUS)
  public void setFillingStatus_JsonNullable(JsonNullable<Boolean> fillingStatus) {
    this.fillingStatus = fillingStatus;
  }

  public void setFillingStatus(@javax.annotation.Nullable Boolean fillingStatus) {
    this.fillingStatus = JsonNullable.<Boolean>of(fillingStatus);
  }

  public ConfigurationDtoInteger startFillingMode(@javax.annotation.Nullable StartFillingMode startFillingMode) {
    
    this.startFillingMode = startFillingMode;
    return this;
  }

  /**
   * Get startFillingMode
   * @return startFillingMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_FILLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StartFillingMode getStartFillingMode() {
    return startFillingMode;
  }


  @JsonProperty(JSON_PROPERTY_START_FILLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartFillingMode(@javax.annotation.Nullable StartFillingMode startFillingMode) {
    this.startFillingMode = startFillingMode;
  }

  public ConfigurationDtoInteger fillingSessionId(@javax.annotation.Nullable String fillingSessionId) {
    this.fillingSessionId = JsonNullable.<String>of(fillingSessionId);
    
    return this;
  }

  /**
   * The file filling session ID.
   * @return fillingSessionId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFillingSessionId() {
        return fillingSessionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILLING_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFillingSessionId_JsonNullable() {
    return fillingSessionId;
  }
  
  @JsonProperty(JSON_PROPERTY_FILLING_SESSION_ID)
  public void setFillingSessionId_JsonNullable(JsonNullable<String> fillingSessionId) {
    this.fillingSessionId = fillingSessionId;
  }

  public void setFillingSessionId(@javax.annotation.Nullable String fillingSessionId) {
    this.fillingSessionId = JsonNullable.<String>of(fillingSessionId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationDtoInteger configurationDtoInteger = (ConfigurationDtoInteger) o;
    return Objects.equals(this.document, configurationDtoInteger.document) &&
        Objects.equals(this.documentType, configurationDtoInteger.documentType) &&
        Objects.equals(this.editorConfig, configurationDtoInteger.editorConfig) &&
        Objects.equals(this.editorType, configurationDtoInteger.editorType) &&
        Objects.equals(this.editorUrl, configurationDtoInteger.editorUrl) &&
        equalsNullable(this.token, configurationDtoInteger.token) &&
        equalsNullable(this.type, configurationDtoInteger.type) &&
        Objects.equals(this._file, configurationDtoInteger._file) &&
        equalsNullable(this.errorMessage, configurationDtoInteger.errorMessage) &&
        equalsNullable(this.startFilling, configurationDtoInteger.startFilling) &&
        equalsNullable(this.fillingStatus, configurationDtoInteger.fillingStatus) &&
        Objects.equals(this.startFillingMode, configurationDtoInteger.startFillingMode) &&
        equalsNullable(this.fillingSessionId, configurationDtoInteger.fillingSessionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, documentType, editorConfig, editorType, editorUrl, hashCodeNullable(token), hashCodeNullable(type), _file, hashCodeNullable(errorMessage), hashCodeNullable(startFilling), hashCodeNullable(fillingStatus), startFillingMode, hashCodeNullable(fillingSessionId));
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
    sb.append("class ConfigurationDtoInteger {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    editorConfig: ").append(toIndentedString(editorConfig)).append("\n");
    sb.append("    editorType: ").append(toIndentedString(editorType)).append("\n");
    sb.append("    editorUrl: ").append(toIndentedString(editorUrl)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    startFilling: ").append(toIndentedString(startFilling)).append("\n");
    sb.append("    fillingStatus: ").append(toIndentedString(fillingStatus)).append("\n");
    sb.append("    startFillingMode: ").append(toIndentedString(startFillingMode)).append("\n");
    sb.append("    fillingSessionId: ").append(toIndentedString(fillingSessionId)).append("\n");
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

    // add `document` to the URL query string
    if (getDocument() != null) {
      joiner.add(getDocument().toUrlQueryString(prefix + "document" + suffix));
    }

    // add `documentType` to the URL query string
    if (getDocumentType() != null) {
      try {
        joiner.add(String.format("%sdocumentType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocumentType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `editorConfig` to the URL query string
    if (getEditorConfig() != null) {
      joiner.add(getEditorConfig().toUrlQueryString(prefix + "editorConfig" + suffix));
    }

    // add `editorType` to the URL query string
    if (getEditorType() != null) {
      try {
        joiner.add(String.format("%seditorType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditorType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `editorUrl` to the URL query string
    if (getEditorUrl() != null) {
      try {
        joiner.add(String.format("%seditorUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditorUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `token` to the URL query string
    if (getToken() != null) {
      try {
        joiner.add(String.format("%stoken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `file` to the URL query string
    if (getFile() != null) {
      joiner.add(getFile().toUrlQueryString(prefix + "file" + suffix));
    }

    // add `errorMessage` to the URL query string
    if (getErrorMessage() != null) {
      try {
        joiner.add(String.format("%serrorMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startFilling` to the URL query string
    if (getStartFilling() != null) {
      try {
        joiner.add(String.format("%sstartFilling%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartFilling()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fillingStatus` to the URL query string
    if (getFillingStatus() != null) {
      try {
        joiner.add(String.format("%sfillingStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFillingStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startFillingMode` to the URL query string
    if (getStartFillingMode() != null) {
      try {
        joiner.add(String.format("%sstartFillingMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartFillingMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fillingSessionId` to the URL query string
    if (getFillingSessionId() != null) {
      try {
        joiner.add(String.format("%sfillingSessionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFillingSessionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

