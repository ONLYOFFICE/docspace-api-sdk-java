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
import java.math.BigDecimal;
import org.openapitools.client.model.AiBuiltinProviderType;
import org.openapitools.client.model.AiProviderType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiProfilesGetById200Response
 */
@JsonPropertyOrder({
  AiProfilesGetById200Response.JSON_PROPERTY_ID,
  AiProfilesGetById200Response.JSON_PROPERTY_NAME,
  AiProfilesGetById200Response.JSON_PROPERTY_PROVIDER_TYPE,
  AiProfilesGetById200Response.JSON_PROPERTY_BASED_ON,
  AiProfilesGetById200Response.JSON_PROPERTY_BASE_URL,
  AiProfilesGetById200Response.JSON_PROPERTY_MODEL_ID,
  AiProfilesGetById200Response.JSON_PROPERTY_REASONING,
  AiProfilesGetById200Response.JSON_PROPERTY_CAPABILITIES,
  AiProfilesGetById200Response.JSON_PROPERTY_CAN_USE_TOOL,
  AiProfilesGetById200Response.JSON_PROPERTY_USE_RESPONSES_API,
  AiProfilesGetById200Response.JSON_PROPERTY_IS_CLOUD_PROVIDER,
  AiProfilesGetById200Response.JSON_PROPERTY_USE_PROXY,
  AiProfilesGetById200Response.JSON_PROPERTY_CREATED_AT
})
@JsonTypeName("aiProfilesGetById_200_response")

public class AiProfilesGetById200Response {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "providerType";
  @javax.annotation.Nonnull  private AiProviderType providerType;

  public static final String JSON_PROPERTY_BASED_ON = "basedOn";
  @javax.annotation.Nullable  private AiBuiltinProviderType basedOn;

  public static final String JSON_PROPERTY_BASE_URL = "baseUrl";
  @javax.annotation.Nonnull  private String baseUrl;

  public static final String JSON_PROPERTY_MODEL_ID = "modelId";
  @javax.annotation.Nonnull  private String modelId;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  @javax.annotation.Nullable  private Boolean reasoning;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  @javax.annotation.Nullable  private BigDecimal capabilities;

  public static final String JSON_PROPERTY_CAN_USE_TOOL = "canUseTool";
  @javax.annotation.Nullable  private Boolean canUseTool;

  public static final String JSON_PROPERTY_USE_RESPONSES_API = "useResponsesApi";
  @javax.annotation.Nullable  private Boolean useResponsesApi;

  public static final String JSON_PROPERTY_IS_CLOUD_PROVIDER = "isCloudProvider";
  @javax.annotation.Nullable  private Boolean isCloudProvider;

  public static final String JSON_PROPERTY_USE_PROXY = "useProxy";
  @javax.annotation.Nullable  private Boolean useProxy;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  @javax.annotation.Nullable  private BigDecimal createdAt;

  public AiProfilesGetById200Response() {
  }


