# MachinesApi

All URIs are relative to *https://winvps.fozzy.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machinesGet**](MachinesApi.md#machinesGet) | **GET** /machines | Returns machines list in short form.
[**machinesNameAddIpPost**](MachinesApi.md#machinesNameAddIpPost) | **POST** /machines/{name}/add_ip | Send unary machine command
[**machinesNameCommandPost**](MachinesApi.md#machinesNameCommandPost) | **POST** /machines/{name}/{command} | Send single command which does not need additional options.
[**machinesNameDelete**](MachinesApi.md#machinesNameDelete) | **DELETE** /machines/{name} | Terminate machine
[**machinesNameGet**](MachinesApi.md#machinesNameGet) | **GET** /machines/{name} | Returns machine details
[**machinesNameJobsGet**](MachinesApi.md#machinesNameJobsGet) | **GET** /machines/{name}/jobs | Returns list of jobs assigned to machine.
[**machinesNamePost**](MachinesApi.md#machinesNamePost) | **POST** /machines/{name} | Reinstall machine
[**machinesNamePut**](MachinesApi.md#machinesNamePut) | **PUT** /machines/{name} | Update machine details
[**machinesNameUsersGet**](MachinesApi.md#machinesNameUsersGet) | **GET** /machines/{name}/users | Returns list of additional system users.
[**machinesPost**](MachinesApi.md#machinesPost) | **POST** /machines | Create new machine.
[**machinesRunningGet**](MachinesApi.md#machinesRunningGet) | **GET** /machines/running | Returns list of currently running machines.
[**machinesStoppedGet**](MachinesApi.md#machinesStoppedGet) | **GET** /machines/stopped | Returns list of currently stopped or suspended machines.

<a name="machinesGet"></a>
# **machinesGet**
> MachinesListResponse machinesGet()

Returns machines list in short form.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
try {
    MachinesListResponse result = apiInstance.machinesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MachinesListResponse**](MachinesListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="machinesNameAddIpPost"></a>
# **machinesNameAddIpPost**
> MachineAddIpResponse machinesNameAddIpPost(name)

Send unary machine command

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
String name = "name_example"; // String | 
try {
    MachineAddIpResponse result = apiInstance.machinesNameAddIpPost(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesNameAddIpPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**MachineAddIpResponse**](MachineAddIpResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="machinesNameCommandPost"></a>
# **machinesNameCommandPost**
> MachineCommandResultResponse machinesNameCommandPost(name, command)

Send single command which does not need additional options.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
String name = "name_example"; // String | Machine name.
String command = "command_example"; // String | Command key.
try {
    MachineCommandResultResponse result = apiInstance.machinesNameCommandPost(name, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesNameCommandPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Machine name. |
 **command** | **String**| Command key. | [enum: start, stop, restart, suspend, unsuspend, enable_rdp, enable_network, restart_mt]

### Return type

[**MachineCommandResultResponse**](MachineCommandResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="machinesNameDelete"></a>
# **machinesNameDelete**
> MachineCommandResultResponse machinesNameDelete(name)

Terminate machine

Creates machine deletion jobs. This action can be cancelled in two days.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
String name = "name_example"; // String | 
try {
    MachineCommandResultResponse result = apiInstance.machinesNameDelete(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**MachineCommandResultResponse**](MachineCommandResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="machinesNameGet"></a>
# **machinesNameGet**
> MachineDetailsResponse machinesNameGet(name)

Returns machine details

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
String name = "name_example"; // String | 
try {
    MachineDetailsResponse result = apiInstance.machinesNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**MachineDetailsResponse**](MachineDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="machinesNameJobsGet"></a>
# **machinesNameJobsGet**
> JobsListResponse machinesNameJobsGet(name)

Returns list of jobs assigned to machine.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
String name = "name_example"; // String | 
try {
    JobsListResponse result = apiInstance.machinesNameJobsGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesNameJobsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**JobsListResponse**](JobsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="machinesNamePost"></a>
# **machinesNamePost**
> MachineCommandResultResponse machinesNamePost(body, name)

Reinstall machine

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
MachineReinstallRequestBody body = new MachineReinstallRequestBody(); // MachineReinstallRequestBody | 
String name = "name_example"; // String | 
try {
    MachineCommandResultResponse result = apiInstance.machinesNamePost(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesNamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MachineReinstallRequestBody**](MachineReinstallRequestBody.md)|  |
 **name** | **String**|  |

### Return type

[**MachineCommandResultResponse**](MachineCommandResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="machinesNamePut"></a>
# **machinesNamePut**
> MachineCommandResultResponse machinesNamePut(body, name)

Update machine details

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
MachineUpdateRequestBody body = new MachineUpdateRequestBody(); // MachineUpdateRequestBody | 
String name = "name_example"; // String | 
try {
    MachineCommandResultResponse result = apiInstance.machinesNamePut(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesNamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MachineUpdateRequestBody**](MachineUpdateRequestBody.md)|  |
 **name** | **String**|  |

### Return type

[**MachineCommandResultResponse**](MachineCommandResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="machinesNameUsersGet"></a>
# **machinesNameUsersGet**
> MachineUsersListResponse machinesNameUsersGet(name)

Returns list of additional system users.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
String name = "name_example"; // String | 
try {
    MachineUsersListResponse result = apiInstance.machinesNameUsersGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesNameUsersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**MachineUsersListResponse**](MachineUsersListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="machinesPost"></a>
# **machinesPost**
> MachineCreateResponse machinesPost(body)

Create new machine.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
MachineCreateRequestBody body = new MachineCreateRequestBody(); // MachineCreateRequestBody | Optional description in *Markdown*
try {
    MachineCreateResponse result = apiInstance.machinesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MachineCreateRequestBody**](MachineCreateRequestBody.md)| Optional description in *Markdown* |

### Return type

[**MachineCreateResponse**](MachineCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="machinesRunningGet"></a>
# **machinesRunningGet**
> MachinesListResponse machinesRunningGet()

Returns list of currently running machines.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
try {
    MachinesListResponse result = apiInstance.machinesRunningGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesRunningGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MachinesListResponse**](MachinesListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="machinesStoppedGet"></a>
# **machinesStoppedGet**
> MachinesListResponse machinesStoppedGet()

Returns list of currently stopped or suspended machines.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.MachinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MachinesApi apiInstance = new MachinesApi();
try {
    MachinesListResponse result = apiInstance.machinesStoppedGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#machinesStoppedGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MachinesListResponse**](MachinesListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

