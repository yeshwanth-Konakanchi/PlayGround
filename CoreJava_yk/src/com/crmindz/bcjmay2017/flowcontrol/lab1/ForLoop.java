package com.crmindz.bcjmay2017.flowcontrol.lab1;

/**
 * @author Yeshwanth Konakanchi 
 * This class will print all the even numbers
 *         between 50 and 80 using for loop.
 */
public class ForLoop {

	public static void main(String[] args) {
		for (int i = 50; i <= 80; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
