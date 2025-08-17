package com.java90days;
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number:");
		int a= sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		
		int c= a+b;
		
		System.out.println("Sum of "+a+" and "+b+" is "+c);
		
	}

}
