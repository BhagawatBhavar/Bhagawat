package com.te.multilevel;

public class Zoo {
	public static void main(String[] args) {
		Cat cat=new Cat("sherni","carnivrus");
		cat.run();
	Tiger tiger=cat;
	tiger.roar();
	tiger.walk();
	Animal animal=cat;
	System.out.println(animal.name);
	
	}

}
