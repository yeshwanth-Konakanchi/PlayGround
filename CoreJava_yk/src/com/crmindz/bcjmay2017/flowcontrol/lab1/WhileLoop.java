package com.crmindz.bcjmay2017.flowcontrol.lab1;

/**
 * @author Yeshwanth Konakanchi 
 * This class will print even numbers between 50
 *         and 80 using while loop.
 */
public class WhileLoop {

	public static void main(String[] args) {
		int i = 50;

		while (i <= 80) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

			i++;
		}
	}

}
