package com.crmindz.bcjmay2017.Collections.lists.lab1;


import java.util.ArrayList;

/**
 * @author Yeshwanth Konakanchi
 * This class will reverse the strings in odd and even positions in a given list.
 */
public class ReverseOddAndEven {

	/**
	 * @param list
	 * @return list
	 * This method will take an array list and reverse the strings in even and odd positions
	 * and returns the result list.
	 */
	public static ArrayList<String> reverseOddAndEvenList(ArrayList<String> list){
		
		for(int i=0;i<list.size()-1;i++){
			
			String temp = list.get(i);
			list.set(i,list.get(i+1));
			list.set(i+1,temp);
			i++;
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("how");
		list.add("are");
		list.add("you?");
		list.add("I");
		list.add("am");
		list.add("doing");
		list.add("fine");
		
		ArrayList<String> newList = reverseOddAndEvenList(list);
		
		for(String str:newList)
			System.out.println(str);
	}

}
