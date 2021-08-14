package com.syntax.class04;

import java.util.Scanner;

public class AnotherScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type your first number:");
		int num1 = input.nextInt();
		System.out.println("Please type your second number:");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " equals to " + num2);
		}
		
	}
	
}
