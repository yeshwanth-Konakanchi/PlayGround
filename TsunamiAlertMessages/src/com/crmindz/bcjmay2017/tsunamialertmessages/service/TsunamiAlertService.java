package com.crmindz.bcjmay2017.tsunamialertmessages.service;

import java.util.Map;

import com.crmindz.bcjmay2017.tsunamialertmessages.alerts.IndiaAlerts;
import com.crmindz.bcjmay2017.tsunamialertmessages.alerts.UKAlerts;



public class TsunamiAlertService {

	public static Map<String, String> processTsunamiData(String country){
		Map<String, String> hashmap = null;
		if ("IN".equals(country)){
			
			 hashmap = IndiaAlerts.getIndiaAlerts();
		}
		else if("UK".equals(country)){
		 hashmap=UKAlerts.getUKAlerts();
			
		}
		
		for (Map.Entry<String, String> entry : hashmap.entrySet())
		{
			String key = entry.getKey();
			String value = entry.getValue();
		    AlertMessages.addMessage(key, value);
		}
		return AlertMessages.getMessage();
	}
}
