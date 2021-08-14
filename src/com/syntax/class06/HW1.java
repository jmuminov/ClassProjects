package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your country name");
		String country = scan.next();
		String language;
		
		switch(country) {
		case "Tajikistan":
			language = "Tajik";
			break;
		case "Spain":
			language = "Spanish";
			break;
		default:
			language = "Unknown language";
			break;
		}
		System.out.println("People in " + country + " speak " + language + " language");
		
	}
	
}
