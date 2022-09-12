package com.te.mock;

import java.util.Collections;

public class Company {
  public static void main(String[] args) {
	Emp emp = new Emp(1,"shagwat");
	Emp emp2=new Emp(1425,"Mohit");
	
	System.out.println(emp.hashCode());
//	System.out.println(emp.equals(emp2.name));
//	System.out.println(emp.toString());
}
}
