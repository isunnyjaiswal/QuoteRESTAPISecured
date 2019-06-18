package com.service.DB;

import java.util.HashMap;
import java.util.Map;

import com.service.model.Quotes;

public class DBClass {
	
	private static Map<Long, Quotes> quotes = new HashMap<>();
	
	public static Map<Long, Quotes> getAllQuotes(){
		return quotes;	
	}
}
