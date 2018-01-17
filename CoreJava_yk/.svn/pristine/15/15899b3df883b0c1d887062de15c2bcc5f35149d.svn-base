package com.crmindz.bcjmay2017.operators.lab5;


import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi 
 * This class will take two numbers and specifies the larger number.
 */
public class NumberComparison {

	/**
	 * This method compares between the given two numbers and prints the result.
	 */
	public void compareNumbers(int num1,int num2) {

		if (num1 == num2)
			System.out.println("These numbers are equal");

		else if (num1 > num2)
			System.out.println(num1 + " is larger");

		else
			System.out.println(num2 + " is larger");
	}

	public static void main(String args[]) {

		NumberComparison nc = new NumberComparison();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers:");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		nc.compareNumbers(num1,num2);
		
		sc.close();
	}
}
