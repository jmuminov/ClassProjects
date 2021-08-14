package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = scan.next();
		String result;
		
		switch(grade) {
		case "A":
			result = "Excellent";
			break;
		case "B":
			result = "Good";
			break;
		case "C":
			result = "Average";
			break;
		case "D":
			result = "Bad";
			break;
		default:
			result = "Not Acceptable";
			break;
		}
		
		System.out.println("Your grade of " + grade + " is " + result);
	}
	
}
