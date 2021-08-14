package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

			String name = "Jamol";
			String lastName = "Muminov";
			char grade = 'A';
			String city = "Fairfax";
			String state = "VA";
			String phoneNumber = "123-456-7890";
			
			System.out.println("My name is " + name + " and my last name is " + lastName);
			System.out.println("I am "+ grade + " student");
			System.out.println("I live in city " + city + " and state " + state);
			System.out.println("And my phone number is " + phoneNumber);
			
			System.out.println("---------------------------------------");
			
			grade = 'B';
			city = "San Jose";
			state = "CA";
			phoneNumber = "987-654-3210";
			
			System.out.println("My name is " + name + " and I moved to a new city " + city + " and new state " + state + ". My new phone number is " + phoneNumber);

	}

}
