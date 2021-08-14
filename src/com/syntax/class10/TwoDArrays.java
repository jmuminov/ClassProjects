package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {

		int a;
		int[] b;

		// 2D Array
		int[][] c = new int[3][4];

		c[0][0] = 11;
		c[0][1] = 12;
		c[0][2] = 13;
		c[0][3] = 14;

		c[1][0] = 10;
		c[1][1] = 20;
		c[1][2] = 30;
		c[1][3] = 40;

		c[2][0] = 100;
		c[2][1] = 200;
		c[2][2] = 300;
		c[2][3] = 400;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("   ---   Another way   ---   ");

		int[][] array = { { 11, 12, 13, 14, 15 }, { 20, 30, 40 }, { 100, 200, 300, 400 } };

	}

}
