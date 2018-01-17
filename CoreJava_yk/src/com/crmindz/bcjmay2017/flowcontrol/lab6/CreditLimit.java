package com.crmindz.bcjmay2017.flowcontrol.lab6;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class will calculate the credit limit of the customer based on the 
 * purchases made by the customer.
 */

public class CreditLimit {

	/**
	 * @param args
	 * This method will take all the inputs from the user and calculates the 
	 * credit limit of the customer and prints a message if the credit limit is 
	 * exceeded.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int accountNo = scan.nextInt();
		float balance = scan.nextFloat();
		float charges = scan.nextFloat();
		float credits = scan.nextFloat();
		int creditLimit = scan.nextInt();

		System.out.println("Account No: " + accountNo);
		System.out.println("Credit Limit: " + creditLimit);
		System.out.println("Balance: " + balance);
		float newBalance = balance + credits - charges;
		System.out.println(newBalance);
		if (newBalance < 0) {
			System.out.println("Credit limit is exceeded");
		}
		scan.close();

	}
}
