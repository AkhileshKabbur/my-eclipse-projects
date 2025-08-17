package Numbers;
import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc. nextInt();
		int count = 0;
		for(int i=1; i<=n;i++) {
			if(n%i==0 ){
				count ++;
			}
			
		}
		if (count == 2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
//		for(int i=2; i<=n/2;i++) {
//			if(n%i==0 ){
//				count ++;
//			}
//			
//		}
//		if (count == 0) {
//			System.out.println("Prime Number");
//		}
//		else {
//			System.out.println("Not a Prime Number");
//		}
		
//		for(int i=2; i<=Math.sqrt(n);i++) {
//			if(n%i==0 ) {
//				count ++;
//			}	
//		}
//		if (count == 0) {
//			System.out.println("Prime Number");
//		}
//		else {
//			System.out.println("Not a Prime Number");
//		}
		sc.close();
	}


}
