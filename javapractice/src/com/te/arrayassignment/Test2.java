package com.te.arrayassignment;

import java.util.Scanner;

public class Test2 {
       public int arr(int ...x) {
    	   
    	   for (int i = 0; i <2; i++) {
    		int a []=new int[x.length];
    		a[i]=x[i];
			System.out.println(a[i]);
		}
    	   return 0;
       }
       public static void main(String[] args) {
		Test2 test2 = new Test2();
		Scanner scanner=new Scanner(System.in);
		test2.arr(2,23,3,44,4,3);
		
	}
}
