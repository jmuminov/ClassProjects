package com.syntax.class09;

public class Task1 {
	public static void main(String[] args) {

		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				if (i < 10) {
					if (j < 10) {
						System.out.println("0" + i + ":" + "0" + j);
					} else {
						System.out.println("0" + i + ":" + j);
					}
				} else {
					if (j < 10) {
						System.out.println(i + ":" + "0" + j);
					} else {
						System.out.println(i + ":" + j);
					}

				}
			}

		}
	}
}
