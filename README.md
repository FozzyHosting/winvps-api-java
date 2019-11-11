# Fozzy Windows VPS APIs Client library for Java

The API Client Library enables you to work with Fozzy Windows VPS APIs for creating or managing your machines.

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Developer Documentation

The actual API Documentation available on this [link](https://winvps.fozzy.com/api/v2_docs).

The [docs](docs) folder provides detailed guides for using current library.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>fozzyhosting</groupId>
  <artifactId>winvps.api</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "fozzyhosting:winvps.api:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
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

