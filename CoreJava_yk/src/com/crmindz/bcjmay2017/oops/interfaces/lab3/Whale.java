package com.crmindz.bcjmay2017.oops.interfaces.lab3;


/**
 * @author Yeshwanth Konakanchi
 * This class will implement the WaterMammal interface and overrides the methods.
 */
public class Whale implements WaterMammal {
	
	@Override
	public void swim(){
		
		System.out.println("This is implementation for swim method.");
	}
	
	public static void main(String[] args) {
		
		WaterMammal m = new Whale();
		
		m.swim();
		m.eat();
		
	}

	@Override
	public void eat() {
		System.out.println("This is implementation for eat method.");
	}

}
