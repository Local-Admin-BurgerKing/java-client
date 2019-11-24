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

import com.localadmin.ApiException;
import com.localadmin.model.ErrorResponse;
import com.localadmin.model.User;
import com.localadmin.model.User1;
import com.localadmin.model.User2;
import com.localadmin.model.Useroptional;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Add User
     *
     * Adds a user to the user list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserTest() throws ApiException {
        User body = null;
        api.addUser(body);

        // TODO: test validations
    }
    /**
     * Change Password By Token
     *
     * Changes the password if you have the correct token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changePasswordByTokenTest() throws ApiException {
        String mail = null;
        String token = null;
        String newPassword = null;
        api.changePasswordByToken(mail, token, newPassword);

        // TODO: test validations
    }
    /**
     * Delete All Users
     *
     * Deletes all the users in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllUsersTest() throws ApiException {
        api.deleteAllUsers();

        // TODO: test validations
    }
    /**
     * Delete User
     *
     * Deletes a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String mail = null;
        api.deleteUser(mail);

        // TODO: test validations
    }
    /**
     * Edit User
     *
     * Edit specific values of the user &gt; The password can only be edited by the user itself.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editUserTest() throws ApiException {
        String mail = null;
        Useroptional body = null;
        String oldPassword = null;
        api.editUser(mail, body, oldPassword);

        // TODO: test validations
    }
    /**
     * Get All Users
     *
     * Gets all users. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllUsersTest() throws ApiException {
        Boolean wholeData = null;
        List<Object> response = api.getAllUsers(wholeData);

        // TODO: test validations
    }
    /**
     * Get User
     *
     * Gets user by delivered name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String mail = null;
        User1 response = api.getUser(mail);

        // TODO: test validations
    }
    /**
     * Replace User
     *
     * Replaces user by a new one &gt; You cannot change the password of the user this way
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceUserTest() throws ApiException {
        String mail = null;
        User2 body = null;
        api.replaceUser(mail, body);

        // TODO: test validations
    }
}
