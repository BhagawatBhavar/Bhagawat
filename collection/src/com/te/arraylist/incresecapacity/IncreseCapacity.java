package com.te.arraylist.incresecapacity;

import java.util.Arrays;
import java.util.Iterator;

public class IncreseCapacity {
	private Object[] array;
	private int index = 0;

	public void m1() {
		System.out.println(array.length);
	}

	public int size() {
		return index;
	}

	public void incresecapacity() {
		array = new Object[10];
	}

	public void add(Object obj) {

		if (index >= array.length - 1) {
			System.out.println("array index out of bounds");
			capcity();
		}

		array[index] = obj;
		index++;
	}

	public void remove(Object obj) {
		for (int i = 0; i < index; i++) {
			if (array[i].equals(obj)) {
				for (int j = i; j < index; j++) {
					array[j] = array[j + 1];
				}
				index--;
				return;
			}
		}
	}

	public void capcity() {
		Object[] temp = new Object[(((array.length * 3) / 2) + 1)];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;

	}

	public Object get(int index) {
		return array[index];
	}*/

	@Override
	public String toString() {
		return "IncreseCapacity [array=" + Arrays.toString(array) + ", index=" + index + "]";
	}

	public Iterator<Object> iterator() {
		return new MyItr();
	}

	class MyItr implements Iterator<Object> {

		int index;

		@Override
		public boolean hasNext() {
			if (array[index] != null) {
				return true;
			} else
				return false;
		}

		@Override
		public Object next() {
			Object object = new MyItr();
			return object;
		}

	}
}
