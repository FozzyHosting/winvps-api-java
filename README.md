# Fozzy Windows VPS APIs Client library for Java

This library is not supported anymore. If you need a Java SDK for Fozzy Windows VPS service, please register your interest with our support (support@fozzy.com) so we could let you know when we release a new version.

The API Client Library enables you to work with Fozzy Windows VPS APIs for creating or managing your machines.

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven

## Developer Documentation

The actual API Documentation available on this [link](https://winvps.fozzy.com/api/v2_docs).

The [docs](docs) folder provides detailed guides for using current library.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```
Then manually install the following JARs:

* `target/winvps.api-1.0.0.jar`
* `target/lib/*.jar`

### Authorization

To be able to send requests you need to get API key as described in API Documentation.


### Full example

```java
import fozzyhosting.winvps.*;
import fozzyhosting.winvps.auth.*;
import fozzyhosting.winvps.model.*;
import fozzyhosting.winvps.api.BrandsApi;

import java.io.File;
import java.util.*;

public class BrandsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("API key from WinVPS client area");

        BrandsApi apiInstance = new BrandsApi();
        try {
            BrandsListResponse result = apiInstance.brandsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#brandsGet");
            e.printStackTrace();
        }
    }
}
```

### Pagination

Each API Instance has pagination methods `nextPage()` and `previousPage()`.

