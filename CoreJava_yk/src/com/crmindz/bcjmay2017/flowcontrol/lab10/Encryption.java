package com.crmindz.bcjmay2017.flowcontrol.lab10;

import java.util.Scanner;

/**
 * @author Yeshwanth Konakanchi
 *This class will encrypt the given input and will print the 
 * encrypted integer.
 */
public class Encryption {
	
	/**
	 * @param num
	 * @return
	 * THis method will encrypt the given integer.
	 */
	public static long encryption(int num){
		int n=0;
		long encryptedNum=0;
		int[] digit = new int[4];
		
		for(int i=0; i<4; i++){
			n = num%10;
			num=num/10;
			digit[i] = n;
			digit[i]+=7;
			digit[i]=digit[i]%10;
			encryptedNum = encryptedNum + (long)(digit[i]*(Math.pow(10, i)));
		}
		return encryptedNum;	
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Enter the number to be encrypted: ");
		
		long encryptedNum = encryption(num);
		
		System.out.println("Encrypted Number" + encryptedNum);
		scan.close();
	}

}
