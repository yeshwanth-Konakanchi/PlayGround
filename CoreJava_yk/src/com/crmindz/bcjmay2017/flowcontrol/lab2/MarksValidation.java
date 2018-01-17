package com.crmindz.bcjmay2017.flowcontrol.lab2;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi This class will print the message based on the
 *         marks given as input.
 */
public class MarksValidation {

	/**
	 * @param marks
	 * @return This method will take the marks as input and returns true if
	 *         marks are >=65 and <= 100 else returns false.
	 */
	public boolean hasPassed(int marks) {

		if (marks >= 65 && marks <= 100) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		MarksValidation marksValidation = new MarksValidation();
		boolean x = marksValidation.hasPassed(marks);

		if (x == true) {
			System.out.println("Passed Successfully!");
		} else {
			System.out.println("Failed!");
		}

		s.close();
	}

}
