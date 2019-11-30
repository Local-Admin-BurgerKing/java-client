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

import com.localadmin.ApiClient;
import com.localadmin.ApiException;
import com.localadmin.Configuration;
import com.localadmin.auth.ApiKeyAuth;
import com.localadmin.model.Apikeywrapper;
import com.localadmin.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert.*;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */

public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Authentication
     *
     * Authenticates an User with correct data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticateCorrectTest() throws ApiException {
    	ApiClient defaultClient = Configuration.getDefaultApiClient();

		String key = "";
		try {
			Apikeywrapper wrapper = api.authenticate("admin@kingrestaurants.at", "12345678");
			 key = wrapper.getKey();
		} catch (ApiException e) {
			fail("Login failed from Admin");
		}

		ApiKeyAuth User_Auth = (ApiKeyAuth) defaultClient.getAuthentication("User_Auth");
		User_Auth.setApiKey(key);
    }
    
    /**
     * Authentication
     *
     * Authenticates an User with wrong data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticateIncorrectTest() throws ApiException {
    	ApiClient defaultClient = Configuration.getDefaultApiClient();
    	
		try {
			Apikeywrapper wrapper = api.authenticate("admin@kingrestaurants.at", "asdasd");
			fail("Login worked even though it was a wrong password");
		} catch (ApiException e) {
		}
		
		try {
			Apikeywrapper wrapper = api.authenticate("aldar@kingrestaurants.at", "12345678");
			fail("Login worked even though it was a wrong admin account");
		} catch (ApiException e) {
		}
    }
}
