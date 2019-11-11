# JobDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Job primary ID. Can be used to show Job details or cancel the command |  [optional]
**parentId** | **Integer** | ID of the last Job before the current one. Since the commands are executed sequentially, parent ID can be used to monitor the progress of command processing. |  [optional]
**machineId** | **Integer** | ID of the machine Job created for. |  [optional]
**type** | **String** | Defines the command which be executed. |  [optional]
**status** | **String** | Command status. |  [optional]
**startTime** | **String** | Time after which the command can be started. The Job will not be started before this time but can be started some time later when the queue reaches its completion. |  [optional]
