# PayrollApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSalaryChange**](PayrollApi.md#addSalaryChange) | **POST** /salary-level/{name}/payroll/{restaurant}/changes | Add Salary Level Change
[**addSalaryLevel**](PayrollApi.md#addSalaryLevel) | **POST** /salary-levels | Add Salary Level
[**deletePayroll**](PayrollApi.md#deletePayroll) | **DELETE** /salary-levels | Delete Payroll
[**deleteRestaurantChanges**](PayrollApi.md#deleteRestaurantChanges) | **DELETE** /payroll/{restaurant}/changes | Delete Restaurant Changes
[**editChange**](PayrollApi.md#editChange) | **PATCH** /salary-level/{name}/payroll/{restaurant}/change/{date} | Edit Change Value
[**getChangesByLevelAndDate**](PayrollApi.md#getChangesByLevelAndDate) | **GET** /salary-level/{salary-level}/changes/{change-date} | Get Changes For Date
[**getLatestChange**](PayrollApi.md#getLatestChange) | **GET** /salary-level/{name}/payroll/{restaurant}/change/latest | Get Latest Salary Change
[**getPayroll**](PayrollApi.md#getPayroll) | **GET** /salary-level/{name}/payroll/{restaurant}/changes | Get Payroll
[**getPayrollInformation**](PayrollApi.md#getPayrollInformation) | **HEAD** /salary-level/{name}/payroll/{restaurant} | Payroll Information
[**getRestaurantChangesAtDate**](PayrollApi.md#getRestaurantChangesAtDate) | **GET** /payroll/{restaurant}/changes/{date} | Get Changes For Restaurant At Date
[**getRestaurantChanges_**](PayrollApi.md#getRestaurantChanges_) | **GET** /payroll/{restaurant}/changes | Get Changes For Restaurant
[**getSalaryChange**](PayrollApi.md#getSalaryChange) | **GET** /salary-level/{name}/payroll/{restaurant}/change/{date} | Get Salary Level Change
[**getSalaryLevel**](PayrollApi.md#getSalaryLevel) | **GET** /salary-level/{salary-level} | Get Salary Level
[**getSalaryLevelChanges**](PayrollApi.md#getSalaryLevelChanges) | **GET** /salary-level/{salary-level}/changes | Get Salary Level Changes
[**getSalaryLevels**](PayrollApi.md#getSalaryLevels) | **GET** /salary-levels | GET salary levels
[**removeChange**](PayrollApi.md#removeChange) | **DELETE** /salary-level/{name}/payroll/{restaurant}/change/{date} | Delete Change
[**removePayroll**](PayrollApi.md#removePayroll) | **DELETE** /salary-level/{name}/payroll/{restaurant}/changes | Delete Payroll
[**removeSalaryLevel**](PayrollApi.md#removeSalaryLevel) | **DELETE** /salary-level/{salary-level} | Delete Salary Level
[**renameSalaryLevel**](PayrollApi.md#renameSalaryLevel) | **PATCH** /salary-level/{salary-level} | Rename Salary Level
[**resetSalaryLevel**](PayrollApi.md#resetSalaryLevel) | **DELETE** /salary-level/{salary-level}/changes | Reset Salary Level

<a name="addSalaryChange"></a>
# **addSalaryChange**
> addSalaryChange(name, restaurant)

Add Salary Level Change

Records a salary level Change

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | Name of the salary level
Integer restaurant = 56; // Integer | The ID of the restaurants
try {
    apiInstance.addSalaryChange(name, restaurant);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#addSalaryChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the salary level |
 **restaurant** | **Integer**| The ID of the restaurants |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | The name of the new salaray level
try {
    apiInstance.addSalaryLevel(name);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#addSalaryLevel");
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

<a name="deletePayroll"></a>
# **deletePayroll**
> deletePayroll()

Delete Payroll

Deletes the whole payroll

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
try {
    apiInstance.deletePayroll();
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#deletePayroll");
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

<a name="deleteRestaurantChanges"></a>
# **deleteRestaurantChanges**
> deleteRestaurantChanges(restaurant)

Delete Restaurant Changes

Delete all changes for this restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
Integer restaurant = 56; // Integer | The id of the restaurants
try {
    apiInstance.deleteRestaurantChanges(restaurant);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#deleteRestaurantChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| The id of the restaurants |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editChange"></a>
# **editChange**
> editChange(name, restaurant, date, newValue)

Edit Change Value

Edit the change value

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | The name of the salary level
Integer restaurant = 56; // Integer | The Id of the restaurant
LocalDate date = new LocalDate(); // LocalDate | The date of the change
Integer newValue = 56; // Integer | The value of the change (unit: `cents`)
try {
    apiInstance.editChange(name, restaurant, date, newValue);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#editChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the salary level |
 **restaurant** | **Integer**| The Id of the restaurant |
 **date** | **LocalDate**| The date of the change |
 **newValue** | **Integer**| The value of the change (unit: &#x60;cents&#x60;) | [enum: ]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChangesByLevelAndDate"></a>
# **getChangesByLevelAndDate**
> List&lt;List&lt;Object&gt;&gt; getChangesByLevelAndDate(salaryLevel, changeDate, includeEmpty)

Get Changes For Date

The changes for all restaurants on this date

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String salaryLevel = "salaryLevel_example"; // String | The name of the salary level
LocalDate changeDate = new LocalDate(); // LocalDate | The date of the change or the date to get the column for
Boolean includeEmpty = true; // Boolean | if true all restaurants are returned instead of only the one with changes on this date.  > The value for these restaurants will be the last value
try {
    List<List<Object>> result = apiInstance.getChangesByLevelAndDate(salaryLevel, changeDate, includeEmpty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getChangesByLevelAndDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salaryLevel** | **String**| The name of the salary level |
 **changeDate** | **LocalDate**| The date of the change or the date to get the column for |
 **includeEmpty** | **Boolean**| if true all restaurants are returned instead of only the one with changes on this date.  &gt; The value for these restaurants will be the last value | [optional]

### Return type

[**List&lt;List&lt;Object&gt;&gt;**](List.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLatestChange"></a>
# **getLatestChange**
> Object getLatestChange(name, restaurant)

Get Latest Salary Change

get the latest column

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | The name of the salary level to fetch
Integer restaurant = 56; // Integer | The ID of the restaurant
try {
    Object result = apiInstance.getLatestChange(name, restaurant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getLatestChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the salary level to fetch |
 **restaurant** | **Integer**| The ID of the restaurant |

### Return type

**Object**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPayroll"></a>
# **getPayroll**
> List&lt;Paths1salaryLevel17Bname7D1payroll17Brestaurant7D1change1latestgetresponses200contentapplication1jsonschemaallOf0&gt; getPayroll(name, restaurant)

Get Payroll

Returns all salary level changes at this salary level and resaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | Name of the salary level
Integer restaurant = 56; // Integer | The ID of the restaurants
try {
    List<Paths1salaryLevel17Bname7D1payroll17Brestaurant7D1change1latestgetresponses200contentapplication1jsonschemaallOf0> result = apiInstance.getPayroll(name, restaurant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getPayroll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the salary level |
 **restaurant** | **Integer**| The ID of the restaurants |

### Return type

[**List&lt;Paths1salaryLevel17Bname7D1payroll17Brestaurant7D1change1latestgetresponses200contentapplication1jsonschemaallOf0&gt;**](Paths1salaryLevel17Bname7D1payroll17Brestaurant7D1change1latestgetresponses200contentapplication1jsonschemaallOf0.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPayrollInformation"></a>
# **getPayrollInformation**
> SalaryInformation getPayrollInformation(name, restaurant)

Payroll Information

Get some usefull information about the payroll of this restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | The name of the salary level to get the informations of
Integer restaurant = 56; // Integer | the ID of the restaurant
try {
    SalaryInformation result = apiInstance.getPayrollInformation(name, restaurant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getPayrollInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the salary level to get the informations of |
 **restaurant** | **Integer**| the ID of the restaurant |

### Return type

[**SalaryInformation**](SalaryInformation.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRestaurantChangesAtDate"></a>
# **getRestaurantChangesAtDate**
> List&lt;Object&gt; getRestaurantChangesAtDate(restaurant, date)

Get Changes For Restaurant At Date

All salary changes at a certain date for a restaurant 

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
LocalDate restaurant = new LocalDate(); // LocalDate | The ID of the restaurant to get the change from
LocalDate date = new LocalDate(); // LocalDate | The date at which the change was done
try {
    List<Object> result = apiInstance.getRestaurantChangesAtDate(restaurant, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getRestaurantChangesAtDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **LocalDate**| The ID of the restaurant to get the change from |
 **date** | **LocalDate**| The date at which the change was done |

### Return type

**List&lt;Object&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRestaurantChanges_"></a>
# **getRestaurantChanges_**
> List&lt;Paths1payroll17Brestaurant7D1changes17Bdate7Dgetresponses200contentapplication1jsonschemaitems&gt; getRestaurantChanges_(restaurant, body)

Get Changes For Restaurant

Get all changes for the restaurant 

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
Integer restaurant = 56; // Integer | The id of the restaurants
TimeFilter body = new TimeFilter(); // TimeFilter | A filter to only obtain changes at a certain time frame
try {
    List<Paths1payroll17Brestaurant7D1changes17Bdate7Dgetresponses200contentapplication1jsonschemaitems> result = apiInstance.getRestaurantChanges_(restaurant, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getRestaurantChanges_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| The id of the restaurants |
 **body** | [**TimeFilter**](TimeFilter.md)| A filter to only obtain changes at a certain time frame | [optional]

### Return type

[**List&lt;Paths1payroll17Brestaurant7D1changes17Bdate7Dgetresponses200contentapplication1jsonschemaitems&gt;**](Paths1payroll17Brestaurant7D1changes17Bdate7Dgetresponses200contentapplication1jsonschemaitems.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSalaryChange"></a>
# **getSalaryChange**
> Paths1salaryLevel17Bname7D1payroll17Brestaurant7D1change1latestgetresponses200contentapplication1jsonschemaallOf0 getSalaryChange(name, restaurant, date, actualUse)

Get Salary Level Change

Get the salary change of a restaurant on a certain date

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | The name of the salary level
Integer restaurant = 56; // Integer | The Id of the restaurant
LocalDate date = new LocalDate(); // LocalDate | The date of the change
Boolean actualUse = true; // Boolean | If *true* it returns the column used to calculate with at this day.  ### Example  15.4 -> 2300  12.6 -> 2400  if *false* you can only request 15.4 and 12.6  if *true* you can request every date after 15.4 and you will get 2300 for every date after 15.4 and 2400 for every date after 12.6 
try {
    Paths1salaryLevel17Bname7D1payroll17Brestaurant7D1change1latestgetresponses200contentapplication1jsonschemaallOf0 result = apiInstance.getSalaryChange(name, restaurant, date, actualUse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getSalaryChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the salary level |
 **restaurant** | **Integer**| The Id of the restaurant |
 **date** | **LocalDate**| The date of the change |
 **actualUse** | **Boolean**| If *true* it returns the column used to calculate with at this day.  ### Example  15.4 -&gt; 2300  12.6 -&gt; 2400  if *false* you can only request 15.4 and 12.6  if *true* you can request every date after 15.4 and you will get 2300 for every date after 15.4 and 2400 for every date after 12.6  | [optional]

### Return type

[**Paths1salaryLevel17Bname7D1payroll17Brestaurant7D1change1latestgetresponses200contentapplication1jsonschemaallOf0**](Paths1salaryLevel17Bname7D1payroll17Brestaurant7D1change1latestgetresponses200contentapplication1jsonschemaallOf0.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSalaryLevel"></a>
# **getSalaryLevel**
> SalaryLevel getSalaryLevel(salaryLevel)

Get Salary Level

Returns a specific salary level  &gt; the &#x60;whole_data&#x60; flag is missing  as salary level has no *primitive* attributes other than **name**

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String salaryLevel = "salaryLevel_example"; // String | The name of the salary level
try {
    SalaryLevel result = apiInstance.getSalaryLevel(salaryLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getSalaryLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salaryLevel** | **String**| The name of the salary level |

### Return type

[**SalaryLevel**](SalaryLevel.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSalaryLevelChanges"></a>
# **getSalaryLevelChanges**
> List&lt;Object&gt; getSalaryLevelChanges(salaryLevel, body, wholeData)

Get Salary Level Changes

All changes of the salary level **across all restaurants!**

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String salaryLevel = "salaryLevel_example"; // String | The name of the salary level
TimeFilter1 body = new TimeFilter1(); // TimeFilter1 | A filter to only obtain certain results
Boolean wholeData = true; // Boolean | If true data will be returned instead of references (or dates in this case)
try {
    List<Object> result = apiInstance.getSalaryLevelChanges(salaryLevel, body, wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getSalaryLevelChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salaryLevel** | **String**| The name of the salary level |
 **body** | [**TimeFilter1**](TimeFilter1.md)| A filter to only obtain certain results | [optional]
 **wholeData** | **Boolean**| If true data will be returned instead of references (or dates in this case) | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSalaryLevels"></a>
# **getSalaryLevels**
> List&lt;Object&gt; getSalaryLevels(wholeData)

GET salary levels

lists all salary levels

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getSalaryLevels(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#getSalaryLevels");
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

<a name="removeChange"></a>
# **removeChange**
> removeChange(name, restaurant, date)

Delete Change

Removes the change

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | The name of the salary level
Integer restaurant = 56; // Integer | The Id of the restaurant
LocalDate date = new LocalDate(); // LocalDate | The date of the change
try {
    apiInstance.removeChange(name, restaurant, date);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#removeChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the salary level |
 **restaurant** | **Integer**| The Id of the restaurant |
 **date** | **LocalDate**| The date of the change |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removePayroll"></a>
# **removePayroll**
> removePayroll(name, restaurant)

Delete Payroll

Deletes all changes for this restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String name = "name_example"; // String | Name of the salary level
Integer restaurant = 56; // Integer | The ID of the restaurants
try {
    apiInstance.removePayroll(name, restaurant);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#removePayroll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the salary level |
 **restaurant** | **Integer**| The ID of the restaurants |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSalaryLevel"></a>
# **removeSalaryLevel**
> removeSalaryLevel(salaryLevel)

Delete Salary Level

Removes a salary level and all of its changes

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String salaryLevel = "salaryLevel_example"; // String | The name of the salary level
try {
    apiInstance.removeSalaryLevel(salaryLevel);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#removeSalaryLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salaryLevel** | **String**| The name of the salary level |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="renameSalaryLevel"></a>
# **renameSalaryLevel**
> renameSalaryLevel(salaryLevel, newName)

Rename Salary Level

Edit Salary level name  Also changes all references.

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String salaryLevel = "salaryLevel_example"; // String | The name of the salary level
String newName = "newName_example"; // String | The new name for the salary level
try {
    apiInstance.renameSalaryLevel(salaryLevel, newName);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#renameSalaryLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salaryLevel** | **String**| The name of the salary level |
 **newName** | **String**| The new name for the salary level |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetSalaryLevel"></a>
# **resetSalaryLevel**
> resetSalaryLevel(salaryLevel)

Reset Salary Level

Removes all changes (*from all restaurants*) from the salary level

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.PayrollApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

PayrollApi apiInstance = new PayrollApi();
String salaryLevel = "salaryLevel_example"; // String | The name of the salary level
try {
    apiInstance.resetSalaryLevel(salaryLevel);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#resetSalaryLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salaryLevel** | **String**| The name of the salary level |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

