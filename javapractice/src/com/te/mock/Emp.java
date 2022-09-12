package com.te.mock;

import java.util.Objects;

public class Emp implements Comparable<Emp>{
	Integer id;
	String name;

	public Emp(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		if (this.id == null)
			return "The id is null";
		else
			return this.id.toString();

	}

	@Override
	public int hashCode() {
		
		int index=0;
		if (this.name.startsWith("s")) {
			for (int i = 0; i < name.length(); i++) {
				if (i%2==0) {
					index=i;
				}
			}return index;
		}else {System.out.println("++++");
			return 0;
		}
		
		
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name==obj) {
			return true;
		}
		return false;
		
	}

	@Override
	public int compareTo(Emp o) {
		return this.name.compareTo(o.name);
	}
	

}
