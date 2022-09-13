package com.te.abstraction;

public abstract class Dog {
	String name;
	String ownername;
	
	public Dog(String name, String ownername) {
		this.name = name;
		this.ownername = ownername;
	}
	public abstract void bark();
	public abstract void eat();
	public void poop() {
		System.out.println("poop");
	}
	

}
