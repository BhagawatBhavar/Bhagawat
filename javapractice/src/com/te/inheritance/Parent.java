package com.te.inheritance;

public class Parent {
	String name;
	int age;
	
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sum() {
		System.out.println(name+"sum");
	}

}
