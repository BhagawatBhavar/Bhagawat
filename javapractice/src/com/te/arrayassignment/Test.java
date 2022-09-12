package com.te.arrayassignment;

import java.util.Scanner;

public class Test {
        public int addition(int...x) {
        	int sum=0;
        	for (int i = 0; i < x.length; i++) {
				sum=sum+x[i];
			}
        	System.out.println(sum);
			return sum;
        	
        }
        public static void main(String[] args) {
			Test test = new Test();
			System.out.println("total no you have to add");
			Scanner scanner=new Scanner(System.in);
			int [] a=new int[scanner.nextInt()];
			System.out.println("put your no you have to add");
			Scanner scanner2=new Scanner(System.in);
			for (int i = 0; i < a.length; i++) {
				a[i]=scanner2.nextInt();
			}
			
             	test.addition(a);
			
             	scanner.close();
             	scanner2.close();
		}
}
