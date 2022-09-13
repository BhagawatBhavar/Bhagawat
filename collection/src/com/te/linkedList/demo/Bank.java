package com.te.linkedList.demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
	
	LinkedList<Customer> linkedList=new LinkedList<>();
	linkedList.add(new Customer("sagar", 78, 1000));
	linkedList.add(new Customer("Bhagwat", 34, 4239));
	linkedList.add(new Customer("mayur", 48, 344));
	
	Scanner scanner=new Scanner(System.in);
	String a=scanner.next();
	SortingName sortingname=new SortingName();
	SortingBalance sortingbalance=new SortingBalance();
	
	if (a.equalsIgnoreCase("name")) {
		Collections.sort(linkedList,sortingname);;
	}
	else if (a.equalsIgnoreCase("balance")) {
		Collections.sort(linkedList,sortingbalance);
	}
	System.out.println("======advanced for loop====");
	
	for (Customer customer : linkedList) {
		System.out.println(customer);
	}
	System.out.println("======using iterator====");
	Collections.sort(linkedList);
	Iterator<Customer> iterator=linkedList.iterator();
	while (iterator.hasNext()) {
		System.out.println( iterator.next());
		
	}
	
	}

}
