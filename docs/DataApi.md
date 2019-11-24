# DataApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSalaryLevel**](DataApi.md#addSalaryLevel) | **POST** /salary-levels | Add Salary Level

<a name="addSalaryLevel"></a>
# **addSalaryLevel**
> addSalaryLevel(name)

Add Salary Level

Adds a new Salary level

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

DataApi apiInstance = new DataApi();
String name = "name_example"; // String | The name of the new salaray level
try {
    apiInstance.addSalaryLevel(name);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#addSalaryLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the new salaray level |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

