package Numbers;

public class Power_of_num {
	static int power(int b,int p) {
		int res = 1;
		while (p>0) {
			res = res*b;
			p--;		
	}
		return res;		
	}
	public static void main(String[] args) {
		int b = 2;
		int p = 4;
		int res = power(b,p);
		System.out.println(res);
	}

}
