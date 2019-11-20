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

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FormularsApi
 */
@Ignore
public class FormularsApiTest {

    private final FormularsApi api = new FormularsApi();

    /**
     * Add DailyFormular
     *
     * Adds a new DailyFormular to the column list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDailyFormularTest() throws ApiException {
        Object body = null;
        api.addDailyFormular(body);

        // TODO: test validations
    }
    /**
     * Add Other
     *
     * Adds an other dailyFormular
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
     * Delete All DailyFormulars
     *
     * Deletes all DailyFormulars
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllDailyFormularsTest() throws ApiException {
        api.deleteAllDailyFormulars();

        // TODO: test validations
    }
    /**
     * Delete All Others
     *
     * Deletes an other dailyFormular
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllOthersTest() throws ApiException {
        String name = null;
        api.deleteAllOthers(name);

        // TODO: test validations
    }
    /**
     * Delete DailyFormular
     *
     * Deletes an existing DailyFormular
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDailyFormularTest() throws ApiException {
        String name = null;
        api.deleteDailyFormular(name);

        // TODO: test validations
    }
    /**
     * Delete Other
     *
     * Deletes a \&quot;other\&quot; from the daily formular  a other is a column (column/formular/salary level) which is appended to the formular  eg. &gt; v1: 12 v2: 7 other: 1,2,4 calculation Symbol &#x3D; + results in 12 + 7 + 1 + 2 + 4
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOtherTest() throws ApiException {
        String name = null;
        String other = null;
        api.deleteOther(name, other);

        // TODO: test validations
    }
    /**
     * Edit DailyFormular
     *
     * Edit specific columns of a DailyFormular
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDailyFormularTest() throws ApiException {
        String name = null;
        Object body = null;
        api.editDailyFormular(name, body);

        // TODO: test validations
    }
    /**
     * Get All DailyFormulars
     *
     * Get all DailyFormulars
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDailyFormularsTest() throws ApiException {
        Boolean wholeData = null;
        List<Object> response = api.getAllDailyFormulars(wholeData);

        // TODO: test validations
    }
    /**
     * Get All Others
     *
     * Gets all other dailyFormulars
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
     * Get DailyFormular
     *
     * Gets the DailyFormular by the name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDailyFormularTest() throws ApiException {
        String name = null;
        Boolean wholeData = null;
        Object response = api.getDailyFormular(name, wholeData);

        // TODO: test validations
    }
    /**
     * Replace DailyFormular
     *
     * Replaces an already existing DailyFormular by a new one
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceDailyFormularTest() throws ApiException {
        String name = null;
        Object body = null;
        api.replaceDailyFormular(name, body);

        // TODO: test validations
    }
}
