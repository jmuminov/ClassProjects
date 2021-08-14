package VACrewGroupProject;

public class Task3 {
	public static void main(String[] args) {

		int[][] num = { 
				{ 1, 2, 3, 4 }, 
				{ 11, 20, 32 }, 
				{ 101, 200, 302, 433 } };
		int odd = 0, even = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					even += num[i][j];
				} else {
					odd += num[i][j];
				}
			}
		}
		System.out.println("The sum of even numbers = " + even);
		System.out.println("The sum of odd numbers = " + odd);

	}
}
