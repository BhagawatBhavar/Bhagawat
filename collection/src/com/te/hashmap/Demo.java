package com.te.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
		Map<Integer,String> hasMap=new HashMap<>();
		hasMap.put(1,"sagar");
		hasMap.put(3,"bhagawat");
		hasMap.put(2,"vinayak");
		hasMap.put(null,"Mohit");
		hasMap.put(null, null);
		
		Set<Integer> keySet = hasMap.keySet();
		keySet.stream();
//		keySet.toArray();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer+"::"+hasMap.get(integer));
		}
		
		for (Map.Entry<Integer, String> entry : hasMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
		}
		
	}
}
