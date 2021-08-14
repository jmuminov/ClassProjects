package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		String[] country = {"Tajikistan", "USA", "Spain"};

		
		for (String name:country) {
			switch(name) {
			case "Tajikistan":
				System.out.println("Capital of " + name + " is Dushanbe");
				break;
			case "USA":
				System.out.println("Capital of " + name + " is Washington DC");
				break;
			default:
				System.out.println("Capital of " + name + " is unknown");
				break;
			}
		}
		
		System.out.println("   ---   Different Loop and condtional statement   ---   ");
		
		for (int i = 0; i < country.length; i++) {
			if (country[i].equals("Tajikistan")) {
				System.out.println("Capital of " + country[i] + " is Dushanbe");
			} else if (country[i].equals("USA")) {
				System.out.println("Capital of " + country[i] + " is Washington DC");
			} else {
				System.out.println("Capital of " + country[i] + " is unknown");
			}
		}
		
	}
	
}
