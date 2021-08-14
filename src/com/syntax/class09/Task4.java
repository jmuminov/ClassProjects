package com.syntax.class09;

public class Task4 {

	public static void main(String[] args) {
		
		String[] cars = {"Toyota", "Tesla", "Lexus", "BMW", "Porche", "Lambo"};
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("   ---   New   ---   ");
		
		for(String car:cars) {
			System.out.println(car);
		}
		
	}
	
}
