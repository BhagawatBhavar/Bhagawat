package com.te.set.comparable;

public class Customer implements Comparable<Customer> {
      int id;
      String name;
      Integer salary;
	public Customer(int id, String name, Integer salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Customer o) {
		return this.name.compareTo(name);
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
      
      
      
}
