package com.te.array;

public class Demo {
//  int a[]=new int[10];
  
	public static void main(String[] args) {
		
	
  Object o[]= new Object[10];
  String s1=new String("sjs");
  Integer integer=new Integer(10);
  o[0]=s1;
  o[1]=integer;
  System.out.println(o.length);
  System.out.println(o[1]);
  Object[]o2=new Object[10];
  o2=o.clone();
  System.out.println();
  System.out.println(o2[0]);
		
//		String s1=new String("sa");
//		String s2=new String("bh");
//		String s3=s1.concat(s2);
//		System.out.println(s3.indexOf(4));
//		System.out.println();
// 
	}
}
