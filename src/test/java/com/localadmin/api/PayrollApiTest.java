/*
 * rest-api
 * An api to fetch manipulate and enter data to the Local Admin service. All Responses can be done with JSON and XML where JSON is the default. You can change the response by setting the content-type header. The downside of our XML is that we do not provide XLS for the Responses
 *
 * OpenAPI spec version: 1.1.0
 * Contact: nbrugger@student.tgm.ac.at
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.localadmin.api;

import com.google.gson.internal.LinkedTreeMap;
import com.localadmin.ApiClient;
import com.localadmin.ApiException;
import com.localadmin.Configuration;
import com.localadmin.auth.ApiKeyAuth;
import com.localadmin.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * API tests for PayrollApi
 */
public class PayrollApiTest {

    private final PayrollApi api = new PayrollApi();
    private final RestaurantApi restaurantApi = new RestaurantApi();
    private ApiKeyAuth User_Auth;
    private String key;
    private boolean resetPayrollTableBefore = true; // should it clear the table for each Test so if one fails the
    // others does not fail
    private Restaurant restaurant1;
    private Restaurant restaurant2;

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsersApi usersApi = new UsersApi();
        try {
            Apikeywrapper wrapper = usersApi.authenticate("admin@kingrestaurants.at", "12345678");
            key = wrapper.getKey();
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Login failed from Admin");
        }


        // Configure API key authorization: User_Auth
        User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
        User_Auth.setApiKey(key);


        if (resetPayrollTableBefore) {
            try {
                api.deletePayroll();
                restaurantApi.deleteAllRestaurants();
            } catch (ApiException e) {
                e.printStackTrace();
                fail(e.getResponseBody());
            }
        }


        restaurant1 = new Restaurant();
        restaurant1.setNumber(0);
        restaurant1.setLocation("Hietzinger Kai 173, 1130 Wien");
        restaurant1.setName("San Giovanni");
        restaurant1.setSollvalue(0.42f);

        restaurant2 = new Restaurant();
        restaurant2.setNumber(1);
        restaurant2.setLocation("Wo Anders");
        restaurant2.setName("Gestern geritten heute mit Fritten!");
        restaurant2.setSollvalue(0.10f);

