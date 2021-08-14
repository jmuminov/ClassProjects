package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String country, food;
		
		System.out.println("What country are you from");
		country = scan.next();
		
		switch (country) {
		case "Tajikistan":
			food = "Plov";
			break;
		case "USA":
			food = "Hamburger";
			break;
		default:
			food = "dunno";
		}
		System.out.println("Your national food is " + food);
	}
	
}
