# TemplatesApi

All URIs are relative to *https://winvps.fozzy.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templatesGet**](TemplatesApi.md#templatesGet) | **GET** /templates | Returns list of all templates available for new machines.

<a name="templatesGet"></a>
# **templatesGet**
> TemplatesListResponse templatesGet()

Returns list of all templates available for new machines.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
try {
    TemplatesListResponse result = apiInstance.templatesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#templatesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TemplatesListResponse**](TemplatesListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

