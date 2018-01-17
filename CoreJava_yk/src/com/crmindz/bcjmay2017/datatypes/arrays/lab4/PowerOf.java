package com.crmindz.bcjmay2017.datatypes.arrays.lab4;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi 
 * This class will calculate powers of a given base
 *         and stores them in an array.
 *
 */
public class PowerOf {

	/**
	 * @param n
	 * @return 
	 * This method will calculate the powers of base 2 and stores them
	 *         in an array
	 */
	public static int[] powerOfTwo(int n) {
		int[] twoPowerSequence = new int[n];
		twoPowerSequence[0] = 1;
		int num = 1;
		for (int i = 1; i < n; i++) {
			num *= 2;
			twoPowerSequence[i] = num;
		}
		return twoPowerSequence;
	}

	/**
	 * @param base
	 * @param power
	 * @return 
	 * This method will calculate the powers of any given base and
	 *         stores them in an array
	 */
	public static int[] power(int base, int power) {
		int[] Sequence = new int[power];
		Sequence[0] = 1;
		int num = 1;
		for (int i = 1; i < power; i++) {
			num *= base;
			Sequence[i] = num;
		}
		return Sequence;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to generate powers of 2: ");
		int n = scan.nextInt();

		int[] twoPowerSequence = powerOfTwo(n);

		for (int i = 0; i < n; i++) {
			System.out.println(twoPowerSequence[i]);
		}

		System.out.println("Enter base: ");
		int base = scan.nextInt();
		System.out.println("Enter power: ");
		int power = scan.nextInt();

		int[] Sequence = power(base, power);

		for (int i = 0; i < power; i++) {
			System.out.println(Sequence[i]);
		}
		scan.close();
	}

}
