package com.crmindz.bcjmay2017.flowcontrol.lab4;

/**
 * @author Yeshwanth Konakanchi This class will print a table which shows
 *         multiples of 1 to 5 for 10, 100, and 1000.
 */
public class PrintTable {

	public static void main(String[] args) {

		System.out.println("N\t10*N\t100*N\t1000*N");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "\t" + 10 * i + "\t" + 100 * i + "\t" + 1000 * i);
		}
	}

}
