package a_pattern;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int m = sc. nextInt();
		System.out.print("Enter the number of columns:");
		int n = sc.nextInt();
		
		int k = 1;
		for(int i =1; i<=m; i++) {
			for(int j =1; j<=n; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}

}
