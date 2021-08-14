package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		System.out.println("---------- TASK 1 ----------");
		int t1 = 1;
		
		while (t1 <= 100) {
			System.out.print(t1 + " ");
			t1++;
		}
		System.out.println("");
		System.out.println("---------- TASK 2 ----------");
		
		int t2 = 100;
		
		while (t2 >= 1) {
			System.out.println(t2);
			t2--;
		}
		System.out.println("---------- TASK 3 ----------");
		int t3 = 20;
		
		while (t3 <= 100) {
			if (t3 % 2 == 0) {
				System.out.println(t3);
			}
			t3++;
		}
		System.out.println("---------- TASK 4 ----------");
		int t4 = 100;
		
		while (t4 >= 1) {
			if (t4 % 2 != 0) {
				System.out.println(t4);
			}
			t4--;
		}
		
	}
	
}
