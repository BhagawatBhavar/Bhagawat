package com.te.linkedList.demo;

import java.util.Comparator;

public class SortingBalance implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getBalance().compareTo(o2.getBalance());
	}

}
