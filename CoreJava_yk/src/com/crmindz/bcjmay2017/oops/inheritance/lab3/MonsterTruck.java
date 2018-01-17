package com.crmindz.bcjmay2017.oops.inheritance.lab3;

/**
 * @author Yeshwanth Konakanchi
 *This class will inherit the Truck class and overrides the methods.
 */
public class MonsterTruck extends Truck {
	
	/**
	 * This method is overrided method from class Truck
	 */
	public void m1(){
		System.out.println("monster 1");
	}
	
	/**
	 * This method is overrided method from class Truck
	 */
	public void m2(){
		super.m1();
		super.m2();
	}
	
	/**
	 * This method is overrided method from class Truck
	 */
	public String toString(){
		return "monster " + super.toString();
	}

	public static void main(String[] args) {
		Car car=new MonsterTruck();
		car.m1();
		car.m2();
		System.out.println(car);
	}
}
