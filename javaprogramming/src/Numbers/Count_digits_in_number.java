package Numbers;

public class Count_digits_in_number {
	static int digits (int n) {
	int count =0;
	while(n>0) {
		n = n/10;
		count ++;
		}
	return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = digits(1234);
		System.out.println(count);

			
		}
		


}
