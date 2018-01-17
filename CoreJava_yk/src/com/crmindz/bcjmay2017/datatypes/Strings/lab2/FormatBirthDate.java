package com.crmindz.bcjmay2017.datatypes.Strings.lab2;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 * FormatBirthDate Class provides formats a birthdate into three strings.
 */
public class FormatBirthDate {
	
	/**
	 * @param date
	 * This method formats a birthdate into three strings and prints them.
	 */
	public static void formatBirthDate(String date){
		
		String[] dateFormat = date.split("/");  
		String month = dateFormat[0];
		String day = dateFormat[1];
		String year =  dateFormat[2];
		System.out.println("Month:"+month);
		System.out.println("Day:"+day);
		System.out.println("Year"+year);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String date = scan.next();
		
		formatBirthDate(date);
		
		scan.close();
	}
}
