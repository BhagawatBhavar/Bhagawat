package com.te.abstraction;

public class BMW extends Car{
      String color;
	
	
	public BMW(String color) {
		this.color = color;
	}
	@Override
	public void start() {
		System.out.println("Your BMW car");
		
		
	}
	public void color() {
		System.out.println("You are choose "+ color);
	}

	@Override
	public void accelrate() {
		System.out.println("s");
		
	}

	@Override
	public void breke() {
		
		
	}

}
