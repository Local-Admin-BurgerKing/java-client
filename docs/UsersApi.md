# UsersApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](UsersApi.md#authenticate) | **GET** /auth | Authentication

<a name="authenticate"></a>
# **authenticate**
> Apikeywrapper authenticate(name, password)

Authentication

Authenticates an User and returns his API key

### Example
```java
// Import classes:
//import com.localadmin.ApiException;
//import com.localadmin.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String name = "name_example"; // String | The name or email of the user to authenticate
String password = "password_example"; // String | The password of the user in plain text
try {
    Apikeywrapper result = apiInstance.authenticate(name, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#authenticate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name or email of the user to authenticate |
 **password** | **String**| The password of the user in plain text |

### Return type

[**Apikeywrapper**](Apikeywrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

