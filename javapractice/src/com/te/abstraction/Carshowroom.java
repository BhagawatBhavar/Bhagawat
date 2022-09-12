package com.te.abstraction;

import java.util.Scanner;

public class Carshowroom {
	public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter your Specification\n1.BMW\n2.Farrari ");
    	int next =scanner.nextInt();
    	Scanner scanner1=new Scanner(System.in);
    	System.out.println("Enter your Specification \n1.1\n2.2");
    	int next1 =scanner1.nextInt();
    	Customer customer=new Customer();
    	customer.getcar(next,next1);
    	
	}
}
