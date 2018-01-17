package com.crmindz.bcjmay2017.Collections.testcases;


import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

import com.crmindz.bcjmay2017.Collections.sets.CountCommon;


/**
 * @author Yeshwanth Konakanchi
 * This is the test class for the CountCommon class
 */
public class CountCommonTest {

	@Test
	public void testCountCommon() {
		HashSet<Integer> mySet1 = new HashSet<Integer>();
		
		mySet1.add(3);
		mySet1.add(7);
		mySet1.add(3);
		mySet1.add(-1);
		mySet1.add(2);
		mySet1.add(3);
		mySet1.add(7);
		mySet1.add(2);
		mySet1.add(15);
		mySet1.add(36);
		
		HashSet<Integer> mySet2 = new HashSet<Integer>();
		
		mySet2.add(-5);
		mySet2.add(15);
		mySet2.add(2);
		mySet2.add(-1);
		mySet2.add(7);
		mySet2.add(15);
		mySet2.add(36);
		
		int expected = 5;
		
		assertEquals(expected,CountCommon.countCommon(mySet1, mySet2));
	}

}
