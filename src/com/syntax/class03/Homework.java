package com.syntax.class03;

public class Homework {

	public static void main(String[] args) {
		
		int month = 1;
		
		if (month == 1) {
			System.out.println("Its January");
		} else if (month == 2) {
			System.out.println("Its February");
		} else if (month == 3) {
			System.out.println("Its March");
		} else if (month == 4) {
			System.out.println("Its April");
		} else if (month == 5) {
			System.out.println("Its May");
		} else if (month == 6) {
			System.out.println("Its June");
		} else if (month == 7) {
			System.out.println("Its July");
		} else if (month == 8) {
			System.out.println("Its August");
		} else if (month == 9) {
			System.out.println("Its September");
		} else if (month == 10) {
			System.out.println("Its October");
		} else if (month == 11) {
			System.out.println("Its November");
		} else if (month == 12) {
			System.out.println("Its December");
		} else {
			System.out.println("Input " + month + " is invalid, please type 1-12");
		}
		
		System.out.println("----------------------------------------");
		
		double number = -11;
		
		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else if (number < 0) {
			System.out.println(number + " is a negative number");
		} else {
			System.out.println("Your number is " + number);
		}
		
		System.out.println("----------------------------------------");
		
		int evenOdd = 16;
		
		if (evenOdd % 2 == 0) {
			System.out.println(evenOdd + " is an even number");
		} else {
			System.out.println(evenOdd + " is an odd number");
		}
		
	}
	
}
