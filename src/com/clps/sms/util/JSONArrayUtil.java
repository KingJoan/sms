package com.clps.sms.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSONArrayUtil {
	public static void showJSONArray(JSONArray jsonArray){
		for(int i=0;i<jsonArray.size();i++){
			JSONObject jsonObject=(JSONObject) jsonArray.get(i);
			JSONArray jsonArrayItem=new JSONArray();
			jsonArrayItem.add(jsonObject);
			System.out.println(jsonArrayItem);
		}
	}
}
