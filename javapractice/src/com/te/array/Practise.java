package com.te.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
		int a[]= {1,2,3,1,32,32,1,12,12,2};
		
		System.out.println("========");
//		Arrays.sort(a);
		for (int i =a.length-1;i>=0; i--) {
			System.err.println(a[i]);
		}
		
	}
}
