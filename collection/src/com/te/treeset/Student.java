       package com.te.treeset;

public class Student  implements Comparable<Student>{
   int id;
   String name;
   String gender;
public Student(int id, String name, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
}
@Override
public int compareTo(Student o) {
	return this.name.compareTo(o.name);
}
   
   
   
   
}
