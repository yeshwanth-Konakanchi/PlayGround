package com.crmindz.bcjmay2017.Collections.sets;


import java.util.HashSet;

/**
 * @author Yeshwanth Konakanchi
 * This class will create set using HashSet and perform different methods on the set.
 */
public class SetDemo {

@SuppressWarnings("unused")
public static void main( String [] args ) {

    HashSet<String> mySet = new HashSet<String>();
    int count = 0;

    String fruit1 = "pear", fruit2 = "banana", fruit3 = "tangerine", fruit4 = "strawberry", fruit5 = "blackberry";
    
    mySet.add(fruit1);
    mySet.add(fruit2);
    mySet.add(fruit3);
    mySet.add(fruit4);
    mySet.add(fruit5);

    System.out.println("mySet now contains:");
    	System.out.println(mySet);

    for(String str:mySet)
    	count++;
    
    System.out.println("number of elements = " + count);
    
    mySet.remove("blackberry");
    mySet.remove("strawberry");
    
    System.out.println("blackberry and strawberry removed; mySet now contains:");
	System.out.println(mySet);
	
	mySet.clear();
	System.out.println("mySet has been cleared.");
	
	if(mySet.isEmpty() == true)
		System.out.println("mySet is now empty.");
    
  }
}