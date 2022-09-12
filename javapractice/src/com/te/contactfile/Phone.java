package com.te.contactfile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Phone {
	public static void main(String[] args) {
	
	 List<ContactFile> contact= new ArrayList<>();
	 contact.add(new ContactFile("sagar",8551919890l));
	 contact.add(new ContactFile("bhagwat",637739890l));
	 contact.add(new ContactFile("mohit",673889890l));
	 contact.add(new ContactFile("vinayak",957919890l));

	  

	 Phone phone = new Phone();
	 System.out.println("please select option/n1-show all the contact/n2-Search for contact/n3-Operant on contact");
	 Scanner scanner=new Scanner(System.in);
	 switch (scanner.nextInt()) {
	  case 1:
          Collections.sort(contact);
      for (ContactFile contactFile : contact) {
	      System.out.println(contactFile);
          }      
		break;
	  case 2:{
		 
	  }
		  
		  
      	 if ()  {
      		ContactFile contactFile = collect.get(0);
      		System.out.println(contactFile);
		}else
			System.out.println("no");
		  
//		  Collections.sort(contact);
//	      for (ContactFile contactFile : contact) {
//		      System.out.println(contactFile);
//	          }
//	      System.out.println("please select the obtion for doing operation/n1-To Call/n2-To Massage/n3- Go Back To Main Menu");
//	       Scanner scanner2=new Scanner(System.in);
//	       ContactFile contactFile = new ContactFile(null, 0);
//	       contactFile.call(scanner2.nextInt());
//	       forEach(System.out::println);

	 default:
		break;
	}
	
	
	 
	 
	 
}
	public void s1() {
		 System.out.println("please select contact");
		  Scanner scanner3=new Scanner(System.in);
		  String a=scanner3.next();
		  Stream<ContactFile> stream = contact.stream().filter(f -> f.name.equalsIgnoreCase(a)).collect(Collectors.toList());
		  
	}

}
