package com.crmindz.bcjmay2017.Collections.comparator.lab1;

import java.util.Comparator;

/**
 * @author Yeshwanth Konakanchi 
 * This class implements Comparator interface and
 * overrides compare method to sort the positive numbers as usual and
 *negative numbers in backward direction.
 */
public class AlternateOrdering implements Comparator<Object> {

	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if (i1 == i2)
			return 0;

		else if (i2 >= 0 && i1 >= 0 && i1 > i2)
			return 1;

		else if (i2 < 0 && i1 < 0 && i1 < i2)
			return 1;

		else
			return -1;

	}

}
