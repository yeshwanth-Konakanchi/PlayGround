package com.crmindz.bcjmay2017.Collections.maps;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Yeshwanth Konakanchi
 * This class will generate a map with person names and cities 
 * and counts the number of persons for each city. 
 */
public class CityCount {

	/**
	 * @param map
	 * @return newMap
	 * This method will take a map with persons and cities and counts the number of
	 * persons for each city. It stores the cities and count in a new map 
	 * and returns the new map.
	 */
	public static Map<String, String> cityCount(Map<String, String> map){
		
		Set<String> s = new TreeSet<String>(map.values());
		Map<String, String> newMap =  new LinkedHashMap<String, String>();
		
		for(String str: s){
			int count = 0;
			for(Map.Entry<String, String> m:map.entrySet()){
				if(m.getValue().equals(str)){
					count ++;
					newMap.put(m.getValue(), Integer.toString(count));
				}
			}
		}
		
		return newMap;
	}
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("John","Dallas");

		map.put("Babbar","NewYork City");

		map.put("Akbar","Houston");

		map.put("Rizwan","Dallas");

		map.put("Jorge","Paris");

		map.put("Roshan","Dallas");

		map.put("Sujit","Houston");
		
		Map<String, String> result =  cityCount(map);
		
		for(Map.Entry<String, String> m:result.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
