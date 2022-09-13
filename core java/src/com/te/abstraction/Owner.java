package com.te.abstraction;

public class Owner {
	public static void main(String[] args) {
		Rottewheeler rottewheeler=new Rottewheeler("jullie","Sagar");
		rottewheeler.bark();
		rottewheeler.eat();
		rottewheeler.poop();
		System.out.println(rottewheeler.name + "Dog name");
		
		Germansheffer germansheffer=new Germansheffer("charlie","darshan");
		germansheffer.bark();
		germansheffer.eat();
		germansheffer.poop();
		System.out.println(germansheffer.name +"dog name");

	}

}
