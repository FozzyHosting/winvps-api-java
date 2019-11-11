# LocationsApi

All URIs are relative to *https://winvps.fozzy.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationsGet**](LocationsApi.md#locationsGet) | **GET** /locations | Returns list of locations available for new machines.

<a name="locationsGet"></a>
# **locationsGet**
> LocationsListResponse locationsGet()

Returns list of locations available for new machines.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LocationsApi apiInstance = new LocationsApi();
try {
    LocationsListResponse result = apiInstance.locationsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#locationsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LocationsListResponse**](LocationsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

