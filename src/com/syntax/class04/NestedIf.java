package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		int day = 13;
		boolean isFriday = true;
		
		if (isFriday) {
			System.out.println("Movie time!");
			
			if (day == 13) {
				System.out.println("Time to watch a scary movie");
			} else {
				System.out.println("Watch any movie");
			}
		} else {
			System.out.println("Time to study");
		}
		
	}
	
}
