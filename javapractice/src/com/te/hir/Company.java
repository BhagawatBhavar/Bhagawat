package com.te.hir;

public class Company {
	public static void main(String[] args) {
		Trainee trainee=new Trainee("Mohit",817281);
		trainee.work();
		 System.out.println(trainee.name);
    	Emp emp=trainee;
		System.out.println(emp.name);
		Manager manager=new Manager("sagar", 2767);
		manager.work();
		System.out.println(manager.empid);
	}

}
