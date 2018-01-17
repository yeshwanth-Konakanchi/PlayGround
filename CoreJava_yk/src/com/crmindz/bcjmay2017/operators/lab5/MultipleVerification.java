package com.crmindz.bcjmay2017.operators.lab5;


import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 * This class takes two numbers ad specifies the first number is multiple of second number or not.
 */
public class MultipleVerification {

	/**
	 * This method takes two numbers ad specifies the first number is multiple of second number or not.
	 */
	public void checkMultiples(int num1,int num2) {

		if (num2 % num1 == 0) {

			System.out.println(" The given integer " + num1 + " is a multiple of " + num2);
		}

		else {

			System.out.println("The given integer " + num1 + " is not a multiple of " + num2);
		}
	}

	public static void main(String args[]) {

		MultipleVerification mv = new MultipleVerification();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the integers");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		mv.checkMultiples(num1,num2);
		
		sc.close();
	}
}
