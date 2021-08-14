package com.syntax.class04;

public class Tasks {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.5;

		if (diploma) {
			System.out.println("Congratulations on the degree");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship with gpa of " + gpa);
			} else {
				System.out.println("You should have studied harder, gpa of " + gpa + " is too low");
			}
		} else {
			System.out.println("You should get a degree");
		}

		System.out.println("--------------------------------------");

		double rate = 4.6;
		double price = 300000;

		if (rate > 4.5) {
			System.out.println("I wont buy a house with rate of " + rate);
		} else {
			if (price > 200000) {
				System.out.println("I will take a loan to buy a house that cost " + price);
			} else {
				System.out.println("I will pay cash for the house costing " + price);
			}
		}

	}

}
