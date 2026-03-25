# docspace-api-sdk

The ONLYOFFICE DocSpace SDK for Java is a library that provides tools for integrating and managing DocSpace features within your applications. It simplifies interaction with the DocSpace API by offering ready-to-use methods and models.

For more information, please visit [https://helpdesk.onlyoffice.com/hc/en-us](https://helpdesk.onlyoffice.com/hc/en-us)

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AiAgentsApi;

public class AiAgentsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8092");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: ApiKeyBearer
        ApiKeyAuth ApiKeyBearer = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyBearer");
        ApiKeyBearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyBearer.setApiKeyPrefix("Token");

        // Configure API key authorization: asc_auth_key
        ApiKeyAuth asc_auth_key = (ApiKeyAuth) defaultClient.getAuthentication("asc_auth_key");
        asc_auth_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //asc_auth_key.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");


        AiAgentsApi apiInstance = new AiAgentsApi(defaultClient);
        CreateAgentRequestDto createAgentRequestDto = new CreateAgentRequestDto(); // CreateAgentRequestDto | 
        try {
            FolderIntegerWrapper result = apiInstance.createAgent(createAgentRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AiAgentsApi#createAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="asc_auth_key"></a>
### asc_auth_key


- **Type**: API key
- **API key parameter name**: asc_auth_key
- **Location**: 
<a id="Basic"></a>
### Basic


- **Type**: HTTP basic authentication
<a id="Bearer"></a>
### Bearer


- **Type**: HTTP Bearer Token authentication (JWT)
<a id="ApiKeyBearer"></a>
### ApiKeyBearer


- **Type**: API key
- **API key parameter name**: ApiKeyBearer
- **Location**: HTTP header
<a id="OAuth2"></a>
### OAuth2


- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: {{authBaseUrl}}/oauth2/authorize
- **Token Url**: {{authBaseUrl}}/oauth2/token
- **Scopes**: 
  - read: Read access to protected resources
  - write: Write access to protected resources
<a id="OpenId"></a>
### OpenId


- **Type**: OpenId Connect
- **OpenId Connect URL**: {{authBaseUrl}}/.well-known/openid-configuration
<a id="x-signature"></a>
### x-signature


- **Type**: API key
- **API key parameter name**: x-signature
- **Location**: 

## Documentation for API Endpoints

All URIs are relative to *https://your-docspace.onlyoffice.com*

### API Endoints tables:

<details>
  <summary>AI</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AgentsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AiAgentsApi.md#createagent"><strong>createAgent</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/agents</td>
        <td>Create an ai agent</td>
      </tr>
      <tr>
        <td><a href="docs/AiAgentsApi.md#deleteagent"><strong>deleteAgent</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/ai/agents/{id}</td>
        <td>Remove an ai agent</td>
      </tr>
      <tr>
        <td><a href="docs/AiAgentsApi.md#getagentinfo"><strong>getAgentInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/agents/{id}</td>
        <td>Return an ai agent</td>
      </tr>
      <tr>
        <td><a href="docs/AiAgentsApi.md#getagents"><strong>getAgents</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/agents</td>
        <td>Get ai agents</td>
      </tr>
      <tr>
        <td><a href="docs/AiAgentsApi.md#getagentsnewitems"><strong>getAgentsNewItems</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/agents/news</td>
        <td>Get the room new items</td>
      </tr>
      <tr>
        <td><a href="docs/AiAgentsApi.md#resetagentsquota"><strong>resetAgentsQuota</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/agents/resetquota</td>
        <td>Reset the AI agents quota limit</td>
      </tr>
      <tr>
        <td><a href="docs/AiAgentsApi.md#updateagent"><strong>updateAgent</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/agents/{id}</td>
        <td>Update an ai agent</td>
      </tr>
      <tr>
        <td><a href="docs/AiAgentsApi.md#updateagentsquota"><strong>updateAgentsQuota</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/agents/agentquota</td>
        <td>Change the AI agent quota limit</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ChatApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#continuechat"><strong>continueChat</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/chats/{chatId}/messages</td>
        <td>Send a message to an existing AI chat</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#deletechat"><strong>deleteChat</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/ai/chats/{chatId}</td>
        <td>Delete an AI chat</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#exportchat"><strong>exportChat</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/chats/{chatId}/messages/export</td>
        <td>Export AI chat messages to a file</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#getchat"><strong>getChat</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/chats/{chatId}</td>
        <td>Get an AI chat by ID</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#getchatmodels"><strong>getChatModels</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/chats/models</td>
        <td>Get available AI models</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#getchats"><strong>getChats</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/rooms/{roomId}/chats</td>
        <td>Get AI chats in a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#getmessages"><strong>getMessages</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/chats/{chatId}/messages</td>
        <td>Get messages of an AI chat</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#getuserchatssettings"><strong>getUserChatsSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/rooms/{roomId}/chats/config</td>
        <td>Get user chat settings for a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#providepermission"><strong>providePermission</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/chats/tool-permissions/{callId}/decision</td>
        <td>Submit a tool execution permission decision</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#renamechat"><strong>renameChat</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/chats/{chatId}</td>
        <td>Rename an AI chat</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#setuserchatssettings"><strong>setUserChatsSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/rooms/{roomId}/chats/config</td>
        <td>Update user chat settings for a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiChatApi.md#startnewchat"><strong>startNewChat</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/rooms/{roomId}/chats</td>
        <td>Start a new AI chat</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>MCPApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#addroomservers"><strong>addRoomServers</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/rooms/{roomId}/servers</td>
        <td>Assign MCP servers to a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#addserver"><strong>addServer</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/servers</td>
        <td>Register a custom MCP server</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#connectserver"><strong>connectServer</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/rooms/{roomId}/servers/{serverId}/connect</td>
        <td>Connect an OAuth-based MCP server in a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#deleteroomservers"><strong>deleteRoomServers</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/ai/rooms/{roomId}/servers</td>
        <td>Remove MCP servers from a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#deleteserver"><strong>deleteServer</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/ai/servers</td>
        <td>Delete MCP servers</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#disconnectserver"><strong>disconnectServer</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/rooms/{roomId}/servers/{serverId}/disconnect</td>
        <td>Disconnect an MCP server in a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#getavailableservers"><strong>getAvailableServers</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/servers/available</td>
        <td>Get available MCP servers</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#getroomservers"><strong>getRoomServers</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/rooms/{roomId}/servers</td>
        <td>Get MCP servers assigned to a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#getserver"><strong>getServer</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/servers/{id}</td>
        <td>Get an MCP server by ID</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#getservers"><strong>getServers</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/servers</td>
        <td>Get all MCP servers</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#gettools"><strong>getTools</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools</td>
        <td>Get MCP server tools in a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#setserverstatus"><strong>setServerStatus</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/servers/{id}/status</td>
        <td>Enable or disable an MCP server</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#settools"><strong>setTools</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools</td>
        <td>Configure MCP server tools in a room</td>
      </tr>
      <tr>
        <td><a href="docs/AiMcpApi.md#updateserver"><strong>updateServer</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/servers/{id}</td>
        <td>Update a custom MCP server</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>MessagesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AiMessagesApi.md#exportmessage"><strong>exportMessage</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/messages/{messageId}/export</td>
        <td>Export a single AI message to a document</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ProvidersApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AiProvidersApi.md#addprovider"><strong>addProvider</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/providers</td>
        <td>Add an AI provider</td>
      </tr>
      <tr>
        <td><a href="docs/AiProvidersApi.md#deleteproviders"><strong>deleteProviders</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/ai/providers</td>
        <td>Delete AI providers</td>
      </tr>
      <tr>
        <td><a href="docs/AiProvidersApi.md#getavailableproviders"><strong>getAvailableProviders</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/providers/available</td>
        <td>Get available AI provider types</td>
      </tr>
      <tr>
        <td><a href="docs/AiProvidersApi.md#getdefaultprovider"><strong>getDefaultProvider</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/providers/default</td>
        <td>Get the default AI provider</td>
      </tr>
      <tr>
        <td><a href="docs/AiProvidersApi.md#getproviders"><strong>getProviders</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/providers</td>
        <td>Get AI providers</td>
      </tr>
      <tr>
        <td><a href="docs/AiProvidersApi.md#setdefaultprovider"><strong>setDefaultProvider</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/providers/default</td>
        <td>Set the default AI provider</td>
      </tr>
      <tr>
        <td><a href="docs/AiProvidersApi.md#updateprovider"><strong>updateProvider</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/providers/{id}</td>
        <td>Update an AI provider</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AiSettingsApi.md#getaisettings"><strong>getAiSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/config</td>
        <td>Get AI settings</td>
      </tr>
      <tr>
        <td><a href="docs/AiSettingsApi.md#getvectorizationsettings"><strong>getVectorizationSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/config/vectorization</td>
        <td>Get vectorization settings</td>
      </tr>
      <tr>
        <td><a href="docs/AiSettingsApi.md#getwebsearchsettings"><strong>getWebSearchSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/ai/config/web-search</td>
        <td>Get web search settings</td>
      </tr>
      <tr>
        <td><a href="docs/AiSettingsApi.md#setvectorizationsettings"><strong>setVectorizationSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/config/vectorization</td>
        <td>Update vectorization settings</td>
      </tr>
      <tr>
        <td><a href="docs/AiSettingsApi.md#setwebsearchsettings"><strong>setWebSearchSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/ai/config/web-search</td>
        <td>Update web search settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>VectorizationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AiVectorizationApi.md#starttask"><strong>startTask</strong></a></td>
        <td><strong>POST</strong> /api/2.0/ai/vectorization/tasks</td>
        <td>Start a vectorization task</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>ApiKeys</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>ApiKeysApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#createapikey"><strong>createApiKey</strong></a></td>
        <td><strong>POST</strong> /api/2.0/keys</td>
        <td>Create a user API key</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#deleteapikey"><strong>deleteApiKey</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/keys/{keyId}</td>
        <td>Delete a user API key</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#getallpermissions"><strong>getAllPermissions</strong></a></td>
        <td><strong>GET</strong> /api/2.0/keys/permissions</td>
        <td>Get API key permissions</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#getapikey"><strong>getApiKey</strong></a></td>
        <td><strong>GET</strong> /api/2.0/keys/@self</td>
        <td>Get current user&#39;s API key</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#getapikeys"><strong>getApiKeys</strong></a></td>
        <td><strong>GET</strong> /api/2.0/keys</td>
        <td>Get current user&#39;s API keys</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#updateapikey"><strong>updateApiKey</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/keys/{keyId}</td>
        <td>Update an API key</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Authentication</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AuthenticationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#authenticateme"><strong>authenticateMe</strong></a></td>
        <td><strong>POST</strong> /api/2.0/authentication</td>
        <td>Authenticate a user</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#authenticatemefrombodywithcode"><strong>authenticateMeFromBodyWithCode</strong></a></td>
        <td><strong>POST</strong> /api/2.0/authentication/{code}</td>
        <td>Authenticate a user by code</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#checkconfirm"><strong>checkConfirm</strong></a></td>
        <td><strong>POST</strong> /api/2.0/authentication/confirm</td>
        <td>Open confirmation email URL</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#getisauthentificated"><strong>getIsAuthentificated</strong></a></td>
        <td><strong>GET</strong> /api/2.0/authentication</td>
        <td>Check authentication</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#logout"><strong>logout</strong></a></td>
        <td><strong>POST</strong> /api/2.0/authentication/logout</td>
        <td>Log out</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#savemobilephone"><strong>saveMobilePhone</strong></a></td>
        <td><strong>POST</strong> /api/2.0/authentication/setphone</td>
        <td>Set a mobile phone</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#sendsmscode"><strong>sendSmsCode</strong></a></td>
        <td><strong>POST</strong> /api/2.0/authentication/sendsms</td>
        <td>Send SMS code</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Backup</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>BackupApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#cancelbackup"><strong>cancelBackup</strong></a></td>
        <td><strong>POST</strong> /api/2.0/backup/cancelbackup</td>
        <td>Cancel current backup</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#createbackupschedule"><strong>createBackupSchedule</strong></a></td>
        <td><strong>POST</strong> /api/2.0/backup/createbackupschedule</td>
        <td>Create the backup schedule</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#deletebackup"><strong>deleteBackup</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/backup/deletebackup/{id}</td>
        <td>Delete the backup</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#deletebackuphistory"><strong>deleteBackupHistory</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/backup/deletebackuphistory</td>
        <td>Delete the backup history</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#deletebackupschedule"><strong>deleteBackupSchedule</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/backup/deletebackupschedule</td>
        <td>Delete the backup schedule</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackuphistory"><strong>getBackupHistory</strong></a></td>
        <td><strong>GET</strong> /api/2.0/backup/getbackuphistory</td>
        <td>Get the backup history</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackupprogress"><strong>getBackupProgress</strong></a></td>
        <td><strong>GET</strong> /api/2.0/backup/getbackupprogress</td>
        <td>Get the backup progress</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackupschedule"><strong>getBackupSchedule</strong></a></td>
        <td><strong>GET</strong> /api/2.0/backup/getbackupschedule</td>
        <td>Get the backup schedule</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackupscount"><strong>getBackupsCount</strong></a></td>
        <td><strong>GET</strong> /api/2.0/backup/getbackupscount</td>
        <td>Get the number of backups</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackupsservicestate"><strong>getBackupsServiceState</strong></a></td>
        <td><strong>GET</strong> /api/2.0/backup/getservicestate</td>
        <td>Get the backup service state</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getrestoreprogress"><strong>getRestoreProgress</strong></a></td>
        <td><strong>GET</strong> /api/2.0/backup/getrestoreprogress</td>
        <td>Get the restoring progress</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#startbackup"><strong>startBackup</strong></a></td>
        <td><strong>POST</strong> /api/2.0/backup/startbackup</td>
        <td>Start the backup</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#startbackuprestore"><strong>startBackupRestore</strong></a></td>
        <td><strong>POST</strong> /api/2.0/backup/startrestore</td>
        <td>Start the restoring process</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Capabilities</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>CapabilitiesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/CapabilitiesApi.md#getportalcapabilities"><strong>getPortalCapabilities</strong></a></td>
        <td><strong>GET</strong> /api/2.0/capabilities</td>
        <td>Get portal capabilities</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Files</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>FilesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#addfiletorecent"><strong>addFileToRecent</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{fileId}/recent</td>
        <td>Add a file to the Recent section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#addtemplates"><strong>addTemplates</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/templates</td>
        <td>Add template files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#changeversionhistory"><strong>changeVersionHistory</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/history</td>
        <td>Change version history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#checkfillformdraft"><strong>checkFillFormDraft</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/masterform/{fileId}/checkfillformdraft</td>
        <td>Check the form draft filling</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#copyfileas"><strong>copyFileAs</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{fileId}/copyas</td>
        <td>Copy a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createeditsession"><strong>createEditSession</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{fileId}/edit_session</td>
        <td>Create the editing session</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createfile"><strong>createFile</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/file</td>
        <td>Create a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createfileinmydocuments"><strong>createFileInMyDocuments</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/@my/file</td>
        <td>Create a file in the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createfileprimaryexternallink"><strong>createFilePrimaryExternalLink</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{id}/link</td>
        <td>Create primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createhtmlfile"><strong>createHtmlFile</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/html</td>
        <td>Create an HTML file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createhtmlfileinmydocuments"><strong>createHtmlFileInMyDocuments</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/@my/html</td>
        <td>Create an HTML file in the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createtextfile"><strong>createTextFile</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/text</td>
        <td>Create a text file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createtextfileinmydocuments"><strong>createTextFileInMyDocuments</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/@my/text</td>
        <td>Create a text file in the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createthumbnails"><strong>createThumbnails</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/thumbnails</td>
        <td>Create file thumbnails</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#deletefile"><strong>deleteFile</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/file/{fileId}</td>
        <td>Delete a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#deleterecent"><strong>deleteRecent</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/recent</td>
        <td>Delete recent files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#deletetemplates"><strong>deleteTemplates</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/templates</td>
        <td>Delete template files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#generatexlsx"><strong>generateXlsx</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{fileId}/xlsx</td>
        <td>Generate XLSX report</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getallformroles"><strong>getAllFormRoles</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/formroles</td>
        <td>Get form roles</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#geteditdiffurl"><strong>getEditDiffUrl</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/edit/diff</td>
        <td>Get changes URL</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getedithistory"><strong>getEditHistory</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/edit/history</td>
        <td>Get version history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfilehistory"><strong>getFileHistory</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/log</td>
        <td>Get file history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfileinfo"><strong>getFileInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}</td>
        <td>Get file information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfilelinks"><strong>getFileLinks</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{id}/links</td>
        <td>Get file external links</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfileprimaryexternallink"><strong>getFilePrimaryExternalLink</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{id}/link</td>
        <td>Get primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfileversioninfo"><strong>getFileVersionInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/history</td>
        <td>Get file versions</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfillresult"><strong>getFillResult</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/fillresult</td>
        <td>Get form-filling result</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getformsubmissions"><strong>getFormSubmissions</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/submissions</td>
        <td>Get form submission results</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getpresignedfileuri"><strong>getPresignedFileUri</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/presigned</td>
        <td>Get file download link asynchronously</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getpresigneduri"><strong>getPresignedUri</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/presigneduri</td>
        <td>Get file download link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getprotectedfileusers"><strong>getProtectedFileUsers</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/protectusers</td>
        <td>Get users access rights to the protected file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getreferencedata"><strong>getReferenceData</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/referencedata</td>
        <td>Get reference data</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#isformpdf"><strong>isFormPDF</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/isformpdf</td>
        <td>Check the PDF file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#lockfile"><strong>lockFile</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/lock</td>
        <td>Lock a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#manageformfilling"><strong>manageFormFilling</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/manageformfilling</td>
        <td>Perform form filling action</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#openeditfile"><strong>openEditFile</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/openedit</td>
        <td>Open a file configuration</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#restorefileversion"><strong>restoreFileVersion</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{fileId}/restoreversion</td>
        <td>Restore a file version</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#saveeditingfilefromform"><strong>saveEditingFileFromForm</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/saveediting</td>
        <td>Save file edits</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#savefileaspdf"><strong>saveFileAsPdf</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{id}/saveaspdf</td>
        <td>Save a file as PDF</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#saveformrolemapping"><strong>saveFormRoleMapping</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{fileId}/formrolemapping</td>
        <td>Save form role mapping</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#setcustomfiltertag"><strong>setCustomFilterTag</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/customfilter</td>
        <td>Set the Custom Filter editing mode</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#setfileexternallink"><strong>setFileExternalLink</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{id}/links</td>
        <td>Set an external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#setfileorder"><strong>setFileOrder</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/{fileId}/order</td>
        <td>Set file order</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#setfilesorder"><strong>setFilesOrder</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/order</td>
        <td>Set order of files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#starteditfile"><strong>startEditFile</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{fileId}/startedit</td>
        <td>Start file editing</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#startfillingfile"><strong>startFillingFile</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/startfilling</td>
        <td>Start file filling</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#togglefilefavorite"><strong>toggleFileFavorite</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/favorites/{fileId}</td>
        <td>Change the file favorite status</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#trackeditfile"><strong>trackEditFile</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/trackeditfile</td>
        <td>Track file editing</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#updatefile"><strong>updateFile</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}</td>
        <td>Update a file</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>FoldersApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#checkupload"><strong>checkUpload</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/upload/check</td>
        <td>Check file uploads</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#createfolder"><strong>createFolder</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/folder/{folderId}</td>
        <td>Create a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#createfolderprimaryexternallink"><strong>createFolderPrimaryExternalLink</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/folder/{id}/link</td>
        <td>Create primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#createreportfolderhistory"><strong>createReportFolderHistory</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/folder/{folderId}/log/report</td>
        <td>Generates folder history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#deletefolder"><strong>deleteFolder</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/folder/{folderId}</td>
        <td>Delete a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfavoritesfolder"><strong>getFavoritesFolder</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/@favorites</td>
        <td>Get the Favorites section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfilesusedspace"><strong>getFilesUsedSpace</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/filesusedspace</td>
        <td>Get used space of files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolder"><strong>getFolder</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/{folderId}/formfilter</td>
        <td>Get folder form filter</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderbyfolderid"><strong>getFolderByFolderId</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/{folderId}</td>
        <td>Get a folder by ID</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderhistory"><strong>getFolderHistory</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/folder/{folderId}/log</td>
        <td>Get folder history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderinfo"><strong>getFolderInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/folder/{folderId}</td>
        <td>Get folder information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderlinks"><strong>getFolderLinks</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/folder/{id}/links</td>
        <td>Get the folder links</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderpath"><strong>getFolderPath</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/folder/{folderId}/path</td>
        <td>Get the folder path</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderprimaryexternallink"><strong>getFolderPrimaryExternalLink</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/folder/{id}/link</td>
        <td>Get primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolders"><strong>getFolders</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/{folderId}/subfolders</td>
        <td>Get subfolders</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getmyfolder"><strong>getMyFolder</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/@my</td>
        <td>Get the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getnewfolderitems"><strong>getNewFolderItems</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/{folderId}/news</td>
        <td>Get new folder items</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getprivacyfolder"><strong>getPrivacyFolder</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/@privacy</td>
        <td>Get the Private Room section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getrecentfolder"><strong>getRecentFolder</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/recent</td>
        <td>Get the Recent section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getrootfolders"><strong>getRootFolders</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/@root</td>
        <td>Get filtered sections</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#gettrashfolder"><strong>getTrashFolder</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/@trash</td>
        <td>Get the Trash section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#insertfile"><strong>insertFile</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/insert</td>
        <td>Insert a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#insertfiletomyfrombody"><strong>insertFileToMyFromBody</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/@my/insert</td>
        <td>Insert a file to the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#renamefolder"><strong>renameFolder</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/folder/{folderId}</td>
        <td>Rename a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#setfolderorder"><strong>setFolderOrder</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/folder/{folderId}/order</td>
        <td>Set folder order</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#setfolderprimaryexternallink"><strong>setFolderPrimaryExternalLink</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/folder/{id}/links</td>
        <td>Set the folder external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#uploadfile"><strong>uploadFile</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/upload</td>
        <td>Upload a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#uploadfiletomy"><strong>uploadFileToMy</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/@my/upload</td>
        <td>Upload a file to the My documents section</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>OperationsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#abortuploadsession"><strong>abortUploadSession</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/{folderId}/session/{sessionId}</td>
        <td>Aborts an in-progress file upload session.</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#addfavorites"><strong>addFavorites</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/favorites</td>
        <td>Add favorite files and folders</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#bulkdownload"><strong>bulkDownload</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/bulkdownload</td>
        <td>Bulk download</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#checkconversionstatus"><strong>checkConversionStatus</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/checkconversion</td>
        <td>Get conversion status</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#checkmoveorcopybatchitems"><strong>checkMoveOrCopyBatchItems</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/fileops/move</td>
        <td>Move or copy files to a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#checkmoveorcopydestfolder"><strong>checkMoveOrCopyDestFolder</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/fileops/checkdestfolder</td>
        <td>Check for moving or copying files to a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#copybatchitems"><strong>copyBatchItems</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/copy</td>
        <td>Copy to the folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#createuploadsession"><strong>createUploadSession</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/upload/create_session</td>
        <td>Chunked upload</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#createuploadsessioninfolder"><strong>createUploadSessionInFolder</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/session</td>
        <td>Creates a session for uploading a file to a specific folder in chunks.</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#deletebatchitems"><strong>deleteBatchItems</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/delete</td>
        <td>Delete files and folders</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#deletefavoritesfrombody"><strong>deleteFavoritesFromBody</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/favorites</td>
        <td>Delete favorite files and folders (using body parameters)</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#deletefileversions"><strong>deleteFileVersions</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/deleteversion</td>
        <td>Delete file versions</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#duplicatebatchitems"><strong>duplicateBatchItems</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/duplicate</td>
        <td>Duplicate files and folders</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#emptytrash"><strong>emptyTrash</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/emptytrash</td>
        <td>Empty the Trash folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#finalizesession"><strong>finalizeSession</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/{folderId}/session/{sessionId}/finalize</td>
        <td>Finalize an upload session</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#getoperationstatuses"><strong>getOperationStatuses</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/fileops</td>
        <td>Get active file operations</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#getoperationstatusesbytype"><strong>getOperationStatusesByType</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/fileops/{operationType}</td>
        <td>Get file operation statuses</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#markasread"><strong>markAsRead</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/markasread</td>
        <td>Mark as read</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#movebatchitems"><strong>moveBatchItems</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/move</td>
        <td>Move or copy to a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#startfileconversion"><strong>startFileConversion</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/checkconversion</td>
        <td>Start file conversion</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#terminatetasks"><strong>terminateTasks</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/fileops/terminate/{id}</td>
        <td>Finish active operations</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#updatefilecomment"><strong>updateFileComment</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/comment</td>
        <td>Update a comment</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#uploadasyncsession"><strong>uploadAsyncSession</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/session/{sessionId}/upload</td>
        <td>Handles the upload of a chunk for an existing upload session.</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#uploadsession"><strong>uploadSession</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/{folderId}/session/{sessionId}</td>
        <td>Resumes an ongoing file upload session for uploading additional chunks of data.</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>QuotaApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesQuotaApi.md#resetroomquota"><strong>resetRoomQuota</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/resetquota</td>
        <td>Reset the room quota limit</td>
      </tr>
      <tr>
        <td><a href="docs/FilesQuotaApi.md#updateroomsquota"><strong>updateRoomsQuota</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/roomquota</td>
        <td>Change the room quota limit</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changeaccesstothirdparty"><strong>changeAccessToThirdparty</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/thirdparty</td>
        <td>Change the third-party settings access</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changeautomaticallycleanup"><strong>changeAutomaticallyCleanUp</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/settings/autocleanup</td>
        <td>Update the trash bin auto-clearing setting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changedefaultaccessrights"><strong>changeDefaultAccessRights</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/settings/dafaultaccessrights</td>
        <td>Change the default access rights</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changedeleteconfirm"><strong>changeDeleteConfirm</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/changedeleteconfrim</td>
        <td>Confirm the file deletion</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changedownloadzipfrombody"><strong>changeDownloadZipFromBody</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/settings/downloadtargz</td>
        <td>Change the archive format (using body parameters)</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#checkdocserviceurl"><strong>checkDocServiceUrl</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/docservice</td>
        <td>Check the document service URL</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#displayfileextension"><strong>displayFileExtension</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/displayfileextension</td>
        <td>Display a file extension</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#displayrecent"><strong>displayRecent</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/displayrecent</td>
        <td>Display the Recent folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#externalshare"><strong>externalShare</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/settings/external</td>
        <td>Change the external sharing ability</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#externalsharesocialmedia"><strong>externalShareSocialMedia</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/settings/externalsocialmedia</td>
        <td>Change the external sharing ability on social networks</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#forcesave"><strong>forcesave</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/forcesave</td>
        <td>Change the forcesaving ability</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getautomaticallycleanup"><strong>getAutomaticallyCleanUp</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/settings/autocleanup</td>
        <td>Get the trash bin auto-clearing setting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getdefaulttemplates"><strong>getDefaultTemplates</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/settings/defaulttemplate</td>
        <td>Get the default template setting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getdocserviceurl"><strong>getDocServiceUrl</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/docservice</td>
        <td>Get the document service URL</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getfilesmodule"><strong>getFilesModule</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/info</td>
        <td>Get the Documents information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getfilessettings"><strong>getFilesSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/settings</td>
        <td>Get file settings</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#hideconfirmcanceloperation"><strong>hideConfirmCancelOperation</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/hideconfirmcanceloperation</td>
        <td>Hide confirmation dialog when canceling operations</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#hideconfirmconvert"><strong>hideConfirmConvert</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/hideconfirmconvert</td>
        <td>Hide the confirmation dialog when converting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#hideconfirmroomlifetime"><strong>hideConfirmRoomLifetime</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/hideconfirmroomlifetime</td>
        <td>Hide confirmation dialog when changing room lifetime settings</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#isavailableprivacyroomsettings"><strong>isAvailablePrivacyRoomSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/@privacy/available</td>
        <td>Check the Private Room availability</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#keepnewfilename"><strong>keepNewFileName</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/keepnewfilename</td>
        <td>Ask a new file name</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#resetdefaulttemplate"><strong>resetDefaultTemplate</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/settings/defaulttemplate</td>
        <td>Reset the default template setting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#setdefaulttemplate"><strong>setDefaultTemplate</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/settings/defaulttemplate</td>
        <td>Change the default template setting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#setopeneditorinsametab"><strong>setOpenEditorInSameTab</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/settings/openeditorinsametab</td>
        <td>Open document in the same browser tab</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#setorganizeroomsgrouping"><strong>setOrganizeRoomsGrouping</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/settings/organizegrouping</td>
        <td>Organize rooms grouping</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#storeforcesave"><strong>storeForcesave</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/storeforcesave</td>
        <td>Change the ability to store the forcesaved files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#storeoriginal"><strong>storeOriginal</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/storeoriginal</td>
        <td>Change the ability to upload original formats</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#updatefileifexist"><strong>updateFileIfExist</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/updateifexist</td>
        <td>Update a file version if it exists</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#uploaddefaulttemplate"><strong>uploadDefaultTemplate</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/settings/defaulttemplate</td>
        <td>Upload a file as the default template setting</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SharingApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#applyexternalsharepassword"><strong>applyExternalSharePassword</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/share/{key}/password</td>
        <td>Apply external data password</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#changefileowner"><strong>changeFileOwner</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/owner</td>
        <td>Change the file owner</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getexternalsharedata"><strong>getExternalShareData</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/share/{key}</td>
        <td>Get the external data</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getfilesecurityinfo"><strong>getFileSecurityInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{id}/share</td>
        <td>Get the shared file information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getfoldersecurityinfo"><strong>getFolderSecurityInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/folder/{id}/share</td>
        <td>Get the shared folder information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getgroupsmemberswithfilesecurity"><strong>getGroupsMembersWithFileSecurity</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/group/{groupId}/share</td>
        <td>Get file group members with security information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getgroupsmemberswithfoldersecurity"><strong>getGroupsMembersWithFolderSecurity</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/folder/{folderId}/group/{groupId}/share</td>
        <td>Get folder group members with security information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getsecurityinfo"><strong>getSecurityInfo</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/share</td>
        <td>Get the sharing rights</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getsharedusers"><strong>getSharedUsers</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/file/{fileId}/sharedusers</td>
        <td>Get user access rights by file ID</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#removesecurityinfo"><strong>removeSecurityInfo</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/share</td>
        <td>Remove the sharing rights</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#sendeditornotify"><strong>sendEditorNotify</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/file/{fileId}/sendeditornotify</td>
        <td>Send the mention message</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#setfilesecurityinfo"><strong>setFileSecurityInfo</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/file/{fileId}/share</td>
        <td>Share a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#setfoldersecurityinfo"><strong>setFolderSecurityInfo</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/folder/{folderId}/share</td>
        <td>Share a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#setsecurityinfo"><strong>setSecurityInfo</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/share</td>
        <td>Set the sharing rights</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ThirdPartyIntegrationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#deletethirdparty"><strong>deleteThirdParty</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/thirdparty/{providerId}</td>
        <td>Remove a third-party account</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getallproviders"><strong>getAllProviders</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/thirdparty/providers</td>
        <td>Get all providers</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getbackupthirdpartyaccount"><strong>getBackupThirdPartyAccount</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/thirdparty/backup</td>
        <td>Get a third-party account backup</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getcapabilities"><strong>getCapabilities</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/thirdparty/capabilities</td>
        <td>Get providers</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getcommonthirdpartyfolders"><strong>getCommonThirdPartyFolders</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/thirdparty/common</td>
        <td>Get the common third-party services</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getthirdpartyaccounts"><strong>getThirdPartyAccounts</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/thirdparty</td>
        <td>Get the third-party accounts</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#savethirdparty"><strong>saveThirdParty</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/thirdparty</td>
        <td>Save a third-party account</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#savethirdpartybackup"><strong>saveThirdPartyBackup</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/thirdparty/backup</td>
        <td>Save a third-party account backup</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Group</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>GroupApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#addgroup"><strong>addGroup</strong></a></td>
        <td><strong>POST</strong> /api/2.0/group</td>
        <td>Add a new group</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#addmembersto"><strong>addMembersTo</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/group/{id}/members</td>
        <td>Add group members</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#deletegroup"><strong>deleteGroup</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/group/{id}</td>
        <td>Delete a group</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#getgroup"><strong>getGroup</strong></a></td>
        <td><strong>GET</strong> /api/2.0/group/{id}</td>
        <td>Get a group</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#getgroupbyuserid"><strong>getGroupByUserId</strong></a></td>
        <td><strong>GET</strong> /api/2.0/group/user/{userid}</td>
        <td>Get user groups</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#getgroups"><strong>getGroups</strong></a></td>
        <td><strong>GET</strong> /api/2.0/group</td>
        <td>Get groups</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#movemembersto"><strong>moveMembersTo</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/group/{fromId}/members/{toId}</td>
        <td>Move group members</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#removemembersfrom"><strong>removeMembersFrom</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/group/{id}/members</td>
        <td>Remove group members</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#setgroupmanager"><strong>setGroupManager</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/group/{id}/manager</td>
        <td>Set a group manager</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#setmembersto"><strong>setMembersTo</strong></a></td>
        <td><strong>POST</strong> /api/2.0/group/{id}/members</td>
        <td>Replace group members</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#updategroup"><strong>updateGroup</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/group/{id}</td>
        <td>Update a group</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SearchApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/GroupSearchApi.md#getgroupswithfilesshared"><strong>getGroupsWithFilesShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/group/file/{id}</td>
        <td>Get groups with file sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/GroupSearchApi.md#getgroupswithfoldersshared"><strong>getGroupsWithFoldersShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/group/folder/{id}</td>
        <td>Get groups with folder sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/GroupSearchApi.md#getgroupswithroomsshared"><strong>getGroupsWithRoomsShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/group/room/{id}</td>
        <td>Get groups with room sharing settings</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Migration</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>MigrationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#cancelmigration"><strong>cancelMigration</strong></a></td>
        <td><strong>POST</strong> /api/2.0/migration/cancel</td>
        <td>Cancel migration</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#clearmigration"><strong>clearMigration</strong></a></td>
        <td><strong>POST</strong> /api/2.0/migration/clear</td>
        <td>Clear migration</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#finishmigration"><strong>finishMigration</strong></a></td>
        <td><strong>POST</strong> /api/2.0/migration/finish</td>
        <td>Finish migration</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#getmigrationlogs"><strong>getMigrationLogs</strong></a></td>
        <td><strong>GET</strong> /api/2.0/migration/logs</td>
        <td>Get migration logs</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#getmigrationstatus"><strong>getMigrationStatus</strong></a></td>
        <td><strong>GET</strong> /api/2.0/migration/status</td>
        <td>Get migration status</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#listmigrations"><strong>listMigrations</strong></a></td>
        <td><strong>GET</strong> /api/2.0/migration/list</td>
        <td>Get migrations</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#startmigration"><strong>startMigration</strong></a></td>
        <td><strong>POST</strong> /api/2.0/migration/migrate</td>
        <td>Start migration</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#uploadandinitializemigration"><strong>uploadAndInitializeMigration</strong></a></td>
        <td><strong>POST</strong> /api/2.0/migration/init/{migratorName}</td>
        <td>Upload and initialize migration</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>OAuth20</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AuthorizationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20AuthorizationApi.md#authorizeoauth"><strong>authorizeOAuth</strong></a></td>
        <td><strong>GET</strong> /oauth2/authorize</td>
        <td>OAuth2 authorization endpoint</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20AuthorizationApi.md#exchangetoken"><strong>exchangeToken</strong></a></td>
        <td><strong>POST</strong> /oauth2/token</td>
        <td>OAuth2 token endpoint</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20AuthorizationApi.md#submitconsent"><strong>submitConsent</strong></a></td>
        <td><strong>POST</strong> /oauth2/authorize</td>
        <td>OAuth2 consent endpoint</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ClientManagementApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#changeactivation"><strong>changeActivation</strong></a></td>
        <td><strong>PATCH</strong> /api/2.0/clients/{clientId}/activation</td>
        <td>Change the client activation status</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#createclient"><strong>createClient</strong></a></td>
        <td><strong>POST</strong> /api/2.0/clients</td>
        <td>Create a new OAuth2 client</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#deleteclient"><strong>deleteClient</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/clients/{clientId}</td>
        <td>Delete an OAuth2 client</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#regeneratesecret"><strong>regenerateSecret</strong></a></td>
        <td><strong>PATCH</strong> /api/2.0/clients/{clientId}/regenerate</td>
        <td>Regenerate the client secret</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#revokeuserclient"><strong>revokeUserClient</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/clients/{clientId}/revoke</td>
        <td>Revoke client consent</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#updateclient"><strong>updateClient</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/clients/{clientId}</td>
        <td>Update an existing OAuth2 client</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ClientQueryingApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getclient"><strong>getClient</strong></a></td>
        <td><strong>GET</strong> /api/2.0/clients/{clientId}</td>
        <td>Get client details</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getclientinfo"><strong>getClientInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/clients/{clientId}/info</td>
        <td>Get detailed client information</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getclients"><strong>getClients</strong></a></td>
        <td><strong>GET</strong> /api/2.0/clients</td>
        <td>Get clients</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getclientsinfo"><strong>getClientsInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/clients/info</td>
        <td>Get detailed information of clients</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getconsents"><strong>getConsents</strong></a></td>
        <td><strong>GET</strong> /api/2.0/clients/consents</td>
        <td>Get user consents</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getpublicclientinfo"><strong>getPublicClientInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/clients/{clientId}/public/info</td>
        <td>Get public client information</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ScopeManagementApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ScopeManagementApi.md#getscopes"><strong>getScopes</strong></a></td>
        <td><strong>GET</strong> /api/2.0/scopes</td>
        <td>Get available OAuth2 scopes</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>People</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>EmailApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleEmailApi.md#changeuseremail"><strong>changeUserEmail</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/{userid}/email</td>
        <td>Change a user email</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleEmailApi.md#sendemailchangeinstructions"><strong>sendEmailChangeInstructions</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/email</td>
        <td>Send instructions to change email</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>GuestsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleGuestsApi.md#approveguestsharelink"><strong>approveGuestShareLink</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/guests/share/approve</td>
        <td>Approve a guest sharing link</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleGuestsApi.md#deleteguests"><strong>deleteGuests</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/people/guests</td>
        <td>Delete guests</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>PasswordApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePasswordApi.md#changeuserpassword"><strong>changeUserPassword</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/{userid}/password</td>
        <td>Change a user password</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePasswordApi.md#senduserpassword"><strong>sendUserPassword</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/password</td>
        <td>Remind a user password</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>PhotosApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#creatememberphotothumbnails"><strong>createMemberPhotoThumbnails</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/{userid}/photo/thumbnails</td>
        <td>Create photo thumbnails</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#deletememberphoto"><strong>deleteMemberPhoto</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/people/{userid}/photo</td>
        <td>Delete a user photo</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#getmemberphoto"><strong>getMemberPhoto</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/{userid}/photo</td>
        <td>Get a user photo</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#updatememberphoto"><strong>updateMemberPhoto</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/{userid}/photo</td>
        <td>Update a user photo</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#uploadmemberphoto"><strong>uploadMemberPhoto</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/{userid}/photo</td>
        <td>Upload a user photo</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ProfilesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#addmember"><strong>addMember</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people</td>
        <td>Add a user</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#checkuserexistsbyemail"><strong>checkUserExistsByEmail</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/exists</td>
        <td>Check if a user exists by email</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#deletemember"><strong>deleteMember</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/people/{userid}</td>
        <td>Delete a user</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#deleteprofile"><strong>deleteProfile</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/people/@self</td>
        <td>Delete my profile</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getallprofiles"><strong>getAllProfiles</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people</td>
        <td>Get profiles</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getclaims"><strong>getClaims</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/tokendiagnostics</td>
        <td>Get user claims</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getprofilebyemail"><strong>getProfileByEmail</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/email</td>
        <td>Get a profile by user email</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getprofilebyuserid"><strong>getProfileByUserId</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/{userid}</td>
        <td>Get a profile by user ID</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getselfprofile"><strong>getSelfProfile</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/@self</td>
        <td>Get my profile</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#inviteusers"><strong>inviteUsers</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/invite</td>
        <td>Invite users</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#removeusers"><strong>removeUsers</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/delete</td>
        <td>Delete users</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#resenduserinvites"><strong>resendUserInvites</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/invite</td>
        <td>Resend activation emails</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#updatemember"><strong>updateMember</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/{userid}</td>
        <td>Update a user</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#updatememberculture"><strong>updateMemberCulture</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/{userid}/culture</td>
        <td>Update a user culture</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>QuotaApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleQuotaApi.md#resetusersquota"><strong>resetUsersQuota</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/resetquota</td>
        <td>Reset a user quota limit</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleQuotaApi.md#updateuserquota"><strong>updateUserQuota</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/userquota</td>
        <td>Change a user quota limit</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SearchApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getaccountsentrieswithfilesshared"><strong>getAccountsEntriesWithFilesShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/accounts/file/{id}/search</td>
        <td>Get account entries with file sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getaccountsentrieswithfoldersshared"><strong>getAccountsEntriesWithFoldersShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/accounts/folder/{id}/search</td>
        <td>Get account entries with folder sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getaccountsentrieswithroomsshared"><strong>getAccountsEntriesWithRoomsShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/accounts/room/{id}/search</td>
        <td>Get account entries</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getsearch"><strong>getSearch</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/@search/{query}</td>
        <td>Search users</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getsimplebyfilter"><strong>getSimpleByFilter</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/simple/filter</td>
        <td>Search users by extended filter</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getuserswithfilesshared"><strong>getUsersWithFilesShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/file/{id}</td>
        <td>Get users with file sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getuserswithfoldersshared"><strong>getUsersWithFoldersShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/folder/{id}</td>
        <td>Get users with folder sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getuserswithroomshared"><strong>getUsersWithRoomShared</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/room/{id}</td>
        <td>Get users with room sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#searchusersbyextendedfilter"><strong>searchUsersByExtendedFilter</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/filter</td>
        <td>Search users with detailed information by extended filter</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#searchusersbyquery"><strong>searchUsersByQuery</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/search</td>
        <td>Search users (using query parameters)</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#searchusersbystatus"><strong>searchUsersByStatus</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/status/{status}/search</td>
        <td>Search users by status filter</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ThemeApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThemeApi.md#changeportaltheme"><strong>changePortalTheme</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/theme</td>
        <td>Change the portal theme</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThemeApi.md#getportaltheme"><strong>getPortalTheme</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/theme</td>
        <td>Get the portal theme</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ThirdPartyAccountsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThirdPartyAccountsApi.md#getthirdpartyauthproviders"><strong>getThirdPartyAuthProviders</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/thirdparty/providers</td>
        <td>Get third-party accounts</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThirdPartyAccountsApi.md#linkthirdpartyaccount"><strong>linkThirdPartyAccount</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/thirdparty/linkaccount</td>
        <td>Link a third-pary account</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThirdPartyAccountsApi.md#signupthirdpartyaccount"><strong>signupThirdPartyAccount</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/thirdparty/signup</td>
        <td>Create a third-pary account</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThirdPartyAccountsApi.md#unlinkthirdpartyaccount"><strong>unlinkThirdPartyAccount</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/people/thirdparty/unlinkaccount</td>
        <td>Unlink a third-pary account</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>UserDataApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#getdeletepersonalfolderprogress"><strong>getDeletePersonalFolderProgress</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/delete/personal/progress</td>
        <td>Get the progress of deleting the personal folder</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#getreassignprogress"><strong>getReassignProgress</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/reassign/progress/{userid}</td>
        <td>Get the reassignment progress</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#getremoveprogress"><strong>getRemoveProgress</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/remove/progress/{userid}</td>
        <td>Get the deletion progress</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#necessaryreassign"><strong>necessaryReassign</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/reassign/necessary</td>
        <td>Check data for reassignment need</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#sendinstructionstodelete"><strong>sendInstructionsToDelete</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/self/delete</td>
        <td>Send the deletion instructions</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#startdeletepersonalfolder"><strong>startDeletePersonalFolder</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/delete/personal/start</td>
        <td>Delete the personal folder</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#startreassign"><strong>startReassign</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/reassign/start</td>
        <td>Start the data reassignment</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#startremove"><strong>startRemove</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/remove/start</td>
        <td>Start the data deletion</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#terminatereassign"><strong>terminateReassign</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/reassign/terminate</td>
        <td>Terminate the data reassignment</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#terminateremove"><strong>terminateRemove</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/remove/terminate</td>
        <td>Terminate the data deletion</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>UserStatusApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserStatusApi.md#getbystatus"><strong>getByStatus</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/status/{status}</td>
        <td>Get profiles by status</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserStatusApi.md#updateuseractivationstatus"><strong>updateUserActivationStatus</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/activationstatus/{activationstatus}</td>
        <td>Set an activation status to the users</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserStatusApi.md#updateuserstatus"><strong>updateUserStatus</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/status/{status}</td>
        <td>Change a user status</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>UserTypeApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserTypeApi.md#getusertypeupdateprogress"><strong>getUserTypeUpdateProgress</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/type/progress/{userid}</td>
        <td>Get the progress of updating user type</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserTypeApi.md#startusertypeupdate"><strong>startUserTypeUpdate</strong></a></td>
        <td><strong>POST</strong> /api/2.0/people/type</td>
        <td>Start updating user type</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserTypeApi.md#terminateusertypeupdate"><strong>terminateUserTypeUpdate</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/type/terminate</td>
        <td>Terminate updating user type</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserTypeApi.md#updateusertype"><strong>updateUserType</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/people/type/{type}</td>
        <td>Change a user type</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Portal</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>GuestsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalGuestsApi.md#getguestsharinglink"><strong>getGuestSharingLink</strong></a></td>
        <td><strong>GET</strong> /api/2.0/people/guests/{userid}/share</td>
        <td>Get a guest sharing link</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>PaymentApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#buywalletservice"><strong>buyWalletService</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/payment/buywalletservice</td>
        <td>Purchases a wallet service with the specified quantity.</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#calculatewalletpayment"><strong>calculateWalletPayment</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/portal/payment/calculatewallet</td>
        <td>Calculate the wallet payment amount</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#changetenantwalletservicestate"><strong>changeTenantWalletServiceState</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/payment/servicestate</td>
        <td>Change tenant wallet service state</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#createcustomeroperationsreport"><strong>createCustomerOperationsReport</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/payment/customer/operationsreport</td>
        <td>Start the customer operations report generation</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getaiprices"><strong>getAiPrices</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/ai-prices</td>
        <td>Get AI model prices</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcheckoutsetupurl"><strong>getCheckoutSetupUrl</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/checkoutsetupurl</td>
        <td>Get the checkout setup page URL</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomerbalance"><strong>getCustomerBalance</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/customer/balance</td>
        <td>Get the customer balance</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomerinfo"><strong>getCustomerInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/customerinfo</td>
        <td>Get the customer information</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomeroperations"><strong>getCustomerOperations</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/customer/operations</td>
        <td>Get the customer operations</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomeroperationsreport"><strong>getCustomerOperationsReport</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/customer/operationsreport</td>
        <td>Get the status of the customer operations report generation</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomerservicequota"><strong>getCustomerServiceQuota</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/customer/servicequota</td>
        <td>Get the service quota</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getpaymentaccount"><strong>getPaymentAccount</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/account</td>
        <td>Get the payment account</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getpaymentcurrencies"><strong>getPaymentCurrencies</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/currencies</td>
        <td>Get currencies</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getpaymentquotas"><strong>getPaymentQuotas</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/quotas</td>
        <td>Get quotas</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getpaymenturl"><strong>getPaymentUrl</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/portal/payment/url</td>
        <td>Get the payment page URL</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getportalprices"><strong>getPortalPrices</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/prices</td>
        <td>Get prices</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getquotapaymentinformation"><strong>getQuotaPaymentInformation</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/quota</td>
        <td>Get quota payment information</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getrestrictedaimodels"><strong>getRestrictedAiModels</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/ai-model/restrictions</td>
        <td>Get restricted AI models</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#gettenantwalletservicesettings"><strong>getTenantWalletServiceSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/servicessettings</td>
        <td>Gets the wallet service settings for the tenant.</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#gettenantwalletsettings"><strong>getTenantWalletSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/topupsettings</td>
        <td>Gets the tenant wallet auto top up settings</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getwalletservice"><strong>getWalletService</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/walletservice</td>
        <td>Get wallet service</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getwalletservices"><strong>getWalletServices</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/payment/walletservices</td>
        <td>Get wallet services</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#sendpaymentrequest"><strong>sendPaymentRequest</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/payment/request</td>
        <td>Send a payment request</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#setrestrictedaimodels"><strong>setRestrictedAiModels</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/portal/payment/ai-model/restrictions</td>
        <td>Set restricted AI models</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#settenantwalletsettings"><strong>setTenantWalletSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/payment/topupsettings</td>
        <td>Set the wallet auto top up settings</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#terminatecustomeroperationsreport"><strong>terminateCustomerOperationsReport</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/portal/payment/customer/operationsreport</td>
        <td>Terminate the customer operations report generation</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#topupdeposit"><strong>topUpDeposit</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/payment/deposit</td>
        <td>Put money on deposit</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#updatepayment"><strong>updatePayment</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/portal/payment/update</td>
        <td>Update the payment quantity</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#updatewalletpayment"><strong>updateWalletPayment</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/portal/payment/updatewallet</td>
        <td>Update the wallet payment quantity</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>QuotaApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalQuotaApi.md#getportalquota"><strong>getPortalQuota</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/quota</td>
        <td>Get a portal quota</td>
      </tr>
      <tr>
        <td><a href="docs/PortalQuotaApi.md#getportaltariff"><strong>getPortalTariff</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/tariff</td>
        <td>Get a portal tariff</td>
      </tr>
      <tr>
        <td><a href="docs/PortalQuotaApi.md#getportalusedspace"><strong>getPortalUsedSpace</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/usedspace</td>
        <td>Get the portal used space</td>
      </tr>
      <tr>
        <td><a href="docs/PortalQuotaApi.md#getrightquota"><strong>getRightQuota</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/quota/right</td>
        <td>Get the recommended quota</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#continueportal"><strong>continuePortal</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/portal/continue</td>
        <td>Restore a portal</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#deleteportal"><strong>deletePortal</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/portal/delete</td>
        <td>Delete a portal</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#getportalinformation"><strong>getPortalInformation</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal</td>
        <td>Get a portal</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#getportalpath"><strong>getPortalPath</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/path</td>
        <td>Get a path to the portal</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#senddeleteinstructions"><strong>sendDeleteInstructions</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/delete</td>
        <td>Send removal instructions</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#sendsuspendinstructions"><strong>sendSuspendInstructions</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/suspend</td>
        <td>Send suspension instructions</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#suspendportal"><strong>suspendPortal</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/portal/suspend</td>
        <td>Deactivate a portal</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>UsersApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#createinvitationlink"><strong>createInvitationLink</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/users/invitationlink</td>
        <td>Create an invitation link</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#deleteinvitationlink"><strong>deleteInvitationLink</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/portal/users/invitationlink</td>
        <td>Deletes an invitation link.</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#getinvitationlink"><strong>getInvitationLink</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/users/invite/{employeeType}</td>
        <td>Get an invitation link</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#getinvitationlinkbyemployeetype"><strong>getInvitationLinkByEmployeeType</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/users/invitationlink/{employeeType}</td>
        <td>Get an invitation link</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#getportaluserscount"><strong>getPortalUsersCount</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/userscount</td>
        <td>Get a number of portal users</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#getuserbyid"><strong>getUserById</strong></a></td>
        <td><strong>GET</strong> /api/2.0/portal/users/{userID}</td>
        <td>Get a user by ID</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#markgiftmessageasread"><strong>markGiftMessageAsRead</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/present/mark</td>
        <td>Mark a gift message as read</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#sendcongratulations"><strong>sendCongratulations</strong></a></td>
        <td><strong>POST</strong> /api/2.0/portal/sendcongratulations</td>
        <td>Send congratulations</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#updateinvitationlink"><strong>updateInvitationLink</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/portal/users/invitationlink</td>
        <td>Update an invitation link</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Rooms</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>RoomsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#addroomtags"><strong>addRoomTags</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}/tags</td>
        <td>Add the room tags</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#archiveroom"><strong>archiveRoom</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}/archive</td>
        <td>Archive a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#changeroomcover"><strong>changeRoomCover</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/rooms/{id}/cover</td>
        <td>Change the room cover</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroom"><strong>createRoom</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/rooms</td>
        <td>Create a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomfromtemplate"><strong>createRoomFromTemplate</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/rooms/fromtemplate</td>
        <td>Create a room from the template</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomlogo"><strong>createRoomLogo</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/rooms/{id}/logo</td>
        <td>Create a room logo</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomtag"><strong>createRoomTag</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/tags</td>
        <td>Create a room tag</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomtemplate"><strong>createRoomTemplate</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/roomtemplate</td>
        <td>Start creating room template</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomthirdparty"><strong>createRoomThirdParty</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/rooms/thirdparty/{id}</td>
        <td>Create a third-party room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#deletecustomtags"><strong>deleteCustomTags</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/tags</td>
        <td>Delete the custom room tags</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#deleteroom"><strong>deleteRoom</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/rooms/{id}</td>
        <td>Remove a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#deleteroomlogo"><strong>deleteRoomLogo</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/rooms/{id}/logo</td>
        <td>Remove a room logo</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#deleteroomtags"><strong>deleteRoomTags</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/rooms/{id}/tags</td>
        <td>Remove the room tags</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getnewroomitems"><strong>getNewRoomItems</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/{id}/news</td>
        <td>Get the new room items</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getpublicsettings"><strong>getPublicSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/roomtemplate/{id}/public</td>
        <td>Get public settings</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomcovers"><strong>getRoomCovers</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/covers</td>
        <td>Get covers</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomcreatingstatus"><strong>getRoomCreatingStatus</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/fromtemplate/status</td>
        <td>Get the room creation progress</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomindexexport"><strong>getRoomIndexExport</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/indexexport</td>
        <td>Get the room index export</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroominfo"><strong>getRoomInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/{id}</td>
        <td>Get room information</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomlinks"><strong>getRoomLinks</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/{id}/links</td>
        <td>Get the room links</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomsecurityinfo"><strong>getRoomSecurityInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/{id}/share</td>
        <td>Get the room access rights</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomtagsinfo"><strong>getRoomTagsInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/tags</td>
        <td>Get the room tags</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomtemplatecreatingstatus"><strong>getRoomTemplateCreatingStatus</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/roomtemplate/status</td>
        <td>Get status of room template creation</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomsfolder"><strong>getRoomsFolder</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms</td>
        <td>Get rooms</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomsnewitems"><strong>getRoomsNewItems</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/news</td>
        <td>Get the room new items</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomsprimaryexternallink"><strong>getRoomsPrimaryExternalLink</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/rooms/{id}/link</td>
        <td>Get the room primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#hastaglinks"><strong>hasTagLinks</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/tags/{tagName}/haslinks</td>
        <td>Has tag links</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#pinroom"><strong>pinRoom</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}/pin</td>
        <td>Pin a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#reorderroom"><strong>reorderRoom</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}/reorder</td>
        <td>Reorder the room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#resendemailinvitations"><strong>resendEmailInvitations</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/rooms/{id}/resend</td>
        <td>Resend the room invitations</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#setpublicsettings"><strong>setPublicSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/roomtemplate/public</td>
        <td>Set public settings</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#setroomlink"><strong>setRoomLink</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}/links</td>
        <td>Set the room external or invitation link</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#setroomsecurity"><strong>setRoomSecurity</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}/share</td>
        <td>Set the room access rights</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#startroomindexexport"><strong>startRoomIndexExport</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/rooms/{id}/indexexport</td>
        <td>Start the room index export</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#terminateroomindexexport"><strong>terminateRoomIndexExport</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/rooms/indexexport</td>
        <td>Terminate the room index export</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#unarchiveroom"><strong>unarchiveRoom</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}/unarchive</td>
        <td>Unarchive a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#unpinroom"><strong>unpinRoom</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}/unpin</td>
        <td>Unpin a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#updateroom"><strong>updateRoom</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/rooms/{id}</td>
        <td>Update a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#updateroomtag"><strong>updateRoomTag</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/tags</td>
        <td>Update tag</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#uploadroomlogo"><strong>uploadRoomLogo</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/logos</td>
        <td>Upload a room logo image</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>GroupsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/RoomsGroupsApi.md#addroomgroup"><strong>addRoomGroup</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/group</td>
        <td>Add a new room group</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsGroupsApi.md#changeroomgroupicon"><strong>changeRoomGroupIcon</strong></a></td>
        <td><strong>POST</strong> /api/2.0/files/group/{id}/icon</td>
        <td>Change group icon</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsGroupsApi.md#deleteroomgroup"><strong>deleteRoomGroup</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/files/group/{id}</td>
        <td>Delete group</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsGroupsApi.md#getroomgroupinfo"><strong>getRoomGroupInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/group/{id}</td>
        <td>Get room group info</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsGroupsApi.md#getroomgroups"><strong>getRoomGroups</strong></a></td>
        <td><strong>GET</strong> /api/2.0/files/group</td>
        <td>List room groups</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsGroupsApi.md#updateroomgroup"><strong>updateRoomGroup</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/files/group/{id}</td>
        <td>Update room group</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Security</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AccessToDevToolsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAccessToDevToolsApi.md#settenantdevtoolsaccesssettings"><strong>setTenantDevToolsAccessSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/devtoolsaccess</td>
        <td>Set the Developer Tools access settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ActiveConnectionsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#getallactiveconnections"><strong>getAllActiveConnections</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/activeconnections</td>
        <td>Get active connections</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#logoutactiveconnection"><strong>logOutActiveConnection</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/security/activeconnections/logout/{loginEventId}</td>
        <td>Log out from the connection</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#logoutallactiveconnectionschangepassword"><strong>logOutAllActiveConnectionsChangePassword</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/security/activeconnections/logoutallchangepassword</td>
        <td>Log out and change password</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#logoutallactiveconnectionsforuser"><strong>logOutAllActiveConnectionsForUser</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/security/activeconnections/logoutall/{userId}</td>
        <td>Log out for the user by ID</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#logoutallexceptthisconnection"><strong>logOutAllExceptThisConnection</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/security/activeconnections/logoutallexceptthis</td>
        <td>Log out from all connections except the current one</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>AuditTrailDataApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#createaudittrailreport"><strong>createAuditTrailReport</strong></a></td>
        <td><strong>POST</strong> /api/2.0/security/audit/events/report</td>
        <td>Generate the audit trail report</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getauditeventsbyfilter"><strong>getAuditEventsByFilter</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/audit/events/filter</td>
        <td>Get filtered audit trail data</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getauditsettings"><strong>getAuditSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/audit/settings/lifetime</td>
        <td>Get the audit trail settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getaudittrailmappers"><strong>getAuditTrailMappers</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/audit/mappers</td>
        <td>Get audit trail mappers</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getaudittrailtypes"><strong>getAuditTrailTypes</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/audit/types</td>
        <td>Get audit trail types</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getlastauditevents"><strong>getLastAuditEvents</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/audit/events/last</td>
        <td>Get audit trail data</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#setauditsettings"><strong>setAuditSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/security/audit/settings/lifetime</td>
        <td>Set the audit trail settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>BannersVisibilityApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityBannersVisibilityApi.md#settenantbannersettings"><strong>setTenantBannerSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/banner</td>
        <td>Set the banners visibility</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>CSPApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityCspApi.md#configurecsp"><strong>configureCsp</strong></a></td>
        <td><strong>POST</strong> /api/2.0/security/csp</td>
        <td>Configure CSP settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityCspApi.md#getcspsettings"><strong>getCspSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/csp</td>
        <td>Get CSP settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>FirebaseApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityFirebaseApi.md#docregisterpusnnotificationdevice"><strong>docRegisterPusnNotificationDevice</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/push/docregisterdevice</td>
        <td>Save the Documents Firebase device token</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityFirebaseApi.md#subscribedocumentspushnotification"><strong>subscribeDocumentsPushNotification</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/push/docsubscribe</td>
        <td>Subscribe to Documents push notification</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>LoginHistoryApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityLoginHistoryApi.md#createloginhistoryreport"><strong>createLoginHistoryReport</strong></a></td>
        <td><strong>POST</strong> /api/2.0/security/audit/login/report</td>
        <td>Generate the login history report</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityLoginHistoryApi.md#getlastloginevents"><strong>getLastLoginEvents</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/audit/login/last</td>
        <td>Get login history</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityLoginHistoryApi.md#getlogineventsbyfilter"><strong>getLoginEventsByFilter</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/audit/login/filter</td>
        <td>Get filtered login events</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>OAuth2Api</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityOAuth2Api.md#generatejwttoken"><strong>generateJwtToken</strong></a></td>
        <td><strong>GET</strong> /api/2.0/security/oauth2/token</td>
        <td>Generate JWT token</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SMTPSettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySmtpSettingsApi.md#getsmtpoperationstatus"><strong>getSmtpOperationStatus</strong></a></td>
        <td><strong>GET</strong> /api/2.0/smtpsettings/smtp/test/status</td>
        <td>Get the SMTP testing process status</td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySmtpSettingsApi.md#getsmtpsettings"><strong>getSmtpSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/smtpsettings/smtp</td>
        <td>Get the SMTP settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySmtpSettingsApi.md#resetsmtpsettings"><strong>resetSmtpSettings</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/smtpsettings/smtp</td>
        <td>Reset the SMTP settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySmtpSettingsApi.md#savesmtpsettings"><strong>saveSmtpSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/smtpsettings/smtp</td>
        <td>Save the SMTP settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySmtpSettingsApi.md#testsmtpsettings"><strong>testSmtpSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/smtpsettings/smtp/test</td>
        <td>Test the SMTP settings</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Settings</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AccessToDevToolsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsAccessToDevToolsApi.md#gettenantaccessdevtoolssettings"><strong>getTenantAccessDevToolsSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/devtoolsaccess</td>
        <td>Get the Developer Tools access settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>AuthorizationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsAuthorizationApi.md#getauthservices"><strong>getAuthServices</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/authservice</td>
        <td>Get the authorization services</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsAuthorizationApi.md#saveauthkeys"><strong>saveAuthKeys</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/authservice</td>
        <td>Save the authorization keys</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsAuthorizationApi.md#testexternaldatabaseconnection"><strong>testExternalDatabaseConnection</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/authservice/externaldb/test</td>
        <td>Test external database connection</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>BannersVisibilityApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsBannersVisibilityApi.md#gettenantbannersettings"><strong>getTenantBannerSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/banner</td>
        <td>Get the banners visibility</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>CommonSettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#closeadminhelper"><strong>closeAdminHelper</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/closeadminhelper</td>
        <td>Close the admin helper</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#completewizard"><strong>completeWizard</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/wizard/complete</td>
        <td>Complete the Wizard settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#configuredeeplink"><strong>configureDeepLink</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/deeplink</td>
        <td>Configure the deep link settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#deleteportalcolortheme"><strong>deletePortalColorTheme</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/colortheme</td>
        <td>Delete a color theme</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getdeeplinksettings"><strong>getDeepLinkSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/deeplink</td>
        <td>Get the deep link settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getpaymentsettings"><strong>getPaymentSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/payment</td>
        <td>Get the payment settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getportalcolortheme"><strong>getPortalColorTheme</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/colortheme</td>
        <td>Get a color theme</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getportalhostname"><strong>getPortalHostname</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/machine</td>
        <td>Get hostname</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getportallogo"><strong>getPortalLogo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/logo</td>
        <td>Get a portal logo</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getportalsettings"><strong>getPortalSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings</td>
        <td>Get the portal settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getsocketsettings"><strong>getSocketSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/socket</td>
        <td>Get the socket settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getsupportedcultures"><strong>getSupportedCultures</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/cultures</td>
        <td>Get supported languages</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#gettenantaiaccesssettings"><strong>getTenantAiAccessSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/ai-access</td>
        <td>Get the AI access settings for the portal</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#gettenantuserinvitationsettings"><strong>getTenantUserInvitationSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/invitationsettings</td>
        <td>Get the user invitation settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#gettimezones"><strong>getTimeZones</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/timezones</td>
        <td>Get time zones</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#savedefaultfolder"><strong>saveDefaultFolder</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/defaultfolder</td>
        <td>Set the default folder</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#savednssettings"><strong>saveDnsSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/dns</td>
        <td>Save the DNS settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#savemaildomainsettings"><strong>saveMailDomainSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/maildomainsettings</td>
        <td>Save the mail domain settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#saveportalcolortheme"><strong>savePortalColorTheme</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/colortheme</td>
        <td>Save a color theme</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#settenantaiaccesssettings"><strong>setTenantAiAccessSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/ai-access</td>
        <td>Set the AI access for the portal</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#updateemailactivationsettings"><strong>updateEmailActivationSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/emailactivation</td>
        <td>Update the email activation settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#updateinvitationsettings"><strong>updateInvitationSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/invitationsettings</td>
        <td>Update user invitation settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>CookiesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCookiesApi.md#getcookiesettings"><strong>getCookieSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/cookiesettings</td>
        <td>Get cookies lifetime</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCookiesApi.md#updatecookiesettings"><strong>updateCookieSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/cookiesettings</td>
        <td>Update cookies lifetime</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>EncryptionApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsEncryptionApi.md#getstorageencryptionprogress"><strong>getStorageEncryptionProgress</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/encryption/progress</td>
        <td>Get the storage encryption progress</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsEncryptionApi.md#getstorageencryptionsettings"><strong>getStorageEncryptionSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/encryption/settings</td>
        <td>Get the storage encryption settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsEncryptionApi.md#startstorageencryption"><strong>startStorageEncryption</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/encryption/start</td>
        <td>Start the storage encryption process</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>GreetingSettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsGreetingSettingsApi.md#getgreetingsettings"><strong>getGreetingSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/greetingsettings</td>
        <td>Get greeting settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsGreetingSettingsApi.md#getisdefaultgreetingsettings"><strong>getIsDefaultGreetingSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/greetingsettings/isdefault</td>
        <td>Check the default greeting settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsGreetingSettingsApi.md#restoregreetingsettings"><strong>restoreGreetingSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/greetingsettings/restore</td>
        <td>Restore the greeting settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsGreetingSettingsApi.md#savegreetingsettings"><strong>saveGreetingSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/greetingsettings</td>
        <td>Save the greeting settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>IPRestrictionsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsIpRestrictionsApi.md#getiprestrictions"><strong>getIpRestrictions</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/iprestrictions</td>
        <td>Get the IP portal restrictions</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsIpRestrictionsApi.md#readiprestrictionssettings"><strong>readIpRestrictionsSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/iprestrictions/settings</td>
        <td>Get the IP restriction settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsIpRestrictionsApi.md#saveiprestrictions"><strong>saveIpRestrictions</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/iprestrictions</td>
        <td>Update the IP restrictions</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsIpRestrictionsApi.md#updateiprestrictionssettings"><strong>updateIpRestrictionsSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/iprestrictions/settings</td>
        <td>Update the IP restriction settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>LicenseApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLicenseApi.md#acceptlicense"><strong>acceptLicense</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/license/accept</td>
        <td>Activate a license</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLicenseApi.md#getislicenserequired"><strong>getIsLicenseRequired</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/license/required</td>
        <td>Request a license</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLicenseApi.md#refreshlicense"><strong>refreshLicense</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/license/refresh</td>
        <td>Refresh the license</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLicenseApi.md#uploadlicense"><strong>uploadLicense</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/license</td>
        <td>Upload a license</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>LoginSettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLoginSettingsApi.md#getloginsettings"><strong>getLoginSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/security/loginsettings</td>
        <td>Get the login settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLoginSettingsApi.md#setdefaultloginsettings"><strong>setDefaultLoginSettings</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/security/loginsettings</td>
        <td>Reset the login settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLoginSettingsApi.md#updateloginsettings"><strong>updateLoginSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/security/loginsettings</td>
        <td>Update the login settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>MessagesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsMessagesApi.md#enableadminmessagesettings"><strong>enableAdminMessageSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/messagesettings</td>
        <td>Enable the administrator message settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsMessagesApi.md#sendadminmail"><strong>sendAdminMail</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/sendadmmail</td>
        <td>Send a message to the administrator</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsMessagesApi.md#sendjoininvitemail"><strong>sendJoinInviteMail</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/sendjoininvite</td>
        <td>Sends an invitation email</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>NotificationsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#getnotificationchannels"><strong>getNotificationChannels</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/notification/channels</td>
        <td>Get notification channels</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#getnotificationsettings"><strong>getNotificationSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/notification/{type}</td>
        <td>Check notification availability</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#getroomsnotificationsettings"><strong>getRoomsNotificationSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/notification/rooms</td>
        <td>Get room notification settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#setnotificationsettings"><strong>setNotificationSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/notification</td>
        <td>Enable notifications</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#setroomsnotificationstatus"><strong>setRoomsNotificationStatus</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/notification/rooms</td>
        <td>Set room notification status</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>OwnerApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsOwnerApi.md#sendownerchangeinstructions"><strong>sendOwnerChangeInstructions</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/owner</td>
        <td>Send the owner change instructions</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsOwnerApi.md#updateportalowner"><strong>updatePortalOwner</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/owner</td>
        <td>Update the portal owner</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>QuotaApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsQuotaApi.md#getuserquotasettings"><strong>getUserQuotaSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/userquotasettings</td>
        <td>Get the user quota settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsQuotaApi.md#saveaiagentquotasettings"><strong>saveAiAgentQuotaSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/aiagentquotasettings</td>
        <td>Save the AI Agent quota settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsQuotaApi.md#saveroomquotasettings"><strong>saveRoomQuotaSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/roomquotasettings</td>
        <td>Save the room quota settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsQuotaApi.md#settenantquotasettings"><strong>setTenantQuotaSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/tenantquotasettings</td>
        <td>Save the tenant quota settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>RebrandingApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#deleteadditionalwhitelabelsettings"><strong>deleteAdditionalWhiteLabelSettings</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/rebranding/additional</td>
        <td>Delete the additional white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#deletecompanywhitelabelsettings"><strong>deleteCompanyWhiteLabelSettings</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/rebranding/company</td>
        <td>Delete the company white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getadditionalwhitelabelsettings"><strong>getAdditionalWhiteLabelSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/rebranding/additional</td>
        <td>Get the additional white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getcompanywhitelabelsettings"><strong>getCompanyWhiteLabelSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/rebranding/company</td>
        <td>Get the company white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getenablewhitelabel"><strong>getEnableWhitelabel</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/enablewhitelabel</td>
        <td>Check the white label availability</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getisdefaultwhitelabellogotext"><strong>getIsDefaultWhiteLabelLogoText</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/whitelabel/logotext/isdefault</td>
        <td>Check the default white label logo text</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getisdefaultwhitelabellogos"><strong>getIsDefaultWhiteLabelLogos</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/whitelabel/logos/isdefault</td>
        <td>Check the default white label logos</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getlicensordata"><strong>getLicensorData</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/companywhitelabel</td>
        <td>Get the licensor data</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getwhitelabellogotext"><strong>getWhiteLabelLogoText</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/whitelabel/logotext</td>
        <td>Get the white label logo text</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getwhitelabellogos"><strong>getWhiteLabelLogos</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/whitelabel/logos</td>
        <td>Get the white label logos</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#restorewhitelabellogotext"><strong>restoreWhiteLabelLogoText</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/whitelabel/logotext/restore</td>
        <td>Restore the white label logo text</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#restorewhitelabellogos"><strong>restoreWhiteLabelLogos</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/whitelabel/logos/restore</td>
        <td>Restore the white label logos</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#saveadditionalwhitelabelsettings"><strong>saveAdditionalWhiteLabelSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/rebranding/additional</td>
        <td>Save the additional white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#savecompanywhitelabelsettings"><strong>saveCompanyWhiteLabelSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/rebranding/company</td>
        <td>Save the company white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#savewhitelabellogotext"><strong>saveWhiteLabelLogoText</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/whitelabel/logotext/save</td>
        <td>Save the white label logo text settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#savewhitelabelsettings"><strong>saveWhiteLabelSettings</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/whitelabel/logos/save</td>
        <td>Save the white label logos</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#savewhitelabelsettingsfromfiles"><strong>saveWhiteLabelSettingsFromFiles</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/whitelabel/logos/savefromfiles</td>
        <td>Save the white label logos from files</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SecurityApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getenabledmodules"><strong>getEnabledModules</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/security/modules</td>
        <td>Get the enabled modules</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getisproductadministrator"><strong>getIsProductAdministrator</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/security/administrator</td>
        <td>Check a product administrator</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getpasswordsettings"><strong>getPasswordSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/security/password</td>
        <td>Get the password settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getproductadministrators"><strong>getProductAdministrators</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/security/administrator/{productid}</td>
        <td>Get the product administrators</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getwebitemsecurityinfo"><strong>getWebItemSecurityInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/security/{id}</td>
        <td>Get the module availability</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getwebitemsettingssecurityinfo"><strong>getWebItemSettingsSecurityInfo</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/security</td>
        <td>Get the security settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#setaccesstowebitems"><strong>setAccessToWebItems</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/security/access</td>
        <td>Set the security settings to modules</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#setproductadministrator"><strong>setProductAdministrator</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/security/administrator</td>
        <td>Set a product administrator</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#setwebitemsecurity"><strong>setWebItemSecurity</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/security</td>
        <td>Set the module security settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#updatepasswordsettings"><strong>updatePasswordSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/security/password</td>
        <td>Set the password settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SSOApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSsoApi.md#getdefaultssosettingsv2"><strong>getDefaultSsoSettingsV2</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/ssov2/default</td>
        <td>Get the default SSO settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSsoApi.md#getssosettingsv2"><strong>getSsoSettingsV2</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/ssov2</td>
        <td>Get the SSO settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSsoApi.md#getssosettingsv2constants"><strong>getSsoSettingsV2Constants</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/ssov2/constants</td>
        <td>Get the SSO settings constants</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSsoApi.md#resetssosettingsv2"><strong>resetSsoSettingsV2</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/ssov2</td>
        <td>Reset the SSO settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSsoApi.md#savessosettingsv2"><strong>saveSsoSettingsV2</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/ssov2</td>
        <td>Save the SSO settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>StatisticsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStatisticsApi.md#getspaceusagestatistics"><strong>getSpaceUsageStatistics</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/statistics/spaceusage/{id}</td>
        <td>Get the space usage statistics</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>StorageApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getallbackupstorages"><strong>getAllBackupStorages</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/storage/backup</td>
        <td>Get the backup storages</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getallcdnstorages"><strong>getAllCdnStorages</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/storage/cdn</td>
        <td>Get the CDN storages</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getallstorages"><strong>getAllStorages</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/storage</td>
        <td>Get storages</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getamazons3regions"><strong>getAmazonS3Regions</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/storage/s3/regions</td>
        <td>Get Amazon regions</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getstorageprogress"><strong>getStorageProgress</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/storage/progress</td>
        <td>Get the storage progress</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#resetcdntodefault"><strong>resetCdnToDefault</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/storage/cdn</td>
        <td>Reset the CDN storage settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#resetstoragetodefault"><strong>resetStorageToDefault</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/storage</td>
        <td>Reset the storage settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#updatecdnstorage"><strong>updateCdnStorage</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/storage/cdn</td>
        <td>Update the CDN storage</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#updatestorage"><strong>updateStorage</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/storage</td>
        <td>Update a storage</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>TelegramApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTelegramApi.md#checktelegram"><strong>checkTelegram</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/telegram/check</td>
        <td>Check the Telegram connection</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTelegramApi.md#linktelegram"><strong>linkTelegram</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/telegram/link</td>
        <td>Get the Telegram link</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTelegramApi.md#unlinktelegram"><strong>unlinkTelegram</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/telegram/link</td>
        <td>Unlink Telegram</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>TFASettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#gettfaappcodes"><strong>getTfaAppCodes</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/tfaappcodes</td>
        <td>Get the TFA codes</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#gettfaconfirmurl"><strong>getTfaConfirmUrl</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/tfaapp/confirm</td>
        <td>Get confirmation email</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#gettfasettings"><strong>getTfaSettings</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/tfaapp</td>
        <td>Get the TFA settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#tfaappgeneratesetupcode"><strong>tfaAppGenerateSetupCode</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/tfaapp/setup</td>
        <td>Generate setup code</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#tfavalidateauthcode"><strong>tfaValidateAuthCode</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/tfaapp/validate</td>
        <td>Validate the TFA code</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#unlinktfaapp"><strong>unlinkTfaApp</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/tfaappnewapp</td>
        <td>Unlink the TFA application</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#updatetfaappcodes"><strong>updateTfaAppCodes</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/tfaappnewcodes</td>
        <td>Update the TFA codes</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#updatetfasettings"><strong>updateTfaSettings</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/tfaapp</td>
        <td>Update the TFA settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTfaSettingsApi.md#updatetfasettingslink"><strong>updateTfaSettingsLink</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/tfaappwithlink</td>
        <td>Get a confirmation email for updating TFA settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>WebhooksApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#createwebhook"><strong>createWebhook</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/webhook</td>
        <td>Create a webhook</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#enablewebhook"><strong>enableWebhook</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/webhook/enable</td>
        <td>Enable a webhook</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#gettenantwebhooks"><strong>getTenantWebhooks</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/webhook</td>
        <td>Get webhooks</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#getwebhooktriggers"><strong>getWebhookTriggers</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/webhook/triggers</td>
        <td>Get webhook triggers</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#getwebhookslogs"><strong>getWebhooksLogs</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/webhooks/log</td>
        <td>Get webhook logs</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#removewebhook"><strong>removeWebhook</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/webhook/{id}</td>
        <td>Remove a webhook</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#retrywebhook"><strong>retryWebhook</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/webhook/{id}/retry</td>
        <td>Retry a webhook</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#retrywebhooks"><strong>retryWebhooks</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/webhook/retry</td>
        <td>Retry webhooks</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#updatewebhook"><strong>updateWebhook</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/webhook</td>
        <td>Update a webhook</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>WebpluginsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#addwebpluginfromfile"><strong>addWebPluginFromFile</strong></a></td>
        <td><strong>POST</strong> /api/2.0/settings/webplugins</td>
        <td>Add a web plugin</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#deletewebplugin"><strong>deleteWebPlugin</strong></a></td>
        <td><strong>DELETE</strong> /api/2.0/settings/webplugins/{name}</td>
        <td>Delete a web plugin</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#getwebplugin"><strong>getWebPlugin</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/webplugins/{name}</td>
        <td>Get a web plugin by name</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#getwebplugins"><strong>getWebPlugins</strong></a></td>
        <td><strong>GET</strong> /api/2.0/settings/webplugins</td>
        <td>Get web plugins</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#updatewebplugin"><strong>updateWebPlugin</strong></a></td>
        <td><strong>PUT</strong> /api/2.0/settings/webplugins/{name}</td>
        <td>Update a web plugin</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>ThirdParty</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>ThirdPartyApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/ThirdPartyApi.md#getthirdpartycode"><strong>getThirdPartyCode</strong></a></td>
        <td><strong>GET</strong> /api/2.0/thirdparty/{provider}</td>
        <td>Get the code request</td>
      </tr>
    </tbody>
  </table>

</details>

## Documentation for Models

<details><summary>Models list</summary>

 - [org.openapitools.client.model.AccountInfoArrayWrapper](docs/AccountInfoArrayWrapper.md)
 - [org.openapitools.client.model.AccountInfoDto](docs/AccountInfoDto.md)
 - [org.openapitools.client.model.AccountLoginType](docs/AccountLoginType.md)
 - [org.openapitools.client.model.AceShortWrapper](docs/AceShortWrapper.md)
 - [org.openapitools.client.model.AceShortWrapperArrayWrapper](docs/AceShortWrapperArrayWrapper.md)
 - [org.openapitools.client.model.ActionConfig](docs/ActionConfig.md)
 - [org.openapitools.client.model.ActionLinkConfig](docs/ActionLinkConfig.md)
 - [org.openapitools.client.model.ActionType](docs/ActionType.md)
 - [org.openapitools.client.model.ActiveConnectionsDto](docs/ActiveConnectionsDto.md)
 - [org.openapitools.client.model.ActiveConnectionsItemDto](docs/ActiveConnectionsItemDto.md)
 - [org.openapitools.client.model.ActiveConnectionsWrapper](docs/ActiveConnectionsWrapper.md)
 - [org.openapitools.client.model.AddMcpServerRequestBody](docs/AddMcpServerRequestBody.md)
 - [org.openapitools.client.model.AddRoomServersRequestBody](docs/AddRoomServersRequestBody.md)
 - [org.openapitools.client.model.AdditionalWhiteLabelSettings](docs/AdditionalWhiteLabelSettings.md)
 - [org.openapitools.client.model.AdditionalWhiteLabelSettingsDto](docs/AdditionalWhiteLabelSettingsDto.md)
 - [org.openapitools.client.model.AdditionalWhiteLabelSettingsWrapper](docs/AdditionalWhiteLabelSettingsWrapper.md)
 - [org.openapitools.client.model.AdminMessageBaseSettingsRequestsDto](docs/AdminMessageBaseSettingsRequestsDto.md)
 - [org.openapitools.client.model.AdminMessageSettingsRequestsDto](docs/AdminMessageSettingsRequestsDto.md)
 - [org.openapitools.client.model.AgentNewItemsDto](docs/AgentNewItemsDto.md)
 - [org.openapitools.client.model.AiChatModelPricing](docs/AiChatModelPricing.md)
 - [org.openapitools.client.model.AiChatPrice](docs/AiChatPrice.md)
 - [org.openapitools.client.model.AiEmbeddingModelPricing](docs/AiEmbeddingModelPricing.md)
 - [org.openapitools.client.model.AiEmbeddingPrice](docs/AiEmbeddingPrice.md)
 - [org.openapitools.client.model.AiPricesResponse](docs/AiPricesResponse.md)
 - [org.openapitools.client.model.AiPricesResponseWrapper](docs/AiPricesResponseWrapper.md)
 - [org.openapitools.client.model.AiProviderArrayWrapper](docs/AiProviderArrayWrapper.md)
 - [org.openapitools.client.model.AiProviderDto](docs/AiProviderDto.md)
 - [org.openapitools.client.model.AiProviderWrapper](docs/AiProviderWrapper.md)
 - [org.openapitools.client.model.AiSettingsDto](docs/AiSettingsDto.md)
 - [org.openapitools.client.model.AiSettingsWrapper](docs/AiSettingsWrapper.md)
 - [org.openapitools.client.model.AiWebSearchPricing](docs/AiWebSearchPricing.md)
 - [org.openapitools.client.model.AnonymousConfigDto](docs/AnonymousConfigDto.md)
 - [org.openapitools.client.model.ApiDateTime](docs/ApiDateTime.md)
 - [org.openapitools.client.model.ApiKeyResponseArrayWrapper](docs/ApiKeyResponseArrayWrapper.md)
 - [org.openapitools.client.model.ApiKeyResponseDto](docs/ApiKeyResponseDto.md)
 - [org.openapitools.client.model.ApiKeyResponseWrapper](docs/ApiKeyResponseWrapper.md)
 - [org.openapitools.client.model.ApplyFilterOption](docs/ApplyFilterOption.md)
 - [org.openapitools.client.model.ArchiveRoomRequest](docs/ArchiveRoomRequest.md)
 - [org.openapitools.client.model.Area](docs/Area.md)
 - [org.openapitools.client.model.ArrayArrayWrapper](docs/ArrayArrayWrapper.md)
 - [org.openapitools.client.model.AuditEventArrayWrapper](docs/AuditEventArrayWrapper.md)
 - [org.openapitools.client.model.AuditEventDto](docs/AuditEventDto.md)
 - [org.openapitools.client.model.AuthData](docs/AuthData.md)
 - [org.openapitools.client.model.AuthKey](docs/AuthKey.md)
 - [org.openapitools.client.model.AuthRequestsDto](docs/AuthRequestsDto.md)
 - [org.openapitools.client.model.AuthServiceRequestsArrayWrapper](docs/AuthServiceRequestsArrayWrapper.md)
 - [org.openapitools.client.model.AuthServiceRequestsDto](docs/AuthServiceRequestsDto.md)
 - [org.openapitools.client.model.AuthWithCodeRequestsDto](docs/AuthWithCodeRequestsDto.md)
 - [org.openapitools.client.model.AuthenticationTokenDto](docs/AuthenticationTokenDto.md)
 - [org.openapitools.client.model.AuthenticationTokenWrapper](docs/AuthenticationTokenWrapper.md)
 - [org.openapitools.client.model.AutoCleanUpData](docs/AutoCleanUpData.md)
 - [org.openapitools.client.model.AutoCleanUpDataWrapper](docs/AutoCleanUpDataWrapper.md)
 - [org.openapitools.client.model.AutoCleanupRequestDto](docs/AutoCleanupRequestDto.md)
 - [org.openapitools.client.model.BackupDto](docs/BackupDto.md)
 - [org.openapitools.client.model.BackupHistoryRecord](docs/BackupHistoryRecord.md)
 - [org.openapitools.client.model.BackupHistoryRecordArrayWrapper](docs/BackupHistoryRecordArrayWrapper.md)
 - [org.openapitools.client.model.BackupPeriod](docs/BackupPeriod.md)
 - [org.openapitools.client.model.BackupProgress](docs/BackupProgress.md)
 - [org.openapitools.client.model.BackupProgressEnum](docs/BackupProgressEnum.md)
 - [org.openapitools.client.model.BackupProgressWrapper](docs/BackupProgressWrapper.md)
 - [org.openapitools.client.model.BackupRestoreDto](docs/BackupRestoreDto.md)
 - [org.openapitools.client.model.BackupScheduleDto](docs/BackupScheduleDto.md)
 - [org.openapitools.client.model.BackupServiceStateDto](docs/BackupServiceStateDto.md)
 - [org.openapitools.client.model.BackupServiceStateWrapper](docs/BackupServiceStateWrapper.md)
 - [org.openapitools.client.model.BackupStorageType](docs/BackupStorageType.md)
 - [org.openapitools.client.model.Balance](docs/Balance.md)
 - [org.openapitools.client.model.BalanceWrapper](docs/BalanceWrapper.md)
 - [org.openapitools.client.model.BaseBatchRequestDto](docs/BaseBatchRequestDto.md)
 - [org.openapitools.client.model.BaseBatchRequestDtoAllOfFileIds](docs/BaseBatchRequestDtoAllOfFileIds.md)
 - [org.openapitools.client.model.BaseBatchRequestDtoAllOfFolderIds](docs/BaseBatchRequestDtoAllOfFolderIds.md)
 - [org.openapitools.client.model.BaseStorageSettingsCdnStorageSettings](docs/BaseStorageSettingsCdnStorageSettings.md)
 - [org.openapitools.client.model.BaseStorageSettingsStorageSettings](docs/BaseStorageSettingsStorageSettings.md)
 - [org.openapitools.client.model.BatchRequestDto](docs/BatchRequestDto.md)
 - [org.openapitools.client.model.BatchRequestDtoAllOfDestFolderId](docs/BatchRequestDtoAllOfDestFolderId.md)
 - [org.openapitools.client.model.BatchRequestDtoAllOfFileIds](docs/BatchRequestDtoAllOfFileIds.md)
 - [org.openapitools.client.model.BatchRequestDtoAllOfFolderIds](docs/BatchRequestDtoAllOfFolderIds.md)
 - [org.openapitools.client.model.BatchTagsRequestDto](docs/BatchTagsRequestDto.md)
 - [org.openapitools.client.model.BooleanWrapper](docs/BooleanWrapper.md)
 - [org.openapitools.client.model.BuyWalletServiceRequestDto](docs/BuyWalletServiceRequestDto.md)
 - [org.openapitools.client.model.CapabilitiesDto](docs/CapabilitiesDto.md)
 - [org.openapitools.client.model.CapabilitiesWrapper](docs/CapabilitiesWrapper.md)
 - [org.openapitools.client.model.CdnStorageSettings](docs/CdnStorageSettings.md)
 - [org.openapitools.client.model.CdnStorageSettingsWrapper](docs/CdnStorageSettingsWrapper.md)
 - [org.openapitools.client.model.ChangeClientActivationRequest](docs/ChangeClientActivationRequest.md)
 - [org.openapitools.client.model.ChangeEmailRequest](docs/ChangeEmailRequest.md)
 - [org.openapitools.client.model.ChangeHistory](docs/ChangeHistory.md)
 - [org.openapitools.client.model.ChangeOwnerRequestDto](docs/ChangeOwnerRequestDto.md)
 - [org.openapitools.client.model.ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [org.openapitools.client.model.ChangeWalletServiceStateRequestDto](docs/ChangeWalletServiceStateRequestDto.md)
 - [org.openapitools.client.model.ChatArrayWrapper](docs/ChatArrayWrapper.md)
 - [org.openapitools.client.model.ChatDto](docs/ChatDto.md)
 - [org.openapitools.client.model.ChatImageMultimodalSettingsDto](docs/ChatImageMultimodalSettingsDto.md)
 - [org.openapitools.client.model.ChatMultimodalSettingsDto](docs/ChatMultimodalSettingsDto.md)
 - [org.openapitools.client.model.ChatReasoningEffort](docs/ChatReasoningEffort.md)
 - [org.openapitools.client.model.ChatSettings](docs/ChatSettings.md)
 - [org.openapitools.client.model.ChatSettingsDto](docs/ChatSettingsDto.md)
 - [org.openapitools.client.model.ChatWrapper](docs/ChatWrapper.md)
 - [org.openapitools.client.model.CheckConversionRequestDtoInteger](docs/CheckConversionRequestDtoInteger.md)
 - [org.openapitools.client.model.CheckDestFolderDto](docs/CheckDestFolderDto.md)
 - [org.openapitools.client.model.CheckDestFolderResult](docs/CheckDestFolderResult.md)
 - [org.openapitools.client.model.CheckDestFolderWrapper](docs/CheckDestFolderWrapper.md)
 - [org.openapitools.client.model.CheckDocServiceUrlRequestDto](docs/CheckDocServiceUrlRequestDto.md)
 - [org.openapitools.client.model.CheckFillFormDraft](docs/CheckFillFormDraft.md)
 - [org.openapitools.client.model.CheckUploadRequest](docs/CheckUploadRequest.md)
 - [org.openapitools.client.model.ChunkedUploadSessionResponseInteger](docs/ChunkedUploadSessionResponseInteger.md)
 - [org.openapitools.client.model.ChunkedUploadSessionResponseIntegerWrapper](docs/ChunkedUploadSessionResponseIntegerWrapper.md)
 - [org.openapitools.client.model.ChunkedUploadSessionResponseWrapperInteger](docs/ChunkedUploadSessionResponseWrapperInteger.md)
 - [org.openapitools.client.model.ChunkedUploadSessionResponseWrapperIntegerWrapper](docs/ChunkedUploadSessionResponseWrapperIntegerWrapper.md)
 - [org.openapitools.client.model.ClientInfoResponse](docs/ClientInfoResponse.md)
 - [org.openapitools.client.model.ClientResponse](docs/ClientResponse.md)
 - [org.openapitools.client.model.ClientSecretResponse](docs/ClientSecretResponse.md)
 - [org.openapitools.client.model.CoEditingConfig](docs/CoEditingConfig.md)
 - [org.openapitools.client.model.CoEditingConfigMode](docs/CoEditingConfigMode.md)
 - [org.openapitools.client.model.CompanyWhiteLabelSettings](docs/CompanyWhiteLabelSettings.md)
 - [org.openapitools.client.model.CompanyWhiteLabelSettingsArrayWrapper](docs/CompanyWhiteLabelSettingsArrayWrapper.md)
 - [org.openapitools.client.model.CompanyWhiteLabelSettingsDto](docs/CompanyWhiteLabelSettingsDto.md)
 - [org.openapitools.client.model.CompanyWhiteLabelSettingsWrapper](docs/CompanyWhiteLabelSettingsWrapper.md)
 - [org.openapitools.client.model.ConfigurationDtoInteger](docs/ConfigurationDtoInteger.md)
 - [org.openapitools.client.model.ConfigurationIntegerWrapper](docs/ConfigurationIntegerWrapper.md)
 - [org.openapitools.client.model.ConfirmData](docs/ConfirmData.md)
 - [org.openapitools.client.model.ConfirmDto](docs/ConfirmDto.md)
 - [org.openapitools.client.model.ConfirmType](docs/ConfirmType.md)
 - [org.openapitools.client.model.ConfirmWrapper](docs/ConfirmWrapper.md)
 - [org.openapitools.client.model.ConnectServerRequestBody](docs/ConnectServerRequestBody.md)
 - [org.openapitools.client.model.ConnectionTestResult](docs/ConnectionTestResult.md)
 - [org.openapitools.client.model.ConnectionTestResultWrapper](docs/ConnectionTestResultWrapper.md)
 - [org.openapitools.client.model.Contact](docs/Contact.md)
 - [org.openapitools.client.model.ContentDisposition](docs/ContentDisposition.md)
 - [org.openapitools.client.model.ContentType](docs/ContentType.md)
 - [org.openapitools.client.model.ContinueChatBody](docs/ContinueChatBody.md)
 - [org.openapitools.client.model.ContinueChatBodyFilesInner](docs/ContinueChatBodyFilesInner.md)
 - [org.openapitools.client.model.ConversationResultArrayWrapper](docs/ConversationResultArrayWrapper.md)
 - [org.openapitools.client.model.ConversationResultDto](docs/ConversationResultDto.md)
 - [org.openapitools.client.model.CookieSettingsDto](docs/CookieSettingsDto.md)
 - [org.openapitools.client.model.CookieSettingsRequestsDto](docs/CookieSettingsRequestsDto.md)
 - [org.openapitools.client.model.CookieSettingsWrapper](docs/CookieSettingsWrapper.md)
 - [org.openapitools.client.model.CopyAsJsonElement](docs/CopyAsJsonElement.md)
 - [org.openapitools.client.model.CopyAsJsonElementDestFolderId](docs/CopyAsJsonElementDestFolderId.md)
 - [org.openapitools.client.model.CoverRequestDto](docs/CoverRequestDto.md)
 - [org.openapitools.client.model.CoversResultArrayWrapper](docs/CoversResultArrayWrapper.md)
 - [org.openapitools.client.model.CoversResultDto](docs/CoversResultDto.md)
 - [org.openapitools.client.model.CreateAgentRequestDto](docs/CreateAgentRequestDto.md)
 - [org.openapitools.client.model.CreateApiKeyRequestDto](docs/CreateApiKeyRequestDto.md)
 - [org.openapitools.client.model.CreateClientRequest](docs/CreateClientRequest.md)
 - [org.openapitools.client.model.CreateFileJsonElement](docs/CreateFileJsonElement.md)
 - [org.openapitools.client.model.CreateFileJsonElementTemplateId](docs/CreateFileJsonElementTemplateId.md)
 - [org.openapitools.client.model.CreateFolder](docs/CreateFolder.md)
 - [org.openapitools.client.model.CreateProviderRequestDto](docs/CreateProviderRequestDto.md)
 - [org.openapitools.client.model.CreateRoomFromTemplateDto](docs/CreateRoomFromTemplateDto.md)
 - [org.openapitools.client.model.CreateRoomRequestDto](docs/CreateRoomRequestDto.md)
 - [org.openapitools.client.model.CreateTagRequestDto](docs/CreateTagRequestDto.md)
 - [org.openapitools.client.model.CreateTextOrHtmlFile](docs/CreateTextOrHtmlFile.md)
 - [org.openapitools.client.model.CreateThirdPartyRoom](docs/CreateThirdPartyRoom.md)
 - [org.openapitools.client.model.CreateWebhooksConfigRequestsDto](docs/CreateWebhooksConfigRequestsDto.md)
 - [org.openapitools.client.model.Cron](docs/Cron.md)
 - [org.openapitools.client.model.CronParams](docs/CronParams.md)
 - [org.openapitools.client.model.CspDto](docs/CspDto.md)
 - [org.openapitools.client.model.CspRequestsDto](docs/CspRequestsDto.md)
 - [org.openapitools.client.model.CspWrapper](docs/CspWrapper.md)
 - [org.openapitools.client.model.Culture](docs/Culture.md)
 - [org.openapitools.client.model.CultureSpecificExternalResource](docs/CultureSpecificExternalResource.md)
 - [org.openapitools.client.model.CultureSpecificExternalResources](docs/CultureSpecificExternalResources.md)
 - [org.openapitools.client.model.CurrenciesArrayWrapper](docs/CurrenciesArrayWrapper.md)
 - [org.openapitools.client.model.CurrenciesDto](docs/CurrenciesDto.md)
 - [org.openapitools.client.model.CurrencyInfo](docs/CurrencyInfo.md)
 - [org.openapitools.client.model.CurrentLicenseInfo](docs/CurrentLicenseInfo.md)
 - [org.openapitools.client.model.CustomColorThemesSettingsColorItem](docs/CustomColorThemesSettingsColorItem.md)
 - [org.openapitools.client.model.CustomColorThemesSettingsDto](docs/CustomColorThemesSettingsDto.md)
 - [org.openapitools.client.model.CustomColorThemesSettingsItem](docs/CustomColorThemesSettingsItem.md)
 - [org.openapitools.client.model.CustomColorThemesSettingsRequestsDto](docs/CustomColorThemesSettingsRequestsDto.md)
 - [org.openapitools.client.model.CustomColorThemesSettingsWrapper](docs/CustomColorThemesSettingsWrapper.md)
 - [org.openapitools.client.model.CustomFilterParameters](docs/CustomFilterParameters.md)
 - [org.openapitools.client.model.CustomerConfigDto](docs/CustomerConfigDto.md)
 - [org.openapitools.client.model.CustomerInfoDto](docs/CustomerInfoDto.md)
 - [org.openapitools.client.model.CustomerInfoWrapper](docs/CustomerInfoWrapper.md)
 - [org.openapitools.client.model.CustomerOperationsReportRequestDto](docs/CustomerOperationsReportRequestDto.md)
 - [org.openapitools.client.model.CustomizationConfigDto](docs/CustomizationConfigDto.md)
 - [org.openapitools.client.model.DarkThemeSettings](docs/DarkThemeSettings.md)
 - [org.openapitools.client.model.DarkThemeSettingsRequestDto](docs/DarkThemeSettingsRequestDto.md)
 - [org.openapitools.client.model.DarkThemeSettingsType](docs/DarkThemeSettingsType.md)
 - [org.openapitools.client.model.DarkThemeSettingsWrapper](docs/DarkThemeSettingsWrapper.md)
 - [org.openapitools.client.model.DateToAutoCleanUp](docs/DateToAutoCleanUp.md)
 - [org.openapitools.client.model.DbTenant](docs/DbTenant.md)
 - [org.openapitools.client.model.DbTenantPartner](docs/DbTenantPartner.md)
 - [org.openapitools.client.model.DeepLinkConfigurationRequestsDto](docs/DeepLinkConfigurationRequestsDto.md)
 - [org.openapitools.client.model.DeepLinkDto](docs/DeepLinkDto.md)
 - [org.openapitools.client.model.DeepLinkHandlingMode](docs/DeepLinkHandlingMode.md)
 - [org.openapitools.client.model.DefaultProductRequestDto](docs/DefaultProductRequestDto.md)
 - [org.openapitools.client.model.DefaultProviderDto](docs/DefaultProviderDto.md)
 - [org.openapitools.client.model.DefaultProviderWrapper](docs/DefaultProviderWrapper.md)
 - [org.openapitools.client.model.DefaultTemplateItemDto](docs/DefaultTemplateItemDto.md)
 - [org.openapitools.client.model.DefaultTemplateSettingsDto](docs/DefaultTemplateSettingsDto.md)
 - [org.openapitools.client.model.DefaultTemplateSettingsRequestDto](docs/DefaultTemplateSettingsRequestDto.md)
 - [org.openapitools.client.model.DefaultTemplateSettingsRequestDtoSelectedFile](docs/DefaultTemplateSettingsRequestDtoSelectedFile.md)
 - [org.openapitools.client.model.DefaultTemplateSettingsResetRequestDto](docs/DefaultTemplateSettingsResetRequestDto.md)
 - [org.openapitools.client.model.DefaultTemplateSettingsWrapper](docs/DefaultTemplateSettingsWrapper.md)
 - [org.openapitools.client.model.Delete](docs/Delete.md)
 - [org.openapitools.client.model.DeleteBatchRequestDto](docs/DeleteBatchRequestDto.md)
 - [org.openapitools.client.model.DeleteBatchRequestDtoAllOfFileIds](docs/DeleteBatchRequestDtoAllOfFileIds.md)
 - [org.openapitools.client.model.DeleteBatchRequestDtoAllOfFolderIds](docs/DeleteBatchRequestDtoAllOfFolderIds.md)
 - [org.openapitools.client.model.DeleteFolder](docs/DeleteFolder.md)
 - [org.openapitools.client.model.DeleteRoomRequest](docs/DeleteRoomRequest.md)
 - [org.openapitools.client.model.DeleteRoomServersRequestBody](docs/DeleteRoomServersRequestBody.md)
 - [org.openapitools.client.model.DeleteServersRequestBody](docs/DeleteServersRequestBody.md)
 - [org.openapitools.client.model.DeleteVersionBatchRequestDto](docs/DeleteVersionBatchRequestDto.md)
 - [org.openapitools.client.model.DisplayRequestDto](docs/DisplayRequestDto.md)
 - [org.openapitools.client.model.DistributedTaskStatus](docs/DistributedTaskStatus.md)
 - [org.openapitools.client.model.DnsSettingsRequestsDto](docs/DnsSettingsRequestsDto.md)
 - [org.openapitools.client.model.DocServiceUrlDto](docs/DocServiceUrlDto.md)
 - [org.openapitools.client.model.DocServiceUrlWrapper](docs/DocServiceUrlWrapper.md)
 - [org.openapitools.client.model.DocumentBuilderTaskDto](docs/DocumentBuilderTaskDto.md)
 - [org.openapitools.client.model.DocumentBuilderTaskWrapper](docs/DocumentBuilderTaskWrapper.md)
 - [org.openapitools.client.model.DocumentConfigDto](docs/DocumentConfigDto.md)
 - [org.openapitools.client.model.DoubleNullableWrapper](docs/DoubleNullableWrapper.md)
 - [org.openapitools.client.model.DoubleWrapper](docs/DoubleWrapper.md)
 - [org.openapitools.client.model.DownloadRequestDto](docs/DownloadRequestDto.md)
 - [org.openapitools.client.model.DownloadRequestDtoAllOfFileIds](docs/DownloadRequestDtoAllOfFileIds.md)
 - [org.openapitools.client.model.DownloadRequestDtoAllOfFolderIds](docs/DownloadRequestDtoAllOfFolderIds.md)
 - [org.openapitools.client.model.DownloadRequestItemDto](docs/DownloadRequestItemDto.md)
 - [org.openapitools.client.model.DownloadRequestItemDtoKey](docs/DownloadRequestItemDtoKey.md)
 - [org.openapitools.client.model.DraftLocationInteger](docs/DraftLocationInteger.md)
 - [org.openapitools.client.model.DuplicateRequestDto](docs/DuplicateRequestDto.md)
 - [org.openapitools.client.model.DuplicateRequestDtoAllOfFileIds](docs/DuplicateRequestDtoAllOfFileIds.md)
 - [org.openapitools.client.model.DuplicateRequestDtoAllOfFolderIds](docs/DuplicateRequestDtoAllOfFolderIds.md)
 - [org.openapitools.client.model.EditHistoryArrayWrapper](docs/EditHistoryArrayWrapper.md)
 - [org.openapitools.client.model.EditHistoryAuthor](docs/EditHistoryAuthor.md)
 - [org.openapitools.client.model.EditHistoryChangesWrapper](docs/EditHistoryChangesWrapper.md)
 - [org.openapitools.client.model.EditHistoryDataDto](docs/EditHistoryDataDto.md)
 - [org.openapitools.client.model.EditHistoryDataWrapper](docs/EditHistoryDataWrapper.md)
 - [org.openapitools.client.model.EditHistoryDto](docs/EditHistoryDto.md)
 - [org.openapitools.client.model.EditHistoryUrl](docs/EditHistoryUrl.md)
 - [org.openapitools.client.model.EditorConfigurationDto](docs/EditorConfigurationDto.md)
 - [org.openapitools.client.model.EditorToolCallStateDto](docs/EditorToolCallStateDto.md)
 - [org.openapitools.client.model.EditorType](docs/EditorType.md)
 - [org.openapitools.client.model.EmailActivationSettings](docs/EmailActivationSettings.md)
 - [org.openapitools.client.model.EmailActivationSettingsWrapper](docs/EmailActivationSettingsWrapper.md)
 - [org.openapitools.client.model.EmailInvitationDto](docs/EmailInvitationDto.md)
 - [org.openapitools.client.model.EmailMemberRequestDto](docs/EmailMemberRequestDto.md)
 - [org.openapitools.client.model.EmailValidationKeyModel](docs/EmailValidationKeyModel.md)
 - [org.openapitools.client.model.EmbeddedConfig](docs/EmbeddedConfig.md)
 - [org.openapitools.client.model.EmbeddingProviderType](docs/EmbeddingProviderType.md)
 - [org.openapitools.client.model.EmployeeActivationStatus](docs/EmployeeActivationStatus.md)
 - [org.openapitools.client.model.EmployeeArrayWrapper](docs/EmployeeArrayWrapper.md)
 - [org.openapitools.client.model.EmployeeDto](docs/EmployeeDto.md)
 - [org.openapitools.client.model.EmployeeFullArrayWrapper](docs/EmployeeFullArrayWrapper.md)
 - [org.openapitools.client.model.EmployeeFullDto](docs/EmployeeFullDto.md)
 - [org.openapitools.client.model.EmployeeFullWrapper](docs/EmployeeFullWrapper.md)
 - [org.openapitools.client.model.EmployeeStatus](docs/EmployeeStatus.md)
 - [org.openapitools.client.model.EmployeeType](docs/EmployeeType.md)
 - [org.openapitools.client.model.EmployeeWrapper](docs/EmployeeWrapper.md)
 - [org.openapitools.client.model.EncryprtionStatus](docs/EncryprtionStatus.md)
 - [org.openapitools.client.model.EncryptionKeysConfig](docs/EncryptionKeysConfig.md)
 - [org.openapitools.client.model.EncryptionSettings](docs/EncryptionSettings.md)
 - [org.openapitools.client.model.EncryptionSettingsWrapper](docs/EncryptionSettingsWrapper.md)
 - [org.openapitools.client.model.EngineType](docs/EngineType.md)
 - [org.openapitools.client.model.EntryType](docs/EntryType.md)
 - [org.openapitools.client.model.ErrorResponse](docs/ErrorResponse.md)
 - [org.openapitools.client.model.ExchangeToken200Response](docs/ExchangeToken200Response.md)
 - [org.openapitools.client.model.ExportChatRequestBodyInteger](docs/ExportChatRequestBodyInteger.md)
 - [org.openapitools.client.model.ExportMessageRequestBodyInteger](docs/ExportMessageRequestBodyInteger.md)
 - [org.openapitools.client.model.ExternalDatabaseSettings](docs/ExternalDatabaseSettings.md)
 - [org.openapitools.client.model.ExternalDatabaseType](docs/ExternalDatabaseType.md)
 - [org.openapitools.client.model.ExternalShareDto](docs/ExternalShareDto.md)
 - [org.openapitools.client.model.ExternalShareRequestParam](docs/ExternalShareRequestParam.md)
 - [org.openapitools.client.model.ExternalShareWrapper](docs/ExternalShareWrapper.md)
 - [org.openapitools.client.model.FeatureUsedDto](docs/FeatureUsedDto.md)
 - [org.openapitools.client.model.FeedbackConfig](docs/FeedbackConfig.md)
 - [org.openapitools.client.model.FileConflictResolveType](docs/FileConflictResolveType.md)
 - [org.openapitools.client.model.FileDtoInteger](docs/FileDtoInteger.md)
 - [org.openapitools.client.model.FileDtoIntegerAllOfViewAccessibility](docs/FileDtoIntegerAllOfViewAccessibility.md)
 - [org.openapitools.client.model.FileEntryBaseArrayWrapper](docs/FileEntryBaseArrayWrapper.md)
 - [org.openapitools.client.model.FileEntryBaseDto](docs/FileEntryBaseDto.md)
 - [org.openapitools.client.model.FileEntryBaseWrapper](docs/FileEntryBaseWrapper.md)
 - [org.openapitools.client.model.FileEntryDtoInteger](docs/FileEntryDtoInteger.md)
 - [org.openapitools.client.model.FileEntryDtoIntegerAllOfAvailableShareRights](docs/FileEntryDtoIntegerAllOfAvailableShareRights.md)
 - [org.openapitools.client.model.FileEntryDtoIntegerAllOfSecurity](docs/FileEntryDtoIntegerAllOfSecurity.md)
 - [org.openapitools.client.model.FileEntryDtoIntegerAllOfShareSettings](docs/FileEntryDtoIntegerAllOfShareSettings.md)
 - [org.openapitools.client.model.FileEntryDtoString](docs/FileEntryDtoString.md)
 - [org.openapitools.client.model.FileEntryIntegerArrayWrapper](docs/FileEntryIntegerArrayWrapper.md)
 - [org.openapitools.client.model.FileEntryType](docs/FileEntryType.md)
 - [org.openapitools.client.model.FileIntegerArrayWrapper](docs/FileIntegerArrayWrapper.md)
 - [org.openapitools.client.model.FileIntegerWrapper](docs/FileIntegerWrapper.md)
 - [org.openapitools.client.model.FileLink](docs/FileLink.md)
 - [org.openapitools.client.model.FileLinkRequest](docs/FileLinkRequest.md)
 - [org.openapitools.client.model.FileLinkWrapper](docs/FileLinkWrapper.md)
 - [org.openapitools.client.model.FileOperationArrayWrapper](docs/FileOperationArrayWrapper.md)
 - [org.openapitools.client.model.FileOperationDto](docs/FileOperationDto.md)
 - [org.openapitools.client.model.FileOperationRequestBaseDto](docs/FileOperationRequestBaseDto.md)
 - [org.openapitools.client.model.FileOperationType](docs/FileOperationType.md)
 - [org.openapitools.client.model.FileOperationWrapper](docs/FileOperationWrapper.md)
 - [org.openapitools.client.model.FileReference](docs/FileReference.md)
 - [org.openapitools.client.model.FileReferenceData](docs/FileReferenceData.md)
 - [org.openapitools.client.model.FileReferenceWrapper](docs/FileReferenceWrapper.md)
 - [org.openapitools.client.model.FileShare](docs/FileShare.md)
 - [org.openapitools.client.model.FileShareArrayWrapper](docs/FileShareArrayWrapper.md)
 - [org.openapitools.client.model.FileShareDto](docs/FileShareDto.md)
 - [org.openapitools.client.model.FileShareLink](docs/FileShareLink.md)
 - [org.openapitools.client.model.FileShareParams](docs/FileShareParams.md)
 - [org.openapitools.client.model.FileShareWrapper](docs/FileShareWrapper.md)
 - [org.openapitools.client.model.FileStatus](docs/FileStatus.md)
 - [org.openapitools.client.model.FileType](docs/FileType.md)
 - [org.openapitools.client.model.FileUploadResultDto](docs/FileUploadResultDto.md)
 - [org.openapitools.client.model.FileUploadResultWrapper](docs/FileUploadResultWrapper.md)
 - [org.openapitools.client.model.FilesSettingsDto](docs/FilesSettingsDto.md)
 - [org.openapitools.client.model.FilesSettingsDtoInternalFormats](docs/FilesSettingsDtoInternalFormats.md)
 - [org.openapitools.client.model.FilesSettingsWrapper](docs/FilesSettingsWrapper.md)
 - [org.openapitools.client.model.FilesStatisticsFolder](docs/FilesStatisticsFolder.md)
 - [org.openapitools.client.model.FilesStatisticsResultDto](docs/FilesStatisticsResultDto.md)
 - [org.openapitools.client.model.FilesStatisticsResultWrapper](docs/FilesStatisticsResultWrapper.md)
 - [org.openapitools.client.model.FillingFormResultDtoInteger](docs/FillingFormResultDtoInteger.md)
 - [org.openapitools.client.model.FillingFormResultIntegerWrapper](docs/FillingFormResultIntegerWrapper.md)
 - [org.openapitools.client.model.FilterType](docs/FilterType.md)
 - [org.openapitools.client.model.FinishDto](docs/FinishDto.md)
 - [org.openapitools.client.model.FireBaseUser](docs/FireBaseUser.md)
 - [org.openapitools.client.model.FireBaseUserWrapper](docs/FireBaseUserWrapper.md)
 - [org.openapitools.client.model.FirebaseDto](docs/FirebaseDto.md)
 - [org.openapitools.client.model.FirebaseRequestsDto](docs/FirebaseRequestsDto.md)
 - [org.openapitools.client.model.FolderContentDtoInteger](docs/FolderContentDtoInteger.md)
 - [org.openapitools.client.model.FolderContentIntegerArrayWrapper](docs/FolderContentIntegerArrayWrapper.md)
 - [org.openapitools.client.model.FolderContentIntegerWrapper](docs/FolderContentIntegerWrapper.md)
 - [org.openapitools.client.model.FolderDtoInteger](docs/FolderDtoInteger.md)
 - [org.openapitools.client.model.FolderDtoString](docs/FolderDtoString.md)
 - [org.openapitools.client.model.FolderIntegerArrayWrapper](docs/FolderIntegerArrayWrapper.md)
 - [org.openapitools.client.model.FolderIntegerWrapper](docs/FolderIntegerWrapper.md)
 - [org.openapitools.client.model.FolderLinkRequest](docs/FolderLinkRequest.md)
 - [org.openapitools.client.model.FolderStringArrayWrapper](docs/FolderStringArrayWrapper.md)
 - [org.openapitools.client.model.FolderStringWrapper](docs/FolderStringWrapper.md)
 - [org.openapitools.client.model.FolderType](docs/FolderType.md)
 - [org.openapitools.client.model.FormFillingManageAction](docs/FormFillingManageAction.md)
 - [org.openapitools.client.model.FormFillingStatus](docs/FormFillingStatus.md)
 - [org.openapitools.client.model.FormGalleryDto](docs/FormGalleryDto.md)
 - [org.openapitools.client.model.FormMetadata](docs/FormMetadata.md)
 - [org.openapitools.client.model.FormResultsDto](docs/FormResultsDto.md)
 - [org.openapitools.client.model.FormRole](docs/FormRole.md)
 - [org.openapitools.client.model.FormRoleArrayWrapper](docs/FormRoleArrayWrapper.md)
 - [org.openapitools.client.model.FormRoleDto](docs/FormRoleDto.md)
 - [org.openapitools.client.model.FormSubmissionsDto](docs/FormSubmissionsDto.md)
 - [org.openapitools.client.model.FormSubmissionsWrapper](docs/FormSubmissionsWrapper.md)
 - [org.openapitools.client.model.FormsItemArrayWrapper](docs/FormsItemArrayWrapper.md)
 - [org.openapitools.client.model.FormsItemData](docs/FormsItemData.md)
 - [org.openapitools.client.model.FormsItemDto](docs/FormsItemDto.md)
 - [org.openapitools.client.model.GetPortalPrices200Response](docs/GetPortalPrices200Response.md)
 - [org.openapitools.client.model.GetPortalPrices200ResponseLinksInner](docs/GetPortalPrices200ResponseLinksInner.md)
 - [org.openapitools.client.model.GetReferenceDataDtoInteger](docs/GetReferenceDataDtoInteger.md)
 - [org.openapitools.client.model.GetWebhookTriggers200Response](docs/GetWebhookTriggers200Response.md)
 - [org.openapitools.client.model.GobackConfig](docs/GobackConfig.md)
 - [org.openapitools.client.model.GreetingSettingsRequestsDto](docs/GreetingSettingsRequestsDto.md)
 - [org.openapitools.client.model.GroupArrayWrapper](docs/GroupArrayWrapper.md)
 - [org.openapitools.client.model.GroupDto](docs/GroupDto.md)
 - [org.openapitools.client.model.GroupMemberSecurityRequestArrayWrapper](docs/GroupMemberSecurityRequestArrayWrapper.md)
 - [org.openapitools.client.model.GroupMemberSecurityRequestDto](docs/GroupMemberSecurityRequestDto.md)
 - [org.openapitools.client.model.GroupRequestDto](docs/GroupRequestDto.md)
 - [org.openapitools.client.model.GroupSummaryArrayWrapper](docs/GroupSummaryArrayWrapper.md)
 - [org.openapitools.client.model.GroupSummaryDto](docs/GroupSummaryDto.md)
 - [org.openapitools.client.model.GroupWrapper](docs/GroupWrapper.md)
 - [org.openapitools.client.model.HideConfirmConvertRequestDto](docs/HideConfirmConvertRequestDto.md)
 - [org.openapitools.client.model.HistoryAction](docs/HistoryAction.md)
 - [org.openapitools.client.model.HistoryArrayWrapper](docs/HistoryArrayWrapper.md)
 - [org.openapitools.client.model.HistoryData](docs/HistoryData.md)
 - [org.openapitools.client.model.HistoryDto](docs/HistoryDto.md)
 - [org.openapitools.client.model.ICompressWrapper](docs/ICompressWrapper.md)
 - [org.openapitools.client.model.IMagickGeometry](docs/IMagickGeometry.md)
 - [org.openapitools.client.model.IPRestriction](docs/IPRestriction.md)
 - [org.openapitools.client.model.IPRestrictionArrayWrapper](docs/IPRestrictionArrayWrapper.md)
 - [org.openapitools.client.model.IPRestrictionsSettings](docs/IPRestrictionsSettings.md)
 - [org.openapitools.client.model.IPRestrictionsSettingsWrapper](docs/IPRestrictionsSettingsWrapper.md)
 - [org.openapitools.client.model.Icon](docs/Icon.md)
 - [org.openapitools.client.model.IconRequest](docs/IconRequest.md)
 - [org.openapitools.client.model.ImportableApiEntity](docs/ImportableApiEntity.md)
 - [org.openapitools.client.model.InfoConfigDto](docs/InfoConfigDto.md)
 - [org.openapitools.client.model.Int32Wrapper](docs/Int32Wrapper.md)
 - [org.openapitools.client.model.Int64Wrapper](docs/Int64Wrapper.md)
 - [org.openapitools.client.model.InvitationLinkCreateRequestDto](docs/InvitationLinkCreateRequestDto.md)
 - [org.openapitools.client.model.InvitationLinkDeleteRequestDto](docs/InvitationLinkDeleteRequestDto.md)
 - [org.openapitools.client.model.InvitationLinkDto](docs/InvitationLinkDto.md)
 - [org.openapitools.client.model.InvitationLinkUpdateRequestDto](docs/InvitationLinkUpdateRequestDto.md)
 - [org.openapitools.client.model.InvitationLinkWrapper](docs/InvitationLinkWrapper.md)
 - [org.openapitools.client.model.InviteUsersRequestDto](docs/InviteUsersRequestDto.md)
 - [org.openapitools.client.model.IpRestrictionBase](docs/IpRestrictionBase.md)
 - [org.openapitools.client.model.IpRestrictionsDto](docs/IpRestrictionsDto.md)
 - [org.openapitools.client.model.IpRestrictionsWrapper](docs/IpRestrictionsWrapper.md)
 - [org.openapitools.client.model.IsDefaultWhiteLabelLogosArrayWrapper](docs/IsDefaultWhiteLabelLogosArrayWrapper.md)
 - [org.openapitools.client.model.IsDefaultWhiteLabelLogosDto](docs/IsDefaultWhiteLabelLogosDto.md)
 - [org.openapitools.client.model.IsDefaultWhiteLabelLogosWrapper](docs/IsDefaultWhiteLabelLogosWrapper.md)
 - [org.openapitools.client.model.ItemKeyValuePairObjectObject](docs/ItemKeyValuePairObjectObject.md)
 - [org.openapitools.client.model.ItemKeyValuePairStringBoolean](docs/ItemKeyValuePairStringBoolean.md)
 - [org.openapitools.client.model.ItemKeyValuePairStringLogoRequestsDto](docs/ItemKeyValuePairStringLogoRequestsDto.md)
 - [org.openapitools.client.model.ItemKeyValuePairStringString](docs/ItemKeyValuePairStringString.md)
 - [org.openapitools.client.model.KeyValuePairBooleanString](docs/KeyValuePairBooleanString.md)
 - [org.openapitools.client.model.KeyValuePairBooleanStringWrapper](docs/KeyValuePairBooleanStringWrapper.md)
 - [org.openapitools.client.model.LinkAccountRequestDto](docs/LinkAccountRequestDto.md)
 - [org.openapitools.client.model.LinkType](docs/LinkType.md)
 - [org.openapitools.client.model.Location](docs/Location.md)
 - [org.openapitools.client.model.LocationType](docs/LocationType.md)
 - [org.openapitools.client.model.LockFileParameters](docs/LockFileParameters.md)
 - [org.openapitools.client.model.LoginEventArrayWrapper](docs/LoginEventArrayWrapper.md)
 - [org.openapitools.client.model.LoginEventDto](docs/LoginEventDto.md)
 - [org.openapitools.client.model.LoginProvider](docs/LoginProvider.md)
 - [org.openapitools.client.model.LoginSettingsDto](docs/LoginSettingsDto.md)
 - [org.openapitools.client.model.LoginSettingsRequestDto](docs/LoginSettingsRequestDto.md)
 - [org.openapitools.client.model.LoginSettingsWrapper](docs/LoginSettingsWrapper.md)
 - [org.openapitools.client.model.Logo](docs/Logo.md)
 - [org.openapitools.client.model.LogoConfigDto](docs/LogoConfigDto.md)
 - [org.openapitools.client.model.LogoCover](docs/LogoCover.md)
 - [org.openapitools.client.model.LogoRequest](docs/LogoRequest.md)
 - [org.openapitools.client.model.LogoRequestsDto](docs/LogoRequestsDto.md)
 - [org.openapitools.client.model.MailDomainSettingsRequestsDto](docs/MailDomainSettingsRequestsDto.md)
 - [org.openapitools.client.model.ManageFormFillingDtoInteger](docs/ManageFormFillingDtoInteger.md)
 - [org.openapitools.client.model.McpServerArrayWrapper](docs/McpServerArrayWrapper.md)
 - [org.openapitools.client.model.McpServerDto](docs/McpServerDto.md)
 - [org.openapitools.client.model.McpServerShortArrayWrapper](docs/McpServerShortArrayWrapper.md)
 - [org.openapitools.client.model.McpServerShortDto](docs/McpServerShortDto.md)
 - [org.openapitools.client.model.McpServerShortWrapper](docs/McpServerShortWrapper.md)
 - [org.openapitools.client.model.McpServerStatusArrayWrapper](docs/McpServerStatusArrayWrapper.md)
 - [org.openapitools.client.model.McpServerStatusDto](docs/McpServerStatusDto.md)
 - [org.openapitools.client.model.McpServerStatusWrapper](docs/McpServerStatusWrapper.md)
 - [org.openapitools.client.model.McpServerWrapper](docs/McpServerWrapper.md)
 - [org.openapitools.client.model.McpToolArrayWrapper](docs/McpToolArrayWrapper.md)
 - [org.openapitools.client.model.McpToolDto](docs/McpToolDto.md)
 - [org.openapitools.client.model.MemberRequestDto](docs/MemberRequestDto.md)
 - [org.openapitools.client.model.MembersRequest](docs/MembersRequest.md)
 - [org.openapitools.client.model.MentionMessageWrapper](docs/MentionMessageWrapper.md)
 - [org.openapitools.client.model.MentionWrapper](docs/MentionWrapper.md)
 - [org.openapitools.client.model.MentionWrapperArrayWrapper](docs/MentionWrapperArrayWrapper.md)
 - [org.openapitools.client.model.MessageAction](docs/MessageAction.md)
 - [org.openapitools.client.model.MessageArrayWrapper](docs/MessageArrayWrapper.md)
 - [org.openapitools.client.model.MessageContentDto](docs/MessageContentDto.md)
 - [org.openapitools.client.model.MessageContentType](docs/MessageContentType.md)
 - [org.openapitools.client.model.MessageDto](docs/MessageDto.md)
 - [org.openapitools.client.model.MigratingApiFiles](docs/MigratingApiFiles.md)
 - [org.openapitools.client.model.MigratingApiGroup](docs/MigratingApiGroup.md)
 - [org.openapitools.client.model.MigratingApiUser](docs/MigratingApiUser.md)
 - [org.openapitools.client.model.MigrationApiInfo](docs/MigrationApiInfo.md)
 - [org.openapitools.client.model.MigrationStatusDto](docs/MigrationStatusDto.md)
 - [org.openapitools.client.model.MigrationStatusWrapper](docs/MigrationStatusWrapper.md)
 - [org.openapitools.client.model.MobilePhoneActivationStatus](docs/MobilePhoneActivationStatus.md)
 - [org.openapitools.client.model.MobileRequestsDto](docs/MobileRequestsDto.md)
 - [org.openapitools.client.model.ModelArrayWrapper](docs/ModelArrayWrapper.md)
 - [org.openapitools.client.model.ModelDto](docs/ModelDto.md)
 - [org.openapitools.client.model.Module](docs/Module.md)
 - [org.openapitools.client.model.ModuleWrapper](docs/ModuleWrapper.md)
 - [org.openapitools.client.model.MultiSizeLogoCover](docs/MultiSizeLogoCover.md)
 - [org.openapitools.client.model.NewItemsAgentNewItemsArrayWrapper](docs/NewItemsAgentNewItemsArrayWrapper.md)
 - [org.openapitools.client.model.NewItemsDtoAgentNewItemsDto](docs/NewItemsDtoAgentNewItemsDto.md)
 - [org.openapitools.client.model.NewItemsDtoFileEntryBaseDto](docs/NewItemsDtoFileEntryBaseDto.md)
 - [org.openapitools.client.model.NewItemsDtoRoomNewItemsDto](docs/NewItemsDtoRoomNewItemsDto.md)
 - [org.openapitools.client.model.NewItemsFileEntryBaseArrayWrapper](docs/NewItemsFileEntryBaseArrayWrapper.md)
 - [org.openapitools.client.model.NewItemsRoomNewItemsArrayWrapper](docs/NewItemsRoomNewItemsArrayWrapper.md)
 - [org.openapitools.client.model.NoContentResult](docs/NoContentResult.md)
 - [org.openapitools.client.model.NoContentResultWrapper](docs/NoContentResultWrapper.md)
 - [org.openapitools.client.model.NotificationChannelDto](docs/NotificationChannelDto.md)
 - [org.openapitools.client.model.NotificationChannelStatusDto](docs/NotificationChannelStatusDto.md)
 - [org.openapitools.client.model.NotificationChannelStatusWrapper](docs/NotificationChannelStatusWrapper.md)
 - [org.openapitools.client.model.NotificationSettingsDto](docs/NotificationSettingsDto.md)
 - [org.openapitools.client.model.NotificationSettingsRequestsDto](docs/NotificationSettingsRequestsDto.md)
 - [org.openapitools.client.model.NotificationSettingsWrapper](docs/NotificationSettingsWrapper.md)
 - [org.openapitools.client.model.NotificationType](docs/NotificationType.md)
 - [org.openapitools.client.model.OAuth20Token](docs/OAuth20Token.md)
 - [org.openapitools.client.model.ObjectArrayWrapper](docs/ObjectArrayWrapper.md)
 - [org.openapitools.client.model.ObjectWrapper](docs/ObjectWrapper.md)
 - [org.openapitools.client.model.OperationDto](docs/OperationDto.md)
 - [org.openapitools.client.model.OperationOrderType](docs/OperationOrderType.md)
 - [org.openapitools.client.model.OperationStatus](docs/OperationStatus.md)
 - [org.openapitools.client.model.OperationType](docs/OperationType.md)
 - [org.openapitools.client.model.Options](docs/Options.md)
 - [org.openapitools.client.model.OrderBy](docs/OrderBy.md)
 - [org.openapitools.client.model.OrderRequestDto](docs/OrderRequestDto.md)
 - [org.openapitools.client.model.OrdersItemRequestDtoInteger](docs/OrdersItemRequestDtoInteger.md)
 - [org.openapitools.client.model.OrdersRequestDtoInteger](docs/OrdersRequestDtoInteger.md)
 - [org.openapitools.client.model.OwnerChangeInstructionsDto](docs/OwnerChangeInstructionsDto.md)
 - [org.openapitools.client.model.OwnerChangeInstructionsWrapper](docs/OwnerChangeInstructionsWrapper.md)
 - [org.openapitools.client.model.OwnerIdSettingsRequestDto](docs/OwnerIdSettingsRequestDto.md)
 - [org.openapitools.client.model.PageableModificationResponse](docs/PageableModificationResponse.md)
 - [org.openapitools.client.model.PageableResponse](docs/PageableResponse.md)
 - [org.openapitools.client.model.PageableResponseClientInfoResponse](docs/PageableResponseClientInfoResponse.md)
 - [org.openapitools.client.model.Paragraph](docs/Paragraph.md)
 - [org.openapitools.client.model.PasswordHasher](docs/PasswordHasher.md)
 - [org.openapitools.client.model.PasswordSettingsDto](docs/PasswordSettingsDto.md)
 - [org.openapitools.client.model.PasswordSettingsRequestsDto](docs/PasswordSettingsRequestsDto.md)
 - [org.openapitools.client.model.PasswordSettingsWrapper](docs/PasswordSettingsWrapper.md)
 - [org.openapitools.client.model.PaymentCalculation](docs/PaymentCalculation.md)
 - [org.openapitools.client.model.PaymentCalculationWrapper](docs/PaymentCalculationWrapper.md)
 - [org.openapitools.client.model.PaymentMethodStatus](docs/PaymentMethodStatus.md)
 - [org.openapitools.client.model.PaymentSettingsDto](docs/PaymentSettingsDto.md)
 - [org.openapitools.client.model.PaymentSettingsWrapper](docs/PaymentSettingsWrapper.md)
 - [org.openapitools.client.model.PaymentUrlRequestDto](docs/PaymentUrlRequestDto.md)
 - [org.openapitools.client.model.Payments](docs/Payments.md)
 - [org.openapitools.client.model.PermissionsConfig](docs/PermissionsConfig.md)
 - [org.openapitools.client.model.PluginsConfig](docs/PluginsConfig.md)
 - [org.openapitools.client.model.PluginsDto](docs/PluginsDto.md)
 - [org.openapitools.client.model.PriceDto](docs/PriceDto.md)
 - [org.openapitools.client.model.ProductAdministratorDto](docs/ProductAdministratorDto.md)
 - [org.openapitools.client.model.ProductAdministratorWrapper](docs/ProductAdministratorWrapper.md)
 - [org.openapitools.client.model.ProductQuantityType](docs/ProductQuantityType.md)
 - [org.openapitools.client.model.ProductType](docs/ProductType.md)
 - [org.openapitools.client.model.ProviderArrayWrapper](docs/ProviderArrayWrapper.md)
 - [org.openapitools.client.model.ProviderDto](docs/ProviderDto.md)
 - [org.openapitools.client.model.ProviderFilter](docs/ProviderFilter.md)
 - [org.openapitools.client.model.ProviderSettingsArrayWrapper](docs/ProviderSettingsArrayWrapper.md)
 - [org.openapitools.client.model.ProviderSettingsDto](docs/ProviderSettingsDto.md)
 - [org.openapitools.client.model.ProviderType](docs/ProviderType.md)
 - [org.openapitools.client.model.QuantityRequestDto](docs/QuantityRequestDto.md)
 - [org.openapitools.client.model.Quota](docs/Quota.md)
 - [org.openapitools.client.model.QuotaArrayWrapper](docs/QuotaArrayWrapper.md)
 - [org.openapitools.client.model.QuotaDto](docs/QuotaDto.md)
 - [org.openapitools.client.model.QuotaFilter](docs/QuotaFilter.md)
 - [org.openapitools.client.model.QuotaScope](docs/QuotaScope.md)
 - [org.openapitools.client.model.QuotaSettingsRequestsDto](docs/QuotaSettingsRequestsDto.md)
 - [org.openapitools.client.model.QuotaSettingsRequestsDtoDefaultQuota](docs/QuotaSettingsRequestsDtoDefaultQuota.md)
 - [org.openapitools.client.model.QuotaState](docs/QuotaState.md)
 - [org.openapitools.client.model.QuotaWrapper](docs/QuotaWrapper.md)
 - [org.openapitools.client.model.RecaptchaType](docs/RecaptchaType.md)
 - [org.openapitools.client.model.RecentConfig](docs/RecentConfig.md)
 - [org.openapitools.client.model.RegStatus](docs/RegStatus.md)
 - [org.openapitools.client.model.RemoveProviderRequestDto](docs/RemoveProviderRequestDto.md)
 - [org.openapitools.client.model.RenameChatBody](docs/RenameChatBody.md)
 - [org.openapitools.client.model.ReportDto](docs/ReportDto.md)
 - [org.openapitools.client.model.ReportWrapper](docs/ReportWrapper.md)
 - [org.openapitools.client.model.RestrictedModelsResponse](docs/RestrictedModelsResponse.md)
 - [org.openapitools.client.model.RestrictedModelsResponseWrapper](docs/RestrictedModelsResponseWrapper.md)
 - [org.openapitools.client.model.ReviewConfig](docs/ReviewConfig.md)
 - [org.openapitools.client.model.Role](docs/Role.md)
 - [org.openapitools.client.model.RoomDataLifetimeDto](docs/RoomDataLifetimeDto.md)
 - [org.openapitools.client.model.RoomDataLifetimePeriod](docs/RoomDataLifetimePeriod.md)
 - [org.openapitools.client.model.RoomFromTemplateStatusDto](docs/RoomFromTemplateStatusDto.md)
 - [org.openapitools.client.model.RoomFromTemplateStatusWrapper](docs/RoomFromTemplateStatusWrapper.md)
 - [org.openapitools.client.model.RoomGroupArrayWrapper](docs/RoomGroupArrayWrapper.md)
 - [org.openapitools.client.model.RoomGroupDto](docs/RoomGroupDto.md)
 - [org.openapitools.client.model.RoomGroupRequestDto](docs/RoomGroupRequestDto.md)
 - [org.openapitools.client.model.RoomGroupWrapper](docs/RoomGroupWrapper.md)
 - [org.openapitools.client.model.RoomInvitation](docs/RoomInvitation.md)
 - [org.openapitools.client.model.RoomInvitationRequest](docs/RoomInvitationRequest.md)
 - [org.openapitools.client.model.RoomLinkRequest](docs/RoomLinkRequest.md)
 - [org.openapitools.client.model.RoomNewItemsDto](docs/RoomNewItemsDto.md)
 - [org.openapitools.client.model.RoomSecurityDto](docs/RoomSecurityDto.md)
 - [org.openapitools.client.model.RoomSecurityError](docs/RoomSecurityError.md)
 - [org.openapitools.client.model.RoomSecurityWrapper](docs/RoomSecurityWrapper.md)
 - [org.openapitools.client.model.RoomTemplateDto](docs/RoomTemplateDto.md)
 - [org.openapitools.client.model.RoomTemplateStatusDto](docs/RoomTemplateStatusDto.md)
 - [org.openapitools.client.model.RoomTemplateStatusWrapper](docs/RoomTemplateStatusWrapper.md)
 - [org.openapitools.client.model.RoomType](docs/RoomType.md)
 - [org.openapitools.client.model.RoomsNotificationSettingsDto](docs/RoomsNotificationSettingsDto.md)
 - [org.openapitools.client.model.RoomsNotificationSettingsWrapper](docs/RoomsNotificationSettingsWrapper.md)
 - [org.openapitools.client.model.RoomsNotificationsSettingsRequestDto](docs/RoomsNotificationsSettingsRequestDto.md)
 - [org.openapitools.client.model.Run](docs/Run.md)
 - [org.openapitools.client.model.STRINGArrayWrapper](docs/STRINGArrayWrapper.md)
 - [org.openapitools.client.model.SalesRequestsDto](docs/SalesRequestsDto.md)
 - [org.openapitools.client.model.SaveAsPdfInteger](docs/SaveAsPdfInteger.md)
 - [org.openapitools.client.model.SaveFormRoleMappingDtoInteger](docs/SaveFormRoleMappingDtoInteger.md)
 - [org.openapitools.client.model.ScheduleDto](docs/ScheduleDto.md)
 - [org.openapitools.client.model.ScheduleWrapper](docs/ScheduleWrapper.md)
 - [org.openapitools.client.model.ScopeResponse](docs/ScopeResponse.md)
 - [org.openapitools.client.model.SearchArea](docs/SearchArea.md)
 - [org.openapitools.client.model.SecurityArrayWrapper](docs/SecurityArrayWrapper.md)
 - [org.openapitools.client.model.SecurityDto](docs/SecurityDto.md)
 - [org.openapitools.client.model.SecurityInfoRequestDto](docs/SecurityInfoRequestDto.md)
 - [org.openapitools.client.model.SecurityInfoSimpleRequestDto](docs/SecurityInfoSimpleRequestDto.md)
 - [org.openapitools.client.model.SecurityRequestsDto](docs/SecurityRequestsDto.md)
 - [org.openapitools.client.model.ServerType](docs/ServerType.md)
 - [org.openapitools.client.model.ServicePayment](docs/ServicePayment.md)
 - [org.openapitools.client.model.ServicePaymentWrapper](docs/ServicePaymentWrapper.md)
 - [org.openapitools.client.model.SessionRequest](docs/SessionRequest.md)
 - [org.openapitools.client.model.SetDefaultProviderRequestDto](docs/SetDefaultProviderRequestDto.md)
 - [org.openapitools.client.model.SetEmbeddingConfigRequestBody](docs/SetEmbeddingConfigRequestBody.md)
 - [org.openapitools.client.model.SetManagerRequest](docs/SetManagerRequest.md)
 - [org.openapitools.client.model.SetMcpToolsRequestBody](docs/SetMcpToolsRequestBody.md)
 - [org.openapitools.client.model.SetPublicDto](docs/SetPublicDto.md)
 - [org.openapitools.client.model.SetRestrictedAiModelsRequestDto](docs/SetRestrictedAiModelsRequestDto.md)
 - [org.openapitools.client.model.SetServerStatusRequestBody](docs/SetServerStatusRequestBody.md)
 - [org.openapitools.client.model.SetUserChatSettingsRequestBody](docs/SetUserChatSettingsRequestBody.md)
 - [org.openapitools.client.model.SetWebSearchSettingsRequestBody](docs/SetWebSearchSettingsRequestBody.md)
 - [org.openapitools.client.model.SettingsDto](docs/SettingsDto.md)
 - [org.openapitools.client.model.SettingsRequestDto](docs/SettingsRequestDto.md)
 - [org.openapitools.client.model.SettingsWrapper](docs/SettingsWrapper.md)
 - [org.openapitools.client.model.SetupCode](docs/SetupCode.md)
 - [org.openapitools.client.model.SetupCodeWrapper](docs/SetupCodeWrapper.md)
 - [org.openapitools.client.model.SexEnum](docs/SexEnum.md)
 - [org.openapitools.client.model.ShareFilterType](docs/ShareFilterType.md)
 - [org.openapitools.client.model.SignupAccountRequestDto](docs/SignupAccountRequestDto.md)
 - [org.openapitools.client.model.Size](docs/Size.md)
 - [org.openapitools.client.model.SmtpOperationStatusRequestsDto](docs/SmtpOperationStatusRequestsDto.md)
 - [org.openapitools.client.model.SmtpOperationStatusRequestsWrapper](docs/SmtpOperationStatusRequestsWrapper.md)
 - [org.openapitools.client.model.SmtpSettingsDto](docs/SmtpSettingsDto.md)
 - [org.openapitools.client.model.SmtpSettingsWrapper](docs/SmtpSettingsWrapper.md)
 - [org.openapitools.client.model.SortOrder](docs/SortOrder.md)
 - [org.openapitools.client.model.SortedByType](docs/SortedByType.md)
 - [org.openapitools.client.model.SsoCertificate](docs/SsoCertificate.md)
 - [org.openapitools.client.model.SsoFieldMapping](docs/SsoFieldMapping.md)
 - [org.openapitools.client.model.SsoIdpCertificateAdvanced](docs/SsoIdpCertificateAdvanced.md)
 - [org.openapitools.client.model.SsoIdpSettings](docs/SsoIdpSettings.md)
 - [org.openapitools.client.model.SsoSettingsRequestsDto](docs/SsoSettingsRequestsDto.md)
 - [org.openapitools.client.model.SsoSettingsV2](docs/SsoSettingsV2.md)
 - [org.openapitools.client.model.SsoSettingsV2Wrapper](docs/SsoSettingsV2Wrapper.md)
 - [org.openapitools.client.model.SsoSpCertificateAdvanced](docs/SsoSpCertificateAdvanced.md)
 - [org.openapitools.client.model.StartEdit](docs/StartEdit.md)
 - [org.openapitools.client.model.StartFillingForm](docs/StartFillingForm.md)
 - [org.openapitools.client.model.StartFillingMode](docs/StartFillingMode.md)
 - [org.openapitools.client.model.StartNewChatBody](docs/StartNewChatBody.md)
 - [org.openapitools.client.model.StartReassignRequestDto](docs/StartReassignRequestDto.md)
 - [org.openapitools.client.model.StartUpdateUserTypeDto](docs/StartUpdateUserTypeDto.md)
 - [org.openapitools.client.model.Status](docs/Status.md)
 - [org.openapitools.client.model.StatusCodeResult](docs/StatusCodeResult.md)
 - [org.openapitools.client.model.StorageArrayWrapper](docs/StorageArrayWrapper.md)
 - [org.openapitools.client.model.StorageDto](docs/StorageDto.md)
 - [org.openapitools.client.model.StorageEncryptionRequestsDto](docs/StorageEncryptionRequestsDto.md)
 - [org.openapitools.client.model.StorageFilter](docs/StorageFilter.md)
 - [org.openapitools.client.model.StorageRequestsDto](docs/StorageRequestsDto.md)
 - [org.openapitools.client.model.StorageSettings](docs/StorageSettings.md)
 - [org.openapitools.client.model.StorageSettingsWrapper](docs/StorageSettingsWrapper.md)
 - [org.openapitools.client.model.StringWrapper](docs/StringWrapper.md)
 - [org.openapitools.client.model.StudioDefaultPageSettings](docs/StudioDefaultPageSettings.md)
 - [org.openapitools.client.model.StudioDefaultPageSettingsWrapper](docs/StudioDefaultPageSettingsWrapper.md)
 - [org.openapitools.client.model.SubAccount](docs/SubAccount.md)
 - [org.openapitools.client.model.SubjectFilter](docs/SubjectFilter.md)
 - [org.openapitools.client.model.SubjectType](docs/SubjectType.md)
 - [org.openapitools.client.model.SubmitForm](docs/SubmitForm.md)
 - [org.openapitools.client.model.Tariff](docs/Tariff.md)
 - [org.openapitools.client.model.TariffState](docs/TariffState.md)
 - [org.openapitools.client.model.TariffWrapper](docs/TariffWrapper.md)
 - [org.openapitools.client.model.TaskProgressResponseDto](docs/TaskProgressResponseDto.md)
 - [org.openapitools.client.model.TaskProgressResponseWrapper](docs/TaskProgressResponseWrapper.md)
 - [org.openapitools.client.model.TelegramStatusDto](docs/TelegramStatusDto.md)
 - [org.openapitools.client.model.TelegramStatusWrapper](docs/TelegramStatusWrapper.md)
 - [org.openapitools.client.model.TemplatesConfig](docs/TemplatesConfig.md)
 - [org.openapitools.client.model.TemplatesRequestDto](docs/TemplatesRequestDto.md)
 - [org.openapitools.client.model.TenantAiAccessSettings](docs/TenantAiAccessSettings.md)
 - [org.openapitools.client.model.TenantAiAccessSettingsDto](docs/TenantAiAccessSettingsDto.md)
 - [org.openapitools.client.model.TenantAiAccessSettingsWrapper](docs/TenantAiAccessSettingsWrapper.md)
 - [org.openapitools.client.model.TenantAiAgentQuotaSettings](docs/TenantAiAgentQuotaSettings.md)
 - [org.openapitools.client.model.TenantAiAgentQuotaSettingsWrapper](docs/TenantAiAgentQuotaSettingsWrapper.md)
 - [org.openapitools.client.model.TenantAuditSettings](docs/TenantAuditSettings.md)
 - [org.openapitools.client.model.TenantAuditSettingsWrapper](docs/TenantAuditSettingsWrapper.md)
 - [org.openapitools.client.model.TenantBannerSettings](docs/TenantBannerSettings.md)
 - [org.openapitools.client.model.TenantBannerSettingsDto](docs/TenantBannerSettingsDto.md)
 - [org.openapitools.client.model.TenantBannerSettingsWrapper](docs/TenantBannerSettingsWrapper.md)
 - [org.openapitools.client.model.TenantDeepLinkSettings](docs/TenantDeepLinkSettings.md)
 - [org.openapitools.client.model.TenantDeepLinkSettingsWrapper](docs/TenantDeepLinkSettingsWrapper.md)
 - [org.openapitools.client.model.TenantDevToolsAccessSettings](docs/TenantDevToolsAccessSettings.md)
 - [org.openapitools.client.model.TenantDevToolsAccessSettingsDto](docs/TenantDevToolsAccessSettingsDto.md)
 - [org.openapitools.client.model.TenantDevToolsAccessSettingsWrapper](docs/TenantDevToolsAccessSettingsWrapper.md)
 - [org.openapitools.client.model.TenantDomainValidator](docs/TenantDomainValidator.md)
 - [org.openapitools.client.model.TenantDto](docs/TenantDto.md)
 - [org.openapitools.client.model.TenantEntityQuotaSettings](docs/TenantEntityQuotaSettings.md)
 - [org.openapitools.client.model.TenantIndustry](docs/TenantIndustry.md)
 - [org.openapitools.client.model.TenantQuota](docs/TenantQuota.md)
 - [org.openapitools.client.model.TenantQuotaFeatureDto](docs/TenantQuotaFeatureDto.md)
 - [org.openapitools.client.model.TenantQuotaSettings](docs/TenantQuotaSettings.md)
 - [org.openapitools.client.model.TenantQuotaSettingsRequestsDto](docs/TenantQuotaSettingsRequestsDto.md)
 - [org.openapitools.client.model.TenantQuotaSettingsWrapper](docs/TenantQuotaSettingsWrapper.md)
 - [org.openapitools.client.model.TenantQuotaWrapper](docs/TenantQuotaWrapper.md)
 - [org.openapitools.client.model.TenantRoomQuotaSettings](docs/TenantRoomQuotaSettings.md)
 - [org.openapitools.client.model.TenantRoomQuotaSettingsWrapper](docs/TenantRoomQuotaSettingsWrapper.md)
 - [org.openapitools.client.model.TenantStatus](docs/TenantStatus.md)
 - [org.openapitools.client.model.TenantTrustedDomainsType](docs/TenantTrustedDomainsType.md)
 - [org.openapitools.client.model.TenantUserInvitationSettingsDto](docs/TenantUserInvitationSettingsDto.md)
 - [org.openapitools.client.model.TenantUserInvitationSettingsRequestDto](docs/TenantUserInvitationSettingsRequestDto.md)
 - [org.openapitools.client.model.TenantUserInvitationSettingsWrapper](docs/TenantUserInvitationSettingsWrapper.md)
 - [org.openapitools.client.model.TenantUserQuotaSettings](docs/TenantUserQuotaSettings.md)
 - [org.openapitools.client.model.TenantUserQuotaSettingsWrapper](docs/TenantUserQuotaSettingsWrapper.md)
 - [org.openapitools.client.model.TenantWalletService](docs/TenantWalletService.md)
 - [org.openapitools.client.model.TenantWalletServiceSettings](docs/TenantWalletServiceSettings.md)
 - [org.openapitools.client.model.TenantWalletServiceSettingsWrapper](docs/TenantWalletServiceSettingsWrapper.md)
 - [org.openapitools.client.model.TenantWalletSettings](docs/TenantWalletSettings.md)
 - [org.openapitools.client.model.TenantWalletSettingsWrapper](docs/TenantWalletSettingsWrapper.md)
 - [org.openapitools.client.model.TenantWrapper](docs/TenantWrapper.md)
 - [org.openapitools.client.model.TerminateRequestDto](docs/TerminateRequestDto.md)
 - [org.openapitools.client.model.TfaRequestsDto](docs/TfaRequestsDto.md)
 - [org.openapitools.client.model.TfaRequestsDtoType](docs/TfaRequestsDtoType.md)
 - [org.openapitools.client.model.TfaSettingsArrayWrapper](docs/TfaSettingsArrayWrapper.md)
 - [org.openapitools.client.model.TfaSettingsDto](docs/TfaSettingsDto.md)
 - [org.openapitools.client.model.TfaValidateRequestsDto](docs/TfaValidateRequestsDto.md)
 - [org.openapitools.client.model.ThirdPartyBackupRequestDto](docs/ThirdPartyBackupRequestDto.md)
 - [org.openapitools.client.model.ThirdPartyParams](docs/ThirdPartyParams.md)
 - [org.openapitools.client.model.ThirdPartyParamsArrayWrapper](docs/ThirdPartyParamsArrayWrapper.md)
 - [org.openapitools.client.model.ThirdPartyRequestDto](docs/ThirdPartyRequestDto.md)
 - [org.openapitools.client.model.Thumbnail](docs/Thumbnail.md)
 - [org.openapitools.client.model.ThumbnailsDataDto](docs/ThumbnailsDataDto.md)
 - [org.openapitools.client.model.ThumbnailsDataWrapper](docs/ThumbnailsDataWrapper.md)
 - [org.openapitools.client.model.ThumbnailsRequest](docs/ThumbnailsRequest.md)
 - [org.openapitools.client.model.TimezonesRequestsArrayWrapper](docs/TimezonesRequestsArrayWrapper.md)
 - [org.openapitools.client.model.TimezonesRequestsDto](docs/TimezonesRequestsDto.md)
 - [org.openapitools.client.model.ToolDecisionRequestBody](docs/ToolDecisionRequestBody.md)
 - [org.openapitools.client.model.ToolExecutionDecision](docs/ToolExecutionDecision.md)
 - [org.openapitools.client.model.TopUpDepositRequestDto](docs/TopUpDepositRequestDto.md)
 - [org.openapitools.client.model.TransactionInfo](docs/TransactionInfo.md)
 - [org.openapitools.client.model.TurnOnAdminMessageSettingsRequestDto](docs/TurnOnAdminMessageSettingsRequestDto.md)
 - [org.openapitools.client.model.UpdateApiKeyRequest](docs/UpdateApiKeyRequest.md)
 - [org.openapitools.client.model.UpdateClientRequest](docs/UpdateClientRequest.md)
 - [org.openapitools.client.model.UpdateComment](docs/UpdateComment.md)
 - [org.openapitools.client.model.UpdateFile](docs/UpdateFile.md)
 - [org.openapitools.client.model.UpdateGroupRequest](docs/UpdateGroupRequest.md)
 - [org.openapitools.client.model.UpdateMemberRequestDto](docs/UpdateMemberRequestDto.md)
 - [org.openapitools.client.model.UpdateMembersQuotaRequestDto](docs/UpdateMembersQuotaRequestDto.md)
 - [org.openapitools.client.model.UpdateMembersQuotaRequestDtoQuota](docs/UpdateMembersQuotaRequestDtoQuota.md)
 - [org.openapitools.client.model.UpdateMembersRequestDto](docs/UpdateMembersRequestDto.md)
 - [org.openapitools.client.model.UpdatePhotoMemberRequest](docs/UpdatePhotoMemberRequest.md)
 - [org.openapitools.client.model.UpdateProviderBody](docs/UpdateProviderBody.md)
 - [org.openapitools.client.model.UpdateRoomGroupRequest](docs/UpdateRoomGroupRequest.md)
 - [org.openapitools.client.model.UpdateRoomRequest](docs/UpdateRoomRequest.md)
 - [org.openapitools.client.model.UpdateRoomsQuotaRequestDtoInteger](docs/UpdateRoomsQuotaRequestDtoInteger.md)
 - [org.openapitools.client.model.UpdateRoomsRoomIdsRequestDtoInteger](docs/UpdateRoomsRoomIdsRequestDtoInteger.md)
 - [org.openapitools.client.model.UpdateServerRequestBody](docs/UpdateServerRequestBody.md)
 - [org.openapitools.client.model.UpdateTagRequestDto](docs/UpdateTagRequestDto.md)
 - [org.openapitools.client.model.UpdateWebhooksConfigRequestsDto](docs/UpdateWebhooksConfigRequestsDto.md)
 - [org.openapitools.client.model.UploadRequestDto](docs/UploadRequestDto.md)
 - [org.openapitools.client.model.UploadResultDto](docs/UploadResultDto.md)
 - [org.openapitools.client.model.UploadResultWrapper](docs/UploadResultWrapper.md)
 - [org.openapitools.client.model.UploadSessionResponseDtoInteger](docs/UploadSessionResponseDtoInteger.md)
 - [org.openapitools.client.model.UploadSessionResponseIntegerWrapper](docs/UploadSessionResponseIntegerWrapper.md)
 - [org.openapitools.client.model.UsageSpaceStatItemArrayWrapper](docs/UsageSpaceStatItemArrayWrapper.md)
 - [org.openapitools.client.model.UsageSpaceStatItemDto](docs/UsageSpaceStatItemDto.md)
 - [org.openapitools.client.model.UserChatSettingsDto](docs/UserChatSettingsDto.md)
 - [org.openapitools.client.model.UserChatSettingsWrapper](docs/UserChatSettingsWrapper.md)
 - [org.openapitools.client.model.UserConfig](docs/UserConfig.md)
 - [org.openapitools.client.model.UserInfo](docs/UserInfo.md)
 - [org.openapitools.client.model.UserInfoWrapper](docs/UserInfoWrapper.md)
 - [org.openapitools.client.model.UserInvitation](docs/UserInvitation.md)
 - [org.openapitools.client.model.UserInvitationRequestDto](docs/UserInvitationRequestDto.md)
 - [org.openapitools.client.model.ValidationResult](docs/ValidationResult.md)
 - [org.openapitools.client.model.VectorizationSettingsDto](docs/VectorizationSettingsDto.md)
 - [org.openapitools.client.model.VectorizationSettingsWrapper](docs/VectorizationSettingsWrapper.md)
 - [org.openapitools.client.model.VectorizationStartRequestBody](docs/VectorizationStartRequestBody.md)
 - [org.openapitools.client.model.VectorizationStatus](docs/VectorizationStatus.md)
 - [org.openapitools.client.model.WalletQuantityRequestDto](docs/WalletQuantityRequestDto.md)
 - [org.openapitools.client.model.WalletServiceArrayWrapper](docs/WalletServiceArrayWrapper.md)
 - [org.openapitools.client.model.WalletServiceDto](docs/WalletServiceDto.md)
 - [org.openapitools.client.model.WalletServiceWrapper](docs/WalletServiceWrapper.md)
 - [org.openapitools.client.model.WatermarkAdditions](docs/WatermarkAdditions.md)
 - [org.openapitools.client.model.WatermarkDto](docs/WatermarkDto.md)
 - [org.openapitools.client.model.WatermarkOnDraw](docs/WatermarkOnDraw.md)
 - [org.openapitools.client.model.WatermarkRequestDto](docs/WatermarkRequestDto.md)
 - [org.openapitools.client.model.WebItemSecurityRequestsDto](docs/WebItemSecurityRequestsDto.md)
 - [org.openapitools.client.model.WebItemsSecurityRequestsDto](docs/WebItemsSecurityRequestsDto.md)
 - [org.openapitools.client.model.WebPluginArrayWrapper](docs/WebPluginArrayWrapper.md)
 - [org.openapitools.client.model.WebPluginDto](docs/WebPluginDto.md)
 - [org.openapitools.client.model.WebPluginRequests](docs/WebPluginRequests.md)
 - [org.openapitools.client.model.WebPluginWrapper](docs/WebPluginWrapper.md)
 - [org.openapitools.client.model.WebSearchSettingsDto](docs/WebSearchSettingsDto.md)
 - [org.openapitools.client.model.WebSearchSettingsWrapper](docs/WebSearchSettingsWrapper.md)
 - [org.openapitools.client.model.WebhookGroupStatus](docs/WebhookGroupStatus.md)
 - [org.openapitools.client.model.WebhookRetryRequestsDto](docs/WebhookRetryRequestsDto.md)
 - [org.openapitools.client.model.WebhookTrigger](docs/WebhookTrigger.md)
 - [org.openapitools.client.model.WebhooksConfigDto](docs/WebhooksConfigDto.md)
 - [org.openapitools.client.model.WebhooksConfigWithStatusArrayWrapper](docs/WebhooksConfigWithStatusArrayWrapper.md)
 - [org.openapitools.client.model.WebhooksConfigWithStatusDto](docs/WebhooksConfigWithStatusDto.md)
 - [org.openapitools.client.model.WebhooksConfigWrapper](docs/WebhooksConfigWrapper.md)
 - [org.openapitools.client.model.WebhooksLogArrayWrapper](docs/WebhooksLogArrayWrapper.md)
 - [org.openapitools.client.model.WebhooksLogDto](docs/WebhooksLogDto.md)
 - [org.openapitools.client.model.WebhooksLogWrapper](docs/WebhooksLogWrapper.md)
 - [org.openapitools.client.model.WhiteLabelItemArrayWrapper](docs/WhiteLabelItemArrayWrapper.md)
 - [org.openapitools.client.model.WhiteLabelItemDto](docs/WhiteLabelItemDto.md)
 - [org.openapitools.client.model.WhiteLabelItemPathDto](docs/WhiteLabelItemPathDto.md)
 - [org.openapitools.client.model.WhiteLabelLogoType](docs/WhiteLabelLogoType.md)
 - [org.openapitools.client.model.WhiteLabelRequestsDto](docs/WhiteLabelRequestsDto.md)
 - [org.openapitools.client.model.WizardRequestsDto](docs/WizardRequestsDto.md)
 - [org.openapitools.client.model.WizardSettings](docs/WizardSettings.md)
 - [org.openapitools.client.model.WizardSettingsWrapper](docs/WizardSettingsWrapper.md)

</details>

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@onlyoffice.com

