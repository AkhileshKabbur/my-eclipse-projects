package Numbers;

import java.util.Scanner;
public class Multiples_Of_Number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int k = sc.nextInt();
		for (int i=1; i<=10;i++) {
				System.out.println(k*i);
		}
		sc.close();
	}

}
