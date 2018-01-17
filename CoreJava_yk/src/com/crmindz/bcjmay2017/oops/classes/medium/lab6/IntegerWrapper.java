package com.crmindz.bcjmay2017.oops.classes.medium.lab6;

/**
 * @author Yeshwanth Konakanchi
 *Class to show a method swap to swap the values of two objects.
 */
public class IntegerWrapper {

	private int a;

	public IntegerWrapper(int a) {
		
		  this.a = a; 
	}
	
	public static void swap(IntegerWrapper integer, IntegerWrapper integer1 ){
		
		IntegerWrapper integer2;
		integer2 = integer;
		integer = integer1;
		integer1 = integer2;
		
		System.out.println("After swap 'integer.a' becomes: " + integer.a);
		System.out.println("After swap 'integer1.a' becomes: " + integer1.a);
		
	}
	
	public static void main(String[] args) {
		
		IntegerWrapper integer = new IntegerWrapper(5);
		IntegerWrapper integer1 = new IntegerWrapper(7);
		
		swap(integer,integer1);
		
		System.out.println("Before swap 'integer.a' is: " + integer.a);
		System.out.println("After swap 'integer1.a' is: " + integer1.a);
		
		
	}
	

}
