# ProductsApi

All URIs are relative to *https://winvps.fozzy.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productsGet**](ProductsApi.md#productsGet) | **GET** /products | Returns list of all available products.

<a name="productsGet"></a>
# **productsGet**
> ProductsListResponse productsGet()

Returns list of all available products.

### Example
```java
// Import classes:
//import fozzyhosting.winvps.ApiClient;
//import fozzyhosting.winvps.ApiException;
//import fozzyhosting.winvps.Configuration;
//import fozzyhosting.winvps.auth.*;
//import fozzyhosting.winvps.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProductsApi apiInstance = new ProductsApi();
try {
    ProductsListResponse result = apiInstance.productsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductsListResponse**](ProductsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

