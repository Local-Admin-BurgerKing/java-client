# FormularsApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDailyFormular**](FormularsApi.md#addDailyFormular) | **POST** /daily-formulars | Add DailyFormular
[**addOther**](FormularsApi.md#addOther) | **POST** /daily-formular/{name}/others | Add Other
[**deleteAllDailyFormulars**](FormularsApi.md#deleteAllDailyFormulars) | **DELETE** /daily-formulars | Delete All DailyFormulars
[**deleteAllOthers**](FormularsApi.md#deleteAllOthers) | **DELETE** /daily-formular/{name}/others | Delete All Others
[**deleteDailyFormular**](FormularsApi.md#deleteDailyFormular) | **DELETE** /daily-formular/{name} | Delete DailyFormular
[**deleteOther**](FormularsApi.md#deleteOther) | **DELETE** /daily-formular/{name}/other/{other} | Delete Other
[**editDailyFormular**](FormularsApi.md#editDailyFormular) | **PATCH** /daily-formular/{name} | Edit DailyFormular
[**getAllDailyFormulars**](FormularsApi.md#getAllDailyFormulars) | **GET** /daily-formulars | Get All DailyFormulars
[**getAllOthers**](FormularsApi.md#getAllOthers) | **GET** /daily-formular/{name}/others | Get All Others
[**getDailyFormular**](FormularsApi.md#getDailyFormular) | **GET** /daily-formular/{name} | Get DailyFormular
[**replaceDailyFormular**](FormularsApi.md#replaceDailyFormular) | **PUT** /daily-formular/{name} | Replace DailyFormular

<a name="addDailyFormular"></a>
# **addDailyFormular**
> addDailyFormular(body)

Add DailyFormular

Adds a new DailyFormular to the column list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
Object body = null; // Object | The DailyFormular to add
try {
    apiInstance.addDailyFormular(body);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#addDailyFormular");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| The DailyFormular to add | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOther"></a>
# **addOther**
> addOther(name, body)

Add Other

Adds an other dailyFormular

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FormularsApi;


FormularsApi apiInstance = new FormularsApi();
String name = "name_example"; // String | The name of the dailyFormular one wants to get
String body = "body_example"; // String | Add other dailyFormular or column
try {
    apiInstance.addOther(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#addOther");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyFormular one wants to get |
 **body** | [**String**](String.md)| Add other dailyFormular or column | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllDailyFormulars"></a>
# **deleteAllDailyFormulars**
> deleteAllDailyFormulars()

Delete All DailyFormulars

Deletes all DailyFormulars

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
try {
    apiInstance.deleteAllDailyFormulars();
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#deleteAllDailyFormulars");
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

<a name="deleteAllOthers"></a>
# **deleteAllOthers**
> deleteAllOthers(name)

Delete All Others

Deletes an other dailyFormular

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
String name = "name_example"; // String | The name of the dailyFormular one wants to get
try {
    apiInstance.deleteAllOthers(name);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#deleteAllOthers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyFormular one wants to get |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDailyFormular"></a>
# **deleteDailyFormular**
> deleteDailyFormular(name)

Delete DailyFormular

Deletes an existing DailyFormular

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
String name = "name_example"; // String | The name of the dailyFormular that should get handled
try {
    apiInstance.deleteDailyFormular(name);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#deleteDailyFormular");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyFormular that should get handled |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOther"></a>
# **deleteOther**
> deleteOther(name, other)

Delete Other

Deletes a \&quot;other\&quot; from the daily formular  a other is a column (column/formular/salary level) which is appended to the formular  eg. &gt; v1: 12 v2: 7 other: 1,2,4 calculation Symbol &#x3D; + results in 12 + 7 + 1 + 2 + 4

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
String name = "name_example"; // String | The name of the dailyFormular one wants to get
String other = "other_example"; // String | The name of a \"other\" one wants to get
try {
    apiInstance.deleteOther(name, other);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#deleteOther");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyFormular one wants to get |
 **other** | **String**| The name of a \&quot;other\&quot; one wants to get |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editDailyFormular"></a>
# **editDailyFormular**
> editDailyFormular(name, body)

Edit DailyFormular

Edit specific columns of a DailyFormular

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
String name = "name_example"; // String | The name of the dailyFormular that should get handled
Object body = null; // Object | The columns that have to be added
try {
    apiInstance.editDailyFormular(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#editDailyFormular");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyFormular that should get handled |
 **body** | [**Object**](Object.md)| The columns that have to be added | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllDailyFormulars"></a>
# **getAllDailyFormulars**
> List&lt;Object&gt; getAllDailyFormulars(wholeData)

Get All DailyFormulars

Get all DailyFormulars

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getAllDailyFormulars(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#getAllDailyFormulars");
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

<a name="getAllOthers"></a>
# **getAllOthers**
> List&lt;String&gt; getAllOthers(name)

Get All Others

Gets all other dailyFormulars

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
String name = "name_example"; // String | The name of the dailyFormular one wants to get
try {
    List<String> result = apiInstance.getAllOthers(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#getAllOthers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyFormular one wants to get |

### Return type

**List&lt;String&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDailyFormular"></a>
# **getDailyFormular**
> Object getDailyFormular(name, wholeData)

Get DailyFormular

Gets the DailyFormular by the name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
String name = "name_example"; // String | The name of the dailyFormular that should get handled
Boolean wholeData = true; // Boolean | Also get data from subpaths which are referenced by this dailyFormular
try {
    Object result = apiInstance.getDailyFormular(name, wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#getDailyFormular");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyFormular that should get handled |
 **wholeData** | **Boolean**| Also get data from subpaths which are referenced by this dailyFormular | [optional]

### Return type

**Object**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceDailyFormular"></a>
# **replaceDailyFormular**
> replaceDailyFormular(name, body)

Replace DailyFormular

Replaces an already existing DailyFormular by a new one

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormularsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormularsApi apiInstance = new FormularsApi();
String name = "name_example"; // String | The name of the dailyFormular that should get handled
Object body = null; // Object | The DailyFormular to replace with.
> The nameattribute will be ignored (you can't replace the name)
try {
    apiInstance.replaceDailyFormular(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling FormularsApi#replaceDailyFormular");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyFormular that should get handled |
 **body** | [**Object**](Object.md)| The DailyFormular to replace with.
&gt; The nameattribute will be ignored (you can&#x27;t replace the name) | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

