package Numbers;

public class Palindrome {
	static int Palindrome_num(int n){
	int res = 0;
	while(n>0) {
		int rem = n%10;
		res = (res*10)+rem;
		n = n/10;	
	}
	return res;
	}
	public static void main(String[] args) {
		for (int i = 1;i<=100;i++) {
		
		if(i==Palindrome_num(i)) {
			System.out.println(Palindrome_num(i));			
		}
		
	  }
	}
	
}