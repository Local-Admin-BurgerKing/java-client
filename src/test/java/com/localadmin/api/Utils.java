package com.localadmin.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.internal.LinkedTreeMap;

public class Utils {

	public static int getJsonPart(String json, String object) {
		JsonParser parser = new JsonParser();
		JsonElement jsonTree = parser.parse(json);
		JsonObject jsonObject = jsonTree.getAsJsonObject();
		return jsonObject.get(object).getAsInt();
	}

	public static Object getInTreeMap(Object map, String key) {
		LinkedTreeMap<?, ?> treeMap = (LinkedTreeMap<?, ?>) map;
		String[] keys = key.split("\\.");
		for (int i = 0; i < keys.length; i++) {
			if (i + 1 == keys.length)
				return treeMap.get(keys[i]);
			treeMap = (LinkedTreeMap<?, ?>) treeMap.get(keys[i]);
		}
		return null;
	}
}
