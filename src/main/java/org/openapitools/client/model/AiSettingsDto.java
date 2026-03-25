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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
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
 * The AI module settings.
 */
@JsonPropertyOrder({
  AiSettingsDto.JSON_PROPERTY_WEB_SEARCH_ENABLED,
  AiSettingsDto.JSON_PROPERTY_WEB_SEARCH_NEED_RESET,
  AiSettingsDto.JSON_PROPERTY_VECTORIZATION_ENABLED,
  AiSettingsDto.JSON_PROPERTY_VECTORIZATION_NEED_RESET,
  AiSettingsDto.JSON_PROPERTY_AI_READY,
  AiSettingsDto.JSON_PROPERTY_AI_READY_NEED_RESET,
  AiSettingsDto.JSON_PROPERTY_PORTAL_MCP_SERVER_ID,
  AiSettingsDto.JSON_PROPERTY_EMBEDDING_MODEL,
  AiSettingsDto.JSON_PROPERTY_MODEL_ALIASES,
  AiSettingsDto.JSON_PROPERTY_KNOWLEDGE_SEARCH_TOOL_NAME,
  AiSettingsDto.JSON_PROPERTY_WEB_SEARCH_TOOL_NAME,
  AiSettingsDto.JSON_PROPERTY_WEB_CRAWLING_TOOL_NAME,
  AiSettingsDto.JSON_PROPERTY_GENERATE_DOCX_TOOL_NAME,
  AiSettingsDto.JSON_PROPERTY_GENERATE_FORM_TOOL_NAME,
  AiSettingsDto.JSON_PROPERTY_GENERATE_PRESENTATION_TOOL_NAME,
  AiSettingsDto.JSON_PROPERTY_SYSTEM_AI_ENABLED
})

public class AiSettingsDto {
  public static final String JSON_PROPERTY_WEB_SEARCH_ENABLED = "webSearchEnabled";
  @javax.annotation.Nullable  private Boolean webSearchEnabled;

  public static final String JSON_PROPERTY_WEB_SEARCH_NEED_RESET = "webSearchNeedReset";
  @javax.annotation.Nullable  private Boolean webSearchNeedReset;

  public static final String JSON_PROPERTY_VECTORIZATION_ENABLED = "vectorizationEnabled";
  @javax.annotation.Nullable  private Boolean vectorizationEnabled;

  public static final String JSON_PROPERTY_VECTORIZATION_NEED_RESET = "vectorizationNeedReset";
  @javax.annotation.Nullable  private Boolean vectorizationNeedReset;

  public static final String JSON_PROPERTY_AI_READY = "aiReady";
  @javax.annotation.Nullable  private Boolean aiReady;

  public static final String JSON_PROPERTY_AI_READY_NEED_RESET = "aiReadyNeedReset";
  @javax.annotation.Nullable  private Boolean aiReadyNeedReset;

  public static final String JSON_PROPERTY_PORTAL_MCP_SERVER_ID = "portalMcpServerId";
  @javax.annotation.Nullable  private JsonNullable<UUID> portalMcpServerId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_EMBEDDING_MODEL = "embeddingModel";
  @javax.annotation.Nullable  private String embeddingModel;

  public static final String JSON_PROPERTY_MODEL_ALIASES = "modelAliases";
  @javax.annotation.Nullable  private Map<String, String> modelAliases;

  public static final String JSON_PROPERTY_KNOWLEDGE_SEARCH_TOOL_NAME = "knowledgeSearchToolName";
  @javax.annotation.Nullable  private String knowledgeSearchToolName;

  public static final String JSON_PROPERTY_WEB_SEARCH_TOOL_NAME = "webSearchToolName";
  @javax.annotation.Nullable  private String webSearchToolName;

  public static final String JSON_PROPERTY_WEB_CRAWLING_TOOL_NAME = "webCrawlingToolName";
  @javax.annotation.Nullable  private String webCrawlingToolName;

  public static final String JSON_PROPERTY_GENERATE_DOCX_TOOL_NAME = "generateDocxToolName";
  @javax.annotation.Nullable  private String generateDocxToolName;

  public static final String JSON_PROPERTY_GENERATE_FORM_TOOL_NAME = "generateFormToolName";
  @javax.annotation.Nullable  private String generateFormToolName;

