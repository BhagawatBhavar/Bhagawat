package com.te.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		
	
     Set<Student> hashSet=new HashSet<>();
     Student student=new Student(1,"sagar","male");
     Student student2=new Student(2,"Bhagwat","male");
     hashSet.add(student);
     hashSet.add(new Student(2,"mohit","male"));
     hashSet.add(new Student(4,"sagar","male"));
     hashSet.add(student2);
     System.out.println(student.hashCode()+"::"+student2.hashCode());
     
     
    List<Student> arrayList=new ArrayList<>(hashSet);
//     Collections.sort(hashSet);
     Iterator<Student> iterator=arrayList.iterator();
     while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
     
     
	}
}
