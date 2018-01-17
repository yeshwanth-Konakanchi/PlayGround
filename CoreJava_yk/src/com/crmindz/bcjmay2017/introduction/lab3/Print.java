package com.crmindz.bcjmay2017.introduction.lab3;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class takes input from user using Scanner class and
 * 		prints details.
 */
public class Print {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the FirstName :");
		String firstName = scan.next();
		System.out.println("Enter the LastName :");
		String lastName = scan.next();
		System.out.println("Enter the age :");
		int age = scan.nextInt();
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		System.out.println("age: " + age);
		scan.close();
	}
}
