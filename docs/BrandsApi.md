# BrandsApi

All URIs are relative to *https://winvps.fozzy.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandsGet**](BrandsApi.md#brandsGet) | **GET** /brands | Returns list of all available preinstalled software set.

<a name="brandsGet"></a>
# **brandsGet**
> BrandsListResponse brandsGet()

Returns list of all available preinstalled software set.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.BrandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

BrandsApi apiInstance = new BrandsApi();
try {
    BrandsListResponse result = apiInstance.brandsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#brandsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BrandsListResponse**](BrandsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

