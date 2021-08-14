package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		boolean sale;
		double price;
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there sale going on? Type true or false");
		sale = scan.nextBoolean();
		double discount;
		if (sale) {
			System.out.println("We are going shopping");
			System.out.println("How much does the item cost?");
			price = scan.nextDouble();

			if (price < 20) {
				discount = 0.9;
			} else if (price >= 20 && price < 100) {
				discount = 0.8;
			} else if (price >= 100 && price < 500) {
				discount = 0.7;
			} else {
				discount = 0.5;
			}
			
			System.out.println("Your item costing " + price + " will be discounted for " + ((discount*100)-100) + "%");
			price*=discount;
			System.out.println("Your new price is " + price);
		}
		
	}
	
}
