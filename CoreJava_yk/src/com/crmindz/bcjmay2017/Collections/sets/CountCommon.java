package com.crmindz.bcjmay2017.Collections.sets;


import java.util.HashSet;

/**
 * @author Yeshwanth Konakanchi
 * This class will count the number of common elements in given two sets.
 */
public class CountCommon {

	/**
	 * @param mySet1
	 * @param mySet2
	 * @return count
	 * This method will take two sets and counts the number of common elements in 
	 * both the sets and returns the count.
	 */
	public static int countCommon(HashSet<Integer> mySet1, HashSet<Integer> mySet2) {
		int count = 0;
		
		for(int i:mySet1)
			for(int j:mySet2)
				if(i==j)
					count++;
		
		return count;
	}
	
	public static void main(String[] args) {
		
		HashSet<Integer> mySet1 = new HashSet<Integer>();
		
		mySet1.add(3);
		mySet1.add(7);
		mySet1.add(3);
		mySet1.add(-1);
		mySet1.add(2);
		mySet1.add(3);
		mySet1.add(7);
		mySet1.add(2);
		mySet1.add(15);
		mySet1.add(15);
		
		HashSet<Integer> mySet2 = new HashSet<Integer>();
		
		mySet2.add(-5);
		mySet2.add(15);
		mySet2.add(2);
		mySet2.add(-1);
		mySet2.add(7);
		mySet2.add(15);
		mySet2.add(36);
		
		int result = countCommon(mySet1,mySet2);
		
		System.out.println("Number of common elements in both sets: " + result);
		
	}

	
}
