package com.te.set.comparable;

import java.util.Comparator;

public class SortingS implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.salary.compareTo(o2.salary);
	}

}
