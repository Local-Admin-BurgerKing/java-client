# FormulasApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDailyformula**](FormulasApi.md#addDailyformula) | **POST** /dailyformulas | Add Dailyformula
[**addOther**](FormulasApi.md#addOther) | **POST** /dailyformula/{name}/others | Add Other
[**deleteAllDailyformulas**](FormulasApi.md#deleteAllDailyformulas) | **DELETE** /dailyformulas | Delete All Dailyformulas
[**deleteDailyformula**](FormulasApi.md#deleteDailyformula) | **DELETE** /dailyformula/{name} | Delete Dailyformula
[**editDailyformula**](FormulasApi.md#editDailyformula) | **PATCH** /dailyformula/{name} | Edit Dailyformula
[**getAllDailyformulas**](FormulasApi.md#getAllDailyformulas) | **GET** /dailyformulas | Get All Dailyformulas
[**getAllOthers**](FormulasApi.md#getAllOthers) | **GET** /dailyformula/{name}/others | Get All Others
[**getDailyformula**](FormulasApi.md#getDailyformula) | **GET** /dailyformula/{name} | Get Dailyformula
[**removeAllOthers**](FormulasApi.md#removeAllOthers) | **DELETE** /dailyformula/{name}/others | Delete All Others
[**removeOther**](FormulasApi.md#removeOther) | **DELETE** /dailyformula/{name}/other/{other} | Delete Other
[**replaceDailyformula**](FormulasApi.md#replaceDailyformula) | **PUT** /dailyformula/{name} | Replace Dailyformula

<a name="addDailyformula"></a>
# **addDailyformula**
> addDailyformula()

Add Dailyformula

Adds a new Dailyformula to the column list

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
try {
    apiInstance.addDailyformula();
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#addDailyformula");
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

<a name="addOther"></a>
# **addOther**
> addOther(name, body)

Add Other

Adds an other dailyformulas/columns/salary level

### Example
```java
// Import classes:
//import com.localadmin.ApiException;
//import com.localadmin.api.FormulasApi;


FormulasApi apiInstance = new FormulasApi();
String name = "name_example"; // String | The name of the dailyformula one wants to get
String body = "body_example"; // String | Add other dailyformula or column
try {
    apiInstance.addOther(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#addOther");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyformula one wants to get |
 **body** | [**String**](String.md)| Add other dailyformula or column | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllDailyformulas"></a>
# **deleteAllDailyformulas**
> deleteAllDailyformulas()

Delete All Dailyformulas

Deletes all Dailyformulas

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
try {
    apiInstance.deleteAllDailyformulas();
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#deleteAllDailyformulas");
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

<a name="deleteDailyformula"></a>
# **deleteDailyformula**
> deleteDailyformula(name)

Delete Dailyformula

Deletes an existing Dailyformula

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
String name = "name_example"; // String | The name of the dailyformula that should get handled
try {
    apiInstance.deleteDailyformula(name);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#deleteDailyformula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyformula that should get handled |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editDailyformula"></a>
# **editDailyformula**
> editDailyformula(name, body)

Edit Dailyformula

Edit specific columns of a Dailyformula

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
String name = "name_example"; // String | The name of the dailyformula that should get handled
Object body = null; // Object | The columns that have to be added
try {
    apiInstance.editDailyformula(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#editDailyformula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyformula that should get handled |
 **body** | [**Object**](Object.md)| The columns that have to be added | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllDailyformulas"></a>
# **getAllDailyformulas**
> List&lt;Object&gt; getAllDailyformulas(wholeData)

Get All Dailyformulas

Get all Dailyformulas

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getAllDailyformulas(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#getAllDailyformulas");
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

Gets all other dailyformulas/columns/salary level

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
String name = "name_example"; // String | The name of the dailyformula one wants to get
try {
    List<String> result = apiInstance.getAllOthers(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#getAllOthers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyformula one wants to get |

### Return type

**List&lt;String&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDailyformula"></a>
# **getDailyformula**
> Object getDailyformula(name, wholeData)

Get Dailyformula

Gets the Dailyformula by the name

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
String name = "name_example"; // String | The name of the dailyformula that should get handled
Boolean wholeData = true; // Boolean | Also get data from subpaths which are referenced by this dailyformula
try {
    Object result = apiInstance.getDailyformula(name, wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#getDailyformula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyformula that should get handled |
 **wholeData** | **Boolean**| Also get data from subpaths which are referenced by this dailyformula | [optional]

### Return type

**Object**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeAllOthers"></a>
# **removeAllOthers**
> removeAllOthers(name)

Delete All Others

Deletes an other dailyformulas/columns/salary level

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
String name = "name_example"; // String | The name of the dailyformula one wants to get
try {
    apiInstance.removeAllOthers(name);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#removeAllOthers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyformula one wants to get |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeOther"></a>
# **removeOther**
> removeOther(name, other)

Delete Other

Deletes a \&quot;other\&quot; from the daily formula  a other is a column (column/formula/salary level) which is appended to the formula  eg. &gt; v1: 12 v2: 7 other: 1,2,4 calculation Symbol &#x3D; + results in 12 + 7 + 1 + 2 + 4

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
String name = "name_example"; // String | The name of the dailyformula one wants to get
String other = "other_example"; // String | The name of a \"other\" one wants to get
try {
    apiInstance.removeOther(name, other);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#removeOther");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyformula one wants to get |
 **other** | **String**| The name of a \&quot;other\&quot; one wants to get |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceDailyformula"></a>
# **replaceDailyformula**
> replaceDailyformula(name)

Replace Dailyformula

Replaces an already existing Dailyformula by a new one

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.FormulasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

FormulasApi apiInstance = new FormulasApi();
String name = "name_example"; // String | The name of the dailyformula that should get handled
try {
    apiInstance.replaceDailyformula(name);
} catch (ApiException e) {
    System.err.println("Exception when calling FormulasApi#replaceDailyformula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the dailyformula that should get handled |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

