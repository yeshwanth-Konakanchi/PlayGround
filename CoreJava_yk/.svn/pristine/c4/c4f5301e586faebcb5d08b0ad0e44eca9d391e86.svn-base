package com.crmindz.bcjmay2017.datatypes.Strings.lab1;



/**
 * @author Yeshwanth Konakanchi
 * This class will declare and initialize various strings and perform different string manipulations
 */
public class StringOperations {
	
	
	/**
	 * This method will count the number of words in the string, length of the string and 
	 * does some manipulations on the given string
	 */
	public static void operationsOnFirstString(){
		
		String s= "hello how are you?";
		String[] words=s.split("\\s");
		System.out.println("1. \n");
		System.out.println("Number of words: "+words.length);
		System.out.println("Length of the String: "+ s.length());
		String replaceString=s.replaceAll("hello","HELLO");
		System.out.println(replaceString);
		String replaceString1=s.replaceAll(" ",",");
		System.out.println(replaceString1);
		System.out.println(s.substring(0,3)+"\n");
		
	}
	
	
	/**
	 * This method compares the given two strings are equal or not
	 */
	public static void operationsOnSecondString(){
		
		String s1= "Hello";
		String s2= "HELLO";
		System.out.println("2.\n");
		
		if(s1.equals(s2)){
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
		
	}

	/**
	 * @return
	 * This method will return true if the string is same from both the directions or else it will return false
	 */
	public static String operationsOnThirdString(){
		String s = "NITIN";
		int n=s.length();
		String s1="";
		System.out.println("\n3. \n");
		
		for (int i=0; i< n; i++){
			if ((s.charAt(n-i-1))==s.charAt(i)){
				continue;
			}
			s1= "String is not equal in both directions";
		}
		
		if ("String is not equal in both directions".equals(s1)){
			return s1;
		}
		
		else return "String is  equal in both directions";
	}
	
	
	/**
	 * This method will return the occurences of "A" in the string 
	 */
	public static void operationsOnFourthString(){
		
		String s = "HELLO HOW ARE YOU AND WHERE ARE YOU";
		int n=s.length();
		System.out.print("\n4.\n \nOccurences of A in string: ");
		
		for (int i=0; i<n ;i++){
			if (s.charAt(i)=='A'){
				System.out.print(i+" ");
			}
			
		}
	}
	
	/**
	 * This method will check whether the "institute" is present in the given string or not,
	 * if it exists it will replace it with "JSStitute"
	 */
	public static void operationsOnFifthString(){
		String s = "This  is a java institute of insurance and insu.";
		String s1="";
		System.out.println("\n\n5.\n");
		
		if (s.contains("institute")){
			s1=s.replace("institute","JSStitute");
		}
		
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		
		operationsOnFirstString();
		
		operationsOnSecondString();
		
		System.out.println(operationsOnThirdString());
		
		operationsOnFourthString();
		
		operationsOnFifthString();
		

	}

}
