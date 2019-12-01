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
import com.localadmin.model.DailyFormulas;
import com.localadmin.model.DailyFormulas1;
import com.localadmin.model.Dailycolumn;
import com.localadmin.model.Dailyoperators;
import com.localadmin.model.ErrorResponse;
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
 * API tests for FormulasApi
 */
public class FormulasApiTest {

	private final FormulasApi api = new FormulasApi();
	private ApiKeyAuth User_Auth;
	private String key;
	private boolean resetFormulaTableBefore = false; // should it clear the table for each Test so if one fails the
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

		if (resetFormulaTableBefore) {
			try {
				api.deleteAllDailyformulas();
			} catch (ApiException e) {
				fail("Fail when reseting formula table! " + e.getCode());
			}
		}
	}

	/**
	 * Add DailyFormula Get DailyFormula Edit DailyFormula Delete DailyFormula
	 *
	 * Tests 4 operations from DailyFormula
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void formulaAddGetEditDeleteTest() throws ApiException {
		DailyFormulas formula1 = new DailyFormulas();
		formula1.setName("formula1");
		formula1.setOperator(Dailyoperators.ADD);
		formula1.setPercent(true);
		formula1.setDescription("A Description");

		DailyFormulas formula2 = new DailyFormulas();
		formula2.setName("formula2");
		formula2.setOperator(Dailyoperators.MULTIPLY);
		formula2.setPercent(false);
		formula1.setDescription("Another Description");

		// Add DailyFormula which should not work
		try {
			api.addDailyformula(formula1);
			fail("Was able to add Dailyformula even tough its not setup with all values yet!");
		} catch (ApiException e) {
			System.out.println(e.getCode());
		}

		formula1.setValue1("42");
		formula1.setValue2("69");

		// Add DailyFormula
		try {
			api.addDailyformula(formula1);
		} catch (ApiException e) {
			fail("Error when adding DailyFormula!");
		}

		// Add DailyFormula again and test if does work or not
		try {
			api.addDailyformula(formula1);
			fail("It should not be possible to add the same DailyFormula again!");
		} catch (ApiException e) {
			assertEquals("Error-Code is wrong!", 409, e.getCode());
		}

		// Test if DailyFormula realy got added
		try {
			DailyFormulas formula = (DailyFormulas) api.getDailyformula(formula1.getName(), false);
			// error should not be reachable would rather throw an error when getting
			assertEquals("DailyFormula seems to not have been added!", formula1.getName(), formula.getName());
		} catch (ApiException e) {
			fail("Error when getting DailyFormula!");
		}

		// Edit DailyFormula
		try {
			api.editDailyformula(formula1.getName(), formula2);
		} catch (ApiException e) {
			fail("Error when editing DailyFormula!");
		}

		// Test if DailyFormula has been edited correctly
		try {
			DailyFormulas formula = (DailyFormulas) api.getDailyformula(formula1.getName(), false);
			// error should not be reachable would rather throw an error when getting
			assertEquals("Error with column name!", formula1.getName(), formula.getName());
			assertEquals("Value1 has been updated which should not have happend", formula1.getValue1(),
					formula.getValue1());
			assertEquals("Value2 has been updated which should not have happend", formula1.getValue2(),
					formula.getValue2());
			assertEquals("Dailyoperator has not been updated!", formula2.getOperator(), formula.getOperator());
			assertEquals("Percent has not been updated!", formula2.isPercent(), formula.isPercent());
			assertEquals("Description has not been updated!", formula2.getDescription(), formula.getDescription());
		} catch (ApiException e) {
			fail("Error when getting Dailycolumn!");
		}

		// Delete DailyFormula
		try {
			api.deleteDailyformula(formula1.getName());
		} catch (ApiException e) {
			fail("Error when deleting Dailycolumns!");
		}

	}

	/**
	 * Delete All Dailycolumns Get All Dailycolumns
	 *
	 * Tests 2 endpoints
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void formulaDeleteAllGetAllTest() throws ApiException {
		DailyFormulas formula1 = new DailyFormulas();
		formula1.setName("formula3");
		formula1.setOperator(Dailyoperators.ADD);
		formula1.setPercent(true);
		formula1.setValue1("1");
		formula1.setValue2("11");
		formula1.setDescription("A Description");

		DailyFormulas formula2 = new DailyFormulas();
		formula2.setName("formula4");
		formula2.setOperator(Dailyoperators.MULTIPLY);
		formula2.setPercent(false);
		formula2.setValue1("2");
		formula2.setValue2("22");
		formula2.setDescription("Another Description");

		// Add Dailyformula
		try {
			api.addDailyformula(formula1);
			api.addDailyformula(formula2);
		} catch (ApiException e) {
			fail("Error when adding Dailyformulas!");
		}

		// Get all Dailyformulas, really got added? (wholedata true and false)
		try {
			List<Object> dailyformulas = api.getAllDailyformulas(false);
			assertEquals("Wrong amount of Dailyformulas in database!", 2, dailyformulas.size());
			assertEquals("Wrong Dailyformula at 0!", formula1.getName(), dailyformulas.get(0));
			assertEquals("Wrong Dailyformula at 1!", formula2.getName(), dailyformulas.get(1));
		} catch (ApiException e) {
			fail("Error when getting all Dailyformulas without wholedata! " + e.getCode());
		}
		try {
			List<Object> dailyformulas = api.getAllDailyformulas(true);
			assertEquals("Wrong amount of Dailyformulas in database!", 2, dailyformulas.size());

			assertEquals("Wrong Dailyformula at 0!", formula1.getName(),
					((DailyFormulas) dailyformulas.get(0)).getName());
			assertEquals("Wrong Dailyformula Value1 at 0!", formula1.getValue1(),
					((DailyFormulas) dailyformulas.get(0)).getValue1());
			assertEquals("Wrong Dailyformula Value2 at 0!", formula1.getValue2(),
					((DailyFormulas) dailyformulas.get(0)).getValue2());
			assertEquals("Wrong Dailyformula percent at 0!", formula1.isPercent(),
					((DailyFormulas) dailyformulas.get(0)).isPercent());
			assertEquals("Wrong Dailyformula operator at 0!", formula1.getOperator(),
					((DailyFormulas) dailyformulas.get(0)).getOperator());
			assertEquals("Wrong Dailyformula description at 0!", formula1.getDescription(),
					((DailyFormulas) dailyformulas.get(0)).getDescription());

			assertEquals("Wrong Dailyformula at 1!", formula2.getName(),
					((DailyFormulas) dailyformulas.get(1)).getName());
			assertEquals("Wrong Dailyformula Value1 at 1!", formula2.getValue1(),
					((DailyFormulas) dailyformulas.get(1)).getValue1());
			assertEquals("Wrong Dailyformula Value2 at 1!", formula2.getValue2(),
					((DailyFormulas) dailyformulas.get(1)).getValue2());
			assertEquals("Wrong Dailyformula percent at 1!", formula2.isPercent(),
					((DailyFormulas) dailyformulas.get(1)).isPercent());
			assertEquals("Wrong Dailyformula operator at 1!", formula2.getOperator(),
					((DailyFormulas) dailyformulas.get(1)).getOperator());
			assertEquals("Wrong Dailyformula description at 1!", formula2.getDescription(),
					((DailyFormulas) dailyformulas.get(1)).getDescription());
		} catch (ApiException e) {
			fail("Error when getting all Dailycolumns with wholedata! " + e.getCode());
		}

		// Delete all Dailyformulas
		try {
			api.deleteAllDailyformulas();
		} catch (ApiException e) {
			fail("Error when deleting all Dailycolumns! " + e.getCode());
		}

		// Test if there are still Dailyformulas
		try {
			List<Object> formulas = api.getAllDailyformulas(false);
			assertEquals("There are still formulas inside the database", 0, formulas.size());
		} catch (ApiException e) {
			fail("Error when getting all Dailyformulas without wholedata! " + e.getCode());
		}

	}

	/**
	 * Replace Dailyformula
	 *
	 * Replaces an already existing Dailyformula by a new one
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void formulaReplaceTest() throws ApiException {
		DailyFormulas toReplace = new DailyFormulas();
		toReplace.setName("formula5");
		toReplace.setOperator(Dailyoperators.ADD);
		toReplace.setPercent(true);
		toReplace.setValue1("1");
		toReplace.setValue2("11");
		toReplace.setDescription("A Description");

		DailyFormulas replaceWith = new DailyFormulas();
		replaceWith.setName("formula6");
		replaceWith.setOperator(Dailyoperators.MULTIPLY);
		replaceWith.setPercent(true);
		replaceWith.setValue1("2");
		replaceWith.setDescription("Another Description");

		// Add
		try {
			api.addDailyformula(toReplace);
		} catch (ApiException e) {
			fail("Error when adding Dailyformula");
		}

		// Replace should not work because replace with misses a value
		try {
			api.replaceDailyformula(toReplace.getName(), replaceWith);
			fail("Replacing should not be possible!");
		} catch (ApiException e) {
		}

		replaceWith.setValue2("22");

		// Replace should work now
		try {
			api.replaceDailyformula(toReplace.getName(), replaceWith);
		} catch (ApiException e) {
			fail("Error when replacing Dailyformula");
		}

		// Did it realy got replaced?
		try {
			DailyFormulas formula = (DailyFormulas) api.getDailyformula(replaceWith.getName(), false);
			// error should not be reachable would rather throw an error when getting
			assertEquals("Error with column name!", replaceWith.getName(), formula.getName());
			assertEquals("Value1 did not get replaced or replaced wrong", replaceWith.getValue1(), formula.getValue1());
			assertEquals("Value2 did not get replaced or replaced wrong", replaceWith.getValue2(), formula.getValue2());
			assertEquals("Percent did not get replaced or replaced wrong", replaceWith.isPercent(),
					formula.isPercent());
			assertEquals("Operator did not get replaced or replaced wrong", replaceWith.getOperator(),
					formula.getOperator());
			assertEquals("Description did not get replaced or replaced wrong", replaceWith.getDescription(),
					formula.getDescription());
		} catch (ApiException e) {
			fail("Error when getting formula (maybe replace failure)");
		}

		// Delete
		try {
			api.deleteDailyformula(replaceWith.getName());
		} catch (ApiException e) {
			fail("Error when deleting Dailyformula");
		}
	}

	/**
	 * Tetst if all methods that should return a 404 Error, returns one
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void formulaNotFoundTest() throws ApiException {
		try {
			api.getDailyformula("Why are we still here, I mean ... I am not", false);
			fail("There should be a 404 error when a non existing formula gets requested!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
		}
		try {
			api.getDailyformula("Why are we still here, I mean ... I am not", true);
			fail("There should be a 404 error when a non existing formula gets requested!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (get)", 404, e.getCode());
		}
		try {
			api.deleteDailyformula("Nowhere");
			fail("There should be a 404 error when a non existing formula gets deleted!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (delete)", 404, e.getCode());
		}
		try {
			api.replaceDailyformula("Nowhere", null);
			fail("There should be a 404 error when a non existing formula gets replaced!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (replace)", 404, e.getCode());
		}
		try {
			api.editDailyformula("Nowhere", null);
			fail("There should be a 404 error when a non existing formula gets edited!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (edit)", 404, e.getCode());
		}

		DailyFormulas existing = new DailyFormulas();
		existing.setName("Existing");
		existing.setOperator(Dailyoperators.MULTIPLY);
		existing.setPercent(false);
		existing.setDescription("Another Description");
		existing.setValue1("420");
		existing.setValue2("69");
		try {
			api.addDailyformula(existing);
		} catch (ApiException e) {
			fail("Error when adding Dailyformula!");
		}

		// Formula does not exist
		try {
			api.addOther("NonExisting", "Existing");
			fail("There should be a 404 error when a other gets added to a non existing Dailyformula!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (getOther)", 404, e.getCode());
			assertEquals("Our Error-Code should be 340", 340, e.getResponseBody());
		}

		// Other does not exist
		try {
			api.addOther("Existing", "NonExisting");
			fail("There should be a 404 error when a non existing other gets added to a Dailyformula!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (getOther)", 404, e.getCode());
			assertEquals("Our Error-Code should be 341", 341, e.getResponseBody());
		}

		// Formula does not exist
		try {
			api.getAllOthers("NonExisting");
			fail("There should be a 404 error when all others are getted from a non existing Dailyformula!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (removeOther)", 404, e.getCode());
			assertEquals("Our Error-Code should be 340", 340, e.getResponseBody());
		}

		// Formula does not exist
		try {
			api.removeOther("NonExisting", "Existing");
			fail("There should be a 404 error when a other gets removed from a non existing Dailyformula!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (removeOther)", 404, e.getCode());
			assertEquals("Our Error-Code should be 340", 340, e.getResponseBody());
		}

		// Other does not exist
		try {
			api.removeOther("Existing", "NonExisting");
			fail("There should be a 404 error when a non existing other gets removed from a Dailyformula!");
		} catch (ApiException e) {
			assertEquals("Error-Code should be 404 (removeOther)", 404, e.getCode());
			assertEquals("Our Error-Code should be 341", 341, e.getResponseBody());
		}
	}

	/**
	 * Get All Dailyformulas Delete All Dailyformulas
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void dailyformulasGetDeleteAllTest() throws ApiException {
		DailyFormulas formula1 = new DailyFormulas();
		formula1.setName("1FormulaWhichForms");
		formula1.setOperator(Dailyoperators.DIVIDE);
		formula1.setPercent(true);
		formula1.setDescription("Another Description");
		formula1.setValue1("420");
		formula1.setValue2("69");

		DailyFormulas formula2 = new DailyFormulas();
		formula1.setName("2FormulaWhichForms");
		formula1.setOperator(Dailyoperators.DIVIDE);
		formula1.setPercent(true);
		formula1.setDescription("Another Description");
		formula1.setValue1("420");
		formula1.setValue2("69");

		try {
			api.addDailyformula(formula1);
			api.addDailyformula(formula2);
		} catch (ApiException e) {
			fail("Error when adding Dailyformulas!");
		}
		
		try {
			api.addOther(formula2.getName(), formula1.getName());
		} catch (ApiException e) {
			fail("Error when adding Other!");
		}
		
		try {
			DailyFormulas1 wholeDataFormula = (DailyFormulas1) api.getDailyformula(formula1.getName(), true);
			assertEquals("There should be 0 others!", 0, wholeDataFormula.getOthers().size());
		} catch (ApiException e) {
			fail("Error when getting!");
		}
		
		try {
			DailyFormulas1 wholeDataFormula = (DailyFormulas1) api.getDailyformula(formula2.getName(), true);
			assertEquals("There should be 1 other!", 1, wholeDataFormula.getOthers().size());
			assertEquals("Other name is wrong!", formula1.getName(), wholeDataFormula.getOthers().get(0));
		} catch (ApiException e) {
			fail("Error when getting!");
		}
	}

	/**
	 * Add Other Get Other Remove Other
	 *
	 * test 3 operations from Formulas Other Also Test what happen when getted with
	 * wholedata
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void otherAddGetRemoveTest() throws ApiException {
		DailyFormulas formula1 = new DailyFormulas();
		formula1.setName("FormulaAddOther1");
		formula1.setOperator(Dailyoperators.DIVIDE);
		formula1.setPercent(true);
		formula1.setDescription("Another Description");
		formula1.setValue1("420");
		formula1.setValue2("69");

		DailyFormulas formula2 = new DailyFormulas();
		formula1.setName("FormulaAddOther2");
		formula1.setOperator(Dailyoperators.DIVIDE);
		formula1.setPercent(true);
		formula1.setDescription("Another Description");
		formula1.setValue1("420");
		formula1.setValue2("69");

		try {
			api.addDailyformula(formula1);
			api.addDailyformula(formula2);
		} catch (ApiException e) {
			fail("Error when adding Dailyformulas!");
		}

		try {
			api.addOther(formula1.getName(), formula1.getName());
		} catch (ApiException e) {
			fail("Error when adding Other!");
		}

		try {
			api.addOther(formula1.getName(), formula2.getName());
		} catch (ApiException e) {
			fail("Error when adding Other!");
		}

		// Should fail cause it gets added again
		try {
			api.addOther(formula1.getName(), formula2.getName());
			fail("Got added again!");
		} catch (ApiException e) {
			assertEquals("Error-Code is wrong!", 409, e.getCode());
		}

		// Check if others are in
		try {
			List<String> others = api.getAllOthers(formula1.getName());
			assertEquals("There are mote others than expected!", 2, others.size());
			assertEquals("Expected something else at 0", formula1.getName(), others.get(0));
			assertEquals("Expected something else at 1", formula2.getName(), others.get(1));
		} catch (ApiException e) {
			fail("Error when getting Others!");
		}

		// Remove 1
		try {
			api.removeOther(formula1.getName(), formula1.getName());
		} catch (ApiException e) {
			fail("Error when removing Other!");
		}

		// Check if 1 got removed
		try {
			assertEquals("Seems like remove did not work, cause length of getted is wrong!", 1,
					api.getAllOthers(formula1.getName()).size());
		} catch (ApiException e) {
			fail("Error when getting Othess!");
		}

		// Remove all
		try {
			api.removeAllOthers(formula1.getName());
		} catch (ApiException e) {
			fail("Error when removing all Others!");
		}

		// Check if all got removed
		try {
			assertEquals("Seems like remove did not work, cause length of getted is wrong!", 0,
					api.getAllOthers(formula1.getName()).size());
		} catch (ApiException e) {
			fail("Error when getting Othess!");
		}

		// Add one again
		try {
			api.addOther(formula1.getName(), formula2.getName());
		} catch (ApiException e) {
			fail("Error when adding Other!");
		}

		// What happens when Formula 2 gets removed
		try {
			api.deleteDailyformula(formula2.getName());
			fail("Should not be possible to remove because it is in use");
		} catch (ApiException e) {
			assertEquals("Error-Code is wrong!", 409, e.getCode());
		}

		// What happens when Formula 1 gets removed
		try {
			api.deleteDailyformula(formula1.getName());
		} catch (ApiException e) {
			fail("Delete should work cause it does not get used");
		}

		// Is Other still there?
		try {
			api.getAllOthers(formula1.getName());
			fail("Should throw an Error because formula1 is gone!");
		} catch (ApiException e) {
			assertEquals("Error-Code is wrong!", 404, e.getCode());
		}

		// This delete should work now too
		try {
			api.deleteDailyformula(formula2.getName());
		} catch (ApiException e) {
			fail("Delete went wrong!");
		}

	}
}
