package com.crmindz.bcjmay2017.Collections.lists.lab1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Yeshwanth Konakanchi
 * This class will display a given list from forward and backward direction and
 * also adds banana in between the tangerine and strawberry in the list.
 */
public class ListOfFruit {

	/**
	 * @param list
	 * This method will take an array list as input and 
	 * displays the list from forward and backward direction.
	 */
	public static void displayList(ArrayList<String> list){
		Iterator<String> itr = list.iterator();
		ListIterator<String> litr = list.listIterator();
		
		System.out.println("Elements in the order of insertion:");
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Elements in the reverse order:");
		
		while(litr.hasNext())
			if(list.indexOf(litr.next())==list.size());
		
		while(litr.hasPrevious())
			System.out.println(litr.previous());
			
	
	}
	
	/**
	 * @param list
	 * @return list
	 * This method will add banana into the list in between tangerine and strawberry 
	 * and returns the result list.
	 */
	public static ArrayList<String> insertIntoList(ArrayList<String> list){

		for(int i=0;i<list.size();i++){
			
			if("tangerine".equals(list.get(i)) && "strawberry".equals(list.get(i+1)))
				list.add(i+1,"banana");
		}
		
		return list;
	}
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("pear");
		list.add("banana");
		list.add("tangerine");
		list.add("strawberry");
		list.add("blackberry");
		
		displayList(list);
		
		ArrayList<String> newList = insertIntoList(list);
		
		System.out.println("Second banana added; elements are:");
		
		for(String str:newList)
			System.out.println(str);
	}

}
