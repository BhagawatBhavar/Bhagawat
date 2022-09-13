package com.te.arraylist.incapsulation;

public class Emp1 implements Comparable<Emp1>{
     private int id;
    private  String name;
     private Double sal;
      
      
      
      
      public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSal() {
		return sal;
	}
	public Emp1(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public int compareTo(Emp1 o) {
		
		return this.id-o.id;
	}
	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
