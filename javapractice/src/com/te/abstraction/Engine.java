package com.te.abstraction;

public class Engine{
	int cc;
	int piston;
	int hourspower;
	public Engine(int cc, int piston, int hourspower) {
		this.cc = cc;
		this.piston = piston;
		this.hourspower = hourspower;
	}
	
	
	
	public void hourspower() {
		System.out.println("You are selected 300BHP"+cc);
	}
		public void piston() {
			System.out.println("You are selected 8 piston"+piston);
		}
			public void cc() {
				System.out.println("You are selected 2000cc"+cc);
				
			
	}

}
