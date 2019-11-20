# ColumnApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addColumn**](ColumnApi.md#addColumn) | **POST** /column | Add Column
[**deleteColumn**](ColumnApi.md#deleteColumn) | **DELETE** /columns/{name} | Delete Column
[**deleteColumns**](ColumnApi.md#deleteColumns) | **DELETE** /column | Delete All Columns
[**editColumn**](ColumnApi.md#editColumn) | **PATCH** /columns/{name} | Edit Column
[**getAllColumns**](ColumnApi.md#getAllColumns) | **GET** /column | Get All Columns
[**getColumn**](ColumnApi.md#getColumn) | **GET** /columns/{name} | Get Column Data
[**replaceColumn**](ColumnApi.md#replaceColumn) | **PUT** /columns/{name} | Replace Column

<a name="addColumn"></a>
# **addColumn**
> addColumn(body)

Add Column

Adds a new column to the column list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
Column body = new Column(); // Column | The column to add
try {
    apiInstance.addColumn(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#addColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Column**](Column.md)| The column to add | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteColumn"></a>
# **deleteColumn**
> deleteColumn(name)

Delete Column

Deletes an existing column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
String name = "name_example"; // String | The name of the column one wants to get
try {
    apiInstance.deleteColumn(name);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#deleteColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the column one wants to get |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteColumns"></a>
# **deleteColumns**
> deleteColumns()

Delete All Columns

Deletes all saved information about the columns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
try {
    apiInstance.deleteColumns();
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#deleteColumns");
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

<a name="editColumn"></a>
# **editColumn**
> editColumn(name, body)

Edit Column

Edit specific values of a column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
String name = "name_example"; // String | The name of the column one wants to get
Columnoptional body = new Columnoptional(); // Columnoptional | The columns that have to be added
try {
    apiInstance.editColumn(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#editColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the column one wants to get |
 **body** | [**Columnoptional**](Columnoptional.md)| The columns that have to be added | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllColumns"></a>
# **getAllColumns**
> List&lt;Object&gt; getAllColumns(wholeData)

Get All Columns

Get all columns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getAllColumns(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#getAllColumns");
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

<a name="getColumn"></a>
# **getColumn**
> Column1 getColumn(name)

Get Column Data

Gets the column by the sended name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
String name = "name_example"; // String | The name of the column one wants to get
try {
    Column1 result = apiInstance.getColumn(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#getColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the column one wants to get |

### Return type

[**Column1**](Column1.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceColumn"></a>
# **replaceColumn**
> replaceColumn(name, body)

Replace Column

Replaces an already existing column by a new one

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ColumnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

ColumnApi apiInstance = new ColumnApi();
String name = "name_example"; // String | The name of the column one wants to get
Column2 body = new Column2(); // Column2 | The column to replace with.
> The nameattribute is ignored
try {
    apiInstance.replaceColumn(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ColumnApi#replaceColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the column one wants to get |
 **body** | [**Column2**](Column2.md)| The column to replace with.
&gt; The nameattribute is ignored | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

