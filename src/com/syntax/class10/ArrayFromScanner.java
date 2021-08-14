package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many items are you capturing?");
		int index = scan.nextInt();
		
		int[] num = new int[index];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Please enter your number");
			num[i] = scan.nextInt();
		}
		
	}
	
}
