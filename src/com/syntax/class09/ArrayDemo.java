package com.syntax.class09;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int num = 106;
		
		int[] arr = new int [5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[2] + arr[0]);
		
		// Storing weekdays
		
		String[] day = new String[7];
		
		day[0] = "Monday";
		day[1] = "Tuesday";
		day[2] = "Wednesday";
		day[3] = "Thursday";
		day[4] = "Friday";
		day[5] = "Saturday";
		day[6] = "Sunday";
		
		System.out.println(day[5]);
		
		boolean[] array = new boolean[3];
		
		array[0] = true;
		array[1] = true;
		array[2] = false;
	}
}
