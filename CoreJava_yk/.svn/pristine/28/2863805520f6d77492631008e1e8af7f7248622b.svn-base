package com.crmindz.bcjmay2017.operators.lab5;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 * This class calculates the diameter, circumference and area of a circle.
 */
public class Circle {

	/**
	 * This method takes the radius from the user and calculates 
	 * the diameter, circumference and area.
	 */
	public void doOperations(int radius){

		int diameter = 2 * radius;
		System.out.printf("Diameter of the circle is = %d", +diameter);

		float circumference = 2 * (float) Math.PI * radius;
		System.out.printf("\nCircumference of the circle is = %f", +circumference);

		float area = (float) Math.PI * radius * radius;
		System.out.printf("\nArea of the circle is = %f", +area);
		
	}

	public static void main(String args[]) {

		Circle obj = new Circle();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius of the circle:");
		
		int radius = sc.nextInt();
		
		obj.doOperations(radius);
		
		sc.close();
	}

}
