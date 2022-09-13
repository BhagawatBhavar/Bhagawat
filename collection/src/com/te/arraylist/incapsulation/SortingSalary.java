package com.te.arraylist.incapsulation;

import java.util.Comparator;

public class SortingSalary implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		return o1.getSal().compareTo(o2.getSal());//it is used when 
	}

}
