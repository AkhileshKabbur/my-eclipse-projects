package Numbers;

public class Prime_number_using_method {
	static boolean check_prime(int n ) {
		for (int i =2; i<=Math.sqrt(n);i++) {
			if( n%i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		boolean check  = check_prime(4);
		if(check == false) {
			System.out.println("not a Prime");
			
		}
		else {
			System.out.println("Prime");
		}
	}

}
