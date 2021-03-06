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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.localadmin.ApiClient;
import com.localadmin.ApiException;
import com.localadmin.Configuration;
import com.localadmin.auth.ApiKeyAuth;
import com.localadmin.model.Apikeywrapper;
import com.localadmin.model.Permission;

/**
 * API tests for PermissionsApi
 */
public class PermissionsApiTest {

    private final PermissionsApi api = new PermissionsApi();
    private ApiKeyAuth User_Auth;
    private String key;
    
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
    }
    /**
     * Get all permissions
     *
     * Get all available permissions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPermissionsTest() throws ApiException {
        List<Permission> response = api.getAllPermissions();
        
        assertNotEquals("Permission List empty", response.size(), 0);
        
        try {
        	for(Permission perm : response) {
            	Permission ret = api.getPermission(perm.getName());
            	assertEquals("Permission name not matching.", ret.getName(), perm.getName());
            	assertEquals("Permission description not matching.", ret.getDescription(), perm.getDescription());
            }
        }catch(ApiException e) {
        	fail("Could not get specific permission: " + e.getCode());
        }
    }
}
