package com.crmindz.bcjmay2017.Collections.maps;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Yeshwanth Konakanchi
 * This class will take a map of strings and integers and prints the integer which
 * appeared very few times than all the other integers.
 */
public class RarestInteger {
	
	/**
	 * @param map
	 * @return rarest integer
	 * This method will take a map of strings and integers and prints the integer which
	 * appeared very few times than all the other integers.
	 */
	public static int rarest(Map<String, Integer> map){
		
		int rarest = 0;
		int result = 0;
		
		ArrayList<Integer> s = new ArrayList<Integer>(map.values());
		Map<Integer, Integer> newMap =  new LinkedHashMap<Integer, Integer>();

		for(Integer str: s){
			int count=0;
			for(Entry<String, Integer> m:map.entrySet()){
				if(m.getValue().equals(str)){
					count ++;
					newMap.put(m.getValue(), count);
				}
			}
		}
		
		for(Entry<Integer, Integer> m:newMap.entrySet()){
			if(rarest == 0){
				rarest = m.getValue();
				result = m.getKey();
			}
			else if(m.getValue() < rarest){
				rarest = m.getValue();
				result = m.getKey();
			}
			else if(m.getValue() == rarest){
				if(m.getKey() < result)
					result = m.getKey();
			}
				
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Alyss", 22);
		map.put("Char", 25);
		map.put("Dan", 25);
		map.put("Jeff", 20);
		map.put("Kasey", 20);
		map.put("Kim", 20);
		map.put("Morgan", 25);
		map.put("Ryan", 25);
		map.put("Stef", 22);
		
		int result = rarest(map);
		
		System.out.println("The rarest number in the given Map is: " + result);
		
	}
}
