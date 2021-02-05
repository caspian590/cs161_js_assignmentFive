package edu.cgcc.cs161;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
   	Person josh = new Person("Joshua", "Sutherland", 17, 2003);
 
		

		
    Scanner sc = new Scanner(System.in);
	
       
	    System.out.print("Enter your first name: " );
	    String firstName = sc.nextLine();
	    System.out.println();
    
	   
	     while (!firstName.matches("^[a-zA-Z]+$")) {
	    	System.out.println ("Invalid Input");
	    	sc.next();
	    }
	    	
	    
	    System.out.print("Enter your last name: " );
	    String lastName = sc.nextLine();
		System.out.println();
	
		
	      while (!lastName.matches("^[a-zA-Z]+$")) {
		   	System.out.println ("Invalid Input");
		    sc.next();
		 }
		
		
	
	      
	      System.out.println("User's full name: " + firstName + " " + lastName);
		System.out.println();
		
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
	    System.out.println();
	
		
	 
	    
	    if (age < 0 || age > 125) {
			System.out.println("invalid age");
			System.exit(0);
		
		
	    }
	  
		
	
		
	
		System.out.println(firstName + " " + lastName +" is " + age + " years old.");
		

		
		
	    }
}
		
		
		
		
		
		
	    
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	

