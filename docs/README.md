## Documentation for API Endpoints

All URIs are relative to *https://winvps.fozzy.com/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandsApi* | [**brandsGet**](BrandsApi.md#brandsGet) | **GET** /brands | Returns list of all available preinstalled software set.
*JobsApi* | [**jobsGet**](JobsApi.md#jobsGet) | **GET** /jobs | List of all planned and completed commands.
*JobsApi* | [**jobsIdDelete**](JobsApi.md#jobsIdDelete) | **DELETE** /jobs/{id} | Cancel specified Job.
*JobsApi* | [**jobsIdGet**](JobsApi.md#jobsIdGet) | **GET** /jobs/{id} | View single Job details.
*JobsApi* | [**jobsPendingGet**](JobsApi.md#jobsPendingGet) | **GET** /jobs/pending | List of all planned commands.
*LocationsApi* | [**locationsGet**](LocationsApi.md#locationsGet) | **GET** /locations | Returns list of locations available for new machines.
*MachinesApi* | [**machinesGet**](MachinesApi.md#machinesGet) | **GET** /machines | Returns machines list in short form.
*MachinesApi* | [**machinesNameAddIpPost**](MachinesApi.md#machinesNameAddIpPost) | **POST** /machines/{name}/add_ip | Send unary machine command
*MachinesApi* | [**machinesNameCommandPost**](MachinesApi.md#machinesNameCommandPost) | **POST** /machines/{name}/{command} | Send single command which does not need additional options.
*MachinesApi* | [**machinesNameDelete**](MachinesApi.md#machinesNameDelete) | **DELETE** /machines/{name} | Terminate machine
*MachinesApi* | [**machinesNameGet**](MachinesApi.md#machinesNameGet) | **GET** /machines/{name} | Returns machine details
*MachinesApi* | [**machinesNameJobsGet**](MachinesApi.md#machinesNameJobsGet) | **GET** /machines/{name}/jobs | Returns list of jobs assigned to machine.
*MachinesApi* | [**machinesNamePost**](MachinesApi.md#machinesNamePost) | **POST** /machines/{name} | Reinstall machine
*MachinesApi* | [**machinesNamePut**](MachinesApi.md#machinesNamePut) | **PUT** /machines/{name} | Update machine details
*MachinesApi* | [**machinesNameUsersGet**](MachinesApi.md#machinesNameUsersGet) | **GET** /machines/{name}/users | Returns list of additional system users.
*MachinesApi* | [**machinesPost**](MachinesApi.md#machinesPost) | **POST** /machines | Create new machine.
*MachinesApi* | [**machinesRunningGet**](MachinesApi.md#machinesRunningGet) | **GET** /machines/running | Returns list of currently running machines.
*MachinesApi* | [**machinesStoppedGet**](MachinesApi.md#machinesStoppedGet) | **GET** /machines/stopped | Returns list of currently stopped or suspended machines.
*ProductsApi* | [**productsGet**](ProductsApi.md#productsGet) | **GET** /products | Returns list of all available products.
*TemplatesApi* | [**templatesGet**](TemplatesApi.md#templatesGet) | **GET** /templates | Returns list of all templates available for new machines.

## Documentation for Models

 - [BrandDefinition](BrandDefinition.md)
 - [BrandsList](BrandsList.md)
 - [BrandsListResponse](BrandsListResponse.md)
 - [CommandResult](CommandResult.md)
 - [ErrorResponse](ErrorResponse.md)
 - [IpDefinition](IpDefinition.md)
 - [JobDefinition](JobDefinition.md)
 - [JobDetailsResponse](JobDetailsResponse.md)
 - [JobsList](JobsList.md)
 - [JobsListResponse](JobsListResponse.md)
 - [LocationDefinition](LocationDefinition.md)
 - [LocationsList](LocationsList.md)
 - [LocationsListResponse](LocationsListResponse.md)
 - [MachineAddIpResponse](MachineAddIpResponse.md)
 - [MachineAddIpResponseData](MachineAddIpResponseData.md)
 - [MachineAdditionsDefinition](MachineAdditionsDefinition.md)
 - [MachineCommandResultResponse](MachineCommandResultResponse.md)
 - [MachineCommandResultResponseData](MachineCommandResultResponseData.md)
 - [MachineConfig](MachineConfig.md)
 - [MachineCreateRequestBody](MachineCreateRequestBody.md)
 - [MachineCreateResponse](MachineCreateResponse.md)
 - [MachineCreateResponseData](MachineCreateResponseData.md)
 - [MachineDefinition](MachineDefinition.md)
 - [MachineDetailsResponse](MachineDetailsResponse.md)
 - [MachineEditableFields](MachineEditableFields.md)
 - [MachineListItem](MachineListItem.md)
 - [MachineNonReinstallableFields](MachineNonReinstallableFields.md)
 - [MachineOS](MachineOS.md)
 - [MachineReinstallRequestBody](MachineReinstallRequestBody.md)
 - [MachineReinstallableFields](MachineReinstallableFields.md)
 - [MachineUpdateRequestBody](MachineUpdateRequestBody.md)
 - [MachineUserDefinition](MachineUserDefinition.md)
 - [MachineUsersList](MachineUsersList.md)
 - [MachineUsersListResponse](MachineUsersListResponse.md)
 - [MachinesList](MachinesList.md)
 - [MachinesListResponse](MachinesListResponse.md)
 - [PaginationDetails](PaginationDetails.md)
 - [ProductDefinition](ProductDefinition.md)
 - [ProductDefinitionLimits](ProductDefinitionLimits.md)
 - [ProductsList](ProductsList.md)
 - [ProductsListResponse](ProductsListResponse.md)
 - [TemplateDefinition](TemplateDefinition.md)
 - [TemplatesList](TemplatesList.md)
 - [TemplatesListResponse](TemplatesListResponse.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: Api-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


