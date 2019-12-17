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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.internal.LinkedTreeMap;
import com.localadmin.ApiClient;
import com.localadmin.ApiException;
import com.localadmin.Configuration;
import com.localadmin.auth.ApiKeyAuth;
import com.localadmin.model.Apikeywrapper;
import com.localadmin.model.Dailycolumn;
import com.localadmin.model.Filter;
import com.localadmin.model.Filter1;

/**
 * API tests for FiltersApi
 */
public class FiltersApiTest {

	private final FiltersApi api = new FiltersApi();
	private final ColumnApi col_api = new ColumnApi();
	private ApiKeyAuth User_Auth;
	private String key;
	private boolean resetFiltersTableBefore = true;
	
	private Filter filter1;
	private Filter filter2;
	
	private Dailycolumn col1;
	private Dailycolumn col2;
	
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

		if (resetFiltersTableBefore) {
			try {
				api.removeAllFilters();
			} catch (ApiException e) {
				System.err.println(e.getResponseBody());
//				fail("Fail when reseting filter table! " + e.getCode());
			}
		}
		
		col1 = new Dailycolumn().name("c1");
		col2 = new Dailycolumn().name("c2");
		
		List<String> whitelist1 = new ArrayList<>();
		whitelist1.add(col1.getName());
		whitelist1.add(col2.getName());
		
		filter1 = new Filter();
		filter1.setName("Filter1");
		filter1.setWhitelist(whitelist1);

