package com.crmindz.bcjmay2017.flowcontrol.lab8;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class will print the hollow square with side specified by the user
 */
public class PrintSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();

		for (int i = 0; i < length; i++) {
			System.out.print("* ");
		}
		
		System.out.println();
		
		if (length > 1) {
			
			for (int i = 0; i < length - 2; i++) {
				
				System.out.print("*");
				
				if (length > 2) {
					
					for (int j = 0; j < 2 * length - 3; j++) {
						
						System.out.print(" ");
					}
					
					System.out.print("*\n");
				}
			}
			
			if (length > 1) {
				
				for (int i = 0; i < length; i++) {
					System.out.print("* ");
				}
				
			}
		}
		scan.close();
	}
}
