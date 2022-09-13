package com.te.acessspecifier;

public class Test {
 private int x;
 public int y;
 protected int z;
 int a;
    private void m1() {
    	System.out.println("i am private");
    }
    public void m2() {
    	System.out.println("i am public");
    }
    protected void m3() {
    	System.out.println("i am protected");
    }
    void m4() {
    	System.err.println("i am default");
    }
 
 
}
