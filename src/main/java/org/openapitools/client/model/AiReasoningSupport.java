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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiReasoningDepth;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * What one model can do with extended thinking. Providers describe each model through this shape so the UI offers only the choices that change the request, and the request builders clamp to the same table.
 */
@JsonPropertyOrder({
  AiReasoningSupport.JSON_PROPERTY_THINKS,
  AiReasoningSupport.JSON_PROPERTY_CAN_DISABLE,
  AiReasoningSupport.JSON_PROPERTY_DEPTHS,
  AiReasoningSupport.JSON_PROPERTY_DEFAULT_DEPTH
})

public class AiReasoningSupport {
  public static final String JSON_PROPERTY_THINKS = "thinks";
  @javax.annotation.Nonnull  private Boolean thinks;

  public static final String JSON_PROPERTY_CAN_DISABLE = "canDisable";
  @javax.annotation.Nonnull  private Boolean canDisable;

  public static final String JSON_PROPERTY_DEPTHS = "depths";
  @javax.annotation.Nonnull  private List<AiReasoningDepth> depths = new ArrayList<>();

  public static final String JSON_PROPERTY_DEFAULT_DEPTH = "defaultDepth";
  @javax.annotation.Nullable  private AiReasoningDepth defaultDepth;

  public AiReasoningSupport() {
  }


  public AiReasoningSupport thinks(@javax.annotation.Nonnull Boolean thinks) {
    
    this.thinks = thinks;
    return this;
  }

  /**
   * Whether the model can think at all. False hides the whole control.
   * @return thinks
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_THINKS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getThinks() {
    return thinks;
  }


  @JsonProperty(value = JSON_PROPERTY_THINKS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThinks(@javax.annotation.Nonnull Boolean thinks) {
    this.thinks = thinks;
  }

  public AiReasoningSupport canDisable(@javax.annotation.Nonnull Boolean canDisable) {
    
    this.canDisable = canDisable;
    return this;
  }

  /**
   * Whether `off` really turns thinking off. False means the model thinks always and off only drops to its lowest depth (or leaves the default depth, where there is no knob).
   * @return canDisable
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CAN_DISABLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanDisable() {
    return canDisable;
  }


  @JsonProperty(value = JSON_PROPERTY_CAN_DISABLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanDisable(@javax.annotation.Nonnull Boolean canDisable) {
    this.canDisable = canDisable;
  }

  public AiReasoningSupport depths(@javax.annotation.Nonnull List<AiReasoningDepth> depths) {
    
    this.depths = depths;
    return this;
  }

  public AiReasoningSupport addDepthsItem(AiReasoningDepth depthsItem) {
    if (this.depths == null) {
      this.depths = new ArrayList<>();
    }
    this.depths.add(depthsItem);
    return this;
  }

  /**
   * Depths the model distinguishes, lowest first. Empty when thinking is an on/off switch with no depth (or the model doesn't think). A level not listed is clamped to the nearest one — see `clampReasoningLevel`.
   * @return depths
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DEPTHS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiReasoningDepth> getDepths() {
    return depths;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPTHS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDepths(@javax.annotation.Nonnull List<AiReasoningDepth> depths) {
    this.depths = depths;
  }

  public AiReasoningSupport defaultDepth(@javax.annotation.Nullable AiReasoningDepth defaultDepth) {
    
    this.defaultDepth = defaultDepth;
    return this;
  }

  /**
   * The depth the model runs at when nothing asks for one — what a stored `off` means on a model that cannot be switched off. Known only where a catalogue reports it (OpenRouter's `default_effort`); otherwise `DEFAULT_REASONING_LEVEL` clamped to `depths` is assumed.
   * @return defaultDepth
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEFAULT_DEPTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiReasoningDepth getDefaultDepth() {
    return defaultDepth;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_DEPTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultDepth(@javax.annotation.Nullable AiReasoningDepth defaultDepth) {
    this.defaultDepth = defaultDepth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiReasoningSupport aiReasoningSupport = (AiReasoningSupport) o;
    return Objects.equals(this.thinks, aiReasoningSupport.thinks) &&
        Objects.equals(this.canDisable, aiReasoningSupport.canDisable) &&
        Objects.equals(this.depths, aiReasoningSupport.depths) &&
        Objects.equals(this.defaultDepth, aiReasoningSupport.defaultDepth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thinks, canDisable, depths, defaultDepth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiReasoningSupport {\n");
    sb.append("    thinks: ").append(toIndentedString(thinks)).append("\n");
    sb.append("    canDisable: ").append(toIndentedString(canDisable)).append("\n");
    sb.append("    depths: ").append(toIndentedString(depths)).append("\n");
    sb.append("    defaultDepth: ").append(toIndentedString(defaultDepth)).append("\n");
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

    // add `thinks` to the URL query string
    if (getThinks() != null) {
      try {
        joiner.add(String.format("%sthinks%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThinks()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canDisable` to the URL query string
    if (getCanDisable() != null) {
      try {
        joiner.add(String.format("%scanDisable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanDisable()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `depths` to the URL query string
    if (getDepths() != null) {
      for (int i = 0; i < getDepths().size(); i++) {
        if (getDepths().get(i) != null) {
          try {
            joiner.add(String.format("%sdepths%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getDepths().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `defaultDepth` to the URL query string
    if (getDefaultDepth() != null) {
      try {
        joiner.add(String.format("%sdefaultDepth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultDepth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

