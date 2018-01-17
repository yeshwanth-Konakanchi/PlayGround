package com.crmindz.bcjmay2017.Collections.lists.lab1;


import java.util.ArrayList;

/**
 * @author Yeshwanth Konakanchi
 * This class will reverse each string in the given list.
 */
public class ReverseStrings {
	
	/**
	 * @param list
	 * @return list
	 * This method will take an array list and reverse each string in the list and
	 * returns the result list.
	 */
	public static ArrayList<String> reverseStrings(ArrayList<String> list){
		
		for(String str:list)
			list.set(list.indexOf(str),new StringBuilder(str).reverse().toString());
		
		return list;
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("how");
		list.add("are");
		list.add("you?");
		
		 ArrayList<String> newList = reverseStrings(list);
		 
		 for(String str:newList)
			 System.out.println(str);
	}

}
