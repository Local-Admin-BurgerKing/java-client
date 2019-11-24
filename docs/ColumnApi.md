# ColumnApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllColumns**](ColumnApi.md#getAllColumns) | **GET** /columns | Get All Columns
[**getColumnType**](ColumnApi.md#getColumnType) | **GET** /column/type/{name} | Get Typeof Column
[**isColumnInUse**](ColumnApi.md#isColumnInUse) | **GET** /column/inuse/{name} | Is Column in Use

<a name="getAllColumns"></a>
# **getAllColumns**
> List&lt;Paths1filter17Bname7D1columnsgetresponses200contentapplication1jsonschemaitems&gt; getAllColumns()

Get All Columns

Gets all columns (dailycolumn, dailyformula, salarylevel)

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
try {
    List<Paths1filter17Bname7D1columnsgetresponses200contentapplication1jsonschemaitems> result = apiInstance.getAllColumns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#getAllColumns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Paths1filter17Bname7D1columnsgetresponses200contentapplication1jsonschemaitems&gt;**](Paths1filter17Bname7D1columnsgetresponses200contentapplication1jsonschemaitems.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getColumnType"></a>
# **getColumnType**
> InlineResponse200 getColumnType(name)

Get Typeof Column

Gets the type of the column

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
String name = "name_example"; // String | name of the column
try {
    InlineResponse200 result = apiInstance.getColumnType(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#getColumnType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the column |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="isColumnInUse"></a>
# **isColumnInUse**
> InlineResponse2001 isColumnInUse(name)

Is Column in Use

Tells if the column in use or not

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
String name = "name_example"; // String | Name of the column
try {
    InlineResponse2001 result = apiInstance.isColumnInUse(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#isColumnInUse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the column |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

