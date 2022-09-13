package com.te.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList<Object> arrayList=new ArrayList<>();
	  arrayList.add(10);
	  arrayList.add("sagar");
	  arrayList.add(true);
	  arrayList.add(20.0);
	  List<Object> l=Collections.synchronizedList(arrayList);
	  
	  System.out.println("=====for loop====");
	  for (int i = 0; i <arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
	}
	  System.out.println("======advaced for loop====");
	  for(Object obj:arrayList) {
		  System.out.println(obj);
	  }
	  System.out.println("========iterator====");
	  Iterator<Object> iterator= arrayList.iterator();
	  while(iterator.hasNext()) {
		  System.out.println(iterator.next());
	  }
	}
}
