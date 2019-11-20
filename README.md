# swagger-java-client

rest-api
- API version: 1.1.0
  - Build date: 2019-11-20T15:33:44.001Z[GMT]

An api to fetch manipulate and enter data to the Local Admin service. All Responses can be done with JSON and XML where JSON is the default. You can change the response by setting the content-type header. The downside of our XML is that we do not provide XLS for the Responses


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ColumnApi;

import java.io.File;
import java.util.*;

public class ColumnApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ColumnApi;

import java.io.File;
import java.util.*;

public class ColumnApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ColumnApi;

import java.io.File;
import java.util.*;

public class ColumnApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ColumnApi;

import java.io.File;
import java.util.*;

public class ColumnApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ColumnApi;

import java.io.File;
import java.util.*;

public class ColumnApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ColumnApi;

import java.io.File;
import java.util.*;

public class ColumnApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ColumnApi;

import java.io.File;
import java.util.*;

public class ColumnApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/local-admin-api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ColumnApi* | [**addColumn**](docs/ColumnApi.md#addColumn) | **POST** /column | Add Column
*ColumnApi* | [**deleteColumn**](docs/ColumnApi.md#deleteColumn) | **DELETE** /columns/{name} | Delete Column
*ColumnApi* | [**deleteColumns**](docs/ColumnApi.md#deleteColumns) | **DELETE** /column | Delete All Columns
*ColumnApi* | [**editColumn**](docs/ColumnApi.md#editColumn) | **PATCH** /columns/{name} | Edit Column
*ColumnApi* | [**getAllColumns**](docs/ColumnApi.md#getAllColumns) | **GET** /column | Get All Columns
*ColumnApi* | [**getColumn**](docs/ColumnApi.md#getColumn) | **GET** /columns/{name} | Get Column Data
*ColumnApi* | [**replaceColumn**](docs/ColumnApi.md#replaceColumn) | **PUT** /columns/{name} | Replace Column
*DataApi* | [**addSalaryLevel**](docs/DataApi.md#addSalaryLevel) | **POST** /salary-levels | Add Salary Level
*DataApi* | [**getSalaryLevels**](docs/DataApi.md#getSalaryLevels) | **GET** /salary-levels | GET salary levels
*FiltersApi* | [**createFilter**](docs/FiltersApi.md#createFilter) | **POST** /filters | Create filter
*FiltersApi* | [**deleteFilter**](docs/FiltersApi.md#deleteFilter) | **DELETE** /filter/{name} | Remove filter
*FiltersApi* | [**getAllFilters**](docs/FiltersApi.md#getAllFilters) | **GET** /filters | Get all filters
*FiltersApi* | [**getFilter**](docs/FiltersApi.md#getFilter) | **GET** /filter/{name} | Get Filter
*FiltersApi* | [**getFilterColumns**](docs/FiltersApi.md#getFilterColumns) | **GET** /filter/{name}/columns | Get filter columns
*FiltersApi* | [**removeAllFilters**](docs/FiltersApi.md#removeAllFilters) | **DELETE** /filters | Remove all filters
*FiltersApi* | [**renameFilter**](docs/FiltersApi.md#renameFilter) | **PATCH** /filter/{name} | Rename filter
*FiltersApi* | [**replaceFilterColumns**](docs/FiltersApi.md#replaceFilterColumns) | **PATCH** /filter/{name}/columns | Replace filter columns
*FormularsApi* | [**addDailyFormular**](docs/FormularsApi.md#addDailyFormular) | **POST** /daily-formulars | Add DailyFormular
*FormularsApi* | [**addOther**](docs/FormularsApi.md#addOther) | **POST** /daily-formular/{name}/others | Add Other
*FormularsApi* | [**deleteAllDailyFormulars**](docs/FormularsApi.md#deleteAllDailyFormulars) | **DELETE** /daily-formulars | Delete All DailyFormulars
*FormularsApi* | [**deleteAllOthers**](docs/FormularsApi.md#deleteAllOthers) | **DELETE** /daily-formular/{name}/others | Delete All Others
*FormularsApi* | [**deleteDailyFormular**](docs/FormularsApi.md#deleteDailyFormular) | **DELETE** /daily-formular/{name} | Delete DailyFormular
*FormularsApi* | [**deleteOther**](docs/FormularsApi.md#deleteOther) | **DELETE** /daily-formular/{name}/other/{other} | Delete Other
*FormularsApi* | [**editDailyFormular**](docs/FormularsApi.md#editDailyFormular) | **PATCH** /daily-formular/{name} | Edit DailyFormular
*FormularsApi* | [**getAllDailyFormulars**](docs/FormularsApi.md#getAllDailyFormulars) | **GET** /daily-formulars | Get All DailyFormulars
*FormularsApi* | [**getAllOthers**](docs/FormularsApi.md#getAllOthers) | **GET** /daily-formular/{name}/others | Get All Others
*FormularsApi* | [**getDailyFormular**](docs/FormularsApi.md#getDailyFormular) | **GET** /daily-formular/{name} | Get DailyFormular
*FormularsApi* | [**replaceDailyFormular**](docs/FormularsApi.md#replaceDailyFormular) | **PUT** /daily-formular/{name} | Replace DailyFormular
*PayrollApi* | [**addSalaryChange**](docs/PayrollApi.md#addSalaryChange) | **POST** /salary-level/{name}/payroll/{restaurant}/changes | Add Salary Level Change
*PayrollApi* | [**addSalaryLevel**](docs/PayrollApi.md#addSalaryLevel) | **POST** /salary-levels | Add Salary Level
*PayrollApi* | [**deletePayroll**](docs/PayrollApi.md#deletePayroll) | **DELETE** /salary-levels | Delete Payroll
*PayrollApi* | [**deleteRestaurantChanges**](docs/PayrollApi.md#deleteRestaurantChanges) | **DELETE** /payroll/{restaurant}/changes | Delete Restaurant Changes
*PayrollApi* | [**editChange**](docs/PayrollApi.md#editChange) | **PATCH** /salary-level/{name}/payroll/{restaurant}/change/{date} | Edit Change Value
*PayrollApi* | [**getChangesByLevelAndDate**](docs/PayrollApi.md#getChangesByLevelAndDate) | **GET** /salary-level/{salary-level}/changes/{change-date} | Get Changes For Date
*PayrollApi* | [**getLatestChange**](docs/PayrollApi.md#getLatestChange) | **GET** /salary-level/{name}/payroll/{restaurant}/change/latest | Get Latest Salary Change
*PayrollApi* | [**getPayroll**](docs/PayrollApi.md#getPayroll) | **GET** /salary-level/{name}/payroll/{restaurant}/changes | Get Payroll
*PayrollApi* | [**getPayrollInformation**](docs/PayrollApi.md#getPayrollInformation) | **HEAD** /salary-level/{name}/payroll/{restaurant} | Payroll Information
*PayrollApi* | [**getRestaurantChangesAtDate**](docs/PayrollApi.md#getRestaurantChangesAtDate) | **GET** /payroll/{restaurant}/changes/{date} | Get Changes For Restaurant At Date
*PayrollApi* | [**getRestaurantChanges_**](docs/PayrollApi.md#getRestaurantChanges_) | **GET** /payroll/{restaurant}/changes | Get Changes For Restaurant
*PayrollApi* | [**getSalaryChange**](docs/PayrollApi.md#getSalaryChange) | **GET** /salary-level/{name}/payroll/{restaurant}/change/{date} | Get Salary Level Change
*PayrollApi* | [**getSalaryLevel**](docs/PayrollApi.md#getSalaryLevel) | **GET** /salary-level/{salary-level} | Get Salary Level
*PayrollApi* | [**getSalaryLevelChanges**](docs/PayrollApi.md#getSalaryLevelChanges) | **GET** /salary-level/{salary-level}/changes | Get Salary Level Changes
*PayrollApi* | [**getSalaryLevels**](docs/PayrollApi.md#getSalaryLevels) | **GET** /salary-levels | GET salary levels
*PayrollApi* | [**removeChange**](docs/PayrollApi.md#removeChange) | **DELETE** /salary-level/{name}/payroll/{restaurant}/change/{date} | Delete Change
*PayrollApi* | [**removePayroll**](docs/PayrollApi.md#removePayroll) | **DELETE** /salary-level/{name}/payroll/{restaurant}/changes | Delete Payroll
*PayrollApi* | [**removeSalaryLevel**](docs/PayrollApi.md#removeSalaryLevel) | **DELETE** /salary-level/{salary-level} | Delete Salary Level
*PayrollApi* | [**renameSalaryLevel**](docs/PayrollApi.md#renameSalaryLevel) | **PATCH** /salary-level/{salary-level} | Rename Salary Level
*PayrollApi* | [**resetSalaryLevel**](docs/PayrollApi.md#resetSalaryLevel) | **DELETE** /salary-level/{salary-level}/changes | Reset Salary Level
*PermissionsApi* | [**getAllPermissions**](docs/PermissionsApi.md#getAllPermissions) | **GET** /permissions | Get all permissions
*PermissionsApi* | [**getPermission**](docs/PermissionsApi.md#getPermission) | **GET** /permission/{name} | Get permission
*RestaurantApi* | [**addEmployee**](docs/RestaurantApi.md#addEmployee) | **POST** /restaurant/{number}/employees | Add Employee
*RestaurantApi* | [**addRestaurant**](docs/RestaurantApi.md#addRestaurant) | **POST** /restaurants | Add Restaurant
*RestaurantApi* | [**deleteAllRestaurants**](docs/RestaurantApi.md#deleteAllRestaurants) | **DELETE** /restaurants | Delete All Restaurants
*RestaurantApi* | [**deleteRestaurant**](docs/RestaurantApi.md#deleteRestaurant) | **DELETE** /restaurant/{number} | Delete Restaurant
*RestaurantApi* | [**editRestaurant**](docs/RestaurantApi.md#editRestaurant) | **PATCH** /restaurant/{number} | Edit Restaurant
*RestaurantApi* | [**getAllEmployees**](docs/RestaurantApi.md#getAllEmployees) | **GET** /restaurant/{number}/employees | Get All Employees
*RestaurantApi* | [**getAllRestaurants**](docs/RestaurantApi.md#getAllRestaurants) | **GET** /restaurants | Get All Restaurants
*RestaurantApi* | [**getRestaurant**](docs/RestaurantApi.md#getRestaurant) | **GET** /restaurant/{number} | Get Restaurant
*RestaurantApi* | [**removeAllEmployees**](docs/RestaurantApi.md#removeAllEmployees) | **DELETE** /restaurant/{number}/employees | Remove All Employees
*RestaurantApi* | [**removeEmployee**](docs/RestaurantApi.md#removeEmployee) | **DELETE** /restaurant/{number}/employee/{email} | Remove Employee
*RestaurantApi* | [**replaceRestaurant**](docs/RestaurantApi.md#replaceRestaurant) | **PUT** /restaurant/{number} | Replace Restaurant
*SettingsApi* | [**addReciver**](docs/SettingsApi.md#addReciver) | **PUT** /email/settings/recivers | Add Reciver
*SettingsApi* | [**editEmailSetting**](docs/SettingsApi.md#editEmailSetting) | **PATCH** /email/settings | Edit Email Setting
*SettingsApi* | [**getEmailSettings**](docs/SettingsApi.md#getEmailSettings) | **GET** /email/settings | Get Email Settings
*SettingsApi* | [**getRecivers**](docs/SettingsApi.md#getRecivers) | **GET** /email/settings/recivers | Get Reciver List
*SettingsApi* | [**removeReciver**](docs/SettingsApi.md#removeReciver) | **DELETE** /email/settings/reciver/{reciver} | Remove reciver
*SettingsApi* | [**removeRecivers**](docs/SettingsApi.md#removeRecivers) | **DELETE** /email/settings/recivers | Remove Recivers
*TablesApi* | [**addDailyReport**](docs/TablesApi.md#addDailyReport) | **PUT** /tables/{restaurant}/reports | Add daily report
*TablesApi* | [**getAllReports**](docs/TablesApi.md#getAllReports) | **GET** /tables | Get reports
*TablesApi* | [**getDateReports**](docs/TablesApi.md#getDateReports) | **GET** /tables/reports/{date} | Get all daily reports
*TablesApi* | [**getRestaurantDateColumn**](docs/TablesApi.md#getRestaurantDateColumn) | **GET** /tables/{restaurant}/report/{date}/data/{column} | Get daily report column
*TablesApi* | [**getRestaurantDateReport**](docs/TablesApi.md#getRestaurantDateReport) | **GET** /tables/{restaurant}/report/{date} | Get daily report
*TablesApi* | [**getRestaurantReports**](docs/TablesApi.md#getRestaurantReports) | **GET** /tables/{restaurant}/reports | Get restaurant&#x27;s reports
*TablesApi* | [**removeReport**](docs/TablesApi.md#removeReport) | **DELETE** /tables/{restaurant}/report/{date} | Remove daily report
*TablesApi* | [**replaceDailyReport**](docs/TablesApi.md#replaceDailyReport) | **PATCH** /tables/{restaurant}/report/{date} | Replace daily report
*TablesApi* | [**updateReportColumn**](docs/TablesApi.md#updateReportColumn) | **PATCH** /tables/{restaurant}/report/{date}/data/{column} | Edit daily report
*UsergroupApi* | [**addGroupPermission**](docs/UsergroupApi.md#addGroupPermission) | **PUT** /group/{name}/permissions | Add group permission
*UsergroupApi* | [**createGroup**](docs/UsergroupApi.md#createGroup) | **POST** /groups | Create group
*UsergroupApi* | [**getAllGroups**](docs/UsergroupApi.md#getAllGroups) | **GET** /groups | Get all groups
*UsergroupApi* | [**getGroupPermissions**](docs/UsergroupApi.md#getGroupPermissions) | **GET** /group/{name}/permissions | Get group permissions
*UsergroupApi* | [**removeAllGroups**](docs/UsergroupApi.md#removeAllGroups) | **DELETE** /groups | Remove all groups
*UsergroupApi* | [**removeAllPermissions**](docs/UsergroupApi.md#removeAllPermissions) | **DELETE** /group/{name}/permissions | Remove group&#x27;s permissions
*UsergroupApi* | [**removeGroup**](docs/UsergroupApi.md#removeGroup) | **DELETE** /group/{name} | Remove group
*UsergroupApi* | [**removeGroupPermission**](docs/UsergroupApi.md#removeGroupPermission) | **DELETE** /group/{name}/permissions/{perm} | Remove specific group-permission
*UsergroupApi* | [**updateGroupName**](docs/UsergroupApi.md#updateGroupName) | **PATCH** /group/{name} | Rename group
*UsersApi* | [**authenticate**](docs/UsersApi.md#authenticate) | **GET** /auth | Authentication

## Documentation for Models

 - [Apikeywrapper](docs/Apikeywrapper.md)
 - [Column](docs/Column.md)
 - [Column1](docs/Column1.md)
 - [Column2](docs/Column2.md)
 - [Columnoptional](docs/Columnoptional.md)
 - [DataEntry](docs/DataEntry.md)
 - [Emailsettings](docs/Emailsettings.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Filter](docs/Filter.md)
 - [Filter1](docs/Filter1.md)
 - [Filter2](docs/Filter2.md)
 - [FilterWrapper](docs/FilterWrapper.md)
 - [FilterWrapper1](docs/FilterWrapper1.md)
 - [Group](docs/Group.md)
 - [Payroll](docs/Payroll.md)
 - [Permission](docs/Permission.md)
 - [Report](docs/Report.md)
 - [Report1](docs/Report1.md)
 - [ReportWithReference](docs/ReportWithReference.md)
 - [Restaurant](docs/Restaurant.md)
 - [Restaurant1](docs/Restaurant1.md)
 - [Restaurant2](docs/Restaurant2.md)
 - [Restaurantoptional](docs/Restaurantoptional.md)
 - [SalaryChange](docs/SalaryChange.md)
 - [SalaryChange1](docs/SalaryChange1.md)
 - [SalaryInformation](docs/SalaryInformation.md)
 - [SalaryLevel](docs/SalaryLevel.md)
 - [TimeFilter](docs/TimeFilter.md)
 - [TimeFilter1](docs/TimeFilter1.md)
 - [TimeFilter2](docs/TimeFilter2.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### User_Auth

- **Type**: API key
- **API key parameter name**: X-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

nbrugger@student.tgm.ac.at
