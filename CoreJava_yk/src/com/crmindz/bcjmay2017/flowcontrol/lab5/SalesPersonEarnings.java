package com.crmindz.bcjmay2017.flowcontrol.lab5;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class will calculate the weekly earnings of salesperson based on the
 * items and number of items sold.
 */

public class SalesPersonEarnings {

	public static void main(String[] args) {

		int total = 0;
		Scanner scan = new Scanner(System.in);
		int numOfItems = scan.nextInt();
		float[] value = new float[numOfItems];

		for (int i = 0; i < numOfItems; i++) {
			value[i] = scan.nextFloat();
			total += value[i];
		}

		double totalEarnings = 200 + (0.09 * total);
		System.out.println("Total Earnings: " + totalEarnings);
		scan.close();
	}

}
