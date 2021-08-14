package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		int j = 1;
		
		do {
			System.out.println("Hello");
			j++;
		} while (j <= 3);
		
		System.out.println("-------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		int secret, num; 
		secret = 15;
		
		do {
			System.out.println("Guess the secret number");
			num = scan.nextInt();
		} while (num != secret);
		System.out.println("You guessed the correct number!");
		
	}
	
}
