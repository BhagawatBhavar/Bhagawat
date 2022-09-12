package com.te.object;

public class Test {
	int a;
	int b;
	
	
	
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
   @Override
	public int hashCode() {
		
		return a+b;
	}
	
         public static void main(String[] args) {
			
        	 Test test=new Test(12,23);
        	 System.out.println(test.hashCode());
        	 
		}
}
