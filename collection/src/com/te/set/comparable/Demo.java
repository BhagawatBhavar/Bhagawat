package com.te.set.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.te.arraylist.incapsulation.SortingName;

public class Demo {
	public static void main(String[] args) {
		
	
       Set<Customer> has=new HashSet<>();
       has.add(new Customer(1,"sagar",10000));
       has.add(new Customer(3,"bhagwat",2000));
       has.add(new Customer(23,"mohit",320));
       has.add(new Customer(2,"vinayak",345));
       
       Scanner scanner=new Scanner(System.in);
       String a=scanner.next();
       SortingN sortingn=new SortingN();
       SortingS sortings=new SortingS();
       
       
       
       ArrayList<Customer> arrayList=new ArrayList<>(has);
       Collections.sort(arrayList);
       if (a.equalsIgnoreCase("name")) {
   		Collections.sort(arrayList,sortingn);
   	}else if(a.equalsIgnoreCase("salary")) {
   		Collections.sort(arrayList,sortings);
   	}
       for (Customer customer : arrayList) {
		System.out.println(customer);
	}
       
       
       System.out.println("======");
       Collections.sort(arrayList);
       Iterator<Customer> iterator=arrayList.iterator();
       while (iterator.hasNext()) {
		Customer integer = iterator.next();
		System.out.println(integer);
		
	}
       
       
	}
}
