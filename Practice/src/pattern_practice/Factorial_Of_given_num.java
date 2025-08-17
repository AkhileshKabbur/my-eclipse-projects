package pattern_practice;

import java.math.BigInteger;

public class Factorial_Of_given_num {
	static void fact(int n) {
		int i;
		 BigInteger fact = BigInteger.ONE;
		for(i=1;i<=n;i++) {
			fact =fact.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		for(int j = 1; j<=100;j++) {
			fact(j);
		}
		
	}
}
