package com.crmindz.bcjmay2017.operators.lab5;


import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 * This class calculates the sum, average and product of three numbers.
 */
public class NumberOperations {

	/**
	 * This method will calculate and display the sum, average and product of the given
	 * numbers and also specifies the largest and smallest numbers.
	 */
	public void performCalculation(int num1,int num2,int num3) {

		int sumResult = num1 + num2 + num3;

		System.out.println("Sum of " + num1 + "," + num2 + " and " + num3 + " is " + sumResult);

		double avgResult = (num1 + num2 + num3) / 2;

		System.out.println("Average of " + num1 + "," + num2 + " and " + num3 + " is " + avgResult);

		int productResult = num1 * num2 * num3;

		System.out.println("Product of " + num1 + "," + num2 + " and " + num3 + " is " + productResult);

		int max = num1;

		if (num2 > max) {
			max = num2;
		}

		if (num3 > max) {
			max = num3;
		}

		int min = num1;
		
		if (num2 < min) {
			min = num2;
		}

		if (num3 < min) {
			min = num3;
		}
		System.out.println(max + " is the largest number");
		System.out.println(min + " is the smallest number");
	}

	public static void main(String args[]) {

		NumberOperations nop = new NumberOperations();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		nop.performCalculation(num1,num2,num3);
		
		sc.close();

	}
}
