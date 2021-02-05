package edu.cgcc.cs161;



public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private int yearBirth;
	
	public Person(String first, String last, int age, int year) {
		firstName = first;
		
	
		
		
		lastName = last;
		
		if (age < 0 || age > 125) {
			System.out.println("invalid age");
			System.exit(0);
		}
		
		if (year < 1896 || year > 2021) {
			System.out.println("invalid year");
			System.exit(0);
		}
		yearBirth = year;
	
	}
	
		
	public String getfirstName () {
		return this.firstName;
	
	}
		
	public String getlastName () {
		return this.lastName;
		
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}


	
		
	
	 }

		
	
	
	 
	
	
	
		
		
	
	
	
	
	

	


