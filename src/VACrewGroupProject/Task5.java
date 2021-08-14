package VACrewGroupProject;

public class Task5 {

	public static void main(String[] args) {
		
		int num = 89;
		boolean notPrime = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				notPrime = true;
			}
		}
		if (!notPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		
	}
	
}
