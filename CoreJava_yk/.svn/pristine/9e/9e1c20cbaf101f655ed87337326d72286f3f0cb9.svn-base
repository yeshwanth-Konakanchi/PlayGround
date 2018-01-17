package com.crmindz.bcjmay2017.datatypes.arrays.lab3;


import java.util.Scanner;


/**
 * @author Yeshwanth Konakanchi
 * This class will generate the Fibonacci Series upto the number given by the user.
 */

public class Fibonacci {
	
	public static int num1=0, num2=1, num3;
	
	/**
	 * @param n
	 * @return
	 * This method will store the result of Fibonacci series upto the given number in an array
	 */
	public static int[] returnFibonacciSequence(int n){
		
		int[] fibonacciSequence= new int[n];
		for(int i=0; i<n; i++){	
			num3= num2+num1;
			fibonacciSequence[i]=num3;
			num1=num2;
			num2=num3;
		}
		return fibonacciSequence;
	}
	
	/**
	 * @param args
	 * This main method prints the array of Fibonnaci Series
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		int[] fibonacciSequence= returnFibonacciSequence(n);
		for (int i=0; i<fibonacciSequence.length; i++){
			System.out.println(fibonacciSequence[i]);
		}
		scan.close();
	}
}
