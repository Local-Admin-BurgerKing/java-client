# SettingsApi

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReciver**](SettingsApi.md#addReciver) | **PUT** /email/settings/recivers | Add Reciver
[**editEmailSetting**](SettingsApi.md#editEmailSetting) | **PATCH** /email/settings | Edit Email Setting
[**getEmailSettings**](SettingsApi.md#getEmailSettings) | **GET** /email/settings | Get Email Settings
[**getRecivers**](SettingsApi.md#getRecivers) | **GET** /email/settings/recivers | Get Reciver List
[**removeReciver**](SettingsApi.md#removeReciver) | **DELETE** /email/settings/reciver/{reciver} | Remove reciver
[**removeRecivers**](SettingsApi.md#removeRecivers) | **DELETE** /email/settings/recivers | Remove Recivers

<a name="addReciver"></a>
# **addReciver**
> addReciver(email)

Add Reciver

Adds a reciver to the email list

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

SettingsApi apiInstance = new SettingsApi();
String email = "email_example"; // String | The email to add
try {
    apiInstance.addReciver(email);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#addReciver");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The email to add |

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editEmailSetting"></a>
# **editEmailSetting**
> editEmailSetting(body)

Edit Email Setting

Edit one email setting

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

SettingsApi apiInstance = new SettingsApi();
Emailsettings body = new Emailsettings(); // Emailsettings | The new Email settings
try {
    apiInstance.editEmailSetting(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#editEmailSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Emailsettings**](Emailsettings.md)| The new Email settings | [optional]

### Return type

null (empty response body)

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSettings"></a>
# **getEmailSettings**
> Object getEmailSettings(wholeData)

Get Email Settings

Returns all email-settings   &gt; At the moment returns a array with one entry as the OAS model does not works

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

SettingsApi apiInstance = new SettingsApi();
Boolean wholeData = true; // Boolean | Inclue all sub data and never return Pointers/References/IDs
try {
    Object result = apiInstance.getEmailSettings(wholeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getEmailSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wholeData** | **Boolean**| Inclue all sub data and never return Pointers/References/IDs | [optional]

### Return type

**Object**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecivers"></a>
# **getRecivers**
> List&lt;String&gt; getRecivers()

Get Reciver List

Returns the list of email addresses which should be mailed by the mail bot

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

SettingsApi apiInstance = new SettingsApi();
try {
    List<String> result = apiInstance.getRecivers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getRecivers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[User_Auth](../README.md#User_Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeReciver"></a>
# **removeReciver**
> removeReciver(reciver)

Remove reciver

Removes the reciver from the list

### Example
```java
// Import classes:
//import com.localadmin.ApiException;
//import com.localadmin.api.SettingsApi;


SettingsApi apiInstance = new SettingsApi();
String reciver = "reciver_example"; // String | The email adress of the reciver to remiove
try {
    apiInstance.removeReciver(reciver);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#removeReciver");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reciver** | **String**| The email adress of the reciver to remiove |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeRecivers"></a>
# **removeRecivers**
> removeRecivers()

Remove Recivers

Remove all recivers from the list

### Example
```java
// Import classes:
//import com.localadmin.ApiClient;
//import com.localadmin.ApiException;
//import com.localadmin.Configuration;
//import com.localadmin.auth.*;
//import com.localadmin.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: User_Auth
ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
User_Auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//User_Auth.setApiKeyPrefix("Token");

SettingsApi apiInstance = new SettingsApi();
try {
    apiInstance.removeRecivers();
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#removeRecivers");
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

