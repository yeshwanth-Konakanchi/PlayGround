package com.crmindz.bcjMay2017.codingQue;

public class StringCharReplace {

	public static String replace(String s, char from, char to) {
		if(s.length()<1){
			return s;
		}
		char first = from == s.charAt(0) ? to : s.charAt(0);
		return first + replace(s.substring(1), from, to);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "go goa gone";
		char from = 'o';
		char to = '/';
		
		System.out.println(StringCharReplace.replace(s, from, to));
	}

}
