package Numbers;

public class Sum_of_Digits {
	public static void main(String[] args) {
		int n = 1234;
		int sum =0;
		while (n>0) {
			int last_digit = n%10;
			sum += last_digit;
			n=n/10;
		}
		System.out.println(sum);
	}

}
