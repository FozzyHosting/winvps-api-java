# MachineCreateRequestBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateId** | **Integer** | Primary Template ID. |  [optional]
**brandId** | **Integer** | Primary Brand ID. |  [optional]
**diskType** | [**DiskTypeEnum**](#DiskTypeEnum) | Server disk type. HDD or SSD. |  [optional]
**locationId** | **Integer** | Primary Location ID. |  [optional]
**addDisk** | **Integer** | Additional disk saze. |  [optional]
**addRam** | **Integer** | Additional RAM size in MB. |  [optional]
**addCpu** | **Integer** | Additional CPU cores count. |  [optional]
**addBand** | **Integer** | Additional bandwidth. |  [optional]
**autoStart** | **Integer** |  |  [optional]

<a name="DiskTypeEnum"></a>
## Enum: DiskTypeEnum
Name | Value
---- | -----
HDD | &quot;hdd&quot;
SSD | &quot;ssd&quot;
