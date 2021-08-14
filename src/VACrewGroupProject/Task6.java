package VACrewGroupProject;

public class Task6 {

	public static void main(String[] args) {

		int[] num = new int[3];
		num[0] = 0;
		num[1] = 1;
		System.out.println(num[0]);
		System.out.println(num[1]);
		for (int i = 0; i < 8; i++) {
			num[2] = num[0] + num[1];
			System.out.println(num[2]);
			num[0] = num[1];
			num[1] = num[2];

		}

	}

}
