package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		double temp = 75;

		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
		}
		
		System.out.println("-----------------------");
		
		boolean isBreakTime = true;
		
		if (isBreakTime) {
			System.out.println("I will get a coffee");
		} else {
			System.out.println("I will focus on the class");
		}

		System.out.println("------------------");
		
		boolean isHungry = true;
		
		if (isHungry) {
			System.out.println("I will go eat");
		} else {
			System.out.println("I will go have a tea");
		}
		
	}

}