        try {
            restaurantApi.addRestaurant(restaurant1);
            restaurantApi.addRestaurant(restaurant2);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Fail when adding Restaurants!");
        }


    }

    @After
    public void clean() {
        try {
            restaurantApi.deleteAllRestaurants();
            api.deletePayroll();
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Fail when deleting Restaurant!" + e.getCode());
        }
    }

    /**
     * Add Salary Level Change Get Salary Level Change Delete Salary Level Change
     * Add Salary Level Get Salary Level Delete Salary Level
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void salaryChangeAddGetDeleteTest() throws ApiException {
        List<Payroll> payrolls = new ArrayList<Payroll>();
        payrolls.add(new Payroll());

        SalaryLevel salaryLevel1 = new SalaryLevel();
        salaryLevel1.setName("salaryLevel1");
        salaryLevel1.setPayrolls(payrolls);

        SalaryLevel salaryLevel2 = new SalaryLevel();
        salaryLevel2.setName("salaryLevel2");
        salaryLevel2.setPayrolls(payrolls);

        // Add SalaryLevel
        try {
            api.addSalaryLevel(salaryLevel1.getName());
            api.addSalaryLevel(salaryLevel2.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryLevel");
        }

        // Add SalaryLevel again which should not work
        try {
            api.addSalaryLevel(salaryLevel1.getName());
            fail("SalaryLevel got added again!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code is wrong", 409, e.getCode());
        }

        // Get SalaryLevel
        try {
            SalaryLevel salaryLevel = api.getSalaryLevel(salaryLevel1.getName());
            assertEquals("SalaryLevel name is not correct!", salaryLevel1.getName(), salaryLevel.getName());
            assertEquals("SalaryLevel payroll is not correct!", 0, salaryLevel.getPayrolls());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryLevel");
        }

        // Get SalaryLevels (wholedata false)
        try {
            List<Object> salaryLevel = api.getSalaryLevels(false);
            assertEquals("There is not the expected SalaryLevel amount!", 2, salaryLevel.size());
            assertEquals("SalaryLevel name is not correct!", salaryLevel1.getName(),
                    ((SalaryLevel) salaryLevel.get(0)).getName());
            assertEquals("SalaryLevel name is not correct!", salaryLevel2.getName(),
                    ((SalaryLevel) salaryLevel.get(1)).getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryLevel");
        }

        SalaryChange1 salaryChange1 = new SalaryChange1();
        salaryChange1.setDate(LocalDate.now());

        SalaryChange1 salaryChange2 = new SalaryChange1();
        salaryChange2.setDate(LocalDate.ofYearDay(2019, 353));
        salaryChange2.setValue(-6);

        // Add SalaryChange which should fail cause of a missing value
        try {
            api.addSalaryChange(salaryLevel1.getName(), 0, salaryChange1);
            fail("Should not work cause of missing value!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }

        salaryChange1.setValue(3);

        // Add SalaryChange which should work now
        try {
            api.addSalaryChange(salaryLevel1.getName(), 0, salaryChange1);
            api.addSalaryChange(salaryLevel1.getName(), 1, salaryChange2);

            api.addSalaryChange(salaryLevel2.getName(), 0, salaryChange1);
            api.addSalaryChange(salaryLevel2.getName(), 0, salaryChange2);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryChange!");
        }

        // Add SalaryChange again which should not work because it is already inside
        try {
            api.addSalaryChange(salaryLevel1.getName(), 0, salaryChange1);
            fail("Should not work because it is already in!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }

        // Get SalaryLevels (wholedata true)
        try {
            List<Object> salaryLevel = api.getSalaryLevels(true);
            assertEquals("There is not the expected SalaryLevel amount!", 2, salaryLevel.size());

            assertEquals("SalaryLevel 0 name is not correct!", salaryLevel1.getName(),
                    ((SalaryLevel) salaryLevel.get(0)).getName());
            assertEquals("SalaryLevel 0 PayRoll size is not correct!", 2,
                    ((SalaryLevel) salaryLevel.get(0)).getPayrolls().size());
            assertEquals("SalaryLevel 0 SalaryChange size in PayRoll 0 is not correct!", 1,
                    ((Payroll) ((SalaryLevel) salaryLevel.get(0)).getPayrolls().get(0)).getChanges().size());
            assertEquals("SalaryLevel 0 SalaryChange size in PayRoll 1 is not correct!", 1,
                    ((Payroll) ((SalaryLevel) salaryLevel.get(0)).getPayrolls().get(1)).getChanges().size());

            assertEquals("SalaryLevel 1 name is not correct!", salaryLevel2.getName(),
                    ((SalaryLevel) salaryLevel.get(1)).getName());
            assertEquals("SalaryLevel 1 PayRoll size is not correct!", 1,
                    ((SalaryLevel) salaryLevel.get(1)).getPayrolls().size());
            assertEquals("SalaryLevel 1 SalaryChange size in PayRoll 0 is not correct!", 2,
                    ((Payroll) ((SalaryLevel) salaryLevel.get(0)).getPayrolls().get(0)).getChanges().size());

        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryLevel");
        }

        // Get SalaryChange
        try {
            SalaryChange salaryChange = api.getSalaryChange(salaryLevel1.getName(), 0, salaryChange1.getDate(), false);
            assertEquals("Wrong Date in SalaryChange!", salaryChange1.getDate(), salaryChange.getDate());
            assertEquals("Wrong Value in SalaryChange!", salaryChange1.getValue(), salaryChange.getValue());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryChange!");
        }

        // Delete SalaryChange
        try {
            api.removeChange(salaryLevel1.getName(), 0, salaryChange1.getDate());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when deleting salaryChange1 from restaurant 0 in salarayLevel1 !");
        }

        // Delete All SalaryChanges from salaryLevel2 in restaurant 0
        try {
            api.removePayroll(salaryLevel2.getName(), 0);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when deleting all SalaryChanges from restaurant 0 in salarayLevel2 !");
        }

        // Delete All SalaryChanges in restaurant 0 no metter which SalaryLevel it
        // belongs too
        try {
            api.deleteRestaurantChanges(0);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when deleting all SalaryChanges from restaurant 0 !");
        }

        // Removing Payroll from restaurant 0
        try {
            api.removePayroll(salaryLevel1.getName(), 0);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removeing Payroll from restaurant 0 !");
        }

        // Delete SalaryLevel
        try {
            api.removeSalaryLevel(salaryLevel1.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removing SalaryLevel");
        }
    }

    /**
     * Edit Change Value
     * <p>
     * Edit the change value
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editChangeTest() throws ApiException {
        List<Payroll> payrolls = new ArrayList<Payroll>();
        payrolls.add(new Payroll());

        SalaryLevel salaryLevel1 = new SalaryLevel();
        salaryLevel1.setName("salaryLevel1");
        salaryLevel1.setPayrolls(payrolls);

        // Add SalaryLevel
        try {
            api.addSalaryLevel(salaryLevel1.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryLevel");
        }

        SalaryChange1 salaryChange1 = new SalaryChange1();
        salaryChange1.setDate(LocalDate.ofYearDay(2019, 353));
        salaryChange1.setValue(-6);

        // Add SalaryChange
        try {
            api.addSalaryChange(salaryLevel1.getName(), 0, salaryChange1);
            fail("Should not work cause of missing value!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }

        // Edit Change Value
        try {
            api.editChange(salaryLevel1.getName(), 0, salaryChange1.getDate(), 4);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when editting change!");
        }

        // Edit Change Value
        try {
            api.editChange(salaryLevel1.getName(), 0, salaryChange1.getDate(), 4);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when editting change!");
        }

        // Get Change Value
        try {
            SalaryChange salaryChange = api.getSalaryChange(salaryLevel1.getName(), 0, salaryChange1.getDate(), false);
            assertEquals("SalaryChange has not the correct value!", 4, salaryChange.getValue().intValue());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when editting change!");
        }

        // Delete SalaryChanges
        try {
            api.deleteRestaurantChanges(0);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removeing Payroll from restaurant 0 !");
        }

        // Delete SalaryLevel
        try {
            api.removeSalaryLevel(salaryLevel1.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removing SalaryLevel");
        }

    }

    /**
     * Get Changes by diffrent ways
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChangesSpecialTest() throws ApiException {
        SalaryLevel salaryLevel1 = new SalaryLevel();
        salaryLevel1.setName("salaryLevel1");

        // Add SalaryLevel
        try {
            api.addSalaryLevel(salaryLevel1.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryLevel");
        }

        SalaryChange1 salaryChange1 = new SalaryChange1();
        salaryChange1.setDate(LocalDate.parse("2019-10-10"));
        salaryChange1.setValue(200);

        // Add SalaryChange
        try {
            api.addSalaryChange(salaryLevel1.getName(), 0, salaryChange1);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryChange");
        }

        // Get SalaryChanges by Level and Date
        try {
            // TODO: Which is Restaurant which is Change???
            List<SalaryChange1> response = api.getChangesByLevelAndDate(salaryLevel1.getName(), salaryChange1.getDate(),
                    true);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryChanges by Level and Date!");
        }

        // Get latest SalaryChange
        try {
            LinkedTreeMap latestChangeMap = (LinkedTreeMap) api.getLatestChange(salaryLevel1.getName(), 0);
            System.out.println(latestChangeMap);
            SalaryChange1 latestChange = new SalaryChange1();
            latestChange.setDate(LocalDate.parse(latestChangeMap.get("date").toString()));
            latestChange.setValue((int) Float.parseFloat(latestChangeMap.get("value").toString()));
            assertEquals("Latest change is not correct!", salaryChange1.toString(), latestChange.toString());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryChanges by Level and Date!");
        }

        // Get SalaryChanges at Date from restaurant
        try {
            List<Object> salaryChanges = api.getRestaurantChangesAtDate(null, salaryChange1.getDate());
            assertEquals("There is not the expected amount of SalaryChanges", 1, salaryChanges.size());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryChanges at Date!");
        }

        // Get SalaryChanges at Date from restaurant
        try {
            TimeFilter timeFilter1 = new TimeFilter();
            timeFilter1.setFrom(LocalDate.MIN);
            timeFilter1.setTo(LocalDate.MAX);

            TimeFilter timeFilter2 = new TimeFilter();
            timeFilter2.setFrom(LocalDate.of(2017, 1, 1));
            timeFilter2.setTo(LocalDate.of(2017, 12, 31));

            List<Object> salaryChanges = api.getRestaurantChanges_(0, timeFilter1);
            assertEquals("There is not the expected amount of SalaryChanges in this restaurant", 1,
                    salaryChanges.size());

            salaryChanges = api.getRestaurantChanges_(0, timeFilter2);
            assertEquals("There is not the expected amount of SalaryChanges in this restaurant", 0,
                    salaryChanges.size());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryChanges between a time!");
        }

        // Get Payroll Information
        try {
            SalaryInformation salaryInfo = api.getPayrollInformation(salaryLevel1.getName(), 0);
            assertEquals("There is not the expected amount of SalaryChanges in this SalaryLevel", 1,
                    salaryInfo.getEntryCount().intValue());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryChanges by Level and Date!");
        }

        // Get SalaryChanges at Date from all restaurants
        try {
            TimeFilter1 timeFilter1 = new TimeFilter1();
            timeFilter1.setFrom(LocalDate.MIN);
            timeFilter1.setTo(LocalDate.MAX);

            List<Object> salaryChangesWholeData = api.getSalaryLevelChanges(salaryLevel1.getName(), timeFilter1, true);
            assertEquals("There is not the expected amount of SalaryChanges in this SalaryLevel", 1,
                    salaryChangesWholeData.size());
            List<Object> salaryChanges = api.getSalaryLevelChanges(salaryLevel1.getName(), timeFilter1, true);
            assertEquals("There is not the expected amount of SalaryChanges in this SalaryLevel", 1,
                    salaryChanges.size());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryChanges by Level and Date!");
        }

        // Delete SalaryChanges
        try {
            api.deleteRestaurantChanges(0);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removeing Payroll from restaurant 0 !");
        }

        // Delete SalaryLevel
        try {
            api.removeSalaryLevel(salaryLevel1.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removing SalaryLevel");
        }
    }

    @Test
    public void salaryLevelRenameEditTest() throws ApiException {
        SalaryLevel salaryLevel1 = new SalaryLevel();
        salaryLevel1.setName("salaryLevelRenameAndReset");

        // Add SalaryLevel
        try {
            api.addSalaryLevel(salaryLevel1.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryLevel");
        }

        // Rename SalaryLevel
        try {
            api.renameSalaryLevel(salaryLevel1.getName(), "salaryLevelReset");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when renaming SalaryLevel");
        }

        SalaryChange1 salaryChange1 = new SalaryChange1();
        salaryChange1.setDate(LocalDate.now());
        salaryChange1.setValue(6);

        // Add SalaryChange
        try {
            api.addSalaryChange(salaryLevel1.getName(), 0, salaryChange1);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryChange");
        }

        // Reset SalaryLevel Name
        try {
            api.resetSalaryLevel(salaryLevel1.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when resetting SalaryLevel");
        }

        // Get SalaryLevel and test if payRoll is gone
        try {
            SalaryLevel salaryLevel = api.getSalaryLevel(salaryLevel1.getName());
            if (salaryLevel.getPayrolls() != null || salaryLevel.getPayrolls().size() != 0)
                fail("Did not get reseted because Payroll is still inside with size of "
                        + salaryLevel.getPayrolls().size());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when getting SalaryLevel");
        }

        // Delete SalaryChanges
        try {
            api.deleteRestaurantChanges(0);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removeing Payroll from restaurant 0 !");
        }

        // Delete SalaryLevel
        try {
            api.removeSalaryLevel(salaryLevel1.getName());
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removing SalaryLevel");
        }
    }

    /**
     * Tests all Methods which should return 404 exceptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void notFoundTests() throws ApiException {
        TimeFilter timeFilter1 = new TimeFilter();
        timeFilter1.setFrom(LocalDate.MIN);
        timeFilter1.setTo(LocalDate.MAX);

        LocalDate nonExistingDate = LocalDate.MIN;

        // Add SalaryLevel
        try {
            api.addSalaryLevel("ExistingSalary");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryLevel");
        }

        SalaryChange1 salaryChange1 = new SalaryChange1();
        salaryChange1.setDate(LocalDate.now());
        salaryChange1.setValue(-6);

        // Add SalaryChange
        try {
            api.addSalaryChange("ExistingSalary", 0, salaryChange1);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when adding SalaryChange");
        }


        try {
            api.getChangesByLevelAndDate("NonExistingSalary", LocalDate.now(), true);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.getChangesByLevelAndDate("NonExistingSalary", LocalDate.now(), false);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.getLatestChange("NonExistingSalary", 0);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.getLatestChange("ExistingSalary", 5);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.getPayroll("NonExistingSalary", 0);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.getPayroll("ExistingSalary", 5);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.getPayrollInformation("NonExistingSalary", 0);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.getPayrollInformation("ExistingSalary", 5);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.getRestaurantChanges_(5, timeFilter1);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.getRestaurantChanges_(0, null);
            fail("There should be an error when the Filter is null!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            System.out.println(e.getCode());
        }

        try {
            api.getSalaryChange("NonExistingSalary", 0, nonExistingDate, false);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.getSalaryChange("ExistingSalary", 5, nonExistingDate, false);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.getSalaryChange("ExistingSalary", 0, nonExistingDate, false);
            fail("There should be a 404 error when there is no SalaryChange on the specified Date!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 442 (get)", 442, e.getResponseBody());
        }

        try {
            api.getSalaryChange("NonExistingSalary", 0, nonExistingDate, true);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.getSalaryChange("ExistingSalary", 5, nonExistingDate, true);
            fail("There should be a 404 error when there is no SalaryChange on the specified Date!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.getSalaryChange("ExistingSalary", 0, nonExistingDate, true);
            fail("There should be a 404 error when there is no SalaryChange on the specified Date!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 442 (get)", 442, e.getResponseBody());
        }

        try {
            api.getSalaryLevel("NonExistingSalary");
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.addSalaryChange("NonExistingSalary", 0, null);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.addSalaryChange("ExistingSalary", 5, null);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.removeChange("NonExistingSalary", 0, salaryChange1.getDate());
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.removeChange("ExistingSalary", 5, salaryChange1.getDate());
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.removeChange("NonExistingSalary", 0, nonExistingDate);
            fail("There should be a 404 error when there is no SalaryChange on the specified Date!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 442 (get)", 442, e.getResponseBody());
        }

        try {
            api.removePayroll("NonExistingSalary", 0);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.removePayroll("ExistingSalary", 5);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }
        try {
            api.removeSalaryLevel("NonExistingSalary");
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.editChange("NonExistingSalary", 0, salaryChange1.getDate(), 31);
            fail("There should be a 404 error when the SalaryLevel does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 340 (get)", 340, e.getResponseBody());
        }

        try {
            api.editChange("ExistingSalary", 5, salaryChange1.getDate(), 31);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        try {
            api.editChange("ExistingSalary", 0, nonExistingDate, 31);
            fail("There should be a 404 error when there is no SalaryChange on the specified Date!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 442 (get)", 442, e.getResponseBody());
        }

        try {
            api.deleteRestaurantChanges(5);
            fail("There should be a 404 error when the Restaurant does not exist!");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
            assertEquals("Our Error-Code should be 541 (get)", 541, e.getResponseBody());
        }

        // Delete SalaryChanges
        try {
            api.deleteRestaurantChanges(0);
            api.deleteRestaurantChanges(1);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removing Payroll from restaurant 0 and 1!");
        }

        // Delete SalaryLevel
        try {
            api.removeSalaryLevel("ExistingSalary");
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            fail("Error when removing SalaryLevel");
        }
    }

}
