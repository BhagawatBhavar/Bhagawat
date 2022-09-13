package com.te.linkedList.demo;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String name;
    private int id;
    private Integer balance;
	public Customer(String name, int id, int balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Integer getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}
	@Override
	public int compareTo(Customer o) {
	
		return this.balance-o.balance;
	}
	
	
	
    
    
    
    
}

