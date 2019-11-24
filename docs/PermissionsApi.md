# PermissionsApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllPermissions**](PermissionsApi.md#getAllPermissions) | **GET** /permissions | Get all permissions
[**getPermission**](PermissionsApi.md#getPermission) | **GET** /permission/{name} | Get permission

<a name="getAllPermissions"></a>
# **getAllPermissions**
> List&lt;Paths1group17Bname7D1permissionsgetresponses200contentapplication1jsonschemaitems&gt; getAllPermissions()

Get all permissions

Get all available permissions

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PermissionsApi apiInstance = new PermissionsApi();
try {
    List<Paths1group17Bname7D1permissionsgetresponses200contentapplication1jsonschemaitems> result = apiInstance.getAllPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getAllPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Paths1group17Bname7D1permissionsgetresponses200contentapplication1jsonschemaitems&gt;**](Paths1group17Bname7D1permissionsgetresponses200contentapplication1jsonschemaitems.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPermission"></a>
# **getPermission**
> Paths1group17Bname7D1permissionsgetresponses200contentapplication1jsonschemaitems getPermission(name)

Get permission

Get information about a specific permission (name and description)

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PermissionsApi apiInstance = new PermissionsApi();
String name = "name_example"; // String | Name of a valid permission
try {
    Paths1group17Bname7D1permissionsgetresponses200contentapplication1jsonschemaitems result = apiInstance.getPermission(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of a valid permission |

### Return type

[**Paths1group17Bname7D1permissionsgetresponses200contentapplication1jsonschemaitems**](Paths1group17Bname7D1permissionsgetresponses200contentapplication1jsonschemaitems.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

