

# ExternalDatabaseConnectionRequestDto

The connection parameters of an external database to test.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**databaseType** | **String** | The engine of the external database: `mysql`, or `sqlite` on a Standalone installation. |  [optional] |
|**databaseTypeEnum** | **ExternalDatabaseType** | The engine named by `databaseType`, as the server reads it. A value sent here is ignored. |  [optional] |
|**dbHost** | **String** | The host name or the IP address of the database server. |  [optional] |
|**dbPort** | **Integer** | The port the database server listens on. |  [optional] |
|**dbName** | **String** | The name of the database to connect to. |  [optional] |
|**dbUser** | **String** | The user name to connect with. |  [optional] |
|**dbPassword** | **String** | The password to connect with. |  [optional] |
|**dbSsl** | **Boolean** | Whether the connection is secured with SSL. |  [optional] |
|**sqliteFilePath** | **String** | The path to the database file, used by the SQLite engine only. |  [optional] |



