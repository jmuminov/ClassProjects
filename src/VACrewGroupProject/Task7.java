package VACrewGroupProject;

public class Task7 {

	public static void main(String[] args) {
		
		int small = 1000000, big = 0;
		int[] num = {10, 22, -10, 222, 555, -555, -222};
		
		for (int i = 0; i < num.length; i++) {
			if (small > num[i]) {
				small = num[i];
			}
			if (big < num[i]) {
				big = num[i];
			}
		}
		System.out.println(small + " is the smallest number");
		System.out.println(big + " is the biggest number");
	}
	
}
