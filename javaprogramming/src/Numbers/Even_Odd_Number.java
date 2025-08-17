package Numbers;

import java.util.Scanner;

public class Even_Odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i=1;i<=100;i++) {
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =  sc.nextInt();
		int i = 1;
		int count = 0;
		while(count<n) {
			if(i%2 == 0) {
				System.out.println(i);
				count ++;
			}
			i++;
		}
		sc.close();


	}

}