		filter2 = new Filter();
		filter2.setName("Filter2");
		filter2.setWhitelist(whitelist1);
	}
	
	/**
	 * Create filter, Get filter, Get all filters, Remove filter, Remove all filters
	 *
	 * Create new filter
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void createDeleteGetFilterTest() throws ApiException {
		try {
			api.createFilter(filter1);
		} catch (ApiException e) {
			fail("Error while creating filter: " + e.getCode());
		}

		try {
			Filter1 filter = api.getFilter(filter1.getName());
			assertEquals("Filter name not matching.", filter.getName(), filter1.getName());
			// es gibt kein assertIterableEquals oder so
			assertEquals("Filter Column-whitelist length not matching.", filter.getWhitelist().size(),
					filter1.getWhitelist().size());
		} catch (ApiException e) {
			fail("Filter was not added / could not be get: " + e.getCode());
		}

		// Test unvalid filter creation
		filter2.setName("");
		try {
			api.createFilter(filter2);
			fail("Error, could create filter with missing/empty name.");
		} catch (ApiException e) {
		}

		try {
			api.createFilter(filter1);
			fail("Error, could create identical filter again.");
		} catch (ApiException e) {
			assertEquals("Error-code wrong!", 409, e.getCode());
		}

		// Test get all filters (wholeData null)
		try {
			List<Object> filters = api.getAllFilters(null);
			
			assertNotEquals("Filter list empty.", 0, filters.size());
			
			assertEquals("Filter name not matching.", ((LinkedTreeMap) filters.get(0)).get("name"), filter1.getName());
		} catch (ApiException e) {
			fail("Error while getting all filters (wholedata null): " + e.getCode());
		}
		// Test get all filters (wholeDate true)
		try {
			List<Object> filters = api.getAllFilters(true);
			assertNotEquals("Filter list empty.", 0, filters.size());
			
			// es gibt nur einen Filter in der DB
			LinkedTreeMap filters_0 = (LinkedTreeMap) filters.get(0);
			assertEquals("Filter name not matching.", filter1.getName(), filters_0.get("name"));
			assertEquals("Filter Column-whitelist length not matching.", filter1.getWhitelist().size(),
					((List<Object>) filters_0.get("whitelist")).size());
		} catch (ApiException e) {
			fail("Error while getting all filters (wholedata true):" + e.getCode());
		}
		// Test get specific filter
		try {
			Filter1 filter = api.getFilter(filter1.getName());
			assertEquals("Filter name not matching.", filter1.getName(), filter.getName());
			assertEquals("Filter Column-whitelist length not matching.", filter1.getWhitelist().size(),
					filter.getWhitelist().size());
		} catch (ApiException e) {
			fail("Error while getting all filters (wholedata true): " + e.getCode());
		}
		// Test get specific filter columns
		try {
			List<String> wl = api.getFilterColumns(filter1.getName());
			assertEquals("Filter Column-whitelist length not matching.", wl.size(), 2);
		} catch (ApiException e) {
			fail("Error while getting a specifc filter columns: " + e.getCode());
		}

		// Test filter removal
		try {
			api.deleteFilter(filter1.getName());
		} catch (ApiException e) {
			fail("Error while removing filter: " + e.getCode());
		}

		try {
			api.getFilter(filter1.getName());
			fail("Filter was not removed and can still be get.");
		} catch (ApiException e) {
			assertEquals("Error-code wrong.", 404, e.getCode());
		}
		// Test empty list
		try {
			List<Object> filters = api.getAllFilters(false);
			assertNull("Filter list should be empty.", filters);
		} catch (ApiException e) {
			assertEquals("Response-code wrong.", 204, e.getCode());
		}
	}
	
	@Test
	public void filterNotFound() throws ApiException {
		try {
			api.getFilter(filter1.getName());
			fail("Filter should not be found.");
		} catch (ApiException e) {
			assertEquals("Error-code wrong.", 404, e.getCode());
		}

		try {
			api.getFilterColumns(filter1.getName());
			fail("Filter columns should not be found.");
		} catch (ApiException e) {
			assertEquals("Error-code wrong.", 404, e.getCode());
		}
		
		filter1.setName("");
		try {
			api.getFilterColumns(filter1.getName());
			fail("Filter columns should not be found.");
		} catch (ApiException e) {
			assertEquals("Error-code wrong.", 404, e.getCode());
		}
	}

	@Test
	public void removeAllFiltersTest() {
		try {
			api.createFilter(filter1);
			api.createFilter(filter2);

			api.getFilter(filter1.getName());
			api.getFilter(filter2.getName());
		} catch (ApiException e) {
			fail("Error while creating/getting test-dependent filter: " + e.getCode());
		}

		try {
			api.removeAllFilters();
		} catch (ApiException e) {
			fail("Error while removing all filters: " + e.getCode());
		}

		try {
			Filter1 ret1 = api.getFilter(filter1.getName());
			Filter1 ret2 = api.getFilter(filter2.getName());
			fail("Error, filter should be already removed.");
		} catch (ApiException e) {
			assertEquals("Error-code wrong.", 404, e.getCode());
		}
	}

	/**
	 * Rename filter
	 *
	 * Change the name of a filter
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void renameFilterTest() throws ApiException {
		String newname = "filter45";
		try {
			api.createFilter(filter1);
		} catch (ApiException e) {
			fail("Error while creating test-dependent filter: " + e.getCode());
		}

		try {
			api.renameFilter(filter1.getName(), newname);
		} catch (ApiException e) {
			fail("Error while renaming filter: " + e.getCode());
		}

		try {
			Filter1 ret = api.getFilter(newname);
			assertEquals("Filter name not matching.", ret.getName(), newname);
		} catch (ApiException e) {
			fail("Error while getting renamed filter: " + e.getCode());
		}

		try {
			Filter1 ret = api.getFilter(filter1.getName());
			fail("Filter \""+filter1.getName()+"\"should not be found, because it got renamed.");
		} catch (ApiException e) {
			assertEquals("Error-code wrong", e.getCode(), 404);
		}
	}

	/**
	 * Replace filter columns
	 *
	 * Replace the list of columns/formulas of the filter.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void replaceFilterColumnsTest() throws ApiException {
		List<String> whitelist = new ArrayList<String>();
		whitelist.add(col1.getName());
		filter1.setWhitelist(whitelist);
		try {
			api.createFilter(filter1);
		} catch (ApiException e) {
			fail("Error while creating test-dependent filter.");
		}

		try {
			List<String> new_cols = new ArrayList<>();
			new_cols.add("c2");
			filter1.setWhitelist(new_cols);
			List<String> ret_wl = api.replaceFilterColumns(filter1.getName(), filter1.getWhitelist(), true);
			
			ret_wl = ret_wl == null ? new ArrayList<>() : ret_wl;
			
			assertEquals("Filter column whitelist length not matching.", filter1.getWhitelist().size(), ret_wl.size());
			for (String curr_col : ret_wl) {
				if (!filter1.getWhitelist().contains(curr_col)) {
					fail("Filter whitelist column not updated.");
				}
			}
		} catch (ApiException e) {
			fail("Error while replacing/getting filter columns: " + e.getCode());
		}
	}
}
