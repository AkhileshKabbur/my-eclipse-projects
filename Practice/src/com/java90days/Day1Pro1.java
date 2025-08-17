package com.java90days;

import java.util.Scanner;

public class Day1Pro1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.next();
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		System.out.println("Hello "+ name+ " You are " + age+ " years old.");
		
	}

}
