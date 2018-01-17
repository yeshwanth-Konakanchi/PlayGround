package com.crmindz.bcjmay2017.flowcontrol.lab7;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class will compare all the inputs given and prints the largest number
 * among the given integers.
 */
public class Largest_Number {
	
	/**
	 * @param args
	 * This method will take integers as input and returns the largest number
	 * among the given input.
	 */
	public static void main(String[] args) {
		int counter = 10;
		int[] number = new int[10];
		int largest = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<counter; i++){
			number[i] = scan.nextInt();
			if(number[i]>largest){
				largest = number[i];
			}
		}
		
		System.out.println(largest);
		scan.close();
	}

}
