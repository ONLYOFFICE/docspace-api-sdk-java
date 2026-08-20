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
import org.openapitools.client.model.ExternalDatabaseType;
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
 * ExternalDatabaseSettings
 */
@JsonPropertyOrder({
  ExternalDatabaseSettings.JSON_PROPERTY_DATABASE_TYPE,
  ExternalDatabaseSettings.JSON_PROPERTY_DATABASE_TYPE_ENUM,
  ExternalDatabaseSettings.JSON_PROPERTY_DB_HOST,
  ExternalDatabaseSettings.JSON_PROPERTY_DB_PORT,
  ExternalDatabaseSettings.JSON_PROPERTY_DB_NAME,
  ExternalDatabaseSettings.JSON_PROPERTY_DB_USER,
  ExternalDatabaseSettings.JSON_PROPERTY_DB_PASSWORD,
  ExternalDatabaseSettings.JSON_PROPERTY_DB_SSL,
  ExternalDatabaseSettings.JSON_PROPERTY_SQLITE_FILE_PATH
})

public class ExternalDatabaseSettings {
  public static final String JSON_PROPERTY_DATABASE_TYPE = "databaseType";
  @javax.annotation.Nullable  private JsonNullable<String> databaseType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATABASE_TYPE_ENUM = "databaseTypeEnum";
  @javax.annotation.Nullable  private ExternalDatabaseType databaseTypeEnum;

  public static final String JSON_PROPERTY_DB_HOST = "dbHost";
  @javax.annotation.Nullable  private JsonNullable<String> dbHost = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DB_PORT = "dbPort";
  @javax.annotation.Nullable  private Integer dbPort;

  public static final String JSON_PROPERTY_DB_NAME = "dbName";
  @javax.annotation.Nullable  private JsonNullable<String> dbName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DB_USER = "dbUser";
  @javax.annotation.Nullable  private JsonNullable<String> dbUser = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DB_PASSWORD = "dbPassword";
  @javax.annotation.Nullable  private JsonNullable<String> dbPassword = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DB_SSL = "dbSsl";
  @javax.annotation.Nullable  private Boolean dbSsl;

  public static final String JSON_PROPERTY_SQLITE_FILE_PATH = "sqliteFilePath";
  @javax.annotation.Nullable  private JsonNullable<String> sqliteFilePath = JsonNullable.<String>undefined();

  public ExternalDatabaseSettings() {
  }


  public ExternalDatabaseSettings databaseType(@javax.annotation.Nullable String databaseType) {
    this.databaseType = JsonNullable.<String>of(databaseType);
    
    return this;
  }

