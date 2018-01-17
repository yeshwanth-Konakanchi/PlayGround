package com.crmindz.bcjmay2017.operators.lab2;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class will convert the weight on earth to weight on moon.
 */
public class WeightCalculation {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int weightOfEarth = scan.nextInt();
		
		int weightOfMoon = (int)(weightOfEarth*0.17);
		
		System.out.println("Weight on Moon is: " + weightOfMoon);
		
		scan.close();
	}

}
