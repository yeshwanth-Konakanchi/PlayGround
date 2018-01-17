package com.crmindz.bcjmay2017.Collections.testcases;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.crmindz.bcjmay2017.Collections.lists.lab1.DoubleList;

/**
 * @author Yeshwanth Konakanchi
 * This is the test class for the DoubleList class
 */
public class DoubleListTest {

	@Test
	public void testDoubleList() {

		ArrayList<String> input = new ArrayList<String>();
		input.add("what");
		input.add("is");
		input.add("your");
		input.add("name?");
		
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("what");
		expected.add("what");
		expected.add("is");
		expected.add("is");
		expected.add("your");
		expected.add("your");
		expected.add("name?");
		expected.add("name?");

		assertEquals(expected,DoubleList.doubleList(input));
	}

}
