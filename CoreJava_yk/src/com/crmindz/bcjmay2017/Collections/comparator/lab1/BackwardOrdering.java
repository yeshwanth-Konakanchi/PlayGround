package com.crmindz.bcjmay2017.Collections.comparator.lab1;

import java.util.Comparator;

/**
 * @author Yeshwanth Konakanchi 
 * This method overrides the compare method in
 * comparator interface and sorts the list in backward direction.
 */
public class BackwardOrdering implements Comparator<Object> {

	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if (i1 == i2)
			return 0;

		else if (i1 < i2)
			return 1;

		else
			return -1;

	}

}
