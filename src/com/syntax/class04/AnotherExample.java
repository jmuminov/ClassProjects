package com.syntax.class04;

import java.util.Scanner;


public class AnotherExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the temperature:");
		Double temp = input.nextDouble();
		System.out.println("It is " + temp);
		
		System.out.println("Please enter the city name:");
		String city = input.nextLine();
		System.out.println("The city is " + city);
	}
	
}
