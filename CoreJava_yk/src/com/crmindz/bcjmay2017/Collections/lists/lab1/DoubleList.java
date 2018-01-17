package com.crmindz.bcjmay2017.Collections.lists.lab1;

import java.util.ArrayList;

/**
 * @author Yeshwanth Konakanchi
 *This class will add every element in the list twice and 
 * doubles the list.
 */
public class DoubleList {

	/**
	 * @param array
	 * @return
	 * This method will take an array list as input and add every element in the list 
	 * into the list again and returns the result list.
	 */
	public static ArrayList<String> doubleList(ArrayList<String> array) {
		int oldSize = array.size();

		for (int i = 0; i < oldSize; i++) {
			String word = array.get(2 * i);
			array.add(2 * i + 1, word);
		}

		return array;

	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("how");
		list.add("are");
		list.add("you?");

		list = doubleList(list);

		for (String s : list) {

			System.out.print(s + " ");
		}

	}

}
