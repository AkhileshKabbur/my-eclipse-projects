package Numbers;

public class Factorial_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		int n = 5;
		for(int i = 1; i<=n;i++) {
			fact *= i;
		}
		System.out.println(fact);

	}

}