  /**
   * Get databaseType
   * @return databaseType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDatabaseType() {
        return databaseType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DATABASE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDatabaseType_JsonNullable() {
    return databaseType;
  }
  
  @JsonProperty(JSON_PROPERTY_DATABASE_TYPE)
  public void setDatabaseType_JsonNullable(JsonNullable<String> databaseType) {
    this.databaseType = databaseType;
  }

  public void setDatabaseType(@javax.annotation.Nullable String databaseType) {
    this.databaseType = JsonNullable.<String>of(databaseType);
  }

  public ExternalDatabaseSettings databaseTypeEnum(@javax.annotation.Nullable ExternalDatabaseType databaseTypeEnum) {
    
    this.databaseTypeEnum = databaseTypeEnum;
    return this;
  }

  /**
   * Get databaseTypeEnum
   * @return databaseTypeEnum
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DATABASE_TYPE_ENUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalDatabaseType getDatabaseTypeEnum() {
    return databaseTypeEnum;
  }


  @JsonProperty(value = JSON_PROPERTY_DATABASE_TYPE_ENUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabaseTypeEnum(@javax.annotation.Nullable ExternalDatabaseType databaseTypeEnum) {
    this.databaseTypeEnum = databaseTypeEnum;
  }

  public ExternalDatabaseSettings dbHost(@javax.annotation.Nullable String dbHost) {
    this.dbHost = JsonNullable.<String>of(dbHost);
    
    return this;
  }

  /**
   * Get dbHost
   * @return dbHost
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDbHost() {
        return dbHost.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DB_HOST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDbHost_JsonNullable() {
    return dbHost;
  }
  
  @JsonProperty(JSON_PROPERTY_DB_HOST)
  public void setDbHost_JsonNullable(JsonNullable<String> dbHost) {
    this.dbHost = dbHost;
  }

  public void setDbHost(@javax.annotation.Nullable String dbHost) {
    this.dbHost = JsonNullable.<String>of(dbHost);
  }

  public ExternalDatabaseSettings dbPort(@javax.annotation.Nullable Integer dbPort) {
    
    this.dbPort = dbPort;
    return this;
  }

  /**
   * Get dbPort
   * @return dbPort
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DB_PORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDbPort() {
    return dbPort;
  }


  @JsonProperty(value = JSON_PROPERTY_DB_PORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbPort(@javax.annotation.Nullable Integer dbPort) {
    this.dbPort = dbPort;
  }

  public ExternalDatabaseSettings dbName(@javax.annotation.Nullable String dbName) {
    this.dbName = JsonNullable.<String>of(dbName);
    
    return this;
  }

  /**
   * Get dbName
   * @return dbName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDbName() {
        return dbName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DB_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDbName_JsonNullable() {
    return dbName;
  }
  
  @JsonProperty(JSON_PROPERTY_DB_NAME)
  public void setDbName_JsonNullable(JsonNullable<String> dbName) {
    this.dbName = dbName;
  }

  public void setDbName(@javax.annotation.Nullable String dbName) {
    this.dbName = JsonNullable.<String>of(dbName);
  }

  public ExternalDatabaseSettings dbUser(@javax.annotation.Nullable String dbUser) {
    this.dbUser = JsonNullable.<String>of(dbUser);
    
    return this;
  }

  /**
   * Get dbUser
   * @return dbUser
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDbUser() {
        return dbUser.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DB_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDbUser_JsonNullable() {
    return dbUser;
  }
  
  @JsonProperty(JSON_PROPERTY_DB_USER)
  public void setDbUser_JsonNullable(JsonNullable<String> dbUser) {
    this.dbUser = dbUser;
  }

  public void setDbUser(@javax.annotation.Nullable String dbUser) {
    this.dbUser = JsonNullable.<String>of(dbUser);
  }

  public ExternalDatabaseSettings dbPassword(@javax.annotation.Nullable String dbPassword) {
    this.dbPassword = JsonNullable.<String>of(dbPassword);
    
    return this;
  }

  /**
   * Get dbPassword
   * @return dbPassword
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDbPassword() {
        return dbPassword.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DB_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDbPassword_JsonNullable() {
    return dbPassword;
  }
  
  @JsonProperty(JSON_PROPERTY_DB_PASSWORD)
  public void setDbPassword_JsonNullable(JsonNullable<String> dbPassword) {
    this.dbPassword = dbPassword;
  }

  public void setDbPassword(@javax.annotation.Nullable String dbPassword) {
    this.dbPassword = JsonNullable.<String>of(dbPassword);
  }

  public ExternalDatabaseSettings dbSsl(@javax.annotation.Nullable Boolean dbSsl) {
    
    this.dbSsl = dbSsl;
    return this;
  }

  /**
   * Get dbSsl
   * @return dbSsl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DB_SSL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDbSsl() {
    return dbSsl;
  }


  @JsonProperty(value = JSON_PROPERTY_DB_SSL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbSsl(@javax.annotation.Nullable Boolean dbSsl) {
    this.dbSsl = dbSsl;
  }

  public ExternalDatabaseSettings sqliteFilePath(@javax.annotation.Nullable String sqliteFilePath) {
    this.sqliteFilePath = JsonNullable.<String>of(sqliteFilePath);
    
    return this;
  }

  /**
   * Get sqliteFilePath
   * @return sqliteFilePath
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSqliteFilePath() {
        return sqliteFilePath.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SQLITE_FILE_PATH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSqliteFilePath_JsonNullable() {
    return sqliteFilePath;
  }
  
  @JsonProperty(JSON_PROPERTY_SQLITE_FILE_PATH)
  public void setSqliteFilePath_JsonNullable(JsonNullable<String> sqliteFilePath) {
    this.sqliteFilePath = sqliteFilePath;
  }

  public void setSqliteFilePath(@javax.annotation.Nullable String sqliteFilePath) {
    this.sqliteFilePath = JsonNullable.<String>of(sqliteFilePath);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDatabaseSettings externalDatabaseSettings = (ExternalDatabaseSettings) o;
    return equalsNullable(this.databaseType, externalDatabaseSettings.databaseType) &&
        Objects.equals(this.databaseTypeEnum, externalDatabaseSettings.databaseTypeEnum) &&
        equalsNullable(this.dbHost, externalDatabaseSettings.dbHost) &&
        Objects.equals(this.dbPort, externalDatabaseSettings.dbPort) &&
        equalsNullable(this.dbName, externalDatabaseSettings.dbName) &&
        equalsNullable(this.dbUser, externalDatabaseSettings.dbUser) &&
        equalsNullable(this.dbPassword, externalDatabaseSettings.dbPassword) &&
        Objects.equals(this.dbSsl, externalDatabaseSettings.dbSsl) &&
        equalsNullable(this.sqliteFilePath, externalDatabaseSettings.sqliteFilePath);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(databaseType), databaseTypeEnum, hashCodeNullable(dbHost), dbPort, hashCodeNullable(dbName), hashCodeNullable(dbUser), hashCodeNullable(dbPassword), dbSsl, hashCodeNullable(sqliteFilePath));
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
    sb.append("class ExternalDatabaseSettings {\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    databaseTypeEnum: ").append(toIndentedString(databaseTypeEnum)).append("\n");
    sb.append("    dbHost: ").append(toIndentedString(dbHost)).append("\n");
    sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
    sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
    sb.append("    dbSsl: ").append(toIndentedString(dbSsl)).append("\n");
    sb.append("    sqliteFilePath: ").append(toIndentedString(sqliteFilePath)).append("\n");
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

    // add `databaseType` to the URL query string
    if (getDatabaseType() != null) {
      try {
        joiner.add(String.format("%sdatabaseType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatabaseType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `databaseTypeEnum` to the URL query string
    if (getDatabaseTypeEnum() != null) {
      try {
        joiner.add(String.format("%sdatabaseTypeEnum%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatabaseTypeEnum()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dbHost` to the URL query string
    if (getDbHost() != null) {
      try {
        joiner.add(String.format("%sdbHost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDbHost()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dbPort` to the URL query string
    if (getDbPort() != null) {
      try {
        joiner.add(String.format("%sdbPort%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDbPort()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dbName` to the URL query string
    if (getDbName() != null) {
      try {
        joiner.add(String.format("%sdbName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDbName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dbUser` to the URL query string
    if (getDbUser() != null) {
      try {
        joiner.add(String.format("%sdbUser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDbUser()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dbPassword` to the URL query string
    if (getDbPassword() != null) {
      try {
        joiner.add(String.format("%sdbPassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDbPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dbSsl` to the URL query string
    if (getDbSsl() != null) {
      try {
        joiner.add(String.format("%sdbSsl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDbSsl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sqliteFilePath` to the URL query string
    if (getSqliteFilePath() != null) {
      try {
        joiner.add(String.format("%ssqliteFilePath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSqliteFilePath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

