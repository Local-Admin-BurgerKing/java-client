# UsergroupApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroupPermission**](UsergroupApi.md#addGroupPermission) | **PUT** /group/{name}/permissions | Add group permission
[**createGroup**](UsergroupApi.md#createGroup) | **POST** /groups | Create group
[**getAllGroups**](UsergroupApi.md#getAllGroups) | **GET** /groups | Get all groups
[**getGroupPermissions**](UsergroupApi.md#getGroupPermissions) | **GET** /group/{name}/permissions | Get group permissions
[**removeAllGroups**](UsergroupApi.md#removeAllGroups) | **DELETE** /groups | Remove all groups
[**removeAllPermissions**](UsergroupApi.md#removeAllPermissions) | **DELETE** /group/{name}/permissions | Remove group&#x27;s permissions
[**removeGroup**](UsergroupApi.md#removeGroup) | **DELETE** /group/{name} | Remove group
[**removeGroupPermission**](UsergroupApi.md#removeGroupPermission) | **DELETE** /group/{name}/permissions/{perm} | Remove specific group-permission
[**updateGroupName**](UsergroupApi.md#updateGroupName) | **PATCH** /group/{name} | Rename group

<a name="addGroupPermission"></a>
# **addGroupPermission**
> addGroupPermission(name, name2)

Add group permission

Add a specific permission to a given group

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
String name = "name_example"; // String | Name of a group
String name2 = "name_example"; // String | The name of new permission to add
try {
    apiInstance.addGroupPermission(name, name2);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#addGroupPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of a group |
 **name2** | **String**| The name of new permission to add |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroup"></a>
# **createGroup**
> createGroup()

Create group

Create a new user group

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
try {
    apiInstance.createGroup();
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#createGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllGroups"></a>
# **getAllGroups**
> List&lt;Object&gt; getAllGroups(wholeData)

Get all groups

The list of usergroups.

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getAllGroups(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#getAllGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wholeData** | **Boolean**| if true you will get all the data instead of only reference names | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupPermissions"></a>
# **getGroupPermissions**
> List&lt;Permission&gt; getGroupPermissions(name)

Get group permissions

Get informations about the permissions of a user group.

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
String name = "name_example"; // String | Name of a group
try {
    List<Permission> result = apiInstance.getGroupPermissions(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#getGroupPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of a group |

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeAllGroups"></a>
# **removeAllGroups**
> removeAllGroups()

Remove all groups

Remove all available groups.

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
try {
    apiInstance.removeAllGroups();
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#removeAllGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeAllPermissions"></a>
# **removeAllPermissions**
> removeAllPermissions(name)

Remove group&#x27;s permissions

Remove all permission from a group

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
String name = "name_example"; // String | Name of a group
try {
    apiInstance.removeAllPermissions(name);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#removeAllPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of a group |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeGroup"></a>
# **removeGroup**
> removeGroup(name)

Remove group

Delete the specified group

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
String name = "name_example"; // String | 
try {
    apiInstance.removeGroup(name);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#removeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeGroupPermission"></a>
# **removeGroupPermission**
> removeGroupPermission(name, perm)

Remove specific group-permission

Remove a specific permission from a group

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
String name = "name_example"; // String | Name of a group
String perm = "perm_example"; // String | Name of a valid permission
try {
    apiInstance.removeGroupPermission(name, perm);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#removeGroupPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of a group |
 **perm** | **String**| Name of a valid permission |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGroupName"></a>
# **updateGroupName**
> updateGroupName(name, name2)

Rename group

Rename a specified group.

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UsergroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UsergroupApi apiInstance = new UsergroupApi();
String name = "name_example"; // String | 
String name2 = "name_example"; // String | New name of the group
try {
    apiInstance.updateGroupName(name, name2);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupApi#updateGroupName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **name2** | **String**| New name of the group |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

