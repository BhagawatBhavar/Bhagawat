package com.te.abstraction;

public class Germansheffer extends Dog {
	
	public Germansheffer(String name,String ownername) {
		super(name,ownername);
	}

	@Override
	public void bark() {
		System.out.println("bhoo");
		
	}

	@Override
	public void eat() {
		System.out.println("roti");
		
	}

}
