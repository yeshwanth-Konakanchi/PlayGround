package com.crmindz.bcjmay2017.flowcontrol.lab10;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class will decrypt the encrypted input and will print the 
 * original integer.
 */
public class Decryption {
	
	/**
	 * @param num
	 * @return
	 * This method will decrpt the encrypted input given as parameter and
	 * prints the original integer
	 */
	public static long decryption(int num) {
		
		int n = 0;
		long decryptedNum = 0;
		int[] digit = new int[4];
		
		for (int i = 0; i < 4; i++) {
			n = num % 10;
			num = num / 10;
			digit[i] = n;
			digit[i] += 3;
			digit[i] = digit[i] % 10;
			decryptedNum = decryptedNum + (long) (digit[i] * (Math.pow(10, i)));
		}
		
		return decryptedNum;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Enter the number to be decrypted: ");
		
		long decryptedNum = decryption(num);
		
		System.out.println("Decrypted Number: "+decryptedNum);
		scan.close();
	}

}
