package Numbers;
import java.util.Scanner;

public class Factor_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int k = sc.nextInt();
		for (int i = 1; i<=k;i++) {
			if(k%i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
