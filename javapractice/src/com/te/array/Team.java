package com.te.array;

import java.util.Scanner;

public class Team {
        public void selection(int a2) {
        	if (a2==11) {
        		
        		try {
				   throw  new InvalidPlayerException("select player name");
        		}catch(InvalidPlayerException e) {
        			System.out.println(e.getMessage());			
        			Scanner scanner2=new Scanner(System.in);
                    Captain captain=new Captain(scanner2.next(),scanner2.next(),scanner2.next(),scanner2.next(),scanner2.next(),scanner2.next(),scanner2.next(),scanner2.next(),scanner2.next(),scanner2.next(),scanner2.next());
                    System.out.println("Succesfully selected player");
                    
        		}
        		
			}
        	else {
        		System.out.println(" please select valid input");
        	}
        }
        
        
        
        public static void main(String[] args) {
			Team team=new Team();
			Scanner scanner=new Scanner(System.in);
            System.out.println("please select player");           
            int a1=scanner.nextInt();
             team.selection(a1);
            
            scanner.close();
//          
            
			
		}
}

