package VACrewGroupProject;

public class Task2 {
	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3, 4 }, { 11, 20, 32 }, { 101, 200, 302, 433 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					System.out.println(num[i][j]);
				}
			}
		}

	}
}
