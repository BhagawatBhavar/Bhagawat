package com.te.abstraction;

public class Farrari extends Car {
  String color;
  
	public Farrari(String color) {
	this.color = color;
}
	@Override
	public void start() {
		
		
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
