package com.crmindz.bcjmay2017.operators.lab3;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *	This class will calculate and display the result and remainder for
 * two given inputs.
 */
public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = num1/num2;
		int remainder = num1%num2;
		
		System.out.println("result: " + result + "\t" + "remainder: " + remainder);
		
		scan.close();
	}

}
