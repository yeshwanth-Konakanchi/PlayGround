package com.crmindz.bcjmay2017.oops.inheritance.lab3;

/**
 * @author Yeshwanth Konakanchi
 *This class inherits the Car class and overrides the methods from Car.
 */
public class Truck extends Car{

	/**
	 * This method is overrided method from class Car
	 */
	public void m1() {
        System.out.println("truck 1");
    }
     
	/**
	 * This method is overrided method from class Car
	 */
    public void m2() {
        super.m1();
    }
     
    /**
   	 * This method is overrided method from class Car
   	 */
    public String toString() {
        return super.toString() + super.toString();
    }
}
