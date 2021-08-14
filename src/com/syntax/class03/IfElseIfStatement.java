package com.syntax.class03;

public class IfElseIfStatement {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 10;

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " is smaller than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("-------------------");

		int day = 1;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is Sunday");
		}

	}

}
