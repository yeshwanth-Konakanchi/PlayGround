package com.crmindz.bcjmay2017.datatypes.arrays.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRefactor {

	/**
	 *  Testing a unit test case with expected and actual
	 */
	@Test 
	public void test() {
	
		 int a[] = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		 int b[]={9,0,0,0,0,0,21,5,0,3};
		 Refactoring ref = new Refactoring();
		 assertArrayEquals(ref.processingoddNumbers(a),(b));
	}

}
