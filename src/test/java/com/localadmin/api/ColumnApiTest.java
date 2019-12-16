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
import com.localadmin.model.ColumnType;
import com.localadmin.model.ColumnUse;
import com.localadmin.model.DailyFormulas;
import com.localadmin.model.Dailycolumn;
import com.localadmin.model.Dailyoperators;
import com.localadmin.model.ErrorResponse;
import com.localadmin.model.Restaurant;
import com.localadmin.model.SalaryChange;
import com.localadmin.model.SalaryChange1;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ColumnApi
 */
public class ColumnApiTest {

	private final ColumnApi api = new ColumnApi();
	private final DailycolumnApi dailycolumnApi = new DailycolumnApi();
	private final FormulasApi formulaApi = new FormulasApi();
	private final PayrollApi payrollApi = new PayrollApi();
	private ApiKeyAuth User_Auth;
	private String key;
	private boolean resetColumnTableBefore = true; // should it clear the table for each Test so if one fails the
													// others does not fail

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

		if (resetColumnTableBefore) {
			try {
				formulaApi.deleteAllDailyformulas();
				dailycolumnApi.deleteAllDailycolumns();
			} catch (ApiException e) {
				e.printStackTrace();
                System.err.println(e.getResponseBody());
				fail("Fail when reseting column table! " + e.getCode());
			}
		}
	}

	/**
	 * Get All Columns, TypeOf Column, IsInUse Column
	 *
	 * Tests all 3 operations of Column
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void ColumnGetTypeUseTest() throws ApiException {
		Dailycolumn dailycolumn1 = new Dailycolumn();
		dailycolumn1.setName("dailyColumn1");
		dailycolumn1.setHide(false);

		DailyFormulas dailyformulas1 = new DailyFormulas();
		dailyformulas1.setName("dailyFormula1");
		dailyformulas1.setPercent(true);
		dailyformulas1.setValue1("1");
		dailyformulas1.setValue2("5");
		dailyformulas1.setDescription("A formula");

		// Add column from type DailyColumn which should not work
		try {
			dailycolumnApi.addDailycolumn(dailycolumn1);
			fail("Was able to add DailyColumn even tough its not setup with all values yet!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
		}

		// Add column from type DailyFormula which should not work
		try {
			formulaApi.addDailyformula(dailyformulas1);
			fail("Was able to add SalaryLevel even tough its not setup with all values yet!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
		}

		dailyformulas1.setOperator(Dailyoperators.ADD);
		dailycolumn1.setDescription("A column");

		// Add column from type DailyColumn
		try {
			dailycolumnApi.addDailycolumn(dailycolumn1);
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when adding DailyColumn!");
		}

		// Add column from type DailyFormula
		try {
			formulaApi.addDailyformula(dailyformulas1);
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when adding DailyFormula!");
		}

		// Add column from type SalaryLevel
		try {
			payrollApi.addSalaryLevel("LevelXYZ");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when adding SalaryLevel!");
		}

		// Get all columns
		try {
			List<String> columnNames = api.getAllColumns();
			assertEquals("There should be 3 columns!", 2, columnNames.size());
			assertEquals("Name of Column at 0 is wrong!", dailycolumn1.getName(), columnNames.get(0));
			assertEquals("Name of Column at 1 is wrong!", dailyformulas1.getName(), columnNames.get(1));
			assertEquals("Name of Column at 2 is wrong!", "LevelXYZ", columnNames.get(2));
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when getting Columns!");
		}

		// Type Of the columns
		try {
			ColumnType type = api.getColumnType(dailycolumn1.getName());
			assertEquals("Type of column is not correct", ColumnType.TypeEnum.DAILYCOLUMN, type);
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when getting type of the DailyColumn!" + e.getCode());
		}
		try {
			ColumnType type = api.getColumnType(dailyformulas1.getName());
			assertEquals("Type of column is not correct", ColumnType.TypeEnum.DAILYFORMULA, type);
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when getting type of the DailyFormula!" + e.getCode());
		}
		try {
			ColumnType type = api.getColumnType("LevelXYZ");
			assertEquals("Type of column is not correct", ColumnType.TypeEnum.SALARYLEVEL, type);
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when getting type of the SalaryLevel!" + e.getCode());
		}

		// Columns in use
		try {
			ColumnUse use = api.isColumnInUse(dailycolumn1.getName());
			assertEquals("Column useage is not correct", false, use.isInUse());
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when getting usage of the DailyColumn!");
		}
		try {
			ColumnUse use = api.isColumnInUse(dailyformulas1.getName());
			assertEquals("Column useage is not correct", false, use.isInUse());
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when getting usage of the DailyFormulas!");
		}
		try {
			ColumnUse use = api.isColumnInUse("LevelXYZ");
			assertEquals("Column useage is not correct", false, use.isInUse());
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when getting usage of the SalaryLevel!");
		}

		// Delete columns
		try {
			dailycolumnApi.deleteAllDailycolumns();
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when deleting all DailyColumns!");
		}
		try {
			formulaApi.deleteAllDailyformulas();
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when deleting all DailyFormulas!");
		}
		try {
			payrollApi.removeSalaryLevel("LevelXYZ");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when deleting all DailyFormulas!");
		}

	}

	/**
	 * Tetst if all methods that should return a 404 Error, returns one
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void columnNotFoundTest() throws ApiException {
		try {
			api.getColumnType("I am not even existing");
			fail("There should be a 404 error when the type of a non existing column gets requested!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			assertEquals("Error-Code should be 404 (getType)", 404, e.getCode());
		}
		try {
			api.isColumnInUse("I am not even existing");
			fail("There should be a 404 error when the usage of a non existing column gets requested!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			assertEquals("Error-Code should be 404 (isInUse)", 404, e.getCode());
		}
	}

	/**
	 * Tetst if all methods return 370 cause of a wrong type
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void typeIncompatibleTest() throws ApiException {
		Dailycolumn dailycolumn1 = new Dailycolumn();
		dailycolumn1.setName("dailycolumn");
		dailycolumn1.setHide(false);
		dailycolumn1.setDescription("A column");

		DailyFormulas dailyformulas1 = new DailyFormulas();
		dailyformulas1.setName("dailyformula");
		dailyformulas1.setPercent(true);
		dailyformulas1.setValue1("1");
		dailyformulas1.setValue2("5");
		dailyformulas1.setOperator(Dailyoperators.ADD);
		dailyformulas1.setDescription("A formula");

		// Add column from type DailyColumn
		try {
			dailycolumnApi.addDailycolumn(dailycolumn1);
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when adding DailyColumn!");
		}

		// Add column from type DailyFormula
		try {
			formulaApi.addDailyformula(dailyformulas1);
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when adding DailyFormula!");
		}

		// Add column from type SalaryLevel
		try {
			payrollApi.addSalaryLevel("salarylevel");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			fail("Error when adding SalaryLevel!");
		}

		// Type issues in dailycolumn
		try {
			dailycolumnApi.getDailycolumn(dailyformulas1.getName());
			fail("There should be a 307 error because it is a incompatible type!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			assertEquals("Error-Code is wrong!", 307, e.getCode());
		}
		try {
			dailycolumnApi.getDailycolumn("salarylevel");
			fail("There should be a 307 error because it is a incompatible type!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			assertEquals("Error-Code is wrong!", 307, e.getCode());
		}

		// Type issues in dailyformula
		try {
			formulaApi.getDailyformula("salarylevel", false);
			fail("There should be a 307 error because it is a incompatible type!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			assertEquals("Error-Code is wrong!", 307, e.getCode());
		}
		try {
			formulaApi.getDailyformula(dailycolumn1.getName(), false);
			fail("There should be a 307 error because it is a incompatible type!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			assertEquals("Error-Code is wrong!", 307, e.getCode());
		}

		// Type issues in salarylevel
		try {
			payrollApi.getSalaryLevel(dailyformulas1.getName());
			fail("There should be a 307 error because it is a incompatible type!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			assertEquals("Error-Code is wrong!", 307, e.getCode());
		}
		try {
			payrollApi.getSalaryLevel(dailycolumn1.getName());
			fail("There should be a 307 error because it is a incompatible type!");
		} catch (ApiException e) {
			System.err.println(e.getResponseBody());
			assertEquals("Error-Code is wrong!", 307, e.getCode());
		}
	}
}
