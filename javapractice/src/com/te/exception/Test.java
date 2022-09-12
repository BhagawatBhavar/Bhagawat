package com.te.exception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		String c=scanner.next();
		int res=0;
		int x[]= {12,34,554,21};
		try {
			res=a/b;
			
			try {
				System.out.println(x[res]);
				try {
				System.out.println(c.charAt(res));
			}
				catch (ArithmeticException e) {
					System.out.println("pleace check your value");
				}
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("please check your input");
				}
	
		} catch (Exception e) {
			System.out.println("please chech your string");
		}
				
	}

}
