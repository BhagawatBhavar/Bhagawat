package com.te.treeset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
  public static void main(String[] args) {
	Set<Object> treeSet=new TreeSet<>();
	treeSet.add(new Student(3,"sagar","male"));
	treeSet.add(new Student(1,"Bhagawat","male"));
	treeSet.add(new Student(5,"Bhavani","female"));
	
	Scanner scanner=new Scanner(System.in);
//	String a=sac   
	
	Iterator<Object> iterator = treeSet.iterator();
	while (iterator.hasNext()) {
		Student student = (Student) iterator.next();
		System.out.println(student);
	}
}
}
