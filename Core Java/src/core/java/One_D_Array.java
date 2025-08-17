package core.java;

import java.util.Scanner;

public class One_D_Array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of Students:");
		int n= sc.nextInt();
		int a[] = new int[n];
		int i;
		
		System.out.println("Enter the Marks:");
		
		for(i=0;i<=n-1;i++) {
			a[i] = sc.nextInt();
		}
		for(i=0;i<=n-1;i++) {
			System.out.println("Marks of Students"+(i+1)+"="+a[i]);
		}
		sc.close();
	}
	
}
