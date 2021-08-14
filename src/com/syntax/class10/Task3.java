package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {

		String[][] name = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" } };

		System.out.println(name[0][1] + " " + name[1][0]);
		System.out.println(name[0][0] + " " + name[1][3]);
		System.out.println(name[0][2] + " " + name[1][2]);
		System.out.println(name[0][3] + " " + name[1][1]);

		System.out.println("   ---   Task 2   ---   ");

		String[][] student = { { "Jamoliddin", "Dilnoza", "Zakirullah", "Ash", "Gabby", "Elizabeth" },
				{ "A", "B", "C", "D", "E", "F" } };

		System.out.println(student[0][0] + " got the grade of " + student[1][0]);
		System.out.println(student[0][1] + " got the grade of " + student[1][1]);
		System.out.println(student[0][2] + " got the grade of " + student[1][2]);
		System.out.println(student[0][3] + " got the grade of " + student[1][3]);
		System.out.println(student[0][4] + " got the grade of " + student[1][4]);
		System.out.println(student[0][5] + " got the grade of " + student[1][5]);

	}

}
