package Numbers;

public class Palindrome_num {
	
	public static void main(String[] args) {
		int res = 0;
		int n = 12321;
		int k = n;
		while (n>0) {
			int rem = n%10;
			res = (res*10)+rem;
			n=n/10;
		}
		if (k==res) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
