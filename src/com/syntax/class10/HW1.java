package com.syntax.class10;

public class HW1 {

	public static void main(String[] args) {
		
		int[] num = {10, 20, 100, 50, 222, 60, 110, 51, 111};
		int largest = 0;
		for (int i = 0; i < num.length; i++) {
			if (largest < num[i]) {
				largest = num[i];
			} else {
				continue;
			}
		}
		System.out.println("The largest number is " + largest);
		
	}
	
}
