

# ExternalDatabaseSettings

The connection parameters of an external database.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**databaseType** | **String** | The engine of the external database. |  [optional] |
|**databaseTypeEnum** | **ExternalDatabaseType** | The engine of an external database. |  [optional] |
|**dbHost** | **String** | The host name or the IP address of the database server. |  [optional] |
|**dbPort** | **Integer** | The port the database server listens on. |  [optional] |
|**dbName** | **String** | The name of the database to connect to. |  [optional] |
|**dbUser** | **String** | The user name to connect with. |  [optional] |
|**dbPassword** | **String** | The password to connect with. |  [optional] |
|**dbSsl** | **Boolean** | Specifies whether the connection to the database is secured with SSL. |  [optional] |
|**sqliteFilePath** | **String** | The path to the database file, used by the SQLite engine only. |  [optional] |



