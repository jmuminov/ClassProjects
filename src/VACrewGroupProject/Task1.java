package VACrewGroupProject;

public class Task1 {

	public static void main(String[] args) {
		
		int[][] num = {{1, 2, 3, 4},{10,20,32},{100,200,302, 400}};
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum+=num[i][j];
			}
		}
		System.out.println("Sum of all values in the array = " + sum);
		
	}
	
}
