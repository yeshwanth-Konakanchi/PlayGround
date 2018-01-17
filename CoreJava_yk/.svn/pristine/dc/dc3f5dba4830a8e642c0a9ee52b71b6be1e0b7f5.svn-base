package com.crmindz.bcjmay2017.operators.lab4;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi This class will convert the temperature in
 *         celsius to farenheit and Temperature in farenheit to celsius.
 */
public class TemperatureConverter {

	/**
	 * @param temp
	 * @return 
	 * This method will take temperature in celsius and convert to
	 *         farenheit.
	 */
	public static float celsiusToFahrenheit(float temp) {

		float c = temp;
		float f = (c * 9 / 5) + 32; // c/100 = (f-32)/180
		return f;
	}

	/**
	 * @param temp
	 * @return
	 * This method will take temperature in farenheit and convert to
	 *            celsius.
	 */
	public static float fahrenheitToCelsius(float temp) {

		float f = temp;
		float c = (f - 32) * 5 / 9;
		return c;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter celsius temperature: ");
		float celsuisTemp = scan.nextFloat();
		
		System.out.println("Enter Fahrenheit temperature: ");
		float FahrenheitTemp = scan.nextFloat();
		
		float tempInFahreinheit = celsiusToFahrenheit(celsuisTemp);
		float tempInCelsius = fahrenheitToCelsius(FahrenheitTemp);
		
		System.out.println(tempInFahreinheit + " f");
		System.out.println(tempInCelsius + " c");
		
		scan.close();

	}

}
