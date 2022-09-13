package com.te.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
    LinkedList<Object> linkedList=new LinkedList<>();
    linkedList.add("sagar");
    linkedList.add(12);
    linkedList.add(true);
    linkedList.add("bhagwat");
    linkedList.add(20.44);
    
    for (Object object : linkedList) {
		System.out.println(object);
	}
     System.out.println("====sa=====");
    Iterator<Object> iterator= linkedList.iterator(); {
    	while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
   
	}
    
	}
}
