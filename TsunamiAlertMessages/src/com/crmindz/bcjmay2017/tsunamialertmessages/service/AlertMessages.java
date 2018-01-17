package com.crmindz.bcjmay2017.tsunamialertmessages.service;

import java.util.HashMap;
import java.util.Map;

public class AlertMessages {
	private static Map<String,String> message =new HashMap<String,String>();
	
	public static void addMessage(String key, String alert){
		message.put(key, alert);
	}

	public static Map<String, String> getMessage() {
		return message;
	}

	public static void setMessage(Map<String, String> message) {
		AlertMessages.message = message;
	}

	
	

}
