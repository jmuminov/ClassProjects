package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		int odd = 0, even = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				even+=i;
			} else {
				odd+=i;
			}
		}
		System.out.println("Total of even numbers = " + even + " and total of odd numbers = " + odd);
		
		System.out.println("---   HW 2   ---");
		
		Scanner scan = new Scanner (System.in);
		
		int money;
		
		do {
			System.out.println("Can you pay for the candy");
			money = scan.nextInt();
			if (money > 3) {
				System.out.println("Please give less money");
			} else if (money < 3) {
				System.out.println("Please give more money");
			} else {
				System.out.println("Please enjoy the candy");
			}
		} while (money != 3);
		
		
		
	}
	
}
