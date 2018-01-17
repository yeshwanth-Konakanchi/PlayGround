package com.crmindz.bcjmay2017.Collections.comparator.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Yeshwanth Konakanchi 
 * This class generates a list of random numbers
 * and calls the methods to sort the list in backward direction and also
 * sort the positive numbers as usual and negative numbers in backward
 * direction.
 */
class Sorting {

	public static void main(String[] args) {
		int listSize = 30;
		int magnitude = 500;
		Random rand = new Random(12345);

		ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
		for (int i = 0; i < listSize; i++) {
			numbers.add(rand.nextInt() % magnitude);
		}

		Collections.sort(numbers);

		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

		System.out.println();
		Collections.sort(numbers, new BackwardOrdering());

		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

		System.out.println();
		Collections.sort(numbers, new AlternateOrdering());
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

	}
}