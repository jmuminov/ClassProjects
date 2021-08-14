package com.syntax.class10;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your array range");
		int size = scan.nextInt();
		
		double sum = 0;
		double[] num = new double[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter item #" + (i+1));
			num[i] = scan.nextDouble();
			sum+=num[i];
		}
		System.out.println("Sum of your numbers equals to " + sum);
		
	}
	
}
