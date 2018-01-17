package com.crmindz.bcjMay2017.codingQue;

import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int array[] = {5,6,7,5,3,3};
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		for (int i=0;i< array.length; i++){
			numbers.add(array[i]);
		}
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
}
