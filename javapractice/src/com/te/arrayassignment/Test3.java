package com.te.arrayassignment;

import java.util.Arrays;

public class Test3 {
   
	public static void main(String[] args) {
		int a[]= {23,2,3,23,1243,67,688,9};
//		Arrays.sort(a);
		int b[]=new int[a.length];
		for (int i =a.length-1;i>0; i--) {
//			b=a.clone();
			for (int j = i; j < a.length; j++) {
				b[j]=a[i];
				System.out.println(b[j]);
			}
		}
		
	}
}
