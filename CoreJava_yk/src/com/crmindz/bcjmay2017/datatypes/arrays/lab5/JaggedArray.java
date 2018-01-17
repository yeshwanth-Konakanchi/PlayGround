package com.crmindz.bcjmay2017.datatypes.arrays.lab5;


/**
 * @author Yeshwanth Konakanchi
 * This class will initialize a 2D array and prints the tutorials details of the students.
 *
 */
public class JaggedArray {
	
	public static void main(String[] args) {
		
		String[][] twoDArray = new String[5][4];
		
		twoDArray[0][0]="Student Name";
		twoDArray[0][1]="Tutorial1";
		twoDArray[0][2]="Tutorial2";
		twoDArray[0][3]="Tutorial3";
		twoDArray[1][0]="Tony";
		twoDArray[1][1]="JAVA";
		twoDArray[1][2]="C";
		twoDArray[1][3]="C++";
		twoDArray[2][0]="Thomas";
		twoDArray[2][1]="JAVA";
		twoDArray[2][2]="UNIX";
		twoDArray[2][3]=" ";
		twoDArray[3][0]="Dinil";
		twoDArray[3][1]="Linux";
		twoDArray[3][2]="Oracle";
		twoDArray[3][3]=" ";
		twoDArray[4][0]="Delvin";
		twoDArray[4][1]="RDBMS";
		twoDArray[4][2]="C#";
		twoDArray[4][3]="ORACLE";
		
		for(int i=1; i<4; i++){
			System.out.println("Tutorial"+i+": "+twoDArray[4][i]);
		}
		
	}
}
