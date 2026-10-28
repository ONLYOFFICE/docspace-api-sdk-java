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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.client.model.DocumentConfigDto;
import org.openapitools.client.model.EditorConfigurationDto;
import org.openapitools.client.model.EditorToolCallStateDto;
import org.openapitools.client.model.EditorType;
import org.openapitools.client.model.FileDto;
import org.openapitools.client.model.QuotaScope;
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
 * Everything an editor client needs in order to open one document: the document itself, the editor setup for this  caller, and the signature that lets the editors trust both.
 */
@JsonPropertyOrder({
  ConfigurationDto.JSON_PROPERTY_DOCUMENT,
  ConfigurationDto.JSON_PROPERTY_DOCUMENT_TYPE,
  ConfigurationDto.JSON_PROPERTY_EDITOR_CONFIG,
  ConfigurationDto.JSON_PROPERTY_EDITOR_TYPE,
  ConfigurationDto.JSON_PROPERTY_EDITOR_URL,
  ConfigurationDto.JSON_PROPERTY_TOKEN,
  ConfigurationDto.JSON_PROPERTY_TYPE,
  ConfigurationDto.JSON_PROPERTY_FILE,
  ConfigurationDto.JSON_PROPERTY_ERROR_MESSAGE,
  ConfigurationDto.JSON_PROPERTY_START_FILLING,
  ConfigurationDto.JSON_PROPERTY_FILLING_STATUS,
  ConfigurationDto.JSON_PROPERTY_START_FILLING_MODE,
  ConfigurationDto.JSON_PROPERTY_FILLING_SESSION_ID,
  ConfigurationDto.JSON_PROPERTY_QUOTA_EXCEEDED_SCOPE,
  ConfigurationDto.JSON_PROPERTY_GENERATION_TOOL_CALL_STATE
})

public class ConfigurationDto {
  public static final String JSON_PROPERTY_DOCUMENT = "document";
  @javax.annotation.Nonnull  private DocumentConfigDto document;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "documentType";
  @javax.annotation.Nullable  private String documentType;

  public static final String JSON_PROPERTY_EDITOR_CONFIG = "editorConfig";
  @javax.annotation.Nonnull  private EditorConfigurationDto editorConfig;

  public static final String JSON_PROPERTY_EDITOR_TYPE = "editorType";
  @javax.annotation.Nonnull  private EditorType editorType;

  public static final String JSON_PROPERTY_EDITOR_URL = "editorUrl";
  @javax.annotation.Nullable  private URI editorUrl;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable  private JsonNullable<String> token = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FILE = "file";
  @javax.annotation.Nonnull  private FileDto _file;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  @javax.annotation.Nullable  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_START_FILLING = "startFilling";
  @javax.annotation.Nullable  private JsonNullable<Boolean> startFilling = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FILLING_STATUS = "fillingStatus";
  @javax.annotation.Nullable  private JsonNullable<Boolean> fillingStatus = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_START_FILLING_MODE = "startFillingMode";
  @javax.annotation.Nullable  private StartFillingMode startFillingMode;

  public static final String JSON_PROPERTY_FILLING_SESSION_ID = "fillingSessionId";
  @javax.annotation.Nullable  private JsonNullable<String> fillingSessionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUOTA_EXCEEDED_SCOPE = "quotaExceededScope";
  @javax.annotation.Nullable  private QuotaScope quotaExceededScope;

  public static final String JSON_PROPERTY_GENERATION_TOOL_CALL_STATE = "generationToolCallState";
  @javax.annotation.Nullable  private EditorToolCallStateDto generationToolCallState;

  public ConfigurationDto() {
  }


  public ConfigurationDto document(@javax.annotation.Nonnull DocumentConfigDto document) {
    
    this.document = document;
    return this;
  }

