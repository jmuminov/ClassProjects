package com.syntax.class04;

import java.util.Scanner;

public class TestScannerNew {

	public static void main(String[] args) {
		
		String name = "Jamol";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write your name below:");
		String value = scan.nextLine();
		
		System.out.println("Hello " + value);
		
		System.out.println("Please enter your age below:");
		int age = scan.nextInt();
		System.out.println(value + " is " + age + " years old");
	}
	
}