  public static final String JSON_PROPERTY_GENERATE_PRESENTATION_TOOL_NAME = "generatePresentationToolName";
  @javax.annotation.Nullable  private String generatePresentationToolName;

  public static final String JSON_PROPERTY_SYSTEM_AI_ENABLED = "systemAiEnabled";
  @javax.annotation.Nullable  private Boolean systemAiEnabled;

  public AiSettingsDto() {
  }


  public AiSettingsDto webSearchEnabled(@javax.annotation.Nullable Boolean webSearchEnabled) {
    
    this.webSearchEnabled = webSearchEnabled;
    return this;
  }

  /**
   * Indicates whether web search is enabled for AI chat sessions.
   * @return webSearchEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebSearchEnabled() {
    return webSearchEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebSearchEnabled(@javax.annotation.Nullable Boolean webSearchEnabled) {
    this.webSearchEnabled = webSearchEnabled;
  }

  public AiSettingsDto webSearchNeedReset(@javax.annotation.Nullable Boolean webSearchNeedReset) {
    
    this.webSearchNeedReset = webSearchNeedReset;
    return this;
  }

  /**
   * Indicates whether the web search API key needs to be reconfigured.
   * @return webSearchNeedReset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebSearchNeedReset() {
    return webSearchNeedReset;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebSearchNeedReset(@javax.annotation.Nullable Boolean webSearchNeedReset) {
    this.webSearchNeedReset = webSearchNeedReset;
  }

  public AiSettingsDto vectorizationEnabled(@javax.annotation.Nullable Boolean vectorizationEnabled) {
    
    this.vectorizationEnabled = vectorizationEnabled;
    return this;
  }

  /**
   * Indicates whether document vectorization is enabled.
   * @return vectorizationEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVectorizationEnabled() {
    return vectorizationEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVectorizationEnabled(@javax.annotation.Nullable Boolean vectorizationEnabled) {
    this.vectorizationEnabled = vectorizationEnabled;
  }

  public AiSettingsDto vectorizationNeedReset(@javax.annotation.Nullable Boolean vectorizationNeedReset) {
    
    this.vectorizationNeedReset = vectorizationNeedReset;
    return this;
  }

  /**
   * Indicates whether the embedding provider API key needs to be reconfigured.
   * @return vectorizationNeedReset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVectorizationNeedReset() {
    return vectorizationNeedReset;
  }


  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVectorizationNeedReset(@javax.annotation.Nullable Boolean vectorizationNeedReset) {
    this.vectorizationNeedReset = vectorizationNeedReset;
  }

  public AiSettingsDto aiReady(@javax.annotation.Nullable Boolean aiReady) {
    
    this.aiReady = aiReady;
    return this;
  }

  /**
   * Indicates whether the AI subsystem is fully configured and operational.
   * @return aiReady
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AI_READY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAiReady() {
    return aiReady;
  }


  @JsonProperty(value = JSON_PROPERTY_AI_READY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiReady(@javax.annotation.Nullable Boolean aiReady) {
    this.aiReady = aiReady;
  }

  public AiSettingsDto aiReadyNeedReset(@javax.annotation.Nullable Boolean aiReadyNeedReset) {
    
    this.aiReadyNeedReset = aiReadyNeedReset;
    return this;
  }

  /**
   * Indicates whether the AI provider API key needs to be reconfigured.
   * @return aiReadyNeedReset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AI_READY_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAiReadyNeedReset() {
    return aiReadyNeedReset;
  }


  @JsonProperty(value = JSON_PROPERTY_AI_READY_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiReadyNeedReset(@javax.annotation.Nullable Boolean aiReadyNeedReset) {
    this.aiReadyNeedReset = aiReadyNeedReset;
  }

  public AiSettingsDto portalMcpServerId(@javax.annotation.Nullable UUID portalMcpServerId) {
    this.portalMcpServerId = JsonNullable.<UUID>of(portalMcpServerId);
    
    return this;
  }

  /**
   * The unique identifier of the portal-level MCP server, if configured.
   * @return portalMcpServerId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public UUID getPortalMcpServerId() {
        return portalMcpServerId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PORTAL_MCP_SERVER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getPortalMcpServerId_JsonNullable() {
    return portalMcpServerId;
  }
  
  @JsonProperty(JSON_PROPERTY_PORTAL_MCP_SERVER_ID)
  public void setPortalMcpServerId_JsonNullable(JsonNullable<UUID> portalMcpServerId) {
    this.portalMcpServerId = portalMcpServerId;
  }

  public void setPortalMcpServerId(@javax.annotation.Nullable UUID portalMcpServerId) {
    this.portalMcpServerId = JsonNullable.<UUID>of(portalMcpServerId);
  }

  public AiSettingsDto embeddingModel(@javax.annotation.Nullable String embeddingModel) {
    
    this.embeddingModel = embeddingModel;
    return this;
  }

  /**
   * The name of the embedding model used for document vectorization.
   * @return embeddingModel
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EMBEDDING_MODEL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmbeddingModel() {
    return embeddingModel;
  }


  @JsonProperty(value = JSON_PROPERTY_EMBEDDING_MODEL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmbeddingModel(@javax.annotation.Nullable String embeddingModel) {
    this.embeddingModel = embeddingModel;
  }

  public AiSettingsDto modelAliases(@javax.annotation.Nullable Map<String, String> modelAliases) {
    
    this.modelAliases = modelAliases;
    return this;
  }

  public AiSettingsDto putModelAliasesItem(String key, String modelAliasesItem) {
    this.modelAliases.put(key, modelAliasesItem);
    return this;
  }

  /**
   * Mapping of model identifiers to human-readable aliases.
   * @return modelAliases
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MODEL_ALIASES, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getModelAliases() {
    return modelAliases;
  }


  @JsonProperty(value = JSON_PROPERTY_MODEL_ALIASES, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelAliases(@javax.annotation.Nullable Map<String, String> modelAliases) {
    this.modelAliases = modelAliases;
  }

  public AiSettingsDto knowledgeSearchToolName(@javax.annotation.Nullable String knowledgeSearchToolName) {
    
    this.knowledgeSearchToolName = knowledgeSearchToolName;
    return this;
  }

  /**
   * The tool name used by the AI assistant for knowledge base search.
   * @return knowledgeSearchToolName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_KNOWLEDGE_SEARCH_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKnowledgeSearchToolName() {
    return knowledgeSearchToolName;
  }


  @JsonProperty(value = JSON_PROPERTY_KNOWLEDGE_SEARCH_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKnowledgeSearchToolName(@javax.annotation.Nullable String knowledgeSearchToolName) {
    this.knowledgeSearchToolName = knowledgeSearchToolName;
  }

  public AiSettingsDto webSearchToolName(@javax.annotation.Nullable String webSearchToolName) {
    
    this.webSearchToolName = webSearchToolName;
    return this;
  }

  /**
   * The tool name used by the AI assistant for web search.
   * @return webSearchToolName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWebSearchToolName() {
    return webSearchToolName;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebSearchToolName(@javax.annotation.Nullable String webSearchToolName) {
    this.webSearchToolName = webSearchToolName;
  }

  public AiSettingsDto webCrawlingToolName(@javax.annotation.Nullable String webCrawlingToolName) {
    
    this.webCrawlingToolName = webCrawlingToolName;
    return this;
  }

  /**
   * The tool name used by the AI assistant for web page crawling.
   * @return webCrawlingToolName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_CRAWLING_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWebCrawlingToolName() {
    return webCrawlingToolName;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_CRAWLING_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebCrawlingToolName(@javax.annotation.Nullable String webCrawlingToolName) {
    this.webCrawlingToolName = webCrawlingToolName;
  }

  public AiSettingsDto generateDocxToolName(@javax.annotation.Nullable String generateDocxToolName) {
    
    this.generateDocxToolName = generateDocxToolName;
    return this;
  }

  /**
   * The tool name used by the AI to launch docx creation in the editor.
   * @return generateDocxToolName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_GENERATE_DOCX_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGenerateDocxToolName() {
    return generateDocxToolName;
  }


  @JsonProperty(value = JSON_PROPERTY_GENERATE_DOCX_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGenerateDocxToolName(@javax.annotation.Nullable String generateDocxToolName) {
    this.generateDocxToolName = generateDocxToolName;
  }

  public AiSettingsDto generateFormToolName(@javax.annotation.Nullable String generateFormToolName) {
    
    this.generateFormToolName = generateFormToolName;
    return this;
  }

  /**
   * The tool name used by the AI assistant to launch form creation in the editor.
   * @return generateFormToolName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_GENERATE_FORM_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGenerateFormToolName() {
    return generateFormToolName;
  }


  @JsonProperty(value = JSON_PROPERTY_GENERATE_FORM_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGenerateFormToolName(@javax.annotation.Nullable String generateFormToolName) {
    this.generateFormToolName = generateFormToolName;
  }

  public AiSettingsDto generatePresentationToolName(@javax.annotation.Nullable String generatePresentationToolName) {
    
    this.generatePresentationToolName = generatePresentationToolName;
    return this;
  }

  /**
   * The tool name used by the AI assistant to launch presentation creation in the editor.
   * @return generatePresentationToolName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_GENERATE_PRESENTATION_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGeneratePresentationToolName() {
    return generatePresentationToolName;
  }


  @JsonProperty(value = JSON_PROPERTY_GENERATE_PRESENTATION_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGeneratePresentationToolName(@javax.annotation.Nullable String generatePresentationToolName) {
    this.generatePresentationToolName = generatePresentationToolName;
  }

  public AiSettingsDto systemAiEnabled(@javax.annotation.Nullable Boolean systemAiEnabled) {
    
    this.systemAiEnabled = systemAiEnabled;
    return this;
  }

  /**
   * Indicates whether the system-level AI provider is enabled.
   * @return systemAiEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SYSTEM_AI_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSystemAiEnabled() {
    return systemAiEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_SYSTEM_AI_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemAiEnabled(@javax.annotation.Nullable Boolean systemAiEnabled) {
    this.systemAiEnabled = systemAiEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSettingsDto aiSettingsDto = (AiSettingsDto) o;
    return Objects.equals(this.webSearchEnabled, aiSettingsDto.webSearchEnabled) &&
        Objects.equals(this.webSearchNeedReset, aiSettingsDto.webSearchNeedReset) &&
        Objects.equals(this.vectorizationEnabled, aiSettingsDto.vectorizationEnabled) &&
        Objects.equals(this.vectorizationNeedReset, aiSettingsDto.vectorizationNeedReset) &&
        Objects.equals(this.aiReady, aiSettingsDto.aiReady) &&
        Objects.equals(this.aiReadyNeedReset, aiSettingsDto.aiReadyNeedReset) &&
        equalsNullable(this.portalMcpServerId, aiSettingsDto.portalMcpServerId) &&
        Objects.equals(this.embeddingModel, aiSettingsDto.embeddingModel) &&
        Objects.equals(this.modelAliases, aiSettingsDto.modelAliases) &&
        Objects.equals(this.knowledgeSearchToolName, aiSettingsDto.knowledgeSearchToolName) &&
        Objects.equals(this.webSearchToolName, aiSettingsDto.webSearchToolName) &&
        Objects.equals(this.webCrawlingToolName, aiSettingsDto.webCrawlingToolName) &&
        Objects.equals(this.generateDocxToolName, aiSettingsDto.generateDocxToolName) &&
        Objects.equals(this.generateFormToolName, aiSettingsDto.generateFormToolName) &&
        Objects.equals(this.generatePresentationToolName, aiSettingsDto.generatePresentationToolName) &&
        Objects.equals(this.systemAiEnabled, aiSettingsDto.systemAiEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(webSearchEnabled, webSearchNeedReset, vectorizationEnabled, vectorizationNeedReset, aiReady, aiReadyNeedReset, hashCodeNullable(portalMcpServerId), embeddingModel, modelAliases, knowledgeSearchToolName, webSearchToolName, webCrawlingToolName, generateDocxToolName, generateFormToolName, generatePresentationToolName, systemAiEnabled);
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
    sb.append("class AiSettingsDto {\n");
    sb.append("    webSearchEnabled: ").append(toIndentedString(webSearchEnabled)).append("\n");
    sb.append("    webSearchNeedReset: ").append(toIndentedString(webSearchNeedReset)).append("\n");
    sb.append("    vectorizationEnabled: ").append(toIndentedString(vectorizationEnabled)).append("\n");
    sb.append("    vectorizationNeedReset: ").append(toIndentedString(vectorizationNeedReset)).append("\n");
    sb.append("    aiReady: ").append(toIndentedString(aiReady)).append("\n");
    sb.append("    aiReadyNeedReset: ").append(toIndentedString(aiReadyNeedReset)).append("\n");
    sb.append("    portalMcpServerId: ").append(toIndentedString(portalMcpServerId)).append("\n");
    sb.append("    embeddingModel: ").append(toIndentedString(embeddingModel)).append("\n");
    sb.append("    modelAliases: ").append(toIndentedString(modelAliases)).append("\n");
    sb.append("    knowledgeSearchToolName: ").append(toIndentedString(knowledgeSearchToolName)).append("\n");
    sb.append("    webSearchToolName: ").append(toIndentedString(webSearchToolName)).append("\n");
    sb.append("    webCrawlingToolName: ").append(toIndentedString(webCrawlingToolName)).append("\n");
    sb.append("    generateDocxToolName: ").append(toIndentedString(generateDocxToolName)).append("\n");
    sb.append("    generateFormToolName: ").append(toIndentedString(generateFormToolName)).append("\n");
    sb.append("    generatePresentationToolName: ").append(toIndentedString(generatePresentationToolName)).append("\n");
    sb.append("    systemAiEnabled: ").append(toIndentedString(systemAiEnabled)).append("\n");
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

    // add `webSearchEnabled` to the URL query string
    if (getWebSearchEnabled() != null) {
      try {
        joiner.add(String.format("%swebSearchEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebSearchEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `webSearchNeedReset` to the URL query string
    if (getWebSearchNeedReset() != null) {
      try {
        joiner.add(String.format("%swebSearchNeedReset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebSearchNeedReset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `vectorizationEnabled` to the URL query string
    if (getVectorizationEnabled() != null) {
      try {
        joiner.add(String.format("%svectorizationEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVectorizationEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `vectorizationNeedReset` to the URL query string
    if (getVectorizationNeedReset() != null) {
      try {
        joiner.add(String.format("%svectorizationNeedReset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVectorizationNeedReset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `aiReady` to the URL query string
    if (getAiReady() != null) {
      try {
        joiner.add(String.format("%saiReady%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAiReady()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `aiReadyNeedReset` to the URL query string
    if (getAiReadyNeedReset() != null) {
      try {
        joiner.add(String.format("%saiReadyNeedReset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAiReadyNeedReset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `portalMcpServerId` to the URL query string
    if (getPortalMcpServerId() != null) {
      try {
        joiner.add(String.format("%sportalMcpServerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPortalMcpServerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `embeddingModel` to the URL query string
    if (getEmbeddingModel() != null) {
      try {
        joiner.add(String.format("%sembeddingModel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmbeddingModel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modelAliases` to the URL query string
    if (getModelAliases() != null) {
      for (String _key : getModelAliases().keySet()) {
        try {
          joiner.add(String.format("%smodelAliases%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getModelAliases().get(_key), URLEncoder.encode(String.valueOf(getModelAliases().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `knowledgeSearchToolName` to the URL query string
    if (getKnowledgeSearchToolName() != null) {
      try {
        joiner.add(String.format("%sknowledgeSearchToolName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKnowledgeSearchToolName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `webSearchToolName` to the URL query string
    if (getWebSearchToolName() != null) {
      try {
        joiner.add(String.format("%swebSearchToolName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebSearchToolName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `webCrawlingToolName` to the URL query string
    if (getWebCrawlingToolName() != null) {
      try {
        joiner.add(String.format("%swebCrawlingToolName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebCrawlingToolName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `generateDocxToolName` to the URL query string
    if (getGenerateDocxToolName() != null) {
      try {
        joiner.add(String.format("%sgenerateDocxToolName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGenerateDocxToolName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `generateFormToolName` to the URL query string
    if (getGenerateFormToolName() != null) {
      try {
        joiner.add(String.format("%sgenerateFormToolName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGenerateFormToolName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `generatePresentationToolName` to the URL query string
    if (getGeneratePresentationToolName() != null) {
      try {
        joiner.add(String.format("%sgeneratePresentationToolName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGeneratePresentationToolName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `systemAiEnabled` to the URL query string
    if (getSystemAiEnabled() != null) {
      try {
        joiner.add(String.format("%ssystemAiEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSystemAiEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

