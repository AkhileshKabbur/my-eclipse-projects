package Numbers;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 0;
		long b = 1;
		int n = 100;
		System.out.println(a);
		System.out.println(b);
		for(int i = 2; i<n;i++) {
			long c = a+b;
			if (c>=100) {
				break;
			}
			System.out.println(c);
			a=b;
			b=c;

		}

	}

}
