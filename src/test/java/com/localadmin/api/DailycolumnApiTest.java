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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DailycolumnApi
 */
@Ignore
public class DailycolumnApiTest {

    private final DailycolumnApi api = new DailycolumnApi();

    /**
     * Add Dailycolumn
     *
     * Adds a new dailycolumn to the dailycolumn list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDailycolumnTest() throws ApiException {
        Object body = null;
        api.addDailycolumn(body);

        // TODO: test validations
    }
    /**
     * Delete All Dailycolumns
     *
     * Deletes all saved information about the dailycolumns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllDailycolumnsTest() throws ApiException {
        api.deleteAllDailycolumns();

        // TODO: test validations
    }
    /**
     * Delete Dailycolumn
     *
     * Deletes an existing dailycolumn
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDailycolumnTest() throws ApiException {
        String name = null;
        api.deleteDailycolumn(name);

        // TODO: test validations
    }
    /**
     * Edit Dailycolumn
     *
     * Edit specific dailycolumns of a column
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDailycolumnTest() throws ApiException {
        String name = null;
        Object body = null;
        api.editDailycolumn(name, body);

        // TODO: test validations
    }
    /**
     * Get All Dailycolumns
     *
     * Get all dailycolumns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDailycolumnsTest() throws ApiException {
        Boolean wholeData = null;
        List<Object> response = api.getAllDailycolumns(wholeData);

        // TODO: test validations
    }
    /**
     * Get Dailycolumn
     *
     * Gets the dailycolumn by the sended name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDailycolumnTest() throws ApiException {
        String name = null;
        Object response = api.getDailycolumn(name);

        // TODO: test validations
    }
    /**
     * Replace Dailycolumn
     *
     * Replaces an already existing dailycolumn by a new one
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceDailycolumnTest() throws ApiException {
        String name = null;
        Object body = null;
        api.replaceDailycolumn(name, body);

        // TODO: test validations
    }
}