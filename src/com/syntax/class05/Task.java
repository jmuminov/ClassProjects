package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter person's height in inches");
		int height = scan.nextInt();
		
		if (height < 60 && height > 1) {
			System.out.println("This person is really short, should eat more carrots");
		} else if (height >= 60 && height <= 72) {
			System.out.println("This person is medium height");
		} else if (height > 72) {
			System.out.println("This person is really tall");
		} else {
			System.out.println("Invalid input");
		}
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Please enter the day number between 1 to 7");
		int day = scan.nextInt();
		
		if (day >= 1 || day < 6) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Wrong input");
		}
	}
	
}
