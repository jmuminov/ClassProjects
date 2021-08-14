package com.syntax.class05;

import java.util.Scanner;

public class InitializeVariable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.println("Please enter 3 separate numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is the largest");
		} else {
			System.out.println("There is no largest number");
		}
		
		
		System.out.println("---------------------------");
		
		System.out.println("Please enter 3 separate numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		int box = 0;
		
		if (box < num1) {
			box = num1;
		}
		if (num2 > box) {
			box = num2;
		}
		if (num3 > box) {
			box = num3;
		}
		System.out.println(box + " is the largest number");
		
	}
	
}
