package com.te.contactfile;

import java.util.Collections;
import java.util.Objects;

public class ContactFile implements Comparable<ContactFile> {
     String name;
     long phoneNo;
	public ContactFile(String name, long phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "ContactFile [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	@Override
	public int compareTo(ContactFile o) {
		return this.name.compareTo(o.name);
	}
	
	public void call(int a) {
		System.out.println("callling the person");
	}
	public void massage() {
		System.out.println("send massage");
	}
	public void mainmenu() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this.getName()==obj) {
			return true;
		}
		
		return false;
	}
	
	
	
	
	
     
     
	
}
