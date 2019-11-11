# JobsApi

All URIs are relative to *https://winvps.fozzy.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobsGet**](JobsApi.md#jobsGet) | **GET** /jobs | List of all planned and completed commands.
[**jobsIdDelete**](JobsApi.md#jobsIdDelete) | **DELETE** /jobs/{id} | Cancel specified Job.
[**jobsIdGet**](JobsApi.md#jobsIdGet) | **GET** /jobs/{id} | View single Job details.
[**jobsPendingGet**](JobsApi.md#jobsPendingGet) | **GET** /jobs/pending | List of all planned commands.

<a name="jobsGet"></a>
# **jobsGet**
> JobsListResponse jobsGet()

List of all planned and completed commands.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
try {
    JobsListResponse result = apiInstance.jobsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JobsListResponse**](JobsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdDelete"></a>
# **jobsIdDelete**
> jobsIdDelete(id)

Cancel specified Job.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
Integer id = 56; // Integer | 
try {
    apiInstance.jobsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdGet"></a>
# **jobsIdGet**
> JobDetailsResponse jobsIdGet(id)

View single Job details.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
Integer id = 56; // Integer | 
try {
    JobDetailsResponse result = apiInstance.jobsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**JobDetailsResponse**](JobDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsPendingGet"></a>
# **jobsPendingGet**
> JobsListResponse jobsPendingGet()

List of all planned commands.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
try {
    JobsListResponse result = apiInstance.jobsPendingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsPendingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JobsListResponse**](JobsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

