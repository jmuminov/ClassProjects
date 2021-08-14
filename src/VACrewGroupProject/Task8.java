package VACrewGroupProject;

public class Task8 {

	public static void main(String[] args) {

		int[] num = { 10, 999, 100, 222, 444, 123, 555, 678, 556 };
		int first = 0, second = 0;
		for (int i = 0; i < num.length; i++) {
			if (first < num[i]) {
				first = num[i];
			}
		}
		for (int j = 0; j < num.length; j++) {
			if (second < num[j] && num[j] != first) {
				second = num[j];
			}
		}
		System.out.println(first + " is the biggest number in the array");
		System.out.println(second + " is second largest number in the array");
	}
}