  /**
   * The document as the editors address it: its revision key, title, type, download address and the permissions of  this caller on it.
   * @return document
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DOCUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DocumentConfigDto getDocument() {
    return document;
  }


  @JsonProperty(value = JSON_PROPERTY_DOCUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocument(@javax.annotation.Nonnull DocumentConfigDto document) {
    this.document = document;
  }

  public ConfigurationDto documentType(@javax.annotation.Nullable String documentType) {
    
    this.documentType = documentType;
    return this;
  }

  /**
   * The editor family the file opens in - `word`, `cell`, `slide`, `pdf` or `diagram`. It comes back empty for a  format no editor handles.
   * @return documentType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOCUMENT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocumentType() {
    return documentType;
  }


  @JsonProperty(value = JSON_PROPERTY_DOCUMENT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentType(@javax.annotation.Nullable String documentType) {
    this.documentType = documentType;
  }

  public ConfigurationDto editorConfig(@javax.annotation.Nonnull EditorConfigurationDto editorConfig) {
    
    this.editorConfig = editorConfig;
    return this;
  }

  /**
   * How the editor is set up for this opening: the mode, the language, the interface customization, the callback  the editors save through, and the account they attribute changes to.
   * @return editorConfig
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_EDITOR_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EditorConfigurationDto getEditorConfig() {
    return editorConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_EDITOR_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEditorConfig(@javax.annotation.Nonnull EditorConfigurationDto editorConfig) {
    this.editorConfig = editorConfig;
  }

  public ConfigurationDto editorType(@javax.annotation.Nonnull EditorType editorType) {
    
    this.editorType = editorType;
    return this;
  }

  /**
   * The layout the configuration was actually built for. It echoes the requested one except where the room  overruled it, as the templates folder does by forcing the embedded viewer.
   * @return editorType
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_EDITOR_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EditorType getEditorType() {
    return editorType;
  }


  @JsonProperty(value = JSON_PROPERTY_EDITOR_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEditorType(@javax.annotation.Nonnull EditorType editorType) {
    this.editorType = editorType;
  }

  public ConfigurationDto editorUrl(@javax.annotation.Nullable URI editorUrl) {
    
    this.editorUrl = editorUrl;
    return this;
  }

  /**
   * The address of the editor api script the client has to load, with the shard key of this document already  appended. Load it as it is given rather than assembling it by hand.
   * @return editorUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EDITOR_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getEditorUrl() {
    return editorUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_EDITOR_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEditorUrl(@javax.annotation.Nullable URI editorUrl) {
    this.editorUrl = editorUrl;
  }

  public ConfigurationDto token(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
    
    return this;
  }

  /**
   * Signs this whole configuration so that the editors can trust it; anything a client changes in the  configuration invalidates it. It stays empty on a portal that has no signature secret configured for the  document service.
   * @return token
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getToken() {
        return token.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TOKEN, required = false)
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

  public ConfigurationDto type(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

  /**
   * The layout spelled as a lowercase word - `desktop`, `mobile` or `embedded` - the same value the editor type  carries as a number.
   * @return type
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
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

  public ConfigurationDto _file(@javax.annotation.Nonnull FileDto _file) {
    
    this._file = _file;
    return this;
  }

  /**
   * The file the configuration was built for, in the same shape the file listings report it.
   * @return _file
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FILE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileDto getFile() {
    return _file;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(@javax.annotation.Nonnull FileDto _file) {
    this._file = _file;
  }

  public ConfigurationDto errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    
    return this;
  }

  /**
   * Filled in when the document could not be prepared for opening; the rest of the configuration should then not  be handed to the editors.
   * @return errorMessage
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ERROR_MESSAGE, required = false)
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

  public ConfigurationDto startFilling(@javax.annotation.Nullable Boolean startFilling) {
    this.startFilling = JsonNullable.<Boolean>of(startFilling);
    
    return this;
  }

  /**
   * Whether this caller may start a filling session on the form from inside the editor. It stays empty when the  file is not a form opened where starting is possible at all.
   * @return startFilling
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getStartFilling() {
        return startFilling.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_START_FILLING, required = false)
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

  public ConfigurationDto fillingStatus(@javax.annotation.Nullable Boolean fillingStatus) {
    this.fillingStatus = JsonNullable.<Boolean>of(fillingStatus);
    
    return this;
  }

  /**
   * True once the caller holds a role in the running filling session of this form. It stays empty outside a  virtual data room, where roles are the only place it is set.
   * @return fillingStatus
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getFillingStatus() {
        return fillingStatus.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILLING_STATUS, required = false)
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

  public ConfigurationDto startFillingMode(@javax.annotation.Nullable StartFillingMode startFillingMode) {
    
    this.startFillingMode = startFillingMode;
    return this;
  }

  /**
   * Which filling button the editor offers: none at all, sharing the form out for others to fill, starting a  filling session, or starting one inside the form-filling room.
   * @return startFillingMode
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_START_FILLING_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StartFillingMode getStartFillingMode() {
    return startFillingMode;
  }


  @JsonProperty(value = JSON_PROPERTY_START_FILLING_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartFillingMode(@javax.annotation.Nullable StartFillingMode startFillingMode) {
    this.startFillingMode = startFillingMode;
  }

  public ConfigurationDto fillingSessionId(@javax.annotation.Nullable String fillingSessionId) {
    this.fillingSessionId = JsonNullable.<String>of(fillingSessionId);
    
    return this;
  }

  /**
   * Identifies the filling session this opening belongs to, and is empty when the document is not opened as part  of one. Submissions made in the editor are collected under it.
   * @return fillingSessionId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFillingSessionId() {
        return fillingSessionId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILLING_SESSION_ID, required = false)
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

  public ConfigurationDto quotaExceededScope(@javax.annotation.Nullable QuotaScope quotaExceededScope) {
    
    this.quotaExceededScope = quotaExceededScope;
    return this;
  }

  /**
   * Names the quota that ran out - the user, the room or the portal - and is set only when the document had to be  opened read-only because of it.
   * @return quotaExceededScope
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_QUOTA_EXCEEDED_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QuotaScope getQuotaExceededScope() {
    return quotaExceededScope;
  }


  @JsonProperty(value = JSON_PROPERTY_QUOTA_EXCEEDED_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotaExceededScope(@javax.annotation.Nullable QuotaScope quotaExceededScope) {
    this.quotaExceededScope = quotaExceededScope;
  }

  public ConfigurationDto generationToolCallState(@javax.annotation.Nullable EditorToolCallStateDto generationToolCallState) {
    
    this.generationToolCallState = generationToolCallState;
    return this;
  }

  /**
   * The generation the editor should run as soon as the document opens. It is set only for a document an AI agent  produced and left waiting for its content, and is empty for every other file.
   * @return generationToolCallState
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_GENERATION_TOOL_CALL_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EditorToolCallStateDto getGenerationToolCallState() {
    return generationToolCallState;
  }


  @JsonProperty(value = JSON_PROPERTY_GENERATION_TOOL_CALL_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenerationToolCallState(@javax.annotation.Nullable EditorToolCallStateDto generationToolCallState) {
    this.generationToolCallState = generationToolCallState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationDto configurationDto = (ConfigurationDto) o;
    return Objects.equals(this.document, configurationDto.document) &&
        Objects.equals(this.documentType, configurationDto.documentType) &&
        Objects.equals(this.editorConfig, configurationDto.editorConfig) &&
        Objects.equals(this.editorType, configurationDto.editorType) &&
        Objects.equals(this.editorUrl, configurationDto.editorUrl) &&
        equalsNullable(this.token, configurationDto.token) &&
        equalsNullable(this.type, configurationDto.type) &&
        Objects.equals(this._file, configurationDto._file) &&
        equalsNullable(this.errorMessage, configurationDto.errorMessage) &&
        equalsNullable(this.startFilling, configurationDto.startFilling) &&
        equalsNullable(this.fillingStatus, configurationDto.fillingStatus) &&
        Objects.equals(this.startFillingMode, configurationDto.startFillingMode) &&
        equalsNullable(this.fillingSessionId, configurationDto.fillingSessionId) &&
        Objects.equals(this.quotaExceededScope, configurationDto.quotaExceededScope) &&
        Objects.equals(this.generationToolCallState, configurationDto.generationToolCallState);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, documentType, editorConfig, editorType, editorUrl, hashCodeNullable(token), hashCodeNullable(type), _file, hashCodeNullable(errorMessage), hashCodeNullable(startFilling), hashCodeNullable(fillingStatus), startFillingMode, hashCodeNullable(fillingSessionId), quotaExceededScope, generationToolCallState);
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
    sb.append("class ConfigurationDto {\n");
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
    sb.append("    quotaExceededScope: ").append(toIndentedString(quotaExceededScope)).append("\n");
    sb.append("    generationToolCallState: ").append(toIndentedString(generationToolCallState)).append("\n");
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

    // add `quotaExceededScope` to the URL query string
    if (getQuotaExceededScope() != null) {
      try {
        joiner.add(String.format("%squotaExceededScope%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuotaExceededScope()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `generationToolCallState` to the URL query string
    if (getGenerationToolCallState() != null) {
      joiner.add(getGenerationToolCallState().toUrlQueryString(prefix + "generationToolCallState" + suffix));
    }

    return joiner.toString();
  }

}

