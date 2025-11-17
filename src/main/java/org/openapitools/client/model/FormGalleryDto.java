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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The form gallery parameters.
 */
@JsonPropertyOrder({
  FormGalleryDto.JSON_PROPERTY_PATH,
  FormGalleryDto.JSON_PROPERTY_DOMAIN,
  FormGalleryDto.JSON_PROPERTY_EXT,
  FormGalleryDto.JSON_PROPERTY_UPLOAD_PATH,
  FormGalleryDto.JSON_PROPERTY_UPLOAD_DOMAIN,
  FormGalleryDto.JSON_PROPERTY_UPLOAD_EXT,
  FormGalleryDto.JSON_PROPERTY_UPLOAD_DASHBOARD
})

public class FormGalleryDto {
  public static final String JSON_PROPERTY_PATH = "path";
  @javax.annotation.Nullable
  private String path;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  @javax.annotation.Nullable
  private String domain;

  public static final String JSON_PROPERTY_EXT = "ext";
  @javax.annotation.Nullable
  private String ext;

  public static final String JSON_PROPERTY_UPLOAD_PATH = "uploadPath";
  @javax.annotation.Nullable
  private String uploadPath;

  public static final String JSON_PROPERTY_UPLOAD_DOMAIN = "uploadDomain";
  @javax.annotation.Nullable
  private String uploadDomain;

  public static final String JSON_PROPERTY_UPLOAD_EXT = "uploadExt";
  @javax.annotation.Nullable
  private String uploadExt;

  public static final String JSON_PROPERTY_UPLOAD_DASHBOARD = "uploadDashboard";
  @javax.annotation.Nullable
  private String uploadDashboard;

  public FormGalleryDto() {
  }

  public FormGalleryDto path(@javax.annotation.Nullable String path) {
    
    this.path = path;
    return this;
  }

  /**
   * The form gallery path.
   * @return path
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPath(@javax.annotation.Nullable String path) {
    this.path = path;
  }

  public FormGalleryDto domain(@javax.annotation.Nullable String domain) {
    
    this.domain = domain;
    return this;
  }

  /**
   * The form gallery domain.
   * @return domain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomain(@javax.annotation.Nullable String domain) {
    this.domain = domain;
  }

  public FormGalleryDto ext(@javax.annotation.Nullable String ext) {
    
    this.ext = ext;
    return this;
  }

  /**
   * The form gallery extension.
   * @return ext
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExt() {
    return ext;
  }


  @JsonProperty(JSON_PROPERTY_EXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExt(@javax.annotation.Nullable String ext) {
    this.ext = ext;
  }

  public FormGalleryDto uploadPath(@javax.annotation.Nullable String uploadPath) {
    
    this.uploadPath = uploadPath;
    return this;
  }

  /**
   * The form gallery upload path.
   * @return uploadPath
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUploadPath() {
    return uploadPath;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUploadPath(@javax.annotation.Nullable String uploadPath) {
    this.uploadPath = uploadPath;
  }

  public FormGalleryDto uploadDomain(@javax.annotation.Nullable String uploadDomain) {
    
    this.uploadDomain = uploadDomain;
    return this;
  }

  /**
   * The form gallery upload domain.
   * @return uploadDomain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUploadDomain() {
    return uploadDomain;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUploadDomain(@javax.annotation.Nullable String uploadDomain) {
    this.uploadDomain = uploadDomain;
  }

  public FormGalleryDto uploadExt(@javax.annotation.Nullable String uploadExt) {
    
    this.uploadExt = uploadExt;
    return this;
  }

  /**
   * The form gallery upload extension.
   * @return uploadExt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_EXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUploadExt() {
    return uploadExt;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_EXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUploadExt(@javax.annotation.Nullable String uploadExt) {
    this.uploadExt = uploadExt;
  }

  public FormGalleryDto uploadDashboard(@javax.annotation.Nullable String uploadDashboard) {
    
    this.uploadDashboard = uploadDashboard;
    return this;
  }

  /**
   * The form gallery upload dashboard.
   * @return uploadDashboard
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_DASHBOARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUploadDashboard() {
    return uploadDashboard;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_DASHBOARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUploadDashboard(@javax.annotation.Nullable String uploadDashboard) {
    this.uploadDashboard = uploadDashboard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormGalleryDto formGalleryDto = (FormGalleryDto) o;
    return Objects.equals(this.path, formGalleryDto.path) &&
        Objects.equals(this.domain, formGalleryDto.domain) &&
        Objects.equals(this.ext, formGalleryDto.ext) &&
        Objects.equals(this.uploadPath, formGalleryDto.uploadPath) &&
        Objects.equals(this.uploadDomain, formGalleryDto.uploadDomain) &&
        Objects.equals(this.uploadExt, formGalleryDto.uploadExt) &&
        Objects.equals(this.uploadDashboard, formGalleryDto.uploadDashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, domain, ext, uploadPath, uploadDomain, uploadExt, uploadDashboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormGalleryDto {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    uploadPath: ").append(toIndentedString(uploadPath)).append("\n");
    sb.append("    uploadDomain: ").append(toIndentedString(uploadDomain)).append("\n");
    sb.append("    uploadExt: ").append(toIndentedString(uploadExt)).append("\n");
    sb.append("    uploadDashboard: ").append(toIndentedString(uploadDashboard)).append("\n");
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

    // add `path` to the URL query string
    if (getPath() != null) {
      try {
        joiner.add(String.format("%spath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `domain` to the URL query string
    if (getDomain() != null) {
      try {
        joiner.add(String.format("%sdomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ext` to the URL query string
    if (getExt() != null) {
      try {
        joiner.add(String.format("%sext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uploadPath` to the URL query string
    if (getUploadPath() != null) {
      try {
        joiner.add(String.format("%suploadPath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploadPath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uploadDomain` to the URL query string
    if (getUploadDomain() != null) {
      try {
        joiner.add(String.format("%suploadDomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploadDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uploadExt` to the URL query string
    if (getUploadExt() != null) {
      try {
        joiner.add(String.format("%suploadExt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploadExt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uploadDashboard` to the URL query string
    if (getUploadDashboard() != null) {
      try {
        joiner.add(String.format("%suploadDashboard%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploadDashboard()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

