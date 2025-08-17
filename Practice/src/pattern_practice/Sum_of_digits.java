package pattern_practice;

public class Sum_of_digits {
	static void SumOfdigits(int n) {
		int sum = 0;
		while (n>0) {
			sum += n%10;
			n=n/10;
		}
		System.out.println(sum);	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfdigits(12345);

	}

}
