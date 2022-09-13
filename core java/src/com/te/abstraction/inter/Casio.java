package com.te.abstraction.inter;

public class Casio implements Calculator,ScientificCalculator {

	
	public int add(int x, int y) {
		return x+y;
	}

	public int sum(int x, int y) {
		
		return x-y;
	}

	public String triagnomentry(String angle1, String angle2) {
		if (angle1.equals("sin")&&angle2.equals("cos")) {
			return "tan";
		}
		return "No";
	}

}
