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
import com.localadmin.model.User;
import com.localadmin.model.Group;
import com.localadmin.model.User1;
import com.localadmin.model.User2;
import com.localadmin.model.Useroptional;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

	private final UserApi api = new UserApi();
	private final UsergroupApi groupApi = new UsergroupApi();
	private ApiKeyAuth User_Auth;
	private String key;
	private boolean resetUserTableBefore = true; // should it clear the table for each Test so if one fails the
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

		if (resetUserTableBefore) {
			try {
				List<Object> users = api.getAllUsers(false);
				for (int i = 0; i < users.size(); i++) {
					if (!users.get(i).equals("admin@kingrestaurants.at"))
						api.deleteUser(users.get(i).toString());
				}
			} catch (ApiException e) {
				fail("Fail when reseting user table!");
			}
		}

	}

	/**
	 * Add User Get User Edit User Delete User
	 *
	 * Tests 4 operations from User
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void userAddGetEditDeleteTest() throws ApiException {
		User user1 = new User();
		user1.setEmail("kalian.danzer@gmail.com");
		user1.setName("Kalian Danzer");
		user1.setPassword("1234");
		user1.setGroup("ROOT");

		// Add user
		try {
			api.addUserWithHttpInfo(user1);
		} catch (ApiException e) {
			fail("Error when adding User!");
		}

		// Edit user
		Useroptional edits1 = new Useroptional();
		edits1.setName("Kalian Narayana Danzer");
		edits1.setEmail("kdanzer@student.tgm.ac.at");
		edits1.setPassword("Aldar&/67");
		try {
			api.editUser(user1.getEmail(), edits1, "1234");
		} catch (ApiException e) {
			fail("Error when edit user! " + e.getCode() + e.getMessage());
		}
		try {
			User1 gettedUser = api.getUser(user1.getEmail());
			assertNotEquals("Mail has got changed which should not happen!", gettedUser.getEmail(), user1.getEmail());
			assertEquals("Name did not get changed!", gettedUser.getName(), user1.getName());
			assertEquals("Password did not get changed!", gettedUser.getPassword(), user1.getPassword());
			assertNotEquals("Group got changed even though it did not get told to!", gettedUser.getGroup(),
					user1.getGroup());
		} catch (ApiException e) {
			fail("Error when getting user!");
		}

		// Add user again and check if it throws an error
		try {
			api.addUserWithHttpInfo(user1);
			fail("User was already in database but got put again!");
		} catch (ApiException e) {
			assertEquals("Error-Code is wrong!", 409,  e.getCode());
		}

		// Edit user but with wrong password
		Useroptional edits2 = new Useroptional();
		edits2.setPassword("ZügeSanZügigEudaaaa!");
		try {
			api.editUser(user1.getEmail(), edits2, "1234"); // Delivered wrong password so it should not change the
															// password
		} catch (ApiException e) {
			fail("Error when edit user! " + e.getCode() + e.getMessage());
		}
		try {
			User1 gettedUser = api.getUser(user1.getEmail());
			assertNotEquals("Mail has got changed which should not happen!", user1.getEmail(), gettedUser.getEmail());
			assertEquals("Name has got changed which should not happen!", user1.getName(), gettedUser.getName());
			assertEquals("Password has got changed which should not happen!", user1.getPassword(),
					gettedUser.getPassword());
			assertEquals("Group has got changed which should not happen!", user1.getGroup(), gettedUser.getGroup());
		} catch (ApiException e) {
			fail("Error when getting user!");
		}

		// Delete User from database
		try {
			api.deleteUser(user1.getEmail());
		} catch (ApiException e) {
			fail("Error when deleting User!");
		}
	}

	/**
	 * Change Password By Token
	 *
	 * Changes the password if you have the correct token
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void userTokenChangePasswordTest() throws ApiException {
		User user = new User();
		user.setEmail("nbrugger@student.tgm.ac.at");
		user.setName("Nils Brugger");
		user.setPassword("!$§&%&R/)(§&Obfjg");
		user.setGroup("ROOT");

		api.addUser(user);

		String token = "gfbsdvbvgfef";

		// Change with wrong token token
		try {
			api.changePasswordByToken("nbrugger@student.tgm.ac.at", token, "AberIchBinEinPasswort!%");
			fail("Something went wrong cause it changed Password even though it was a wrong token!");
		} catch (ApiException e) {
		}

		api.deleteUser(user.getEmail());
	}

	/**
	 * Delete All Users
	 *
	 * Tests the Delete All operation
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void userDeleteAllTest() throws ApiException {
		try {
			api.deleteAllUsers();
		} catch (ApiException e) {
			fail("Something did not work when deleting all users! " + e.getCode());
		}
		User user1 = new User();
		user1.setEmail("admin@kingrestaurants.at");
		user1.setName("admin");
		user1.setPassword("12345678");
		user1.setGroup("ROOT");
		try {
			api.addUser(user1);
		} catch (ApiException e) {
			fail("Was not able to add Admin!");
		}
	}

	/**
	 * Get All User
	 *
	 * Gets all users and Tests if it got the correct user amount and users
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void userGetAllTest() throws ApiException {
		// Create 2 new users
		User user1 = new User();
		user1.setEmail("nils.brugger@gmail.com");
		user1.setName("Nils Bruger");
		user1.setPassword("TestCasesBisSonntagSonstAUA!");
		user1.setGroup("ROOT");

		User user2 = new User();
		user2.setEmail("tschrottwieser@student.tgm.ac.at");
		user2.setName("Tobias Schrottinger");
		user2.setPassword("IchBinEinPasswort...NeE1gent7ichN1cht!");
		user2.setGroup("ROOT");

		// Add users
		try {
			api.addUserWithHttpInfo(user1);
			api.addUserWithHttpInfo(user2);
		} catch (ApiException e) {
			fail("Error when adding User!");
		}

		// Get users
		try {
			List<Object> users = api.getAllUsers(true);
			assertEquals("There should be 3 users, but there are: " + users.size(), 3, users.size());
			assertEquals("User at 0 should be admin@kingrestaurants.at", "admin@kingrestaurants.at",
					((LinkedTreeMap<?, ?>) users.get(0)).get("email"));
			assertEquals("User at 1 should be " + user1.getEmail(), user1.getEmail(),
					((LinkedTreeMap<?, ?>) users.get(1)).get("email"));
			assertEquals("User at 2 should be " + user2.getEmail(), user2.getEmail(),
					((LinkedTreeMap<?, ?>) users.get(2)).get("email"));
		} catch (ApiException e) {
			fail("Error when getting Users with wholedata!");
		}
		try {
			List<Object> users = api.getAllUsers(false);
			assertEquals("There should be 3 users, but there are: " + users.size(), 3, users.size());
			assertEquals("User at 0 should be admin@kingrestaurants.at", "admin@kingrestaurants.at", users.get(0));
			assertEquals("User at 1 should be " + user1.getEmail(), user1.getEmail(), users.get(1));
			assertEquals("User at 2 should be " + user2.getEmail(), user2.getEmail(), users.get(2));
		} catch (ApiException e) {
			fail("Error when getting Users without wholedata!");
		}

		api.deleteUser(user1.getEmail());
		api.deleteUser(user2.getEmail());

	}

	/**
	 * Replace User
	 *
	 * Replaces user by a new one &gt; You cannot change the password of the user
	 * this way
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void userReplaceTest() throws ApiException {
		User user1 = new User();
		user1.setEmail("sexysusi@gmx.at");
		user1.setName("Susi the Sexy one");
		user1.setPassword("NewPassword!");
		user1.setGroup("ROOT");
		api.addUser(user1);

		User2 replaceWith = new User2();
		replaceWith.setEmail("Herbert1973@gmail.com");
		replaceWith.setName("Herbert");
		replaceWith.setPassword(user1.getPassword());

		// Replace should not change anything because no group was set
		try {
			api.replaceUser("sexysusi@gmx.at", replaceWith);
			fail("Replace worked even though no Group was set");
		} catch (ApiException e) {
			// All good
		}

		replaceWith.setGroup("ROOT");

		// Replace should work cause now a group was set
		try {
			api.replaceUser("sexysusi@gmx.at", replaceWith);
		} catch (ApiException e) {
			fail("Replace did not work!");
		}

		// Test if it got replaced
		try {
			api.getUser(replaceWith.getEmail());
		} catch (ApiException e) {
			if (e.getCode() == 404)
				fail("Replace did not work!");
			else
				fail("Some error which should not be here: " + e.getCode());
		}

		api.deleteUser("Herbert1973@gmail.com");
	}

	/**
	 * Test if there are correct 404 responses for Delete, Get, Edit, Replace
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void userNotFoundTest() throws ApiException {
		try {
			api.deleteUser("elon.musk@gmail.com");
			fail("There should be a 404 error when a non exisiting user gets deleted!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (delete)", 404, e.getCode());
		}

		try {
			api.getUser("elon.musk@gmail.com");
			fail("There should be a 404 error when a non exisiting user gets getted!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
		}

		try {
			api.editUser("elon.musk@gmail.com", null, null);
			fail("There should be a 404 error when a non exisiting user gets edited!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (edit)", 404, e.getCode());
		}

		try {
			api.replaceUser("elon.musk@gmail.com", null);
			fail("There should be a 404 error when a non exisiting user gets replaced!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (replace)", 404, e.getCode());
		}
	}
}
