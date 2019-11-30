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
import com.localadmin.model.Apikeywrapper;
import com.localadmin.model.ErrorResponse;
import com.localadmin.model.Restaurant;
import com.localadmin.model.Restaurant1;
import com.localadmin.model.Restaurant2;
import com.localadmin.model.Restaurantoptional;
import com.localadmin.model.User;
import com.localadmin.model.User1;
import com.localadmin.model.User2;
import com.localadmin.model.Useroptional;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RestaurantApi
 */
public class RestaurantApiTest {

	private final RestaurantApi api = new RestaurantApi();
	private final UserApi userApi = new UserApi();
	private ApiKeyAuth User_Auth;
	private String key;
	private boolean resetRestaurantTableBefore = false; // should it clear the table for each Test so if one fails the
														// others does not fail

	@Before
	public void setup() {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		UsersApi usersApi = new UsersApi();
		try {
			Apikeywrapper wrapper = usersApi.authenticate("admin@kingrestaurants.at", "12345678");
			key = wrapper.getKey();
		} catch (ApiException e) {
			fail("Login failed from Admin");
		}

		// Configure API key authorization: User_Auth
		User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
		User_Auth.setApiKey(key);

		if (resetRestaurantTableBefore) {
			try {
				api.deleteAllRestaurants();
			} catch (ApiException e) {
				fail("Fail when reseting restaurant table! " + e.getCode());
			}
		}

	}

