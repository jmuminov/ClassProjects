package com.syntax.class12;

public class Dog {

	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() {
		System.out.println("Dog can bark");
	}
	
	void sleep() {
		System.out.println("Dog can sleep");
	}
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "Bingo";
		dog1.breed = "Husky";
		dog1.color = "White";
		dog1.age = 3;
		dog1.height = 12;
		dog1.gender = 'M';
		
		dog1.bark();
		
	}
	
}
