package com.syntax.class04;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter amount of loan you need:");
		double loan = input.nextDouble();
		
		if (loan <= 200000) {
			System.out.println("You may take a loan of $" + loan);
		} else {
			System.out.println("Apologize, we can not loan you $" + loan);
		}
		
		System.out.println("------------------------------------------");
		
		System.out.println("How old are you?");
		int age = input.nextInt();
		
		if (age >= 18) {
			System.out.println("You have been issued a driver license");
		} else {
			System.out.println("Please apply for the learners permit");
		}
		
		System.out.println("------------------------------------------");
		
		System.out.println("Please type name of the city:");
		String city = input.next();
		System.out.println("Please type the temperature in Fahrenheit:");
		double temp = input.nextDouble();
		
		temp = (temp - 32) * (5 / 9);
		
		System.out.println("The temperature in the city of " + city + " is " + temp + "C");
	}
	
}
