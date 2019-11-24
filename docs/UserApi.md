# UserApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](UserApi.md#addUser) | **POST** /users | Add User
[**changePasswordByToken**](UserApi.md#changePasswordByToken) | **PATCH** /user/resetpassword/{mail}/token | Change Password By Token
[**deleteAllUsers**](UserApi.md#deleteAllUsers) | **DELETE** /users | Delete All Users
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{mail} | Delete User
[**editUser**](UserApi.md#editUser) | **PATCH** /user/{mail} | Edit User
[**getAllUsers**](UserApi.md#getAllUsers) | **GET** /users | Get All Users
[**getUser**](UserApi.md#getUser) | **GET** /user/{mail} | Get User
[**replaceUser**](UserApi.md#replaceUser) | **PUT** /user/{mail} | Replace User

<a name="addUser"></a>
# **addUser**
> addUser()

Add User

Adds a user to the user list

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    apiInstance.addUser();
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUser");
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

<a name="changePasswordByToken"></a>
# **changePasswordByToken**
> changePasswordByToken(mail, token, newPassword)

Change Password By Token

Changes the password if you have the correct token

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String mail = "mail_example"; // String | mail of the user
String token = "token_example"; // String | The token which is needed to set a new password
String newPassword = "newPassword_example"; // String | The new password
try {
    apiInstance.changePasswordByToken(mail, token, newPassword);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#changePasswordByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | **String**| mail of the user |
 **token** | **String**| The token which is needed to set a new password |
 **newPassword** | **String**| The new password |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAllUsers"></a>
# **deleteAllUsers**
> deleteAllUsers()

Delete All Users

Deletes all the users in the system

### Example
```java
// Import classes:
//import com.localadmin.ApiException;
//import com.localadmin.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    apiInstance.deleteAllUsers();
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteAllUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(mail)

Delete User

Deletes a user

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String mail = "mail_example"; // String | mail of the user
try {
    apiInstance.deleteUser(mail);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | **String**| mail of the user |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editUser"></a>
# **editUser**
> editUser(mail, body, oldPassword)

Edit User

Edit specific values of the user &gt; The password can only be edited by the user itself.

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String mail = "mail_example"; // String | mail of the user
Useroptional body = new Useroptional(); // Useroptional | The user values
String oldPassword = "oldPassword_example"; // String | Only needed if password gets changed
try {
    apiInstance.editUser(mail, body, oldPassword);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#editUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | **String**| mail of the user |
 **body** | [**Useroptional**](Useroptional.md)| The user values | [optional]
 **oldPassword** | **String**| Only needed if password gets changed | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllUsers"></a>
# **getAllUsers**
> List&lt;Object&gt; getAllUsers(wholeData)

Get All Users

Gets all users. 

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Boolean wholeData = true; // Boolean | if true you will get all the data instead of only reference names
try {
    List<Object> result = apiInstance.getAllUsers(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAllUsers");
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

<a name="getUser"></a>
# **getUser**
> Paths1usersgetresponses200contentapplication1jsonschemaitemsoneOf1 getUser(mail)

Get User

Gets user by delivered name

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String mail = "mail_example"; // String | mail of the user
try {
    Paths1usersgetresponses200contentapplication1jsonschemaitemsoneOf1 result = apiInstance.getUser(mail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | **String**| mail of the user |

### Return type

[**Paths1usersgetresponses200contentapplication1jsonschemaitemsoneOf1**](Paths1usersgetresponses200contentapplication1jsonschemaitemsoneOf1.md)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceUser"></a>
# **replaceUser**
> replaceUser(mail)

Replace User

Replaces user by a new one &gt; You cannot change the password of the user this way

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String mail = "mail_example"; // String | mail of the user
try {
    apiInstance.replaceUser(mail);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#replaceUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | **String**| mail of the user |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