  public AiProfilesGetById200Response id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Unique profile identifier (UUID).
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }

  public AiProfilesGetById200Response name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * User-defined profile display name.
   * @return name
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public AiProfilesGetById200Response providerType(@javax.annotation.Nonnull AiProviderType providerType) {
    
    this.providerType = providerType;
    return this;
  }

  /**
   * Provider type for this profile. Use `external` to delegate all HTTP transport to  {@link  PlatformAdapter.externalFetch  }  while reusing an existing provider's response parser — see  {@link  Profile.basedOn }  for the format selector.
   * @return providerType
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROVIDER_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiProviderType getProviderType() {
    return providerType;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderType(@javax.annotation.Nonnull AiProviderType providerType) {
    this.providerType = providerType;
  }

  public AiProfilesGetById200Response basedOn(@javax.annotation.Nullable AiBuiltinProviderType basedOn) {
    
    this.basedOn = basedOn;
    return this;
  }

  /**
   * Selects the response-format parser used by the `external` provider. Ignored for any other `providerType`.  Supported values are `openai`, `anthropic`, `mistral` and `openrouter`. Remaining values (`genai`, `stabilityai`, …) are accepted by the type but not yet implemented; passing one raises an error at request time.
   * @return basedOn
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_BASED_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiBuiltinProviderType getBasedOn() {
    return basedOn;
  }


  @JsonProperty(value = JSON_PROPERTY_BASED_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasedOn(@javax.annotation.Nullable AiBuiltinProviderType basedOn) {
    this.basedOn = basedOn;
  }

  public AiProfilesGetById200Response baseUrl(@javax.annotation.Nonnull String baseUrl) {
    
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Base URL of the provider API.
   * @return baseUrl
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBaseUrl() {
    return baseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseUrl(@javax.annotation.Nonnull String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public AiProfilesGetById200Response modelId(@javax.annotation.Nonnull String modelId) {
    
    this.modelId = modelId;
    return this;
  }

  /**
   * Selected model ID within this provider.
   * @return modelId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MODEL_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModelId() {
    return modelId;
  }


  @JsonProperty(value = JSON_PROPERTY_MODEL_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelId(@javax.annotation.Nonnull String modelId) {
    this.modelId = modelId;
  }

  public AiProfilesGetById200Response reasoning(@javax.annotation.Nullable Boolean reasoning) {
    
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Whether extended thinking is enabled for this profile's model.
   * @return reasoning
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REASONING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReasoning() {
    return reasoning;
  }


  @JsonProperty(value = JSON_PROPERTY_REASONING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasoning(@javax.annotation.Nullable Boolean reasoning) {
    this.reasoning = reasoning;
  }

  public AiProfilesGetById200Response capabilities(@javax.annotation.Nullable BigDecimal capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Bitmask of capabilities supported by the selected model.
   * @return capabilities
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CAPABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCapabilities() {
    return capabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(@javax.annotation.Nullable BigDecimal capabilities) {
    this.capabilities = capabilities;
  }

  public AiProfilesGetById200Response canUseTool(@javax.annotation.Nullable Boolean canUseTool) {
    
    this.canUseTool = canUseTool;
    return this;
  }

  /**
   * Result of the live tool-capability probe performed at create time and on changes to `modelId` / `providerType` / `baseUrl`. `undefined` means the probe has never run for this profile (legacy record).
   * @return canUseTool
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CAN_USE_TOOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUseTool() {
    return canUseTool;
  }


  @JsonProperty(value = JSON_PROPERTY_CAN_USE_TOOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanUseTool(@javax.annotation.Nullable Boolean canUseTool) {
    this.canUseTool = canUseTool;
  }

  public AiProfilesGetById200Response useResponsesApi(@javax.annotation.Nullable Boolean useResponsesApi) {
    
    this.useResponsesApi = useResponsesApi;
    return this;
  }

  /**
   * Result of the live Responses-API probe (parallel to  {@link  canUseTool  } ). `true` means the model speaks `/v1/responses` and the OpenAI provider must route through `client.responses.create` — required for gpt-5+ reasoning models that reject `reasoning_effort` together with `tools` on `/v1/chat/completions`. Probed at create time and whenever `modelId` / `providerType` / `baseUrl` change. `undefined` means the probe never ran (legacy record) — readers treat that as `false`.
   * @return useResponsesApi
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USE_RESPONSES_API, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseResponsesApi() {
    return useResponsesApi;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_RESPONSES_API, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseResponsesApi(@javax.annotation.Nullable Boolean useResponsesApi) {
    this.useResponsesApi = useResponsesApi;
  }

  public AiProfilesGetById200Response isCloudProvider(@javax.annotation.Nullable Boolean isCloudProvider) {
    
    this.isCloudProvider = isCloudProvider;
    return this;
  }

  /**
   * Whether this profile uses a cloud-hosted provider (e.g. ONLYOFFICE DocSpace).
   * @return isCloudProvider
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_CLOUD_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCloudProvider() {
    return isCloudProvider;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_CLOUD_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCloudProvider(@javax.annotation.Nullable Boolean isCloudProvider) {
    this.isCloudProvider = isCloudProvider;
  }

  public AiProfilesGetById200Response useProxy(@javax.annotation.Nullable Boolean useProxy) {
    
    this.useProxy = useProxy;
    return this;
  }

  /**
   * Route every provider request through the host's `fetchProxy` instead of the global `fetch`. Useful when the host runs the widget in a sandbox without direct network access (CORS, custom auth, etc.). Has no effect when the  {@link  PlatformAdapter.fetchProxy  }  is not configured.
   * @return useProxy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USE_PROXY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseProxy() {
    return useProxy;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_PROXY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseProxy(@javax.annotation.Nullable Boolean useProxy) {
    this.useProxy = useProxy;
  }

  public AiProfilesGetById200Response createdAt(@javax.annotation.Nullable BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation timestamp (ms since epoch). Used to sort the AI models list newest-first.
   * @return createdAt
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(@javax.annotation.Nullable BigDecimal createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiProfilesGetById200Response aiProfilesGetById200Response = (AiProfilesGetById200Response) o;
    return Objects.equals(this.id, aiProfilesGetById200Response.id) &&
        Objects.equals(this.name, aiProfilesGetById200Response.name) &&
        Objects.equals(this.providerType, aiProfilesGetById200Response.providerType) &&
        Objects.equals(this.basedOn, aiProfilesGetById200Response.basedOn) &&
        Objects.equals(this.baseUrl, aiProfilesGetById200Response.baseUrl) &&
        Objects.equals(this.modelId, aiProfilesGetById200Response.modelId) &&
        Objects.equals(this.reasoning, aiProfilesGetById200Response.reasoning) &&
        Objects.equals(this.capabilities, aiProfilesGetById200Response.capabilities) &&
        Objects.equals(this.canUseTool, aiProfilesGetById200Response.canUseTool) &&
        Objects.equals(this.useResponsesApi, aiProfilesGetById200Response.useResponsesApi) &&
        Objects.equals(this.isCloudProvider, aiProfilesGetById200Response.isCloudProvider) &&
        Objects.equals(this.useProxy, aiProfilesGetById200Response.useProxy) &&
        Objects.equals(this.createdAt, aiProfilesGetById200Response.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, providerType, basedOn, baseUrl, modelId, reasoning, capabilities, canUseTool, useResponsesApi, isCloudProvider, useProxy, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiProfilesGetById200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    basedOn: ").append(toIndentedString(basedOn)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    canUseTool: ").append(toIndentedString(canUseTool)).append("\n");
    sb.append("    useResponsesApi: ").append(toIndentedString(useResponsesApi)).append("\n");
    sb.append("    isCloudProvider: ").append(toIndentedString(isCloudProvider)).append("\n");
    sb.append("    useProxy: ").append(toIndentedString(useProxy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `providerType` to the URL query string
    if (getProviderType() != null) {
      joiner.add(getProviderType().toUrlQueryString(prefix + "providerType" + suffix));
    }

    // add `basedOn` to the URL query string
    if (getBasedOn() != null) {
      try {
        joiner.add(String.format("%sbasedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBasedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `baseUrl` to the URL query string
    if (getBaseUrl() != null) {
      try {
        joiner.add(String.format("%sbaseUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBaseUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modelId` to the URL query string
    if (getModelId() != null) {
      try {
        joiner.add(String.format("%smodelId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reasoning` to the URL query string
    if (getReasoning() != null) {
      try {
        joiner.add(String.format("%sreasoning%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReasoning()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `capabilities` to the URL query string
    if (getCapabilities() != null) {
      try {
        joiner.add(String.format("%scapabilities%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCapabilities()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canUseTool` to the URL query string
    if (getCanUseTool() != null) {
      try {
        joiner.add(String.format("%scanUseTool%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanUseTool()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `useResponsesApi` to the URL query string
    if (getUseResponsesApi() != null) {
      try {
        joiner.add(String.format("%suseResponsesApi%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUseResponsesApi()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isCloudProvider` to the URL query string
    if (getIsCloudProvider() != null) {
      try {
        joiner.add(String.format("%sisCloudProvider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsCloudProvider()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `useProxy` to the URL query string
    if (getUseProxy() != null) {
      try {
        joiner.add(String.format("%suseProxy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUseProxy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

