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
 * API tests for FormulasApi
 */
@Ignore
public class FormulasApiTest {

    private final FormulasApi api = new FormulasApi();

    /**
     * Add Dailyformula
     *
     * Adds a new Dailyformula to the column list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDailyformulaTest() throws ApiException {
        Object body = null;
        api.addDailyformula(body);

        // TODO: test validations
    }
    /**
     * Add Other
     *
     * Adds an other dailyformulas/columns/salary level
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOtherTest() throws ApiException {
        String name = null;
        String body = null;
        api.addOther(name, body);

        // TODO: test validations
    }
    /**
     * Delete All Dailyformulas
     *
     * Deletes all Dailyformulas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllDailyformulasTest() throws ApiException {
        api.deleteAllDailyformulas();

        // TODO: test validations
    }
    /**
     * Delete Dailyformula
     *
     * Deletes an existing Dailyformula
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDailyformulaTest() throws ApiException {
        String name = null;
        api.deleteDailyformula(name);

        // TODO: test validations
    }
    /**
     * Edit Dailyformula
     *
     * Edit specific columns of a Dailyformula
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDailyformulaTest() throws ApiException {
        String name = null;
        Object body = null;
        api.editDailyformula(name, body);

        // TODO: test validations
    }
    /**
     * Get All Dailyformulas
     *
     * Get all Dailyformulas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDailyformulasTest() throws ApiException {
        Boolean wholeData = null;
        List<Object> response = api.getAllDailyformulas(wholeData);

        // TODO: test validations
    }
    /**
     * Get All Others
     *
     * Gets all other dailyformulas/columns/salary level
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllOthersTest() throws ApiException {
        String name = null;
        List<String> response = api.getAllOthers(name);

        // TODO: test validations
    }
    /**
     * Get Dailyformula
     *
     * Gets the Dailyformula by the name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDailyformulaTest() throws ApiException {
        String name = null;
        Boolean wholeData = null;
        Object response = api.getDailyformula(name, wholeData);

        // TODO: test validations
    }
    /**
     * Delete All Others
     *
     * Deletes an other dailyformulas/columns/salary level
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllOthersTest() throws ApiException {
        String name = null;
        api.removeAllOthers(name);

        // TODO: test validations
    }
    /**
     * Delete Other
     *
     * Deletes a \&quot;other\&quot; from the daily formula  a other is a column (column/formula/salary level) which is appended to the formula  eg. &gt; v1: 12 v2: 7 other: 1,2,4 calculation Symbol &#x3D; + results in 12 + 7 + 1 + 2 + 4
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeOtherTest() throws ApiException {
        String name = null;
        String other = null;
        api.removeOther(name, other);

        // TODO: test validations
    }
    /**
     * Replace Dailyformula
     *
     * Replaces an already existing Dailyformula by a new one
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceDailyformulaTest() throws ApiException {
        String name = null;
        Object body = null;
        api.replaceDailyformula(name, body);

        // TODO: test validations
    }
}