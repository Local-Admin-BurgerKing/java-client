# RestaurantApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEmployee**](RestaurantApi.md#addEmployee) | **POST** /restaurant/{number}/employees | Add Employee
[**addRestaurant**](RestaurantApi.md#addRestaurant) | **POST** /restaurants | Add Restaurant
[**deleteAllRestaurants**](RestaurantApi.md#deleteAllRestaurants) | **DELETE** /restaurants | Delete All Restaurants
[**deleteRestaurant**](RestaurantApi.md#deleteRestaurant) | **DELETE** /restaurant/{number} | Delete Restaurant
[**editRestaurant**](RestaurantApi.md#editRestaurant) | **PATCH** /restaurant/{number} | Edit Restaurant
[**getAllEmployees**](RestaurantApi.md#getAllEmployees) | **GET** /restaurant/{number}/employees | Get All Employees
[**getAllRestaurants**](RestaurantApi.md#getAllRestaurants) | **GET** /restaurants | Get All Restaurants
[**getRestaurant**](RestaurantApi.md#getRestaurant) | **GET** /restaurant/{number} | Get Restaurant
[**removeAllEmployees**](RestaurantApi.md#removeAllEmployees) | **DELETE** /restaurant/{number}/employees | Remove All Employees
[**removeEmployee**](RestaurantApi.md#removeEmployee) | **DELETE** /restaurant/{number}/employee/{email} | Remove Employee
[**replaceRestaurant**](RestaurantApi.md#replaceRestaurant) | **PUT** /restaurant/{number} | Replace Restaurant

<a name="addEmployee"></a>
# **addEmployee**
> addEmployee(number, body)

Add Employee

Adds a new user to the restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Integer number = 56; // Integer | number of the restaurant
String body = "body_example"; // String | The employee to add
try {
    apiInstance.addEmployee(number, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#addEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| number of the restaurant |
 **body** | [**String**](String.md)| The employee to add | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRestaurant"></a>
# **addRestaurant**
> addRestaurant()

Add Restaurant

Adds a new restaurant to the Restaurant list

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
try {
    apiInstance.addRestaurant();
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#addRestaurant");
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

<a name="deleteAllRestaurants"></a>
# **deleteAllRestaurants**
> deleteAllRestaurants()

Delete All Restaurants

Deletes all saved information about all restaurants

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
try {
    apiInstance.deleteAllRestaurants();
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#deleteAllRestaurants");
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

<a name="deleteRestaurant"></a>
# **deleteRestaurant**
> deleteRestaurant(number)

Delete Restaurant

Deletes an existing restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Integer number = 56; // Integer | number of the restaurant
try {
    apiInstance.deleteRestaurant(number);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#deleteRestaurant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| number of the restaurant |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editRestaurant"></a>
# **editRestaurant**
> Paths1restaurantsgetresponses200contentapplication1jsonschemaitemsoneOf1 editRestaurant(number, body)

Edit Restaurant

Edit specific columns of a restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Integer number = 56; // Integer | number of the restaurant
Restaurantoptional body = new Restaurantoptional(); // Restaurantoptional | The columns that have to be added
try {
    Paths1restaurantsgetresponses200contentapplication1jsonschemaitemsoneOf1 result = apiInstance.editRestaurant(number, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#editRestaurant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| number of the restaurant |
 **body** | [**Restaurantoptional**](Restaurantoptional.md)| The columns that have to be added | [optional]

### Return type

[**Paths1restaurantsgetresponses200contentapplication1jsonschemaitemsoneOf1**](Paths1restaurantsgetresponses200contentapplication1jsonschemaitemsoneOf1.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllEmployees"></a>
# **getAllEmployees**
> List&lt;String&gt; getAllEmployees(number)

Get All Employees

Get all users from a restaurant

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Integer number = 56; // Integer | number of the restaurant
try {
    List<String> result = apiInstance.getAllEmployees(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#getAllEmployees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| number of the restaurant |

### Return type

**List&lt;String&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllRestaurants"></a>
# **getAllRestaurants**
> List&lt;Object&gt; getAllRestaurants(wholeData)

Get All Restaurants

Get all restaurants

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getAllRestaurants(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#getAllRestaurants");
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

<a name="getRestaurant"></a>
# **getRestaurant**
> Object getRestaurant(number, wholeData)

Get Restaurant

Gets the restaurant by the sended ID

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Integer number = 56; // Integer | number of the restaurant
Boolean wholeData = true; // Boolean | Also get sub path informations
try {
    Object result = apiInstance.getRestaurant(number, wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#getRestaurant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| number of the restaurant |
 **wholeData** | **Boolean**| Also get sub path informations | [optional]

### Return type

**Object**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeAllEmployees"></a>
# **removeAllEmployees**
> removeAllEmployees(number)

Remove All Employees

Remove all users from the restaurant so there are no employees anymore

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Integer number = 56; // Integer | number of the restaurant
try {
    apiInstance.removeAllEmployees(number);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#removeAllEmployees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| number of the restaurant |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeEmployee"></a>
# **removeEmployee**
> removeEmployee(number, email)

Remove Employee

Removes an user from the restaurant so its no employee there anymore

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Integer number = 56; // Integer | number of the restaurant
String email = "email_example"; // String | mail of the user
try {
    apiInstance.removeEmployee(number, email);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#removeEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| number of the restaurant |
 **email** | **String**| mail of the user |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceRestaurant"></a>
# **replaceRestaurant**
> replaceRestaurant(number)

Replace Restaurant

Replaces an already existing restaurant by a new one

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.RestaurantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

RestaurantApi apiInstance = new RestaurantApi();
Integer number = 56; // Integer | number of the restaurant
try {
    apiInstance.replaceRestaurant(number);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantApi#replaceRestaurant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **Integer**| number of the restaurant |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

