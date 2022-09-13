package com.te.set;

import java.util.Objects;

public class Student {
    int rollno;
    String name;
    String gender;
	public Student(int rollno, String name, String gender) {
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		return this.rollno;
	}
	@Override
	public boolean equals(Object obj) {	
		Student student=(Student)obj;
		if (this.name==student.name || this.gender==student.gender||this.rollno==student.rollno) {
			return true;
		}
		return false;
	}
	
	
	
    
    
    
}


