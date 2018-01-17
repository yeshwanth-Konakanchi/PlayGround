package com.crmindz.bcjmay2017.datatypes.Strings.lab4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class will perform some operations on a given string
 */
public class MaxOfNumbers {
	
	/**
	 * @param str
	 * @return
	 * This method will parse the given string and returns the array of numbers
	 */
	public static int[] parseTheString(String str){
		String delims = "[ ,]+";
		String[] stringTokens = str.split(delims);
		int num[] = new int[stringTokens.length];
		for(int i=0; i< stringTokens.length; i++){
			int result= Integer.parseInt(stringTokens[i]);
			num[i]= result;
		}
		return num;
	}
	
	/**
	 * @param numberArray
	 * @return
	 * This method will add the sum of digits of all the numbers in the array
	 */
	public static Map<Integer,Integer> sumOfDigits(int numberArray[]){ 
		Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int i=0; i<numberArray.length; i++){
			int num = numberArray[i];
			int n=0;
			int sum=0;
			while(num>0){
				n=num%10;
				sum = sum+n;
				num=num/10;	
			}
			hm.put(numberArray[i], sum);	
		}
		return hm;
	}
	
	/**
	 * @param sumAndNumbers
	 * @return
	 * This method is an array of numbers with the max sum
	 */
	public static int[] getNumbersForMaxSum(Map<Integer,Integer> sumAndNumbers){
		int i=0;
		int j=0;
		int maxSumInMap=(Collections.max(sumAndNumbers.values()));
		
		for (Map.Entry<Integer, Integer> entry : sumAndNumbers.entrySet()){
			 if (entry.getValue()==maxSumInMap) {
				i++;
			 }
		}
		
		int[] numberswithMaxSum = new int[i];
		
		for (Map.Entry<Integer, Integer> entry : sumAndNumbers.entrySet()){
			 if (entry.getValue()==maxSumInMap) {
				 numberswithMaxSum[j] =entry.getKey();
				 j++;
			 }
		}
		
		return numberswithMaxSum;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int numberArray[] = parseTheString(str);
		
		Map<Integer,Integer> sumAndNumbers = sumOfDigits(numberArray);
		
		int[] numberswithMaxSum= getNumbersForMaxSum(sumAndNumbers);
		System.out.println("numberswithMaxSum: ");
		for (int i=0; i<numberswithMaxSum.length; i++){
			System.out.println(numberswithMaxSum[i]);
		}
		scan.close();
	}

}
