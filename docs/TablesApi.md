# TablesApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDailyReport**](TablesApi.md#addDailyReport) | **PUT** /tables/{restaurant}/reports | Add daily report
[**getAllReports**](TablesApi.md#getAllReports) | **GET** /tables | Get reports
[**getDateReports**](TablesApi.md#getDateReports) | **GET** /tables/reports/{date} | Get all daily reports
[**getRestaurantDateColumn**](TablesApi.md#getRestaurantDateColumn) | **GET** /tables/{restaurant}/report/{date}/data/{column} | Get daily report column
[**getRestaurantDateReport**](TablesApi.md#getRestaurantDateReport) | **GET** /tables/{restaurant}/report/{date} | Get daily report
[**getRestaurantReports**](TablesApi.md#getRestaurantReports) | **GET** /tables/{restaurant}/reports | Get restaurant&#x27;s reports
[**removeReport**](TablesApi.md#removeReport) | **DELETE** /tables/{restaurant}/report/{date} | Remove daily report
[**replaceDailyReport**](TablesApi.md#replaceDailyReport) | **PATCH** /tables/{restaurant}/report/{date} | Replace daily report
[**updateReportColumn**](TablesApi.md#updateReportColumn) | **PATCH** /tables/{restaurant}/report/{date}/data/{column} | Edit daily report

<a name="addDailyReport"></a>
# **addDailyReport**
> addDailyReport(restaurant)

Add daily report

Add a new data-entry/report to the restaurants table

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
Integer restaurant = 56; // Integer | ID of a restaurant
try {
    apiInstance.addDailyReport(restaurant);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#addDailyReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| ID of a restaurant |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllReports"></a>
# **getAllReports**
> List&lt;Object&gt; getAllReports(body, wholeData)

Get reports

Retrieve all entries from all restaurants

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
FilterWrapper body = new FilterWrapper(); // FilterWrapper | The filter can either be a column-filter or a time-filter
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getAllReports(body, wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#getAllReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterWrapper**](FilterWrapper.md)| The filter can either be a column-filter or a time-filter | [optional]
 **wholeData** | **Boolean**| if true you will get all the data instead of only reference names | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDateReports"></a>
# **getDateReports**
> List&lt;ReportWithReference&gt; getDateReports(date, wholeData)

Get all daily reports

Retrieve all reports of a specific day from every restaurants

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
LocalDate date = new LocalDate(); // LocalDate | Date in the format 12.12.2001
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<ReportWithReference> result = apiInstance.getDateReports(date, wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#getDateReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **LocalDate**| Date in the format 12.12.2001 |
 **wholeData** | **Boolean**| if true you will get all the data instead of only reference names | [optional]

### Return type

[**List&lt;ReportWithReference&gt;**](ReportWithReference.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRestaurantDateColumn"></a>
# **getRestaurantDateColumn**
> Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems getRestaurantDateColumn(restaurant, date, column)

Get daily report column

Get the value for the specified column, on the specified day, in the specified restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
Integer restaurant = 56; // Integer | ID of a restaurant
LocalDate date = new LocalDate(); // LocalDate | Date in the format 12.12.2001
String column = "column_example"; // String | Name of column, which exists in the given report
try {
    Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems result = apiInstance.getRestaurantDateColumn(restaurant, date, column);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#getRestaurantDateColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| ID of a restaurant |
 **date** | **LocalDate**| Date in the format 12.12.2001 |
 **column** | **String**| Name of column, which exists in the given report |

### Return type

[**Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems**](Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRestaurantDateReport"></a>
# **getRestaurantDateReport**
> Paths1tables17Brestaurant7D1reportsgetresponses200contentapplication1jsonschemaitemsoneOf0items getRestaurantDateReport(restaurant, date)

Get daily report

Get the report on the given day of the specified restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
Integer restaurant = 56; // Integer | ID of a restaurant
LocalDate date = new LocalDate(); // LocalDate | Date in the format (12.12.2001)
try {
    Paths1tables17Brestaurant7D1reportsgetresponses200contentapplication1jsonschemaitemsoneOf0items result = apiInstance.getRestaurantDateReport(restaurant, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#getRestaurantDateReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| ID of a restaurant |
 **date** | **LocalDate**| Date in the format (12.12.2001) |

### Return type

[**Paths1tables17Brestaurant7D1reportsgetresponses200contentapplication1jsonschemaitemsoneOf0items**](Paths1tables17Brestaurant7D1reportsgetresponses200contentapplication1jsonschemaitemsoneOf0items.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRestaurantReports"></a>
# **getRestaurantReports**
> List&lt;Object&gt; getRestaurantReports(restaurant, wholeData)

Get restaurant&#x27;s reports

Get all entries from a specific restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
Integer restaurant = 56; // Integer | ID of a restaurant
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getRestaurantReports(restaurant, wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#getRestaurantReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| ID of a restaurant |
 **wholeData** | **Boolean**| if true you will get all the data instead of only reference names | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeReport"></a>
# **removeReport**
> removeReport(restaurant, date)

Remove daily report

Remove the data entry / report on the given day

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
Integer restaurant = 56; // Integer | ID of a restaurant
LocalDate date = new LocalDate(); // LocalDate | Date in the format (12.12.2001)
try {
    apiInstance.removeReport(restaurant, date);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#removeReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| ID of a restaurant |
 **date** | **LocalDate**| Date in the format (12.12.2001) |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceDailyReport"></a>
# **replaceDailyReport**
> List&lt;DataEntry&gt; replaceDailyReport(restaurant, date, body, _return)

Replace daily report

Update the report on the given day, of the given restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
Integer restaurant = 56; // Integer | ID of a restaurant
LocalDate date = new LocalDate(); // LocalDate | Date in the format (12.12.2001)
List<Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems> body = Arrays.asList(new Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems()); // List<Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems> | Represents a list of columns and associated values
Boolean _return = true; // Boolean | If true, the changed report will be returned
try {
    List<DataEntry> result = apiInstance.replaceDailyReport(restaurant, date, body, _return);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#replaceDailyReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| ID of a restaurant |
 **date** | **LocalDate**| Date in the format (12.12.2001) |
 **body** | [**List&lt;Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems&gt;**](Paths1tables17Brestaurant7D1report17Bdate7Dpatchresponses206contentapplication1jsonschemaitems.md)| Represents a list of columns and associated values | [optional]
 **_return** | **Boolean**| If true, the changed report will be returned | [optional]

### Return type

[**List&lt;DataEntry&gt;**](DataEntry.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReportColumn"></a>
# **updateReportColumn**
> updateReportColumn(restaurant, date, column, value)

Edit daily report

Update the value of the given column, on the given day, in a specfied restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.TablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

TablesApi apiInstance = new TablesApi();
Integer restaurant = 56; // Integer | ID of a restaurant
LocalDate date = new LocalDate(); // LocalDate | Date in the format 12.12.2001
String column = "column_example"; // String | Name of column, which exists in the given report
Integer value = 56; // Integer | New value for the given column
try {
    apiInstance.updateReportColumn(restaurant, date, column, value);
} catch (ApiException e) {
    System.err.println("Exception when calling TablesApi#updateReportColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restaurant** | **Integer**| ID of a restaurant |
 **date** | **LocalDate**| Date in the format 12.12.2001 |
 **column** | **String**| Name of column, which exists in the given report |
 **value** | **Integer**| New value for the given column |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

