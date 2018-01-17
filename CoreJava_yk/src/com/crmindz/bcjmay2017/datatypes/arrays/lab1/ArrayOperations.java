package com.crmindz.bcjmay2017.datatypes.arrays.lab1;



/**
 * @author Yeshwanth Konakanchi 
 * This class will perform various operations on an
 * integer array and prints the results.
 */
public class ArrayOperations {

	/**
	 * @param numbers
	 *            This method will print all the odd numbers in the given array.
	 */

	public static void printOddNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				System.out.print(numbers[i] + " ");
			}
		}

	}

	/**
	 * @param numbers
	 *            This method will add 2 to all the even numbers in the given
	 *            array. Stores the values in a new array and prints the array.
	 */

	public static int[] IncrementEvenNumByTwo(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				numbers[i] += 2;
			}
			System.out.print(numbers[i] + " ");
		}
		return numbers;
	}

	/**
	 * @param numbers
	 *            This method will print all the numbers which are divisible by
	 *            3 in the given array.
	 */
	public static void printNumDivisibleByThree(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}

	/**
	 * @param numbers
	 *            This method will print average of all the numbers in the given
	 *            array.
	 */
	public static float printAvg(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		float avg = sum / (numbers.length);
		System.out.println(avg);
		return avg;
	}

	/**
	 * @param numbers
	 *            This method will print highest number in the given array.
	 */
	public static void printHighestValue(int[] numbers) {
		int num = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (num < numbers[i]) {
				num = numbers[i];
			}
		}
		System.out.println(num);
	}

	/**
	 * @param numbers
	 *            This method will print the lowest number in the given array.
	 */
	public static void printLowestValue(int[] numbers) {
		int num = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (num > numbers[i]) {
				num = numbers[i];
			}
		}
		System.out.println(num);
	}

	/**
	 * @param numbers
	 *            This method will print all the numbers that are below the
	 *            average of the numbers in the given array.
	 */
	public static void printNumLessThanAvg(float average, int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (average > numbers[i]) {
				int num = numbers[i];
				System.out.print(num + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };

		System.out.println("Odd numbers in the given array are: ");

		printOddNumbers(numbersArray);

		System.out.println();

		System.out.println("New Array after adding two to all the even numbers: ");

		numbersArray = IncrementEvenNumByTwo(numbersArray);

		System.out.println();

		System.out.println("All the numbers divisible by 3 in the given array are: ");

		printNumDivisibleByThree(numbersArray);

		System.out.println();

		System.out.println("The Average of all the numbers in the given array are: ");

		float average = printAvg(numbersArray);

		System.out.println("The Highest of all the numbers in the given array are: ");

		printHighestValue(numbersArray);

		System.out.println("The Lowest of all the numbers in the given array are: ");

		printLowestValue(numbersArray);

		System.out.println("All the numbers below average in the given array are: ");

		printNumLessThanAvg(average, numbersArray);

	}
}
