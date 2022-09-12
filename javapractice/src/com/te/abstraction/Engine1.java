package com.te.abstraction;

public class Engine1{
	int cc;
	int piston;
	int hourspower;
	
	
	public Engine1(int cc, int piston, int hourspower) {
		super();
		this.cc = cc;
		this.piston = piston;
		this.hourspower = hourspower;
	}
	public void hourspower() {
		System.out.println("You are selected 300BHP");
	}
		public void piston() {
			System.out.println("You are selected 7 piston");
		}
			public void cc() {
				System.out.println("You are selected 2000cc");
					
	}
	


}
