package Numbers;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		int n = 123;
		while(n>0) {
			int rem = n%10;
			res = (res*10)+rem;
			n = n/10;
		}
		System.out.println("RESULT:"+res);
	}

}
