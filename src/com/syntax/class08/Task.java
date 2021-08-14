package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		System.out.println("---   Task 2   ---");
		
		Scanner scan = new Scanner(System.in);
		String credit;
		do {
			System.out.println("Would you like to apply for credit card?");
			credit = scan.next();
			if (credit.equalsIgnoreCase("yes")) {
				break;
			}
		} while (true);
		
		System.out.println("---   Task 3   ---");
		
		int start, end, even = 0, odd = 0;
		System.out.println("Please enter your data range");
		start = scan.nextInt();
		end = scan.nextInt();
		do {
			if (start % 2 == 0) {
				even+=start;
			} else {
				odd+=start;
			}
			start++;
		} while (start <= end);
		System.out.println("Total of even numbers = " + even + " and total of odd numbers = " + odd);
		
	}
	
}
