# DailycolumnApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDailycolumn**](DailycolumnApi.md#addDailycolumn) | **POST** /dailycolumns | Add Dailycolumn
[**deleteAllDailycolumns**](DailycolumnApi.md#deleteAllDailycolumns) | **DELETE** /dailycolumns | Delete All Dailycolumns
[**deleteDailycolumn**](DailycolumnApi.md#deleteDailycolumn) | **DELETE** /dailycolumn/{name} | Delete Dailycolumn
[**editDailycolumn**](DailycolumnApi.md#editDailycolumn) | **PATCH** /dailycolumn/{name} | Edit Dailycolumn
[**getAllDailycolumns**](DailycolumnApi.md#getAllDailycolumns) | **GET** /dailycolumns | Get All Dailycolumns
[**getDailycolumn**](DailycolumnApi.md#getDailycolumn) | **GET** /dailycolumn/{name} | Get Dailycolumn
[**replaceDailycolumn**](DailycolumnApi.md#replaceDailycolumn) | **PUT** /dailycolumn/{name} | Replace Dailycolumn

<a name="addDailycolumn"></a>
# **addDailycolumn**
> addDailycolumn()

Add Dailycolumn

Adds a new dailycolumn to the dailycolumn list

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.DailycolumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

DailycolumnApi apiInstance = new DailycolumnApi();
try {
    apiInstance.addDailycolumn();
} catch (ApiException e) {
    System.err.println("Exception when calling DailycolumnApi#addDailycolumn");
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

<a name="deleteAllDailycolumns"></a>
# **deleteAllDailycolumns**
> deleteAllDailycolumns()

Delete All Dailycolumns

Deletes all saved information about the dailycolumns

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.DailycolumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

DailycolumnApi apiInstance = new DailycolumnApi();
try {
    apiInstance.deleteAllDailycolumns();
} catch (ApiException e) {
    System.err.println("Exception when calling DailycolumnApi#deleteAllDailycolumns");
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

<a name="deleteDailycolumn"></a>
# **deleteDailycolumn**
> deleteDailycolumn(name)

Delete Dailycolumn

Deletes an existing dailycolumn

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.DailycolumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

DailycolumnApi apiInstance = new DailycolumnApi();
String name = "name_example"; // String | The name of the dailycolumn one wants to get
try {
    apiInstance.deleteDailycolumn(name);
} catch (ApiException e) {
    System.err.println("Exception when calling DailycolumnApi#deleteDailycolumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailycolumn one wants to get |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editDailycolumn"></a>
# **editDailycolumn**
> editDailycolumn(name, body)

Edit Dailycolumn

Edit specific dailycolumns of a column

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.DailycolumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

DailycolumnApi apiInstance = new DailycolumnApi();
String name = "name_example"; // String | The name of the dailycolumn one wants to get
Object body = null; // Object | The dailycolumns that have to be added
try {
    apiInstance.editDailycolumn(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DailycolumnApi#editDailycolumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailycolumn one wants to get |
 **body** | [**Object**](Object.md)| The dailycolumns that have to be added | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllDailycolumns"></a>
# **getAllDailycolumns**
> List&lt;Object&gt; getAllDailycolumns(wholeData)

Get All Dailycolumns

Get all dailycolumns

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.DailycolumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

DailycolumnApi apiInstance = new DailycolumnApi();
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getAllDailycolumns(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DailycolumnApi#getAllDailycolumns");
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

<a name="getDailycolumn"></a>
# **getDailycolumn**
> Paths1dailycolumnsgetresponses200contentapplication1jsonschemaitemsoneOf1 getDailycolumn(name)

Get Dailycolumn

Gets the dailycolumn by the sended name

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.DailycolumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

DailycolumnApi apiInstance = new DailycolumnApi();
String name = "name_example"; // String | The name of the dailycolumn one wants to get
try {
    Paths1dailycolumnsgetresponses200contentapplication1jsonschemaitemsoneOf1 result = apiInstance.getDailycolumn(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DailycolumnApi#getDailycolumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailycolumn one wants to get |

### Return type

[**Paths1dailycolumnsgetresponses200contentapplication1jsonschemaitemsoneOf1**](Paths1dailycolumnsgetresponses200contentapplication1jsonschemaitemsoneOf1.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceDailycolumn"></a>
# **replaceDailycolumn**
> replaceDailycolumn(name)

Replace Dailycolumn

Replaces an already existing dailycolumn by a new one

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.DailycolumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

DailycolumnApi apiInstance = new DailycolumnApi();
String name = "name_example"; // String | The name of the dailycolumn one wants to get
try {
    apiInstance.replaceDailycolumn(name);
} catch (ApiException e) {
    System.err.println("Exception when calling DailycolumnApi#replaceDailycolumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailycolumn one wants to get |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

