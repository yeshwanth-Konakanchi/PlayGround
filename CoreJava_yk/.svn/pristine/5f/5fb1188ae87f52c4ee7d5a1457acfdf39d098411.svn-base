package com.crmindz.bcjmay2017.operators.lab5;


import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 * This class will separate the number given and prints its individual digits with spaces.
 */
public class NumberSeparation {

	/**
	 * This method takes the given number and prints the individual digits with spaces.
	 */
	public void serparateNumber(int number) {

		int length = String.valueOf(number).length();
		int num = 1;
		
		for(int i=1;i<length;i++)
			 num = num * 10;

		for(int i=1; i<=length; i++){
			
			System.out.print(number/num + " ");
			number = number % num;
			num = num / 10;
		}
	}

	public static void main(String args[]) {

		NumberSeparation ns = new NumberSeparation();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int number = sc.nextInt();
		
		ns.serparateNumber(number);
		
		sc.close();
	}
}
