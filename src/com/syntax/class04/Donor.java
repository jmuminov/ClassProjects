package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		int age = 19;
		double weight = 80.8;

		if (age >= 18) {
			System.out.println("You are eligible to donate blood at the age of " + age);
			if (weight > 110) {
				System.out.println("You may donate blood at the weight of " + weight + "lb");
			} else {
				System.out.println("However, you are too skinny to donate blood");
			}
		} else {
			System.out.println("You are too young to donate blood");
		}

	}

}
