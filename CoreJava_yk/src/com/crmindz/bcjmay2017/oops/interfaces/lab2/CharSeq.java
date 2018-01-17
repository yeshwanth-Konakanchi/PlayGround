package com.crmindz.bcjmay2017.oops.interfaces.lab2;

/**
 * @author Yeshwanth Konakanchi
 *This class implements the Charsequence interface
 */
public class CharSeq implements CharSequence {
	
	private String s;

	public CharSeq(String s) {

		this.s = s;
	}

	private int fromEnd(int i) {
		return s.length() - 1 - i;
	}

	public char charAt(int i) {
		if ((i < 0) || (i >= s.length())) {
			throw new StringIndexOutOfBoundsException(i);
		}
		return s.charAt(fromEnd(i));
	}

	public int length() {
		return s.length();
	}

	public CharSequence subSequence(int start, int end) {
		if (start < 0) {
			throw new StringIndexOutOfBoundsException(start);
		}
		if (end > s.length()) {
			throw new StringIndexOutOfBoundsException(end);
		}
		if (start > end) {
			throw new StringIndexOutOfBoundsException(start - end);
		}
		StringBuilder sub = new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
		return sub.reverse();
	}

	public String toString() {
		StringBuilder s = new StringBuilder(this.s);
		return s.reverse().toString();
	}

	public static void main(String[] args) {
		CharSeq s = new CharSeq(
				"Write a class that implements the CharSequence interface found in the java.lang package.");

		System.out.println(s.subSequence(5, 9));

		System.out.println(s);

	}
}
