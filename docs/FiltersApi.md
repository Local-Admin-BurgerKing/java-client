# FiltersApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFilter**](FiltersApi.md#createFilter) | **POST** /filters | Create filter
[**deleteFilter**](FiltersApi.md#deleteFilter) | **DELETE** /filter/{name} | Remove filter
[**getAllFilters**](FiltersApi.md#getAllFilters) | **GET** /filters | Get all filters
[**getFilter**](FiltersApi.md#getFilter) | **GET** /filter/{name} | Get Filter
[**getFilterColumns**](FiltersApi.md#getFilterColumns) | **GET** /filter/{name}/columns | Get filter columns
[**removeAllFilters**](FiltersApi.md#removeAllFilters) | **DELETE** /filters | Remove all filters
[**renameFilter**](FiltersApi.md#renameFilter) | **PATCH** /filter/{name} | Rename filter
[**replaceFilterColumns**](FiltersApi.md#replaceFilterColumns) | **PATCH** /filter/{name}/columns | Replace filter columns

<a name="createFilter"></a>
# **createFilter**
> createFilter(body)

Create filter

Create new filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FiltersApi apiInstance = new FiltersApi();
Filter body = new Filter(); // Filter | Filter, consisting of an unique name and a list of columns/formulas.
try {
    apiInstance.createFilter(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#createFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Filter**](Filter.md)| Filter, consisting of an unique name and a list of columns/formulas. | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFilter"></a>
# **deleteFilter**
> deleteFilter(name)

Remove filter

Delete the specified Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FiltersApi apiInstance = new FiltersApi();
String name = "name_example"; // String | Reference name of a valid filter
try {
    apiInstance.deleteFilter(name);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#deleteFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Reference name of a valid filter |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllFilters"></a>
# **getAllFilters**
> List&lt;Object&gt; getAllFilters(wholeData)

Get all filters

The list of all filters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FiltersApi apiInstance = new FiltersApi();
Boolean wholeData = true; // Boolean | True to get sub objects and lists recursively
try {
    List<Object> result = apiInstance.getAllFilters(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#getAllFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wholeData** | **Boolean**| True to get sub objects and lists recursively | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFilter"></a>
# **getFilter**
> Filter1 getFilter(name)

Get Filter

Get the specified filter and its columes / formulas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FiltersApi apiInstance = new FiltersApi();
String name = "name_example"; // String | Reference name of a valid filter
try {
    Filter1 result = apiInstance.getFilter(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#getFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Reference name of a valid filter |

### Return type

[**Filter1**](Filter1.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFilterColumns"></a>
# **getFilterColumns**
> List&lt;String&gt; getFilterColumns(name)

Get filter columns

Get all the Columns/Formulas of a filter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FiltersApi apiInstance = new FiltersApi();
String name = "name_example"; // String | Reference name of a valid filter
try {
    List<String> result = apiInstance.getFilterColumns(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#getFilterColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Reference name of a valid filter |

### Return type

**List&lt;String&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeAllFilters"></a>
# **removeAllFilters**
> removeAllFilters()

Remove all filters

Remove all filters

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FiltersApi apiInstance = new FiltersApi();
try {
    apiInstance.removeAllFilters();
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#removeAllFilters");
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

<a name="renameFilter"></a>
# **renameFilter**
> renameFilter(name, name2)

Rename filter

Change the name of a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FiltersApi apiInstance = new FiltersApi();
String name = "name_example"; // String | Reference name of a valid filter
String name2 = "name_example"; // String | The new name
try {
    apiInstance.renameFilter(name, name2);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#renameFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Reference name of a valid filter |
 **name2** | **String**| The new name |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceFilterColumns"></a>
# **replaceFilterColumns**
> List&lt;String&gt; replaceFilterColumns(name, body, _return)

Replace filter columns

Replace the list of columns/formulas of the filter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FiltersApi apiInstance = new FiltersApi();
String name = "name_example"; // String | Reference name of a valid filter
List<String> body = Arrays.asList("body_example"); // List<String> | List of the new columns/Formulas
Boolean _return = true; // Boolean | If true the changed entry will be returned
try {
    List<String> result = apiInstance.replaceFilterColumns(name, body, _return);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#replaceFilterColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Reference name of a valid filter |
 **body** | [**List&lt;String&gt;**](String.md)| List of the new columns/Formulas | [optional]
 **_return** | **Boolean**| If true the changed entry will be returned | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

