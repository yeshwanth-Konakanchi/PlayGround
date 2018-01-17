package com.crmindz.bcjmay2017.tsunamialertmessages.alerts;



import java.util.HashMap;
import java.util.Map;

public class UKAlerts {

public static Map<String, String> getUKAlerts(){
		
		HashMap<String,String> hmap=new HashMap<String,String>();
		 hmap.put("UK1","Water Level 70%");  
		  hmap.put("UK2","EarthQuake Richter scale 8.0");  
		  hmap.put("UK3","Human deaths 1200");
		  
		  return hmap;
}
}
