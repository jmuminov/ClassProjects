package com.syntax.class12;

public class CarTester {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.make = "Toyota";
		car1.model = "Rav4";
		car1.color = "White";
		car1.year = 2020;
		System.out.println("I have " + car1.make);
		car1.moveBackward();
		
	}
	
}
