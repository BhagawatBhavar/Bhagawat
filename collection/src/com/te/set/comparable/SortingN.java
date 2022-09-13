package com.te.set.comparable;

import java.util.Comparator;

public class SortingN  implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.name.compareTo(o2.name);
	}

}
