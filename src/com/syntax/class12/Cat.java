package com.syntax.class12;

public class Cat {

	String name;
	String color;
	int age;
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = "Tom";
		cat1.color = "Blue";
		cat1.age = 5;
		cat1.eat();
		cat1.sleep();
		
	}
	
}
