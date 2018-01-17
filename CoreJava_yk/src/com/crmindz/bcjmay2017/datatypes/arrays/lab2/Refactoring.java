package com.crmindz.bcjmay2017.datatypes.arrays.lab2;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *
 */
public class Refactoring {
	int avg;

	/**
	 * Method for calculating odd numbers in the given array
	 **/
	public int[] processingoddNumbers(int arr[]) {
		int[] odd = new int[arr.length];
		System.out.print("\n ODD Numbers: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				odd[i] = arr[i];
				System.out.print(" " + odd[i]);
			}
		}
		return odd;
	}

	/**
	 * Method for all even numbers to increase the value by 2 and store it in
	 * the same array at the same index and printing them
	 **/
	public int[] addition(int arr[]) {

		System.out.print("\n Array after Even numbers increased value increased by two: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(" " + arr[i]);
			}

			else {
				arr[i] = arr[i] + 2;
				System.out.print(" " + arr[i]);
			}
		}
		return arr;
	}

	/**
	 * Method to process and print the numbers that are divisible by three
	 **/
	public int[] processingDivisibility(int arr[]) {
		System.out.print("\n Array of numbers that are divisible by three: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(" " + arr[i]);
			}
		}
		return arr;
	}

	/**
	 * Method to calculate average for the given elements in the array
	 **/
	public int processingAverage(int arr[]) {
		int sum = 0;
		System.out.print("\n Average for the given elements in the array: ");
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.print(avg);
		return avg;
	}

	/**
	 * Method to process the highest value in the given array
	 **/
	public int processinglargestNumber(int arr[]) {
		int max = 0;
		System.out.print("\n Highest value in the given array: ");
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print(max);
		return max;
	}

	/**
	 * Method to process the lowest value in the given array
	 **/
	public int processingSmallestNumber(int arr[]) {
		int min = arr[0];
		System.out.print("\n Lowest value in the given array: ");
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min);
		return min;
	}

	public int processingSmallest(int arr[]) {
		Refactoring fo = new Refactoring();
		fo.processingAverage(arr);

		System.out.print("\n Number less than the average of the given array: ");
		for (int i = 0; i < arr.length; i++) {
			int temp = fo.avg;

			if (temp > arr[i]) {
				temp = arr[i];
				System.out.print(" " + temp);

			}
		}
		return avg;
	}

	public static void main(String[] args) {

		/**
		 * Taking and Declaring array from user and passing that array to above
		 * methods
		 **/
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int num = input.nextInt();
		System.out.println("Enter the Element " + num + " of an Array");
		int elements[] = new int[num];
		for (int i = 0; i < elements.length; i++) {
			System.out.println("Please enter elements in array");
			elements[i] = input.nextInt();
		}

		Refactoring fa = new Refactoring();
		fa.processingoddNumbers(elements);
		fa.processingDivisibility(elements);
		fa.processingAverage(elements);
		fa.processinglargestNumber(elements);
		fa.processingSmallestNumber(elements);
		fa.processingSmallest(elements);

		fa.addition(elements);
		input.close();
	}

}

