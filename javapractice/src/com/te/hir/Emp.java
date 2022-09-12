package com.te.hir;

public class Emp {
	String name;
	int empid;
	public Emp(String name, int empid) {
		this.name=name;
		this.empid=empid;
		
	}
	public void work() {
		System.out.println("work"+name);
	}

}
