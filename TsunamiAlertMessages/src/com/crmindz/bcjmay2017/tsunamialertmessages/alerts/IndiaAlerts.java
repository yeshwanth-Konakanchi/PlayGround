package com.crmindz.bcjmay2017.tsunamialertmessages.alerts;



import java.util.HashMap;
import java.util.Map;

public class IndiaAlerts {
	
	public static Map<String, String> getIndiaAlerts(){
		
		HashMap<String,String> hmap=new HashMap<String,String>();
		 hmap.put("IN1","Water Level 60%");  
		  hmap.put("IN2","EarthQuake Richter scale 7.5");  
		  hmap.put("IN3","Human deaths 1000");
		  
		  return hmap;
	}

}
