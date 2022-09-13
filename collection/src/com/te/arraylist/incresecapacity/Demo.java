package com.te.arraylist.incresecapacity;

import java.util.Iterator;

public class Demo {
  public static void main(String[] args) {
	IncreseCapacity increseCapacity=new IncreseCapacity();
	increseCapacity.incresecapacity();
	increseCapacity.add(12);
	increseCapacity.add(13);
	increseCapacity.add(14);
	increseCapacity.add(15);
	increseCapacity.add(16);
	increseCapacity.add(17);
	increseCapacity.add(18);
	increseCapacity.add(19);
	increseCapacity.add(20);
	increseCapacity.add(21);
	//increseCapacity.add(22);
	
//	increseCapacity.remove(17);
	//System.out.println(increseCapacity);
	
	Iterator<Object> iterator=increseCapacity.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
}


}
