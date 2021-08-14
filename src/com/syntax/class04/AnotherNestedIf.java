package com.syntax.class04;

public class AnotherNestedIf {

	public static void main(String[] args) {
		
		boolean test = true;
		
		int score = 99;
		
		if (test) {
			System.out.println("You finished the test");
			
			if (score > 90) {
				System.out.println("Your grade is A with the score of " + score);
			} else if (score > 80) {
				System.out.println("Your grade is B with the score of " + score);
			} else if (score > 70) {
				System.out.println("Your grade is C with the score of " + score);
			} else {
				System.out.println("You need to study more with the score of " + score);
			}
		} else {
			System.out.println("Go take the test");
		}
		
	}
	
}