	/**
	 * Add Restaurant Get Restaurant Edit Restaurant Delete Restaurant
	 *
	 * Tests 4 operations from Restaurant
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void restaurantAddGetEditDeleteTest() throws ApiException {
		Restaurant restaurant1 = new Restaurant();
		restaurant1.setNumber(0);
		restaurant1.setLocation("Hietzinger Kai 173, 1130 Wien");
		restaurant1.setName("San Giovanni");
		restaurant1.setSollvalue(0.525f);

		// Add restaurant
		try {
			api.addRestaurant(restaurant1);
		} catch (ApiException e) {
			fail("Error when adding Restaurant!");
		}

		// Edit restaurant
		Restaurantoptional edits1 = new Restaurantoptional();
		edits1.setNumber(1);
		edits1.setSollvalue(0.5f);
		try {
			api.editRestaurant(0, edits1);
		} catch (ApiException e) {
			fail("Error when edit restaurant! " + e.getCode() + e.getMessage());
		}
		try {
			Restaurant1 gettedRestaurant = (Restaurant1) api.getRestaurant(restaurant1.getNumber(), false);
			assertNotEquals("Number has been changed which should not happen!", gettedRestaurant.getNumber(),
					restaurant1.getNumber());
			assertEquals("Sollvalue did not get got changed even though it has been told to!",
					gettedRestaurant.getSollvalue(), restaurant1.getSollvalue());
		} catch (ApiException e) {
			fail("Error when getting user!");
		}

		// Add restaurant again and check if it throws an error
		try {
			api.addRestaurant(restaurant1);
			fail("Restaurant was already in database but has been put again!");
		} catch (ApiException e) {
			assertEquals("Error-Code is wrong!", 409, e.getCode());
		}

		// Remove Restaurant from database
		try {
			api.deleteRestaurant(restaurant1.getNumber());
		} catch (ApiException e) {
			fail("Error when deleting Restaurant!" + e.getCode());
		}

	}

	/**
	 * Delete All Restaurants
	 *
	 * Deletes all saved information about all restaurants
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void restaurantDeleteAllTest() throws ApiException {
		try {
			api.deleteAllRestaurants();
		} catch (ApiException e) {
			fail("Something did not work when deleting all restaurants! " + e.getCode());
		}
	}

	/**
	 * Delete Restaurant
	 *
	 * Deletes an existing restaurant
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void restaurantNotFoundTest() throws ApiException {
		try {
			api.deleteRestaurant(10);
			fail("There should be a 404 error when a non exisiting restaurant gets deleted!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (delete)", 404, e.getCode());
		}

		try {
			api.getRestaurant(10, false);
			fail("There should be a 404 error when a non exisiting restaurant gets getted without wholedata!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
		}

		try {
			api.getRestaurant(10, true);
			fail("There should be a 404 error when a non exisiting restaurant gets getted with wholedata!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
		}

		try {
			api.editRestaurant(10, null);
			fail("There should be a 404 error when a non exisiting restaurant gets edited!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (edit)", 404, e.getCode());
		}

		try {
			api.replaceRestaurant(10, null);
			fail("There should be a 404 error when a non exisiting restaurant gets replaced!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (replace)", 404, e.getCode());
		}

		try {
			api.addEmployee(69, "admin@kingrestaurants.at");
			fail("There should be a 404 error when a employe gets added to a non existing restaurant!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (addEmployee)", 404, e.getCode());
		}
		
		
	}

	/**
	 * Edit Restaurant
	 *
	 * Edit specific columns of a restaurant
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void restaurantReplaceTest() throws ApiException {
		Restaurant restaurant1 = new Restaurant();
		restaurant1.setName("Al Forno");
		restaurant1.setLocation("Somewhere");
		restaurant1.setNumber(4);
		restaurant1.setSollvalue(0.8f);
		try {
			api.addRestaurant(restaurant1);
		} catch (ApiException e) {
			fail("Something went wrong when adding the restaurant!" + e.getCode());
		}

		Restaurant1 replaceWith = new Restaurant1();
		restaurant1.setName("Kalian's Pizza");
		restaurant1.setLocation("Nowhere, never");
		restaurant1.setNumber(2);

		// Replace should not change anything because no Sollvalue was set
		try {
			api.replaceRestaurant(restaurant1.getNumber(), replaceWith);
			fail("Replace worked even though no Sollvalue was set");
		} catch (ApiException e) {
			// All good
		}

		restaurant1.setSollvalue(0.05f);

		// Replace should work cause now a group was set
		try {
			api.replaceRestaurant(restaurant1.getNumber(), replaceWith);
		} catch (ApiException e) {
			fail("Replace did not work!" + e.getCode());
		}

		// Test if replace worked
		try {
			Restaurant restaurant = (Restaurant) api.getRestaurant(replaceWith.getNumber(), false);
		} catch (ApiException e) {
			if (e.getCode() == 404)
				fail("Replace did not work!");
			else
				fail("Some error which should not be here: " + e.getCode());
		}
	}

	/**
	 * Get All Restaurants
	 *
	 * Get all restaurants
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void restaurantGetAllTest() throws ApiException {
		// Create 2 restaurants
		Restaurant restaurant1 = new Restaurant();
		restaurant1.setName("Al Forno");
		restaurant1.setLocation("Somewhere");
		restaurant1.setNumber(42);
		restaurant1.setSollvalue(0.8f);

		Restaurant restaurant2 = new Restaurant();
		restaurant1.setName("Grill and Chill");
		restaurant1.setLocation("Handelskai");
		restaurant1.setNumber(435);
		restaurant1.setSollvalue(0.3f);

		// Add restaurants
		try {
			api.addRestaurant(restaurant1);
			api.addRestaurant(restaurant2);
		} catch (ApiException e) {
			fail("Error when adding Restaurants!");
		}

		// Get restaurants
		try {
			List<Object> restaurants = api.getAllRestaurants(true);
			assertEquals("There should be 2 restaurants, but there are: " + restaurants.size(), 2, restaurants.size());
			assertEquals("Restaurant at 0 should be 42", restaurant1.getNumber(),
					((LinkedTreeMap<?, ?>) restaurants.get(0)).get("number"));
			assertEquals("Restaurant at 1 should be 435" + restaurant1.getNumber(), restaurant1.getNumber(),
					((LinkedTreeMap<?, ?>) restaurants.get(1)).get("number"));
		} catch (ApiException e) {
			fail("Error when getting Restaurants with wholedata!");
		}
		try {
			List<Object> restaurants = api.getAllRestaurants(true);
			assertEquals("There should be 2 restaurants, but there are: " + restaurants.size(), 2, restaurants.size());
			assertEquals("Restaurant at 0 should be 42", restaurant1.getNumber(),
					((LinkedTreeMap<?, ?>) restaurants.get(0)).get("number"));
			assertEquals("Restaurant at 1 should be 435" + restaurant1.getNumber(), restaurant1.getNumber(),
					((LinkedTreeMap<?, ?>) restaurants.get(1)).get("number"));
		} catch (ApiException e) {
			fail("Error when getting Restaurants without wholedata!");
		}

		api.deleteRestaurant(restaurant1.getNumber());
		api.deleteRestaurant(restaurant2.getNumber());
	}

	/**
	 * Add Employee Get Employee Remove Employee
	 *
	 * test 3 operations from restaurant
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void employeeAddGetRemove() throws ApiException {
		Restaurant restaurant1 = new Restaurant();
		restaurant1.setName("Zum goldenen Kochmesser");
		restaurant1.setLocation("Hades");
		restaurant1.setNumber(21);
		restaurant1.setSollvalue(0.8f);

		try {
			api.addRestaurant(restaurant1);
		} catch (ApiException e) {
			fail("Could not add restaurant! " + e.getCode());
		}

		// Add Employee to restaurant
		try {
			api.addEmployee(21, "admin@kingrestaurants.at");
		} catch (ApiException e) {
			fail("Could not add employee! " + e.getCode());
		}

		// Test if restaurant has this employee now
		try {
			List<String> employees = api.getAllEmployees(21);
			assertEquals("There should be 1 employee!", 1, employees.size());
			assertEquals("There should be a employee named admin@kingrestaurants.at", "admin@kingrestaurants.at",
					employees.get(0));
		} catch (ApiException e) {
			fail("Could when getting employees! " + e.getCode());
		}
		
		// Test if there are employees when restaurant gets called with wholedata
		try {
			List<Object> restaurants = api.getAllRestaurants(true);
			assertEquals("There should be 1 restaurant, but there are: " + restaurants.size(), 1, restaurants.size());
			assertEquals("Restaurant at 0 should be 21", restaurant1.getNumber(),
					((LinkedTreeMap<?, ?>) restaurants.get(0)).get("number"));
			LinkedTreeMap<?, ?> restaurant = (LinkedTreeMap<?, ?>) restaurants.get(0);
			//TODO: maybe not LinkedTreeMap??? Wrong Path???
			@SuppressWarnings("unchecked")
			List<Object> employees = (List<Object>) restaurant.get("employees");
			assertEquals("The name of the employee at 0 should be admin@kingrestaurants.at!", "admin@kingrestaurants.at", employees.get(0));
			
		} catch (ApiException e) {
			fail("Error when getting Restaurants with wholedata!");
		}

	}
}