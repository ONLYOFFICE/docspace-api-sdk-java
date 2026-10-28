

# AiPromptBundle

Versioned, self-contained bundle of every saved prompt and folder. Stable wire format — `version` lets the import path migrate older shapes if the schema ever changes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | [**VersionEnum**](#VersionEnum) | The bundle format version, so an import can migrate an older export. |  |
|**folders** | [**List&lt;AiPromptFolder&gt;**](AiPromptFolder.md) | Every exported prompt folder. |  |
|**prompts** | [**List&lt;AiPrompt&gt;**](AiPrompt.md) | Every exported prompt. |  |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | new BigDecimal(&quot;1&quot;) |



