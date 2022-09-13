package com.te.arraylist.incapsulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Company {
     public static void main(String[] args) {
		ArrayList<Emp1> arrayList=new ArrayList<>();
		arrayList.add(new Emp1(23, "sagar", 10000));
		arrayList.add(new Emp1(2, "bhagwat", 20000));
		arrayList.add(new Emp1(40, "mayur", 1000));
	System.out.println("please select ");
		Scanner scanner=new Scanner(System.in);
		String next=scanner.next();
		SortingName sortingName=new SortingName();
		SortingSalary sortingSalary=new SortingSalary();
		
		if (next.equalsIgnoreCase("name")) {
			Collections.sort(arrayList,sortingName);	
		}
		else if(next.equalsIgnoreCase("salary")) {
			Collections.sort(arrayList,sortingSalary);
			
		}else if (next.equalsIgnoreCase("id")) {       //Ignore case is used to ignore case
			Collections.sort(arrayList);
		}
		
			
		
		
		for (Emp1 emp1 : arrayList) {
			System.out.println(emp1);
		}
		System.out.println("=====");
		Iterator<Emp1> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=====");
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}
