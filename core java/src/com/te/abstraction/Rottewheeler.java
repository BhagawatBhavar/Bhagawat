package com.te.abstraction;

public class Rottewheeler extends Dog {
	
	public Rottewheeler(String name,String ownername) {
		super(name,ownername);
	}

	@Override
	public void bark() {
		System.out.println("booo");
		
	}

	@Override
	public void eat() {
		System.out.println("padigree");
		
	}
	
	
	

}
