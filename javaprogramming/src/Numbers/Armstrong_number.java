package Numbers;

public class Armstrong_number {
	static int digits (int n) {
	int count =0;
	while(n>0) {
		n = n/10;
		count ++;
		}
	return count;
	}
	static int power(int b,int p) {
		int res = 1;
		while (p>0) {
			res = res*b;
			p--;		
		}
		return res;	
	}
	
	static int Arm(int n) {
		int no_of_digits = digits(n);
		int res = 0;
		while(n>0) {
			int last_digit = n%10;
			res = power(last_digit ,no_of_digits)+res;
			n=n/10;	
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int number = 153;
//		for (int i =1;i<=100000;i++) {
//		int number = i;
//		int res = Arm(number);
//			if (res==number) {
//				System.out.println(i);
//			}
//		}
		int res = Arm(number);
		if (res==number) {
			System.out.println("Armstrong");

		}
		else {
			System.out.println("Not a Armstrong");
		}
		
	}

}
